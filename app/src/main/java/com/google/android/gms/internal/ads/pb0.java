package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.ironsource.C3034d9;
import com.ironsource.C3451ne;

/* loaded from: classes2.dex */
public final class pb0 implements jb0 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final String f23271OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final int f23272OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final int f23273OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final int f23274OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public final int f23275OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final boolean f23276OooO0o0;

    public pb0(String str, int i, int i2, int i3, boolean z, int i4) {
        this.f23271OooO00o = str;
        this.f23272OooO0O0 = i;
        this.f23273OooO0OO = i2;
        this.f23274OooO0Oo = i3;
        this.f23276OooO0o0 = z;
        this.f23275OooO0o = i4;
    }

    @Override // com.google.android.gms.internal.ads.jb0
    public final /* synthetic */ void zza(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.jb0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Bundle bundle = ((C1581fu) obj).f19125OooO00o;
        af0.Ooooo0o(bundle, C3451ne.f10434O0, this.f23271OooO00o, !TextUtils.isEmpty(r0));
        int i = this.f23272OooO0O0;
        af0.o000oOoO(bundle, "cnt", i, i != -2);
        bundle.putInt("gnt", this.f23273OooO0OO);
        bundle.putInt("pt", this.f23274OooO0Oo);
        Bundle bundleOooO0o = af0.OooO0o(bundle, C3034d9.h.f8068G);
        bundle.putBundle(C3034d9.h.f8068G, bundleOooO0o);
        Bundle bundleOooO0o2 = af0.OooO0o(bundleOooO0o, "network");
        bundleOooO0o.putBundle("network", bundleOooO0o2);
        bundleOooO0o2.putInt("active_network_state", this.f23275OooO0o);
        bundleOooO0o2.putBoolean("active_network_metered", this.f23276OooO0o0);
    }
}
