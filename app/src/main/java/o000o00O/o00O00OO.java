package o000o00o;

import android.util.Log;
import androidx.datastore.core.DataStore;
import o00O0O0O.OooO0OO;

/* loaded from: classes2.dex */
public final class o00O00OO extends o00O0OO0.OooOOOO implements o00O0Oo.o00O0O {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public int f30841OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ o00O0O00 f30842OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O00OO(o00O0O00 o00o0o00, OooO0OO oooO0OO) {
        super(2, oooO0OO);
        this.f30842OooOo0o = o00o0o00;
    }

    @Override // o00O0OO0.OooO00o
    public final OooO0OO create(Object obj, OooO0OO oooO0OO) {
        return new o00O00OO(this.f30842OooOo0o, oooO0OO);
    }

    @Override // o00O0Oo.o00O0O
    public final Object invoke(Object obj, Object obj2) {
        return ((o00O00OO) create((o00O0oOo.o000OO) obj, (OooO0OO) obj2)).invokeSuspend(oo00o.OooOo.f33195OooO00o);
    }

    @Override // o00O0OO0.OooO00o
    public final Object invokeSuspend(Object obj) {
        o00O0O0o.OooOo00 oooOo00 = o00O0O0o.OooOo00.f31365OooOo0O;
        int i = this.f30841OooOo0O;
        o00O0O00 o00o0o00 = this.f30842OooOo0o;
        try {
            if (i == 0) {
                o00O0.o000OOo.OooOO0O(obj);
                DataStore dataStore = o00o0o00.f30855OooO0o0;
                oOO00O ooo00o = new oOO00O(o00o0o00, null);
                this.f30841OooOo0O = 1;
                if (dataStore.updateData(ooo00o, this) == oooOo00) {
                    return oooOo00;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o00O0.o000OOo.OooOO0O(obj);
            }
        } catch (Exception e) {
            Log.d("FirebaseSessions", "App backgrounded, failed to update data. Message: " + e.getMessage());
            o000O0o o000o0o2 = o00o0o00.f30857OooO0oo;
            if (o000o0o2 == null) {
                kotlin.jvm.internal.OooOo.OooOO0o("localSessionData");
                throw null;
            }
            o00o0o00.f30857OooO0oo = o000O0o.OooO00o(o000o0o2, null, o00o0o00.f30853OooO0Oo.OooO00o(), null, 5);
        }
        return oo00o.OooOo.f33195OooO00o;
    }
}
