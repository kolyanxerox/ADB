package com.unity3d.ads.core.domain;

import android.content.Context;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.network.core.HttpClient;
import com.unity3d.services.core.network.core.RefactoredOkHttp3Client;
import o00O0.o000OOo;
import o00O0O0O.OooO0OO;
import o00O0O0o.OooOo00;
import o00O0OO0.OooO;
import o00O0OO0.OooOOOO;
import o00O0Oo.o00O0O;
import o00O0oOo.o000OO;
import o00OOO0.oo000o;
import oo00o.OooOo;

@OooO(m13471c = "com.unity3d.ads.core.domain.AndroidHttpClientProvider$invoke$client$1", m13472f = "AndroidHttpClientProvider.kt", m13473l = {59}, m13474m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class AndroidHttpClientProvider$invoke$client$1 extends OooOOOO implements o00O0O {
    final /* synthetic */ boolean $usingRefactoredGatewayClient;
    int label;
    final /* synthetic */ AndroidHttpClientProvider this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidHttpClientProvider$invoke$client$1(boolean z, AndroidHttpClientProvider androidHttpClientProvider, OooO0OO oooO0OO) {
        super(2, oooO0OO);
        this.$usingRefactoredGatewayClient = z;
        this.this$0 = androidHttpClientProvider;
    }

    @Override // o00O0OO0.OooO00o
    public final OooO0OO create(Object obj, OooO0OO oooO0OO) {
        return new AndroidHttpClientProvider$invoke$client$1(this.$usingRefactoredGatewayClient, this.this$0, oooO0OO);
    }

    @Override // o00O0OO0.OooO00o
    public final Object invokeSuspend(Object obj) {
        OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
        int i = this.label;
        if (i == 0) {
            o000OOo.OooOO0O(obj);
            if (this.$usingRefactoredGatewayClient) {
                return new RefactoredOkHttp3Client(this.this$0.dispatchers, new oo000o());
            }
            AndroidHttpClientProvider androidHttpClientProvider = this.this$0;
            Context context = androidHttpClientProvider.context;
            ISDKDispatchers iSDKDispatchers = this.this$0.dispatchers;
            this.label = 1;
            obj = androidHttpClientProvider.buildNetworkClient(context, iSDKDispatchers, this);
            if (obj == oooOo00) {
                return oooOo00;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o000OOo.OooOO0O(obj);
        }
        return (HttpClient) obj;
    }

    @Override // o00O0Oo.o00O0O
    public final Object invoke(o000OO o000oo2, OooO0OO oooO0OO) {
        return ((AndroidHttpClientProvider$invoke$client$1) create(o000oo2, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
    }
}
