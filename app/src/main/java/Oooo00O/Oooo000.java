package Oooo00O;

import OooOooo.o000Oo0;
import android.os.Bundle;

/* loaded from: classes2.dex */
public final class Oooo000 implements OooO, OooO0OO, OooO0o {

    /* renamed from: OooOo, reason: collision with root package name */
    public static final Oooo0 f13779OooOo = new Oooo0(0, 0, 0, false, false);

    /* renamed from: OooOo0o, reason: collision with root package name */
    public static Oooo000 f13780OooOo0o;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public Object f13781OooOo0O;

    public /* synthetic */ Oooo000(Object obj) {
        this.f13781OooOo0O = obj;
    }

    public static synchronized Oooo000 OooO0O0() {
        try {
            if (f13780OooOo0o == null) {
                f13780OooOo0o = new Oooo000();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f13780OooOo0o;
    }

    @Override // Oooo00O.OooO0o
    public void OooO(o000Oo0 o000oo02) {
        ((Oooo000.OooOOO0) this.f13781OooOo0O).OooO(o000oo02);
    }

    @Override // Oooo00O.OooO
    public void OooO00o(o000Oo0 o000oo02) {
        boolean zOooOO0 = o000oo02.OooOO0();
        OooOO0O oooOO0O = (OooOO0O) this.f13781OooOo0O;
        if (zOooOO0) {
            oooOO0O.getRemoteService(null, oooOO0O.OooO0Oo());
            return;
        }
        OooO0o oooO0o = oooOO0O.f13758OoooO00;
        if (oooO0o != null) {
            oooO0o.OooO(o000oo02);
        }
    }

    @Override // Oooo00O.OooO0OO
    public void OooOO0(Bundle bundle) {
        ((Oooo000.OooOO0O) this.f13781OooOo0O).onConnected();
    }

    @Override // Oooo00O.OooO0OO
    public void OooOOO(int i) {
        ((Oooo000.OooOO0O) this.f13781OooOo0O).OooOOO(i);
    }
}
