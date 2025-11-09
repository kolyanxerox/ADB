package OoooOOO;

import androidx.core.location.LocationRequestCompat;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* loaded from: classes2.dex */
public final class o0OO0O0 extends FutureTask implements Comparable {

    /* renamed from: OooOo, reason: collision with root package name */
    public final String f14498OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final long f14499OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final boolean f14500OooOo0o;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ o0OO0o00 f14501OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OO0O0(o0OO0o00 o0oo0o00, Runnable runnable, boolean z, String str) {
        super(runnable, null);
        Objects.requireNonNull(o0oo0o00);
        this.f14501OooOoO0 = o0oo0o00;
        long andIncrement = o0OO0o00.f14505Oooo000.getAndIncrement();
        this.f14499OooOo0O = andIncrement;
        this.f14498OooOo = str;
        this.f14500OooOo0o = z;
        if (andIncrement == LocationRequestCompat.PASSIVE_INTERVAL) {
            o0O0O0o0 o0o0o0o0 = ((o0OO0oO0) o0oo0o00.f14574OooOo0O).f14520OooOoOO;
            o0OO0oO0.OooOOO0(o0o0o0o0);
            o0o0o0o0.f14393OooOoOO.OooO0O0("Tasks index overflow");
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        o0OO0O0 o0oo0o0 = (o0OO0O0) obj;
        boolean z = o0oo0o0.f14500OooOo0o;
        boolean z2 = this.f14500OooOo0o;
        if (z2 != z) {
            return !z2 ? 1 : -1;
        }
        long j = this.f14499OooOo0O;
        long j2 = o0oo0o0.f14499OooOo0O;
        if (j < j2) {
            return -1;
        }
        if (j > j2) {
            return 1;
        }
        o0O0O0o0 o0o0o0o0 = ((o0OO0oO0) this.f14501OooOoO0.f14574OooOo0O).f14520OooOoOO;
        o0OO0oO0.OooOOO0(o0o0o0o0);
        o0o0o0o0.f14395OooOoo0.OooO0OO(Long.valueOf(j), "Two tasks share the same index. index");
        return 0;
    }

    @Override // java.util.concurrent.FutureTask
    public final void setException(Throwable th) {
        o0O0O0o0 o0o0o0o0 = ((o0OO0oO0) this.f14501OooOoO0.f14574OooOo0O).f14520OooOoOO;
        o0OO0oO0.OooOOO0(o0o0o0o0);
        o0o0o0o0.f14393OooOoOO.OooO0OO(th, this.f14498OooOo);
        super.setException(th);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OO0O0(o0OO0o00 o0oo0o00, Callable callable, boolean z) {
        super(callable);
        Objects.requireNonNull(o0oo0o00);
        this.f14501OooOoO0 = o0oo0o00;
        long andIncrement = o0OO0o00.f14505Oooo000.getAndIncrement();
        this.f14499OooOo0O = andIncrement;
        this.f14498OooOo = "Task exception on worker thread";
        this.f14500OooOo0o = z;
        if (andIncrement == LocationRequestCompat.PASSIVE_INTERVAL) {
            o0O0O0o0 o0o0o0o0 = ((o0OO0oO0) o0oo0o00.f14574OooOo0O).f14520OooOoOO;
            o0OO0oO0.OooOOO0(o0o0o0o0);
            o0o0o0o0.f14393OooOoOO.OooO0O0("Tasks index overflow");
        }
    }
}
