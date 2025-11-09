package o00O0oOo;

import OooOOO0.OooO00o;
import androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.OooOo;
import o000O0O0.OooO0O0;
import o00O0O0O.OooO0OO;
import o00O0O0O.OooOOO0;
import o00O0O0o.OooOo00;
import o00O0OO0.OooO0o;
import o00O0Oo.Oooo000;
import o00OO000.OooOO0;

/* loaded from: classes3.dex */
public class oo0o0Oo extends o000O0Oo implements o0Oo0oo, OooO0o, o0oOOo {

    /* renamed from: OooOoO */
    public final OooOOO0 f31582OooOoO;

    /* renamed from: OooOoO0 */
    public final OooO0OO f31583OooOoO0;
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    /* renamed from: OooOoOO */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f31579OooOoOO = AtomicIntegerFieldUpdater.newUpdater(oo0o0Oo.class, "_decisionAndIndex$volatile");

    /* renamed from: OooOoo0 */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f31581OooOoo0 = AtomicReferenceFieldUpdater.newUpdater(oo0o0Oo.class, Object.class, "_state$volatile");

    /* renamed from: OooOoo */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f31580OooOoo = AtomicReferenceFieldUpdater.newUpdater(oo0o0Oo.class, Object.class, "_parentHandle$volatile");

    public oo0o0Oo(int i, OooO0OO oooO0OO) {
        super(i);
        this.f31583OooOoO0 = oooO0OO;
        this.f31582OooOoO = oooO0OO.getContext();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = o0OoOo0.f31567OooOo0O;
    }

    public static void OooOo0o(oo0O oo0o, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + oo0o + ", already has " + obj).toString());
    }

    public static Object OooOoo(oo0O oo0o, Object obj, int i, o00O0Oo.o00Oo0 o00oo0) {
        if (obj instanceof o0000Ooo) {
            return obj;
        }
        if (i != 1 && i != 2) {
            return obj;
        }
        if (o00oo0 != null || (oo0o instanceof o0OOO0o)) {
            return new o00000OO(obj, oo0o instanceof o0OOO0o ? (o0OOO0o) oo0o : null, o00oo0, (CancellationException) null, 16);
        }
        return obj;
    }

    public final void OooO(o0OOO0o o0ooo0o, Throwable th) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            o0ooo0o.OooO00o(th);
        } catch (Throwable th2) {
            o0000OO0.OooOOo(this.f31582OooOoO, new OooO00o("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    @Override // o00O0oOo.o000O0Oo
    public final void OooO00o(CancellationException cancellationException) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        CancellationException cancellationException2;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f31581OooOoo0;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof oo0O) {
                throw new IllegalStateException("Not completed");
            }
            if (obj instanceof o0000Ooo) {
                return;
            }
            if (!(obj instanceof o00000OO)) {
                cancellationException2 = cancellationException;
                o00000OO o00000oo2 = new o00000OO(obj, (o0OOO0o) null, (o00O0Oo.o00Oo0) null, cancellationException2, 14);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, o00000oo2)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            o00000OO o00000oo3 = (o00000OO) obj;
            if (o00000oo3.f31488OooO0o0 != null) {
                throw new IllegalStateException("Must be called at most once");
            }
            o00000OO o00000ooOooO00o = o00000OO.OooO00o(o00000oo3, null, cancellationException, 15);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, o00000ooOooO00o)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    cancellationException2 = cancellationException;
                }
            }
            o0OOO0o o0ooo0o = o00000oo3.f31485OooO0O0;
            if (o0ooo0o != null) {
                OooO(o0ooo0o, cancellationException);
            }
            o00O0Oo.o00Oo0 o00oo0 = o00000oo3.f31486OooO0OO;
            if (o00oo0 != null) {
                OooOO0(o00oo0, cancellationException, o00000oo3.f31484OooO00o);
                return;
            }
            return;
            cancellationException = cancellationException2;
        }
    }

    @Override // o00O0oOo.o0oOOo
    public final void OooO0O0(o00OO000.o00Ooo o00ooo2, int i) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        do {
            atomicIntegerFieldUpdater = f31579OooOoOO;
            i2 = atomicIntegerFieldUpdater.get(this);
            if ((i2 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, ((i2 >> 29) << 29) + i));
        OooOo0(o00ooo2);
    }

    @Override // o00O0oOo.o000O0Oo
    public final OooO0OO OooO0OO() {
        return this.f31583OooOoO0;
    }

    @Override // o00O0oOo.o000O0Oo
    public final Throwable OooO0Oo(Object obj) {
        Throwable thOooO0Oo = super.OooO0Oo(obj);
        if (thOooO0Oo != null) {
            return thOooO0Oo;
        }
        return null;
    }

    @Override // o00O0oOo.o000O0Oo
    public final Object OooO0o0(Object obj) {
        return obj instanceof o00000OO ? ((o00000OO) obj).f31484OooO00o : obj;
    }

    @Override // o00O0oOo.o0Oo0oo
    public final boolean OooO0oO(Throwable th) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f31581OooOoo0;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof oo0O)) {
                return false;
            }
            o0O0O00 o0o0o00 = new o0O0O00(this, th, (obj instanceof o0OOO0o) || (obj instanceof o00OO000.o00Ooo));
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, o0o0o00)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            oo0O oo0o = (oo0O) obj;
            if (oo0o instanceof o0OOO0o) {
                OooO((o0OOO0o) obj, th);
            } else if (oo0o instanceof o00OO000.o00Ooo) {
                OooOO0O((o00OO000.o00Ooo) obj, th);
            }
            if (!OooOo0O()) {
                OooOO0o();
            }
            OooOOO0(this.f31515OooOo);
            return true;
        }
    }

    @Override // o00O0oOo.o000O0Oo
    public final Object OooO0oo() {
        return f31581OooOoo0.get(this);
    }

    public final void OooOO0(o00O0Oo.o00Oo0 o00oo0, Throwable th, Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        OooOOO0 oooOOO0 = this.f31582OooOoO;
        try {
            o00oo0.invoke(th, obj, oooOOO0);
        } catch (Throwable th2) {
            o0000OO0.OooOOo(oooOOO0, new OooO00o("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    public final void OooOO0O(o00OO000.o00Ooo o00ooo2, Throwable th) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        OooOOO0 oooOOO0 = this.f31582OooOoO;
        int i = f31579OooOoOO.get(this) & 536870911;
        if (i == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
        }
        try {
            o00ooo2.OooO0oo(i, oooOOO0);
        } catch (Throwable th2) {
            o0000OO0.OooOOo(oooOOO0, new OooO00o("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void OooOO0o() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f31580OooOoo;
        o000OO00 o000oo002 = (o000OO00) atomicReferenceFieldUpdater.get(this);
        if (o000oo002 == null) {
            return;
        }
        o000oo002.dispose();
        atomicReferenceFieldUpdater.set(this, o00OO0OO.f31547OooOo0O);
    }

    public Throwable OooOOO(o00O o00o) {
        return o00o.OooO0o0();
    }

    public final void OooOOO0(int i) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        do {
            atomicIntegerFieldUpdater = f31579OooOoOO;
            i2 = atomicIntegerFieldUpdater.get(this);
            int i3 = i2 >> 29;
            if (i3 != 0) {
                if (i3 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                OooO0OO oooO0OO = this.f31583OooOoO0;
                boolean z = i == 4;
                if (!z && (oooO0OO instanceof OooOO0)) {
                    boolean z2 = i == 1 || i == 2;
                    int i4 = this.f31515OooOo;
                    if (z2 == (i4 == 1 || i4 == 2)) {
                        OooOO0 oooOO0 = (OooOO0) oooO0OO;
                        o0000O00 o0000o00 = oooOO0.f31935OooOoO0;
                        OooOOO0 context = oooOO0.f31934OooOoO.getContext();
                        if (o0000o00.isDispatchNeeded(context)) {
                            o0000o00.dispatch(context, this);
                            return;
                        }
                        o00O000o o00o000oOooO00o = o0o0Oo.OooO00o();
                        if (o00o000oOooO00o.f31530OooOo0O >= 4294967296L) {
                            o00o000oOooO00o.OooOOO(this);
                            return;
                        }
                        o00o000oOooO00o.OooOOOo(true);
                        try {
                            o0000OO0.OooOoO0(this, oooO0OO, true);
                            do {
                            } while (o00o000oOooO00o.OooOOoo());
                        } finally {
                            try {
                                return;
                            } finally {
                            }
                        }
                        return;
                    }
                }
                o0000OO0.OooOoO0(this, oooO0OO, z);
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, BasicMeasure.EXACTLY + (536870911 & i2)));
    }

    @Override // o00O0oOo.o0Oo0oo
    public final OooO0O0 OooOOOO(Object obj, o00O0Oo.o00Oo0 o00oo0) {
        return OooOooO(obj, o00oo0);
    }

    public final Object OooOOOo() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        boolean zOooOo0O = OooOo0O();
        do {
            atomicIntegerFieldUpdater = f31579OooOoOO;
            i = atomicIntegerFieldUpdater.get(this);
            int i2 = i >> 29;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new IllegalStateException("Already suspended");
                }
                if (zOooOo0O) {
                    OooOoO0();
                }
                Object obj = f31581OooOoo0.get(this);
                if (obj instanceof o0000Ooo) {
                    throw ((o0000Ooo) obj).f31507OooO00o;
                }
                int i3 = this.f31515OooOo;
                if (i3 == 1 || i3 == 2) {
                    o00O0O00 o00o0o00 = (o00O0O00) this.f31582OooOoO.get(o00O0.f31523OooOo0O);
                    if (o00o0o00 != null && !o00o0o00.isActive()) {
                        CancellationException cancellationExceptionOooO0o0 = o00o0o00.OooO0o0();
                        OooO00o(cancellationExceptionOooO0o0);
                        throw cancellationExceptionOooO0o0;
                    }
                }
                return OooO0o0(obj);
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 536870912 + (536870911 & i)));
        if (((o000OO00) f31580OooOoo.get(this)) == null) {
            OooOOoo();
        }
        if (zOooOo0O) {
            OooOoO0();
        }
        return OooOo00.f31365OooOo0O;
    }

    @Override // o00O0oOo.o0Oo0oo
    public final void OooOOo(Object obj) {
        OooOOO0(this.f31515OooOo);
    }

    public final void OooOOo0() {
        o000OO00 o000oo00OooOOoo = OooOOoo();
        if (o000oo00OooOOoo == null || (f31581OooOoo0.get(this) instanceof oo0O)) {
            return;
        }
        o000oo00OooOOoo.dispose();
        f31580OooOoo.set(this, o00OO0OO.f31547OooOo0O);
    }

    public final o000OO00 OooOOoo() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        o00O0O00 o00o0o00 = (o00O0O00) this.f31582OooOoO.get(o00O0.f31523OooOo0O);
        if (o00o0o00 == null) {
            return null;
        }
        o000OO00 o000oo00OooOOoo = o0000OO0.OooOOoo(o00o0o00, true, new o000OOo(this, 0));
        do {
            atomicReferenceFieldUpdater = f31580OooOoo;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, o000oo00OooOOoo)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return o000oo00OooOOoo;
    }

    public String OooOo() {
        return "CancellableContinuation";
    }

    /* JADX WARN: Code restructure failed: missing block: B:152:0x00b7, code lost:
    
        OooOo0o(r8, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x00ba, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void OooOo0(o00O0oOo.oo0O r8) {
        /*
            r7 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = o00O0oOo.oo0o0Oo.f31581OooOoo0
            java.lang.Object r2 = r0.get(r7)
            boolean r1 = r2 instanceof o00O0oOo.o0OoOo0
            if (r1 == 0) goto L19
        La:
            boolean r1 = r0.compareAndSet(r7, r2, r8)
            if (r1 == 0) goto L12
            goto Lae
        L12:
            java.lang.Object r1 = r0.get(r7)
            if (r1 == r2) goto La
            goto L0
        L19:
            boolean r1 = r2 instanceof o00O0oOo.o0OOO0o
            r3 = 0
            if (r1 != 0) goto Lb7
            boolean r1 = r2 instanceof o00OO000.o00Ooo
            if (r1 != 0) goto Lb7
            boolean r1 = r2 instanceof o00O0oOo.o0000Ooo
            if (r1 == 0) goto L5b
            r0 = r2
            o00O0oOo.o0000Ooo r0 = (o00O0oOo.o0000Ooo) r0
            r0.getClass()
            r1 = 1
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r4 = o00O0oOo.o0000Ooo.f31506OooO0O0
            r5 = 0
            boolean r1 = r4.compareAndSet(r0, r5, r1)
            if (r1 == 0) goto L57
            boolean r1 = r2 instanceof o00O0oOo.o0O0O00
            if (r1 == 0) goto Lae
            if (r2 == 0) goto L3d
            goto L3e
        L3d:
            r0 = r3
        L3e:
            if (r0 == 0) goto L42
            java.lang.Throwable r3 = r0.f31507OooO00o
        L42:
            boolean r0 = r8 instanceof o00O0oOo.o0OOO0o
            if (r0 == 0) goto L4c
            o00O0oOo.o0OOO0o r8 = (o00O0oOo.o0OOO0o) r8
            r7.OooO(r8, r3)
            return
        L4c:
            java.lang.String r0 = "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>"
            kotlin.jvm.internal.OooOo.OooO0OO(r8, r0)
            o00OO000.o00Ooo r8 = (o00OO000.o00Ooo) r8
            r7.OooOO0O(r8, r3)
            return
        L57:
            OooOo0o(r8, r2)
            throw r3
        L5b:
            boolean r1 = r2 instanceof o00O0oOo.o00000OO
            java.lang.String r4 = "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler"
            if (r1 == 0) goto L94
            r1 = r2
            o00O0oOo.o00000OO r1 = (o00O0oOo.o00000OO) r1
            o00O0oOo.o0OOO0o r5 = r1.f31485OooO0O0
            if (r5 != 0) goto L90
            boolean r5 = r8 instanceof o00OO000.o00Ooo
            if (r5 == 0) goto L6d
            return
        L6d:
            kotlin.jvm.internal.OooOo.OooO0OO(r8, r4)
            r4 = r8
            o00O0oOo.o0OOO0o r4 = (o00O0oOo.o0OOO0o) r4
            java.lang.Throwable r5 = r1.f31488OooO0o0
            if (r5 == 0) goto L7b
            r7.OooO(r4, r5)
            return
        L7b:
            r5 = 29
            o00O0oOo.o00000OO r1 = o00O0oOo.o00000OO.OooO00o(r1, r4, r3, r5)
        L81:
            boolean r3 = r0.compareAndSet(r7, r2, r1)
            if (r3 == 0) goto L88
            goto Lae
        L88:
            java.lang.Object r3 = r0.get(r7)
            if (r3 == r2) goto L81
            goto L0
        L90:
            OooOo0o(r8, r2)
            throw r3
        L94:
            boolean r1 = r8 instanceof o00OO000.o00Ooo
            if (r1 == 0) goto L99
            return
        L99:
            kotlin.jvm.internal.OooOo.OooO0OO(r8, r4)
            r3 = r8
            o00O0oOo.o0OOO0o r3 = (o00O0oOo.o0OOO0o) r3
            o00O0oOo.o00000OO r1 = new o00O0oOo.o00000OO
            r4 = 0
            r5 = 0
            r6 = 28
            r1.<init>(r2, r3, r4, r5, r6)
        La8:
            boolean r3 = r0.compareAndSet(r7, r2, r1)
            if (r3 == 0) goto Laf
        Lae:
            return
        Laf:
            java.lang.Object r3 = r0.get(r7)
            if (r3 == r2) goto La8
            goto L0
        Lb7:
            OooOo0o(r8, r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o00O0oOo.oo0o0Oo.OooOo0(o00O0oOo.oo0O):void");
    }

    public final void OooOo00(Oooo000 oooo000) {
        OooOo0(new o0ooOOo(oooo000, 1));
    }

    public final boolean OooOo0O() {
        if (this.f31515OooOo != 2) {
            return false;
        }
        OooO0OO oooO0OO = this.f31583OooOoO0;
        OooOo.OooO0OO(oooO0OO, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return OooOO0.f31933OooOoo.get((OooOO0) oooO0OO) != null;
    }

    public final void OooOoO(Object obj, o00O0Oo.o00Oo0 o00oo0) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        OooOoOO(obj, this.f31515OooOo, o00oo0);
    }

    public final void OooOoO0() {
        OooO0OO oooO0OO = this.f31583OooOoO0;
        Throwable th = null;
        OooOO0 oooOO0 = oooO0OO instanceof OooOO0 ? (OooOO0) oooO0OO : null;
        if (oooOO0 != null) {
            loop0: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = OooOO0.f31933OooOoo;
                Object obj = atomicReferenceFieldUpdater.get(oooOO0);
                OooO0O0 oooO0O0 = o00OO000.OooO00o.f31924OooO0OO;
                if (obj == oooO0O0) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(oooOO0, oooO0O0, this)) {
                        if (atomicReferenceFieldUpdater.get(oooOO0) != oooO0O0) {
                            break;
                        }
                    }
                    break loop0;
                } else {
                    if (!(obj instanceof Throwable)) {
                        throw new IllegalStateException(("Inconsistent state " + obj).toString());
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(oooOO0, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(oooOO0) != obj) {
                            throw new IllegalArgumentException("Failed requirement.");
                        }
                    }
                    th = (Throwable) obj;
                }
            }
            if (th == null) {
                return;
            }
            OooOO0o();
            OooO0oO(th);
        }
    }

    public final void OooOoOO(Object obj, int i, o00O0Oo.o00Oo0 o00oo0) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f31581OooOoo0;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof oo0O) {
                Object objOooOoo = OooOoo((oo0O) obj2, obj, i, o00oo0);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, objOooOoo)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                if (!OooOo0O()) {
                    OooOO0o();
                }
                OooOOO0(i);
                return;
            }
            if (obj2 instanceof o0O0O00) {
                o0O0O00 o0o0o00 = (o0O0O00) obj2;
                o0o0o00.getClass();
                if (o0O0O00.f31560OooO0OO.compareAndSet(o0o0o00, 0, 1)) {
                    if (o00oo0 != null) {
                        OooOO0(o00oo0, o0o0o00.f31507OooO00o, obj);
                        return;
                    }
                    return;
                }
            }
            throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
        }
    }

    public final void OooOoo0(o0000O00 o0000o00) {
        oo00o.OooOo oooOo = oo00o.OooOo.f33195OooO00o;
        OooO0OO oooO0OO = this.f31583OooOoO0;
        OooOO0 oooOO0 = oooO0OO instanceof OooOO0 ? (OooOO0) oooO0OO : null;
        OooOoOO(oooOo, (oooOO0 != null ? oooOO0.f31935OooOoO0 : null) == o0000o00 ? 4 : this.f31515OooOo, null);
    }

    public final OooO0O0 OooOooO(Object obj, o00O0Oo.o00Oo0 o00oo0) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f31581OooOoo0;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            boolean z = obj2 instanceof oo0O;
            OooO0O0 oooO0O0 = o0000OO0.f31497OooO00o;
            if (!z) {
                boolean z2 = obj2 instanceof o00000OO;
                return null;
            }
            Object objOooOoo = OooOoo((oo0O) obj2, obj, this.f31515OooOo, o00oo0);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, objOooOoo)) {
                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    break;
                }
            }
            if (!OooOo0O()) {
                OooOO0o();
            }
            return oooO0O0;
        }
    }

    @Override // o00O0OO0.OooO0o
    public final OooO0o getCallerFrame() {
        OooO0OO oooO0OO = this.f31583OooOoO0;
        if (oooO0OO instanceof OooO0o) {
            return (OooO0o) oooO0OO;
        }
        return null;
    }

    @Override // o00O0O0O.OooO0OO
    public final OooOOO0 getContext() {
        return this.f31582OooOoO;
    }

    @Override // o00O0oOo.o0Oo0oo
    public final boolean isActive() {
        return f31581OooOoo0.get(this) instanceof oo0O;
    }

    @Override // o00O0O0O.OooO0OO
    public final void resumeWith(Object obj) {
        Throwable thOooO00o = oo00o.OooOOO0.OooO00o(obj);
        if (thOooO00o != null) {
            obj = new o0000Ooo(false, thOooO00o);
        }
        OooOoOO(obj, this.f31515OooOo, null);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(OooOo());
        sb.append('(');
        sb.append(o0000OO0.OooOoo(this.f31583OooOoO0));
        sb.append("){");
        Object obj = f31581OooOoo0.get(this);
        sb.append(obj instanceof oo0O ? "Active" : obj instanceof o0O0O00 ? "Cancelled" : "Completed");
        sb.append("}@");
        sb.append(o0000OO0.OooOOOo(this));
        return sb.toString();
    }
}
