package o000Ooo;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import androidx.work.WorkRequest;
import com.google.android.gms.tasks.Tasks;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import o000O0O.OooO;
import o000O0O.OooO0OO;
import o000O0O.OooO0o;
import o000O0O0.OooO0O0;
import o000Oo0O.OooOOOO;

/* loaded from: classes2.dex */
public final class o0000Ooo {

    /* renamed from: OooO0oO, reason: collision with root package name */
    public static final Pattern f30466OooO0oO = Pattern.compile("[^\\p{Alnum}]");

    /* renamed from: OooO0oo, reason: collision with root package name */
    public static final String f30467OooO0oo = Pattern.quote("/");

    /* renamed from: OooO00o, reason: collision with root package name */
    public final OooO0O0 f30468OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final Context f30469OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final String f30470OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final o000Oo0O.Oooo0 f30471OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public Oooo000 f30472OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final o00000O0 f30473OooO0o0;

    public o0000Ooo(Context context, String str, o000Oo0O.Oooo0 oooo0, o00000O0 o00000o02) {
        if (context == null) {
            throw new IllegalArgumentException("appContext must not be null");
        }
        if (str == null) {
            throw new IllegalArgumentException("appIdentifier must not be null");
        }
        this.f30469OooO0O0 = context;
        this.f30470OooO0OO = str;
        this.f30471OooO0Oo = oooo0;
        this.f30473OooO0o0 = o00000o02;
        this.f30468OooO00o = new OooO0O0();
    }

    public final synchronized String OooO00o(SharedPreferences sharedPreferences, String str) {
        String lowerCase;
        lowerCase = f30466OooO0oO.matcher(UUID.randomUUID().toString()).replaceAll("").toLowerCase(Locale.US);
        String str2 = "Created new Crashlytics installation ID: " + lowerCase + " for FID: " + str;
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", str2, null);
        }
        sharedPreferences.edit().putString("crashlytics.installation.id", lowerCase).putString("firebase.installation.id", str).apply();
        return lowerCase;
    }

    public final o00000OO OooO0O0(boolean z) {
        String str;
        String str2 = null;
        if (!((Boolean) new OooO0OO(0, OooO.f30098OooO0Oo, OooO0o.class, "isNotMainThread", "isNotMainThread()Z", 0, 2).invoke()).booleanValue()) {
            String str3 = "Must not be called on a main thread, was called on " + Thread.currentThread().getName() + '.';
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str3, null);
            }
        }
        o000Oo0O.Oooo0 oooo0 = this.f30471OooO0Oo;
        if (z) {
            try {
                str = ((OooOOOO) Tasks.await(((o000Oo0O.Oooo000) oooo0).OooO0o0(), WorkRequest.MIN_BACKOFF_MILLIS, TimeUnit.MILLISECONDS)).f30365OooO00o;
            } catch (Exception e) {
                Log.w("FirebaseCrashlytics", "Error getting Firebase authentication token.", e);
            }
        } else {
            str = null;
        }
        try {
            str2 = (String) Tasks.await(((o000Oo0O.Oooo000) oooo0).OooO0OO(), WorkRequest.MIN_BACKOFF_MILLIS, TimeUnit.MILLISECONDS);
        } catch (Exception e2) {
            Log.w("FirebaseCrashlytics", "Error getting Firebase installation id.", e2);
        }
        return new o00000OO(str2, str);
    }

    public final synchronized Oooo000 OooO0OO() {
        String str;
        Oooo000 oooo000 = this.f30472OooO0o;
        if (oooo000 != null && (oooo000.f30424OooO0O0 != null || !this.f30473OooO0o0.OooO0O0())) {
            return this.f30472OooO0o;
        }
        o000O000.OooO0OO oooO0OO = o000O000.OooO0OO.f30095OooO00o;
        oooO0OO.OooO0oO("Determining Crashlytics installation ID...");
        SharedPreferences sharedPreferences = this.f30469OooO0O0.getSharedPreferences("com.google.firebase.crashlytics", 0);
        String string = sharedPreferences.getString("firebase.installation.id", null);
        oooO0OO.OooO0oO("Cached Firebase Installation ID: " + string);
        if (this.f30473OooO0o0.OooO0O0()) {
            o00000OO o00000ooOooO0O0 = OooO0O0(false);
            oooO0OO.OooO0oO("Fetched Firebase Installation ID: " + o00000ooOooO0O0.f30464OooO00o);
            if (o00000ooOooO0O0.f30464OooO00o == null) {
                if (string == null) {
                    str = "SYN_" + UUID.randomUUID().toString();
                } else {
                    str = string;
                }
                o00000ooOooO0O0 = new o00000OO(str, null);
            }
            if (Objects.equals(o00000ooOooO0O0.f30464OooO00o, string)) {
                this.f30472OooO0o = new Oooo000(sharedPreferences.getString("crashlytics.installation.id", null), o00000ooOooO0O0.f30464OooO00o, o00000ooOooO0O0.f30465OooO0O0);
            } else {
                this.f30472OooO0o = new Oooo000(OooO00o(sharedPreferences, o00000ooOooO0O0.f30464OooO00o), o00000ooOooO0O0.f30464OooO00o, o00000ooOooO0O0.f30465OooO0O0);
            }
        } else if (string == null || !string.startsWith("SYN_")) {
            this.f30472OooO0o = new Oooo000(OooO00o(sharedPreferences, "SYN_" + UUID.randomUUID().toString()), null, null);
        } else {
            this.f30472OooO0o = new Oooo000(sharedPreferences.getString("crashlytics.installation.id", null), null, null);
        }
        oooO0OO.OooO0oO("Install IDs: " + this.f30472OooO0o);
        return this.f30472OooO0o;
    }

    public final String OooO0Oo() {
        String str;
        OooO0O0 oooO0O0 = this.f30468OooO00o;
        Context context = this.f30469OooO0O0;
        synchronized (oooO0O0) {
            try {
                if (oooO0O0.f30118OooO0O0 == null) {
                    String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                    if (installerPackageName == null) {
                        installerPackageName = "";
                    }
                    oooO0O0.f30118OooO0O0 = installerPackageName;
                }
                str = "".equals(oooO0O0.f30118OooO0O0) ? null : oooO0O0.f30118OooO0O0;
            } finally {
            }
        }
        return str;
    }
}
