package com.ironsource.adqualitysdk.sdk.p009i;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.WebView;
import android.widget.ExpandableListView;
import com.ironsource.InterfaceC3173h3;
import com.ironsource.adqualitysdk.sdk.p009i.C2671bb;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.z */
/* loaded from: classes2.dex */
public final class C2933z extends AbstractC2931x<View, Activity> {

    /* renamed from: ﭖ */
    private static int f7449 = 1;

    /* renamed from: ﮌ */
    private static int f7450 = 0;

    /* renamed from: ﮐ */
    private static int f7451 = 147;

    /* renamed from: ﻏ */
    private Class f7455;

    /* renamed from: ﻛ */
    private InterfaceC2877is f7457;

    /* renamed from: ﾇ */
    private InterfaceC2899jn f7459;

    /* renamed from: ﾒ */
    private View.OnLayoutChangeListener f7460;

    /* renamed from: ﻐ */
    private final Map<WebView, AbstractViewOnLayoutChangeListenerC2644ab> f7456 = new WeakHashMap();

    /* renamed from: ｋ */
    private final Map<View, C2933z> f7458 = new WeakHashMap();

    /* renamed from: ﱟ */
    private final Map<View, View.OnLayoutChangeListener> f7452 = new WeakHashMap();

    /* renamed from: ﺙ */
    private e f7454 = new e();

    /* renamed from: ﱡ */
    private final List<View> f7453 = new ArrayList();

    /* renamed from: com.ironsource.adqualitysdk.sdk.i.z$e */
    public class e {

        /* renamed from: 爫 */
        private static int f7472 = 0;

        /* renamed from: טּ */
        private static long f7473 = 4658657169456397189L;

        /* renamed from: סּ */
        private static int f7474 = 1;

        /* renamed from: ףּ */
        private static int f7475 = 92;

        /* renamed from: ﭴ */
        private boolean f7477;

        /* renamed from: ﮐ */
        private boolean f7481;

        /* renamed from: ﱟ */
        private boolean f7482;

        /* renamed from: ﱡ */
        private boolean f7483;

        /* renamed from: ﺙ */
        private boolean f7484;

        /* renamed from: ﻏ */
        private boolean f7485;

        /* renamed from: ﻐ */
        private boolean f7486;

        /* renamed from: ﻛ */
        private String f7487;

        /* renamed from: ｋ */
        private String f7488;

        /* renamed from: ﾇ */
        private String f7489;

        /* renamed from: ﾒ */
        private String f7490;

        /* renamed from: ﮌ */
        private List<Integer> f7480 = new ArrayList();

        /* renamed from: ﮉ */
        private List<String> f7479 = new ArrayList();

        /* renamed from: ﭖ */
        private List<String> f7476 = new ArrayList();

        /* renamed from: ﭸ */
        private List<String> f7478 = new ArrayList();

        public e() {
        }

        /* renamed from: ﭖ */
        public static /* synthetic */ boolean m7712(e eVar) {
            int i = f7472 + 71;
            f7474 = i % 128;
            int i2 = i % 2;
            boolean z = eVar.f7486;
            if (i2 != 0) {
                return z;
            }
            throw null;
        }

        /* renamed from: ﭴ */
        public static /* synthetic */ String m7713(e eVar) {
            int i = f7474 + 7;
            f7472 = i % 128;
            int i2 = i % 2;
            String str = eVar.f7488;
            if (i2 == 0) {
                return str;
            }
            throw null;
        }

        /* renamed from: ﭸ */
        public static /* synthetic */ boolean m7714(e eVar) {
            int i = (f7472 + 51) % 128;
            f7474 = i;
            boolean z = eVar.f7482;
            int i2 = i + 71;
            f7472 = i2 % 128;
            if (i2 % 2 == 0) {
                return z;
            }
            throw null;
        }

        /* renamed from: ﮉ */
        public static /* synthetic */ boolean m7715(e eVar) {
            int i = f7474;
            f7472 = (i + 13) % 128;
            boolean z = eVar.f7485;
            f7472 = (i + 41) % 128;
            return z;
        }

        /* renamed from: ﮌ */
        public static /* synthetic */ List m7716(e eVar) {
            int i = f7472;
            int i2 = i + 19;
            f7474 = i2 % 128;
            int i3 = i2 % 2;
            List<String> list = eVar.f7478;
            if (i3 == 0) {
                throw null;
            }
            f7474 = (i + 29) % 128;
            return list;
        }

        /* renamed from: ﮐ */
        public static /* synthetic */ String m7717(e eVar) {
            int i = f7474 + 119;
            f7472 = i % 128;
            int i2 = i % 2;
            String str = eVar.f7487;
            if (i2 != 0) {
                int i3 = 82 / 0;
            }
            return str;
        }

        /* renamed from: ﱟ */
        public static /* synthetic */ String m7718(e eVar) {
            int i = f7474 + 97;
            int i2 = i % 128;
            f7472 = i2;
            int i3 = i % 2;
            String str = eVar.f7490;
            if (i3 != 0) {
                throw null;
            }
            f7474 = (i2 + 15) % 128;
            return str;
        }

        /* renamed from: ﱡ */
        public static /* synthetic */ boolean m7719(e eVar) {
            int i = f7474;
            f7472 = (i + InterfaceC3173h3.d.b.f8819b) % 128;
            boolean z = eVar.f7483;
            f7472 = (i + InterfaceC3173h3.d.b.f8823f) % 128;
            return z;
        }

        /* renamed from: ﺙ */
        public static /* synthetic */ boolean m7721(e eVar) {
            int i = (f7472 + 39) % 128;
            f7474 = i;
            boolean z = eVar.f7481;
            f7472 = (i + 25) % 128;
            return z;
        }

        /* renamed from: ﻏ */
        public static /* synthetic */ boolean m7723(e eVar) {
            int i = f7472;
            int i2 = i + 75;
            f7474 = i2 % 128;
            int i3 = i2 % 2;
            boolean z = eVar.f7477;
            if (i3 == 0) {
                int i4 = 99 / 0;
            }
            f7474 = (i + 95) % 128;
            return z;
        }

        /* renamed from: ﻐ */
        public static /* synthetic */ List m7727(e eVar) {
            int i = (f7472 + 75) % 128;
            f7474 = i;
            List<String> list = eVar.f7479;
            int i2 = i + 23;
            f7472 = i2 % 128;
            if (i2 % 2 == 0) {
                return list;
            }
            throw null;
        }

        /* renamed from: ﻛ */
        public static /* synthetic */ String m7730(e eVar) {
            int i = f7474 + 113;
            f7472 = i % 128;
            int i2 = i % 2;
            String str = eVar.f7489;
            if (i2 == 0) {
                return str;
            }
            throw null;
        }

        /* renamed from: ｋ */
        public static /* synthetic */ boolean m7734(e eVar) {
            int i = (f7472 + 107) % 128;
            f7474 = i;
            boolean z = eVar.f7484;
            f7472 = (i + 99) % 128;
            return z;
        }

        /* renamed from: ﾇ */
        public static /* synthetic */ List m7738(e eVar) {
            int i = f7474;
            f7472 = (i + 41) % 128;
            List<String> list = eVar.f7476;
            f7472 = (i + InterfaceC3173h3.d.b.f8819b) % 128;
            return list;
        }

        /* renamed from: ﾒ */
        public static /* synthetic */ List m7743(e eVar) {
            int i = f7472;
            f7474 = (i + 79) % 128;
            List<Integer> list = eVar.f7480;
            f7474 = (i + 35) % 128;
            return list;
        }

        /* renamed from: ﺙ */
        private e m7720(boolean z) {
            int i = (f7472 + 45) % 128;
            f7474 = i;
            this.f7477 = z;
            int i2 = i + 7;
            f7472 = i2 % 128;
            if (i2 % 2 == 0) {
                return this;
            }
            throw null;
        }

        /* renamed from: ﻏ */
        private e m7722(boolean z) {
            int i = f7472 + 19;
            f7474 = i % 128;
            if (i % 2 != 0) {
                this.f7482 = z;
                return this;
            }
            this.f7482 = z;
            int i2 = 1 / 0;
            return this;
        }

        /* renamed from: ﻐ */
        private e m7724(String str) {
            int i = (f7474 + 53) % 128;
            f7472 = i;
            this.f7490 = str;
            int i2 = i + 115;
            f7474 = i2 % 128;
            if (i2 % 2 != 0) {
                return this;
            }
            throw null;
        }

        /* renamed from: ﻛ */
        private e m7729(boolean z) {
            int i = f7474 + 35;
            int i2 = i % 128;
            f7472 = i2;
            if (i % 2 != 0) {
                this.f7483 = z;
                throw null;
            }
            this.f7483 = z;
            f7474 = (i2 + InterfaceC3173h3.d.b.f8823f) % 128;
            return this;
        }

        /* renamed from: ｋ */
        private e m7731(String str) {
            int i = f7474;
            this.f7488 = str;
            f7472 = (i + 125) % 128;
            return this;
        }

        /* renamed from: ﾇ */
        private e m7735(String str) {
            int i = (f7474 + 107) % 128;
            f7472 = i;
            this.f7489 = str;
            f7474 = (i + 23) % 128;
            return this;
        }

        /* renamed from: ﾒ */
        private e m7739(String str) {
            int i = f7474 + 69;
            f7472 = i % 128;
            if (i % 2 == 0) {
                this.f7487 = str;
                return this;
            }
            this.f7487 = str;
            int i2 = 30 / 0;
            return this;
        }

        /* renamed from: ﻐ */
        private e m7725(boolean z) {
            int i = f7472 + 113;
            f7474 = i % 128;
            if (i % 2 != 0) {
                this.f7486 = z;
                return this;
            }
            this.f7486 = z;
            throw null;
        }

        /* renamed from: ｋ */
        private e m7733(boolean z) {
            int i = f7472;
            int i2 = i + InterfaceC3173h3.d.b.f8823f;
            f7474 = i2 % 128;
            if (i2 % 2 != 0) {
                this.f7484 = z;
                int i3 = i + 25;
                f7474 = i3 % 128;
                if (i3 % 2 != 0) {
                    return this;
                }
                throw null;
            }
            this.f7484 = z;
            throw null;
        }

        /* renamed from: ﾇ */
        private e m7737(boolean z) {
            int i = f7474 + 123;
            f7472 = i % 128;
            if (i % 2 != 0) {
                this.f7485 = z;
                int i2 = 44 / 0;
                return this;
            }
            this.f7485 = z;
            return this;
        }

        public e(JSONObject jSONObject) {
            m7735(jSONObject.optString(m7726("汗氶爵腿쥀若舦㸜讒鍰\udb41\ueb5d뀞굀\ued5d앫ꘊ뼲＿", 1 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)).intern()));
            m7724(jSONObject.optString(m7726("h\t⡼厝䂽㍛\uee19럡䆽䆒劯ⅿ\udc23羺撲\u0f6d쨱", 1 - View.combineMeasuredStates(0, 0)).intern()));
            m7739(jSONObject.optString(m7742("\b\u0004\uffff�\u000e\u0004\r￮\t￣", (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 194, 10 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), false, 5 - TextUtils.getOffsetAfter("", 0)).intern()));
            m7725(jSONObject.optBoolean(m7726("ៃា魽\ue08bⰒ츹零\udb7d볡\uf286㸵\udc2b쮎첧ࠌ\uf23a\udd96\uded9ᩕ聞", (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1).intern()));
            jSONObject.optBoolean(m7726("쑦쐓둯쾙휱\uf20d⨗⁞胕\udd94씃\ue01eᠼ\ue3ad\uf301츇น\uf1c2\ue171뱻籘蟎", 1 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)).intern());
            m7731(jSONObject.optString(m7726("\u0bfdஈꍙ\ud8ae롂ꛁ\ue59b伤퐞쪥꩜듔\ud7ad", TextUtils.getCapsMode("", 0, 0) + 1).intern()));
            m7729(jSONObject.optBoolean(m7742("\u0005\u0000\uffdd\u0001\u0012\u0005\u0010�￪\u000f", 240 - AndroidCharacter.getMirror('0'), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 9, true, 1 - View.resolveSize(0, 0)).intern()));
            m7741(jSONObject.optBoolean(m7742("\u0007\u0007￠\u0011\u0000\t\u000f\u000e\u0001\n\r\ufffe\u0000￮\u0000\t\uffffￜ", (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 192, 18 - (ViewConfiguration.getFadingEdgeLength() >> 16), false, View.combineMeasuredStates(0, 0) + 8).intern()));
            m7733(jSONObject.optBoolean(m7726("㹡㸓뛍촭鵞鷡퀇樷\uef1b\udf27轀迎\ue22c", -ImageFormat.getBitsPerPixel(0)).intern()));
            m7737(jSONObject.optBoolean(m7742("\n\u000b\t\ufffb￠\ufff7\f\ufff7\t\ufff9\b\uffff\u0006", 198 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 13 - View.MeasureSpec.makeMeasureSpec(0, 0), false, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1).intern(), true));
            m7722(jSONObject.optBoolean(m7742("\u000e\f￣\ufffa\u000b\r\u0011\uffde\ufffe\f", (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 194, Color.rgb(0, 0, 0) + 16777226, true, (ViewConfiguration.getFadingEdgeLength() >> 16) + 1).intern()));
            m7720(jSONObject.optBoolean(m7742("\f\n\ufffe\ufffb\uffff\f\u0002￮\b\u0003\ufffb\uffe7\b￩\r\u0011\uffff\u0003\ufff0\r\r\uffff�\t", 194 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 24 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), true, 2 - View.MeasureSpec.getMode(0)).intern(), true));
            m7732(C2915kc.m7443(jSONObject.optJSONArray(m7742("�\u0001\u000e\u000b￼￡\u000f", (ViewConfiguration.getTouchSlop() >> 8) + 196, 8 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), true, (ViewConfiguration.getJumpTapTimeout() >> 16) + 3).intern())));
            m7728(C2915kc.m7443(jSONObject.optJSONArray(m7726("梮棏謬\uf0ca담寣蛌䖊⤅\ue2dcꃠ䧏듣\udcf2雬柝ꋛ캊蒢ᖡ킌뢜", 1 - (Process.myPid() >> 22)).intern())));
            m7740(C2915kc.m7443(jSONObject.optJSONArray(m7726("瓫璝\ueb33郟雤伔验憋㷬苾蓺崆ꢤ볰닖猩뺲", (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))).intern())));
            m7736(C2915kc.m7443(jSONObject.optJSONArray(m7726("ꉇꈤꑬ\udf85삜칕䰠㟷벩춐튚\udc5e縀\uf38a\ue4a0\uf27b栋", 1 - (ViewConfiguration.getTouchSlop() >> 8)).intern())));
        }

        /* renamed from: ﾒ */
        private e m7741(boolean z) {
            int i = f7474 + 45;
            f7472 = i % 128;
            if (i % 2 != 0) {
                this.f7481 = z;
                int i2 = 14 / 0;
                return this;
            }
            this.f7481 = z;
            return this;
        }

        /* renamed from: ﻛ */
        private e m7728(List<String> list) {
            if (list != null) {
                int i = f7474 + 73;
                f7472 = i % 128;
                if (i % 2 != 0) {
                    this.f7479 = list;
                    throw null;
                }
                this.f7479 = list;
            }
            int i2 = f7472 + 1;
            f7474 = i2 % 128;
            if (i2 % 2 != 0) {
                return this;
            }
            throw null;
        }

        /* renamed from: ﻐ */
        private static String m7726(String str, int i) {
            String str2;
            char[] charArray = str;
            if (str != null) {
                charArray = str.toCharArray();
            }
            char[] cArr = charArray;
            synchronized (C2777f.f6322) {
                try {
                    char[] cArrM6790 = C2777f.m6790(f7473, cArr, i);
                    C2777f.f6321 = 4;
                    while (true) {
                        int i2 = C2777f.f6321;
                        if (i2 < cArrM6790.length) {
                            C2777f.f6320 = i2 - 4;
                            cArrM6790[i2] = (char) ((cArrM6790[i2] ^ cArrM6790[i2 % 4]) ^ (r2 * f7473));
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
        private e m7736(List<String> list) {
            if (list != null) {
                int i = f7472 + 67;
                f7474 = i % 128;
                if (i % 2 == 0) {
                    this.f7478 = list;
                    int i2 = 9 / 0;
                } else {
                    this.f7478 = list;
                }
            }
            int i3 = f7474 + 33;
            f7472 = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 65 / 0;
            }
            return this;
        }

        /* renamed from: ｋ */
        private e m7732(List<Integer> list) {
            int i = f7472;
            f7474 = (i + 7) % 128;
            if (list != null) {
                this.f7480 = list;
            }
            int i2 = i + 97;
            f7474 = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 89 / 0;
            }
            return this;
        }

        /* renamed from: ﾒ */
        private e m7740(List<String> list) {
            int i = f7472 + 85;
            int i2 = i % 128;
            f7474 = i2;
            if (i % 2 == 0) {
                throw null;
            }
            if (list != null) {
                this.f7476 = list;
            }
            f7472 = (i2 + InterfaceC3173h3.d.b.f8823f) % 128;
            return this;
        }

        /* renamed from: ﾒ */
        private static String m7742(String str, int i, int i2, boolean z, int i3) {
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
                        cArr2[C2669b.f5040] = (char) (C2669b.f5038 + i);
                        int i5 = C2669b.f5040;
                        cArr2[i5] = (char) (cArr2[i5] - f7475);
                        C2669b.f5040 = i5 + 1;
                    }
                    if (i3 > 0) {
                        C2669b.f5041 = i3;
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
    }

    public C2933z(JSONObject jSONObject, InterfaceC2877is interfaceC2877is) {
        m7708(jSONObject, interfaceC2877is);
        m7692();
    }

    /* renamed from: ﻐ */
    public static /* synthetic */ e m7691(C2933z c2933z) {
        int i = f7450 + 47;
        f7449 = i % 128;
        int i2 = i % 2;
        e eVar = c2933z.f7454;
        if (i2 != 0) {
            return eVar;
        }
        throw null;
    }

    /* renamed from: ﻛ */
    public static /* synthetic */ Class m7695(C2933z c2933z) {
        int i = f7449 + 43;
        f7450 = i % 128;
        int i2 = i % 2;
        Class cls = c2933z.f7455;
        if (i2 != 0) {
            int i3 = 6 / 0;
        }
        return cls;
    }

    /* renamed from: ﾇ */
    public static /* synthetic */ View.OnLayoutChangeListener m7700(C2933z c2933z) {
        int i = f7450;
        f7449 = (i + 99) % 128;
        View.OnLayoutChangeListener onLayoutChangeListener = c2933z.f7460;
        f7449 = (i + 67) % 128;
        return onLayoutChangeListener;
    }

    /* renamed from: ﾒ */
    public static /* synthetic */ List m7706(C2933z c2933z) {
        int i = f7450;
        int i2 = i + 91;
        f7449 = i2 % 128;
        int i3 = i2 % 2;
        List<View> list = c2933z.f7453;
        if (i3 == 0) {
            throw null;
        }
        int i4 = i + 59;
        f7449 = i4 % 128;
        if (i4 % 2 != 0) {
            return list;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2931x
    /* renamed from: ｋ */
    public final /* synthetic */ String mo4935(Activity activity) {
        f7449 = (f7450 + 5) % 128;
        String strM7705 = m7705();
        f7449 = (f7450 + 41) % 128;
        return strM7705;
    }

    /* renamed from: ﻛ */
    private void m7696(List<View> list) throws JSONException {
        int i = (f7450 + 19) % 128;
        f7449 = i;
        f7450 = (i + 81) % 128;
        int i2 = 0;
        while (i2 < list.size()) {
            int i3 = f7450 + 89;
            f7449 = i3 % 128;
            if (i3 % 2 == 0) {
                m7693(list.get(i2), this.f7454);
                i2 += 78;
            } else {
                m7693(list.get(i2), this.f7454);
                i2++;
            }
        }
        int i4 = f7449 + 125;
        f7450 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ｋ */
    public static /* synthetic */ Map m7697(C2933z c2933z) {
        int i = f7449;
        f7450 = (i + InterfaceC3173h3.d.b.f8821d) % 128;
        Map<View, View.OnLayoutChangeListener> map = c2933z.f7452;
        int i2 = i + 59;
        f7450 = i2 % 128;
        if (i2 % 2 == 0) {
            return map;
        }
        throw null;
    }

    /* renamed from: ﾒ */
    private static String m7705() {
        int i = f7449 + 27;
        f7450 = i % 128;
        if (i % 2 == 0) {
            return null;
        }
        throw null;
    }

    /* renamed from: ﻐ */
    public final void m7708(JSONObject jSONObject, InterfaceC2877is interfaceC2877is) {
        this.f7454 = new e(jSONObject);
        this.f7457 = interfaceC2877is;
        int i = f7450 + 95;
        f7449 = i % 128;
        if (i % 2 == 0) {
            int i2 = 28 / 0;
        }
    }

    /* renamed from: ﾇ */
    public final void m7710(final View view) {
        Activity activityM7473;
        try {
            if (this.f7455 == null) {
                this.f7455 = Class.forName(e.m7730(this.f7454));
            }
            final Activity activityMo7274 = AbstractC2894ji.m7268().mo7274();
            if (activityMo7274 == null) {
                return;
            }
            if (!e.m7727(this.f7454).isEmpty() && (activityM7473 = C2917ke.m7473(view)) != null) {
                int i = f7449 + 33;
                f7450 = i % 128;
                if (i % 2 != 0) {
                    e.m7727(this.f7454).contains(activityM7473.getClass().getName());
                    throw null;
                }
                if (e.m7727(this.f7454).contains(activityM7473.getClass().getName())) {
                    return;
                }
            }
            C2926s.m7600(new AbstractRunnableC2878it() { // from class: com.ironsource.adqualitysdk.sdk.i.z.2
                @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
                /* renamed from: ﾒ */
                public final void mo4950() throws JSONException {
                    C2933z.m7706(C2933z.this).clear();
                    C2933z.m7698(activityMo7274, view, C2933z.m7695(C2933z.this), e.m7734(C2933z.m7691(C2933z.this)), e.m7743(C2933z.m7691(C2933z.this)), e.m7738(C2933z.m7691(C2933z.this)), C2933z.m7706(C2933z.this));
                    if (C2917ke.m7472(view, C2933z.m7695(C2933z.this), null, e.m7743(C2933z.m7691(C2933z.this)), e.m7738(C2933z.m7691(C2933z.this)))) {
                        C2933z.m7706(C2933z.this).add(view);
                    }
                    final ArrayList arrayList = new ArrayList(C2933z.m7706(C2933z.this));
                    if (e.m7723(C2933z.m7691(C2933z.this))) {
                        C2926s.m7598(new AbstractRunnableC2878it() { // from class: com.ironsource.adqualitysdk.sdk.i.z.2.3
                            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
                            /* renamed from: ﾒ */
                            public final void mo4950() throws JSONException {
                                C2933z.m7699(C2933z.this, arrayList);
                            }
                        });
                    } else {
                        C2933z.m7699(C2933z.this, arrayList);
                    }
                }
            });
            f7450 = (f7449 + 87) % 128;
        } catch (Throwable th) {
            String strIntern = m7703("\u0002\u000f\ufff3\u0006\u0002\u0014\uffde\u0001\u0010￥\ufffe\u000b\u0001\t", AndroidCharacter.getMirror('0') + 198, 14 - KeyEvent.normalizeMetaState(0), false, 2 - Color.blue(0)).intern();
            StringBuilder sb = new StringBuilder();
            sb.append(m7703("\uffc1\b\u0006\u0015\u0015\n\u000f\b\uffc1\u0004\r\u0002\u0014\u0014\uffc1￦\u0013\u0013\u0010\u0013", 242 - Color.alpha(0), Gravity.getAbsoluteGravity(0, 0) + 20, false, 16 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))).intern());
            sb.append(e.m7730(this.f7454));
            sb.append(m7703("￼￼\t", (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 183, 3 - (ViewConfiguration.getDoubleTapTimeout() >> 16), false, KeyEvent.keyCodeFromString("") + 1).intern());
            sb.append(th.getLocalizedMessage());
            C2921n.m7509(strIntern, sb.toString());
        }
    }

    /* renamed from: ｋ */
    public static /* synthetic */ void m7698(Activity activity, View view, Class cls, boolean z, List list, List list2, List list3) {
        f7450 = (f7449 + 45) % 128;
        m7704(activity, view, cls, z, list, list2, list3);
        int i = f7450 + 35;
        f7449 = i % 128;
        if (i % 2 == 0) {
            int i2 = 55 / 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0015  */
    /* renamed from: ﾒ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean m7707(android.view.View r4, java.util.List<java.lang.String> r5) {
        /*
            int r0 = com.ironsource.adqualitysdk.sdk.p009i.C2933z.f7449
            r1 = 1
            int r0 = r0 + r1
            int r2 = r0 % 128
            com.ironsource.adqualitysdk.sdk.p009i.C2933z.f7450 = r2
            int r0 = r0 % 2
            r2 = 0
            if (r0 == 0) goto L13
            r0 = 34
            int r0 = r0 / r2
            if (r5 == 0) goto L75
            goto L15
        L13:
            if (r5 == 0) goto L75
        L15:
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L75
            int r0 = com.ironsource.adqualitysdk.sdk.p009i.C2933z.f7450
            int r0 = r0 + 55
            int r3 = r0 % 128
            com.ironsource.adqualitysdk.sdk.p009i.C2933z.f7449 = r3
            int r0 = r0 % 2
            if (r0 == 0) goto L65
            java.lang.Class r4 = r4.getClass()
            java.lang.Package r4 = r4.getPackage()
            java.lang.String r4 = r4.getName()
            java.util.Iterator r5 = r5.iterator()
        L37:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L64
            int r0 = com.ironsource.adqualitysdk.sdk.p009i.C2933z.f7449
            int r0 = r0 + 29
            int r0 = r0 % 128
            com.ironsource.adqualitysdk.sdk.p009i.C2933z.f7450 = r0
            java.lang.Object r0 = r5.next()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = m7702(r0)
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            if (r3 != 0) goto L37
            boolean r0 = r4.startsWith(r0)
            if (r0 == 0) goto L37
            int r4 = com.ironsource.adqualitysdk.sdk.p009i.C2933z.f7449
            int r4 = r4 + 91
            int r4 = r4 % 128
            com.ironsource.adqualitysdk.sdk.p009i.C2933z.f7450 = r4
            return r1
        L64:
            return r2
        L65:
            java.lang.Class r4 = r4.getClass()
            java.lang.Package r4 = r4.getPackage()
            r4.getName()
            r5.iterator()
            r4 = 0
            throw r4
        L75:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.p009i.C2933z.m7707(android.view.View, java.util.List):boolean");
    }

    /* renamed from: ﻐ */
    private void m7692() {
        this.f7460 = new View.OnLayoutChangeListener() { // from class: com.ironsource.adqualitysdk.sdk.i.z.3

            /* renamed from: ﻛ */
            private static long f7467 = -6175835902017714688L;

            /* renamed from: ﾇ */
            private static int f7468 = 1;

            /* renamed from: ﾒ */
            private static int f7469;

            /* renamed from: ﾇ */
            private static String m7711(String str, int i) {
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
                                cArr2[i2] = (char) ((cArr[i2] ^ (C2804g.f6423 * i2)) ^ f7467);
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

            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                int i9 = f7468 + 53;
                f7469 = i9 % 128;
                try {
                    if (i9 % 2 != 0) {
                        C2933z.this.m7710(view);
                        throw null;
                    }
                    C2933z.this.m7710(view);
                    int i10 = f7469 + 117;
                    f7468 = i10 % 128;
                    if (i10 % 2 == 0) {
                        int i11 = 40 / 0;
                    }
                } catch (Throwable th) {
                    C2914kb.m7426(m7711("䙖斴ǟⷠ줵\uf535酝뵃墉ҫ\u20c6찓\ue839鑋", 9182 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))).intern(), m7711("䙅ࠡ\udad4겖缾솿鎛戫㒸蚄䥐ᯝ\ued85뱎\u0ee5킨ꍄ痀잾陈堒⪨﵇", (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 20051).intern(), th, false);
                }
            }
        };
        this.f7459 = new InterfaceC2899jn() { // from class: com.ironsource.adqualitysdk.sdk.i.z.5
            @Override // com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2899jn
            /* renamed from: ﻐ */
            public final void mo4903(View view) {
                view.removeOnLayoutChangeListener(C2933z.m7700(C2933z.this));
                C2933z.m7697(C2933z.this).remove(view);
            }

            @Override // com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2899jn
            /* renamed from: ﻛ */
            public final void mo4905(View view) {
                view.addOnLayoutChangeListener(C2933z.m7700(C2933z.this));
                C2933z.m7697(C2933z.this).put(view, C2933z.m7700(C2933z.this));
            }
        };
        C2895jj.m7281().m7287(this.f7459);
        int i = f7449 + InterfaceC3173h3.d.b.f8819b;
        f7450 = i % 128;
        if (i % 2 != 0) {
            int i2 = 89 / 0;
        }
    }

    /* renamed from: ｋ */
    public static /* synthetic */ void m7699(C2933z c2933z, List list) throws JSONException {
        int i = f7449 + 99;
        f7450 = i % 128;
        int i2 = i % 2;
        c2933z.m7696((List<View>) list);
        if (i2 != 0) {
            throw null;
        }
    }

    /* renamed from: ｋ */
    public final void m7709() {
        m7677((InterfaceC2923p) null);
        C2895jj.m7281().m7288(this.f7459);
        HashSet hashSet = new HashSet(this.f7452.keySet());
        this.f7452.clear();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            f7449 = (f7450 + 33) % 128;
            ((View) it.next()).removeOnLayoutChangeListener(this.f7460);
            f7449 = (f7450 + 29) % 128;
        }
    }

    /* renamed from: ﻐ */
    private void m7693(View view, e eVar) throws JSONException {
        List<String> listAsList;
        if (m7694(view)) {
            if (e.m7719(eVar)) {
                f7450 = (f7449 + 117) % 128;
                if (this.f7458.get(view) == null) {
                    this.f7458.put(view, this);
                    mo4939(new JSONObject(), view, null);
                    return;
                } else {
                    if (e.m7721(eVar)) {
                        mo4939(new JSONObject(), view, null);
                        f7450 = (f7449 + 95) % 128;
                        return;
                    }
                    return;
                }
            }
            ArrayList arrayList = new ArrayList();
            C2917ke.m7465(view, WebView.class, false, e.m7734(eVar), e.m7743(eVar), e.m7738(eVar), arrayList);
            if (view instanceof WebView) {
                f7450 = (f7449 + 43) % 128;
                arrayList.add((WebView) view);
                f7449 = (f7450 + 9) % 128;
            }
            Iterator it = arrayList.iterator();
            while (!(!it.hasNext())) {
                WebView webView = (WebView) it.next();
                if (this.f7458.get(webView) == null && webView.getClass().getName().startsWith(e.m7718(eVar))) {
                    C2645ac c2645ac = new C2645ac();
                    this.f7456.put(webView, c2645ac);
                    String strM7717 = e.m7717(eVar);
                    if (TextUtils.isEmpty(e.m7713(eVar))) {
                        f7450 = (f7449 + 121) % 128;
                        listAsList = null;
                    } else {
                        listAsList = Arrays.asList(e.m7713(eVar).split(m7703(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR, Drawable.resolveOpacity(0, 0) + 191, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1, true, -(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))).intern()));
                    }
                    c2645ac.m4937(strM7717, listAsList, e.m7715(eVar), e.m7712(eVar), e.m7714(eVar));
                    c2645ac.m7677(m7701());
                    c2645ac.m4936(webView);
                    c2645ac.m4940(Integer.toHexString(webView.hashCode()));
                    this.f7458.put(webView, this);
                }
            }
        }
    }

    /* renamed from: ﾇ */
    private static <E extends View> void m7704(Activity activity, View view, Class<E> cls, boolean z, List<Integer> list, List<String> list2, List<E> list3) {
        int i = f7450 + 93;
        int i2 = i % 128;
        f7449 = i2;
        if (i % 2 == 0) {
            throw null;
        }
        if (view != null) {
            f7450 = (i2 + 71) % 128;
            C2917ke.m7465(view, cls, false, z, list, list2, list3);
        } else {
            C2917ke.m7474(activity, cls, z, list, list2, list3);
            f7450 = (f7449 + 7) % 128;
        }
    }

    /* renamed from: ﾇ */
    private InterfaceC2923p<WebView, Activity> m7701() {
        C2671bb.e eVar = new C2671bb.e() { // from class: com.ironsource.adqualitysdk.sdk.i.z.1
            @Override // com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2923p
            /* renamed from: ﻐ */
            public final /* bridge */ /* synthetic */ void mo4932(JSONObject jSONObject, Object obj, Object obj2) throws JSONException {
                C2933z.this.mo4932(jSONObject, (WebView) obj, (Activity) obj2);
            }

            @Override // com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2923p
            /* renamed from: ﻛ */
            public final /* bridge */ /* synthetic */ void mo6307(JSONObject jSONObject, Object obj, Object obj2) throws JSONException {
                C2933z.this.mo6307(jSONObject, (WebView) obj, (Activity) obj2);
            }

            @Override // com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2923p
            /* renamed from: ｋ */
            public final /* bridge */ /* synthetic */ void mo4939(JSONObject jSONObject, Object obj, Object obj2) throws JSONException {
                C2933z.this.mo4939(jSONObject, (WebView) obj, (Activity) obj2);
            }

            @Override // com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2923p
            /* renamed from: ﾇ */
            public final /* bridge */ /* synthetic */ void mo6312(JSONObject jSONObject, Object obj, Object obj2) throws JSONException {
                C2933z.this.mo6312(jSONObject, (WebView) obj, (Activity) obj2);
            }

            @Override // com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2923p
            /* renamed from: ﾒ */
            public final /* bridge */ /* synthetic */ void mo6316(JSONObject jSONObject, Object obj, Object obj2) throws JSONException {
                C2933z.this.mo6316(jSONObject, (WebView) obj, (Activity) obj2);
            }

            @Override // com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2923p
            /* renamed from: ｋ */
            public final /* bridge */ /* synthetic */ void mo6309(JSONObject jSONObject, Object obj, Object obj2, Object obj3) throws JSONException {
                C2933z.this.mo6309(jSONObject, (WebView) obj, obj2, (Activity) obj3);
            }

            @Override // com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2923p
            /* renamed from: ﾇ */
            public final /* bridge */ /* synthetic */ void mo6313(JSONObject jSONObject, Object obj, Object obj2, Object obj3) throws JSONException {
                C2933z.this.mo6313(jSONObject, (WebView) obj, obj2, (Activity) obj3);
            }

            @Override // com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2923p
            /* renamed from: ﾒ */
            public final /* bridge */ /* synthetic */ void mo6317(JSONObject jSONObject, Object obj, Object obj2, Object obj3) throws JSONException {
                C2933z.this.mo6317(jSONObject, (WebView) obj, obj2, (Activity) obj3);
            }
        };
        f7449 = (f7450 + 21) % 128;
        return eVar;
    }

    /* renamed from: ﾇ */
    private static String m7702(String str) {
        f7450 = (f7449 + 107) % 128;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        f7449 = (f7450 + 91) % 128;
        List listAsList = Arrays.asList(str.split(m7703("\u0011\u000f￢", 223 - (Process.myPid() >> 22), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 3, false, 1 - (ViewConfiguration.getKeyRepeatDelay() >> 16)).intern()));
        if (listAsList.size() <= 3) {
            f7450 = (f7449 + 117) % 128;
            return str;
        }
        return TextUtils.join(m7703(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 193, 1 - View.MeasureSpec.makeMeasureSpec(0, 0), true, ExpandableListView.getPackedPositionGroup(0L) + 1).intern(), listAsList.subList(0, 3));
    }

    /* renamed from: ﾇ */
    private static String m7703(String str, int i, int i2, boolean z, int i3) {
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
                    cArr2[C2669b.f5040] = (char) (C2669b.f5038 + i);
                    int i5 = C2669b.f5040;
                    cArr2[i5] = (char) (cArr2[i5] - f7451);
                    C2669b.f5040 = i5 + 1;
                }
                if (i3 > 0) {
                    C2669b.f5041 = i3;
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

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0020, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002b, code lost:
    
        if (m7707(r6, (java.util.List<java.lang.String>) com.ironsource.adqualitysdk.sdk.p009i.C2933z.e.m7716(r5.f7454)) == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0033, code lost:
    
        if (r5.f7457.mo6342(r6) == true) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0036, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0037, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r5.f7457 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        if (r5.f7457 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001a, code lost:
    
        com.ironsource.adqualitysdk.sdk.p009i.C2933z.f7449 = (r0 + 63) % 128;
     */
    /* renamed from: ﻐ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean m7694(android.view.View r6) {
        /*
            r5 = this;
            int r0 = com.ironsource.adqualitysdk.sdk.p009i.C2933z.f7450
            int r1 = r0 + 3
            int r2 = r1 % 128
            com.ironsource.adqualitysdk.sdk.p009i.C2933z.f7449 = r2
            int r1 = r1 % 2
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L16
            com.ironsource.adqualitysdk.sdk.i.is r1 = r5.f7457
            r4 = 14
            int r4 = r4 / r2
            if (r1 != 0) goto L21
            goto L1a
        L16:
            com.ironsource.adqualitysdk.sdk.i.is r1 = r5.f7457
            if (r1 != 0) goto L21
        L1a:
            int r0 = r0 + 63
            int r0 = r0 % 128
            com.ironsource.adqualitysdk.sdk.p009i.C2933z.f7449 = r0
            return r3
        L21:
            com.ironsource.adqualitysdk.sdk.i.z$e r0 = r5.f7454
            java.util.List r0 = com.ironsource.adqualitysdk.sdk.p009i.C2933z.e.m7716(r0)
            boolean r0 = m7707(r6, r0)
            if (r0 == 0) goto L37
            com.ironsource.adqualitysdk.sdk.i.is r0 = r5.f7457
            boolean r6 = r0.mo6342(r6)
            if (r6 == r3) goto L36
            goto L37
        L36:
            return r3
        L37:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.p009i.C2933z.m7694(android.view.View):boolean");
    }
}
