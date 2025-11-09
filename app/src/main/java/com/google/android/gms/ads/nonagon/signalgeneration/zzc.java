package com.google.android.gms.ads.nonagon.signalgeneration;

import android.content.pm.PackageInfo;
import com.google.android.gms.internal.ads.C1834mp;
import com.google.android.gms.internal.ads.q31;
import com.google.android.gms.internal.ads.z31;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public final class zzc implements q31 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final z31 f16585OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final z31 f16586OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final z31 f16587OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final z31 f16588OooO0Oo;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final z31 f16589OooO0o0;

    public zzc(z31 z31Var, z31 z31Var2, z31 z31Var3, z31 z31Var4, z31 z31Var5) {
        this.f16585OooO00o = z31Var;
        this.f16586OooO0O0 = z31Var2;
        this.f16587OooO0OO = z31Var3;
        this.f16588OooO0Oo = z31Var4;
        this.f16589OooO0o0 = z31Var5;
    }

    @Override // com.google.android.gms.internal.ads.z31
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzb(((C1834mp) this.f16585OooO00o).OooO00o(), ((Long) this.f16586OooO0O0.zzb()).longValue(), (PackageInfo) this.f16587OooO0OO.zzb(), (zzd) this.f16588OooO0Oo.zzb(), (ScheduledExecutorService) this.f16589OooO0o0.zzb());
    }
}
