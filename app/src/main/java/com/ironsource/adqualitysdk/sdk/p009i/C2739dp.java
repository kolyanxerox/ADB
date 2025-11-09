package com.ironsource.adqualitysdk.sdk.p009i;

import android.text.TextUtils;
import android.view.View;
import android.widget.ExpandableListView;
import com.ironsource.InterfaceC3173h3;
import com.ironsource.adqualitysdk.sdk.p009i.C2915kc;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.dp */
/* loaded from: classes2.dex */
public final class C2739dp {

    /* renamed from: ﮐ */
    private static int f6102 = 0;

    /* renamed from: ﱡ */
    private static long f6103 = 5895669425122557311L;

    /* renamed from: ﻏ */
    private static int f6104 = 1;

    /* renamed from: ﱟ */
    private Map<String, C2743dt> f6105;

    /* renamed from: ﺙ */
    private Map<String, C2738do> f6106;

    /* renamed from: ﻐ */
    private List<C2737dn> f6107;

    /* renamed from: ﻛ */
    private boolean f6108;

    /* renamed from: ｋ */
    private String f6109;

    /* renamed from: ﾇ */
    private List<String> f6110;

    /* renamed from: ﾒ */
    private String f6111;

    /* renamed from: com.ironsource.adqualitysdk.sdk.i.dp$1 */
    public class AnonymousClass1 implements C2915kc.c<C2738do> {
        @Override // com.ironsource.adqualitysdk.sdk.p009i.C2915kc.c
        /* renamed from: ﻛ */
        public final /* synthetic */ C2738do mo5208(JSONObject jSONObject, String str) {
            return new C2738do(jSONObject.optJSONObject(str));
        }
    }

    /* renamed from: com.ironsource.adqualitysdk.sdk.i.dp$2 */
    public class AnonymousClass2 implements C2915kc.c<C2743dt> {

        /* renamed from: ﻐ */
        private /* synthetic */ String f6112;

        public AnonymousClass2(String str) {
            str = str;
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.C2915kc.c
        /* renamed from: ﻛ */
        public final /* synthetic */ C2743dt mo5208(JSONObject jSONObject, String str) {
            return new C2743dt(str, str, jSONObject.optJSONObject(str));
        }
    }

    /* renamed from: com.ironsource.adqualitysdk.sdk.i.dp$3 */
    public class AnonymousClass3 implements C2915kc.b<C2737dn> {
        @Override // com.ironsource.adqualitysdk.sdk.p009i.C2915kc.b
        /* renamed from: ｋ */
        public final /* synthetic */ C2737dn mo5209(JSONArray jSONArray, int i) {
            return new C2737dn(jSONArray.optJSONObject(i));
        }
    }

    /* renamed from: com.ironsource.adqualitysdk.sdk.i.dp$5 */
    public class AnonymousClass5 implements C2915kc.b<String> {
        @Override // com.ironsource.adqualitysdk.sdk.p009i.C2915kc.b
        /* renamed from: ｋ */
        public final /* synthetic */ String mo5209(JSONArray jSONArray, int i) {
            return C2746dw.m6725(jSONArray.optString(i));
        }
    }

    public C2739dp(String str, String str2, JSONObject jSONObject) {
        this.f6111 = C2746dw.m6725(str2);
        this.f6109 = C2746dw.m6725(jSONObject.optString(m6637("봌菫샍ƹ䚉", 16097 - ExpandableListView.getPackedPositionGroup(0L)).intern()));
        this.f6108 = jSONObject.optBoolean(m6637("봞䙐䮖䳬倹喟廒成", 64333 - ExpandableListView.getPackedPositionType(0L)).intern());
        this.f6110 = m6638(C2915kc.m7438(jSONObject.optJSONArray(m6637("봒妵瑌ጐ⾦쩦\ue116", 58543 - TextUtils.indexOf("", "")).intern()), new C2915kc.b<String>() { // from class: com.ironsource.adqualitysdk.sdk.i.dp.5
            @Override // com.ironsource.adqualitysdk.sdk.p009i.C2915kc.b
            /* renamed from: ｋ */
            public final /* synthetic */ String mo5209(JSONArray jSONArray, int i) {
                return C2746dw.m6725(jSONArray.optString(i));
            }
        }));
        this.f6107 = m6638(C2915kc.m7438(jSONObject.optJSONArray(m6637("봌ս췅鐿岓", TextUtils.lastIndexOf("", '0') + 47208).intern()), new C2915kc.b<C2737dn>() { // from class: com.ironsource.adqualitysdk.sdk.i.dp.3
            @Override // com.ironsource.adqualitysdk.sdk.p009i.C2915kc.b
            /* renamed from: ｋ */
            public final /* synthetic */ C2737dn mo5209(JSONArray jSONArray, int i) {
                return new C2737dn(jSONArray.optJSONObject(i));
            }
        }));
        this.f6106 = m6639(C2915kc.m7439(jSONObject.optJSONObject(m6637("봚\ue166ׄꡜ첷猧", View.MeasureSpec.makeMeasureSpec(0, 0) + 23663).intern()), new C2915kc.c<C2738do>() { // from class: com.ironsource.adqualitysdk.sdk.i.dp.1
            @Override // com.ironsource.adqualitysdk.sdk.p009i.C2915kc.c
            /* renamed from: ﻛ */
            public final /* synthetic */ C2738do mo5208(JSONObject jSONObject2, String str3) {
                return new C2738do(jSONObject2.optJSONObject(str3));
            }
        }));
        this.f6105 = m6639(C2915kc.m7439(jSONObject.optJSONObject(m6637("봒樻ፉ㡴\ue194躾럊", TextUtils.lastIndexOf("", '0', 0) + 55074).intern()), new C2915kc.c<C2743dt>() { // from class: com.ironsource.adqualitysdk.sdk.i.dp.2

            /* renamed from: ﻐ */
            private /* synthetic */ String f6112;

            public AnonymousClass2(String str3) {
                str = str3;
            }

            @Override // com.ironsource.adqualitysdk.sdk.p009i.C2915kc.c
            /* renamed from: ﻛ */
            public final /* synthetic */ C2743dt mo5208(JSONObject jSONObject2, String str3) {
                return new C2743dt(str, str3, jSONObject2.optJSONObject(str3));
            }
        }));
    }

    /* renamed from: ﻐ */
    private static <T> List<T> m6638(List<T> list) {
        if (list != null) {
            f6104 = (f6102 + 33) % 128;
            return list;
        }
        ArrayList arrayList = new ArrayList();
        int i = f6104 + 7;
        f6102 = i % 128;
        if (i % 2 != 0) {
            int i2 = 34 / 0;
        }
        return arrayList;
    }

    /* renamed from: ｋ */
    private static <K, V> Map<K, V> m6639(Map<K, V> map) {
        int i = f6102 + 31;
        f6104 = i % 128;
        if (i % 2 == 0) {
            int i2 = 22 / 0;
            if (map != null) {
                return map;
            }
        } else if (map != null) {
            return map;
        }
        HashMap map2 = new HashMap();
        f6102 = (f6104 + 25) % 128;
        return map2;
    }

    /* renamed from: ﱡ */
    public final List<C2737dn> m6640() {
        int i = (f6102 + InterfaceC3173h3.d.b.f8819b) % 128;
        f6104 = i;
        List<C2737dn> list = this.f6107;
        int i2 = i + 95;
        f6102 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 94 / 0;
        }
        return list;
    }

    /* renamed from: ﺙ */
    public final Map<String, C2738do> m6641() {
        int i = (f6104 + 125) % 128;
        f6102 = i;
        Map<String, C2738do> map = this.f6106;
        f6104 = (i + 77) % 128;
        return map;
    }

    /* renamed from: ﻛ */
    public final String m6643() {
        int i = f6102 + InterfaceC3173h3.d.b.f8819b;
        int i2 = i % 128;
        f6104 = i2;
        if (i % 2 == 0) {
            throw null;
        }
        String str = this.f6109;
        f6102 = (i2 + 49) % 128;
        return str;
    }

    /* renamed from: ﾇ */
    public final Map<String, C2743dt> m6645() {
        Map<String, C2743dt> map;
        int i = f6104;
        int i2 = i + 117;
        f6102 = i2 % 128;
        if (i2 % 2 != 0) {
            map = this.f6105;
            int i3 = 4 / 0;
        } else {
            map = this.f6105;
        }
        f6102 = (i + 33) % 128;
        return map;
    }

    /* renamed from: ﾒ */
    public final boolean m6646() {
        int i = (f6102 + 19) % 128;
        f6104 = i;
        boolean z = this.f6108;
        int i2 = i + InterfaceC3173h3.d.b.f8826i;
        f6102 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 9 / 0;
        }
        return z;
    }

    /* renamed from: ﻐ */
    public final List<String> m6642() {
        int i = f6104 + InterfaceC3173h3.d.b.f8826i;
        f6102 = i % 128;
        if (i % 2 == 0) {
            return this.f6110;
        }
        int i2 = 58 / 0;
        return this.f6110;
    }

    /* renamed from: ﻐ */
    private static String m6637(String str, int i) {
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
                        cArr2[i2] = (char) ((cArr[i2] ^ (C2804g.f6423 * i2)) ^ f6103);
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
    public final String m6644() {
        String str;
        int i = f6104;
        int i2 = i + 93;
        f6102 = i2 % 128;
        if (i2 % 2 != 0) {
            str = this.f6111;
            int i3 = 78 / 0;
        } else {
            str = this.f6111;
        }
        f6102 = (i + 33) % 128;
        return str;
    }
}
