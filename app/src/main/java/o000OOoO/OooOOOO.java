package o000OoOo;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.core.content.ContextCompat;
import o0000o0.OooOOO;
import o000OOo0.OooO00o;
import o000OOo0.OooO0O0;

/* loaded from: classes2.dex */
public final class OooOOOO {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final Context f30413OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final SharedPreferences f30414OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final OooO0O0 f30415OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f30416OooO0Oo;

    public OooOOOO(Context context, String str, OooO0O0 oooO0O0) {
        Context contextCreateDeviceProtectedStorageContext = ContextCompat.createDeviceProtectedStorageContext(context);
        this.f30413OooO00o = contextCreateDeviceProtectedStorageContext;
        SharedPreferences sharedPreferences = contextCreateDeviceProtectedStorageContext.getSharedPreferences("com.google.firebase.common.prefs:" + str, 0);
        this.f30414OooO0O0 = sharedPreferences;
        this.f30415OooO0OO = oooO0O0;
        this.f30416OooO0Oo = sharedPreferences.contains("firebase_data_collection_default_enabled") ? sharedPreferences.getBoolean("firebase_data_collection_default_enabled", true) : OooO00o();
    }

    public final boolean OooO00o() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        Context context = this.f30413OooO00o;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_data_collection_default_enabled")) {
                return true;
            }
            return applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }

    public final synchronized void OooO0O0(boolean z) {
        if (this.f30416OooO0Oo != z) {
            this.f30416OooO0Oo = z;
            this.f30415OooO0OO.OooO00o(new OooO00o(new OooOOO(z, 0)));
        }
    }
}
