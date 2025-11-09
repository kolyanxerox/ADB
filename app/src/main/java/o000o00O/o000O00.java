package o000o00o;

import com.google.android.material.datepicker.OooO0o;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import o00OO0OO.OooO00o;
import o00OO0o.OooO;

/* loaded from: classes2.dex */
public final /* synthetic */ class o000O00 implements o00OO0oo.OooOOO0 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public static final o000O00 f30782OooO00o;
    private static final OooO descriptor;

    static {
        o000O00 o000o002 = new o000O00();
        f30782OooO00o = o000o002;
        o00OO0oo.o0OoOo0 o0oooo0 = new o00OO0oo.o0OoOo0("com.google.firebase.sessions.SessionDetails", o000o002, 4);
        o0oooo0.OooOO0(JsonStorageKeyNames.SESSION_ID_KEY, false);
        o0oooo0.OooOO0("firstSessionId", false);
        o0oooo0.OooOO0("sessionIndex", false);
        o0oooo0.OooOO0("sessionStartTimestampUs", false);
        descriptor = o0oooo0;
    }

    @Override // o00OO0OO.OooO00o
    public final void OooO00o(o00OO.OooOo00 oooOo00, Object obj) {
        o000O0 value = (o000O0) obj;
        kotlin.jvm.internal.OooOo.OooO0o0(value, "value");
        OooO oooO = descriptor;
        o00OO.OooOo00 oooOo00OooO00o = oooOo00.OooO00o(oooO);
        oooOo00OooO00o.OooOO0O(oooO, 0, value.f30778OooO00o);
        oooOo00OooO00o.OooOO0O(oooO, 1, value.f30779OooO0O0);
        oooOo00OooO00o.OooO0O0(oooO, 2);
        oooOo00OooO00o.OooO0OO(value.f30780OooO0OO);
        oooOo00OooO00o.OooO0o0(oooO, 3, value.f30781OooO0Oo);
        oooOo00OooO00o.OooOO0o(oooO);
    }

    @Override // o00OO0oo.OooOOO0
    public final OooO00o[] OooO0O0() {
        o00OO0oo.o00Ooo o00ooo2 = o00OO0oo.o00Ooo.f32079OooO00o;
        return new OooO00o[]{o00ooo2, o00ooo2, o00OO0oo.OooOOO.f32061OooO00o, o00OO0oo.OooOo.f32065OooO00o};
    }

    @Override // o00OO0OO.OooO00o
    public final Object OooO0OO(OooO0o oooO0o) throws Throwable {
        OooO oooO = descriptor;
        OooO0o oooO0oOooO00o = oooO0o.OooO00o(oooO);
        int i = 0;
        int iOooO0o0 = 0;
        String strOooOOO0 = null;
        String strOooOOO02 = null;
        long jOooO0oO = 0;
        boolean z = true;
        while (z) {
            int iOooO0OO = oooO0oOooO00o.OooO0OO(oooO);
            if (iOooO0OO == -1) {
                z = false;
            } else if (iOooO0OO == 0) {
                strOooOOO0 = oooO0oOooO00o.OooOOO0(oooO, 0);
                i |= 1;
            } else if (iOooO0OO == 1) {
                strOooOOO02 = oooO0oOooO00o.OooOOO0(oooO, 1);
                i |= 2;
            } else if (iOooO0OO == 2) {
                iOooO0o0 = oooO0oOooO00o.OooO0o0(oooO, 2);
                i |= 4;
            } else {
                if (iOooO0OO != 3) {
                    throw new o00OO.OooOO0O(iOooO0OO);
                }
                jOooO0oO = oooO0oOooO00o.OooO0oO(oooO, 3);
                i |= 8;
            }
        }
        oooO0oOooO00o.OooOOO(oooO);
        return new o000O0(i, strOooOOO0, iOooO0o0, strOooOOO02, jOooO0oO);
    }

    @Override // o00OO0OO.OooO00o
    public final OooO OooO0Oo() {
        return descriptor;
    }
}
