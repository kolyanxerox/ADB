package OoooO0O;

import OooO0oO.OooOOO0;
import OooO0oO.OooOo;
import android.content.Context;
import android.content.res.Resources;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes2.dex */
public final class o0000O {

    /* renamed from: OooO00o */
    public final String f13923OooO00o;

    /* renamed from: OooO0O0 */
    public final String f13924OooO0O0;

    public o0000O(String str, String str2) {
        this.f13923OooO00o = str;
        this.f13924OooO0O0 = str2;
    }

    public o0000O(OooOOO0 oooOOO0) throws Resources.NotFoundException, IOException {
        int iOooO0Oo = o000Ooo.o00O0O.OooO0Oo((Context) oooOOO0.f13280OooOo0o, "com.google.firebase.crashlytics.unity_version", "string");
        Context context = (Context) oooOOO0.f13280OooOo0o;
        if (iOooO0Oo != 0) {
            this.f13923OooO00o = "Unity";
            String string = context.getResources().getString(iOooO0Oo);
            this.f13924OooO0O0 = string;
            String strOooOO0 = OooOo.OooOO0("Unity Editor version is: ", string);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", strOooOO0, null);
                return;
            }
            return;
        }
        if (context.getAssets() != null) {
            try {
                InputStream inputStreamOpen = context.getAssets().open("flutter_assets/NOTICES.Z");
                if (inputStreamOpen != null) {
                    inputStreamOpen.close();
                }
                this.f13923OooO00o = "Flutter";
                this.f13924OooO0O0 = null;
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Development platform is: Flutter", null);
                    return;
                }
                return;
            } catch (IOException unused) {
            }
        }
        this.f13923OooO00o = null;
        this.f13924OooO0O0 = null;
    }
}
