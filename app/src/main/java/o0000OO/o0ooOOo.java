package o0000Oo;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import org.apache.tika.fork.ForkServer;

/* loaded from: classes2.dex */
public final class o0ooOOo extends FilterInputStream implements AutoCloseable {

    /* renamed from: OooOo */
    public final int f29476OooOo;

    /* renamed from: OooOo0O */
    public final ByteBuffer f29477OooOo0O;

    /* renamed from: OooOo0o */
    public final ByteBuffer f29478OooOo0o;

    /* renamed from: OooOoO */
    public boolean f29479OooOoO;

    /* renamed from: OooOoO0 */
    public boolean f29480OooOoO0;

    /* renamed from: OooOoOO */
    public boolean f29481OooOoOO;

    /* renamed from: OooOoo */
    public final byte[] f29482OooOoo;

    /* renamed from: OooOoo0 */
    public boolean f29483OooOoo0;

    /* renamed from: OooOooO */
    public int f29484OooOooO;

    /* renamed from: OooOooo */
    public final oo000o f29485OooOooo;

    /* renamed from: Oooo000 */
    public final int f29486Oooo000;

    /* renamed from: Oooo00O */
    public final int f29487Oooo00O;

    public o0ooOOo(o00O0O o00o0o, InputStream inputStream, byte[] bArr) {
        super(inputStream);
        this.f29485OooOooo = o00o0o.OooO0oO();
        this.f29476OooOo = o00o0o.OooO0o0();
        this.f29482OooOoo = Arrays.copyOf(bArr, bArr.length);
        int iOooO0Oo = o00o0o.OooO0Oo();
        this.f29486Oooo000 = iOooO0Oo;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(iOooO0Oo + 1);
        this.f29477OooOo0O = byteBufferAllocate;
        byteBufferAllocate.limit(0);
        this.f29487Oooo00O = iOooO0Oo - o00o0o.OooO0OO();
        ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(o00o0o.OooO0o() + 16);
        this.f29478OooOo0o = byteBufferAllocate2;
        byteBufferAllocate2.limit(0);
        this.f29480OooOoO0 = false;
        this.f29479OooOoO = false;
        this.f29481OooOoOO = false;
        this.f29484OooOooO = 0;
        this.f29483OooOoo0 = false;
    }

    public final void OooO00o() throws IOException {
        byte b;
        while (!this.f29479OooOoO && this.f29477OooOo0O.remaining() > 0) {
            int i = ((FilterInputStream) this).in.read(this.f29477OooOo0O.array(), this.f29477OooOo0O.position(), this.f29477OooOo0O.remaining());
            if (i > 0) {
                ByteBuffer byteBuffer = this.f29477OooOo0O;
                byteBuffer.position(byteBuffer.position() + i);
            } else if (i == -1) {
                this.f29479OooOoO = true;
            } else if (i == 0) {
                throw new IOException("Could not read bytes from the ciphertext stream");
            }
        }
        if (this.f29479OooOoO) {
            b = 0;
        } else {
            ByteBuffer byteBuffer2 = this.f29477OooOo0O;
            b = byteBuffer2.get(byteBuffer2.position() - 1);
            ByteBuffer byteBuffer3 = this.f29477OooOo0O;
            byteBuffer3.position(byteBuffer3.position() - 1);
        }
        this.f29477OooOo0O.flip();
        this.f29478OooOo0o.clear();
        try {
            this.f29485OooOooo.OooO0oO(this.f29477OooOo0O, this.f29484OooOooO, this.f29479OooOoO, this.f29478OooOo0o);
            this.f29484OooOooO++;
            this.f29478OooOo0o.flip();
            this.f29477OooOo0O.clear();
            if (this.f29479OooOoO) {
                return;
            }
            this.f29477OooOo0O.clear();
            this.f29477OooOo0O.limit(this.f29486Oooo000 + 1);
            this.f29477OooOo0O.put(b);
        } catch (GeneralSecurityException e) {
            this.f29483OooOoo0 = true;
            this.f29478OooOo0o.limit(0);
            throw new IOException(e.getMessage() + "\n" + toString() + "\nsegmentNr:" + this.f29484OooOooO + " endOfCiphertext:" + this.f29479OooOoO, e);
        }
    }

    public final void OooO0O0() throws IOException {
        if (this.f29480OooOoO0) {
            this.f29483OooOoo0 = true;
            this.f29478OooOo0o.limit(0);
            throw new IOException("Decryption failed.");
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(this.f29476OooOo);
        while (byteBufferAllocate.remaining() > 0) {
            int i = ((FilterInputStream) this).in.read(byteBufferAllocate.array(), byteBufferAllocate.position(), byteBufferAllocate.remaining());
            if (i == -1) {
                this.f29483OooOoo0 = true;
                this.f29478OooOo0o.limit(0);
                throw new IOException("Ciphertext is too short");
            }
            if (i == 0) {
                throw new IOException("Could not read bytes from the ciphertext stream");
            }
            byteBufferAllocate.position(byteBufferAllocate.position() + i);
        }
        byteBufferAllocate.flip();
        try {
            this.f29485OooOooo.OooO0O0(byteBufferAllocate, this.f29482OooOoo);
            this.f29480OooOoO0 = true;
        } catch (GeneralSecurityException e) {
            throw new IOException(e);
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int available() {
        return this.f29478OooOo0o.remaining();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        super.close();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i) {
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        byte[] bArr = new byte[1];
        int i = read(bArr, 0, 1);
        if (i == 1) {
            return bArr[0] & ForkServer.ERROR;
        }
        if (i == -1) {
            return i;
        }
        throw new IOException("Reading failed");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) {
        int i;
        long j2 = this.f29486Oooo000;
        if (j <= 0) {
            return 0L;
        }
        int iMin = (int) Math.min(j2, j);
        byte[] bArr = new byte[iMin];
        long j3 = j;
        while (j3 > 0 && (i = read(bArr, 0, (int) Math.min(iMin, j3))) > 0) {
            j3 -= i;
        }
        return j - j3;
    }

    public final synchronized String toString() {
        return "StreamingAeadDecryptingStream\nsegmentNr:" + this.f29484OooOooO + "\nciphertextSegmentSize:" + this.f29486Oooo000 + "\nheaderRead:" + this.f29480OooOoO0 + "\nendOfCiphertext:" + this.f29479OooOoO + "\nendOfPlaintext:" + this.f29481OooOoOO + "\ndecryptionErrorOccured:" + this.f29483OooOoo0 + "\nciphertextSgement position:" + this.f29477OooOo0O.position() + " limit:" + this.f29477OooOo0O.limit() + "\nplaintextSegment position:" + this.f29478OooOo0o.position() + " limit:" + this.f29478OooOo0o.limit();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read(byte[] bArr, int i, int i2) {
        try {
            if (!this.f29483OooOoo0) {
                if (!this.f29480OooOoO0) {
                    OooO0O0();
                    this.f29477OooOo0O.clear();
                    this.f29477OooOo0O.limit(this.f29487Oooo00O + 1);
                }
                if (this.f29481OooOoOO) {
                    return -1;
                }
                int i3 = 0;
                while (true) {
                    if (i3 >= i2) {
                        break;
                    }
                    if (this.f29478OooOo0o.remaining() == 0) {
                        if (this.f29479OooOoO) {
                            this.f29481OooOoOO = true;
                            break;
                        }
                        OooO00o();
                    }
                    int iMin = Math.min(this.f29478OooOo0o.remaining(), i2 - i3);
                    this.f29478OooOo0o.get(bArr, i3 + i, iMin);
                    i3 += iMin;
                }
                if (i3 == 0 && this.f29481OooOoOO) {
                    return -1;
                }
                return i3;
            }
            throw new IOException("Decryption failed.");
        } catch (Throwable th) {
            throw th;
        }
    }
}
