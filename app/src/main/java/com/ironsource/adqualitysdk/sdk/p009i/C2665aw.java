package com.ironsource.adqualitysdk.sdk.p009i;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.aw */
/* loaded from: classes2.dex */
public final class C2665aw {

    /* renamed from: ﺙ */
    private static int f4779 = 0;

    /* renamed from: ﻏ */
    private static int f4780 = 1;

    /* renamed from: ﾇ */
    private static long f4782 = 2477149463289313586L;

    /* renamed from: ﻐ */
    private List<String> f4783;

    /* renamed from: ﻛ */
    private String f4784;

    /* renamed from: ﾒ */
    private b f4785;

    /* renamed from: ｋ */
    private static char[] f4781 = {22938, 32546, 4484, 14137, 23744, 25186, 35605, 2695, 11300, 18377, 31088, 36867, 'b', 9925, 19756, 29583, 39671, 'C', 9935, 19758, 29582, 39653, 49475, 59316, 3599, 13682, 23524, 33321, 43155, 53217, 63042, 7340, 17157, 27203, 37071, 46894, 56710, 1257, 11079};

    /* renamed from: ﱡ */
    private static long f4778 = -5725047594273200480L;

    /* renamed from: com.ironsource.adqualitysdk.sdk.i.aw$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {

        /* renamed from: ﾒ */
        static final /* synthetic */ int[] f4786;

        static {
            int[] iArr = new int[b.valuesCustom().length];
            f4786 = iArr;
            try {
                iArr[b.f4794.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4786[b.f4795.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4786[b.f4796.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4786[b.f4792.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* renamed from: com.ironsource.adqualitysdk.sdk.i.aw$b */
    public enum b {
        f4794,
        f4792,
        f4796,
        f4795;


        /* renamed from: ﮐ */
        private static int f4787 = 0;

        /* renamed from: ﱟ */
        private static int f4788 = 0;

        /* renamed from: ﱡ */
        private static long f4789 = 0;

        /* renamed from: ﺙ */
        private static int f4790 = 1;

        /* renamed from: ﻏ */
        private static char f4791;

        static {
            m5240();
            f4790 = (f4788 + 115) % 128;
        }

        public static b valueOf(String str) {
            int i = f4788 + 37;
            f4790 = i % 128;
            if (i % 2 != 0) {
                return (b) Enum.valueOf(b.class, str);
            }
            Enum.valueOf(b.class, str);
            throw null;
        }

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static b[] valuesCustom() {
            b[] bVarArr;
            int i = f4788 + 87;
            f4790 = i % 128;
            if (i % 2 == 0) {
                bVarArr = (b[]) values().clone();
                int i2 = 71 / 0;
            } else {
                bVarArr = (b[]) values().clone();
            }
            int i3 = f4790 + 27;
            f4788 = i3 % 128;
            if (i3 % 2 == 0) {
                return bVarArr;
            }
            throw null;
        }

        /* renamed from: ﾒ */
        public static void m5240() {
            f4789 = 0L;
            f4787 = 0;
            f4791 = (char) 34238;
        }

        /* renamed from: ﾒ */
        private static String m5239(int i, char c, String str, String str2, String str3) {
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
                            cArr6[i6] = (char) ((((c3 ^ cArr2[i6]) ^ f4789) ^ f4787) ^ f4791);
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
    }

    public C2665aw(JSONObject jSONObject) {
        this.f4785 = m5234(jSONObject.optString(m5232("륆\ud9f0破魦", (ViewConfiguration.getWindowTouchSlop() >> 8) + 24763).intern()));
        this.f4783 = m5233(jSONObject.optString(m5235((ViewConfiguration.getWindowTouchSlop() >> 8) + 2, ExpandableListView.getPackedPositionType(0L), (char) ((ViewConfiguration.getTapTimeout() >> 16) + 23020)).intern()));
        this.f4784 = m5236(jSONObject.optString(m5232("륀ᓶ\ue211놢࿙\udd79", Color.green(0) + 44449).intern()));
    }

    /* renamed from: ﻐ */
    private static List<String> m5233(String str) {
        ArrayList arrayList = new ArrayList();
        if (TextUtils.isEmpty(str)) {
            return arrayList;
        }
        f4780 = (f4779 + 61) % 128;
        List<String> listAsList = Arrays.asList(str.split(m5232("뤞", (ViewConfiguration.getEdgeSlop() >> 16) + 35671).intern()));
        f4779 = (f4780 + 51) % 128;
        return listAsList;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00b6  */
    /* renamed from: ﻛ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.ironsource.adqualitysdk.sdk.p009i.C2665aw.b m5234(java.lang.String r9) {
        /*
            int r0 = com.ironsource.adqualitysdk.sdk.p009i.C2665aw.f4780
            int r0 = r0 + 19
            int r0 = r0 % 128
            com.ironsource.adqualitysdk.sdk.p009i.C2665aw.f4779 = r0
            int r0 = r9.hashCode()
            r1 = 92611485(0x585239d, float:1.2520342E-35)
            r2 = 1
            r3 = 0
            r5 = 0
            r6 = 2
            if (r0 == r1) goto L85
            r1 = 93621297(0x5948c31, float:1.3969351E-35)
            if (r0 == r1) goto L51
            r1 = 96946943(0x5c74aff, float:1.8741419E-35)
            if (r0 == r1) goto L22
            goto Lb6
        L22:
            r0 = 0
            int r1 = android.graphics.Color.argb(r0, r0, r0, r0)
            int r1 = r1 + 5
            float r3 = android.graphics.PointF.length(r5, r5)
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            int r3 = 2 - r3
            int r4 = android.view.View.getDefaultSize(r0, r0)
            int r4 = r4 + 4577
            char r4 = (char) r4
            java.lang.String r1 = m5235(r1, r3, r4)
            java.lang.String r1 = r1.intern()
            boolean r9 = r9.equals(r1)
            if (r9 != 0) goto L48
            goto Lb6
        L48:
            int r9 = com.ironsource.adqualitysdk.sdk.p009i.C2665aw.f4780
            int r9 = r9 + 57
            int r9 = r9 % 128
            com.ironsource.adqualitysdk.sdk.p009i.C2665aw.f4779 = r9
            goto Lb7
        L51:
            long r0 = android.os.SystemClock.elapsedRealtime()
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            r1 = 4
            int r0 = r0 + r1
            int r3 = android.view.ViewConfiguration.getKeyRepeatTimeout()
            int r3 = r3 >> 16
            int r3 = 12 - r3
            int r4 = android.view.KeyEvent.getMaxKeyCode()
            int r4 = r4 >> 16
            char r4 = (char) r4
            java.lang.String r0 = m5235(r0, r3, r4)
            java.lang.String r0 = r0.intern()
            boolean r9 = r9.equals(r0)
            if (r9 == 0) goto Lb6
            int r9 = com.ironsource.adqualitysdk.sdk.p009i.C2665aw.f4780
            int r9 = r9 + 91
            int r0 = r9 % 128
            com.ironsource.adqualitysdk.sdk.p009i.C2665aw.f4779 = r0
            int r9 = r9 % r6
            if (r9 == 0) goto L83
            r0 = r1
            goto Lb7
        L83:
            r0 = r6
            goto Lb7
        L85:
            int r0 = android.view.ViewConfiguration.getFadingEdgeLength()
            int r0 = r0 >> 16
            int r0 = 5 - r0
            long r7 = android.os.SystemClock.uptimeMillis()
            int r1 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            int r1 = 8 - r1
            float r3 = android.view.ViewConfiguration.getScrollFriction()
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            int r3 = 2791 - r3
            char r3 = (char) r3
            java.lang.String r0 = m5235(r0, r1, r3)
            java.lang.String r0 = r0.intern()
            boolean r9 = r9.equals(r0)
            if (r9 == 0) goto Lb6
            int r9 = com.ironsource.adqualitysdk.sdk.p009i.C2665aw.f4780
            int r9 = r9 + 47
            int r9 = r9 % 128
            com.ironsource.adqualitysdk.sdk.p009i.C2665aw.f4779 = r9
            r0 = r2
            goto Lb7
        Lb6:
            r0 = -1
        Lb7:
            if (r0 == 0) goto Lc6
            if (r0 == r2) goto Lc3
            if (r0 == r6) goto Lc0
            com.ironsource.adqualitysdk.sdk.i.aw$b r9 = com.ironsource.adqualitysdk.sdk.p009i.C2665aw.b.f4794
            return r9
        Lc0:
            com.ironsource.adqualitysdk.sdk.i.aw$b r9 = com.ironsource.adqualitysdk.sdk.p009i.C2665aw.b.f4796
            return r9
        Lc3:
            com.ironsource.adqualitysdk.sdk.i.aw$b r9 = com.ironsource.adqualitysdk.sdk.p009i.C2665aw.b.f4792
            return r9
        Lc6:
            com.ironsource.adqualitysdk.sdk.i.aw$b r9 = com.ironsource.adqualitysdk.sdk.p009i.C2665aw.b.f4795
            int r0 = com.ironsource.adqualitysdk.sdk.p009i.C2665aw.f4780
            int r0 = r0 + 67
            int r0 = r0 % 128
            com.ironsource.adqualitysdk.sdk.p009i.C2665aw.f4779 = r0
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.p009i.C2665aw.m5234(java.lang.String):com.ironsource.adqualitysdk.sdk.i.aw$b");
    }

    /* renamed from: ﾇ */
    private static String m5236(String str) {
        if (!TextUtils.isEmpty(str)) {
            f4780 = (f4779 + 67) % 128;
            if (!str.equals(m5232("륜媂绔ሑ", 58308 - TextUtils.lastIndexOf("", '0', 0, 0)).intern())) {
                return str;
            }
        }
        int i = f4779 + 53;
        f4780 = i % 128;
        if (i % 2 != 0) {
            return null;
        }
        throw null;
    }

    /* renamed from: ｋ */
    public final String m5237() {
        int i = (f4780 + 3) % 128;
        f4779 = i;
        String str = this.f4784;
        int i2 = i + 97;
        f4780 = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    /* renamed from: ﾒ */
    public final boolean m5238(String str) {
        int i;
        try {
            i = AnonymousClass2.f4786[this.f4785.ordinal()];
        } catch (Exception e) {
            C2914kb.m7426(m5235(22 - (Process.myPid() >> 22), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 17, (char) View.MeasureSpec.makeMeasureSpec(0, 0)).intern(), m5232("륷遡\ueb02숾᷄璷依ꚻ\uf01a쭨∐紶哋꿳蚘톙⭋ɰ崁됣迊\ue6e2", 10529 - (ViewConfiguration.getEdgeSlop() >> 16)).intern(), (Throwable) e, false);
        }
        if (i == 1) {
            int i2 = f4779 + 97;
            f4780 = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 24 / 0;
            }
            return true;
        }
        if (i == 2) {
            return this.f4783.contains(str);
        }
        if (i != 3) {
            if (i != 4) {
            }
            f4780 = (f4779 + 65) % 128;
            return false;
        }
        if (this.f4783.size() > 0) {
            if (C2916kd.m7455(str, this.f4783.get(0)) >= 0) {
                return false;
            }
            f4780 = (f4779 + 7) % 128;
            return true;
        }
        if (this.f4783.size() > 0) {
            f4779 = (f4780 + 9) % 128;
            if (C2916kd.m7455(str, this.f4783.get(0)) < 0) {
                return false;
            }
            int i4 = (f4779 + 49) % 128;
            f4780 = i4;
            int i5 = i4 + 11;
            f4779 = i5 % 128;
            if (i5 % 2 == 0) {
                return true;
            }
            throw null;
        }
        f4780 = (f4779 + 65) % 128;
        return false;
    }

    /* renamed from: ﻐ */
    private static String m5232(String str, int i) {
        String str2;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (C2804g.f6422) {
            try {
                C2804g.f6423 = i;
                char[] cArr2 = new char[cArr.length];
                C2804g.f6421 = 0;
                while (true) {
                    int i2 = C2804g.f6421;
                    if (i2 < cArr.length) {
                        cArr2[i2] = (char) ((cArr[i2] ^ (C2804g.f6423 * i2)) ^ f4782);
                        C2804g.f6421++;
                    } else {
                        str2 = new String(cArr2);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }

    /* renamed from: ﻛ */
    private static String m5235(int i, int i2, char c) {
        String str;
        synchronized (C2642a.f4435) {
            try {
                char[] cArr = new char[i];
                C2642a.f4436 = 0;
                while (true) {
                    int i3 = C2642a.f4436;
                    if (i3 < i) {
                        cArr[i3] = (char) ((f4781[i2 + i3] ^ (i3 * f4778)) ^ c);
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
}
