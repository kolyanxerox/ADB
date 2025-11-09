package OoooOOO;

import Oooo00O.o000000O;
import com.google.android.gms.internal.measurement.oOO0Oo00;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* loaded from: classes2.dex */
public final class o00O0O00 {

    /* renamed from: OooO, reason: collision with root package name */
    public final com.google.android.gms.internal.measurement.ooOOOOoo f14111OooO;

    /* renamed from: OooO00o, reason: collision with root package name */
    public final String f14112OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final int f14113OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public Boolean f14114OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public Boolean f14115OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public Long f14116OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public Long f14117OooO0o0;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ int f14118OooO0oO;

    /* renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ o00O0O0 f14119OooO0oo;

    public o00O0O00(String str, int i) {
        this.f14112OooO00o = str;
        this.f14113OooO0O0 = i;
    }

    public static Boolean OooO0OO(Boolean bool, boolean z) {
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf(bool.booleanValue() != z);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static Boolean OooO0Oo(String str, com.google.android.gms.internal.measurement.o00O o00o, o0O0O0o0 o0o0o0o0) {
        List listOooOo0;
        o000000O.OooO0oo(o00o);
        if (str != null && o00o.OooOOOo() && o00o.OooOo() != 1 && (o00o.OooOo() != 7 ? o00o.OooOOo0() : o00o.OooOo0O() != 0)) {
            int iOooOo = o00o.OooOo();
            boolean zOooOo00 = o00o.OooOo00();
            String strOooOOo = (zOooOo00 || iOooOo == 2 || iOooOo == 7) ? o00o.OooOOo() : o00o.OooOOo().toUpperCase(Locale.ENGLISH);
            if (o00o.OooOo0O() == 0) {
                listOooOo0 = null;
            } else {
                listOooOo0 = o00o.OooOo0();
                if (!zOooOo00) {
                    ArrayList arrayList = new ArrayList(listOooOo0.size());
                    Iterator it = listOooOo0.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((String) it.next()).toUpperCase(Locale.ENGLISH));
                    }
                    listOooOo0 = Collections.unmodifiableList(arrayList);
                }
            }
            String str2 = iOooOo == 2 ? strOooOOo : null;
            if (iOooOo != 7 ? strOooOOo != null : listOooOo0 != null && !listOooOo0.isEmpty()) {
                if (!zOooOo00 && iOooOo != 2) {
                    str = str.toUpperCase(Locale.ENGLISH);
                }
                switch (iOooOo - 1) {
                    case 1:
                        if (str2 != null) {
                            try {
                                return Boolean.valueOf(Pattern.compile(str2, true != zOooOo00 ? 66 : 0).matcher(str).matches());
                            } catch (PatternSyntaxException unused) {
                                if (o0o0o0o0 != null) {
                                    o0o0o0o0.f14396OooOooO.OooO0OO(str2, "Invalid regular expression in REGEXP audience filter. expression");
                                    break;
                                }
                            }
                        }
                        break;
                    case 2:
                        return Boolean.valueOf(str.startsWith(strOooOOo));
                    case 3:
                        return Boolean.valueOf(str.endsWith(strOooOOo));
                    case 4:
                        return Boolean.valueOf(str.contains(strOooOOo));
                    case 5:
                        return Boolean.valueOf(str.equals(strOooOOo));
                    case 6:
                        if (listOooOo0 != null) {
                            return Boolean.valueOf(listOooOo0.contains(str));
                        }
                        break;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0107  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Boolean OooO0o(java.math.BigDecimal r8, com.google.android.gms.internal.measurement.o00O0OO r9, double r10) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: OoooOOO.o00O0O00.OooO0o(java.math.BigDecimal, com.google.android.gms.internal.measurement.o00O0OO, double):java.lang.Boolean");
    }

    public static Boolean OooO0o0(long j, com.google.android.gms.internal.measurement.o00O0OO o00o0oo) {
        try {
            return OooO0o(new BigDecimal(j), o00o0oo, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:56:0x016e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean OooO00o(java.lang.Long r19, java.lang.Long r20, com.google.android.gms.internal.measurement.o0O00OO r21, long r22, OoooOOO.o00OOO0O r24, boolean r25) {
        /*
            Method dump skipped, instructions count: 1015
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: OoooOOO.o00O0O00.OooO00o(java.lang.Long, java.lang.Long, com.google.android.gms.internal.measurement.o0O00OO, long, OoooOOO.o00OOO0O, boolean):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean OooO0O0(Long l, Long l2, com.google.android.gms.internal.measurement.o0oOo0O0 o0ooo0o0, boolean z) {
        oOO0Oo00.OooO00o();
        o0OO0oO0 o0oo0oo0 = (o0OO0oO0) this.f14119OooO0oo.f14574OooOo0O;
        boolean zOooOo0 = o0oo0oo0.f14519OooOoO0.OooOo0(this.f14112OooO00o, o0O000O.f14285o000000);
        com.google.android.gms.internal.measurement.oo0oOO0 oo0ooo0 = (com.google.android.gms.internal.measurement.oo0oOO0) this.f14111OooO;
        boolean zOooOo00 = oo0ooo0.OooOo00();
        boolean zOooOo02 = oo0ooo0.OooOo0();
        boolean zOooOo0o = oo0ooo0.OooOo0o();
        byte b = zOooOo00 || zOooOo02 || zOooOo0o;
        Boolean boolOooO0OO = null;
        boolOooO0o = null;
        Boolean boolOooO0o = null;
        boolOooO0OO = null;
        boolOooO0OO = null;
        boolOooO0OO = null;
        Boolean boolOooO0o2 = null;
        boolOooO0OO = null;
        o0O0O0o0 o0o0o0o0 = o0oo0oo0.f14520OooOoOO;
        if (z && b != true) {
            o0OO0oO0.OooOOO0(o0o0o0o0);
            o0o0o0o0.f14398Oooo0.OooO0Oo(Integer.valueOf(this.f14113OooO0O0), "Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", oo0ooo0.OooOOOo() ? Integer.valueOf(oo0ooo0.OooOOo0()) : null);
            return true;
        }
        com.google.android.gms.internal.measurement.o00O0O0O o00o0o0oOooOOoo = oo0ooo0.OooOOoo();
        boolean zOooOo03 = o00o0o0oOooOOoo.OooOo0();
        boolean zOooOo04 = o0ooo0o0.OooOo0();
        o0O00o00 o0o00o00 = o0oo0oo0.f14524OooOooo;
        if (zOooOo04) {
            if (o00o0o0oOooOOoo.OooOOo()) {
                boolOooO0OO = OooO0OO(OooO0o0(o0ooo0o0.OooOo0O(), o00o0o0oOooOOoo.OooOOoo()), zOooOo03);
            } else {
                o0OO0oO0.OooOOO0(o0o0o0o0);
                o0o0o0o0.f14396OooOooO.OooO0OO(o0o00o00.OooO0OO(o0ooo0o0.OooOOo()), "No number filter for long property. property");
            }
        } else if (o0ooo0o0.OooOoO0()) {
            if (o00o0o0oOooOOoo.OooOOo()) {
                double dOooOoO = o0ooo0o0.OooOoO();
                try {
                    boolOooO0o = OooO0o(new BigDecimal(dOooOoO), o00o0o0oOooOOoo.OooOOoo(), Math.ulp(dOooOoO));
                } catch (NumberFormatException unused) {
                }
                boolOooO0OO = OooO0OO(boolOooO0o, zOooOo03);
            } else {
                o0OO0oO0.OooOOO0(o0o0o0o0);
                o0o0o0o0.f14396OooOooO.OooO0OO(o0o00o00.OooO0OO(o0ooo0o0.OooOOo()), "No number filter for double property. property");
            }
        } else if (!o0ooo0o0.OooOOoo()) {
            o0OO0oO0.OooOOO0(o0o0o0o0);
            o0o0o0o0.f14396OooOooO.OooO0OO(o0o00o00.OooO0OO(o0ooo0o0.OooOOo()), "User property has no value, property");
        } else if (o00o0o0oOooOOoo.OooOOOo()) {
            String strOooOo00 = o0ooo0o0.OooOo00();
            com.google.android.gms.internal.measurement.o00O o00oOooOOo0 = o00o0o0oOooOOoo.OooOOo0();
            o0OO0oO0.OooOOO0(o0o0o0o0);
            boolOooO0OO = OooO0OO(OooO0Oo(strOooOo00, o00oOooOOo0, o0o0o0o0), zOooOo03);
        } else if (!o00o0o0oOooOOoo.OooOOo()) {
            o0OO0oO0.OooOOO0(o0o0o0o0);
            o0o0o0o0.f14396OooOooO.OooO0OO(o0o00o00.OooO0OO(o0ooo0o0.OooOOo()), "No string or number filter defined. property");
        } else if (oo0OOoo.OoooO00(o0ooo0o0.OooOo00())) {
            String strOooOo002 = o0ooo0o0.OooOo00();
            com.google.android.gms.internal.measurement.o00O0OO o00o0ooOooOOoo = o00o0o0oOooOOoo.OooOOoo();
            if (oo0OOoo.OoooO00(strOooOo002)) {
                try {
                    boolOooO0o2 = OooO0o(new BigDecimal(strOooOo002), o00o0ooOooOOoo, 0.0d);
                } catch (NumberFormatException unused2) {
                }
            }
            boolOooO0OO = OooO0OO(boolOooO0o2, zOooOo03);
        } else {
            o0OO0oO0.OooOOO0(o0o0o0o0);
            o0o0o0o0.f14396OooOooO.OooO0Oo(o0o00o00.OooO0OO(o0ooo0o0.OooOOo()), "Invalid user property value for Numeric number filter. property, value", o0ooo0o0.OooOo00());
        }
        o0OO0oO0.OooOOO0(o0o0o0o0);
        o0o0o0o0.f14398Oooo0.OooO0OO(boolOooO0OO == null ? "null" : boolOooO0OO, "Property filter result");
        if (boolOooO0OO == null) {
            return false;
        }
        this.f14114OooO0OO = Boolean.TRUE;
        if (!zOooOo0o || boolOooO0OO.booleanValue()) {
            if (!z || oo0ooo0.OooOo00()) {
                this.f14115OooO0Oo = boolOooO0OO;
            }
            if (boolOooO0OO.booleanValue() && b != false && o0ooo0o0.OooOOOo()) {
                long jOooOOo0 = o0ooo0o0.OooOOo0();
                if (l != null) {
                    jOooOOo0 = l.longValue();
                }
                if (zOooOo0 && oo0ooo0.OooOo00() && !oo0ooo0.OooOo0() && l2 != null) {
                    jOooOOo0 = l2.longValue();
                }
                if (oo0ooo0.OooOo0()) {
                    this.f14116OooO0o = Long.valueOf(jOooOOo0);
                } else {
                    this.f14117OooO0o0 = Long.valueOf(jOooOOo0);
                }
            }
        }
        return true;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public o00O0O00(o00O0O0 o00o0o0, String str, int i, com.google.android.gms.internal.measurement.o00O0O00 o00o0o00) {
        this(str, i);
        this.f14118OooO0oO = 0;
        Objects.requireNonNull(o00o0o0);
        this.f14119OooO0oo = o00o0o0;
        this.f14111OooO = o00o0o00;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public o00O0O00(o00O0O0 o00o0o0, String str, int i, com.google.android.gms.internal.measurement.oo0oOO0 oo0ooo0) {
        this(str, i);
        this.f14118OooO0oO = 1;
        Objects.requireNonNull(o00o0o0);
        this.f14119OooO0oo = o00o0o0;
        this.f14111OooO = oo0ooo0;
    }
}
