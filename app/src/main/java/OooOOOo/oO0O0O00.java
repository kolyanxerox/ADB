package OoooOOO;

import OooO0oO.OooOOO0;
import OoooO0.OooOO0O;
import android.os.Looper;
import android.os.SystemClock;
import java.util.Objects;
import o000Ooo0.OooOO0;

/* loaded from: classes2.dex */
public final class oO0O0O00 extends o0O000Oo {

    /* renamed from: OooOo */
    public OooOO0O f14718OooOo;

    /* renamed from: OooOoO */
    public final OooOO0 f14719OooOoO;

    /* renamed from: OooOoO0 */
    public boolean f14720OooOoO0;

    /* renamed from: OooOoOO */
    public final oO0O0 f14721OooOoOO;

    /* renamed from: OooOoo0 */
    public final OooOOO0 f14722OooOoo0;

    public oO0O0O00(o0OO0oO0 o0oo0oo0) {
        super(o0oo0oo0);
        this.f14720OooOoO0 = true;
        this.f14719OooOoO = new OooOO0(this);
        oO0O0 oo0o0 = new oO0O0();
        Objects.requireNonNull(this);
        oo0o0.f14698OooOoO0 = this;
        o0OO0oO0 o0oo0oo02 = (o0OO0oO0) this.f14574OooOo0O;
        oo0o0.f14695OooOo = new oO0O00oO(oo0o0, o0oo0oo02);
        o0oo0oo02.f14527Oooo000.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        oo0o0.f14696OooOo0O = jElapsedRealtime;
        oo0o0.f14697OooOo0o = jElapsedRealtime;
        this.f14721OooOoOO = oo0o0;
        this.f14722OooOoo0 = new OooOOO0(this);
    }

    @Override // OoooOOO.o0O000Oo
    public final boolean OooOOO() {
        return false;
    }

    public final void OooOOOO() {
        OooOO0O();
        if (this.f14718OooOo == null) {
            this.f14718OooOo = new OooOO0O(Looper.getMainLooper(), 2);
        }
    }
}
