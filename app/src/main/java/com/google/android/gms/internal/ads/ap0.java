package com.google.android.gms.internal.ads;

import com.ironsource.C3034d9;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.tika.utils.StringUtils;

/* loaded from: classes2.dex */
public abstract class ap0 extends oq0 implements o00000oO.OooOOO {

    /* renamed from: OooOoO */
    public static final bq0 f17073OooOoO;

    /* renamed from: OooOoO0 */
    public static final boolean f17074OooOoO0;

    /* renamed from: OooOoOO */
    public static final xh0 f17075OooOoOO;

    /* renamed from: OooOoo0 */
    public static final Object f17076OooOoo0;

    /* renamed from: OooOo */
    public volatile zo0 f17077OooOo;

    /* renamed from: OooOo0O */
    public volatile Object f17078OooOo0O;

    /* renamed from: OooOo0o */
    public volatile ro0 f17079OooOo0o;

    static {
        boolean z;
        xh0 uo0Var;
        Throwable th;
        Throwable th2;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        f17074OooOoO0 = z;
        f17073OooOoO = new bq0(ap0.class, 0);
        try {
            uo0Var = new yo0(14);
            th = null;
            th2 = null;
        } catch (Error | Exception e) {
            try {
                th2 = e;
                uo0Var = new so0(AtomicReferenceFieldUpdater.newUpdater(zo0.class, Thread.class, "OooO00o"), AtomicReferenceFieldUpdater.newUpdater(zo0.class, zo0.class, "OooO0O0"), AtomicReferenceFieldUpdater.newUpdater(ap0.class, zo0.class, "OooOo"), AtomicReferenceFieldUpdater.newUpdater(ap0.class, ro0.class, "OooOo0o"), AtomicReferenceFieldUpdater.newUpdater(ap0.class, Object.class, "OooOo0O"));
                th = null;
            } catch (Error | Exception e2) {
                uo0Var = new uo0(14);
                th = e2;
                th2 = e;
            }
        }
        f17075OooOoOO = uo0Var;
        if (th != null) {
            bq0 bq0Var = f17073OooOoO;
            Logger loggerOooO00o = bq0Var.OooO00o();
            Level level = Level.SEVERE;
            loggerOooO00o.logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
            bq0Var.OooO00o().logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
        f17076OooOoo0 = new Object();
    }

    public static Object OooO(o00000oO.OooOOO oooOOO) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = oooOOO.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public static final Object OooO0OO(Object obj) throws ExecutionException {
        if (obj instanceof no0) {
            RuntimeException runtimeException = ((no0) obj).f21561OooO0O0;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(runtimeException);
            throw cancellationException;
        }
        if (obj instanceof qo0) {
            throw new ExecutionException(((qo0) obj).f23671OooO00o);
        }
        if (obj == f17076OooOoo0) {
            return null;
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Object OooO0oo(o00000oO.OooOOO oooOOO) {
        Throwable thOooO0O0;
        if (oooOOO instanceof vo0) {
            Object no0Var = ((ap0) oooOOO).f17078OooOo0O;
            if (no0Var instanceof no0) {
                no0 no0Var2 = (no0) no0Var;
                if (no0Var2.f21560OooO00o) {
                    RuntimeException runtimeException = no0Var2.f21561OooO0O0;
                    no0Var = runtimeException != null ? new no0(false, runtimeException) : no0.f21559OooO0Oo;
                }
            }
            Objects.requireNonNull(no0Var);
            return no0Var;
        }
        if ((oooOOO instanceof oq0) && (thOooO0O0 = ((oq0) oooOOO).OooO0O0()) != null) {
            return new qo0(thOooO0O0);
        }
        boolean zIsCancelled = oooOOO.isCancelled();
        if ((!f17074OooOoO0) && zIsCancelled) {
            no0 no0Var3 = no0.f21559OooO0Oo;
            Objects.requireNonNull(no0Var3);
            return no0Var3;
        }
        try {
            try {
                try {
                    Object objOooO = OooO(oooOOO);
                    return zIsCancelled ? new no0(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(oooOOO)))) : objOooO == null ? f17076OooOoo0 : objOooO;
                } catch (CancellationException e) {
                    return !zIsCancelled ? new qo0(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(oooOOO)), e)) : new no0(false, e);
                } catch (ExecutionException e2) {
                    return zIsCancelled ? new no0(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(oooOOO)), e2)) : new qo0(e2.getCause());
                }
            } catch (Error e3) {
                e = e3;
                return new qo0(e);
            }
        } catch (Error | Exception e4) {
            e = e4;
            return new qo0(e);
        }
    }

    public static void OooOOOO(ap0 ap0Var, boolean z) {
        ro0 ro0Var = null;
        while (true) {
            for (zo0 zo0VarOooo000 = f17075OooOoOO.Oooo000(ap0Var); zo0VarOooo000 != null; zo0VarOooo000 = zo0VarOooo000.f26236OooO0O0) {
                Thread thread = zo0VarOooo000.f26235OooO00o;
                if (thread != null) {
                    zo0VarOooo000.f26235OooO00o = null;
                    LockSupport.unpark(thread);
                }
            }
            if (z) {
                ap0Var.OooOO0();
            }
            ap0Var.OooO0o0();
            ro0 ro0Var2 = ro0Var;
            ro0 ro0VarOooOO0 = f17075OooOoOO.OooOO0(ap0Var);
            ro0 ro0Var3 = ro0Var2;
            while (ro0VarOooOO0 != null) {
                ro0 ro0Var4 = ro0VarOooOO0.f23924OooO0OO;
                ro0VarOooOO0.f23924OooO0OO = ro0Var3;
                ro0Var3 = ro0VarOooOO0;
                ro0VarOooOO0 = ro0Var4;
            }
            while (ro0Var3 != null) {
                ro0Var = ro0Var3.f23924OooO0OO;
                Runnable runnable = ro0Var3.f23922OooO00o;
                Objects.requireNonNull(runnable);
                if (runnable instanceof to0) {
                    to0 to0Var = (to0) runnable;
                    ap0Var = to0Var.f24369OooOo0O;
                    if (ap0Var.f17078OooOo0O == to0Var) {
                        if (f17075OooOoOO.OooooOO(ap0Var, to0Var, OooO0oo(to0Var.f24370OooOo0o))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = ro0Var3.f23923OooO0O0;
                    Objects.requireNonNull(executor);
                    OooOOOo(runnable, executor);
                }
                ro0Var3 = ro0Var;
            }
            return;
            z = false;
        }
    }

    public static void OooOOOo(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            f17073OooOoO.OooO00o().logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "executeListener", androidx.datastore.preferences.protobuf.OooO00o.OooOO0o("RuntimeException while executing runnable ", String.valueOf(runnable), " with executor ", String.valueOf(executor)), (Throwable) e);
        }
    }

    @Override // com.google.android.gms.internal.ads.oq0
    public final Throwable OooO0O0() {
        if (!(this instanceof vo0)) {
            return null;
        }
        Object obj = this.f17078OooOo0O;
        if (obj instanceof qo0) {
            return ((qo0) obj).f23671OooO00o;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String OooO0Oo() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public boolean OooO0o(Object obj) {
        if (obj == null) {
            obj = f17076OooOoo0;
        }
        if (!f17075OooOoOO.OooooOO(this, null, obj)) {
            return false;
        }
        OooOOOO(this, false);
        return true;
    }

    public void OooO0o0() {
    }

    public boolean OooO0oO(Throwable th) {
        th.getClass();
        if (!f17075OooOoOO.OooooOO(this, null, new qo0(th))) {
            return false;
        }
        OooOOOO(this, false);
        return true;
    }

    public void OooOO0() {
    }

    public final void OooOO0O(Future future) {
        if ((future != null) && (this.f17078OooOo0O instanceof no0)) {
            future.cancel(OooOOO0());
        }
    }

    public final void OooOO0o(o00000oO.OooOOO oooOOO) {
        qo0 qo0Var;
        oooOOO.getClass();
        Object obj = this.f17078OooOo0O;
        if (obj == null) {
            if (oooOOO.isDone()) {
                if (f17075OooOoOO.OooooOO(this, null, OooO0oo(oooOOO))) {
                    OooOOOO(this, false);
                    return;
                }
                return;
            }
            to0 to0Var = new to0(this, oooOOO);
            if (f17075OooOoOO.OooooOO(this, null, to0Var)) {
                try {
                    oooOOO.addListener(to0Var, qp0.f23673OooOo0O);
                    return;
                } catch (Throwable th) {
                    try {
                        qo0Var = new qo0(th);
                    } catch (Error | Exception unused) {
                        qo0Var = qo0.f23670OooO0O0;
                    }
                    f17075OooOoOO.OooooOO(this, to0Var, qo0Var);
                    return;
                }
            }
            obj = this.f17078OooOo0O;
        }
        if (obj instanceof no0) {
            oooOOO.cancel(((no0) obj).f21560OooO00o);
        }
    }

    public final void OooOOO(StringBuilder sb) {
        try {
            Object objOooO = OooO(this);
            sb.append("SUCCESS, result=[");
            if (objOooO == null) {
                sb.append("null");
            } else if (objOooO == this) {
                sb.append("this future");
            } else {
                sb.append(objOooO.getClass().getName());
                sb.append("@");
                sb.append(Integer.toHexString(System.identityHashCode(objOooO)));
            }
            sb.append(C3034d9.i.f8179e);
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (ExecutionException e) {
            sb.append("FAILURE, cause=[");
            sb.append(e.getCause());
            sb.append(C3034d9.i.f8179e);
        } catch (Exception e2) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e2.getClass());
            sb.append(" thrown from get()]");
        }
    }

    public final boolean OooOOO0() {
        Object obj = this.f17078OooOo0O;
        return (obj instanceof no0) && ((no0) obj).f21560OooO00o;
    }

    public final void OooOOo0(zo0 zo0Var) {
        zo0Var.f26235OooO00o = null;
        while (true) {
            zo0 zo0Var2 = this.f17077OooOo;
            if (zo0Var2 != zo0.f26234OooO0OO) {
                zo0 zo0Var3 = null;
                while (zo0Var2 != null) {
                    zo0 zo0Var4 = zo0Var2.f26236OooO0O0;
                    if (zo0Var2.f26235OooO00o != null) {
                        zo0Var3 = zo0Var2;
                    } else if (zo0Var3 != null) {
                        zo0Var3.f26236OooO0O0 = zo0Var4;
                        if (zo0Var3.f26235OooO00o == null) {
                            break;
                        }
                    } else if (!f17075OooOoOO.Oooooo0(this, zo0Var2, zo0Var4)) {
                        break;
                    }
                    zo0Var2 = zo0Var4;
                }
                return;
            }
            return;
        }
    }

    @Override // o00000oO.OooOOO
    public void addListener(Runnable runnable, Executor executor) {
        ro0 ro0Var;
        ro0 ro0Var2;
        ii0.Oooo0oo(runnable, "Runnable was null.");
        ii0.Oooo0oo(executor, "Executor was null.");
        if (!isDone() && (ro0Var = this.f17079OooOo0o) != (ro0Var2 = ro0.f23921OooO0Oo)) {
            ro0 ro0Var3 = new ro0(runnable, executor);
            do {
                ro0Var3.f23924OooO0OO = ro0Var;
                if (f17075OooOoOO.Ooooo00(this, ro0Var, ro0Var3)) {
                    return;
                } else {
                    ro0Var = this.f17079OooOo0o;
                }
            } while (ro0Var != ro0Var2);
        }
        OooOOOo(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        no0 no0Var;
        Object obj = this.f17078OooOo0O;
        if (!(obj instanceof to0) && !(obj == null)) {
            return false;
        }
        if (f17074OooOoO0) {
            no0Var = new no0(z, new CancellationException("Future.cancel() was called."));
        } else {
            no0Var = z ? no0.f21558OooO0OO : no0.f21559OooO0Oo;
            Objects.requireNonNull(no0Var);
        }
        ap0 ap0Var = this;
        boolean z2 = false;
        while (true) {
            if (f17075OooOoOO.OooooOO(ap0Var, obj, no0Var)) {
                OooOOOO(ap0Var, z);
                if (!(obj instanceof to0)) {
                    break;
                }
                o00000oO.OooOOO oooOOO = ((to0) obj).f24370OooOo0o;
                if (!(oooOOO instanceof vo0)) {
                    oooOOO.cancel(z);
                    break;
                }
                ap0Var = (ap0) oooOOO;
                obj = ap0Var.f17078OooOo0O;
                if (!(obj == null) && !(obj instanceof to0)) {
                    break;
                }
                z2 = true;
            } else {
                obj = ap0Var.f17078OooOo0O;
                if (!(obj instanceof to0)) {
                    return z2;
                }
            }
        }
        return true;
    }

    @Override // java.util.concurrent.Future
    public Object get() throws InterruptedException {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.f17078OooOo0O;
        if ((obj2 != null) && (!(obj2 instanceof to0))) {
            return OooO0OO(obj2);
        }
        zo0 zo0Var = this.f17077OooOo;
        zo0 zo0Var2 = zo0.f26234OooO0OO;
        if (zo0Var != zo0Var2) {
            zo0 zo0Var3 = new zo0();
            do {
                xh0 xh0Var = f17075OooOoOO;
                xh0Var.OoooO00(zo0Var3, zo0Var);
                if (xh0Var.Oooooo0(this, zo0Var, zo0Var3)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            OooOOo0(zo0Var3);
                            throw new InterruptedException();
                        }
                        obj = this.f17078OooOo0O;
                    } while (!((obj != null) & (!(obj instanceof to0))));
                    return OooO0OO(obj);
                }
                zo0Var = this.f17077OooOo;
            } while (zo0Var != zo0Var2);
        }
        Object obj3 = this.f17078OooOo0O;
        Objects.requireNonNull(obj3);
        return OooO0OO(obj3);
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f17078OooOo0O instanceof no0;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return (this.f17078OooOo0O != null) & (!(r0 instanceof to0));
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x00c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String toString() {
        /*
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r1 = r6.getClass()
            java.lang.String r1 = r1.getName()
            java.lang.String r2 = "com.google.common.util.concurrent."
            boolean r1 = r1.startsWith(r2)
            if (r1 == 0) goto L21
            java.lang.Class r1 = r6.getClass()
            java.lang.String r1 = r1.getSimpleName()
            r0.append(r1)
            goto L2c
        L21:
            java.lang.Class r1 = r6.getClass()
            java.lang.String r1 = r1.getName()
            r0.append(r1)
        L2c:
            r1 = 64
            r0.append(r1)
            int r1 = java.lang.System.identityHashCode(r6)
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            java.lang.String r1 = "[status="
            r0.append(r1)
            boolean r1 = r6.isCancelled()
            java.lang.String r2 = "]"
            if (r1 == 0) goto L50
            java.lang.String r1 = "CANCELLED"
            r0.append(r1)
            goto Lcb
        L50:
            boolean r1 = r6.isDone()
            if (r1 == 0) goto L5b
            r6.OooOOO(r0)
            goto Lcb
        L5b:
            int r1 = r0.length()
            java.lang.String r3 = "PENDING"
            r0.append(r3)
            java.lang.Object r3 = r6.f17078OooOo0O
            boolean r4 = r3 instanceof com.google.android.gms.internal.ads.to0
            java.lang.String r5 = "Exception thrown from implementation: "
            if (r4 == 0) goto L93
            java.lang.String r4 = ", setFuture=["
            r0.append(r4)
            com.google.android.gms.internal.ads.to0 r3 = (com.google.android.gms.internal.ads.to0) r3
            o00000oO.OooOOO r3 = r3.f24370OooOo0o
            if (r3 != r6) goto L81
            java.lang.String r3 = "this future"
            r0.append(r3)     // Catch: java.lang.StackOverflowError -> L7d java.lang.Exception -> L7f
            goto L8f
        L7d:
            r3 = move-exception
            goto L85
        L7f:
            r3 = move-exception
            goto L85
        L81:
            r0.append(r3)     // Catch: java.lang.StackOverflowError -> L7d java.lang.Exception -> L7f
            goto L8f
        L85:
            r0.append(r5)
            java.lang.Class r3 = r3.getClass()
            r0.append(r3)
        L8f:
            r0.append(r2)
            goto Lbb
        L93:
            java.lang.String r3 = r6.OooO0Oo()     // Catch: java.lang.StackOverflowError -> L9f java.lang.Exception -> La1
            boolean r4 = com.google.android.gms.internal.ads.xh0.OooOo(r3)     // Catch: java.lang.StackOverflowError -> L9f java.lang.Exception -> La1
            if (r4 == 0) goto Lae
            r3 = 0
            goto Lae
        L9f:
            r3 = move-exception
            goto La2
        La1:
            r3 = move-exception
        La2:
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r3 = r5.concat(r3)
        Lae:
            if (r3 == 0) goto Lbb
            java.lang.String r4 = ", info=["
            r0.append(r4)
            r0.append(r3)
            r0.append(r2)
        Lbb:
            boolean r3 = r6.isDone()
            if (r3 == 0) goto Lcb
            int r3 = r0.length()
            r0.delete(r1, r3)
            r6.OooOOO(r0)
        Lcb:
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ap0.toString():java.lang.String");
    }

    @Override // java.util.concurrent.Future
    public Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        boolean z;
        long j2;
        long nanos = timeUnit.toNanos(j);
        if (!Thread.interrupted()) {
            Object obj = this.f17078OooOo0O;
            if ((obj != null) & (!(obj instanceof to0))) {
                return OooO0OO(obj);
            }
            long j3 = 0;
            long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                zo0 zo0Var = this.f17077OooOo;
                zo0 zo0Var2 = zo0.f26234OooO0OO;
                if (zo0Var != zo0Var2) {
                    zo0 zo0Var3 = new zo0();
                    z = true;
                    while (true) {
                        xh0 xh0Var = f17075OooOoOO;
                        xh0Var.OoooO00(zo0Var3, zo0Var);
                        if (xh0Var.Oooooo0(this, zo0Var, zo0Var3)) {
                            j2 = j3;
                            do {
                                LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f17078OooOo0O;
                                    if ((obj2 != null) & (!(obj2 instanceof to0))) {
                                        return OooO0OO(obj2);
                                    }
                                    nanos = jNanoTime - System.nanoTime();
                                } else {
                                    OooOOo0(zo0Var3);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            OooOOo0(zo0Var3);
                        } else {
                            long j4 = j3;
                            zo0Var = this.f17077OooOo;
                            if (zo0Var == zo0Var2) {
                                break;
                            }
                            j3 = j4;
                        }
                    }
                }
                Object obj3 = this.f17078OooOo0O;
                Objects.requireNonNull(obj3);
                return OooO0OO(obj3);
            }
            z = true;
            j2 = 0;
            while (nanos > j2) {
                Object obj4 = this.f17078OooOo0O;
                if ((obj4 != null ? z : false) & (!(obj4 instanceof to0))) {
                    return OooO0OO(obj4);
                }
                if (!Thread.interrupted()) {
                    nanos = jNanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String string = toString();
            String string2 = timeUnit.toString();
            Locale locale = Locale.ROOT;
            String lowerCase = string2.toLowerCase(locale);
            String strConcat = "Waited " + j + StringUtils.SPACE + timeUnit.toString().toLowerCase(locale);
            if (nanos + 1000 < j2) {
                String strConcat2 = strConcat.concat(" (plus ");
                long j5 = -nanos;
                long jConvert = timeUnit.convert(j5, TimeUnit.NANOSECONDS);
                long nanos2 = j5 - timeUnit.toNanos(jConvert);
                if (jConvert != j2 && nanos2 <= 1000) {
                    z = false;
                }
                if (jConvert > j2) {
                    String strConcat3 = strConcat2 + jConvert + StringUtils.SPACE + lowerCase;
                    if (z) {
                        strConcat3 = strConcat3.concat(",");
                    }
                    strConcat2 = strConcat3.concat(StringUtils.SPACE);
                }
                if (z) {
                    strConcat2 = strConcat2 + nanos2 + " nanoseconds ";
                }
                strConcat = strConcat2.concat("delay)");
            }
            if (isDone()) {
                throw new TimeoutException(strConcat.concat(" but future completed as timeout expired"));
            }
            throw new TimeoutException(OooO0oO.OooOo.OooOoo(strConcat, " for ", string));
        }
        throw new InterruptedException();
    }
}
