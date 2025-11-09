package o00Oo00;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import o000o00o.o00000O0;
import o00OOooO.o00O00;
import o00Oo000.o0Oo0oo;
import o00Oo000.oo0o0Oo;

/* loaded from: classes3.dex */
public abstract class OooO0OO extends FilterInputStream implements AutoCloseable {
    private final oo0o0Oo afterRead;
    private boolean closed;
    private final o0Oo0oo exceptionHandler;

    public OooO0OO(InputStream inputStream) {
        super(inputStream);
        this.exceptionHandler = new o00000O0(7);
        this.afterRead = oo0o0Oo.OooOo0;
    }

    public void afterRead(int i) {
        this.afterRead.getClass();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() throws IOException {
        if (((FilterInputStream) this).in == null || isClosed()) {
            return 0;
        }
        try {
            return ((FilterInputStream) this).in.available();
        } catch (IOException e) {
            handleIOException(e);
            return 0;
        }
    }

    public void checkOpen() throws IOException {
        if (isClosed()) {
            throw new IOException("Closed");
        }
    }

    public void handleIOException(IOException iOException) {
        this.exceptionHandler.accept(iOException);
    }

    public boolean isClosed() {
        return this.closed;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i) {
        if (((FilterInputStream) this).in != null) {
            ((FilterInputStream) this).in.mark(i);
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return ((FilterInputStream) this).in != null && ((FilterInputStream) this).in.markSupported();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        int i = 1;
        try {
            beforeRead(1);
            int i2 = ((FilterInputStream) this).in.read();
            if (i2 == -1) {
                i = -1;
            }
            afterRead(i);
            return i2;
        } catch (IOException e) {
            handleIOException(e);
            return -1;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() {
        try {
            ((FilterInputStream) this).in.reset();
        } catch (IOException e) {
            handleIOException(e);
        }
    }

    public OooO0OO setReference(InputStream inputStream) {
        ((FilterInputStream) this).in = inputStream;
        return this;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) {
        try {
            return ((FilterInputStream) this).in.skip(j);
        } catch (IOException e) {
            handleIOException(e);
            return 0L;
        }
    }

    public InputStream unwrap() {
        return ((FilterInputStream) this).in;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        try {
            byte[] bArr2 = o00O00.f32641OooO00o;
            beforeRead(bArr == null ? 0 : bArr.length);
            int i = ((FilterInputStream) this).in.read(bArr);
            afterRead(i);
            return i;
        } catch (IOException e) {
            handleIOException(e);
            return -1;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        try {
            beforeRead(i2);
            int i3 = ((FilterInputStream) this).in.read(bArr, i, i2);
            afterRead(i3);
            return i3;
        } catch (IOException e) {
            handleIOException(e);
            return -1;
        }
    }

    public void beforeRead(int i) throws IOException {
    }
}
