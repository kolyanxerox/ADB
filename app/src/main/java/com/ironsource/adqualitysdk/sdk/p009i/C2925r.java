package com.ironsource.adqualitysdk.sdk.p009i;

import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.internal.ads.AbstractC2183w4;
import com.ironsource.InterfaceC3173h3;
import com.ironsource.adqualitysdk.sdk.ISAdQualityAdListener;
import com.ironsource.adqualitysdk.sdk.ISAdQualityAdType;
import com.ironsource.adqualitysdk.sdk.ISAdQualityConfig;
import com.ironsource.adqualitysdk.sdk.ISAdQualityInitError;
import com.ironsource.adqualitysdk.sdk.ISAdQualityInitListener;
import com.ironsource.adqualitysdk.sdk.ISAdQualityLogLevel;
import com.ironsource.adqualitysdk.sdk.ISAdQualitySegment;
import com.ironsource.adqualitysdk.sdk.IronSourceAdQuality;
import com.ironsource.adqualitysdk.sdk.p009i.AbstractC2661as;
import com.ironsource.adqualitysdk.sdk.p009i.C2890je;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.r */
/* loaded from: classes2.dex */
public class C2925r extends IronSourceAdQuality {

    /* renamed from: リ */
    private static int f7247 = 0;

    /* renamed from: ヮ */
    private static char[] f7248 = null;

    /* renamed from: ヶ */
    private static long f7249 = 0;

    /* renamed from: 乁 */
    private static int f7250 = 1;

    /* renamed from: ｋ */
    private static C2925r f7251;

    /* renamed from: 爫 */
    private C2882ix f7252;

    /* renamed from: טּ */
    private C2890je f7254;

    /* renamed from: סּ */
    private C2653ak f7255;

    /* renamed from: ףּ */
    private C2654al f7256;

    /* renamed from: ﭖ */
    private ISAdQualityAdListener f7257;

    /* renamed from: ﭴ */
    private C2666ax f7258;

    /* renamed from: ﮉ */
    private C2651ai f7260;

    /* renamed from: ﮌ */
    private C2881iw f7261;

    /* renamed from: ﺙ */
    private Context f7265;

    /* renamed from: ﾇ */
    private ISAdQualityConfig f7269;

    /* renamed from: ﾒ */
    private final C2657ao f7270 = new C2657ao();

    /* renamed from: ﻐ */
    private boolean f7267 = false;

    /* renamed from: ﻛ */
    private boolean f7268 = false;

    /* renamed from: ﻏ */
    private boolean f7266 = false;

    /* renamed from: ﱡ */
    private boolean f7264 = false;

    /* renamed from: ﱟ */
    private boolean f7263 = false;

    /* renamed from: ﮐ */
    private ISAdQualityLogLevel f7262 = ISAdQualityLogLevel.INFO;

    /* renamed from: ﬤ */
    private final Set<ISAdQualityInitListener> f7253 = new CopyOnWriteArraySet();

    /* renamed from: ﭸ */
    private final C2652aj f7259 = new C2652aj();

    /* renamed from: com.ironsource.adqualitysdk.sdk.i.r$1 */
    public class AnonymousClass1 extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            C2910jy.m7389(intent);
        }
    }

    /* renamed from: com.ironsource.adqualitysdk.sdk.i.r$2 */
    public class AnonymousClass2 extends AbstractRunnableC2878it {

        /* renamed from: ﻏ */
        private static long f7271 = -9020098904204469274L;

        /* renamed from: ﻛ */
        private /* synthetic */ String f7273;

        /* renamed from: ｋ */
        private /* synthetic */ Activity f7274;

        /* renamed from: ﾇ */
        private /* synthetic */ Application f7275;

        /* renamed from: ﾒ */
        private /* synthetic */ ISAdQualityConfig f7276;

        /* renamed from: com.ironsource.adqualitysdk.sdk.i.r$2$1 */
        public class AnonymousClass1 implements InterfaceC2662at {

            /* renamed from: ﮐ */
            private static int f7277 = 1;

            /* renamed from: ﱟ */
            private static int f7278 = 0;

            /* renamed from: ﺙ */
            private static char f7279 = 24228;

            /* renamed from: ﻐ */
            private static char f7280 = 6553;

            /* renamed from: ﾇ */
            private static char f7281 = 8168;

            /* renamed from: ﾒ */
            private static char f7282 = 14949;

            /* renamed from: ﻛ */
            private /* synthetic */ String f7283;

            public AnonymousClass1(String str) {
                str = str;
            }

            /* renamed from: ｋ */
            private static String m7583(String str, int i) {
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
                                    char c3 = (char) (c - (((c2 + i3) ^ ((c2 << 4) + f7281)) ^ ((c2 >>> 5) + f7279)));
                                    cArr3[1] = c3;
                                    cArr3[0] = (char) (c2 - (((c3 >>> 5) + f7280) ^ ((c3 + i3) ^ ((c3 << 4) + f7282))));
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

            @Override // com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2662at
            /* renamed from: ﾒ */
            public final void mo4993() {
                int i = f7278 + 115;
                f7277 = i % 128;
                if (i % 2 == 0) {
                    if (AbstractC2661as.m5141().mo5165(m7583("阀蜉\ue99b末捒ﶮ", 60 >>> KeyEvent.keyCodeFromString("")).intern(), str)) {
                        return;
                    }
                } else if (AbstractC2661as.m5141().mo5165(m7583("阀蜉\ue99b末捒ﶮ", 6 - KeyEvent.keyCodeFromString("")).intern(), str)) {
                    return;
                }
                C2925r.m7563(C2925r.this);
                f7277 = (f7278 + 107) % 128;
            }
        }

        /* renamed from: com.ironsource.adqualitysdk.sdk.i.r$2$10 */
        public class AnonymousClass10 implements ISAdQualityAdListener {
            public AnonymousClass10() {
            }

            @Override // com.ironsource.adqualitysdk.sdk.ISAdQualityAdListener
            public final void adClosed(String str, ISAdQualityAdType iSAdQualityAdType) {
                if (C2925r.m7527(C2925r.this) != null) {
                    C2925r.m7527(C2925r.this).adClosed(str, iSAdQualityAdType);
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.ISAdQualityAdListener
            public final void adDisplayed(String str, ISAdQualityAdType iSAdQualityAdType) {
                if (C2925r.m7527(C2925r.this) != null) {
                    C2925r.m7527(C2925r.this).adDisplayed(str, iSAdQualityAdType);
                }
            }
        }

        /* renamed from: com.ironsource.adqualitysdk.sdk.i.r$2$2 */
        public class C45682 implements C2890je.e {
            public C45682() {
            }

            @Override // com.ironsource.adqualitysdk.sdk.p009i.C2890je.e
            /* renamed from: ﾒ */
            public final void mo7244() {
                C2925r.m7563(C2925r.this);
            }
        }

        /* renamed from: com.ironsource.adqualitysdk.sdk.i.r$2$3 */
        public class AnonymousClass3 implements InterfaceC2924q {

            /* renamed from: com.ironsource.adqualitysdk.sdk.i.r$2$3$3 */
            public class C45693 extends AbstractRunnableC2878it {

                /* renamed from: ﱟ */
                private static char f7288 = 29882;

                /* renamed from: ﺙ */
                private static int f7289 = 0;

                /* renamed from: ﻏ */
                private static int f7290 = 1;

                /* renamed from: ﻐ */
                private static char f7291 = 6589;

                /* renamed from: ﻛ */
                private static char f7292 = 63511;

                /* renamed from: ﾒ */
                private static char f7293 = 719;

                /* renamed from: ﾇ */
                private /* synthetic */ String f7295;

                public C45693(String str) {
                    str = str;
                }

                /* renamed from: ｋ */
                private static String m7584(String str, int i) {
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
                                        char c3 = (char) (c - (((c2 + i3) ^ ((c2 << 4) + f7291)) ^ ((c2 >>> 5) + f7288)));
                                        cArr3[1] = c3;
                                        cArr3[0] = (char) (c2 - (((c3 >>> 5) + f7293) ^ ((c3 + i3) ^ ((c3 << 4) + f7292))));
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

                @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
                /* renamed from: ﾒ */
                public final void mo4950() {
                    f7289 = (f7290 + 81) % 128;
                    C2925r.m7534(C2925r.this).m5304(m7584("ᐗꨓ\uee7b걮뜔⧿\uee7b걮\ue7b4깜项͍⓺讍伪\udf3a䤕\u0e83䛟륀Ꞃ䇏辛䴪", Process.getGidForName("") + 24).intern(), Collections.singletonList(str));
                    f7289 = (f7290 + 27) % 128;
                }
            }

            public AnonymousClass3() {
            }

            @Override // com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2924q
            public void onEvent(String str) {
                C2926s.m7591(new AbstractRunnableC2878it() { // from class: com.ironsource.adqualitysdk.sdk.i.r.2.3.3

                    /* renamed from: ﱟ */
                    private static char f7288 = 29882;

                    /* renamed from: ﺙ */
                    private static int f7289 = 0;

                    /* renamed from: ﻏ */
                    private static int f7290 = 1;

                    /* renamed from: ﻐ */
                    private static char f7291 = 6589;

                    /* renamed from: ﻛ */
                    private static char f7292 = 63511;

                    /* renamed from: ﾒ */
                    private static char f7293 = 719;

                    /* renamed from: ﾇ */
                    private /* synthetic */ String f7295;

                    public C45693(String str2) {
                        str = str2;
                    }

                    /* renamed from: ｋ */
                    private static String m7584(String str2, int i) {
                        String str22;
                        char[] charArray = str2;
                        if (str2 != null) {
                            charArray = str2.toCharArray();
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
                                            char c3 = (char) (c - (((c2 + i3) ^ ((c2 << 4) + f7291)) ^ ((c2 >>> 5) + f7288)));
                                            cArr3[1] = c3;
                                            cArr3[0] = (char) (c2 - (((c3 >>> 5) + f7293) ^ ((c3 + i3) ^ ((c3 << 4) + f7292))));
                                            i3 -= 40503;
                                        }
                                        int i5 = C2920m.f7236;
                                        cArr2[i5] = cArr3[0];
                                        cArr2[i5 + 1] = cArr3[1];
                                        C2920m.f7236 = i5 + 2;
                                    } else {
                                        str22 = new String(cArr2, 0, i);
                                    }
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return str22;
                    }

                    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
                    /* renamed from: ﾒ */
                    public final void mo4950() {
                        f7289 = (f7290 + 81) % 128;
                        C2925r.m7534(C2925r.this).m5304(m7584("ᐗꨓ\uee7b걮뜔⧿\uee7b걮\ue7b4깜项͍⓺讍伪\udf3a䤕\u0e83䛟륀Ꞃ䇏辛䴪", Process.getGidForName("") + 24).intern(), Collections.singletonList(str));
                        f7289 = (f7290 + 27) % 128;
                    }
                });
            }
        }

        /* renamed from: com.ironsource.adqualitysdk.sdk.i.r$2$4 */
        public class AnonymousClass4 implements AbstractC2661as.b {

            /* renamed from: ﻛ */
            private static int f7296 = 0;

            /* renamed from: ﾇ */
            private static int f7297 = 1;

            /* renamed from: ﾒ */
            private static long f7298 = -6575137435121282771L;

            public AnonymousClass4() {
            }

            /* renamed from: ﻛ */
            private static String m7585(String str, int i) {
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
                                cArr2[i2] = (char) ((cArr[i2] ^ (C2804g.f6423 * i2)) ^ f7298);
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

            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2661as.b
            /* renamed from: ﻐ */
            public final void mo5178() {
                f7296 = (f7297 + 81) % 128;
                C2925r.m7570(C2925r.this, ISAdQualityInitError.CONFIG_LOAD_TIMEOUT, m7585("ᅤ┫秆趶쀨ᓱ⢲缒돬잤ᨆ⺪抂뤸췀Ƕ吞棧벹\uf304ߠ害湃ꋢ\uf6baഁ䇫闺ꠕﳥザ䜃鯢꾭\ue213", 13398 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))).intern());
                int i = f7297 + InterfaceC3173h3.d.b.f8821d;
                f7296 = i % 128;
                if (i % 2 != 0) {
                    throw null;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2661as.b
            /* renamed from: ｋ */
            public final void mo5179() {
                C2925r c2925r;
                ISAdQualityInitError iSAdQualityInitError;
                int iResolveSizeAndState;
                int i = f7296 + InterfaceC3173h3.d.b.f8819b;
                f7297 = i % 128;
                if (i % 2 == 0) {
                    c2925r = C2925r.this;
                    iSAdQualityInitError = ISAdQualityInitError.NO_NETWORK_CONNECTION;
                    iResolveSizeAndState = 6011 - View.resolveSizeAndState(0, 1, 1);
                } else {
                    c2925r = C2925r.this;
                    iSAdQualityInitError = ISAdQualityInitError.NO_NETWORK_CONNECTION;
                    iResolveSizeAndState = 5923 - View.resolveSizeAndState(0, 0, 0);
                }
                C2925r.m7570(c2925r, iSAdQualityInitError, m7585("ᅣ١㽋吪䷄拶鮈낷ꡇ셽\uf653\uefcfӦ㶄助䩅捾頊넲ꛛ\udfff", iResolveSizeAndState).intern());
                f7297 = (f7296 + 9) % 128;
            }
        }

        /* renamed from: com.ironsource.adqualitysdk.sdk.i.r$2$5 */
        public class AnonymousClass5 implements InterfaceC2649ag {
            public AnonymousClass5() {
            }

            @Override // com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2649ag
            public void onEventReceived(JSONObject jSONObject) {
                C2871im.m7116(C2925r.m7536(C2925r.this), C2869ik.f6801, jSONObject, new Object[0]);
            }
        }

        /* renamed from: com.ironsource.adqualitysdk.sdk.i.r$2$7 */
        public class AnonymousClass7 implements ISAdQualityInitListener {
            public AnonymousClass7() {
            }

            @Override // com.ironsource.adqualitysdk.sdk.ISAdQualityInitListener
            public final void adQualitySdkInitFailed(ISAdQualityInitError iSAdQualityInitError, String str) {
                C2925r.m7570(C2925r.this, iSAdQualityInitError, str);
            }

            @Override // com.ironsource.adqualitysdk.sdk.ISAdQualityInitListener
            public final void adQualitySdkInitSuccess() {
                C2925r.m7540(C2925r.this);
            }
        }

        public AnonymousClass2(ISAdQualityConfig iSAdQualityConfig, String str, Application application, Activity activity) {
            this.f7276 = iSAdQualityConfig;
            this.f7273 = str;
            this.f7275 = application;
            this.f7274 = activity;
        }

        /* renamed from: ｋ */
        private static String m7582(String str, int i) {
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
                            cArr2[i2] = (char) ((cArr[i2] ^ (C2804g.f6423 * i2)) ^ f7271);
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

        @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
        /* renamed from: ﾒ */
        public final void mo4950() {
            try {
                String userId = this.f7276.getUserId();
                C2925r.m7575(C2925r.this, this.f7276.getLogLevel());
                String strIntern = m7582("鮧\uf7f1䍑\udeca⩋薵ᄽ沷\uf807䮾Ƛ㍜", (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 27762).intern();
                StringBuilder sb = new StringBuilder();
                sb.append(m7582("鮯\uaac3酪ࡳ庣淰뱈슂ᇄ\u202c睦薸푂᭞⦕磷輾\ude3d\uecc1㌇䉊郡ꟿ\uf63eҗ䮕", View.MeasureSpec.getSize(0) + 12619).intern());
                sb.append(this.f7273);
                C2921n.m7504(strIntern, sb.toString());
                C2866ih.m7090(this.f7275.getApplicationContext()).m7096();
                C2925r.m7565(C2925r.this, this.f7276.isTestMode());
                if (this.f7276.isTestMode()) {
                    C2921n.m7502(m7582("鮧\uf7f1䍑\udeca⩋薵ᄽ沷\uf807䮾Ƛ㍜", 27763 - (ViewConfiguration.getKeyRepeatDelay() >> 16)).intern(), m7582("鮱\ue1f8漊\uf4b5狓\uf873䖛썞䤿횐屰\ud9b7⟽괕⪺뀘㹢뮉į躄ᒪ鉁ᾥ攙\ue36b梁\uf637玊臨䝍쳤䨓큣嶪\udb0c⅖껕㐹놙㾢蕊ʣ蠅ᙶ鎓ᥴ曕\uecb7橳\uf7bf納ﭥ䃞츾䯌퇸彇꒵∈ꠣ㗖댠㢗蛳౫視\u17fc鵞\u1ae7怉\uee6e毊\uf13b绑쓧䉚쾾唙팴壕\ua633⏉ꧬ㝂벹㨎聭ෝ謪ႄ黤\ue402懣\uef44", 31327 - KeyEvent.getDeadChar(0, 0)).intern());
                }
                try {
                    Class.forName(m7582("鮇홱p牿걭Ṓ䡔먇\uf441♔遲숔㰹渺\ud816\u0a12䐢똎\ue017勶", (KeyEvent.getMaxKeyCode() >> 16) + 19961).intern());
                } catch (Throwable unused) {
                }
                Activity activity = this.f7274;
                if (activity != null) {
                    C2910jy.m7374(activity);
                } else {
                    C2910jy.m7377(this.f7275);
                }
                C2925r.m7541(C2925r.this).m5111(this.f7273);
                C2925r.m7541(C2925r.this).m5115(this.f7276.getInitializationSource());
                C2925r.m7541(C2925r.this).m5117(this.f7276.getCoppa());
                C2925r.m7541(C2925r.this).m5119(this.f7276.getDeviceIdType());
                C2925r.m7541(C2925r.this).m5116(this.f7276.getMetaData());
                Context applicationContext = this.f7275.getApplicationContext();
                C2925r.m7572(C2925r.this, applicationContext);
                C2925r.m7557(C2925r.this, new C2881iw(applicationContext));
                C2925r c2925r = C2925r.this;
                C2925r.m7573(c2925r);
                C2925r.m7568(c2925r, new C2890je(applicationContext, C2652aj.m5074(), "B0r1sW@sH3re"));
                AbstractC2661as.m5141().mo5172(applicationContext, C2925r.m7567(C2925r.this), C2925r.m7573(C2925r.this), new AbstractC2661as.b() { // from class: com.ironsource.adqualitysdk.sdk.i.r.2.4

                    /* renamed from: ﻛ */
                    private static int f7296 = 0;

                    /* renamed from: ﾇ */
                    private static int f7297 = 1;

                    /* renamed from: ﾒ */
                    private static long f7298 = -6575137435121282771L;

                    public AnonymousClass4() {
                    }

                    /* renamed from: ﻛ */
                    private static String m7585(String str, int i) {
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
                                        cArr2[i2] = (char) ((cArr[i2] ^ (C2804g.f6423 * i2)) ^ f7298);
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

                    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2661as.b
                    /* renamed from: ﻐ */
                    public final void mo5178() {
                        f7296 = (f7297 + 81) % 128;
                        C2925r.m7570(C2925r.this, ISAdQualityInitError.CONFIG_LOAD_TIMEOUT, m7585("ᅤ┫秆趶쀨ᓱ⢲缒돬잤ᨆ⺪抂뤸췀Ƕ吞棧벹\uf304ߠ害湃ꋢ\uf6baഁ䇫闺ꠕﳥザ䜃鯢꾭\ue213", 13398 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))).intern());
                        int i = f7297 + InterfaceC3173h3.d.b.f8821d;
                        f7296 = i % 128;
                        if (i % 2 != 0) {
                            throw null;
                        }
                    }

                    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2661as.b
                    /* renamed from: ｋ */
                    public final void mo5179() {
                        C2925r c2925r2;
                        ISAdQualityInitError iSAdQualityInitError;
                        int iResolveSizeAndState;
                        int i = f7296 + InterfaceC3173h3.d.b.f8819b;
                        f7297 = i % 128;
                        if (i % 2 == 0) {
                            c2925r2 = C2925r.this;
                            iSAdQualityInitError = ISAdQualityInitError.NO_NETWORK_CONNECTION;
                            iResolveSizeAndState = 6011 - View.resolveSizeAndState(0, 1, 1);
                        } else {
                            c2925r2 = C2925r.this;
                            iSAdQualityInitError = ISAdQualityInitError.NO_NETWORK_CONNECTION;
                            iResolveSizeAndState = 5923 - View.resolveSizeAndState(0, 0, 0);
                        }
                        C2925r.m7570(c2925r2, iSAdQualityInitError, m7585("ᅣ١㽋吪䷄拶鮈낷ꡇ셽\uf653\uefcfӦ㶄助䩅捾頊넲ꛛ\udfff", iResolveSizeAndState).intern());
                        f7297 = (f7296 + 9) % 128;
                    }
                }, C2925r.m7554(C2925r.this));
                C2925r.m7558(C2925r.this, new C2882ix(applicationContext, C2925r.m7567(C2925r.this), C2925r.m7573(C2925r.this).m5076()));
                String strM7351 = C2908jw.m7351(applicationContext);
                AbstractC2661as.m5141().mo5162(new InterfaceC2662at() { // from class: com.ironsource.adqualitysdk.sdk.i.r.2.1

                    /* renamed from: ﮐ */
                    private static int f7277 = 1;

                    /* renamed from: ﱟ */
                    private static int f7278 = 0;

                    /* renamed from: ﺙ */
                    private static char f7279 = 24228;

                    /* renamed from: ﻐ */
                    private static char f7280 = 6553;

                    /* renamed from: ﾇ */
                    private static char f7281 = 8168;

                    /* renamed from: ﾒ */
                    private static char f7282 = 14949;

                    /* renamed from: ﻛ */
                    private /* synthetic */ String f7283;

                    public AnonymousClass1(String strM73512) {
                        str = strM73512;
                    }

                    /* renamed from: ｋ */
                    private static String m7583(String str, int i) {
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
                                            char c3 = (char) (c - (((c2 + i3) ^ ((c2 << 4) + f7281)) ^ ((c2 >>> 5) + f7279)));
                                            cArr3[1] = c3;
                                            cArr3[0] = (char) (c2 - (((c3 >>> 5) + f7280) ^ ((c3 + i3) ^ ((c3 << 4) + f7282))));
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

                    @Override // com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2662at
                    /* renamed from: ﾒ */
                    public final void mo4993() {
                        int i = f7278 + 115;
                        f7277 = i % 128;
                        if (i % 2 == 0) {
                            if (AbstractC2661as.m5141().mo5165(m7583("阀蜉\ue99b末捒ﶮ", 60 >>> KeyEvent.keyCodeFromString("")).intern(), str)) {
                                return;
                            }
                        } else if (AbstractC2661as.m5141().mo5165(m7583("阀蜉\ue99b末捒ﶮ", 6 - KeyEvent.keyCodeFromString("")).intern(), str)) {
                            return;
                        }
                        C2925r.m7563(C2925r.this);
                        f7277 = (f7278 + 107) % 128;
                    }
                });
                AbstractC2661as.m5141().mo5170(C2925r.m7532(C2925r.this));
                C2925r.m7564(C2925r.this, applicationContext);
                C2925r c2925r2 = C2925r.this;
                C2925r.m7547(c2925r2, new C2651ai(applicationContext, C2925r.m7541(c2925r2), C2925r.m7573(C2925r.this), this.f7274 != null, strM73512, new InterfaceC2924q() { // from class: com.ironsource.adqualitysdk.sdk.i.r.2.3

                    /* renamed from: com.ironsource.adqualitysdk.sdk.i.r$2$3$3 */
                    public class C45693 extends AbstractRunnableC2878it {

                        /* renamed from: ﱟ */
                        private static char f7288 = 29882;

                        /* renamed from: ﺙ */
                        private static int f7289 = 0;

                        /* renamed from: ﻏ */
                        private static int f7290 = 1;

                        /* renamed from: ﻐ */
                        private static char f7291 = 6589;

                        /* renamed from: ﻛ */
                        private static char f7292 = 63511;

                        /* renamed from: ﾒ */
                        private static char f7293 = 719;

                        /* renamed from: ﾇ */
                        private /* synthetic */ String f7295;

                        public C45693(String str2) {
                            str = str2;
                        }

                        /* renamed from: ｋ */
                        private static String m7584(String str2, int i) {
                            String str22;
                            char[] charArray = str2;
                            if (str2 != null) {
                                charArray = str2.toCharArray();
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
                                                char c3 = (char) (c - (((c2 + i3) ^ ((c2 << 4) + f7291)) ^ ((c2 >>> 5) + f7288)));
                                                cArr3[1] = c3;
                                                cArr3[0] = (char) (c2 - (((c3 >>> 5) + f7293) ^ ((c3 + i3) ^ ((c3 << 4) + f7292))));
                                                i3 -= 40503;
                                            }
                                            int i5 = C2920m.f7236;
                                            cArr2[i5] = cArr3[0];
                                            cArr2[i5 + 1] = cArr3[1];
                                            C2920m.f7236 = i5 + 2;
                                        } else {
                                            str22 = new String(cArr2, 0, i);
                                        }
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                            return str22;
                        }

                        @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
                        /* renamed from: ﾒ */
                        public final void mo4950() {
                            f7289 = (f7290 + 81) % 128;
                            C2925r.m7534(C2925r.this).m5304(m7584("ᐗꨓ\uee7b걮뜔⧿\uee7b걮\ue7b4깜项͍⓺讍伪\udf3a䤕\u0e83䛟륀Ꞃ䇏辛䴪", Process.getGidForName("") + 24).intern(), Collections.singletonList(str));
                            f7289 = (f7290 + 27) % 128;
                        }
                    }

                    public AnonymousClass3() {
                    }

                    @Override // com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2924q
                    public void onEvent(String str2) {
                        C2926s.m7591(new AbstractRunnableC2878it() { // from class: com.ironsource.adqualitysdk.sdk.i.r.2.3.3

                            /* renamed from: ﱟ */
                            private static char f7288 = 29882;

                            /* renamed from: ﺙ */
                            private static int f7289 = 0;

                            /* renamed from: ﻏ */
                            private static int f7290 = 1;

                            /* renamed from: ﻐ */
                            private static char f7291 = 6589;

                            /* renamed from: ﻛ */
                            private static char f7292 = 63511;

                            /* renamed from: ﾒ */
                            private static char f7293 = 719;

                            /* renamed from: ﾇ */
                            private /* synthetic */ String f7295;

                            public C45693(String str22) {
                                str = str22;
                            }

                            /* renamed from: ｋ */
                            private static String m7584(String str22, int i) {
                                String str222;
                                char[] charArray = str22;
                                if (str22 != null) {
                                    charArray = str22.toCharArray();
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
                                                    char c3 = (char) (c - (((c2 + i3) ^ ((c2 << 4) + f7291)) ^ ((c2 >>> 5) + f7288)));
                                                    cArr3[1] = c3;
                                                    cArr3[0] = (char) (c2 - (((c3 >>> 5) + f7293) ^ ((c3 + i3) ^ ((c3 << 4) + f7292))));
                                                    i3 -= 40503;
                                                }
                                                int i5 = C2920m.f7236;
                                                cArr2[i5] = cArr3[0];
                                                cArr2[i5 + 1] = cArr3[1];
                                                C2920m.f7236 = i5 + 2;
                                            } else {
                                                str222 = new String(cArr2, 0, i);
                                            }
                                        }
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                }
                                return str222;
                            }

                            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
                            /* renamed from: ﾒ */
                            public final void mo4950() {
                                f7289 = (f7290 + 81) % 128;
                                C2925r.m7534(C2925r.this).m5304(m7584("ᐗꨓ\uee7b걮뜔⧿\uee7b걮\ue7b4깜项͍⓺讍伪\udf3a䤕\u0e83䛟륀Ꞃ䇏辛䴪", Process.getGidForName("") + 24).intern(), Collections.singletonList(str));
                                f7289 = (f7290 + 27) % 128;
                            }
                        });
                    }
                }));
                if (!this.f7276.isUserIdSet()) {
                    C2925r.m7541(C2925r.this).m5107();
                    userId = C2925r.m7538(C2925r.this).m5040();
                }
                if (C2925r.this.m7581()) {
                    C2925r.m7538(C2925r.this).m5043(new InterfaceC2649ag() { // from class: com.ironsource.adqualitysdk.sdk.i.r.2.5
                        public AnonymousClass5() {
                        }

                        @Override // com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2649ag
                        public void onEventReceived(JSONObject jSONObject) {
                            C2871im.m7116(C2925r.m7536(C2925r.this), C2869ik.f6801, jSONObject, new Object[0]);
                        }
                    });
                }
                C2925r.m7538(C2925r.this).m5046(new C2890je.e() { // from class: com.ironsource.adqualitysdk.sdk.i.r.2.2
                    public C45682() {
                    }

                    @Override // com.ironsource.adqualitysdk.sdk.p009i.C2890je.e
                    /* renamed from: ﾒ */
                    public final void mo7244() {
                        C2925r.m7563(C2925r.this);
                    }
                });
                C2671bb c2671bb = new C2671bb();
                C2925r c2925r3 = C2925r.this;
                C2925r.m7556(c2925r3, new C2666ax(C2925r.m7532(c2925r3), C2925r.m7538(C2925r.this), strM73512, c2671bb, new ISAdQualityInitListener() { // from class: com.ironsource.adqualitysdk.sdk.i.r.2.7
                    public AnonymousClass7() {
                    }

                    @Override // com.ironsource.adqualitysdk.sdk.ISAdQualityInitListener
                    public final void adQualitySdkInitFailed(ISAdQualityInitError iSAdQualityInitError, String str) {
                        C2925r.m7570(C2925r.this, iSAdQualityInitError, str);
                    }

                    @Override // com.ironsource.adqualitysdk.sdk.ISAdQualityInitListener
                    public final void adQualitySdkInitSuccess() {
                        C2925r.m7540(C2925r.this);
                    }
                }));
                C2925r.m7534(C2925r.this).m5307(new ISAdQualityAdListener() { // from class: com.ironsource.adqualitysdk.sdk.i.r.2.10
                    public AnonymousClass10() {
                    }

                    @Override // com.ironsource.adqualitysdk.sdk.ISAdQualityAdListener
                    public final void adClosed(String str, ISAdQualityAdType iSAdQualityAdType) {
                        if (C2925r.m7527(C2925r.this) != null) {
                            C2925r.m7527(C2925r.this).adClosed(str, iSAdQualityAdType);
                        }
                    }

                    @Override // com.ironsource.adqualitysdk.sdk.ISAdQualityAdListener
                    public final void adDisplayed(String str, ISAdQualityAdType iSAdQualityAdType) {
                        if (C2925r.m7527(C2925r.this) != null) {
                            C2925r.m7527(C2925r.this).adDisplayed(str, iSAdQualityAdType);
                        }
                    }
                });
                C2925r c2925r4 = C2925r.this;
                C2925r.m7555(c2925r4, new C2653ak(C2925r.m7534(c2925r4)));
                C2925r c2925r5 = C2925r.this;
                C2925r.m7566(c2925r5, new C2654al(C2925r.m7538(c2925r5)));
                String strIntern2 = m7582("鮧\uf7f1䍑\udeca⩋薵ᄽ沷\uf807䮾Ƛ㍜", 27763 - TextUtils.indexOf("", "")).intern();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(m7582("鮯\uf690䇭\udced⼣먪ᕙ枉\uf2a7䷟\ud8ed⬢蘞ᅌ揀ﺾ䧂ꓲ㜎舭ᵫ澁絛喕ꃸ㌔蹖ᤡ殟욥凜겧㽦", TextUtils.lastIndexOf("", '0', 0, 0) + 27942).intern());
                sb2.append(C2925r.m7573(C2925r.this).m5075());
                C2921n.m7518(strIntern2, sb2.toString());
                C2925r c2925r6 = C2925r.this;
                Context context = this.f7274;
                if (context == null) {
                    context = applicationContext;
                }
                C2925r.m7544(c2925r6, context, userId);
                C2925r.m7550(C2925r.this, applicationContext);
                C2925r.m7525(C2925r.this);
                C2925r.m7530(C2925r.this);
            } catch (Throwable th) {
                String strIntern3 = m7582("鮣᎗讒\u0380뮘㏉ꮝ⎝\udb97厉쮑䎦ﮮ玨\uebb6探᮸鎲௰莖㮉뎘⯀ꏲ寛폌䯄쏞篆\uf3c8殜\ue3e8鯂Ꮞ", (ViewConfiguration.getDoubleTapTimeout() >> 16) + 34819).intern();
                C2914kb.m7429(m7582("鮧\uf7f1䍑\udeca⩋薵ᄽ沷\uf807䮾Ƛ㍜", 27763 - (ViewConfiguration.getDoubleTapTimeout() >> 16)).intern(), strIntern3, th, true, false, true);
                C2925r.m7570(C2925r.this, ISAdQualityInitError.EXCEPTION_ON_INIT, strIntern3);
            }
        }
    }

    /* renamed from: com.ironsource.adqualitysdk.sdk.i.r$3 */
    public class AnonymousClass3 implements InterfaceC2662at {

        /* renamed from: ﻐ */
        final /* synthetic */ boolean f7303;

        /* renamed from: ﻛ */
        final /* synthetic */ boolean f7304;

        /* renamed from: ｋ */
        final /* synthetic */ boolean f7305;

        /* renamed from: ﾇ */
        final /* synthetic */ String f7306;

        /* renamed from: ﾒ */
        final /* synthetic */ Context f7307;

        /* renamed from: com.ironsource.adqualitysdk.sdk.i.r$3$4 */
        public class AnonymousClass4 extends AbstractRunnableC2878it {

            /* renamed from: com.ironsource.adqualitysdk.sdk.i.r$3$4$2 */
            public class AnonymousClass2 extends AbstractRunnableC2878it {

                /* renamed from: ﮐ */
                private static int f7309 = 1;

                /* renamed from: ﻐ */
                private static char f7310 = 48108;

                /* renamed from: ｋ */
                private static long f7311;

                /* renamed from: ﾇ */
                private static int f7312;

                /* renamed from: ﾒ */
                private static int f7313;

                /* renamed from: com.ironsource.adqualitysdk.sdk.i.r$3$4$2$2 */
                public class C45702 implements C2890je.c {

                    /* renamed from: ﻐ */
                    private static int f7315 = 0;

                    /* renamed from: ﻛ */
                    private static int f7316 = 1;

                    /* renamed from: ｋ */
                    private static char f7317 = 4;

                    /* renamed from: ﾇ */
                    private static char[] f7318 = {'f', 'l', 'a', 'g', '.', 'i', 'r', 's', 't', 'S', 'e', 'n', 'h', 'j', 'k', 'm'};

                    /* renamed from: com.ironsource.adqualitysdk.sdk.i.r$3$4$2$2$3 */
                    public class C45713 extends AbstractRunnableC2878it {

                        /* renamed from: ﻐ */
                        private static long f7320 = -7831816361021396026L;

                        /* renamed from: ﻛ */
                        private static int f7321 = 1;

                        /* renamed from: ｋ */
                        private static int f7322;

                        /* renamed from: ﾇ */
                        private /* synthetic */ boolean f7323;

                        public C45713(boolean z) {
                            z = z;
                        }

                        /* renamed from: ﾇ */
                        private static String m7588(String str, int i) {
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
                                            cArr2[i2] = (char) ((cArr[i2] ^ (C2804g.f6423 * i2)) ^ f7320);
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

                        /* JADX WARN: Removed duplicated region for block: B:30:0x0047  */
                        /* JADX WARN: Removed duplicated region for block: B:31:0x004a  */
                        @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
                        /* renamed from: ﾒ */
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        public final void mo4950() {
                            /*
                                r6 = this;
                                com.ironsource.adqualitysdk.sdk.i.r$3$4$2$2 r0 = com.ironsource.adqualitysdk.sdk.p009i.C2925r.AnonymousClass3.AnonymousClass4.AnonymousClass2.C45702.this
                                com.ironsource.adqualitysdk.sdk.i.r$3$4$2 r0 = com.ironsource.adqualitysdk.sdk.p009i.C2925r.AnonymousClass3.AnonymousClass4.AnonymousClass2.this
                                com.ironsource.adqualitysdk.sdk.i.r$3$4 r0 = com.ironsource.adqualitysdk.sdk.p009i.C2925r.AnonymousClass3.AnonymousClass4.this
                                com.ironsource.adqualitysdk.sdk.i.r$3 r0 = com.ironsource.adqualitysdk.sdk.p009i.C2925r.AnonymousClass3.this
                                com.ironsource.adqualitysdk.sdk.i.r r0 = com.ironsource.adqualitysdk.sdk.p009i.C2925r.this
                                com.ironsource.adqualitysdk.sdk.i.ai r0 = com.ironsource.adqualitysdk.sdk.p009i.C2925r.m7538(r0)
                                java.lang.String r1 = ""
                                int r1 = android.view.MotionEvent.axisFromString(r1)
                                r2 = 54268(0xd3fc, float:7.6046E-41)
                                int r2 = r2 - r1
                                java.lang.String r1 = "⮲\uf84b豣偘摜࡞\udc5c"
                                java.lang.String r1 = m7588(r1, r2)
                                java.lang.String r1 = r1.intern()
                                com.ironsource.adqualitysdk.sdk.i.r$3$4$2$2 r2 = com.ironsource.adqualitysdk.sdk.p009i.C2925r.AnonymousClass3.AnonymousClass4.AnonymousClass2.C45702.this
                                com.ironsource.adqualitysdk.sdk.i.r$3$4$2 r2 = com.ironsource.adqualitysdk.sdk.p009i.C2925r.AnonymousClass3.AnonymousClass4.AnonymousClass2.this
                                com.ironsource.adqualitysdk.sdk.i.r$3$4 r2 = com.ironsource.adqualitysdk.sdk.p009i.C2925r.AnonymousClass3.AnonymousClass4.this
                                com.ironsource.adqualitysdk.sdk.i.r$3 r2 = com.ironsource.adqualitysdk.sdk.p009i.C2925r.AnonymousClass3.this
                                boolean r3 = r2.f7305
                                if (r3 == 0) goto L5f
                                int r3 = com.ironsource.adqualitysdk.sdk.p009i.C2925r.AnonymousClass3.AnonymousClass4.AnonymousClass2.C45702.C45713.f7322
                                int r3 = r3 + 81
                                int r4 = r3 % 128
                                com.ironsource.adqualitysdk.sdk.p009i.C2925r.AnonymousClass3.AnonymousClass4.AnonymousClass2.C45702.C45713.f7321 = r4
                                int r3 = r3 % 2
                                if (r3 != 0) goto L43
                                java.lang.String r3 = r2.f7306
                                r4 = 63
                                int r4 = r4 / 0
                                if (r3 == 0) goto L4a
                                goto L47
                            L43:
                                java.lang.String r3 = r2.f7306
                                if (r3 == 0) goto L4a
                            L47:
                                java.lang.String r2 = r2.f7306
                                goto L68
                            L4a:
                                int r2 = android.view.ViewConfiguration.getScrollBarFadeDuration()
                                int r2 = r2 >> 16
                                r3 = 58363(0xe3fb, float:8.1784E-41)
                                int r2 = r2 + r3
                                java.lang.String r3 = "⮨졈\uec5c聛"
                                java.lang.String r2 = m7588(r3, r2)
                                java.lang.String r2 = r2.intern()
                                goto L68
                            L5f:
                                int r2 = com.ironsource.adqualitysdk.sdk.p009i.C2925r.AnonymousClass3.AnonymousClass4.AnonymousClass2.C45702.C45713.f7321
                                int r2 = r2 + 107
                                int r2 = r2 % 128
                                com.ironsource.adqualitysdk.sdk.p009i.C2925r.AnonymousClass3.AnonymousClass4.AnonymousClass2.C45702.C45713.f7322 = r2
                                r2 = 0
                            L68:
                                com.ironsource.adqualitysdk.sdk.i.r$3$4$2$2 r3 = com.ironsource.adqualitysdk.sdk.p009i.C2925r.AnonymousClass3.AnonymousClass4.AnonymousClass2.C45702.this
                                com.ironsource.adqualitysdk.sdk.i.r$3$4$2 r3 = com.ironsource.adqualitysdk.sdk.p009i.C2925r.AnonymousClass3.AnonymousClass4.AnonymousClass2.this
                                com.ironsource.adqualitysdk.sdk.i.r$3$4 r3 = com.ironsource.adqualitysdk.sdk.p009i.C2925r.AnonymousClass3.AnonymousClass4.this
                                com.ironsource.adqualitysdk.sdk.i.r$3 r3 = com.ironsource.adqualitysdk.sdk.p009i.C2925r.AnonymousClass3.this
                                com.ironsource.adqualitysdk.sdk.i.r r3 = com.ironsource.adqualitysdk.sdk.p009i.C2925r.this
                                com.ironsource.adqualitysdk.sdk.i.ax r3 = com.ironsource.adqualitysdk.sdk.p009i.C2925r.m7534(r3)
                                com.ironsource.adqualitysdk.sdk.i.gp r4 = new com.ironsource.adqualitysdk.sdk.i.gp
                                com.ironsource.adqualitysdk.sdk.i.r$3$4$2$2 r5 = com.ironsource.adqualitysdk.sdk.p009i.C2925r.AnonymousClass3.AnonymousClass4.AnonymousClass2.C45702.this
                                com.ironsource.adqualitysdk.sdk.i.r$3$4$2 r5 = com.ironsource.adqualitysdk.sdk.p009i.C2925r.AnonymousClass3.AnonymousClass4.AnonymousClass2.this
                                com.ironsource.adqualitysdk.sdk.i.r$3$4 r5 = com.ironsource.adqualitysdk.sdk.p009i.C2925r.AnonymousClass3.AnonymousClass4.this
                                com.ironsource.adqualitysdk.sdk.i.r$3 r5 = com.ironsource.adqualitysdk.sdk.p009i.C2925r.AnonymousClass3.this
                                com.ironsource.adqualitysdk.sdk.i.r r5 = com.ironsource.adqualitysdk.sdk.p009i.C2925r.this
                                android.content.Context r5 = com.ironsource.adqualitysdk.sdk.p009i.C2925r.m7536(r5)
                                r4.<init>(r5)
                                com.ironsource.adqualitysdk.sdk.i.r$3$4$2$2 r4 = com.ironsource.adqualitysdk.sdk.p009i.C2925r.AnonymousClass3.AnonymousClass4.AnonymousClass2.C45702.this
                                com.ironsource.adqualitysdk.sdk.i.r$3$4$2 r4 = com.ironsource.adqualitysdk.sdk.p009i.C2925r.AnonymousClass3.AnonymousClass4.AnonymousClass2.this
                                com.ironsource.adqualitysdk.sdk.i.r$3$4 r4 = com.ironsource.adqualitysdk.sdk.p009i.C2925r.AnonymousClass3.AnonymousClass4.this
                                com.ironsource.adqualitysdk.sdk.i.r$3 r4 = com.ironsource.adqualitysdk.sdk.p009i.C2925r.AnonymousClass3.this
                                com.ironsource.adqualitysdk.sdk.i.r r4 = com.ironsource.adqualitysdk.sdk.p009i.C2925r.this
                                com.ironsource.adqualitysdk.sdk.p009i.C2925r.m7536(r4)
                                boolean r4 = r2
                                com.ironsource.adqualitysdk.sdk.i.r$3$4$2$2 r5 = com.ironsource.adqualitysdk.sdk.p009i.C2925r.AnonymousClass3.AnonymousClass4.AnonymousClass2.C45702.this
                                com.ironsource.adqualitysdk.sdk.i.r$3$4$2 r5 = com.ironsource.adqualitysdk.sdk.p009i.C2925r.AnonymousClass3.AnonymousClass4.AnonymousClass2.this
                                com.ironsource.adqualitysdk.sdk.i.r$3$4 r5 = com.ironsource.adqualitysdk.sdk.p009i.C2925r.AnonymousClass3.AnonymousClass4.this
                                com.ironsource.adqualitysdk.sdk.i.r$3 r5 = com.ironsource.adqualitysdk.sdk.p009i.C2925r.AnonymousClass3.this
                                com.ironsource.adqualitysdk.sdk.i.r r5 = com.ironsource.adqualitysdk.sdk.p009i.C2925r.this
                                com.ironsource.adqualitysdk.sdk.i.ao r5 = com.ironsource.adqualitysdk.sdk.p009i.C2925r.m7541(r5)
                                org.json.JSONObject r2 = com.ironsource.adqualitysdk.sdk.p009i.C2905jt.m7336(r2, r3, r4, r5)
                                r0.m5048(r1, r2)
                                com.ironsource.adqualitysdk.sdk.i.r$3$4$2$2 r0 = com.ironsource.adqualitysdk.sdk.p009i.C2925r.AnonymousClass3.AnonymousClass4.AnonymousClass2.C45702.this
                                com.ironsource.adqualitysdk.sdk.i.r$3$4$2 r0 = com.ironsource.adqualitysdk.sdk.p009i.C2925r.AnonymousClass3.AnonymousClass4.AnonymousClass2.this
                                com.ironsource.adqualitysdk.sdk.i.r$3$4 r0 = com.ironsource.adqualitysdk.sdk.p009i.C2925r.AnonymousClass3.AnonymousClass4.this
                                com.ironsource.adqualitysdk.sdk.i.r$3 r0 = com.ironsource.adqualitysdk.sdk.p009i.C2925r.AnonymousClass3.this
                                boolean r1 = r0.f7304
                                if (r1 == 0) goto Lca
                                com.ironsource.adqualitysdk.sdk.i.r r0 = com.ironsource.adqualitysdk.sdk.p009i.C2925r.this
                                com.ironsource.adqualitysdk.sdk.i.ai r0 = com.ironsource.adqualitysdk.sdk.p009i.C2925r.m7538(r0)
                                r0.m5047()
                                int r0 = com.ironsource.adqualitysdk.sdk.p009i.C2925r.AnonymousClass3.AnonymousClass4.AnonymousClass2.C45702.C45713.f7322
                                int r0 = r0 + 119
                                int r0 = r0 % 128
                                com.ironsource.adqualitysdk.sdk.p009i.C2925r.AnonymousClass3.AnonymousClass4.AnonymousClass2.C45702.C45713.f7321 = r0
                            Lca:
                                int r0 = com.ironsource.adqualitysdk.sdk.p009i.C2925r.AnonymousClass3.AnonymousClass4.AnonymousClass2.C45702.C45713.f7321
                                int r0 = r0 + 29
                                int r0 = r0 % 128
                                com.ironsource.adqualitysdk.sdk.p009i.C2925r.AnonymousClass3.AnonymousClass4.AnonymousClass2.C45702.C45713.f7322 = r0
                                return
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.p009i.C2925r.AnonymousClass3.AnonymousClass4.AnonymousClass2.C45702.C45713.mo4950():void");
                        }
                    }

                    public C45702() {
                    }

                    /* renamed from: ﻛ */
                    private static String m7587(byte b, String str, int i) {
                        String str2;
                        char[] charArray = str;
                        if (str != null) {
                            charArray = str.toCharArray();
                        }
                        char[] cArr = charArray;
                        synchronized (C2858i.f6710) {
                            try {
                                char[] cArr2 = f7318;
                                char c = f7317;
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

                    /* JADX WARN: Removed duplicated region for block: B:23:0x001f A[PHI: r7
  0x001f: PHI (r7v2 boolean) = (r7v1 boolean), (r7v4 boolean) binds: [B:21:0x001c, B:18:0x0014] A[DONT_GENERATE, DONT_INLINE]] */
                    @Override // com.ironsource.adqualitysdk.sdk.p009i.C2890je.c
                    /* renamed from: ﻐ */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final void mo7243(java.lang.String r7) {
                        /*
                            r6 = this;
                            int r0 = com.ironsource.adqualitysdk.sdk.p009i.C2925r.AnonymousClass3.AnonymousClass4.AnonymousClass2.C45702.f7316
                            int r0 = r0 + 63
                            int r1 = r0 % 128
                            com.ironsource.adqualitysdk.sdk.p009i.C2925r.AnonymousClass3.AnonymousClass4.AnonymousClass2.C45702.f7315 = r1
                            int r0 = r0 % 2
                            if (r0 == 0) goto L17
                            boolean r7 = android.text.TextUtils.isEmpty(r7)
                            r0 = 15
                            int r0 = r0 / 0
                            if (r7 == 0) goto L72
                            goto L1f
                        L17:
                            boolean r7 = android.text.TextUtils.isEmpty(r7)
                            r0 = 1
                            if (r7 == r0) goto L1f
                            goto L72
                        L1f:
                            com.ironsource.adqualitysdk.sdk.i.r$3$4$2 r0 = com.ironsource.adqualitysdk.sdk.p009i.C2925r.AnonymousClass3.AnonymousClass4.AnonymousClass2.this
                            com.ironsource.adqualitysdk.sdk.i.r$3$4 r0 = com.ironsource.adqualitysdk.sdk.p009i.C2925r.AnonymousClass3.AnonymousClass4.this
                            com.ironsource.adqualitysdk.sdk.i.r$3 r0 = com.ironsource.adqualitysdk.sdk.p009i.C2925r.AnonymousClass3.this
                            com.ironsource.adqualitysdk.sdk.i.r r0 = com.ironsource.adqualitysdk.sdk.p009i.C2925r.this
                            com.ironsource.adqualitysdk.sdk.i.je r0 = com.ironsource.adqualitysdk.sdk.p009i.C2925r.m7526(r0)
                            int r1 = android.view.ViewConfiguration.getKeyRepeatDelay()
                            int r1 = r1 >> 16
                            int r1 = r1 + 124
                            byte r1 = (byte) r1
                            java.lang.String r2 = ""
                            r3 = 48
                            int r2 = android.text.TextUtils.lastIndexOf(r2, r3)
                            int r2 = 13 - r2
                            java.lang.String r3 = "\u0001\u0002\u0003\u0000\b\u0004\u0006\u0007\u0004\u000b\n\u000b\u000b\b"
                            java.lang.String r1 = m7587(r1, r3, r2)
                            java.lang.String r1 = r1.intern()
                            long r2 = android.view.ViewConfiguration.getZoomControlsTimeout()
                            r4 = 0
                            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                            int r2 = 66 - r2
                            byte r2 = (byte) r2
                            r3 = 0
                            float r4 = android.graphics.PointF.length(r3, r3)
                            int r3 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
                            int r3 = 5 - r3
                            java.lang.String r4 = "\u0001\u0003\u0003\u0005¦"
                            java.lang.String r2 = m7587(r2, r4, r3)
                            java.lang.String r2 = r2.intern()
                            r3 = 0
                            r0.m7239(r1, r2, r3)
                            int r0 = com.ironsource.adqualitysdk.sdk.p009i.C2925r.AnonymousClass3.AnonymousClass4.AnonymousClass2.C45702.f7316
                            int r0 = r0 + 5
                            int r0 = r0 % 128
                            com.ironsource.adqualitysdk.sdk.p009i.C2925r.AnonymousClass3.AnonymousClass4.AnonymousClass2.C45702.f7315 = r0
                        L72:
                            com.ironsource.adqualitysdk.sdk.i.r$3$4$2$2$3 r0 = new com.ironsource.adqualitysdk.sdk.i.r$3$4$2$2$3
                            r0.<init>()
                            com.ironsource.adqualitysdk.sdk.p009i.C2926s.m7591(r0)
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.p009i.C2925r.AnonymousClass3.AnonymousClass4.AnonymousClass2.C45702.mo7243(java.lang.String):void");
                    }
                }

                public AnonymousClass2() {
                }

                /* renamed from: ｋ */
                private static String m7586(String str, char c, int i, String str2, String str3) {
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
                            char[] cArr4 = (char[]) cArr.clone();
                            char[] cArr5 = (char[]) cArr2.clone();
                            cArr4[0] = (char) (c ^ cArr4[0]);
                            cArr5[2] = (char) (cArr5[2] + ((char) i));
                            int length = cArr3.length;
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
                                    cArr6[i6] = (char) ((((c3 ^ cArr3[i6]) ^ f7311) ^ f7313) ^ f7310);
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

                @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
                /* renamed from: ﾒ */
                public final void mo4950() {
                    C2925r.m7526(C2925r.this).m7237(m7586("敊㵾ⲫ팸꘤躵㼱㣩팓\udd9d镆낓밞⒁", (char) (View.combineMeasuredStates(0, 0) + 4464), 1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), "\u0000\u0000\u0000\u0000", "띚\uf65c灦向").intern(), new C2890je.c() { // from class: com.ironsource.adqualitysdk.sdk.i.r.3.4.2.2

                        /* renamed from: ﻐ */
                        private static int f7315 = 0;

                        /* renamed from: ﻛ */
                        private static int f7316 = 1;

                        /* renamed from: ｋ */
                        private static char f7317 = 4;

                        /* renamed from: ﾇ */
                        private static char[] f7318 = {'f', 'l', 'a', 'g', '.', 'i', 'r', 's', 't', 'S', 'e', 'n', 'h', 'j', 'k', 'm'};

                        /* renamed from: com.ironsource.adqualitysdk.sdk.i.r$3$4$2$2$3 */
                        public class C45713 extends AbstractRunnableC2878it {

                            /* renamed from: ﻐ */
                            private static long f7320 = -7831816361021396026L;

                            /* renamed from: ﻛ */
                            private static int f7321 = 1;

                            /* renamed from: ｋ */
                            private static int f7322;

                            /* renamed from: ﾇ */
                            private /* synthetic */ boolean f7323;

                            public C45713(boolean z) {
                                z = z;
                            }

                            /* renamed from: ﾇ */
                            private static String m7588(String str, int i) {
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
                                                cArr2[i2] = (char) ((cArr[i2] ^ (C2804g.f6423 * i2)) ^ f7320);
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

                            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
                            /* renamed from: ﾒ */
                            public final void mo4950() {
                                /*
                                    this = this;
                                    com.ironsource.adqualitysdk.sdk.i.r$3$4$2$2 r0 = com.ironsource.adqualitysdk.sdk.p009i.C2925r.AnonymousClass3.AnonymousClass4.AnonymousClass2.C45702.this
                                    com.ironsource.adqualitysdk.sdk.i.r$3$4$2 r0 = com.ironsource.adqualitysdk.sdk.p009i.C2925r.AnonymousClass3.AnonymousClass4.AnonymousClass2.this
                                    com.ironsource.adqualitysdk.sdk.i.r$3$4 r0 = com.ironsource.adqualitysdk.sdk.p009i.C2925r.AnonymousClass3.AnonymousClass4.this
                                    com.ironsource.adqualitysdk.sdk.i.r$3 r0 = com.ironsource.adqualitysdk.sdk.p009i.C2925r.AnonymousClass3.this
                                    com.ironsource.adqualitysdk.sdk.i.r r0 = com.ironsource.adqualitysdk.sdk.p009i.C2925r.this
                                    com.ironsource.adqualitysdk.sdk.i.ai r0 = com.ironsource.adqualitysdk.sdk.p009i.C2925r.m7538(r0)
                                    java.lang.String r1 = ""
                                    int r1 = android.view.MotionEvent.axisFromString(r1)
                                    r2 = 54268(0xd3fc, float:7.6046E-41)
                                    int r2 = r2 - r1
                                    java.lang.String r1 = "⮲\uf84b豣偘摜࡞\udc5c"
                                    java.lang.String r1 = m7588(r1, r2)
                                    java.lang.String r1 = r1.intern()
                                    com.ironsource.adqualitysdk.sdk.i.r$3$4$2$2 r2 = com.ironsource.adqualitysdk.sdk.p009i.C2925r.AnonymousClass3.AnonymousClass4.AnonymousClass2.C45702.this
                                    com.ironsource.adqualitysdk.sdk.i.r$3$4$2 r2 = com.ironsource.adqualitysdk.sdk.p009i.C2925r.AnonymousClass3.AnonymousClass4.AnonymousClass2.this
                                    com.ironsource.adqualitysdk.sdk.i.r$3$4 r2 = com.ironsource.adqualitysdk.sdk.p009i.C2925r.AnonymousClass3.AnonymousClass4.this
                                    com.ironsource.adqualitysdk.sdk.i.r$3 r2 = com.ironsource.adqualitysdk.sdk.p009i.C2925r.AnonymousClass3.this
                                    boolean r3 = r2.f7305
                                    if (r3 == 0) goto L5f
                                    int r3 = com.ironsource.adqualitysdk.sdk.p009i.C2925r.AnonymousClass3.AnonymousClass4.AnonymousClass2.C45702.C45713.f7322
                                    int r3 = r3 + 81
                                    int r4 = r3 % 128
                                    com.ironsource.adqualitysdk.sdk.p009i.C2925r.AnonymousClass3.AnonymousClass4.AnonymousClass2.C45702.C45713.f7321 = r4
                                    int r3 = r3 % 2
                                    if (r3 != 0) goto L43
                                    java.lang.String r3 = r2.f7306
                                    r4 = 63
                                    int r4 = r4 / 0
                                    if (r3 == 0) goto L4a
                                    goto L47
                                L43:
                                    java.lang.String r3 = r2.f7306
                                    if (r3 == 0) goto L4a
                                L47:
                                    java.lang.String r2 = r2.f7306
                                    goto L68
                                L4a:
                                    int r2 = android.view.ViewConfiguration.getScrollBarFadeDuration()
                                    int r2 = r2 >> 16
                                    r3 = 58363(0xe3fb, float:8.1784E-41)
                                    int r2 = r2 + r3
                                    java.lang.String r3 = "⮨졈\uec5c聛"
                                    java.lang.String r2 = m7588(r3, r2)
                                    java.lang.String r2 = r2.intern()
                                    goto L68
                                L5f:
                                    int r2 = com.ironsource.adqualitysdk.sdk.p009i.C2925r.AnonymousClass3.AnonymousClass4.AnonymousClass2.C45702.C45713.f7321
                                    int r2 = r2 + 107
                                    int r2 = r2 % 128
                                    com.ironsource.adqualitysdk.sdk.p009i.C2925r.AnonymousClass3.AnonymousClass4.AnonymousClass2.C45702.C45713.f7322 = r2
                                    r2 = 0
                                L68:
                                    com.ironsource.adqualitysdk.sdk.i.r$3$4$2$2 r3 = com.ironsource.adqualitysdk.sdk.p009i.C2925r.AnonymousClass3.AnonymousClass4.AnonymousClass2.C45702.this
                                    com.ironsource.adqualitysdk.sdk.i.r$3$4$2 r3 = com.ironsource.adqualitysdk.sdk.p009i.C2925r.AnonymousClass3.AnonymousClass4.AnonymousClass2.this
                                    com.ironsource.adqualitysdk.sdk.i.r$3$4 r3 = com.ironsource.adqualitysdk.sdk.p009i.C2925r.AnonymousClass3.AnonymousClass4.this
                                    com.ironsource.adqualitysdk.sdk.i.r$3 r3 = com.ironsource.adqualitysdk.sdk.p009i.C2925r.AnonymousClass3.this
                                    com.ironsource.adqualitysdk.sdk.i.r r3 = com.ironsource.adqualitysdk.sdk.p009i.C2925r.this
                                    com.ironsource.adqualitysdk.sdk.i.ax r3 = com.ironsource.adqualitysdk.sdk.p009i.C2925r.m7534(r3)
                                    com.ironsource.adqualitysdk.sdk.i.gp r4 = new com.ironsource.adqualitysdk.sdk.i.gp
                                    com.ironsource.adqualitysdk.sdk.i.r$3$4$2$2 r5 = com.ironsource.adqualitysdk.sdk.p009i.C2925r.AnonymousClass3.AnonymousClass4.AnonymousClass2.C45702.this
                                    com.ironsource.adqualitysdk.sdk.i.r$3$4$2 r5 = com.ironsource.adqualitysdk.sdk.p009i.C2925r.AnonymousClass3.AnonymousClass4.AnonymousClass2.this
                                    com.ironsource.adqualitysdk.sdk.i.r$3$4 r5 = com.ironsource.adqualitysdk.sdk.p009i.C2925r.AnonymousClass3.AnonymousClass4.this
                                    com.ironsource.adqualitysdk.sdk.i.r$3 r5 = com.ironsource.adqualitysdk.sdk.p009i.C2925r.AnonymousClass3.this
                                    com.ironsource.adqualitysdk.sdk.i.r r5 = com.ironsource.adqualitysdk.sdk.p009i.C2925r.this
                                    android.content.Context r5 = com.ironsource.adqualitysdk.sdk.p009i.C2925r.m7536(r5)
                                    r4.<init>(r5)
                                    com.ironsource.adqualitysdk.sdk.i.r$3$4$2$2 r4 = com.ironsource.adqualitysdk.sdk.p009i.C2925r.AnonymousClass3.AnonymousClass4.AnonymousClass2.C45702.this
                                    com.ironsource.adqualitysdk.sdk.i.r$3$4$2 r4 = com.ironsource.adqualitysdk.sdk.p009i.C2925r.AnonymousClass3.AnonymousClass4.AnonymousClass2.this
                                    com.ironsource.adqualitysdk.sdk.i.r$3$4 r4 = com.ironsource.adqualitysdk.sdk.p009i.C2925r.AnonymousClass3.AnonymousClass4.this
                                    com.ironsource.adqualitysdk.sdk.i.r$3 r4 = com.ironsource.adqualitysdk.sdk.p009i.C2925r.AnonymousClass3.this
                                    com.ironsource.adqualitysdk.sdk.i.r r4 = com.ironsource.adqualitysdk.sdk.p009i.C2925r.this
                                    com.ironsource.adqualitysdk.sdk.p009i.C2925r.m7536(r4)
                                    boolean r4 = r2
                                    com.ironsource.adqualitysdk.sdk.i.r$3$4$2$2 r5 = com.ironsource.adqualitysdk.sdk.p009i.C2925r.AnonymousClass3.AnonymousClass4.AnonymousClass2.C45702.this
                                    com.ironsource.adqualitysdk.sdk.i.r$3$4$2 r5 = com.ironsource.adqualitysdk.sdk.p009i.C2925r.AnonymousClass3.AnonymousClass4.AnonymousClass2.this
                                    com.ironsource.adqualitysdk.sdk.i.r$3$4 r5 = com.ironsource.adqualitysdk.sdk.p009i.C2925r.AnonymousClass3.AnonymousClass4.this
                                    com.ironsource.adqualitysdk.sdk.i.r$3 r5 = com.ironsource.adqualitysdk.sdk.p009i.C2925r.AnonymousClass3.this
                                    com.ironsource.adqualitysdk.sdk.i.r r5 = com.ironsource.adqualitysdk.sdk.p009i.C2925r.this
                                    com.ironsource.adqualitysdk.sdk.i.ao r5 = com.ironsource.adqualitysdk.sdk.p009i.C2925r.m7541(r5)
                                    org.json.JSONObject r2 = com.ironsource.adqualitysdk.sdk.p009i.C2905jt.m7336(r2, r3, r4, r5)
                                    r0.m5048(r1, r2)
                                    com.ironsource.adqualitysdk.sdk.i.r$3$4$2$2 r0 = com.ironsource.adqualitysdk.sdk.p009i.C2925r.AnonymousClass3.AnonymousClass4.AnonymousClass2.C45702.this
                                    com.ironsource.adqualitysdk.sdk.i.r$3$4$2 r0 = com.ironsource.adqualitysdk.sdk.p009i.C2925r.AnonymousClass3.AnonymousClass4.AnonymousClass2.this
                                    com.ironsource.adqualitysdk.sdk.i.r$3$4 r0 = com.ironsource.adqualitysdk.sdk.p009i.C2925r.AnonymousClass3.AnonymousClass4.this
                                    com.ironsource.adqualitysdk.sdk.i.r$3 r0 = com.ironsource.adqualitysdk.sdk.p009i.C2925r.AnonymousClass3.this
                                    boolean r1 = r0.f7304
                                    if (r1 == 0) goto Lca
                                    com.ironsource.adqualitysdk.sdk.i.r r0 = com.ironsource.adqualitysdk.sdk.p009i.C2925r.this
                                    com.ironsource.adqualitysdk.sdk.i.ai r0 = com.ironsource.adqualitysdk.sdk.p009i.C2925r.m7538(r0)
                                    r0.m5047()
                                    int r0 = com.ironsource.adqualitysdk.sdk.p009i.C2925r.AnonymousClass3.AnonymousClass4.AnonymousClass2.C45702.C45713.f7322
                                    int r0 = r0 + 119
                                    int r0 = r0 % 128
                                    com.ironsource.adqualitysdk.sdk.p009i.C2925r.AnonymousClass3.AnonymousClass4.AnonymousClass2.C45702.C45713.f7321 = r0
                                Lca:
                                    int r0 = com.ironsource.adqualitysdk.sdk.p009i.C2925r.AnonymousClass3.AnonymousClass4.AnonymousClass2.C45702.C45713.f7321
                                    int r0 = r0 + 29
                                    int r0 = r0 % 128
                                    com.ironsource.adqualitysdk.sdk.p009i.C2925r.AnonymousClass3.AnonymousClass4.AnonymousClass2.C45702.C45713.f7322 = r0
                                    return
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.p009i.C2925r.AnonymousClass3.AnonymousClass4.AnonymousClass2.C45702.C45713.mo4950():void");
                            }
                        }

                        public C45702() {
                        }

                        /* renamed from: ﻛ */
                        private static String m7587(byte b, String str, int i) {
                            String str2;
                            char[] charArray = str;
                            if (str != null) {
                                charArray = str.toCharArray();
                            }
                            char[] cArr = charArray;
                            synchronized (C2858i.f6710) {
                                try {
                                    char[] cArr2 = f7318;
                                    char c = f7317;
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

                        @Override // com.ironsource.adqualitysdk.sdk.p009i.C2890je.c
                        /* renamed from: ﻐ */
                        public final void mo7243(String v) {
                            /*
                                this = this;
                                int r0 = com.ironsource.adqualitysdk.sdk.p009i.C2925r.AnonymousClass3.AnonymousClass4.AnonymousClass2.C45702.f7316
                                int r0 = r0 + 63
                                int r1 = r0 % 128
                                com.ironsource.adqualitysdk.sdk.p009i.C2925r.AnonymousClass3.AnonymousClass4.AnonymousClass2.C45702.f7315 = r1
                                int r0 = r0 % 2
                                if (r0 == 0) goto L17
                                boolean r7 = android.text.TextUtils.isEmpty(r7)
                                r0 = 15
                                int r0 = r0 / 0
                                if (r7 == 0) goto L72
                                goto L1f
                            L17:
                                boolean r7 = android.text.TextUtils.isEmpty(r7)
                                r0 = 1
                                if (r7 == r0) goto L1f
                                goto L72
                            L1f:
                                com.ironsource.adqualitysdk.sdk.i.r$3$4$2 r0 = com.ironsource.adqualitysdk.sdk.p009i.C2925r.AnonymousClass3.AnonymousClass4.AnonymousClass2.this
                                com.ironsource.adqualitysdk.sdk.i.r$3$4 r0 = com.ironsource.adqualitysdk.sdk.p009i.C2925r.AnonymousClass3.AnonymousClass4.this
                                com.ironsource.adqualitysdk.sdk.i.r$3 r0 = com.ironsource.adqualitysdk.sdk.p009i.C2925r.AnonymousClass3.this
                                com.ironsource.adqualitysdk.sdk.i.r r0 = com.ironsource.adqualitysdk.sdk.p009i.C2925r.this
                                com.ironsource.adqualitysdk.sdk.i.je r0 = com.ironsource.adqualitysdk.sdk.p009i.C2925r.m7526(r0)
                                int r1 = android.view.ViewConfiguration.getKeyRepeatDelay()
                                int r1 = r1 >> 16
                                int r1 = r1 + 124
                                byte r1 = (byte) r1
                                java.lang.String r2 = ""
                                r3 = 48
                                int r2 = android.text.TextUtils.lastIndexOf(r2, r3)
                                int r2 = 13 - r2
                                java.lang.String r3 = "\u0001\u0002\u0003\u0000\b\u0004\u0006\u0007\u0004\u000b\n\u000b\u000b\b"
                                java.lang.String r1 = m7587(r1, r3, r2)
                                java.lang.String r1 = r1.intern()
                                long r2 = android.view.ViewConfiguration.getZoomControlsTimeout()
                                r4 = 0
                                int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                                int r2 = 66 - r2
                                byte r2 = (byte) r2
                                r3 = 0
                                float r4 = android.graphics.PointF.length(r3, r3)
                                int r3 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
                                int r3 = 5 - r3
                                java.lang.String r4 = "\u0001\u0003\u0003\u0005¦"
                                java.lang.String r2 = m7587(r2, r4, r3)
                                java.lang.String r2 = r2.intern()
                                r3 = 0
                                r0.m7239(r1, r2, r3)
                                int r0 = com.ironsource.adqualitysdk.sdk.p009i.C2925r.AnonymousClass3.AnonymousClass4.AnonymousClass2.C45702.f7316
                                int r0 = r0 + 5
                                int r0 = r0 % 128
                                com.ironsource.adqualitysdk.sdk.p009i.C2925r.AnonymousClass3.AnonymousClass4.AnonymousClass2.C45702.f7315 = r0
                            L72:
                                com.ironsource.adqualitysdk.sdk.i.r$3$4$2$2$3 r0 = new com.ironsource.adqualitysdk.sdk.i.r$3$4$2$2$3
                                r0.<init>()
                                com.ironsource.adqualitysdk.sdk.p009i.C2926s.m7591(r0)
                                return
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.p009i.C2925r.AnonymousClass3.AnonymousClass4.AnonymousClass2.C45702.mo7243(java.lang.String):void");
                        }
                    });
                    int i = f7312 + 81;
                    f7309 = i % 128;
                    if (i % 2 == 0) {
                        throw null;
                    }
                }
            }

            public AnonymousClass4() {
            }

            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
            /* renamed from: ﾒ */
            public final void mo4950() {
                AnonymousClass3 anonymousClass3 = AnonymousClass3.this;
                if (anonymousClass3.f7303) {
                    C2925r.m7534(C2925r.this).m5303(AnonymousClass3.this.f7307, new AnonymousClass2());
                }
            }
        }

        public AnonymousClass3(boolean z, Context context, boolean z2, String str, boolean z3) {
            this.f7303 = z;
            this.f7307 = context;
            this.f7305 = z2;
            this.f7306 = str;
            this.f7304 = z3;
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2662at
        /* renamed from: ﾒ */
        public final void mo4993() {
            C2926s.m7600(new AnonymousClass4());
        }
    }

    /* renamed from: com.ironsource.adqualitysdk.sdk.i.r$4 */
    public class AnonymousClass4 extends AbstractRunnableC2878it {

        /* renamed from: ﱡ */
        private static int f7325 = 1;

        /* renamed from: ﻐ */
        private static int f7326 = 0;

        /* renamed from: ﻛ */
        private static char[] f7327 = {'A', 'd', 'Q', 'u', 'a', 'l', 'i', 't', 'y', 'S', 'D', 'K', 'C', 'n', '\'', ' ', 's', 'e', 'g', 'm', '-', 'I', 'o', 'z', '.'};

        /* renamed from: ﾒ */
        private static char f7328 = 5;

        /* renamed from: ﾇ */
        private /* synthetic */ ISAdQualitySegment f7330;

        public AnonymousClass4(ISAdQualitySegment iSAdQualitySegment) {
            iSAdQualitySegment = iSAdQualitySegment;
        }

        /* renamed from: ｋ */
        private static String m7589(byte b, String str, int i) {
            String str2;
            char[] charArray = str;
            if (str != null) {
                charArray = str.toCharArray();
            }
            char[] cArr = charArray;
            synchronized (C2858i.f6710) {
                try {
                    char[] cArr2 = f7327;
                    char c = f7328;
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

        @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
        /* renamed from: ﾒ */
        public final void mo4950() {
            f7325 = (f7326 + 57) % 128;
            if (C2925r.m7529(C2925r.this)) {
                if (C2925r.m7522(C2925r.this) != null) {
                    C2925r.m7522(C2925r.this).m5095(iSAdQualitySegment);
                }
            } else {
                C2921n.m7502(m7589((byte) (TextUtils.indexOf((CharSequence) "", '0') + 116), "\u0001\u0002\u0003\u0004\u0000\t\u0007\b\t\u0005\u000b\f", 12 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)).intern(), m7589((byte) (Color.rgb(0, 0, 0) + 16777256), "\u000e\u0002\u000e\n\u0005\u0011\u0011\u0012\u0005\u0011\u0011\u0012\u0013\u000f\u0012\f\u0005\u0011\u0000\u0014\u0018\u0006\u0001\u0002\u0003\u0004\u0000\t\u0007\b\u0005\u0012\u0005\u000e\n\u0010\u000b\u0015\u0012\n\u0002\f\u0010\u0005\u000b\b\b\u0007\u0000\t\b\u0015\u0010\u0002V", (ViewConfiguration.getWindowTouchSlop() >> 8) + 55).intern());
                int i = f7325 + 63;
                f7326 = i % 128;
                if (i % 2 != 0) {
                    throw null;
                }
            }
        }
    }

    /* renamed from: com.ironsource.adqualitysdk.sdk.i.r$5 */
    public class AnonymousClass5 extends AbstractRunnableC2878it {
        public AnonymousClass5() {
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
        /* renamed from: ﾒ */
        public final void mo4950() {
            for (ISAdQualityInitListener iSAdQualityInitListener : C2925r.m7523(C2925r.this)) {
                if (iSAdQualityInitListener != null) {
                    iSAdQualityInitListener.adQualitySdkInitSuccess();
                }
            }
            C2925r.m7523(C2925r.this).clear();
        }
    }

    /* renamed from: com.ironsource.adqualitysdk.sdk.i.r$6 */
    public class AnonymousClass6 extends AbstractRunnableC2878it {

        /* renamed from: ﻐ */
        private /* synthetic */ ISAdQualityInitError f7332;

        /* renamed from: ﾇ */
        private /* synthetic */ Set f7333;

        /* renamed from: ﾒ */
        private /* synthetic */ String f7334;

        public AnonymousClass6(Set set, ISAdQualityInitError iSAdQualityInitError, String str) {
            set = set;
            iSAdQualityInitError = iSAdQualityInitError;
            str = str;
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
        /* renamed from: ﾒ */
        public final void mo4950() {
            for (ISAdQualityInitListener iSAdQualityInitListener : set) {
                if (iSAdQualityInitListener != null) {
                    iSAdQualityInitListener.adQualitySdkInitFailed(iSAdQualityInitError, str);
                }
            }
            set.clear();
        }
    }

    static {
        m7535();
        f7251 = null;
        int i = f7247 + 15;
        f7250 = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private C2925r() {
    }

    /* renamed from: 爫 */
    public static /* synthetic */ C2654al m7522(C2925r c2925r) {
        int i = f7250;
        f7247 = (i + 117) % 128;
        C2654al c2654al = c2925r.f7256;
        int i2 = i + 113;
        f7247 = i2 % 128;
        if (i2 % 2 == 0) {
            return c2654al;
        }
        throw null;
    }

    /* renamed from: טּ */
    public static /* synthetic */ Set m7523(C2925r c2925r) {
        int i = f7247;
        f7250 = (i + 65) % 128;
        Set<ISAdQualityInitListener> set = c2925r.f7253;
        f7250 = (i + 17) % 128;
        return set;
    }

    /* renamed from: ﭖ */
    public static /* synthetic */ void m7525(C2925r c2925r) {
        int i = f7247 + 95;
        f7250 = i % 128;
        c2925r.m7552(i % 2 != 0);
        int i2 = f7250 + InterfaceC3173h3.d.b.f8823f;
        f7247 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ﭴ */
    public static /* synthetic */ C2890je m7526(C2925r c2925r) {
        int i = f7250 + 31;
        f7247 = i % 128;
        int i2 = i % 2;
        C2890je c2890je = c2925r.f7254;
        if (i2 == 0) {
            return c2890je;
        }
        throw null;
    }

    /* renamed from: ﭸ */
    public static /* synthetic */ ISAdQualityAdListener m7527(C2925r c2925r) {
        int i = f7247 + 27;
        f7250 = i % 128;
        int i2 = i % 2;
        ISAdQualityAdListener iSAdQualityAdListener = c2925r.f7257;
        if (i2 != 0) {
            return iSAdQualityAdListener;
        }
        throw null;
    }

    /* renamed from: ﮉ */
    public static /* synthetic */ boolean m7529(C2925r c2925r) {
        f7247 = (f7250 + 27) % 128;
        boolean zM7528 = c2925r.m7528();
        int i = f7247 + InterfaceC3173h3.d.b.f8823f;
        f7250 = i % 128;
        if (i % 2 == 0) {
            int i2 = 32 / 0;
        }
        return zM7528;
    }

    /* renamed from: ﮌ */
    public static /* synthetic */ void m7530(C2925r c2925r) {
        f7250 = (f7247 + 19) % 128;
        c2925r.m7576(false);
        int i = f7250 + 1;
        f7247 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ﮐ */
    public static /* synthetic */ C2882ix m7532(C2925r c2925r) {
        int i = f7250 + 25;
        f7247 = i % 128;
        int i2 = i % 2;
        C2882ix c2882ix = c2925r.f7252;
        if (i2 != 0) {
            int i3 = 15 / 0;
        }
        return c2882ix;
    }

    /* renamed from: ﱟ */
    public static void m7535() {
        char[] cArr = new char[1582];
        ByteBuffer.wrap("\u0000Iµ\u009ekÛ!\u0003×e\u008dtB¯ø÷®\u0001dA\u001a{Ï\u009c\u0085Ø;\"ñ\u0018§j\\¾\u0012ôÈ\u001e~^4eé½\u009f÷U\u0011\u000b]Á%v±,ðâ\u0002\u0098MNc\u0003«¹ÔoM%[Ûu\u0090³F\u0081ü\u0003²Nh{\u001d¡Ó\u0082\u0089\r?Yõ)ª¹`Å\u0016PÌI\u0082s7§íÁ£QY\u007f\u000fhÄ¬zÌ0\u0004æV\u009cxQ \u0007\u0089½2s0)}Þ¶\u0094ÎJ\u0017\u0000 ¶zk²!Ç×\u001bX\u0004íì3\u008eyW\u008f\u0010Õ(\u001aâ ªöT<#B\u0003\u0097Á\u0000Iµ\u009ekÛ!\u0003×e\u008dtB¯ø÷®\u0001dA\u001a{Ï\u009c\u0085Ø;\"ñ\u0018§j\\¾\u0012ôÈ\u001e~^4eé½\u009f÷U\u0011\u000b]Á%v³,óâ\u001e\u0098\\Ng\u0003·¹ÙoM%YÛf\u0090¸FÍü\u000b²_\u0000Iµ\u009ekÛ!\u0003×e\u008dtB¯ø÷®\u0001dA\u001a{Ïï\u0085Ï;-ñ}§#\\¹\u0012óÈ\u0003~C4mé°\u009fòU\u0002\u000bBÁ`vò,òâ\t\u0098MNn\u0003¼¹ÄoM%YÛf\u0090ºF\u0081ü\f²^h(\u001d°ÓÚ\u0089\n?_õ|ª¢`Æ\u0016\u0014Ì\u001d\u0082e7¹íÈ£\bY\u001e\u000fdÄ¶zÆ0\u0017^¬ëC5\u001b\u007f¯\u0089¯ÓÎ\u001cH¦\u001aðî:®D\u0084\u0091AÛ\u001feï¯£ù\u0089\u0002\u001fL_\u0096¥ \u0091j¸·\u007fÁ\u0015\u000bÕU¢\u009f\u008b(Qr\u0019¼÷Æ¯\u0010É]oç\u000b1É{õ\u0085\u009fÎZ\u0018=¢¡ì§6\u008fCO\u008d9×äa¼«\u0091ôW>b\u0000Cµ¬kô!@×@\u008d!B§øõ®\u0001dA\u001akÏ®\u0085ð;\u0000ñL§f\\ð\u0012ÔÈ9~v4`é\u0080\u009fëU\n\u000bTÁlv¦,æâL\u0098jNB\u0003\u0098¹\u0080o\u001a%SÛs\u0090¼F\u0081ü\u0000²Nhd\u001d¹Ó\u0082\u0089\u0000?Nõ)ª³`Î\u0016\u0000ÌI\u0082s7÷íÑ£\u0002Y[\u000fyÄøzÌ0\u0016æ\u0011\u0000Cµ¬kô!@×@\u008d!B§øõ®\u0001dA\u001akÏ®\u0085ð;\u0000ñL§f\\ð\u0012°ÈJ~V4té¡\u009fÕU\u000e\u000bAÁ%v±,þâ\u0002\u0098\u001eNr\u0003ó¹Âo\b%\u001aÛi\u0090¡FÍü\u0002²\u001bhg\u001d§Ó\u0082\u0089\n?Qõyª¢`Ú\u0016^\u0000Iµ\u009ekÛ!\u0003×e\u008dtB¯ø÷®\u0001dA\u001a{Ï\u009c\u0085Ø;\"ñ\u0016§t\\±\u0012îÈJ~V4hé£\u009fûU\n\u000b\\Á|vò,ìâ\u0004\u0098LNr\u0003·¹Ïo\u001a%TÛ)\u0000Iµ\u009ekÛ!\u0003×e\u008dtB¯ø÷®\u0001dA\u001a{Ï\u009c\u0085Ø;\"ñ\u0016§t\\±\u0012îÈJ~Y4aé§\u009fûU\u0019\u000b\u0018Álv¼,öâ\u0018\u0098PNg\u0003¿¹Éo\u0017%_Ûc\u0090ôF\u008cüN²Uhg\u001dõÓÌ\u0089\n?Yõmªö`×\u0016\u001fÌ\u001d\u0082y7¿íÑ£\u0005YZ\u000fdÄ¯zË0\\o\u0003ÚÔ\u0004\u0091NI¸/â>-å\u0097½ÁK\u000b\u000bu1 ¥ê\u0085Tg\u009e7Èi3í}¶§S\u0011][=\u0086óð¡:Ud\u0016® \u0019ïC»\u0000 µ«kè!\b×Y\u008d!B\u008føÿ®9d@\u001acÏ£\u0085õ;\u001dñO§#\\ \u0012ñÈ\u000b~C4bé¾\u009fìU\u0006\u0000sµ¢kõ!\n×X\u008d`\u0000 µºkó!\u0013×\\\u008d!B¼øþ®\tdF\u001amÏ¡\u0085¦;IC*öÐ(\u0087bg\u0094)ÎN\u0001Ò»\u009cír'.Y\u0019\u008cÉÆ\u009dxa²yä\b\u001fÐQ\u0085\u008bkeÀÐ:\u000emD\u008d²Ãè¤'8\u009d{Ë\u0099\u0001Ä\u007fîª$à~^Ì\u0094ÆÂõ90wj\u00ad¦\u001bÖQ¡\u0000Cµ¬kô!@×@\u008d!B\u00adøó®\td[\u001aeÏª\u0085¼;\u001cñE§f\\¢\u0012½È\u0003~S4$éü\u009f¾U\"\u000bkÁDv¶,Îâ\u0019\u0098XNj\u0003º¹Ôo\u0014%\u001aÛT\u0090\u0090FêüN²Lhi\u001d¦Ó\u0082\u0089\u001c?Tõ|ª¢`Ç\u0016\u001fÌJ\u0082d7ùÎ\u0082{y¥4ï\u009c\u0019\u0082C¯\u008cf64`\u0093ª\u0087Ô·\u0001}K3õÛ?\u008ci´\u0092bÜ<\u0006Ô°Ìú\u0096'YQ\u0004\u009bÔÅ²\u000f«¸hâ(,ÞV\u0096\u0080¤Í(w(¡òëª\u0015ü^m\u0088\u001f2Ó|\u008f¦¡Ók\u001dYG×ñ\u0086;¾da®\u0011ØÅ\u0002\u0081Lñù+#\u001cmÂ\u0097\u0084Á¾\nd´\u001bþü(\u0097R²\u009fpÉ4sÌ½¼ÒZg¼¹ùóS\u0005U_f\u0090¿*ý|\\¶HÈr\u001dûWëé\u001c#Lu0\u008e°À©\u001a\u001c¬Fæ0;«Mÿ\u0087\u0013Ù@\u00131¤©þù0XJH\u009c\u007fÑ·kÀ½\u0000\u0000Eµ\u009fkÈ!(×f\u008d Bîøî®\u001bdP\u001apÏï\u0085Õ;-ñ\u0016§j\\£\u0012½È\u0004~B4hé½\u009f°UK\u000bhÁiv·,þâ\u001f\u0098\\N&\u0003¾¹Áo\u0006%_Û'\u0090§FÔü\u001c²^h(\u001d¡ÓÍ\u0089O?Lõhª¥`Ð\u0016PÌ\\\u0082*7¡íÅ£\u001dYW\u000foÄøzË0\u001dæQ\u009c!Q·\u0007Ó½\u001fs,)-Þ¯\u0094ÔJ\u0011\u00003¶.k\u0092!ì×U\u008d6C`øü®àd%\u001a\u0002Ðt\u0085\u008c;ßñ\u0016§(]x\u0012ªÈÒ~X4\u0016êV\u009f\u0094U\u0082\u0000aµ£kã!\u0013×\\\u008dhB øü®EdL\u001amÏº\u0085±;\u001eñW§m\\¤\u0000Eµ\u009fkÈ!(×f\u008d BîøÂ®\u0007d@\u001a%Ï½\u0085ù;IñC§p\\¹\u0012óÈ\r~\u00174pé¹\u009fûUK\u000b\\Á`v´,þâ\u0019\u0098UNr\u0003ó¹Õo\u001e%_Ûu\u0090ôFèü*²\u001b\u0000.µíkÊ!\u000b×Q\u008d`B½øþ®HdX\u001acÏ¤\u0085ù;IñE§v\\¢\u0012øÈJ~C4kéñ\u009fîU\n\u000bKÁvvò,þâL\u0098LNh\u0003º¹Ño\u0018%_Û'\u0090¡FÒü\u000b²Ih(\u001d\u009cÓæ\u0089O?Zõfª¤`\u0083\u0016\u0015Ì\\\u0082i7¿í\u0084£\u0004YM\u000fnÄªz\u00850\u0006æP\u009c,Q\u0090\u0007õ½2s$)\\Þ¯\u0094ÆJ\u0018\u0000(¶zk¢!\u0088×&\u008d\u0006CDøòòÕG.\u0099cÓ\u0099%\u0098\u007fÄ°\u0011\nV\\\u0080\u0096èèû=\"w|É\u008c\u0003ÎUö®|àB:¢\u008cðÆ¨\u001b(ma§\u0082ùÆ3©\u0084\u0017ÞW\u0010ÀjÜ¼ùñeK\f\u0085ù01îs¤ RÅ\b÷Ç?}w+¯áÏ\u009föJ8\u0000f|aÉ«\u0017æ]A«Oñl>µ\u0084àÒ)\u0018Y\u0000tµ¿kû!\u0004×Q\u008dcB¯øø®\u0003d\u001b\u001aiÏ¹\u0085²;\rñT§-\\±\u0012óÈ\u000b~[4}é¥\u009f÷U\b\u000bKe:Ðë\u000e¼DC²\u0011è)'ª\u009d¡ËD\u0001\u001f\u007f9ªãà¡^\r\u0094KÂ+9÷wµ\u00adO\u001b\u0007Q9\u008cñú´0Qä©QF\u008f\u001eÅª3ªiË¦W\u001c\u0014Jö\u0080ÿþ\u0081+Ka\u0002ßæ\u0015®C\u0087¸[ö\u001b, \u009a©Ð\u008b\rH{\u0000±¡ï¿%\u0080\u0092\\È\u0010\u0006¦|þªÌçp]\u0019\u008bÆÁ´?¼tK¢*\u0018èV¸\u008c\u0096ùF7hmÖÛ\u0092\u0011¨N\u001c\u0084>òû(¤fÀÓN\t&Gî½ ë\u0085 ]\u009e8Ôö\u0002û\u0000Mµ¸ké!\u0013×\u0014\u008drB«øï®Hd\\\u001alÏ»\u0085ù;\u001bñX§b\\¼\u0012½È\u001e~R4wé¥\u009f¾U\u0006\u000bWÁav·,¿â\u000e\u0098\\N`\u0003¼¹Òo\b%\u001aÛn\u0090ºFÈü\u001a²Rhi\u001d¹ÓË\u0089\u0015?Uõgª±`\u0082\u0000aµ£kþ!\u0015×[\u008dhBªøµ®\u0001d[\u001avÏª\u0085ò;\u001dñ\u0018§b\\³\u0012éÈ\u0003~X4jéÿ\u009fÜU*\u000blÁQv\u0097,Íâ5\u0098fNE\u0003\u009b¹áo#%}ÛB\u0090\u0090\u0000Fµ¬kó!\u000b×Q\u008deBîøï®\u0007d\u0015\u001apÏª\u0085û;\u0000ñE§w\\µ\u0012ïÈJ~U4eé¥\u009fêU\u000e\u000bJÁ|vò,íâ\t\u0098ZNc\u0003º¹Öo\b%H\u0000Cµ¬kô!@×@\u008d!B½øþ®\u001cd\u0015\u001acÏ«\u0085¼;\u0005ñ_§p\\¤\u0012øÈ\u0004~R4véñ\u009f³UK\u000bqÁVv\u0093,ûâ=\u0098LNg\u0003¿¹Éo\u0019%CÛ'\u0090\u0087Fåü%²\u001bh\u007f\u001d´ÓÑ\u0089O?Oõaª£`×\u0016\u0014ÌR\u0082}7¹í\u008a\u0000Cµ¬kô!@×@\u008d!B½øþ®\u0006dQ\u001a\"Ï¬\u0085é;\u001añB§l\\½\u0012½È\u0007~R4`é¸\u009fÿU\u001f\u000bQÁjv¼,¿â\u001e\u0098\\Np\u0003¶¹Îo\u0018%_Û'\u0090ùF\u0081ü'²hhI\u001d±Óó\u0089\u001a?]õeª¿`×\u0016\tÌ\u001d\u0082Y7\u0093íï£QYI\u000fjÄ«z\u00850\u0001æW\u009cyQ\u00ad\u0007Â½\u001cs7)cÞô\u008fñ:\u001eäF®òXò\u0002\u0093Í\u000fwL!´ëã\u0095\u0090@\u001e\n[´¨~ð(ÞÓ\u000f\u009d\u000fGµñà»Òf\n\u0010MÚ\u00ad\u0084ãNØù\u000e£\rm¬\u0017îÁÂ\u008c\u00046|àªªíT\u0095\u001fKÉ3s\u0095=Úçû\u0092\u0003\\A\u0006¨°ïz×%\rïe\u0099»C¯\rë¸!b],ãÖå\u0080ÊKJõy¿¯iù\u0013\u009eÞ\u0002\u0088z2¨ü\u0086¦ÖQ\t\u001byÅ¯\u008f\u00899Ùä\r®4\u0000Cµ¬kô!@×@\u008d!B½øþ®\u001cd\u0015\u001aqÏª\u0085û;\u0004ñS§m\\¤\u0012½ÈG~\u00174Mé\u0082\u009fßU\u000f\u000biÁpv³,óâ\u0005\u0098MN\u007f\u0003ó¹óo)%qÛ'\u0090£FÀü\u001d²\u001bh{\u001d½Ó×\u0089\u001b?Xõfª¡`Í\u0016^\u0000Cµ¬kô!@×@\u008d!B½øþ®\u001cd\u0015\u001aaÏ \u0085ò;\u000fñ_§d\\ð\u0012°ÈJ~~4Wé\u0090\u009fúU:\u000bMÁdv¾,öâ\u0018\u0098@N&\u0003\u0080¹äo&%\u001aÛp\u0090µFÒüN²Hh`\u001d ÓÖ\u0089\u000b?Sõ~ª¸`\u008d\u0000Cµ¬kô!@×@\u008d!B½øþ®\u001cd\u0015\u001aaÏ \u0085ò;\u000fñ_§d\\ð\u0012°ÈJ~~4Wé\u0090\u009fúU:\u000bMÁdv¾,öâ\u0018\u0098@N&\u0003\u0080¹äo&%\u001aÛn\u0090§F\u0081ü\u000f²Whz\u001d°ÓÃ\u0089\u000b?Eõ)ª¿`Í\u0016\u0019ÌI\u0082c7¶íÈ£\u0018YD\u000fnÄ¼z\u008b\u0000iµªkô!\b×F\u008ddB\u0091øë®\u001adP\u001a]Ï¦\u0085ò;\u0000ñB§\\\\³\u0012òÈ\u0004~Q4mé¶".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 1582);
        f7248 = cArr;
        f7249 = 7159271710447023565L;
    }

    /* renamed from: ﱡ */
    public static /* synthetic */ Context m7536(C2925r c2925r) {
        int i = (f7250 + 121) % 128;
        f7247 = i;
        Context context = c2925r.f7265;
        int i2 = i + 25;
        f7250 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 1 / 0;
        }
        return context;
    }

    /* renamed from: ﺙ */
    public static /* synthetic */ C2651ai m7538(C2925r c2925r) {
        int i = (f7250 + 9) % 128;
        f7247 = i;
        C2651ai c2651ai = c2925r.f7260;
        f7250 = (i + 59) % 128;
        return c2651ai;
    }

    /* renamed from: ﻏ */
    public static /* synthetic */ void m7540(C2925r c2925r) {
        f7250 = (f7247 + 83) % 128;
        c2925r.m7524();
        int i = f7250 + 99;
        f7247 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ﻐ */
    public static /* synthetic */ C2657ao m7541(C2925r c2925r) {
        f7247 = (f7250 + 93) % 128;
        C2657ao c2657aoM7537 = c2925r.m7537();
        int i = f7247 + 75;
        f7250 = i % 128;
        if (i % 2 != 0) {
            return c2657aoM7537;
        }
        throw null;
    }

    /* renamed from: ﻛ */
    public static /* synthetic */ C2651ai m7547(C2925r c2925r, C2651ai c2651ai) {
        int i = (f7250 + 73) % 128;
        f7247 = i;
        c2925r.f7260 = c2651ai;
        f7250 = (i + 85) % 128;
        return c2651ai;
    }

    /* renamed from: ｋ */
    public static /* synthetic */ C2653ak m7555(C2925r c2925r, C2653ak c2653ak) {
        int i = f7250 + 79;
        f7247 = i % 128;
        int i2 = i % 2;
        c2925r.f7255 = c2653ak;
        if (i2 == 0) {
            return c2653ak;
        }
        throw null;
    }

    /* renamed from: ﾇ */
    public static /* synthetic */ C2654al m7566(C2925r c2925r, C2654al c2654al) {
        int i = (f7247 + 61) % 128;
        f7250 = i;
        c2925r.f7256 = c2654al;
        f7247 = (i + 1) % 128;
        return c2654al;
    }

    /* renamed from: ﾒ */
    public static /* synthetic */ Context m7572(C2925r c2925r, Context context) {
        int i = (f7250 + 95) % 128;
        f7247 = i;
        c2925r.f7265 = context;
        f7250 = (i + 75) % 128;
        return context;
    }

    @Override // com.ironsource.adqualitysdk.sdk.IronSourceAdQuality
    public void changeUserId(String str) {
        String str2;
        try {
            if (m7546(str)) {
                boolean zEquals = str.equals(m7537().m5114());
                boolean z = !zEquals;
                boolean zMo7272 = AbstractC2894ji.m7268().mo7272();
                if (!zEquals) {
                    int i = f7247;
                    f7250 = (i + 93) % 128;
                    if (zMo7272) {
                        int i2 = i + InterfaceC3173h3.d.b.f8819b;
                        f7250 = i2 % 128;
                        if (i2 % 2 == 0) {
                            this.f7260.m5049();
                            throw null;
                        }
                        this.f7260.m5049();
                    }
                }
                str2 = str;
                try {
                    m7543(this.f7265, str2, z, true, zMo7272);
                } catch (Exception e) {
                    e = e;
                    C2914kb.m7429(m7559((char) (TextUtils.getOffsetAfter("", 0) + 22597), (ViewConfiguration.getJumpTapTimeout() >> 16) + 74, View.MeasureSpec.getMode(0) + 12).intern(), AbstractC2183w4.OooOO0o(new StringBuilder(), m7559((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 25988), 527 - TextUtils.lastIndexOf("", '0'), 21 - TextUtils.indexOf("", "")), str2), e, true, false, true);
                }
            }
        } catch (Exception e2) {
            e = e2;
            str2 = str;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.IronSourceAdQuality
    public void initialize(Context context, String str) {
        f7247 = (f7250 + 29) % 128;
        initialize(context, str, null);
        int i = f7247 + 47;
        f7250 = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0014, code lost:
    
        if (m7579() != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x001b, code lost:
    
        if (m7579() == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0021, code lost:
    
        if (m7528() == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0023, code lost:
    
        r4.f7255.m5090(r5);
        com.ironsource.adqualitysdk.sdk.p009i.C2925r.f7250 = (com.ironsource.adqualitysdk.sdk.p009i.C2925r.f7247 + 67) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0030, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0031, code lost:
    
        com.ironsource.adqualitysdk.sdk.p009i.C2921n.m7502(m7559((char) (22598 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), 74 - android.widget.ExpandableListView.getPackedPositionGroup(0), 12 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16)).intern(), m7559((char) (36786 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0)), 1332 - android.view.KeyEvent.getDeadChar(0, 0), 73 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))).intern());
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0075, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0076, code lost:
    
        com.ironsource.adqualitysdk.sdk.p009i.C2921n.m7502(m7559((char) ((android.view.KeyEvent.getMaxKeyCode() >> 16) + 22597), 74 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), 11 - android.text.TextUtils.lastIndexOf("", '0')).intern(), m7559((char) ((-1) - ((byte) android.view.KeyEvent.getModifierMetaStateMask())), (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 1265, android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 67).intern());
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ba, code lost:
    
        return;
     */
    @Override // com.ironsource.adqualitysdk.sdk.IronSourceAdQuality
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void sendCustomMediationRevenue(com.ironsource.adqualitysdk.sdk.ISAdQualityCustomMediationRevenue r5) {
        /*
            r4 = this;
            int r0 = com.ironsource.adqualitysdk.sdk.p009i.C2925r.f7250
            int r0 = r0 + 5
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.p009i.C2925r.f7247 = r1
            int r0 = r0 % 2
            r1 = 0
            if (r0 == 0) goto L17
            boolean r0 = r4.m7579()
            r2 = 18
            int r2 = r2 / r1
            if (r0 == 0) goto L1d
            goto L76
        L17:
            boolean r0 = r4.m7579()
            if (r0 != 0) goto L76
        L1d:
            boolean r0 = r4.m7528()
            if (r0 == 0) goto L31
            com.ironsource.adqualitysdk.sdk.i.ak r0 = r4.f7255
            r0.m5090(r5)
            int r5 = com.ironsource.adqualitysdk.sdk.p009i.C2925r.f7247
            int r5 = r5 + 67
            int r5 = r5 % 128
            com.ironsource.adqualitysdk.sdk.p009i.C2925r.f7250 = r5
            return
        L31:
            float r5 = android.media.AudioTrack.getMaxVolume()
            r0 = 0
            int r5 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            int r5 = 22598 - r5
            char r5 = (char) r5
            r2 = 0
            int r2 = android.widget.ExpandableListView.getPackedPositionGroup(r2)
            int r2 = 74 - r2
            int r3 = android.view.ViewConfiguration.getScrollDefaultDelay()
            int r3 = r3 >> 16
            int r3 = 12 - r3
            java.lang.String r5 = m7559(r5, r2, r3)
            java.lang.String r5 = r5.intern()
            r2 = 36786(0x8fb2, float:5.1548E-41)
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r1)
            int r2 = r2 - r3
            char r2 = (char) r2
            int r3 = android.view.KeyEvent.getDeadChar(r1, r1)
            int r3 = 1332 - r3
            float r1 = android.util.TypedValue.complexToFloat(r1)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            int r0 = 73 - r0
            java.lang.String r0 = m7559(r2, r3, r0)
            java.lang.String r0 = r0.intern()
            com.ironsource.adqualitysdk.sdk.p009i.C2921n.m7502(r5, r0)
            return
        L76:
            int r5 = android.view.KeyEvent.getMaxKeyCode()
            int r5 = r5 >> 16
            int r5 = r5 + 22597
            char r5 = (char) r5
            int r0 = android.view.ViewConfiguration.getJumpTapTimeout()
            int r0 = r0 >> 16
            int r0 = 74 - r0
            java.lang.String r2 = ""
            r3 = 48
            int r2 = android.text.TextUtils.lastIndexOf(r2, r3)
            int r2 = 11 - r2
            java.lang.String r5 = m7559(r5, r0, r2)
            java.lang.String r5 = r5.intern()
            int r0 = android.view.KeyEvent.getModifierMetaStateMask()
            byte r0 = (byte) r0
            int r0 = (-1) - r0
            char r0 = (char) r0
            int r2 = android.view.ViewConfiguration.getKeyRepeatDelay()
            int r2 = r2 >> 16
            int r2 = r2 + 1265
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r1)
            int r1 = r1 + 67
            java.lang.String r0 = m7559(r0, r2, r1)
            java.lang.String r0 = r0.intern()
            com.ironsource.adqualitysdk.sdk.p009i.C2921n.m7502(r5, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.p009i.C2925r.sendCustomMediationRevenue(com.ironsource.adqualitysdk.sdk.ISAdQualityCustomMediationRevenue):void");
    }

    @Override // com.ironsource.adqualitysdk.sdk.IronSourceAdQuality
    public void setAdListener(ISAdQualityAdListener iSAdQualityAdListener) {
        if (!m7579()) {
            this.f7257 = iSAdQualityAdListener;
            f7247 = (f7250 + 37) % 128;
            return;
        }
        f7247 = (f7250 + 19) % 128;
        C2921n.m7502(m7559((char) (Color.argb(0, 0, 0, 0) + 22597), 73 - ImageFormat.getBitsPerPixel(0), 11 - TextUtils.lastIndexOf("", '0', 0, 0)).intern(), m7559((char) (ViewConfiguration.getDoubleTapTimeout() >> 16), (ViewConfiguration.getPressedStateDuration() >> 16) + 1212, 53 - View.getDefaultSize(0, 0)).intern());
        int i = f7250 + 69;
        f7247 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.IronSourceAdQuality
    public void setConfig(ISAdQualityConfig iSAdQualityConfig) {
        if (m7579()) {
            f7247 = (f7250 + 45) % 128;
            C2921n.m7502(m7559((char) (22597 - KeyEvent.getDeadChar(0, 0)), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 75, 13 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))).intern(), m7559((char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 1454 - Color.green(0), 48 - (Process.myPid() >> 22)).intern());
        } else if (!m7531()) {
            this.f7269 = iSAdQualityConfig;
        } else {
            f7250 = (f7247 + 119) % 128;
            C2921n.m7502(m7559((char) (22597 - View.resolveSize(0, 0)), KeyEvent.keyCodeFromString("") + 74, Drawable.resolveOpacity(0, 0) + 12).intern(), m7559((char) View.resolveSizeAndState(0, 0, 0), View.MeasureSpec.getMode(0) + 1502, (ViewConfiguration.getFadingEdgeLength() >> 16) + 58).intern());
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.IronSourceAdQuality
    public void setSegment(ISAdQualitySegment iSAdQualitySegment) {
        if (!m7579()) {
            C2926s.m7600(new AbstractRunnableC2878it() { // from class: com.ironsource.adqualitysdk.sdk.i.r.4

                /* renamed from: ﱡ */
                private static int f7325 = 1;

                /* renamed from: ﻐ */
                private static int f7326 = 0;

                /* renamed from: ﻛ */
                private static char[] f7327 = {'A', 'd', 'Q', 'u', 'a', 'l', 'i', 't', 'y', 'S', 'D', 'K', 'C', 'n', '\'', ' ', 's', 'e', 'g', 'm', '-', 'I', 'o', 'z', '.'};

                /* renamed from: ﾒ */
                private static char f7328 = 5;

                /* renamed from: ﾇ */
                private /* synthetic */ ISAdQualitySegment f7330;

                public AnonymousClass4(ISAdQualitySegment iSAdQualitySegment2) {
                    iSAdQualitySegment = iSAdQualitySegment2;
                }

                /* renamed from: ｋ */
                private static String m7589(byte b, String str, int i) {
                    String str2;
                    char[] charArray = str;
                    if (str != null) {
                        charArray = str.toCharArray();
                    }
                    char[] cArr = charArray;
                    synchronized (C2858i.f6710) {
                        try {
                            char[] cArr2 = f7327;
                            char c = f7328;
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

                @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
                /* renamed from: ﾒ */
                public final void mo4950() {
                    f7325 = (f7326 + 57) % 128;
                    if (C2925r.m7529(C2925r.this)) {
                        if (C2925r.m7522(C2925r.this) != null) {
                            C2925r.m7522(C2925r.this).m5095(iSAdQualitySegment);
                        }
                    } else {
                        C2921n.m7502(m7589((byte) (TextUtils.indexOf((CharSequence) "", '0') + 116), "\u0001\u0002\u0003\u0004\u0000\t\u0007\b\t\u0005\u000b\f", 12 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)).intern(), m7589((byte) (Color.rgb(0, 0, 0) + 16777256), "\u000e\u0002\u000e\n\u0005\u0011\u0011\u0012\u0005\u0011\u0011\u0012\u0013\u000f\u0012\f\u0005\u0011\u0000\u0014\u0018\u0006\u0001\u0002\u0003\u0004\u0000\t\u0007\b\u0005\u0012\u0005\u000e\n\u0010\u000b\u0015\u0012\n\u0002\f\u0010\u0005\u000b\b\b\u0007\u0000\t\b\u0015\u0010\u0002V", (ViewConfiguration.getWindowTouchSlop() >> 8) + 55).intern());
                        int i = f7325 + 63;
                        f7326 = i % 128;
                        if (i % 2 != 0) {
                            throw null;
                        }
                    }
                }
            });
            f7247 = (f7250 + 55) % 128;
            return;
        }
        f7247 = (f7250 + 97) % 128;
        C2921n.m7502(m7559((char) (22597 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 74, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 13).intern(), m7559((char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), 1406 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 49 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)).intern());
        int i = f7250 + 5;
        f7247 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.IronSourceAdQuality
    @Deprecated
    public void setUserConsent(boolean z) {
        int i = f7247 + 83;
        f7250 = i % 128;
        if (i % 2 == 0) {
            m7537().m5121(z);
            throw null;
        }
        m7537().m5121(z);
        f7247 = (f7250 + 97) % 128;
    }

    @Override // com.ironsource.adqualitysdk.sdk.IronSourceAdQuality
    public synchronized void shutdown() {
        f7250 = (f7247 + 115) % 128;
        m7545(false);
        int i = f7250 + InterfaceC3173h3.d.b.f8823f;
        f7247 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ﭖ */
    private void m7524() {
        C2926s.m7596(new AbstractRunnableC2878it() { // from class: com.ironsource.adqualitysdk.sdk.i.r.5
            public AnonymousClass5() {
            }

            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
            /* renamed from: ﾒ */
            public final void mo4950() {
                for (ISAdQualityInitListener iSAdQualityInitListener : C2925r.m7523(C2925r.this)) {
                    if (iSAdQualityInitListener != null) {
                        iSAdQualityInitListener.adQualitySdkInitSuccess();
                    }
                }
                C2925r.m7523(C2925r.this).clear();
            }
        });
        int i = f7247 + 119;
        f7250 = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ﮉ */
    private synchronized boolean m7528() {
        boolean z;
        int i = f7247;
        int i2 = i + 43;
        f7250 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        z = this.f7267;
        int i3 = i + 87;
        f7250 = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        return z;
    }

    /* renamed from: ﮌ */
    private synchronized boolean m7531() {
        int i = f7247;
        boolean z = this.f7268;
        int i2 = i + 43;
        f7250 = i2 % 128;
        if (i2 % 2 != 0) {
            return z;
        }
        int i3 = 24 / 0;
        return z;
    }

    /* renamed from: ﮐ */
    private synchronized boolean m7533() {
        boolean z;
        try {
            int i = f7247 + 19;
            f7250 = i % 128;
            if (i % 2 == 0) {
                z = this.f7264;
                int i2 = 53 / 0;
            } else {
                z = this.f7264;
            }
        } catch (Throwable th) {
            throw th;
        }
        return z;
    }

    /* renamed from: ﱟ */
    public static /* synthetic */ C2666ax m7534(C2925r c2925r) {
        int i = f7250 + 39;
        f7247 = i % 128;
        int i2 = i % 2;
        C2666ax c2666ax = c2925r.f7258;
        if (i2 != 0) {
            int i3 = 51 / 0;
        }
        return c2666ax;
    }

    /* renamed from: ﱡ */
    private synchronized C2657ao m7537() {
        C2657ao c2657ao;
        int i = (f7247 + 37) % 128;
        f7250 = i;
        c2657ao = this.f7270;
        f7247 = (i + 81) % 128;
        return c2657ao;
    }

    /* renamed from: ﻏ */
    private JSONObject m7539() {
        int i = f7250 + 21;
        f7247 = i % 128;
        if (i % 2 != 0) {
            m7537().m5108();
            throw null;
        }
        Map<String, String> mapM5108 = m7537().m5108();
        if (mapM5108 != null && mapM5108.containsKey(m7559((char) (TextUtils.getOffsetBefore("", 0) + 34200), View.MeasureSpec.makeMeasureSpec(0, 0) + 960, 13 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)).intern())) {
            try {
                return new JSONObject(mapM5108.get(m7559((char) (34200 - ((Process.getThreadPriority(0) + 20) >> 6)), 960 - (KeyEvent.getMaxKeyCode() >> 16), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 13).intern()));
            } catch (JSONException unused) {
            }
        }
        int i2 = f7247 + 121;
        f7250 = i2 % 128;
        if (i2 % 2 != 0) {
            return null;
        }
        throw null;
    }

    /* renamed from: ﻐ */
    public static /* synthetic */ void m7544(C2925r c2925r, Context context, String str) {
        f7250 = (f7247 + 39) % 128;
        c2925r.m7543(context, str, true, false, true);
        int i = f7247 + 35;
        f7250 = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ﻛ */
    public static /* synthetic */ void m7550(C2925r c2925r, Context context) {
        f7247 = (f7250 + 121) % 128;
        c2925r.m7542(context);
        int i = f7247 + 87;
        f7250 = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ｋ */
    public static /* synthetic */ C2666ax m7556(C2925r c2925r, C2666ax c2666ax) {
        int i = f7250;
        int i2 = i + 27;
        f7247 = i2 % 128;
        int i3 = i2 % 2;
        c2925r.f7258 = c2666ax;
        if (i3 != 0) {
            int i4 = 45 / 0;
        }
        int i5 = i + 125;
        f7247 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 13 / 0;
        }
        return c2666ax;
    }

    /* renamed from: ﾇ */
    public static /* synthetic */ C2881iw m7567(C2925r c2925r) {
        int i = f7247;
        f7250 = (i + InterfaceC3173h3.d.b.f8823f) % 128;
        C2881iw c2881iw = c2925r.f7261;
        int i2 = i + 49;
        f7250 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 50 / 0;
        }
        return c2881iw;
    }

    /* renamed from: ﾒ */
    public static /* synthetic */ C2652aj m7573(C2925r c2925r) {
        int i = f7250 + 125;
        f7247 = i % 128;
        int i2 = i % 2;
        C2652aj c2652aj = c2925r.f7259;
        if (i2 != 0) {
            int i3 = 98 / 0;
        }
        return c2652aj;
    }

    @Override // com.ironsource.adqualitysdk.sdk.IronSourceAdQuality
    public void initialize(Context context, String str, ISAdQualityConfig iSAdQualityConfig) {
        if (context instanceof Application) {
            int i = f7250 + InterfaceC3173h3.d.b.f8821d;
            f7247 = i % 128;
            if (i % 2 == 0) {
                m7549((Application) context, str, iSAdQualityConfig);
                return;
            } else {
                m7549((Application) context, str, iSAdQualityConfig);
                throw null;
            }
        }
        if (context != null && !(!(context.getApplicationContext() instanceof Application))) {
            m7549((Application) context.getApplicationContext(), str, iSAdQualityConfig);
            return;
        }
        if (context instanceof Activity) {
            m7560((Activity) context, str, iSAdQualityConfig);
            int i2 = f7250 + 25;
            f7247 = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            return;
        }
        String strIntern = m7559((char) (Process.myPid() >> 22), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1, 74 - (ViewConfiguration.getScrollBarSize() >> 8)).intern();
        C2921n.m7502(m7559((char) (22597 - View.resolveSizeAndState(0, 0, 0)), TextUtils.getOffsetBefore("", 0) + 74, 12 - (ViewConfiguration.getPressedStateDuration() >> 16)).intern(), strIntern);
        m7551(iSAdQualityConfig.getAdQualityInitListeners(), ISAdQualityInitError.EXCEPTION_ON_INIT, strIntern);
        int i3 = f7247 + InterfaceC3173h3.d.b.f8821d;
        f7250 = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ﺙ */
    public final synchronized C2666ax m7577() {
        C2666ax c2666ax;
        try {
            int i = f7247 + 117;
            f7250 = i % 128;
            if (i % 2 == 0) {
                c2666ax = this.f7258;
                int i2 = 46 / 0;
            } else {
                c2666ax = this.f7258;
            }
        } catch (Throwable th) {
            throw th;
        }
        return c2666ax;
    }

    /* renamed from: ﻐ */
    private synchronized void m7545(boolean z) {
        f7250 = (f7247 + 97) % 128;
        try {
            if (!(!m7579())) {
                C2921n.m7502(m7559((char) (22597 - View.MeasureSpec.getMode(0)), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 73, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 13).intern(), m7559((char) Color.blue(0), TextUtils.getTrimmedLength("") + 342, TextUtils.indexOf((CharSequence) "", '0', 0) + 37).intern());
                return;
            }
            if (!m7528()) {
                f7247 = (f7250 + 91) % 128;
                C2921n.m7502(m7559((char) (22597 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), 74 - View.MeasureSpec.getMode(0), TextUtils.indexOf((CharSequence) "", '0', 0) + 13).intern(), m7559((char) (MotionEvent.axisFromString("") + 1), TextUtils.indexOf("", "", 0, 0) + 378, 60 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))).intern());
                f7247 = (f7250 + 27) % 128;
                return;
            }
            String strIntern = m7559((char) (View.combineMeasuredStates(0, 0) + 28490), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 436, TextUtils.getTrimmedLength("") + 28).intern();
            if (z) {
                StringBuilder sb = new StringBuilder();
                sb.append(strIntern);
                sb.append(m7559((char) Color.red(0), 464 - ExpandableListView.getPackedPositionChild(0L), KeyEvent.normalizeMetaState(0) + 24).intern());
                strIntern = sb.toString();
            }
            String strMo5171 = AbstractC2661as.m5141().mo5171(m7559((char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), 489 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 6 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)).intern());
            if (!TextUtils.isEmpty(strMo5171)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(strIntern);
                sb2.append(m7559((char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 496, 14 - TextUtils.indexOf("", "", 0)).intern());
                sb2.append(strMo5171);
                strIntern = sb2.toString();
            }
            C2921n.m7518(m7559((char) (22597 - KeyEvent.keyCodeFromString("")), 73 - ImageFormat.getBitsPerPixel(0), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 12).intern(), strIntern);
            m7574(ISAdQualityInitError.AD_QUALITY_SDK_WAS_SHUTDOWN, strIntern);
            this.f7266 = true;
            AbstractC2661as.m5141().mo5150();
            C2866ih.m7090(this.f7265).m7098();
            this.f7258.m5306();
            this.f7261.m7144();
            this.f7260.m5045();
            C2849hr.m6917();
        } catch (Exception e) {
            C2914kb.m7429(m7559((char) ((ViewConfiguration.getScrollBarSize() >> 8) + 22597), 74 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 12 - ((Process.getThreadPriority(0) + 20) >> 6)).intern(), m7559((char) (17262 - ((byte) KeyEvent.getModifierMetaStateMask())), (ViewConfiguration.getTapTimeout() >> 16) + IronSourceError.ERROR_CODE_NO_ADS_TO_SHOW, Color.green(0) + 19).intern(), e, true, false, true);
        }
    }

    /* renamed from: ﻛ */
    public static /* synthetic */ boolean m7554(C2925r c2925r) {
        f7247 = (f7250 + 99) % 128;
        boolean zM7533 = c2925r.m7533();
        int i = f7250 + 1;
        f7247 = i % 128;
        if (i % 2 == 0) {
            return zM7533;
        }
        throw null;
    }

    /* renamed from: ｋ */
    public static /* synthetic */ C2881iw m7557(C2925r c2925r, C2881iw c2881iw) {
        int i = f7247 + 21;
        f7250 = i % 128;
        int i2 = i % 2;
        c2925r.f7261 = c2881iw;
        if (i2 != 0) {
            return c2881iw;
        }
        throw null;
    }

    /* renamed from: ﾇ */
    public static /* synthetic */ C2890je m7568(C2925r c2925r, C2890je c2890je) {
        int i = f7247 + 119;
        f7250 = i % 128;
        int i2 = i % 2;
        c2925r.f7254 = c2890je;
        if (i2 == 0) {
            int i3 = 96 / 0;
        }
        return c2890je;
    }

    /* renamed from: ﾒ */
    public static /* synthetic */ void m7575(C2925r c2925r, ISAdQualityLogLevel iSAdQualityLogLevel) {
        int i = f7250 + 123;
        f7247 = i % 128;
        int i2 = i % 2;
        c2925r.m7569(iSAdQualityLogLevel);
        if (i2 != 0) {
            throw null;
        }
    }

    /* renamed from: ﻛ */
    public static C2925r m7548() {
        synchronized (C2925r.class) {
            try {
                if (f7251 == null) {
                    f7251 = new C2925r();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f7251;
    }

    /* renamed from: ｋ */
    public static /* synthetic */ C2882ix m7558(C2925r c2925r, C2882ix c2882ix) {
        int i = f7250 + 39;
        f7247 = i % 128;
        int i2 = i % 2;
        c2925r.f7252 = c2882ix;
        if (i2 != 0) {
            int i3 = 13 / 0;
        }
        return c2882ix;
    }

    /* renamed from: ﾇ */
    public static /* synthetic */ void m7570(C2925r c2925r, ISAdQualityInitError iSAdQualityInitError, String str) {
        int i = f7250 + InterfaceC3173h3.d.b.f8821d;
        f7247 = i % 128;
        int i2 = i % 2;
        c2925r.m7574(iSAdQualityInitError, str);
        if (i2 != 0) {
            int i3 = 33 / 0;
        }
        f7247 = (f7250 + 7) % 128;
    }

    /* renamed from: ﾒ */
    public final synchronized boolean m7581() {
        boolean z;
        try {
            int i = f7250 + 37;
            int i2 = i % 128;
            f7247 = i2;
            if (i % 2 != 0) {
                z = this.f7263;
                int i3 = 81 / 0;
            } else {
                z = this.f7263;
            }
            f7250 = (i2 + 45) % 128;
        } catch (Throwable th) {
            throw th;
        }
        return z;
    }

    /* renamed from: ｋ */
    public static /* synthetic */ void m7563(C2925r c2925r) {
        int i = f7250 + 41;
        f7247 = i % 128;
        if (i % 2 != 0) {
            c2925r.m7545(false);
        } else {
            c2925r.m7545(true);
        }
        int i2 = f7247 + 119;
        f7250 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 69 / 0;
        }
    }

    /* renamed from: ﾇ */
    private synchronized void m7571(boolean z) {
        int i = f7250 + 15;
        f7247 = i % 128;
        if (i % 2 != 0) {
            this.f7264 = z;
            throw null;
        }
        this.f7264 = z;
    }

    /* renamed from: ﾒ */
    private synchronized void m7576(boolean z) {
        int i = f7250;
        this.f7268 = z;
        int i2 = i + 93;
        f7247 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ｋ */
    public static /* synthetic */ void m7564(C2925r c2925r, Context context) {
        f7250 = (f7247 + 89) % 128;
        c2925r.m7562(context);
        f7247 = (f7250 + 93) % 128;
    }

    /* renamed from: ﾒ */
    private void m7574(ISAdQualityInitError iSAdQualityInitError, String str) {
        f7250 = (f7247 + 93) % 128;
        m7551(this.f7253, iSAdQualityInitError, str);
        int i = f7250 + 87;
        f7247 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ﾇ */
    public final synchronized ISAdQualityLogLevel m7580() {
        int i = f7250 + 37;
        f7247 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
        return this.f7262;
    }

    /* renamed from: ｋ */
    public static /* synthetic */ void m7565(C2925r c2925r, boolean z) {
        int i = f7247 + 37;
        f7250 = i % 128;
        int i2 = i % 2;
        c2925r.m7571(z);
        if (i2 == 0) {
            throw null;
        }
        f7250 = (f7247 + InterfaceC3173h3.d.b.f8826i) % 128;
    }

    /* renamed from: ﾇ */
    private synchronized void m7569(ISAdQualityLogLevel iSAdQualityLogLevel) {
        int i = f7250;
        this.f7262 = iSAdQualityLogLevel;
        int i2 = i + 1;
        f7247 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ｋ */
    private void m7560(Activity activity, String str, ISAdQualityConfig iSAdQualityConfig) {
        f7247 = (f7250 + 51) % 128;
        m7561(activity.getApplication(), activity, str, iSAdQualityConfig);
        f7250 = (f7247 + 99) % 128;
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x013d, code lost:
    
        if (r4.isUserIdSet() != false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0144, code lost:
    
        if (r4.isUserIdSet() == false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0147, code lost:
    
        r10 = m7559((char) android.text.TextUtils.getOffsetBefore("", 0), (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 233, (android.view.ViewConfiguration.getTouchSlop() >> 8) + 60).intern();
        com.ironsource.adqualitysdk.sdk.p009i.C2921n.m7502(r0, r10);
        m7551(r4.getAdQualityInitListeners(), com.ironsource.adqualitysdk.sdk.ISAdQualityInitError.ILLEGAL_USER_ID, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0170, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0056 A[PHI: r0
  0x0056: PHI (r0v9 java.lang.String) = (r0v8 java.lang.String), (r0v17 java.lang.String) binds: [B:51:0x0054, B:48:0x0030] A[DONT_GENERATE, DONT_INLINE]] */
    /* renamed from: ｋ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m7561(android.app.Application r10, android.app.Activity r11, java.lang.String r12, @androidx.annotation.Nullable com.ironsource.adqualitysdk.sdk.ISAdQualityConfig r13) {
        /*
            Method dump skipped, instructions count: 461
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.p009i.C2925r.m7561(android.app.Application, android.app.Activity, java.lang.String, com.ironsource.adqualitysdk.sdk.ISAdQualityConfig):void");
    }

    /* renamed from: ﻛ */
    private void m7549(Application application, String str, ISAdQualityConfig iSAdQualityConfig) {
        f7247 = (f7250 + 81) % 128;
        m7561(application, null, str, iSAdQualityConfig);
        f7247 = (f7250 + 9) % 128;
    }

    /* renamed from: ﻛ */
    private synchronized void m7552(boolean z) {
        try {
            int i = f7250 + 89;
            f7247 = i % 128;
            if (i % 2 != 0) {
                this.f7267 = false;
            } else {
                this.f7267 = true;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: ﻛ */
    private void m7551(Set<ISAdQualityInitListener> set, ISAdQualityInitError iSAdQualityInitError, String str) {
        C2926s.m7596(new AbstractRunnableC2878it() { // from class: com.ironsource.adqualitysdk.sdk.i.r.6

            /* renamed from: ﻐ */
            private /* synthetic */ ISAdQualityInitError f7332;

            /* renamed from: ﾇ */
            private /* synthetic */ Set f7333;

            /* renamed from: ﾒ */
            private /* synthetic */ String f7334;

            public AnonymousClass6(Set set2, ISAdQualityInitError iSAdQualityInitError2, String str2) {
                set = set2;
                iSAdQualityInitError = iSAdQualityInitError2;
                str = str2;
            }

            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
            /* renamed from: ﾒ */
            public final void mo4950() {
                for (ISAdQualityInitListener iSAdQualityInitListener : set) {
                    if (iSAdQualityInitListener != null) {
                        iSAdQualityInitListener.adQualitySdkInitFailed(iSAdQualityInitError, str);
                    }
                }
                set.clear();
            }
        });
        int i = f7250 + 37;
        f7247 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ﻛ */
    private boolean m7553(ISAdQualityConfig iSAdQualityConfig) {
        String str;
        f7250 = (f7247 + 121) % 128;
        if (this.f7269 == null) {
            return true;
        }
        try {
            str = iSAdQualityConfig.getMetaData().get(m7559((char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 34201), Gravity.getAbsoluteGravity(0, 0) + 960, (ViewConfiguration.getPressedStateDuration() >> 16) + 13).intern());
        } catch (Throwable unused) {
        }
        if (!TextUtils.isEmpty(str)) {
            return new JSONObject(str).optBoolean(m7559((char) ExpandableListView.getPackedPositionGroup(0L), 1559 - TextUtils.indexOf((CharSequence) "", '0'), ExpandableListView.getPackedPositionType(0L) + 22).intern());
        }
        f7250 = (f7247 + InterfaceC3173h3.d.b.f8823f) % 128;
        return false;
    }

    /* renamed from: ﻐ */
    private boolean m7546(String str) {
        if (m7579()) {
            C2921n.m7502(m7559((char) (22598 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 75, 13 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))).intern(), m7559((char) (Process.myPid() >> 22), (ViewConfiguration.getTapTimeout() >> 16) + 549, 51 - ImageFormat.getBitsPerPixel(0)).intern());
            f7250 = (f7247 + 85) % 128;
            return false;
        }
        if (!m7528()) {
            C2921n.m7502(m7559((char) (22597 - (ViewConfiguration.getLongPressTimeout() >> 16)), KeyEvent.keyCodeFromString("") + 74, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 12).intern(), m7559((char) (MotionEvent.axisFromString("") + 52956), 602 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 65 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)).intern());
            int i = f7247 + 49;
            f7250 = i % 128;
            if (i % 2 != 0) {
                return false;
            }
            throw null;
        }
        if (!TextUtils.isEmpty(str)) {
            f7250 = (f7247 + 83) % 128;
            return true;
        }
        C2921n.m7502(m7559((char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 22597), 74 - TextUtils.getOffsetBefore("", 0), 12 - Color.red(0)).intern(), m7559((char) ((ViewConfiguration.getTapTimeout() >> 16) + 53780), 666 - (ViewConfiguration.getWindowTouchSlop() >> 8), (ViewConfiguration.getScrollBarSize() >> 8) + 34).intern());
        int i2 = f7250 + 33;
        f7247 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 30 / 0;
        }
        return false;
    }

    /* renamed from: ﻐ */
    private void m7543(Context context, String str, boolean z, boolean z2, boolean z3) {
        int i = f7250 + 17;
        f7247 = i % 128;
        if (i % 2 == 0) {
            String strM5114 = m7537().m5114();
            m7537().m5120(str);
            if (str == null) {
                C2921n.m7502(m7559((char) (TextUtils.lastIndexOf("", '0', 0) + 22598), TextUtils.getOffsetAfter("", 0) + 74, 11 - TextUtils.lastIndexOf("", '0', 0, 0)).intern(), m7559((char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 701 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 92 - Process.getGidForName("")).intern());
            } else if (!str.equals(m7559((char) TextUtils.getOffsetBefore("", 0), 792 - TextUtils.lastIndexOf("", '0'), (ViewConfiguration.getPressedStateDuration() >> 16) + 17).intern())) {
                String strIntern = m7559((char) (22596 - TextUtils.lastIndexOf("", '0')), 74 - Color.alpha(0), 11 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)).intern();
                StringBuilder sb = new StringBuilder();
                sb.append(m7559((char) (62092 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), 927 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 33 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))).intern());
                sb.append(str);
                C2921n.m7504(strIntern, sb.toString());
            } else {
                String strIntern2 = m7559((char) (22597 - TextUtils.getOffsetBefore("", 0)), 74 - Drawable.resolveOpacity(0, 0), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 12).intern();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(m7559((char) (ExpandableListView.getPackedPositionChild(0L) + 1), Color.rgb(0, 0, 0) + 16778026, TextUtils.getOffsetAfter("", 0) + 40).intern());
                sb2.append(str);
                sb2.append(m7559((char) View.MeasureSpec.getSize(0), 851 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 77 - TextUtils.getOffsetAfter("", 0)).intern());
                C2921n.m7502(strIntern2, sb2.toString());
            }
            AbstractC2661as.m5141().mo5169(new AnonymousClass3(z, context, z2, strM5114, z3));
            JSONObject jSONObjectM7539 = m7539();
            if (jSONObjectM7539 != null) {
                AbstractC2661as.m5141().mo5163(jSONObjectM7539);
                return;
            }
            AbstractC2661as.m5141().mo5168(context, m7537(), true);
            int i2 = f7250 + 23;
            f7247 = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            return;
        }
        m7537().m5114();
        m7537().m5120(str);
        throw null;
    }

    /* renamed from: ｋ */
    public final synchronized boolean m7579() {
        boolean z;
        int i = (f7250 + 55) % 128;
        f7247 = i;
        z = this.f7266;
        f7250 = (i + 49) % 128;
        return z;
    }

    /* renamed from: ｋ */
    private void m7562(Context context) {
        f7247 = (f7250 + 39) % 128;
        String strM7236 = this.f7254.m7236(m7559((char) (31752 - (ViewConfiguration.getJumpTapTimeout() >> 16)), View.MeasureSpec.getSize(0) + 973, KeyEvent.normalizeMetaState(0) + 10).intern());
        if (TextUtils.isEmpty(strM7236)) {
            return;
        }
        new C2890je(context, m7559((char) TextUtils.indexOf("", ""), (Process.myTid() >> 22) + 983, 25 - Color.red(0)).intern(), m7559((char) (25929 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 1007, 25 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))).intern()).m7242(m7559((char) (31752 - TextUtils.getOffsetAfter("", 0)), 973 - Gravity.getAbsoluteGravity(0, 0), 9 - Process.getGidForName("")).intern(), strM7236);
        this.f7254.m7241(m7559((char) (31752 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), (ViewConfiguration.getFadingEdgeLength() >> 16) + 973, 10 - TextUtils.getOffsetAfter("", 0)).intern());
        f7247 = (f7250 + 11) % 128;
    }

    /* renamed from: ﻐ */
    public final synchronized void m7578() {
        f7247 = (f7250 + InterfaceC3173h3.d.b.f8823f) % 128;
        if (!m7579()) {
            if (!m7528()) {
                this.f7263 = true;
                f7250 = (f7247 + 45) % 128;
                return;
            } else {
                f7250 = (f7247 + 121) % 128;
                C2921n.m7502(m7559((char) (22597 - KeyEvent.normalizeMetaState(0)), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 74, 12 - TextUtils.getTrimmedLength("")).intern(), m7559((char) View.MeasureSpec.makeMeasureSpec(0, 0), (ViewConfiguration.getEdgeSlop() >> 16) + 1092, Color.alpha(0) + 48).intern());
                return;
            }
        }
        C2921n.m7502(m7559((char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 22597), TextUtils.lastIndexOf("", '0') + 75, 12 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))).intern(), m7559((char) (58650 - AndroidCharacter.getMirror('0')), TextUtils.getOffsetBefore("", 0) + IronSourceError.ERROR_RV_INIT_FAILED_TIMEOUT, 60 - (ViewConfiguration.getEdgeSlop() >> 16)).intern());
    }

    /* renamed from: ｋ */
    private static String m7559(char c, int i, int i2) {
        String str;
        synchronized (C2642a.f4435) {
            try {
                char[] cArr = new char[i2];
                C2642a.f4436 = 0;
                while (true) {
                    int i3 = C2642a.f4436;
                    if (i3 < i2) {
                        cArr[i3] = (char) ((f7248[i + i3] ^ (i3 * f7249)) ^ c);
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

    /* renamed from: ﻐ */
    private void m7542(Context context) {
        try {
            context.registerReceiver(new BroadcastReceiver() { // from class: com.ironsource.adqualitysdk.sdk.i.r.1
                @Override // android.content.BroadcastReceiver
                public final void onReceive(Context context2, Intent intent) {
                    C2910jy.m7389(intent);
                }
            }, new IntentFilter(m7559((char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), Color.blue(0) + 1140, TextUtils.lastIndexOf("", '0', 0, 0) + 38).intern()), null, C2926s.m7590());
            f7247 = (f7250 + 109) % 128;
        } catch (Throwable th) {
            C2921n.m7521(m7559((char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 22597), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 74, (ViewConfiguration.getPressedStateDuration() >> 16) + 12).intern(), m7559((char) Color.blue(0), View.MeasureSpec.getSize(0) + 1177, 35 - (Process.myPid() >> 22)).intern(), th);
        }
    }
}
