package com.ironsource.adqualitysdk.sdk.p009i;

import android.media.AudioTrack;
import android.text.TextUtils;
import android.view.KeyEvent;
import com.ironsource.InterfaceC3173h3;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.eg */
/* loaded from: classes2.dex */
public final class C2757eg extends AbstractC2760ej {

    /* renamed from: ﻐ */
    private static int f6250 = 0;

    /* renamed from: ｋ */
    private static int f6251 = 1;

    /* renamed from: ﾒ */
    private static int[] f6252 = {-405170401, 90346153, -500461674, -1283309533, -2011764121, -1886511268, 536288967, -1998981079, -1265893219, -1573804769, -1515868198, -168166575, 117959913, -968067837, 393849155, 669992311, -1830006624, 45022515};

    /* renamed from: ﻛ */
    private AbstractC2755ee f6253;

    public C2757eg(AbstractC2755ee abstractC2755ee, AbstractC2755ee abstractC2755ee2, AbstractC2755ee abstractC2755ee3, C2736dm c2736dm) {
        super(abstractC2755ee, abstractC2755ee2, c2736dm);
        this.f6253 = abstractC2755ee3;
    }

    /* renamed from: ﻐ */
    private static String m6766(int[] iArr, int i) {
        String str;
        synchronized (C2723d.f5953) {
            try {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) f6252.clone();
                C2723d.f5951 = 0;
                while (true) {
                    int i2 = C2723d.f5951;
                    if (i2 < iArr.length) {
                        int i3 = iArr[i2];
                        char c = (char) (i3 >> 16);
                        cArr[0] = c;
                        char c2 = (char) i3;
                        cArr[1] = c2;
                        char c3 = (char) (iArr[i2 + 1] >> 16);
                        cArr[2] = c3;
                        char c4 = (char) iArr[i2 + 1];
                        cArr[3] = c4;
                        C2723d.f5954 = (c << 16) + c2;
                        C2723d.f5952 = (c3 << 16) + c4;
                        C2723d.m6462(iArr2);
                        for (int i4 = 0; i4 < 16; i4++) {
                            int i5 = C2723d.f5954 ^ iArr2[i4];
                            C2723d.f5954 = i5;
                            int iM6461 = C2723d.m6461(i5) ^ C2723d.f5952;
                            int i6 = C2723d.f5954;
                            C2723d.f5954 = iM6461;
                            C2723d.f5952 = i6;
                        }
                        int i7 = C2723d.f5954;
                        int i8 = C2723d.f5952;
                        C2723d.f5954 = i8;
                        C2723d.f5952 = i7;
                        int i9 = i7 ^ iArr2[16];
                        C2723d.f5952 = i9;
                        int i10 = i8 ^ iArr2[17];
                        C2723d.f5954 = i10;
                        cArr[0] = (char) (i10 >>> 16);
                        cArr[1] = (char) i10;
                        cArr[2] = (char) (i9 >>> 16);
                        cArr[3] = (char) i9;
                        C2723d.m6462(iArr2);
                        int i11 = C2723d.f5951;
                        cArr2[i11 << 1] = cArr[0];
                        cArr2[(i11 << 1) + 1] = cArr[1];
                        cArr2[(i11 << 1) + 2] = cArr[2];
                        cArr2[(i11 << 1) + 3] = cArr[3];
                        C2723d.f5951 = i11 + 2;
                    } else {
                        str = new String(cArr2, 0, i);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    /* renamed from: ﻛ */
    private AbstractC2755ee m6767() {
        int i = f6250;
        AbstractC2755ee abstractC2755ee = this.f6253;
        f6251 = (i + 83) % 128;
        return abstractC2755ee;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2760ej
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C2757eg.class == obj.getClass()) {
            if (!super.equals(obj)) {
                f6250 = (f6251 + 19) % 128;
                return false;
            }
            C2757eg c2757eg = (C2757eg) obj;
            AbstractC2755ee abstractC2755ee = this.f6253;
            if (abstractC2755ee != null) {
                int i = f6251 + 27;
                f6250 = i % 128;
                int i2 = i % 2;
                AbstractC2755ee abstractC2755ee2 = c2757eg.f6253;
                if (i2 == 0) {
                    return abstractC2755ee.equals(abstractC2755ee2);
                }
                abstractC2755ee.equals(abstractC2755ee2);
                throw null;
            }
            if (c2757eg.f6253 == null) {
                return true;
            }
        }
        return false;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2760ej
    public final int hashCode() {
        f6251 = (f6250 + 107) % 128;
        int iHashCode = super.hashCode() * 31;
        AbstractC2755ee abstractC2755ee = this.f6253;
        int iHashCode2 = iHashCode + (abstractC2755ee != null ? abstractC2755ee.hashCode() : 0);
        int i = f6251 + 17;
        f6250 = i % 128;
        if (i % 2 == 0) {
            return iHashCode2;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2760ej
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(m6766(new int[]{-2133606961, 677274057}, 3 - KeyEvent.getDeadChar(0, 0)).intern());
        sb.append(m6767().toString());
        String string = sb.toString();
        f6251 = (f6250 + InterfaceC3173h3.d.b.f8823f) % 128;
        return string;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2755ee
    /* renamed from: ｋ */
    public final C2744du mo6724(C2741dr c2741dr, C2712cp c2712cp) throws JSONException {
        f6251 = (f6250 + 115) % 128;
        C2744du c2744duM6760 = m6771().m6760(c2741dr, c2712cp);
        C2744du c2744duM67602 = m6767().m6760(c2741dr, c2712cp);
        try {
            Object objM6717 = m6772().m6760(c2741dr, c2712cp).m6717();
            if (objM6717 instanceof JSONObject) {
                ((JSONObject) objM6717).put((String) c2744duM6760.m6717(), c2744duM67602.m6717());
            } else if (objM6717 instanceof JSONArray) {
                ((JSONArray) objM6717).put(c2744duM6760.m6722().intValue(), c2744duM67602.m6717());
            } else if (objM6717 instanceof Map) {
                int i = f6251 + 53;
                f6250 = i % 128;
                if (i % 2 != 0) {
                    ((Map) objM6717).put(c2744duM6760.m6717(), c2744duM67602.m6717());
                    throw null;
                }
                ((Map) objM6717).put(c2744duM6760.m6717(), c2744duM67602.m6717());
            } else if (objM6717 instanceof List) {
                ((List) objM6717).set(c2744duM6760.m6722().intValue(), c2744duM67602.m6717());
            } else if (objM6717.getClass().isArray()) {
                ((Object[]) objM6717)[c2744duM6760.m6722().intValue()] = c2744duM67602.m6717();
                f6250 = (f6251 + 123) % 128;
            } else {
                String strM6290 = c2712cp.m6290();
                StringBuilder sb = new StringBuilder();
                sb.append(m6766(new int[]{-1663869227, -10748094, -484951422, -2076391795, 399102204, -7247341, 2146948538, -622712800, -418522293, -1931587187, -1694235183, -806785779, 1778035557, -729110223, 835476238, -1688099229, -136523524, -241334155, 1564979787, 1844983954, -733406461, 1853471376}, 41 - TextUtils.lastIndexOf("", '0', 0, 0)).intern());
                sb.append(this);
                sb.append(m6759());
                sb.append(m6766(new int[]{386129766, 245734933, 1167976963, 2015217694, 1530180641, -520103584, 1063949491, -936832285, 1453749157, 1084501516, 1072069617, -305005421, 269882778, 2065630678, -1817936495, -1752843798, 1637611197, 313505183, -613815350, -1358209972, -1412307754, 700152628}, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 41).intern());
                sb.append(objM6717);
                C2713cq.m6350(strM6290, sb.toString(), null);
            }
        } catch (Exception e) {
            String strM62902 = c2712cp.m6290();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m6766(new int[]{-1663869227, -10748094, -484951422, -2076391795, 399102204, -7247341, 2146948538, -622712800, -418522293, -1931587187, -1694235183, -806785779, 1778035557, -729110223, 835476238, -1688099229, -136523524, -241334155, 1564979787, 1844983954, -733406461, 1853471376}, TextUtils.getOffsetBefore("", 0) + 42).intern());
            sb2.append(this);
            sb2.append(m6759());
            C2713cq.m6350(strM62902, sb2.toString(), e);
        }
        int i2 = f6251 + 73;
        f6250 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 84 / 0;
        }
        return c2744duM67602;
    }
}
