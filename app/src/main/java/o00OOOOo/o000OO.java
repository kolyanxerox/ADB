package o00OOOoO;

import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.OooOo;

/* loaded from: classes3.dex */
public final class o000OO implements o0O0ooO {

    /* renamed from: OooOo, reason: collision with root package name */
    public boolean f32585OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final o000Oo0 f32586OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public long f32587OooOo0o;

    public o000OO(o000Oo0 fileHandle, long j) {
        OooOo.OooO0o0(fileHandle, "fileHandle");
        this.f32586OooOo0O = fileHandle;
        this.f32587OooOo0o = j;
    }

    @Override // o00OOOoO.o0O0ooO
    public final long OooO0oO(long j, o0000 sink) {
        long j2;
        long j3;
        int i;
        OooOo.OooO0o0(sink, "sink");
        if (this.f32585OooOo) {
            throw new IllegalStateException("closed");
        }
        o000Oo0 o000oo02 = this.f32586OooOo0O;
        long j4 = this.f32587OooOo0o;
        o000oo02.getClass();
        if (j < 0) {
            throw new IllegalArgumentException(OooO0oO.OooOo.OooO0oo(j, "byteCount < 0: ").toString());
        }
        long j5 = j + j4;
        long j6 = j4;
        while (true) {
            if (j6 >= j5) {
                j2 = -1;
                break;
            }
            o000O o000oOooO0o0 = sink.OooO0o0(1);
            byte[] array = o000oOooO0o0.f32563OooO00o;
            int i2 = o000oOooO0o0.f32565OooO0OO;
            j2 = -1;
            int iMin = (int) Math.min(j5 - j6, 8192 - i2);
            synchronized (o000oo02) {
                OooOo.OooO0o0(array, "array");
                o000oo02.f32599OooOoO.seek(j6);
                i = 0;
                while (true) {
                    if (i >= iMin) {
                        break;
                    }
                    int i3 = o000oo02.f32599OooOoO.read(array, i2, iMin - i);
                    if (i3 != -1) {
                        i += i3;
                    } else if (i == 0) {
                        i = -1;
                    }
                }
            }
            if (i == -1) {
                if (o000oOooO0o0.f32564OooO0O0 == o000oOooO0o0.f32565OooO0OO) {
                    sink.f32534OooOo0O = o000oOooO0o0.OooO00o();
                    o000OO00.OooO00o(o000oOooO0o0);
                }
                if (j4 == j6) {
                    j3 = -1;
                }
            } else {
                o000oOooO0o0.f32565OooO0OO += i;
                long j7 = i;
                j6 += j7;
                sink.f32535OooOo0o += j7;
            }
        }
        j3 = j6 - j4;
        if (j3 != j2) {
            this.f32587OooOo0o += j3;
        }
        return j3;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f32585OooOo) {
            return;
        }
        this.f32585OooOo = true;
        o000Oo0 o000oo02 = this.f32586OooOo0O;
        ReentrantLock reentrantLock = o000oo02.f32600OooOoO0;
        reentrantLock.lock();
        try {
            int i = o000oo02.f32596OooOo - 1;
            o000oo02.f32596OooOo = i;
            if (i == 0) {
                if (o000oo02.f32598OooOo0o) {
                    synchronized (o000oo02) {
                        o000oo02.f32599OooOoO.close();
                    }
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // o00OOOoO.o0O0ooO
    public final o00O000 timeout() {
        return o00O000.f32601OooO0Oo;
    }
}
