package o000o0O;

import android.util.Log;
import o00O0.o000OOo;
import o00O0O0O.OooO0OO;

/* loaded from: classes2.dex */
public final class OooOo00 extends o00O0OO0.OooOOOO implements o00O0Oo.o00O0O {

    /* renamed from: OooOo0O */
    public /* synthetic */ Object f30916OooOo0O;

    @Override // o00O0OO0.OooO00o
    public final OooO0OO create(Object obj, OooO0OO oooO0OO) {
        OooOo00 oooOo00 = new OooOo00(2, oooO0OO);
        oooOo00.f30916OooOo0O = obj;
        return oooOo00;
    }

    @Override // o00O0Oo.o00O0O
    public final Object invoke(Object obj, Object obj2) {
        OooOo00 oooOo00 = (OooOo00) create((String) obj, (OooO0OO) obj2);
        oo00o.OooOo oooOo = oo00o.OooOo.f33195OooO00o;
        oooOo00.invokeSuspend(oooOo);
        return oooOo;
    }

    @Override // o00O0OO0.OooO00o
    public final Object invokeSuspend(Object obj) {
        o00O0O0o.OooOo00 oooOo00 = o00O0O0o.OooOo00.f31365OooOo0O;
        o000OOo.OooOO0O(obj);
        Log.e("FirebaseSessions", "Error failed to fetch the remote configs: " + ((String) this.f30916OooOo0O));
        return oo00o.OooOo.f33195OooO00o;
    }
}
