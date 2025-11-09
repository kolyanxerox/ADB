package com.ironsource.adqualitysdk.sdk.p009i;

import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.internal.ads.AbstractC2183w4;
import com.ironsource.InterfaceC3173h3;
import java.util.ArrayList;
import java.util.List;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ja */
/* loaded from: classes2.dex */
public final class C2886ja {

    /* renamed from: ﱟ */
    private static int f6937 = 1;

    /* renamed from: ﺙ */
    private static int f6938 = 0;

    /* renamed from: ｋ */
    private static int f6939 = 113;

    /* renamed from: ﻐ */
    private final String f6940;

    /* renamed from: ﻛ */
    private final String f6941;

    /* renamed from: ﾇ */
    private final int f6942;

    /* renamed from: ﾒ */
    private final C2890je f6943;

    /* renamed from: com.ironsource.adqualitysdk.sdk.i.ja$d */
    public interface d {
        /* renamed from: ﻐ */
        void mo5054(List<C2889jd> list);
    }

    /* renamed from: com.ironsource.adqualitysdk.sdk.i.ja$e */
    public interface e {
        /* renamed from: ﾇ */
        void mo5051(int i);
    }

    public C2886ja(String str, String str2, C2890je c2890je) {
        this(str, str2, c2890je, (byte) 0);
    }

    /* renamed from: ﻐ */
    public static /* synthetic */ String m7183(C2886ja c2886ja) {
        f6938 = (f6937 + 3) % 128;
        String strM7191 = c2886ja.m7191();
        f6938 = (f6937 + 69) % 128;
        return strM7191;
    }

    /* renamed from: ｋ */
    public static /* synthetic */ C2890je m7185(C2886ja c2886ja) {
        int i = f6938;
        f6937 = (i + 117) % 128;
        C2890je c2890je = c2886ja.f6943;
        f6937 = (i + 73) % 128;
        return c2890je;
    }

    /* renamed from: ﾇ */
    public static /* synthetic */ int m7186(C2886ja c2886ja) {
        f6938 = (f6937 + InterfaceC3173h3.d.b.f8823f) % 128;
        return 10000;
    }

    /* renamed from: ﾒ */
    public static C2889jd m7190(JSONObject jSONObject) {
        C2889jd c2889jd = new C2889jd(jSONObject);
        f6938 = (f6937 + 55) % 128;
        return c2889jd;
    }

    /* renamed from: ﻛ */
    public final void m7195(final C2889jd c2889jd, final AbstractRunnableC2878it abstractRunnableC2878it) {
        C2890je.m7228().post(new AbstractRunnableC2878it() { // from class: com.ironsource.adqualitysdk.sdk.i.ja.3

            /* renamed from: ﱡ */
            private static int f6957 = 1;

            /* renamed from: ﺙ */
            private static int f6958;

            /* renamed from: ﻐ */
            private static char[] f6959 = {'*', 63028, 33228, 6560, 37265, 10618, 41318, 14623, 45294, 18645, 49340, 22676, 53324, 'T', 30642, 61405, 26621, 57160, 22315, 53103, 18134, 48818, 14027, 44768, 9855, 40472, 5713, 36237, 1448, 32135, 62734, 28020, 58697, 23917, 54422, 19612, 50405, 15364, 46117, 11350, 41887, 7103, 37847, 2988, 33549, 64293, 29539, 60116, 25256, 56007, 21232, 51836, 16985, 47730, 12672, 43425, 8701, 39180, 1516, 29204, 60024, 25161, 55982, 21123, 51924, 17273, 47888, 13159, 43841, 9108, 39924, 5065, 34937};

            /* renamed from: ｋ */
            private static long f6960 = 6598787220456372186L;

            /* renamed from: ﾇ */
            private static String m7198(int i, int i2, char c) {
                String str;
                synchronized (C2642a.f4435) {
                    try {
                        char[] cArr = new char[i];
                        C2642a.f4436 = 0;
                        while (true) {
                            int i3 = C2642a.f4436;
                            if (i3 < i) {
                                cArr[i3] = (char) ((f6959[i2 + i3] ^ (i3 * f6960)) ^ c);
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

            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
            /* renamed from: ﾒ */
            public final void mo4950() {
                if (C2886ja.m7185(C2886ja.this).m7233(C2886ja.m7188(C2886ja.this, m7198(-TextUtils.indexOf((CharSequence) "", '0'), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1, (char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1)).intern())) <= C2886ja.m7186(C2886ja.this)) {
                    int i = f6958 + 115;
                    f6957 = i % 128;
                    if (i % 2 == 0) {
                        TextUtils.isEmpty(C2886ja.m7184(C2886ja.this, c2889jd));
                        throw null;
                    }
                    String strM7184 = C2886ja.m7184(C2886ja.this, c2889jd);
                    if (TextUtils.isEmpty(strM7184)) {
                        f6957 = (f6958 + 77) % 128;
                        C2921n.m7512(C2886ja.m7183(C2886ja.this), m7198(11 - Process.getGidForName(""), 1 - View.combineMeasuredStates(0, 0), (char) (63095 - Gravity.getAbsoluteGravity(0, 0))).intern(), m7198(45 - (ViewConfiguration.getKeyRepeatDelay() >> 16), KeyEvent.normalizeMetaState(0) + 13, (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16)).intern(), true);
                        int i2 = f6957 + 31;
                        f6958 = i2 % 128;
                        if (i2 % 2 != 0) {
                            int i3 = 83 / 0;
                            return;
                        }
                        return;
                    }
                    try {
                        String string = c2889jd.m7225().toString();
                        f6958 = (f6957 + 13) % 128;
                        C2921n.m7505(C2886ja.m7183(C2886ja.this), m7198(12 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), KeyEvent.keyCodeFromString("") + 1, (char) (ExpandableListView.getPackedPositionGroup(0L) + 63095)).intern(), m7198((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 15, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 58, (char) (1455 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)))).intern(), string, true);
                        C2886ja.m7185(C2886ja.this).m7242(strM7184, string);
                    } catch (JSONException unused) {
                        return;
                    }
                }
                AbstractRunnableC2878it abstractRunnableC2878it2 = abstractRunnableC2878it;
                if (abstractRunnableC2878it2 != null) {
                    f6957 = (f6958 + 67) % 128;
                    C2926s.m7596(abstractRunnableC2878it2);
                }
            }
        });
        int i = f6937 + 123;
        f6938 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    private C2886ja(String str, String str2, C2890je c2890je, byte b) {
        this.f6941 = str2;
        this.f6942 = 10000;
        this.f6940 = str;
        this.f6943 = c2890je;
    }

    /* renamed from: ﻐ */
    public static /* synthetic */ String m7184(C2886ja c2886ja, C2889jd c2889jd) {
        f6937 = (f6938 + 27) % 128;
        String strM7189 = c2886ja.m7189(c2889jd);
        f6938 = (f6937 + 59) % 128;
        return strM7189;
    }

    /* renamed from: ﾇ */
    public static /* synthetic */ String m7188(C2886ja c2886ja, String str) {
        f6938 = (f6937 + 89) % 128;
        String strM7192 = c2886ja.m7192(str);
        int i = f6938 + 67;
        f6937 = i % 128;
        if (i % 2 == 0) {
            int i2 = 84 / 0;
        }
        return strM7192;
    }

    /* renamed from: ﾒ */
    private String m7192(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f6941);
        sb.append(str);
        String string = sb.toString();
        f6938 = (f6937 + 51) % 128;
        return string;
    }

    /* renamed from: ｋ */
    public final void m7196(final C2889jd c2889jd) {
        C2890je.m7228().post(new AbstractRunnableC2878it() { // from class: com.ironsource.adqualitysdk.sdk.i.ja.2
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
            /* renamed from: ﾒ */
            public final void mo4950() {
                C2886ja.m7185(C2886ja.this).m7241(C2886ja.m7184(C2886ja.this, c2889jd));
            }
        });
        int i = f6937 + 23;
        f6938 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ﾇ */
    private String m7189(C2889jd c2889jd) {
        int i = f6937 + 17;
        f6938 = i % 128;
        int i2 = i % 2;
        String strM7226 = c2889jd.m7226();
        if (i2 != 0) {
            m7192(strM7226);
            throw null;
        }
        String strM7192 = m7192(strM7226);
        f6937 = (f6938 + 123) % 128;
        return strM7192;
    }

    /* renamed from: ﾒ */
    private String m7191() {
        StringBuilder sb = new StringBuilder();
        sb.append(m7187(5 - TextUtils.getTrimmedLength(""), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 13, 203 - TextUtils.indexOf("", ""), "\u0007\r\u000bￆￎ￩\u0007\t\u000e\u000b\ufff9\u001a\u0015\u0018", false).intern());
        sb.append(this.f6940);
        String strOooOO0O = AbstractC2183w4.OooOO0O(sb, m7187((ViewConfiguration.getFadingEdgeLength() >> 16) + 1, 1 - (ViewConfiguration.getTouchSlop() >> 8), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 153, WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR, true));
        int i = f6937 + 109;
        f6938 = i % 128;
        if (i % 2 == 0) {
            return strOooOO0O;
        }
        throw null;
    }

    /* renamed from: ﻐ */
    public final void m7193(final int i, final d dVar) {
        C2890je.m7228().post(new AbstractRunnableC2878it() { // from class: com.ironsource.adqualitysdk.sdk.i.ja.4

            /* renamed from: ﱡ */
            private static int f6964 = 1;

            /* renamed from: ｋ */
            private static int[] f6965 = {2114469033, -701801935, 1139412422, 1117300153, -1083517301, 546845775, 2121995300, -1722557606, -1026288556, 655273921, -1152333528, -249166585, 1027513480, 118010114, -185438119, 955159485, -892202635, 4139106};

            /* renamed from: ﾒ */
            private static int f6966;

            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
            /* renamed from: ﻐ */
            public final void mo5316(Throwable th) {
                super.mo5316(th);
                C2926s.m7596(new AbstractRunnableC2878it() { // from class: com.ironsource.adqualitysdk.sdk.i.ja.4.3
                    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
                    /* renamed from: ﾒ */
                    public final void mo4950() {
                        dVar.mo5054(new ArrayList());
                    }
                });
                int i2 = f6966 + 41;
                f6964 = i2 % 128;
                if (i2 % 2 == 0) {
                    throw null;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
            /* renamed from: ﾒ */
            public final void mo4950() {
                final ArrayList arrayList = new ArrayList();
                for (String str : C2886ja.m7185(C2886ja.this).m7240(C2886ja.m7188(C2886ja.this, m7199(new int[]{1151739420, 1201243436}, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1).intern()), i).values()) {
                    try {
                        JSONObject jSONObject = new JSONObject(str);
                        arrayList.add(new C2889jd(jSONObject.getJSONObject(m7199(new int[]{-2039094168, 713968856, -293446750, 243139766}, TextUtils.indexOf((CharSequence) "", '0') + 9).intern()), jSONObject.optString(m7199(new int[]{942557588, -911721130}, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 3).intern())));
                    } catch (Exception unused) {
                        C2921n.m7512(C2886ja.m7183(C2886ja.this), m7199(new int[]{321531419, -953259377, -28936939, 768449305, 824790181, -530358991}, 12 - TextUtils.indexOf("", "", 0)).intern(), AbstractC2183w4.OooOO0o(new StringBuilder(), m7199(new int[]{-177340433, 1389150828, 1787241840, -1690170208, 436999526, -261860651, -997025699, -1343535973, -845402261, 951623830, -1697902839, 555541639, -1444894826, -1528441724, 1440912641, 672812732, -1039438322, 2136976290, -815342212, 847001957, -1228559492, 1227931435}, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 44), str), true);
                    }
                }
                C2926s.m7596(new AbstractRunnableC2878it() { // from class: com.ironsource.adqualitysdk.sdk.i.ja.4.1
                    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
                    /* renamed from: ﾒ */
                    public final void mo4950() {
                        dVar.mo5054(arrayList);
                    }
                });
                int i2 = f6964 + 77;
                f6966 = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 94 / 0;
                }
            }

            /* renamed from: ﻐ */
            private static String m7199(int[] iArr, int i2) {
                String str;
                synchronized (C2723d.f5953) {
                    try {
                        char[] cArr = new char[4];
                        char[] cArr2 = new char[iArr.length << 1];
                        int[] iArr2 = (int[]) f6965.clone();
                        C2723d.f5951 = 0;
                        while (true) {
                            int i3 = C2723d.f5951;
                            if (i3 < iArr.length) {
                                int i4 = iArr[i3];
                                char c = (char) (i4 >> 16);
                                cArr[0] = c;
                                char c2 = (char) i4;
                                cArr[1] = c2;
                                char c3 = (char) (iArr[i3 + 1] >> 16);
                                cArr[2] = c3;
                                char c4 = (char) iArr[i3 + 1];
                                cArr[3] = c4;
                                C2723d.f5954 = (c << 16) + c2;
                                C2723d.f5952 = (c3 << 16) + c4;
                                C2723d.m6462(iArr2);
                                for (int i5 = 0; i5 < 16; i5++) {
                                    int i6 = C2723d.f5954 ^ iArr2[i5];
                                    C2723d.f5954 = i6;
                                    int iM6461 = C2723d.m6461(i6) ^ C2723d.f5952;
                                    int i7 = C2723d.f5954;
                                    C2723d.f5954 = iM6461;
                                    C2723d.f5952 = i7;
                                }
                                int i8 = C2723d.f5954;
                                int i9 = C2723d.f5952;
                                C2723d.f5954 = i9;
                                C2723d.f5952 = i8;
                                int i10 = i8 ^ iArr2[16];
                                C2723d.f5952 = i10;
                                int i11 = i9 ^ iArr2[17];
                                C2723d.f5954 = i11;
                                cArr[0] = (char) (i11 >>> 16);
                                cArr[1] = (char) i11;
                                cArr[2] = (char) (i10 >>> 16);
                                cArr[3] = (char) i10;
                                C2723d.m6462(iArr2);
                                int i12 = C2723d.f5951;
                                cArr2[i12 << 1] = cArr[0];
                                cArr2[(i12 << 1) + 1] = cArr[1];
                                cArr2[(i12 << 1) + 2] = cArr[2];
                                cArr2[(i12 << 1) + 3] = cArr[3];
                                C2723d.f5951 = i12 + 2;
                            } else {
                                str = new String(cArr2, 0, i2);
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return str;
            }
        });
        f6937 = (f6938 + 93) % 128;
    }

    /* renamed from: ﾇ */
    private static String m7187(int i, int i2, int i3, String str, boolean z) {
        String str2;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (C2669b.f5039) {
            try {
                char[] cArr2 = new char[i2];
                C2669b.f5040 = 0;
                while (true) {
                    int i4 = C2669b.f5040;
                    if (i4 >= i2) {
                        break;
                    }
                    C2669b.f5038 = cArr[i4];
                    cArr2[C2669b.f5040] = (char) (C2669b.f5038 + i3);
                    int i5 = C2669b.f5040;
                    cArr2[i5] = (char) (cArr2[i5] - f6939);
                    C2669b.f5040 = i5 + 1;
                }
                if (i > 0) {
                    C2669b.f5041 = i;
                    char[] cArr3 = new char[i2];
                    System.arraycopy(cArr2, 0, cArr3, 0, i2);
                    int i6 = C2669b.f5041;
                    System.arraycopy(cArr3, 0, cArr2, i2 - i6, i6);
                    int i7 = C2669b.f5041;
                    System.arraycopy(cArr3, i7, cArr2, 0, i2 - i7);
                }
                if (z) {
                    char[] cArr4 = new char[i2];
                    C2669b.f5040 = 0;
                    while (true) {
                        int i8 = C2669b.f5040;
                        if (i8 >= i2) {
                            break;
                        }
                        cArr4[i8] = cArr2[(i2 - i8) - 1];
                        C2669b.f5040 = i8 + 1;
                    }
                    cArr2 = cArr4;
                }
                str2 = new String(cArr2);
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }

    /* renamed from: ﻐ */
    public final void m7194(final e eVar) {
        C2890je.m7228().post(new AbstractRunnableC2878it() { // from class: com.ironsource.adqualitysdk.sdk.i.ja.1

            /* renamed from: ﮐ */
            private static short[] f6944 = null;

            /* renamed from: ﱟ */
            private static byte[] f6945 = {0};

            /* renamed from: ﺙ */
            private static int f6946 = 0;

            /* renamed from: ﻏ */
            private static int f6947 = 1;

            /* renamed from: ﻛ */
            private static int f6948 = 38;

            /* renamed from: ｋ */
            private static int f6949 = -1441564111;

            /* renamed from: ﾒ */
            private static int f6950 = -2012364511;

            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
            /* renamed from: ﾒ */
            public final void mo4950() {
                final int iM7233 = C2886ja.m7185(C2886ja.this).m7233(C2886ja.m7188(C2886ja.this, m7197((byte) ((-65) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), (short) KeyEvent.normalizeMetaState(0), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 38, 2012364511 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 1441564153 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))).intern()));
                C2926s.m7596(new AbstractRunnableC2878it() { // from class: com.ironsource.adqualitysdk.sdk.i.ja.1.1
                    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
                    /* renamed from: ﾒ */
                    public final void mo4950() {
                        eVar.mo5051(iM7233);
                    }
                });
                f6947 = (f6946 + 119) % 128;
            }

            /* renamed from: ﾒ */
            private static String m7197(byte b, short s, int i, int i2, int i3) {
                String string;
                synchronized (C2912k.f7200) {
                    try {
                        StringBuilder sb = new StringBuilder();
                        int i4 = f6948;
                        int i5 = i + i4;
                        int i6 = i5 == -1 ? 1 : 0;
                        if (i6 != 0) {
                            byte[] bArr = f6945;
                            if (bArr != null) {
                                i5 = (byte) (bArr[f6950 + i2] + i4);
                            } else {
                                i5 = (short) (f6944[f6950 + i2] + i4);
                            }
                        }
                        if (i5 > 0) {
                            C2912k.f7203 = ((i2 + i5) - 2) + f6950 + i6;
                            C2912k.f7201 = b;
                            char c = (char) (i3 + f6949);
                            C2912k.f7204 = c;
                            sb.append(c);
                            C2912k.f7202 = C2912k.f7204;
                            C2912k.f7205 = 1;
                            while (C2912k.f7205 < i5) {
                                byte[] bArr2 = f6945;
                                if (bArr2 != null) {
                                    int i7 = C2912k.f7203;
                                    C2912k.f7203 = i7 - 1;
                                    C2912k.f7204 = (char) (C2912k.f7202 + (((byte) (bArr2[i7] + s)) ^ C2912k.f7201));
                                } else {
                                    short[] sArr = f6944;
                                    int i8 = C2912k.f7203;
                                    C2912k.f7203 = i8 - 1;
                                    C2912k.f7204 = (char) (C2912k.f7202 + (((short) (sArr[i8] + s)) ^ C2912k.f7201));
                                }
                                sb.append(C2912k.f7204);
                                C2912k.f7202 = C2912k.f7204;
                                C2912k.f7205++;
                            }
                        }
                        string = sb.toString();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return string;
            }
        });
        f6938 = (f6937 + 19) % 128;
    }
}
