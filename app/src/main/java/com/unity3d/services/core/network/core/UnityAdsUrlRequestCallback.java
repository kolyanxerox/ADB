package com.unity3d.services.core.network.core;

import androidx.annotation.VisibleForTesting;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.log.DeviceLog;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.WritableByteChannel;
import kotlin.jvm.internal.OooOO0O;
import o00O0.o000OOo;
import o00O0O0O.OooO0OO;
import o00O0O0o.OooOo00;
import o00O0OO0.OooO;
import o00O0OO0.OooOOOO;
import o00O0Oo.o00O0O;
import o00O0oOo.o0000OO0;
import o00O0oOo.o000OO;
import o00O0oOo.o00O0O00;
import oo00o.OooOo;
import org.chromium.net.CronetException;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;

/* loaded from: classes3.dex */
public abstract class UnityAdsUrlRequestCallback extends UrlRequest.Callback {
    private static final int BYTE_BUFFER_CAPACITY_BYTES = 16384;
    public static final Companion Companion = new Companion(null);
    private final ByteArrayOutputStream bytesReceived;
    private final ISDKDispatchers dispatchers;
    private final long readTimeout;
    private final WritableByteChannel receiveChannel;
    private o00O0O00 task;

    public static final class Companion {
        public /* synthetic */ Companion(OooOO0O oooOO0O) {
            this();
        }

        private Companion() {
        }
    }

    @OooO(m13471c = "com.unity3d.services.core.network.core.UnityAdsUrlRequestCallback$startTimer$1", m13472f = "UnityAdsUrlRequestCallback.kt", m13473l = {75}, m13474m = "invokeSuspend")
    /* renamed from: com.unity3d.services.core.network.core.UnityAdsUrlRequestCallback$startTimer$1 */
    public static final class C43441 extends OooOOOO implements o00O0O {
        final /* synthetic */ UrlRequest $request;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C43441(UrlRequest urlRequest, OooO0OO oooO0OO) {
            super(2, oooO0OO);
            this.$request = urlRequest;
        }

        @Override // o00O0OO0.OooO00o
        public final OooO0OO create(Object obj, OooO0OO oooO0OO) {
            return UnityAdsUrlRequestCallback.this.new C43441(this.$request, oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
            int i = this.label;
            if (i == 0) {
                o000OOo.OooOO0O(obj);
                long readTimeout = UnityAdsUrlRequestCallback.this.getReadTimeout();
                this.label = 1;
                if (o0000OO0.OooOO0O(readTimeout, this) == oooOo00) {
                    return oooOo00;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o000OOo.OooOO0O(obj);
            }
            this.$request.cancel();
            return OooOo.f33195OooO00o;
        }

        @Override // o00O0Oo.o00O0O
        public final Object invoke(o000OO o000oo2, OooO0OO oooO0OO) {
            return ((C43441) create(o000oo2, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
        }
    }

    public UnityAdsUrlRequestCallback(ISDKDispatchers dispatchers, long j) {
        kotlin.jvm.internal.OooOo.OooO0o0(dispatchers, "dispatchers");
        this.dispatchers = dispatchers;
        this.readTimeout = j;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        this.bytesReceived = byteArrayOutputStream;
        this.receiveChannel = Channels.newChannel(byteArrayOutputStream);
    }

    private final void cancelTimer() {
        o00O0O00 o00o0o00 = this.task;
        if (o00o0o00 != null) {
            o00o0o00.OooO00o(null);
        }
        this.task = null;
    }

    @VisibleForTesting
    public static /* synthetic */ void getTask$annotations() {
    }

    public final long getReadTimeout() {
        return this.readTimeout;
    }

    public final o00O0O00 getTask() {
        return this.task;
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public void onCanceled(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        super.onCanceled(urlRequest, urlResponseInfo);
        cancelTimer();
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public void onFailed(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
        cancelTimer();
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onReadCompleted(UrlRequest request, UrlResponseInfo info, ByteBuffer byteBuffer) throws IllegalAccessException, NoSuchMethodException, IOException, SecurityException, IllegalArgumentException, InvocationTargetException {
        kotlin.jvm.internal.OooOo.OooO0o0(request, "request");
        kotlin.jvm.internal.OooOo.OooO0o0(info, "info");
        kotlin.jvm.internal.OooOo.OooO0o0(byteBuffer, "byteBuffer");
        cancelTimer();
        byteBuffer.flip();
        try {
            this.receiveChannel.write(byteBuffer);
        } catch (IOException e) {
            DeviceLog.info("IOException during ByteBuffer read. Details: ", e);
        }
        byteBuffer.clear();
        startTimer(request);
        request.read(byteBuffer);
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public void onRedirectReceived(UrlRequest request, UrlResponseInfo urlResponseInfo, String str) {
        kotlin.jvm.internal.OooOo.OooO0o0(request, "request");
        request.followRedirect();
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onResponseStarted(UrlRequest request, UrlResponseInfo info) {
        kotlin.jvm.internal.OooOo.OooO0o0(request, "request");
        kotlin.jvm.internal.OooOo.OooO0o0(info, "info");
        startTimer(request);
        request.read(ByteBuffer.allocateDirect(16384));
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onSucceeded(UrlRequest request, UrlResponseInfo info) {
        kotlin.jvm.internal.OooOo.OooO0o0(request, "request");
        kotlin.jvm.internal.OooOo.OooO0o0(info, "info");
        cancelTimer();
        byte[] bodyBytes = this.bytesReceived.toByteArray();
        kotlin.jvm.internal.OooOo.OooO0Oo(bodyBytes, "bodyBytes");
        onSucceeded(request, info, bodyBytes);
    }

    public abstract void onSucceeded(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, byte[] bArr);

    public final void setTask(o00O0O00 o00o0o00) {
        this.task = o00o0o00;
    }

    public final void startTimer(UrlRequest request) {
        kotlin.jvm.internal.OooOo.OooO0o0(request, "request");
        cancelTimer();
        this.task = o0000OO0.OooOo0(o0000OO0.OooO0O0(this.dispatchers.getIo()), null, new C43441(request, null), 3);
    }
}
