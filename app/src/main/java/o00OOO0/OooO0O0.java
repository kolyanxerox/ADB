package o00OOO0;

import java.lang.ref.Reference;
import java.net.Socket;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class OooO0O0 {

    /* renamed from: OooO00o */
    public static final OooO0O0 f32133OooO00o = new OooO0O0();

    /* renamed from: OooO0O0 */
    public static final OooO0O0 f32134OooO0O0 = new OooO0O0();

    /* renamed from: OooO0OO */
    public static final OooO0O0 f32135OooO0OO = new OooO0O0();

    /* renamed from: OooO0Oo */
    public static final OooO0O0 f32136OooO0Oo = new OooO0O0();

    /* renamed from: OooO0o0 */
    public static OooO0O0 f32137OooO0o0;

    public static Socket OooO00o(OooOOOO oooOOOO, OooO00o oooO00o, o00OOO.OooO oooO) {
        Iterator it = oooOOOO.f32179OooO0Oo.iterator();
        while (it.hasNext()) {
            o00OOO.OooO0O0 oooO0O0 = (o00OOO.OooO0O0) it.next();
            if (oooO0O0.OooO0oO(oooO00o, null) && oooO0O0.f32114OooO0oo != null && oooO0O0 != oooO.OooO00o()) {
                if (oooO.f32103OooOOO != null || oooO.f32101OooOO0.f32117OooOOO.size() != 1) {
                    throw new IllegalStateException();
                }
                Reference reference = (Reference) oooO.f32101OooOO0.f32117OooOOO.get(0);
                Socket socketOooO0O0 = oooO.OooO0O0(true, false, false);
                oooO.f32101OooOO0 = oooO0O0;
                oooO0O0.f32117OooOOO.add(reference);
                return socketOooO0O0;
            }
        }
        return null;
    }

    public static void OooO0O0(OooOOOO oooOOOO, OooO00o oooO00o, o00OOO.OooO oooO, o00000O0 o00000o02) {
        Iterator it = oooOOOO.f32179OooO0Oo.iterator();
        while (it.hasNext()) {
            o00OOO.OooO0O0 oooO0O0 = (o00OOO.OooO0O0) it.next();
            if (oooO0O0.OooO0oO(oooO00o, o00000o02)) {
                if (oooO.f32101OooOO0 != null) {
                    throw new IllegalStateException();
                }
                oooO.f32101OooOO0 = oooO0O0;
                oooO.f32102OooOO0O = true;
                oooO0O0.f32117OooOOO.add(new o00OOO.OooO0o(oooO, oooO.f32099OooO0oO));
                return;
            }
        }
    }
}
