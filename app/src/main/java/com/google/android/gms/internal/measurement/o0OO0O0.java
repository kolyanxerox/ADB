package com.google.android.gms.internal.measurement;

import android.os.UserManager;
import com.google.android.gms.internal.ads.C2051sk;
import java.io.Closeable;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class o0OO0O0 {

    /* renamed from: OooO00o */
    public static UserManager f26544OooO00o = null;

    /* renamed from: OooO0O0 */
    public static volatile boolean f26545OooO0O0 = false;

    public static void OooO00o(Throwable th, Throwable exception) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        kotlin.jvm.internal.OooOo.OooO0o0(th, "<this>");
        kotlin.jvm.internal.OooOo.OooO0o0(exception, "exception");
        if (th != exception) {
            Integer num = o00O0OOO.OooO00o.f31378OooO00o;
            if (num == null || num.intValue() >= 19) {
                th.addSuppressed(exception);
                return;
            }
            Method method = o00O0OO.OooO00o.f31371OooO00o;
            if (method != null) {
                method.invoke(th, exception);
            }
        }
    }

    public static String OooO0O0(int i, int i2, String str) {
        if (i < 0) {
            return o0OOO0.OooO("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return o0OOO0.OooO("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        StringBuilder sb = new StringBuilder(26);
        sb.append("negative size: ");
        sb.append(i2);
        throw new IllegalArgumentException(sb.toString());
    }

    public static o00O0O00.OooO0OO OooO0OO(o00O0O00.OooO0OO oooO0OO) {
        oooO0OO.OooOO0o();
        oooO0OO.f31330OooOo = true;
        return oooO0OO.f31332OooOo0o > 0 ? oooO0OO : o00O0O00.OooO0OO.f31329OooOoO0;
    }

    public static void OooO0Oo(int i, int i2) {
        String strOooO;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                strOooO = o0OOO0.OooO("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    StringBuilder sb = new StringBuilder(26);
                    sb.append("negative size: ");
                    sb.append(i2);
                    throw new IllegalArgumentException(sb.toString());
                }
                strOooO = o0OOO0.OooO("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(strOooO);
        }
    }

    public static void OooO0o(int i, String str) {
        if (i >= 0) {
            return;
        }
        StringBuilder sb = new StringBuilder(str.length() + 40);
        sb.append(str);
        sb.append(" cannot be negative but was: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    public static void OooO0o0(Object obj, Object obj2) {
        if (obj == null) {
            String strValueOf = String.valueOf(obj2);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 24);
            sb.append("null key in entry: null=");
            sb.append(strValueOf);
            throw new NullPointerException(sb.toString());
        }
        if (obj2 != null) {
            return;
        }
        String strValueOf2 = String.valueOf(obj);
        StringBuilder sb2 = new StringBuilder(strValueOf2.length() + 26);
        sb2.append("null value in entry: ");
        sb2.append(strValueOf2);
        sb2.append("=null");
        throw new NullPointerException(sb2.toString());
    }

    public static void OooO0oO(int i, int i2) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(OooO0O0(i, i2, "index"));
        }
    }

    public static void OooO0oo(int i, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > i3) {
            throw new IndexOutOfBoundsException((i < 0 || i > i3) ? OooO0O0(i, i3, "start index") : (i2 < 0 || i2 > i3) ? OooO0O0(i2, i3, "end index") : o0OOO0.OooO("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i)));
        }
    }

    public static final void OooOO0(Closeable closeable, Throwable th) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                OooO00o(th, th2);
            }
        }
    }

    public static final long OooOO0O(long j) {
        if (j < 0) {
            int i = o00O0oOO.OooOO0O.f31462OooOoO0;
            return o00O0oOO.OooOO0O.f31460OooOo;
        }
        int i2 = o00O0oOO.OooOO0O.f31462OooOoO0;
        return o00O0oOO.OooOO0O.f31461OooOo0o;
    }

    public static List OooOO0o(Object obj) {
        List listSingletonList = Collections.singletonList(obj);
        kotlin.jvm.internal.OooOo.OooO0Oo(listSingletonList, "singletonList(...)");
        return listSingletonList;
    }

    public static int OooOOO(int i) {
        int[] iArr = {1, 2, 3, 4, 5, 6};
        for (int i2 = 0; i2 < 6; i2++) {
            int i3 = iArr[i2];
            int i4 = i3 - 1;
            if (i3 == 0) {
                throw null;
            }
            if (i4 == i) {
                return i3;
            }
        }
        return 1;
    }

    public static final long OooOOO0(long j, long j2, o00O0oOO.OooOOO oooOOO) {
        long j3 = j - j2;
        if (((j3 ^ j) & (~(j3 ^ j2))) >= 0) {
            return Oooo0oO.o00000.OooOOO0(j3, oooOOO);
        }
        o00O0oOO.OooOOO oooOOO2 = o00O0oOO.OooOOO.f31464OooOo;
        if (oooOOO.compareTo(oooOOO2) >= 0) {
            return o00O0oOO.OooOO0O.OooO(OooOO0O(j3));
        }
        long jOooO0Oo = o0OO00OO.OooO0Oo(1L, oooOOO2, oooOOO);
        long j4 = (j / jOooO0Oo) - (j2 / jOooO0Oo);
        long j5 = (j % jOooO0Oo) - (j2 % jOooO0Oo);
        int i = o00O0oOO.OooOO0O.f31462OooOoO0;
        return o00O0oOO.OooOO0O.OooO0o(Oooo0oO.o00000.OooOOO0(j4, oooOOO2), Oooo0oO.o00000.OooOOO0(j5, oooOOO));
    }

    public static Oooo0 OooOOOO(OooO0o oooO0o, C2051sk c2051sk, ArrayList arrayList, boolean z) {
        Oooo0 oooo0OooO00o;
        o00O0.o000OOo.OooOOOO("reduce", arrayList, 1);
        o00O0.o000OOo.OooOOOo(2, "reduce", arrayList);
        Oooo0 oooo0OooO0OO = ((oo000o) c2051sk.f24096OooOo).OooO0OO(c2051sk, (Oooo0) arrayList.get(0));
        if (!(oooo0OooO0OO instanceof OooOOO0)) {
            throw new IllegalArgumentException("Callback should be a method");
        }
        if (arrayList.size() == 2) {
            oooo0OooO00o = ((oo000o) c2051sk.f24096OooOo).OooO0OO(c2051sk, (Oooo0) arrayList.get(1));
            if (oooo0OooO00o instanceof OooOO0) {
                throw new IllegalArgumentException("Failed to parse initial value");
            }
        } else {
            if (oooO0o.OooOO0() == 0) {
                throw new IllegalStateException("Empty array with no initial value error");
            }
            oooo0OooO00o = null;
        }
        OooOOO0 oooOOO0 = (OooOOO0) oooo0OooO0OO;
        int iOooOO0 = oooO0o.OooOO0();
        int i = z ? 0 : iOooOO0 - 1;
        int i2 = z ? iOooOO0 - 1 : 0;
        int i3 = true == z ? 1 : -1;
        if (oooo0OooO00o == null) {
            oooo0OooO00o = oooO0o.OooOO0O(i);
            i += i3;
        }
        while ((i2 - i) * i3 >= 0) {
            if (oooO0o.OooOOO0(i)) {
                oooo0OooO00o = oooOOO0.OooO00o(c2051sk, Arrays.asList(oooo0OooO00o, oooO0o.OooOO0O(i), new OooOO0O(Double.valueOf(i)), oooO0o));
                if (oooo0OooO00o instanceof OooOO0) {
                    throw new IllegalStateException("Reduce operation failed");
                }
                i += i3;
            } else {
                i += i3;
            }
        }
        return oooo0OooO00o;
    }

    public static OooO0o OooOOOo(OooO0o oooO0o, C2051sk c2051sk, Oooo000 oooo000, Boolean bool, Boolean bool2) {
        OooO0o oooO0o2 = new OooO0o();
        Iterator itOooO = oooO0o.OooO();
        while (itOooO.hasNext()) {
            int iIntValue = ((Integer) itOooO.next()).intValue();
            if (oooO0o.OooOOO0(iIntValue)) {
                Oooo0 oooo0OooO00o = oooo000.OooO00o(c2051sk, Arrays.asList(oooO0o.OooOO0O(iIntValue), new OooOO0O(Double.valueOf(iIntValue)), oooO0o));
                if (oooo0OooO00o.zze().equals(bool)) {
                    break;
                }
                if (bool2 == null || oooo0OooO00o.zze().equals(bool2)) {
                    oooO0o2.OooOO0o(iIntValue, oooo0OooO00o);
                }
            }
        }
        return oooO0o2;
    }

    public abstract List OooO(List list, String str);
}
