package o000Ooo;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes2.dex */
public final class o00000O0 {

    /* renamed from: OooO00o */
    public final SharedPreferences f30456OooO00o;

    /* renamed from: OooO0O0 */
    public final o0000o0.Oooo0 f30457OooO0O0;

    /* renamed from: OooO0OO */
    public final Object f30458OooO0OO;

    /* renamed from: OooO0Oo */
    public TaskCompletionSource f30459OooO0Oo;

    /* renamed from: OooO0o */
    public boolean f30460OooO0o;

    /* renamed from: OooO0o0 */
    public boolean f30461OooO0o0;

    /* renamed from: OooO0oO */
    public Boolean f30462OooO0oO;

    /* renamed from: OooO0oo */
    public final TaskCompletionSource f30463OooO0oo;

    public o00000O0(o0000o0.Oooo0 oooo0) {
        Boolean boolValueOf;
        Object obj = new Object();
        this.f30458OooO0OO = obj;
        this.f30459OooO0Oo = new TaskCompletionSource();
        this.f30461OooO0o0 = false;
        this.f30460OooO0o = false;
        this.f30463OooO0oo = new TaskCompletionSource();
        oooo0.OooO00o();
        Context context = oooo0.f29588OooO00o;
        this.f30457OooO0O0 = oooo0;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.crashlytics", 0);
        this.f30456OooO00o = sharedPreferences;
        if (sharedPreferences.contains("firebase_crashlytics_collection_enabled")) {
            this.f30460OooO0o = false;
            boolValueOf = Boolean.valueOf(sharedPreferences.getBoolean("firebase_crashlytics_collection_enabled", true));
        } else {
            boolValueOf = null;
        }
        this.f30462OooO0oO = boolValueOf == null ? OooO00o(context) : boolValueOf;
        synchronized (obj) {
            try {
                if (OooO0O0()) {
                    this.f30459OooO0Oo.trySetResult(null);
                    this.f30461OooO0o0 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Boolean OooO00o(Context context) {
        PackageManager packageManager;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            packageManager = context.getPackageManager();
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("FirebaseCrashlytics", "Could not read data collection permission from manifest", e);
        }
        Boolean boolValueOf = (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_crashlytics_collection_enabled")) ? null : Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_crashlytics_collection_enabled"));
        if (boolValueOf == null) {
            this.f30460OooO0o = false;
            return null;
        }
        this.f30460OooO0o = true;
        return Boolean.valueOf(Boolean.TRUE.equals(boolValueOf));
    }

    public final synchronized boolean OooO0O0() {
        boolean zOooOO0;
        Boolean bool = this.f30462OooO0oO;
        if (bool != null) {
            zOooOO0 = bool.booleanValue();
        } else {
            try {
                zOooOO0 = this.f30457OooO0O0.OooOO0();
            } catch (IllegalStateException unused) {
                zOooOO0 = false;
            }
        }
        String strOooOO0o = OooO0oO.OooOo.OooOO0o("Crashlytics automatic data collection ", zOooOO0 ? "ENABLED" : "DISABLED", " by ", this.f30462OooO0oO == null ? "global Firebase setting" : this.f30460OooO0o ? "firebase_crashlytics_collection_enabled manifest flag" : "API", ".");
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", strOooOO0o, null);
        }
        return zOooOO0;
    }
}
