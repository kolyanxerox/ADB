package o00O0oOo;

import OooOOO0.OooO00o;
import Oooo0o0.OooO;
import com.google.android.gms.internal.measurement.o0OO0O0;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.OooOo;
import o00O0O0O.OooO0OO;
import o00O0O0O.OooOO0;
import o00O0O0O.OooOO0O;
import o00O0O0o.OooOo00;
import o00O0Oo.Oooo000;
import o00OO000.OooOOO0;
import o00OO000.OooOOOO;

/* loaded from: classes3.dex */
public class o00O implements o00O0O00, o00OO {

    /* renamed from: OooOo0O */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f31521OooOo0O = AtomicReferenceFieldUpdater.newUpdater(o00O.class, Object.class, "_state$volatile");

    /* renamed from: OooOo0o */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f31522OooOo0o = AtomicReferenceFieldUpdater.newUpdater(o00O.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    public o00O(boolean z) {
        this._state$volatile = z ? o0000OO0.f31505OooOO0 : o0000OO0.f31496OooO;
    }

    public static o000000O OoooO00(OooOOOO oooOOOO) {
        while (oooOOOO.OooO0oO()) {
            OooOOOO oooOOOOOooO0Oo = oooOOOO.OooO0Oo();
            if (oooOOOOOooO0Oo == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = OooOOOO.f31948OooOo0o;
                Object obj = atomicReferenceFieldUpdater.get(oooOOOO);
                while (true) {
                    oooOOOO = (OooOOOO) obj;
                    if (!oooOOOO.OooO0oO()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(oooOOOO);
                }
            } else {
                oooOOOO = oooOOOOOooO0Oo;
            }
        }
        while (true) {
            oooOOOO = oooOOOO.OooO0o();
            if (!oooOOOO.OooO0oO()) {
                if (oooOOOO instanceof o000000O) {
                    return (o000000O) oooOOOO;
                }
                if (oooOOOO instanceof o00OO00O) {
                    return null;
                }
            }
        }
    }

    public static String OoooOOo(Object obj) {
        if (!(obj instanceof oo0oOO0)) {
            return obj instanceof o00O00OO ? ((o00O00OO) obj).isActive() ? "Active" : "New" : obj instanceof o0000Ooo ? "Cancelled" : "Completed";
        }
        oo0oOO0 oo0ooo0 = (oo0oOO0) obj;
        return oo0ooo0.OooO0Oo() ? "Cancelling" : oo0oOO0.f31585OooOo0o.get(oo0ooo0) != 0 ? "Completing" : "Active";
    }

    @Override // o00O0oOo.o00O0O00
    public void OooO00o(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new o00O0O0(OooOoO0(), null, this);
        }
        OooOo0o(cancellationException);
    }

    public Object OooO0O0() throws Throwable {
        Object obj = f31521OooOo0O.get(this);
        if (obj instanceof o00O00OO) {
            throw new IllegalStateException("This job has not completed yet");
        }
        if (obj instanceof o0000Ooo) {
            throw ((o0000Ooo) obj).f31507OooO00o;
        }
        return o0000OO0.OooOooo(obj);
    }

    @Override // o00O0oOo.o00O0O00
    public final o000OO00 OooO0o(boolean z, boolean z2, o00O0OO0 o00o0oo0) {
        return Oooo0OO(z2, z ? new oo00o(o00o0oo0) : new o000OOo(o00o0oo0, 2));
    }

    @Override // o00O0oOo.o00O0O00
    public final CancellationException OooO0o0() {
        CancellationException o00o0o0;
        Object obj = f31521OooOo0O.get(this);
        if (!(obj instanceof oo0oOO0)) {
            if (obj instanceof o00O00OO) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            }
            if (!(obj instanceof o0000Ooo)) {
                return new o00O0O0(getClass().getSimpleName().concat(" has completed normally"), null, this);
            }
            Throwable th = ((o0000Ooo) obj).f31507OooO00o;
            o00o0o0 = th instanceof CancellationException ? (CancellationException) th : null;
            return o00o0o0 == null ? new o00O0O0(OooOoO0(), th, this) : o00o0o0;
        }
        Throwable thOooO0OO = ((oo0oOO0) obj).OooO0OO();
        if (thOooO0OO == null) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        String strConcat = getClass().getSimpleName().concat(" is cancelling");
        o00o0o0 = thOooO0OO instanceof CancellationException ? (CancellationException) thOooO0OO : null;
        if (o00o0o0 == null) {
            if (strConcat == null) {
                strConcat = OooOoO0();
            }
            o00o0o0 = new o00O0O0(strConcat, thOooO0OO, this);
        }
        return o00o0o0;
    }

    @Override // o00O0oOo.o00O0O00
    public final o000OO00 OooO0oo(Oooo000 oooo000) {
        return Oooo0OO(true, new o000OOo(oooo000, 2));
    }

    @Override // o00O0oOo.o00O0O00
    public final o000000 OooOO0O(o00O o00o) {
        o000000O o000000o2 = new o000000O(o00o);
        o000000o2.f31578OooOoO0 = this;
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f31521OooOo0O;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof o000OOo0) {
                o000OOo0 o000ooo02 = (o000OOo0) obj;
                if (o000ooo02.f31519OooOo0O) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, o000000o2)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    }
                    break loop0;
                }
                OoooOO0(o000ooo02);
            } else {
                boolean z = obj instanceof o00O00OO;
                o00OO0OO o00oo0oo = o00OO0OO.f31547OooOo0O;
                if (!z) {
                    Object obj2 = atomicReferenceFieldUpdater.get(this);
                    o0000Ooo o0000ooo = obj2 instanceof o0000Ooo ? (o0000Ooo) obj2 : null;
                    o000000o2.OooOO0(o0000ooo != null ? o0000ooo.f31507OooO00o : null);
                    return o00oo0oo;
                }
                o00OO00O o00oo00oOooO0O0 = ((o00O00OO) obj).OooO0O0();
                if (o00oo00oOooO0O0 == null) {
                    OooOo.OooO0OO(obj, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    o000oOoO((oo0o0O0) obj);
                } else if (!o00oo00oOooO0O0.OooO0OO(o000000o2, 7)) {
                    boolean zOooO0OO = o00oo00oOooO0O0.OooO0OO(o000000o2, 3);
                    Object obj3 = atomicReferenceFieldUpdater.get(this);
                    if (obj3 instanceof oo0oOO0) {
                        thOooO0OO = ((oo0oOO0) obj3).OooO0OO();
                    } else {
                        o0000Ooo o0000ooo2 = obj3 instanceof o0000Ooo ? (o0000Ooo) obj3 : null;
                        if (o0000ooo2 != null) {
                            thOooO0OO = o0000ooo2.f31507OooO00o;
                        }
                    }
                    o000000o2.OooOO0(thOooO0OO);
                    if (zOooO0OO) {
                        break loop0;
                    }
                    return o00oo0oo;
                }
            }
        }
        return o000000o2;
    }

    @Override // o00O0oOo.o00O0O00
    public final boolean OooOOo0() {
        Object obj = f31521OooOo0O.get(this);
        if (obj instanceof o0000Ooo) {
            return true;
        }
        return (obj instanceof oo0oOO0) && ((oo0oOO0) obj).OooO0Oo();
    }

    public final boolean OooOo(Throwable th) {
        if (Oooo0o()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        o000000 o000000Var = (o000000) f31522OooOo0o.get(this);
        return (o000000Var == null || o000000Var == o00OO0OO.f31547OooOo0O) ? z : o000000Var.OooO00o(th) || z;
    }

    public final Object OooOo0(OooO0OO oooO0OO) throws Throwable {
        Object obj;
        do {
            obj = f31521OooOo0O.get(this);
            if (!(obj instanceof o00O00OO)) {
                if (obj instanceof o0000Ooo) {
                    throw ((o0000Ooo) obj).f31507OooO00o;
                }
                return o0000OO0.OooOooo(obj);
            }
        } while (OoooOOO(obj) < 0);
        o00O0OO o00o0oo = new o00O0OO(OooO.OooOOOO(oooO0OO), this);
        o00o0oo.OooOOo0();
        o00o0oo.OooOo0(new o0ooOOo(o0000OO0.OooOOoo(this, true, new o000OOo(o00o0oo, 3)), 2));
        Object objOooOOOo = o00o0oo.OooOOOo();
        OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
        return objOooOOOo;
    }

    public void OooOo00(Object obj) {
        OooOOoo(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x0041 A[PHI: r0
  0x0041: PHI (r0v1 java.lang.Object) = (r0v0 java.lang.Object), (r0v13 java.lang.Object) binds: [B:102:0x0008, B:115:0x003d] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean OooOo0O(java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o00O0oOo.o00O.OooOo0O(java.lang.Object):boolean");
    }

    public void OooOo0o(CancellationException cancellationException) {
        OooOo0O(cancellationException);
    }

    public boolean OooOoO(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return OooOo0O(th) && OooOooo();
    }

    public String OooOoO0() {
        return "Job was cancelled";
    }

    public final void OooOoOO(o00O00OO o00o00oo, Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f31522OooOo0o;
        o000000 o000000Var = (o000000) atomicReferenceFieldUpdater.get(this);
        if (o000000Var != null) {
            o000000Var.dispose();
            atomicReferenceFieldUpdater.set(this, o00OO0OO.f31547OooOo0O);
        }
        OooO00o oooO00o = null;
        o0000Ooo o0000ooo = obj instanceof o0000Ooo ? (o0000Ooo) obj : null;
        Throwable th = o0000ooo != null ? o0000ooo.f31507OooO00o : null;
        if (o00o00oo instanceof oo0o0O0) {
            try {
                ((oo0o0O0) o00o00oo).OooOO0(th);
                return;
            } catch (Throwable th2) {
                Oooo0(new OooO00o("Exception in completion handler " + o00o00oo + " for " + this, th2));
                return;
            }
        }
        o00OO00O o00oo00oOooO0O0 = o00o00oo.OooO0O0();
        if (o00oo00oOooO0O0 != null) {
            o00oo00oOooO0O0.OooO0OO(new OooOOO0(1), 1);
            Object obj2 = OooOOOO.f31947OooOo0O.get(o00oo00oOooO0O0);
            OooOo.OooO0OO(obj2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
            for (OooOOOO oooOOOOOooO0o = (OooOOOO) obj2; !oooOOOOOooO0o.equals(o00oo00oOooO0O0); oooOOOOOooO0o = oooOOOOOooO0o.OooO0o()) {
                if (oooOOOOOooO0o instanceof oo0o0O0) {
                    try {
                        ((oo0o0O0) oooOOOOOooO0o).OooOO0(th);
                    } catch (Throwable th3) {
                        if (oooO00o != null) {
                            o0OO0O0.OooO00o(oooO00o, th3);
                        } else {
                            oooO00o = new OooO00o("Exception in completion handler " + oooOOOOOooO0o + " for " + this, th3);
                        }
                    }
                }
            }
            if (oooO00o != null) {
                Oooo0(oooO00o);
            }
        }
    }

    public final Object OooOoo(oo0oOO0 oo0ooo0, Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Throwable thOooOooO;
        o0000Ooo o0000ooo = obj instanceof o0000Ooo ? (o0000Ooo) obj : null;
        Throwable th = o0000ooo != null ? o0000ooo.f31507OooO00o : null;
        synchronized (oo0ooo0) {
            oo0ooo0.OooO0Oo();
            ArrayList arrayListOooO0o0 = oo0ooo0.OooO0o0(th);
            thOooOooO = OooOooO(oo0ooo0, arrayListOooO0o0);
            if (thOooOooO != null && arrayListOooO0o0.size() > 1) {
                Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(arrayListOooO0o0.size()));
                int size = arrayListOooO0o0.size();
                int i = 0;
                while (i < size) {
                    Object obj2 = arrayListOooO0o0.get(i);
                    i++;
                    Throwable th2 = (Throwable) obj2;
                    if (th2 != thOooOooO && th2 != thOooOooO && !(th2 instanceof CancellationException) && setNewSetFromMap.add(th2)) {
                        o0OO0O0.OooO00o(thOooOooO, th2);
                    }
                }
            }
        }
        if (thOooOooO != null && thOooOooO != th) {
            obj = new o0000Ooo(false, thOooOooO);
        }
        if (thOooOooO != null && (OooOo(thOooOooO) || Oooo00o(thOooOooO))) {
            OooOo.OooO0OO(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            o0000Ooo.f31506OooO0O0.compareAndSet((o0000Ooo) obj, 0, 1);
        }
        OoooO0O(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f31521OooOo0O;
        Object o00o00o0 = obj instanceof o00O00OO ? new o00O00o0((o00O00OO) obj) : obj;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, oo0ooo0, o00o00o0) && atomicReferenceFieldUpdater.get(this) == oo0ooo0) {
        }
        OooOoOO(oo0ooo0, obj);
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Throwable] */
    public final Throwable OooOoo0(Object obj) {
        CancellationException cancellationExceptionOooO0OO;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        o00O o00o = (o00O) ((o00OO) obj);
        Object obj2 = f31521OooOo0O.get(o00o);
        if (obj2 instanceof oo0oOO0) {
            cancellationExceptionOooO0OO = ((oo0oOO0) obj2).OooO0OO();
        } else if (obj2 instanceof o0000Ooo) {
            cancellationExceptionOooO0OO = ((o0000Ooo) obj2).f31507OooO00o;
        } else {
            if (obj2 instanceof o00O00OO) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + obj2).toString());
            }
            cancellationExceptionOooO0OO = null;
        }
        CancellationException cancellationException = cancellationExceptionOooO0OO instanceof CancellationException ? cancellationExceptionOooO0OO : null;
        return cancellationException == null ? new o00O0O0("Parent job is ".concat(OoooOOo(obj2)), cancellationExceptionOooO0OO, o00o) : cancellationException;
    }

    public final Throwable OooOooO(oo0oOO0 oo0ooo0, ArrayList arrayList) {
        Object obj;
        Object obj2 = null;
        if (arrayList.isEmpty()) {
            if (oo0ooo0.OooO0Oo()) {
                return new o00O0O0(OooOoO0(), null, this);
            }
            return null;
        }
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i2);
            i2++;
            if (!(((Throwable) obj) instanceof CancellationException)) {
                break;
            }
        }
        Throwable th = (Throwable) obj;
        if (th != null) {
            return th;
        }
        Throwable th2 = (Throwable) arrayList.get(0);
        if (th2 instanceof o00OOOO0) {
            int size2 = arrayList.size();
            while (true) {
                if (i >= size2) {
                    break;
                }
                Object obj3 = arrayList.get(i);
                i++;
                Throwable th3 = (Throwable) obj3;
                if (th3 != th2 && (th3 instanceof o00OOOO0)) {
                    obj2 = obj3;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj2;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    public boolean OooOooo() {
        return true;
    }

    public String Oooo() {
        return getClass().getSimpleName();
    }

    public boolean Oooo000() {
        return this instanceof o00000O0;
    }

    public final o00OO00O Oooo00O(o00O00OO o00o00oo) {
        o00OO00O o00oo00oOooO0O0 = o00o00oo.OooO0O0();
        if (o00oo00oOooO0O0 != null) {
            return o00oo00oOooO0O0;
        }
        if (o00o00oo instanceof o000OOo0) {
            return new o00OO00O();
        }
        if (o00o00oo instanceof oo0o0O0) {
            o000oOoO((oo0o0O0) o00o00oo);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + o00o00oo).toString());
    }

    public boolean Oooo00o(Throwable th) {
        return false;
    }

    public final void Oooo0O0(o00O0O00 o00o0o00) {
        o00OO0OO o00oo0oo = o00OO0OO.f31547OooOo0O;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f31522OooOo0o;
        if (o00o0o00 == null) {
            atomicReferenceFieldUpdater.set(this, o00oo0oo);
            return;
        }
        o00o0o00.start();
        o000000 o000000VarOooOO0O = o00o0o00.OooOO0O(this);
        atomicReferenceFieldUpdater.set(this, o000000VarOooOO0O);
        if (Oooo0o0()) {
            o000000VarOooOO0O.dispose();
            atomicReferenceFieldUpdater.set(this, o00oo0oo);
        }
    }

    public final o000OO00 Oooo0OO(boolean z, oo0o0O0 oo0o0o0) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        o00OO0OO o00oo0oo;
        boolean z2;
        boolean zOooO0OO;
        oo0o0o0.f31578OooOoO0 = this;
        loop0: while (true) {
            atomicReferenceFieldUpdater = f31521OooOo0O;
            Object obj = atomicReferenceFieldUpdater.get(this);
            boolean z3 = obj instanceof o000OOo0;
            o00oo0oo = o00OO0OO.f31547OooOo0O;
            z2 = true;
            if (!z3) {
                if (!(obj instanceof o00O00OO)) {
                    z2 = false;
                    break;
                }
                o00O00OO o00o00oo = (o00O00OO) obj;
                o00OO00O o00oo00oOooO0O0 = o00o00oo.OooO0O0();
                if (o00oo00oOooO0O0 == null) {
                    OooOo.OooO0OO(obj, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    o000oOoO((oo0o0O0) obj);
                } else {
                    if (oo0o0o0.OooO()) {
                        oo0oOO0 oo0ooo0 = o00o00oo instanceof oo0oOO0 ? (oo0oOO0) o00o00oo : null;
                        Throwable thOooO0OO = oo0ooo0 != null ? oo0ooo0.OooO0OO() : null;
                        if (thOooO0OO == null) {
                            zOooO0OO = o00oo00oOooO0O0.OooO0OO(oo0o0o0, 5);
                        } else if (z) {
                            oo0o0o0.OooOO0(thOooO0OO);
                            return o00oo0oo;
                        }
                    } else {
                        zOooO0OO = o00oo00oOooO0O0.OooO0OO(oo0o0o0, 1);
                    }
                    if (zOooO0OO) {
                        break;
                    }
                }
            } else {
                o000OOo0 o000ooo02 = (o000OOo0) obj;
                if (o000ooo02.f31519OooOo0O) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, oo0o0o0)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    }
                    break loop0;
                }
                OoooOO0(o000ooo02);
            }
        }
        if (z2) {
            return oo0o0o0;
        }
        if (z) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            o0000Ooo o0000ooo = obj2 instanceof o0000Ooo ? (o0000Ooo) obj2 : null;
            oo0o0o0.OooOO0(o0000ooo != null ? o0000ooo.f31507OooO00o : null);
        }
        return o00oo0oo;
    }

    public boolean Oooo0o() {
        return this instanceof oo000o;
    }

    public final boolean Oooo0o0() {
        return !(f31521OooOo0O.get(this) instanceof o00O00OO);
    }

    public final boolean Oooo0oO(Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Object objOoooOo0;
        do {
            objOoooOo0 = OoooOo0(f31521OooOo0O.get(this), obj);
            if (objOoooOo0 == o0000OO0.f31500OooO0Oo) {
                return false;
            }
            if (objOoooOo0 == o0000OO0.f31502OooO0o0) {
                return true;
            }
        } while (objOoooOo0 == o0000OO0.f31501OooO0o);
        OooOOoo(objOoooOo0);
        return true;
    }

    public final Object Oooo0oo(Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Object objOoooOo0;
        do {
            objOoooOo0 = OoooOo0(f31521OooOo0O.get(this), obj);
            if (objOoooOo0 == o0000OO0.f31500OooO0Oo) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                o0000Ooo o0000ooo = obj instanceof o0000Ooo ? (o0000Ooo) obj : null;
                throw new IllegalStateException(str, o0000ooo != null ? o0000ooo.f31507OooO00o : null);
            }
        } while (objOoooOo0 == o0000OO0.f31501OooO0o);
        return objOoooOo0;
    }

    public final void OoooO0(o00OO00O o00oo00o, Throwable th) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        o00oo00o.OooO0OO(new OooOOO0(4), 4);
        Object obj = OooOOOO.f31947OooOo0O.get(o00oo00o);
        OooOo.OooO0OO(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        OooO00o oooO00o = null;
        for (OooOOOO oooOOOOOooO0o = (OooOOOO) obj; !oooOOOOOooO0o.equals(o00oo00o); oooOOOOOooO0o = oooOOOOOooO0o.OooO0o()) {
            if ((oooOOOOOooO0o instanceof oo0o0O0) && ((oo0o0O0) oooOOOOOooO0o).OooO()) {
                try {
                    ((oo0o0O0) oooOOOOOooO0o).OooOO0(th);
                } catch (Throwable th2) {
                    if (oooO00o != null) {
                        o0OO0O0.OooO00o(oooO00o, th2);
                    } else {
                        oooO00o = new OooO00o("Exception in completion handler " + oooOOOOOooO0o + " for " + this, th2);
                    }
                }
            }
        }
        if (oooO00o != null) {
            Oooo0(oooO00o);
        }
        OooOo(th);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [o00O0oOo.oOO00O] */
    public final void OoooOO0(o000OOo0 o000ooo02) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        o00OO00O o00oo00o = new o00OO00O();
        if (!o000ooo02.f31519OooOo0O) {
            o00oo00o = new oOO00O(o00oo00o);
        }
        do {
            atomicReferenceFieldUpdater = f31521OooOo0O;
            if (atomicReferenceFieldUpdater.compareAndSet(this, o000ooo02, o00oo00o)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == o000ooo02);
    }

    public final int OoooOOO(Object obj) {
        boolean z = obj instanceof o000OOo0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f31521OooOo0O;
        if (z) {
            if (((o000OOo0) obj).f31519OooOo0O) {
                return 0;
            }
            o000OOo0 o000ooo02 = o0000OO0.f31505OooOO0;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, o000ooo02)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    return -1;
                }
            }
            OoooO();
            return 1;
        }
        if (!(obj instanceof oOO00O)) {
            return 0;
        }
        o00OO00O o00oo00o = ((oOO00O) obj).f31572OooOo0O;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, o00oo00o)) {
            if (atomicReferenceFieldUpdater.get(this) != obj) {
                return -1;
            }
        }
        OoooO();
        return 1;
    }

    public final Object OoooOo0(Object obj, Object obj2) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        if (!(obj instanceof o00O00OO)) {
            return o0000OO0.f31500OooO0Oo;
        }
        if (((obj instanceof o000OOo0) || (obj instanceof oo0o0O0)) && !(obj instanceof o000000O) && !(obj2 instanceof o0000Ooo)) {
            o00O00OO o00o00oo = (o00O00OO) obj;
            Object o00o00o0 = obj2 instanceof o00O00OO ? new o00O00o0((o00O00OO) obj2) : obj2;
            do {
                atomicReferenceFieldUpdater = f31521OooOo0O;
                if (atomicReferenceFieldUpdater.compareAndSet(this, o00o00oo, o00o00o0)) {
                    OoooO0O(obj2);
                    OooOoOO(o00o00oo, obj2);
                    return obj2;
                }
            } while (atomicReferenceFieldUpdater.get(this) == o00o00oo);
            return o0000OO0.f31501OooO0o;
        }
        o00O00OO o00o00oo2 = (o00O00OO) obj;
        o00OO00O o00oo00oOooo00O = Oooo00O(o00o00oo2);
        if (o00oo00oOooo00O == null) {
            return o0000OO0.f31501OooO0o;
        }
        oo0oOO0 oo0ooo0 = o00o00oo2 instanceof oo0oOO0 ? (oo0oOO0) o00o00oo2 : null;
        if (oo0ooo0 == null) {
            oo0ooo0 = new oo0oOO0(o00oo00oOooo00O, null);
        }
        synchronized (oo0ooo0) {
            try {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = oo0oOO0.f31585OooOo0o;
                if (atomicIntegerFieldUpdater.get(oo0ooo0) != 0) {
                    return o0000OO0.f31500OooO0Oo;
                }
                atomicIntegerFieldUpdater.set(oo0ooo0, 1);
                if (oo0ooo0 != o00o00oo2) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f31521OooOo0O;
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, o00o00oo2, oo0ooo0)) {
                        if (atomicReferenceFieldUpdater2.get(this) != o00o00oo2) {
                            return o0000OO0.f31501OooO0o;
                        }
                    }
                }
                boolean zOooO0Oo = oo0ooo0.OooO0Oo();
                o0000Ooo o0000ooo = obj2 instanceof o0000Ooo ? (o0000Ooo) obj2 : null;
                if (o0000ooo != null) {
                    oo0ooo0.OooO00o(o0000ooo.f31507OooO00o);
                }
                Throwable thOooO0OO = zOooO0Oo ? null : oo0ooo0.OooO0OO();
                if (thOooO0OO != null) {
                    OoooO0(o00oo00oOooo00O, thOooO0OO);
                }
                o000000O o000000oOoooO00 = OoooO00(o00oo00oOooo00O);
                if (o000000oOoooO00 != null && OoooOoO(oo0ooo0, o000000oOoooO00, obj2)) {
                    return o0000OO0.f31502OooO0o0;
                }
                o00oo00oOooo00O.OooO0OO(new OooOOO0(2), 2);
                o000000O o000000oOoooO002 = OoooO00(o00oo00oOooo00O);
                return (o000000oOoooO002 == null || !OoooOoO(oo0ooo0, o000000oOoooO002, obj2)) ? OooOoo(oo0ooo0, obj2) : o0000OO0.f31502OooO0o0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean OoooOoO(oo0oOO0 oo0ooo0, o000000O o000000o2, Object obj) {
        while (o0000OO0.OooOOoo(o000000o2.f31483OooOoO, false, new o00O0OOO(this, oo0ooo0, o000000o2, obj)) == o00OO0OO.f31547OooOo0O) {
            o000000o2 = OoooO00(o000000o2);
            if (o000000o2 == null) {
                return false;
            }
        }
        return true;
    }

    @Override // o00O0O0O.OooOOO0
    public final Object fold(Object obj, o00O0Oo.o00O0O o00o0o) {
        return o00o0o.invoke(obj, this);
    }

    @Override // o00O0O0O.OooOOO0
    public final OooOO0 get(OooOO0O oooOO0O) {
        return OooO00o.OooO00o.OooO(this, oooOO0O);
    }

    @Override // o00O0O0O.OooOO0
    public final OooOO0O getKey() {
        return o00O0.f31523OooOo0O;
    }

    @Override // o00O0oOo.o00O0O00
    public boolean isActive() {
        Object obj = f31521OooOo0O.get(this);
        return (obj instanceof o00O00OO) && ((o00O00OO) obj).isActive();
    }

    @Override // o00O0O0O.OooOOO0
    public final o00O0O0O.OooOOO0 minusKey(OooOO0O oooOO0O) {
        return OooO00o.OooO00o.OooOOoo(this, oooOO0O);
    }

    public final void o000oOoO(oo0o0O0 oo0o0o0) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        o00OO00O o00oo00o = new o00OO00O();
        oo0o0o0.getClass();
        OooOOOO.f31948OooOo0o.set(o00oo00o, oo0o0o0);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = OooOOOO.f31947OooOo0O;
        atomicReferenceFieldUpdater2.set(o00oo00o, oo0o0o0);
        loop0: while (true) {
            if (atomicReferenceFieldUpdater2.get(oo0o0o0) == oo0o0o0) {
                while (!atomicReferenceFieldUpdater2.compareAndSet(oo0o0o0, oo0o0o0, o00oo00o)) {
                    if (atomicReferenceFieldUpdater2.get(oo0o0o0) != oo0o0o0) {
                        break;
                    }
                }
                o00oo00o.OooO0o0(oo0o0o0);
                break loop0;
            }
            break;
        }
        OooOOOO oooOOOOOooO0o = oo0o0o0.OooO0o();
        do {
            atomicReferenceFieldUpdater = f31521OooOo0O;
            if (atomicReferenceFieldUpdater.compareAndSet(this, oo0o0o0, oooOOOOOooO0o)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == oo0o0o0);
    }

    @Override // o00O0O0O.OooOOO0
    public final o00O0O0O.OooOOO0 plus(o00O0O0O.OooOOO0 oooOOO0) {
        return OooO00o.OooO00o.OooOo00(this, oooOOO0);
    }

    @Override // o00O0oOo.o00O0O00
    public final boolean start() {
        int iOoooOOO;
        do {
            iOoooOOO = OoooOOO(f31521OooOo0O.get(this));
            if (iOoooOOO == 0) {
                return false;
            }
        } while (iOoooOOO != 1);
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Oooo() + '{' + OoooOOo(f31521OooOo0O.get(this)) + '}');
        sb.append('@');
        sb.append(o0000OO0.OooOOOo(this));
        return sb.toString();
    }

    public void OoooO() {
    }

    public void OooOOoo(Object obj) {
    }

    public void Oooo0(OooO00o oooO00o) {
        throw oooO00o;
    }

    public void OoooO0O(Object obj) {
    }
}
