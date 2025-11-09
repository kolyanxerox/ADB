package com.ironsource.adqualitysdk.sdk.p009i;

import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.five_corp.ad.CreativeType;
import com.five_corp.ad.FiveAd;
import com.five_corp.ad.FiveAdConfig;
import com.five_corp.ad.FiveAdCustomLayout;
import com.five_corp.ad.FiveAdInterface;
import com.five_corp.ad.FiveAdListener;
import com.five_corp.ad.FiveAdLoadListener;
import com.five_corp.ad.FiveAdViewEventListener;
import com.ironsource.InterfaceC3173h3;
import com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.bp */
/* loaded from: classes2.dex */
public final class C2685bp extends AbstractC2676bg {

    /* renamed from: ﻛ */
    private static int f5285 = 0;

    /* renamed from: ﾒ */
    private static int f5288 = 1;

    /* renamed from: ﾇ */
    private static char[] f5287 = {30819, 7287, 45093, 21745, 59528, 36198, 21653, 12447, 40133, 30726, 50254, 41368, 3522, 59694, 30042, 53948, 48872, 6714, 3565, 27098, 50581, 8465, 40196, 63680, 21658, 45174, 11273, 35838, 59311, 17269, 48954, 7007, 30421, 53919, 19984, 43555, 449, 32153, 55671, 13592, 37112, 3200, 26739, 50238, 8196, 40920, 64407, 22381, 45829, 11986, 35457, 58976, 16940, 'F', 25682, 51200, 11476, 37037, 62787, 22827, 48627, 8620, 34422, 59964, 20207, 45733, 5788, 31583, 'F', 25682, 51200, 11476, 37037, 62787, 22827, 48627, 8620, 34422, 59964, 20218, 45744, 5782, 31566, 57116, 17361, 42887, 50937, 41709, 3775, 60011, 22034, 13308, 40849, 31563, 59156, 16600, 11412, 34904, 29726, 53298, 36786, 60326, 18420, 41760, 8025, 31415, 54976, 12800, 44616, 2434, 26069, 49455, 15701, 39292, 62639, 20723, 52256, 28381, 2761, 42651, 16975, 65078, 39896, 14250, 54130, 20258, 59644, 33968, 'F', 25682, 51200, 11476, 37037, 62787, 22830, 48626, 8633, 34423, 59906, 20192, 45751, 5771, 31583, 57115, 17365, 42905, 9114, 18308, 60396, 3849, 45891, 54933, 31439, 40495, 631, 42417, 39045, 64700, 20704, 46098, 2174, 28085, 49609, 9499, 47484, 7811, 29379, 54790, 10855, 36473, 58267, 18424, 56124, 16239, 38061, 59620, 33498, 59107, 19135, 44618, 4664, 30700, 56250, 16225, 41729, 1255, 26781, 52288, 12316, 37936, 63969, 23977, 49518, 9523, 36568, 62126, 22084, 47627, 8155, 33689, 59203, 19227, 44823, 4349, 29881, 55415, 'g', 25694, 51202, 11511, 36997, 62801, 22791, 48604, 8636, 34394, 59936, 20221, 45729, 5773, 31580, 57108, 17363, 42894, 3175, 28677, 54476, 14518, 40288, 300, 26085, 51622, 11658, 37468, 62982, 'g', 25694, 51202, 11511, 36997, 62801, 22791, 48604, 8636, 34394, 59936, 20221, 45729, 5773, 31580, 57108, 17363, 42894, 3178, 28680, 54511, 14499, 40311, 291, 26093, 51633, 58720, 33101, 11537, 51684, 30102, 4162, 48148, 22735, 50351, 25417, 3891, 44014, 22450, 62366, 40527, 14855, 42688, 17053, 59769, 38171, 12796, 56752, 30820, 58416, 33022, 11426, 54865, 45672, 7732, 64193, 18099, 9063, 36657, 27626, 63370, 20598, 15377, 39121, 25749, 49317, 44393, 2359, 38377, 29107, 37657, 63284, 23400, 49047, 1001, 26156, 51820, 11963, 45787, 5386, 31056, 56710, 8640, 34288, 59426, 37800, 63365, 23513, 48956, 862, 26265, 51918, 11779, 45685, 5549, 31227, 56614, 8531, 34125, 59538, 19674, 53262, 13406, 40856, 58312};

    /* renamed from: ｋ */
    private static long f5286 = 8902081363505538107L;

    /* renamed from: ﻐ */
    private static char[] f5284 = {'s', 229, 225, 222, 223, 205, 206, 230, 228, 202, 201, 202, 132, 282, 306, 304, 278, 277, 278, 287, 311, 310, 308, 305, 287, 281, 304, 311, 309, 311, '2', 'm', 'o', 'W', ']', 'j', 'g', 'o', 'p', 'Z', 'U', 'R', 'd', 218, 242, 240, 214, 213, 224, 226, 234, 241, 225, 224, 240, 236, 244, 227, 221, 241, 246, 239, 236, 236, 238, '8', 'q', 'p', 'i', 'a', 'b', 'm', 'o', 'g', 'J', 'M', 'n', 'i', 'n', 'v', 'n', 'o', 'o', 'n', 'k', 'R', 'R', 'R', '7', 'I', 'b', 'G', '#', 'W', 'o', 'm', 'S', 'R', 'V', '[', 'q', 'l', 'k', 'r', 's', 'n', 'n', 'n', 'e', 'f', 'X', ']', 'm', 'i', 'q', '`', 'Z', 'n', 's', 'l', 'i', 'i', 'k', 'w', 238, 233, 213, 219, 236, 228, 232, 216, 207, 230, 228, 231, 233, 214, 219, 229, 223, 225, 218, 216, 205, 206, 232, 234, 210, 215, 230, 228, 228, 131, 274, 288, 292, 273, 265, 280, 281, 287, 272, 266, 290, 288, 262, 261, 265, 270, 292, 287, 286, 287, 278, 277, 279, '2', 'V', '[', 'q', 'l', 'k', 'l', 'c', 'b', 'd', '\\', 'Z', 'd', 'g', 'f', 'l', ']', 'W', 'o', 'm', 'S', 'e', 220, 244, 242, 216, 215, 216, 225, 249, 248, 246, 243, 225, 219, 242, 249, 247, 249, 223, 215, 242, 242, 240, 248, 243, 243, 241, 240, 229, 220, 236, 238, 235, 235, 241};

    public C2685bp(String str) {
        super(str);
    }

    /* renamed from: ﮐ */
    public static /* synthetic */ FiveAd m5684() {
        int i = f5288 + InterfaceC3173h3.d.b.f8823f;
        f5285 = i % 128;
        if (i % 2 == 0) {
            return m5686();
        }
        int i2 = 50 / 0;
        return m5686();
    }

    /* renamed from: ﱟ */
    private static String m5685(FiveAdInterface fiveAdInterface) {
        int i = f5285 + 85;
        f5288 = i % 128;
        int i2 = i % 2;
        String adParameter = fiveAdInterface.getAdParameter();
        if (i2 == 0) {
            int i3 = 22 / 0;
        }
        return adParameter;
    }

    /* renamed from: ﱡ */
    private static String m5687(FiveAdInterface fiveAdInterface) {
        f5285 = (f5288 + 7) % 128;
        String fiveAdTag = fiveAdInterface.getFiveAdTag();
        int i = f5285 + 27;
        f5288 = i % 128;
        if (i % 2 == 0) {
            int i2 = 68 / 0;
        }
        return fiveAdTag;
    }

    /* renamed from: ﺙ */
    private static FiveAdListener m5688(FiveAdInterface fiveAdInterface) {
        f5288 = (f5285 + 57) % 128;
        FiveAdListener listener = fiveAdInterface.getListener();
        f5285 = (f5288 + 93) % 128;
        return listener;
    }

    /* renamed from: ﻏ */
    private static String m5689(FiveAdInterface fiveAdInterface) {
        int i = f5285 + 61;
        f5288 = i % 128;
        int i2 = i % 2;
        String slotId = fiveAdInterface.getSlotId();
        if (i2 == 0) {
            int i3 = 1 / 0;
        }
        return slotId;
    }

    /* renamed from: ﻐ */
    public static /* synthetic */ FiveAdListener m5690(FiveAdInterface fiveAdInterface) {
        int i = f5288 + 49;
        f5285 = i % 128;
        int i2 = i % 2;
        FiveAdListener fiveAdListenerM5688 = m5688(fiveAdInterface);
        if (i2 != 0) {
            int i3 = 75 / 0;
        }
        int i4 = f5288 + 9;
        f5285 = i4 % 128;
        if (i4 % 2 == 0) {
            return fiveAdListenerM5688;
        }
        throw null;
    }

    /* renamed from: ﻛ */
    public static /* synthetic */ String m5692(FiveAdInterface fiveAdInterface) {
        int i = f5288 + 39;
        f5285 = i % 128;
        if (i % 2 == 0) {
            return m5687(fiveAdInterface);
        }
        m5687(fiveAdInterface);
        throw null;
    }

    /* renamed from: ｋ */
    public static /* synthetic */ String m5694(FiveAdConfig fiveAdConfig) {
        int i = f5288 + 37;
        f5285 = i % 128;
        int i2 = i % 2;
        String strM5699 = m5699(fiveAdConfig);
        if (i2 != 0) {
            int i3 = 80 / 0;
        }
        int i4 = f5288 + 99;
        f5285 = i4 % 128;
        if (i4 % 2 == 0) {
            return strM5699;
        }
        throw null;
    }

    /* renamed from: ﾇ */
    public static /* synthetic */ CreativeType m5698(FiveAdInterface fiveAdInterface) {
        f5285 = (f5288 + 121) % 128;
        CreativeType creativeTypeM5683 = m5683(fiveAdInterface);
        f5285 = (f5288 + 61) % 128;
        return creativeTypeM5683;
    }

    /* renamed from: ﾒ */
    public static /* synthetic */ String m5702(FiveAdCustomLayout fiveAdCustomLayout) {
        int i = f5288 + 71;
        f5285 = i % 128;
        if (i % 2 == 0) {
            return m5695(fiveAdCustomLayout);
        }
        m5695(fiveAdCustomLayout);
        throw null;
    }

    /* renamed from: ﮐ */
    private static CreativeType m5683(FiveAdInterface fiveAdInterface) {
        f5288 = (f5285 + 99) % 128;
        CreativeType creativeType = fiveAdInterface.getCreativeType();
        int i = f5288 + 45;
        f5285 = i % 128;
        if (i % 2 == 0) {
            return creativeType;
        }
        throw null;
    }

    /* renamed from: ﱡ */
    private static FiveAd m5686() {
        int i = f5288 + 65;
        f5285 = i % 128;
        if (i % 2 != 0) {
            FiveAd.getSingleton();
            throw null;
        }
        FiveAd singleton = FiveAd.getSingleton();
        f5288 = (f5285 + 125) % 128;
        return singleton;
    }

    /* renamed from: ﻐ */
    public static /* synthetic */ void m5691(FiveAdInterface fiveAdInterface, FiveAdLoadListener fiveAdLoadListener) {
        f5285 = (f5288 + 85) % 128;
        m5705(fiveAdInterface, fiveAdLoadListener);
        f5288 = (f5285 + 89) % 128;
    }

    /* renamed from: ｋ */
    public static /* synthetic */ String m5696(FiveAdInterface fiveAdInterface) {
        f5288 = (f5285 + 53) % 128;
        String strM5689 = m5689(fiveAdInterface);
        int i = f5288 + 77;
        f5285 = i % 128;
        if (i % 2 != 0) {
            int i2 = 53 / 0;
        }
        return strM5689;
    }

    /* renamed from: ﾇ */
    public static /* synthetic */ void m5701(FiveAdInterface fiveAdInterface, FiveAdViewEventListener fiveAdViewEventListener) {
        int i = f5288 + 83;
        f5285 = i % 128;
        int i2 = i % 2;
        m5706(fiveAdInterface, fiveAdViewEventListener);
        if (i2 != 0) {
            throw null;
        }
        int i3 = f5285 + 73;
        f5288 = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ﾒ */
    public static /* synthetic */ String m5703(FiveAdInterface fiveAdInterface) {
        f5285 = (f5288 + 73) % 128;
        String strM5685 = m5685(fiveAdInterface);
        f5288 = (f5285 + 1) % 128;
        return strM5685;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg
    /* renamed from: ﻛ */
    public final Map<String, AbstractC2676bg.b> mo5381() {
        HashMap map = new HashMap();
        map.put(m5693(20 - (KeyEvent.getMaxKeyCode() >> 16), (ViewConfiguration.getScrollBarSize() >> 8) + 156, (char) (39138 - KeyEvent.normalizeMetaState(0))).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bp.2
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                return C2685bp.m5694((FiveAdConfig) list.get(0));
            }
        });
        map.put(m5697(false, new int[]{153, 24, 179, 6}, "\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0000").intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bp.4
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                return C2685bp.m5696((FiveAdInterface) list.get(0));
            }
        });
        map.put(m5697(false, new int[]{177, 21, 0, 13}, "\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0000").intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bp.1
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                return C2685bp.m5692((FiveAdInterface) list.get(0));
            }
        });
        map.put(m5693(30 - ((Process.getThreadPriority(0) + 20) >> 6), 176 - (KeyEvent.getMaxKeyCode() >> 16), (char) (33469 - (KeyEvent.getMaxKeyCode() >> 16))).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bp.6
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                return C2685bp.m5698((FiveAdInterface) list.get(0));
            }
        });
        map.put(m5693(29 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), TextUtils.indexOf("", "") + InterfaceC3173h3.c.b.f8815g, (char) TextUtils.indexOf("", "", 0)).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bp.7
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                return C2685bp.m5703((FiveAdInterface) list.get(0));
            }
        });
        map.put(m5693(27 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 235, (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0'))).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bp.8
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                return C2685bp.m5690((FiveAdInterface) list.get(0));
            }
        });
        map.put(m5693(26 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 261 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (58642 - MotionEvent.axisFromString(""))).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bp.9
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                C2685bp.m5704((FiveAdInterface) list.get(0), (FiveAdListener) list.get(1));
                return null;
            }
        });
        map.put(m5693(17 - TextUtils.indexOf((CharSequence) "", '0'), 287 - (ViewConfiguration.getFadingEdgeLength() >> 16), (char) ((ViewConfiguration.getScrollBarSize() >> 8) + 54838)).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bp.10
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                return C2685bp.m5684();
            }
        });
        map.put(m5697(false, new int[]{198, 35, 133, 32}, "\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0001").intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bp.12
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                return C2685bp.m5702((FiveAdCustomLayout) list.get(0));
            }
        });
        map.put(m5693(15 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), KeyEvent.normalizeMetaState(0) + 305, (char) (37738 - Drawable.resolveOpacity(0, 0))).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bp.5
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                C2685bp.m5691((FiveAdInterface) list.get(0), (FiveAdLoadListener) list.get(1));
                return null;
            }
        });
        map.put(m5693(21 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 320, (char) (TextUtils.indexOf("", "", 0) + 37851)).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bp.3
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                C2685bp.m5701((FiveAdInterface) list.get(0), (FiveAdViewEventListener) list.get(1));
                return null;
            }
        });
        f5285 = (f5288 + 125) % 128;
        return map;
    }

    /* renamed from: ﾇ */
    private static String m5699(FiveAdConfig fiveAdConfig) {
        f5285 = (f5288 + 125) % 128;
        String str = fiveAdConfig.appId;
        f5285 = (f5288 + 7) % 128;
        return str;
    }

    /* renamed from: ﾒ */
    public static /* synthetic */ void m5704(FiveAdInterface fiveAdInterface, FiveAdListener fiveAdListener) {
        f5288 = (f5285 + 59) % 128;
        m5700(fiveAdInterface, fiveAdListener);
        f5285 = (f5288 + 55) % 128;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0060  */
    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg
    /* renamed from: ｋ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Class mo5382(java.lang.String r24) {
        /*
            Method dump skipped, instructions count: 848
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.p009i.C2685bp.mo5382(java.lang.String):java.lang.Class");
    }

    /* renamed from: ﾇ */
    private static void m5700(FiveAdInterface fiveAdInterface, FiveAdListener fiveAdListener) {
        f5285 = (f5288 + 77) % 128;
        fiveAdInterface.setListener(fiveAdListener);
        int i = f5285 + 1;
        f5288 = i % 128;
        if (i % 2 == 0) {
            int i2 = 20 / 0;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg
    /* renamed from: ﾒ */
    public final String mo5383() {
        String sdkSemanticVersion;
        int i = f5285 + 73;
        f5288 = i % 128;
        if (i % 2 == 0) {
            sdkSemanticVersion = FiveAd.getSdkSemanticVersion();
            int i2 = 5 / 0;
        } else {
            sdkSemanticVersion = FiveAd.getSdkSemanticVersion();
        }
        f5288 = (f5285 + 119) % 128;
        return sdkSemanticVersion;
    }

    /* renamed from: ﾒ */
    private static void m5706(FiveAdInterface fiveAdInterface, FiveAdViewEventListener fiveAdViewEventListener) {
        int i = f5288 + 47;
        f5285 = i % 128;
        int i2 = i % 2;
        fiveAdInterface.setViewEventListener(fiveAdViewEventListener);
        if (i2 != 0) {
            int i3 = 13 / 0;
        }
        f5288 = (f5285 + 117) % 128;
    }

    /* renamed from: ﾒ */
    private static void m5705(FiveAdInterface fiveAdInterface, FiveAdLoadListener fiveAdLoadListener) {
        f5285 = (f5288 + 41) % 128;
        fiveAdInterface.setLoadListener(fiveAdLoadListener);
        f5288 = (f5285 + 55) % 128;
    }

    /* renamed from: ｋ */
    private static String m5695(FiveAdCustomLayout fiveAdCustomLayout) {
        f5288 = (f5285 + 91) % 128;
        String advertiserName = fiveAdCustomLayout.getAdvertiserName();
        f5288 = (f5285 + 125) % 128;
        return advertiserName;
    }

    /* renamed from: ｋ */
    private static String m5693(int i, int i2, char c) {
        String str;
        synchronized (C2642a.f4435) {
            try {
                char[] cArr = new char[i];
                C2642a.f4436 = 0;
                while (true) {
                    int i3 = C2642a.f4436;
                    if (i3 < i) {
                        cArr[i3] = (char) ((f5287[i2 + i3] ^ (i3 * f5286)) ^ c);
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

    /* renamed from: ｋ */
    private static String m5697(boolean z, int[] iArr, String str) throws UnsupportedEncodingException {
        String str2;
        byte[] bytes = str;
        if (str != null) {
            bytes = str.getBytes("ISO-8859-1");
        }
        byte[] bArr = bytes;
        synchronized (C2831h.f6553) {
            try {
                int i = iArr[0];
                int i2 = iArr[1];
                int i3 = iArr[2];
                int i4 = iArr[3];
                char[] cArr = new char[i2];
                System.arraycopy(f5284, i, cArr, 0, i2);
                if (bArr != null) {
                    char[] cArr2 = new char[i2];
                    C2831h.f6552 = 0;
                    char c = 0;
                    while (true) {
                        int i5 = C2831h.f6552;
                        if (i5 >= i2) {
                            break;
                        }
                        if (bArr[i5] == 1) {
                            cArr2[i5] = (char) (((cArr[i5] << 1) + 1) - c);
                        } else {
                            cArr2[i5] = (char) ((cArr[i5] << 1) - c);
                        }
                        c = cArr2[i5];
                        C2831h.f6552 = i5 + 1;
                    }
                    cArr = cArr2;
                }
                if (i4 > 0) {
                    char[] cArr3 = new char[i2];
                    System.arraycopy(cArr, 0, cArr3, 0, i2);
                    int i6 = i2 - i4;
                    System.arraycopy(cArr3, 0, cArr, i6, i4);
                    System.arraycopy(cArr3, i4, cArr, 0, i6);
                }
                if (z) {
                    char[] cArr4 = new char[i2];
                    C2831h.f6552 = 0;
                    while (true) {
                        int i7 = C2831h.f6552;
                        if (i7 >= i2) {
                            break;
                        }
                        cArr4[i7] = cArr[(i2 - i7) - 1];
                        C2831h.f6552 = i7 + 1;
                    }
                    cArr = cArr4;
                }
                if (i3 > 0) {
                    C2831h.f6552 = 0;
                    while (true) {
                        int i8 = C2831h.f6552;
                        if (i8 >= i2) {
                            break;
                        }
                        cArr[i8] = (char) (cArr[i8] - iArr[2]);
                        C2831h.f6552 = i8 + 1;
                    }
                }
                str2 = new String(cArr);
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }
}
