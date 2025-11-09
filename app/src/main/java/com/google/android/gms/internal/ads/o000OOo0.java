package com.google.android.gms.internal.ads;

import io.flutter.embedding.android.KeyboardMap;
import org.apache.tika.fork.ForkServer;

/* loaded from: classes2.dex */
public final class o000OOo0 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f21724OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public byte[] f21725OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public int f21726OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public int f21727OooO0Oo;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public int f21728OooO0o0;

    public o000OOo0(byte[] bArr, int i) {
        this.f21724OooO00o = 1;
        this.f21725OooO0O0 = bArr;
        this.f21728OooO0o0 = i;
    }

    public void OooO() {
        int i = this.f21728OooO0o0 + 1;
        this.f21728OooO0o0 = i;
        if (i == 8) {
            this.f21728OooO0o0 = 0;
            int i2 = this.f21727OooO0Oo;
            this.f21727OooO0Oo = i2 + (true == OooOOo(i2 + 1) ? 2 : 1);
        }
        OooOOOo();
    }

    public int OooO00o() {
        return ((this.f21728OooO0o0 - this.f21726OooO0OO) * 8) - this.f21727OooO0Oo;
    }

    public int OooO0O0(int i) {
        int i2;
        byte[] bArr;
        this.f21728OooO0o0 += i;
        int i3 = 0;
        while (true) {
            i2 = this.f21728OooO0o0;
            bArr = this.f21725OooO0O0;
            if (i2 <= 8) {
                break;
            }
            int i4 = i2 - 8;
            this.f21728OooO0o0 = i4;
            int i5 = this.f21727OooO0Oo;
            i3 |= (bArr[i5] & ForkServer.ERROR) << i4;
            if (true != OooOOo(i5 + 1)) {
                i = 1;
            }
            this.f21727OooO0Oo = i5 + i;
        }
        int i6 = this.f21727OooO0Oo;
        int i7 = i3 | ((bArr[i6] & ForkServer.ERROR) >> (8 - i2));
        int i8 = 32 - i;
        if (i2 == 8) {
            this.f21728OooO0o0 = 0;
            this.f21727OooO0Oo = i6 + (true != OooOOo(i6 + 1) ? 1 : 2);
        }
        int i9 = ((-1) >>> i8) & i7;
        OooOOOo();
        return i9;
    }

    public int OooO0OO() {
        switch (this.f21724OooO00o) {
            case 1:
                af0.OooooO0(this.f21727OooO0Oo == 0);
                return this.f21726OooO0OO;
            default:
                int iOooOOOO = OooOOOO();
                int i = iOooOOOO % 2;
                return ((iOooOOOO + 1) / 2) * (i == 0 ? -1 : 1);
        }
    }

    public int OooO0Oo(int i) {
        int i2 = this.f21727OooO0Oo;
        int i3 = i2 + 1;
        int iMin = Math.min(i, 8 - this.f21728OooO0o0);
        byte[] bArr = this.f21725OooO0O0;
        int i4 = ((bArr[i2] & ForkServer.ERROR) >> this.f21728OooO0o0) & (255 >> (8 - iMin));
        while (iMin < i) {
            i4 |= (bArr[i3] & ForkServer.ERROR) << iMin;
            iMin += 8;
            i3++;
        }
        int i5 = i4 & ((-1) >>> (32 - i));
        OooO0o0(i);
        return i5;
    }

    public int OooO0o(int i) {
        int i2;
        if (i == 0) {
            return 0;
        }
        this.f21727OooO0Oo += i;
        int i3 = 0;
        while (true) {
            i2 = this.f21727OooO0Oo;
            if (i2 <= 8) {
                break;
            }
            int i4 = i2 - 8;
            this.f21727OooO0Oo = i4;
            byte[] bArr = this.f21725OooO0O0;
            int i5 = this.f21726OooO0OO;
            this.f21726OooO0OO = i5 + 1;
            i3 |= (bArr[i5] & ForkServer.ERROR) << i4;
        }
        byte[] bArr2 = this.f21725OooO0O0;
        int i6 = this.f21726OooO0OO;
        int i7 = i3 | ((bArr2[i6] & ForkServer.ERROR) >> (8 - i2));
        int i8 = 32 - i;
        if (i2 == 8) {
            this.f21727OooO0Oo = 0;
            this.f21726OooO0OO = i6 + 1;
        }
        int i9 = ((-1) >>> i8) & i7;
        OooOo();
        return i9;
    }

    public void OooO0o0(int i) {
        int i2;
        int i3 = i / 8;
        int i4 = this.f21727OooO0Oo + i3;
        this.f21727OooO0Oo = i4;
        int i5 = (i - (i3 * 8)) + this.f21728OooO0o0;
        this.f21728OooO0o0 = i5;
        if (i5 > 7) {
            i4++;
            this.f21727OooO0Oo = i4;
            i5 -= 8;
            this.f21728OooO0o0 = i5;
        }
        boolean z = false;
        if (i4 >= 0 && (i4 < (i2 = this.f21726OooO0OO) || (i4 == i2 && i5 == 0))) {
            z = true;
        }
        af0.OooooO0(z);
    }

    public boolean OooO0oO() {
        int i = (this.f21725OooO0O0[this.f21727OooO0Oo] & ForkServer.ERROR) >> this.f21728OooO0o0;
        OooO0o0(1);
        return 1 == (i & 1);
    }

    public long OooO0oo(int i) {
        if (i <= 32) {
            int iOooO0o = OooO0o(i);
            int i2 = i80.f19994OooO00o;
            return KeyboardMap.kValueMask & iOooO0o;
        }
        int iOooO0o2 = OooO0o(i - 32);
        int iOooO0o3 = OooO0o(32);
        int i3 = i80.f19994OooO00o;
        return (KeyboardMap.kValueMask & iOooO0o3) | ((iOooO0o2 & KeyboardMap.kValueMask) << 32);
    }

    public void OooOO0() {
        if (this.f21727OooO0Oo == 0) {
            return;
        }
        this.f21727OooO0Oo = 0;
        this.f21726OooO0OO++;
        OooOo();
    }

    public void OooOO0O(int i) {
        int i2 = this.f21727OooO0Oo;
        int i3 = i / 8;
        int i4 = i2 + i3;
        this.f21727OooO0Oo = i4;
        int i5 = (i - (i3 * 8)) + this.f21728OooO0o0;
        this.f21728OooO0o0 = i5;
        if (i5 > 7) {
            this.f21727OooO0Oo = i4 + 1;
            this.f21728OooO0o0 = i5 - 8;
        }
        while (true) {
            i2++;
            if (i2 > this.f21727OooO0Oo) {
                OooOOOo();
                return;
            } else if (OooOOo(i2)) {
                this.f21727OooO0Oo++;
                i2 += 2;
            }
        }
    }

    public boolean OooOO0o(int i) {
        int i2;
        int i3 = this.f21727OooO0Oo;
        int i4 = i / 8;
        int i5 = i3 + i4;
        int i6 = (this.f21728OooO0o0 + i) - (i4 * 8);
        if (i6 > 7) {
            i5++;
            i6 -= 8;
        }
        while (true) {
            i3++;
            i2 = this.f21726OooO0OO;
            if (i3 > i5 || i5 >= i2) {
                break;
            }
            if (OooOOo(i3)) {
                i5++;
                i3 += 2;
            }
        }
        if (i5 >= i2) {
            return i5 == i2 && i6 == 0;
        }
        return true;
    }

    public boolean OooOOO() {
        int i = this.f21725OooO0O0[this.f21727OooO0Oo] & (128 >> this.f21728OooO0o0);
        OooO();
        return i != 0;
    }

    public void OooOOO0(int i, byte[] bArr) {
        int i2;
        int i3 = 0;
        while (true) {
            i2 = i >> 3;
            if (i3 >= i2) {
                break;
            }
            byte[] bArr2 = this.f21725OooO0O0;
            int i4 = this.f21726OooO0OO;
            int i5 = i4 + 1;
            this.f21726OooO0OO = i5;
            byte b = bArr2[i4];
            int i6 = this.f21727OooO0Oo;
            byte b2 = (byte) (b << i6);
            bArr[i3] = b2;
            bArr[i3] = (byte) (((bArr2[i5] & ForkServer.ERROR) >> (8 - i6)) | b2);
            i3++;
        }
        int i7 = i & 7;
        if (i7 == 0) {
            return;
        }
        byte b3 = (byte) (bArr[i2] & (255 >> i7));
        bArr[i2] = b3;
        int i8 = this.f21727OooO0Oo;
        if (i8 + i7 > 8) {
            byte[] bArr3 = this.f21725OooO0O0;
            int i9 = this.f21726OooO0OO;
            this.f21726OooO0OO = i9 + 1;
            b3 = (byte) (b3 | ((bArr3[i9] & ForkServer.ERROR) << i8));
            bArr[i2] = b3;
            i8 -= 8;
        }
        int i10 = i8 + i7;
        this.f21727OooO0Oo = i10;
        byte[] bArr4 = this.f21725OooO0O0;
        int i11 = this.f21726OooO0OO;
        bArr[i2] = (byte) (((byte) (((255 & bArr4[i11]) >> (8 - i10)) << (8 - i7))) | b3);
        if (i10 == 8) {
            this.f21727OooO0Oo = 0;
            this.f21726OooO0OO = i11 + 1;
        }
        OooOo();
    }

    public int OooOOOO() {
        int i = 0;
        while (!OooOOO()) {
            i++;
        }
        return ((1 << i) - 1) + (i > 0 ? OooO0O0(i) : 0);
    }

    public void OooOOOo() {
        int i;
        int i2 = this.f21727OooO0Oo;
        boolean z = false;
        if (i2 >= 0 && (i2 < (i = this.f21726OooO0OO) || (i2 == i && this.f21728OooO0o0 == 0))) {
            z = true;
        }
        af0.OooooO0(z);
    }

    public boolean OooOOo(int i) {
        if (i < 2 || i >= this.f21726OooO0OO) {
            return false;
        }
        byte[] bArr = this.f21725OooO0O0;
        return bArr[i] == 3 && bArr[i + (-2)] == 0 && bArr[i + (-1)] == 0;
    }

    public void OooOOo0(r40 r40Var) {
        byte[] bArr = r40Var.f23745OooO00o;
        int i = r40Var.f23747OooO0OO;
        this.f21725OooO0O0 = bArr;
        this.f21726OooO0OO = 0;
        this.f21727OooO0Oo = 0;
        this.f21728OooO0o0 = i;
        OooOOoo(r40Var.f23746OooO0O0 * 8);
    }

    public void OooOOoo(int i) {
        int i2 = i / 8;
        this.f21726OooO0OO = i2;
        this.f21727OooO0Oo = i - (i2 * 8);
        OooOo();
    }

    public void OooOo() {
        int i;
        int i2 = this.f21726OooO0OO;
        boolean z = false;
        if (i2 >= 0 && (i2 < (i = this.f21728OooO0o0) || (i2 == i && this.f21727OooO0Oo == 0))) {
            z = true;
        }
        af0.OooooO0(z);
    }

    public void OooOo0(int i) {
        int i2 = i / 8;
        int i3 = this.f21726OooO0OO + i2;
        this.f21726OooO0OO = i3;
        int i4 = (i - (i2 * 8)) + this.f21727OooO0Oo;
        this.f21727OooO0Oo = i4;
        if (i4 > 7) {
            this.f21726OooO0OO = i3 + 1;
            this.f21727OooO0Oo = i4 - 8;
        }
        OooOo();
    }

    public void OooOo00() {
        int i = this.f21727OooO0Oo + 1;
        this.f21727OooO0Oo = i;
        if (i == 8) {
            this.f21727OooO0Oo = 0;
            this.f21726OooO0OO++;
        }
        OooOo();
    }

    public void OooOo0O(int i) {
        af0.OooooO0(this.f21727OooO0Oo == 0);
        this.f21726OooO0OO += i;
        OooOo();
    }

    public boolean OooOo0o() {
        int i = this.f21725OooO0O0[this.f21726OooO0OO] & (128 >> this.f21727OooO0Oo);
        OooOo00();
        return i != 0;
    }

    public o000OOo0() {
        this.f21724OooO00o = 1;
        this.f21725OooO0O0 = i80.f19998OooO0o;
    }

    public o000OOo0(byte[] bArr) {
        this.f21724OooO00o = 0;
        this.f21725OooO0O0 = bArr;
        this.f21726OooO0OO = bArr.length;
    }

    public o000OOo0(byte[] bArr, int i, int i2) {
        this.f21724OooO00o = 2;
        this.f21725OooO0O0 = bArr;
        this.f21727OooO0Oo = i;
        this.f21726OooO0OO = i2;
        this.f21728OooO0o0 = 0;
        OooOOOo();
    }
}
