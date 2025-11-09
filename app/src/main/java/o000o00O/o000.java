package o000o00o;

import com.google.android.material.datepicker.OooO0o;
import java.util.Map;
import o00OO0OO.OooO00o;
import o00OO0o.OooO;

/* loaded from: classes2.dex */
public final /* synthetic */ class o000 implements o00OO0oo.OooOOO0 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public static final o000 f30733OooO00o;
    private static final OooO descriptor;

    static {
        o000 o000Var = new o000();
        f30733OooO00o = o000Var;
        o00OO0oo.o0OoOo0 o0oooo0 = new o00OO0oo.o0OoOo0("com.google.firebase.sessions.SessionData", o000Var, 3);
        o0oooo0.OooOO0("sessionDetails", false);
        o0oooo0.OooOO0("backgroundTime", true);
        o0oooo0.OooOO0("processDataMap", true);
        descriptor = o0oooo0;
    }

    @Override // o00OO0OO.OooO00o
    public final void OooO00o(o00OO.OooOo00 oooOo00, Object obj) {
        o000O0o value = (o000O0o) obj;
        kotlin.jvm.internal.OooOo.OooO0o0(value, "value");
        OooO oooO = descriptor;
        o00OO.OooOo00 oooOo00OooO00o = oooOo00.OooO00o(oooO);
        o000O000 o000o0002 = o000O0o.Companion;
        oooOo00OooO00o.OooO0oo(oooO, 0, o000O00.f30782OooO00o, value.f30786OooO00o);
        boolean zOooOOO0 = oooOo00OooO00o.OooOOO0(oooO);
        o00O0OO0 o00o0oo0 = value.f30787OooO0O0;
        if (zOooOOO0 || o00o0oo0 != null) {
            oooOo00OooO00o.OooO0oO(oooO, 1, o00O0O0.f30848OooO00o, o00o0oo0);
        }
        boolean zOooOOO02 = oooOo00OooO00o.OooOOO0(oooO);
        Map map = value.f30788OooO0OO;
        if (zOooOOO02 || map != null) {
            oooOo00OooO00o.OooO0oO(oooO, 2, o000O0o.f30785OooO0Oo[2], map);
        }
        oooOo00OooO00o.OooOO0o(oooO);
    }

    @Override // o00OO0oo.OooOOO0
    public final OooO00o[] OooO0O0() {
        return new OooO00o[]{o000O00.f30782OooO00o, Oooo0oO.o00000.OooO0o(o00O0O0.f30848OooO00o), Oooo0oO.o00000.OooO0o(o000O0o.f30785OooO0Oo[2])};
    }

    @Override // o00OO0OO.OooO00o
    public final Object OooO0OO(OooO0o oooO0o) throws Throwable {
        OooO oooO = descriptor;
        OooO0o oooO0oOooO00o = oooO0o.OooO00o(oooO);
        OooO00o[] oooO00oArr = o000O0o.f30785OooO0Oo;
        o000O0 o000o0 = null;
        boolean z = true;
        int i = 0;
        o00O0OO0 o00o0oo0 = null;
        Map map = null;
        while (z) {
            int iOooO0OO = oooO0oOooO00o.OooO0OO(oooO);
            if (iOooO0OO == -1) {
                z = false;
            } else if (iOooO0OO == 0) {
                o000o0 = (o000O0) oooO0oOooO00o.OooOO0(oooO, 0, o000O00.f30782OooO00o, o000o0);
                i |= 1;
            } else if (iOooO0OO == 1) {
                o00o0oo0 = (o00O0OO0) oooO0oOooO00o.OooO(oooO, 1, o00O0O0.f30848OooO00o, o00o0oo0);
                i |= 2;
            } else {
                if (iOooO0OO != 2) {
                    throw new o00OO.OooOO0O(iOooO0OO);
                }
                map = (Map) oooO0oOooO00o.OooO(oooO, 2, oooO00oArr[2], map);
                i |= 4;
            }
        }
        oooO0oOooO00o.OooOOO(oooO);
        return new o000O0o(i, o000o0, o00o0oo0, map);
    }

    @Override // o00OO0OO.OooO00o
    public final OooO OooO0Oo() {
        return descriptor;
    }
}
