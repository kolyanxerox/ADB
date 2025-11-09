package com.unity3d.ads.core.domain;

import android.net.Uri;
import android.webkit.WebResourceResponse;
import com.applovin.shadow.okhttp3.internal.p007ws.WebSocketProtocol;
import com.google.android.gms.internal.measurement.o0OO00OO;
import com.unity3d.ads.core.extensions.JSONArrayExtensionsKt;
import com.unity3d.services.core.network.core.HttpClient;
import com.unity3d.services.core.network.model.HttpRequest;
import com.unity3d.services.core.network.model.HttpResponse;
import com.unity3d.services.core.network.model.RequestType;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import kotlin.jvm.internal.OooOo;
import o00O0.OooOOO;
import o00O0.o000OOo;
import o00O0.o00oO0o;
import o00O0O0O.OooO0OO;
import o00O0O0o.OooOo00;
import o00O0OO0.OooO;
import o00O0OO0.OooOOOO;
import o00O0Oo.o00O0O;
import o00O0oOo.o0000O00;
import o00O0oOo.o0000OO0;
import o00O0oOo.o000OO;
import oo00o.OooOO0O;
import org.json.JSONArray;

/* loaded from: classes3.dex */
public final class AndroidExecuteAdViewerRequest implements ExecuteAdViewerRequest {
    private final GetCachedAsset getCachedAsset;
    private final HttpClient httpClient;
    private final o0000O00 ioDispatcher;

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RequestType.values().length];
            try {
                iArr[RequestType.GET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RequestType.HEAD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RequestType.POST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @OooO(m13471c = "com.unity3d.ads.core.domain.AndroidExecuteAdViewerRequest$invoke$2", m13472f = "AndroidExecuteAdViewerRequest.kt", m13473l = {29}, m13474m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.core.domain.AndroidExecuteAdViewerRequest$invoke$2 */
    public static final class C40572 extends OooOOOO implements o00O0O {
        final /* synthetic */ Object[] $parameters;
        final /* synthetic */ RequestType $type;
        int label;
        final /* synthetic */ AndroidExecuteAdViewerRequest this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40572(Object[] objArr, AndroidExecuteAdViewerRequest androidExecuteAdViewerRequest, RequestType requestType, OooO0OO oooO0OO) {
            super(2, oooO0OO);
            this.$parameters = objArr;
            this.this$0 = androidExecuteAdViewerRequest;
            this.$type = requestType;
        }

        @Override // o00O0OO0.OooO00o
        public final OooO0OO create(Object obj, OooO0OO oooO0OO) {
            return new C40572(this.$parameters, this.this$0, this.$type, oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) throws IOException {
            Object objOooO0O0;
            WebResourceResponse webResourceResponseInvoke$default;
            InputStream data;
            OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o000OOo.OooOO0O(obj);
                return obj;
            }
            o000OOo.OooOO0O(obj);
            Object objO000oOoO = OooOOO.o000oOoO(1, this.$parameters);
            byte[] bArrOooOoO = null;
            String str = objO000oOoO instanceof String ? (String) objO000oOoO : null;
            if (str == null) {
                str = "";
            }
            if (str.length() <= 0) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            try {
                objOooO0O0 = Uri.parse(str);
                OooOo.OooO0Oo(objOooO0O0, "parse(this)");
            } catch (Throwable th) {
                objOooO0O0 = o000OOo.OooO0O0(th);
            }
            if (objOooO0O0 instanceof OooOO0O) {
                objOooO0O0 = null;
            }
            Uri uri = (Uri) objOooO0O0;
            if (uri != null) {
                if (this.$type != RequestType.GET) {
                    uri = null;
                }
                if (uri != null && (webResourceResponseInvoke$default = GetCachedAsset.invoke$default(this.this$0.getCachedAsset, uri, null, 2, null)) != null && (data = webResourceResponseInvoke$default.getData()) != null) {
                    bArrOooOoO = o0OO00OO.OooOoO(data);
                }
            }
            byte[] bArr = bArrOooOoO;
            if (bArr != null) {
                return new HttpResponse(bArr, 0, null, null, null, null, 0L, WebSocketProtocol.PAYLOAD_SHORT, null);
            }
            HttpClient httpClient = this.this$0.httpClient;
            HttpRequest httpRequestCreateRequest = this.this$0.createRequest(this.$type, this.$parameters);
            this.label = 1;
            Object objExecute = httpClient.execute(httpRequestCreateRequest, this);
            return objExecute == oooOo00 ? oooOo00 : objExecute;
        }

        @Override // o00O0Oo.o00O0O
        public final Object invoke(o000OO o000oo2, OooO0OO oooO0OO) {
            return ((C40572) create(o000oo2, oooO0OO)).invokeSuspend(oo00o.OooOo.f33195OooO00o);
        }
    }

    public AndroidExecuteAdViewerRequest(o0000O00 ioDispatcher, HttpClient httpClient, GetCachedAsset getCachedAsset) {
        OooOo.OooO0o0(ioDispatcher, "ioDispatcher");
        OooOo.OooO0o0(httpClient, "httpClient");
        OooOo.OooO0o0(getCachedAsset, "getCachedAsset");
        this.ioDispatcher = ioDispatcher;
        this.httpClient = httpClient;
        this.getCachedAsset = getCachedAsset;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final HttpRequest createRequest(RequestType requestType, Object[] objArr) {
        Map headersMap;
        Map headersMap2;
        String str = (String) OooOOO.o000oOoO(1, objArr);
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        int i = WhenMappings.$EnumSwitchMapping$0[requestType.ordinal()];
        Map map = o00oO0o.f31247OooOo0O;
        if (i == 1 || i == 2) {
            JSONArray jSONArray = (JSONArray) OooOOO.o000oOoO(2, objArr);
            Integer num = (Integer) OooOOO.o000oOoO(3, objArr);
            Integer num2 = (Integer) OooOOO.o000oOoO(4, objArr);
            if (jSONArray == null || (headersMap = JSONArrayExtensionsKt.getHeadersMap(jSONArray)) == null) {
                headersMap = map;
            }
            return new HttpRequest(str, null, requestType, null, headersMap, null, null, null, null, num != null ? num.intValue() : 30000, num2 != null ? num2.intValue() : 30000, 0, 0, false, null, null, 0, 129514, null);
        }
        if (i != 3) {
            throw new OooOOO0.OooO00o();
        }
        String str2 = (String) OooOOO.o000oOoO(2, objArr);
        JSONArray jSONArray2 = (JSONArray) OooOOO.o000oOoO(3, objArr);
        Integer num3 = (Integer) OooOOO.o000oOoO(4, objArr);
        Integer num4 = (Integer) OooOOO.o000oOoO(5, objArr);
        if (jSONArray2 != null && (headersMap2 = JSONArrayExtensionsKt.getHeadersMap(jSONArray2)) != null) {
            map = headersMap2;
        }
        return new HttpRequest(str, null, requestType, str2, map, null, null, null, null, num3 != null ? num3.intValue() : 30000, num4 != null ? num4.intValue() : 30000, 0, 0, false, null, null, 0, 129506, null);
    }

    @Override // com.unity3d.ads.core.domain.ExecuteAdViewerRequest
    public Object invoke(RequestType requestType, Object[] objArr, OooO0OO oooO0OO) {
        return o0000OO0.Oooo00O(new C40572(objArr, this, requestType, null), this.ioDispatcher, oooO0OO);
    }
}
