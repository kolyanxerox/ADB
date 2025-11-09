package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzbe;

/* loaded from: classes2.dex */
public final class ha0 implements jb0 {

    /* renamed from: OooO, reason: collision with root package name */
    public final float f19662OooO;

    /* renamed from: OooO00o, reason: collision with root package name */
    public final int f19663OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final boolean f19664OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final boolean f19665OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final int f19666OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public final int f19667OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final int f19668OooO0o0;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public final int f19669OooO0oO;

    /* renamed from: OooO0oo, reason: collision with root package name */
    public final int f19670OooO0oo;

    /* renamed from: OooOO0, reason: collision with root package name */
    public final boolean f19671OooOO0;

    /* renamed from: OooOO0O, reason: collision with root package name */
    public final boolean f19672OooOO0O;

    public ha0(int i, boolean z, boolean z2, int i2, int i3, int i4, int i5, int i6, float f, boolean z3, boolean z4) {
        this.f19663OooO00o = i;
        this.f19664OooO0O0 = z;
        this.f19665OooO0OO = z2;
        this.f19666OooO0Oo = i2;
        this.f19668OooO0o0 = i3;
        this.f19667OooO0o = i4;
        this.f19669OooO0oO = i5;
        this.f19670OooO0oo = i6;
        this.f19662OooO = f;
        this.f19671OooOO0 = z3;
        this.f19672OooOO0O = z4;
    }

    @Override // com.google.android.gms.internal.ads.jb0
    public final /* synthetic */ void zza(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.jb0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Bundle bundle = ((C1581fu) obj).f19125OooO00o;
        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0OoOO)).booleanValue()) {
            bundle.putInt("muv_min", this.f19668OooO0o0);
            bundle.putInt("muv_max", this.f19667OooO0o);
        }
        bundle.putFloat("android_app_volume", this.f19662OooO);
        bundle.putBoolean("android_app_muted", this.f19671OooOO0);
        if (this.f19672OooOO0O) {
            return;
        }
        bundle.putInt("am", this.f19663OooO00o);
        bundle.putBoolean("ma", this.f19664OooO0O0);
        bundle.putBoolean("sp", this.f19665OooO0OO);
        bundle.putInt("muv", this.f19666OooO0Oo);
        bundle.putInt("rm", this.f19669OooO0oO);
        bundle.putInt("riv", this.f19670OooO0oo);
    }
}
