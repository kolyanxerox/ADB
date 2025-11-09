package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class h11 {

    /* renamed from: OooO00o */
    public static final o0O f19523OooO00o;

    static {
        a11 a11Var = a11.f16875OooO0OO;
        f19523OooO00o = new o0O(6);
    }

    public static int OooO(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof a01)) {
            int iO00oO0o = 0;
            while (i < size) {
                iO00oO0o += rz0.o00oO0o(((Integer) list.get(i)).intValue());
                i++;
            }
            return iO00oO0o;
        }
        a01 a01Var = (a01) list;
        int iO00oO0o2 = 0;
        while (i < size) {
            iO00oO0o2 += rz0.o00oO0o(a01Var.OooO0o0(i));
            i++;
        }
        return iO00oO0o2;
    }

    public static void OooO00o(int i, List list, rh0 rh0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        rh0Var.getClass();
        boolean z2 = list instanceof p01;
        int i2 = 0;
        rz0 rz0Var = (rz0) rh0Var.f23865OooOo0O;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    rz0Var.o00000O(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            rz0Var.o000000o(i, 2);
            int iO00oO0o = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iO00oO0o += rz0.o00oO0o(((Long) list.get(i3)).longValue());
            }
            rz0Var.o00000O0(iO00oO0o);
            while (i2 < list.size()) {
                rz0Var.o00000OO(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        p01 p01Var = (p01) list;
        if (!z) {
            while (i2 < p01Var.f23172OooOo) {
                rz0Var.o00000O(i, p01Var.OooO0o0(i2));
                i2++;
            }
            return;
        }
        rz0Var.o000000o(i, 2);
        int iO00oO0o2 = 0;
        for (int i4 = 0; i4 < p01Var.f23172OooOo; i4++) {
            iO00oO0o2 += rz0.o00oO0o(p01Var.OooO0o0(i4));
        }
        rz0Var.o00000O0(iO00oO0o2);
        while (i2 < p01Var.f23172OooOo) {
            rz0Var.o00000OO(p01Var.OooO0o0(i2));
            i2++;
        }
    }

    public static void OooO0O0(int i, List list, rh0 rh0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        rh0Var.getClass();
        boolean z2 = list instanceof a01;
        int i2 = 0;
        rz0 rz0Var = (rz0) rh0Var.f23865OooOo0O;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    rz0Var.o0OOO0o(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            rz0Var.o000000o(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                i3 += 4;
            }
            rz0Var.o00000O0(i3);
            while (i2 < list.size()) {
                rz0Var.o0Oo0oo(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        a01 a01Var = (a01) list;
        if (!z) {
            while (i2 < a01Var.f16870OooOo) {
                rz0Var.o0OOO0o(i, a01Var.OooO0o0(i2));
                i2++;
            }
            return;
        }
        rz0Var.o000000o(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < a01Var.f16870OooOo; i6++) {
            a01Var.OooO0o0(i6);
            i5 += 4;
        }
        rz0Var.o00000O0(i5);
        while (i2 < a01Var.f16870OooOo) {
            rz0Var.o0Oo0oo(a01Var.OooO0o0(i2));
            i2++;
        }
    }

    public static void OooO0OO(int i, List list, rh0 rh0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        rh0Var.getClass();
        boolean z2 = list instanceof p01;
        int i2 = 0;
        rz0 rz0Var = (rz0) rh0Var.f23865OooOo0O;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    rz0Var.o0OO00O(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            rz0Var.o000000o(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).getClass();
                i3 += 8;
            }
            rz0Var.o00000O0(i3);
            while (i2 < list.size()) {
                rz0Var.oo0o0Oo(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        p01 p01Var = (p01) list;
        if (!z) {
            while (i2 < p01Var.f23172OooOo) {
                rz0Var.o0OO00O(i, p01Var.OooO0o0(i2));
                i2++;
            }
            return;
        }
        rz0Var.o000000o(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < p01Var.f23172OooOo; i6++) {
            p01Var.OooO0o0(i6);
            i5 += 8;
        }
        rz0Var.o00000O0(i5);
        while (i2 < p01Var.f23172OooOo) {
            rz0Var.oo0o0Oo(p01Var.OooO0o0(i2));
            i2++;
        }
    }

    public static void OooO0Oo(int i, List list, rh0 rh0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        rh0Var.getClass();
        boolean z2 = list instanceof a01;
        int i2 = 0;
        rz0 rz0Var = (rz0) rh0Var.f23865OooOo0O;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    int iIntValue = ((Integer) list.get(i2)).intValue();
                    rz0Var.o00000(i, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                    i2++;
                }
                return;
            }
            rz0Var.o000000o(i, 2);
            int iOo000o = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                int iIntValue2 = ((Integer) list.get(i3)).intValue();
                iOo000o += rz0.oo000o((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
            }
            rz0Var.o00000O0(iOo000o);
            while (i2 < list.size()) {
                int iIntValue3 = ((Integer) list.get(i2)).intValue();
                rz0Var.o00000O0((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                i2++;
            }
            return;
        }
        a01 a01Var = (a01) list;
        if (!z) {
            while (i2 < a01Var.f16870OooOo) {
                int iOooO0o0 = a01Var.OooO0o0(i2);
                rz0Var.o00000(i, (iOooO0o0 >> 31) ^ (iOooO0o0 + iOooO0o0));
                i2++;
            }
            return;
        }
        rz0Var.o000000o(i, 2);
        int iOo000o2 = 0;
        for (int i4 = 0; i4 < a01Var.f16870OooOo; i4++) {
            int iOooO0o02 = a01Var.OooO0o0(i4);
            iOo000o2 += rz0.oo000o((iOooO0o02 >> 31) ^ (iOooO0o02 + iOooO0o02));
        }
        rz0Var.o00000O0(iOo000o2);
        while (i2 < a01Var.f16870OooOo) {
            int iOooO0o03 = a01Var.OooO0o0(i2);
            rz0Var.o00000O0((iOooO0o03 >> 31) ^ (iOooO0o03 + iOooO0o03));
            i2++;
        }
    }

    public static void OooO0o(int i, List list, rh0 rh0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        rh0Var.getClass();
        boolean z2 = list instanceof a01;
        int i2 = 0;
        rz0 rz0Var = (rz0) rh0Var.f23865OooOo0O;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    rz0Var.o00000(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            rz0Var.o000000o(i, 2);
            int iOo000o = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iOo000o += rz0.oo000o(((Integer) list.get(i3)).intValue());
            }
            rz0Var.o00000O0(iOo000o);
            while (i2 < list.size()) {
                rz0Var.o00000O0(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        a01 a01Var = (a01) list;
        if (!z) {
            while (i2 < a01Var.f16870OooOo) {
                rz0Var.o00000(i, a01Var.OooO0o0(i2));
                i2++;
            }
            return;
        }
        rz0Var.o000000o(i, 2);
        int iOo000o2 = 0;
        for (int i4 = 0; i4 < a01Var.f16870OooOo; i4++) {
            iOo000o2 += rz0.oo000o(a01Var.OooO0o0(i4));
        }
        rz0Var.o00000O0(iOo000o2);
        while (i2 < a01Var.f16870OooOo) {
            rz0Var.o00000O0(a01Var.OooO0o0(i2));
            i2++;
        }
    }

    public static void OooO0o0(int i, List list, rh0 rh0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        rh0Var.getClass();
        boolean z2 = list instanceof p01;
        int i2 = 0;
        rz0 rz0Var = (rz0) rh0Var.f23865OooOo0O;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    long jLongValue = ((Long) list.get(i2)).longValue();
                    rz0Var.o00000O(i, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                    i2++;
                }
                return;
            }
            rz0Var.o000000o(i, 2);
            int iO00oO0o = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                long jLongValue2 = ((Long) list.get(i3)).longValue();
                iO00oO0o += rz0.o00oO0o((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
            }
            rz0Var.o00000O0(iO00oO0o);
            while (i2 < list.size()) {
                long jLongValue3 = ((Long) list.get(i2)).longValue();
                rz0Var.o00000OO((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
                i2++;
            }
            return;
        }
        p01 p01Var = (p01) list;
        if (!z) {
            while (i2 < p01Var.f23172OooOo) {
                long jOooO0o0 = p01Var.OooO0o0(i2);
                rz0Var.o00000O(i, (jOooO0o0 >> 63) ^ (jOooO0o0 + jOooO0o0));
                i2++;
            }
            return;
        }
        rz0Var.o000000o(i, 2);
        int iO00oO0o2 = 0;
        for (int i4 = 0; i4 < p01Var.f23172OooOo; i4++) {
            long jOooO0o02 = p01Var.OooO0o0(i4);
            iO00oO0o2 += rz0.o00oO0o((jOooO0o02 >> 63) ^ (jOooO0o02 + jOooO0o02));
        }
        rz0Var.o00000O0(iO00oO0o2);
        while (i2 < p01Var.f23172OooOo) {
            long jOooO0o03 = p01Var.OooO0o0(i2);
            rz0Var.o00000OO((jOooO0o03 >> 63) ^ (jOooO0o03 + jOooO0o03));
            i2++;
        }
    }

    public static void OooO0oO(int i, List list, rh0 rh0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        rh0Var.getClass();
        boolean z2 = list instanceof p01;
        int i2 = 0;
        rz0 rz0Var = (rz0) rh0Var.f23865OooOo0O;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    rz0Var.o00000O(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            rz0Var.o000000o(i, 2);
            int iO00oO0o = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iO00oO0o += rz0.o00oO0o(((Long) list.get(i3)).longValue());
            }
            rz0Var.o00000O0(iO00oO0o);
            while (i2 < list.size()) {
                rz0Var.o00000OO(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        p01 p01Var = (p01) list;
        if (!z) {
            while (i2 < p01Var.f23172OooOo) {
                rz0Var.o00000O(i, p01Var.OooO0o0(i2));
                i2++;
            }
            return;
        }
        rz0Var.o000000o(i, 2);
        int iO00oO0o2 = 0;
        for (int i4 = 0; i4 < p01Var.f23172OooOo; i4++) {
            iO00oO0o2 += rz0.o00oO0o(p01Var.OooO0o0(i4));
        }
        rz0Var.o00000O0(iO00oO0o2);
        while (i2 < p01Var.f23172OooOo) {
            rz0Var.o00000OO(p01Var.OooO0o0(i2));
            i2++;
        }
    }

    public static boolean OooO0oo(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int OooOO0(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (rz0.oo000o(i << 3) + 4) * size;
    }

    public static int OooOO0O(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (rz0.oo000o(i << 3) + 8) * size;
    }

    public static int OooOO0o(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof a01)) {
            int iO00oO0o = 0;
            while (i < size) {
                iO00oO0o += rz0.o00oO0o(((Integer) list.get(i)).intValue());
                i++;
            }
            return iO00oO0o;
        }
        a01 a01Var = (a01) list;
        int iO00oO0o2 = 0;
        while (i < size) {
            iO00oO0o2 += rz0.o00oO0o(a01Var.OooO0o0(i));
            i++;
        }
        return iO00oO0o2;
    }

    public static int OooOOO(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof a01)) {
            int iOo000o = 0;
            while (i < size) {
                int iIntValue = ((Integer) list.get(i)).intValue();
                iOo000o += rz0.oo000o((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i++;
            }
            return iOo000o;
        }
        a01 a01Var = (a01) list;
        int iOo000o2 = 0;
        while (i < size) {
            int iOooO0o0 = a01Var.OooO0o0(i);
            iOo000o2 += rz0.oo000o((iOooO0o0 >> 31) ^ (iOooO0o0 + iOooO0o0));
            i++;
        }
        return iOo000o2;
    }

    public static int OooOOO0(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof p01)) {
            int iO00oO0o = 0;
            while (i < size) {
                iO00oO0o += rz0.o00oO0o(((Long) list.get(i)).longValue());
                i++;
            }
            return iO00oO0o;
        }
        p01 p01Var = (p01) list;
        int iO00oO0o2 = 0;
        while (i < size) {
            iO00oO0o2 += rz0.o00oO0o(p01Var.OooO0o0(i));
            i++;
        }
        return iO00oO0o2;
    }

    public static int OooOOOO(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof p01)) {
            int iO00oO0o = 0;
            while (i < size) {
                long jLongValue = ((Long) list.get(i)).longValue();
                iO00oO0o += rz0.o00oO0o((jLongValue >> 63) ^ (jLongValue + jLongValue));
                i++;
            }
            return iO00oO0o;
        }
        p01 p01Var = (p01) list;
        int iO00oO0o2 = 0;
        while (i < size) {
            long jOooO0o0 = p01Var.OooO0o0(i);
            iO00oO0o2 += rz0.o00oO0o((jOooO0o0 >> 63) ^ (jOooO0o0 + jOooO0o0));
            i++;
        }
        return iO00oO0o2;
    }

    public static int OooOOOo(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof a01)) {
            int iOo000o = 0;
            while (i < size) {
                iOo000o += rz0.oo000o(((Integer) list.get(i)).intValue());
                i++;
            }
            return iOo000o;
        }
        a01 a01Var = (a01) list;
        int iOo000o2 = 0;
        while (i < size) {
            iOo000o2 += rz0.oo000o(a01Var.OooO0o0(i));
            i++;
        }
        return iOo000o2;
    }

    public static Object OooOOo(Object obj, int i, h01 h01Var, c01 c01Var, Object obj2, o0O o0o) {
        if (c01Var == null) {
            return obj2;
        }
        if (h01Var == null) {
            Iterator it = h01Var.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Integer) it.next()).intValue();
                if (!c01Var.OooO00o(iIntValue)) {
                    if (obj2 == null) {
                        o0o.getClass();
                        obj2 = o0O.OooOOOO(obj);
                    }
                    o0o.getClass();
                    ((l11) obj2).OooO0OO(i << 3, Long.valueOf(iIntValue));
                    it.remove();
                }
            }
            return obj2;
        }
        int size = h01Var.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            Integer num = (Integer) h01Var.get(i3);
            int iIntValue2 = num.intValue();
            if (c01Var.OooO00o(iIntValue2)) {
                if (i3 != i2) {
                    h01Var.set(i2, num);
                }
                i2++;
            } else {
                if (obj2 == null) {
                    o0o.getClass();
                    obj2 = o0O.OooOOOO(obj);
                }
                o0o.getClass();
                ((l11) obj2).OooO0OO(i << 3, Long.valueOf(iIntValue2));
            }
        }
        if (i2 != size) {
            h01Var.subList(i2, size).clear();
        }
        return obj2;
    }

    public static int OooOOo0(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof p01)) {
            int iO00oO0o = 0;
            while (i < size) {
                iO00oO0o += rz0.o00oO0o(((Long) list.get(i)).longValue());
                i++;
            }
            return iO00oO0o;
        }
        p01 p01Var = (p01) list;
        int iO00oO0o2 = 0;
        while (i < size) {
            iO00oO0o2 += rz0.o00oO0o(p01Var.OooO0o0(i));
            i++;
        }
        return iO00oO0o2;
    }

    public static void OooOOoo(Object obj, Object obj2) {
        zz0 zz0Var = (zz0) obj;
        l11 l11Var = zz0Var.zzt;
        l11 l11Var2 = ((zz0) obj2).zzt;
        l11 l11Var3 = l11.f20771OooO0o;
        if (!l11Var3.equals(l11Var2)) {
            if (l11Var3.equals(l11Var)) {
                int i = l11Var.f20772OooO00o + l11Var2.f20772OooO00o;
                int[] iArrCopyOf = Arrays.copyOf(l11Var.f20773OooO0O0, i);
                System.arraycopy(l11Var2.f20773OooO0O0, 0, iArrCopyOf, l11Var.f20772OooO00o, l11Var2.f20772OooO00o);
                Object[] objArrCopyOf = Arrays.copyOf(l11Var.f20774OooO0OO, i);
                System.arraycopy(l11Var2.f20774OooO0OO, 0, objArrCopyOf, l11Var.f20772OooO00o, l11Var2.f20772OooO00o);
                l11Var = new l11(i, iArrCopyOf, objArrCopyOf, true);
            } else {
                l11Var.getClass();
                if (!l11Var2.equals(l11Var3)) {
                    if (!l11Var.f20776OooO0o0) {
                        throw new UnsupportedOperationException();
                    }
                    int i2 = l11Var.f20772OooO00o + l11Var2.f20772OooO00o;
                    l11Var.OooO0o0(i2);
                    System.arraycopy(l11Var2.f20773OooO0O0, 0, l11Var.f20773OooO0O0, l11Var.f20772OooO00o, l11Var2.f20772OooO00o);
                    System.arraycopy(l11Var2.f20774OooO0OO, 0, l11Var.f20774OooO0OO, l11Var.f20772OooO00o, l11Var2.f20772OooO00o);
                    l11Var.f20772OooO00o = i2;
                }
            }
        }
        zz0Var.zzt = l11Var;
    }

    public static void OooOo(int i, List list, rh0 rh0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        rh0Var.getClass();
        boolean z2 = list instanceof p01;
        int i2 = 0;
        rz0 rz0Var = (rz0) rh0Var.f23865OooOo0O;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    rz0Var.o0OO00O(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            rz0Var.o000000o(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).getClass();
                i3 += 8;
            }
            rz0Var.o00000O0(i3);
            while (i2 < list.size()) {
                rz0Var.oo0o0Oo(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        p01 p01Var = (p01) list;
        if (!z) {
            while (i2 < p01Var.f23172OooOo) {
                rz0Var.o0OO00O(i, p01Var.OooO0o0(i2));
                i2++;
            }
            return;
        }
        rz0Var.o000000o(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < p01Var.f23172OooOo; i6++) {
            p01Var.OooO0o0(i6);
            i5 += 8;
        }
        rz0Var.o00000O0(i5);
        while (i2 < p01Var.f23172OooOo) {
            rz0Var.oo0o0Oo(p01Var.OooO0o0(i2));
            i2++;
        }
    }

    public static void OooOo0(int i, List list, rh0 rh0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        rz0 rz0Var = (rz0) rh0Var.f23865OooOo0O;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                rz0Var.o0OO00O(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        rz0Var.o000000o(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Double) list.get(i4)).getClass();
            i3 += 8;
        }
        rz0Var.o00000O0(i3);
        while (i2 < list.size()) {
            rz0Var.oo0o0Oo(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    public static void OooOo00(int i, List list, rh0 rh0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        rz0 rz0Var = (rz0) rh0Var.f23865OooOo0O;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                rz0Var.o0ooOOo(i, ((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
            return;
        }
        rz0Var.o000000o(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Boolean) list.get(i4)).getClass();
            i3++;
        }
        rz0Var.o00000O0(i3);
        while (i2 < list.size()) {
            rz0Var.o0ooOO0(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    public static void OooOo0O(int i, List list, rh0 rh0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        rh0Var.getClass();
        boolean z2 = list instanceof a01;
        int i2 = 0;
        rz0 rz0Var = (rz0) rh0Var.f23865OooOo0O;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    rz0Var.o0O0O00(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            rz0Var.o000000o(i, 2);
            int iO00oO0o = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iO00oO0o += rz0.o00oO0o(((Integer) list.get(i3)).intValue());
            }
            rz0Var.o00000O0(iO00oO0o);
            while (i2 < list.size()) {
                rz0Var.o000OOo(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        a01 a01Var = (a01) list;
        if (!z) {
            while (i2 < a01Var.f16870OooOo) {
                rz0Var.o0O0O00(i, a01Var.OooO0o0(i2));
                i2++;
            }
            return;
        }
        rz0Var.o000000o(i, 2);
        int iO00oO0o2 = 0;
        for (int i4 = 0; i4 < a01Var.f16870OooOo; i4++) {
            iO00oO0o2 += rz0.o00oO0o(a01Var.OooO0o0(i4));
        }
        rz0Var.o00000O0(iO00oO0o2);
        while (i2 < a01Var.f16870OooOo) {
            rz0Var.o000OOo(a01Var.OooO0o0(i2));
            i2++;
        }
    }

    public static void OooOo0o(int i, List list, rh0 rh0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        rh0Var.getClass();
        boolean z2 = list instanceof a01;
        int i2 = 0;
        rz0 rz0Var = (rz0) rh0Var.f23865OooOo0O;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    rz0Var.o0OOO0o(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            rz0Var.o000000o(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                i3 += 4;
            }
            rz0Var.o00000O0(i3);
            while (i2 < list.size()) {
                rz0Var.o0Oo0oo(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        a01 a01Var = (a01) list;
        if (!z) {
            while (i2 < a01Var.f16870OooOo) {
                rz0Var.o0OOO0o(i, a01Var.OooO0o0(i2));
                i2++;
            }
            return;
        }
        rz0Var.o000000o(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < a01Var.f16870OooOo; i6++) {
            a01Var.OooO0o0(i6);
            i5 += 4;
        }
        rz0Var.o00000O0(i5);
        while (i2 < a01Var.f16870OooOo) {
            rz0Var.o0Oo0oo(a01Var.OooO0o0(i2));
            i2++;
        }
    }

    public static void OooOoO(int i, List list, rh0 rh0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        rh0Var.getClass();
        boolean z2 = list instanceof a01;
        int i2 = 0;
        rz0 rz0Var = (rz0) rh0Var.f23865OooOo0O;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    rz0Var.o0O0O00(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            rz0Var.o000000o(i, 2);
            int iO00oO0o = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iO00oO0o += rz0.o00oO0o(((Integer) list.get(i3)).intValue());
            }
            rz0Var.o00000O0(iO00oO0o);
            while (i2 < list.size()) {
                rz0Var.o000OOo(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        a01 a01Var = (a01) list;
        if (!z) {
            while (i2 < a01Var.f16870OooOo) {
                rz0Var.o0O0O00(i, a01Var.OooO0o0(i2));
                i2++;
            }
            return;
        }
        rz0Var.o000000o(i, 2);
        int iO00oO0o2 = 0;
        for (int i4 = 0; i4 < a01Var.f16870OooOo; i4++) {
            iO00oO0o2 += rz0.o00oO0o(a01Var.OooO0o0(i4));
        }
        rz0Var.o00000O0(iO00oO0o2);
        while (i2 < a01Var.f16870OooOo) {
            rz0Var.o000OOo(a01Var.OooO0o0(i2));
            i2++;
        }
    }

    public static void OooOoO0(int i, List list, rh0 rh0Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        rz0 rz0Var = (rz0) rh0Var.f23865OooOo0O;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                rz0Var.o0OOO0o(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        rz0Var.o000000o(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Float) list.get(i4)).getClass();
            i3 += 4;
        }
        rz0Var.o00000O0(i3);
        while (i2 < list.size()) {
            rz0Var.o0Oo0oo(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }
}
