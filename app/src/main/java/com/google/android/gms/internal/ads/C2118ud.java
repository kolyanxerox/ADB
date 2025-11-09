package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;

/* renamed from: com.google.android.gms.internal.ads.ud */
/* loaded from: classes2.dex */
public final class C2118ud implements InterfaceC1427bm, InterfaceC1390am {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C2229xd f24621OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ C2192wd f24622OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ jf0 f24623OooOo0o;

    public /* synthetic */ C2118ud(C2229xd c2229xd, C2192wd c2192wd, jf0 jf0Var) {
        this.f24622OooOo0O = c2192wd;
        this.f24623OooOo0o = jf0Var;
        this.f24621OooOo = c2229xd;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1390am, com.google.android.gms.internal.ads.InterfaceC1502dp, com.google.android.gms.internal.ads.h90
    /* renamed from: zza */
    public void mo13707zza() {
        nf0 nf0Var;
        zze.zza("loadNewJavascriptEngine (failure): Trying to acquire lock");
        synchronized (this.f24621OooOo.f25607OooO0Oo) {
            try {
                zze.zza("loadNewJavascriptEngine (failure): Lock acquired");
                this.f24621OooOo.f25606OooO0OO = 1;
                zze.zza("Failed loading new engine. Marking new engine destroyable.");
                this.f24622OooOo0O.OooOOO0();
                if (((Boolean) AbstractC1449c8.f17951OooO0Oo.OooOOO()).booleanValue() && (nf0Var = (nf0) this.f24621OooOo.f25610OooO0oO) != null) {
                    jf0 jf0Var = this.f24623OooOo0o;
                    jf0Var.OooO0o0("Failed loading new engine");
                    jf0Var.OooOO0(false);
                    nf0Var.OooO0O0(jf0Var.zzm());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        zze.zza("loadNewJavascriptEngine (failure): Lock released");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1427bm
    /* renamed from: zza */
    public /* bridge */ /* synthetic */ void mo13708zza(Object obj) {
        nf0 nf0Var;
        zze.zza("loadNewJavascriptEngine (success): Trying to acquire lock");
        synchronized (this.f24621OooOo.f25607OooO0Oo) {
            try {
                zze.zza("loadNewJavascriptEngine (success): Lock acquired");
                C2229xd c2229xd = this.f24621OooOo;
                c2229xd.f25606OooO0OO = 0;
                C2192wd c2192wd = (C2192wd) c2229xd.f25603OooO;
                if (c2192wd != null && this.f24622OooOo0O != c2192wd) {
                    zze.zza("New JS engine is loaded, marking previous one as destroyable.");
                    ((C2192wd) this.f24621OooOo.f25603OooO).OooOOO0();
                }
                this.f24621OooOo.f25603OooO = this.f24622OooOo0O;
                if (((Boolean) AbstractC1449c8.f17951OooO0Oo.OooOOO()).booleanValue() && (nf0Var = (nf0) this.f24621OooOo.f25610OooO0oO) != null) {
                    jf0 jf0Var = this.f24623OooOo0o;
                    jf0Var.OooOO0(true);
                    nf0Var.OooO0O0(jf0Var.zzm());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        zze.zza("loadNewJavascriptEngine (success): Lock released");
    }
}
