package o00Oo00;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.apache.tika.fork.ForkServer;

/* loaded from: classes3.dex */
public final class OooOO0 extends InputStream implements AutoCloseable {

    /* renamed from: OooOo, reason: collision with root package name */
    public int f32660OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public volatile ByteArrayInputStream f32661OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public volatile byte[] f32662OooOo0o;

    /* renamed from: OooOoO, reason: collision with root package name */
    public int f32663OooOoO;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public int f32664OooOoO0;

    /* renamed from: OooOoOO, reason: collision with root package name */
    public int f32665OooOoOO;

    public final int OooO00o(ByteArrayInputStream byteArrayInputStream, byte[] bArr) throws IOException {
        int i = this.f32663OooOoO;
        if (i != -1) {
            int i2 = this.f32665OooOoOO - i;
            int i3 = this.f32664OooOoO0;
            if (i2 < i3) {
                if (i == 0 && i3 > bArr.length) {
                    int length = bArr.length * 2;
                    if (length <= i3) {
                        i3 = length;
                    }
                    byte[] bArr2 = new byte[i3];
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    this.f32662OooOo0o = bArr2;
                    bArr = bArr2;
                } else if (i > 0) {
                    System.arraycopy(bArr, i, bArr, 0, bArr.length - i);
                }
                int i4 = this.f32665OooOoOO - this.f32663OooOoO;
                this.f32665OooOoOO = i4;
                this.f32663OooOoO = 0;
                this.f32660OooOo = 0;
                int i5 = byteArrayInputStream.read(bArr, i4, bArr.length - i4);
                int i6 = this.f32665OooOoOO;
                if (i5 > 0) {
                    i6 += i5;
                }
                this.f32660OooOo = i6;
                return i5;
            }
        }
        int i7 = byteArrayInputStream.read(bArr);
        if (i7 > 0) {
            this.f32663OooOoO = -1;
            this.f32665OooOoOO = 0;
            this.f32660OooOo = i7;
        }
        return i7;
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        ByteArrayInputStream byteArrayInputStream = this.f32661OooOo0O;
        if (this.f32662OooOo0o == null || byteArrayInputStream == null) {
            throw new IOException("Stream is closed");
        }
        return byteArrayInputStream.available() + (this.f32660OooOo - this.f32665OooOoOO);
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f32662OooOo0o = null;
        ByteArrayInputStream byteArrayInputStream = this.f32661OooOo0O;
        this.f32661OooOo0O = null;
        if (byteArrayInputStream != null) {
            byteArrayInputStream.close();
        }
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        this.f32664OooOoO0 = i;
        this.f32663OooOoO = this.f32665OooOoOO;
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final void reset() throws IOException {
        if (this.f32662OooOo0o == null) {
            throw new IOException("Stream is closed");
        }
        int i = this.f32663OooOoO;
        if (-1 == i) {
            throw new IOException("Mark has been invalidated");
        }
        this.f32665OooOoOO = i;
    }

    @Override // java.io.InputStream
    public final long skip(long j) throws IOException {
        byte[] bArr = this.f32662OooOo0o;
        ByteArrayInputStream byteArrayInputStream = this.f32661OooOo0O;
        if (bArr == null) {
            throw new IOException("Stream is closed");
        }
        if (j < 1) {
            return 0L;
        }
        if (byteArrayInputStream == null) {
            throw new IOException("Stream is closed");
        }
        int i = this.f32660OooOo;
        int i2 = this.f32665OooOoOO;
        int i3 = i - i2;
        long j2 = i3;
        if (j2 >= j) {
            this.f32665OooOoOO = i2 + ((int) j);
            return j;
        }
        this.f32665OooOoOO = i;
        if (this.f32663OooOoO == -1 || j > this.f32664OooOoO0) {
            return byteArrayInputStream.skip(j - j2) + j2;
        }
        if (OooO00o(byteArrayInputStream, bArr) == -1) {
            return j2;
        }
        int i4 = this.f32660OooOo;
        int i5 = this.f32665OooOoOO;
        if (i4 - i5 >= j - j2) {
            this.f32665OooOoOO = (((int) j) - i3) + i5;
            return j;
        }
        this.f32665OooOoOO = i4;
        return r2 + i3;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        byte[] bArr = this.f32662OooOo0o;
        ByteArrayInputStream byteArrayInputStream = this.f32661OooOo0O;
        if (bArr == null || byteArrayInputStream == null) {
            throw new IOException("Stream is closed");
        }
        if (this.f32665OooOoOO < this.f32660OooOo || OooO00o(byteArrayInputStream, bArr) != -1) {
            if (bArr != this.f32662OooOo0o && (bArr = this.f32662OooOo0o) == null) {
                throw new IOException("Stream is closed");
            }
            int i = this.f32660OooOo;
            int i2 = this.f32665OooOoOO;
            if (i - i2 > 0) {
                this.f32665OooOoOO = i2 + 1;
                return bArr[i2] & ForkServer.ERROR;
            }
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0077 A[SYNTHETIC] */
    @Override // java.io.InputStream
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int read(byte[] r7, int r8, int r9) throws java.io.IOException {
        /*
            r6 = this;
            byte[] r0 = r6.f32662OooOo0o
            java.lang.String r1 = "Stream is closed"
            if (r0 == 0) goto L8e
            int r2 = r7.length
            int r2 = r2 - r9
            if (r8 > r2) goto L88
            if (r8 < 0) goto L88
            if (r9 < 0) goto L88
            if (r9 != 0) goto L12
            r7 = 0
            return r7
        L12:
            java.io.ByteArrayInputStream r2 = r6.f32661OooOo0O
            if (r2 == 0) goto L82
            int r3 = r6.f32665OooOoOO
            int r4 = r6.f32660OooOo
            if (r3 >= r4) goto L36
            int r4 = r4 - r3
            if (r4 < r9) goto L20
            r4 = r9
        L20:
            java.lang.System.arraycopy(r0, r3, r7, r8, r4)
            int r3 = r6.f32665OooOoOO
            int r3 = r3 + r4
            r6.f32665OooOoOO = r3
            if (r4 == r9) goto L35
            int r3 = r2.available()
            if (r3 != 0) goto L31
            goto L35
        L31:
            int r8 = r8 + r4
            int r3 = r9 - r4
            goto L37
        L35:
            return r4
        L36:
            r3 = r9
        L37:
            int r4 = r6.f32663OooOoO
            r5 = -1
            if (r4 != r5) goto L4a
            int r4 = r0.length
            if (r3 < r4) goto L4a
            int r4 = r2.read(r7, r8, r3)
            if (r4 != r5) goto L74
            if (r3 != r9) goto L48
            goto L52
        L48:
            int r9 = r9 - r3
            return r9
        L4a:
            int r4 = r6.OooO00o(r2, r0)
            if (r4 != r5) goto L55
            if (r3 != r9) goto L53
        L52:
            return r5
        L53:
            int r9 = r9 - r3
            return r9
        L55:
            byte[] r4 = r6.f32662OooOo0o
            if (r0 == r4) goto L64
            byte[] r0 = r6.f32662OooOo0o
            if (r0 == 0) goto L5e
            goto L64
        L5e:
            java.io.IOException r7 = new java.io.IOException
            r7.<init>(r1)
            throw r7
        L64:
            int r4 = r6.f32660OooOo
            int r5 = r6.f32665OooOoOO
            int r4 = r4 - r5
            if (r4 < r3) goto L6c
            r4 = r3
        L6c:
            java.lang.System.arraycopy(r0, r5, r7, r8, r4)
            int r5 = r6.f32665OooOoOO
            int r5 = r5 + r4
            r6.f32665OooOoOO = r5
        L74:
            int r3 = r3 - r4
            if (r3 != 0) goto L78
            return r9
        L78:
            int r5 = r2.available()
            if (r5 != 0) goto L80
            int r9 = r9 - r3
            return r9
        L80:
            int r8 = r8 + r4
            goto L37
        L82:
            java.io.IOException r7 = new java.io.IOException
            r7.<init>(r1)
            throw r7
        L88:
            java.lang.IndexOutOfBoundsException r7 = new java.lang.IndexOutOfBoundsException
            r7.<init>()
            throw r7
        L8e:
            java.io.IOException r7 = new java.io.IOException
            r7.<init>(r1)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: o00Oo00.OooOO0.read(byte[], int, int):int");
    }
}
