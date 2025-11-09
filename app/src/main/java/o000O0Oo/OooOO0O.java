package o000O0oO;

import androidx.datastore.preferences.core.Preferences;
import java.util.Map;
import o00O0.o000OOo;
import o00O0.o00oO0o;
import o00O0O0O.OooO0OO;
import o00O0O0o.OooOo00;
import o00O0OO0.OooOOOO;
import o00O0Oo.o00O0O;
import o00O0oOo.o000OO;
import o00O0ooo.o0OoOoOo;
import o00O0ooo.o0o0000;
import oo00o.OooOo;

/* loaded from: classes2.dex */
public final class OooOO0O extends OooOOOO implements o00O0O {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public int f30149OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ OooOOO0 f30150OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOO0O(OooOOO0 oooOOO0, OooO0OO oooO0OO) {
        super(2, oooO0OO);
        this.f30150OooOo0o = oooOOO0;
    }

    @Override // o00O0OO0.OooO00o
    public final OooO0OO create(Object obj, OooO0OO oooO0OO) {
        return new OooOO0O(this.f30150OooOo0o, oooO0OO);
    }

    @Override // o00O0Oo.o00O0O
    public final Object invoke(Object obj, Object obj2) {
        return ((OooOO0O) create((o000OO) obj, (OooO0OO) obj2)).invokeSuspend(OooOo.f33195OooO00o);
    }

    @Override // o00O0OO0.OooO00o
    public final Object invokeSuspend(Object obj) {
        Map<Preferences.Key<?>, Object> mapAsMap;
        OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
        int i = this.f30149OooOo0O;
        if (i == 0) {
            o000OOo.OooOO0O(obj);
            o0OoOoOo data = this.f30150OooOo0o.f30154OooO0OO.getData();
            this.f30149OooOo0O = 1;
            obj = o0o0000.OooOOO(data, this);
            if (obj == oooOo00) {
                return oooOo00;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o000OOo.OooOO0O(obj);
        }
        Preferences preferences = (Preferences) obj;
        return (preferences == null || (mapAsMap = preferences.asMap()) == null) ? o00oO0o.f31247OooOo0O : mapAsMap;
    }
}
