package o000o00o;

import com.google.android.material.datepicker.OooO0o;
import o00OO0OO.OooO00o;
import o00OO0o.OooO;

/* loaded from: classes2.dex */
public final /* synthetic */ class o0000O00 implements o00OO0oo.OooOOO0 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public static final o0000O00 f30759OooO00o;
    private static final OooO descriptor;

    static {
        o0000O00 o0000o00 = new o0000O00();
        f30759OooO00o = o0000o00;
        o00OO0oo.o0OoOo0 o0oooo0 = new o00OO0oo.o0OoOo0("com.google.firebase.sessions.ProcessData", o0000o00, 2);
        o0oooo0.OooOO0("pid", false);
        o0oooo0.OooOO0("uuid", false);
        descriptor = o0oooo0;
    }

    @Override // o00OO0OO.OooO00o
    public final void OooO00o(o00OO.OooOo00 oooOo00, Object obj) {
        o0000O0 value = (o0000O0) obj;
        kotlin.jvm.internal.OooOo.OooO0o0(value, "value");
        OooO oooO = descriptor;
        o00OO.OooOo00 oooOo00OooO00o = oooOo00.OooO00o(oooO);
        oooOo00OooO00o.OooO0O0(oooO, 0);
        oooOo00OooO00o.OooO0OO(value.f30757OooO00o);
        oooOo00OooO00o.OooOO0O(oooO, 1, value.f30758OooO0O0);
        oooOo00OooO00o.OooOO0o(oooO);
    }

    @Override // o00OO0oo.OooOOO0
    public final OooO00o[] OooO0O0() {
        return new OooO00o[]{o00OO0oo.OooOOO.f32061OooO00o, o00OO0oo.o00Ooo.f32079OooO00o};
    }

    @Override // o00OO0OO.OooO00o
    public final Object OooO0OO(OooO0o oooO0o) throws Throwable {
        OooO oooO = descriptor;
        OooO0o oooO0oOooO00o = oooO0o.OooO00o(oooO);
        String strOooOOO0 = null;
        boolean z = true;
        int i = 0;
        int iOooO0o0 = 0;
        while (z) {
            int iOooO0OO = oooO0oOooO00o.OooO0OO(oooO);
            if (iOooO0OO == -1) {
                z = false;
            } else if (iOooO0OO == 0) {
                iOooO0o0 = oooO0oOooO00o.OooO0o0(oooO, 0);
                i |= 1;
            } else {
                if (iOooO0OO != 1) {
                    throw new o00OO.OooOO0O(iOooO0OO);
                }
                strOooOOO0 = oooO0oOooO00o.OooOOO0(oooO, 1);
                i |= 2;
            }
        }
        oooO0oOooO00o.OooOOO(oooO);
        return new o0000O0(i, iOooO0o0, strOooOOO0);
    }

    @Override // o00OO0OO.OooO00o
    public final OooO OooO0Oo() {
        return descriptor;
    }
}
