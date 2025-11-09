package com.ironsource.adqualitysdk.sdk.p009i;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.ironsource.adqualitysdk.sdk.p009i.C2915kc;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.dj */
/* loaded from: classes2.dex */
public final class C2733dj {

    /* renamed from: 爫 */
    private static char f6036 = 35261;

    /* renamed from: ﬤ */
    private static int f6037 = 0;

    /* renamed from: ףּ */
    private static int f6038 = 1;

    /* renamed from: ﭴ */
    private static long f6039 = 4868865621034081255L;

    /* renamed from: ﭸ */
    private static char f6040 = 29488;

    /* renamed from: ﮉ */
    private static char f6041 = 61763;

    /* renamed from: ﮌ */
    private static char f6042 = 17599;

    /* renamed from: ﭖ */
    private Map<String, C2739dp> f6043;

    /* renamed from: ﮐ */
    private String f6044;

    /* renamed from: ﱟ */
    private String f6045;

    /* renamed from: ﱡ */
    private String f6046;

    /* renamed from: ﺙ */
    private C2741dr f6047;

    /* renamed from: ﻏ */
    private C2735dl f6048;

    /* renamed from: ﻐ */
    private String f6049;

    /* renamed from: ﻛ */
    private C2741dr f6050;

    /* renamed from: ｋ */
    private String f6051;

    /* renamed from: ﾇ */
    private String f6052;

    /* renamed from: ﾒ */
    private JSONObject f6053;

    /* renamed from: com.ironsource.adqualitysdk.sdk.i.dj$1 */
    public class AnonymousClass1 implements C2915kc.c<Object> {

        /* renamed from: ﻐ */
        private static int f6054 = 1;

        /* renamed from: ｋ */
        private static int f6055 = 0;

        /* renamed from: ﾇ */
        private static int f6056 = 125;

        public AnonymousClass1() {
        }

        /* renamed from: ｋ */
        private static String m6600(int i, int i2, int i3, String str, boolean z) {
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
                        cArr2[i5] = (char) (cArr2[i5] - f6056);
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

        @Override // com.ironsource.adqualitysdk.sdk.p009i.C2915kc.c
        /* renamed from: ﻛ */
        public final Object mo5208(JSONObject jSONObject, String str) {
            f6055 = (f6054 + 39) % 128;
            try {
                String strOptString = jSONObject.optString(str);
                if (jSONObject.opt(str) instanceof String) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(m6600(Color.argb(0, 0, 0, 0) + 1, 1 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 159 - View.resolveSize(0, 0), WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR, true).intern());
                    sb.append(strOptString);
                    sb.append(m6600((Process.myTid() >> 22) + 1, 1 - (ViewConfiguration.getTapTimeout() >> 16), (ViewConfiguration.getWindowTouchSlop() >> 8) + 159, WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR, true).intern());
                    strOptString = sb.toString();
                    f6055 = (f6054 + 59) % 128;
                }
                String strM6590 = C2733dj.m6590(C2733dj.this);
                return new C2742ds(strM6590, strOptString).m6702(C2740dq.m6648(strM6590, strOptString, strOptString));
            } catch (Throwable th) {
                String strM65902 = C2733dj.m6590(C2733dj.this);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(m6600((ViewConfiguration.getPressedStateDuration() >> 16) + 3, 13 - ExpandableListView.getPackedPositionChild(0L), 219 - TextUtils.lastIndexOf("", '0', 0), "\u0013\u0013￦\uffc1\b\u000f\n\u0014\u0013\u0002\u0011\uffc1\u0013\u0010", true).intern());
                sb2.append(str);
                sb2.append(m6600(7 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 9 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 208 - TextUtils.lastIndexOf("", '0', 0, 0), " \u001f\u001a\u001b\u000fￌￌ￦", true).intern());
                sb2.append(jSONObject.optString(str));
                C2713cq.m6350(strM65902, sb2.toString(), th);
                return null;
            }
        }
    }

    /* renamed from: com.ironsource.adqualitysdk.sdk.i.dj$2 */
    public class AnonymousClass2 implements Comparator<String> {
        @Override // java.util.Comparator
        public final /* synthetic */ int compare(String str, String str2) {
            return C2916kd.m7455(str, str2);
        }
    }

    /* renamed from: com.ironsource.adqualitysdk.sdk.i.dj$3 */
    public class AnonymousClass3 implements C2915kc.b<String> {
        @Override // com.ironsource.adqualitysdk.sdk.p009i.C2915kc.b
        /* renamed from: ｋ */
        public final /* synthetic */ String mo5209(JSONArray jSONArray, int i) {
            return C2746dw.m6725(jSONArray.optString(i));
        }
    }

    /* renamed from: com.ironsource.adqualitysdk.sdk.i.dj$5 */
    public class AnonymousClass5 implements C2915kc.c<C2739dp> {
        public AnonymousClass5() {
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.C2915kc.c
        /* renamed from: ﻛ */
        public final /* synthetic */ C2739dp mo5208(JSONObject jSONObject, String str) {
            return new C2739dp(C2733dj.m6590(C2733dj.this), str, jSONObject.optJSONObject(str));
        }
    }

    public C2733dj(String str, C2741dr c2741dr) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f6053 = jSONObject;
            this.f6050 = c2741dr;
            this.f6049 = jSONObject.optString(m6587("ᮉ\udf1b銰噕", 50332 - TextUtils.lastIndexOf("", '0', 0, 0)).intern());
            this.f6052 = this.f6053.optString(m6589("䠺➠㎌觖\uf76eင嚽氺\uf60e鯫\uec7f㽬", Drawable.resolveOpacity(0, 0) + 11).intern());
            this.f6051 = this.f6053.optString(m6587("ᮑ舗⢿휫線\ue461苷", 39318 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))).intern());
            this.f6044 = this.f6053.optString(m6587("ᮊ읉ꈇ跡梟呯", TextUtils.indexOf((CharSequence) "", '0', 0) + 56520).intern());
            this.f6046 = this.f6053.optString(m6589("◥缮ᯣᡔ䣫\ud91e", (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 6).intern());
            if (this.f6053.has(m6589("鈉詷啊ໃ삯벍컰삾빉졗踿禸", 12 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))).intern())) {
                m6588(this.f6053.optJSONObject(m6589("鈉詷啊ໃ삯벍컰삾빉졗踿禸", (ViewConfiguration.getDoubleTapTimeout() >> 16) + 12).intern()));
            }
        } catch (Throwable th) {
            C2713cq.m6350(this.f6049, m6589("㛽톻\ued5a畨⧲缠ᄌ뎂六\ue78f䠮껝\ueb57指ዘ㿒꾁꜅曲땴醺捨Ԕ넣ዘ㿒꾁꜅紙ట\udac3̜", (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 31).intern(), th);
        }
    }

    /* renamed from: ﻛ */
    private void m6588(JSONObject jSONObject) {
        f6038 = (f6037 + 47) % 128;
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            this.f6050.m6655(next, jSONObject.opt(next));
            f6038 = (f6037 + 53) % 128;
        }
    }

    /* renamed from: ﾇ */
    public static /* synthetic */ String m6590(C2733dj c2733dj) {
        int i = f6038;
        int i2 = i + 1;
        f6037 = i2 % 128;
        int i3 = i2 % 2;
        String str = c2733dj.f6049;
        if (i3 != 0) {
            throw null;
        }
        f6037 = (i + 51) % 128;
        return str;
    }

    /* renamed from: ﮐ */
    public final Map<String, C2739dp> m6591() {
        f6037 = (f6038 + 67) % 128;
        if (this.f6043 == null) {
            this.f6043 = C2915kc.m7439(this.f6053.optJSONObject(m6589("´푔㤩䒿삲슏厐\ud8e9\uf612藇", 9 - View.getDefaultSize(0, 0)).intern()), new C2915kc.c<C2739dp>() { // from class: com.ironsource.adqualitysdk.sdk.i.dj.5
                public AnonymousClass5() {
                }

                @Override // com.ironsource.adqualitysdk.sdk.p009i.C2915kc.c
                /* renamed from: ﻛ */
                public final /* synthetic */ C2739dp mo5208(JSONObject jSONObject, String str) {
                    return new C2739dp(C2733dj.m6590(C2733dj.this), str, jSONObject.optJSONObject(str));
                }
            });
            f6038 = (f6037 + 69) % 128;
        }
        Map<String, C2739dp> map = this.f6043;
        int i = f6038 + 57;
        f6037 = i % 128;
        if (i % 2 == 0) {
            return map;
        }
        throw null;
    }

    /* renamed from: ﺙ */
    public final C2735dl m6592() {
        int i = f6037 + 39;
        f6038 = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
        if (this.f6048 == null) {
            this.f6048 = new C2735dl(this.f6053.optJSONObject(m6587("ᮐ较㎇Ʝ䮊ﾇ掖ឪ뮜", 37889 - (ViewConfiguration.getTapTimeout() >> 16)).intern()));
            f6038 = (f6037 + 41) % 128;
        }
        return this.f6048;
    }

    /* renamed from: ﻏ */
    public final C2741dr m6593() {
        f6038 = (f6037 + 79) % 128;
        if (this.f6047 == null) {
            C2741dr c2741dr = new C2741dr(C2915kc.m7439(this.f6053.optJSONObject(m6587("ᮄ䚹ꇫఇ潗쩡", (Process.myTid() >> 22) + 23857).intern()), new C2915kc.c<Object>() { // from class: com.ironsource.adqualitysdk.sdk.i.dj.1

                /* renamed from: ﻐ */
                private static int f6054 = 1;

                /* renamed from: ｋ */
                private static int f6055 = 0;

                /* renamed from: ﾇ */
                private static int f6056 = 125;

                public AnonymousClass1() {
                }

                /* renamed from: ｋ */
                private static String m6600(int i, int i2, int i3, String str, boolean z) {
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
                                cArr2[i5] = (char) (cArr2[i5] - f6056);
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

                @Override // com.ironsource.adqualitysdk.sdk.p009i.C2915kc.c
                /* renamed from: ﻛ */
                public final Object mo5208(JSONObject jSONObject, String str) {
                    f6055 = (f6054 + 39) % 128;
                    try {
                        String strOptString = jSONObject.optString(str);
                        if (jSONObject.opt(str) instanceof String) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(m6600(Color.argb(0, 0, 0, 0) + 1, 1 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 159 - View.resolveSize(0, 0), WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR, true).intern());
                            sb.append(strOptString);
                            sb.append(m6600((Process.myTid() >> 22) + 1, 1 - (ViewConfiguration.getTapTimeout() >> 16), (ViewConfiguration.getWindowTouchSlop() >> 8) + 159, WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR, true).intern());
                            strOptString = sb.toString();
                            f6055 = (f6054 + 59) % 128;
                        }
                        String strM6590 = C2733dj.m6590(C2733dj.this);
                        return new C2742ds(strM6590, strOptString).m6702(C2740dq.m6648(strM6590, strOptString, strOptString));
                    } catch (Throwable th) {
                        String strM65902 = C2733dj.m6590(C2733dj.this);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(m6600((ViewConfiguration.getPressedStateDuration() >> 16) + 3, 13 - ExpandableListView.getPackedPositionChild(0L), 219 - TextUtils.lastIndexOf("", '0', 0), "\u0013\u0013￦\uffc1\b\u000f\n\u0014\u0013\u0002\u0011\uffc1\u0013\u0010", true).intern());
                        sb2.append(str);
                        sb2.append(m6600(7 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 9 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 208 - TextUtils.lastIndexOf("", '0', 0, 0), " \u001f\u001a\u001b\u000fￌￌ￦", true).intern());
                        sb2.append(jSONObject.optString(str));
                        C2713cq.m6350(strM65902, sb2.toString(), th);
                        return null;
                    }
                }
            }), this.f6050, true);
            this.f6047 = c2741dr;
            c2741dr.m6656(C2915kc.m7438(this.f6053.optJSONArray(m6589("袢뿜斊᧰厐\ud8e9\uf612藇", 7 - (KeyEvent.getMaxKeyCode() >> 16)).intern()), new C2915kc.b<String>() { // from class: com.ironsource.adqualitysdk.sdk.i.dj.3
                @Override // com.ironsource.adqualitysdk.sdk.p009i.C2915kc.b
                /* renamed from: ｋ */
                public final /* synthetic */ String mo5209(JSONArray jSONArray, int i) {
                    return C2746dw.m6725(jSONArray.optString(i));
                }
            }));
        }
        C2741dr c2741dr2 = this.f6047;
        f6037 = (f6038 + 33) % 128;
        return c2741dr2;
    }

    /* renamed from: ﻐ */
    public final String m6594() {
        int i = f6038 + 95;
        f6037 = i % 128;
        if (i % 2 == 0) {
            return this.f6046;
        }
        throw null;
    }

    /* renamed from: ｋ */
    public final String m6596() {
        int i = f6037 + 71;
        f6038 = i % 128;
        if (i % 2 != 0) {
            return this.f6051;
        }
        int i2 = 20 / 0;
        return this.f6051;
    }

    /* renamed from: ﾒ */
    public final String m6599() {
        int i = f6037;
        String str = this.f6049;
        f6038 = (i + 115) % 128;
        return str;
    }

    /* renamed from: ﻐ */
    private static String m6587(String str, int i) {
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
                        cArr2[i2] = (char) ((cArr[i2] ^ (C2804g.f6423 * i2)) ^ f6039);
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

    /* renamed from: ｋ */
    public final String m6597(String str) {
        int i = f6037;
        f6038 = (i + 75) % 128;
        if (this.f6045 == null) {
            f6038 = (i + 1) % 128;
            Map<String, String> mapM7446 = C2915kc.m7446(this.f6053.optJSONObject(m6587("ᮔ᱀ᐊ\u0cfa҄㵩㔒\u2dd7░幈嘯代䚱罳眤濥枹顧", (ViewConfiguration.getScrollBarSize() >> 8) + 1987).intern()));
            if (mapM7446 != null) {
                ArrayList arrayList = new ArrayList(mapM7446.keySet());
                Collections.sort(arrayList, new Comparator<String>() { // from class: com.ironsource.adqualitysdk.sdk.i.dj.2
                    @Override // java.util.Comparator
                    public final /* synthetic */ int compare(String str2, String str22) {
                        return C2916kd.m7455(str2, str22);
                    }
                });
                Iterator it = arrayList.iterator();
                String str2 = null;
                while (!(!it.hasNext())) {
                    f6037 = (f6038 + 85) % 128;
                    String str3 = (String) it.next();
                    if (C2916kd.m7455(str, str3) >= 0) {
                        str2 = mapM7446.get(str3);
                    }
                }
                this.f6045 = str2;
            }
        }
        return this.f6045;
    }

    /* renamed from: ﾇ */
    public final String m6598() {
        int i = f6038;
        int i2 = i + 123;
        f6037 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.f6044;
        f6037 = (i + 73) % 128;
        return str;
    }

    /* renamed from: ﻛ */
    public final String m6595() {
        int i = f6037;
        String str = this.f6052;
        int i2 = i + 13;
        f6038 = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    /* renamed from: ｋ */
    private static String m6589(String str, int i) {
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
                            char c3 = (char) (c - (((c2 + i3) ^ ((c2 << 4) + f6042)) ^ ((c2 >>> 5) + f6036)));
                            cArr3[1] = c3;
                            cArr3[0] = (char) (c2 - (((c3 >>> 5) + f6041) ^ ((c3 + i3) ^ ((c3 << 4) + f6040))));
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
