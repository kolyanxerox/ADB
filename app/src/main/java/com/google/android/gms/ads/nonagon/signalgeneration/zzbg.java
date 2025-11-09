package com.google.android.gms.ads.nonagon.signalgeneration;

import Oooo0OO.oo000o;
import android.os.Bundle;
import androidx.datastore.preferences.protobuf.OooO00o;
import com.google.android.gms.internal.ads.AbstractC1448c7;
import com.google.android.gms.internal.ads.AbstractC2200wl;
import com.google.android.gms.internal.ads.C1618gu;
import com.google.android.gms.internal.ads.C1621gx;
import com.google.android.gms.internal.ads.C1646hl;
import com.google.android.gms.internal.ads.C1655hu;
import com.google.android.gms.internal.ads.C1847n1;
import com.google.android.gms.internal.ads.C1876nu;
import com.google.android.gms.internal.ads.df0;
import com.google.android.gms.internal.ads.ef0;
import com.google.android.gms.internal.ads.gf0;
import com.google.android.gms.internal.ads.ii0;
import com.google.android.gms.internal.ads.q31;
import com.google.android.gms.internal.ads.s20;
import com.google.android.gms.internal.ads.vd0;
import com.google.android.gms.internal.ads.wp0;
import com.google.android.gms.internal.ads.z31;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;

/* loaded from: classes2.dex */
public final class zzbg implements q31 {

    /* renamed from: OooO, reason: collision with root package name */
    public final z31 f16563OooO;

    /* renamed from: OooO00o, reason: collision with root package name */
    public final z31 f16564OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final z31 f16565OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final z31 f16566OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final z31 f16567OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public final z31 f16568OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final z31 f16569OooO0o0;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public final z31 f16570OooO0oO;

    /* renamed from: OooO0oo, reason: collision with root package name */
    public final z31 f16571OooO0oo;

    public zzbg(z31 z31Var, z31 z31Var2, z31 z31Var3, z31 z31Var4, z31 z31Var5, z31 z31Var6, z31 z31Var7, z31 z31Var8, z31 z31Var9) {
        this.f16564OooO00o = z31Var;
        this.f16565OooO0O0 = z31Var2;
        this.f16566OooO0OO = z31Var3;
        this.f16567OooO0Oo = z31Var4;
        this.f16569OooO0o0 = z31Var5;
        this.f16568OooO0o = z31Var6;
        this.f16570OooO0oO = z31Var7;
        this.f16571OooO0oo = z31Var8;
        this.f16563OooO = z31Var9;
    }

    @Override // com.google.android.gms.internal.ads.z31
    public final Object zzb() throws JSONException {
        zzau zzauVar = (zzau) this.f16564OooO00o.zzb();
        gf0 gf0Var = (gf0) this.f16565OooO0O0.zzb();
        zzbi zzbiVarZzb = ((zzbj) this.f16566OooO0OO).zzb();
        C1618gu c1618guZzb = ((C1655hu) this.f16567OooO0Oo).zzb();
        C1621gx c1621gx = (C1621gx) this.f16569OooO0o0.zzb();
        zzb zzbVar = (zzb) this.f16568OooO0o.zzb();
        C1646hl c1646hl = (C1646hl) this.f16570OooO0oO.zzb();
        int iIntValue = ((Integer) this.f16571OooO0oo.zzb()).intValue();
        vd0 vd0VarOooO00o = ((C1876nu) this.f16563OooO).OooO00o();
        zzbk zzbkVarZza = null;
        if (iIntValue == 1 && c1646hl != null) {
            ((oo000o) com.google.android.gms.ads.internal.zzv.zzC()).getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            Bundle bundle = vd0VarOooO00o.f24967OooOOoo;
            bundle.putLong("read-from-disk-start", jCurrentTimeMillis);
            zzbkVarZza = zzbVar.zza(c1646hl, zzauVar, bundle);
            OooO00o.OooOo0O((oo000o) com.google.android.gms.ads.internal.zzv.zzC(), bundle, "read-from-disk-end");
        }
        if (zzbkVarZza != null) {
            synchronized (c1621gx) {
                c1621gx.o0000Ooo(new C1847n1(zzbkVarZza, 16));
            }
            return ii0.OooooOO(zzbkVarZza);
        }
        s20 s20VarOooOO0 = gf0Var.OooO00o(ef0.GENERATE_SIGNALS, c1618guZzb.OooO0O0()).OooOO0(zzbiVarZzb);
        long jIntValue = ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().OooO00o(AbstractC1448c7.o00oOo0o)).intValue();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        df0 df0VarOooO00o = s20VarOooOO0.OooOOO0(jIntValue).OooO00o();
        df0VarOooO00o.addListener(new wp0(0, df0VarOooO00o, new zzaw(c1621gx)), AbstractC2200wl.f25321OooO00o);
        return df0VarOooO00o;
    }
}
