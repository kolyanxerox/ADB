package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzdo;
import com.google.android.gms.ads.internal.client.zzdr;
import com.google.android.gms.ads.internal.client.zzdy;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;

/* loaded from: classes2.dex */
public final class hd0 extends AbstractBinderC2013rj {

    /* renamed from: OooOo */
    public final String f19704OooOo;

    /* renamed from: OooOo0O */
    public final fd0 f19705OooOo0O;

    /* renamed from: OooOo0o */
    public final bd0 f19706OooOo0o;

    /* renamed from: OooOoO */
    public final Context f19707OooOoO;

    /* renamed from: OooOoO0 */
    public final sd0 f19708OooOoO0;

    /* renamed from: OooOoOO */
    public final VersionInfoParcel f19709OooOoOO;

    /* renamed from: OooOoo */
    public final h20 f19710OooOoo;

    /* renamed from: OooOoo0 */
    public final C1663i1 f19711OooOoo0;

    /* renamed from: OooOooO */
    public f10 f19712OooOooO;

    /* renamed from: OooOooo */
    public boolean f19713OooOooo = ((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17781o00000oo)).booleanValue();

    public hd0(String str, fd0 fd0Var, Context context, bd0 bd0Var, sd0 sd0Var, VersionInfoParcel versionInfoParcel, C1663i1 c1663i1, h20 h20Var) {
        this.f19704OooOo = str;
        this.f19705OooOo0O = fd0Var;
        this.f19706OooOo0o = bd0Var;
        this.f19708OooOoO0 = sd0Var;
        this.f19707OooOoO = context;
        this.f19709OooOoOO = versionInfoParcel;
        this.f19711OooOoo0 = c1663i1;
        this.f19710OooOoo = h20Var;
    }

    public final synchronized void o000O0O0(zzm zzmVar, InterfaceC2309zj interfaceC2309zj, int i) {
        try {
            if (!zzmVar.zzb()) {
                boolean z = false;
                if (((Boolean) AbstractC1559f8.f18811OooOO0O.OooOOO()).booleanValue()) {
                    if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0ooOOoo)).booleanValue()) {
                        z = true;
                    }
                }
                if (this.f19709OooOoOO.clientJarVersion < ((Integer) zzbe.zzc().OooO00o(AbstractC1448c7.o0OoOo0o)).intValue() || !z) {
                    Oooo00O.o000000O.OooO0Oo("#008 Must be called on the main UI thread.");
                }
            }
            this.f19706OooOo0o.f17478OooOo.set(interfaceC2309zj);
            zzv.zzq();
            if (zzs.zzI(this.f19707OooOoO) && zzmVar.zzs == null) {
                zzo.zzg("Failed to load the ad because app ID is missing.");
                this.f19706OooOo0o.o0OOO0o(af0.Oooo0O0(4, null, null));
                return;
            }
            if (this.f19712OooOooO != null) {
                return;
            }
            cd0 cd0Var = new cd0(24);
            fd0 fd0Var = this.f19705OooOo0O;
            fd0Var.f18931OooO0oo.f24637OooOOOO.f13884OooOo0o = i;
            fd0Var.OooO00o(zzmVar, this.f19704OooOo, cd0Var, new C1847n1(this, 27));
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2050sj
    public final Bundle zzb() {
        Bundle bundle;
        Oooo00O.o000000O.OooO0Oo("#008 Must be called on the main UI thread.");
        f10 f10Var = this.f19712OooOooO;
        if (f10Var == null) {
            return new Bundle();
        }
        C1766kv c1766kv = f10Var.f18750OooOOOO;
        synchronized (c1766kv) {
            bundle = new Bundle(c1766kv.f20689OooOo);
        }
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2050sj
    public final zzdy zzc() {
        f10 f10Var;
        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0OoO00O)).booleanValue() && (f10Var = this.f19712OooOooO) != null) {
            return f10Var.f17103OooO0o;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2050sj
    public final InterfaceC1939pj zzd() {
        Oooo00O.o000000O.OooO0Oo("#008 Must be called on the main UI thread.");
        f10 f10Var = this.f19712OooOooO;
        if (f10Var != null) {
            return f10Var.f18753OooOOo0;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2050sj
    public final synchronized String zze() {
        BinderC1913ou binderC1913ou;
        f10 f10Var = this.f19712OooOooO;
        if (f10Var == null || (binderC1913ou = f10Var.f17103OooO0o) == null) {
            return null;
        }
        return binderC1913ou.f23118OooOo0O;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2050sj
    public final synchronized void zzf(zzm zzmVar, InterfaceC2309zj interfaceC2309zj) {
        o000O0O0(zzmVar, interfaceC2309zj, 2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2050sj
    public final synchronized void zzg(zzm zzmVar, InterfaceC2309zj interfaceC2309zj) {
        o000O0O0(zzmVar, interfaceC2309zj, 3);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2050sj
    public final synchronized void zzh(boolean z) {
        Oooo00O.o000000O.OooO0Oo("setImmersiveMode must be called on the main UI thread.");
        this.f19713OooOooo = z;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2050sj
    public final void zzi(zzdo zzdoVar) {
        bd0 bd0Var = this.f19706OooOo0o;
        if (zzdoVar == null) {
            bd0Var.f17480OooOo0o.set(null);
        } else {
            bd0Var.f17480OooOo0o.set(new gd0(this, zzdoVar, 0));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2050sj
    public final void zzj(zzdr zzdrVar) {
        Oooo00O.o000000O.OooO0Oo("setOnPaidEventListener must be called on the main UI thread.");
        try {
            if (!zzdrVar.zzf()) {
                this.f19710OooOoo.OooO0O0();
            }
        } catch (RemoteException e) {
            zzo.zzf("Error in making CSI ping for reporting paid event callback", e);
        }
        this.f19706OooOo0o.f17484OooOoo.set(zzdrVar);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2050sj
    public final void zzk(InterfaceC2161vj interfaceC2161vj) {
        Oooo00O.o000000O.OooO0Oo("#008 Must be called on the main UI thread.");
        this.f19706OooOo0o.f17482OooOoO0.set(interfaceC2161vj);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2050sj
    public final synchronized void zzl(C1571fk c1571fk) {
        Oooo00O.o000000O.OooO0Oo("#008 Must be called on the main UI thread.");
        sd0 sd0Var = this.f19708OooOoO0;
        sd0Var.f24065OooO00o = c1571fk.zza;
        sd0Var.f24066OooO0O0 = c1571fk.zzb;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2050sj
    public final synchronized void zzm(Oooo0o.OooO0O0 oooO0O0) {
        zzn(oooO0O0, this.f19713OooOooo);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2050sj
    public final synchronized void zzn(Oooo0o.OooO0O0 oooO0O0, boolean z) {
        Oooo00O.o000000O.OooO0Oo("#008 Must be called on the main UI thread.");
        if (this.f19712OooOooO == null) {
            zzo.zzj("Rewarded can not be shown before loaded");
            this.f19706OooOo0o.OooO0o0(af0.Oooo0O0(9, null, null));
            return;
        }
        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17875o00O0Oo0)).booleanValue()) {
            this.f19711OooOoo0.f19893OooO0O0.zzn(new Throwable().getStackTrace());
        }
        this.f19712OooOooO.OooO0O0((Activity) Oooo0o.OooO0OO.o000O0oO(oooO0O0), z);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2050sj
    public final boolean zzo() {
        Oooo00O.o000000O.OooO0Oo("#008 Must be called on the main UI thread.");
        f10 f10Var = this.f19712OooOooO;
        return (f10Var == null || f10Var.f18755OooOo00) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2050sj
    public final void zzp(C1388ak c1388ak) {
        Oooo00O.o000000O.OooO0Oo("#008 Must be called on the main UI thread.");
        this.f19706OooOo0o.f17483OooOoOO.set(c1388ak);
    }
}
