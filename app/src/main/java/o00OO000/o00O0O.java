package o00OO000;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes3.dex */
public final class o00O0O {
    private volatile AtomicReferenceArray<Object> array;

    public o00O0O(int i) {
        this.array = new AtomicReferenceArray<>(i);
    }

    public final int OooO00o() {
        return this.array.length();
    }

    public final Object OooO0O0(int i) {
        AtomicReferenceArray<Object> atomicReferenceArray = this.array;
        if (i < atomicReferenceArray.length()) {
            return atomicReferenceArray.get(i);
        }
        return null;
    }

    public final void OooO0OO(int i, o00OO00o.OooO00o oooO00o) {
        AtomicReferenceArray<Object> atomicReferenceArray = this.array;
        int length = atomicReferenceArray.length();
        if (i < length) {
            atomicReferenceArray.set(i, oooO00o);
            return;
        }
        int i2 = i + 1;
        int i3 = length * 2;
        if (i2 < i3) {
            i2 = i3;
        }
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(i2);
        for (int i4 = 0; i4 < length; i4++) {
            atomicReferenceArray2.set(i4, atomicReferenceArray.get(i4));
        }
        atomicReferenceArray2.set(i, oooO00o);
        this.array = atomicReferenceArray2;
    }
}
