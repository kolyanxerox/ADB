package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.media.AudioManager;
import android.telephony.TelephonyManager;
import android.webkit.CookieManager;
import android.webkit.WebResourceResponse;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.AbstractC1870no;
import com.google.android.gms.internal.ads.C1998r4;
import com.google.android.gms.internal.ads.EnumC1852n6;
import com.google.android.gms.internal.ads.InterfaceC1722jo;
import com.google.android.gms.internal.ads.x50;
import java.io.InputStream;
import java.util.Map;

/* loaded from: classes2.dex */
public class zzaa {
    @Nullable
    public CookieManager zza(Context context) {
        throw null;
    }

    public WebResourceResponse zzb(String str, String str2, int i, String str3, Map map, InputStream inputStream) {
        throw null;
    }

    public AbstractC1870no zzc(InterfaceC1722jo interfaceC1722jo, C1998r4 c1998r4, boolean z, @Nullable x50 x50Var) {
        throw null;
    }

    public boolean zzd(Activity activity, Configuration configuration) {
        return false;
    }

    @Nullable
    public Intent zzf(Activity activity) {
        Intent intent = new Intent();
        intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
        intent.putExtra("app_package", activity.getPackageName());
        intent.putExtra("app_uid", activity.getApplicationInfo().uid);
        return intent;
    }

    public EnumC1852n6 zzg(Context context, TelephonyManager telephonyManager) {
        return EnumC1852n6.ENUM_UNKNOWN;
    }

    public void zzh(Context context, String str, String str2) {
    }

    public boolean zzi(Context context, String str) {
        return false;
    }

    public int zzj(AudioManager audioManager) {
        return 0;
    }

    public void zzk(Activity activity) {
    }

    public int zzm(Context context) {
        return ((TelephonyManager) context.getSystemService("phone")).getNetworkType();
    }
}
