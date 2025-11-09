package OoooOOO;

import android.os.Bundle;
import android.text.TextUtils;
import com.ironsource.C3034d9;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class oO0O0O0o {

    /* renamed from: OooO00o */
    public final HashMap f14723OooO00o;

    public oO0O0O0o(Map map) {
        HashMap map2 = new HashMap();
        this.f14723OooO00o = map2;
        map2.putAll(map);
    }

    public final String OooO00o() {
        StringBuilder sb = new StringBuilder();
        o0000Ooo.o0oOOo o0oooo = oO0O0Oo0.f14724OooO00o;
        int i = o0oooo.f29562OooOoO0;
        for (int i2 = 0; i2 < i; i2++) {
            String str = (String) o0oooo.get(i2);
            HashMap map = this.f14723OooO00o;
            if (map.containsKey(str)) {
                if (sb.length() > 0) {
                    sb.append(";");
                }
                sb.append(str);
                sb.append(C3034d9.i.f8173b);
                sb.append((String) map.get(str));
            }
        }
        return sb.toString();
    }

    public final Bundle OooO0O0() {
        o0O000 o0o000 = o0O000O.f14301o0000OOO;
        boolean zBooleanValue = ((Boolean) o0o000.OooO00o(null)).booleanValue();
        HashMap map = this.f14723OooO00o;
        if (!zBooleanValue ? !(!"1".equals(map.get("GoogleConsent")) || !"1".equals(map.get("gdprApplies")) || !"1".equals(map.get("EnableAdvertiserConsentMode"))) : !(!"1".equals(map.get("gdprApplies")) || !"1".equals(map.get("EnableAdvertiserConsentMode")))) {
            if (!((Boolean) o0o000.OooO00o(null)).booleanValue()) {
                return OooO0Oo();
            }
            if (map.get("Version") == null) {
                return OooO0Oo();
            }
            if (OooO0o0() >= 0) {
                Bundle bundle = new Bundle();
                bundle.putString("ad_storage", true != Objects.equals(map.get("AuthorizePurpose1"), "1") ? "denied" : "granted");
                bundle.putString("ad_personalization", (Objects.equals(map.get("AuthorizePurpose3"), "1") && Objects.equals(map.get("AuthorizePurpose4"), "1")) ? "granted" : "denied");
                if (OooO0o0() >= 4) {
                    bundle.putString("ad_user_data", (Objects.equals(map.get("AuthorizePurpose1"), "1") && Objects.equals(map.get("AuthorizePurpose7"), "1")) ? "granted" : "denied");
                }
                return bundle;
            }
        }
        return Bundle.EMPTY;
    }

    public final String OooO0OO() throws NumberFormatException {
        HashMap map = this.f14723OooO00o;
        StringBuilder sb = new StringBuilder("1");
        int i = -1;
        try {
            String str = (String) map.get("CmpSdkID");
            if (!TextUtils.isEmpty(str)) {
                i = Integer.parseInt(str);
            }
        } catch (NumberFormatException unused) {
        }
        if (i < 0 || i > 4095) {
            sb.append("00");
        } else {
            sb.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i >> 6));
            sb.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i & 63));
        }
        int iOooO0o0 = OooO0o0();
        if (iOooO0o0 < 0 || iOooO0o0 > 63) {
            sb.append("0");
        } else {
            sb.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(iOooO0o0));
        }
        int i2 = true != "1".equals(map.get("gdprApplies")) ? 0 : 2;
        int i3 = i2 | 4;
        if ("1".equals(map.get("EnableAdvertiserConsentMode"))) {
            i3 = i2 | 12;
        }
        sb.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i3));
        return sb.toString();
    }

    public final Bundle OooO0Oo() {
        int iOooO0o0;
        HashMap map = this.f14723OooO00o;
        if ("1".equals(map.get("GoogleConsent")) && (iOooO0o0 = OooO0o0()) >= 0) {
            String str = (String) map.get("PurposeConsents");
            if (!TextUtils.isEmpty(str)) {
                Bundle bundle = new Bundle();
                String str2 = "denied";
                if (str.length() > 0) {
                    bundle.putString("ad_storage", str.charAt(0) == '1' ? "granted" : "denied");
                }
                if (str.length() > 3) {
                    bundle.putString("ad_personalization", (str.charAt(2) == '1' && str.charAt(3) == '1') ? "granted" : "denied");
                }
                if (str.length() > 6 && iOooO0o0 >= 4) {
                    if (str.charAt(0) == '1' && str.charAt(6) == '1') {
                        str2 = "granted";
                    }
                    bundle.putString("ad_user_data", str2);
                }
                return bundle;
            }
        }
        return Bundle.EMPTY;
    }

    public final int OooO0o0() {
        try {
            String str = (String) this.f14723OooO00o.get("PolicyVersion");
            if (TextUtils.isEmpty(str)) {
                return -1;
            }
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof oO0O0O0o) {
            return OooO00o().equalsIgnoreCase(((oO0O0O0o) obj).OooO00o());
        }
        return false;
    }

    public final int hashCode() {
        return OooO00o().hashCode();
    }

    public final String toString() {
        return OooO00o();
    }
}
