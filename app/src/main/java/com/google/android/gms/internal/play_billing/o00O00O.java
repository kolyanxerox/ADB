package com.google.android.gms.internal.play_billing;

import com.google.android.gms.internal.ads.bq0;
import com.ironsource.C3034d9;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.tika.utils.StringUtils;

/* loaded from: classes2.dex */
public abstract class o00O00O extends o00OOO00 implements oo0o0O0 {

    /* renamed from: OooOoO */
    public static final bq0 f27049OooOoO;

    /* renamed from: OooOoO0 */
    public static final boolean f27050OooOoO0;

    /* renamed from: OooOoOO */
    public static final o0O000Oo f27051OooOoOO;

    /* renamed from: OooOoo0 */
    public static final Object f27052OooOoo0;

    /* renamed from: OooOo */
    public volatile o00O00 f27053OooOo;

    /* renamed from: OooOo0O */
    public volatile Object f27054OooOo0O;

    /* renamed from: OooOo0o */
    public volatile o000OOo0 f27055OooOo0o;

    static {
        boolean z;
        o0O000Oo o0o0ooo;
        Throwable th;
        Throwable th2;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        f27050OooOoO0 = z;
        f27049OooOoO = new bq0(o00O00O.class, 1);
        try {
            o0o0ooo = new o00O000o(7);
            th = null;
            th2 = null;
        } catch (Error | Exception e) {
            try {
                th2 = e;
                o0o0ooo = new o00(AtomicReferenceFieldUpdater.newUpdater(o00O00.class, Thread.class, "OooO00o"), AtomicReferenceFieldUpdater.newUpdater(o00O00.class, o00O00.class, "OooO0O0"), AtomicReferenceFieldUpdater.newUpdater(o00O00O.class, o00O00.class, "OooOo"), AtomicReferenceFieldUpdater.newUpdater(o00O00O.class, o000OOo0.class, "OooOo0o"), AtomicReferenceFieldUpdater.newUpdater(o00O00O.class, Object.class, "OooOo0O"));
                th = null;
            } catch (Error | Exception e2) {
                o0o0ooo = new o0O0ooO(7);
                th = e2;
                th2 = e;
            }
        }
        f27051OooOoOO = o0o0ooo;
        if (th != null) {
            bq0 bq0Var = f27049OooOoO;
            Logger loggerOooO00o = bq0Var.OooO00o();
            Level level = Level.SEVERE;
            loggerOooO00o.logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
            bq0Var.OooO00o().logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
        f27052OooOoo0 = new Object();
    }

    public static void OooO(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            f27049OooOoO.OooO00o().logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "executeListener", androidx.datastore.preferences.protobuf.OooO00o.OooOO0o("RuntimeException while executing runnable ", String.valueOf(runnable), " with executor ", String.valueOf(executor)), (Throwable) e);
        }
    }

    public static Object OooO0o(oo0o0O0 oo0o0o0) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = oo0o0o0.get();
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object OooO0o0(com.google.android.gms.internal.play_billing.oo0o0O0 r6) {
        /*
            java.lang.String r0 = "get() did not throw CancellationException, despite reporting isCancelled() == true: "
            boolean r1 = r6 instanceof com.google.android.gms.internal.play_billing.o00oOoo
            r2 = 0
            if (r1 == 0) goto L27
            com.google.android.gms.internal.play_billing.o00O00O r6 = (com.google.android.gms.internal.play_billing.o00O00O) r6
            java.lang.Object r6 = r6.f27054OooOo0O
            boolean r0 = r6 instanceof com.google.android.gms.internal.play_billing.o000O
            if (r0 == 0) goto L23
            r0 = r6
            com.google.android.gms.internal.play_billing.o000O r0 = (com.google.android.gms.internal.play_billing.o000O) r0
            boolean r1 = r0.f26996OooO00o
            if (r1 == 0) goto L23
            java.lang.RuntimeException r6 = r0.f26997OooO0O0
            if (r6 == 0) goto L21
            com.google.android.gms.internal.play_billing.o000O r0 = new com.google.android.gms.internal.play_billing.o000O
            r0.<init>(r2, r6)
            r6 = r0
            goto L23
        L21:
            com.google.android.gms.internal.play_billing.o000O r6 = com.google.android.gms.internal.play_billing.o000O.f26995OooO0Oo
        L23:
            java.util.Objects.requireNonNull(r6)
            return r6
        L27:
            boolean r1 = r6 instanceof com.google.android.gms.internal.play_billing.o00OOO00
            if (r1 == 0) goto L4c
            r1 = r6
            com.google.android.gms.internal.play_billing.o00OOO00 r1 = (com.google.android.gms.internal.play_billing.o00OOO00) r1
            com.google.android.gms.internal.play_billing.o00O00O r1 = (com.google.android.gms.internal.play_billing.o00O00O) r1
            r1.getClass()
            boolean r3 = r1 instanceof com.google.android.gms.internal.play_billing.o00oOoo
            if (r3 == 0) goto L42
            java.lang.Object r1 = r1.f27054OooOo0O
            boolean r3 = r1 instanceof com.google.android.gms.internal.play_billing.o000OO00
            if (r3 == 0) goto L42
            com.google.android.gms.internal.play_billing.o000OO00 r1 = (com.google.android.gms.internal.play_billing.o000OO00) r1
            java.lang.Throwable r1 = r1.f27024OooO00o
            goto L43
        L42:
            r1 = 0
        L43:
            if (r1 != 0) goto L46
            goto L4c
        L46:
            com.google.android.gms.internal.play_billing.o000OO00 r6 = new com.google.android.gms.internal.play_billing.o000OO00
            r6.<init>(r1)
            return r6
        L4c:
            boolean r1 = r6.isCancelled()
            boolean r3 = com.google.android.gms.internal.play_billing.o00O00O.f27050OooOoO0
            r3 = r3 ^ 1
            r3 = r3 & r1
            if (r3 == 0) goto L5d
            com.google.android.gms.internal.play_billing.o000O r6 = com.google.android.gms.internal.play_billing.o000O.f26995OooO0Oo
            java.util.Objects.requireNonNull(r6)
            return r6
        L5d:
            java.lang.Object r3 = OooO0o(r6)     // Catch: java.lang.Error -> L76 java.util.concurrent.CancellationException -> L78 java.util.concurrent.ExecutionException -> L7a java.lang.Throwable -> L81
            if (r1 == 0) goto L7c
            com.google.android.gms.internal.play_billing.o000O r3 = new com.google.android.gms.internal.play_billing.o000O     // Catch: java.util.concurrent.CancellationException -> L78 java.util.concurrent.ExecutionException -> L7a java.lang.Throwable -> L81
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException     // Catch: java.util.concurrent.CancellationException -> L78 java.util.concurrent.ExecutionException -> L7a java.lang.Throwable -> L81
            java.lang.String r5 = java.lang.String.valueOf(r6)     // Catch: java.util.concurrent.CancellationException -> L78 java.util.concurrent.ExecutionException -> L7a java.lang.Throwable -> L81
            java.lang.String r5 = r0.concat(r5)     // Catch: java.util.concurrent.CancellationException -> L78 java.util.concurrent.ExecutionException -> L7a java.lang.Throwable -> L81
            r4.<init>(r5)     // Catch: java.util.concurrent.CancellationException -> L78 java.util.concurrent.ExecutionException -> L7a java.lang.Throwable -> L81
            r3.<init>(r2, r4)     // Catch: java.lang.Error -> L76 java.util.concurrent.CancellationException -> L78 java.util.concurrent.ExecutionException -> L7a java.lang.Throwable -> L81
            return r3
        L76:
            r6 = move-exception
            goto L84
        L78:
            r0 = move-exception
            goto L8a
        L7a:
            r3 = move-exception
            goto La7
        L7c:
            if (r3 != 0) goto L83
            java.lang.Object r6 = com.google.android.gms.internal.play_billing.o00O00O.f27052OooOoo0     // Catch: java.util.concurrent.CancellationException -> L78 java.util.concurrent.ExecutionException -> L7a java.lang.Throwable -> L81 java.lang.Throwable -> L81
            return r6
        L81:
            r6 = move-exception
            goto L84
        L83:
            return r3
        L84:
            com.google.android.gms.internal.play_billing.o000OO00 r0 = new com.google.android.gms.internal.play_billing.o000OO00
            r0.<init>(r6)
            return r0
        L8a:
            if (r1 != 0) goto La1
            com.google.android.gms.internal.play_billing.o000OO00 r1 = new com.google.android.gms.internal.play_billing.o000OO00
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r3 = "get() threw CancellationException, despite reporting isCancelled() == false: "
            java.lang.String r6 = r3.concat(r6)
            r2.<init>(r6, r0)
            r1.<init>(r2)
            return r1
        La1:
            com.google.android.gms.internal.play_billing.o000O r6 = new com.google.android.gms.internal.play_billing.o000O
            r6.<init>(r2, r0)
            return r6
        La7:
            if (r1 == 0) goto Lbc
            com.google.android.gms.internal.play_billing.o000O r1 = new com.google.android.gms.internal.play_billing.o000O
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r6 = r0.concat(r6)
            r4.<init>(r6, r3)
            r1.<init>(r2, r4)
            return r1
        Lbc:
            com.google.android.gms.internal.play_billing.o000OO00 r6 = new com.google.android.gms.internal.play_billing.o000OO00
            java.lang.Throwable r0 = r3.getCause()
            r6.<init>(r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.o00O00O.OooO0o0(com.google.android.gms.internal.play_billing.oo0o0O0):java.lang.Object");
    }

    public static void OooO0oo(o00O00O o00o00o) {
        o000OOo0 o000ooo02;
        o000OOo0 o000ooo03 = null;
        while (true) {
            for (o00O00 o00o00OooOOOO = f27051OooOoOO.OooOOOO(o00o00o); o00o00OooOOOO != null; o00o00OooOOOO = o00o00OooOOOO.f27040OooO0O0) {
                Thread thread = o00o00OooOOOO.f27039OooO00o;
                if (thread != null) {
                    o00o00OooOOOO.f27039OooO00o = null;
                    LockSupport.unpark(thread);
                }
            }
            o00o00o.OooO0OO();
            o000OOo0 o000ooo04 = o000ooo03;
            o000OOo0 o000ooo0OooO0Oo = f27051OooOoOO.OooO0Oo(o00o00o);
            o000OOo0 o000ooo05 = o000ooo04;
            while (o000ooo0OooO0Oo != null) {
                o000OOo0 o000ooo06 = o000ooo0OooO0Oo.f27031OooO0OO;
                o000ooo0OooO0Oo.f27031OooO0OO = o000ooo05;
                o000ooo05 = o000ooo0OooO0Oo;
                o000ooo0OooO0Oo = o000ooo06;
            }
            while (o000ooo05 != null) {
                Runnable runnable = o000ooo05.f27029OooO00o;
                o000ooo02 = o000ooo05.f27031OooO0OO;
                Objects.requireNonNull(runnable);
                if (runnable instanceof o00O0000) {
                    o00O0000 o00o0000 = (o00O0000) runnable;
                    o00o00o = o00o0000.f27041OooOo0O;
                    if (o00o00o.f27054OooOo0O == o00o0000) {
                        if (f27051OooOoOO.OooOooO(o00o00o, o00o0000, OooO0o0(o00o0000.f27042OooOo0o))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = o000ooo05.f27030OooO0O0;
                    Objects.requireNonNull(executor);
                    OooO(runnable, executor);
                }
                o000ooo05 = o000ooo02;
            }
            return;
            o000ooo03 = o000ooo02;
        }
    }

    public static final Object OooOO0O(Object obj) throws ExecutionException {
        if (obj instanceof o000O) {
            RuntimeException runtimeException = ((o000O) obj).f26997OooO0O0;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(runtimeException);
            throw cancellationException;
        }
        if (obj instanceof o000OO00) {
            throw new ExecutionException(((o000OO00) obj).f27024OooO00o);
        }
        if (obj == f27052OooOoo0) {
            return null;
        }
        return obj;
    }

    @Override // com.google.android.gms.internal.play_billing.oo0o0O0
    public final void OooO00o(Runnable runnable, Executor executor) {
        o000OOo0 o000ooo02;
        o000OOo0 o000ooo03;
        if (executor == null) {
            throw new NullPointerException("Executor was null.");
        }
        if (!isDone() && (o000ooo02 = this.f27055OooOo0o) != (o000ooo03 = o000OOo0.f27028OooO0Oo)) {
            o000OOo0 o000ooo04 = new o000OOo0(runnable, executor);
            do {
                o000ooo04.f27031OooO0OO = o000ooo02;
                if (f27051OooOoOO.OooOoO(this, o000ooo02, o000ooo04)) {
                    return;
                } else {
                    o000ooo02 = this.f27055OooOo0o;
                }
            } while (o000ooo02 != o000ooo03);
        }
        OooO(runnable, executor);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String OooO0O0() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public void OooO0OO() {
    }

    public final void OooO0Oo(Throwable th) {
        if (f27051OooOoOO.OooOooO(this, null, new o000OO00(th))) {
            OooO0oo(this);
        }
    }

    public final void OooO0oO(StringBuilder sb) {
        try {
            Object objOooO0o = OooO0o(this);
            sb.append("SUCCESS, result=[");
            if (objOooO0o == null) {
                sb.append("null");
            } else if (objOooO0o == this) {
                sb.append("this future");
            } else {
                sb.append(objOooO0o.getClass().getName());
                sb.append("@");
                sb.append(Integer.toHexString(System.identityHashCode(objOooO0o)));
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

    public final void OooOO0(o00O00 o00o00) {
        o00o00.f27039OooO00o = null;
        while (true) {
            o00O00 o00o002 = this.f27053OooOo;
            if (o00o002 != o00O00.f27038OooO0OO) {
                o00O00 o00o003 = null;
                while (o00o002 != null) {
                    o00O00 o00o004 = o00o002.f27040OooO0O0;
                    if (o00o002.f27039OooO00o != null) {
                        o00o003 = o00o002;
                    } else if (o00o003 != null) {
                        o00o003.f27040OooO0O0 = o00o004;
                        if (o00o003.f27039OooO00o == null) {
                            break;
                        }
                    } else if (!f27051OooOoOO.Oooo000(this, o00o002, o00o004)) {
                        break;
                    }
                    o00o002 = o00o004;
                }
                return;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        o000O o000o;
        Object obj = this.f27054OooOo0O;
        if (!(obj instanceof o00O0000) && !(obj == null)) {
            return false;
        }
        if (f27050OooOoO0) {
            o000o = new o000O(z, new CancellationException("Future.cancel() was called."));
        } else {
            o000o = z ? o000O.f26994OooO0OO : o000O.f26995OooO0Oo;
            Objects.requireNonNull(o000o);
        }
        o00O00O o00o00o = this;
        boolean z2 = false;
        while (true) {
            if (f27051OooOoOO.OooOooO(o00o00o, obj, o000o)) {
                OooO0oo(o00o00o);
                if (!(obj instanceof o00O0000)) {
                    break;
                }
                oo0o0O0 oo0o0o0 = ((o00O0000) obj).f27042OooOo0o;
                if (!(oo0o0o0 instanceof o00oOoo)) {
                    oo0o0o0.cancel(z);
                    break;
                }
                o00o00o = (o00O00O) oo0o0o0;
                obj = o00o00o.f27054OooOo0O;
                if (!(obj == null) && !(obj instanceof o00O0000)) {
                    break;
                }
                z2 = true;
            } else {
                obj = o00o00o.f27054OooOo0O;
                if (!(obj instanceof o00O0000)) {
                    return z2;
                }
            }
        }
        return true;
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.f27054OooOo0O;
        if ((obj2 != null) && (!(obj2 instanceof o00O0000))) {
            return OooOO0O(obj2);
        }
        o00O00 o00o00 = this.f27053OooOo;
        o00O00 o00o002 = o00O00.f27038OooO0OO;
        if (o00o00 != o00o002) {
            o00O00 o00o003 = new o00O00();
            do {
                o0O000Oo o0o000oo = f27051OooOoOO;
                o0o000oo.OooOOoo(o00o003, o00o00);
                if (o0o000oo.Oooo000(this, o00o00, o00o003)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            OooOO0(o00o003);
                            throw new InterruptedException();
                        }
                        obj = this.f27054OooOo0O;
                    } while (!((obj != null) & (!(obj instanceof o00O0000))));
                    return OooOO0O(obj);
                }
                o00o00 = this.f27053OooOo;
            } while (o00o00 != o00o002);
        }
        Object obj3 = this.f27054OooOo0O;
        Objects.requireNonNull(obj3);
        return OooOO0O(obj3);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f27054OooOo0O instanceof o000O;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (this.f27054OooOo0O != null) & (!(r0 instanceof o00O0000));
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String toString() {
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
            java.lang.Object r1 = r6.f27054OooOo0O
            boolean r1 = r1 instanceof com.google.android.gms.internal.play_billing.o000O
            java.lang.String r2 = "]"
            if (r1 == 0) goto L50
            java.lang.String r1 = "CANCELLED"
            r0.append(r1)
            goto Lce
        L50:
            boolean r1 = r6.isDone()
            if (r1 == 0) goto L5b
            r6.OooO0oO(r0)
            goto Lce
        L5b:
            int r1 = r0.length()
            java.lang.String r3 = "PENDING"
            r0.append(r3)
            java.lang.Object r3 = r6.f27054OooOo0O
            boolean r4 = r3 instanceof com.google.android.gms.internal.play_billing.o00O0000
            java.lang.String r5 = "Exception thrown from implementation: "
            if (r4 == 0) goto L93
            java.lang.String r4 = ", setFuture=["
            r0.append(r4)
            com.google.android.gms.internal.play_billing.o00O0000 r3 = (com.google.android.gms.internal.play_billing.o00O0000) r3
            com.google.android.gms.internal.play_billing.oo0o0O0 r3 = r3.f27042OooOo0o
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
            goto Lbe
        L93:
            java.lang.String r3 = r6.OooO0O0()     // Catch: java.lang.StackOverflowError -> La2 java.lang.Exception -> La4
            r4 = 0
            if (r3 == 0) goto La0
            boolean r5 = r3.isEmpty()     // Catch: java.lang.StackOverflowError -> La2 java.lang.Exception -> La4
            if (r5 == 0) goto Lb1
        La0:
            r3 = r4
            goto Lb1
        La2:
            r3 = move-exception
            goto La5
        La4:
            r3 = move-exception
        La5:
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r3 = r5.concat(r3)
        Lb1:
            if (r3 == 0) goto Lbe
            java.lang.String r4 = ", info=["
            r0.append(r4)
            r0.append(r3)
            r0.append(r2)
        Lbe:
            boolean r3 = r6.isDone()
            if (r3 == 0) goto Lce
            int r3 = r0.length()
            r0.delete(r1, r3)
            r6.OooO0oO(r0)
        Lce:
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.o00O00O.toString():java.lang.String");
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        boolean z;
        long j2;
        long nanos = timeUnit.toNanos(j);
        if (!Thread.interrupted()) {
            Object obj = this.f27054OooOo0O;
            if ((obj != null) & (!(obj instanceof o00O0000))) {
                return OooOO0O(obj);
            }
            long j3 = 0;
            long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                o00O00 o00o00 = this.f27053OooOo;
                o00O00 o00o002 = o00O00.f27038OooO0OO;
                if (o00o00 != o00o002) {
                    o00O00 o00o003 = new o00O00();
                    z = true;
                    while (true) {
                        o0O000Oo o0o000oo = f27051OooOoOO;
                        o0o000oo.OooOOoo(o00o003, o00o00);
                        if (o0o000oo.Oooo000(this, o00o00, o00o003)) {
                            j2 = j3;
                            do {
                                LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f27054OooOo0O;
                                    if ((obj2 != null) & (!(obj2 instanceof o00O0000))) {
                                        return OooOO0O(obj2);
                                    }
                                    nanos = jNanoTime - System.nanoTime();
                                } else {
                                    OooOO0(o00o003);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            OooOO0(o00o003);
                        } else {
                            long j4 = j3;
                            o00o00 = this.f27053OooOo;
                            if (o00o00 == o00o002) {
                                break;
                            }
                            j3 = j4;
                        }
                    }
                }
                Object obj3 = this.f27054OooOo0O;
                Objects.requireNonNull(obj3);
                return OooOO0O(obj3);
            }
            z = true;
            j2 = 0;
            while (nanos > j2) {
                Object obj4 = this.f27054OooOo0O;
                if ((obj4 != null ? z : false) & (!(obj4 instanceof o00O0000))) {
                    return OooOO0O(obj4);
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
