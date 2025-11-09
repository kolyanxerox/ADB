package o00OOOoO;

import com.google.android.gms.internal.measurement.o0OOO0;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import kotlin.jvm.internal.OooOo;
import o00O0.OooOOO;
import o00OOoo.Oooo000;

/* loaded from: classes3.dex */
public final class o000OOo0 extends o0000O0 {

    /* renamed from: OooOoO */
    public final transient byte[][] f32594OooOoO;

    /* renamed from: OooOoOO */
    public final transient int[] f32595OooOoOO;

    public o000OOo0(byte[][] bArr, int[] iArr) {
        super(o0000O0.f32553OooOoO0.f32555OooOo0O);
        this.f32594OooOoO = bArr;
        this.f32595OooOoOO = iArr;
    }

    @Override // o00OOOoO.o0000O0
    public final byte[] OooO() {
        return OooOo0();
    }

    @Override // o00OOOoO.o0000O0
    public final o0000O0 OooO0OO(String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        byte[][] bArr = this.f32594OooOoO;
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr = this.f32595OooOoOO;
            int i3 = iArr[length + i];
            int i4 = iArr[i];
            messageDigest.update(bArr[i], i3, i4 - i2);
            i++;
            i2 = i4;
        }
        byte[] digestBytes = messageDigest.digest();
        OooOo.OooO0Oo(digestBytes, "digestBytes");
        return new o0000O0(digestBytes);
    }

    @Override // o00OOOoO.o0000O0
    public final String OooO0o() {
        return OooOo0O().OooO0o();
    }

    @Override // o00OOOoO.o0000O0
    public final int OooO0o0() {
        return this.f32595OooOoOO[this.f32594OooOoO.length - 1];
    }

    @Override // o00OOOoO.o0000O0
    public final int OooO0oO(byte[] other, int i) {
        OooOo.OooO0o0(other, "other");
        return OooOo0O().OooO0oO(other, i);
    }

    @Override // o00OOOoO.o0000O0
    public final byte OooOO0(int i) {
        byte[][] bArr = this.f32594OooOoO;
        int length = bArr.length - 1;
        int[] iArr = this.f32595OooOoOO;
        o0OOO0.OooO0o0(iArr[length], i, 1L);
        int iOooO0oO = Oooo000.OooO0oO(this, i);
        return bArr[iOooO0oO][(i - (iOooO0oO == 0 ? 0 : iArr[iOooO0oO - 1])) + iArr[bArr.length + iOooO0oO]];
    }

    @Override // o00OOOoO.o0000O0
    public final int OooOO0O(byte[] other) {
        OooOo.OooO0o0(other, "other");
        return OooOo0O().OooOO0O(other);
    }

    @Override // o00OOOoO.o0000O0
    public final boolean OooOOO(int i, o0000O0 other, int i2) {
        OooOo.OooO0o0(other, "other");
        if (i >= 0 && i <= OooO0o0() - i2) {
            int i3 = i2 + i;
            int iOooO0oO = Oooo000.OooO0oO(this, i);
            int i4 = 0;
            while (i < i3) {
                int[] iArr = this.f32595OooOoOO;
                int i5 = iOooO0oO == 0 ? 0 : iArr[iOooO0oO - 1];
                int i6 = iArr[iOooO0oO] - i5;
                byte[][] bArr = this.f32594OooOoO;
                int i7 = iArr[bArr.length + iOooO0oO];
                int iMin = Math.min(i3, i6 + i5) - i;
                if (other.OooOOOO(i4, bArr[iOooO0oO], (i - i5) + i7, iMin)) {
                    i4 += iMin;
                    i += iMin;
                    iOooO0oO++;
                }
            }
            return true;
        }
        return false;
    }

    @Override // o00OOOoO.o0000O0
    public final boolean OooOOOO(int i, byte[] other, int i2, int i3) {
        OooOo.OooO0o0(other, "other");
        if (i < 0 || i > OooO0o0() - i3 || i2 < 0 || i2 > other.length - i3) {
            return false;
        }
        int i4 = i3 + i;
        int iOooO0oO = Oooo000.OooO0oO(this, i);
        while (i < i4) {
            int[] iArr = this.f32595OooOoOO;
            int i5 = iOooO0oO == 0 ? 0 : iArr[iOooO0oO - 1];
            int i6 = iArr[iOooO0oO] - i5;
            byte[][] bArr = this.f32594OooOoO;
            int i7 = iArr[bArr.length + iOooO0oO];
            int iMin = Math.min(i4, i6 + i5) - i;
            if (!o0OOO0.OooO0O0(bArr[iOooO0oO], (i - i5) + i7, other, i2, iMin)) {
                return false;
            }
            i2 += iMin;
            i += iMin;
            iOooO0oO++;
        }
        return true;
    }

    @Override // o00OOOoO.o0000O0
    public final o0000O0 OooOOOo(int i, int i2) {
        if (i2 == -1234567890) {
            i2 = OooO0o0();
        }
        if (i < 0) {
            throw new IllegalArgumentException(OooO0oO.OooOo.OooO0oO(i, "beginIndex=", " < 0").toString());
        }
        if (i2 > OooO0o0()) {
            StringBuilder sbOooOOo0 = OooO0oO.OooOo.OooOOo0(i2, "endIndex=", " > length(");
            sbOooOOo0.append(OooO0o0());
            sbOooOOo0.append(')');
            throw new IllegalArgumentException(sbOooOOo0.toString().toString());
        }
        int i3 = i2 - i;
        if (i3 < 0) {
            throw new IllegalArgumentException(OooO0oO.OooOo.OooO0o0(i2, i, "endIndex=", " < beginIndex=").toString());
        }
        if (i == 0 && i2 == OooO0o0()) {
            return this;
        }
        if (i == i2) {
            return o0000O0.f32553OooOoO0;
        }
        int iOooO0oO = Oooo000.OooO0oO(this, i);
        int iOooO0oO2 = Oooo000.OooO0oO(this, i2 - 1);
        byte[][] bArr = this.f32594OooOoO;
        byte[][] bArr2 = (byte[][]) OooOOO.Oooo(bArr, iOooO0oO, iOooO0oO2 + 1);
        int[] iArr = new int[bArr2.length * 2];
        int[] iArr2 = this.f32595OooOoOO;
        if (iOooO0oO <= iOooO0oO2) {
            int i4 = iOooO0oO;
            int i5 = 0;
            while (true) {
                iArr[i5] = Math.min(iArr2[i4] - i, i3);
                int i6 = i5 + 1;
                iArr[i5 + bArr2.length] = iArr2[bArr.length + i4];
                if (i4 == iOooO0oO2) {
                    break;
                }
                i4++;
                i5 = i6;
            }
        }
        int i7 = iOooO0oO != 0 ? iArr2[iOooO0oO - 1] : 0;
        int length = bArr2.length;
        iArr[length] = (i - i7) + iArr[length];
        return new o000OOo0(bArr2, iArr);
    }

    @Override // o00OOOoO.o0000O0
    public final o0000O0 OooOOo() {
        return OooOo0O().OooOOo();
    }

    public final byte[] OooOo0() {
        byte[] bArr = new byte[OooO0o0()];
        byte[][] bArr2 = this.f32594OooOoO;
        int length = bArr2.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            int[] iArr = this.f32595OooOoOO;
            int i4 = iArr[length + i];
            int i5 = iArr[i];
            int i6 = i5 - i2;
            OooOOO.Oooo0O0(bArr2[i], i3, bArr, i4, i4 + i6);
            i3 += i6;
            i++;
            i2 = i5;
        }
        return bArr;
    }

    @Override // o00OOOoO.o0000O0
    public final void OooOo00(o0000 buffer, int i) {
        OooOo.OooO0o0(buffer, "buffer");
        int iOooO0oO = Oooo000.OooO0oO(this, 0);
        int i2 = 0;
        while (i2 < i) {
            int[] iArr = this.f32595OooOoOO;
            int i3 = iOooO0oO == 0 ? 0 : iArr[iOooO0oO - 1];
            int i4 = iArr[iOooO0oO] - i3;
            byte[][] bArr = this.f32594OooOoO;
            int i5 = iArr[bArr.length + iOooO0oO];
            int iMin = Math.min(i, i4 + i3) - i2;
            int i6 = (i2 - i3) + i5;
            o000O o000o = new o000O(bArr[iOooO0oO], i6, i6 + iMin, true);
            o000O o000o2 = buffer.f32534OooOo0O;
            if (o000o2 == null) {
                o000o.f32569OooO0oO = o000o;
                o000o.f32567OooO0o = o000o;
                buffer.f32534OooOo0O = o000o;
            } else {
                o000O o000o3 = o000o2.f32569OooO0oO;
                OooOo.OooO0O0(o000o3);
                o000o3.OooO0O0(o000o);
            }
            i2 += iMin;
            iOooO0oO++;
        }
        buffer.f32535OooOo0o += i;
    }

    public final o0000O0 OooOo0O() {
        return new o0000O0(OooOo0());
    }

    @Override // o00OOOoO.o0000O0
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o0000O0) {
            o0000O0 o0000o02 = (o0000O0) obj;
            if (o0000o02.OooO0o0() == OooO0o0() && OooOOO(0, o0000o02, OooO0o0())) {
                return true;
            }
        }
        return false;
    }

    @Override // o00OOOoO.o0000O0
    public final int hashCode() {
        int i = this.f32556OooOo0o;
        if (i != 0) {
            return i;
        }
        byte[][] bArr = this.f32594OooOoO;
        int length = bArr.length;
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        while (i2 < length) {
            int[] iArr = this.f32595OooOoOO;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            byte[] bArr2 = bArr[i2];
            int i7 = (i6 - i4) + i5;
            while (i5 < i7) {
                i3 = (i3 * 31) + bArr2[i5];
                i5++;
            }
            i2++;
            i4 = i6;
        }
        this.f32556OooOo0o = i3;
        return i3;
    }

    @Override // o00OOOoO.o0000O0
    public final String toString() {
        return OooOo0O().toString();
    }
}
