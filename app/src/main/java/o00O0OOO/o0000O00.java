package o00O0oOo;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.OooOo;
import o00O0O0O.OooO;
import o00O0O0O.OooO00o;
import o00O0O0O.OooO0OO;
import o00O0O0O.OooO0o;
import o00O0O0O.OooOO0;
import o00O0O0O.OooOO0O;
import o00O0O0O.OooOOO0;

/* loaded from: classes3.dex */
public abstract class o0000O00 extends OooO00o implements OooO {
    public static final o0000 Key = new o0000(OooO0o.f31357OooOo0O, new o000o00o.o0Oo0oo(2));

    public o0000O00() {
        super(OooO0o.f31357OooOo0O);
    }

    public static /* synthetic */ o0000O00 limitedParallelism$default(o0000O00 o0000o00, int i, String str, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: limitedParallelism");
        }
        if ((i2 & 2) != 0) {
            str = null;
        }
        return o0000o00.limitedParallelism(i, str);
    }

    public abstract void dispatch(OooOOO0 oooOOO0, Runnable runnable);

    public void dispatchYield(OooOOO0 oooOOO0, Runnable runnable) {
        dispatch(oooOOO0, runnable);
    }

    @Override // o00O0O0O.OooO00o, o00O0O0O.OooOOO0
    public <E extends OooOO0> E get(OooOO0O key) {
        E e;
        OooOo.OooO0o0(key, "key");
        if (!(key instanceof o0000)) {
            if (OooO0o.f31357OooOo0O == key) {
                return this;
            }
            return null;
        }
        o0000 o0000Var = (o0000) key;
        OooOO0O key2 = getKey();
        OooOo.OooO0o0(key2, "key");
        if ((key2 == o0000Var || o0000Var.f31482OooOo0o == key2) && (e = (E) o0000Var.f31481OooOo0O.invoke(this)) != null) {
            return e;
        }
        return null;
    }

    @Override // o00O0O0O.OooO
    public final <T> OooO0OO interceptContinuation(OooO0OO oooO0OO) {
        return new o00OO000.OooOO0(this, oooO0OO);
    }

    public boolean isDispatchNeeded(OooOOO0 oooOOO0) {
        return !(this instanceof o0oOO);
    }

    public o0000O00 limitedParallelism(int i, String str) {
        o00OO000.OooO00o.OooO00o(i);
        return new o00OO000.OooOO0O(this, i, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x002b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x002c A[RETURN] */
    @Override // o00O0O0O.OooO00o, o00O0O0O.OooOOO0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public o00O0O0O.OooOOO0 minusKey(o00O0O0O.OooOO0O r4) {
        /*
            r3 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.OooOo.OooO0o0(r4, r0)
            boolean r1 = r4 instanceof o00O0oOo.o0000
            o00O0O0O.OooOOO r2 = o00O0O0O.OooOOO.f31358OooOo0O
            if (r1 == 0) goto L27
            o00O0oOo.o0000 r4 = (o00O0oOo.o0000) r4
            o00O0O0O.OooOO0O r1 = r3.getKey()
            kotlin.jvm.internal.OooOo.OooO0o0(r1, r0)
            if (r1 == r4) goto L1c
            o00O0O0O.OooOO0O r0 = r4.f31482OooOo0o
            if (r0 != r1) goto L1b
            goto L1c
        L1b:
            return r3
        L1c:
            o00O0Oo.Oooo000 r4 = r4.f31481OooOo0O
            java.lang.Object r4 = r4.invoke(r3)
            o00O0O0O.OooOO0 r4 = (o00O0O0O.OooOO0) r4
            if (r4 == 0) goto L2c
            goto L2b
        L27:
            o00O0O0O.OooO0o r0 = o00O0O0O.OooO0o.f31357OooOo0O
            if (r0 != r4) goto L2c
        L2b:
            return r2
        L2c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o00O0oOo.o0000O00.minusKey(o00O0O0O.OooOO0O):o00O0O0O.OooOOO0");
    }

    @Override // o00O0O0O.OooO
    public final void releaseInterceptedContinuation(OooO0OO oooO0OO) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        OooOo.OooO0OO(oooO0OO, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        o00OO000.OooOO0 oooOO0 = (o00OO000.OooOO0) oooO0OO;
        do {
            atomicReferenceFieldUpdater = o00OO000.OooOO0.f31933OooOoo;
        } while (atomicReferenceFieldUpdater.get(oooOO0) == o00OO000.OooO00o.f31924OooO0OO);
        Object obj = atomicReferenceFieldUpdater.get(oooOO0);
        oo0o0Oo oo0o0oo = obj instanceof oo0o0Oo ? (oo0o0Oo) obj : null;
        if (oo0o0oo != null) {
            oo0o0oo.OooOO0o();
        }
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + o0000OO0.OooOOOo(this);
    }

    public /* synthetic */ o0000O00 limitedParallelism(int i) {
        return limitedParallelism(i, null);
    }

    public final o0000O00 plus(o0000O00 o0000o00) {
        return o0000o00;
    }
}
