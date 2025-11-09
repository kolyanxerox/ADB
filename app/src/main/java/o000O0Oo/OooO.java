package o000O0oO;

import androidx.datastore.preferences.core.MutablePreferences;
import o00O0.o000OOo;
import o00O0O0O.OooO0OO;
import o00O0O0o.OooOo00;
import o00O0OO0.OooOOOO;
import o00O0Oo.Oooo000;
import o00O0Oo.o00O0O;
import oo00o.OooOo;

/* loaded from: classes2.dex */
public final class OooO extends OooOOOO implements o00O0O {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public /* synthetic */ Object f30144OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ Oooo000 f30145OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO(Oooo000 oooo000, OooO0OO oooO0OO) {
        super(2, oooO0OO);
        this.f30145OooOo0o = oooo000;
    }

    @Override // o00O0OO0.OooO00o
    public final OooO0OO create(Object obj, OooO0OO oooO0OO) {
        OooO oooO = new OooO(this.f30145OooOo0o, oooO0OO);
        oooO.f30144OooOo0O = obj;
        return oooO;
    }

    @Override // o00O0Oo.o00O0O
    public final Object invoke(Object obj, Object obj2) {
        OooO oooO = (OooO) create((MutablePreferences) obj, (OooO0OO) obj2);
        OooOo oooOo = OooOo.f33195OooO00o;
        oooO.invokeSuspend(oooOo);
        return oooOo;
    }

    @Override // o00O0OO0.OooO00o
    public final Object invokeSuspend(Object obj) {
        OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
        o000OOo.OooOO0O(obj);
        this.f30145OooOo0o.invoke((MutablePreferences) this.f30144OooOo0O);
        return OooOo.f33195OooO00o;
    }
}
