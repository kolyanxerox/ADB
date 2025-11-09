package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zzj;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.internal.ads.cz */
/* loaded from: classes2.dex */
public final class C1476cz implements q31 {

    /* renamed from: OooO, reason: collision with root package name */
    public final v31 f18097OooO;

    /* renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f18098OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final v31 f18099OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final p31 f18100OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final p31 f18101OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public final v31 f18102OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final v31 f18103OooO0o0;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public final v31 f18104OooO0oO;

    /* renamed from: OooO0oo, reason: collision with root package name */
    public final v31 f18105OooO0oo;

    public C1476cz(C1760kp c1760kp, C1876nu c1876nu, v31 v31Var, C1651hq c1651hq, q31 q31Var, q31 q31Var2, p31 p31Var, p31 p31Var2) {
        this.f18098OooO00o = 0;
        this.f18103OooO0o0 = c1760kp;
        this.f18099OooO0O0 = c1876nu;
        this.f18102OooO0o = v31Var;
        this.f18104OooO0oO = c1651hq;
        this.f18105OooO0oo = q31Var;
        this.f18097OooO = q31Var2;
        this.f18100OooO0OO = p31Var;
        this.f18101OooO0Oo = p31Var2;
    }

    public C1439bz OooO00o() {
        zzj zzjVarOooO00o = ((C1760kp) this.f18103OooO0o0).OooO00o();
        vd0 vd0VarOooO00o = ((C1876nu) this.f18099OooO0O0).OooO00o();
        C2139uy c2139uy = (C2139uy) this.f18102OooO0o.zzb();
        C2065sy c2065syOooO00o = ((C1651hq) this.f18104OooO0oO).OooO00o();
        C1696iz c1696iz = (C1696iz) ((q31) this.f18105OooO0oo).zzb();
        C1844mz c1844mz = (C1844mz) ((q31) this.f18097OooO).zzb();
        Executor executor = (Executor) this.f18100OooO0OO.zzb();
        C2163vl c2163vl = AbstractC2200wl.f25321OooO00o;
        ii0.Oooo000(c2163vl);
        return new C1439bz(zzjVarOooO00o, vd0VarOooO00o, c2139uy, c2065syOooO00o, c1696iz, c1844mz, executor, c2163vl, (C1991qy) this.f18101OooO0Oo.zzb());
    }

    public k40 OooO0O0() {
        C2130up c2130up = (C2130up) ((r31) this.f18103OooO0o0).f23738OooO00o;
        Context contextOooO00o = ((C1834mp) this.f18102OooO0o).OooO00o();
        VersionInfoParcel versionInfoParcelOooO00o = ((C1982qp) this.f18104OooO0oO).OooO00o();
        vd0 vd0VarOooO00o = ((C1876nu) this.f18099OooO0O0).OooO00o();
        C2163vl c2163vl = AbstractC2200wl.f25321OooO00o;
        ii0.Oooo000(c2163vl);
        return new k40(c2130up, contextOooO00o, versionInfoParcelOooO00o, vd0VarOooO00o, c2163vl, (String) ((q31) this.f18105OooO0oo).zzb(), (mf0) this.f18100OooO0OO.zzb(), (f20) this.f18101OooO0Oo.zzb(), new C2007rd(10), (ScheduledExecutorService) ((p31) this.f18097OooO).zzb());
    }

    @Override // com.google.android.gms.internal.ads.z31
    public final Object zzb() {
        switch (this.f18098OooO00o) {
            case 0:
                return OooO00o();
            case 1:
                return new j00(((C1876nu) this.f18099OooO0O0).OooO00o(), (Executor) this.f18100OooO0OO.zzb(), (n10) this.f18101OooO0Oo.zzb(), (Context) ((p31) this.f18103OooO0o0).zzb(), (h20) ((p31) this.f18102OooO0o).zzb(), (hg0) ((p31) this.f18104OooO0oO).zzb(), (s50) ((p31) this.f18105OooO0oo).zzb(), (c10) ((p31) this.f18097OooO).zzb());
            case 2:
                return new w00((C1950pu) this.f18100OooO0OO.zzb(), (C1508dv) this.f18101OooO0Oo.zzb(), (C1766kv) ((p31) this.f18103OooO0o0).zzb(), (C1877nv) ((p31) this.f18099OooO0O0).zzb(), (C1473cw) ((p31) this.f18102OooO0o).zzb(), ((C1764kt) this.f18104OooO0oO).OooO00o(), ((C1764kt) this.f18105OooO0oo).f20673OooO0O0.OooO0o(), (C1468cr) ((p31) this.f18097OooO).zzb());
            case 3:
                return new p30((q30) this.f18100OooO0OO.zzb(), (z30) this.f18101OooO0Oo.zzb(), (g30) ((p31) this.f18103OooO0o0).zzb(), ((C1834mp) this.f18099OooO0O0).OooO00o(), ((C1982qp) this.f18102OooO0o).OooO00o(), (l30) ((p31) this.f18104OooO0oO).zzb(), (x30) ((p31) this.f18105OooO0oo).zzb(), new SharedPreferencesOnSharedPreferenceChangeListenerC2236xk(), new SharedPreferencesOnSharedPreferenceChangeListenerC2236xk(), ((C1797lp) this.f18097OooO).OooO0OO());
            case 4:
                return OooO0O0();
            default:
                return new hd0((String) ((r31) this.f18103OooO0o0).f23738OooO00o, (fd0) this.f18100OooO0OO.zzb(), (Context) ((r31) this.f18099OooO0O0).f23738OooO00o, (bd0) this.f18101OooO0Oo.zzb(), (sd0) ((p31) this.f18102OooO0o).zzb(), ((C1982qp) this.f18104OooO0oO).OooO00o(), (C1663i1) ((p31) this.f18105OooO0oo).zzb(), (h20) ((p31) this.f18097OooO).zzb());
        }
    }

    public C1476cz(C1876nu c1876nu, p31 p31Var, p31 p31Var2, p31 p31Var3, p31 p31Var4, p31 p31Var5, p31 p31Var6, p31 p31Var7) {
        this.f18098OooO00o = 1;
        this.f18099OooO0O0 = c1876nu;
        this.f18100OooO0OO = p31Var;
        this.f18101OooO0Oo = p31Var2;
        this.f18103OooO0o0 = p31Var3;
        this.f18102OooO0o = p31Var4;
        this.f18104OooO0oO = p31Var5;
        this.f18105OooO0oo = p31Var6;
        this.f18097OooO = p31Var7;
    }

    public /* synthetic */ C1476cz(p31 p31Var, p31 p31Var2, p31 p31Var3, v31 v31Var, v31 v31Var2, v31 v31Var3, v31 v31Var4, v31 v31Var5, int i) {
        this.f18098OooO00o = i;
        this.f18100OooO0OO = p31Var;
        this.f18101OooO0Oo = p31Var2;
        this.f18103OooO0o0 = p31Var3;
        this.f18099OooO0O0 = v31Var;
        this.f18102OooO0o = v31Var2;
        this.f18104OooO0oO = v31Var3;
        this.f18105OooO0oo = v31Var4;
        this.f18097OooO = v31Var5;
    }

    public C1476cz(r31 r31Var, C1834mp c1834mp, C1982qp c1982qp, C1876nu c1876nu, q31 q31Var, p31 p31Var, p31 p31Var2, p31 p31Var3) {
        this.f18098OooO00o = 4;
        this.f18103OooO0o0 = r31Var;
        this.f18102OooO0o = c1834mp;
        this.f18104OooO0oO = c1982qp;
        this.f18099OooO0O0 = c1876nu;
        this.f18105OooO0oo = q31Var;
        this.f18100OooO0OO = p31Var;
        this.f18101OooO0Oo = p31Var2;
        this.f18097OooO = p31Var3;
    }

    public C1476cz(r31 r31Var, p31 p31Var, r31 r31Var2, p31 p31Var2, p31 p31Var3, C1982qp c1982qp, p31 p31Var4, p31 p31Var5) {
        this.f18098OooO00o = 5;
        this.f18103OooO0o0 = r31Var;
        this.f18100OooO0OO = p31Var;
        this.f18099OooO0O0 = r31Var2;
        this.f18101OooO0Oo = p31Var2;
        this.f18102OooO0o = p31Var3;
        this.f18104OooO0oO = c1982qp;
        this.f18105OooO0oo = p31Var4;
        this.f18097OooO = p31Var5;
    }
}
