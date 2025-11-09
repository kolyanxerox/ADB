package com.ironsource.adqualitysdk.sdk.p009i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.internal.ads.AbstractC2183w4;
import com.ironsource.InterfaceC3173h3;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ed */
/* loaded from: classes2.dex */
public final class C2754ed extends C2752eb {

    /* renamed from: ﺙ */
    private static int f6231 = 0;

    /* renamed from: ﻏ */
    private static int f6232 = 1;

    /* renamed from: ﻛ */
    private static char f6233 = 0;

    /* renamed from: ｋ */
    private static long f6234 = 0;

    /* renamed from: ﾒ */
    private static int f6235 = -1891578488;

    /* renamed from: ﻐ */
    private AbstractC2755ee[] f6236;

    /* renamed from: ﾇ */
    private AbstractC2755ee f6237;

    public C2754ed(AbstractC2755ee abstractC2755ee, String str, List<AbstractC2755ee> list, List<AbstractC2755ee> list2, C2736dm c2736dm) {
        super(str, list2, c2736dm);
        this.f6237 = abstractC2755ee;
        if (list != null) {
            AbstractC2755ee[] abstractC2755eeArr = new AbstractC2755ee[list.size()];
            this.f6236 = abstractC2755eeArr;
            list.toArray(abstractC2755eeArr);
        }
    }

    /* renamed from: ﾇ */
    private String m6755() {
        if (this.f6236 == null) {
            f6231 = (f6232 + 49) % 128;
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(m6756(View.MeasureSpec.getMode(0) - 112945020, (char) (22203 - AndroidCharacter.getMirror('0')), "萟䒘诹\ue056", "ⴉ", "\u0000\u0000\u0000\u0000").intern());
        sb.append(AbstractC2755ee.m6758(this.f6236));
        String strOooOO0O = AbstractC2183w4.OooOO0O(sb, m6756((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 682783218, (char) (20749 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), "ྏ䶎\u0cd7ꙑ", "ਞ", "\u0000\u0000\u0000\u0000"));
        f6232 = (f6231 + 31) % 128;
        return strOooOO0O;
    }

    /* renamed from: ﾒ */
    private static String m6756(int i, char c, String str, String str2, String str3) {
        String str4;
        char[] charArray = str3;
        if (str3 != null) {
            charArray = str3.toCharArray();
        }
        char[] cArr = charArray;
        char[] charArray2 = str2;
        if (str2 != null) {
            charArray2 = str2.toCharArray();
        }
        char[] cArr2 = charArray2;
        char[] charArray3 = str;
        if (str != null) {
            charArray3 = str.toCharArray();
        }
        char[] cArr3 = charArray3;
        synchronized (C2885j.f6936) {
            try {
                char[] cArr4 = (char[]) cArr3.clone();
                char[] cArr5 = (char[]) cArr.clone();
                cArr4[0] = (char) (c ^ cArr4[0]);
                cArr5[2] = (char) (cArr5[2] + ((char) i));
                int length = cArr2.length;
                char[] cArr6 = new char[length];
                C2885j.f6934 = 0;
                while (true) {
                    int i2 = C2885j.f6934;
                    if (i2 < length) {
                        int i3 = (i2 + 2) % 4;
                        int i4 = (i2 + 3) % 4;
                        int i5 = cArr4[i2 % 4] * 32718;
                        char c2 = cArr5[i3];
                        char c3 = (char) ((i5 + c2) % 65535);
                        C2885j.f6935 = c3;
                        cArr5[i4] = (char) (((cArr4[i4] * 32718) + c2) / 65535);
                        cArr4[i4] = c3;
                        int i6 = C2885j.f6934;
                        cArr6[i6] = (char) ((((c3 ^ cArr2[i6]) ^ f6234) ^ f6235) ^ f6233);
                        C2885j.f6934 = i6 + 1;
                    } else {
                        str4 = new String(cArr6);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str4;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.C2752eb
    public final boolean equals(Object obj) {
        if (this == obj) {
            f6232 = (f6231 + 77) % 128;
            return true;
        }
        if (obj == null || C2754ed.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        C2754ed c2754ed = (C2754ed) obj;
        AbstractC2755ee abstractC2755ee = this.f6237;
        if (abstractC2755ee == null ? c2754ed.f6237 != null : !abstractC2755ee.equals(c2754ed.f6237)) {
            return false;
        }
        AbstractC2755ee[] abstractC2755eeArr = this.f6236;
        if (abstractC2755eeArr == null) {
            return c2754ed.f6236 == null;
        }
        int i = f6232 + 17;
        f6231 = i % 128;
        int i2 = i % 2;
        AbstractC2755ee[] abstractC2755eeArr2 = c2754ed.f6236;
        if (i2 == 0) {
            return abstractC2755eeArr.equals(abstractC2755eeArr2);
        }
        int i3 = 26 / 0;
        return abstractC2755eeArr.equals(abstractC2755eeArr2);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0022 A[PHI: r0
  0x0022: PHI (r0v5 int) = (r0v4 int), (r0v14 int) binds: [B:28:0x0020, B:25:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x003c A[PHI: r0
  0x003c: PHI (r0v12 int) = (r0v4 int), (r0v14 int) binds: [B:28:0x0020, B:25:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.ironsource.adqualitysdk.sdk.p009i.C2752eb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int hashCode() {
        /*
            r4 = this;
            int r0 = com.ironsource.adqualitysdk.sdk.p009i.C2754ed.f6231
            int r0 = r0 + 55
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.p009i.C2754ed.f6232 = r1
            int r0 = r0 % 2
            r1 = 0
            if (r0 != 0) goto L18
            int r0 = super.hashCode()
            int r0 = r0 + (-46)
            com.ironsource.adqualitysdk.sdk.i.ee r2 = r4.f6237
            if (r2 == 0) goto L3c
            goto L22
        L18:
            int r0 = super.hashCode()
            int r0 = r0 * 31
            com.ironsource.adqualitysdk.sdk.i.ee r2 = r4.f6237
            if (r2 == 0) goto L3c
        L22:
            int r2 = com.ironsource.adqualitysdk.sdk.p009i.C2754ed.f6232
            int r2 = r2 + 125
            int r3 = r2 % 128
            com.ironsource.adqualitysdk.sdk.p009i.C2754ed.f6231 = r3
            int r2 = r2 % 2
            if (r2 != 0) goto L35
            com.ironsource.adqualitysdk.sdk.i.ee r2 = r4.f6237
            int r2 = r2.hashCode()
            goto L3d
        L35:
            com.ironsource.adqualitysdk.sdk.i.ee r0 = r4.f6237
            r0.hashCode()
            r0 = 0
            throw r0
        L3c:
            r2 = r1
        L3d:
            int r0 = r0 + r2
            int r0 = r0 * 31
            com.ironsource.adqualitysdk.sdk.i.ee[] r2 = r4.f6236
            if (r2 == 0) goto L48
            int r1 = r2.hashCode()
        L48:
            int r0 = r0 + r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.p009i.C2754ed.hashCode():int");
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.C2752eb
    public final String toString() {
        f6232 = (f6231 + 31) % 128;
        String strMo6752 = mo6752(m6750());
        f6232 = (f6231 + 71) % 128;
        return strMo6752;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.C2752eb, com.ironsource.adqualitysdk.sdk.p009i.AbstractC2755ee
    /* renamed from: ｋ */
    public final C2744du mo6724(C2741dr c2741dr, C2712cp c2712cp) {
        Method methodM7400;
        List<Object> listM6749 = m6749(c2741dr, c2712cp);
        AbstractC2755ee abstractC2755ee = this.f6237;
        if ((abstractC2755ee instanceof C2762el) && ((C2762el) abstractC2755ee).m6777().equals(m6756(View.resolveSize(0, 0) + 579516372, (char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 53322), "퐆誷䨢\ue3d0", "⻚틂慻\u17df垷", "\u0000\u0000\u0000\u0000").intern())) {
            return c2712cp.m6300().m6926().m6927(m6751()).m6711(c2741dr, c2712cp, listM6749).m6719(false);
        }
        Object objM6717 = this.f6237.m6760(c2741dr, c2712cp).m6717();
        if (objM6717 instanceof InterfaceC2707ck) {
            return new C2744du(((InterfaceC2707ck) objM6717).mo5466(m6751(), listM6749, c2712cp.m6289()));
        }
        if (objM6717 instanceof InterfaceC2708cl) {
            String strM6751 = m6751();
            c2712cp.m6289();
            return new C2744du(((InterfaceC2708cl) objM6717).mo6198(c2712cp, strM6751, listM6749, c2741dr));
        }
        if (objM6717 instanceof C2712cp) {
            synchronized (objM6717) {
                try {
                    C2712cp c2712cp2 = (C2712cp) objM6717;
                    C2743dt c2743dtM6297 = c2712cp2.m6297(m6751());
                    if (c2743dtM6297 != null) {
                        return c2743dtM6297.m6711(c2712cp2.m6288(), c2712cp2, listM6749).m6719(false);
                    }
                    String strM6290 = c2712cp.m6290();
                    StringBuilder sb = new StringBuilder();
                    sb.append(m6756(Color.blue(0) + 270451464, (char) (ViewConfiguration.getWindowTouchSlop() >> 8), "ࢧểȐ쯐", "孱㻼參␄컕ﺴ爯ﲗ弽₅쇭㆛\ue256㧖\ue581膲譮譨༮㶠컞몛挎", "\u0000\u0000\u0000\u0000").intern());
                    sb.append(m6751());
                    C2713cq.m6350(strM6290, sb.toString(), new NoSuchMethodException());
                } finally {
                }
            }
        }
        try {
            AbstractC2755ee[] abstractC2755eeArr = this.f6236;
            if (abstractC2755eeArr != null) {
                methodM7400 = C2911jz.m7396(objM6717, m6751(), m6754(abstractC2755eeArr, c2741dr, c2712cp));
            } else {
                methodM7400 = C2911jz.m7400(objM6717, m6751(), listM6749);
            }
            if (methodM7400 != null) {
                return new C2744du(methodM7400.invoke(objM6717, listM6749.toArray()));
            }
            listM6749.add(0, objM6717);
            C2728de c2728deM6287 = c2712cp.m6287();
            String strM67512 = m6751();
            c2712cp.m6289();
            return new C2744du(c2728deM6287.mo6198(c2712cp, strM67512, listM6749, c2741dr));
        } catch (IllegalAccessException e) {
            String strM62902 = c2712cp.m6290();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m6756(270451464 - TextUtils.getOffsetBefore("", 0), (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), "ࢧểȐ쯐", "孱㻼參␄컕ﺴ爯ﲗ弽₅쇭㆛\ue256㧖\ue581膲譮譨༮㶠컞몛挎", "\u0000\u0000\u0000\u0000").intern());
            sb2.append(this);
            C2713cq.m6350(strM62902, sb2.toString(), e);
            return null;
        } catch (IllegalArgumentException e2) {
            String strM62903 = c2712cp.m6290();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(m6756(270451464 - TextUtils.getTrimmedLength(""), (char) KeyEvent.getDeadChar(0, 0), "ࢧểȐ쯐", "孱㻼參␄컕ﺴ爯ﲗ弽₅쇭㆛\ue256㧖\ue581膲譮譨༮㶠컞몛挎", "\u0000\u0000\u0000\u0000").intern());
            sb3.append(this);
            C2713cq.m6350(strM62903, sb3.toString(), e2);
            return null;
        } catch (Exception e3) {
            throw new RuntimeException(e3);
        }
    }

    /* renamed from: ｋ */
    private static List<Class> m6754(AbstractC2755ee[] abstractC2755eeArr, C2741dr c2741dr, C2712cp c2712cp) {
        ArrayList arrayList = new ArrayList();
        int length = abstractC2755eeArr.length;
        int i = 0;
        while (i < length) {
            f6231 = (f6232 + 41) % 128;
            arrayList.add((Class) abstractC2755eeArr[i].m6760(c2741dr, c2712cp).m6717());
            i++;
            f6231 = (f6232 + InterfaceC3173h3.d.b.f8826i) % 128;
        }
        int i2 = f6231 + 29;
        f6232 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 75 / 0;
        }
        return arrayList;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.C2752eb
    /* renamed from: ｋ */
    public final String mo6752(Object[] objArr) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f6237);
        sb.append(m6756(ImageFormat.getBitsPerPixel(0) + 464346693, (char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 36009), "䒙굞ꤛ첌", "敳", "\u0000\u0000\u0000\u0000").intern());
        sb.append(m6751());
        sb.append(m6755());
        sb.append(m6756(Color.blue(0) - 957114864, (char) (48544 - ExpandableListView.getPackedPositionType(0L)), "ဧ\uf396ꃆ溽", "䗴", "\u0000\u0000\u0000\u0000").intern());
        sb.append(AbstractC2755ee.m6758(objArr));
        String strOooOO0O = AbstractC2183w4.OooOO0O(sb, m6756((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 360654155, (char) ((KeyEvent.getMaxKeyCode() >> 16) + 62094), "䬶缥踕磲", "\uf1b2", "\u0000\u0000\u0000\u0000"));
        int i = f6231 + InterfaceC3173h3.d.b.f8821d;
        f6232 = i % 128;
        if (i % 2 != 0) {
            return strOooOO0O;
        }
        throw null;
    }
}
