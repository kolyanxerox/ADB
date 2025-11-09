package OoooOOO;

import Oooo0OO.oo000o;
import android.content.Intent;
import android.os.SystemClock;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class oO0O00oO extends oo0O {

    /* renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Object f14716OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ int f14717OooO0o0 = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0O00oO(oO0O0 oo0o0, o0oo0000 o0oo0000Var) {
        super(o0oo0000Var);
        Objects.requireNonNull(oo0o0);
        this.f14716OooO0o = oo0o0;
    }

    @Override // OoooOOO.oo0O
    public final void OooO00o() {
        switch (this.f14717OooO0o0) {
            case 0:
                oO0O0 oo0o0 = (oO0O0) this.f14716OooO0o;
                oO0O0O00 oo0o0o00 = (oO0O0O00) oo0o0.f14698OooOoO0;
                oo0o0o00.OooOO0O();
                o0OO0oO0 o0oo0oo0 = (o0OO0oO0) oo0o0o00.f14574OooOo0O;
                o0oo0oo0.f14527Oooo000.getClass();
                oo0o0.OooO00o(false, SystemClock.elapsedRealtime(), false);
                o0oOOo o0oooo = o0oo0oo0.f14526Oooo0;
                o0OO0oO0.OooOO0(o0oooo);
                o0oo0oo0.f14527Oooo000.getClass();
                o0oooo.OooOOO(SystemClock.elapsedRealtime());
                break;
            case 1:
                ooOOO0Oo ooooo0oo = (ooOOO0Oo) this.f14716OooO0o;
                ooooo0oo.OooOOOO();
                o0O0O0o0 o0o0o0o0 = ((o0OO0oO0) ooooo0oo.f14574OooOo0O).f14520OooOoOO;
                o0OO0oO0.OooOOO0(o0o0o0o0);
                o0o0o0o0.f14398Oooo0.OooO0O0("Starting upload from DelayedRunnable");
                ooooo0oo.f14916OooOo0o.OooOOo0();
                break;
            default:
                oOO0000 ooo0000 = (oOO0000) this.f14716OooO0o;
                ooo0000.OooO0O0().OooOO0O();
                String str = (String) ooo0000.f14810Oooo0o0.pollFirst();
                if (str != null) {
                    ((oo000o) ooo0000.OooO0o0()).getClass();
                    ooo0000.f14825OooooO0 = SystemClock.elapsedRealtime();
                    ooo0000.OooO00o().f14398Oooo0.OooO0OO(str, "Sending trigger URI notification to app");
                    Intent intent = new Intent();
                    intent.setAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                    intent.setPackage(str);
                    oOO0000.OoooO0O(ooo0000.f14805Oooo00O.f14516OooOo0O, intent);
                }
                ooo0000.Oooo00o();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0O00oO(ooOOO0Oo ooooo0oo, o0oo0000 o0oo0000Var) {
        super(o0oo0000Var);
        Objects.requireNonNull(ooooo0oo);
        this.f14716OooO0o = ooooo0oo;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0O00oO(oOO0000 ooo0000, o0oo0000 o0oo0000Var) {
        super(o0oo0000Var);
        Objects.requireNonNull(ooo0000);
        this.f14716OooO0o = ooo0000;
    }
}
