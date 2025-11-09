package com.ironsource.adqualitysdk.sdk.p009i;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.ironsource.InterfaceC3173h3;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.y */
/* loaded from: classes2.dex */
public final class C2932y {

    /* renamed from: ﱡ */
    private static int f7428 = 1;

    /* renamed from: ﻐ */
    private static long f7429 = -1199201337393076760L;

    /* renamed from: ﾒ */
    private static int f7430;

    /* renamed from: ﾇ */
    private Map<String, C2929v> f7433 = new HashMap();

    /* renamed from: ﻛ */
    private Map<String, ViewOnLayoutChangeListenerC2643aa> f7431 = new HashMap();

    /* renamed from: ｋ */
    private Map<String, C2933z> f7432 = new HashMap();

    /* renamed from: ﻐ */
    public static /* synthetic */ Map m7678(C2932y c2932y) {
        int i = f7430;
        f7428 = (i + 55) % 128;
        Map<String, ViewOnLayoutChangeListenerC2643aa> map = c2932y.f7431;
        int i2 = i + 93;
        f7428 = i2 % 128;
        if (i2 % 2 != 0) {
            return map;
        }
        throw null;
    }

    /* renamed from: ﻛ */
    public static /* synthetic */ Map m7679(C2932y c2932y) {
        int i = f7430;
        int i2 = i + 119;
        f7428 = i2 % 128;
        int i3 = i2 % 2;
        Map<String, C2929v> map = c2932y.f7433;
        if (i3 == 0) {
            throw null;
        }
        f7428 = (i + 5) % 128;
        return map;
    }

    /* renamed from: ﾇ */
    public static /* synthetic */ Map m7682(C2932y c2932y) {
        int i = f7430 + 43;
        f7428 = i % 128;
        int i2 = i % 2;
        Map<String, C2933z> map = c2932y.f7432;
        if (i2 != 0) {
            return map;
        }
        throw null;
    }

    /* renamed from: ﾒ */
    public static /* synthetic */ String m7683(JSONObject jSONObject) {
        int i = f7428 + 95;
        f7430 = i % 128;
        if (i % 2 == 0) {
            return m7681(jSONObject);
        }
        m7681(jSONObject);
        throw null;
    }

    /* renamed from: ｋ */
    public final void m7686(final JSONObject jSONObject, final C2928u c2928u) {
        C2926s.m7596(new AbstractRunnableC2878it() { // from class: com.ironsource.adqualitysdk.sdk.i.y.1
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
            /* renamed from: ﾒ */
            public final void mo4950() {
                String strM7683 = C2932y.m7683(jSONObject);
                ViewOnLayoutChangeListenerC2643aa viewOnLayoutChangeListenerC2643aa = (ViewOnLayoutChangeListenerC2643aa) C2932y.m7678(C2932y.this).get(strM7683);
                if (viewOnLayoutChangeListenerC2643aa == null) {
                    viewOnLayoutChangeListenerC2643aa = new ViewOnLayoutChangeListenerC2643aa(jSONObject);
                    C2932y.m7678(C2932y.this).put(strM7683, viewOnLayoutChangeListenerC2643aa);
                } else {
                    viewOnLayoutChangeListenerC2643aa.m4907(jSONObject);
                }
                viewOnLayoutChangeListenerC2643aa.m7677((InterfaceC2923p) c2928u);
            }
        });
        f7428 = (f7430 + InterfaceC3173h3.d.b.f8826i) % 128;
    }

    /* renamed from: ﻐ */
    public final void m7684() {
        C2926s.m7596(new AbstractRunnableC2878it() { // from class: com.ironsource.adqualitysdk.sdk.i.y.5
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
            /* renamed from: ﾒ */
            public final void mo4950() {
                ArrayList arrayList = new ArrayList(C2932y.m7679(C2932y.this).values());
                C2932y.m7679(C2932y.this).clear();
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((C2929v) obj).m7623();
                }
            }
        });
        int i = f7428 + 107;
        f7430 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ｋ */
    public final void m7685() {
        C2926s.m7596(new AbstractRunnableC2878it() { // from class: com.ironsource.adqualitysdk.sdk.i.y.3
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
            /* renamed from: ﾒ */
            public final void mo4950() {
                ArrayList arrayList = new ArrayList(C2932y.m7678(C2932y.this).values());
                C2932y.m7678(C2932y.this).clear();
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((ViewOnLayoutChangeListenerC2643aa) obj).m4902();
                }
            }
        });
        int i = f7430 + 121;
        f7428 = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ﾇ */
    public final void m7688(final JSONObject jSONObject, final C2927t c2927t, final InterfaceC2877is interfaceC2877is) {
        C2926s.m7596(new AbstractRunnableC2878it() { // from class: com.ironsource.adqualitysdk.sdk.i.y.2
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
            /* renamed from: ﾒ */
            public final void mo4950() {
                String strM7683 = C2932y.m7683(jSONObject);
                C2933z c2933z = (C2933z) C2932y.m7682(C2932y.this).get(strM7683);
                if (c2933z == null) {
                    c2933z = new C2933z(jSONObject, interfaceC2877is);
                    C2932y.m7682(C2932y.this).put(strM7683, c2933z);
                } else {
                    c2933z.m7708(jSONObject, interfaceC2877is);
                }
                c2933z.m7677(c2927t);
            }
        });
        int i = f7428 + 19;
        f7430 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ﾒ */
    public final void m7689(final JSONObject jSONObject, final C2919l c2919l, final AbstractC2891jf abstractC2891jf, final InterfaceC2875iq interfaceC2875iq) {
        C2926s.m7596(new AbstractRunnableC2878it() { // from class: com.ironsource.adqualitysdk.sdk.i.y.4
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
            /* renamed from: ﾒ */
            public final void mo4950() {
                String strM7683 = C2932y.m7683(jSONObject);
                C2929v c2929v = (C2929v) C2932y.m7679(C2932y.this).get(strM7683);
                if (c2929v == null) {
                    c2929v = new C2929v(jSONObject, interfaceC2875iq);
                    C2932y.m7679(C2932y.this).put(strM7683, c2929v);
                } else {
                    c2929v.m7649(interfaceC2875iq);
                    c2929v.m7629(jSONObject);
                }
                c2929v.m7677((InterfaceC2923p) c2919l);
                c2929v.m7626(abstractC2891jf);
            }
        });
        int i = f7430 + 81;
        f7428 = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ｋ */
    private static String m7680(String str, int i) {
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
                        cArr2[i2] = (char) ((cArr[i2] ^ (C2804g.f6423 * i2)) ^ f7429);
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

    /* renamed from: ﾇ */
    public final void m7687() {
        C2926s.m7596(new AbstractRunnableC2878it() { // from class: com.ironsource.adqualitysdk.sdk.i.y.9
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
            /* renamed from: ﾒ */
            public final void mo4950() {
                ArrayList arrayList = new ArrayList(C2932y.m7682(C2932y.this).values());
                C2932y.m7682(C2932y.this).clear();
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((C2933z) obj).m7709();
                }
            }
        });
        f7428 = (f7430 + 93) % 128;
    }

    /* renamed from: ﾒ */
    public final void m7690(JSONObject jSONObject, C2927t c2927t) {
        int i = f7430 + 57;
        f7428 = i % 128;
        int i2 = i % 2;
        m7688(jSONObject, c2927t, null);
        if (i2 == 0) {
            throw null;
        }
    }

    /* renamed from: ﾇ */
    private static String m7681(JSONObject jSONObject) {
        StringBuilder sb = new StringBuilder();
        sb.append(jSONObject.optString(m7680("▁좁ﾒ\ue298醓蒹ꮣ庭䶹炸柀૮㧙Ⳋ", 60679 - TextUtils.getTrimmedLength("")).intern()));
        sb.append(m7680("◆", 32490 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))).intern());
        sb.append(jSONObject.optString(m7680("▉﮷駟뼺嵰犦ჼ㘜푄\uf582诨꤀佁浲", 56891 - View.resolveSize(0, 0)).intern()));
        sb.append(jSONObject.optString(m7680("▞\udc1c횷쥈쏟얕ﰧ\uf6d0\ue973\ue323\ue5ab鰺雑", (ViewConfiguration.getJumpTapTimeout() >> 16) + 63901).intern()));
        sb.append(jSONObject.optString(m7680("▉캽\uf3dc\ue412襉뉪ꚍ䯓簁愢ੱ㺽⏅퓸藍", 60209 - View.resolveSizeAndState(0, 0, 0)).intern()));
        String string = sb.toString();
        int i = f7430 + 47;
        f7428 = i % 128;
        if (i % 2 != 0) {
            return string;
        }
        throw null;
    }
}
