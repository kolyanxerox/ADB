package com.ironsource.adqualitysdk.sdk.p009i;

import android.R;
import android.app.Activity;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.WebView;
import android.widget.ExpandableListView;
import com.ironsource.InterfaceC3173h3;
import com.ironsource.adqualitysdk.sdk.p009i.AbstractC2930w;
import java.util.Arrays;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.v */
/* loaded from: classes2.dex */
public final class C2929v extends AbstractC2930w<Activity> implements InterfaceC2893jh {

    /* renamed from: ﭖ */
    private static char f7343 = 0;

    /* renamed from: ﭴ */
    private static int f7344 = 1;

    /* renamed from: ﭸ */
    private static char f7345;

    /* renamed from: ﮉ */
    private static int f7346;

    /* renamed from: ﮐ */
    private static char f7347;

    /* renamed from: ﺙ */
    private static char f7348;

    /* renamed from: ﻛ */
    private static String f7349;

    /* renamed from: ﱟ */
    private boolean f7350;

    /* renamed from: ﱡ */
    private e f7351;

    /* renamed from: ﻏ */
    private boolean f7352;

    /* renamed from: ﻐ */
    private boolean f7353;

    /* renamed from: ｋ */
    private Class f7354;

    /* renamed from: ﾇ */
    private boolean f7355;

    /* renamed from: ﾒ */
    private InterfaceC2893jh f7356;

    /* renamed from: com.ironsource.adqualitysdk.sdk.i.v$e */
    public class e extends AbstractC2930w.e {

        /* renamed from: ﮐ */
        private static int f7385 = 1;

        /* renamed from: ﱡ */
        private static int f7387;

        /* renamed from: ﻏ */
        private boolean f7389 = false;

        /* renamed from: ﻐ */
        private String f7390;

        /* renamed from: ﻛ */
        private int f7391;

        /* renamed from: ｋ */
        private boolean f7392;

        /* renamed from: ﾒ */
        private String f7393;

        /* renamed from: ﱟ */
        private static int[] f7386 = {-94124944, 976727494, 1731474252, -1526525249, -1590939251, -1987077971, -1189439085, 446393717, 838473903, 830317635, 893789095, 2129519560, -379001805, 1226087563, 355878119, -1163777740, 509679782, -306611102};

        /* renamed from: ﺙ */
        private static long f7388 = 3681616240420167750L;

        public e(C2929v c2929v, JSONObject jSONObject) {
            m7634(jSONObject.optString(m7641(new int[]{456581925, 333010295, -800874963, 526911697, -1411356241, -2079777307, 140116442, 1300303633}, TextUtils.lastIndexOf("", '0', 0, 0) + 15).intern()));
            m7636(jSONObject.optString(m7638("⋪⊝簇\udc24菒瀰쌼邴ꎛﴟ䈁ᆙ₶縳석鍁ꇬￋ䁫ᑏ⛚磰읛镤ꟻ梨", (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))).intern()));
            m7633(jSONObject.optInt(m7641(new int[]{-206103785, -256930901, -425967560, -49619672, -643147075, 1145594547}, 9 - Color.blue(0)).intern(), -1));
            m7632(jSONObject.optBoolean(m7641(new int[]{-760978804, 259606547, 1434341283, 565787366, 2028595829, -329778709, -1281314267, -1587787302, 852642138, -409340621}, 17 - TextUtils.getOffsetAfter("", 0)).intern()));
            m7631(jSONObject.optBoolean(m7638("꒣꓂⽢轇嚹㛸ᙁ황◚깵靱坰꛲ⵒᑮ행➥겦锩劇ꂯ⮀ሬ", 1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))).intern()));
            m7667(jSONObject.optString(m7638("锚镰㓔铡䟺ﻩܢṔᑋ뗑蘴齦靉㛣", Process.myPid() >> 22).intern()));
            m7668(TextUtils.isEmpty(jSONObject.optString(m7638("鶓鷦슇抳㎒䮁獲ꬃ᳹䎈\uf250⨂鿛", TextUtils.getCapsMode("", 0, 0)).intern())) ? null : Arrays.asList(jSONObject.optString(m7638("鶓鷦슇抳㎒䮁獲ꬃ᳹䎈\uf250⨂鿛", ViewConfiguration.getTapTimeout() >> 16).intern()).split(m7638("硆硪胜煻ḕ", ImageFormat.getBitsPerPixel(0) + 1).intern())));
            m7669(jSONObject.optBoolean(m7638("ꨀꩵ쁋恾◅\u0a61攬\ueae4⭽䅂\ue437毢ꡕ쉿朱\ue902⤻䎘", (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1).intern()));
            m7671(jSONObject.optBoolean(m7638("썽쌈全\uf15d䜁蚷ߨ是䈄큵蛄\ue72e섮卙ה旅䁁", (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))).intern(), true));
            m7666(!TextUtils.isEmpty(jSONObject.optString(m7638("锚镰㓔铡䟺ﻩܢṔᑋ뗑蘴齦靉㛣", (Process.getThreadPriority(0) + 20) >> 6).intern())) || jSONObject.optBoolean(m7638("ꀑꁤ\ue778䝍曐几☹녥Ⅼ晱Ꜣっꉄ\ue54c\u242f늎⌰撦ꕪ㖎", ViewConfiguration.getWindowTouchSlop() >> 8).intern()) || jSONObject.optBoolean(m7641(new int[]{-1385728159, 894828185, 1202365761, 1127767880, -1839593392, -1600191352, 953546408, -126578760, -1818870947, -2110693073}, 18 - KeyEvent.getDeadChar(0, 0)).intern()));
            m7664(jSONObject.optBoolean(m7638("ꀑꁤ\ue778䝍曐几☹녥Ⅼ晱Ꜣっꉄ\ue54c\u242f늎⌰撦ꕪ㖎", KeyEvent.getMaxKeyCode() >> 16).intern()));
            m7662(jSONObject.optBoolean(m7641(new int[]{-1649939842, 731490116, -933750370, -1479160481, 163791369, -754909593}, 10 - TextUtils.getOffsetBefore("", 0)).intern()));
            m7670(jSONObject.optBoolean(m7638("옩왜绳\udec6뻔Ꞔ︽䝛䝄\ufff4缄왇쑩糜ﰍ䒑䔄ﴪ絖쎷숬稗碑", (-1) - MotionEvent.axisFromString("")).intern()));
            m7661(jSONObject.optBoolean(m7638("龜便ᆇ놴딦끶\uf5c6僐硹邚瓮퇹ﭱᎬ\uf7e9匀稡鉔皑퐉ﴛ", ViewConfiguration.getTouchSlop() >> 8).intern()));
            m7663(jSONObject.optBoolean(m7638("忂徫ᓵ듞穥ታ㪙\uf2ee\udeb4闐뮮珪嶆", ViewConfiguration.getEdgeSlop() >> 16).intern()));
            m7665(C2915kc.m7443(jSONObject.optJSONArray(m7638("嵋崽௭ꯂ֔鲷䕽簒\udc20諈쑟ﴔ弜\u09da䝇翇\ude66", Process.getGidForName("") + 1).intern())));
        }

        /* renamed from: ﮐ */
        private e m7631(boolean z) {
            int i = f7387;
            this.f7389 = z;
            int i2 = i + 73;
            f7385 = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 60 / 0;
            }
            return this;
        }

        /* renamed from: ﻏ */
        private e m7632(boolean z) {
            int i = (f7385 + 33) % 128;
            f7387 = i;
            this.f7392 = z;
            f7385 = (i + 77) % 128;
            return this;
        }

        /* renamed from: ﻐ */
        public static /* synthetic */ boolean m7635(e eVar) {
            int i = f7385;
            f7387 = (i + 123) % 128;
            boolean z = eVar.f7389;
            f7387 = (i + 39) % 128;
            return z;
        }

        /* renamed from: ﻛ */
        public static /* synthetic */ String m7637(e eVar) {
            int i = (f7387 + 51) % 128;
            f7385 = i;
            String str = eVar.f7393;
            int i2 = i + InterfaceC3173h3.d.b.f8826i;
            f7387 = i2 % 128;
            if (i2 % 2 == 0) {
                return str;
            }
            throw null;
        }

        /* renamed from: ｋ */
        public static /* synthetic */ boolean m7639(e eVar) {
            int i = (f7387 + 87) % 128;
            f7385 = i;
            boolean z = eVar.f7392;
            int i2 = i + 73;
            f7387 = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 22 / 0;
            }
            return z;
        }

        /* renamed from: ﾇ */
        public static /* synthetic */ int m7640(e eVar) {
            int i = f7385;
            int i2 = i + 125;
            f7387 = i2 % 128;
            int i3 = i2 % 2;
            int i4 = eVar.f7391;
            if (i3 != 0) {
                throw null;
            }
            int i5 = i + 87;
            f7387 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 98 / 0;
            }
            return i4;
        }

        /* renamed from: ﾒ */
        public static /* synthetic */ String m7642(e eVar) {
            int i = f7385;
            f7387 = (i + 35) % 128;
            String str = eVar.f7390;
            int i2 = i + 73;
            f7387 = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 49 / 0;
            }
            return str;
        }

        /* renamed from: ﻐ */
        private e m7634(String str) {
            int i = f7385 + 65;
            int i2 = i % 128;
            f7387 = i2;
            if (i % 2 != 0) {
                this.f7390 = str;
                throw null;
            }
            this.f7390 = str;
            int i3 = i2 + 41;
            f7385 = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 40 / 0;
            }
            return this;
        }

        /* renamed from: ﻛ */
        private e m7636(String str) {
            int i = (f7385 + 85) % 128;
            f7387 = i;
            this.f7393 = str;
            int i2 = i + 59;
            f7385 = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 59 / 0;
            }
            return this;
        }

        /* renamed from: ｋ */
        private static String m7638(String str, int i) {
            String str2;
            char[] charArray = str;
            if (str != null) {
                charArray = str.toCharArray();
            }
            char[] cArr = charArray;
            synchronized (C2777f.f6322) {
                try {
                    char[] cArrM6790 = C2777f.m6790(f7388, cArr, i);
                    C2777f.f6321 = 4;
                    while (true) {
                        int i2 = C2777f.f6321;
                        if (i2 < cArrM6790.length) {
                            C2777f.f6320 = i2 - 4;
                            cArrM6790[i2] = (char) ((cArrM6790[i2] ^ cArrM6790[i2 % 4]) ^ (r2 * f7388));
                            C2777f.f6321 = i2 + 1;
                        } else {
                            str2 = new String(cArrM6790, 4, cArrM6790.length - 4);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return str2;
        }

        /* renamed from: ﾇ */
        private static String m7641(int[] iArr, int i) {
            String str;
            synchronized (C2723d.f5953) {
                try {
                    char[] cArr = new char[4];
                    char[] cArr2 = new char[iArr.length << 1];
                    int[] iArr2 = (int[]) f7386.clone();
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
        private e m7633(int i) {
            int i2 = f7385 + 53;
            int i3 = i2 % 128;
            f7387 = i3;
            if (i2 % 2 != 0) {
                this.f7391 = i;
                int i4 = 73 / 0;
            } else {
                this.f7391 = i;
            }
            f7385 = (i3 + 67) % 128;
            return this;
        }
    }

    static {
        m7606();
        f7349 = m7616("悠\ue81d⻄叕斌ᩬ捝⯉湾䈐\ud7ab풆┕뫂颼廥훀혛៲㧡\ue2c9ꃑ\ude23躑놇栯鯓洌놇栯鯓洌总蔦뛓ﵷ\uf8c3蛾ꢚ藹", 39 - ExpandableListView.getPackedPositionType(0L)).intern();
        int i = f7346 + 75;
        f7344 = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public C2929v(JSONObject jSONObject, InterfaceC2875iq interfaceC2875iq) {
        super(interfaceC2875iq);
        this.f7353 = false;
        this.f7355 = false;
        this.f7352 = false;
        this.f7350 = false;
        m7629(jSONObject);
    }

    /* renamed from: ﮐ */
    public static /* synthetic */ String m7602() {
        int i = f7346 + 97;
        f7344 = i % 128;
        if (i % 2 != 0) {
            return f7349;
        }
        int i2 = 82 / 0;
        return f7349;
    }

    /* renamed from: ﱟ */
    public static /* synthetic */ boolean m7603(C2929v c2929v) {
        int i = (f7346 + 9) % 128;
        f7344 = i;
        boolean z = c2929v.f7352;
        int i2 = i + 57;
        f7346 = i2 % 128;
        if (i2 % 2 == 0) {
            return z;
        }
        throw null;
    }

    /* renamed from: ﱡ */
    private InterfaceC2893jh m7604() {
        int i = (f7346 + InterfaceC3173h3.d.b.f8819b) % 128;
        f7344 = i;
        InterfaceC2893jh interfaceC2893jh = this.f7356;
        f7346 = (i + 109) % 128;
        return interfaceC2893jh;
    }

    /* renamed from: ﻏ */
    public static void m7606() {
        f7345 = (char) 16736;
        f7347 = (char) 10434;
        f7343 = (char) 65313;
        f7348 = (char) 1798;
    }

    /* renamed from: ﻐ */
    public static /* synthetic */ InterfaceC2893jh m7608(C2929v c2929v) {
        int i = f7344 + 3;
        f7346 = i % 128;
        if (i % 2 == 0) {
            return c2929v.m7604();
        }
        c2929v.m7604();
        throw null;
    }

    /* renamed from: ﻛ */
    public static /* synthetic */ boolean m7610(C2929v c2929v) {
        int i = f7346 + 65;
        f7344 = i % 128;
        int i2 = i % 2;
        boolean z = c2929v.f7355;
        if (i2 != 0) {
            return z;
        }
        throw null;
    }

    /* renamed from: ｋ */
    public static /* synthetic */ Class m7612(C2929v c2929v, Class cls) {
        int i = f7344 + 99;
        f7346 = i % 128;
        int i2 = i % 2;
        c2929v.f7354 = cls;
        if (i2 == 0) {
            return cls;
        }
        throw null;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(final Activity activity, final Bundle bundle) {
        m7617(new AbstractRunnableC2878it() { // from class: com.ironsource.adqualitysdk.sdk.i.v.4
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
            /* renamed from: ﾒ */
            public final void mo4950() {
                if (C2929v.m7621(C2929v.this, activity)) {
                    C2929v.m7608(C2929v.this).onActivityCreated(activity, bundle);
                    C2929v.m7618();
                    C2929v.m7609(C2929v.this, false);
                    Bundle bundle2 = bundle;
                    if (bundle2 == null) {
                        C2929v.m7614(C2929v.this, false);
                        return;
                    }
                    C2929v.m7614(C2929v.this, bundle2.getBoolean(C2929v.m7602()));
                    if (C2929v.m7620(C2929v.this)) {
                        C2929v.m7609(C2929v.this, true);
                    }
                    C2929v.m7611(C2929v.this, true);
                }
            }
        });
        int i = f7344 + InterfaceC3173h3.d.b.f8823f;
        f7346 = i % 128;
        if (i % 2 != 0) {
            int i2 = 98 / 0;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(final Activity activity) {
        m7617(new AbstractRunnableC2878it() { // from class: com.ironsource.adqualitysdk.sdk.i.v.3
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
            /* renamed from: ﾒ */
            public final void mo4950() throws JSONException {
                if (C2929v.m7621(C2929v.this, activity)) {
                    C2926s.m7600(new AbstractRunnableC2878it() { // from class: com.ironsource.adqualitysdk.sdk.i.v.3.4
                        @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
                        /* renamed from: ﾒ */
                        public final void mo4950() {
                            C2929v.m7608(C2929v.this).onActivityDestroyed(activity);
                        }
                    });
                    if (C2929v.m7610(C2929v.this) && C2929v.m7620(C2929v.this) && activity.isFinishing()) {
                        C2929v.this.m13739(activity);
                    }
                }
            }
        });
        f7346 = (f7344 + 19) % 128;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(final Activity activity) {
        C2926s.m7600(new AbstractRunnableC2878it() { // from class: com.ironsource.adqualitysdk.sdk.i.v.8
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
            /* renamed from: ﾒ */
            public final void mo4950() {
                if (C2929v.m7621(C2929v.this, activity)) {
                    C2929v.m7608(C2929v.this).onActivityPaused(activity);
                }
            }
        });
        f7346 = (f7344 + 93) % 128;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(final Activity activity) {
        m7617(new AbstractRunnableC2878it() { // from class: com.ironsource.adqualitysdk.sdk.i.v.10
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
            /* renamed from: ﾒ */
            public final void mo4950() throws JSONException {
                if (C2929v.m7621(C2929v.this, activity)) {
                    C2926s.m7600(new AbstractRunnableC2878it() { // from class: com.ironsource.adqualitysdk.sdk.i.v.10.1
                        @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
                        /* renamed from: ﾒ */
                        public final void mo4950() {
                            C2929v.m7608(C2929v.this).onActivityResumed(activity);
                        }
                    });
                    C2929v.m7622(C2929v.this, false);
                    C2929v.m7609(C2929v.this, true);
                    if ((!C2929v.m7620(C2929v.this) || C2929v.m7613(C2929v.this)) && !activity.isFinishing()) {
                        C2929v c2929v = C2929v.this;
                        Activity activity2 = activity;
                        c2929v.m7628(activity2, C2929v.m13737(activity2));
                    }
                    C2929v.m7611(C2929v.this, false);
                }
            }
        });
        int i = f7344 + 63;
        f7346 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(final Activity activity, final Bundle bundle) {
        m7617(new AbstractRunnableC2878it() { // from class: com.ironsource.adqualitysdk.sdk.i.v.9
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
            /* renamed from: ﾒ */
            public final void mo4950() {
                if (C2929v.m7621(C2929v.this, activity)) {
                    C2929v.m7608(C2929v.this).onActivitySaveInstanceState(activity, bundle);
                    Bundle bundle2 = bundle;
                    if (bundle2 != null) {
                        bundle2.putBoolean(C2929v.m7602(), C2929v.m7620(C2929v.this));
                    }
                    C2929v.m7622(C2929v.this, true);
                }
            }
        });
        int i = f7344 + 45;
        f7346 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(final Activity activity) {
        C2926s.m7600(new AbstractRunnableC2878it() { // from class: com.ironsource.adqualitysdk.sdk.i.v.6
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
            /* renamed from: ﾒ */
            public final void mo4950() {
                if (C2929v.m7621(C2929v.this, activity)) {
                    C2929v.m7608(C2929v.this).onActivityStarted(activity);
                }
            }
        });
        int i = f7346 + 85;
        f7344 = i % 128;
        if (i % 2 == 0) {
            int i2 = 17 / 0;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(final Activity activity) {
        m7617(new AbstractRunnableC2878it() { // from class: com.ironsource.adqualitysdk.sdk.i.v.7
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
            /* renamed from: ﾒ */
            public final void mo4950() throws JSONException {
                if (C2929v.m7621(C2929v.this, activity)) {
                    C2926s.m7600(new AbstractRunnableC2878it() { // from class: com.ironsource.adqualitysdk.sdk.i.v.7.3
                        @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
                        /* renamed from: ﾒ */
                        public final void mo4950() {
                            C2929v.m7608(C2929v.this).onActivityStopped(activity);
                        }
                    });
                    if (C2929v.m7610(C2929v.this) && !C2929v.m7603(C2929v.this) && activity.isFinishing()) {
                        C2929v.this.m13739(activity);
                    }
                }
            }
        });
        int i = f7346 + 69;
        f7344 = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2930w
    /* renamed from: ﾇ */
    public final /* synthetic */ View mo4906(Activity activity) {
        f7344 = (f7346 + 39) % 128;
        View viewM7619 = m7619(activity);
        f7344 = (f7346 + 33) % 128;
        return viewM7619;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2930w
    /* renamed from: ﾒ */
    public final /* bridge */ /* synthetic */ void mo4909(Activity activity, List list) {
        int i = f7346 + 5;
        f7344 = i % 128;
        int i2 = i % 2;
        m13738(activity, (List<WebView>) list);
        if (i2 == 0) {
            throw null;
        }
        f7346 = (f7344 + 9) % 128;
    }

    /* renamed from: ﱡ */
    private static String m7605(Activity activity) {
        int i = f7344 + 61;
        f7346 = i % 128;
        int i2 = i % 2;
        int iHashCode = activity.hashCode();
        if (i2 == 0) {
            return Integer.toHexString(iHashCode);
        }
        Integer.toHexString(iHashCode);
        throw null;
    }

    /* renamed from: ﻏ */
    private boolean m7607(Activity activity) {
        Class<?> cls = activity.getClass();
        if (this.f7354 == null) {
            return false;
        }
        if (e.m7639(this.f7351)) {
            boolean zEquals = this.f7354.equals(cls);
            int i = f7346 + 27;
            f7344 = i % 128;
            if (i % 2 != 0) {
                return zEquals;
            }
            throw null;
        }
        boolean zIsAssignableFrom = this.f7354.isAssignableFrom(cls);
        int i2 = f7344 + 71;
        f7346 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 23 / 0;
        }
        return zIsAssignableFrom;
    }

    /* renamed from: ﻛ */
    public static /* synthetic */ boolean m7611(C2929v c2929v, boolean z) {
        int i = f7344 + 21;
        int i2 = i % 128;
        f7346 = i2;
        int i3 = i % 2;
        c2929v.f7350 = z;
        if (i3 != 0) {
            int i4 = 21 / 0;
        }
        int i5 = i2 + 93;
        f7344 = i5 % 128;
        if (i5 % 2 != 0) {
            return z;
        }
        throw null;
    }

    /* renamed from: ｋ */
    public static /* synthetic */ boolean m7613(C2929v c2929v) {
        int i = f7346;
        int i2 = i + 65;
        f7344 = i2 % 128;
        int i3 = i2 % 2;
        boolean z = c2929v.f7350;
        if (i3 == 0) {
            throw null;
        }
        int i4 = i + 93;
        f7344 = i4 % 128;
        if (i4 % 2 != 0) {
            return z;
        }
        throw null;
    }

    /* renamed from: ﾇ */
    public static /* synthetic */ e m7615(C2929v c2929v) {
        int i = f7344;
        f7346 = (i + 21) % 128;
        e eVar = c2929v.f7351;
        int i2 = i + 99;
        f7346 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 29 / 0;
        }
        return eVar;
    }

    /* renamed from: ﾒ */
    public static /* synthetic */ boolean m7620(C2929v c2929v) {
        int i = (f7346 + 71) % 128;
        f7344 = i;
        boolean z = c2929v.f7353;
        int i2 = i + InterfaceC3173h3.d.b.f8826i;
        f7346 = i2 % 128;
        if (i2 % 2 == 0) {
            return z;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2930w
    /* renamed from: ﻐ */
    public final /* bridge */ /* synthetic */ void mo7624(Activity activity) throws JSONException {
        f7344 = (f7346 + 117) % 128;
        m13739(activity);
        f7346 = (f7344 + 81) % 128;
    }

    /* renamed from: ｋ */
    public static /* synthetic */ boolean m7614(C2929v c2929v, boolean z) {
        int i = f7346;
        f7344 = (i + 59) % 128;
        c2929v.f7353 = z;
        f7344 = (i + 45) % 128;
        return z;
    }

    /* renamed from: ﾇ, reason: avoid collision after fix types in other method and contains not printable characters */
    public static /* synthetic */ String m13737(Activity activity) {
        f7344 = (f7346 + 45) % 128;
        String strM7605 = m7605(activity);
        f7344 = (f7346 + 7) % 128;
        return strM7605;
    }

    /* renamed from: ﾒ */
    public static /* synthetic */ boolean m7621(C2929v c2929v, Activity activity) {
        int i = f7346 + 11;
        f7344 = i % 128;
        int i2 = i % 2;
        boolean zM7607 = c2929v.m7607(activity);
        if (i2 == 0) {
            int i3 = 48 / 0;
        }
        int i4 = f7344 + 39;
        f7346 = i4 % 128;
        if (i4 % 2 == 0) {
            return zM7607;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2930w
    /* renamed from: ﻐ */
    public final /* synthetic */ void mo7625(Activity activity, String str) throws JSONException {
        f7346 = (f7344 + 121) % 128;
        m7628(activity, str);
        f7346 = (f7344 + 49) % 128;
    }

    /* renamed from: ﻛ */
    public final void m7626(InterfaceC2893jh interfaceC2893jh) {
        int i = f7344 + 83;
        f7346 = i % 128;
        int i2 = i % 2;
        this.f7356 = interfaceC2893jh;
        if (i2 != 0) {
            throw null;
        }
    }

    /* renamed from: ﻐ */
    public static /* synthetic */ boolean m7609(C2929v c2929v, boolean z) {
        int i = f7346;
        int i2 = i + 33;
        f7344 = i2 % 128;
        int i3 = i2 % 2;
        c2929v.f7355 = z;
        if (i3 == 0) {
            throw null;
        }
        int i4 = i + 77;
        f7344 = i4 % 128;
        if (i4 % 2 != 0) {
            return z;
        }
        throw null;
    }

    /* renamed from: ﾇ */
    public static /* synthetic */ boolean m7618() {
        f7346 = (f7344 + InterfaceC3173h3.d.b.f8821d) % 128;
        return false;
    }

    /* renamed from: ﾒ */
    public static /* synthetic */ boolean m7622(C2929v c2929v, boolean z) {
        int i = f7344;
        f7346 = (i + 21) % 128;
        c2929v.f7352 = z;
        int i2 = i + 17;
        f7346 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 6 / 0;
        }
        return z;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2930w
    /* renamed from: ﻛ */
    public final InterfaceC2923p<WebView, Activity> mo4904() {
        f7346 = (f7344 + 51) % 128;
        return this;
    }

    /* renamed from: ｋ */
    public final void m7627() {
        int i = f7344 + 79;
        f7346 = i % 128;
        if (i % 2 != 0) {
            AbstractC2894ji.m7268().m7271(this);
            throw null;
        }
        AbstractC2894ji.m7268().m7271(this);
        f7346 = (f7344 + InterfaceC3173h3.d.b.f8821d) % 128;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002d, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002e, code lost:
    
        com.ironsource.adqualitysdk.sdk.p009i.C2926s.m7596(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0031, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0016, code lost:
    
        if (com.ironsource.adqualitysdk.sdk.p009i.C2929v.e.m7635(r2.f7351) != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0020, code lost:
    
        if (com.ironsource.adqualitysdk.sdk.p009i.C2929v.e.m7635(r2.f7351) != true) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0022, code lost:
    
        com.ironsource.adqualitysdk.sdk.p009i.C2926s.m7598(r3);
        com.ironsource.adqualitysdk.sdk.p009i.C2929v.f7346 = (com.ironsource.adqualitysdk.sdk.p009i.C2929v.f7344 + 47) % 128;
     */
    /* renamed from: ﾇ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m7617(com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it r3) {
        /*
            r2 = this;
            int r0 = com.ironsource.adqualitysdk.sdk.p009i.C2929v.f7346
            int r0 = r0 + 83
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.p009i.C2929v.f7344 = r1
            int r0 = r0 % 2
            if (r0 != 0) goto L19
            com.ironsource.adqualitysdk.sdk.i.v$e r0 = r2.f7351
            boolean r0 = com.ironsource.adqualitysdk.sdk.p009i.C2929v.e.m7635(r0)
            r1 = 19
            int r1 = r1 / 0
            if (r0 == 0) goto L22
            goto L2e
        L19:
            com.ironsource.adqualitysdk.sdk.i.v$e r0 = r2.f7351
            boolean r0 = com.ironsource.adqualitysdk.sdk.p009i.C2929v.e.m7635(r0)
            r1 = 1
            if (r0 == r1) goto L2e
        L22:
            com.ironsource.adqualitysdk.sdk.p009i.C2926s.m7598(r3)
            int r3 = com.ironsource.adqualitysdk.sdk.p009i.C2929v.f7344
            int r3 = r3 + 47
            int r3 = r3 % 128
            com.ironsource.adqualitysdk.sdk.p009i.C2929v.f7346 = r3
            return
        L2e:
            com.ironsource.adqualitysdk.sdk.p009i.C2926s.m7596(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.p009i.C2929v.m7617(com.ironsource.adqualitysdk.sdk.i.it):void");
    }

    /* renamed from: ﻐ */
    public final void m7623() {
        f7344 = (f7346 + 31) % 128;
        m7677((InterfaceC2923p) null);
        m7626((InterfaceC2893jh) null);
        AbstractC2894ji.m7268().m7270(this);
        int i = f7344 + 81;
        f7346 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2893jh
    /* renamed from: ﻛ */
    public final void mo5068(final Activity activity) {
        C2926s.m7600(new AbstractRunnableC2878it() { // from class: com.ironsource.adqualitysdk.sdk.i.v.2
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
            /* renamed from: ﾒ */
            public final void mo4950() {
                if (C2929v.m7621(C2929v.this, activity)) {
                    C2929v.m7608(C2929v.this).mo5068(activity);
                }
            }
        });
        f7346 = (f7344 + 7) % 128;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2893jh
    /* renamed from: ｋ */
    public final void mo5069(final Activity activity) {
        C2926s.m7600(new AbstractRunnableC2878it() { // from class: com.ironsource.adqualitysdk.sdk.i.v.5
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
            /* renamed from: ﾒ */
            public final void mo4950() {
                if (C2929v.m7621(C2929v.this, activity)) {
                    C2929v.m7608(C2929v.this).mo5069(activity);
                }
            }
        });
        int i = f7346 + 115;
        f7344 = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ﾒ */
    public final void m7629(JSONObject jSONObject) {
        e eVar = new e(this, jSONObject);
        m7647((AbstractC2930w.e) eVar);
        this.f7351 = eVar;
        C2926s.m7591(new AbstractRunnableC2878it() { // from class: com.ironsource.adqualitysdk.sdk.i.v.1

            /* renamed from: ﻐ */
            private static int f7357 = 0;

            /* renamed from: ｋ */
            private static int f7358 = 1;

            /* renamed from: ﾒ */
            private static long f7359 = 4990807707552663920L;

            /* renamed from: ﻛ */
            private static String m7630(String str, int i) {
                String str2;
                char[] charArray = str;
                if (str != null) {
                    charArray = str.toCharArray();
                }
                char[] cArr = charArray;
                synchronized (C2777f.f6322) {
                    try {
                        char[] cArrM6790 = C2777f.m6790(f7359, cArr, i);
                        C2777f.f6321 = 4;
                        while (true) {
                            int i2 = C2777f.f6321;
                            if (i2 < cArrM6790.length) {
                                C2777f.f6320 = i2 - 4;
                                cArrM6790[i2] = (char) ((cArrM6790[i2] ^ cArrM6790[i2 % 4]) ^ (r2 * f7359));
                                C2777f.f6321 = i2 + 1;
                            } else {
                                str2 = new String(cArrM6790, 4, cArrM6790.length - 4);
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return str2;
            }

            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
            /* renamed from: ﾒ */
            public final void mo4950() {
                try {
                    C2929v c2929v = C2929v.this;
                    C2929v.m7612(c2929v, Class.forName(e.m7642(C2929v.m7615(c2929v))));
                    C2926s.m7596(new AbstractRunnableC2878it() { // from class: com.ironsource.adqualitysdk.sdk.i.v.1.3
                        @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
                        /* renamed from: ﾒ */
                        public final void mo4950() {
                            C2929v.this.m7627();
                        }
                    });
                    f7358 = (f7357 + 31) % 128;
                } catch (ClassNotFoundException e2) {
                    String strIntern = m7630("ᕷၵ塡臱ᔶ奦쫵巈チ缬\ue0b5莘庶蓡虉Ꙁ摙ꪡ尭찄舅", TextUtils.getOffsetAfter("", 0)).intern();
                    StringBuilder sb = new StringBuilder();
                    sb.append(m7630("呰ᔬ剿鿏吵尮샭䏰燂稼\ueab3鶶ᾃ膨豺롱╙꿲嘸퉿쌄\uf533箿\uecfa\ue8c6፹ᶱګ뚃㻼❰ⅹ尐", ViewConfiguration.getMaximumDrawingCacheSize() >> 24).intern());
                    sb.append(e.m7642(C2929v.m7615(C2929v.this)));
                    sb.append(m7630("蠒镛駙⎖蠨\udc0b", (-1) - TextUtils.indexOf((CharSequence) "", '0', 0)).intern());
                    sb.append(e2.getLocalizedMessage());
                    C2921n.m7509(strIntern, sb.toString());
                }
            }
        });
        int i = f7344 + 71;
        f7346 = i % 128;
        if (i % 2 != 0) {
            int i2 = 95 / 0;
        }
    }

    /* renamed from: ﾒ */
    private static View m7619(Activity activity) {
        f7346 = (f7344 + InterfaceC3173h3.d.b.f8823f) % 128;
        View viewFindViewById = activity.findViewById(R.id.content);
        int i = f7344 + 7;
        f7346 = i % 128;
        if (i % 2 != 0) {
            int i2 = 92 / 0;
        }
        return viewFindViewById;
    }

    /* renamed from: ﻐ, reason: avoid collision after fix types in other method and contains not printable characters */
    public final void m13739(Activity activity) throws JSONException {
        boolean z;
        int i = f7346 + 53;
        f7344 = i % 128;
        if (i % 2 == 0) {
            super.mo7624((C2929v) activity);
            z = true;
        } else {
            super.mo7624((C2929v) activity);
            z = false;
        }
        this.f7353 = z;
    }

    /* renamed from: ﾇ */
    public final void m7628(Activity activity, String str) throws JSONException {
        if (this.f7353) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(C2869ik.f6787, true);
                f7344 = (f7346 + InterfaceC3173h3.d.b.f8823f) % 128;
            } catch (JSONException e2) {
                String strIntern = m7616("칡饓ᛡ\ueec8\uf1f8黇\ude23躑总蔦\udc61\uebf2䦔旻줧뿦㱶鋌", (ViewConfiguration.getPressedStateDuration() >> 16) + 17).intern();
                StringBuilder sb = new StringBuilder();
                sb.append(m7616("\u0cf4\uea0f≳ꤙ㺛荋俊熘酋遛⑶櫆ᒺ㧂䕻\ue02aТ뽾㾁藘䦔旻쟤附䁅萡쎎㑄捝⯉㶲\ueba6", 33 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))).intern());
                sb.append(e2.getLocalizedMessage());
                C2921n.m7509(strIntern, sb.toString());
            }
            m7648(jSONObject, (JSONObject) activity, str);
            return;
        }
        int i = f7344 + 125;
        f7346 = i % 128;
        int i2 = i % 2;
        this.f7353 = true;
        super.mo7625((C2929v) activity, str);
    }

    /* renamed from: ﾒ, reason: avoid collision after fix types in other method and contains not printable characters */
    private void m13738(Activity activity, List<WebView> list) {
        f7344 = (f7346 + 69) % 128;
        C2917ke.m7461(activity, WebView.class, e.m7640(this.f7351), e.m7637(this.f7351), false, false, null, this.f7351.f7417, list);
        int i = f7346 + 31;
        f7344 = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2930w
    /* renamed from: ﾒ */
    public final AbstractViewOnLayoutChangeListenerC2644ab mo4908() {
        C2645ac c2645ac = new C2645ac();
        int i = f7344 + 89;
        f7346 = i % 128;
        if (i % 2 == 0) {
            return c2645ac;
        }
        throw null;
    }

    /* renamed from: ﾇ */
    private static String m7616(String str, int i) {
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
                            char c3 = (char) (c - (((c2 + i3) ^ ((c2 << 4) + f7345)) ^ ((c2 >>> 5) + f7343)));
                            cArr3[1] = c3;
                            cArr3[0] = (char) (c2 - (((c3 >>> 5) + f7347) ^ ((c3 + i3) ^ ((c3 << 4) + f7348))));
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
