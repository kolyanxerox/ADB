package o000O0oO;

import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesKt;
import o00O0.o000OOo;
import o00O0O0O.OooO0OO;
import o00O0O0o.OooOo00;
import o00O0OO0.OooOOOO;
import o00O0Oo.Oooo000;
import o00O0Oo.o00O0O;
import o00O0oOo.o000OO;
import oo00o.OooOo;

/* loaded from: classes2.dex */
public final class OooOO0 extends OooOOOO implements o00O0O {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Oooo000 f30146OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public int f30147OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ OooOOO0 f30148OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOO0(OooOOO0 oooOOO0, Oooo000 oooo000, OooO0OO oooO0OO) {
        super(2, oooO0OO);
        this.f30148OooOo0o = oooOOO0;
        this.f30146OooOo = oooo000;
    }

    @Override // o00O0OO0.OooO00o
    public final OooO0OO create(Object obj, OooO0OO oooO0OO) {
        return new OooOO0(this.f30148OooOo0o, this.f30146OooOo, oooO0OO);
    }

    @Override // o00O0Oo.o00O0O
    public final Object invoke(Object obj, Object obj2) {
        return ((OooOO0) create((o000OO) obj, (OooO0OO) obj2)).invokeSuspend(OooOo.f33195OooO00o);
    }

    @Override // o00O0OO0.OooO00o
    public final Object invokeSuspend(Object obj) {
        OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
        int i = this.f30147OooOo0O;
        OooOOO0 oooOOO0 = this.f30148OooOo0o;
        try {
            if (i == 0) {
                o000OOo.OooOO0O(obj);
                Object obj2 = oooOOO0.f30153OooO0O0.get();
                Boolean bool = Boolean.TRUE;
                if (kotlin.jvm.internal.OooOo.OooO00o(obj2, bool)) {
                    throw new IllegalStateException("Don't call JavaDataStorage.edit() from within an existing edit() callback.\nThis causes deadlocks, and is generally indicative of a code smell.\nInstead, either pass around the initial `MutablePreferences` instance, or don't do everything in a single callback. ");
                }
                oooOOO0.f30153OooO0O0.set(bool);
                DataStore dataStore = oooOOO0.f30154OooO0OO;
                OooO oooO = new OooO(this.f30146OooOo, null);
                this.f30147OooOo0O = 1;
                obj = PreferencesKt.edit(dataStore, oooO, this);
                if (obj == oooOo00) {
                    return oooOo00;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o000OOo.OooOO0O(obj);
            }
            return (Preferences) obj;
        } finally {
            oooOOO0.f30153OooO0O0.set(Boolean.FALSE);
        }
    }
}
