package o00OOOoO;

import com.google.android.gms.internal.measurement.o0OOO0;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.OooOo;

/* loaded from: classes3.dex */
public final class o0000O0O implements o00 {

    /* renamed from: OooOo, reason: collision with root package name */
    public boolean f32557OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final o000Oo0 f32558OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public long f32559OooOo0o;

    public o0000O0O(o000Oo0 fileHandle) {
        OooOo.OooO0o0(fileHandle, "fileHandle");
        this.f32558OooOo0O = fileHandle;
        this.f32559OooOo0o = 0L;
    }

    @Override // o00OOOoO.o00
    public final void OooOO0(long j, o0000 o0000Var) {
        if (this.f32557OooOo) {
            throw new IllegalStateException("closed");
        }
        o000Oo0 o000oo02 = this.f32558OooOo0O;
        long j2 = this.f32559OooOo0o;
        o000oo02.getClass();
        o0OOO0.OooO0o0(o0000Var.f32535OooOo0o, 0L, j);
        long j3 = j2 + j;
        while (j2 < j3) {
            o000O o000o = o0000Var.f32534OooOo0O;
            OooOo.OooO0O0(o000o);
            int iMin = (int) Math.min(j3 - j2, o000o.f32565OooO0OO - o000o.f32564OooO0O0);
            byte[] array = o000o.f32563OooO00o;
            int i = o000o.f32564OooO0O0;
            synchronized (o000oo02) {
                OooOo.OooO0o0(array, "array");
                o000oo02.f32599OooOoO.seek(j2);
                o000oo02.f32599OooOoO.write(array, i, iMin);
            }
            int i2 = o000o.f32564OooO0O0 + iMin;
            o000o.f32564OooO0O0 = i2;
            long j4 = iMin;
            j2 += j4;
            o0000Var.f32535OooOo0o -= j4;
            if (i2 == o000o.f32565OooO0OO) {
                o0000Var.f32534OooOo0O = o000o.OooO00o();
                o000OO00.OooO00o(o000o);
            }
        }
        this.f32559OooOo0o += j;
    }

    @Override // o00OOOoO.o00, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f32557OooOo) {
            return;
        }
        this.f32557OooOo = true;
        o000Oo0 o000oo02 = this.f32558OooOo0O;
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

    @Override // o00OOOoO.o00, java.io.Flushable
    public final void flush() {
        if (this.f32557OooOo) {
            throw new IllegalStateException("closed");
        }
        o000Oo0 o000oo02 = this.f32558OooOo0O;
        synchronized (o000oo02) {
            o000oo02.f32599OooOoO.getFD().sync();
        }
    }

    @Override // o00OOOoO.o00
    public final o00O000 timeout() {
        return o00O000.f32601OooO0Oo;
    }
}
