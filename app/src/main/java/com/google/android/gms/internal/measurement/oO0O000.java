package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.ads.pz0;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class oO0O000 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public static final oO0Oo0oo f26723OooO00o;

    static {
        oOo000Oo ooo000oo = oOo000Oo.f26877OooO0OO;
        f26723OooO00o = new oO0Oo0oo(6);
    }

    public static void OooO(int i, List list, oO00Oo0 oo00oo0, boolean z) throws pz0 {
        if (list == null || list.isEmpty()) {
            return;
        }
        oo00oo0.getClass();
        boolean z2 = list instanceof oO00Oo00;
        oO000O0 oo000o0 = (oO000O0) oo00oo0.f26700OooOo0O;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    oo000o0.OooOOo0(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            oo000o0.OooOO0o(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).getClass();
                i3 += 8;
            }
            oo000o0.OooOo0(i3);
            while (i2 < list.size()) {
                oo000o0.OooOo(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        oO00Oo00 oo00oo00 = (oO00Oo00) list;
        if (!z) {
            while (i2 < oo00oo00.f26703OooOo) {
                oo000o0.OooOOo0(i, oo00oo00.OooO0o0(i2));
                i2++;
            }
            return;
        }
        oo000o0.OooOO0o(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < oo00oo00.f26703OooOo; i6++) {
            oo00oo00.OooO0o0(i6);
            i5 += 8;
        }
        oo000o0.OooOo0(i5);
        while (i2 < oo00oo00.f26703OooOo) {
            oo000o0.OooOo(oo00oo00.OooO0o0(i2));
            i2++;
        }
    }

    public static boolean OooO00o(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void OooO0O0(Object obj, Object obj2) {
        ooOOOOoo oooooooo = (ooOOOOoo) obj;
        oO0O00oO oo0o00oo = oooooooo.zzc;
        oO0O00oO oo0o00oo2 = ((ooOOOOoo) obj2).zzc;
        oO0O00oO oo0o00oo3 = oO0O00oO.f26737OooO0o;
        if (!oo0o00oo3.equals(oo0o00oo2)) {
            if (oo0o00oo3.equals(oo0o00oo)) {
                int i = oo0o00oo.f26738OooO00o + oo0o00oo2.f26738OooO00o;
                int[] iArrCopyOf = Arrays.copyOf(oo0o00oo.f26739OooO0O0, i);
                System.arraycopy(oo0o00oo2.f26739OooO0O0, 0, iArrCopyOf, oo0o00oo.f26738OooO00o, oo0o00oo2.f26738OooO00o);
                Object[] objArrCopyOf = Arrays.copyOf(oo0o00oo.f26740OooO0OO, i);
                System.arraycopy(oo0o00oo2.f26740OooO0OO, 0, objArrCopyOf, oo0o00oo.f26738OooO00o, oo0o00oo2.f26738OooO00o);
                oo0o00oo = new oO0O00oO(i, iArrCopyOf, objArrCopyOf, true);
            } else {
                oo0o00oo.getClass();
                if (!oo0o00oo2.equals(oo0o00oo3)) {
                    if (!oo0o00oo.f26742OooO0o0) {
                        throw new UnsupportedOperationException();
                    }
                    int i2 = oo0o00oo.f26738OooO00o + oo0o00oo2.f26738OooO00o;
                    oo0o00oo.OooO0o0(i2);
                    System.arraycopy(oo0o00oo2.f26739OooO0O0, 0, oo0o00oo.f26739OooO0O0, oo0o00oo.f26738OooO00o, oo0o00oo2.f26738OooO00o);
                    System.arraycopy(oo0o00oo2.f26740OooO0OO, 0, oo0o00oo.f26740OooO0OO, oo0o00oo.f26738OooO00o, oo0o00oo2.f26738OooO00o);
                    oo0o00oo.f26738OooO00o = i2;
                }
            }
        }
        oooooooo.zzc = oo0o00oo;
    }

    public static void OooO0OO(int i, List list, oO00Oo0 oo00oo0, boolean z) throws pz0 {
        if (list == null || list.isEmpty()) {
            return;
        }
        oO000O0 oo000o0 = (oO000O0) oo00oo0.f26700OooOo0O;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                oo000o0.OooOOo0(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        oo000o0.OooOO0o(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Double) list.get(i4)).getClass();
            i3 += 8;
        }
        oo000o0.OooOo0(i3);
        while (i2 < list.size()) {
            oo000o0.OooOo(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    public static void OooO0Oo(int i, List list, oO00Oo0 oo00oo0, boolean z) throws pz0 {
        if (list == null || list.isEmpty()) {
            return;
        }
        oO000O0 oo000o0 = (oO000O0) oo00oo0.f26700OooOo0O;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                oo000o0.OooOOOO(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        oo000o0.OooOO0o(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Float) list.get(i4)).getClass();
            i3 += 4;
        }
        oo000o0.OooOo0(i3);
        while (i2 < list.size()) {
            oo000o0.OooOo0O(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    public static void OooO0o(int i, List list, oO00Oo0 oo00oo0, boolean z) throws pz0 {
        if (list == null || list.isEmpty()) {
            return;
        }
        oo00oo0.getClass();
        boolean z2 = list instanceof oO00Oo00;
        oO000O0 oo000o0 = (oO000O0) oo00oo0.f26700OooOo0O;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    oo000o0.OooOOOo(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            oo000o0.OooOO0o(i, 2);
            int iOooOO0 = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iOooOO0 += oO000O0.OooOO0(((Long) list.get(i3)).longValue());
            }
            oo000o0.OooOo0(iOooOO0);
            while (i2 < list.size()) {
                oo000o0.OooOo0o(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        oO00Oo00 oo00oo00 = (oO00Oo00) list;
        if (!z) {
            while (i2 < oo00oo00.f26703OooOo) {
                oo000o0.OooOOOo(i, oo00oo00.OooO0o0(i2));
                i2++;
            }
            return;
        }
        oo000o0.OooOO0o(i, 2);
        int iOooOO02 = 0;
        for (int i4 = 0; i4 < oo00oo00.f26703OooOo; i4++) {
            iOooOO02 += oO000O0.OooOO0(oo00oo00.OooO0o0(i4));
        }
        oo000o0.OooOo0(iOooOO02);
        while (i2 < oo00oo00.f26703OooOo) {
            oo000o0.OooOo0o(oo00oo00.OooO0o0(i2));
            i2++;
        }
    }

    public static void OooO0o0(int i, List list, oO00Oo0 oo00oo0, boolean z) throws pz0 {
        if (list == null || list.isEmpty()) {
            return;
        }
        oo00oo0.getClass();
        boolean z2 = list instanceof oO00Oo00;
        oO000O0 oo000o0 = (oO000O0) oo00oo0.f26700OooOo0O;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    oo000o0.OooOOOo(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            oo000o0.OooOO0o(i, 2);
            int iOooOO0 = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iOooOO0 += oO000O0.OooOO0(((Long) list.get(i3)).longValue());
            }
            oo000o0.OooOo0(iOooOO0);
            while (i2 < list.size()) {
                oo000o0.OooOo0o(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        oO00Oo00 oo00oo00 = (oO00Oo00) list;
        if (!z) {
            while (i2 < oo00oo00.f26703OooOo) {
                oo000o0.OooOOOo(i, oo00oo00.OooO0o0(i2));
                i2++;
            }
            return;
        }
        oo000o0.OooOO0o(i, 2);
        int iOooOO02 = 0;
        for (int i4 = 0; i4 < oo00oo00.f26703OooOo; i4++) {
            iOooOO02 += oO000O0.OooOO0(oo00oo00.OooO0o0(i4));
        }
        oo000o0.OooOo0(iOooOO02);
        while (i2 < oo00oo00.f26703OooOo) {
            oo000o0.OooOo0o(oo00oo00.OooO0o0(i2));
            i2++;
        }
    }

    public static void OooO0oO(int i, List list, oO00Oo0 oo00oo0, boolean z) throws pz0 {
        if (list == null || list.isEmpty()) {
            return;
        }
        oo00oo0.getClass();
        boolean z2 = list instanceof oO00Oo00;
        oO000O0 oo000o0 = (oO000O0) oo00oo0.f26700OooOo0O;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    long jLongValue = ((Long) list.get(i2)).longValue();
                    oo000o0.OooOOOo(i, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                    i2++;
                }
                return;
            }
            oo000o0.OooOO0o(i, 2);
            int iOooOO0 = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                long jLongValue2 = ((Long) list.get(i3)).longValue();
                iOooOO0 += oO000O0.OooOO0((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
            }
            oo000o0.OooOo0(iOooOO0);
            while (i2 < list.size()) {
                long jLongValue3 = ((Long) list.get(i2)).longValue();
                oo000o0.OooOo0o((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
                i2++;
            }
            return;
        }
        oO00Oo00 oo00oo00 = (oO00Oo00) list;
        if (!z) {
            while (i2 < oo00oo00.f26703OooOo) {
                long jOooO0o0 = oo00oo00.OooO0o0(i2);
                oo000o0.OooOOOo(i, (jOooO0o0 >> 63) ^ (jOooO0o0 + jOooO0o0));
                i2++;
            }
            return;
        }
        oo000o0.OooOO0o(i, 2);
        int iOooOO02 = 0;
        for (int i4 = 0; i4 < oo00oo00.f26703OooOo; i4++) {
            long jOooO0o02 = oo00oo00.OooO0o0(i4);
            iOooOO02 += oO000O0.OooOO0((jOooO0o02 >> 63) ^ (jOooO0o02 + jOooO0o02));
        }
        oo000o0.OooOo0(iOooOO02);
        while (i2 < oo00oo00.f26703OooOo) {
            long jOooO0o03 = oo00oo00.OooO0o0(i2);
            oo000o0.OooOo0o((jOooO0o03 >> 63) ^ (jOooO0o03 + jOooO0o03));
            i2++;
        }
    }

    public static void OooO0oo(int i, List list, oO00Oo0 oo00oo0, boolean z) throws pz0 {
        if (list == null || list.isEmpty()) {
            return;
        }
        oo00oo0.getClass();
        boolean z2 = list instanceof oO00Oo00;
        oO000O0 oo000o0 = (oO000O0) oo00oo0.f26700OooOo0O;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    oo000o0.OooOOo0(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            oo000o0.OooOO0o(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).getClass();
                i3 += 8;
            }
            oo000o0.OooOo0(i3);
            while (i2 < list.size()) {
                oo000o0.OooOo(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        oO00Oo00 oo00oo00 = (oO00Oo00) list;
        if (!z) {
            while (i2 < oo00oo00.f26703OooOo) {
                oo000o0.OooOOo0(i, oo00oo00.OooO0o0(i2));
                i2++;
            }
            return;
        }
        oo000o0.OooOO0o(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < oo00oo00.f26703OooOo; i6++) {
            oo00oo00.OooO0o0(i6);
            i5 += 8;
        }
        oo000o0.OooOo0(i5);
        while (i2 < oo00oo00.f26703OooOo) {
            oo000o0.OooOo(oo00oo00.OooO0o0(i2));
            i2++;
        }
    }

    public static void OooOO0(int i, List list, oO00Oo0 oo00oo0, boolean z) throws pz0 {
        if (list == null || list.isEmpty()) {
            return;
        }
        oo00oo0.getClass();
        boolean z2 = list instanceof oO0OOo0o;
        oO000O0 oo000o0 = (oO000O0) oo00oo0.f26700OooOo0O;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    oo000o0.OooOOO0(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            oo000o0.OooOO0o(i, 2);
            int iOooOO0 = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iOooOO0 += oO000O0.OooOO0(((Integer) list.get(i3)).intValue());
            }
            oo000o0.OooOo0(iOooOO0);
            while (i2 < list.size()) {
                oo000o0.OooOo00(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        oO0OOo0o oo0ooo0o = (oO0OOo0o) list;
        if (!z) {
            while (i2 < oo0ooo0o.f26754OooOo) {
                oo000o0.OooOOO0(i, oo0ooo0o.OooO0o(i2));
                i2++;
            }
            return;
        }
        oo000o0.OooOO0o(i, 2);
        int iOooOO02 = 0;
        for (int i4 = 0; i4 < oo0ooo0o.f26754OooOo; i4++) {
            iOooOO02 += oO000O0.OooOO0(oo0ooo0o.OooO0o(i4));
        }
        oo000o0.OooOo0(iOooOO02);
        while (i2 < oo0ooo0o.f26754OooOo) {
            oo000o0.OooOo00(oo0ooo0o.OooO0o(i2));
            i2++;
        }
    }

    public static void OooOO0O(int i, List list, oO00Oo0 oo00oo0, boolean z) throws pz0 {
        if (list == null || list.isEmpty()) {
            return;
        }
        oo00oo0.getClass();
        boolean z2 = list instanceof oO0OOo0o;
        oO000O0 oo000o0 = (oO000O0) oo00oo0.f26700OooOo0O;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    oo000o0.OooOOO(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            oo000o0.OooOO0o(i, 2);
            int iOooOoOO = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iOooOoOO += oO000O0.OooOoOO(((Integer) list.get(i3)).intValue());
            }
            oo000o0.OooOo0(iOooOoOO);
            while (i2 < list.size()) {
                oo000o0.OooOo0(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        oO0OOo0o oo0ooo0o = (oO0OOo0o) list;
        if (!z) {
            while (i2 < oo0ooo0o.f26754OooOo) {
                oo000o0.OooOOO(i, oo0ooo0o.OooO0o(i2));
                i2++;
            }
            return;
        }
        oo000o0.OooOO0o(i, 2);
        int iOooOoOO2 = 0;
        for (int i4 = 0; i4 < oo0ooo0o.f26754OooOo; i4++) {
            iOooOoOO2 += oO000O0.OooOoOO(oo0ooo0o.OooO0o(i4));
        }
        oo000o0.OooOo0(iOooOoOO2);
        while (i2 < oo0ooo0o.f26754OooOo) {
            oo000o0.OooOo0(oo0ooo0o.OooO0o(i2));
            i2++;
        }
    }

    public static void OooOO0o(int i, List list, oO00Oo0 oo00oo0, boolean z) throws pz0 {
        if (list == null || list.isEmpty()) {
            return;
        }
        oo00oo0.getClass();
        boolean z2 = list instanceof oO0OOo0o;
        oO000O0 oo000o0 = (oO000O0) oo00oo0.f26700OooOo0O;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    int iIntValue = ((Integer) list.get(i2)).intValue();
                    oo000o0.OooOOO(i, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                    i2++;
                }
                return;
            }
            oo000o0.OooOO0o(i, 2);
            int iOooOoOO = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                int iIntValue2 = ((Integer) list.get(i3)).intValue();
                iOooOoOO += oO000O0.OooOoOO((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
            }
            oo000o0.OooOo0(iOooOoOO);
            while (i2 < list.size()) {
                int iIntValue3 = ((Integer) list.get(i2)).intValue();
                oo000o0.OooOo0((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                i2++;
            }
            return;
        }
        oO0OOo0o oo0ooo0o = (oO0OOo0o) list;
        if (!z) {
            while (i2 < oo0ooo0o.f26754OooOo) {
                int iOooO0o = oo0ooo0o.OooO0o(i2);
                oo000o0.OooOOO(i, (iOooO0o >> 31) ^ (iOooO0o + iOooO0o));
                i2++;
            }
            return;
        }
        oo000o0.OooOO0o(i, 2);
        int iOooOoOO2 = 0;
        for (int i4 = 0; i4 < oo0ooo0o.f26754OooOo; i4++) {
            int iOooO0o2 = oo0ooo0o.OooO0o(i4);
            iOooOoOO2 += oO000O0.OooOoOO((iOooO0o2 >> 31) ^ (iOooO0o2 + iOooO0o2));
        }
        oo000o0.OooOo0(iOooOoOO2);
        while (i2 < oo0ooo0o.f26754OooOo) {
            int iOooO0o3 = oo0ooo0o.OooO0o(i2);
            oo000o0.OooOo0((iOooO0o3 >> 31) ^ (iOooO0o3 + iOooO0o3));
            i2++;
        }
    }

    public static void OooOOO(int i, List list, oO00Oo0 oo00oo0, boolean z) throws pz0 {
        if (list == null || list.isEmpty()) {
            return;
        }
        oo00oo0.getClass();
        boolean z2 = list instanceof oO0OOo0o;
        oO000O0 oo000o0 = (oO000O0) oo00oo0.f26700OooOo0O;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    oo000o0.OooOOOO(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            oo000o0.OooOO0o(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                i3 += 4;
            }
            oo000o0.OooOo0(i3);
            while (i2 < list.size()) {
                oo000o0.OooOo0O(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        oO0OOo0o oo0ooo0o = (oO0OOo0o) list;
        if (!z) {
            while (i2 < oo0ooo0o.f26754OooOo) {
                oo000o0.OooOOOO(i, oo0ooo0o.OooO0o(i2));
                i2++;
            }
            return;
        }
        oo000o0.OooOO0o(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < oo0ooo0o.f26754OooOo; i6++) {
            oo0ooo0o.OooO0o(i6);
            i5 += 4;
        }
        oo000o0.OooOo0(i5);
        while (i2 < oo0ooo0o.f26754OooOo) {
            oo000o0.OooOo0O(oo0ooo0o.OooO0o(i2));
            i2++;
        }
    }

    public static void OooOOO0(int i, List list, oO00Oo0 oo00oo0, boolean z) throws pz0 {
        if (list == null || list.isEmpty()) {
            return;
        }
        oo00oo0.getClass();
        boolean z2 = list instanceof oO0OOo0o;
        oO000O0 oo000o0 = (oO000O0) oo00oo0.f26700OooOo0O;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    oo000o0.OooOOOO(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            oo000o0.OooOO0o(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                i3 += 4;
            }
            oo000o0.OooOo0(i3);
            while (i2 < list.size()) {
                oo000o0.OooOo0O(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        oO0OOo0o oo0ooo0o = (oO0OOo0o) list;
        if (!z) {
            while (i2 < oo0ooo0o.f26754OooOo) {
                oo000o0.OooOOOO(i, oo0ooo0o.OooO0o(i2));
                i2++;
            }
            return;
        }
        oo000o0.OooOO0o(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < oo0ooo0o.f26754OooOo; i6++) {
            oo0ooo0o.OooO0o(i6);
            i5 += 4;
        }
        oo000o0.OooOo0(i5);
        while (i2 < oo0ooo0o.f26754OooOo) {
            oo000o0.OooOo0O(oo0ooo0o.OooO0o(i2));
            i2++;
        }
    }

    public static void OooOOOO(int i, List list, oO00Oo0 oo00oo0, boolean z) throws pz0 {
        if (list == null || list.isEmpty()) {
            return;
        }
        oo00oo0.getClass();
        boolean z2 = list instanceof oO0OOo0o;
        oO000O0 oo000o0 = (oO000O0) oo00oo0.f26700OooOo0O;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    oo000o0.OooOOO0(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            oo000o0.OooOO0o(i, 2);
            int iOooOO0 = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iOooOO0 += oO000O0.OooOO0(((Integer) list.get(i3)).intValue());
            }
            oo000o0.OooOo0(iOooOO0);
            while (i2 < list.size()) {
                oo000o0.OooOo00(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        oO0OOo0o oo0ooo0o = (oO0OOo0o) list;
        if (!z) {
            while (i2 < oo0ooo0o.f26754OooOo) {
                oo000o0.OooOOO0(i, oo0ooo0o.OooO0o(i2));
                i2++;
            }
            return;
        }
        oo000o0.OooOO0o(i, 2);
        int iOooOO02 = 0;
        for (int i4 = 0; i4 < oo0ooo0o.f26754OooOo; i4++) {
            iOooOO02 += oO000O0.OooOO0(oo0ooo0o.OooO0o(i4));
        }
        oo000o0.OooOo0(iOooOO02);
        while (i2 < oo0ooo0o.f26754OooOo) {
            oo000o0.OooOo00(oo0ooo0o.OooO0o(i2));
            i2++;
        }
    }

    public static void OooOOOo(int i, List list, oO00Oo0 oo00oo0, boolean z) throws pz0 {
        if (list == null || list.isEmpty()) {
            return;
        }
        oO000O0 oo000o0 = (oO000O0) oo00oo0.f26700OooOo0O;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                boolean zBooleanValue = ((Boolean) list.get(i2)).booleanValue();
                oo000o0.OooOo0(i << 3);
                oo000o0.OooOOoo(zBooleanValue ? (byte) 1 : (byte) 0);
                i2++;
            }
            return;
        }
        oo000o0.OooOO0o(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Boolean) list.get(i4)).getClass();
            i3++;
        }
        oo000o0.OooOo0(i3);
        while (i2 < list.size()) {
            oo000o0.OooOOoo(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    public static int OooOOo(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof oO00Oo00)) {
            int iOooOO0 = 0;
            while (i < size) {
                iOooOO0 += oO000O0.OooOO0(((Long) list.get(i)).longValue());
                i++;
            }
            return iOooOO0;
        }
        oO00Oo00 oo00oo00 = (oO00Oo00) list;
        int iOooOO02 = 0;
        while (i < size) {
            iOooOO02 += oO000O0.OooOO0(oo00oo00.OooO0o0(i));
            i++;
        }
        return iOooOO02;
    }

    public static int OooOOo0(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof oO00Oo00)) {
            int iOooOO0 = 0;
            while (i < size) {
                iOooOO0 += oO000O0.OooOO0(((Long) list.get(i)).longValue());
                i++;
            }
            return iOooOO0;
        }
        oO00Oo00 oo00oo00 = (oO00Oo00) list;
        int iOooOO02 = 0;
        while (i < size) {
            iOooOO02 += oO000O0.OooOO0(oo00oo00.OooO0o0(i));
            i++;
        }
        return iOooOO02;
    }

    public static int OooOOoo(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof oO00Oo00)) {
            int iOooOO0 = 0;
            while (i < size) {
                long jLongValue = ((Long) list.get(i)).longValue();
                iOooOO0 += oO000O0.OooOO0((jLongValue >> 63) ^ (jLongValue + jLongValue));
                i++;
            }
            return iOooOO0;
        }
        oO00Oo00 oo00oo00 = (oO00Oo00) list;
        int iOooOO02 = 0;
        while (i < size) {
            long jOooO0o0 = oo00oo00.OooO0o0(i);
            iOooOO02 += oO000O0.OooOO0((jOooO0o0 >> 63) ^ (jOooO0o0 + jOooO0o0));
            i++;
        }
        return iOooOO02;
    }

    public static int OooOo(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (oO000O0.OooOoOO(i << 3) + 4) * size;
    }

    public static int OooOo0(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof oO0OOo0o)) {
            int iOooOO0 = 0;
            while (i < size) {
                iOooOO0 += oO000O0.OooOO0(((Integer) list.get(i)).intValue());
                i++;
            }
            return iOooOO0;
        }
        oO0OOo0o oo0ooo0o = (oO0OOo0o) list;
        int iOooOO02 = 0;
        while (i < size) {
            iOooOO02 += oO000O0.OooOO0(oo0ooo0o.OooO0o(i));
            i++;
        }
        return iOooOO02;
    }

    public static int OooOo00(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof oO0OOo0o)) {
            int iOooOO0 = 0;
            while (i < size) {
                iOooOO0 += oO000O0.OooOO0(((Integer) list.get(i)).intValue());
                i++;
            }
            return iOooOO0;
        }
        oO0OOo0o oo0ooo0o = (oO0OOo0o) list;
        int iOooOO02 = 0;
        while (i < size) {
            iOooOO02 += oO000O0.OooOO0(oo0ooo0o.OooO0o(i));
            i++;
        }
        return iOooOO02;
    }

    public static int OooOo0O(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof oO0OOo0o)) {
            int iOooOoOO = 0;
            while (i < size) {
                iOooOoOO += oO000O0.OooOoOO(((Integer) list.get(i)).intValue());
                i++;
            }
            return iOooOoOO;
        }
        oO0OOo0o oo0ooo0o = (oO0OOo0o) list;
        int iOooOoOO2 = 0;
        while (i < size) {
            iOooOoOO2 += oO000O0.OooOoOO(oo0ooo0o.OooO0o(i));
            i++;
        }
        return iOooOoOO2;
    }

    public static int OooOo0o(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof oO0OOo0o)) {
            int iOooOoOO = 0;
            while (i < size) {
                int iIntValue = ((Integer) list.get(i)).intValue();
                iOooOoOO += oO000O0.OooOoOO((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i++;
            }
            return iOooOoOO;
        }
        oO0OOo0o oo0ooo0o = (oO0OOo0o) list;
        int iOooOoOO2 = 0;
        while (i < size) {
            int iOooO0o = oo0ooo0o.OooO0o(i);
            iOooOoOO2 += oO000O0.OooOoOO((iOooO0o >> 31) ^ (iOooO0o + iOooO0o));
            i++;
        }
        return iOooOoOO2;
    }

    public static int OooOoO0(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (oO000O0.OooOoOO(i << 3) + 8) * size;
    }
}
