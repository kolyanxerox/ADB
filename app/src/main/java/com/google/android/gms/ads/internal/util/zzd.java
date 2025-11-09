package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.provider.Settings;
import com.google.android.gms.internal.ads.AbstractC1522e8;
import com.google.android.gms.internal.ads.ze0;
import o00000oO.OooOOO;

/* loaded from: classes2.dex */
public final class zzd {
    public static void zza(Context context) {
        Object obj = com.google.android.gms.ads.internal.util.client.zzl.f16178OooO0O0;
        if (((Boolean) AbstractC1522e8.f18516OooO00o.OooOOO()).booleanValue()) {
            try {
                if (Settings.Global.getInt(context.getContentResolver(), "development_settings_enabled", 0) == 0 || com.google.android.gms.ads.internal.util.client.zzl.zzl()) {
                    return;
                }
                OooOOO oooOOOZzb = new zzc(context).zzb();
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Updating ad debug logging enablement.");
                ze0.OooOOo0(oooOOOZzb, "AdDebugLogUpdater.updateEnablement");
            } catch (Exception e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzk("Fail to determine debug setting.", e);
            }
        }
    }
}
