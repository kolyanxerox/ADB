package o00oOOo;

import java.util.Random;

/* loaded from: classes3.dex */
public abstract class o00oO0o extends o0Oo0oo {
    @Override // o00oOOo.o0Oo0oo
    public final int OooO00o(int i) {
        return ((-i) >> 31) & (OooO0o().nextInt() >>> (32 - i));
    }

    @Override // o00oOOo.o0Oo0oo
    public final int OooO0O0() {
        return OooO0o().nextInt();
    }

    @Override // o00oOOo.o0Oo0oo
    public final long OooO0OO() {
        return OooO0o().nextLong();
    }

    public abstract Random OooO0o();
}
