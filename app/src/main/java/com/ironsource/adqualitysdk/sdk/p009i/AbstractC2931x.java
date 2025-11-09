package com.ironsource.adqualitysdk.sdk.p009i;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.x */
/* loaded from: classes2.dex */
public abstract class AbstractC2931x<K, T> implements InterfaceC2923p<K, T> {

    /* renamed from: ﮐ */
    private static int f7419 = 1;

    /* renamed from: ﺙ */
    private static int f7422;

    /* renamed from: ﾇ */
    private InterfaceC2923p<K, T> f7426;

    /* renamed from: ﾒ */
    private InterfaceC2923p<K, T> f7427 = new InterfaceC2923p<K, T>() { // from class: com.ironsource.adqualitysdk.sdk.i.x.2
        @Override // com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2923p
        /* renamed from: ﻐ */
        public final void mo4932(JSONObject jSONObject, K k, T t) {
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2923p
        /* renamed from: ﻛ */
        public final void mo6307(JSONObject jSONObject, K k, T t) {
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2923p
        /* renamed from: ｋ */
        public final void mo4939(JSONObject jSONObject, K k, T t) {
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2923p
        /* renamed from: ﾇ */
        public final void mo6312(JSONObject jSONObject, K k, T t) {
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2923p
        /* renamed from: ﾒ */
        public final void mo6316(JSONObject jSONObject, K k, T t) {
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2923p
        /* renamed from: ｋ */
        public final void mo6309(JSONObject jSONObject, K k, Object obj, T t) {
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2923p
        /* renamed from: ﾇ */
        public final void mo6313(JSONObject jSONObject, K k, Object obj, T t) {
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2923p
        /* renamed from: ﾒ */
        public final void mo6317(JSONObject jSONObject, K k, Object obj, T t) {
        }
    };

    /* renamed from: ﻛ */
    private static int[] f7424 = {1821354989, 977792672, 161182965, -1197872108, 1119705411, -1907422789, -834813515, -81941397, -20049129, 585569748, 1201322586, -1317719078, -1235753251, -1242666424, -2063751310, -226774, -180009001, -804157015};

    /* renamed from: ﱟ */
    private static char f7420 = 65462;

    /* renamed from: ﻐ */
    private static char f7423 = 22242;

    /* renamed from: ﱡ */
    private static char f7421 = 53951;

    /* renamed from: ｋ */
    private static char f7425 = 29621;

    /* renamed from: com.ironsource.adqualitysdk.sdk.i.x$2 */
    public class AnonymousClass2 implements InterfaceC2923p<K, T> {
        @Override // com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2923p
        /* renamed from: ﻐ */
        public final void mo4932(JSONObject jSONObject, K k, T t) {
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2923p
        /* renamed from: ﻛ */
        public final void mo6307(JSONObject jSONObject, K k, T t) {
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2923p
        /* renamed from: ｋ */
        public final void mo4939(JSONObject jSONObject, K k, T t) {
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2923p
        /* renamed from: ﾇ */
        public final void mo6312(JSONObject jSONObject, K k, T t) {
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2923p
        /* renamed from: ﾒ */
        public final void mo6316(JSONObject jSONObject, K k, T t) {
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2923p
        /* renamed from: ｋ */
        public final void mo6309(JSONObject jSONObject, K k, Object obj, T t) {
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2923p
        /* renamed from: ﾇ */
        public final void mo6313(JSONObject jSONObject, K k, Object obj, T t) {
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2923p
        /* renamed from: ﾒ */
        public final void mo6317(JSONObject jSONObject, K k, Object obj, T t) {
        }
    }

    /* renamed from: ﻐ */
    private InterfaceC2923p<K, T> m7672() {
        int i = f7419;
        int i2 = i + 1;
        f7422 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        InterfaceC2923p<K, T> interfaceC2923p = this.f7426;
        if (interfaceC2923p != null) {
            return interfaceC2923p;
        }
        InterfaceC2923p<K, T> interfaceC2923p2 = this.f7427;
        f7422 = (i + 65) % 128;
        return interfaceC2923p2;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2923p
    /* renamed from: ﻛ */
    public final void mo6307(JSONObject jSONObject, K k, T t) throws JSONException {
        f7422 = (f7419 + 29) % 128;
        JSONObject jSONObjectM7676 = m7676(jSONObject, (JSONObject) t);
        m7673(m7675("王캃Э쐂ラ㘗咍낗\ud8e4な", ((Process.getThreadPriority(0) + 20) >> 6) + 9).intern(), jSONObjectM7676);
        m7672().mo6307(jSONObjectM7676, k, t);
        f7422 = (f7419 + 43) % 128;
    }

    /* renamed from: ｋ */
    public abstract String mo4935(T t);

    @Override // com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2923p
    /* renamed from: ｋ */
    public void mo4939(JSONObject jSONObject, K k, T t) throws JSONException {
        f7419 = (f7422 + 117) % 128;
        JSONObject jSONObjectM7676 = m7676(jSONObject, (JSONObject) t);
        m7673(m7674(new int[]{-355690244, 575201560, -1422199200, -54633889, -1326012990, -1938158944, 35782360, 123677469}, 13 - TextUtils.indexOf("", "")).intern(), jSONObjectM7676);
        m7672().mo4939(jSONObjectM7676, k, t);
        f7422 = (f7419 + 31) % 128;
    }

    /* renamed from: ﾇ */
    public final void m7677(InterfaceC2923p<K, T> interfaceC2923p) {
        int i = (f7419 + 39) % 128;
        f7422 = i;
        this.f7426 = interfaceC2923p;
        int i2 = i + 67;
        f7419 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 30 / 0;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2923p
    /* renamed from: ﾒ */
    public final void mo6317(JSONObject jSONObject, K k, Object obj, T t) throws JSONException {
        JSONObject jSONObjectM7676;
        String strM7674;
        int i = f7422 + 25;
        f7419 = i % 128;
        if (i % 2 == 0) {
            jSONObjectM7676 = m7676(jSONObject, (JSONObject) t);
            strM7674 = m7674(new int[]{795643482, 1828768691, -143041691, -1041858202, -957566315, 1074401623}, 7 / (SystemClock.elapsedRealtime() > 1L ? 1 : (SystemClock.elapsedRealtime() == 1L ? 0 : -1)));
        } else {
            jSONObjectM7676 = m7676(jSONObject, (JSONObject) t);
            strM7674 = m7674(new int[]{795643482, 1828768691, -143041691, -1041858202, -957566315, 1074401623}, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 10);
        }
        m7673(strM7674.intern(), jSONObjectM7676);
        m7672().mo6317(jSONObjectM7676, k, obj, t);
        f7419 = (f7422 + 45) % 128;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2923p
    /* renamed from: ﾇ */
    public final void mo6313(JSONObject jSONObject, K k, Object obj, T t) throws JSONException {
        f7422 = (f7419 + 93) % 128;
        JSONObject jSONObjectM7676 = m7676(jSONObject, (JSONObject) t);
        m7673(m7674(new int[]{-1812336080, -1653031124, -160148310, 1722438500, 703877969, 370300871}, 10 - (ViewConfiguration.getEdgeSlop() >> 16)).intern(), jSONObjectM7676);
        m7672().mo6313(jSONObjectM7676, k, obj, t);
        int i = f7422 + 55;
        f7419 = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2923p
    /* renamed from: ﻐ */
    public void mo4932(JSONObject jSONObject, K k, T t) throws JSONException {
        JSONObject jSONObjectM7676;
        String strM7674;
        int i = f7422 + 43;
        f7419 = i % 128;
        if (i % 2 == 0) {
            jSONObjectM7676 = m7676(jSONObject, (JSONObject) t);
            strM7674 = m7674(new int[]{-355690244, 575201560, -1422199200, -54633889, -1326012990, -1938158944, -306656774, 1912328032, -243173556, 114591898}, Drawable.resolveOpacity(1, 0) + 20);
        } else {
            jSONObjectM7676 = m7676(jSONObject, (JSONObject) t);
            strM7674 = m7674(new int[]{-355690244, 575201560, -1422199200, -54633889, -1326012990, -1938158944, -306656774, 1912328032, -243173556, 114591898}, 19 - Drawable.resolveOpacity(0, 0));
        }
        m7673(strM7674.intern(), jSONObjectM7676);
        m7672().mo4932(jSONObjectM7676, k, t);
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2923p
    /* renamed from: ｋ */
    public final void mo6309(JSONObject jSONObject, K k, Object obj, T t) throws JSONException {
        f7422 = (f7419 + 21) % 128;
        JSONObject jSONObjectM7676 = m7676(jSONObject, (JSONObject) t);
        m7673(m7675("王캃Э쐂ĺ隰튼浦듨ꗏ㺶碜皔躐\ueaf7刲\ue999\udbb1쳾繓", (KeyEvent.getMaxKeyCode() >> 16) + 19).intern(), jSONObjectM7676);
        m7672().mo6309(jSONObjectM7676, k, obj, t);
        int i = f7419 + 81;
        f7422 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2923p
    /* renamed from: ﾇ */
    public final void mo6312(JSONObject jSONObject, K k, T t) throws JSONException {
        JSONObject jSONObjectM7676;
        int iIndexOf;
        int i = f7419 + 125;
        f7422 = i % 128;
        if (i % 2 != 0) {
            jSONObjectM7676 = m7676(jSONObject, (JSONObject) t);
            iIndexOf = 5 << TextUtils.indexOf((CharSequence) "", 'C', 0);
        } else {
            jSONObjectM7676 = m7676(jSONObject, (JSONObject) t);
            iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0) + 14;
        }
        m7673(m7675("Ꝅ览Ǆ輻㦑\udf5b跟ᰋჵ⋫툇ꏲ쳾繓", iIndexOf).intern(), jSONObjectM7676);
        m7672().mo6312(jSONObjectM7676, k, t);
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2923p
    /* renamed from: ﾒ */
    public final void mo6316(JSONObject jSONObject, K k, T t) throws JSONException {
        JSONObject jSONObjectM7676;
        int mode;
        int i = f7419 + 119;
        f7422 = i % 128;
        if (i % 2 != 0) {
            jSONObjectM7676 = m7676(jSONObject, (JSONObject) t);
            mode = View.MeasureSpec.getMode(1) * 119;
        } else {
            jSONObjectM7676 = m7676(jSONObject, (JSONObject) t);
            mode = 14 - View.MeasureSpec.getMode(0);
        }
        m7673(m7675("穪陿눦螔犠篼\ue1a4ツ輢\ue3ba\uf847嬪榢匳", mode).intern(), jSONObjectM7676);
        m7672().mo6316(jSONObjectM7676, k, t);
    }

    /* renamed from: ｋ */
    private static String m7674(int[] iArr, int i) {
        String str;
        synchronized (C2723d.f5953) {
            try {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) f7424.clone();
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

    /* renamed from: ﻐ */
    private void m7673(String str, JSONObject jSONObject) {
        String strIntern = m7675("王캃᭱ᙸ\udda9퉧庱莡战㉀皔躐怷Ⴔ", (ViewConfiguration.getLongPressTimeout() >> 16) + 14).intern();
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getName());
        sb.append(m7675("胈䥗\uf1c3ꁨ", KeyEvent.normalizeMetaState(0) + 3).intern());
        sb.append(str);
        C2921n.m7515(strIntern, sb.toString(), jSONObject);
        f7422 = (f7419 + 35) % 128;
    }

    /* renamed from: ﾒ */
    private JSONObject m7676(JSONObject jSONObject, T t) throws JSONException {
        try {
            if (!jSONObject.has(C2869ik.f6836)) {
                jSONObject.put(C2869ik.f6836, mo4935(t));
            }
            if (!jSONObject.has(C2869ik.f6832)) {
                jSONObject.put(C2869ik.f6832, C2906ju.m7340());
            }
            f7419 = (f7422 + 91) % 128;
        } catch (JSONException e) {
            C2921n.m7506(m7675("王캃᭱ᙸ\udda9퉧庱莡战㉀皔躐怷Ⴔ", 14 - Color.green(0)).intern(), m7675("\ude26悆皔躐毆マ늕ԝⷛ\udd4d曎\ue8cc龈락跟ᰋჵ⋫툇ꏲϣ䠦栨\ue74d\u173f䖁", 25 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))).intern(), e);
        }
        int i = f7419 + 107;
        f7422 = i % 128;
        if (i % 2 != 0) {
            int i2 = 37 / 0;
        }
        return jSONObject;
    }

    /* renamed from: ﾒ */
    private static String m7675(String str, int i) {
        String str2;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (C2920m.f7237) {
            try {
                char[] cArr2 = new char[cArr.length];
                C2920m.f7236 = 0;
                char[] cArr3 = new char[2];
                while (true) {
                    int i2 = C2920m.f7236;
                    if (i2 < cArr.length) {
                        cArr3[0] = cArr[i2];
                        cArr3[1] = cArr[i2 + 1];
                        int i3 = 58224;
                        for (int i4 = 0; i4 < 16; i4++) {
                            char c = cArr3[1];
                            char c2 = cArr3[0];
                            char c3 = (char) (c - (((c2 + i3) ^ ((c2 << 4) + f7420)) ^ ((c2 >>> 5) + f7421)));
                            cArr3[1] = c3;
                            cArr3[0] = (char) (c2 - (((c3 >>> 5) + f7423) ^ ((c3 + i3) ^ ((c3 << 4) + f7425))));
                            i3 -= 40503;
                        }
                        int i5 = C2920m.f7236;
                        cArr2[i5] = cArr3[0];
                        cArr2[i5 + 1] = cArr3[1];
                        C2920m.f7236 = i5 + 2;
                    } else {
                        str2 = new String(cArr2, 0, i);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }
}
