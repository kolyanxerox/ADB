package o00OO00o;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes3.dex */
public final class Oooo000 {

    /* renamed from: OooO0O0, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f32013OooO0O0 = AtomicReferenceFieldUpdater.newUpdater(Oooo000.class, Object.class, "lastScheduledTask$volatile");

    /* renamed from: OooO0OO, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f32014OooO0OO = AtomicIntegerFieldUpdater.newUpdater(Oooo000.class, "producerIndex$volatile");

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f32015OooO0Oo = AtomicIntegerFieldUpdater.newUpdater(Oooo000.class, "consumerIndex$volatile");

    /* renamed from: OooO0o0, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f32016OooO0o0 = AtomicIntegerFieldUpdater.newUpdater(Oooo000.class, "blockingTasksInBuffer$volatile");

    /* renamed from: OooO00o, reason: collision with root package name */
    public final AtomicReferenceArray f32017OooO00o = new AtomicReferenceArray(128);
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;

    public final OooOOO OooO00o(OooOOO oooOOO) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f32014OooO0OO;
        if (atomicIntegerFieldUpdater.get(this) - f32015OooO0Oo.get(this) == 127) {
            return oooOOO;
        }
        if (oooOOO.f32003OooOo0o) {
            f32016OooO0o0.incrementAndGet(this);
        }
        int i = atomicIntegerFieldUpdater.get(this) & 127;
        while (true) {
            AtomicReferenceArray atomicReferenceArray = this.f32017OooO00o;
            if (atomicReferenceArray.get(i) == null) {
                atomicReferenceArray.lazySet(i, oooOOO);
                atomicIntegerFieldUpdater.incrementAndGet(this);
                return null;
            }
            Thread.yield();
        }
    }

    public final OooOOO OooO0O0() {
        OooOOO oooOOO;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f32015OooO0Oo;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i - f32014OooO0OO.get(this) == 0) {
                return null;
            }
            int i2 = i & 127;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i, i + 1) && (oooOOO = (OooOOO) this.f32017OooO00o.getAndSet(i2, null)) != null) {
                if (oooOOO.f32003OooOo0o) {
                    f32016OooO0o0.decrementAndGet(this);
                }
                return oooOOO;
            }
        }
    }

    public final OooOOO OooO0OO(int i, boolean z) {
        int i2 = i & 127;
        AtomicReferenceArray atomicReferenceArray = this.f32017OooO00o;
        OooOOO oooOOO = (OooOOO) atomicReferenceArray.get(i2);
        if (oooOOO != null && oooOOO.f32003OooOo0o == z) {
            while (!atomicReferenceArray.compareAndSet(i2, oooOOO, null)) {
                if (atomicReferenceArray.get(i2) != oooOOO) {
                }
            }
            if (z) {
                f32016OooO0o0.decrementAndGet(this);
            }
            return oooOOO;
        }
        return null;
    }
}
