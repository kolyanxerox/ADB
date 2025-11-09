package o0000ooO;

import OooOOo0.o00Oo0;
import Oooo00O.o000000O;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Logger;
import o00000oO.OooOOO0;

/* loaded from: classes2.dex */
public final class o0O0OO0 implements Executor {

    /* renamed from: OooOoOO, reason: collision with root package name */
    public static final Logger f29717OooOoOO = Logger.getLogger(o0O0OO0.class.getName());

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final Executor f29719OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final ArrayDeque f29720OooOo0o = new ArrayDeque();

    /* renamed from: OooOo, reason: collision with root package name */
    public int f29718OooOo = 1;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public long f29722OooOoO0 = 0;

    /* renamed from: OooOoO, reason: collision with root package name */
    public final OooOOO0 f29721OooOoO = new OooOOO0(this);

    public o0O0OO0(Executor executor) {
        o000000O.OooO0oo(executor);
        this.f29719OooOo0O = executor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        o000000O.OooO0oo(runnable);
        synchronized (this.f29720OooOo0o) {
            int i = this.f29718OooOo;
            if (i != 4 && i != 3) {
                long j = this.f29722OooOoO0;
                o00Oo0 o00oo0 = new o00Oo0(runnable, 1);
                this.f29720OooOo0o.add(o00oo0);
                this.f29718OooOo = 2;
                try {
                    this.f29719OooOo0O.execute(this.f29721OooOoO);
                    if (this.f29718OooOo != 2) {
                        return;
                    }
                    synchronized (this.f29720OooOo0o) {
                        try {
                            if (this.f29722OooOoO0 == j && this.f29718OooOo == 2) {
                                this.f29718OooOo = 3;
                            }
                        } finally {
                        }
                    }
                    return;
                } catch (Error | RuntimeException e) {
                    synchronized (this.f29720OooOo0o) {
                        try {
                            int i2 = this.f29718OooOo;
                            boolean z = true;
                            if ((i2 != 1 && i2 != 2) || !this.f29720OooOo0o.removeLastOccurrence(o00oo0)) {
                                z = false;
                            }
                            if (!(e instanceof RejectedExecutionException) || z) {
                                throw e;
                            }
                        } finally {
                        }
                    }
                    return;
                }
            }
            this.f29720OooOo0o.add(runnable);
        }
    }

    public final String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.f29719OooOo0O + "}";
    }
}
