package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* renamed from: com.google.android.gms.internal.ads.e7 */
/* loaded from: classes2.dex */
public final class C1521e7 {

    /* renamed from: OooO0O0, reason: collision with root package name */
    public static final C1521e7 f18507OooO0O0 = new C1521e7(0);

    /* renamed from: OooO0OO, reason: collision with root package name */
    public static final C1521e7 f18508OooO0OO = new C1521e7(1);

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public static final C1521e7 f18509OooO0Oo = new C1521e7(2);

    /* renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f18510OooO00o;

    public /* synthetic */ C1521e7(int i) {
        this.f18510OooO00o = i;
    }

    public static final String OooO0O0(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        int length = str.length();
        int i = 0;
        int i2 = 0;
        while (i2 < str.length() && str.charAt(i2) == ',') {
            i2++;
        }
        while (length > 0) {
            int i3 = length - 1;
            if (str.charAt(i3) != ',') {
                break;
            }
            length = i3;
        }
        if (length < i2) {
            return null;
        }
        if (i2 != 0) {
            i = i2;
        } else if (length == str.length()) {
            return str;
        }
        return str.substring(i, length);
    }

    public final String OooO00o(String str, String str2) {
        switch (this.f18510OooO00o) {
            case 0:
                return str2;
            case 1:
                return str != null ? str : str2;
            default:
                String strOooO0O0 = OooO0O0(str);
                String strOooO0O02 = OooO0O0(str2);
                return TextUtils.isEmpty(strOooO0O0) ? strOooO0O02 : TextUtils.isEmpty(strOooO0O02) ? strOooO0O0 : OooO0oO.OooOo.OooOoo(strOooO0O0, ",", strOooO0O02);
        }
    }
}
