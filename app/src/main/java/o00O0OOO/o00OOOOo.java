package o00O0oOo;

import OooO0oO.OooOo;
import o00O0OO0.OooO0OO;

/* loaded from: classes3.dex */
public final class o00OOOOo extends o00OO000.o00Oo0 implements Runnable {

    /* renamed from: OooOoO, reason: collision with root package name */
    public final long f31549OooOoO;

    public o00OOOOo(long j, OooO0OO oooO0OO) {
        super(oooO0OO, oooO0OO.getContext());
        this.f31549OooOoO = j;
    }

    @Override // o00O0oOo.o00O
    public final String Oooo() {
        return super.Oooo() + "(timeMillis=" + this.f31549OooOoO + ')';
    }

    @Override // java.lang.Runnable
    public final void run() {
        o0000OO0.OooOOOO(this.f31520OooOo);
        OooOo0O(new o00OOOO0(OooOo.OooOOOO(new StringBuilder("Timed out waiting for "), this.f31549OooOoO, " ms"), this));
    }
}
