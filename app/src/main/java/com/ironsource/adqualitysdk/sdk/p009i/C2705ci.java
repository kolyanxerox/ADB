package com.ironsource.adqualitysdk.sdk.p009i;

import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.google.android.gms.internal.ads.AbstractC2183w4;
import com.ironsource.InterfaceC3173h3;
import com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg;
import com.vungle.ads.BuildConfig;
import com.vungle.ads.internal.model.AdPayload;
import com.vungle.ads.internal.model.AppNode;
import com.vungle.ads.internal.model.Placement;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ci */
/* loaded from: classes2.dex */
public final class C2705ci extends AbstractC2676bg {

    /* renamed from: ﻐ */
    private static int f5633 = 1;

    /* renamed from: ﻛ */
    private static int f5634 = 0;

    /* renamed from: ｋ */
    private static char f5635 = 6;

    /* renamed from: ﾇ */
    private static char[] f5636 = {'A', 'd', 's', 'e', 't', 'P', 'a', 'y', 'l', 'o', 'p', 'N', 'B', 'n', 'r', 'L', 'i', 'c', 'm', '.', 'v', 'u', 'g', 'V', 'w', 'C', 'h', 'b', 'R', 'F', 'I', 'U', 'T', 'S', 'D', 'E'};

    /* renamed from: ﾒ */
    private static long f5637 = -8851093706496144865L;

    public C2705ci(String str) {
        super(str);
    }

    /* renamed from: ﻐ */
    public static /* synthetic */ String m6154(AdPayload.AdUnit adUnit) {
        f5634 = (f5633 + 11) % 128;
        String strM6160 = m6160(adUnit);
        int i = f5633 + 13;
        f5634 = i % 128;
        if (i % 2 == 0) {
            return strM6160;
        }
        throw null;
    }

    /* renamed from: ﻛ */
    public static /* synthetic */ AdPayload.TemplateSettings m6156(AdPayload.AdUnit adUnit) {
        f5633 = (f5634 + 73) % 128;
        AdPayload.TemplateSettings templateSettingsM6163 = m6163(adUnit);
        f5634 = (f5633 + 61) % 128;
        return templateSettingsM6163;
    }

    /* renamed from: ﾇ */
    public static /* synthetic */ String m6165(AdPayload.CacheableReplacement cacheableReplacement) {
        int i = f5633 + 51;
        f5634 = i % 128;
        int i2 = i % 2;
        String strM6161 = m6161(cacheableReplacement);
        if (i2 != 0) {
            int i3 = 41 / 0;
        }
        f5634 = (f5633 + 15) % 128;
        return strM6161;
    }

    /* renamed from: ﾒ */
    public static /* synthetic */ AdPayload.AdUnit m6168(AdPayload adPayload) {
        int i = f5633 + 119;
        f5634 = i % 128;
        if (i % 2 == 0) {
            return m6159(adPayload);
        }
        m6159(adPayload);
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:102:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0182  */
    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg
    /* renamed from: ｋ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Class mo5382(java.lang.String r23) {
        /*
            Method dump skipped, instructions count: 1212
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.p009i.C2705ci.mo5382(java.lang.String):java.lang.Class");
    }

    /* renamed from: ﻐ */
    public static /* synthetic */ String m6155(Placement placement) {
        f5634 = (f5633 + 41) % 128;
        String strM6162 = m6162(placement);
        f5633 = (f5634 + 35) % 128;
        return strM6162;
    }

    /* renamed from: ﻛ */
    public static /* synthetic */ String m6157(AppNode appNode) {
        f5634 = (f5633 + 73) % 128;
        String strM6166 = m6166(appNode);
        f5634 = (f5633 + 41) % 128;
        return strM6166;
    }

    /* renamed from: ﾇ */
    public static /* synthetic */ boolean m6167(Placement placement) {
        int i = f5633 + 73;
        f5634 = i % 128;
        if (i % 2 == 0) {
            return m6169(placement);
        }
        m6169(placement);
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg
    /* renamed from: ﾒ */
    public final String mo5383() {
        int i = f5633 + 115;
        f5634 = i % 128;
        try {
            return i % 2 != 0 ? mo5467().split(m6158("쇓馿乕壪쇾", (ViewConfiguration.getWindowTouchSlop() / 71) + 1).intern())[1] : mo5467().split(m6158("쇓馿乕壪쇾", 1 - (ViewConfiguration.getWindowTouchSlop() >> 8)).intern())[0];
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg
    /* renamed from: ﻛ */
    public final Map<String, AbstractC2676bg.b> mo5381() {
        HashMap map = new HashMap();
        map.put(m6164((byte) (120 - TextUtils.indexOf("", "", 0)), "\u0015\u0004\u0005\u0001\u0007\u0001\u000e\u0011ì", (KeyEvent.getMaxKeyCode() >> 16) + 9).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.ci.2
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                return C2705ci.m6168((AdPayload) list.get(0));
            }
        });
        map.put(m6158("\ue4cfኮ첈烹\ue4a8ᣔ\ud8c2滥쳃⁅\uf07b㙄", 1 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.ci.4
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                return C2705ci.m6157((AppNode) list.get(0));
            }
        });
        map.put(m6164((byte) (MotionEvent.axisFromString("") + 67), "\u0015\u0004\u0001\u001c\u000b\f\u001b\u0002\t\u0018\t\u0002\u001b\u0004\u000b\t\u000b\f\u0000\u0015\u0001\u000f\u0001\"\u0014\u000e", TextUtils.getTrimmedLength("") + 26).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.ci.5
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                return C2705ci.m6165((AdPayload.CacheableReplacement) list.get(0));
            }
        });
        map.put(m6158("⢃呆郙쏾⣤帼蒓\udde0\u009e暰갓蕆砒༶\uf581", (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.ci.3
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                return C2705ci.m6154((AdPayload.AdUnit) list.get(0));
            }
        });
        map.put(m6164((byte) (44 - TextUtils.indexOf((CharSequence) "", '0', 0)), "\u0015\u0004\u0005\u0000\t\u0007\u000f\u0005\u0015\u0000\u0010\u0001\u001f\u0000", TextUtils.getOffsetAfter("", 0) + 14).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.ci.1
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                return C2705ci.m6155((Placement) list.get(0));
            }
        });
        map.put(m6164((byte) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 119), "\u0015\u0004\u0002\"\u0000\u0015\u000b\t\n\u0000\t\u0003\u0004\u0005\n\u0016\u0010\u0013ê", 20 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.ci.6
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                return C2705ci.m6156((AdPayload.AdUnit) list.get(0));
            }
        });
        map.put(m6164((byte) (112 - (ViewConfiguration.getScrollBarSize() >> 8)), "\u000e\u0004\u001b\u0004\u001e\f\r\u0002\u0004\u0002\u0016\u0011\u0002\u0004ß", (ViewConfiguration.getWindowTouchSlop() >> 8) + 15).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.ci.9
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                return Boolean.valueOf(C2705ci.m6167((Placement) list.get(0)));
            }
        });
        int i = f5633 + 121;
        f5634 = i % 128;
        if (i % 2 == 0) {
            return map;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg
    /* renamed from: ﾇ */
    public final String mo5467() {
        f5633 = (f5634 + 31) % 128;
        try {
            String strM6988 = C2849hr.m6916().m6919().m6988(BuildConfig.class, m6158("塊䎥鈒誔堔䧦虈钒灪煚꺆찐࢙ᣮ\uf740\ue5ef℔쀒", (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))).intern());
            f5634 = (f5633 + 43) % 128;
            return strM6988;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: ﾇ */
    private static String m6166(AppNode appNode) {
        int i = f5633 + 81;
        f5634 = i % 128;
        int i2 = i % 2;
        String appId = appNode.getAppId();
        if (i2 != 0) {
            int i3 = 49 / 0;
        }
        return appId;
    }

    /* renamed from: ﾇ */
    private static AdPayload.TemplateSettings m6163(AdPayload.AdUnit adUnit) {
        int i = f5633 + 53;
        f5634 = i % 128;
        if (i % 2 == 0) {
            return adUnit.getTemplateSettings();
        }
        adUnit.getTemplateSettings();
        throw null;
    }

    /* renamed from: ﾒ */
    private static boolean m6169(Placement placement) {
        int i = f5633 + 1;
        f5634 = i % 128;
        if (i % 2 != 0) {
            placement.isRewardedVideo();
            throw null;
        }
        boolean zIsRewardedVideo = placement.isRewardedVideo();
        int i2 = f5633 + InterfaceC3173h3.d.b.f8821d;
        f5634 = i2 % 128;
        if (i2 % 2 == 0) {
            return zIsRewardedVideo;
        }
        throw null;
    }

    /* renamed from: ﾇ */
    private static String m6164(byte b, String str, int i) {
        String str2;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (C2858i.f6710) {
            try {
                char[] cArr2 = f5636;
                char c = f5635;
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

    /* renamed from: ﻛ */
    private static String m6158(String str, int i) {
        String str2;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (C2777f.f6322) {
            try {
                char[] cArrM6790 = C2777f.m6790(f5637, cArr, i);
                C2777f.f6321 = 4;
                while (true) {
                    int i2 = C2777f.f6321;
                    if (i2 < cArrM6790.length) {
                        C2777f.f6320 = i2 - 4;
                        cArrM6790[i2] = (char) ((cArrM6790[i2] ^ cArrM6790[i2 % 4]) ^ (r2 * f5637));
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

    /* renamed from: ｋ */
    private static AdPayload.AdUnit m6159(AdPayload adPayload) {
        f5633 = (f5634 + 7) % 128;
        AdPayload.AdUnit adUnit = adPayload.adUnit();
        f5634 = (f5633 + 93) % 128;
        return adUnit;
    }

    /* renamed from: ｋ */
    private static String m6161(AdPayload.CacheableReplacement cacheableReplacement) {
        int i = f5634 + 51;
        f5633 = i % 128;
        int i2 = i % 2;
        String url = cacheableReplacement.getUrl();
        if (i2 == 0) {
            int i3 = 49 / 0;
        }
        return url;
    }

    /* renamed from: ｋ */
    private static String m6160(AdPayload.AdUnit adUnit) {
        int i = f5634 + 109;
        f5633 = i % 128;
        if (i % 2 == 0) {
            adUnit.getCampaign();
            throw null;
        }
        String campaign = adUnit.getCampaign();
        int i2 = f5633 + 121;
        f5634 = i2 % 128;
        if (i2 % 2 == 0) {
            return campaign;
        }
        throw null;
    }

    /* renamed from: ｋ */
    private static String m6162(Placement placement) {
        f5633 = (f5634 + 11) % 128;
        String referenceId = placement.getReferenceId();
        int i = f5634 + 119;
        f5633 = i % 128;
        if (i % 2 == 0) {
            int i2 = 80 / 0;
        }
        return referenceId;
    }
}
