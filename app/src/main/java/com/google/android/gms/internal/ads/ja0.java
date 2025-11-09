package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.ironsource.C3034d9;

/* loaded from: classes2.dex */
public final class ja0 implements jb0 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final double f20231OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final boolean f20232OooO0O0;

    public ja0(double d, boolean z) {
        this.f20231OooO00o = d;
        this.f20232OooO0O0 = z;
    }

    @Override // com.google.android.gms.internal.ads.jb0
    public final /* synthetic */ void zza(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.jb0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Bundle bundle = ((C1581fu) obj).f19125OooO00o;
        Bundle bundleOooO0o = af0.OooO0o(bundle, C3034d9.h.f8068G);
        bundle.putBundle(C3034d9.h.f8068G, bundleOooO0o);
        Bundle bundleOooO0o2 = af0.OooO0o(bundleOooO0o, "battery");
        bundleOooO0o.putBundle("battery", bundleOooO0o2);
        bundleOooO0o2.putBoolean("is_charging", this.f20232OooO0O0);
        bundleOooO0o2.putDouble("battery_level", this.f20231OooO00o);
    }
}
