package o00OO000;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import o00O0oOo.o00oOoo;
import o00O0oOo.o0O0ooO;

/* loaded from: classes3.dex */
public class o0ooOOo {

    /* renamed from: OooO0O0, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f31969OooO0O0 = AtomicIntegerFieldUpdater.newUpdater(o0ooOOo.class, "_size$volatile");

    /* renamed from: OooO00o, reason: collision with root package name */
    public o0O0ooO[] f31970OooO00o;
    private volatile /* synthetic */ int _size$volatile;

    public final void OooO00o(o0O0ooO o0o0ooo) {
        o0o0ooo.OooO0OO((o00oOoo) this);
        o0O0ooO[] o0o0oooArr = this.f31970OooO00o;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f31969OooO0O0;
        if (o0o0oooArr == null) {
            o0o0oooArr = new o0O0ooO[4];
            this.f31970OooO00o = o0o0oooArr;
        } else if (atomicIntegerFieldUpdater.get(this) >= o0o0oooArr.length) {
            Object[] objArrCopyOf = Arrays.copyOf(o0o0oooArr, atomicIntegerFieldUpdater.get(this) * 2);
            kotlin.jvm.internal.OooOo.OooO0Oo(objArrCopyOf, "copyOf(...)");
            o0o0oooArr = (o0O0ooO[]) objArrCopyOf;
            this.f31970OooO00o = o0o0oooArr;
        }
        int i = atomicIntegerFieldUpdater.get(this);
        atomicIntegerFieldUpdater.set(this, i + 1);
        o0o0oooArr[i] = o0o0ooo;
        o0o0ooo.f31564OooOo0o = i;
        OooO0OO(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final o00O0oOo.o0O0ooO OooO0O0(int r9) {
        /*
            r8 = this;
            o00O0oOo.o0O0ooO[] r0 = r8.f31970OooO00o
            kotlin.jvm.internal.OooOo.OooO0O0(r0)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = o00OO000.o0ooOOo.f31969OooO0O0
            int r2 = r1.get(r8)
            r3 = -1
            int r2 = r2 + r3
            r1.set(r8, r2)
            int r2 = r1.get(r8)
            if (r9 >= r2) goto L7a
            int r2 = r1.get(r8)
            r8.OooO0Oo(r9, r2)
            int r2 = r9 + (-1)
            int r2 = r2 / 2
            if (r9 <= 0) goto L3a
            r4 = r0[r9]
            kotlin.jvm.internal.OooOo.OooO0O0(r4)
            r5 = r0[r2]
            kotlin.jvm.internal.OooOo.OooO0O0(r5)
            int r4 = r4.compareTo(r5)
            if (r4 >= 0) goto L3a
            r8.OooO0Oo(r9, r2)
            r8.OooO0OO(r2)
            goto L7a
        L3a:
            int r2 = r9 * 2
            int r4 = r2 + 1
            int r5 = r1.get(r8)
            if (r4 < r5) goto L45
            goto L7a
        L45:
            o00O0oOo.o0O0ooO[] r5 = r8.f31970OooO00o
            kotlin.jvm.internal.OooOo.OooO0O0(r5)
            int r2 = r2 + 2
            int r6 = r1.get(r8)
            if (r2 >= r6) goto L63
            r6 = r5[r2]
            kotlin.jvm.internal.OooOo.OooO0O0(r6)
            r7 = r5[r4]
            kotlin.jvm.internal.OooOo.OooO0O0(r7)
            int r6 = r6.compareTo(r7)
            if (r6 >= 0) goto L63
            goto L64
        L63:
            r2 = r4
        L64:
            r4 = r5[r9]
            kotlin.jvm.internal.OooOo.OooO0O0(r4)
            r5 = r5[r2]
            kotlin.jvm.internal.OooOo.OooO0O0(r5)
            int r4 = r4.compareTo(r5)
            if (r4 > 0) goto L75
            goto L7a
        L75:
            r8.OooO0Oo(r9, r2)
            r9 = r2
            goto L3a
        L7a:
            int r9 = r1.get(r8)
            r9 = r0[r9]
            kotlin.jvm.internal.OooOo.OooO0O0(r9)
            r2 = 0
            r9.OooO0OO(r2)
            r9.f31564OooOo0o = r3
            int r1 = r1.get(r8)
            r0[r1] = r2
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: o00OO000.o0ooOOo.OooO0O0(int):o00O0oOo.o0O0ooO");
    }

    public final void OooO0OO(int i) {
        while (i > 0) {
            o0O0ooO[] o0o0oooArr = this.f31970OooO00o;
            kotlin.jvm.internal.OooOo.OooO0O0(o0o0oooArr);
            int i2 = (i - 1) / 2;
            o0O0ooO o0o0ooo = o0o0oooArr[i2];
            kotlin.jvm.internal.OooOo.OooO0O0(o0o0ooo);
            o0O0ooO o0o0ooo2 = o0o0oooArr[i];
            kotlin.jvm.internal.OooOo.OooO0O0(o0o0ooo2);
            if (o0o0ooo.compareTo(o0o0ooo2) <= 0) {
                return;
            }
            OooO0Oo(i, i2);
            i = i2;
        }
    }

    public final void OooO0Oo(int i, int i2) {
        o0O0ooO[] o0o0oooArr = this.f31970OooO00o;
        kotlin.jvm.internal.OooOo.OooO0O0(o0o0oooArr);
        o0O0ooO o0o0ooo = o0o0oooArr[i2];
        kotlin.jvm.internal.OooOo.OooO0O0(o0o0ooo);
        o0O0ooO o0o0ooo2 = o0o0oooArr[i];
        kotlin.jvm.internal.OooOo.OooO0O0(o0o0ooo2);
        o0o0oooArr[i] = o0o0ooo;
        o0o0oooArr[i2] = o0o0ooo2;
        o0o0ooo.f31564OooOo0o = i;
        o0o0ooo2.f31564OooOo0o = i2;
    }
}
