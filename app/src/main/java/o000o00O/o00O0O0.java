package o000o00o;

import com.google.android.material.datepicker.OooO0o;
import o00OO0OO.OooO00o;
import o00OO0o.OooO;

/* loaded from: classes2.dex */
public final /* synthetic */ class o00O0O0 implements o00OO0oo.OooOOO0 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public static final o00O0O0 f30848OooO00o;
    private static final OooO descriptor;

    static {
        o00O0O0 o00o0o0 = new o00O0O0();
        f30848OooO00o = o00o0o0;
        o00OO0oo.o0OoOo0 o0oooo0 = new o00OO0oo.o0OoOo0("com.google.firebase.sessions.Time", o00o0o0, 3);
        o0oooo0.OooOO0("ms", false);
        o0oooo0.OooOO0("us", true);
        o0oooo0.OooOO0("seconds", true);
        descriptor = o0oooo0;
    }

    @Override // o00OO0OO.OooO00o
    public final void OooO00o(o00OO.OooOo00 oooOo00, Object obj) {
        o00O0OO0 value = (o00O0OO0) obj;
        kotlin.jvm.internal.OooOo.OooO0o0(value, "value");
        OooO oooO = descriptor;
        o00OO.OooOo00 oooOo00OooO00o = oooOo00.OooO00o(oooO);
        long j = value.f30860OooO00o;
        oooOo00OooO00o.OooO0o0(oooO, 0, j);
        boolean zOooOOO0 = oooOo00OooO00o.OooOOO0(oooO);
        long j2 = value.f30861OooO0O0;
        if (zOooOOO0 || j2 != 1000 * j) {
            oooOo00OooO00o.OooO0o0(oooO, 1, j2);
        }
        boolean zOooOOO02 = oooOo00OooO00o.OooOOO0(oooO);
        long j3 = value.f30862OooO0OO;
        if (zOooOOO02 || j3 != j / 1000) {
            oooOo00OooO00o.OooO0o0(oooO, 2, j3);
        }
        oooOo00OooO00o.OooOO0o(oooO);
    }

    @Override // o00OO0oo.OooOOO0
    public final OooO00o[] OooO0O0() {
        o00OO0oo.OooOo oooOo = o00OO0oo.OooOo.f32065OooO00o;
        return new OooO00o[]{oooOo, oooOo, oooOo};
    }

    @Override // o00OO0OO.OooO00o
    public final Object OooO0OO(OooO0o oooO0o) throws Throwable {
        OooO oooO = descriptor;
        OooO0o oooO0oOooO00o = oooO0o.OooO00o(oooO);
        int i = 0;
        long jOooO0oO = 0;
        long jOooO0oO2 = 0;
        long jOooO0oO3 = 0;
        boolean z = true;
        while (z) {
            int iOooO0OO = oooO0oOooO00o.OooO0OO(oooO);
            if (iOooO0OO == -1) {
                z = false;
            } else if (iOooO0OO == 0) {
                jOooO0oO = oooO0oOooO00o.OooO0oO(oooO, 0);
                i |= 1;
            } else if (iOooO0OO == 1) {
                jOooO0oO2 = oooO0oOooO00o.OooO0oO(oooO, 1);
                i |= 2;
            } else {
                if (iOooO0OO != 2) {
                    throw new o00OO.OooOO0O(iOooO0OO);
                }
                jOooO0oO3 = oooO0oOooO00o.OooO0oO(oooO, 2);
                i |= 4;
            }
        }
        oooO0oOooO00o.OooOOO(oooO);
        return new o00O0OO0(i, jOooO0oO, jOooO0oO2, jOooO0oO3);
    }

    @Override // o00OO0OO.OooO00o
    public final OooO OooO0Oo() {
        return descriptor;
    }
}
