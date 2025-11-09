package com.google.android.gms.internal.play_billing;

import com.ironsource.C3034d9;
import java.util.Locale;
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
public class oO000o00 implements oo0o0O0 {

    /* renamed from: OooOoOO, reason: collision with root package name */
    public static final o0O000Oo f27191OooOoOO;

    /* renamed from: OooOoo0, reason: collision with root package name */
    public static final Object f27192OooOoo0;

    /* renamed from: OooOo, reason: collision with root package name */
    public volatile oO000Oo f27193OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public volatile Object f27194OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public volatile oo0ooO f27195OooOo0o;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public static final boolean f27190OooOoO0 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: OooOoO, reason: collision with root package name */
    public static final Logger f27189OooOoO = Logger.getLogger(oO000o00.class.getName());

    static {
        o0O000Oo oo000oo0;
        try {
            oo000oo0 = new oO0000Oo(AtomicReferenceFieldUpdater.newUpdater(oO000Oo.class, Thread.class, "OooO00o"), AtomicReferenceFieldUpdater.newUpdater(oO000Oo.class, oO000Oo.class, "OooO0O0"), AtomicReferenceFieldUpdater.newUpdater(oO000o00.class, oO000Oo.class, "OooOo"), AtomicReferenceFieldUpdater.newUpdater(oO000o00.class, oo0ooO.class, "OooOo0o"), AtomicReferenceFieldUpdater.newUpdater(oO000o00.class, Object.class, "OooOo0O"));
            th = null;
        } catch (Throwable th) {
            th = th;
            oo000oo0 = new oO000Oo0(9);
        }
        Throwable th2 = th;
        f27191OooOoOO = oo000oo0;
        if (th2 != null) {
            f27189OooOoO.logp(Level.SEVERE, "com.android.billingclient.util.concurrent.AbstractResolvableFuture", "<clinit>", "SafeAtomicHelper is broken!", th2);
        }
        f27192OooOoo0 = new Object();
    }

    public static void OooO0OO(oO000o00 oo000o00) {
        oO000Oo oo000oo;
        oo0ooO oo0ooo;
        oo0ooO oo0ooo2;
        oo0ooO oo0ooo3;
        do {
            oo000oo = oo000o00.f27193OooOo;
        } while (!f27191OooOoOO.OooOoOO(oo000o00, oo000oo, oO000Oo.f27186OooO0OO));
        while (true) {
            oo0ooo = null;
            if (oo000oo == null) {
                break;
            }
            Thread thread = oo000oo.f27187OooO00o;
            if (thread != null) {
                oo000oo.f27187OooO00o = null;
                LockSupport.unpark(thread);
            }
            oo000oo = oo000oo.f27188OooO0O0;
        }
        do {
            oo0ooo2 = oo000o00.f27195OooOo0o;
        } while (!f27191OooOoOO.OooOo00(oo000o00, oo0ooo2, oo0ooO.f27218OooO0Oo));
        while (true) {
            oo0ooo3 = oo0ooo;
            oo0ooo = oo0ooo2;
            if (oo0ooo == null) {
                break;
            }
            oo0ooo2 = oo0ooo.f27221OooO0OO;
            oo0ooo.f27221OooO0OO = oo0ooo3;
        }
        while (oo0ooo3 != null) {
            Runnable runnable = oo0ooo3.f27219OooO00o;
            oo0ooO oo0ooo4 = oo0ooo3.f27221OooO0OO;
            OooO0o0(runnable, oo0ooo3.f27220OooO0O0);
            oo0ooo3 = oo0ooo4;
        }
    }

    public static void OooO0o0(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            f27189OooOoO.logp(Level.SEVERE, "com.android.billingclient.util.concurrent.AbstractResolvableFuture", "executeListener", androidx.datastore.preferences.protobuf.OooO00o.OooOO0o("RuntimeException while executing runnable ", String.valueOf(runnable), " with executor ", String.valueOf(executor)), (Throwable) e);
        }
    }

    public static final Object OooO0oO(Object obj) throws ExecutionException {
        if (obj instanceof o0O0o) {
            CancellationException cancellationException = ((o0O0o) obj).f27115OooO00o;
            CancellationException cancellationException2 = new CancellationException("Task was cancelled.");
            cancellationException2.initCause(cancellationException);
            throw cancellationException2;
        }
        if (obj instanceof o0O0oo0o) {
            throw new ExecutionException(((o0O0oo0o) obj).f27133OooO00o);
        }
        if (obj == f27192OooOoo0) {
            return null;
        }
        return obj;
    }

    @Override // com.google.android.gms.internal.play_billing.oo0o0O0
    public final void OooO00o(Runnable runnable, Executor executor) {
        executor.getClass();
        oo0ooO oo0ooo = this.f27195OooOo0o;
        oo0ooO oo0ooo2 = oo0ooO.f27218OooO0Oo;
        if (oo0ooo != oo0ooo2) {
            oo0ooO oo0ooo3 = new oo0ooO(runnable, executor);
            do {
                oo0ooo3.f27221OooO0OO = oo0ooo;
                if (f27191OooOoOO.OooOo00(this, oo0ooo, oo0ooo3)) {
                    return;
                } else {
                    oo0ooo = this.f27195OooOo0o;
                }
            } while (oo0ooo != oo0ooo2);
        }
        OooO0o0(runnable, executor);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String OooO0O0() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public final void OooO0Oo(StringBuilder sb) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                try {
                    obj = get();
                    break;
                } catch (CancellationException unused) {
                    sb.append("CANCELLED");
                    return;
                } catch (RuntimeException e) {
                    sb.append("UNKNOWN, cause=[");
                    sb.append(e.getClass());
                    sb.append(" thrown from get()]");
                    return;
                } catch (ExecutionException e2) {
                    sb.append("FAILURE, cause=[");
                    sb.append(e2.getCause());
                    sb.append(C3034d9.i.f8179e);
                    return;
                }
            } catch (InterruptedException unused2) {
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
        sb.append("SUCCESS, result=[");
        sb.append(obj == this ? "this future" : String.valueOf(obj));
        sb.append(C3034d9.i.f8179e);
    }

    public final void OooO0o(oO000Oo oo000oo) {
        oo000oo.f27187OooO00o = null;
        while (true) {
            oO000Oo oo000oo2 = this.f27193OooOo;
            if (oo000oo2 != oO000Oo.f27186OooO0OO) {
                oO000Oo oo000oo3 = null;
                while (oo000oo2 != null) {
                    oO000Oo oo000oo4 = oo000oo2.f27188OooO0O0;
                    if (oo000oo2.f27187OooO00o != null) {
                        oo000oo3 = oo000oo2;
                    } else if (oo000oo3 != null) {
                        oo000oo3.f27188OooO0O0 = oo000oo4;
                        if (oo000oo3.f27187OooO00o == null) {
                            break;
                        }
                    } else if (!f27191OooOoOO.OooOoOO(this, oo000oo2, oo000oo4)) {
                        break;
                    }
                    oo000oo2 = oo000oo4;
                }
                return;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        Object obj = this.f27194OooOo0O;
        if (obj != null) {
            return false;
        }
        if (!f27191OooOoOO.OooOo0O(this, obj, f27190OooOoO0 ? new o0O0o(new CancellationException("Future.cancel() was called.")) : z ? o0O0o.f27113OooO0O0 : o0O0o.f27114OooO0OO)) {
            return false;
        }
        OooO0OO(this);
        return true;
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.f27194OooOo0O;
        if (obj2 != null) {
            return OooO0oO(obj2);
        }
        oO000Oo oo000oo = this.f27193OooOo;
        oO000Oo oo000oo2 = oO000Oo.f27186OooO0OO;
        if (oo000oo != oo000oo2) {
            oO000Oo oo000oo3 = new oO000Oo();
            do {
                o0O000Oo o0o000oo = f27191OooOoOO;
                o0o000oo.OooO(oo000oo3, oo000oo);
                if (o0o000oo.OooOoOO(this, oo000oo, oo000oo3)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            OooO0o(oo000oo3);
                            throw new InterruptedException();
                        }
                        obj = this.f27194OooOo0O;
                    } while (obj == null);
                    return OooO0oO(obj);
                }
                oo000oo = this.f27193OooOo;
            } while (oo000oo != oo000oo2);
        }
        return OooO0oO(this.f27194OooOo0O);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f27194OooOo0O instanceof o0O0o;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f27194OooOo0O != null;
    }

    public final String toString() {
        String strConcat;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f27194OooOo0O instanceof o0O0o) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            OooO0Oo(sb);
        } else {
            try {
                strConcat = OooO0O0();
            } catch (RuntimeException e) {
                strConcat = "Exception thrown from implementation: ".concat(String.valueOf(e.getClass()));
            }
            if (strConcat != null && !strConcat.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(strConcat);
                sb.append(C3034d9.i.f8179e);
            } else if (isDone()) {
                OooO0Oo(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append(C3034d9.i.f8179e);
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j);
        if (!Thread.interrupted()) {
            Object obj = this.f27194OooOo0O;
            if (obj != null) {
                return OooO0oO(obj);
            }
            long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                oO000Oo oo000oo = this.f27193OooOo;
                oO000Oo oo000oo2 = oO000Oo.f27186OooO0OO;
                if (oo000oo != oo000oo2) {
                    oO000Oo oo000oo3 = new oO000Oo();
                    do {
                        o0O000Oo o0o000oo = f27191OooOoOO;
                        o0o000oo.OooO(oo000oo3, oo000oo);
                        if (o0o000oo.OooOoOO(this, oo000oo, oo000oo3)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f27194OooOo0O;
                                    if (obj2 != null) {
                                        return OooO0oO(obj2);
                                    }
                                    nanos = jNanoTime - System.nanoTime();
                                } else {
                                    OooO0o(oo000oo3);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            OooO0o(oo000oo3);
                        } else {
                            oo000oo = this.f27193OooOo;
                        }
                    } while (oo000oo != oo000oo2);
                }
                return OooO0oO(this.f27194OooOo0O);
            }
            while (nanos > 0) {
                Object obj3 = this.f27194OooOo0O;
                if (obj3 != null) {
                    return OooO0oO(obj3);
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
            if (nanos + 1000 < 0) {
                String strConcat2 = strConcat.concat(" (plus ");
                long j2 = -nanos;
                long jConvert = timeUnit.convert(j2, TimeUnit.NANOSECONDS);
                long nanos2 = j2 - timeUnit.toNanos(jConvert);
                boolean z = true;
                if (jConvert != 0 && nanos2 <= 1000) {
                    z = false;
                }
                if (jConvert > 0) {
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
