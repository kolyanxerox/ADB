package com.ironsource.adqualitysdk.sdk.p009i;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg;
import com.qq.e.ads.LiteAbstractAD;
import com.qq.e.ads.interstitial2.UnifiedInterstitialAD;
import com.qq.e.ads.rewardvideo.RewardVideoAD;
import com.qq.e.comm.managers.GDTAdSdk;
import com.qq.e.comm.managers.IGDTAdManager;
import com.qq.e.comm.managers.status.APPStatus;
import com.qq.e.comm.managers.status.SDKStatus;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.cg */
/* loaded from: classes2.dex */
public final class C2703cg extends AbstractC2676bg {

    /* renamed from: ﱟ */
    private static int f5620 = 1;

    /* renamed from: ﺙ */
    private static int f5621 = 0;

    /* renamed from: ﻐ */
    private static boolean f5622 = true;

    /* renamed from: ｋ */
    private static boolean f5624 = true;

    /* renamed from: ﾒ */
    private static int f5626 = 108;

    /* renamed from: ﾇ */
    private static char[] f5625 = {179, 176, 192, 173, 208, 191, 215, 207, 219, 217, 154, 221, 209, 205, 223, 224, 213, 226, 229, 184, 218, 220, 190, 227, 222, 188, 193, 210, 181, 216, 194, 174, 225, 211, 185, 177, 228};

    /* renamed from: ﻛ */
    private static long f5623 = -1208578363341381770L;

    public C2703cg(String str) {
        super(str);
    }

    /* renamed from: ﮐ */
    private static IGDTAdManager m6139() {
        int i = f5621 + 69;
        f5620 = i % 128;
        if (i % 2 != 0) {
            return GDTAdSdk.getGDTAdManger();
        }
        GDTAdSdk.getGDTAdManger();
        throw null;
    }

    /* renamed from: ﱡ */
    public static /* synthetic */ IGDTAdManager m6140() {
        int i = f5621 + 107;
        f5620 = i % 128;
        if (i % 2 == 0) {
            m6139();
            throw null;
        }
        IGDTAdManager iGDTAdManagerM6139 = m6139();
        int i2 = f5621 + 73;
        f5620 = i2 % 128;
        if (i2 % 2 != 0) {
            return iGDTAdManagerM6139;
        }
        throw null;
    }

    /* renamed from: ﻐ */
    public static /* synthetic */ Map m6141(LiteAbstractAD liteAbstractAD) {
        f5621 = (f5620 + 73) % 128;
        Map<String, Object> mapM6150 = m6150(liteAbstractAD);
        int i = f5620 + 45;
        f5621 = i % 128;
        if (i % 2 == 0) {
            return mapM6150;
        }
        throw null;
    }

    /* renamed from: ﻛ */
    public static /* synthetic */ int m6143(RewardVideoAD rewardVideoAD) {
        f5620 = (f5621 + 23) % 128;
        int iM6146 = m6146(rewardVideoAD);
        int i = f5620 + 95;
        f5621 = i % 128;
        if (i % 2 == 0) {
            return iM6146;
        }
        throw null;
    }

    /* renamed from: ﾇ */
    public static /* synthetic */ String m6149(APPStatus aPPStatus) {
        f5620 = (f5621 + 91) % 128;
        String strM6147 = m6147(aPPStatus);
        f5620 = (f5621 + 35) % 128;
        return strM6147;
    }

    /* renamed from: ﾒ */
    public static /* synthetic */ Map m6151(UnifiedInterstitialAD unifiedInterstitialAD) {
        f5620 = (f5621 + 11) % 128;
        Map mapM6145 = m6145(unifiedInterstitialAD);
        int i = f5620 + 87;
        f5621 = i % 128;
        if (i % 2 == 0) {
            return mapM6145;
        }
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:86:0x030a  */
    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg
    /* renamed from: ｋ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Class mo5382(java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 1020
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.p009i.C2703cg.mo5382(java.lang.String):java.lang.Class");
    }

    /* renamed from: ﻐ */
    public static /* synthetic */ Map m6142(RewardVideoAD rewardVideoAD) {
        f5621 = (f5620 + 65) % 128;
        Map<String, String> mapM6152 = m6152(rewardVideoAD);
        int i = f5620 + 11;
        f5621 = i % 128;
        if (i % 2 != 0) {
            int i2 = 39 / 0;
        }
        return mapM6152;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg
    /* renamed from: ﻛ */
    public final Map<String, AbstractC2676bg.b> mo5381() {
        HashMap map = new HashMap();
        map.put(m6148(null, null, TextUtils.getCapsMode("", 0, 0) + 127, "\u0099\u008d¢\u0095\u008e£\u0085\u0084\u0083\u0082\u0081\u0090\u008d¢").intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cg.5
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                return C2703cg.m6140();
            }
        });
        map.put(m6144("弑䜦潨ឨ㿒☏츁\uf661", TextUtils.lastIndexOf("", '0') + 6198).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cg.2
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                return C2703cg.m6149((APPStatus) list.get(0));
            }
        });
        map.put(m6148(null, null, 127 - Color.blue(0), "\u0089\u009c\u0095\u009d\u008e\u0099\u0090¥¤\u0090\u008d¢").intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cg.1
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                return C2703cg.m6141((LiteAbstractAD) list.get(0));
            }
        });
        map.put(m6144("弑潪㿰칏黷굜緁ో\udcda\ueb76뮨䨑᪣⤣轢", 12409 - KeyEvent.normalizeMetaState(0)).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cg.3
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                return Integer.valueOf(C2703cg.m6143((RewardVideoAD) list.get(0)));
            }
        });
        map.put(m6148(null, null, View.MeasureSpec.getMode(0) + 127, "\u008f\u0090¥¤\u0085\u008d\u0085\u0099\u008e\u0098\u008d\u0097\u0090\u008d¢").intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cg.4
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                return C2703cg.m6142((RewardVideoAD) list.get(0));
            }
        });
        map.put(m6144("弑䋦擨۠⣌쫋\uecad躷낭功璍ᚅ㡣\uda66ﱼ鹨聞ꉇ", 7669 - View.resolveSizeAndState(0, 0, 0)).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cg.9
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                return C2703cg.m6151((UnifiedInterstitialAD) list.get(0));
            }
        });
        f5621 = (f5620 + 119) % 128;
        return map;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg
    /* renamed from: ﾒ */
    public final String mo5383() {
        f5621 = (f5620 + 113) % 128;
        String integrationSDKVersion = SDKStatus.getIntegrationSDKVersion();
        int i = f5620 + 23;
        f5621 = i % 128;
        if (i % 2 == 0) {
            return integrationSDKVersion;
        }
        throw null;
    }

    /* renamed from: ﾒ */
    private static Map<String, Object> m6150(LiteAbstractAD liteAbstractAD) {
        int i = f5620 + 123;
        f5621 = i % 128;
        int i2 = i % 2;
        Map<String, Object> extraInfo = liteAbstractAD.getExtraInfo();
        if (i2 != 0) {
            int i3 = 97 / 0;
        }
        f5621 = (f5620 + 23) % 128;
        return extraInfo;
    }

    /* renamed from: ﾒ */
    private static Map<String, String> m6152(RewardVideoAD rewardVideoAD) {
        int i = f5621 + 39;
        f5620 = i % 128;
        if (i % 2 != 0) {
            return rewardVideoAD.getExts();
        }
        rewardVideoAD.getExts();
        throw null;
    }

    /* renamed from: ﻛ */
    private static Map m6145(UnifiedInterstitialAD unifiedInterstitialAD) {
        f5621 = (f5620 + 13) % 128;
        Map ext = unifiedInterstitialAD.getExt();
        f5621 = (f5620 + 17) % 128;
        return ext;
    }

    /* renamed from: ﻛ */
    private static String m6144(String str, int i) {
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
                        cArr2[i2] = (char) ((cArr[i2] ^ (C2804g.f6423 * i2)) ^ f5623);
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
    private static String m6147(APPStatus aPPStatus) {
        f5621 = (f5620 + 1) % 128;
        String appid = aPPStatus.getAPPID();
        int i = f5620 + 93;
        f5621 = i % 128;
        if (i % 2 != 0) {
            int i2 = 26 / 0;
        }
        return appid;
    }

    /* renamed from: ｋ */
    private static int m6146(RewardVideoAD rewardVideoAD) {
        f5621 = (f5620 + 45) % 128;
        int rewardAdType = rewardVideoAD.getRewardAdType();
        f5620 = (f5621 + 35) % 128;
        return rewardAdType;
    }

    /* renamed from: ｋ */
    private static String m6148(String str, int[] iArr, int i, String str2) throws UnsupportedEncodingException {
        byte[] bytes = str2;
        if (str2 != null) {
            bytes = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr = bytes;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (C2922o.f7244) {
            try {
                char[] cArr2 = f5625;
                int i2 = f5626;
                if (f5624) {
                    int length = bArr.length;
                    C2922o.f7245 = length;
                    char[] cArr3 = new char[length];
                    C2922o.f7246 = 0;
                    while (C2922o.f7246 < C2922o.f7245) {
                        int i3 = C2922o.f7246;
                        int i4 = C2922o.f7245 - 1;
                        int i5 = C2922o.f7246;
                        cArr3[i3] = (char) (cArr2[bArr[i4 - i5] + i] - i2);
                        C2922o.f7246 = i5 + 1;
                    }
                    return new String(cArr3);
                }
                if (f5622) {
                    int length2 = cArr.length;
                    C2922o.f7245 = length2;
                    char[] cArr4 = new char[length2];
                    C2922o.f7246 = 0;
                    while (C2922o.f7246 < C2922o.f7245) {
                        int i6 = C2922o.f7246;
                        int i7 = C2922o.f7245 - 1;
                        int i8 = C2922o.f7246;
                        cArr4[i6] = (char) (cArr2[cArr[i7 - i8] - i] - i2);
                        C2922o.f7246 = i8 + 1;
                    }
                    return new String(cArr4);
                }
                int length3 = iArr.length;
                C2922o.f7245 = length3;
                char[] cArr5 = new char[length3];
                C2922o.f7246 = 0;
                while (C2922o.f7246 < C2922o.f7245) {
                    int i9 = C2922o.f7246;
                    int i10 = C2922o.f7245 - 1;
                    int i11 = C2922o.f7246;
                    cArr5[i9] = (char) (cArr2[iArr[i10 - i11] - i] - i2);
                    C2922o.f7246 = i11 + 1;
                }
                return new String(cArr5);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
