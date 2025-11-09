package com.unity3d.ads.network.client;

import com.unity3d.ads.network.HttpClient;
import com.unity3d.ads.network.mapper.HttpRequestToOkHttpRequestKt;
import com.unity3d.ads.network.model.HttpRequest;
import com.unity3d.ads.network.model.HttpResponse;
import com.unity3d.services.core.domain.ISDKDispatchers;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.OooOo;
import o00O0.o000OOo;
import o00O0O0O.OooO0OO;
import o00O0O0o.OooOo00;
import o00O0OO0.OooO;
import o00O0OO0.OooOOOO;
import o00O0Oo.o00O0O;
import o00O0oOo.o0000OO0;
import o00O0oOo.o000OO;
import o00O0oOo.oo0o0Oo;
import o00OOO0.OooOO0;
import o00OOO0.o00000;
import o00OOO0.o000000;
import o00OOO0.o00Oo0;
import o00OOO0.o00Ooo;
import o00OOO0.o0OO00O;
import o00OOO0.o0Oo0oo;
import o00OOO0.oo000o;
import o00OOOoO.o0000oo;

/* loaded from: classes3.dex */
public final class OkHttp3Client implements HttpClient {
    private final oo000o client;
    private final ISDKDispatchers dispatchers;

    @OooO(m13471c = "com.unity3d.ads.network.client.OkHttp3Client$execute$2", m13472f = "OkHttp3Client.kt", m13473l = {35}, m13474m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.network.client.OkHttp3Client$execute$2 */
    public static final class C41992 extends OooOOOO implements o00O0O {
        final /* synthetic */ HttpRequest $request;
        int label;
        final /* synthetic */ OkHttp3Client this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41992(HttpRequest httpRequest, OkHttp3Client okHttp3Client, OooO0OO oooO0OO) {
            super(2, oooO0OO);
            this.$request = httpRequest;
            this.this$0 = okHttp3Client;
        }

        @Override // o00O0OO0.OooO00o
        public final OooO0OO create(Object obj, OooO0OO oooO0OO) {
            return new C41992(this.$request, this.this$0, oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) throws IOException {
            String string;
            Charset charsetForName;
            OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
            int i = this.label;
            if (i == 0) {
                o000OOo.OooOO0O(obj);
                o0OO00O okHttpRequest = HttpRequestToOkHttpRequestKt.toOkHttpRequest(this.$request);
                OkHttp3Client okHttp3Client = this.this$0;
                long connectTimeout = this.$request.getConnectTimeout();
                long readTimeout = this.$request.getReadTimeout();
                this.label = 1;
                obj = okHttp3Client.makeRequest(okHttpRequest, connectTimeout, readTimeout, this);
                if (obj == oooOo00) {
                    return oooOo00;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o000OOo.OooOO0O(obj);
            }
            o000000 o000000Var = (o000000) obj;
            int i2 = o000000Var.f32208OooOo;
            TreeMap treeMapOooO0oO = o000000Var.f32213OooOoOO.OooO0oO();
            String str = o000000Var.f32209OooOo0O.f32277OooO00o.f32292OooO;
            o00000 o00000Var = o000000Var.f32215OooOoo0;
            if (o00000Var != null) {
                o0000oo o0000ooVarOooO0OO = o00000Var.OooO0OO();
                try {
                    o00Oo0 o00oo0OooO0O0 = o00000Var.OooO0O0();
                    if (o00oo0OooO0O0 != null) {
                        charsetForName = o00OOO0O.OooO0OO.f32334OooO;
                        try {
                            String str2 = o00oo0OooO0O0.f32247OooO0O0;
                            if (str2 != null) {
                                charsetForName = Charset.forName(str2);
                            }
                        } catch (IllegalArgumentException unused) {
                        }
                    } else {
                        charsetForName = o00OOO0O.OooO0OO.f32334OooO;
                    }
                    string = o0000ooVarOooO0OO.readString(o00OOO0O.OooO0OO.OooO0O0(o0000ooVarOooO0OO, charsetForName));
                } finally {
                    o00OOO0O.OooO0OO.OooO0o0(o0000ooVarOooO0OO);
                }
            } else {
                string = null;
            }
            if (string == null) {
                string = "";
            }
            OooOo.OooO0Oo(str, "toString()");
            return new HttpResponse(string, i2, treeMapOooO0oO, str);
        }

        @Override // o00O0Oo.o00O0O
        public final Object invoke(o000OO o000oo2, OooO0OO oooO0OO) {
            return ((C41992) create(o000oo2, oooO0OO)).invokeSuspend(oo00o.OooOo.f33195OooO00o);
        }
    }

    public OkHttp3Client(ISDKDispatchers dispatchers, oo000o client) {
        OooOo.OooO0o0(dispatchers, "dispatchers");
        OooOo.OooO0o0(client, "client");
        this.dispatchers = dispatchers;
        this.client = client;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object makeRequest(o0OO00O o0oo00o, long j, long j2, OooO0OO oooO0OO) {
        final oo0o0Oo oo0o0oo = new oo0o0Oo(1, Oooo0o0.OooO.OooOOOO(oooO0OO));
        oo0o0oo.OooOOo0();
        oo000o oo000oVar = this.client;
        oo000oVar.getClass();
        o00Ooo o00ooo2 = new o00Ooo(oo000oVar);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        o00ooo2.OooOo0 = o00OOO0O.OooO0OO.OooO0Oo(j);
        o00ooo2.f32267OooOo0O = o00OOO0O.OooO0OO.OooO0Oo(j2);
        o0Oo0oo.OooO0OO(new oo000o(o00ooo2), o0oo00o).OooO00o(new OooOO0() { // from class: com.unity3d.ads.network.client.OkHttp3Client$makeRequest$2$1
            @Override // o00OOO0.OooOO0
            public void onFailure(o00OOO0.OooO call, IOException e) {
                OooOo.OooO0o0(call, "call");
                OooOo.OooO0o0(e, "e");
                oo0o0oo.resumeWith(o000OOo.OooO0O0(e));
            }

            @Override // o00OOO0.OooOO0
            public void onResponse(o00OOO0.OooO call, o000000 response) {
                OooOo.OooO0o0(call, "call");
                OooOo.OooO0o0(response, "response");
                oo0o0oo.resumeWith(response);
            }
        });
        Object objOooOOOo = oo0o0oo.OooOOOo();
        OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
        return objOooOOOo;
    }

    @Override // com.unity3d.ads.network.HttpClient
    public Object execute(HttpRequest httpRequest, OooO0OO oooO0OO) {
        return o0000OO0.Oooo00O(new C41992(httpRequest, this, null), this.dispatchers.getIo(), oooO0OO);
    }
}
