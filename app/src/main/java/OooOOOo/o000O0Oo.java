package OooOooo;

import Oooo00O.o0000O;
import Oooo0OO.o00oO0o;
import Oooo0o0.OooOO0;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.ironsource.C3007ch;
import com.ironsource.C3126fq;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public class o000O0Oo {

    /* renamed from: OooO00o */
    public static final int f13670OooO00o;

    /* renamed from: OooO0O0 */
    public static final o000O0Oo f13671OooO0O0;

    static {
        AtomicBoolean atomicBoolean = o000O.f13660OooO00o;
        f13670OooO00o = 12451000;
        f13671OooO0O0 = new o000O0Oo();
    }

    public static int OooO00o(Context context) {
        AtomicBoolean atomicBoolean = o000O.f13660OooO00o;
        try {
            return context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            return 0;
        }
    }

    public static void OooO0Oo(Context context) throws o000O0O0, o000OO0O {
        AtomicBoolean atomicBoolean = o000O.f13660OooO00o;
        o000O0Oo o000o0oo2 = f13671OooO0O0;
        int iOooO0OO = o000o0oo2.OooO0OO(context, 11925000);
        if (iOooO0OO != 0) {
            Intent intentOooO0O0 = o000o0oo2.OooO0O0(context, "e", iOooO0OO);
            Log.e("GooglePlayServicesUtil", "GooglePlayServices not available due to error " + iOooO0OO);
            if (intentOooO0O0 != null) {
                throw new o000O0O0("Google Play Services not available");
            }
            throw new o000OO0O();
        }
    }

    public Intent OooO0O0(Context context, String str, int i) {
        if (i != 1 && i != 2) {
            if (i != 3) {
                return null;
            }
            int i2 = o0000O.f13792OooO00o;
            Uri uriFromParts = Uri.fromParts("package", "com.google.android.gms", null);
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(uriFromParts);
            return intent;
        }
        if (context != null && o00oO0o.OooOOO0(context)) {
            int i3 = o0000O.f13792OooO00o;
            Intent intent2 = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
            intent2.setPackage("com.google.android.wearable.app");
            return intent2;
        }
        StringBuilder sb = new StringBuilder("gcore_");
        sb.append(f13670OooO00o);
        sb.append("-");
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
        }
        sb.append("-");
        if (context != null) {
            sb.append(context.getPackageName());
        }
        sb.append("-");
        if (context != null) {
            try {
                sb.append(OooOO0.OooO00o(context).OooO0OO(0, context.getPackageName()).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        String string = sb.toString();
        int i4 = o0000O.f13792OooO00o;
        Intent intent3 = new Intent("android.intent.action.VIEW");
        Uri.Builder builderAppendQueryParameter = Uri.parse("market://details").buildUpon().appendQueryParameter(C3007ch.f7763x, "com.google.android.gms");
        if (!TextUtils.isEmpty(string)) {
            builderAppendQueryParameter.appendQueryParameter("pcampaignid", string);
        }
        intent3.setData(builderAppendQueryParameter.build());
        intent3.setPackage(C3126fq.f8595b);
        intent3.addFlags(524288);
        return intent3;
    }

    /* JADX WARN: Removed duplicated region for block: B:186:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x01bb A[EDGE_INSN: B:232:0x01bb->B:242:0x01f5 BREAK  A[LOOP:0: B:236:0x01cf->B:261:?]] */
    /* JADX WARN: Removed duplicated region for block: B:233:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x01f7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:244:0x01f8 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int OooO0OO(android.content.Context r10, int r11) {
        /*
            Method dump skipped, instructions count: 505
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: OooOooo.o000O0Oo.OooO0OO(android.content.Context, int):int");
    }
}
