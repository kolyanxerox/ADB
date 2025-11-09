package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Date;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class y91 {

    /* renamed from: OooO00o */
    public long f25874OooO00o;

    /* renamed from: OooO0O0 */
    public Object f25875OooO0O0;

    /* renamed from: OooO0OO */
    public Object f25876OooO0OO;

    /* renamed from: OooO0Oo */
    public Object f25877OooO0Oo;

    /* renamed from: OooO0o */
    public Object f25878OooO0o;

    /* renamed from: OooO0o0 */
    public Object f25879OooO0o0;

    public static OoooOOO.oO0O0 OooO0Oo(OoooOOO.oO0O0 oo0o0, long j, ByteBuffer byteBuffer, int i) {
        while (j >= oo0o0.f14697OooOo0o) {
            oo0o0 = (OoooOOO.oO0O0) oo0o0.f14698OooOoO0;
        }
        while (i > 0) {
            int iMin = Math.min(i, (int) (oo0o0.f14697OooOo0o - j));
            bb1 bb1Var = (bb1) oo0o0.f14695OooOo;
            byte[] bArr = bb1Var.f17472OooO00o;
            long j2 = j - oo0o0.f14696OooOo0O;
            bb1Var.getClass();
            byteBuffer.put(bArr, (int) j2, iMin);
            i -= iMin;
            j += iMin;
            if (j == oo0o0.f14697OooOo0o) {
                oo0o0 = (OoooOOO.oO0O0) oo0o0.f14698OooOoO0;
            }
        }
        return oo0o0;
    }

    public static OoooOOO.oO0O0 OooO0o(OoooOOO.oO0O0 oo0o0, c41 c41Var, OooOOOO.OooO0O0 oooO0O0, r40 r40Var) {
        int iOooOoO;
        if (c41Var.OooO00o(BasicMeasure.EXACTLY)) {
            long j = oooO0O0.f13329OooOo0o;
            r40Var.OooO0oO(1);
            OoooOOO.oO0O0 oo0o0OooO0o0 = OooO0o0(oo0o0, j, r40Var.f23745OooO00o, 1);
            long j2 = j + 1;
            byte b = r40Var.f23745OooO00o[0];
            int i = b & 128;
            int i2 = b & 127;
            h31 h31Var = c41Var.f17680OooO0Oo;
            byte[] bArr = h31Var.f19534OooO00o;
            if (bArr == null) {
                h31Var.f19534OooO00o = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            boolean z = i != 0;
            oo0o0 = OooO0o0(oo0o0OooO0o0, j2, h31Var.f19534OooO00o, i2);
            long j3 = j2 + i2;
            if (z) {
                r40Var.OooO0oO(2);
                oo0o0 = OooO0o0(oo0o0, j3, r40Var.f23745OooO00o, 2);
                j3 += 2;
                iOooOoO = r40Var.OooOoO();
            } else {
                iOooOoO = 1;
            }
            int[] iArr = h31Var.f19537OooO0Oo;
            if (iArr == null || iArr.length < iOooOoO) {
                iArr = new int[iOooOoO];
            }
            int[] iArr2 = h31Var.f19539OooO0o0;
            if (iArr2 == null || iArr2.length < iOooOoO) {
                iArr2 = new int[iOooOoO];
            }
            if (z) {
                int i3 = iOooOoO * 6;
                r40Var.OooO0oO(i3);
                oo0o0 = OooO0o0(oo0o0, j3, r40Var.f23745OooO00o, i3);
                j3 += i3;
                r40Var.OooOO0(0);
                for (int i4 = 0; i4 < iOooOoO; i4++) {
                    iArr[i4] = r40Var.OooOoO();
                    iArr2[i4] = r40Var.OooOoO0();
                }
            } else {
                iArr[0] = 0;
                iArr2[0] = oooO0O0.f13327OooOo - ((int) (j3 - oooO0O0.f13329OooOo0o));
            }
            o000O0O0 o000o0o02 = (o000O0O0) oooO0O0.f13330OooOoO0;
            int i5 = i80.f19994OooO00o;
            byte[] bArr2 = o000o0o02.f21700OooO0O0;
            byte[] bArr3 = h31Var.f19534OooO00o;
            h31Var.f19538OooO0o = iOooOoO;
            h31Var.f19537OooO0Oo = iArr;
            h31Var.f19539OooO0o0 = iArr2;
            h31Var.f19535OooO0O0 = bArr2;
            h31Var.f19534OooO00o = bArr3;
            int i6 = o000o0o02.f21699OooO00o;
            h31Var.f19536OooO0OO = i6;
            int i7 = o000o0o02.f21701OooO0OO;
            h31Var.f19540OooO0oO = i7;
            int i8 = o000o0o02.f21702OooO0Oo;
            h31Var.f19541OooO0oo = i8;
            MediaCodec.CryptoInfo cryptoInfo = h31Var.f19533OooO;
            cryptoInfo.numSubSamples = iOooOoO;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr2;
            cryptoInfo.iv = bArr3;
            cryptoInfo.mode = i6;
            if (i80.f19994OooO00o >= 24) {
                dx0 dx0Var = h31Var.f19542OooOO0;
                dx0Var.getClass();
                MediaCodec.CryptoInfo.Pattern pattern = (MediaCodec.CryptoInfo.Pattern) dx0Var.f18417OooOo;
                pattern.set(i7, i8);
                ((MediaCodec.CryptoInfo) dx0Var.f18419OooOo0o).setPattern(pattern);
            }
            long j4 = oooO0O0.f13329OooOo0o;
            int i9 = (int) (j3 - j4);
            oooO0O0.f13329OooOo0o = j4 + i9;
            oooO0O0.f13327OooOo -= i9;
        }
        if (!c41Var.OooO00o(268435456)) {
            c41Var.OooO0o0(oooO0O0.f13327OooOo);
            return OooO0Oo(oo0o0, oooO0O0.f13329OooOo0o, c41Var.f17682OooO0o0, oooO0O0.f13327OooOo);
        }
        r40Var.OooO0oO(4);
        OoooOOO.oO0O0 oo0o0OooO0o02 = OooO0o0(oo0o0, oooO0O0.f13329OooOo0o, r40Var.f23745OooO00o, 4);
        int iOooOoO0 = r40Var.OooOoO0();
        oooO0O0.f13329OooOo0o += 4;
        oooO0O0.f13327OooOo -= 4;
        c41Var.OooO0o0(iOooOoO0);
        OoooOOO.oO0O0 oo0o0OooO0Oo = OooO0Oo(oo0o0OooO0o02, oooO0O0.f13329OooOo0o, c41Var.f17682OooO0o0, iOooOoO0);
        oooO0O0.f13329OooOo0o += iOooOoO0;
        int i10 = oooO0O0.f13327OooOo - iOooOoO0;
        oooO0O0.f13327OooOo = i10;
        ByteBuffer byteBuffer = c41Var.f17684OooO0oo;
        if (byteBuffer == null || byteBuffer.capacity() < i10) {
            c41Var.f17684OooO0oo = ByteBuffer.allocate(i10);
        } else {
            c41Var.f17684OooO0oo.clear();
        }
        return OooO0Oo(oo0o0OooO0Oo, oooO0O0.f13329OooOo0o, c41Var.f17684OooO0oo, oooO0O0.f13327OooOo);
    }

    public static OoooOOO.oO0O0 OooO0o0(OoooOOO.oO0O0 oo0o0, long j, byte[] bArr, int i) {
        while (j >= oo0o0.f14697OooOo0o) {
            oo0o0 = (OoooOOO.oO0O0) oo0o0.f14698OooOoO0;
        }
        int i2 = i;
        while (i2 > 0) {
            int iMin = Math.min(i2, (int) (oo0o0.f14697OooOo0o - j));
            bb1 bb1Var = (bb1) oo0o0.f14695OooOo;
            byte[] bArr2 = bb1Var.f17472OooO00o;
            long j2 = j - oo0o0.f14696OooOo0O;
            bb1Var.getClass();
            System.arraycopy(bArr2, (int) j2, bArr, i - i2, iMin);
            i2 -= iMin;
            j += iMin;
            if (j == oo0o0.f14697OooOo0o) {
                oo0o0 = (OoooOOO.oO0O0) oo0o0.f14698OooOoO0;
            }
        }
        return oo0o0;
    }

    public o000Oooo.o000000 OooO00o() {
        return new o000Oooo.o000000((JSONObject) this.f25875OooO0O0, (Date) this.f25876OooO0OO, (JSONArray) this.f25877OooO0Oo, (JSONObject) this.f25879OooO0o0, this.f25874OooO00o, (JSONArray) this.f25878OooO0o);
    }

    public void OooO0O0(long j) {
        OoooOOO.oO0O0 oo0o0;
        if (j != -1) {
            while (true) {
                oo0o0 = (OoooOOO.oO0O0) this.f25876OooO0OO;
                if (j < oo0o0.f14697OooOo0o) {
                    break;
                }
                eb1 eb1Var = (eb1) this.f25878OooO0o;
                bb1 bb1Var = (bb1) oo0o0.f14695OooOo;
                synchronized (eb1Var) {
                    bb1[] bb1VarArr = eb1Var.f18560OooO0Oo;
                    int i = eb1Var.f18559OooO0OO;
                    eb1Var.f18559OooO0OO = i + 1;
                    bb1VarArr[i] = bb1Var;
                    eb1Var.f18558OooO0O0--;
                    eb1Var.notifyAll();
                }
                OoooOOO.oO0O0 oo0o02 = (OoooOOO.oO0O0) this.f25876OooO0OO;
                oo0o02.f14695OooOo = null;
                OoooOOO.oO0O0 oo0o03 = (OoooOOO.oO0O0) oo0o02.f14698OooOoO0;
                oo0o02.f14698OooOoO0 = null;
                this.f25876OooO0OO = oo0o03;
            }
            if (((OoooOOO.oO0O0) this.f25877OooO0Oo).f14696OooOo0O < oo0o0.f14696OooOo0O) {
                this.f25877OooO0Oo = oo0o0;
            }
        }
    }

    public int OooO0OO(int i) {
        bb1 bb1Var;
        OoooOOO.oO0O0 oo0o0 = (OoooOOO.oO0O0) this.f25879OooO0o0;
        if (((bb1) oo0o0.f14695OooOo) == null) {
            eb1 eb1Var = (eb1) this.f25878OooO0o;
            synchronized (eb1Var) {
                try {
                    int i2 = eb1Var.f18558OooO0O0 + 1;
                    eb1Var.f18558OooO0O0 = i2;
                    int i3 = eb1Var.f18559OooO0OO;
                    if (i3 > 0) {
                        bb1[] bb1VarArr = eb1Var.f18560OooO0Oo;
                        int i4 = i3 - 1;
                        eb1Var.f18559OooO0OO = i4;
                        bb1Var = bb1VarArr[i4];
                        if (bb1Var == null) {
                            throw null;
                        }
                        bb1VarArr[i4] = null;
                    } else {
                        bb1Var = new bb1(new byte[65536]);
                        bb1[] bb1VarArr2 = eb1Var.f18560OooO0Oo;
                        int length = bb1VarArr2.length;
                        if (i2 > length) {
                            eb1Var.f18560OooO0Oo = (bb1[]) Arrays.copyOf(bb1VarArr2, length + length);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            OoooOOO.oO0O0 oo0o02 = new OoooOOO.oO0O0(((OoooOOO.oO0O0) this.f25879OooO0o0).f14697OooOo0o);
            oo0o0.f14695OooOo = bb1Var;
            oo0o0.f14698OooOoO0 = oo0o02;
        }
        return Math.min(i, (int) (((OoooOOO.oO0O0) this.f25879OooO0o0).f14697OooOo0o - this.f25874OooO00o));
    }
}
