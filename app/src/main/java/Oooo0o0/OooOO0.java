package Oooo0o0;

import OooOOo0.Oooo000;
import android.content.Context;

/* loaded from: classes2.dex */
public final class OooOO0 {

    /* renamed from: OooO0O0 */
    public static final OooOO0 f13862OooO0O0;

    /* renamed from: OooO00o */
    public Oooo000 f13863OooO00o;

    static {
        OooOO0 oooOO0 = new OooOO0();
        oooOO0.f13863OooO00o = null;
        f13862OooO0O0 = oooOO0;
    }

    public static Oooo000 OooO00o(Context context) {
        Oooo000 oooo000;
        OooOO0 oooOO0 = f13862OooO0O0;
        synchronized (oooOO0) {
            try {
                if (oooOO0.f13863OooO00o == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    Oooo000 oooo0002 = new Oooo000();
                    oooo0002.f13505OooO00o = context;
                    oooOO0.f13863OooO00o = oooo0002;
                }
                oooo000 = oooOO0.f13863OooO00o;
            } catch (Throwable th) {
                throw th;
            }
        }
        return oooo000;
    }
}
