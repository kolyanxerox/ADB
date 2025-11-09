package com.ironsource.adqualitysdk.sdk.p009i;

import OooO0oO.OooOo;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.internal.ads.AbstractC2183w4;
import com.ironsource.InterfaceC3173h3;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ba */
/* loaded from: classes2.dex */
public final class C2670ba {

    /* renamed from: ﭖ */
    private static int f5042 = 0;

    /* renamed from: ﮉ */
    private static char f5045 = 13527;

    /* renamed from: ﮌ */
    private static int f5046 = 1;

    /* renamed from: ﮐ */
    private static int f5047;

    /* renamed from: ﱟ */
    private static long f5048;

    /* renamed from: ﺙ */
    private String f5050;

    /* renamed from: ﻐ */
    private String f5052;

    /* renamed from: ﻛ */
    private String f5053;

    /* renamed from: ｋ */
    private String f5054;

    /* renamed from: ﾇ */
    private String f5055;

    /* renamed from: ﾒ */
    private String f5056;

    /* renamed from: ﭸ */
    private static char[] f5044 = {20922, 6249, 49873, 59199, 44735, 29806, 14888, 49609, 38775, 23859, 'A', 18902, 37685, 56675, 9897, 28694, 47685, 938, 19945, 38673, 57520, 10989, 'M', 18903, 37655, 56677, 9897, 28701, 47689, 996, 19888, ' ', '-', 18847, 37705, 56635, 9957, 28759, 47617, 1011, 19901, 38767, 57561, 10891, 29813, 48679, 59573, 41254, 31723, 13773, 52821, 39140, 21155, 60230, 42243, 32732, 2155, 34961, 49488, 7057, 21996, 44633, 63677, 13048, 35613, 50514, 8090, 26666, 41593, 64723, 13979, 40939, 54868, 3215, 'F', 18899, 37645, 56698, 9901, 28702, 47628, 938, 19967, 38754, 57501, 10952, 29745, 48766, 2005, 20751, 39756, 58555, 12030, 30803, 49608, 3065, 21795, 40592, 59614, 12807, 31863, 50610, 3863, 22872};

    /* renamed from: ﭴ */
    private static long f5043 = 8876893355069163954L;

    /* renamed from: ﻏ */
    private c f5051 = c.f5078;

    /* renamed from: ﱡ */
    private b f5049 = b.f5066;

    /* renamed from: com.ironsource.adqualitysdk.sdk.i.ba$2 */
    public static /* synthetic */ class AnonymousClass2 {

        /* renamed from: ﾇ */
        static final /* synthetic */ int[] f5057;

        /* renamed from: ﾒ */
        static final /* synthetic */ int[] f5058;

        static {
            int[] iArr = new int[b.valuesCustom().length];
            f5058 = iArr;
            try {
                iArr[b.f5063.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5058[b.f5069.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5058[b.f5068.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f5058[b.f5067.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f5058[b.f5065.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[c.valuesCustom().length];
            f5057 = iArr2;
            try {
                iArr2[c.f5080.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f5057[c.f5081.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f5057[c.f5082.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f5057[c.f5076.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f5057[c.f5079.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* renamed from: com.ironsource.adqualitysdk.sdk.i.ba$b */
    public enum b {
        f5066,
        f5069,
        f5068,
        f5067,
        f5065,
        f5063;


        /* renamed from: ﮉ */
        private static int f5059 = 1;

        /* renamed from: ﮐ */
        private static char f5060;

        /* renamed from: ﱟ */
        private static char[] f5061;

        /* renamed from: ﻏ */
        private static int f5064;

        static {
            m5429();
            f5064 = (f5059 + InterfaceC3173h3.d.b.f8823f) % 128;
        }

        public static b valueOf(String str) {
            f5059 = (f5064 + 55) % 128;
            b bVar = (b) Enum.valueOf(b.class, str);
            int i = f5059 + 91;
            f5064 = i % 128;
            if (i % 2 == 0) {
                return bVar;
            }
            throw null;
        }

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static b[] valuesCustom() {
            f5059 = (f5064 + 55) % 128;
            b[] bVarArr = (b[]) values().clone();
            f5059 = (f5064 + 43) % 128;
            return bVarArr;
        }

        /* renamed from: ﻛ */
        public static void m5429() {
            f5060 = (char) 5;
            f5061 = new char[]{'N', 'O', 'E', 'W', 'R', '_', 'A', 'G', 'T', 'Q', 'U', 'I', 'D', 'S', 'P', 'K', 'V', 'L', 'Z', 'F', 'C', 'X', 'Y', '[', '\\'};
        }

        /* renamed from: ﾇ */
        private static String m5430(byte b, String str, int i) {
            String str2;
            char[] charArray = str;
            if (str != null) {
                charArray = str.toCharArray();
            }
            char[] cArr = charArray;
            synchronized (C2858i.f6710) {
                try {
                    char[] cArr2 = f5061;
                    char c = f5060;
                    char[] cArr3 = new char[i];
                    if (i % 2 != 0) {
                        i--;
                        cArr3[i] = (char) (cArr[i] - b);
                    }
                    if (i > 1) {
                        C2858i.f6715 = 0;
                        while (true) {
                            int i2 = C2858i.f6715;
                            if (i2 >= i) {
                                break;
                            }
                            C2858i.f6714 = cArr[i2];
                            C2858i.f6712 = cArr[C2858i.f6715 + 1];
                            if (C2858i.f6714 == C2858i.f6712) {
                                cArr3[C2858i.f6715] = (char) (C2858i.f6714 - b);
                                cArr3[C2858i.f6715 + 1] = (char) (C2858i.f6712 - b);
                            } else {
                                C2858i.f6713 = C2858i.f6714 / c;
                                C2858i.f6709 = C2858i.f6714 % c;
                                C2858i.f6711 = C2858i.f6712 / c;
                                C2858i.f6708 = C2858i.f6712 % c;
                                if (C2858i.f6709 == C2858i.f6708) {
                                    C2858i.f6713 = AbstractC2183w4.OooOoOO(C2858i.f6713, c, 1, c);
                                    C2858i.f6711 = AbstractC2183w4.OooOoOO(C2858i.f6711, c, 1, c);
                                    int i3 = (C2858i.f6713 * c) + C2858i.f6709;
                                    int i4 = (C2858i.f6711 * c) + C2858i.f6708;
                                    int i5 = C2858i.f6715;
                                    cArr3[i5] = cArr2[i3];
                                    cArr3[i5 + 1] = cArr2[i4];
                                } else if (C2858i.f6713 == C2858i.f6711) {
                                    C2858i.f6709 = AbstractC2183w4.OooOoOO(C2858i.f6709, c, 1, c);
                                    C2858i.f6708 = AbstractC2183w4.OooOoOO(C2858i.f6708, c, 1, c);
                                    int i6 = (C2858i.f6713 * c) + C2858i.f6709;
                                    int i7 = (C2858i.f6711 * c) + C2858i.f6708;
                                    int i8 = C2858i.f6715;
                                    cArr3[i8] = cArr2[i6];
                                    cArr3[i8 + 1] = cArr2[i7];
                                } else {
                                    int i9 = (C2858i.f6713 * c) + C2858i.f6708;
                                    int i10 = (C2858i.f6711 * c) + C2858i.f6709;
                                    int i11 = C2858i.f6715;
                                    cArr3[i11] = cArr2[i9];
                                    cArr3[i11 + 1] = cArr2[i10];
                                }
                            }
                            C2858i.f6715 += 2;
                        }
                    }
                    str2 = new String(cArr3);
                } catch (Throwable th) {
                    throw th;
                }
            }
            return str2;
        }
    }

    /* renamed from: com.ironsource.adqualitysdk.sdk.i.ba$c */
    public enum c {
        f5078,
        f5080,
        f5081,
        f5082,
        f5079,
        f5076;


        /* renamed from: ﭸ */
        private static int f5070 = 1;

        /* renamed from: ﮉ */
        private static int f5071;

        /* renamed from: ﮌ */
        private static char f5072;

        /* renamed from: ﮐ */
        private static char f5073;

        /* renamed from: ﱟ */
        private static char f5074;

        /* renamed from: ﻏ */
        private static char f5077;

        static {
            m5431();
            f5071 = (f5070 + 9) % 128;
        }

        public static c valueOf(String str) {
            f5071 = (f5070 + 45) % 128;
            c cVar = (c) Enum.valueOf(c.class, str);
            int i = f5071 + 3;
            f5070 = i % 128;
            if (i % 2 != 0) {
                return cVar;
            }
            throw null;
        }

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static c[] valuesCustom() {
            f5071 = (f5070 + 61) % 128;
            c[] cVarArr = (c[]) values().clone();
            int i = f5070 + 63;
            f5071 = i % 128;
            if (i % 2 == 0) {
                return cVarArr;
            }
            throw null;
        }

        /* renamed from: ﻛ */
        public static void m5431() {
            f5074 = (char) 3580;
            f5073 = (char) 18894;
            f5072 = (char) 40909;
            f5077 = (char) 9148;
        }

        /* renamed from: ｋ */
        private static String m5432(String str, int i) {
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
                                char c3 = (char) (c - (((c2 + i3) ^ ((c2 << 4) + f5074)) ^ ((c2 >>> 5) + f5072)));
                                cArr3[1] = c3;
                                cArr3[0] = (char) (c2 - (((c3 >>> 5) + f5073) ^ ((c3 + i3) ^ ((c3 << 4) + f5077))));
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

    public C2670ba(String str) {
        this.f5056 = str;
    }

    /* renamed from: ﱟ */
    private String m5416() {
        f5042 = (f5046 + 33) % 128;
        String strName = this.f5051.name();
        f5042 = (f5046 + 115) % 128;
        return strName;
    }

    /* renamed from: ﱡ */
    private String m5417() {
        int i = f5046;
        f5042 = (i + 77) % 128;
        if (this.f5053 == null) {
            return null;
        }
        f5042 = (i + 15) % 128;
        if (this.f5055 == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(m5418((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), "ᥪ矇\u0adc㒑", "ⅸ䖿잿콺៕댷\u2029逹ﷺⰵ\udb95⯑☑ᇯ䎾כֿ洋㗖\uea13퀀ᖺ⣚翨㣪", "\u0000\u0000\u0000\u0000").intern());
        sb.append(this.f5053);
        sb.append(m5421((ViewConfiguration.getJumpTapTimeout() >> 16) + 3, View.resolveSize(0, 0) + 71, (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 40908)).intern());
        sb.append(this.f5055);
        return sb.toString();
    }

    /* renamed from: ｋ */
    private String m5420() {
        String strIntern;
        if (this.f5056 == null || (strIntern = this.f5054) == null) {
            return null;
        }
        if (strIntern.equals(m5421(3 - (Process.myPid() >> 22), TextUtils.lastIndexOf("", '0', 0) + 1, (char) (20980 - (ViewConfiguration.getScrollBarFadeDuration() >> 16))).intern()) && this.f5051 != c.f5079) {
            f5046 = (f5042 + InterfaceC3173h3.d.b.f8823f) % 128;
            strIntern = m5421((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 11, (ViewConfiguration.getJumpTapTimeout() >> 16) + 46, (char) (59643 - (ViewConfiguration.getKeyRepeatDelay() >> 16))).intern();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f5056);
        String strOooOO0o = AbstractC2183w4.OooOO0o(sb, m5421(14 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 58 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) (34993 - Color.red(0))), strIntern);
        f5046 = (f5042 + 13) % 128;
        return strOooOO0o;
    }

    /* renamed from: ﾒ */
    private String m5422() {
        StringBuilder sb = new StringBuilder();
        sb.append(m5418((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 537516034, (char) (38749 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), "˭\u09d8尠窗", "勖愔亃瞮꒒みዡ搖\uf51e崢桵ꆰ藷쿩戜", "\u0000\u0000\u0000\u0000").intern());
        sb.append(this.f5056);
        String strOooOO0O = AbstractC2183w4.OooOO0O(sb, m5418(Color.green(0) + 1011439912, (char) View.MeasureSpec.makeMeasureSpec(0, 0), "⡏䥙娼ˌ", "㤭昕闋䉍虣箼ᱏ迳욦\ud81c\udbac", "\u0000\u0000\u0000\u0000"));
        if (this.f5052 != null) {
            StringBuilder sbOooOo0O = OooOo.OooOo0O(strOooOO0O);
            sbOooOo0O.append(this.f5052);
            strOooOO0O = AbstractC2183w4.OooOO0O(sbOooOo0O, m5421((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 30, (char) View.MeasureSpec.getMode(0)));
            f5046 = (f5042 + 13) % 128;
        }
        String strOooOO0O2 = AbstractC2183w4.OooOO0O(OooOo.OooOo0O(strOooOO0O), m5421((ViewConfiguration.getEdgeSlop() >> 16) + 14, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 32, (char) TextUtils.getOffsetBefore("", 0)));
        int i = f5046 + 35;
        f5042 = i % 128;
        if (i % 2 == 0) {
            return strOooOO0O2;
        }
        throw null;
    }

    /* renamed from: ﻐ */
    public final void m5424(c cVar) {
        f5042 = (f5046 + 17) % 128;
        this.f5051 = cVar;
        if (cVar != c.f5076) {
            int i = f5046 + 93;
            f5042 = i % 128;
            if (i % 2 != 0) {
                this.f5049 = b.f5066;
                int i2 = 2 / 0;
            } else {
                this.f5049 = b.f5066;
            }
        }
        int i3 = AnonymousClass2.f5057[cVar.ordinal()];
        if (i3 == 3 || i3 == 4 || i3 == 5) {
            m5419();
        }
    }

    /* renamed from: ﻛ */
    public final void m5426(C2710cn c2710cn) {
        f5046 = (f5042 + 19) % 128;
        c2710cn.m6231();
        this.f5056 = c2710cn.m6227();
        this.f5052 = c2710cn.m6226();
        this.f5054 = c2710cn.m6221();
        if (m5418(((Process.getThreadPriority(0) + 20) >> 6) + 1592379763, (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), "現\ue9c9橞㈆", "潒僶鰰莐紋ꔆ稚", "\u0000\u0000\u0000\u0000").intern().equals(this.f5054) || m5418(ViewConfiguration.getPressedStateDuration() >> 16, (char) (ViewConfiguration.getKeyRepeatDelay() >> 16), "鉢륋쩓羺", "蕣\udf01鵤샠愃䭿аﲮ", "\u0000\u0000\u0000\u0000").intern().equals(this.f5054)) {
            this.f5054 = m5421(Color.rgb(0, 0, 0) + 16777219, 1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) (20980 - TextUtils.indexOf("", "", 0, 0))).intern();
            f5042 = (f5046 + 95) % 128;
        }
        this.f5053 = c2710cn.m6223();
        this.f5055 = c2710cn.m6222();
        this.f5050 = c2710cn.m6225();
    }

    /* renamed from: ﾇ */
    public final String m5428() {
        int i = f5046 + 97;
        f5042 = i % 128;
        if (i % 2 == 0) {
            return m5423(this.f5049);
        }
        m5423(this.f5049);
        throw null;
    }

    /* renamed from: ﾇ */
    private static String m5421(int i, int i2, char c2) {
        String str;
        synchronized (C2642a.f4435) {
            try {
                char[] cArr = new char[i];
                C2642a.f4436 = 0;
                while (true) {
                    int i3 = C2642a.f4436;
                    if (i3 < i) {
                        cArr[i3] = (char) ((f5044[i2 + i3] ^ (i3 * f5043)) ^ c2);
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

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0122, code lost:
    
        if (r1 == com.ironsource.adqualitysdk.sdk.p009i.C2670ba.c.f5079) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0127, code lost:
    
        if (r1 == com.ironsource.adqualitysdk.sdk.p009i.C2670ba.c.f5079) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x012a, code lost:
    
        r1 = m5423(r13.f5049);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0130, code lost:
    
        if (r1 == null) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0132, code lost:
    
        r4 = new java.lang.StringBuilder();
        r4.append(m5421(android.view.View.MeasureSpec.getMode(0) + 9, 22 - android.graphics.Color.alpha(0), (char) android.view.Gravity.getAbsoluteGravity(0, 0)).intern());
        r4.append(r1);
        r0.append(r4.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x015d, code lost:
    
        com.ironsource.adqualitysdk.sdk.p009i.C2921n.m7502(m5421(13 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 9 - android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0'), (char) (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1))).intern(), r0.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0184, code lost:
    
        return;
     */
    /* renamed from: ﻐ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m5419() {
        /*
            Method dump skipped, instructions count: 426
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.p009i.C2670ba.m5419():void");
    }

    /* renamed from: ﻛ */
    public final void m5425(b bVar) {
        int i = f5046 + 109;
        f5042 = i % 128;
        if (i % 2 == 0) {
            this.f5049 = bVar;
            m5424(c.f5076);
        } else {
            this.f5049 = bVar;
            m5424(c.f5076);
            throw null;
        }
    }

    /* renamed from: ﻛ */
    public final boolean m5427() {
        c cVar = this.f5051;
        if (cVar == c.f5080 || cVar == c.f5081) {
            return true;
        }
        int i = f5042 + 47;
        f5046 = i % 128;
        if (i % 2 == 0) {
            c cVar2 = c.f5078;
            throw null;
        }
        if (cVar == c.f5078) {
            return true;
        }
        int i2 = f5046 + 27;
        f5042 = i2 % 128;
        if (i2 % 2 == 0) {
            return false;
        }
        throw null;
    }

    /* renamed from: ﾒ */
    private String m5423(b bVar) {
        if (bVar != null) {
            int i = AnonymousClass2.f5058[bVar.ordinal()];
            if (i == 1) {
                return m5418(Process.getGidForName("") + 1, (char) View.combineMeasuredStates(0, 0), "\ue9b5嚪\ue0fd\ue4ff", "篑蓚䜪怑\ue1b4甆촻㍎怊Ἤ尷⹕Ɒ씌呛퉋\uf78d\ue4cf競쐖銥裨", "\u0000\u0000\u0000\u0000").intern();
            }
            if (i == 2) {
                return String.format(m5418(ViewConfiguration.getWindowTouchSlop() >> 8, (char) (ViewConfiguration.getLongPressTimeout() >> 16), "ꀆ廼ⶰᝆ", "㩊饵交扰칰품례璌\ue5ad\uf316뎋戧㙿\uf00fᇺ\u0ef0ᕁ掯ṣ〃ෆＸ\uf7de즛靚懊夀蒐촜뫪⭼읗\ufe6d\ue2b9隲氍ꄊ\ua4cd\uf0c7퐞\uf594濕\ueed5멓緀\u0604봈ෳ즉녷뀠ﭢঈ穌ᓵ嫡骟欙\ue1a0扂贻ᝋ", "\u0000\u0000\u0000\u0000").intern(), this.f5056, this.f5054, this.f5050);
            }
            if (i == 3) {
                return String.format(m5418(811298963 - (ViewConfiguration.getEdgeSlop() >> 16), (char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 53744), "鍽孰\uf030泑", "⚱벽鬵ᄪ鉪㡥츲뫘␚抱최瀍隊蘕嚸ᓳꅃ難鱅聨꣤⪔䔪鈱ぽ沴\ued06沠绦\udd6f鏷껿䎥絒꠳搳㛳샹ꐉ樯\udf17쌑ᮿݏ璣测䑥\u0097\uf4bb\ufbc5ꄙ⍾쿉\udb95盛", "\u0000\u0000\u0000\u0000").intern(), this.f5056, this.f5054);
            }
            if (i == 4) {
                return m5421((ViewConfiguration.getEdgeSlop() >> 16) + 30, View.resolveSizeAndState(0, 0, 0) + 74, (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1)).intern();
            }
            if (i == 5) {
                String strIntern = m5418((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1, (char) (38969 - View.MeasureSpec.getSize(0)), "ꟃ羗㧘쾘", "閍\u0f6e쐟Ⱂ븣維\ueddaᡝ\udc4c\uf238䗯喴ᇻ㶩⫆뙀\ud803蚻蘐३柯\ude1f冕ࢣઃ⼃", "\u0000\u0000\u0000\u0000").intern();
                int i2 = f5042 + 21;
                f5046 = i2 % 128;
                if (i2 % 2 != 0) {
                    return strIntern;
                }
                throw null;
            }
        }
        int i3 = f5046 + 65;
        f5042 = i3 % 128;
        if (i3 % 2 == 0) {
            return null;
        }
        throw null;
    }

    /* renamed from: ﻐ */
    private static String m5418(int i, char c2, String str, String str2, String str3) {
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
                cArr4[0] = (char) (c2 ^ cArr4[0]);
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
                        char c3 = cArr5[i3];
                        char c4 = (char) ((i5 + c3) % 65535);
                        C2885j.f6935 = c4;
                        cArr5[i4] = (char) (((cArr4[i4] * 32718) + c3) / 65535);
                        cArr4[i4] = c4;
                        int i6 = C2885j.f6934;
                        cArr6[i6] = (char) ((((c4 ^ cArr2[i6]) ^ f5048) ^ f5047) ^ f5045);
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
