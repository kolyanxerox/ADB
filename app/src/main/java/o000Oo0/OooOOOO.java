package o000Oo0;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes2.dex */
public final class OooOOOO extends InputStream {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ OooOo f30349OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public int f30350OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public int f30351OooOo0o;

    public OooOOOO(OooOo oooOo, OooOOO oooOOO) {
        this.f30349OooOo = oooOo;
        this.f30350OooOo0O = oooOo.OooOOO(oooOOO.f30345OooO00o + 4);
        this.f30351OooOo0o = oooOOO.f30346OooO0O0;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (bArr == null) {
            throw new NullPointerException("buffer");
        }
        if ((i | i2) < 0 || i2 > bArr.length - i) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i3 = this.f30351OooOo0o;
        if (i3 <= 0) {
            return -1;
        }
        if (i2 > i3) {
            i2 = i3;
        }
        int i4 = this.f30350OooOo0O;
        OooOo oooOo = this.f30349OooOo;
        oooOo.OooO(i4, bArr, i, i2);
        this.f30350OooOo0O = oooOo.OooOOO(this.f30350OooOo0O + i2);
        this.f30351OooOo0o -= i2;
        return i2;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        if (this.f30351OooOo0o == 0) {
            return -1;
        }
        OooOo oooOo = this.f30349OooOo;
        oooOo.f30354OooOo0O.seek(this.f30350OooOo0O);
        int i = oooOo.f30354OooOo0O.read();
        this.f30350OooOo0O = oooOo.OooOOO(this.f30350OooOo0O + 1);
        this.f30351OooOo0o--;
        return i;
    }
}
