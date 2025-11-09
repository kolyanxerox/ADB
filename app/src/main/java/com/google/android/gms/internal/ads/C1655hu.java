package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* renamed from: com.google.android.gms.internal.ads.hu */
/* loaded from: classes2.dex */
public final class C1655hu implements q31 {

    /* renamed from: OooO, reason: collision with root package name */
    public final C2280yr f19855OooO;

    /* renamed from: OooO00o, reason: collision with root package name */
    public final p31 f19856OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final C1982qp f19857OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final p31 f19858OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final C1651hq f19859OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public final p31 f19860OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final p31 f19861OooO0o0;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public final C1760kp f19862OooO0oO;

    /* renamed from: OooO0oo, reason: collision with root package name */
    public final p31 f19863OooO0oo;

    /* renamed from: OooOO0, reason: collision with root package name */
    public final C1876nu f19864OooOO0;

    /* renamed from: OooOO0O, reason: collision with root package name */
    public final p31 f19865OooOO0O;
    public final p31 OooOO0o;

    public C1655hu(p31 p31Var, C1982qp c1982qp, p31 p31Var2, C1651hq c1651hq, p31 p31Var3, p31 p31Var4, C1760kp c1760kp, p31 p31Var5, C2280yr c2280yr, C1876nu c1876nu, p31 p31Var6, p31 p31Var7) {
        this.f19856OooO00o = p31Var;
        this.f19857OooO0O0 = c1982qp;
        this.f19858OooO0OO = p31Var2;
        this.f19859OooO0Oo = c1651hq;
        this.f19861OooO0o0 = p31Var3;
        this.f19860OooO0o = p31Var4;
        this.f19862OooO0oO = c1760kp;
        this.f19863OooO0oo = p31Var5;
        this.f19855OooO = c2280yr;
        this.f19864OooOO0 = c1876nu;
        this.f19865OooOO0O = p31Var6;
        this.OooOO0o = p31Var7;
    }

    @Override // com.google.android.gms.internal.ads.z31
    /* renamed from: OooO00o, reason: merged with bridge method [inline-methods] */
    public final C1618gu zzb() {
        gf0 gf0Var = (gf0) this.f19856OooO00o.zzb();
        VersionInfoParcel versionInfoParcelOooO00o = this.f19857OooO0O0.OooO00o();
        ApplicationInfo applicationInfo = (ApplicationInfo) this.f19858OooO0OO.zzb();
        String packageName = ((C1834mp) ((z31) this.f19859OooO0Oo.f19838OooO0O0)).OooO00o().getPackageName();
        ii0.Oooo000(packageName);
        C2148v6 c2148v6 = AbstractC1448c7.f17710OooO00o;
        return new C1618gu(gf0Var, versionInfoParcelOooO00o, applicationInfo, packageName, zzbe.zza().OooO00o(), (PackageInfo) this.f19861OooO0o0.zzb(), p31.OooO00o(new w31(this.f19860OooO0o)), this.f19862OooO0oO.OooO00o(), (String) this.f19863OooO0oo.zzb(), this.f19855OooO.OooO0O0(), this.f19864OooOO0.OooO00o(), (C1657hw) this.f19865OooOO0O.zzb(), ((Integer) this.OooOO0o.zzb()).intValue());
    }
}
