package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzbe;

/* loaded from: classes2.dex */
public final class hb0 implements jb0 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final boolean f19678OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final boolean f19679OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final String f19680OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final boolean f19681OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public final int f19682OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final int f19683OooO0o0;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public final int f19684OooO0oO;

    /* renamed from: OooO0oo, reason: collision with root package name */
    public final String f19685OooO0oo;

    public hb0(boolean z, boolean z2, String str, boolean z3, int i, int i2, int i3, String str2) {
        this.f19678OooO00o = z;
        this.f19679OooO0O0 = z2;
        this.f19680OooO0OO = str;
        this.f19681OooO0Oo = z3;
        this.f19683OooO0o0 = i;
        this.f19682OooO0o = i2;
        this.f19684OooO0oO = i3;
        this.f19685OooO0oo = str2;
    }

    @Override // com.google.android.gms.internal.ads.jb0
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        C1581fu c1581fu = (C1581fu) obj;
        c1581fu.f19126OooO0O0.putString("js", this.f19680OooO0OO);
        c1581fu.f19126OooO0O0.putInt("target_api", this.f19683OooO0o0);
    }

    @Override // com.google.android.gms.internal.ads.jb0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Bundle bundle = ((C1581fu) obj).f19125OooO00o;
        bundle.putString("js", this.f19680OooO0OO);
        bundle.putBoolean("is_nonagon", true);
        bundle.putString("extra_caps", (String) zzbe.zzc().OooO00o(AbstractC1448c7.f17912o00Oo00));
        bundle.putInt("target_api", this.f19683OooO0o0);
        bundle.putInt("dv", this.f19682OooO0o);
        bundle.putInt("lv", this.f19684OooO0oO);
        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0O0o)).booleanValue()) {
            String str = this.f19685OooO0oo;
            if (!TextUtils.isEmpty(str)) {
                bundle.putString("ev", str);
            }
        }
        Bundle bundleOooO0o = af0.OooO0o(bundle, "sdk_env");
        bundleOooO0o.putBoolean("mf", ((Boolean) AbstractC1633h8.f19642OooO0OO.OooOOO()).booleanValue());
        bundleOooO0o.putBoolean("instant_app", this.f19678OooO00o);
        bundleOooO0o.putBoolean("lite", this.f19679OooO0O0);
        bundleOooO0o.putBoolean("is_privileged_process", this.f19681OooO0Oo);
        bundle.putBundle("sdk_env", bundleOooO0o);
        Bundle bundleOooO0o2 = af0.OooO0o(bundleOooO0o, "build_meta");
        bundleOooO0o2.putString("cl", "697668803");
        bundleOooO0o2.putString("rapid_rc", "dev");
        bundleOooO0o2.putString("rapid_rollup", "HEAD");
        bundleOooO0o.putBundle("build_meta", bundleOooO0o2);
    }
}
