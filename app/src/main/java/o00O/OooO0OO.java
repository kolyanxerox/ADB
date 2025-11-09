package o00O;

import o00O0oo.o0000oo;
import o00O0ooo.o0OoOoOo;

/* loaded from: classes3.dex */
public abstract class OooO0OO {

    /* renamed from: OooO00o */
    public static final o00O0O0O.OooO0OO[] f31170OooO00o = new o00O0O0O.OooO0OO[0];

    /* renamed from: OooO0O0 */
    public static final o000O0O0.OooO0O0 f31171OooO0O0 = new o000O0O0.OooO0O0("NULL", 3);

    /* renamed from: OooO0OO */
    public static final o000O0O0.OooO0O0 f31172OooO0OO = new o000O0O0.OooO0O0("UNINITIALIZED", 3);

    /* renamed from: OooO0Oo */
    public static final o000O0O0.OooO0O0 f31173OooO0Oo = new o000O0O0.OooO0O0("DONE", 3);

    public static /* synthetic */ o0OoOoOo OooO00o(o00Oo0 o00oo0, o00O0oo0.o0Oo0oo o0oo0oo, int i, o0000oo o0000ooVar, int i2) {
        o00O0O0O.OooOOO0 oooOOO0 = o0oo0oo;
        if ((i2 & 1) != 0) {
            oooOOO0 = o00O0O0O.OooOOO.f31358OooOo0O;
        }
        if ((i2 & 2) != 0) {
            i = -3;
        }
        if ((i2 & 4) != 0) {
            o0000ooVar = o0000oo.f31602OooOo0O;
        }
        return o00oo0.OooO0O0(oooOOO0, i, o0000ooVar);
    }

    public static final Object OooO0O0(o00O0O0O.OooOOO0 oooOOO0, Object obj, Object obj2, o00O0Oo.o00O0O o00o0o, o00O0O0O.OooO0OO frame) {
        Object objInvoke;
        Object objOooOO0o = o00OO000.OooO00o.OooOO0o(oooOOO0, obj2);
        try {
            o0O0O00 o0o0o00 = new o0O0O00(frame, oooOOO0);
            if (o00o0o == null) {
                objInvoke = Oooo0o0.OooO.OooOo0o(o00o0o, obj, o0o0o00);
            } else {
                kotlin.jvm.internal.o0O0O00.OooO0O0(2, o00o0o);
                objInvoke = o00o0o.invoke(obj, o0o0o00);
            }
            o00OO000.OooO00o.OooO0oO(oooOOO0, objOooOO0o);
            if (objInvoke == o00O0O0o.OooOo00.f31365OooOo0O) {
                kotlin.jvm.internal.OooOo.OooO0o0(frame, "frame");
            }
            return objInvoke;
        } catch (Throwable th) {
            o00OO000.OooO00o.OooO0oO(oooOOO0, objOooOO0o);
            throw th;
        }
    }
}
