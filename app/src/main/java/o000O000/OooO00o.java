package o000O000;

import OooO0oO.OooOo;
import OooO0oo.o00Oo0;
import OooOo.OooOOO0;
import android.util.Log;
import java.util.concurrent.atomic.AtomicReference;
import o0000oo0.o00000O0;
import o000O00.o00O00;

/* loaded from: classes2.dex */
public final class OooO00o {

    /* renamed from: OooO0OO */
    public static final OooO0OO f30091OooO0OO = new OooO0OO();

    /* renamed from: OooO00o */
    public final o00000O0 f30092OooO00o;

    /* renamed from: OooO0O0 */
    public final AtomicReference f30093OooO0O0 = new AtomicReference(null);

    public OooO00o(o00000O0 o00000o02) {
        this.f30092OooO00o = o00000o02;
        o00000o02.OooO00o(new o00Oo0(this, 21));
    }

    public final OooO0OO OooO00o(String str) {
        OooO00o oooO00o = (OooO00o) this.f30093OooO0O0.get();
        return oooO00o == null ? f30091OooO0OO : oooO00o.OooO00o(str);
    }

    public final boolean OooO0O0() {
        OooO00o oooO00o = (OooO00o) this.f30093OooO0O0.get();
        return oooO00o != null && oooO00o.OooO0O0();
    }

    public final boolean OooO0OO(String str) {
        OooO00o oooO00o = (OooO00o) this.f30093OooO0O0.get();
        return oooO00o != null && oooO00o.OooO0OO(str);
    }

    public final void OooO0Oo(String str, long j, o00O00 o00o00) {
        String strOooOO0 = OooOo.OooOO0("Deferring native open session: ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", strOooOO0, null);
        }
        this.f30092OooO00o.OooO00o(new OooOOO0(str, j, o00o00));
    }
}
