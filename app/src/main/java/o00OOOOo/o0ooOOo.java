package o00OOOOo;

import o00OOOoO.o0000;
import o00OOOoO.o00O000;
import o00OOOoO.o0O0ooO;

/* loaded from: classes3.dex */
public final class o0ooOOo implements o0O0ooO {

    /* renamed from: OooOo */
    public final long f32516OooOo;

    /* renamed from: OooOo0O */
    public final o0000 f32517OooOo0O = new o0000();

    /* renamed from: OooOo0o */
    public final o0000 f32518OooOo0o = new o0000();

    /* renamed from: OooOoO */
    public boolean f32519OooOoO;

    /* renamed from: OooOoO0 */
    public boolean f32520OooOoO0;

    /* renamed from: OooOoOO */
    public final /* synthetic */ o0Oo0oo f32521OooOoOO;

    public o0ooOOo(o0Oo0oo o0oo0oo, long j) {
        this.f32521OooOoOO = o0oo0oo;
        this.f32516OooOo = j;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x008a  */
    @Override // o00OOOoO.o0O0ooO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long OooO0oO(long r13, o00OOOoO.o0000 r15) throws o00OOOOo.o000000 {
        /*
            r12 = this;
            r0 = 0
            int r2 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r2 < 0) goto Lad
        L6:
            o00OOOOo.o0Oo0oo r2 = r12.f32521OooOoOO
            monitor-enter(r2)
            o00OOOOo.o0Oo0oo r3 = r12.f32521OooOoOO     // Catch: java.lang.Throwable -> L7b
            o00OOOOo.o0OOO0o r3 = r3.f32501OooO     // Catch: java.lang.Throwable -> L7b
            r3.OooO0oo()     // Catch: java.lang.Throwable -> L7b
            o00OOOOo.o0Oo0oo r3 = r12.f32521OooOoOO     // Catch: java.lang.Throwable -> L2a
            int r4 = r3.f32511OooOO0O     // Catch: java.lang.Throwable -> L2a
            if (r4 == 0) goto L17
            goto L18
        L17:
            r4 = 0
        L18:
            boolean r5 = r12.f32520OooOoO0     // Catch: java.lang.Throwable -> L2a
            if (r5 != 0) goto L9b
            java.util.ArrayDeque r3 = r3.f32507OooO0o0     // Catch: java.lang.Throwable -> L2a
            boolean r3 = r3.isEmpty()     // Catch: java.lang.Throwable -> L2a
            if (r3 != 0) goto L2d
            o00OOOOo.o0Oo0oo r3 = r12.f32521OooOoOO     // Catch: java.lang.Throwable -> L2a
            r3.getClass()     // Catch: java.lang.Throwable -> L2a
            goto L2d
        L2a:
            r13 = move-exception
            goto La3
        L2d:
            o00OOOoO.o0000 r3 = r12.f32518OooOo0o     // Catch: java.lang.Throwable -> L2a
            long r5 = r3.f32535OooOo0o     // Catch: java.lang.Throwable -> L2a
            int r7 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            r8 = -1
            if (r7 <= 0) goto L67
            long r13 = java.lang.Math.min(r13, r5)     // Catch: java.lang.Throwable -> L2a
            long r13 = r3.OooO0oO(r13, r15)     // Catch: java.lang.Throwable -> L2a
            o00OOOOo.o0Oo0oo r15 = r12.f32521OooOoOO     // Catch: java.lang.Throwable -> L2a
            long r5 = r15.f32502OooO00o     // Catch: java.lang.Throwable -> L2a
            long r5 = r5 + r13
            r15.f32502OooO00o = r5     // Catch: java.lang.Throwable -> L2a
            if (r4 != 0) goto L7e
            o00OOOOo.o00Oo0 r15 = r15.f32505OooO0Oo     // Catch: java.lang.Throwable -> L2a
            OooO0oO.Oooo0 r15 = r15.f32475Oooo0o0     // Catch: java.lang.Throwable -> L2a
            int r15 = r15.OooO0o0()     // Catch: java.lang.Throwable -> L2a
            int r15 = r15 / 2
            long r10 = (long) r15     // Catch: java.lang.Throwable -> L2a
            int r15 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r15 < 0) goto L7e
            o00OOOOo.o0Oo0oo r15 = r12.f32521OooOoOO     // Catch: java.lang.Throwable -> L2a
            o00OOOOo.o00Oo0 r3 = r15.f32505OooO0Oo     // Catch: java.lang.Throwable -> L2a
            int r5 = r15.f32504OooO0OO     // Catch: java.lang.Throwable -> L2a
            long r6 = r15.f32502OooO00o     // Catch: java.lang.Throwable -> L2a
            r3.OooOOO(r5, r6)     // Catch: java.lang.Throwable -> L2a
            o00OOOOo.o0Oo0oo r15 = r12.f32521OooOoOO     // Catch: java.lang.Throwable -> L2a
            r15.f32502OooO00o = r0     // Catch: java.lang.Throwable -> L2a
            goto L7e
        L67:
            boolean r3 = r12.f32519OooOoO     // Catch: java.lang.Throwable -> L2a
            if (r3 != 0) goto L7d
            if (r4 != 0) goto L7d
            o00OOOOo.o0Oo0oo r3 = r12.f32521OooOoOO     // Catch: java.lang.Throwable -> L2a
            r3.OooO()     // Catch: java.lang.Throwable -> L2a
            o00OOOOo.o0Oo0oo r3 = r12.f32521OooOoOO     // Catch: java.lang.Throwable -> L7b
            o00OOOOo.o0OOO0o r3 = r3.f32501OooO     // Catch: java.lang.Throwable -> L7b
            r3.OooOO0O()     // Catch: java.lang.Throwable -> L7b
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L7b
            goto L6
        L7b:
            r13 = move-exception
            goto Lab
        L7d:
            r13 = r8
        L7e:
            o00OOOOo.o0Oo0oo r15 = r12.f32521OooOoOO     // Catch: java.lang.Throwable -> L7b
            o00OOOOo.o0OOO0o r15 = r15.f32501OooO     // Catch: java.lang.Throwable -> L7b
            r15.OooOO0O()     // Catch: java.lang.Throwable -> L7b
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L7b
            int r15 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
            if (r15 == 0) goto L92
            o00OOOOo.o0Oo0oo r15 = r12.f32521OooOoOO
            o00OOOOo.o00Oo0 r15 = r15.f32505OooO0Oo
            r15.OooO(r13)
            return r13
        L92:
            if (r4 != 0) goto L95
            return r8
        L95:
            o00OOOOo.o000000 r13 = new o00OOOOo.o000000
            r13.<init>(r4)
            throw r13
        L9b:
            java.io.IOException r13 = new java.io.IOException     // Catch: java.lang.Throwable -> L2a
            java.lang.String r14 = "stream closed"
            r13.<init>(r14)     // Catch: java.lang.Throwable -> L2a
            throw r13     // Catch: java.lang.Throwable -> L2a
        La3:
            o00OOOOo.o0Oo0oo r14 = r12.f32521OooOoOO     // Catch: java.lang.Throwable -> L7b
            o00OOOOo.o0OOO0o r14 = r14.f32501OooO     // Catch: java.lang.Throwable -> L7b
            r14.OooOO0O()     // Catch: java.lang.Throwable -> L7b
            throw r13     // Catch: java.lang.Throwable -> L7b
        Lab:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L7b
            throw r13
        Lad:
            java.lang.IllegalArgumentException r15 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "byteCount < 0: "
            java.lang.String r13 = OooO0oO.OooOo.OooO0oo(r13, r0)
            r15.<init>(r13)
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: o00OOOOo.o0ooOOo.OooO0oO(long, o00OOOoO.o0000):long");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long j;
        synchronized (this.f32521OooOoOO) {
            try {
                this.f32520OooOoO0 = true;
                o0000 o0000Var = this.f32518OooOo0o;
                j = o0000Var.f32535OooOo0o;
                o0000Var.skip(j);
                if (!this.f32521OooOoOO.f32507OooO0o0.isEmpty()) {
                    this.f32521OooOoOO.getClass();
                }
                this.f32521OooOoOO.notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (j > 0) {
            this.f32521OooOoOO.f32505OooO0Oo.OooO(j);
        }
        this.f32521OooOoOO.OooO00o();
    }

    @Override // o00OOOoO.o0O0ooO
    public final o00O000 timeout() {
        return this.f32521OooOoOO.f32501OooO;
    }
}
