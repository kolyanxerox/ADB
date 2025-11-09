package o000OOO;

import java.io.OutputStream;

/* loaded from: classes2.dex */
public final class OooO0O0 extends OutputStream {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public long f30244OooOo0O;

    @Override // java.io.OutputStream
    public final void write(int i) {
        this.f30244OooOo0O++;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        this.f30244OooOo0O += bArr.length;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        int i3;
        if (i >= 0 && i <= bArr.length && i2 >= 0 && (i3 = i + i2) <= bArr.length && i3 >= 0) {
            this.f30244OooOo0O += i2;
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
