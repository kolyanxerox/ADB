package com.unity3d.ads.core.domain;

import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.domain.task.ConfigFileFromLocalStorage;
import o00O0.o000OOo;
import o00O0O0O.OooO0OO;
import o00O0O0o.OooOo00;
import o00O0OO0.OooO;
import o00O0OO0.OooOOOO;
import o00O0Oo.o00O0O;
import o00O0oOo.o000OO;
import oo00o.OooOO0O;
import oo00o.OooOOO0;
import oo00o.OooOo;

@OooO(m13471c = "com.unity3d.ads.core.domain.AndroidHttpClientProvider$invoke$config$1", m13472f = "AndroidHttpClientProvider.kt", m13473l = {69}, m13474m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class AndroidHttpClientProvider$invoke$config$1 extends OooOOOO implements o00O0O {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AndroidHttpClientProvider this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidHttpClientProvider$invoke$config$1(AndroidHttpClientProvider androidHttpClientProvider, OooO0OO oooO0OO) {
        super(2, oooO0OO);
        this.this$0 = androidHttpClientProvider;
    }

    @Override // o00O0OO0.OooO00o
    public final OooO0OO create(Object obj, OooO0OO oooO0OO) {
        AndroidHttpClientProvider$invoke$config$1 androidHttpClientProvider$invoke$config$1 = new AndroidHttpClientProvider$invoke$config$1(this.this$0, oooO0OO);
        androidHttpClientProvider$invoke$config$1.L$0 = obj;
        return androidHttpClientProvider$invoke$config$1;
    }

    @Override // o00O0OO0.OooO00o
    public final Object invokeSuspend(Object obj) {
        Object objOooO0O0;
        Object objMo13784invokegIAlus;
        OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
        int i = this.label;
        try {
            if (i == 0) {
                o000OOo.OooOO0O(obj);
                ConfigFileFromLocalStorage configFileFromLocalStorage = this.this$0.configFileFromLocalStorage;
                ConfigFileFromLocalStorage.Params params = new ConfigFileFromLocalStorage.Params(null, 1, null);
                this.label = 1;
                objMo13784invokegIAlus = configFileFromLocalStorage.mo13784invokegIAlus(params, this);
                if (objMo13784invokegIAlus == oooOo00) {
                    return oooOo00;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o000OOo.OooOO0O(obj);
                objMo13784invokegIAlus = ((OooOOO0) obj).f33191OooOo0O;
            }
            objOooO0O0 = new OooOOO0(objMo13784invokegIAlus);
        } catch (Throwable th) {
            objOooO0O0 = o000OOo.OooO0O0(th);
        }
        if (objOooO0O0 instanceof OooOO0O) {
            objOooO0O0 = null;
        }
        OooOOO0 oooOOO0 = (OooOOO0) objOooO0O0;
        if (oooOOO0 == null) {
            return null;
        }
        Object obj2 = oooOOO0.f33191OooOo0O;
        return (Configuration) (obj2 instanceof OooOO0O ? null : obj2);
    }

    @Override // o00O0Oo.o00O0O
    public final Object invoke(o000OO o000oo2, OooO0OO oooO0OO) {
        return ((AndroidHttpClientProvider$invoke$config$1) create(o000oo2, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
    }
}
