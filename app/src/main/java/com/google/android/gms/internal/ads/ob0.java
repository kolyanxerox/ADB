package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzbe;
import com.ironsource.C3034d9;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class ob0 implements jb0 {

    /* renamed from: OooO, reason: collision with root package name */
    public final String f22953OooO;

    /* renamed from: OooO00o, reason: collision with root package name */
    public final boolean f22954OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final boolean f22955OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final String f22956OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final boolean f22957OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public final boolean f22958OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final boolean f22959OooO0o0;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public final String f22960OooO0oO;

    /* renamed from: OooO0oo, reason: collision with root package name */
    public final ArrayList f22961OooO0oo;

    /* renamed from: OooOO0, reason: collision with root package name */
    public final String f22962OooOO0;

    /* renamed from: OooOO0O, reason: collision with root package name */
    public final String f22963OooOO0O;
    public final boolean OooOO0o;

    /* renamed from: OooOOO, reason: collision with root package name */
    public final long f22964OooOOO;

    /* renamed from: OooOOO0, reason: collision with root package name */
    public final String f22965OooOOO0;

    /* renamed from: OooOOOO, reason: collision with root package name */
    public final boolean f22966OooOOOO;

    /* renamed from: OooOOOo, reason: collision with root package name */
    public final String f22967OooOOOo;

    /* renamed from: OooOOo0, reason: collision with root package name */
    public final int f22968OooOOo0;

    public ob0(boolean z, boolean z2, String str, boolean z3, boolean z4, boolean z5, String str2, ArrayList arrayList, String str3, String str4, String str5, boolean z6, String str6, long j, boolean z7, String str7, int i) {
        this.f22954OooO00o = z;
        this.f22955OooO0O0 = z2;
        this.f22956OooO0OO = str;
        this.f22957OooO0Oo = z3;
        this.f22959OooO0o0 = z4;
        this.f22958OooO0o = z5;
        this.f22960OooO0oO = str2;
        this.f22961OooO0oo = arrayList;
        this.f22953OooO = str3;
        this.f22962OooOO0 = str4;
        this.f22963OooOO0O = str5;
        this.OooOO0o = z6;
        this.f22965OooOOO0 = str6;
        this.f22964OooOOO = j;
        this.f22966OooOOOO = z7;
        this.f22967OooOOOo = str7;
        this.f22968OooOOo0 = i;
    }

    @Override // com.google.android.gms.internal.ads.jb0
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = ((C1581fu) obj).f19126OooO0O0;
        bundle.putBoolean("simulator", this.f22957OooO0Oo);
        bundle.putInt("build_api_level", this.f22968OooOOo0);
        ArrayList<String> arrayList = this.f22961OooO0oo;
        if (!arrayList.isEmpty()) {
            bundle.putStringArrayList("hl_list", arrayList);
        }
        bundle.putString("submodel", this.f22965OooOOO0);
    }

    @Override // com.google.android.gms.internal.ads.jb0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Bundle bundle = ((C1581fu) obj).f19125OooO00o;
        bundle.putBoolean("cog", this.f22954OooO00o);
        bundle.putBoolean("coh", this.f22955OooO0O0);
        bundle.putString("gl", this.f22956OooO0OO);
        bundle.putBoolean("simulator", this.f22957OooO0Oo);
        bundle.putBoolean("is_latchsky", this.f22959OooO0o0);
        bundle.putInt("build_api_level", this.f22968OooOOo0);
        if (!((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0OoOOO)).booleanValue()) {
            bundle.putBoolean("is_sidewinder", this.f22958OooO0o);
        }
        bundle.putString("hl", this.f22960OooO0oO);
        ArrayList<String> arrayList = this.f22961OooO0oo;
        if (!arrayList.isEmpty()) {
            bundle.putStringArrayList("hl_list", arrayList);
        }
        bundle.putString("mv", this.f22953OooO);
        bundle.putString("submodel", this.f22965OooOOO0);
        Bundle bundleOooO0o = af0.OooO0o(bundle, C3034d9.h.f8068G);
        bundle.putBundle(C3034d9.h.f8068G, bundleOooO0o);
        bundleOooO0o.putString("build", this.f22963OooOO0O);
        bundleOooO0o.putLong("remaining_data_partition_space", this.f22964OooOOO);
        Bundle bundleOooO0o2 = af0.OooO0o(bundleOooO0o, "browser");
        bundleOooO0o.putBundle("browser", bundleOooO0o2);
        bundleOooO0o2.putBoolean("is_browser_custom_tabs_capable", this.OooOO0o);
        String str = this.f22962OooOO0;
        if (!TextUtils.isEmpty(str)) {
            Bundle bundleOooO0o3 = af0.OooO0o(bundleOooO0o, "play_store");
            bundleOooO0o.putBundle("play_store", bundleOooO0o3);
            bundleOooO0o3.putString("package_version", str);
        }
        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0Ooo00O)).booleanValue()) {
            bundle.putBoolean("is_bstar", this.f22966OooOOOO);
        }
        String str2 = this.f22967OooOOOo;
        if (!TextUtils.isEmpty(str2)) {
            bundle.putString("v_unity", str2);
        }
        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0OoOoO0)).booleanValue()) {
            af0.Oooooo0(bundle, "gotmt_l", true, ((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0ooOOoo)).booleanValue());
            af0.Oooooo0(bundle, "gotmt_i", true, ((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0OoOo0O)).booleanValue());
        }
    }
}
