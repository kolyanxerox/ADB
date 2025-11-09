package com.ironsource.adqualitysdk.sdk.p009i;

import android.text.TextUtils;
import android.view.ViewConfiguration;
import com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import tv.superawesome.lib.samodelspace.saad.SAAd;
import tv.superawesome.sdk.publisher.SABannerAd;
import tv.superawesome.sdk.publisher.SAInterface;
import tv.superawesome.sdk.publisher.SAVersion;
import tv.superawesome.sdk.publisher.SAVideoAd;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.cf */
/* loaded from: classes2.dex */
public final class C2702cf extends AbstractC2676bg {

    /* renamed from: ﮐ */
    private static int f5610 = 0;

    /* renamed from: ﻏ */
    private static int f5611 = 1;

    /* renamed from: ﻐ */
    private static long f5612 = 5209044412513079143L;

    /* renamed from: ﻛ */
    private static char f5613 = 42212;

    /* renamed from: ｋ */
    private static char f5614 = 16085;

    /* renamed from: ﾇ */
    private static char f5615 = 56041;

    /* renamed from: ﾒ */
    private static char f5616 = 33343;

    public C2702cf(String str) {
        super(str);
    }

    /* renamed from: ﮐ */
    public static /* synthetic */ SAInterface m6131() {
        f5611 = (f5610 + 35) % 128;
        SAInterface sAInterfaceM6132 = m6132();
        f5610 = (f5611 + 57) % 128;
        return sAInterfaceM6132;
    }

    /* renamed from: ﱡ */
    private static SAInterface m6132() {
        f5611 = (f5610 + 91) % 128;
        SAInterface listener = SAVideoAd.getListener();
        f5610 = (f5611 + 35) % 128;
        return listener;
    }

    /* renamed from: ﻐ */
    public static /* synthetic */ JSONObject m6133(SAAd sAAd) {
        f5610 = (f5611 + 1) % 128;
        JSONObject jSONObjectM6136 = m6136(sAAd);
        f5611 = (f5610 + 23) % 128;
        return jSONObjectM6136;
    }

    /* renamed from: ｋ */
    public static /* synthetic */ void m6135(SABannerAd sABannerAd, SAInterface sAInterface) {
        f5610 = (f5611 + 9) % 128;
        m6137(sABannerAd, sAInterface);
        f5610 = (f5611 + 17) % 128;
    }

    /* renamed from: ﾇ */
    private static JSONObject m6136(SAAd sAAd) {
        int i = f5611 + 73;
        f5610 = i % 128;
        if (i % 2 == 0) {
            return sAAd.writeToJson();
        }
        sAAd.writeToJson();
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg
    /* renamed from: ﻛ */
    public final Map<String, AbstractC2676bg.b> mo5381() {
        HashMap map = new HashMap();
        map.put(m6134("ꍁ᮫㜖㷻凖ꤢ瘰ᏸ渵沟酗ྸ\uddbe舶", 13 - (ViewConfiguration.getDoubleTapTimeout() >> 16)).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cf.1
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                return C2702cf.m6133((SAAd) list.get(0));
            }
        });
        map.put(m6138("伀풳硱鰢⇊䕶\ue924ໟ銮㘺寁ﾕ꣮͘첬偖\uf412᧔", TextUtils.getCapsMode("", 0, 0) + 39857).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cf.4
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                return C2702cf.m6131();
            }
        });
        map.put(m6134("䓩䕖\udf12҅\u245a㈾侟狪깣⭇逍鱱湄匭侟狪⌧텫", (ViewConfiguration.getLongPressTimeout() >> 16) + 17).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cf.3
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                C2702cf.m6135((SABannerAd) list.get(0), (SAInterface) list.get(1));
                return null;
            }
        });
        f5610 = (f5611 + 25) % 128;
        return map;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg
    /* renamed from: ﾒ */
    public final String mo5383() {
        f5611 = (f5610 + 115) % 128;
        try {
            String sDKVersionNumber = SAVersion.getSDKVersionNumber();
            f5610 = (f5611 + 23) % 128;
            return sDKVersionNumber;
        } catch (Throwable unused) {
            return C2849hr.m6916().m6919().m6988(SAVersion.class, m6134("ッ螳䧗櫖㚃伣瘣\u1fdc庡ퟧ琨穤", (ViewConfiguration.getKeyRepeatDelay() >> 16) + 12).intern());
        }
    }

    /* renamed from: ﾇ */
    private static void m6137(SABannerAd sABannerAd, SAInterface sAInterface) {
        int i = f5610 + 89;
        f5611 = i % 128;
        int i2 = i % 2;
        sABannerAd.setListener(sAInterface);
        if (i2 == 0) {
            throw null;
        }
        int i3 = f5611 + 1;
        f5610 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:129:0x046a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0119  */
    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg
    /* renamed from: ｋ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Class mo5382(java.lang.String r25) {
        /*
            Method dump skipped, instructions count: 1454
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.p009i.C2702cf.mo5382(java.lang.String):java.lang.Class");
    }

    /* renamed from: ﾒ */
    private static String m6138(String str, int i) {
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
                        cArr2[i2] = (char) ((cArr[i2] ^ (C2804g.f6423 * i2)) ^ f5612);
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
    private static String m6134(String str, int i) {
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
                            char c3 = (char) (c - (((c2 + i3) ^ ((c2 << 4) + f5616)) ^ ((c2 >>> 5) + f5615)));
                            cArr3[1] = c3;
                            cArr3[0] = (char) (c2 - (((c3 >>> 5) + f5613) ^ ((c3 + i3) ^ ((c3 << 4) + f5614))));
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
