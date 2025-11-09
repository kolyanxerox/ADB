package com.ironsource.adqualitysdk.sdk.p009i;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.internal.ads.AbstractC2183w4;
import com.ironsource.InterfaceC3173h3;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.eb */
/* loaded from: classes2.dex */
public class C2752eb extends AbstractC2755ee {

    /* renamed from: ﮐ */
    private static int f6219 = 1;

    /* renamed from: ﱟ */
    private static int f6220 = 0;

    /* renamed from: ﱡ */
    private static boolean f6221 = true;

    /* renamed from: ｋ */
    private static boolean f6222 = true;

    /* renamed from: ﾇ */
    private static char[] f6223 = {400, 403, 395, 375, 374, 368, 339, 332, 333};

    /* renamed from: ﾒ */
    private static int f6224 = 292;

    /* renamed from: ﻐ */
    private String f6225;

    /* renamed from: ﻛ */
    private AbstractC2755ee[] f6226;

    public C2752eb(String str, List<AbstractC2755ee> list, C2736dm c2736dm) {
        super(c2736dm);
        this.f6225 = C2746dw.m6725(str);
        AbstractC2755ee[] abstractC2755eeArr = new AbstractC2755ee[list.size()];
        this.f6226 = abstractC2755eeArr;
        list.toArray(abstractC2755eeArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x001d, code lost:
    
        if (getClass() != r5.getClass()) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0028, code lost:
    
        if (getClass() != r5.getClass()) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x002b, code lost:
    
        r5 = (com.ironsource.adqualitysdk.sdk.p009i.C2752eb) r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0035, code lost:
    
        if (r4.f6225.equals(r5.f6225) != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0037, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0038, code lost:
    
        r5 = java.util.Arrays.equals(r4.f6226, r5.f6226);
        r0 = com.ironsource.adqualitysdk.sdk.p009i.C2752eb.f6220 + 87;
        com.ironsource.adqualitysdk.sdk.p009i.C2752eb.f6219 = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x004a, code lost:
    
        if ((r0 % 2) == 0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x004c, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x004e, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            if (r4 != r5) goto L4
            r5 = 1
            return r5
        L4:
            r0 = 0
            if (r5 == 0) goto L4f
            int r1 = com.ironsource.adqualitysdk.sdk.p009i.C2752eb.f6220
            int r1 = r1 + 115
            int r2 = r1 % 128
            com.ironsource.adqualitysdk.sdk.p009i.C2752eb.f6219 = r2
            int r1 = r1 % 2
            if (r1 != 0) goto L20
            java.lang.Class r1 = r4.getClass()
            java.lang.Class r2 = r5.getClass()
            r3 = 6
            int r3 = r3 / r0
            if (r1 == r2) goto L2b
            goto L4f
        L20:
            java.lang.Class r1 = r4.getClass()
            java.lang.Class r2 = r5.getClass()
            if (r1 == r2) goto L2b
            goto L4f
        L2b:
            com.ironsource.adqualitysdk.sdk.i.eb r5 = (com.ironsource.adqualitysdk.sdk.p009i.C2752eb) r5
            java.lang.String r1 = r4.f6225
            java.lang.String r2 = r5.f6225
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L38
            return r0
        L38:
            com.ironsource.adqualitysdk.sdk.i.ee[] r0 = r4.f6226
            com.ironsource.adqualitysdk.sdk.i.ee[] r5 = r5.f6226
            boolean r5 = java.util.Arrays.equals(r0, r5)
            int r0 = com.ironsource.adqualitysdk.sdk.p009i.C2752eb.f6220
            int r0 = r0 + 87
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.p009i.C2752eb.f6219 = r1
            int r0 = r0 % 2
            if (r0 == 0) goto L4d
            return r5
        L4d:
            r5 = 0
            throw r5
        L4f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.p009i.C2752eb.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int iHashCode;
        int i = f6219;
        f6220 = (i + 85) % 128;
        String str = this.f6225;
        if (str != null) {
            f6220 = (i + 27) % 128;
            iHashCode = str.hashCode();
        } else {
            iHashCode = 0;
        }
        int iHashCode2 = Arrays.hashCode(this.f6226) + (iHashCode * 31);
        int i2 = f6220 + InterfaceC3173h3.d.b.f8826i;
        f6219 = i2 % 128;
        if (i2 % 2 != 0) {
            return iHashCode2;
        }
        throw null;
    }

    public String toString() {
        int i = f6220 + InterfaceC3173h3.d.b.f8819b;
        f6219 = i % 128;
        if (i % 2 == 0) {
            mo6752(this.f6226);
            throw null;
        }
        String strMo6752 = mo6752(this.f6226);
        int i2 = f6220 + 19;
        f6219 = i2 % 128;
        if (i2 % 2 != 0) {
            return strMo6752;
        }
        throw null;
    }

    /* renamed from: ﻐ */
    public final AbstractC2755ee[] m6750() {
        int i = (f6220 + 35) % 128;
        f6219 = i;
        AbstractC2755ee[] abstractC2755eeArr = this.f6226;
        f6220 = (i + InterfaceC3173h3.d.b.f8821d) % 128;
        return abstractC2755eeArr;
    }

    /* renamed from: ﻛ */
    public final String m6751() {
        int i = f6220;
        int i2 = i + 15;
        f6219 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.f6225;
        f6219 = (i + 65) % 128;
        return str;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2755ee
    /* renamed from: ｋ */
    public C2744du mo6724(C2741dr c2741dr, C2712cp c2712cp) {
        f6220 = (f6219 + 61) % 128;
        List<Object> listM6749 = m6749(c2741dr, c2712cp);
        if (!m6751().equals(m6748(null, null, ExpandableListView.getPackedPositionGroup(0L) + 127, "\u0083\u0082\u0081").intern())) {
            try {
                return new C2744du(((C2743dt) c2741dr.m6658(m6751())).m6711(c2741dr, c2712cp, listM6749));
            } catch (Exception unused) {
                if (c2712cp.m6300().m6927(m6751()) != null) {
                    return c2712cp.m6300().m6927(m6751()).m6711(c2741dr, c2712cp, listM6749).m6719(false);
                }
                C2728de c2728deM6287 = c2712cp.m6287();
                String strM6751 = m6751();
                c2712cp.m6289();
                C2744du c2744du = new C2744du(c2728deM6287.mo6198(c2712cp, strM6751, listM6749, c2741dr));
                int i = f6220 + 5;
                f6219 = i % 128;
                if (i % 2 != 0) {
                    return c2744du;
                }
                throw null;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(m6748(null, null, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 127, "\u0087\u0086\u0085\u0084").intern());
        sb.append(c2712cp.m6290());
        String string = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(listM6749.get(0));
        C2921n.m7509(string, sb2.toString());
        C2744du c2744du2 = new C2744du(null);
        int i2 = f6220 + 5;
        f6219 = i2 % 128;
        if (i2 % 2 != 0) {
            return c2744du2;
        }
        throw null;
    }

    /* renamed from: ﻐ */
    public final List<Object> m6749(C2741dr c2741dr, C2712cp c2712cp) {
        ArrayList arrayList = new ArrayList();
        for (AbstractC2755ee abstractC2755ee : this.f6226) {
            f6220 = (f6219 + 79) % 128;
            arrayList.add(abstractC2755ee.m6760(c2741dr, c2712cp).m6717());
        }
        int i = f6220 + 1;
        f6219 = i % 128;
        if (i % 2 != 0) {
            return arrayList;
        }
        throw null;
    }

    /* renamed from: ﻐ */
    private static String m6748(String str, int[] iArr, int i, String str2) throws UnsupportedEncodingException {
        byte[] bytes = str2;
        if (str2 != null) {
            bytes = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr = bytes;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (C2922o.f7244) {
            try {
                char[] cArr2 = f6223;
                int i2 = f6224;
                if (f6221) {
                    int length = bArr.length;
                    C2922o.f7245 = length;
                    char[] cArr3 = new char[length];
                    C2922o.f7246 = 0;
                    while (C2922o.f7246 < C2922o.f7245) {
                        int i3 = C2922o.f7246;
                        int i4 = C2922o.f7245 - 1;
                        int i5 = C2922o.f7246;
                        cArr3[i3] = (char) (cArr2[bArr[i4 - i5] + i] - i2);
                        C2922o.f7246 = i5 + 1;
                    }
                    return new String(cArr3);
                }
                if (f6222) {
                    int length2 = cArr.length;
                    C2922o.f7245 = length2;
                    char[] cArr4 = new char[length2];
                    C2922o.f7246 = 0;
                    while (C2922o.f7246 < C2922o.f7245) {
                        int i6 = C2922o.f7246;
                        int i7 = C2922o.f7245 - 1;
                        int i8 = C2922o.f7246;
                        cArr4[i6] = (char) (cArr2[cArr[i7 - i8] - i] - i2);
                        C2922o.f7246 = i8 + 1;
                    }
                    return new String(cArr4);
                }
                int length3 = iArr.length;
                C2922o.f7245 = length3;
                char[] cArr5 = new char[length3];
                C2922o.f7246 = 0;
                while (C2922o.f7246 < C2922o.f7245) {
                    int i9 = C2922o.f7246;
                    int i10 = C2922o.f7245 - 1;
                    int i11 = C2922o.f7246;
                    cArr5[i9] = (char) (cArr2[iArr[i10 - i11] - i] - i2);
                    C2922o.f7246 = i11 + 1;
                }
                return new String(cArr5);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: ｋ */
    public String mo6752(Object[] objArr) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f6225);
        sb.append(m6748(null, null, TextUtils.getOffsetBefore("", 0) + 127, "\u0088").intern());
        sb.append(AbstractC2755ee.m6758(objArr));
        String strOooOO0O = AbstractC2183w4.OooOO0O(sb, m6748(null, null, View.MeasureSpec.getSize(0) + 127, "\u0089"));
        int i = f6220 + 39;
        f6219 = i % 128;
        if (i % 2 != 0) {
            return strOooOO0O;
        }
        throw null;
    }
}
