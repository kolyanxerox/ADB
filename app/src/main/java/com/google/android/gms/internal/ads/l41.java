package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;

/* loaded from: classes2.dex */
public final class l41 extends AbstractC1632h7 {

    /* renamed from: OooOo */
    public final int f20796OooOo;

    /* renamed from: OooOoO */
    public final int f20797OooOoO;

    /* renamed from: OooOoO0 */
    public final String f20798OooOoO0;

    /* renamed from: OooOoOO */
    public final o0OoOo0 f20799OooOoOO;

    /* renamed from: OooOoo */
    public final h91 f20800OooOoo;

    /* renamed from: OooOoo0 */
    public final int f20801OooOoo0;

    /* renamed from: OooOooO */
    public final boolean f20802OooOooO;

    static {
        Integer.toString(1001, 36);
        Integer.toString(1002, 36);
        Integer.toString(1003, 36);
        Integer.toString(1004, 36);
        Integer.toString(1005, 36);
        Integer.toString(1006, 36);
    }

    public l41(int i, int i2, Exception exc) {
        this(i, exc, i2, null, -1, null, 4, false);
    }

    public final l41 OooO00o(h91 h91Var) {
        String message = getMessage();
        int i = i80.f19994OooO00o;
        return new l41(message, getCause(), this.f19582OooOo0O, this.f20796OooOo, this.f20798OooOoO0, this.f20797OooOoO, this.f20799OooOoOO, this.f20801OooOoo0, h91Var, this.f19583OooOo0o, this.f20802OooOooO);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public l41(int i, Exception exc, int i2, String str, int i3, o0OoOo0 o0oooo0, int i4, boolean z) {
        String str2;
        int i5;
        String strOooOOOo;
        String str3;
        if (i == 0) {
            str2 = str;
            i5 = i3;
            strOooOOOo = "Source error";
        } else if (i != 1) {
            strOooOOOo = "Unexpected runtime error";
            str2 = str;
            i5 = i3;
        } else {
            String strValueOf = String.valueOf(o0oooo0);
            int i6 = i80.f19994OooO00o;
            if (i4 == 0) {
                str3 = "NO";
            } else if (i4 == 1) {
                str3 = "NO_UNSUPPORTED_TYPE";
            } else if (i4 == 2) {
                str3 = "NO_UNSUPPORTED_DRM";
            } else if (i4 == 3) {
                str3 = "NO_EXCEEDS_CAPABILITIES";
            } else {
                if (i4 != 4) {
                    throw new IllegalStateException();
                }
                str3 = "YES";
            }
            StringBuilder sb = new StringBuilder();
            str2 = str;
            sb.append(str2);
            sb.append(" error, index=");
            i5 = i3;
            sb.append(i5);
            sb.append(", format=");
            sb.append(strValueOf);
            strOooOOOo = OooO0oO.OooOo.OooOOOo(sb, ", format_supported=", str3);
        }
        this(TextUtils.isEmpty(null) ? strOooOOOo : strOooOOOo.concat(": null"), exc, i2, i, str2, i5, o0oooo0, i4, null, SystemClock.elapsedRealtime(), z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l41(String str, Throwable th, int i, int i2, String str2, int i3, o0OoOo0 o0oooo0, int i4, h91 h91Var, long j, boolean z) {
        int i5;
        boolean z2;
        super(str, th, i, j);
        Bundle bundle = Bundle.EMPTY;
        if (!z) {
            i5 = i2;
            z2 = true;
        } else if (i2 == 1) {
            i5 = 1;
            z2 = true;
        } else {
            i5 = i2;
            z2 = false;
        }
        af0.OoooO0(z2);
        af0.OoooO0(th != null);
        this.f20796OooOo = i5;
        this.f20798OooOoO0 = str2;
        this.f20797OooOoO = i3;
        this.f20799OooOoOO = o0oooo0;
        this.f20801OooOoo0 = i4;
        this.f20800OooOoo = h91Var;
        this.f20802OooOooO = z;
    }
}
