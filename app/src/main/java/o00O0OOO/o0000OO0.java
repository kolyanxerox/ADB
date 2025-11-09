package o00O0oOo;

import OooO00o.OooO00o;
import androidx.core.location.LocationRequestCompat;
import com.google.android.gms.internal.measurement.o0OO0O0;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import o000O0O0.OooO0O0;
import o00O0O0O.OooO0o;
import o00O0O0O.OooOO0;
import o00O0O0O.OooOO0O;
import o00O0O0O.OooOOO;
import o00O0O0O.OooOOO0;
import o00O0O0o.OooOo00;
import o00OO000.OooO0OO;
import o00OO000.Oooo0;
import o00OO00o.OooO;
import oo00o.OooOo;

/* loaded from: classes3.dex */
public abstract class o0000OO0 {

    /* renamed from: OooO00o */
    public static final OooO0O0 f31497OooO00o = new OooO0O0("RESUME_TOKEN", 3);

    /* renamed from: OooO0O0 */
    public static final OooO0O0 f31498OooO0O0 = new OooO0O0("REMOVED_TASK", 3);

    /* renamed from: OooO0OO */
    public static final OooO0O0 f31499OooO0OO = new OooO0O0("CLOSED_EMPTY", 3);

    /* renamed from: OooO0Oo */
    public static final OooO0O0 f31500OooO0Oo = new OooO0O0("COMPLETING_ALREADY", 3);

    /* renamed from: OooO0o0 */
    public static final OooO0O0 f31502OooO0o0 = new OooO0O0("COMPLETING_WAITING_CHILDREN", 3);

    /* renamed from: OooO0o */
    public static final OooO0O0 f31501OooO0o = new OooO0O0("COMPLETING_RETRY", 3);

    /* renamed from: OooO0oO */
    public static final OooO0O0 f31503OooO0oO = new OooO0O0("TOO_LATE_TO_CANCEL", 3);

    /* renamed from: OooO0oo */
    public static final OooO0O0 f31504OooO0oo = new OooO0O0("SEALED", 3);

    /* renamed from: OooO */
    public static final o000OOo0 f31496OooO = new o000OOo0(false);

    /* renamed from: OooOO0 */
    public static final o000OOo0 f31505OooOO0 = new o000OOo0(true);

    public static void OooO(o000OO o000oo2) {
        o00O0O00 o00o0o00 = (o00O0O00) o000oo2.getCoroutineContext().get(o00O0.f31523OooOo0O);
        if (o00o0o00 != null) {
            o00o0o00.OooO00o(null);
        } else {
            throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + o000oo2).toString());
        }
    }

    public static o00000O0 OooO00o() {
        o00000O0 o00000o02 = new o00000O0(true);
        o00000o02.Oooo0O0(null);
        return o00000o02;
    }

    public static final OooO0OO OooO0O0(OooOOO0 oooOOO0) {
        if (oooOOO0.get(o00O0.f31523OooOo0O) == null) {
            oooOOO0 = oooOOO0.plus(OooO0OO());
        }
        return new OooO0OO(oooOOO0);
    }

    public static o00O0O0O OooO0OO() {
        return new o00O0O0O(null);
    }

    public static final OooO0OO OooO0Oo() {
        o00OOO0 o00ooo0OooO0o0 = OooO0o0();
        OooO oooO = o000O0O0.f31514OooO00o;
        return new OooO0OO(OooO00o.OooOo00(o00ooo0OooO0o0, Oooo0.f31951OooO00o));
    }

    public static final Executor OooO0o(o0000O00 o0000o00) {
        Executor executorOooOOO0;
        o00O00 o00o00 = o0000o00 instanceof o00O00 ? (o00O00) o0000o00 : null;
        return (o00o00 == null || (executorOooOOO0 = o00o00.OooOOO0()) == null) ? new o000OO0O(o0000o00) : executorOooOOO0;
    }

    public static o00OOO0 OooO0o0() {
        return new o00OOO0(null);
    }

    public static o000Oo0 OooO0oO(o000OO o000oo2, o00O0Oo.o00O0O o00o0o) {
        OooOOO oooOOO = OooOOO.f31358OooOo0O;
        o0000O o0000o2 = o0000O.f31490OooOo0O;
        OooOOO0 oooOOO0OooOo0O = OooOo0O(o000oo2, oooOOO);
        o0000O o0000o3 = o0000O.f31490OooOo0O;
        o000Oo0 o000oo02 = new o000Oo0(oooOOO0OooOo0O, true);
        o000oo02.Ooooo0o(o0000o2, o000oo02, o00o0o);
        return o000oo02;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void OooO0oo(o00O0OO0.OooO0OO r4) {
        /*
            boolean r0 = r4 instanceof o00O0oOo.o000O00O
            if (r0 == 0) goto L13
            r0 = r4
            o00O0oOo.o000O00O r0 = (o00O0oOo.o000O00O) r0
            int r1 = r0.f31513OooOo0o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f31513OooOo0o = r1
            goto L18
        L13:
            o00O0oOo.o000O00O r0 = new o00O0oOo.o000O00O
            r0.<init>(r4)
        L18:
            java.lang.Object r4 = r0.f31512OooOo0O
            o00O0O0o.OooOo00 r1 = o00O0O0o.OooOo00.f31365OooOo0O
            int r2 = r0.f31513OooOo0o
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 == r3) goto L2b
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r0)
            throw r4
        L2b:
            o00O0.o000OOo.OooOO0O(r4)
            goto L47
        L2f:
            o00O0.o000OOo.OooOO0O(r4)
            r0.f31513OooOo0o = r3
            o00O0oOo.oo0o0Oo r4 = new o00O0oOo.oo0o0Oo
            o00O0O0O.OooO0OO r0 = Oooo0o0.OooO.OooOOOO(r0)
            r4.<init>(r3, r0)
            r4.OooOOo0()
            java.lang.Object r4 = r4.OooOOOo()
            if (r4 != r1) goto L47
            return
        L47:
            OooOOO0.OooO00o r4 = new OooOOO0.OooO00o
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o00O0oOo.o0000OO0.OooO0oo(o00O0OO0.OooO0OO):void");
    }

    public static final Object OooOO0(o00O0Oo.o00O0O o00o0o, o00O0O0O.OooO0OO oooO0OO) throws Throwable {
        o00OO000.o00Oo0 o00oo0 = new o00OO000.o00Oo0(oooO0OO, oooO0OO.getContext());
        Object objOooOOO0 = o00Oo0oo.o00oO0o.OooOOO0(o00oo0, o00oo0, o00o0o);
        OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
        return objOooOOO0;
    }

    public static final Object OooOO0O(long j, o00O0OO0.OooO0OO oooO0OO) {
        OooOo oooOo = OooOo.f33195OooO00o;
        if (j > 0) {
            oo0o0Oo oo0o0oo = new oo0o0Oo(1, Oooo0o0.OooO.OooOOOO(oooO0OO));
            oo0o0oo.OooOOo0();
            if (j < LocationRequestCompat.PASSIVE_INTERVAL) {
                OooOOOO(oo0o0oo.f31582OooOoO).OooO(j, oo0o0oo);
            }
            Object objOooOOOo = oo0o0oo.OooOOOo();
            if (objOooOOOo == OooOo00.f31365OooOo0O) {
                return objOooOOOo;
            }
        }
        return oooOo;
    }

    public static final void OooOO0o(OooOOO0 oooOOO0) {
        o00O0O00 o00o0o00 = (o00O0O00) oooOOO0.get(o00O0.f31523OooOo0O);
        if (o00o0o00 != null && !o00o0o00.isActive()) {
            throw o00o0o00.OooO0o0();
        }
    }

    public static final o0000O00 OooOOO(Executor executor) {
        o0000O00 o0000o00;
        o000OO0O o000oo0o = executor instanceof o000OO0O ? (o000OO0O) executor : null;
        return (o000oo0o == null || (o0000o00 = o000oo0o.f31516OooOo0O) == null) ? new o00O00O(executor) : o0000o00;
    }

    public static final OooOOO0 OooOOO0(OooOOO0 oooOOO0, OooOOO0 oooOOO02, boolean z) {
        Boolean bool = Boolean.FALSE;
        boolean zBooleanValue = ((Boolean) oooOOO0.fold(bool, new o00O.o00oO0o(3))).booleanValue();
        boolean zBooleanValue2 = ((Boolean) oooOOO02.fold(bool, new o00O.o00oO0o(3))).booleanValue();
        if (!zBooleanValue && !zBooleanValue2) {
            return oooOOO0.plus(oooOOO02);
        }
        OooOOO oooOOO = OooOOO.f31358OooOo0O;
        OooOOO0 oooOOO03 = (OooOOO0) oooOOO0.fold(oooOOO, new o00O.o00oO0o(4));
        Object objFold = oooOOO02;
        if (zBooleanValue2) {
            objFold = oooOOO02.fold(oooOOO, new o00O.o00oO0o(5));
        }
        return oooOOO03.plus((OooOOO0) objFold);
    }

    public static final o000O00 OooOOOO(OooOOO0 oooOOO0) {
        OooOO0 oooOO0 = oooOOO0.get(OooO0o.f31357OooOo0O);
        o000O00 o000o002 = oooOO0 instanceof o000O00 ? (o000O00) oooOO0 : null;
        return o000o002 == null ? o000O000.f31511OooO00o : o000o002;
    }

    public static final String OooOOOo(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final void OooOOo(OooOOO0 oooOOO0, Throwable th) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            o0000O0 o0000o02 = (o0000O0) oooOOO0.get(o0000oo.f31508OooOo0O);
            if (o0000o02 != null) {
                o0000o02.handleException(oooOOO0, th);
            } else {
                o00OO000.OooO00o.OooO0Oo(oooOOO0, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                o0OO0O0.OooO00o(runtimeException, th);
                th = runtimeException;
            }
            o00OO000.OooO00o.OooO0Oo(oooOOO0, th);
        }
    }

    public static final oo0o0Oo OooOOo0(o00O0O0O.OooO0OO oooO0OO) {
        oo0o0Oo oo0o0oo;
        oo0o0Oo oo0o0oo2;
        if (!(oooO0OO instanceof o00OO000.OooOO0)) {
            return new oo0o0Oo(1, oooO0OO);
        }
        o00OO000.OooOO0 oooOO0 = (o00OO000.OooOO0) oooO0OO;
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = o00OO000.OooOO0.f31933OooOoo;
            Object obj = atomicReferenceFieldUpdater.get(oooOO0);
            OooO0O0 oooO0O0 = o00OO000.OooO00o.f31924OooO0OO;
            oo0o0oo = null;
            if (obj == null) {
                atomicReferenceFieldUpdater.set(oooOO0, oooO0O0);
                oo0o0oo2 = null;
                break;
            }
            if (obj instanceof oo0o0Oo) {
                while (!atomicReferenceFieldUpdater.compareAndSet(oooOO0, obj, oooO0O0)) {
                    if (atomicReferenceFieldUpdater.get(oooOO0) != obj) {
                        break;
                    }
                }
                oo0o0oo2 = (oo0o0Oo) obj;
                break loop0;
            }
            if (obj != oooO0O0 && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
        if (oo0o0oo2 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = oo0o0Oo.f31581OooOoo0;
            Object obj2 = atomicReferenceFieldUpdater2.get(oo0o0oo2);
            if (!(obj2 instanceof o00000OO) || ((o00000OO) obj2).f31487OooO0Oo == null) {
                oo0o0Oo.f31579OooOoOO.set(oo0o0oo2, 536870911);
                atomicReferenceFieldUpdater2.set(oo0o0oo2, o0OoOo0.f31567OooOo0O);
                oo0o0oo = oo0o0oo2;
            } else {
                oo0o0oo2.OooOO0o();
            }
            if (oo0o0oo != null) {
                return oo0o0oo;
            }
        }
        return new oo0o0Oo(2, oooO0OO);
    }

    public static final o000OO00 OooOOoo(o00O0O00 o00o0o00, boolean z, oo0o0O0 oo0o0o0) {
        return o00o0o00 instanceof o00O ? ((o00O) o00o0o00).Oooo0OO(z, oo0o0o0) : o00o0o00.OooO0o(oo0o0o0.OooO(), z, new o00O0OO0(1, oo0o0o0, oo0o0O0.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0));
    }

    public static final Object OooOo(Object obj) {
        return obj instanceof o0000Ooo ? o00O0.o000OOo.OooO0O0(((o0000Ooo) obj).f31507OooO00o) : obj;
    }

    public static o00OOO00 OooOo0(o000OO o000oo2, OooOOO0 oooOOO0, o00O0Oo.o00O0O o00o0o, int i) {
        o0000O o0000o2 = o0000O.f31493OooOoO0;
        if ((i & 1) != 0) {
            oooOOO0 = OooOOO.f31358OooOo0O;
        }
        if ((i & 2) != 0) {
            o0000o2 = o0000O.f31490OooOo0O;
        }
        OooOOO0 oooOOO0OooOo0O = OooOo0O(o000oo2, oooOOO0);
        o00OOO00 o00oo000 = o0000o2 == o0000O.f31491OooOo0o ? new o00OO000(oooOOO0OooOo0O, o00o0o) : new o00OOO00(oooOOO0OooOo0O, true);
        o00oo000.Ooooo0o(o0000o2, o00oo000, o00o0o);
        return o00oo000;
    }

    public static final boolean OooOo00(o000OO o000oo2) {
        o00O0O00 o00o0o00 = (o00O0O00) o000oo2.getCoroutineContext().get(o00O0.f31523OooOo0O);
        if (o00o0o00 != null) {
            return o00o0o00.isActive();
        }
        return true;
    }

    public static final OooOOO0 OooOo0O(o000OO o000oo2, OooOOO0 oooOOO0) {
        OooOOO0 OooOOO02 = OooOOO0(o000oo2.getCoroutineContext(), oooOOO0, true);
        OooO oooO = o000O0O0.f31514OooO00o;
        return (OooOOO02 == oooO || OooOOO02.get(OooO0o.f31357OooOo0O) != null) ? OooOOO02 : OooOOO02.plus(oooO);
    }

    public static final OooO0OO OooOo0o(o000OO o000oo2, o00O0O0O.OooO00o oooO00o) {
        return new OooO0OO(o000oo2.getCoroutineContext().plus(oooO00o));
    }

    public static final Object OooOoO(OooOOO0 oooOOO0, o00O0Oo.o00O0O o00o0o) throws Throwable {
        o00O000o o00o000oOooO00o;
        OooOOO0 OooOOO02;
        Thread threadCurrentThread = Thread.currentThread();
        OooOO0O oooOO0O = OooO0o.f31357OooOo0O;
        o00O0O0O.OooO oooO = (o00O0O0O.OooO) oooOOO0.get(oooOO0O);
        OooOOO oooOOO = OooOOO.f31358OooOo0O;
        if (oooO == null) {
            o00o000oOooO00o = o0o0Oo.OooO00o();
            OooOOO02 = OooOOO0(oooOOO, oooOOO0.plus(o00o000oOooO00o), true);
            OooO oooO2 = o000O0O0.f31514OooO00o;
            if (OooOOO02 != oooO2 && OooOOO02.get(oooOO0O) == null) {
                OooOOO02 = OooOOO02.plus(oooO2);
            }
        } else {
            if (oooO instanceof o00O000o) {
            }
            o00o000oOooO00o = (o00O000o) o0o0Oo.f31568OooO00o.get();
            OooOOO02 = OooOOO0(oooOOO, oooOOO0, true);
            OooO oooO3 = o000O0O0.f31514OooO00o;
            if (OooOOO02 != oooO3 && OooOOO02.get(oooOO0O) == null) {
                OooOOO02 = OooOOO02.plus(oooO3);
            }
        }
        oo000o oo000oVar = new oo000o(OooOOO02, threadCurrentThread, o00o000oOooO00o);
        oo000oVar.Ooooo0o(o0000O.f31490OooOo0O, oo000oVar, o00o0o);
        o00O000o o00o000o = oo000oVar.f31573OooOoO;
        if (o00o000o != null) {
            int i = o00O000o.f31528OooOoO0;
            o00o000o.OooOOOo(false);
        }
        while (!Thread.interrupted()) {
            try {
                long jOooOOo = o00o000o != null ? o00o000o.OooOOo() : LocationRequestCompat.PASSIVE_INTERVAL;
                if (oo000oVar.Oooo0o0()) {
                    if (o00o000o != null) {
                        int i2 = o00O000o.f31528OooOoO0;
                        o00o000o.OooOOO0(false);
                    }
                    Object objOooOooo = OooOooo(o00O.f31521OooOo0O.get(oo000oVar));
                    o0000Ooo o0000ooo = objOooOooo instanceof o0000Ooo ? (o0000Ooo) objOooOooo : null;
                    if (o0000ooo == null) {
                        return objOooOooo;
                    }
                    throw o0000ooo.f31507OooO00o;
                }
                LockSupport.parkNanos(oo000oVar, jOooOOo);
            } catch (Throwable th) {
                if (o00o000o != null) {
                    int i3 = o00O000o.f31528OooOoO0;
                    o00o000o.OooOOO0(false);
                }
                throw th;
            }
        }
        InterruptedException interruptedException = new InterruptedException();
        oo000oVar.OooOo0O(interruptedException);
        throw interruptedException;
    }

    public static final void OooOoO0(oo0o0Oo oo0o0oo, o00O0O0O.OooO0OO oooO0OO, boolean z) {
        Object obj = oo0o0Oo.f31581OooOoo0.get(oo0o0oo);
        Throwable thOooO0Oo = oo0o0oo.OooO0Oo(obj);
        Object objOooO0O0 = thOooO0Oo != null ? o00O0.o000OOo.OooO0O0(thOooO0Oo) : oo0o0oo.OooO0o0(obj);
        if (!z) {
            oooO0OO.resumeWith(objOooO0O0);
            return;
        }
        kotlin.jvm.internal.OooOo.OooO0OO(oooO0OO, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        o00OO000.OooOO0 oooOO0 = (o00OO000.OooOO0) oooO0OO;
        o00O0O0O.OooO0OO oooO0OO2 = oooOO0.f31934OooOoO;
        OooOOO0 context = oooO0OO2.getContext();
        Object objOooOO0o = o00OO000.OooO00o.OooOO0o(context, oooOO0.f31937OooOoo0);
        o0O00o0 o0o00o0Oooo000 = objOooOO0o != o00OO000.OooO00o.f31925OooO0Oo ? Oooo000(oooO0OO2, context, objOooOO0o) : null;
        try {
            oooO0OO2.resumeWith(objOooO0O0);
            if (o0o00o0Oooo000 == null || o0o00o0Oooo000.OooooO0()) {
                o00OO000.OooO00o.OooO0oO(context, objOooOO0o);
            }
        } catch (Throwable th) {
            if (o0o00o0Oooo000 == null || o0o00o0Oooo000.OooooO0()) {
                o00OO000.OooO00o.OooO0oO(context, objOooOO0o);
            }
            throw th;
        }
    }

    public static final String OooOoo(o00O0O0O.OooO0OO oooO0OO) {
        Object objOooO0O0;
        if (oooO0OO instanceof o00OO000.OooOO0) {
            return ((o00OO000.OooOO0) oooO0OO).toString();
        }
        try {
            objOooO0O0 = oooO0OO + '@' + OooOOOo(oooO0OO);
        } catch (Throwable th) {
            objOooO0O0 = o00O0.o000OOo.OooO0O0(th);
        }
        if (oo00o.OooOOO0.OooO00o(objOooO0O0) != null) {
            objOooO0O0 = oooO0OO.getClass().getName() + '@' + OooOOOo(oooO0OO);
        }
        return (String) objOooO0O0;
    }

    public static final Object OooOoo0(o00OOOOo o00ooooo, o00O0Oo.o00O0O o00o0o) throws Throwable {
        Object o0000ooo;
        Object objOooo0oo;
        OooOOoo(o00ooooo, true, new o000OOo(OooOOOO(o00ooooo.f31962OooOoO0.getContext()).OooO0Oo(o00ooooo.f31549OooOoO, o00ooooo, o00ooooo.f31520OooOo), 1));
        try {
            if (o00o0o == null) {
                o0000ooo = Oooo0o0.OooO.OooOo0o(o00o0o, o00ooooo, o00ooooo);
            } else {
                kotlin.jvm.internal.o0O0O00.OooO0O0(2, o00o0o);
                o0000ooo = o00o0o.invoke(o00ooooo, o00ooooo);
            }
        } catch (Throwable th) {
            o0000ooo = new o0000Ooo(false, th);
        }
        OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
        if (o0000ooo == oooOo00 || (objOooo0oo = o00ooooo.Oooo0oo(o0000ooo)) == f31502OooO0o0) {
            return oooOo00;
        }
        if (objOooo0oo instanceof o0000Ooo) {
            Throwable th2 = ((o0000Ooo) objOooo0oo).f31507OooO00o;
            if (!(th2 instanceof o00OOOO0) || ((o00OOOO0) th2).f31548OooOo0O != o00ooooo) {
                throw th2;
            }
            if (o0000ooo instanceof o0000Ooo) {
                throw ((o0000Ooo) o0000ooo).f31507OooO00o;
            }
        } else {
            o0000ooo = OooOooo(objOooo0oo);
        }
        return o0000ooo;
    }

    public static final long OooOooO(long j) {
        int i = o00O0oOO.OooOO0O.f31462OooOoO0;
        boolean z = j > 0;
        if (z) {
            return o00O0oOO.OooOO0O.OooO0Oo(o00O0oOO.OooOO0O.OooO0o(j, Oooo0oO.o00000.OooOOO0(999999L, o00O0oOO.OooOOO.f31465OooOo0o)));
        }
        if (z) {
            throw new OooOOO0.OooO00o();
        }
        return 0L;
    }

    public static final Object OooOooo(Object obj) {
        o00O00OO o00o00oo;
        o00O00o0 o00o00o0 = obj instanceof o00O00o0 ? (o00O00o0) obj : null;
        return (o00o00o0 == null || (o00o00oo = o00o00o0.f31533OooO00o) == null) ? obj : o00o00oo;
    }

    public static final o0O00o0 Oooo000(o00O0O0O.OooO0OO oooO0OO, OooOOO0 oooOOO0, Object obj) {
        o0O00o0 o0o00o0 = null;
        if ((oooO0OO instanceof o00O0OO0.OooO0o) && oooOOO0.get(oo00oO.f31577OooOo0O) != null) {
            o00O0OO0.OooO0o callerFrame = (o00O0OO0.OooO0o) oooO0OO;
            while (true) {
                if ((callerFrame instanceof o000O0) || (callerFrame = callerFrame.getCallerFrame()) == null) {
                    break;
                }
                if (callerFrame instanceof o0O00o0) {
                    o0o00o0 = (o0O00o0) callerFrame;
                    break;
                }
            }
            if (o0o00o0 != null) {
                o0o00o0.OooooOO(oooOOO0, obj);
            }
        }
        return o0o00o0;
    }

    public static final Object Oooo00O(o00O0Oo.o00O0O o00o0o, OooOOO0 oooOOO0, o00O0O0O.OooO0OO oooO0OO) throws Throwable {
        Object objOooOooo;
        OooOOO0 context = oooO0OO.getContext();
        OooOOO0 oooOOO0Plus = !((Boolean) oooOOO0.fold(Boolean.FALSE, new o00O.o00oO0o(3))).booleanValue() ? context.plus(oooOOO0) : OooOOO0(context, oooOOO0, false);
        OooOO0o(oooOOO0Plus);
        if (oooOOO0Plus == context) {
            o00OO000.o00Oo0 o00oo0 = new o00OO000.o00Oo0(oooO0OO, oooOOO0Plus);
            objOooOooo = o00Oo0oo.o00oO0o.OooOOO0(o00oo0, o00oo0, o00o0o);
        } else {
            OooO0o oooO0o = OooO0o.f31357OooOo0O;
            if (kotlin.jvm.internal.OooOo.OooO00o(oooOOO0Plus.get(oooO0o), context.get(oooO0o))) {
                o0O00o0 o0o00o0 = new o0O00o0(oooO0OO, oooOOO0Plus);
                OooOOO0 oooOOO02 = o0o00o0.f31520OooOo;
                Object objOooOO0o = o00OO000.OooO00o.OooOO0o(oooOOO02, null);
                try {
                    objOooOooo = o00Oo0oo.o00oO0o.OooOOO0(o0o00o0, o0o00o0, o00o0o);
                } finally {
                    o00OO000.OooO00o.OooO0oO(oooOOO02, objOooOO0o);
                }
            } else {
                o000O0 o000o0 = new o000O0(oooO0OO, oooOOO0Plus);
                try {
                    o00OO000.OooO00o.OooO0oo(OooOo.f33195OooO00o, Oooo0o0.OooO.OooOOOO(Oooo0o0.OooO.OooO0oO(o000o0, o000o0, o00o0o)));
                    while (true) {
                        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = o000O0.f31510OooOoO;
                        int i = atomicIntegerFieldUpdater.get(o000o0);
                        if (i != 0) {
                            if (i != 2) {
                                throw new IllegalStateException("Already suspended");
                            }
                            objOooOooo = OooOooo(o00O.f31521OooOo0O.get(o000o0));
                            if (objOooOooo instanceof o0000Ooo) {
                                throw ((o0000Ooo) objOooOooo).f31507OooO00o;
                            }
                        } else if (atomicIntegerFieldUpdater.compareAndSet(o000o0, 0, 1)) {
                            objOooOooo = OooOo00.f31365OooOo0O;
                            break;
                        }
                    }
                } catch (Throwable th) {
                    o000o0.resumeWith(o00O0.o000OOo.OooO0O0(th));
                    throw th;
                }
            }
        }
        OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
        return objOooOooo;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object Oooo00o(long r6, o00O0Oo.o00O0O r8, o00O0O0O.OooO0OO r9) throws java.lang.Throwable {
        /*
            boolean r0 = r9 instanceof o00O0oOo.o00Oo00
            if (r0 == 0) goto L13
            r0 = r9
            o00O0oOo.o00Oo00 r0 = (o00O0oOo.o00Oo00) r0
            int r1 = r0.f31554OooOoO0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f31554OooOoO0 = r1
            goto L18
        L13:
            o00O0oOo.o00Oo00 r0 = new o00O0oOo.o00Oo00
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f31551OooOo
            o00O0O0o.OooOo00 r1 = o00O0O0o.OooOo00.f31365OooOo0O
            int r2 = r0.f31554OooOoO0
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            kotlin.jvm.internal.o0Oo0oo r6 = r0.f31553OooOo0o
            o00O0.o000OOo.OooOO0O(r9)     // Catch: o00O0oOo.o00OOOO0 -> L29
            return r9
        L29:
            r7 = move-exception
            goto L59
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            o00O0.o000OOo.OooOO0O(r9)
            r4 = 0
            int r9 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r9 > 0) goto L3d
            goto L5f
        L3d:
            kotlin.jvm.internal.o0Oo0oo r9 = new kotlin.jvm.internal.o0Oo0oo
            r9.<init>()
            r0.f31552OooOo0O = r8     // Catch: o00O0oOo.o00OOOO0 -> L57
            r0.f31553OooOo0o = r9     // Catch: o00O0oOo.o00OOOO0 -> L57
            r0.f31554OooOoO0 = r3     // Catch: o00O0oOo.o00OOOO0 -> L57
            o00O0oOo.o00OOOOo r2 = new o00O0oOo.o00OOOOo     // Catch: o00O0oOo.o00OOOO0 -> L57
            r2.<init>(r6, r0)     // Catch: o00O0oOo.o00OOOO0 -> L57
            r9.f28880OooOo0O = r2     // Catch: o00O0oOo.o00OOOO0 -> L57
            java.lang.Object r6 = OooOoo0(r2, r8)     // Catch: o00O0oOo.o00OOOO0 -> L57
            if (r6 != r1) goto L56
            return r1
        L56:
            return r6
        L57:
            r7 = move-exception
            r6 = r9
        L59:
            o00O0oOo.o00OOOOo r8 = r7.f31548OooOo0O
            java.lang.Object r6 = r6.f28880OooOo0O
            if (r8 != r6) goto L61
        L5f:
            r6 = 0
            return r6
        L61:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: o00O0oOo.o0000OO0.Oooo00o(long, o00O0Oo.o00O0O, o00O0O0O.OooO0OO):java.lang.Object");
    }
}
