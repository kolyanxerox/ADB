package o00Oo00o;

import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import o00OOooO.o00O00;

/* loaded from: classes3.dex */
public final class o0OoOo0 extends OutputStream implements AutoCloseable {

    /* renamed from: OooOoOO, reason: collision with root package name */
    public static final /* synthetic */ int f32678OooOoOO = 0;

    /* renamed from: OooOo, reason: collision with root package name */
    public byte[] f32679OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final ArrayList f32680OooOo0O = new ArrayList();

    /* renamed from: OooOo0o, reason: collision with root package name */
    public int f32681OooOo0o;

    /* renamed from: OooOoO, reason: collision with root package name */
    public int f32682OooOoO;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public int f32683OooOoO0;

    public o0OoOo0() {
        OooO00o(8192);
    }

    public final void OooO00o(int i) {
        int i2 = this.f32683OooOoO0;
        ArrayList arrayList = this.f32680OooOo0O;
        if (i2 < arrayList.size() - 1) {
            this.f32682OooOoO += this.f32679OooOo.length;
            int i3 = this.f32683OooOoO0 + 1;
            this.f32683OooOoO0 = i3;
            this.f32679OooOo = (byte[]) arrayList.get(i3);
            return;
        }
        byte[] bArr = this.f32679OooOo;
        if (bArr == null) {
            this.f32682OooOoO = 0;
        } else {
            i = Math.max(bArr.length << 1, i - this.f32682OooOoO);
            this.f32682OooOoO += this.f32679OooOo.length;
        }
        this.f32683OooOoO0++;
        byte[] bArr2 = o00O00.f32641OooO00o;
        byte[] bArr3 = new byte[i];
        this.f32679OooOo = bArr3;
        arrayList.add(bArr3);
    }

    public final byte[] OooO0O0() {
        int i = this.f32681OooOo0o;
        if (i == 0) {
            return o00O00.f32641OooO00o;
        }
        byte[] bArr = o00O00.f32641OooO00o;
        byte[] bArr2 = new byte[i];
        ArrayList arrayList = this.f32680OooOo0O;
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            byte[] bArr3 = (byte[]) obj;
            int iMin = Math.min(bArr3.length, i);
            System.arraycopy(bArr3, 0, bArr2, i2, iMin);
            i2 += iMin;
            i -= iMin;
            if (i == 0) {
                break;
            }
        }
        return bArr2;
    }

    public final String toString() {
        return new String(OooO0O0(), Charset.defaultCharset());
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        int i3;
        if (i < 0 || i > bArr.length || i2 < 0 || (i3 = i + i2) > bArr.length || i3 < 0) {
            throw new IndexOutOfBoundsException(String.format("offset=%,d, length=%,d", Integer.valueOf(i), Integer.valueOf(i2)));
        }
        if (i2 == 0) {
            return;
        }
        int i4 = this.f32681OooOo0o;
        int i5 = i4 + i2;
        int i6 = i4 - this.f32682OooOoO;
        while (i2 > 0) {
            int iMin = Math.min(i2, this.f32679OooOo.length - i6);
            System.arraycopy(bArr, i3 - i2, this.f32679OooOo, i6, iMin);
            i2 -= iMin;
            if (i2 > 0) {
                OooO00o(i5);
                i6 = 0;
            }
        }
        this.f32681OooOo0o = i5;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        int i2 = this.f32681OooOo0o;
        int i3 = i2 - this.f32682OooOoO;
        if (i3 == this.f32679OooOo.length) {
            OooO00o(i2 + 1);
            i3 = 0;
        }
        this.f32679OooOo[i3] = (byte) i;
        this.f32681OooOo0o++;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
