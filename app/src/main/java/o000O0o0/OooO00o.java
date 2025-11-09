package o000O0O0;

import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.nio.channels.FileChannel;
import o000Ooo.o00O0O;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class OooO00o implements org.chromium.net.OooO0OO {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final File f30116OooOo0O;

    public OooO00o(File file) {
        this.f30116OooOo0O = file;
    }

    @Override // org.chromium.net.OooO0OO
    public FileChannel OooO00o() {
        return new FileInputStream(this.f30116OooOo0O).getChannel();
    }

    public JSONObject OooO0O0() throws Throwable {
        FileInputStream fileInputStream;
        JSONObject jSONObject;
        FileInputStream fileInputStream2 = null;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Checking for cached settings...", null);
        }
        try {
            File file = this.f30116OooOo0O;
            if (file.exists()) {
                fileInputStream = new FileInputStream(file);
                try {
                    try {
                        jSONObject = new JSONObject(o00O0O.OooO(fileInputStream));
                        fileInputStream2 = fileInputStream;
                    } catch (Throwable th) {
                        th = th;
                        fileInputStream2 = fileInputStream;
                        o00O0O.OooO0O0(fileInputStream2, "Error while closing settings cache file.");
                        throw th;
                    }
                } catch (Exception e) {
                    e = e;
                    Log.e("FirebaseCrashlytics", "Failed to fetch cached settings", e);
                    o00O0O.OooO0O0(fileInputStream, "Error while closing settings cache file.");
                    return null;
                }
            } else {
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Settings file does not exist.", null);
                }
                jSONObject = null;
            }
            o00O0O.OooO0O0(fileInputStream2, "Error while closing settings cache file.");
            return jSONObject;
        } catch (Exception e2) {
            e = e2;
            fileInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            o00O0O.OooO0O0(fileInputStream2, "Error while closing settings cache file.");
            throw th;
        }
    }

    public OooO00o(o000O0Oo.OooO0o oooO0o) {
        this.f30116OooOo0O = new File((File) oooO0o.f30140OooOoO0, "com.crashlytics.settings.json");
    }
}
