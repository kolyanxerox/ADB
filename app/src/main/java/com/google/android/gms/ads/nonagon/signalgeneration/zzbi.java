package com.google.android.gms.ads.nonagon.signalgeneration;

import android.os.Binder;
import android.util.JsonReader;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.google.android.gms.internal.ads.AbstractC1448c7;
import com.google.android.gms.internal.ads.C2197wi;
import com.google.android.gms.internal.ads.CallableC2031s0;
import com.google.android.gms.internal.ads.e40;
import com.google.android.gms.internal.ads.h40;
import com.google.android.gms.internal.ads.ii0;
import com.google.android.gms.internal.ads.lp0;
import com.google.android.gms.internal.ads.tp0;
import com.google.android.gms.internal.ads.v40;
import com.google.android.gms.internal.ads.w40;
import java.io.InputStreamReader;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import o00000oO.OooOOO;
import org.json.JSONException;

/* loaded from: classes2.dex */
public final class zzbi implements lp0 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final Executor f16572OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final h40 f16573OooO0O0;

    public zzbi(Executor executor, h40 h40Var) {
        this.f16572OooO00o = executor;
        this.f16573OooO0O0 = h40Var;
    }

    @Override // com.google.android.gms.internal.ads.lp0
    public final OooOOO zza(Object obj) throws Exception {
        OooOOO oooOOOOooO0OO;
        final C2197wi c2197wi = (C2197wi) obj;
        h40 h40Var = this.f16573OooO0O0;
        h40Var.getClass();
        String str = c2197wi.zzd;
        com.google.android.gms.ads.internal.zzv.zzq();
        if (com.google.android.gms.ads.internal.util.zzs.zzD(str)) {
            oooOOOOooO0OO = ii0.Ooooo00(new v40(1));
        } else {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().OooO00o(AbstractC1448c7.o0O0Oooo)).booleanValue()) {
                oooOOOOooO0OO = h40Var.f19545OooO0OO.OooO0O0(new CallableC2031s0(6, h40Var, c2197wi));
            } else {
                oooOOOOooO0OO = h40Var.f19546OooO0Oo.OooO0OO(c2197wi);
            }
        }
        return ii0.ooOO(ii0.OoooOoO((tp0) ii0.o00Oo0(tp0.OooOOo(oooOOOOooO0OO), ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().OooO00o(AbstractC1448c7.o00oOo0o)).intValue(), TimeUnit.SECONDS, h40Var.f19543OooO00o), Throwable.class, new e40(h40Var, c2197wi, Binder.getCallingUid(), 1), h40Var.f19544OooO0O0), new lp0() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzbh
            @Override // com.google.android.gms.internal.ads.lp0
            public final OooOOO zza(Object obj2) {
                w40 w40Var = (w40) obj2;
                zzbk zzbkVar = new zzbk(new JsonReader(new InputStreamReader(w40Var.f25181OooO00o)), w40Var.f25182OooO0O0);
                C2197wi c2197wi2 = c2197wi;
                try {
                    zzbkVar.zzb = com.google.android.gms.ads.internal.client.zzbc.zzb().zzi(c2197wi2.zza).toString();
                } catch (JSONException unused) {
                    zzbkVar.zzb = JsonUtils.EMPTY_JSON;
                }
                if (!c2197wi2.zzn.isEmpty()) {
                    try {
                        zzbkVar.zzc = com.google.android.gms.ads.internal.client.zzbc.zzb().zzi(c2197wi2.zzn).toString();
                    } catch (JSONException unused2) {
                    }
                }
                return ii0.OooooOO(zzbkVar);
            }
        }, this.f16572OooO00o);
    }
}
