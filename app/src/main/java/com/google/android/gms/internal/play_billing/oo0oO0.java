package com.google.android.gms.internal.play_billing;

import com.google.android.gms.internal.ads.pz0;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class oo0oO0 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public static final o0O000o0 f27216OooO00o;

    static {
        o0O0oo00 o0o0oo00 = o0O0oo00.f27130OooO0OO;
        f27216OooO00o = new o0O000o0(6);
    }

    public static int OooO(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof o0O00O0o)) {
            int iOooo0oO = 0;
            while (i < size) {
                iOooo0oO += o0O0000O.Oooo0oO(((Integer) list.get(i)).intValue());
                i++;
            }
            return iOooo0oO;
        }
        o0O00O0o o0o00o0o = (o0O00O0o) list;
        int iOooo0oO2 = 0;
        while (i < size) {
            iOooo0oO2 += o0O0000O.Oooo0oO(o0o00o0o.OooO0o0(i));
            i++;
        }
        return iOooo0oO2;
    }

    public static void OooO00o(int i, List list, o0O0O0o0 o0o0o0o0, boolean z) throws pz0 {
        if (list == null || list.isEmpty()) {
            return;
        }
        o0o0o0o0.getClass();
        boolean z2 = list instanceof o0O00O0o;
        int i2 = 0;
        o0O0000O o0o0000o = (o0O0000O) o0o0o0o0.f27109OooO00o;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    int iIntValue = ((Integer) list.get(i2)).intValue();
                    o0o0000o.OoooOo0(i, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                    i2++;
                }
                return;
            }
            o0o0000o.OoooOOo(i, 2);
            int iOooooO0 = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                int iIntValue2 = ((Integer) list.get(i3)).intValue();
                iOooooO0 += o0O0000O.OooooO0((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
            }
            o0o0000o.OoooOoO(iOooooO0);
            while (i2 < list.size()) {
                int iIntValue3 = ((Integer) list.get(i2)).intValue();
                o0o0000o.OoooOoO((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                i2++;
            }
            return;
        }
        o0O00O0o o0o00o0o = (o0O00O0o) list;
        if (!z) {
            while (i2 < o0o00o0o.f27093OooOo) {
                int iOooO0o0 = o0o00o0o.OooO0o0(i2);
                o0o0000o.OoooOo0(i, (iOooO0o0 >> 31) ^ (iOooO0o0 + iOooO0o0));
                i2++;
            }
            return;
        }
        o0o0000o.OoooOOo(i, 2);
        int iOooooO02 = 0;
        for (int i4 = 0; i4 < o0o00o0o.f27093OooOo; i4++) {
            int iOooO0o02 = o0o00o0o.OooO0o0(i4);
            iOooooO02 += o0O0000O.OooooO0((iOooO0o02 >> 31) ^ (iOooO0o02 + iOooO0o02));
        }
        o0o0000o.OoooOoO(iOooooO02);
        while (i2 < o0o00o0o.f27093OooOo) {
            int iOooO0o03 = o0o00o0o.OooO0o0(i2);
            o0o0000o.OoooOoO((iOooO0o03 >> 31) ^ (iOooO0o03 + iOooO0o03));
            i2++;
        }
    }

    public static void OooO0O0(int i, List list, o0O0O0o0 o0o0o0o0, boolean z) throws pz0 {
        if (list == null || list.isEmpty()) {
            return;
        }
        o0O0000O o0o0000o = (o0O0000O) o0o0o0o0.f27109OooO00o;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                long jLongValue = ((Long) list.get(i2)).longValue();
                o0o0000o.OoooOoo(i, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                i2++;
            }
            return;
        }
        o0o0000o.OoooOOo(i, 2);
        int iOooo0oO = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            long jLongValue2 = ((Long) list.get(i3)).longValue();
            iOooo0oO += o0O0000O.Oooo0oO((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
        }
        o0o0000o.OoooOoO(iOooo0oO);
        while (i2 < list.size()) {
            long jLongValue3 = ((Long) list.get(i2)).longValue();
            o0o0000o.Ooooo00((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
            i2++;
        }
    }

    public static void OooO0OO(int i, List list, o0O0O0o0 o0o0o0o0, boolean z) throws pz0 {
        if (list == null || list.isEmpty()) {
            return;
        }
        o0o0o0o0.getClass();
        boolean z2 = list instanceof o0O00O0o;
        int i2 = 0;
        o0O0000O o0o0000o = (o0O0000O) o0o0o0o0.f27109OooO00o;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    o0o0000o.OoooOo0(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            o0o0000o.OoooOOo(i, 2);
            int iOooooO0 = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iOooooO0 += o0O0000O.OooooO0(((Integer) list.get(i3)).intValue());
            }
            o0o0000o.OoooOoO(iOooooO0);
            while (i2 < list.size()) {
                o0o0000o.OoooOoO(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        o0O00O0o o0o00o0o = (o0O00O0o) list;
        if (!z) {
            while (i2 < o0o00o0o.f27093OooOo) {
                o0o0000o.OoooOo0(i, o0o00o0o.OooO0o0(i2));
                i2++;
            }
            return;
        }
        o0o0000o.OoooOOo(i, 2);
        int iOooooO02 = 0;
        for (int i4 = 0; i4 < o0o00o0o.f27093OooOo; i4++) {
            iOooooO02 += o0O0000O.OooooO0(o0o00o0o.OooO0o0(i4));
        }
        o0o0000o.OoooOoO(iOooooO02);
        while (i2 < o0o00o0o.f27093OooOo) {
            o0o0000o.OoooOoO(o0o00o0o.OooO0o0(i2));
            i2++;
        }
    }

    public static void OooO0Oo(int i, List list, o0O0O0o0 o0o0o0o0, boolean z) throws pz0 {
        if (list == null || list.isEmpty()) {
            return;
        }
        o0O0000O o0o0000o = (o0O0000O) o0o0o0o0.f27109OooO00o;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                o0o0000o.OoooOoo(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        o0o0000o.OoooOOo(i, 2);
        int iOooo0oO = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iOooo0oO += o0O0000O.Oooo0oO(((Long) list.get(i3)).longValue());
        }
        o0o0000o.OoooOoO(iOooo0oO);
        while (i2 < list.size()) {
            o0o0000o.Ooooo00(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static int OooO0o(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof o0O00O0o)) {
            int iOooo0oO = 0;
            while (i < size) {
                iOooo0oO += o0O0000O.Oooo0oO(((Integer) list.get(i)).intValue());
                i++;
            }
            return iOooo0oO;
        }
        o0O00O0o o0o00o0o = (o0O00O0o) list;
        int iOooo0oO2 = 0;
        while (i < size) {
            iOooo0oO2 += o0O0000O.Oooo0oO(o0o00o0o.OooO0o0(i));
            i++;
        }
        return iOooo0oO2;
    }

    public static boolean OooO0o0(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int OooO0oO(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (o0O0000O.OooooO0(i << 3) + 4) * size;
    }

    public static int OooO0oo(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (o0O0000O.OooooO0(i << 3) + 8) * size;
    }

    public static int OooOO0(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iOooo0oO = 0;
        for (int i = 0; i < size; i++) {
            iOooo0oO += o0O0000O.Oooo0oO(((Long) list.get(i)).longValue());
        }
        return iOooo0oO;
    }

    public static int OooOO0O(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof o0O00O0o)) {
            int iOooooO0 = 0;
            while (i < size) {
                int iIntValue = ((Integer) list.get(i)).intValue();
                iOooooO0 += o0O0000O.OooooO0((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i++;
            }
            return iOooooO0;
        }
        o0O00O0o o0o00o0o = (o0O00O0o) list;
        int iOooooO02 = 0;
        while (i < size) {
            int iOooO0o0 = o0o00o0o.OooO0o0(i);
            iOooooO02 += o0O0000O.OooooO0((iOooO0o0 >> 31) ^ (iOooO0o0 + iOooO0o0));
            i++;
        }
        return iOooooO02;
    }

    public static int OooOO0o(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iOooo0oO = 0;
        for (int i = 0; i < size; i++) {
            long jLongValue = ((Long) list.get(i)).longValue();
            iOooo0oO += o0O0000O.Oooo0oO((jLongValue >> 63) ^ (jLongValue + jLongValue));
        }
        return iOooo0oO;
    }

    public static int OooOOO(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iOooo0oO = 0;
        for (int i = 0; i < size; i++) {
            iOooo0oO += o0O0000O.Oooo0oO(((Long) list.get(i)).longValue());
        }
        return iOooo0oO;
    }

    public static int OooOOO0(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof o0O00O0o)) {
            int iOooooO0 = 0;
            while (i < size) {
                iOooooO0 += o0O0000O.OooooO0(((Integer) list.get(i)).intValue());
                i++;
            }
            return iOooooO0;
        }
        o0O00O0o o0o00o0o = (o0O00O0o) list;
        int iOooooO02 = 0;
        while (i < size) {
            iOooooO02 += o0O0000O.OooooO0(o0o00o0o.OooO0o0(i));
            i++;
        }
        return iOooooO02;
    }

    public static Object OooOOOO(int i, Object obj, int i2, Object obj2) {
        Object obj3 = obj2;
        if (obj2 == null) {
            o0OoO00O o0ooo00o = (o0OoO00O) obj;
            o0OO00o0 o0oo00o0 = o0ooo00o.zzc;
            obj3 = o0oo00o0;
            if (o0oo00o0 == o0OO00o0.f27139OooO0o) {
                o0OO00o0 o0oo00o0OooO0O0 = o0OO00o0.OooO0O0();
                o0ooo00o.zzc = o0oo00o0OooO0O0;
                obj3 = o0oo00o0OooO0O0;
            }
        }
        ((o0OO00o0) obj3).OooO0OO(i << 3, Long.valueOf(i2));
        return obj3;
    }

    public static void OooOOOo(Object obj, Object obj2) {
        o0OoO00O o0ooo00o = (o0OoO00O) obj;
        o0OO00o0 o0oo00o0 = o0ooo00o.zzc;
        o0OO00o0 o0oo00o02 = ((o0OoO00O) obj2).zzc;
        o0OO00o0 o0oo00o03 = o0OO00o0.f27139OooO0o;
        if (!o0oo00o03.equals(o0oo00o02)) {
            if (o0oo00o03.equals(o0oo00o0)) {
                int i = o0oo00o0.f27140OooO00o + o0oo00o02.f27140OooO00o;
                int[] iArrCopyOf = Arrays.copyOf(o0oo00o0.f27141OooO0O0, i);
                System.arraycopy(o0oo00o02.f27141OooO0O0, 0, iArrCopyOf, o0oo00o0.f27140OooO00o, o0oo00o02.f27140OooO00o);
                Object[] objArrCopyOf = Arrays.copyOf(o0oo00o0.f27142OooO0OO, i);
                System.arraycopy(o0oo00o02.f27142OooO0OO, 0, objArrCopyOf, o0oo00o0.f27140OooO00o, o0oo00o02.f27140OooO00o);
                o0oo00o0 = new o0OO00o0(i, iArrCopyOf, objArrCopyOf, true);
            } else {
                o0oo00o0.getClass();
                if (!o0oo00o02.equals(o0oo00o03)) {
                    if (!o0oo00o0.f27144OooO0o0) {
                        throw new UnsupportedOperationException();
                    }
                    int i2 = o0oo00o0.f27140OooO00o + o0oo00o02.f27140OooO00o;
                    o0oo00o0.OooO0o0(i2);
                    System.arraycopy(o0oo00o02.f27141OooO0O0, 0, o0oo00o0.f27141OooO0O0, o0oo00o0.f27140OooO00o, o0oo00o02.f27140OooO00o);
                    System.arraycopy(o0oo00o02.f27142OooO0OO, 0, o0oo00o0.f27142OooO0OO, o0oo00o0.f27140OooO00o, o0oo00o02.f27140OooO00o);
                    o0oo00o0.f27140OooO00o = i2;
                }
            }
        }
        o0ooo00o.zzc = o0oo00o0;
    }

    public static void OooOOo(int i, List list, o0O0O0o0 o0o0o0o0, boolean z) throws pz0 {
        if (list == null || list.isEmpty()) {
            return;
        }
        o0O0000O o0o0000o = (o0O0000O) o0o0o0o0.f27109OooO00o;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                o0o0000o.OoooO0O(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        o0o0000o.OoooOOo(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Double) list.get(i4)).getClass();
            i3 += 8;
        }
        o0o0000o.OoooOoO(i3);
        while (i2 < list.size()) {
            o0o0000o.OoooO(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    public static void OooOOo0(int i, List list, o0O0O0o0 o0o0o0o0, boolean z) throws pz0 {
        IndexOutOfBoundsException indexOutOfBoundsException;
        int i2;
        IndexOutOfBoundsException indexOutOfBoundsException2;
        int i3;
        if (list == null || list.isEmpty()) {
            return;
        }
        o0O0000O o0o0000o = (o0O0000O) o0o0o0o0.f27109OooO00o;
        int i4 = 0;
        if (!z) {
            while (i4 < list.size()) {
                byte bBooleanValue = ((Boolean) list.get(i4)).booleanValue();
                o0o0000o.OoooOoO(i << 3);
                int i5 = o0o0000o.f27085OooOoO;
                try {
                    i2 = i5 + 1;
                } catch (IndexOutOfBoundsException e) {
                    indexOutOfBoundsException = e;
                }
                try {
                    o0o0000o.f27083OooOo[i5] = bBooleanValue;
                    o0o0000o.f27085OooOoO = i2;
                    i4++;
                } catch (IndexOutOfBoundsException e2) {
                    indexOutOfBoundsException = e2;
                    i5 = i2;
                    throw new pz0(i5, o0o0000o.f27086OooOoO0, 1, indexOutOfBoundsException, 3);
                }
            }
            return;
        }
        o0o0000o.OoooOOo(i, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            ((Boolean) list.get(i7)).getClass();
            i6++;
        }
        o0o0000o.OoooOoO(i6);
        while (i4 < list.size()) {
            byte bBooleanValue2 = ((Boolean) list.get(i4)).booleanValue();
            int i8 = o0o0000o.f27085OooOoO;
            try {
                i3 = i8 + 1;
            } catch (IndexOutOfBoundsException e3) {
                indexOutOfBoundsException2 = e3;
            }
            try {
                o0o0000o.f27083OooOo[i8] = bBooleanValue2;
                o0o0000o.f27085OooOoO = i3;
                i4++;
            } catch (IndexOutOfBoundsException e4) {
                indexOutOfBoundsException2 = e4;
                i8 = i3;
                throw new pz0(i8, o0o0000o.f27086OooOoO0, 1, indexOutOfBoundsException2, 3);
            }
        }
    }

    public static void OooOOoo(int i, List list, o0O0O0o0 o0o0o0o0, boolean z) throws pz0 {
        if (list == null || list.isEmpty()) {
            return;
        }
        o0o0o0o0.getClass();
        boolean z2 = list instanceof o0O00O0o;
        int i2 = 0;
        o0O0000O o0o0000o = (o0O0000O) o0o0o0o0.f27109OooO00o;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    o0o0000o.OoooOO0(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            o0o0000o.OoooOOo(i, 2);
            int iOooo0oO = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iOooo0oO += o0O0000O.Oooo0oO(((Integer) list.get(i3)).intValue());
            }
            o0o0000o.OoooOoO(iOooo0oO);
            while (i2 < list.size()) {
                o0o0000o.o000oOoO(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        o0O00O0o o0o00o0o = (o0O00O0o) list;
        if (!z) {
            while (i2 < o0o00o0o.f27093OooOo) {
                o0o0000o.OoooOO0(i, o0o00o0o.OooO0o0(i2));
                i2++;
            }
            return;
        }
        o0o0000o.OoooOOo(i, 2);
        int iOooo0oO2 = 0;
        for (int i4 = 0; i4 < o0o00o0o.f27093OooOo; i4++) {
            iOooo0oO2 += o0O0000O.Oooo0oO(o0o00o0o.OooO0o0(i4));
        }
        o0o0000o.OoooOoO(iOooo0oO2);
        while (i2 < o0o00o0o.f27093OooOo) {
            o0o0000o.o000oOoO(o0o00o0o.OooO0o0(i2));
            i2++;
        }
    }

    public static void OooOo(int i, List list, o0O0O0o0 o0o0o0o0, boolean z) throws pz0 {
        if (list == null || list.isEmpty()) {
            return;
        }
        o0O0000O o0o0000o = (o0O0000O) o0o0o0o0.f27109OooO00o;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                o0o0000o.OoooOoo(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        o0o0000o.OoooOOo(i, 2);
        int iOooo0oO = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iOooo0oO += o0O0000O.Oooo0oO(((Long) list.get(i3)).longValue());
        }
        o0o0000o.OoooOoO(iOooo0oO);
        while (i2 < list.size()) {
            o0o0000o.Ooooo00(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void OooOo0(int i, List list, o0O0O0o0 o0o0o0o0, boolean z) throws pz0 {
        if (list == null || list.isEmpty()) {
            return;
        }
        o0O0000O o0o0000o = (o0O0000O) o0o0o0o0.f27109OooO00o;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                o0o0000o.OoooO0O(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        o0o0000o.OoooOOo(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            i3 += 8;
        }
        o0o0000o.OoooOoO(i3);
        while (i2 < list.size()) {
            o0o0000o.OoooO(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void OooOo00(int i, List list, o0O0O0o0 o0o0o0o0, boolean z) throws pz0 {
        if (list == null || list.isEmpty()) {
            return;
        }
        o0o0o0o0.getClass();
        boolean z2 = list instanceof o0O00O0o;
        int i2 = 0;
        o0O0000O o0o0000o = (o0O0000O) o0o0o0o0.f27109OooO00o;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    o0o0000o.OoooO00(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            o0o0000o.OoooOOo(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                i3 += 4;
            }
            o0o0000o.OoooOoO(i3);
            while (i2 < list.size()) {
                o0o0000o.OoooO0(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        o0O00O0o o0o00o0o = (o0O00O0o) list;
        if (!z) {
            while (i2 < o0o00o0o.f27093OooOo) {
                o0o0000o.OoooO00(i, o0o00o0o.OooO0o0(i2));
                i2++;
            }
            return;
        }
        o0o0000o.OoooOOo(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < o0o00o0o.f27093OooOo; i6++) {
            o0o00o0o.OooO0o0(i6);
            i5 += 4;
        }
        o0o0000o.OoooOoO(i5);
        while (i2 < o0o00o0o.f27093OooOo) {
            o0o0000o.OoooO0(o0o00o0o.OooO0o0(i2));
            i2++;
        }
    }

    public static void OooOo0O(int i, List list, o0O0O0o0 o0o0o0o0, boolean z) throws pz0 {
        if (list == null || list.isEmpty()) {
            return;
        }
        o0O0000O o0o0000o = (o0O0000O) o0o0o0o0.f27109OooO00o;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                o0o0000o.OoooO00(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        o0o0000o.OoooOOo(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Float) list.get(i4)).getClass();
            i3 += 4;
        }
        o0o0000o.OoooOoO(i3);
        while (i2 < list.size()) {
            o0o0000o.OoooO0(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    public static void OooOo0o(int i, List list, o0O0O0o0 o0o0o0o0, boolean z) throws pz0 {
        if (list == null || list.isEmpty()) {
            return;
        }
        o0o0o0o0.getClass();
        boolean z2 = list instanceof o0O00O0o;
        int i2 = 0;
        o0O0000O o0o0000o = (o0O0000O) o0o0o0o0.f27109OooO00o;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    o0o0000o.OoooOO0(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            o0o0000o.OoooOOo(i, 2);
            int iOooo0oO = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iOooo0oO += o0O0000O.Oooo0oO(((Integer) list.get(i3)).intValue());
            }
            o0o0000o.OoooOoO(iOooo0oO);
            while (i2 < list.size()) {
                o0o0000o.o000oOoO(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        o0O00O0o o0o00o0o = (o0O00O0o) list;
        if (!z) {
            while (i2 < o0o00o0o.f27093OooOo) {
                o0o0000o.OoooOO0(i, o0o00o0o.OooO0o0(i2));
                i2++;
            }
            return;
        }
        o0o0000o.OoooOOo(i, 2);
        int iOooo0oO2 = 0;
        for (int i4 = 0; i4 < o0o00o0o.f27093OooOo; i4++) {
            iOooo0oO2 += o0O0000O.Oooo0oO(o0o00o0o.OooO0o0(i4));
        }
        o0o0000o.OoooOoO(iOooo0oO2);
        while (i2 < o0o00o0o.f27093OooOo) {
            o0o0000o.o000oOoO(o0o00o0o.OooO0o0(i2));
            i2++;
        }
    }

    public static void OooOoO(int i, List list, o0O0O0o0 o0o0o0o0, boolean z) throws pz0 {
        if (list == null || list.isEmpty()) {
            return;
        }
        o0O0000O o0o0000o = (o0O0000O) o0o0o0o0.f27109OooO00o;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                o0o0000o.OoooO0O(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        o0o0000o.OoooOOo(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            i3 += 8;
        }
        o0o0000o.OoooOoO(i3);
        while (i2 < list.size()) {
            o0o0000o.OoooO(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void OooOoO0(int i, List list, o0O0O0o0 o0o0o0o0, boolean z) throws pz0 {
        if (list == null || list.isEmpty()) {
            return;
        }
        o0o0o0o0.getClass();
        boolean z2 = list instanceof o0O00O0o;
        int i2 = 0;
        o0O0000O o0o0000o = (o0O0000O) o0o0o0o0.f27109OooO00o;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    o0o0000o.OoooO00(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            o0o0000o.OoooOOo(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                i3 += 4;
            }
            o0o0000o.OoooOoO(i3);
            while (i2 < list.size()) {
                o0o0000o.OoooO0(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        o0O00O0o o0o00o0o = (o0O00O0o) list;
        if (!z) {
            while (i2 < o0o00o0o.f27093OooOo) {
                o0o0000o.OoooO00(i, o0o00o0o.OooO0o0(i2));
                i2++;
            }
            return;
        }
        o0o0000o.OoooOOo(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < o0o00o0o.f27093OooOo; i6++) {
            o0o00o0o.OooO0o0(i6);
            i5 += 4;
        }
        o0o0000o.OoooOoO(i5);
        while (i2 < o0o00o0o.f27093OooOo) {
            o0o0000o.OoooO0(o0o00o0o.OooO0o0(i2));
            i2++;
        }
    }
}
