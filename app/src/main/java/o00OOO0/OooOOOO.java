package o00OOO0;

import java.lang.ref.Reference;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import oOooo0o.o00OOOOo;

/* loaded from: classes3.dex */
public final class OooOOOO {

    /* renamed from: OooO0oO */
    public static final ThreadPoolExecutor f32175OooO0oO;

    /* renamed from: OooO00o */
    public final int f32176OooO00o;

    /* renamed from: OooO0O0 */
    public final long f32177OooO0O0;

    /* renamed from: OooO0OO */
    public final Oooo.OooOOO f32178OooO0OO;

    /* renamed from: OooO0Oo */
    public final ArrayDeque f32179OooO0Oo;

    /* renamed from: OooO0o */
    public boolean f32180OooO0o;

    /* renamed from: OooO0o0 */
    public final o000Ooo.o00oO0o f32181OooO0o0;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        SynchronousQueue synchronousQueue = new SynchronousQueue();
        byte[] bArr = o00OOO0O.OooO0OO.f32335OooO00o;
        f32175OooO0oO = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, timeUnit, synchronousQueue, new o00OOO0O.OooO0O0("OkHttp ConnectionPool", true));
    }

    public OooOOOO() {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        this.f32178OooO0OO = new Oooo.OooOOO(this, 19);
        this.f32179OooO0Oo = new ArrayDeque();
        this.f32181OooO0o0 = new o000Ooo.o00oO0o(14);
        this.f32176OooO00o = 5;
        this.f32177OooO0O0 = timeUnit.toNanos(5L);
    }

    public final int OooO00o(o00OOO.OooO0O0 oooO0O0, long j) {
        ArrayList arrayList = oooO0O0.f32117OooOOO;
        int i = 0;
        while (i < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                o00OOOOo.f33168OooO00o.OooOOO0("A connection to " + oooO0O0.f32109OooO0OO.f32229OooO00o.f32124OooO00o + " was leaked. Did you forget to close a response body?", ((o00OOO.OooO0o) reference).f32122OooO00o);
                arrayList.remove(i);
                oooO0O0.f32116OooOO0O = true;
                if (arrayList.isEmpty()) {
                    oooO0O0.f32119OooOOOO = j - this.f32177OooO0O0;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }
}
