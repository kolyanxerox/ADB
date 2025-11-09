package o00OOOOo;

import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import o00OOOoO.o000O0O0;
import o00OOOoO.o000OO0O;

/* loaded from: classes3.dex */
public final class o00Oo0 implements Closeable, AutoCloseable {

    /* renamed from: OoooO0 */
    public static final ThreadPoolExecutor f32456OoooO0;

    /* renamed from: OooOo0O */
    public final boolean f32458OooOo0O;

    /* renamed from: OooOo0o */
    public final o000oOoO f32459OooOo0o;

    /* renamed from: OooOoO */
    public int f32460OooOoO;

    /* renamed from: OooOoO0 */
    public final String f32461OooOoO0;

    /* renamed from: OooOoOO */
    public int f32462OooOoOO;

    /* renamed from: OooOoo */
    public final ScheduledThreadPoolExecutor f32463OooOoo;

    /* renamed from: OooOoo0 */
    public boolean f32464OooOoo0;

    /* renamed from: OooOooO */
    public final ThreadPoolExecutor f32465OooOooO;

    /* renamed from: OooOooo */
    public final o000OOo f32466OooOooo;

    /* renamed from: Oooo */
    public final o00O0O f32467Oooo;

    /* renamed from: Oooo0OO */
    public long f32473Oooo0OO;

    /* renamed from: Oooo0o */
    public final OooO0oO.Oooo0 f32474Oooo0o;

    /* renamed from: Oooo0o0 */
    public final OooO0oO.Oooo0 f32475Oooo0o0;

    /* renamed from: Oooo0oO */
    public final Socket f32476Oooo0oO;

    /* renamed from: Oooo0oo */
    public final o0OO00O f32477Oooo0oo;

    /* renamed from: OoooO00 */
    public final LinkedHashSet f32478OoooO00;

    /* renamed from: OooOo */
    public final LinkedHashMap f32457OooOo = new LinkedHashMap();

    /* renamed from: Oooo000 */
    public long f32469Oooo000 = 0;

    /* renamed from: Oooo00O */
    public long f32470Oooo00O = 0;

    /* renamed from: Oooo00o */
    public long f32471Oooo00o = 0;

    /* renamed from: Oooo0 */
    public long f32468Oooo0 = 0;

    /* renamed from: Oooo0O0 */
    public long f32472Oooo0O0 = 0;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        SynchronousQueue synchronousQueue = new SynchronousQueue();
        byte[] bArr = o00OOO0O.OooO0OO.f32335OooO00o;
        f32456OoooO0 = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, timeUnit, synchronousQueue, new o00OOO0O.OooO0O0("OkHttp Http2Connection", true));
    }

    public o00Oo0(com.google.android.gms.common.api.internal.o0OoOo0 o0oooo0) {
        OooO0oO.Oooo0 oooo0 = new OooO0oO.Oooo0(13, (byte) 0);
        this.f32475Oooo0o0 = oooo0;
        OooO0oO.Oooo0 oooo02 = new OooO0oO.Oooo0(13, (byte) 0);
        this.f32474Oooo0o = oooo02;
        this.f32478OoooO00 = new LinkedHashSet();
        this.f32466OooOooo = o000OOo.f32451OooO00o;
        boolean z = o0oooo0.f16747OooOo0O;
        this.f32458OooOo0O = z;
        this.f32459OooOo0o = (o000oOoO) o0oooo0.f16751OooOoOO;
        int i = z ? 1 : 2;
        this.f32462OooOoOO = i;
        if (z) {
            this.f32462OooOoOO = i + 2;
        }
        if (z) {
            oooo0.OooO0oO(7, 16777216);
        }
        String str = (String) o0oooo0.f16746OooOo;
        this.f32461OooOoO0 = str;
        byte[] bArr = o00OOO0O.OooO0OO.f32335OooO00o;
        Locale locale = Locale.US;
        this.f32463OooOoo = new ScheduledThreadPoolExecutor(1, new o00OOO0O.OooO0O0(OooO0oO.OooOo.OooOO0O("OkHttp ", str, " Writer"), false));
        this.f32465OooOooO = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new o00OOO0O.OooO0O0(OooO0oO.OooOo.OooOO0O("OkHttp ", str, " Push Observer"), true));
        oooo02.OooO0oO(7, 65535);
        oooo02.OooO0oO(5, 16384);
        this.f32473Oooo0OO = oooo02.OooO0o0();
        this.f32476Oooo0oO = (Socket) o0oooo0.f16748OooOo0o;
        this.f32477Oooo0oo = new o0OO00O((o000OO0O) o0oooo0.f16749OooOoO, z);
        this.f32467Oooo = new o00O0O(this, new oo000o((o000O0O0) o0oooo0.f16750OooOoO0, z));
    }

    public final synchronized void OooO(long j) {
        long j2 = this.f32472Oooo0O0 + j;
        this.f32472Oooo0O0 = j2;
        if (j2 >= this.f32475Oooo0o0.OooO0o0() / 2) {
            OooOOO(0, this.f32472Oooo0O0);
            this.f32472Oooo0O0 = 0L;
        }
    }

    public final void OooO00o(int i, int i2) throws IOException {
        o0Oo0oo[] o0oo0ooArr = null;
        try {
            OooO0oo(i);
            e = null;
        } catch (IOException e) {
            e = e;
        }
        synchronized (this) {
            try {
                if (!this.f32457OooOo.isEmpty()) {
                    o0oo0ooArr = (o0Oo0oo[]) this.f32457OooOo.values().toArray(new o0Oo0oo[this.f32457OooOo.size()]);
                    this.f32457OooOo.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (o0oo0ooArr != null) {
            for (o0Oo0oo o0oo0oo : o0oo0ooArr) {
                try {
                    o0oo0oo.OooO0OO(i2);
                } catch (IOException e2) {
                    if (e != null) {
                        e = e2;
                    }
                }
            }
        }
        try {
            this.f32477Oooo0oo.close();
        } catch (IOException e3) {
            if (e == null) {
                e = e3;
            }
        }
        try {
            this.f32476Oooo0oO.close();
        } catch (IOException e4) {
            e = e4;
        }
        this.f32463OooOoo.shutdown();
        this.f32465OooOooO.shutdown();
        if (e != null) {
            throw e;
        }
    }

    public final void OooO0O0() {
        try {
            OooO00o(2, 2);
        } catch (IOException unused) {
        }
    }

    public final synchronized o0Oo0oo OooO0OO(int i) {
        return (o0Oo0oo) this.f32457OooOo.get(Integer.valueOf(i));
    }

    public final synchronized int OooO0Oo() {
        OooO0oO.Oooo0 oooo0;
        oooo0 = this.f32474Oooo0o;
        return (oooo0.f13285OooOo0o & 16) != 0 ? ((int[]) oooo0.f13283OooOo)[4] : Integer.MAX_VALUE;
    }

    public final synchronized o0Oo0oo OooO0o(int i) {
        o0Oo0oo o0oo0oo;
        o0oo0oo = (o0Oo0oo) this.f32457OooOo.remove(Integer.valueOf(i));
        notifyAll();
        return o0oo0oo;
    }

    public final synchronized void OooO0o0(o00OOO0O.OooO00o oooO00o) {
        if (!this.f32464OooOoo0) {
            this.f32465OooOooO.execute(oooO00o);
        }
    }

    public final void OooO0oo(int i) {
        synchronized (this.f32477Oooo0oo) {
            synchronized (this) {
                if (this.f32464OooOoo0) {
                    return;
                }
                this.f32464OooOoo0 = true;
                this.f32477Oooo0oo.OooO0Oo(o00OOO0O.OooO0OO.f32335OooO00o, this.f32460OooOoO, i);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0032, code lost:
    
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r4), r8.f32477Oooo0oo.f32498OooOoO0);
        r6 = r2;
        r8.f32473Oooo0OO -= r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void OooOO0O(int r9, boolean r10, o00OOOoO.o0000 r11, long r12) {
        /*
            r8 = this;
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            r3 = 0
            if (r2 != 0) goto Ld
            o00OOOOo.o0OO00O r12 = r8.f32477Oooo0oo
            r12.OooO0O0(r10, r9, r11, r3)
            return
        Ld:
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 <= 0) goto L65
            monitor-enter(r8)
        L12:
            long r4 = r8.f32473Oooo0OO     // Catch: java.lang.Throwable -> L28 java.lang.InterruptedException -> L56
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 > 0) goto L32
            java.util.LinkedHashMap r2 = r8.f32457OooOo     // Catch: java.lang.Throwable -> L28 java.lang.InterruptedException -> L56
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L28 java.lang.InterruptedException -> L56
            boolean r2 = r2.containsKey(r4)     // Catch: java.lang.Throwable -> L28 java.lang.InterruptedException -> L56
            if (r2 == 0) goto L2a
            r8.wait()     // Catch: java.lang.Throwable -> L28 java.lang.InterruptedException -> L56
            goto L12
        L28:
            r9 = move-exception
            goto L63
        L2a:
            java.io.IOException r9 = new java.io.IOException     // Catch: java.lang.Throwable -> L28 java.lang.InterruptedException -> L56
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L28 java.lang.InterruptedException -> L56
            throw r9     // Catch: java.lang.Throwable -> L28 java.lang.InterruptedException -> L56
        L32:
            long r4 = java.lang.Math.min(r12, r4)     // Catch: java.lang.Throwable -> L28
            int r2 = (int) r4     // Catch: java.lang.Throwable -> L28
            o00OOOOo.o0OO00O r4 = r8.f32477Oooo0oo     // Catch: java.lang.Throwable -> L28
            int r4 = r4.f32498OooOoO0     // Catch: java.lang.Throwable -> L28
            int r2 = java.lang.Math.min(r2, r4)     // Catch: java.lang.Throwable -> L28
            long r4 = r8.f32473Oooo0OO     // Catch: java.lang.Throwable -> L28
            long r6 = (long) r2     // Catch: java.lang.Throwable -> L28
            long r4 = r4 - r6
            r8.f32473Oooo0OO = r4     // Catch: java.lang.Throwable -> L28
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L28
            long r12 = r12 - r6
            o00OOOOo.o0OO00O r4 = r8.f32477Oooo0oo
            if (r10 == 0) goto L51
            int r5 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r5 != 0) goto L51
            r5 = 1
            goto L52
        L51:
            r5 = r3
        L52:
            r4.OooO0O0(r5, r9, r11, r2)
            goto Ld
        L56:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L28
            r9.interrupt()     // Catch: java.lang.Throwable -> L28
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L28
            r9.<init>()     // Catch: java.lang.Throwable -> L28
            throw r9     // Catch: java.lang.Throwable -> L28
        L63:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L28
            throw r9
        L65:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o00OOOOo.o00Oo0.OooOO0O(int, boolean, o00OOOoO.o0000, long):void");
    }

    public final void OooOOO(int i, long j) {
        try {
            this.f32463OooOoo.execute(new OooOOOO(this, new Object[]{this.f32461OooOoO0, Integer.valueOf(i)}, i, j));
        } catch (RejectedExecutionException unused) {
        }
    }

    public final void OooOOO0(int i, int i2) {
        try {
            this.f32463OooOoo.execute(new OooOOO(this, new Object[]{this.f32461OooOoO0, Integer.valueOf(i)}, i, i2));
        } catch (RejectedExecutionException unused) {
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        OooO00o(1, 6);
    }

    public final void flush() {
        this.f32477Oooo0oo.flush();
    }
}
