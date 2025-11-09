package OoooOOO;

import Oooo00O.o000000O;
import Oooo0OO.oo000o;
import OoooO0.OooOO0O;
import android.os.Handler;
import o00000oO.OooOOO0;

/* loaded from: classes2.dex */
public abstract class oo0O {

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public static volatile OooOO0O f14907OooO0Oo;

    /* renamed from: OooO00o, reason: collision with root package name */
    public final o0oo0000 f14908OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final OooOOO0 f14909OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public volatile long f14910OooO0OO;

    public oo0O(o0oo0000 o0oo0000Var) {
        o000000O.OooO0oo(o0oo0000Var);
        this.f14908OooO00o = o0oo0000Var;
        this.f14909OooO0O0 = new OooOOO0(this, o0oo0000Var);
    }

    public abstract void OooO00o();

    public final void OooO0O0(long j) {
        OooO0OO();
        if (j >= 0) {
            o0oo0000 o0oo0000Var = this.f14908OooO00o;
            ((oo000o) o0oo0000Var.OooO0o0()).getClass();
            this.f14910OooO0OO = System.currentTimeMillis();
            if (OooO0Oo().postDelayed(this.f14909OooO0O0, j)) {
                return;
            }
            o0oo0000Var.OooO00o().f14393OooOoOO.OooO0OO(Long.valueOf(j), "Failed to schedule delayed post. time");
        }
    }

    public final void OooO0OO() {
        this.f14910OooO0OO = 0L;
        OooO0Oo().removeCallbacks(this.f14909OooO0O0);
    }

    public final Handler OooO0Oo() {
        OooOO0O oooOO0O;
        if (f14907OooO0Oo != null) {
            return f14907OooO0Oo;
        }
        synchronized (oo0O.class) {
            try {
                if (f14907OooO0Oo == null) {
                    f14907OooO0Oo = new OooOO0O(this.f14908OooO00o.OooO0Oo().getMainLooper(), 2);
                }
                oooOO0O = f14907OooO0Oo;
            } catch (Throwable th) {
                throw th;
            }
        }
        return oooOO0O;
    }
}
