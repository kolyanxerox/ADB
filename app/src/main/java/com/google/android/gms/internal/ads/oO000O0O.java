package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import android.webkit.WebView;
import androidx.collection.SimpleArrayMap;
import androidx.core.view.ViewCompat;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzv;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes2.dex */
public final class oO000O0O implements ooo0Oo0, kp0 {

    /* renamed from: OooOoo */
    public static final byte[] f22425OooOoo = {0, 7, 8, 15};

    /* renamed from: OooOooO */
    public static final byte[] f22426OooOooO = {0, 119, -120, -1};

    /* renamed from: OooOooo */
    public static final byte[] f22427OooOooo = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};

    /* renamed from: OooOo */
    public Object f22428OooOo;

    /* renamed from: OooOo0O */
    public Object f22429OooOo0O;

    /* renamed from: OooOo0o */
    public Object f22430OooOo0o;

    /* renamed from: OooOoO */
    public Object f22431OooOoO;

    /* renamed from: OooOoO0 */
    public Object f22432OooOoO0;

    /* renamed from: OooOoOO */
    public final Object f22433OooOoOO;

    /* renamed from: OooOoo0 */
    public Object f22434OooOoo0;

    public /* synthetic */ oO000O0O(Context context, C1663i1 c1663i1, VersionInfoParcel versionInfoParcel, zza zzaVar, x50 x50Var, xd0 xd0Var, String str) {
        this.f22429OooOo0O = context;
        this.f22430OooOo0o = c1663i1;
        this.f22428OooOo = versionInfoParcel;
        this.f22432OooOoO0 = zzaVar;
        this.f22431OooOoO = x50Var;
        this.f22433OooOoOO = xd0Var;
        this.f22434OooOoo0 = str;
    }

    public static int OooO00o(int i, int i2, int i3, int i4) {
        return (i << 24) | (i2 << 16) | (i3 << 8) | i4;
    }

    public static oO00000 OooO0O0(o000OOo0 o000ooo02, int i) {
        int iOooO0o;
        int iOooO0o2;
        int iOooO0o3;
        int iOooO0o4;
        int i2 = 8;
        int iOooO0o5 = o000ooo02.OooO0o(8);
        o000ooo02.OooOo0(8);
        int i3 = 0;
        int[] iArr = {0, -1, ViewCompat.MEASURED_STATE_MASK, -8421505};
        int[] iArrOooO0oO = OooO0oO();
        int[] iArrOooO0oo = OooO0oo();
        int i4 = i - 2;
        while (i4 > 0) {
            int iOooO0o6 = o000ooo02.OooO0o(i2);
            int iOooO0o7 = o000ooo02.OooO0o(i2);
            int[] iArr2 = (iOooO0o7 & 128) != 0 ? iArr : (iOooO0o7 & 64) != 0 ? iArrOooO0oO : iArrOooO0oo;
            if ((iOooO0o7 & 1) != 0) {
                iOooO0o3 = o000ooo02.OooO0o(i2);
                iOooO0o4 = o000ooo02.OooO0o(i2);
                iOooO0o = o000ooo02.OooO0o(i2);
                iOooO0o2 = o000ooo02.OooO0o(i2);
                i4 -= 6;
            } else {
                int iOooO0o8 = o000ooo02.OooO0o(6) << 2;
                int iOooO0o9 = o000ooo02.OooO0o(4) << 4;
                i4 -= 4;
                iOooO0o = o000ooo02.OooO0o(4) << 4;
                iOooO0o2 = o000ooo02.OooO0o(2) << 6;
                iOooO0o3 = iOooO0o8;
                iOooO0o4 = iOooO0o9;
            }
            if (iOooO0o3 == 0) {
                iOooO0o2 = 255;
            }
            if (iOooO0o3 == 0) {
                iOooO0o = i3;
            }
            if (iOooO0o3 == 0) {
                iOooO0o4 = i3;
            }
            double d = iOooO0o3;
            double d2 = iOooO0o4 - 128;
            double d3 = iOooO0o - 128;
            iArr2[iOooO0o6] = OooO00o((byte) (255 - (iOooO0o2 & 255)), Math.max(0, Math.min((int) ((1.402d * d2) + d), 255)), Math.max(0, Math.min((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 255)), Math.max(0, Math.min((int) ((d3 * 1.772d) + d), 255)));
            i3 = 0;
            iOooO0o5 = iOooO0o5;
            iArrOooO0oo = iArrOooO0oo;
            i2 = 8;
        }
        return new oO00000(iOooO0o5, iArr, iArrOooO0oO, iArrOooO0oo);
    }

    public static oO0000O OooO0Oo(o000OOo0 o000ooo02) {
        byte[] bArr;
        int iOooO0o = o000ooo02.OooO0o(16);
        o000ooo02.OooOo0(4);
        int iOooO0o2 = o000ooo02.OooO0o(2);
        boolean zOooOo0o = o000ooo02.OooOo0o();
        o000ooo02.OooOo0(1);
        byte[] bArr2 = i80.f19998OooO0o;
        if (iOooO0o2 != 1) {
            if (iOooO0o2 == 0) {
                int iOooO0o3 = o000ooo02.OooO0o(16);
                int iOooO0o4 = o000ooo02.OooO0o(16);
                if (iOooO0o3 > 0) {
                    bArr2 = new byte[iOooO0o3];
                    af0.OooooO0(o000ooo02.f21727OooO0Oo == 0);
                    System.arraycopy(o000ooo02.f21725OooO0O0, o000ooo02.f21726OooO0OO, bArr2, 0, iOooO0o3);
                    o000ooo02.f21726OooO0OO += iOooO0o3;
                    o000ooo02.OooOo();
                }
                if (iOooO0o4 > 0) {
                    bArr = new byte[iOooO0o4];
                    af0.OooooO0(o000ooo02.f21727OooO0Oo == 0);
                    System.arraycopy(o000ooo02.f21725OooO0O0, o000ooo02.f21726OooO0OO, bArr, 0, iOooO0o4);
                    o000ooo02.f21726OooO0OO += iOooO0o4;
                    o000ooo02.OooOo();
                }
            }
            return new oO0000O(iOooO0o, zOooOo0o, bArr2, bArr);
        }
        o000ooo02.OooOo0(o000ooo02.OooO0o(8) * 16);
        bArr = bArr2;
        return new oO0000O(iOooO0o, zOooOo0o, bArr2, bArr);
    }

    public static byte[] OooO0o(int i, int i2, o000OOo0 o000ooo02) {
        byte[] bArr = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr[i3] = (byte) o000ooo02.OooO0o(i2);
        }
        return bArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:229:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x01d3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:254:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x01ff A[LOOP:3: B:227:0x0164->B:259:0x01ff, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:281:0x01f8 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void OooO0o0(byte[] r22, int[] r23, int r24, int r25, int r26, android.graphics.Paint r27, android.graphics.Canvas r28) {
        /*
            Method dump skipped, instructions count: 544
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.oO000O0O.OooO0o0(byte[], int[], int, int, int, android.graphics.Paint, android.graphics.Canvas):void");
    }

    public static int[] OooO0oO() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i = 1; i < 16; i++) {
            int i2 = i & 4;
            int i3 = i & 2;
            int i4 = i & 1;
            if (i < 8) {
                iArr[i] = OooO00o(255, 1 != i4 ? 0 : 255, i3 != 0 ? 255 : 0, i2 != 0 ? 255 : 0);
            } else {
                iArr[i] = OooO00o(255, 1 != i4 ? 0 : 127, i3 != 0 ? 127 : 0, i2 == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    public static int[] OooO0oo() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i = 0; i < 256; i++) {
            if (i < 8) {
                iArr[i] = OooO00o(63, 1 != (i & 1) ? 0 : 255, (i & 2) != 0 ? 255 : 0, (i & 4) == 0 ? 0 : 255);
            } else {
                int i2 = i & 136;
                if (i2 == 0) {
                    iArr[i] = OooO00o(255, (1 != (i & 1) ? 0 : 85) + ((i & 16) != 0 ? 170 : 0), ((i & 2) != 0 ? 85 : 0) + ((i & 32) != 0 ? 170 : 0), ((i & 4) == 0 ? 0 : 85) + ((i & 64) == 0 ? 0 : 170));
                } else if (i2 == 8) {
                    iArr[i] = OooO00o(127, (1 != (i & 1) ? 0 : 85) + ((i & 16) != 0 ? 170 : 0), ((i & 2) != 0 ? 85 : 0) + ((i & 32) != 0 ? 170 : 0), ((i & 4) == 0 ? 0 : 85) + ((i & 64) == 0 ? 0 : 170));
                } else if (i2 == 128) {
                    iArr[i] = OooO00o(255, (1 != (i & 1) ? 0 : 43) + 127 + ((i & 16) != 0 ? 85 : 0), ((i & 2) != 0 ? 43 : 0) + 127 + ((i & 32) != 0 ? 85 : 0), ((i & 4) == 0 ? 0 : 43) + 127 + ((i & 64) == 0 ? 0 : 85));
                } else if (i2 == 136) {
                    iArr[i] = OooO00o(255, (1 != (i & 1) ? 0 : 43) + ((i & 16) != 0 ? 85 : 0), ((i & 2) != 0 ? 43 : 0) + ((i & 32) != 0 ? 85 : 0), ((i & 4) == 0 ? 0 : 43) + ((i & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    @Override // com.google.android.gms.internal.ads.ooo0Oo0
    public void OooO0OO(int i, int i2, OooOOOO.OooO0O0 oooO0O0, byte[] bArr) {
        oO000O0 oo000o0;
        o0OOo000 o0ooo000;
        int i3;
        char c;
        char c2;
        char c3;
        int i4;
        int i5;
        oO000O0 oo000o02;
        Canvas canvas;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        oO0000o0 oo0000o0;
        int i11;
        int iOooO0o;
        int i12;
        int i13;
        boolean z = true;
        o000OOo0 o000ooo02 = new o000OOo0(bArr, i + i2);
        o000ooo02.OooOOoo(i);
        while (true) {
            int iOooO00o = o000ooo02.OooO00o();
            oo000o0 = (oO000O0) this.f22433OooOoOO;
            if (iOooO00o >= 48 && o000ooo02.OooO0o(8) == 15) {
                int iOooO0o2 = o000ooo02.OooO0o(8);
                int iOooO0o3 = o000ooo02.OooO0o(16);
                int iOooO0o4 = o000ooo02.OooO0o(16);
                int iOooO0OO = o000ooo02.OooO0OO() + iOooO0o4;
                if (iOooO0o4 * 8 > o000ooo02.OooO00o()) {
                    AbstractC1641hg.OooOOo0("DvbParser", "Data field length exceeds limit");
                    o000ooo02.OooOo0(o000ooo02.OooO00o());
                } else {
                    switch (iOooO0o2) {
                        case 16:
                            if (iOooO0o3 == oo000o0.f22417OooO00o) {
                                o0O00O o0o00o = oo000o0.f22416OooO;
                                o000ooo02.OooO0o(8);
                                int iOooO0o5 = o000ooo02.OooO0o(4);
                                int iOooO0o6 = o000ooo02.OooO0o(2);
                                o000ooo02.OooOo0(2);
                                SparseArray sparseArray = new SparseArray();
                                for (int i14 = iOooO0o4 - 2; i14 > 0; i14 -= 6) {
                                    int iOooO0o7 = o000ooo02.OooO0o(8);
                                    o000ooo02.OooOo0(8);
                                    sparseArray.put(iOooO0o7, new oO0000Oo(o000ooo02.OooO0o(16), o000ooo02.OooO0o(16)));
                                }
                                o0O00O o0o00o2 = new o0O00O();
                                o0o00o2.f21879OooOo0O = iOooO0o5;
                                o0o00o2.f21880OooOo0o = iOooO0o6;
                                o0o00o2.f21878OooOo = sparseArray;
                                if (iOooO0o6 != 0) {
                                    oo000o0.f22416OooO = o0o00o2;
                                    oo000o0.f22419OooO0OO.clear();
                                    oo000o0.f22420OooO0Oo.clear();
                                    oo000o0.f22422OooO0o0.clear();
                                    break;
                                } else if (o0o00o != null && o0o00o.f21879OooOo0O != iOooO0o5) {
                                    oo000o0.f22416OooO = o0o00o2;
                                    break;
                                }
                            }
                            break;
                        case 17:
                            o0O00O o0o00o3 = oo000o0.f22416OooO;
                            if (iOooO0o3 == oo000o0.f22417OooO00o && o0o00o3 != null) {
                                int iOooO0o8 = o000ooo02.OooO0o(8);
                                o000ooo02.OooOo0(4);
                                boolean zOooOo0o = o000ooo02.OooOo0o();
                                o000ooo02.OooOo0(3);
                                int iOooO0o9 = o000ooo02.OooO0o(16);
                                int iOooO0o10 = o000ooo02.OooO0o(16);
                                o000ooo02.OooO0o(3);
                                int iOooO0o11 = o000ooo02.OooO0o(3);
                                o000ooo02.OooOo0(2);
                                int iOooO0o12 = o000ooo02.OooO0o(8);
                                int iOooO0o13 = o000ooo02.OooO0o(8);
                                int iOooO0o14 = o000ooo02.OooO0o(4);
                                int iOooO0o15 = o000ooo02.OooO0o(2);
                                o000ooo02.OooOo0(2);
                                int i15 = iOooO0o4 - 10;
                                SparseArray sparseArray2 = new SparseArray();
                                while (i15 > 0) {
                                    int iOooO0o16 = o000ooo02.OooO0o(16);
                                    int iOooO0o17 = o000ooo02.OooO0o(2);
                                    o000ooo02.OooO0o(2);
                                    int iOooO0o18 = o000ooo02.OooO0o(12);
                                    o000ooo02.OooOo0(4);
                                    int iOooO0o19 = o000ooo02.OooO0o(12);
                                    int i16 = i15 - 6;
                                    if (iOooO0o17 == 1 || iOooO0o17 == 2) {
                                        o000ooo02.OooO0o(8);
                                        o000ooo02.OooO0o(8);
                                        i15 -= 8;
                                    } else {
                                        i15 = i16;
                                    }
                                    sparseArray2.put(iOooO0o16, new oO000(iOooO0o18, iOooO0o19));
                                }
                                oO0000o0 oo0000o02 = new oO0000o0(iOooO0o8, zOooOo0o, iOooO0o9, iOooO0o10, iOooO0o11, iOooO0o12, iOooO0o13, iOooO0o14, iOooO0o15, sparseArray2);
                                SparseArray sparseArray3 = oo000o0.f22419OooO0OO;
                                if (o0o00o3.f21880OooOo0o == 0 && (oo0000o0 = (oO0000o0) sparseArray3.get(iOooO0o8)) != null) {
                                    int i17 = 0;
                                    while (true) {
                                        SparseArray sparseArray4 = oo0000o0.f22415OooOO0;
                                        if (i17 < sparseArray4.size()) {
                                            oo0000o02.f22415OooOO0.put(sparseArray4.keyAt(i17), (oO000) sparseArray4.valueAt(i17));
                                            i17++;
                                        }
                                    }
                                }
                                sparseArray3.put(oo0000o02.f22407OooO00o, oo0000o02);
                                break;
                            }
                            break;
                        case 18:
                            if (iOooO0o3 == oo000o0.f22417OooO00o) {
                                oO00000 oo00000OooO0O0 = OooO0O0(o000ooo02, iOooO0o4);
                                oo000o0.f22420OooO0Oo.put(oo00000OooO0O0.f22390OooO00o, oo00000OooO0O0);
                                break;
                            } else if (iOooO0o3 == oo000o0.f22418OooO0O0) {
                                oO00000 oo00000OooO0O02 = OooO0O0(o000ooo02, iOooO0o4);
                                oo000o0.f22421OooO0o.put(oo00000OooO0O02.f22390OooO00o, oo00000OooO0O02);
                                break;
                            }
                            break;
                        case 19:
                            if (iOooO0o3 == oo000o0.f22417OooO00o) {
                                oO0000O oo0000oOooO0Oo = OooO0Oo(o000ooo02);
                                oo000o0.f22422OooO0o0.put(oo0000oOooO0Oo.f22400OooO00o, oo0000oOooO0Oo);
                                break;
                            } else if (iOooO0o3 == oo000o0.f22418OooO0O0) {
                                oO0000O oo0000oOooO0Oo2 = OooO0Oo(o000ooo02);
                                oo000o0.f22423OooO0oO.put(oo0000oOooO0Oo2.f22400OooO00o, oo0000oOooO0Oo2);
                                break;
                            }
                            break;
                        case 20:
                            if (iOooO0o3 == oo000o0.f22417OooO00o) {
                                o000ooo02.OooOo0(4);
                                boolean zOooOo0o2 = o000ooo02.OooOo0o();
                                o000ooo02.OooOo0(3);
                                int iOooO0o20 = o000ooo02.OooO0o(16);
                                int iOooO0o21 = o000ooo02.OooO0o(16);
                                if (zOooOo0o2) {
                                    int iOooO0o22 = o000ooo02.OooO0o(16);
                                    int iOooO0o23 = o000ooo02.OooO0o(16);
                                    int iOooO0o24 = o000ooo02.OooO0o(16);
                                    i11 = iOooO0o23;
                                    iOooO0o = o000ooo02.OooO0o(16);
                                    i13 = iOooO0o24;
                                    i12 = iOooO0o22;
                                } else {
                                    i11 = iOooO0o20;
                                    iOooO0o = iOooO0o21;
                                    i12 = 0;
                                    i13 = 0;
                                }
                                oo000o0.f22424OooO0oo = new oO00000o(iOooO0o20, iOooO0o21, i12, i11, i13, iOooO0o);
                                break;
                            }
                            break;
                    }
                    o000ooo02.OooOo0O(iOooO0OO - o000ooo02.OooO0OO());
                }
            }
        }
        o0O00O o0o00o4 = oo000o0.f22416OooO;
        if (o0o00o4 == null) {
            pm0 pm0Var = rm0.f23913OooOo0o;
            o0ooo000 = new o0OOo000(gn0.f19388OooOoO, -9223372036854775807L, -9223372036854775807L);
        } else {
            oO00000o oo00000o = oo000o0.f22424OooO0oo;
            if (oo00000o == null) {
                oo00000o = (oO00000o) this.f22432OooOoO0;
            }
            Bitmap bitmap = (Bitmap) this.f22434OooOoo0;
            Canvas canvas2 = (Canvas) this.f22428OooOo;
            if (bitmap == null || oo00000o.f22394OooO00o + 1 != bitmap.getWidth() || oo00000o.f22395OooO0O0 + 1 != ((Bitmap) this.f22434OooOoo0).getHeight()) {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(oo00000o.f22394OooO00o + 1, oo00000o.f22395OooO0O0 + 1, Bitmap.Config.ARGB_8888);
                this.f22434OooOoo0 = bitmapCreateBitmap;
                canvas2.setBitmap(bitmapCreateBitmap);
            }
            ArrayList arrayList = new ArrayList();
            int i18 = 0;
            while (true) {
                SparseArray sparseArray5 = (SparseArray) o0o00o4.f21878OooOo;
                if (i18 < sparseArray5.size()) {
                    canvas2.save();
                    oO0000Oo oo0000oo = (oO0000Oo) sparseArray5.valueAt(i18);
                    oO0000o0 oo0000o03 = (oO0000o0) oo000o0.f22419OooO0OO.get(sparseArray5.keyAt(i18));
                    int i19 = oo0000oo.f22404OooO00o + oo00000o.f22396OooO0OO;
                    int i20 = oo0000oo.f22405OooO0O0 + oo00000o.f22399OooO0o0;
                    int iMin = Math.min(oo0000o03.f22409OooO0OO + i19, oo00000o.f22397OooO0Oo);
                    int i21 = oo0000o03.f22410OooO0Oo;
                    int i22 = i20 + i21;
                    boolean z2 = z;
                    canvas2.clipRect(i19, i20, iMin, Math.min(i22, oo00000o.f22398OooO0o));
                    SparseArray sparseArray6 = oo000o0.f22420OooO0Oo;
                    int i23 = oo0000o03.f22411OooO0o;
                    oO00000 oo00000 = (oO00000) sparseArray6.get(i23);
                    if (oo00000 == null && (oo00000 = (oO00000) oo000o0.f22421OooO0o.get(i23)) == null) {
                        oo00000 = (oO00000) this.f22431OooOoO;
                    }
                    int i24 = 0;
                    while (true) {
                        SparseArray sparseArray7 = oo0000o03.f22415OooOO0;
                        if (i24 < sparseArray7.size()) {
                            int iKeyAt = sparseArray7.keyAt(i24);
                            oO000 oo000 = (oO000) sparseArray7.valueAt(i24);
                            o0O00O o0o00o5 = o0o00o4;
                            oO0000O oo0000o = (oO0000O) oo000o0.f22422OooO0o0.get(iKeyAt);
                            if (oo0000o == null) {
                                oo0000o = (oO0000O) oo000o0.f22423OooO0oO.get(iKeyAt);
                            }
                            if (oo0000o != null) {
                                Paint paint = oo0000o.f22401OooO0O0 ? null : (Paint) this.f22429OooOo0O;
                                i5 = i18;
                                int i25 = oo000.f22388OooO00o + i19;
                                int i26 = oo000.f22389OooO0O0 + i20;
                                int i27 = i19;
                                int i28 = oo0000o03.f22412OooO0o0;
                                canvas = canvas2;
                                int i29 = i20;
                                int[] iArr = i28 == 3 ? oo00000.f22393OooO0Oo : i28 == 2 ? oo00000.f22392OooO0OO : oo00000.f22391OooO0O0;
                                i7 = i27;
                                i8 = i24;
                                oo000o02 = oo000o0;
                                i10 = i22;
                                Paint paint2 = paint;
                                i6 = i29;
                                i9 = i21;
                                OooO0o0(oo0000o.f22402OooO0OO, iArr, i28, i25, i26, paint2, canvas);
                                OooO0o0(oo0000o.f22403OooO0Oo, iArr, i28, i25, i26 + 1, paint2, canvas);
                            } else {
                                i5 = i18;
                                oo000o02 = oo000o0;
                                canvas = canvas2;
                                i6 = i20;
                                i7 = i19;
                                i8 = i24;
                                i9 = i21;
                                i10 = i22;
                            }
                            i24 = i8 + 1;
                            i19 = i7;
                            i20 = i6;
                            i22 = i10;
                            i21 = i9;
                            canvas2 = canvas;
                            o0o00o4 = o0o00o5;
                            i18 = i5;
                            oo000o0 = oo000o02;
                        } else {
                            o0O00O o0o00o6 = o0o00o4;
                            int i30 = i18;
                            oO000O0 oo000o03 = oo000o0;
                            Canvas canvas3 = canvas2;
                            int i31 = i20;
                            int i32 = i19;
                            int i33 = i21;
                            int i34 = i22;
                            float f = i31;
                            float f2 = i32;
                            boolean z3 = oo0000o03.f22408OooO0O0;
                            int i35 = oo0000o03.f22409OooO0OO;
                            if (z3) {
                                int i36 = oo0000o03.f22412OooO0o0;
                                if (i36 == 3) {
                                    i4 = oo00000.f22393OooO0Oo[oo0000o03.f22413OooO0oO];
                                    c3 = 2;
                                } else {
                                    c3 = 2;
                                    i4 = i36 == 2 ? oo00000.f22392OooO0OO[oo0000o03.f22414OooO0oo] : oo00000.f22391OooO0O0[oo0000o03.f22406OooO];
                                }
                                Paint paint3 = (Paint) this.f22430OooOo0o;
                                paint3.setColor(i4);
                                float f3 = i32 + i35;
                                float f4 = i34;
                                c = 3;
                                c2 = c3;
                                i3 = i35;
                                canvas2 = canvas3;
                                canvas2.drawRect(f2, f, f3, f4, paint3);
                            } else {
                                i3 = i35;
                                canvas2 = canvas3;
                                c = 3;
                                c2 = 2;
                            }
                            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap((Bitmap) this.f22434OooOoo0, i32, i31, i3, i33);
                            float f5 = oo00000o.f22394OooO00o;
                            float f6 = oo00000o.f22395OooO0O0;
                            arrayList.add(new C2206wr(null, null, null, bitmapCreateBitmap2, f / f6, 0, 0, f2 / f5, 0, Integer.MIN_VALUE, -3.4028235E38f, i3 / f5, i33 / f6, Integer.MIN_VALUE, 0.0f));
                            canvas2.drawColor(0, PorterDuff.Mode.CLEAR);
                            canvas2.restore();
                            i18 = i30 + 1;
                            z = z2;
                            o0o00o4 = o0o00o6;
                            oo000o0 = oo000o03;
                        }
                    }
                } else {
                    o0ooo000 = new o0OOo000(arrayList, -9223372036854775807L, -9223372036854775807L);
                }
            }
        }
        oooO0O0.mo13701zza(o0ooo000);
    }

    @Override // com.google.android.gms.internal.ads.kp0
    /* renamed from: zza */
    public o00000oO.OooOOO mo13700zza() {
        zzv.zzA();
        Oooo0oO.o0O0O00 o0o0o00 = new Oooo0oO.o0O0O00(0, 0, 0);
        C1998r4 c1998r4 = new C1998r4();
        InterfaceC1722jo interfaceC1722joOooO00o = C2055so.OooO00o(o0o0o00, (Context) this.f22429OooOo0O, (VersionInfoParcel) this.f22428OooOo, (zza) this.f22432OooOoO0, (C1663i1) this.f22430OooOo0o, c1998r4, null, (x50) this.f22431OooOoO, null, null, (xd0) this.f22433OooOoOO, null, "", false, false);
        C1776l4 c1776l4 = new C1776l4(interfaceC1722joOooO00o);
        interfaceC1722joOooO00o.zzN().f21533OooOoo0 = new C1981qo(c1776l4, 0);
        interfaceC1722joOooO00o.loadUrl((String) this.f22434OooOoo0);
        return c1776l4;
    }

    public oO000O0O() {
        this.f22433OooOoOO = new SimpleArrayMap();
        this.f22434OooOoo0 = new SimpleArrayMap();
    }

    public oO000O0O(C1595g7 c1595g7, WebView webView, String str, String str2, xg0 xg0Var) {
        this.f22428OooOo = new ArrayList();
        this.f22432OooOoO0 = new HashMap();
        this.f22429OooOo0O = c1595g7;
        this.f22430OooOo0o = webView;
        this.f22434OooOoo0 = xg0Var;
        this.f22433OooOoOO = str;
        this.f22431OooOoO = str2;
    }

    public oO000O0O(List list) {
        r40 r40Var = new r40((byte[]) list.get(0));
        int iOooOoO = r40Var.OooOoO();
        int iOooOoO2 = r40Var.OooOoO();
        Paint paint = new Paint();
        this.f22429OooOo0O = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.f22430OooOo0o = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.f22428OooOo = new Canvas();
        this.f22432OooOoO0 = new oO00000o(719, 575, 0, 719, 0, 575);
        this.f22431OooOoO = new oO00000(0, new int[]{0, -1, ViewCompat.MEASURED_STATE_MASK, -8421505}, OooO0oO(), OooO0oo());
        this.f22433OooOoOO = new oO000O0(iOooOoO, iOooOoO2);
    }
}
