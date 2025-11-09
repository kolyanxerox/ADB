package Oooo00O;

import OooOooo.o000O0;
import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Scope;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes2.dex */
public abstract class OooOOOO extends OooOO0O implements Oooo000.OooO0OO {

    /* renamed from: OoooOoO */
    public final Set f13778OoooOoO;

    /* JADX WARN: Illegal instructions before constructor call */
    public OooOOOO(Context context, Looper looper, int i, o000OO.o0OoOo0 o0oooo0, Oooo000.OooOO0O oooOO0O, Oooo000.OooOOO0 oooOOO0) {
        o000OO o000ooOooO00o = o000OO.OooO00o(context);
        o000O0 o000o0 = o000O0.f13666OooO0Oo;
        o000000O.OooO0oo(oooOO0O);
        o000000O.OooO0oo(oooOOO0);
        super(context, looper, o000ooOooO00o, o000o0, i, new Oooo000(oooOO0O), new Oooo000(oooOOO0), (String) o0oooo0.f30189OooOoOO);
        Set set = (Set) o0oooo0.f30187OooOoO;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (!set.contains((Scope) it.next())) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        this.f13778OoooOoO = set;
    }

    @Override // Oooo000.OooO0OO
    public final Set OooO00o() {
        return requiresSignIn() ? this.f13778OoooOoO : Collections.EMPTY_SET;
    }

    @Override // Oooo00O.OooOO0O
    public final Set OooO0Oo() {
        return this.f13778OoooOoO;
    }

    @Override // Oooo00O.OooOO0O
    public final Account getAccount() {
        return null;
    }
}
