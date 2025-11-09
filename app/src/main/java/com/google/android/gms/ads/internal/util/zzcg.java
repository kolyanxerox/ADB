package com.google.android.gms.ads.internal.util;

import OooOooo.o000O;
import android.content.Context;
import android.webkit.WebSettings;

/* loaded from: classes2.dex */
public final class zzcg {

    /* renamed from: OooO0O0, reason: collision with root package name */
    public static zzcg f16261OooO0O0;

    /* renamed from: OooO00o, reason: collision with root package name */
    public String f16262OooO00o;

    public static zzcg zza() {
        if (f16261OooO0O0 == null) {
            f16261OooO0O0 = new zzcg();
        }
        return f16261OooO0O0;
    }

    public final void zzb(Context context) {
        zze.zza("Updating user agent.");
        String defaultUserAgent = WebSettings.getDefaultUserAgent(context);
        if (!defaultUserAgent.equals(this.f16262OooO00o)) {
            if (o000O.OooO00o(context) == null) {
                context.getSharedPreferences("admob_user_agent", 0).edit().putString("user_agent", WebSettings.getDefaultUserAgent(context)).apply();
            }
            this.f16262OooO00o = defaultUserAgent;
        }
        zze.zza("User agent is updated.");
    }
}
