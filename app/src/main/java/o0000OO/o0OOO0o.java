package o0000Oo;

import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class o0OOO0o extends FilterOutputStream implements AutoCloseable {

    /* renamed from: OooOo */
    public final ByteBuffer f29471OooOo;

    /* renamed from: OooOo0O */
    public final o00oO0o f29472OooOo0O;

    /* renamed from: OooOo0o */
    public final int f29473OooOo0o;

    /* renamed from: OooOoO */
    public boolean f29474OooOoO;

    /* renamed from: OooOoO0 */
    public final ByteBuffer f29475OooOoO0;

    public o0OOO0o(o00O0O o00o0o, FileOutputStream fileOutputStream, byte[] bArr) throws IOException {
        super(fileOutputStream);
        o00oO0o o00oo0oOooO0oo = o00o0o.OooO0oo(bArr);
        this.f29472OooOo0O = o00oo0oOooO0oo;
        int iOooO0o = o00o0o.OooO0o();
        this.f29473OooOo0o = iOooO0o;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(iOooO0o);
        this.f29471OooOo = byteBufferAllocate;
        this.f29475OooOoO0 = ByteBuffer.allocate(o00o0o.OooO0Oo());
        byteBufferAllocate.limit(iOooO0o - o00o0o.OooO0OO());
        ByteBuffer byteBufferOooO00o = o00oo0oOooO0oo.OooO00o();
        byte[] bArr2 = new byte[byteBufferOooO00o.remaining()];
        byteBufferOooO00o.get(bArr2);
        ((FilterOutputStream) this).out.write(bArr2);
        this.f29474OooOoO = true;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f29474OooOoO) {
            try {
                this.f29471OooOo.flip();
                this.f29475OooOoO0.clear();
                this.f29472OooOo0O.OooO0OO(this.f29471OooOo, this.f29475OooOoO0);
                this.f29475OooOoO0.flip();
                ((FilterOutputStream) this).out.write(this.f29475OooOoO0.array(), this.f29475OooOoO0.position(), this.f29475OooOoO0.remaining());
                this.f29474OooOoO = false;
                super.close();
            } catch (GeneralSecurityException e) {
                throw new IOException("ptBuffer.remaining():" + this.f29471OooOo.remaining() + " ctBuffer.remaining():" + this.f29475OooOoO0.remaining(), e);
            }
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i) {
        write(new byte[]{(byte) i}, 0, 1);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i, int i2) {
        try {
            if (this.f29474OooOoO) {
                while (i2 > this.f29471OooOo.remaining()) {
                    int iRemaining = this.f29471OooOo.remaining();
                    ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr, i, iRemaining);
                    i += iRemaining;
                    i2 -= iRemaining;
                    try {
                        this.f29471OooOo.flip();
                        this.f29475OooOoO0.clear();
                        this.f29472OooOo0O.OooO0O0(this.f29471OooOo, byteBufferWrap, this.f29475OooOoO0);
                        this.f29475OooOoO0.flip();
                        ((FilterOutputStream) this).out.write(this.f29475OooOoO0.array(), this.f29475OooOoO0.position(), this.f29475OooOoO0.remaining());
                        this.f29471OooOo.clear();
                        this.f29471OooOo.limit(this.f29473OooOo0o);
                    } catch (GeneralSecurityException e) {
                        throw new IOException(e);
                    }
                }
                this.f29471OooOo.put(bArr, i, i2);
            } else {
                throw new IOException("Trying to write to closed stream");
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
