package o000o0O;

import Oooo0oO.o00000;
import o00OO.OooOO0O;
import o00OO0OO.OooO00o;
import o00OO0o.OooO;
import o00OO0oo.OooO0o;
import o00OO0oo.OooOO0;

/* loaded from: classes2.dex */
public final /* synthetic */ class o000oOoO implements o00OO0oo.OooOOO0 {

    /* renamed from: OooO00o */
    public static final o000oOoO f30924OooO00o;
    private static final OooO descriptor;

    static {
        o000oOoO o000oooo2 = new o000oOoO();
        f30924OooO00o = o000oooo2;
        o00OO0oo.o0OoOo0 o0oooo0 = new o00OO0oo.o0OoOo0("com.google.firebase.sessions.settings.SessionConfigs", o000oooo2, 5);
        o0oooo0.OooOO0("sessionsEnabled", false);
        o0oooo0.OooOO0("sessionSamplingRate", false);
        o0oooo0.OooOO0("sessionTimeoutSeconds", false);
        o0oooo0.OooOO0("cacheDurationSeconds", false);
        o0oooo0.OooOO0("cacheUpdatedTimeSeconds", false);
        descriptor = o0oooo0;
    }

    @Override // o00OO0OO.OooO00o
    public final void OooO00o(o00OO.OooOo00 oooOo00, Object obj) {
        o00O0O value = (o00O0O) obj;
        kotlin.jvm.internal.OooOo.OooO0o0(value, "value");
        OooO oooO = descriptor;
        o00OO.OooOo00 oooOo00OooO00o = oooOo00.OooO00o(oooO);
        oooOo00OooO00o.OooO0oO(oooO, 0, OooO0o.f32052OooO00o, value.f30925OooO00o);
        oooOo00OooO00o.OooO0oO(oooO, 1, OooOO0.f32054OooO00o, value.f30926OooO0O0);
        o00OO0oo.OooOOO oooOOO = o00OO0oo.OooOOO.f32061OooO00o;
        oooOo00OooO00o.OooO0oO(oooO, 2, oooOOO, value.f30927OooO0OO);
        oooOo00OooO00o.OooO0oO(oooO, 3, oooOOO, value.f30928OooO0Oo);
        oooOo00OooO00o.OooO0oO(oooO, 4, o00OO0oo.OooOo.f32065OooO00o, value.f30929OooO0o0);
        oooOo00OooO00o.OooOO0o(oooO);
    }

    @Override // o00OO0oo.OooOOO0
    public final OooO00o[] OooO0O0() {
        OooO00o oooO00oOooO0o = o00000.OooO0o(OooO0o.f32052OooO00o);
        OooO00o oooO00oOooO0o2 = o00000.OooO0o(OooOO0.f32054OooO00o);
        o00OO0oo.OooOOO oooOOO = o00OO0oo.OooOOO.f32061OooO00o;
        return new OooO00o[]{oooO00oOooO0o, oooO00oOooO0o2, o00000.OooO0o(oooOOO), o00000.OooO0o(oooOOO), o00000.OooO0o(o00OO0oo.OooOo.f32065OooO00o)};
    }

    @Override // o00OO0OO.OooO00o
    public final Object OooO0OO(com.google.android.material.datepicker.OooO0o oooO0o) throws Throwable {
        OooO oooO = descriptor;
        com.google.android.material.datepicker.OooO0o oooO0oOooO00o = oooO0o.OooO00o(oooO);
        int i = 0;
        Boolean bool = null;
        Double d = null;
        Integer num = null;
        Integer num2 = null;
        Long l = null;
        boolean z = true;
        while (z) {
            int iOooO0OO = oooO0oOooO00o.OooO0OO(oooO);
            if (iOooO0OO == -1) {
                z = false;
            } else if (iOooO0OO == 0) {
                bool = (Boolean) oooO0oOooO00o.OooO(oooO, 0, OooO0o.f32052OooO00o, bool);
                i |= 1;
            } else if (iOooO0OO == 1) {
                d = (Double) oooO0oOooO00o.OooO(oooO, 1, OooOO0.f32054OooO00o, d);
                i |= 2;
            } else if (iOooO0OO == 2) {
                num = (Integer) oooO0oOooO00o.OooO(oooO, 2, o00OO0oo.OooOOO.f32061OooO00o, num);
                i |= 4;
            } else if (iOooO0OO == 3) {
                num2 = (Integer) oooO0oOooO00o.OooO(oooO, 3, o00OO0oo.OooOOO.f32061OooO00o, num2);
                i |= 8;
            } else {
                if (iOooO0OO != 4) {
                    throw new OooOO0O(iOooO0OO);
                }
                l = (Long) oooO0oOooO00o.OooO(oooO, 4, o00OO0oo.OooOo.f32065OooO00o, l);
                i |= 16;
            }
        }
        oooO0oOooO00o.OooOOO(oooO);
        return new o00O0O(i, bool, d, num, num2, l);
    }

    @Override // o00OO0OO.OooO00o
    public final OooO OooO0Oo() {
        return descriptor;
    }
}
