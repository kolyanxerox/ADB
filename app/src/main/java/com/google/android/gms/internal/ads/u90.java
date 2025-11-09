package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzs;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class u90 implements jb0 {

    /* renamed from: OooO, reason: collision with root package name */
    public final boolean f24602OooO;

    /* renamed from: OooO00o, reason: collision with root package name */
    public final zzs f24603OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final String f24604OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final boolean f24605OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final String f24606OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public final int f24607OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final float f24608OooO0o0;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public final int f24609OooO0oO;

    /* renamed from: OooO0oo, reason: collision with root package name */
    public final String f24610OooO0oo;

    public u90(zzs zzsVar, String str, boolean z, String str2, float f, int i, int i2, String str3, boolean z2) {
        Oooo00O.o000000O.OooO(zzsVar, "the adSize must not be null");
        this.f24603OooO00o = zzsVar;
        this.f24604OooO0O0 = str;
        this.f24605OooO0OO = z;
        this.f24606OooO0Oo = str2;
        this.f24608OooO0o0 = f;
        this.f24607OooO0o = i;
        this.f24609OooO0oO = i2;
        this.f24610OooO0oo = str3;
        this.f24602OooO = z2;
    }

    public final void OooO00o(Bundle bundle) {
        zzs zzsVar = this.f24603OooO00o;
        af0.Ooooo0o(bundle, "smart_w", "full", zzsVar.zze == -1);
        af0.Ooooo0o(bundle, "smart_h", "auto", zzsVar.zzb == -2);
        af0.Oooooo0(bundle, "ene", true, zzsVar.zzj);
        af0.Ooooo0o(bundle, "rafmt", "102", zzsVar.zzm);
        af0.Ooooo0o(bundle, "rafmt", "103", zzsVar.zzn);
        af0.Ooooo0o(bundle, "rafmt", "105", zzsVar.zzo);
        af0.Oooooo0(bundle, "inline_adaptive_slot", true, this.f24602OooO);
        af0.Oooooo0(bundle, "interscroller_slot", true, zzsVar.zzo);
        af0.OooOooo("format", bundle, this.f24604OooO0O0);
        af0.Ooooo0o(bundle, "fluid", "height", this.f24605OooO0OO);
        af0.Ooooo0o(bundle, "sz", this.f24606OooO0Oo, !TextUtils.isEmpty(r1));
        bundle.putFloat("u_sd", this.f24608OooO0o0);
        bundle.putInt("sw", this.f24607OooO0o);
        bundle.putInt("sh", this.f24609OooO0oO);
        String str = this.f24610OooO0oo;
        af0.Ooooo0o(bundle, "sc", str, true ^ TextUtils.isEmpty(str));
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        zzs[] zzsVarArr = zzsVar.zzg;
        if (zzsVarArr == null) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("height", zzsVar.zzb);
            bundle2.putInt("width", zzsVar.zze);
            bundle2.putBoolean("is_fluid_height", zzsVar.zzi);
            arrayList.add(bundle2);
        } else {
            for (zzs zzsVar2 : zzsVarArr) {
                Bundle bundle3 = new Bundle();
                bundle3.putBoolean("is_fluid_height", zzsVar2.zzi);
                bundle3.putInt("height", zzsVar2.zzb);
                bundle3.putInt("width", zzsVar2.zze);
                arrayList.add(bundle3);
            }
        }
        bundle.putParcelableArrayList("valid_ad_sizes", arrayList);
    }

    @Override // com.google.android.gms.internal.ads.jb0
    public final /* synthetic */ void zza(Object obj) {
        OooO00o(((C1581fu) obj).f19126OooO0O0);
    }

    @Override // com.google.android.gms.internal.ads.jb0
    public final /* synthetic */ void zzb(Object obj) {
        OooO00o(((C1581fu) obj).f19125OooO00o);
    }
}
