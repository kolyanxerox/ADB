package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.MissingResourceException;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class o0OoOo0 {

    /* renamed from: Oooo0OO */
    public static final /* synthetic */ int f22209Oooo0OO = 0;

    /* renamed from: OooO */
    public final int f22210OooO;

    /* renamed from: OooO00o */
    public final String f22211OooO00o;

    /* renamed from: OooO0O0 */
    public final String f22212OooO0O0;

    /* renamed from: OooO0OO */
    public final rm0 f22213OooO0OO;

    /* renamed from: OooO0Oo */
    public final String f22214OooO0Oo;

    /* renamed from: OooO0o */
    public final int f22215OooO0o;

    /* renamed from: OooO0o0 */
    public final int f22216OooO0o0;

    /* renamed from: OooO0oO */
    public final int f22217OooO0oO;

    /* renamed from: OooO0oo */
    public final int f22218OooO0oo;

    /* renamed from: OooOO0 */
    public final String f22219OooOO0;

    /* renamed from: OooOO0O */
    public final C2107u2 f22220OooOO0O;
    public final String OooOO0o;

    /* renamed from: OooOOO */
    public final int f22221OooOOO;

    /* renamed from: OooOOO0 */
    public final String f22222OooOOO0;

    /* renamed from: OooOOOO */
    public final int f22223OooOOOO;

    /* renamed from: OooOOOo */
    public final List f22224OooOOOo;

    /* renamed from: OooOOo */
    public final long f22225OooOOo;

    /* renamed from: OooOOo0 */
    public final b91 f22226OooOOo0;

    /* renamed from: OooOOoo */
    public final boolean f22227OooOOoo;

    /* renamed from: OooOo */
    public final float f22228OooOo;
    public final int OooOo0;

    /* renamed from: OooOo00 */
    public final int f22229OooOo00;

    /* renamed from: OooOo0O */
    public final float f22230OooOo0O;

    /* renamed from: OooOo0o */
    public final int f22231OooOo0o;

    /* renamed from: OooOoO */
    public final int f22232OooOoO;

    /* renamed from: OooOoO0 */
    public final byte[] f22233OooOoO0;

    /* renamed from: OooOoOO */
    public final z41 f22234OooOoOO;

    /* renamed from: OooOoo */
    public final int f22235OooOoo;

    /* renamed from: OooOoo0 */
    public final int f22236OooOoo0;

    /* renamed from: OooOooO */
    public final int f22237OooOooO;

    /* renamed from: OooOooo */
    public final int f22238OooOooo;

    /* renamed from: Oooo0 */
    public final int f22239Oooo0;

    /* renamed from: Oooo000 */
    public final int f22240Oooo000;

    /* renamed from: Oooo00O */
    public final int f22241Oooo00O;

    /* renamed from: Oooo00o */
    public final int f22242Oooo00o;

    /* renamed from: Oooo0O0 */
    public int f22243Oooo0O0;

    static {
        new o0OoOo0(new jb1());
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
        Integer.toString(7, 36);
        Integer.toString(8, 36);
        Integer.toString(9, 36);
        Integer.toString(10, 36);
        Integer.toString(11, 36);
        Integer.toString(12, 36);
        Integer.toString(13, 36);
        Integer.toString(14, 36);
        Integer.toString(15, 36);
        Integer.toString(16, 36);
        Integer.toString(17, 36);
        Integer.toString(18, 36);
        Integer.toString(19, 36);
        Integer.toString(20, 36);
        Integer.toString(21, 36);
        Integer.toString(22, 36);
        Integer.toString(23, 36);
        Integer.toString(24, 36);
        Integer.toString(25, 36);
        Integer.toString(26, 36);
        Integer.toString(27, 36);
        Integer.toString(28, 36);
        Integer.toString(29, 36);
        Integer.toString(30, 36);
        Integer.toString(31, 36);
        Integer.toString(32, 36);
        Integer.toString(33, 36);
    }

    public o0OoOo0(jb1 jb1Var) throws MissingResourceException {
        boolean z;
        String str;
        this.f22211OooO00o = jb1Var.f20241OooO00o;
        String strOooO00o = i80.OooO00o(jb1Var.f20244OooO0Oo);
        this.f22214OooO0Oo = strOooO00o;
        if (jb1Var.f20243OooO0OO.isEmpty() && jb1Var.f20242OooO0O0 != null) {
            this.f22213OooO0OO = rm0.OooOOo0(new o0000O0O(strOooO00o, jb1Var.f20242OooO0O0));
            this.f22212OooO0O0 = jb1Var.f20242OooO0O0;
        } else if (!jb1Var.f20243OooO0OO.isEmpty() && jb1Var.f20242OooO0O0 == null) {
            rm0 rm0Var = jb1Var.f20243OooO0OO;
            this.f22213OooO0OO = rm0Var;
            Iterator it = rm0Var.iterator();
            while (true) {
                pm0 pm0Var = (pm0) it;
                if (!pm0Var.hasNext()) {
                    str = ((o0000O0O) rm0Var.get(0)).f21670OooO0O0;
                    break;
                }
                o0000O0O o0000o0o2 = (o0000O0O) pm0Var.next();
                if (TextUtils.equals(o0000o0o2.f21669OooO00o, strOooO00o)) {
                    str = o0000o0o2.f21670OooO0O0;
                    break;
                }
            }
            this.f22212OooO0O0 = str;
        } else if (jb1Var.f20243OooO0OO.isEmpty() && jb1Var.f20242OooO0O0 == null) {
            z = true;
            af0.OooooO0(z);
            this.f22213OooO0OO = jb1Var.f20243OooO0OO;
            this.f22212OooO0O0 = jb1Var.f20242OooO0O0;
        } else {
            for (int i = 0; i < jb1Var.f20243OooO0OO.size(); i++) {
                if (((o0000O0O) jb1Var.f20243OooO0OO.get(i)).f21670OooO0O0.equals(jb1Var.f20242OooO0O0)) {
                    z = true;
                    break;
                }
            }
            z = false;
            af0.OooooO0(z);
            this.f22213OooO0OO = jb1Var.f20243OooO0OO;
            this.f22212OooO0O0 = jb1Var.f20242OooO0O0;
        }
        this.f22216OooO0o0 = jb1Var.f20246OooO0o0;
        this.f22215OooO0o = jb1Var.f20245OooO0o;
        int i2 = jb1Var.f20247OooO0oO;
        this.f22217OooO0oO = i2;
        int i3 = jb1Var.f20248OooO0oo;
        this.f22218OooO0oo = i3;
        this.f22210OooO = i3 != -1 ? i3 : i2;
        this.f22219OooOO0 = jb1Var.f20240OooO;
        this.f22220OooOO0O = jb1Var.f20249OooOO0;
        this.OooOO0o = jb1Var.f20250OooOO0O;
        this.f22222OooOOO0 = jb1Var.OooOO0o;
        this.f22221OooOOO = jb1Var.f20252OooOOO0;
        this.f22223OooOOOO = jb1Var.f20251OooOOO;
        List list = jb1Var.f20253OooOOOO;
        this.f22224OooOOOo = list == null ? Collections.EMPTY_LIST : list;
        b91 b91Var = jb1Var.f20254OooOOOo;
        this.f22226OooOOo0 = b91Var;
        this.f22225OooOOo = jb1Var.f20256OooOOo0;
        this.f22227OooOOoo = jb1Var.f20255OooOOo;
        this.f22229OooOo00 = jb1Var.f20257OooOOoo;
        this.OooOo0 = jb1Var.f20259OooOo00;
        this.f22230OooOo0O = jb1Var.OooOo0;
        int i4 = jb1Var.f20260OooOo0O;
        this.f22231OooOo0o = i4 == -1 ? 0 : i4;
        float f = jb1Var.f20261OooOo0o;
        this.f22228OooOo = f == -1.0f ? 1.0f : f;
        this.f22233OooOoO0 = jb1Var.f20258OooOo;
        this.f22232OooOoO = jb1Var.f20263OooOoO0;
        this.f22234OooOoOO = jb1Var.f20262OooOoO;
        this.f22236OooOoo0 = jb1Var.f20264OooOoOO;
        this.f22235OooOoo = jb1Var.f20266OooOoo0;
        this.f22237OooOooO = jb1Var.f20265OooOoo;
        int i5 = jb1Var.f20267OooOooO;
        this.f22238OooOooo = i5 == -1 ? 0 : i5;
        int i6 = jb1Var.f20268OooOooo;
        this.f22240Oooo000 = i6 != -1 ? i6 : 0;
        this.f22241Oooo00O = jb1Var.f20269Oooo000;
        this.f22242Oooo00o = jb1Var.f20270Oooo00O;
        int i7 = jb1Var.f20271Oooo00o;
        if (i7 != 0 || b91Var == null) {
            this.f22239Oooo0 = i7;
        } else {
            this.f22239Oooo0 = 1;
        }
    }

    public final jb1 OooO00o() {
        return new jb1(this);
    }

    public final boolean OooO0O0(o0OoOo0 o0oooo0) {
        List list = this.f22224OooOOOo;
        if (list.size() != o0oooo0.f22224OooOOOo.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!Arrays.equals((byte[]) list.get(i), (byte[]) o0oooo0.f22224OooOOOo.get(i))) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj == null || o0OoOo0.class != obj.getClass()) {
            return false;
        }
        o0OoOo0 o0oooo0 = (o0OoOo0) obj;
        int i2 = this.f22243Oooo0O0;
        return (i2 == 0 || (i = o0oooo0.f22243Oooo0O0) == 0 || i2 == i) && this.f22216OooO0o0 == o0oooo0.f22216OooO0o0 && this.f22215OooO0o == o0oooo0.f22215OooO0o && this.f22217OooO0oO == o0oooo0.f22217OooO0oO && this.f22218OooO0oo == o0oooo0.f22218OooO0oo && this.f22221OooOOO == o0oooo0.f22221OooOOO && this.f22225OooOOo == o0oooo0.f22225OooOOo && this.f22229OooOo00 == o0oooo0.f22229OooOo00 && this.OooOo0 == o0oooo0.OooOo0 && this.f22231OooOo0o == o0oooo0.f22231OooOo0o && this.f22232OooOoO == o0oooo0.f22232OooOoO && this.f22236OooOoo0 == o0oooo0.f22236OooOoo0 && this.f22235OooOoo == o0oooo0.f22235OooOoo && this.f22237OooOooO == o0oooo0.f22237OooOooO && this.f22238OooOooo == o0oooo0.f22238OooOooo && this.f22240Oooo000 == o0oooo0.f22240Oooo000 && this.f22241Oooo00O == o0oooo0.f22241Oooo00O && this.f22239Oooo0 == o0oooo0.f22239Oooo0 && Float.compare(this.f22230OooOo0O, o0oooo0.f22230OooOo0O) == 0 && Float.compare(this.f22228OooOo, o0oooo0.f22228OooOo) == 0 && Objects.equals(this.f22211OooO00o, o0oooo0.f22211OooO00o) && Objects.equals(this.f22212OooO0O0, o0oooo0.f22212OooO0O0) && this.f22213OooO0OO.equals(o0oooo0.f22213OooO0OO) && Objects.equals(this.f22219OooOO0, o0oooo0.f22219OooOO0) && Objects.equals(this.OooOO0o, o0oooo0.OooOO0o) && Objects.equals(this.f22222OooOOO0, o0oooo0.f22222OooOOO0) && Objects.equals(this.f22214OooO0Oo, o0oooo0.f22214OooO0Oo) && Arrays.equals(this.f22233OooOoO0, o0oooo0.f22233OooOoO0) && Objects.equals(this.f22220OooOO0O, o0oooo0.f22220OooOO0O) && Objects.equals(this.f22234OooOoOO, o0oooo0.f22234OooOoOO) && Objects.equals(this.f22226OooOOo0, o0oooo0.f22226OooOOo0) && OooO0O0(o0oooo0);
    }

    public final int hashCode() {
        int i = this.f22243Oooo0O0;
        if (i != 0) {
            return i;
        }
        String str = this.f22211OooO00o;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.f22212OooO0O0;
        int iHashCode2 = this.f22213OooO0OO.hashCode() + ((((iHashCode + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + (str2 == null ? 0 : str2.hashCode())) * 31);
        String str3 = this.f22214OooO0Oo;
        int iHashCode3 = ((((((((((iHashCode2 * 31) + (str3 == null ? 0 : str3.hashCode())) * 31) + this.f22216OooO0o0) * 31) + this.f22215OooO0o) * 961) + this.f22217OooO0oO) * 31) + this.f22218OooO0oo) * 31;
        String str4 = this.f22219OooOO0;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        C2107u2 c2107u2 = this.f22220OooOO0O;
        int iHashCode5 = (iHashCode4 + (c2107u2 == null ? 0 : c2107u2.hashCode())) * 961;
        String str5 = this.OooOO0o;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        int iFloatToIntBits = ((((((((((((((((((((Float.floatToIntBits(this.f22228OooOo) + ((((Float.floatToIntBits(this.f22230OooOo0O) + ((((((((((iHashCode6 + (this.f22222OooOOO0 != null ? r1.hashCode() : 0)) * 31) + this.f22221OooOOO) * 31) + ((int) this.f22225OooOOo)) * 31) + this.f22229OooOo00) * 31) + this.OooOo0) * 31)) * 31) + this.f22231OooOo0o) * 31)) * 31) + this.f22232OooOoO) * 31) + this.f22236OooOoo0) * 31) + this.f22235OooOoo) * 31) + this.f22237OooOooO) * 31) + this.f22238OooOooo) * 31) + this.f22240Oooo000) * 31) + this.f22241Oooo00O) * 31) - 1) * 31) - 1) * 31) + this.f22239Oooo0;
        this.f22243Oooo0O0 = iFloatToIntBits;
        return iFloatToIntBits;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f22234OooOoOO);
        StringBuilder sb = new StringBuilder("Format(");
        sb.append(this.f22211OooO00o);
        sb.append(", ");
        sb.append(this.f22212OooO0O0);
        sb.append(", ");
        sb.append(this.OooOO0o);
        sb.append(", ");
        sb.append(this.f22222OooOOO0);
        sb.append(", ");
        sb.append(this.f22219OooOO0);
        sb.append(", ");
        sb.append(this.f22210OooO);
        sb.append(", ");
        sb.append(this.f22214OooO0Oo);
        sb.append(", [");
        sb.append(this.f22229OooOo00);
        sb.append(", ");
        sb.append(this.OooOo0);
        sb.append(", ");
        sb.append(this.f22230OooOo0O);
        sb.append(", ");
        sb.append(strValueOf);
        sb.append("], [");
        sb.append(this.f22236OooOoo0);
        sb.append(", ");
        return OooO0oO.OooOo.OooOOO(sb, this.f22235OooOoo, "])");
    }
}
