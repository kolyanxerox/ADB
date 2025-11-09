package com.google.crypto.tink.shaded.protobuf;

import com.google.android.gms.internal.ads.pz0;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public abstract class o000O {

    /* renamed from: OooO00o, reason: collision with root package name */
    public static final Class f28083OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public static final o00 f28084OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public static final o00 f28085OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public static final o00 f28086OooO0Oo;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.crypto.tink.shaded.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            cls = null;
        }
        f28083OooO00o = cls;
        f28084OooO0O0 = OooOo0o(false);
        f28085OooO0OO = OooOo0o(true);
        f28086OooO0Oo = new o00();
    }

    public static int OooO(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof o0OOO0o) {
            o0OOO0o o0ooo0o = (o0OOO0o) list;
            if (size <= 0) {
                return 0;
            }
            o0ooo0o.OooO0o0(0);
            throw null;
        }
        int iOooOo0O = 0;
        for (int i = 0; i < size; i++) {
            iOooOo0O += OooOo00.OooOo0O(((Integer) list.get(i)).intValue());
        }
        return iOooOo0O;
    }

    public static int OooO00o(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iOooOo = OooOo00.OooOo(i) * size;
        for (int i2 = 0; i2 < list.size(); i2++) {
            iOooOo += OooOo00.OooOOo((OooOOO0) list.get(i2));
        }
        return iOooOo;
    }

    public static int OooO0O0(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (OooOo00.OooOo(i) * size) + OooO0OO(list);
    }

    public static int OooO0OO(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof o0OOO0o) {
            o0OOO0o o0ooo0o = (o0OOO0o) list;
            if (size <= 0) {
                return 0;
            }
            o0ooo0o.OooO0o0(0);
            throw null;
        }
        int iOooOo0O = 0;
        for (int i = 0; i < size; i++) {
            iOooOo0O += OooOo00.OooOo0O(((Integer) list.get(i)).intValue());
        }
        return iOooOo0O;
    }

    public static int OooO0Oo(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return OooOo00.OooOOoo(i) * size;
    }

    public static int OooO0o(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return OooOo00.OooOo00(i) * size;
    }

    public static int OooO0o0(List list) {
        return list.size() * 4;
    }

    public static int OooO0oO(List list) {
        return list.size() * 8;
    }

    public static int OooO0oo(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (OooOo00.OooOo(i) * size) + OooO(list);
    }

    public static int OooOO0(int i, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return (OooOo00.OooOo(i) * list.size()) + OooOO0O(list);
    }

    public static int OooOO0O(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof o0000Ooo) {
            o0000Ooo o0000ooo = (o0000Ooo) list;
            if (size <= 0) {
                return 0;
            }
            o0000ooo.OooO0o0(0);
            throw null;
        }
        int iOooOoO = 0;
        for (int i = 0; i < size; i++) {
            iOooOoO += OooOo00.OooOoO(((Long) list.get(i)).longValue());
        }
        return iOooOoO;
    }

    public static int OooOO0o(int i, List list, o000O0O0 o000o0o02) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iOooOo = OooOo00.OooOo(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            int iOooO00o = ((OooO00o) list.get(i2)).OooO00o(o000o0o02);
            iOooOo += OooOo00.OooOoO0(iOooO00o) + iOooO00o;
        }
        return iOooOo;
    }

    public static int OooOOO(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof o0OOO0o) {
            o0OOO0o o0ooo0o = (o0OOO0o) list;
            if (size <= 0) {
                return 0;
            }
            o0ooo0o.OooO0o0(0);
            throw null;
        }
        int iOooOoO0 = 0;
        for (int i = 0; i < size; i++) {
            int iIntValue = ((Integer) list.get(i)).intValue();
            iOooOoO0 += OooOo00.OooOoO0((iIntValue >> 31) ^ (iIntValue << 1));
        }
        return iOooOoO0;
    }

    public static int OooOOO0(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (OooOo00.OooOo(i) * size) + OooOOO(list);
    }

    public static int OooOOOO(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (OooOo00.OooOo(i) * size) + OooOOOo(list);
    }

    public static int OooOOOo(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof o0000Ooo) {
            o0000Ooo o0000ooo = (o0000Ooo) list;
            if (size <= 0) {
                return 0;
            }
            o0000ooo.OooO0o0(0);
            throw null;
        }
        int iOooOoO = 0;
        for (int i = 0; i < size; i++) {
            long jLongValue = ((Long) list.get(i)).longValue();
            iOooOoO += OooOo00.OooOoO((jLongValue >> 63) ^ (jLongValue << 1));
        }
        return iOooOoO;
    }

    public static int OooOOo(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (OooOo00.OooOo(i) * size) + OooOOoo(list);
    }

    public static int OooOOo0(int i, List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int iOooOo = OooOo00.OooOo(i) * size;
        if (!(list instanceof o00000)) {
            while (i2 < size) {
                Object obj = list.get(i2);
                iOooOo = (obj instanceof OooOOO0 ? OooOo00.OooOOo((OooOOO0) obj) : OooOo00.OooOo0o((String) obj)) + iOooOo;
                i2++;
            }
            return iOooOo;
        }
        o00000 o00000Var = (o00000) list;
        while (i2 < size) {
            Object raw = o00000Var.getRaw(i2);
            iOooOo = (raw instanceof OooOOO0 ? OooOo00.OooOOo((OooOOO0) raw) : OooOo00.OooOo0o((String) raw)) + iOooOo;
            i2++;
        }
        return iOooOo;
    }

    public static int OooOOoo(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof o0OOO0o) {
            o0OOO0o o0ooo0o = (o0OOO0o) list;
            if (size <= 0) {
                return 0;
            }
            o0ooo0o.OooO0o0(0);
            throw null;
        }
        int iOooOoO0 = 0;
        for (int i = 0; i < size; i++) {
            iOooOoO0 += OooOo00.OooOoO0(((Integer) list.get(i)).intValue());
        }
        return iOooOoO0;
    }

    public static void OooOo(o00 o00Var, Object obj, Object obj2) {
        o00Var.getClass();
        o0ooOOo o0ooooo = (o0ooOOo) obj;
        o000OOo0 o000ooo02 = o0ooooo.unknownFields;
        o000OOo0 o000ooo03 = ((o0ooOOo) obj2).unknownFields;
        o000OOo0 o000ooo04 = o000OOo0.f28101OooO0o;
        if (!o000ooo04.equals(o000ooo03)) {
            if (o000ooo04.equals(o000ooo02)) {
                int i = o000ooo02.f28102OooO00o + o000ooo03.f28102OooO00o;
                int[] iArrCopyOf = Arrays.copyOf(o000ooo02.f28103OooO0O0, i);
                System.arraycopy(o000ooo03.f28103OooO0O0, 0, iArrCopyOf, o000ooo02.f28102OooO00o, o000ooo03.f28102OooO00o);
                Object[] objArrCopyOf = Arrays.copyOf(o000ooo02.f28104OooO0OO, i);
                System.arraycopy(o000ooo03.f28104OooO0OO, 0, objArrCopyOf, o000ooo02.f28102OooO00o, o000ooo03.f28102OooO00o);
                o000ooo02 = new o000OOo0(i, iArrCopyOf, objArrCopyOf, true);
            } else {
                o000ooo02.getClass();
                if (!o000ooo03.equals(o000ooo04)) {
                    if (!o000ooo02.f28106OooO0o0) {
                        throw new UnsupportedOperationException();
                    }
                    int i2 = o000ooo02.f28102OooO00o + o000ooo03.f28102OooO00o;
                    o000ooo02.OooO00o(i2);
                    System.arraycopy(o000ooo03.f28103OooO0O0, 0, o000ooo02.f28103OooO0O0, o000ooo02.f28102OooO00o, o000ooo03.f28102OooO00o);
                    System.arraycopy(o000ooo03.f28104OooO0OO, 0, o000ooo02.f28104OooO0OO, o000ooo02.f28102OooO00o, o000ooo03.f28102OooO00o);
                    o000ooo02.f28102OooO00o = i2;
                }
            }
        }
        o0ooooo.unknownFields = o000ooo02;
    }

    public static int OooOo0(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof o0000Ooo) {
            o0000Ooo o0000ooo = (o0000Ooo) list;
            if (size <= 0) {
                return 0;
            }
            o0000ooo.OooO0o0(0);
            throw null;
        }
        int iOooOoO = 0;
        for (int i = 0; i < size; i++) {
            iOooOoO += OooOo00.OooOoO(((Long) list.get(i)).longValue());
        }
        return iOooOoO;
    }

    public static int OooOo00(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (OooOo00.OooOo(i) * size) + OooOo0(list);
    }

    public static o00 OooOo0o(boolean z) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.crypto.tink.shaded.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls != null) {
            try {
                return (o00) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
            } catch (Throwable unused2) {
            }
        }
        return null;
    }

    public static void OooOoO(int i, List list, o0000O00 o0000o00, boolean z) throws pz0 {
        if (list == null || list.isEmpty()) {
            return;
        }
        OooOo00 oooOo00 = (OooOo00) o0000o00.f28077OooO00o;
        if (!z) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                boolean zBooleanValue = ((Boolean) list.get(i2)).booleanValue();
                oooOo00.Oooo00o(i, 0);
                oooOo00.OooOoOO(zBooleanValue ? (byte) 1 : (byte) 0);
            }
            return;
        }
        oooOo00.Oooo00o(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Boolean) list.get(i4)).getClass();
            Logger logger = OooOo00.f28035OooO0oO;
            i3++;
        }
        oooOo00.Oooo0(i3);
        for (int i5 = 0; i5 < list.size(); i5++) {
            oooOo00.OooOoOO(((Boolean) list.get(i5)).booleanValue() ? (byte) 1 : (byte) 0);
        }
    }

    public static boolean OooOoO0(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void OooOoOO(int i, List list, o0000O00 o0000o00) throws pz0 {
        if (list == null || list.isEmpty()) {
            return;
        }
        o0000o00.getClass();
        for (int i2 = 0; i2 < list.size(); i2++) {
            OooOOO0 oooOOO0 = (OooOOO0) list.get(i2);
            OooOo00 oooOo00 = (OooOo00) o0000o00.f28077OooO00o;
            oooOo00.Oooo00o(i, 2);
            oooOo00.Oooo0(oooOOO0.size());
            OooOO0O oooOO0O = (OooOO0O) oooOOO0;
            oooOo00.OooOoo0(oooOO0O.f28016OooOoO0, oooOO0O.OooOO0O(), oooOO0O.size());
        }
    }

    public static void OooOoo(int i, List list, o0000O00 o0000o00, boolean z) throws pz0 {
        if (list == null || list.isEmpty()) {
            return;
        }
        OooOo00 oooOo00 = (OooOo00) o0000o00.f28077OooO00o;
        if (!z) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                int iIntValue = ((Integer) list.get(i2)).intValue();
                oooOo00.Oooo00o(i, 0);
                oooOo00.Oooo00O(iIntValue);
            }
            return;
        }
        oooOo00.Oooo00o(i, 2);
        int iOooOo0O = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iOooOo0O += OooOo00.OooOo0O(((Integer) list.get(i3)).intValue());
        }
        oooOo00.Oooo0(iOooOo0O);
        for (int i4 = 0; i4 < list.size(); i4++) {
            oooOo00.Oooo00O(((Integer) list.get(i4)).intValue());
        }
    }

    public static void OooOoo0(int i, List list, o0000O00 o0000o00, boolean z) throws pz0 {
        if (list == null || list.isEmpty()) {
            return;
        }
        OooOo00 oooOo00 = (OooOo00) o0000o00.f28077OooO00o;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                double dDoubleValue = ((Double) list.get(i2)).doubleValue();
                oooOo00.getClass();
                oooOo00.OooOooo(i, Double.doubleToRawLongBits(dDoubleValue));
                i2++;
            }
            return;
        }
        oooOo00.Oooo00o(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Double) list.get(i4)).getClass();
            Logger logger = OooOo00.f28035OooO0oO;
            i3 += 8;
        }
        oooOo00.Oooo0(i3);
        while (i2 < list.size()) {
            oooOo00.Oooo000(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    public static void OooOooO(int i, List list, o0000O00 o0000o00, boolean z) throws pz0 {
        if (list == null || list.isEmpty()) {
            return;
        }
        OooOo00 oooOo00 = (OooOo00) o0000o00.f28077OooO00o;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                oooOo00.OooOoo(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        oooOo00.Oooo00o(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).getClass();
            Logger logger = OooOo00.f28035OooO0oO;
            i3 += 4;
        }
        oooOo00.Oooo0(i3);
        while (i2 < list.size()) {
            oooOo00.OooOooO(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void OooOooo(int i, List list, o0000O00 o0000o00, boolean z) throws pz0 {
        if (list == null || list.isEmpty()) {
            return;
        }
        OooOo00 oooOo00 = (OooOo00) o0000o00.f28077OooO00o;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                oooOo00.OooOooo(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        oooOo00.Oooo00o(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            Logger logger = OooOo00.f28035OooO0oO;
            i3 += 8;
        }
        oooOo00.Oooo0(i3);
        while (i2 < list.size()) {
            oooOo00.Oooo000(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void Oooo(int i, List list, o0000O00 o0000o00, boolean z) throws pz0 {
        if (list == null || list.isEmpty()) {
            return;
        }
        OooOo00 oooOo00 = (OooOo00) o0000o00.f28077OooO00o;
        if (!z) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                int iIntValue = ((Integer) list.get(i2)).intValue();
                oooOo00.Oooo00o(i, 0);
                oooOo00.Oooo0(iIntValue);
            }
            return;
        }
        oooOo00.Oooo00o(i, 2);
        int iOooOoO0 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iOooOoO0 += OooOo00.OooOoO0(((Integer) list.get(i3)).intValue());
        }
        oooOo00.Oooo0(iOooOoO0);
        for (int i4 = 0; i4 < list.size(); i4++) {
            oooOo00.Oooo0(((Integer) list.get(i4)).intValue());
        }
    }

    public static void Oooo0(int i, List list, o0000O00 o0000o00, boolean z) throws pz0 {
        if (list == null || list.isEmpty()) {
            return;
        }
        OooOo00 oooOo00 = (OooOo00) o0000o00.f28077OooO00o;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                oooOo00.Oooo0O0(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        oooOo00.Oooo00o(i, 2);
        int iOooOoO = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iOooOoO += OooOo00.OooOoO(((Long) list.get(i3)).longValue());
        }
        oooOo00.Oooo0(iOooOoO);
        while (i2 < list.size()) {
            oooOo00.Oooo0OO(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void Oooo000(int i, List list, o0000O00 o0000o00, boolean z) throws pz0 {
        if (list == null || list.isEmpty()) {
            return;
        }
        OooOo00 oooOo00 = (OooOo00) o0000o00.f28077OooO00o;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                float fFloatValue = ((Float) list.get(i2)).floatValue();
                oooOo00.getClass();
                oooOo00.OooOoo(i, Float.floatToRawIntBits(fFloatValue));
                i2++;
            }
            return;
        }
        oooOo00.Oooo00o(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Float) list.get(i4)).getClass();
            Logger logger = OooOo00.f28035OooO0oO;
            i3 += 4;
        }
        oooOo00.Oooo0(i3);
        while (i2 < list.size()) {
            oooOo00.OooOooO(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    public static void Oooo00O(int i, List list, o0000O00 o0000o00, o000O0O0 o000o0o02) throws pz0 {
        if (list == null || list.isEmpty()) {
            return;
        }
        o0000o00.getClass();
        for (int i2 = 0; i2 < list.size(); i2++) {
            o0000o00.OooO0O0(i, list.get(i2), o000o0o02);
        }
    }

    public static void Oooo00o(int i, List list, o0000O00 o0000o00, boolean z) throws pz0 {
        if (list == null || list.isEmpty()) {
            return;
        }
        OooOo00 oooOo00 = (OooOo00) o0000o00.f28077OooO00o;
        if (!z) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                int iIntValue = ((Integer) list.get(i2)).intValue();
                oooOo00.Oooo00o(i, 0);
                oooOo00.Oooo00O(iIntValue);
            }
            return;
        }
        oooOo00.Oooo00o(i, 2);
        int iOooOo0O = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iOooOo0O += OooOo00.OooOo0O(((Integer) list.get(i3)).intValue());
        }
        oooOo00.Oooo0(iOooOo0O);
        for (int i4 = 0; i4 < list.size(); i4++) {
            oooOo00.Oooo00O(((Integer) list.get(i4)).intValue());
        }
    }

    public static void Oooo0O0(int i, List list, o0000O00 o0000o00, o000O0O0 o000o0o02) throws pz0 {
        if (list == null || list.isEmpty()) {
            return;
        }
        o0000o00.getClass();
        for (int i2 = 0; i2 < list.size(); i2++) {
            o0000o00.OooO0OO(i, list.get(i2), o000o0o02);
        }
    }

    public static void Oooo0OO(int i, List list, o0000O00 o0000o00, boolean z) throws pz0 {
        if (list == null || list.isEmpty()) {
            return;
        }
        OooOo00 oooOo00 = (OooOo00) o0000o00.f28077OooO00o;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                oooOo00.OooOoo(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        oooOo00.Oooo00o(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).getClass();
            Logger logger = OooOo00.f28035OooO0oO;
            i3 += 4;
        }
        oooOo00.Oooo0(i3);
        while (i2 < list.size()) {
            oooOo00.OooOooO(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void Oooo0o(int i, List list, o0000O00 o0000o00, boolean z) throws pz0 {
        if (list == null || list.isEmpty()) {
            return;
        }
        OooOo00 oooOo00 = (OooOo00) o0000o00.f28077OooO00o;
        if (!z) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                int iIntValue = ((Integer) list.get(i2)).intValue();
                oooOo00.Oooo00o(i, 0);
                oooOo00.Oooo0((iIntValue >> 31) ^ (iIntValue << 1));
            }
            return;
        }
        oooOo00.Oooo00o(i, 2);
        int iOooOoO0 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            int iIntValue2 = ((Integer) list.get(i3)).intValue();
            iOooOoO0 += OooOo00.OooOoO0((iIntValue2 >> 31) ^ (iIntValue2 << 1));
        }
        oooOo00.Oooo0(iOooOoO0);
        for (int i4 = 0; i4 < list.size(); i4++) {
            int iIntValue3 = ((Integer) list.get(i4)).intValue();
            oooOo00.Oooo0((iIntValue3 >> 31) ^ (iIntValue3 << 1));
        }
    }

    public static void Oooo0o0(int i, List list, o0000O00 o0000o00, boolean z) throws pz0 {
        if (list == null || list.isEmpty()) {
            return;
        }
        OooOo00 oooOo00 = (OooOo00) o0000o00.f28077OooO00o;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                oooOo00.OooOooo(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        oooOo00.Oooo00o(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            Logger logger = OooOo00.f28035OooO0oO;
            i3 += 8;
        }
        oooOo00.Oooo0(i3);
        while (i2 < list.size()) {
            oooOo00.Oooo000(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void Oooo0oO(int i, List list, o0000O00 o0000o00, boolean z) throws pz0 {
        if (list == null || list.isEmpty()) {
            return;
        }
        OooOo00 oooOo00 = (OooOo00) o0000o00.f28077OooO00o;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                long jLongValue = ((Long) list.get(i2)).longValue();
                oooOo00.Oooo0O0(i, (jLongValue >> 63) ^ (jLongValue << 1));
                i2++;
            }
            return;
        }
        oooOo00.Oooo00o(i, 2);
        int iOooOoO = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            long jLongValue2 = ((Long) list.get(i3)).longValue();
            iOooOoO += OooOo00.OooOoO((jLongValue2 >> 63) ^ (jLongValue2 << 1));
        }
        oooOo00.Oooo0(iOooOoO);
        while (i2 < list.size()) {
            long jLongValue3 = ((Long) list.get(i2)).longValue();
            oooOo00.Oooo0OO((jLongValue3 >> 63) ^ (jLongValue3 << 1));
            i2++;
        }
    }

    public static void Oooo0oo(int i, List list, o0000O00 o0000o00) throws pz0 {
        if (list == null || list.isEmpty()) {
            return;
        }
        o0000o00.getClass();
        boolean z = list instanceof o00000;
        OooOo00 oooOo00 = (OooOo00) o0000o00.f28077OooO00o;
        if (!z) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                String str = (String) list.get(i2);
                oooOo00.Oooo00o(i, 2);
                int i3 = oooOo00.f28039OooO0o;
                try {
                    int iOooOoO0 = OooOo00.OooOoO0(str.length() * 3);
                    int iOooOoO02 = OooOo00.OooOoO0(str.length());
                    byte[] bArr = oooOo00.f28038OooO0Oo;
                    int i4 = oooOo00.f28040OooO0o0;
                    if (iOooOoO02 == iOooOoO0) {
                        int i5 = i3 + iOooOoO02;
                        oooOo00.f28039OooO0o = i5;
                        int iOooOOOO = oo00o.f28133OooO00o.OooOOOO(str, bArr, i5, i4 - i5);
                        oooOo00.f28039OooO0o = i3;
                        oooOo00.Oooo0((iOooOOOO - i3) - iOooOoO02);
                        oooOo00.f28039OooO0o = iOooOOOO;
                    } else {
                        oooOo00.Oooo0(oo00o.OooO0O0(str));
                        int i6 = oooOo00.f28039OooO0o;
                        oooOo00.f28039OooO0o = oo00o.f28133OooO00o.OooOOOO(str, bArr, i6, i4 - i6);
                    }
                } catch (o00O00o0 e) {
                    oooOo00.f28039OooO0o = i3;
                    OooOo00.f28035OooO0oO.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e);
                    byte[] bytes = str.getBytes(oo0o0Oo.f28134OooO00o);
                    try {
                        oooOo00.Oooo0(bytes.length);
                        oooOo00.OooOoo0(bytes, 0, bytes.length);
                    } catch (IndexOutOfBoundsException e2) {
                        throw new pz0(e2);
                    }
                } catch (IndexOutOfBoundsException e3) {
                    throw new pz0(e3);
                }
            }
            return;
        }
        o00000 o00000Var = (o00000) list;
        for (int i7 = 0; i7 < list.size(); i7++) {
            Object raw = o00000Var.getRaw(i7);
            if (raw instanceof String) {
                String str2 = (String) raw;
                oooOo00.Oooo00o(i, 2);
                int i8 = oooOo00.f28039OooO0o;
                try {
                    int iOooOoO03 = OooOo00.OooOoO0(str2.length() * 3);
                    int iOooOoO04 = OooOo00.OooOoO0(str2.length());
                    byte[] bArr2 = oooOo00.f28038OooO0Oo;
                    int i9 = oooOo00.f28040OooO0o0;
                    if (iOooOoO04 == iOooOoO03) {
                        int i10 = i8 + iOooOoO04;
                        oooOo00.f28039OooO0o = i10;
                        int iOooOOOO2 = oo00o.f28133OooO00o.OooOOOO(str2, bArr2, i10, i9 - i10);
                        oooOo00.f28039OooO0o = i8;
                        oooOo00.Oooo0((iOooOOOO2 - i8) - iOooOoO04);
                        oooOo00.f28039OooO0o = iOooOOOO2;
                    } else {
                        oooOo00.Oooo0(oo00o.OooO0O0(str2));
                        int i11 = oooOo00.f28039OooO0o;
                        oooOo00.f28039OooO0o = oo00o.f28133OooO00o.OooOOOO(str2, bArr2, i11, i9 - i11);
                    }
                } catch (o00O00o0 e4) {
                    oooOo00.f28039OooO0o = i8;
                    OooOo00.f28035OooO0oO.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e4);
                    byte[] bytes2 = str2.getBytes(oo0o0Oo.f28134OooO00o);
                    try {
                        oooOo00.Oooo0(bytes2.length);
                        oooOo00.OooOoo0(bytes2, 0, bytes2.length);
                    } catch (IndexOutOfBoundsException e5) {
                        throw new pz0(e5);
                    }
                } catch (IndexOutOfBoundsException e6) {
                    throw new pz0(e6);
                }
            } else {
                OooOOO0 oooOOO0 = (OooOOO0) raw;
                oooOo00.Oooo00o(i, 2);
                oooOo00.Oooo0(oooOOO0.size());
                OooOO0O oooOO0O = (OooOO0O) oooOOO0;
                oooOo00.OooOoo0(oooOO0O.f28016OooOoO0, oooOO0O.OooOO0O(), oooOO0O.size());
            }
        }
    }

    public static void OoooO00(int i, List list, o0000O00 o0000o00, boolean z) throws pz0 {
        if (list == null || list.isEmpty()) {
            return;
        }
        OooOo00 oooOo00 = (OooOo00) o0000o00.f28077OooO00o;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                oooOo00.Oooo0O0(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        oooOo00.Oooo00o(i, 2);
        int iOooOoO = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iOooOoO += OooOo00.OooOoO(((Long) list.get(i3)).longValue());
        }
        oooOo00.Oooo0(iOooOoO);
        while (i2 < list.size()) {
            oooOo00.Oooo0OO(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static Object OooOo0O(Object obj, int i, List list, Object obj2, o00 o00Var) {
        return obj2;
    }
}
