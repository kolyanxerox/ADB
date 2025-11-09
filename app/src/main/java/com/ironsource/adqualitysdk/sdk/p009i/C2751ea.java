package com.ironsource.adqualitysdk.sdk.p009i;

import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.ironsource.InterfaceC3173h3;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ea */
/* loaded from: classes2.dex */
public final class C2751ea extends AbstractC2755ee {

    /* renamed from: ﻏ */
    private static int f6213 = 1;

    /* renamed from: ﾇ */
    private static int f6216;

    /* renamed from: ﻐ */
    private AbstractC2755ee f6217;

    /* renamed from: ﾒ */
    private String f6218;

    /* renamed from: ｋ */
    private static char[] f6215 = {'.'};

    /* renamed from: ﻛ */
    private static long f6214 = -4155701035263706019L;

    public C2751ea(AbstractC2755ee abstractC2755ee, String str, C2736dm c2736dm) {
        super(c2736dm);
        this.f6217 = abstractC2755ee;
        this.f6218 = str;
    }

    /* renamed from: ﻐ */
    private static String m6747(int i, int i2, char c) {
        String str;
        synchronized (C2642a.f4435) {
            try {
                char[] cArr = new char[i];
                C2642a.f4436 = 0;
                while (true) {
                    int i3 = C2642a.f4436;
                    if (i3 < i) {
                        cArr[i3] = (char) ((f6215[i2 + i3] ^ (i3 * f6214)) ^ c);
                        C2642a.f4436 = i3 + 1;
                    } else {
                        str = new String(cArr);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x003d, code lost:
    
        if (r2.equals(r5.f6217) == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0042, code lost:
    
        if (r5.f6217 != null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0044, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0045, code lost:
    
        r2 = r4.f6218;
        r5 = r5.f6218;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0049, code lost:
    
        if (r2 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004f, code lost:
    
        return r2.equals(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0050, code lost:
    
        if (r5 != null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0052, code lost:
    
        com.ironsource.adqualitysdk.sdk.p009i.C2751ea.f6216 = (com.ironsource.adqualitysdk.sdk.p009i.C2751ea.f6213 + 19) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005a, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005b, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            r1 = 0
            if (r4 != r5) goto L12
            int r5 = com.ironsource.adqualitysdk.sdk.p009i.C2751ea.f6213
            int r5 = r5 + 27
            int r2 = r5 % 128
            com.ironsource.adqualitysdk.sdk.p009i.C2751ea.f6216 = r2
            int r5 = r5 % 2
            if (r5 == 0) goto L11
            return r1
        L11:
            return r0
        L12:
            if (r5 == 0) goto L5e
            int r2 = com.ironsource.adqualitysdk.sdk.p009i.C2751ea.f6216
            int r2 = r2 + 5
            int r3 = r2 % 128
            com.ironsource.adqualitysdk.sdk.p009i.C2751ea.f6213 = r3
            int r2 = r2 % 2
            if (r2 == 0) goto L5c
            java.lang.Class r2 = r5.getClass()
            java.lang.Class<com.ironsource.adqualitysdk.sdk.i.ea> r3 = com.ironsource.adqualitysdk.sdk.p009i.C2751ea.class
            if (r3 == r2) goto L29
            goto L5e
        L29:
            com.ironsource.adqualitysdk.sdk.i.ea r5 = (com.ironsource.adqualitysdk.sdk.p009i.C2751ea) r5
            com.ironsource.adqualitysdk.sdk.i.ee r2 = r4.f6217
            if (r2 == 0) goto L40
            int r3 = com.ironsource.adqualitysdk.sdk.p009i.C2751ea.f6213
            int r3 = r3 + 35
            int r3 = r3 % 128
            com.ironsource.adqualitysdk.sdk.p009i.C2751ea.f6216 = r3
            com.ironsource.adqualitysdk.sdk.i.ee r3 = r5.f6217
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L45
            goto L44
        L40:
            com.ironsource.adqualitysdk.sdk.i.ee r2 = r5.f6217
            if (r2 == 0) goto L45
        L44:
            return r1
        L45:
            java.lang.String r2 = r4.f6218
            java.lang.String r5 = r5.f6218
            if (r2 == 0) goto L50
            boolean r5 = r2.equals(r5)
            return r5
        L50:
            if (r5 != 0) goto L5b
            int r5 = com.ironsource.adqualitysdk.sdk.p009i.C2751ea.f6213
            int r5 = r5 + 19
            int r5 = r5 % 128
            com.ironsource.adqualitysdk.sdk.p009i.C2751ea.f6216 = r5
            return r0
        L5b:
            return r1
        L5c:
            r5 = 0
            throw r5
        L5e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.p009i.C2751ea.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int iHashCode;
        AbstractC2755ee abstractC2755ee = this.f6217;
        int iHashCode2 = 0;
        if (abstractC2755ee != null) {
            f6216 = (f6213 + 51) % 128;
            iHashCode = abstractC2755ee.hashCode();
        } else {
            iHashCode = 0;
        }
        int i = iHashCode * 31;
        String str = this.f6218;
        if (str != null) {
            int i2 = f6216 + 119;
            f6213 = i2 % 128;
            if (i2 % 2 == 0) {
                str.hashCode();
                throw null;
            }
            iHashCode2 = str.hashCode();
        } else {
            f6216 = (f6213 + 125) % 128;
        }
        return i + iHashCode2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f6217.toString());
        sb.append(m6747((ViewConfiguration.getScrollBarSize() >> 8) + 1, View.MeasureSpec.makeMeasureSpec(0, 0), (char) KeyEvent.normalizeMetaState(0)).intern());
        sb.append(this.f6218);
        String string = sb.toString();
        int i = f6216 + InterfaceC3173h3.d.b.f8823f;
        f6213 = i % 128;
        if (i % 2 != 0) {
            return string;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2755ee
    /* renamed from: ｋ */
    public final C2744du mo6724(C2741dr c2741dr, C2712cp c2712cp) {
        int i = f6213 + 39;
        f6216 = i % 128;
        if (i % 2 != 0) {
            boolean z = this.f6217.m6760(c2741dr, c2712cp).m6717() instanceof C2712cp;
            throw null;
        }
        Object objM6717 = this.f6217.m6760(c2741dr, c2712cp).m6717();
        if (objM6717 instanceof C2712cp) {
            return new C2744du(((C2712cp) objM6717).m6297(this.f6218));
        }
        try {
            C2744du c2744du = new C2744du(objM6717.getClass().getDeclaredField(this.f6218).get(objM6717));
            int i2 = f6213 + 67;
            f6216 = i2 % 128;
            if (i2 % 2 == 0) {
                return c2744du;
            }
            throw null;
        } catch (Exception unused) {
            return new C2744du(null);
        }
    }
}
