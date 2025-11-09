package o00OOOOo;

import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import o00OOOoO.o0000O0;
import o00OOOoO.o000O0O0;
import org.apache.tika.fork.ForkServer;

/* loaded from: classes3.dex */
public final class OooO0OO {

    /* renamed from: OooO0O0 */
    public final o000O0O0 f32406OooO0O0;

    /* renamed from: OooO00o */
    public final ArrayList f32405OooO00o = new ArrayList();

    /* renamed from: OooO0o0 */
    public OooO0O0[] f32410OooO0o0 = new OooO0O0[8];

    /* renamed from: OooO0o */
    public int f32409OooO0o = 7;

    /* renamed from: OooO0oO */
    public int f32411OooO0oO = 0;

    /* renamed from: OooO0oo */
    public int f32412OooO0oo = 0;

    /* renamed from: OooO0OO */
    public final int f32407OooO0OO = 4096;

    /* renamed from: OooO0Oo */
    public int f32408OooO0Oo = 4096;

    public OooO0OO(o00Ooo o00ooo2) {
        this.f32406OooO0O0 = o00Oo0oo.o00oO0o.OooO00o(o00ooo2);
    }

    public final int OooO00o(int i) {
        int i2;
        int i3 = 0;
        if (i > 0) {
            int length = this.f32410OooO0o0.length;
            while (true) {
                length--;
                i2 = this.f32409OooO0o;
                if (length < i2 || i <= 0) {
                    break;
                }
                int i4 = this.f32410OooO0o0[length].f32404OooO0OO;
                i -= i4;
                this.f32412OooO0oo -= i4;
                this.f32411OooO0oO--;
                i3++;
            }
            OooO0O0[] oooO0O0Arr = this.f32410OooO0o0;
            System.arraycopy(oooO0O0Arr, i2 + 1, oooO0O0Arr, i2 + 1 + i3, this.f32411OooO0oO);
            this.f32409OooO0o += i3;
        }
        return i3;
    }

    public final o0000O0 OooO0O0(int i) throws IOException {
        if (i >= 0) {
            OooO0O0[] oooO0O0Arr = OooO.f32394OooO00o;
            if (i <= oooO0O0Arr.length - 1) {
                return oooO0O0Arr[i].f32402OooO00o;
            }
        }
        int length = this.f32409OooO0o + 1 + (i - OooO.f32394OooO00o.length);
        if (length >= 0) {
            OooO0O0[] oooO0O0Arr2 = this.f32410OooO0o0;
            if (length < oooO0O0Arr2.length) {
                return oooO0O0Arr2[length].f32402OooO00o;
            }
        }
        throw new IOException("Header index too large " + (i + 1));
    }

    public final void OooO0OO(OooO0O0 oooO0O0) {
        this.f32405OooO00o.add(oooO0O0);
        int i = this.f32408OooO0Oo;
        int i2 = oooO0O0.f32404OooO0OO;
        if (i2 > i) {
            Arrays.fill(this.f32410OooO0o0, (Object) null);
            this.f32409OooO0o = this.f32410OooO0o0.length - 1;
            this.f32411OooO0oO = 0;
            this.f32412OooO0oo = 0;
            return;
        }
        OooO00o((this.f32412OooO0oo + i2) - i);
        int i3 = this.f32411OooO0oO + 1;
        OooO0O0[] oooO0O0Arr = this.f32410OooO0o0;
        if (i3 > oooO0O0Arr.length) {
            OooO0O0[] oooO0O0Arr2 = new OooO0O0[oooO0O0Arr.length * 2];
            System.arraycopy(oooO0O0Arr, 0, oooO0O0Arr2, oooO0O0Arr.length, oooO0O0Arr.length);
            this.f32409OooO0o = this.f32410OooO0o0.length - 1;
            this.f32410OooO0o0 = oooO0O0Arr2;
        }
        int i4 = this.f32409OooO0o;
        this.f32409OooO0o = i4 - 1;
        this.f32410OooO0o0[i4] = oooO0O0;
        this.f32411OooO0oO++;
        this.f32412OooO0oo += i2;
    }

    public final o0000O0 OooO0Oo() throws EOFException {
        int i;
        o000O0O0 o000o0o02 = this.f32406OooO0O0;
        byte b = o000o0o02.readByte();
        int i2 = b & ForkServer.ERROR;
        boolean z = (b & 128) == 128;
        int iOooO0o0 = OooO0o0(i2, 127);
        if (!z) {
            return o000o0o02.OooO00o(iOooO0o0);
        }
        o0O0O00 o0o0o00 = o0O0O00.f32491OooO0Oo;
        long j = iOooO0o0;
        o000o0o02.require(j);
        byte[] byteArray = o000o0o02.f32578OooOo0o.readByteArray(j);
        o0o0o00.getClass();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        oo0o0Oo oo0o0oo = o0o0o00.f32492OooO00o;
        oo0o0Oo oo0o0oo2 = oo0o0oo;
        int i3 = 0;
        int i4 = 0;
        for (byte b2 : byteArray) {
            i3 = (i3 << 8) | (b2 & ForkServer.ERROR);
            i4 += 8;
            while (i4 >= 8) {
                oo0o0oo2 = oo0o0oo2.f32527OooO00o[(i3 >>> (i4 - 8)) & 255];
                if (oo0o0oo2.f32527OooO00o == null) {
                    byteArrayOutputStream.write(oo0o0oo2.f32528OooO0O0);
                    i4 -= oo0o0oo2.f32529OooO0OO;
                    oo0o0oo2 = oo0o0oo;
                } else {
                    i4 -= 8;
                }
            }
        }
        while (i4 > 0) {
            oo0o0Oo oo0o0oo3 = oo0o0oo2.f32527OooO00o[(i3 << (8 - i4)) & 255];
            if (oo0o0oo3.f32527OooO00o != null || (i = oo0o0oo3.f32529OooO0OO) > i4) {
                break;
            }
            byteArrayOutputStream.write(oo0o0oo3.f32528OooO0O0);
            i4 -= i;
            oo0o0oo2 = oo0o0oo;
        }
        return o0000O0.OooOOO0(byteArrayOutputStream.toByteArray());
    }

    public final int OooO0o0(int i, int i2) throws EOFException {
        int i3 = i & i2;
        if (i3 < i2) {
            return i3;
        }
        int i4 = 0;
        while (true) {
            byte b = this.f32406OooO0O0.readByte();
            int i5 = b & ForkServer.ERROR;
            if ((b & 128) == 0) {
                return i2 + (i5 << i4);
            }
            i2 += (b & 127) << i4;
            i4 += 7;
        }
    }
}
