package com.ironsource.adqualitysdk.sdk.p009i;

import android.graphics.Color;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import com.ironsource.InterfaceC3173h3;
import com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg;
import com.yandex.mobile.ads.banner.BannerAdEventListener;
import com.yandex.mobile.ads.banner.BannerAdView;
import com.yandex.mobile.ads.common.AdInfo;
import com.yandex.mobile.ads.common.ImpressionData;
import com.yandex.mobile.ads.common.MobileAds;
import com.yandex.mobile.ads.common.VideoController;
import com.yandex.mobile.ads.common.VideoEventListener;
import com.yandex.mobile.ads.interstitial.InterstitialAd;
import com.yandex.mobile.ads.interstitial.InterstitialAdEventListener;
import com.yandex.mobile.ads.rewarded.Reward;
import com.yandex.mobile.ads.rewarded.RewardedAd;
import com.yandex.mobile.ads.rewarded.RewardedAdEventListener;
import com.yandex.mobile.ads.video.playback.model.MediaFile;
import com.yandex.mobile.ads.video.playback.model.VideoAd;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.cj */
/* loaded from: classes2.dex */
public final class C2706cj extends AbstractC2676bg {

    /* renamed from: ﾇ */
    private static int f5647 = 0;

    /* renamed from: ﾒ */
    private static int f5648 = 1;

    /* renamed from: ｋ */
    private static char[] f5646 = {'4', 'o', 'o', 'n', 'k', 'R', 'R', 'R', ']', 'v', 168, 175, 172, 165, 178, 144, 182, 167, 132, '!', 'Q', 'g', 'n', 'i', 'k', 'Y', 'R', ']', '_', 'g', 'n', '2', 'k', 'd', '_', 'f', 'd', 'j', 'Y', 'Y', 'n', 'q', 's', 'p', 'm', 'l', 145, 281, 277, 285, 268, 262, 282, 287, 280, 277, 277, 279, 272, 267, 274, 272, 278, 262, 'o', 203, 197, 217, 222, 215, 212, 212, 214, 205, 198, 217, 215, 212, 214, 207, 207, 189, 189, 191, 200, 216, 212, 'm', 227, 234, 232, 238, 220, 214, 222, 226, 234, 241, 241, 229, 230, 235, 223, 222, 242, 247, 240, 237, 237, 239, '2', 'k', 'i', 'l', 'n', '[', 'Y', 'j', 'j', 'R', 'x', 225, 236, 251, 232, 242, 251, 245, 243, 249, ':', 'l', 'i', 'i', 'k', 'r', 'l', 'l', 'c', '[', 'n', 'l', 'i', 'k', 'd', 'd', 'R', 'R', 'T', ']', 'm', 'i', 'q', '`', 'Z', 'n', '4', 'e', 'S', 'W', 'j', 'h', ']', 'c', 'o', 'i', 'f', 'l', '`', 'Y', 'd', 184, 169, 171, 179, 170, 178, 141, 168, 133, 179, 169, 168, 173, 154};

    /* renamed from: ﻐ */
    private static long f5645 = 3618221875976612993L;

    public C2706cj(String str) {
        super(str);
    }

    /* renamed from: ﻐ */
    public static /* synthetic */ AdInfo m6171(RewardedAd rewardedAd) {
        f5647 = (f5648 + 49) % 128;
        AdInfo adInfoM6181 = m6181(rewardedAd);
        int i = f5648 + 19;
        f5647 = i % 128;
        if (i % 2 == 0) {
            return adInfoM6181;
        }
        throw null;
    }

    /* renamed from: ﻛ */
    public static /* synthetic */ String m6175(ImpressionData impressionData) {
        f5647 = (f5648 + InterfaceC3173h3.d.b.f8823f) % 128;
        String strM6195 = m6195(impressionData);
        int i = f5647 + 77;
        f5648 = i % 128;
        if (i % 2 == 0) {
            int i2 = 78 / 0;
        }
        return strM6195;
    }

    /* renamed from: ｋ */
    public static /* synthetic */ String m6182(AdInfo adInfo) {
        f5648 = (f5647 + 81) % 128;
        String strM6194 = m6194(adInfo);
        int i = f5647 + 43;
        f5648 = i % 128;
        if (i % 2 == 0) {
            int i2 = 67 / 0;
        }
        return strM6194;
    }

    /* renamed from: ﾇ */
    public static /* synthetic */ int m6188(Reward reward) {
        int i = f5647 + 15;
        f5648 = i % 128;
        int i2 = i % 2;
        int iM6170 = m6170(reward);
        if (i2 == 0) {
            int i3 = 73 / 0;
        }
        int i4 = f5647 + 123;
        f5648 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 95 / 0;
        }
        return iM6170;
    }

    /* renamed from: ﾒ */
    public static /* synthetic */ AdInfo m6192(InterstitialAd interstitialAd) {
        f5648 = (f5647 + 33) % 128;
        AdInfo adInfoM6174 = m6174(interstitialAd);
        int i = f5647 + 41;
        f5648 = i % 128;
        if (i % 2 == 0) {
            int i2 = 37 / 0;
        }
        return adInfoM6174;
    }

    /* renamed from: ﻐ */
    public static /* synthetic */ MediaFile m6172(VideoAd videoAd) {
        int i = f5647 + 119;
        f5648 = i % 128;
        if (i % 2 == 0) {
            m6193(videoAd);
            throw null;
        }
        MediaFile mediaFileM6193 = m6193(videoAd);
        int i2 = f5647 + 1;
        f5648 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 88 / 0;
        }
        return mediaFileM6193;
    }

    /* renamed from: ﻛ */
    public static /* synthetic */ void m6179(BannerAdView bannerAdView, BannerAdEventListener bannerAdEventListener) {
        int i = f5647 + 73;
        f5648 = i % 128;
        int i2 = i % 2;
        m6196(bannerAdView, bannerAdEventListener);
        if (i2 == 0) {
            int i3 = 91 / 0;
        }
    }

    /* renamed from: ｋ */
    public static /* synthetic */ String m6183(Reward reward) {
        f5648 = (f5647 + 33) % 128;
        String strM6176 = m6176(reward);
        f5648 = (f5647 + 49) % 128;
        return strM6176;
    }

    /* renamed from: ﾇ */
    public static /* synthetic */ String m6189(VideoAd videoAd) {
        f5648 = (f5647 + 95) % 128;
        String strM6185 = m6185(videoAd);
        int i = f5647 + InterfaceC3173h3.d.b.f8826i;
        f5648 = i % 128;
        if (i % 2 != 0) {
            return strM6185;
        }
        throw null;
    }

    /* renamed from: ﾒ */
    public static /* synthetic */ void m6197(InterstitialAd interstitialAd, InterstitialAdEventListener interstitialAdEventListener) {
        f5647 = (f5648 + 13) % 128;
        m6187(interstitialAd, interstitialAdEventListener);
        f5648 = (f5647 + 119) % 128;
    }

    /* renamed from: ﻐ */
    public static /* synthetic */ String m6173(MediaFile mediaFile) {
        f5647 = (f5648 + 47) % 128;
        String strM6184 = m6184(mediaFile);
        f5648 = (f5647 + 9) % 128;
        return strM6184;
    }

    /* renamed from: ｋ */
    public static /* synthetic */ void m6186(VideoController videoController, VideoEventListener videoEventListener) {
        f5648 = (f5647 + 67) % 128;
        m6190(videoController, videoEventListener);
        int i = f5648 + 69;
        f5647 = i % 128;
        if (i % 2 != 0) {
            int i2 = 13 / 0;
        }
    }

    /* renamed from: ﾇ */
    public static /* synthetic */ void m6191(RewardedAd rewardedAd, RewardedAdEventListener rewardedAdEventListener) {
        f5648 = (f5647 + 15) % 128;
        m6180(rewardedAd, rewardedAdEventListener);
        f5648 = (f5647 + 45) % 128;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg
    /* renamed from: ﻛ */
    public final Map<String, AbstractC2676bg.b> mo5381() {
        HashMap map = new HashMap();
        map.put(m6177("⳦峗첓籙\uec29ᰫ距㶍국\udd03䴛", 28723 - Color.alpha(0)).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cj.4
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                return C2706cj.m6182((AdInfo) list.get(0));
            }
        });
        map.put(m6178(true, new int[]{120, 10, 143, 8}, "\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001").intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cj.7
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                return C2706cj.m6175((ImpressionData) list.get(0));
            }
        });
        map.put(m6177("Ⳳ꿿⫃ꖆ₄ꍢ㹆륓㐜뜄㏪軆\u09b1蒒ޒ艧ᵅ頯ᬉ韥ዯ", AndroidCharacter.getMirror('0') + 33515).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cj.8
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                C2706cj.m6186((VideoController) list.get(0), (VideoEventListener) list.get(1));
                return null;
            }
        });
        map.put(m6177("⳦䤇\ue733ᵡ뭣톝侧\ue5d1ϫ렉혫䰩\uea51o뺊풠狸\ue8fcԑꌷ", TextUtils.indexOf("", "", 0, 0) + 26083).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cj.6
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                return C2706cj.m6192((InterstitialAd) list.get(0));
            }
        });
        map.put(m6177("⳦䥩\ue7efᱴ뫐휷䶮\uea28\u008d봵\udb6e燡\uee68ӆꅃ", (ViewConfiguration.getLongPressTimeout() >> 16) + 25997).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cj.10
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                return Integer.valueOf(C2706cj.m6188((Reward) list.get(0)));
            }
        });
        map.put(m6177("⳦ꃃ㒻袦ᱸ逵搊梨䷝솊啾⥜봰", 35879 - KeyEvent.keyCodeFromString("")).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cj.9
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                return C2706cj.m6183((Reward) list.get(0));
            }
        });
        map.put(m6177("⳦ᶛ下뢮\ue918\udb8dК皊ꜝ醓숓ವ紑꾻頝쪖㬞", TextUtils.indexOf("", "", 0, 0) + 12671).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cj.14
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                return C2706cj.m6171((RewardedAd) list.get(0));
            }
        });
        map.put(m6178(false, new int[]{130, 26, 0, 5}, "\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000").intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cj.15
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                C2706cj.m6191((RewardedAd) list.get(0), (RewardedAdEventListener) list.get(1));
                return null;
            }
        });
        map.put(m6177("Ⳳ\uf7d5骗뵛䀫欀࿂튤\uf57a題ꌂ䟮檤ඝ큃ײַ鿵ꊅ䖅桇㌻ퟰ\ufafb鶏ꁪ䬼渞㋄햸\uf87e", (ViewConfiguration.getScrollDefaultDelay() >> 16) + 56113).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cj.13
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                C2706cj.m6197((InterstitialAd) list.get(0), (InterstitialAdEventListener) list.get(1));
                return null;
            }
        });
        map.put(m6178(false, new int[]{156, 15, 0, 9}, "\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001").intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cj.3
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                return C2706cj.m6173((MediaFile) list.get(0));
            }
        });
        map.put(m6177("⳦㍁Ꮏ爸剼닜鄺\uf16d퇨〨Ⴞ烳坙랉韦\uf66c횸㔘ᕾ", Color.argb(0, 0, 0, 0) + 8101).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cj.2
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                return C2706cj.m6172((VideoAd) list.get(0));
            }
        });
        map.put(m6178(true, new int[]{171, 14, 68, 3}, null).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cj.1
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                return C2706cj.m6189((VideoAd) list.get(0));
            }
        });
        map.put(m6177("Ⳳٝ禇골蘄沈ⲹ߫礻걁蟟路ⱛށ竱갢蝝瑱ⷰݎ窐귂蜂𤋮", (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 10937).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cj.5
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                C2706cj.m6179((BannerAdView) list.get(0), (BannerAdEventListener) list.get(1));
                return null;
            }
        });
        int i = f5648 + 19;
        f5647 = i % 128;
        if (i % 2 == 0) {
            return map;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg
    /* renamed from: ﾒ */
    public final String mo5383() {
        String libraryVersion;
        int i = f5648 + 11;
        f5647 = i % 128;
        if (i % 2 != 0) {
            libraryVersion = MobileAds.getLibraryVersion();
            int i2 = 97 / 0;
        } else {
            libraryVersion = MobileAds.getLibraryVersion();
        }
        f5648 = (f5647 + 119) % 128;
        return libraryVersion;
    }

    /* renamed from: ﻐ */
    private static int m6170(Reward reward) {
        int i = f5647 + 63;
        f5648 = i % 128;
        int i2 = i % 2;
        int amount = reward.getAmount();
        if (i2 == 0) {
            int i3 = 12 / 0;
        }
        return amount;
    }

    /* renamed from: ﾇ */
    private static void m6190(VideoController videoController, VideoEventListener videoEventListener) {
        f5648 = (f5647 + 51) % 128;
        videoController.setVideoEventListener(videoEventListener);
        f5647 = (f5648 + 3) % 128;
    }

    /* renamed from: ﾒ */
    private static String m6194(AdInfo adInfo) {
        f5647 = (f5648 + 67) % 128;
        String adUnitId = adInfo.getAdUnitId();
        int i = f5647 + 121;
        f5648 = i % 128;
        if (i % 2 == 0) {
            int i2 = 86 / 0;
        }
        return adUnitId;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:10:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02c0  */
    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg
    /* renamed from: ｋ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Class mo5382(java.lang.String r22) {
        /*
            Method dump skipped, instructions count: 900
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.p009i.C2706cj.mo5382(java.lang.String):java.lang.Class");
    }

    /* renamed from: ﾒ */
    private static String m6195(ImpressionData impressionData) {
        int i = f5647 + 59;
        f5648 = i % 128;
        int i2 = i % 2;
        String rawData = impressionData.getRawData();
        if (i2 == 0) {
            int i3 = 14 / 0;
        }
        return rawData;
    }

    /* renamed from: ﾒ */
    private static MediaFile m6193(VideoAd videoAd) {
        int i = f5647 + 87;
        f5648 = i % 128;
        if (i % 2 != 0) {
            return videoAd.getMediaFile();
        }
        videoAd.getMediaFile();
        throw null;
    }

    /* renamed from: ﾒ */
    private static void m6196(BannerAdView bannerAdView, BannerAdEventListener bannerAdEventListener) {
        int i = f5648 + 9;
        f5647 = i % 128;
        int i2 = i % 2;
        bannerAdView.setBannerAdEventListener(bannerAdEventListener);
        if (i2 != 0) {
            throw null;
        }
    }

    /* renamed from: ﻛ */
    private static AdInfo m6174(InterstitialAd interstitialAd) {
        f5647 = (f5648 + 115) % 128;
        AdInfo info = interstitialAd.getInfo();
        int i = f5647 + 75;
        f5648 = i % 128;
        if (i % 2 == 0) {
            int i2 = 59 / 0;
        }
        return info;
    }

    /* renamed from: ﻛ */
    private static String m6176(Reward reward) {
        int i = f5647 + 67;
        f5648 = i % 128;
        if (i % 2 == 0) {
            reward.getType();
            throw null;
        }
        String type = reward.getType();
        f5647 = (f5648 + 65) % 128;
        return type;
    }

    /* renamed from: ﻛ */
    private static void m6180(RewardedAd rewardedAd, RewardedAdEventListener rewardedAdEventListener) {
        f5647 = (f5648 + 35) % 128;
        rewardedAd.setAdEventListener(rewardedAdEventListener);
        f5648 = (f5647 + 89) % 128;
    }

    /* renamed from: ﻛ */
    private static String m6178(boolean z, int[] iArr, String str) throws UnsupportedEncodingException {
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
                System.arraycopy(f5646, i, cArr, 0, i2);
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

    /* renamed from: ｋ */
    private static AdInfo m6181(RewardedAd rewardedAd) {
        f5648 = (f5647 + 15) % 128;
        AdInfo info = rewardedAd.getInfo();
        f5648 = (f5647 + 3) % 128;
        return info;
    }

    /* renamed from: ｋ */
    private static void m6187(InterstitialAd interstitialAd, InterstitialAdEventListener interstitialAdEventListener) {
        int i = f5648 + 99;
        f5647 = i % 128;
        int i2 = i % 2;
        interstitialAd.setAdEventListener(interstitialAdEventListener);
        if (i2 != 0) {
            throw null;
        }
        int i3 = f5648 + InterfaceC3173h3.d.b.f8826i;
        f5647 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ｋ */
    private static String m6184(MediaFile mediaFile) {
        int i = f5647 + 19;
        f5648 = i % 128;
        if (i % 2 == 0) {
            mediaFile.getUrl();
            throw null;
        }
        String url = mediaFile.getUrl();
        f5648 = (f5647 + 23) % 128;
        return url;
    }

    /* renamed from: ｋ */
    private static String m6185(VideoAd videoAd) {
        f5647 = (f5648 + 67) % 128;
        String info = videoAd.getInfo();
        int i = f5648 + InterfaceC3173h3.d.b.f8826i;
        f5647 = i % 128;
        if (i % 2 == 0) {
            return info;
        }
        throw null;
    }

    /* renamed from: ﻛ */
    private static String m6177(String str, int i) {
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
                        cArr2[i2] = (char) ((cArr[i2] ^ (C2804g.f6423 * i2)) ^ f5645);
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
}
