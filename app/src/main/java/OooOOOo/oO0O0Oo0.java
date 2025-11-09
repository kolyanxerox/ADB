package OoooOOO;

import android.content.SharedPreferences;
import android.text.TextUtils;

/* loaded from: classes2.dex */
public abstract class oO0O0Oo0 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public static final o0000Ooo.o0oOOo f14724OooO00o;

    static {
        o0000Ooo.o00OOOO0 o00oooo0 = o0000Ooo.o00Oo00.f29532OooOo0o;
        Object[] objArr = new Object[24];
        objArr[0] = "Version";
        objArr[1] = "GoogleConsent";
        objArr[2] = "VendorConsent";
        objArr[3] = "VendorLegitimateInterest";
        objArr[4] = "gdprApplies";
        objArr[5] = "EnableAdvertiserConsentMode";
        objArr[6] = "PolicyVersion";
        objArr[7] = "PurposeConsents";
        objArr[8] = "PurposeOneTreatment";
        objArr[9] = "Purpose1";
        objArr[10] = "Purpose3";
        objArr[11] = "Purpose4";
        System.arraycopy(new String[]{"Purpose7", "CmpSdkID", "PublisherCC", "PublisherRestrictions1", "PublisherRestrictions3", "PublisherRestrictions4", "PublisherRestrictions7", "AuthorizePurpose1", "AuthorizePurpose3", "AuthorizePurpose4", "AuthorizePurpose7", "PurposeDiagnostics"}, 0, objArr, 12, 12);
        o000O00.o00O0O0O.OooO0O0(24, objArr);
        f14724OooO00o = o0000Ooo.o00Oo00.OooOO0(24, objArr);
    }

    public static String OooO00o(SharedPreferences sharedPreferences, String str) {
        try {
            return sharedPreferences.getString(str, "");
        } catch (ClassCastException unused) {
            return "";
        }
    }

    public static int OooO0O0(SharedPreferences sharedPreferences, String str) {
        try {
            return sharedPreferences.getInt(str, -1);
        } catch (ClassCastException unused) {
            return -1;
        }
    }

    public static final boolean OooO0OO(com.google.android.gms.internal.measurement.o0oo0000 o0oo0000Var, o0000Ooo.o0O000 o0o000, o0000Ooo.o0O000 o0o0002, o0000Ooo.o0OoOoOo o0oooooo, char[] cArr, int i, int i2, int i3, String str, String str2, String str3, boolean z, boolean z2) {
        oOo0oooO ooo0oooo;
        char c;
        int iOooO0Oo = OooO0Oo(o0oo0000Var);
        if (iOooO0Oo > 0 && (i2 != 1 || i != 1)) {
            cArr[iOooO0Oo] = '2';
        }
        if (OooO0oo(o0oo0000Var, o0o0002) == com.google.android.gms.internal.measurement.ooo0Oo0.PURPOSE_RESTRICTION_NOT_ALLOWED) {
            c = '3';
        } else {
            if (o0oo0000Var == com.google.android.gms.internal.measurement.o0oo0000.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE && i3 == 1 && o0oooooo.f29555OooOoO0.equals(str)) {
                if (iOooO0Oo > 0 && cArr[iOooO0Oo] != '2') {
                    cArr[iOooO0Oo] = '1';
                }
                return true;
            }
            if (o0o000.containsKey(o0oo0000Var) && (ooo0oooo = (oOo0oooO) o0o000.get(o0oo0000Var)) != null) {
                int iOrdinal = ooo0oooo.ordinal();
                com.google.android.gms.internal.measurement.ooo0Oo0 ooo0oo0 = com.google.android.gms.internal.measurement.ooo0Oo0.PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST;
                if (iOrdinal != 0) {
                    com.google.android.gms.internal.measurement.ooo0Oo0 ooo0oo02 = com.google.android.gms.internal.measurement.ooo0Oo0.PURPOSE_RESTRICTION_REQUIRE_CONSENT;
                    if (iOrdinal != 1) {
                        if (iOrdinal == 2) {
                            return OooO0oo(o0oo0000Var, o0o0002) == ooo0oo0 ? OooO0oO(o0oo0000Var, cArr, str3, z2) : OooO0o(o0oo0000Var, cArr, str2, z);
                        }
                        if (iOrdinal == 3) {
                            return OooO0oo(o0oo0000Var, o0o0002) == ooo0oo02 ? OooO0o(o0oo0000Var, cArr, str2, z) : OooO0oO(o0oo0000Var, cArr, str3, z2);
                        }
                        c = '0';
                    } else if (OooO0oo(o0oo0000Var, o0o0002) != ooo0oo02) {
                        return OooO0oO(o0oo0000Var, cArr, str3, z2);
                    }
                } else if (OooO0oo(o0oo0000Var, o0o0002) != ooo0oo0) {
                    return OooO0o(o0oo0000Var, cArr, str2, z);
                }
                c = '8';
            } else {
                c = '0';
            }
        }
        if (iOooO0Oo <= 0 || cArr[iOooO0Oo] == '2') {
            return false;
        }
        cArr[iOooO0Oo] = c;
        return false;
    }

    public static final int OooO0Oo(com.google.android.gms.internal.measurement.o0oo0000 o0oo0000Var) {
        if (o0oo0000Var == com.google.android.gms.internal.measurement.o0oo0000.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE) {
            return 1;
        }
        if (o0oo0000Var == com.google.android.gms.internal.measurement.o0oo0000.IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_ADS_PROFILE) {
            return 2;
        }
        if (o0oo0000Var == com.google.android.gms.internal.measurement.o0oo0000.IAB_TCF_PURPOSE_SELECT_PERSONALISED_ADS) {
            return 3;
        }
        return o0oo0000Var == com.google.android.gms.internal.measurement.o0oo0000.IAB_TCF_PURPOSE_MEASURE_AD_PERFORMANCE ? 4 : -1;
    }

    public static final boolean OooO0o(com.google.android.gms.internal.measurement.o0oo0000 o0oo0000Var, char[] cArr, String str, boolean z) {
        char c;
        int iOooO0Oo = OooO0Oo(o0oo0000Var);
        if (!z) {
            c = '4';
        } else {
            if (str.length() >= o0oo0000Var.zza()) {
                char cCharAt = str.charAt(o0oo0000Var.zza() - 1);
                boolean z2 = cCharAt == '1';
                if (iOooO0Oo > 0 && cArr[iOooO0Oo] != '2') {
                    cArr[iOooO0Oo] = cCharAt != '1' ? '6' : '1';
                }
                return z2;
            }
            c = '0';
        }
        if (iOooO0Oo > 0 && cArr[iOooO0Oo] != '2') {
            cArr[iOooO0Oo] = c;
        }
        return false;
    }

    public static final String OooO0o0(com.google.android.gms.internal.measurement.o0oo0000 o0oo0000Var, String str, String str2) {
        String strValueOf = "0";
        String strValueOf2 = (TextUtils.isEmpty(str) || str.length() < o0oo0000Var.zza()) ? "0" : String.valueOf(str.charAt(o0oo0000Var.zza() - 1));
        if (!TextUtils.isEmpty(str2) && str2.length() >= o0oo0000Var.zza()) {
            strValueOf = String.valueOf(str2.charAt(o0oo0000Var.zza() - 1));
        }
        return String.valueOf(strValueOf2).concat(String.valueOf(strValueOf));
    }

    public static final boolean OooO0oO(com.google.android.gms.internal.measurement.o0oo0000 o0oo0000Var, char[] cArr, String str, boolean z) {
        char c;
        int iOooO0Oo = OooO0Oo(o0oo0000Var);
        if (!z) {
            c = '5';
        } else {
            if (str.length() >= o0oo0000Var.zza()) {
                char cCharAt = str.charAt(o0oo0000Var.zza() - 1);
                boolean z2 = cCharAt == '1';
                if (iOooO0Oo > 0 && cArr[iOooO0Oo] != '2') {
                    cArr[iOooO0Oo] = cCharAt != '1' ? '7' : '1';
                }
                return z2;
            }
            c = '0';
        }
        if (iOooO0Oo > 0 && cArr[iOooO0Oo] != '2') {
            cArr[iOooO0Oo] = c;
        }
        return false;
    }

    public static final com.google.android.gms.internal.measurement.ooo0Oo0 OooO0oo(com.google.android.gms.internal.measurement.o0oo0000 o0oo0000Var, o0000Ooo.o0O000 o0o000) {
        Object obj = com.google.android.gms.internal.measurement.ooo0Oo0.PURPOSE_RESTRICTION_UNDEFINED;
        Object obj2 = o0o000.get(o0oo0000Var);
        if (obj2 != null) {
            obj = obj2;
        }
        return (com.google.android.gms.internal.measurement.ooo0Oo0) obj;
    }
}
