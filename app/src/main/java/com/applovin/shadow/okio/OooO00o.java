package com.applovin.shadow.okio;

import android.app.NotificationChannel;
import android.view.autofill.AutofillValue;
import java.util.Locale;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class OooO00o {
    public static /* synthetic */ NotificationChannel OooO0O0(int i) {
        return new NotificationChannel("offline_notification_channel", "AdMob Offline Notifications", i);
    }

    public static /* synthetic */ NotificationChannel OooO0OO(String str) {
        return new NotificationChannel("pairing_input_channel", str, 4);
    }

    public static /* bridge */ /* synthetic */ AutofillValue OooO0o0(Object obj) {
        return (AutofillValue) obj;
    }

    public static /* synthetic */ Locale.LanguageRange OooOOOo(String str) {
        return new Locale.LanguageRange(str);
    }

    public static /* synthetic */ void OooOOo() {
    }

    public static /* synthetic */ void OooOoo0() {
    }
}
