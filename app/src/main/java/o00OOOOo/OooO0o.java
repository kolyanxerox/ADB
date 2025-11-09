package o00OOOOo;

import java.io.EOFException;
import java.util.Arrays;
import o00OOOoO.o0000;
import o00OOOoO.o0000O0;
import org.apache.tika.fork.ForkServer;

/* loaded from: classes3.dex */
public final class OooO0o {

    /* renamed from: OooO00o */
    public final o0000 f32413OooO00o;

    /* renamed from: OooO0OO */
    public boolean f32415OooO0OO;

    /* renamed from: OooO0O0 */
    public int f32414OooO0O0 = Integer.MAX_VALUE;

    /* renamed from: OooO0o0 */
    public OooO0O0[] f32418OooO0o0 = new OooO0O0[8];

    /* renamed from: OooO0o */
    public int f32417OooO0o = 7;

    /* renamed from: OooO0oO */
    public int f32419OooO0oO = 0;

    /* renamed from: OooO0oo */
    public int f32420OooO0oo = 0;

    /* renamed from: OooO0Oo */
    public int f32416OooO0Oo = 4096;

    public OooO0o(o0000 o0000Var) {
        this.f32413OooO00o = o0000Var;
    }

    public final void OooO00o(int i) {
        int i2;
        if (i > 0) {
            int length = this.f32418OooO0o0.length - 1;
            int i3 = 0;
            while (true) {
                i2 = this.f32417OooO0o;
                if (length < i2 || i <= 0) {
                    break;
                }
                int i4 = this.f32418OooO0o0[length].f32404OooO0OO;
                i -= i4;
                this.f32420OooO0oo -= i4;
                this.f32419OooO0oO--;
                i3++;
                length--;
            }
            OooO0O0[] oooO0O0Arr = this.f32418OooO0o0;
            int i5 = i2 + 1;
            System.arraycopy(oooO0O0Arr, i5, oooO0O0Arr, i5 + i3, this.f32419OooO0oO);
            OooO0O0[] oooO0O0Arr2 = this.f32418OooO0o0;
            int i6 = this.f32417OooO0o + 1;
            Arrays.fill(oooO0O0Arr2, i6, i6 + i3, (Object) null);
            this.f32417OooO0o += i3;
        }
    }

    public final void OooO0O0(OooO0O0 oooO0O0) {
        int i = this.f32416OooO0Oo;
        int i2 = oooO0O0.f32404OooO0OO;
        if (i2 > i) {
            Arrays.fill(this.f32418OooO0o0, (Object) null);
            this.f32417OooO0o = this.f32418OooO0o0.length - 1;
            this.f32419OooO0oO = 0;
            this.f32420OooO0oo = 0;
            return;
        }
        OooO00o((this.f32420OooO0oo + i2) - i);
        int i3 = this.f32419OooO0oO + 1;
        OooO0O0[] oooO0O0Arr = this.f32418OooO0o0;
        if (i3 > oooO0O0Arr.length) {
            OooO0O0[] oooO0O0Arr2 = new OooO0O0[oooO0O0Arr.length * 2];
            System.arraycopy(oooO0O0Arr, 0, oooO0O0Arr2, oooO0O0Arr.length, oooO0O0Arr.length);
            this.f32417OooO0o = this.f32418OooO0o0.length - 1;
            this.f32418OooO0o0 = oooO0O0Arr2;
        }
        int i4 = this.f32417OooO0o;
        this.f32417OooO0o = i4 - 1;
        this.f32418OooO0o0[i4] = oooO0O0;
        this.f32419OooO0oO++;
        this.f32420OooO0oo += i2;
    }

    public final void OooO0OO(o0000O0 o0000o02) throws EOFException {
        o0O0O00.f32491OooO0Oo.getClass();
        long j = 0;
        long j2 = 0;
        for (int i = 0; i < o0000o02.OooO0o0(); i++) {
            j2 += o0O0O00.f32490OooO0OO[o0000o02.OooOO0(i) & ForkServer.ERROR];
        }
        int i2 = (int) ((j2 + 7) >> 3);
        int iOooO0o0 = o0000o02.OooO0o0();
        o0000 o0000Var = this.f32413OooO00o;
        if (i2 >= iOooO0o0) {
            OooO0Oo(o0000o02.OooO0o0(), 127, 0);
            o0000Var.OooO0o(o0000o02);
            return;
        }
        o0000 o0000Var2 = new o0000();
        o0O0O00.f32491OooO0Oo.getClass();
        int i3 = 0;
        for (int i4 = 0; i4 < o0000o02.OooO0o0(); i4++) {
            int iOooOO0 = o0000o02.OooOO0(i4) & ForkServer.ERROR;
            int i5 = o0O0O00.f32489OooO0O0[iOooOO0];
            byte b = o0O0O00.f32490OooO0OO[iOooOO0];
            j = (j << b) | i5;
            i3 += b;
            while (i3 >= 8) {
                i3 -= 8;
                o0000Var2.OooOO0O((int) (j >> i3));
            }
        }
        if (i3 > 0) {
            o0000Var2.OooOO0O((int) ((j << (8 - i3)) | (255 >>> i3)));
        }
        o0000O0 o0000o0OooO0OO = o0000Var2.OooO0OO(o0000Var2.f32535OooOo0o);
        OooO0Oo(o0000o0OooO0OO.OooO0o0(), 127, 128);
        o0000Var.OooO0o(o0000o0OooO0OO);
    }

    public final void OooO0Oo(int i, int i2, int i3) {
        o0000 o0000Var = this.f32413OooO00o;
        if (i < i2) {
            o0000Var.OooOO0O(i | i3);
            return;
        }
        o0000Var.OooOO0O(i3 | i2);
        int i4 = i - i2;
        while (i4 >= 128) {
            o0000Var.OooOO0O(128 | (i4 & 127));
            i4 >>>= 7;
        }
        o0000Var.OooOO0O(i4);
    }
}
