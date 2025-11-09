package OoooO0O;

import OooO0oO.OooOo;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
public final /* synthetic */ class o000 implements ThreadFactory {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f13901OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Object f13902OooO0O0;

    public /* synthetic */ o000(Object obj, int i) {
        this.f13901OooO00o = i;
        this.f13902OooO0O0 = obj;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f13901OooO00o) {
            case 0:
                o000O000 o000o0002 = (o000O000) this.f13902OooO0O0;
                Thread thread = new Thread(runnable, OooOo.OooO0o(o000o0002.f13960OooOo0O.getAndIncrement(), "Google consent worker #"));
                o000o0002.f13959OooOo = new WeakReference(thread);
                return thread;
            default:
                Thread threadNewThread = Executors.defaultThreadFactory().newThread(new o000Ooo.o00000O(runnable));
                threadNewThread.setName("awaitEvenIfOnMainThread task continuation executor" + ((AtomicLong) this.f13902OooO0O0).getAndIncrement());
                return threadNewThread;
        }
    }
}
