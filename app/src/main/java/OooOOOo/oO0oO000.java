package OoooOOO;

import android.net.Uri;
import android.text.TextUtils;

/* loaded from: classes2.dex */
public final class oO0oO000 extends ooOOO00O {
    public static final boolean OooOOO(String str) {
        String str2 = (String) o0O000O.f14243OooOo00.OooO00o(null);
        if (TextUtils.isEmpty(str2)) {
            return false;
        }
        for (String str3 : str2.split(",")) {
            if (str.equalsIgnoreCase(str3.trim())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x008e, code lost:
    
        if (java.lang.Math.abs(r5.hashCode() % 100) < r8.OooOooo().OooOOOo()) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final OoooOOO.oO0o0000 OooOO0o(java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 483
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: OoooOOO.oO0oO000.OooOO0o(java.lang.String):OoooOOO.oO0o0000");
    }

    public final String OooOOO0(String str) {
        o0OO00o0 o0oo00o0 = this.f14916OooOo0o.f14793OooOo0O;
        oOO0000.OoooOO0(o0oo00o0);
        String strOooOo = o0oo00o0.OooOo(str);
        if (TextUtils.isEmpty(strOooOo)) {
            return (String) o0O000O.f14239OooOOo.OooO00o(null);
        }
        Uri uri = Uri.parse((String) o0O000O.f14239OooOOo.OooO00o(null));
        Uri.Builder builderBuildUpon = uri.buildUpon();
        String authority = uri.getAuthority();
        StringBuilder sb = new StringBuilder(String.valueOf(strOooOo).length() + 1 + String.valueOf(authority).length());
        sb.append(strOooOo);
        sb.append(".");
        sb.append(authority);
        builderBuildUpon.authority(sb.toString());
        return builderBuildUpon.build().toString();
    }
}
