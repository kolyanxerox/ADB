package com.unity3d.ads.core.domain;

import android.content.Context;
import com.unity3d.ads.adplayer.AndroidWebViewClient;
import kotlin.jvm.internal.OooOo;
import o00O0OO0.OooO;
import o00O0OO0.OooO0OO;
import o00O0oOo.o0000O00;

/* loaded from: classes3.dex */
public final class AndroidGetWebViewContainerUseCase implements GetWebViewContainerUseCase {
    private final AndroidWebViewClient androidWebViewClient;
    private final Context context;
    private final o0000O00 defaultDispatcher;
    private final o0000O00 mainDispatcher;
    private final SendWebViewClientErrorDiagnostics sendWebViewClientErrorDiagnostics;

    @OooO(m13471c = "com.unity3d.ads.core.domain.AndroidGetWebViewContainerUseCase", m13472f = "AndroidGetWebViewContainerUseCase.kt", m13473l = {24}, m13474m = "invoke")
    /* renamed from: com.unity3d.ads.core.domain.AndroidGetWebViewContainerUseCase$invoke$1 */
    public static final class C40721 extends OooO0OO {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C40721(o00O0O0O.OooO0OO oooO0OO) {
            super(oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidGetWebViewContainerUseCase.this.invoke(null, this);
        }
    }

    public AndroidGetWebViewContainerUseCase(Context context, AndroidWebViewClient androidWebViewClient, SendWebViewClientErrorDiagnostics sendWebViewClientErrorDiagnostics, o0000O00 mainDispatcher, o0000O00 defaultDispatcher) {
        OooOo.OooO0o0(context, "context");
        OooOo.OooO0o0(androidWebViewClient, "androidWebViewClient");
        OooOo.OooO0o0(sendWebViewClientErrorDiagnostics, "sendWebViewClientErrorDiagnostics");
        OooOo.OooO0o0(mainDispatcher, "mainDispatcher");
        OooOo.OooO0o0(defaultDispatcher, "defaultDispatcher");
        this.context = context;
        this.androidWebViewClient = androidWebViewClient;
        this.sendWebViewClientErrorDiagnostics = sendWebViewClientErrorDiagnostics;
        this.mainDispatcher = mainDispatcher;
        this.defaultDispatcher = defaultDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.unity3d.ads.core.domain.GetWebViewContainerUseCase
    @android.annotation.SuppressLint({"SetJavaScriptEnabled"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object invoke(o00O0oOo.o000OO r11, o00O0O0O.OooO0OO r12) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r12 instanceof com.unity3d.ads.core.domain.AndroidGetWebViewContainerUseCase.C40721
            if (r0 == 0) goto L13
            r0 = r12
            com.unity3d.ads.core.domain.AndroidGetWebViewContainerUseCase$invoke$1 r0 = (com.unity3d.ads.core.domain.AndroidGetWebViewContainerUseCase.C40721) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.domain.AndroidGetWebViewContainerUseCase$invoke$1 r0 = new com.unity3d.ads.core.domain.AndroidGetWebViewContainerUseCase$invoke$1
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.result
            o00O0O0o.OooOo00 r1 = o00O0O0o.OooOo00.f31365OooOo0O
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r11 = r0.L$1
            o00O0oOo.o000OO r11 = (o00O0oOo.o000OO) r11
            java.lang.Object r0 = r0.L$0
            com.unity3d.ads.core.domain.AndroidGetWebViewContainerUseCase r0 = (com.unity3d.ads.core.domain.AndroidGetWebViewContainerUseCase) r0
            o00O0.o000OOo.OooOO0O(r12)
        L2e:
            r8 = r11
            goto L52
        L30:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L38:
            o00O0.o000OOo.OooOO0O(r12)
            o00O0oOo.o0000O00 r12 = r10.mainDispatcher
            com.unity3d.ads.core.domain.AndroidGetWebViewContainerUseCase$invoke$webview$1 r2 = new com.unity3d.ads.core.domain.AndroidGetWebViewContainerUseCase$invoke$webview$1
            r4 = 0
            r2.<init>(r10, r4)
            r0.L$0 = r10
            r0.L$1 = r11
            r0.label = r3
            java.lang.Object r12 = o00O0oOo.o0000OO0.Oooo00O(r2, r12, r0)
            if (r12 != r1) goto L50
            return r1
        L50:
            r0 = r10
            goto L2e
        L52:
            r3 = r12
            android.webkit.WebView r3 = (android.webkit.WebView) r3
            com.unity3d.ads.adplayer.AndroidWebViewContainer r2 = new com.unity3d.ads.adplayer.AndroidWebViewContainer
            com.unity3d.ads.adplayer.AndroidWebViewClient r4 = r0.androidWebViewClient
            com.unity3d.ads.core.domain.SendWebViewClientErrorDiagnostics r5 = r0.sendWebViewClientErrorDiagnostics
            o00O0oOo.o0000O00 r6 = r0.mainDispatcher
            o00O0oOo.o0000O00 r7 = r0.defaultDispatcher
            android.content.Context r9 = r0.context
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidGetWebViewContainerUseCase.invoke(o00O0oOo.o000OO, o00O0O0O.OooO0OO):java.lang.Object");
    }
}
