package kotlin.jvm.internal;

import java.util.List;

/* loaded from: classes3.dex */
public abstract class o0O0O00 {
    public static List OooO00o(Object obj) {
        if ((obj instanceof o00O0OoO.OooO0OO) && !(obj instanceof o00O0OoO.OooO0o)) {
            OooO0o0(obj, "kotlin.collections.MutableList");
            throw null;
        }
        try {
            return (List) obj;
        } catch (ClassCastException e) {
            OooOo.OooO(e, o0O0O00.class.getName());
            throw e;
        }
    }

    public static void OooO0O0(int i, Object obj) {
        if (obj == null || OooO0OO(i, obj)) {
            return;
        }
        OooO0o0(obj, "kotlin.jvm.functions.Function" + i);
        throw null;
    }

    public static boolean OooO0OO(int i, Object obj) {
        if (obj instanceof oo00o.OooO00o) {
            if ((obj instanceof OooOOO ? ((OooOOO) obj).getArity() : obj instanceof o00O0Oo.OooO0O0 ? 0 : obj instanceof o00O0Oo.Oooo000 ? 1 : obj instanceof o00O0Oo.o00O0O ? 2 : obj instanceof o00O0Oo.o00Oo0 ? 3 : obj instanceof o00O0Oo.o00Ooo ? 4 : obj instanceof o00O0Oo.o00oO0o ? 6 : -1) == i) {
                return true;
            }
        }
        return false;
    }

    public static final OooO0O0 OooO0Oo(Object[] array) {
        OooOo.OooO0o0(array, "array");
        return new OooO0O0(array);
    }

    public static void OooO0o0(Object obj, String str) {
        ClassCastException classCastException = new ClassCastException(OooO0oO.OooOo.OooOoo(obj == null ? "null" : obj.getClass().getName(), " cannot be cast to ", str));
        OooOo.OooO(classCastException, o0O0O00.class.getName());
        throw classCastException;
    }
}
