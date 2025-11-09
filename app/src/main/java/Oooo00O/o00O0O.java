package Oooo00O;

import OooOooo.o000O;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import androidx.collection.SimpleArrayMap;
import androidx.core.os.ConfigurationCompat;
import com.github.superadb.R;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public abstract class o00O0O {

    /* renamed from: OooO00o, reason: collision with root package name */
    public static final SimpleArrayMap f13821OooO00o = new SimpleArrayMap();

    /* renamed from: OooO0O0, reason: collision with root package name */
    public static Locale f13822OooO0O0;

    public static String OooO00o(Context context) {
        String packageName = context.getPackageName();
        try {
            Context context2 = Oooo0o0.OooOO0.OooO00o(context).f13505OooO00o;
            return context2.getPackageManager().getApplicationLabel(context2.getPackageManager().getApplicationInfo(packageName, 0)).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    public static String OooO0O0(Context context, int i) {
        Resources resources = context.getResources();
        String strOooO00o = OooO00o(context);
        if (i == 1) {
            return resources.getString(R.string.common_google_play_services_install_text, strOooO00o);
        }
        if (i == 2) {
            return Oooo0OO.o00oO0o.OooOOO0(context) ? resources.getString(R.string.common_google_play_services_wear_update_text) : resources.getString(R.string.common_google_play_services_update_text, strOooO00o);
        }
        if (i == 3) {
            return resources.getString(R.string.common_google_play_services_enable_text, strOooO00o);
        }
        if (i == 5) {
            return OooO0Oo(context, "common_google_play_services_invalid_account_text", strOooO00o);
        }
        if (i == 7) {
            return OooO0Oo(context, "common_google_play_services_network_error_text", strOooO00o);
        }
        if (i == 9) {
            return resources.getString(R.string.common_google_play_services_unsupported_text, strOooO00o);
        }
        if (i == 20) {
            return OooO0Oo(context, "common_google_play_services_restricted_profile_text", strOooO00o);
        }
        switch (i) {
            case 16:
                return OooO0Oo(context, "common_google_play_services_api_unavailable_text", strOooO00o);
            case 17:
                return OooO0Oo(context, "common_google_play_services_sign_in_failed_text", strOooO00o);
            case 18:
                return resources.getString(R.string.common_google_play_services_updating_text, strOooO00o);
            default:
                return resources.getString(R.string.common_google_play_services_unknown_issue, strOooO00o);
        }
    }

    public static String OooO0OO(Context context, int i) {
        Resources resources = context.getResources();
        switch (i) {
            case 1:
                return resources.getString(R.string.common_google_play_services_install_title);
            case 2:
                return resources.getString(R.string.common_google_play_services_update_title);
            case 3:
                return resources.getString(R.string.common_google_play_services_enable_title);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return OooO0o0(context, "common_google_play_services_invalid_account_title");
            case 7:
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return OooO0o0(context, "common_google_play_services_network_error_title");
            case 8:
                Log.e("GoogleApiAvailability", "Internal error occurred. Please see logs for detailed information");
                return null;
            case 9:
                Log.e("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
                return null;
            case 10:
                Log.e("GoogleApiAvailability", "Developer error occurred. Please see logs for detailed information");
                return null;
            case 11:
                Log.e("GoogleApiAvailability", "The application is not licensed to the user.");
                return null;
            case 12:
            case 13:
            case 14:
            case 15:
            case 19:
            default:
                Log.e("GoogleApiAvailability", "Unexpected error code " + i);
                return null;
            case 16:
                Log.e("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
                return null;
            case 17:
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return OooO0o0(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return OooO0o0(context, "common_google_play_services_restricted_profile_title");
        }
    }

    public static String OooO0Oo(Context context, String str, String str2) throws Resources.NotFoundException {
        Resources resources = context.getResources();
        String strOooO0o0 = OooO0o0(context, str);
        if (strOooO0o0 == null) {
            strOooO0o0 = resources.getString(R.string.common_google_play_services_unknown_issue);
        }
        return String.format(resources.getConfiguration().locale, strOooO0o0, str2);
    }

    public static String OooO0o0(Context context, String str) {
        Resources resourcesForApplication;
        SimpleArrayMap simpleArrayMap = f13821OooO00o;
        synchronized (simpleArrayMap) {
            try {
                Locale locale = ConfigurationCompat.getLocales(context.getResources().getConfiguration()).get(0);
                if (!locale.equals(f13822OooO0O0)) {
                    simpleArrayMap.clear();
                    f13822OooO0O0 = locale;
                }
                String str2 = (String) simpleArrayMap.get(str);
                if (str2 != null) {
                    return str2;
                }
                AtomicBoolean atomicBoolean = o000O.f13660OooO00o;
                try {
                    resourcesForApplication = context.getPackageManager().getResourcesForApplication("com.google.android.gms");
                } catch (PackageManager.NameNotFoundException unused) {
                    resourcesForApplication = null;
                }
                if (resourcesForApplication != null) {
                    int identifier = resourcesForApplication.getIdentifier(str, "string", "com.google.android.gms");
                    if (identifier == 0) {
                        Log.w("GoogleApiAvailability", "Missing resource: ".concat(str));
                    } else {
                        String string = resourcesForApplication.getString(identifier);
                        if (!TextUtils.isEmpty(string)) {
                            f13821OooO00o.put(str, string);
                            return string;
                        }
                        Log.w("GoogleApiAvailability", "Got empty resource: ".concat(str));
                    }
                }
                return null;
            } finally {
            }
        }
    }
}
