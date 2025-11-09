package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.ads.internal.util.client.zzo;

/* renamed from: com.google.android.gms.internal.ads.y6 */
/* loaded from: classes2.dex */
public final class C2259y6 {
    public static final SharedPreferences OooO00o(Context context) {
        try {
            return context.getSharedPreferences("google_ads_flags", 0);
        } catch (IllegalStateException e) {
            zzo.zzk("", e);
            return null;
        }
    }
}
