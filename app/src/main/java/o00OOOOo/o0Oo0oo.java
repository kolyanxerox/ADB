package o00OOOOo;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayDeque;

/* loaded from: classes3.dex */
public final class o0Oo0oo {

    /* renamed from: OooO */
    public final o0OOO0o f32501OooO;

    /* renamed from: OooO00o */
    public long f32502OooO00o = 0;

    /* renamed from: OooO0O0 */
    public long f32503OooO0O0;

    /* renamed from: OooO0OO */
    public final int f32504OooO0OO;

    /* renamed from: OooO0Oo */
    public final o00Oo0 f32505OooO0Oo;

    /* renamed from: OooO0o */
    public boolean f32506OooO0o;

    /* renamed from: OooO0o0 */
    public final ArrayDeque f32507OooO0o0;

    /* renamed from: OooO0oO */
    public final o0ooOOo f32508OooO0oO;

    /* renamed from: OooO0oo */
    public final o00oO0o f32509OooO0oo;

    /* renamed from: OooOO0 */
    public final o0OOO0o f32510OooOO0;

    /* renamed from: OooOO0O */
    public int f32511OooOO0O;

    public o0Oo0oo(int i, o00Oo0 o00oo0, boolean z, boolean z2, o00OOO0.o000oOoO o000oooo2) {
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f32507OooO0o0 = arrayDeque;
        this.f32501OooO = new o0OOO0o(this);
        this.f32510OooOO0 = new o0OOO0o(this);
        this.f32511OooOO0O = 0;
        if (o00oo0 == null) {
            throw new NullPointerException("connection == null");
        }
        this.f32504OooO0OO = i;
        this.f32505OooO0Oo = o00oo0;
        this.f32503OooO0O0 = o00oo0.f32474Oooo0o.OooO0o0();
        o0ooOOo o0ooooo = new o0ooOOo(this, o00oo0.f32475Oooo0o0.OooO0o0());
        this.f32508OooO0oO = o0ooooo;
        o00oO0o o00oo0o = new o00oO0o(this);
        this.f32509OooO0oo = o00oo0o;
        o0ooooo.f32519OooOoO = z2;
        o00oo0o.f32485OooOo = z;
        if (o000oooo2 != null) {
            arrayDeque.add(o000oooo2);
        }
        if (OooO0o() && o000oooo2 != null) {
            throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
        }
        if (!OooO0o() && o000oooo2 == null) {
            throw new IllegalStateException("remotely-initiated streams should have headers");
        }
    }

    public final void OooO() throws InterruptedException, InterruptedIOException {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void OooO00o() {
        /*
            r2 = this;
            monitor-enter(r2)
            o00OOOOo.o0ooOOo r0 = r2.f32508OooO0oO     // Catch: java.lang.Throwable -> L16
            boolean r1 = r0.f32519OooOoO     // Catch: java.lang.Throwable -> L16
            if (r1 != 0) goto L1a
            boolean r0 = r0.f32520OooOoO0     // Catch: java.lang.Throwable -> L16
            if (r0 == 0) goto L1a
            o00OOOOo.o00oO0o r0 = r2.f32509OooO0oo     // Catch: java.lang.Throwable -> L16
            boolean r1 = r0.f32485OooOo     // Catch: java.lang.Throwable -> L16
            if (r1 != 0) goto L18
            boolean r0 = r0.f32487OooOo0o     // Catch: java.lang.Throwable -> L16
            if (r0 == 0) goto L1a
            goto L18
        L16:
            r0 = move-exception
            goto L31
        L18:
            r0 = 1
            goto L1b
        L1a:
            r0 = 0
        L1b:
            boolean r1 = r2.OooO0oO()     // Catch: java.lang.Throwable -> L16
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L16
            if (r0 == 0) goto L27
            r0 = 6
            r2.OooO0OO(r0)
            return
        L27:
            if (r1 != 0) goto L30
            o00OOOOo.o00Oo0 r0 = r2.f32505OooO0Oo
            int r1 = r2.f32504OooO0OO
            r0.OooO0o(r1)
        L30:
            return
        L31:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L16
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o00OOOOo.o0Oo0oo.OooO00o():void");
    }

    public final void OooO0O0() throws IOException {
        o00oO0o o00oo0o = this.f32509OooO0oo;
        if (o00oo0o.f32487OooOo0o) {
            throw new IOException("stream closed");
        }
        if (o00oo0o.f32485OooOo) {
            throw new IOException("stream finished");
        }
        if (this.f32511OooOO0O != 0) {
            throw new o000000(this.f32511OooOO0O);
        }
    }

    public final void OooO0OO(int i) {
        if (OooO0Oo(i)) {
            this.f32505OooO0Oo.f32477Oooo0oo.OooO0oo(this.f32504OooO0OO, i);
        }
    }

    public final boolean OooO0Oo(int i) {
        synchronized (this) {
            try {
                if (this.f32511OooOO0O != 0) {
                    return false;
                }
                if (this.f32508OooO0oO.f32519OooOoO && this.f32509OooO0oo.f32485OooOo) {
                    return false;
                }
                this.f32511OooOO0O = i;
                notifyAll();
                this.f32505OooO0Oo.OooO0o(this.f32504OooO0OO);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean OooO0o() {
        return this.f32505OooO0Oo.f32458OooOo0O == ((this.f32504OooO0OO & 1) == 1);
    }

    public final o00oO0o OooO0o0() {
        synchronized (this) {
            try {
                if (!this.f32506OooO0o && !OooO0o()) {
                    throw new IllegalStateException("reply before requesting the sink");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.f32509OooO0oo;
    }

    public final synchronized boolean OooO0oO() {
        try {
            if (this.f32511OooOO0O != 0) {
                return false;
            }
            o0ooOOo o0ooooo = this.f32508OooO0oO;
            if (o0ooooo.f32519OooOoO || o0ooooo.f32520OooOoO0) {
                o00oO0o o00oo0o = this.f32509OooO0oo;
                if (o00oo0o.f32485OooOo || o00oo0o.f32487OooOo0o) {
                    if (this.f32506OooO0o) {
                        return false;
                    }
                }
            }
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void OooO0oo() {
        boolean zOooO0oO;
        synchronized (this) {
            this.f32508OooO0oO.f32519OooOoO = true;
            zOooO0oO = OooO0oO();
            notifyAll();
        }
        if (zOooO0oO) {
            return;
        }
        this.f32505OooO0Oo.OooO0o(this.f32504OooO0OO);
    }
}
