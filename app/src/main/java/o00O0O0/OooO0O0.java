package o00O0o0;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import kotlin.jvm.internal.OooOo;
import o00oOOo.o00oO0o;

/* loaded from: classes3.dex */
public final class OooO0O0 extends o00oO0o {
    @Override // o00oOOo.o00oO0o
    public final Random OooO0o() {
        ThreadLocalRandom threadLocalRandomCurrent = ThreadLocalRandom.current();
        OooOo.OooO0Oo(threadLocalRandomCurrent, "current(...)");
        return threadLocalRandomCurrent;
    }

    @Override // o00oOOo.o0Oo0oo
    public final long OooO0o0(long j, long j2) {
        return ThreadLocalRandom.current().nextLong(j, j2);
    }
}
