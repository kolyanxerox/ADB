package o00OOOoO;

import java.io.Closeable;
import java.io.RandomAccessFile;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes3.dex */
public final class o000Oo0 implements Closeable, AutoCloseable {

    /* renamed from: OooOo */
    public int f32596OooOo;

    /* renamed from: OooOo0O */
    public final boolean f32597OooOo0O;

    /* renamed from: OooOo0o */
    public boolean f32598OooOo0o;

    /* renamed from: OooOoO */
    public final RandomAccessFile f32599OooOoO;

    /* renamed from: OooOoO0 */
    public final ReentrantLock f32600OooOoO0 = new ReentrantLock();

    public o000Oo0(boolean z, RandomAccessFile randomAccessFile) {
        this.f32597OooOo0O = z;
        this.f32599OooOoO = randomAccessFile;
    }

    public static o0000O0O OooO00o(o000Oo0 o000oo02) {
        if (!o000oo02.f32597OooOo0O) {
            throw new IllegalStateException("file handle is read-only");
        }
        ReentrantLock reentrantLock = o000oo02.f32600OooOoO0;
        reentrantLock.lock();
        try {
            if (o000oo02.f32598OooOo0o) {
                throw new IllegalStateException("closed");
            }
            o000oo02.f32596OooOo++;
            reentrantLock.unlock();
            return new o0000O0O(o000oo02);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final long OooO0O0() {
        long length;
        ReentrantLock reentrantLock = this.f32600OooOoO0;
        reentrantLock.lock();
        try {
            if (this.f32598OooOo0o) {
                throw new IllegalStateException("closed");
            }
            synchronized (this) {
                length = this.f32599OooOoO.length();
            }
            return length;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final o000OO OooO0OO(long j) {
        ReentrantLock reentrantLock = this.f32600OooOoO0;
        reentrantLock.lock();
        try {
            if (this.f32598OooOo0o) {
                throw new IllegalStateException("closed");
            }
            this.f32596OooOo++;
            reentrantLock.unlock();
            return new o000OO(this, j);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ReentrantLock reentrantLock = this.f32600OooOoO0;
        reentrantLock.lock();
        try {
            if (this.f32598OooOo0o) {
                return;
            }
            this.f32598OooOo0o = true;
            if (this.f32596OooOo != 0) {
                return;
            }
            synchronized (this) {
                this.f32599OooOoO.close();
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void flush() {
        if (!this.f32597OooOo0O) {
            throw new IllegalStateException("file handle is read-only");
        }
        ReentrantLock reentrantLock = this.f32600OooOoO0;
        reentrantLock.lock();
        try {
            if (this.f32598OooOo0o) {
                throw new IllegalStateException("closed");
            }
            synchronized (this) {
                this.f32599OooOoO.getFD().sync();
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
