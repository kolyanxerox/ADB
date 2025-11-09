package o00OOOoO;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.OooOo;

/* loaded from: classes3.dex */
public abstract class o000OO00 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public static final o000O f32588OooO00o = new o000O(new byte[0], 0, 0, false);

    /* renamed from: OooO0O0, reason: collision with root package name */
    public static final int f32589OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public static final AtomicReference[] f32590OooO0OO;

    static {
        int iHighestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f32589OooO0O0 = iHighestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[iHighestOneBit];
        for (int i = 0; i < iHighestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference();
        }
        f32590OooO0OO = atomicReferenceArr;
    }

    public static final void OooO00o(o000O segment) {
        OooOo.OooO0o0(segment, "segment");
        if (segment.f32567OooO0o != null || segment.f32569OooO0oO != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (segment.f32566OooO0Oo) {
            return;
        }
        AtomicReference atomicReference = f32590OooO0OO[(int) (Thread.currentThread().getId() & (f32589OooO0O0 - 1))];
        o000O o000o = f32588OooO00o;
        o000O o000o2 = (o000O) atomicReference.getAndSet(o000o);
        if (o000o2 == o000o) {
            return;
        }
        int i = o000o2 != null ? o000o2.f32565OooO0OO : 0;
        if (i >= 65536) {
            atomicReference.set(o000o2);
            return;
        }
        segment.f32567OooO0o = o000o2;
        segment.f32564OooO0O0 = 0;
        segment.f32565OooO0OO = i + 8192;
        atomicReference.set(segment);
    }

    public static final o000O OooO0O0() {
        AtomicReference atomicReference = f32590OooO0OO[(int) (Thread.currentThread().getId() & (f32589OooO0O0 - 1))];
        o000O o000o = f32588OooO00o;
        o000O o000o2 = (o000O) atomicReference.getAndSet(o000o);
        if (o000o2 == o000o) {
            return new o000O();
        }
        if (o000o2 == null) {
            atomicReference.set(null);
            return new o000O();
        }
        atomicReference.set(o000o2.f32567OooO0o);
        o000o2.f32567OooO0o = null;
        o000o2.f32565OooO0OO = 0;
        return o000o2;
    }
}
