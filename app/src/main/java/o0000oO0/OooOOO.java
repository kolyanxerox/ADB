package o0000Oo0;

import java.io.IOException;
import java.io.InputStream;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import o00000oo.o0Oo0oo;

/* loaded from: classes2.dex */
public final class OooOOO extends InputStream implements AutoCloseable {

    /* renamed from: OooOo, reason: collision with root package name */
    public InputStream f29510OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public boolean f29511OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public InputStream f29512OooOo0o;

    /* renamed from: OooOoO, reason: collision with root package name */
    public byte[] f29513OooOoO;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public ArrayList f29514OooOoO0;

    @Override // java.io.InputStream
    public final synchronized int available() {
        InputStream inputStream = this.f29512OooOo0o;
        if (inputStream == null) {
            return 0;
        }
        return inputStream.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f29510OooOo.close();
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.InputStream
    public final synchronized int read() {
        byte[] bArr = new byte[1];
        if (read(bArr) != 1) {
            return -1;
        }
        return bArr[0];
    }

    @Override // java.io.InputStream
    public final synchronized int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final synchronized int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        InputStream inputStream = this.f29512OooOo0o;
        if (inputStream != null) {
            return inputStream.read(bArr, i, i2);
        }
        if (!this.f29511OooOo0O) {
            this.f29511OooOo0O = true;
            ArrayList arrayList = this.f29514OooOoO0;
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                try {
                    try {
                        InputStream inputStreamOooO0O0 = ((o0Oo0oo) obj).OooO0O0(this.f29510OooOo, this.f29513OooOoO);
                        int i4 = inputStreamOooO0O0.read(bArr, i, i2);
                        if (i4 != 0) {
                            this.f29512OooOo0o = inputStreamOooO0O0;
                            this.f29510OooOo.mark(0);
                            return i4;
                        }
                        throw new IOException("Could not read bytes from the ciphertext stream");
                    } catch (GeneralSecurityException unused) {
                        this.f29510OooOo.reset();
                    }
                } catch (IOException unused2) {
                    this.f29510OooOo.reset();
                }
            }
            throw new IOException("No matching key found for the ciphertext in the stream.");
        }
        throw new IOException("No matching key found for the ciphertext in the stream.");
    }
}
