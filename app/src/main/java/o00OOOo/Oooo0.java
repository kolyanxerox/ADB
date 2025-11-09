package o00OOoo;

import java.io.EOFException;
import java.util.ArrayList;
import o000O00.o00O0O0O;
import o00O0.OooOo00;
import o00OOOoO.o0000;
import o00OOOoO.o0000O0;
import o00OOOoO.o000O0Oo;

/* loaded from: classes3.dex */
public abstract class Oooo0 {

    /* renamed from: OooO00o */
    public static final o0000O0 f32611OooO00o;

    /* renamed from: OooO0O0 */
    public static final o0000O0 f32612OooO0O0;

    /* renamed from: OooO0OO */
    public static final o0000O0 f32613OooO0OO;

    /* renamed from: OooO0Oo */
    public static final o0000O0 f32614OooO0Oo;

    /* renamed from: OooO0o0 */
    public static final o0000O0 f32615OooO0o0;

    static {
        o0000O0 o0000o02 = o0000O0.f32553OooOoO0;
        f32611OooO00o = o00O0O0O.OooOOOo("/");
        f32612OooO0O0 = o00O0O0O.OooOOOo("\\");
        f32613OooO0OO = o00O0O0O.OooOOOo("/\\");
        f32614OooO0Oo = o00O0O0O.OooOOOo(".");
        f32615OooO0o0 = o00O0O0O.OooOOOo("..");
    }

    public static final int OooO00o(o000O0Oo o000o0oo2) {
        if (o000o0oo2.f32580OooOo0O.OooO0o0() != 0) {
            o0000O0 o0000o02 = o000o0oo2.f32580OooOo0O;
            if (o0000o02.OooOO0(0) != 47) {
                if (o0000o02.OooOO0(0) == 92) {
                    if (o0000o02.OooO0o0() > 2 && o0000o02.OooOO0(1) == 92) {
                        o0000O0 other = f32612OooO0O0;
                        kotlin.jvm.internal.OooOo.OooO0o0(other, "other");
                        int iOooO0oO = o0000o02.OooO0oO(other.f32555OooOo0O, 2);
                        return iOooO0oO == -1 ? o0000o02.OooO0o0() : iOooO0oO;
                    }
                } else if (o0000o02.OooO0o0() > 2 && o0000o02.OooOO0(1) == 58 && o0000o02.OooOO0(2) == 92) {
                    char cOooOO0 = (char) o0000o02.OooOO0(0);
                    if ('a' <= cOooOO0 && cOooOO0 < '{') {
                        return 3;
                    }
                    if ('A' <= cOooOO0 && cOooOO0 < '[') {
                        return 3;
                    }
                }
            }
            return 1;
        }
        return -1;
    }

    public static final o000O0Oo OooO0O0(o000O0Oo o000o0oo2, o000O0Oo child, boolean z) {
        kotlin.jvm.internal.OooOo.OooO0o0(o000o0oo2, "<this>");
        kotlin.jvm.internal.OooOo.OooO0o0(child, "child");
        if (OooO00o(child) != -1 || child.OooO0oO() != null) {
            return child;
        }
        o0000O0 o0000o0OooO0OO = OooO0OO(o000o0oo2);
        if (o0000o0OooO0OO == null && (o0000o0OooO0OO = OooO0OO(child)) == null) {
            o0000o0OooO0OO = OooO0o(o000O0Oo.f32579OooOo0o);
        }
        o0000 o0000Var = new o0000();
        o0000Var.OooO0o(o000o0oo2.f32580OooOo0O);
        if (o0000Var.f32535OooOo0o > 0) {
            o0000Var.OooO0o(o0000o0OooO0OO);
        }
        o0000Var.OooO0o(child.f32580OooOo0O);
        return OooO0Oo(o0000Var, z);
    }

    public static final o0000O0 OooO0OO(o000O0Oo o000o0oo2) {
        o0000O0 o0000o02 = o000o0oo2.f32580OooOo0O;
        o0000O0 o0000o03 = f32611OooO00o;
        if (o0000O0.OooO0oo(o0000o02, o0000o03) != -1) {
            return o0000o03;
        }
        o0000O0 o0000o04 = f32612OooO0O0;
        if (o0000O0.OooO0oo(o000o0oo2.f32580OooOo0O, o0000o04) != -1) {
            return o0000o04;
        }
        return null;
    }

    public static final o000O0Oo OooO0Oo(o0000 o0000Var, boolean z) throws EOFException {
        o0000O0 o0000o02;
        o0000O0 o0000o03;
        char cOooO00o;
        o0000O0 o0000o04;
        o0000O0 o0000o0OooO0OO;
        o0000 o0000Var2 = new o0000();
        o0000O0 o0000o0OooO0o0 = null;
        int i = 0;
        while (true) {
            if (!o0000Var.OooOO0o(f32611OooO00o)) {
                o0000o02 = f32612OooO0O0;
                if (!o0000Var.OooOO0o(o0000o02)) {
                    break;
                }
            }
            byte b = o0000Var.readByte();
            if (o0000o0OooO0o0 == null) {
                o0000o0OooO0o0 = OooO0o0(b);
            }
            i++;
        }
        boolean z2 = i >= 2 && kotlin.jvm.internal.OooOo.OooO00o(o0000o0OooO0o0, o0000o02);
        o0000O0 o0000o05 = f32613OooO0OO;
        long j = 0;
        if (z2) {
            kotlin.jvm.internal.OooOo.OooO0O0(o0000o0OooO0o0);
            o0000Var2.OooO0o(o0000o0OooO0o0);
            o0000Var2.OooO0o(o0000o0OooO0o0);
        } else if (i > 0) {
            kotlin.jvm.internal.OooOo.OooO0O0(o0000o0OooO0o0);
            o0000Var2.OooO0o(o0000o0OooO0o0);
        } else {
            long jOooO0O0 = o0000Var.OooO0O0(o0000o05);
            if (o0000o0OooO0o0 == null) {
                o0000o0OooO0o0 = jOooO0O0 == -1 ? OooO0o(o000O0Oo.f32579OooOo0o) : OooO0o0(o0000Var.OooO00o(jOooO0O0));
            }
            if (kotlin.jvm.internal.OooOo.OooO00o(o0000o0OooO0o0, o0000o02)) {
                o0000o03 = o0000o0OooO0o0;
                if (o0000Var.f32535OooOo0o >= 2 && o0000Var.OooO00o(1L) == 58 && (('a' <= (cOooO00o = (char) o0000Var.OooO00o(0L)) && cOooO00o < '{') || ('A' <= cOooO00o && cOooO00o < '['))) {
                    if (jOooO0O0 == 2) {
                        o0000Var2.OooOO0(3L, o0000Var);
                    } else {
                        o0000Var2.OooOO0(2L, o0000Var);
                    }
                }
            } else {
                o0000o03 = o0000o0OooO0o0;
            }
            o0000o0OooO0o0 = o0000o03;
        }
        boolean z3 = o0000Var2.f32535OooOo0o > 0;
        ArrayList arrayList = new ArrayList();
        while (true) {
            boolean zExhausted = o0000Var.exhausted();
            o0000o04 = f32614OooO0Oo;
            if (zExhausted) {
                break;
            }
            long j2 = j;
            long jOooO0O02 = o0000Var.OooO0O0(o0000o05);
            if (jOooO0O02 == -1) {
                o0000o0OooO0OO = o0000Var.OooO0OO(o0000Var.f32535OooOo0o);
            } else {
                o0000o0OooO0OO = o0000Var.OooO0OO(jOooO0O02);
                o0000Var.readByte();
            }
            o0000O0 o0000o06 = f32615OooO0o0;
            if (kotlin.jvm.internal.OooOo.OooO00o(o0000o0OooO0OO, o0000o06)) {
                if (!z3 || !arrayList.isEmpty()) {
                    if (!z || (!z3 && (arrayList.isEmpty() || kotlin.jvm.internal.OooOo.OooO00o(OooOo00.Oooo000(arrayList), o0000o06)))) {
                        arrayList.add(o0000o0OooO0OO);
                    } else if ((!z2 || arrayList.size() != 1) && !arrayList.isEmpty()) {
                        arrayList.remove(o00O0.OooOo.OooOOo0(arrayList));
                    }
                }
            } else if (!kotlin.jvm.internal.OooOo.OooO00o(o0000o0OooO0OO, o0000o04) && !kotlin.jvm.internal.OooOo.OooO00o(o0000o0OooO0OO, o0000O0.f32553OooOoO0)) {
                arrayList.add(o0000o0OooO0OO);
            }
            j = j2;
        }
        long j3 = j;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (i2 > 0) {
                o0000Var2.OooO0o(o0000o0OooO0o0);
            }
            o0000Var2.OooO0o((o0000O0) arrayList.get(i2));
        }
        if (o0000Var2.f32535OooOo0o == j3) {
            o0000Var2.OooO0o(o0000o04);
        }
        return new o000O0Oo(o0000Var2.OooO0OO(o0000Var2.f32535OooOo0o));
    }

    public static final o0000O0 OooO0o(String str) {
        if (kotlin.jvm.internal.OooOo.OooO00o(str, "/")) {
            return f32611OooO00o;
        }
        if (kotlin.jvm.internal.OooOo.OooO00o(str, "\\")) {
            return f32612OooO0O0;
        }
        throw new IllegalArgumentException(OooO0oO.OooOo.OooOO0("not a directory separator: ", str));
    }

    public static final o0000O0 OooO0o0(byte b) {
        if (b == 47) {
            return f32611OooO00o;
        }
        if (b == 92) {
            return f32612OooO0O0;
        }
        throw new IllegalArgumentException(OooO0oO.OooOo.OooO0o(b, "not a directory separator: "));
    }
}
