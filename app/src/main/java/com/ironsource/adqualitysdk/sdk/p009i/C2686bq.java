package com.ironsource.adqualitysdk.sdk.p009i;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.fyber.FairBid;
import com.fyber.fairbid.ads.ImpressionData;
import com.fyber.fairbid.ads.Interstitial;
import com.fyber.fairbid.ads.PlacementType;
import com.fyber.fairbid.ads.Rewarded;
import com.fyber.fairbid.ads.interstitial.InterstitialListener;
import com.fyber.fairbid.ads.rewarded.RewardedListener;
import com.fyber.fairbid.internal.Constants;
import com.fyber.fairbid.mediation.MediationManager;
import com.fyber.fairbid.mediation.adapter.AdapterConfiguration;
import com.fyber.fairbid.mediation.config.MediationConfig;
import com.fyber.fairbid.sdk.placements.Placement;
import com.fyber.fairbid.sdk.placements.PlacementsHandler;
import com.google.android.gms.internal.ads.AbstractC2183w4;
import com.ironsource.InterfaceC3173h3;
import com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.bq */
/* loaded from: classes2.dex */
public final class C2686bq extends AbstractC2676bg {

    /* renamed from: ﮐ */
    private static int f5300 = 1;

    /* renamed from: ﺙ */
    private static int f5301 = 0;

    /* renamed from: ﻏ */
    private static char f5302 = 7;

    /* renamed from: ﻐ */
    private static char[] f5303 = {'M', 'e', 'd', 'i', 'a', 't', 'o', 'n', 'g', 'r', 'A', 's', 'C', 'f', 'P', 'l', 'c', 'm', 'H', 'T', 'y', 'p', 'S', 'h', 'w', 'O', '^', '[', '\\', ']', '+', '.', '$', 'I', 'D', 'R', 'k', 'V', 'u', 'v', 'E', 'L', 'N', 'Q', 'U', 'W', 'X', 'Y', 'Z'};

    /* renamed from: ﻛ */
    private static char f5304 = 8651;

    /* renamed from: ｋ */
    private static char f5305 = 8824;

    /* renamed from: ﾇ */
    private static char f5306 = 65322;

    /* renamed from: ﾒ */
    private static char f5307 = 21129;

    public C2686bq(String str) {
        super(str);
    }

    /* renamed from: 爫 */
    private static String m5707(ImpressionData impressionData) {
        int i = f5301 + 3;
        f5300 = i % 128;
        if (i % 2 == 0) {
            impressionData.getCreativeId();
            throw null;
        }
        String creativeId = impressionData.getCreativeId();
        f5300 = (f5301 + 61) % 128;
        return creativeId;
    }

    /* renamed from: ﬤ */
    private static String m5708(ImpressionData impressionData) {
        int i = f5300 + 117;
        f5301 = i % 128;
        if (i % 2 != 0) {
            impressionData.getAdvertiserDomain();
            throw null;
        }
        String advertiserDomain = impressionData.getAdvertiserDomain();
        int i2 = f5301 + 95;
        f5300 = i2 % 128;
        if (i2 % 2 != 0) {
            return advertiserDomain;
        }
        throw null;
    }

    /* renamed from: טּ */
    private static String m5709(ImpressionData impressionData) {
        f5300 = (f5301 + 125) % 128;
        String campaignId = impressionData.getCampaignId();
        int i = f5301 + 39;
        f5300 = i % 128;
        if (i % 2 != 0) {
            return campaignId;
        }
        throw null;
    }

    /* renamed from: ﭖ */
    private static String m5710(ImpressionData impressionData) {
        int i = f5301 + 63;
        f5300 = i % 128;
        if (i % 2 == 0) {
            impressionData.getRenderingSdkVersion();
            throw null;
        }
        String renderingSdkVersion = impressionData.getRenderingSdkVersion();
        f5300 = (f5301 + 93) % 128;
        return renderingSdkVersion;
    }

    /* renamed from: ﭴ */
    private static String m5711(ImpressionData impressionData) {
        int i = f5300 + 7;
        f5301 = i % 128;
        int i2 = i % 2;
        String renderingSdk = impressionData.getRenderingSdk();
        if (i2 != 0) {
            int i3 = 80 / 0;
        }
        return renderingSdk;
    }

    /* renamed from: ﭸ */
    private static String m5712(ImpressionData impressionData) {
        f5301 = (f5300 + 19) % 128;
        String demandSource = impressionData.getDemandSource();
        f5300 = (f5301 + 81) % 128;
        return demandSource;
    }

    /* renamed from: ﮉ */
    private static String m5713(ImpressionData impressionData) {
        f5300 = (f5301 + 59) % 128;
        String variantId = impressionData.getVariantId();
        int i = f5301 + InterfaceC3173h3.d.b.f8821d;
        f5300 = i % 128;
        if (i % 2 == 0) {
            int i2 = 91 / 0;
        }
        return variantId;
    }

    /* renamed from: ﮌ */
    private static MediationManager m5716() {
        f5300 = (f5301 + 31) % 128;
        MediationManager companion = MediationManager.Companion.getInstance();
        int i = f5301 + 75;
        f5300 = i % 128;
        if (i % 2 != 0) {
            return companion;
        }
        throw null;
    }

    /* renamed from: ﮐ */
    public static /* synthetic */ MediationManager m5717() {
        int i = f5301 + 55;
        f5300 = i % 128;
        if (i % 2 == 0) {
            m5716();
            throw null;
        }
        MediationManager mediationManagerM5716 = m5716();
        int i2 = f5301 + 47;
        f5300 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 41 / 0;
        }
        return mediationManagerM5716;
    }

    /* renamed from: ﱟ */
    public static /* synthetic */ String m5719(ImpressionData impressionData) {
        f5300 = (f5301 + 63) % 128;
        String strM5709 = m5709(impressionData);
        int i = f5300 + 83;
        f5301 = i % 128;
        if (i % 2 == 0) {
            return strM5709;
        }
        throw null;
    }

    /* renamed from: ﱡ */
    public static /* synthetic */ String m5721(ImpressionData impressionData) {
        f5300 = (f5301 + 17) % 128;
        String strM5708 = m5708(impressionData);
        f5301 = (f5300 + 63) % 128;
        return strM5708;
    }

    /* renamed from: ﺙ */
    public static /* synthetic */ double m5723(ImpressionData impressionData) {
        int i = f5301 + 113;
        f5300 = i % 128;
        if (i % 2 != 0) {
            return m5715(impressionData);
        }
        m5715(impressionData);
        throw null;
    }

    /* renamed from: ﻏ */
    private static PlacementType m5724(ImpressionData impressionData) {
        f5301 = (f5300 + 71) % 128;
        PlacementType placementType = impressionData.getPlacementType();
        f5301 = (f5300 + 27) % 128;
        return placementType;
    }

    /* renamed from: ﻐ */
    public static /* synthetic */ PlacementType m5725(ImpressionData impressionData) {
        f5301 = (f5300 + 123) % 128;
        PlacementType placementTypeM5724 = m5724(impressionData);
        int i = f5300 + 7;
        f5301 = i % 128;
        if (i % 2 == 0) {
            return placementTypeM5724;
        }
        throw null;
    }

    /* renamed from: ﻛ */
    public static /* synthetic */ Constants.AdType m5730(Placement placement) {
        int i = f5300 + InterfaceC3173h3.d.b.f8821d;
        f5301 = i % 128;
        if (i % 2 != 0) {
            m5748(placement);
            throw null;
        }
        Constants.AdType adTypeM5748 = m5748(placement);
        f5301 = (f5300 + 29) % 128;
        return adTypeM5748;
    }

    /* renamed from: ｋ */
    public static /* synthetic */ String m5738(ImpressionData impressionData) {
        f5301 = (f5300 + 37) % 128;
        String strM5711 = m5711(impressionData);
        f5301 = (f5300 + 113) % 128;
        return strM5711;
    }

    /* renamed from: ﾇ */
    public static /* synthetic */ PlacementType m5742(Constants.AdType adType) {
        f5300 = (f5301 + 43) % 128;
        PlacementType placementTypeM5736 = m5736(adType);
        int i = f5300 + 33;
        f5301 = i % 128;
        if (i % 2 == 0) {
            return placementTypeM5736;
        }
        throw null;
    }

    /* renamed from: ﾒ */
    public static /* synthetic */ PlacementsHandler m5749(MediationManager mediationManager) {
        int i = f5301 + 125;
        f5300 = i % 128;
        int i2 = i % 2;
        PlacementsHandler placementsHandlerM5726 = m5726(mediationManager);
        if (i2 == 0) {
            int i3 = 94 / 0;
        }
        return placementsHandlerM5726;
    }

    /* renamed from: ﮉ */
    private static boolean m5714() {
        int i = f5301 + 21;
        f5300 = i % 128;
        if (i % 2 != 0) {
            return FairBid.assertStarted();
        }
        int i2 = 99 / 0;
        return FairBid.assertStarted();
    }

    /* renamed from: ﮌ */
    private static double m5715(ImpressionData impressionData) {
        f5300 = (f5301 + InterfaceC3173h3.d.b.f8819b) % 128;
        double netPayout = impressionData.getNetPayout();
        int i = f5301 + 93;
        f5300 = i % 128;
        if (i % 2 == 0) {
            int i2 = 12 / 0;
        }
        return netPayout;
    }

    /* renamed from: ﮐ */
    public static /* synthetic */ String m5718(ImpressionData impressionData) {
        f5301 = (f5300 + 27) % 128;
        String strM5707 = m5707(impressionData);
        int i = f5300 + 71;
        f5301 = i % 128;
        if (i % 2 == 0) {
            return strM5707;
        }
        throw null;
    }

    /* renamed from: ﱡ */
    public static /* synthetic */ boolean m5722() {
        f5301 = (f5300 + 95) % 128;
        boolean zM5714 = m5714();
        f5301 = (f5300 + 109) % 128;
        return zM5714;
    }

    /* renamed from: ﻐ */
    public static /* synthetic */ String m5728(FairBid.AdsConfig adsConfig) {
        int i = f5300 + 85;
        f5301 = i % 128;
        int i2 = i % 2;
        String strM5744 = m5744(adsConfig);
        if (i2 != 0) {
            int i3 = 19 / 0;
        }
        f5300 = (f5301 + 97) % 128;
        return strM5744;
    }

    /* renamed from: ﻛ */
    public static /* synthetic */ String m5731(FairBid.AdsConfig adsConfig) {
        int i = f5300 + 113;
        f5301 = i % 128;
        if (i % 2 == 0) {
            return m5737(adsConfig);
        }
        m5737(adsConfig);
        throw null;
    }

    /* renamed from: ｋ */
    public static /* synthetic */ void m5740(InterstitialListener interstitialListener) {
        int i = f5300 + InterfaceC3173h3.d.b.f8819b;
        f5301 = i % 128;
        int i2 = i % 2;
        m5729(interstitialListener);
        if (i2 != 0) {
            throw null;
        }
        f5300 = (f5301 + 49) % 128;
    }

    /* renamed from: ﾇ */
    public static /* synthetic */ Constants.AdType m5743(String str) {
        f5301 = (f5300 + 87) % 128;
        Constants.AdType adTypeM5720 = m5720(str);
        f5301 = (f5300 + 13) % 128;
        return adTypeM5720;
    }

    /* renamed from: ﾒ */
    public static /* synthetic */ String m5750(ImpressionData impressionData) {
        int i = f5300 + 31;
        f5301 = i % 128;
        if (i % 2 != 0) {
            m5710(impressionData);
            throw null;
        }
        String strM5710 = m5710(impressionData);
        f5300 = (f5301 + 17) % 128;
        return strM5710;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0082  */
    /* renamed from: ﱡ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.fyber.fairbid.internal.Constants.AdType m5720(java.lang.String r6) {
        /*
            int r0 = r6.hashCode()
            r1 = 3
            r2 = 1
            r3 = 2
            r4 = 0
            switch(r0) {
                case -1372958932: goto L5b;
                case 433141802: goto L41;
                case 543046670: goto L27;
                case 1951953708: goto Ld;
                default: goto Lb;
            }
        Lb:
            goto L82
        Ld:
            int r0 = android.os.Process.myTid()
            int r0 = r0 >> 22
            int r0 = 6 - r0
            java.lang.String r4 = "캎‧\uebc6≣⸶玏"
            java.lang.String r0 = m5733(r4, r0)
            java.lang.String r0 = r0.intern()
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L82
            r4 = r2
            goto L83
        L27:
            r0 = 16777224(0x1000008, float:2.350991E-38)
            int r4 = android.graphics.Color.rgb(r4, r4, r4)
            int r4 = r4 + r0
            java.lang.String r0 = "轀툍뙮赾뾕륐햻츬"
            java.lang.String r0 = m5733(r0, r4)
            java.lang.String r0 = r0.intern()
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L82
            r4 = r1
            goto L83
        L41:
            float r0 = android.view.ViewConfiguration.getScrollFriction()
            r5 = 0
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            int r0 = r0 + 6
            java.lang.String r5 = "™爫욇\uf770砲摋羦햆"
            java.lang.String r0 = m5733(r5, r0)
            java.lang.String r0 = r0.intern()
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L82
            goto L83
        L5b:
            java.lang.String r0 = ""
            int r0 = android.text.TextUtils.getTrimmedLength(r0)
            int r0 = r0 + 12
            java.lang.String r4 = "\udc59䗭䨊망綮䠳\uf89e\ue956\uf89e\ue956Ꝥ⯆"
            java.lang.String r0 = m5733(r4, r0)
            java.lang.String r0 = r0.intern()
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L82
            int r6 = com.ironsource.adqualitysdk.sdk.p009i.C2686bq.f5301
            int r6 = r6 + 33
            int r0 = r6 % 128
            com.ironsource.adqualitysdk.sdk.p009i.C2686bq.f5300 = r0
            int r6 = r6 % r3
            if (r6 != 0) goto L80
            r4 = 5
            goto L83
        L80:
            r4 = r3
            goto L83
        L82:
            r4 = -1
        L83:
            if (r4 == 0) goto L9e
            if (r4 == r2) goto L9b
            if (r4 == r3) goto L98
            if (r4 == r1) goto L95
            int r6 = com.ironsource.adqualitysdk.sdk.p009i.C2686bq.f5301
            int r6 = r6 + 109
            int r6 = r6 % 128
            com.ironsource.adqualitysdk.sdk.p009i.C2686bq.f5300 = r6
            r6 = 0
            return r6
        L95:
            com.fyber.fairbid.internal.Constants$AdType r6 = com.fyber.fairbid.internal.Constants.AdType.REWARDED
            return r6
        L98:
            com.fyber.fairbid.internal.Constants$AdType r6 = com.fyber.fairbid.internal.Constants.AdType.INTERSTITIAL
            return r6
        L9b:
            com.fyber.fairbid.internal.Constants$AdType r6 = com.fyber.fairbid.internal.Constants.AdType.BANNER
            return r6
        L9e:
            com.fyber.fairbid.internal.Constants$AdType r6 = com.fyber.fairbid.internal.Constants.AdType.UNKNOWN
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.p009i.C2686bq.m5720(java.lang.String):com.fyber.fairbid.internal.Constants$AdType");
    }

    /* renamed from: ﻐ */
    private static PlacementsHandler m5726(MediationManager mediationManager) {
        int i = f5301 + 85;
        f5300 = i % 128;
        int i2 = i % 2;
        PlacementsHandler placementsHandler = mediationManager.getPlacementsHandler();
        if (i2 == 0) {
            int i3 = 83 / 0;
        }
        return placementsHandler;
    }

    /* renamed from: ﻛ */
    public static /* synthetic */ String m5732(ImpressionData impressionData) {
        f5301 = (f5300 + InterfaceC3173h3.d.b.f8819b) % 128;
        String strM5712 = m5712(impressionData);
        f5300 = (f5301 + 99) % 128;
        return strM5712;
    }

    /* renamed from: ﾇ */
    public static /* synthetic */ String m5745(ImpressionData impressionData) {
        f5300 = (f5301 + 23) % 128;
        String strM5713 = m5713(impressionData);
        int i = f5300 + 23;
        f5301 = i % 128;
        if (i % 2 == 0) {
            return strM5713;
        }
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0033  */
    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg
    /* renamed from: ｋ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Class mo5382(java.lang.String r22) {
        /*
            Method dump skipped, instructions count: 906
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.p009i.C2686bq.mo5382(java.lang.String):java.lang.Class");
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg
    /* renamed from: ﾒ */
    public final String mo5383() {
        int i = f5301 + 93;
        f5300 = i % 128;
        try {
            try {
                return (String) (i % 2 == 0 ? FairBid.class.getDeclaredField(m5733("嚽骺涴븈塎㛧綮䠳₺媯羦햆", (-16777205) >> Color.rgb(0, 1, 1)).intern()) : FairBid.class.getDeclaredField(m5733("嚽骺涴븈塎㛧綮䠳₺媯羦햆", (-16777205) - Color.rgb(0, 0, 0)).intern())).get(null);
            } catch (Exception unused) {
                return C2849hr.m6916().m6919().m6988(FairBid.class, m5727((byte) (KeyEvent.keyCodeFromString("") + 116), "\u001b\u0015\u001e\u0000\u001e\u001f\u0018\"\"\u0016\u001e\u0000\u001e\u001f\u0018\"\"\u0016\u001e\u0000\u001e\u001f\u0098", 23 - View.MeasureSpec.getSize(0)).intern());
            }
        } catch (Exception unused2) {
            return null;
        }
    }

    /* renamed from: ﻐ */
    private static void m5729(InterstitialListener interstitialListener) {
        int i = f5300 + 99;
        f5301 = i % 128;
        int i2 = i % 2;
        Interstitial.setInterstitialListener(interstitialListener);
        if (i2 != 0) {
            int i3 = 77 / 0;
        }
        int i4 = f5301 + 109;
        f5300 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ﻛ */
    public static /* synthetic */ void m5735(RewardedListener rewardedListener) {
        int i = f5300 + 81;
        f5301 = i % 128;
        int i2 = i % 2;
        m5741(rewardedListener);
        if (i2 != 0) {
            throw null;
        }
        int i3 = f5301 + 23;
        f5300 = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ﾇ */
    public static /* synthetic */ String m5746(Placement placement) {
        int i = f5301 + 45;
        f5300 = i % 128;
        if (i % 2 == 0) {
            m5739(placement);
            throw null;
        }
        String strM5739 = m5739(placement);
        int i2 = f5301 + 71;
        f5300 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 44 / 0;
        }
        return strM5739;
    }

    /* renamed from: ﻐ */
    private static String m5727(byte b, String str, int i) {
        String str2;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (C2858i.f6710) {
            try {
                char[] cArr2 = f5303;
                char c = f5302;
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

    /* renamed from: ﾇ */
    public static /* synthetic */ List m5747(MediationConfig mediationConfig) {
        int i = f5301 + 19;
        f5300 = i % 128;
        if (i % 2 != 0) {
            return m5734(mediationConfig);
        }
        m5734(mediationConfig);
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg
    /* renamed from: ﻛ */
    public final Map<String, AbstractC2676bg.b> mo5381() {
        HashMap map = new HashMap();
        map.put(m5733("౺⁖\ueb33짧ⷲ\ue3af喣\ue790\uf81b鎟\ud9b0ꙴ졩ꖥ㘄ᵀ౺⁖橇艹꿮獗從ࡡຟ鲋\uef3d꺓", 27 - (ViewConfiguration.getPressedStateDuration() >> 16)).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bq.5
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                return C2686bq.m5717();
            }
        });
        map.put(m5733("౺⁖ꆄ࠘嬸枙齡먞䷫\ue190硊᭭ᄣ⬝\ue663ꝫ\uf238\uea43ᨾ깼ꭶ\ue93f", Color.alpha(0) + 22).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bq.15
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                return C2686bq.m5742((Constants.AdType) list.get(0));
            }
        });
        map.put(m5727((byte) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 27), "\u000f\b\f(\u000e\u0018\b\u0002\u008e\u008e\u0004\u0000\r\u001c\u0005\u0006\u0000\u0012\u0012\u0001\u000f\u0002\u000f\u0003\f\u0000\u0014\u000e\u0016\u0000", (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 30).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bq.11
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                return C2686bq.m5725((ImpressionData) list.get(0));
            }
        });
        map.put(m5733("౺⁖弒懠㣼ﴎ㞒惋ゎᵬﬅ薶⌷\udee2잤컡壥\u0590䤐頲ཱ喽\ue9e4朁䶼ʕ丏ꀣ䢆\udb67", (ViewConfiguration.getEdgeSlop() >> 16) + 29).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bq.19
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                return C2686bq.m5738((ImpressionData) list.get(0));
            }
        });
        map.put(m5727((byte) (9 - Color.alpha(0)), "\u000f\b\f(\u000e\u0018\b\u0002||\u0004\u0000\r\u001c\u0005\u0006\u0000'\u0000\b\u0003\u0002\n\u0002\b\t\u0017\u0001%&\u0002\b\n\u0004\u0000\r", 36 - Color.alpha(0)).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bq.17
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                return C2686bq.m5750((ImpressionData) list.get(0));
            }
        });
        map.put(m5727((byte) (View.resolveSize(0, 0) + 62), "\u000f\b\f(\u000e\u0018\b\u0002±±\u0004\u0000\r\u001c\u0005\u0006\u0006 \u0003\u000f\u0000\u000b\u0001\u0017\u0003)\u0010\u0017£", (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 29).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bq.18
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                return C2686bq.m5732((ImpressionData) list.get(0));
            }
        });
        map.put(m5727((byte) (ExpandableListView.getPackedPositionChild(0L) + 36), "\u000f\b\f(\u000e\u0018\b\u0002\u0096\u0096\u0004\u0000\r\u001c\u0005\u0006\u0002'\u0002\u000b\u0004\u0005\f\u0000\u001e\u0005", 26 - KeyEvent.getDeadChar(0, 0)).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bq.20
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                return C2686bq.m5745((ImpressionData) list.get(0));
            }
        });
        map.put(m5733("౺⁖弒懠㣼ﴎ㞒惋ゎᵬﬅ薶⌷\udee2잤컡\ue5fc㦲ꩬ阃ꤥ泮楀\ue614졭㗾", (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 27).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bq.16
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                return Double.valueOf(C2686bq.m5723((ImpressionData) list.get(0)));
            }
        });
        map.put(m5727((byte) (6 - (ViewConfiguration.getTapTimeout() >> 16)), "\u000f\b\f(\u000e\u0018\b\u0002yy\u0004\u0000\r\u001c\u0005\u0006\u0005\u000b\b\u0002\u0005\u0006\u0004&\u0005\u001dj", 27 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bq.24
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                return C2686bq.m5718((ImpressionData) list.get(0));
            }
        });
        map.put(m5733("౺⁖弒懠㣼ﴎ㞒惋ゎᵬﬅ薶⌷\udee2잤컡䖦卧蟫\uf7f0嘲럲\uf81b鎟옥喪霑ࠐ懵쩧\ud9c6기㥿侵", Drawable.resolveOpacity(0, 0) + 33).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bq.2
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                return C2686bq.m5721((ImpressionData) list.get(0));
            }
        });
        map.put(m5727((byte) (5 - View.resolveSize(0, 0)), "\u000f\b\f(\u000e\u0018\b\u0002xx\u0004\u0000\r\u001c\u0005\u0006\u0005\u000b\u0003\u0012\u0019\u0000\u0001\n\f\u001ci", ((byte) KeyEvent.getModifierMetaStateMask()) + 28).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bq.4
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                return C2686bq.m5719((ImpressionData) list.get(0));
            }
        });
        map.put(m5733("౺⁖ꆄ࠘ぇ≭ɾ묬", (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 8).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bq.1
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                return C2686bq.m5731((FairBid.AdsConfig) list.get(0));
            }
        });
        map.put(m5733("౺⁖睡₈컄൚㞒惋", TextUtils.indexOf("", "", 0, 0) + 8).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bq.3
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                return C2686bq.m5728((FairBid.AdsConfig) list.get(0));
            }
        });
        map.put(m5727((byte) ((Process.myPid() >> 22) + 25), "\u000f\b\u0003\f\u0003\u0005\u001a\u0000\u0002\b\r\u0005\b\u0007\u0001\n%\n\u0005\u0006\u0004\u0000\b\f", (ViewConfiguration.getPressedStateDuration() >> 16) + 24).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bq.7
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                return C2686bq.m5747((MediationConfig) list.get(0));
            }
        });
        map.put(m5733("౺⁖䇶岐硊᭭ᄣ⬝\ue663ꝫ\uf238\uea43\ue776Ȍᨾ깼ꭶ\ue93f", ((byte) KeyEvent.getModifierMetaStateMask()) + 19).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bq.8
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                return C2686bq.m5730((Placement) list.get(0));
            }
        });
        map.put(m5733("౺⁖䇶岐硊᭭ᄣ⬝\ue663ꝫ\uf238\uea43땙Ⓥ\ue663ꝫ", 15 - TextUtils.lastIndexOf("", '0', 0, 0)).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bq.10
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                return C2686bq.m5746((Placement) list.get(0));
            }
        });
        map.put(m5733("౺⁖䇶岐硊᭭ᄣ⬝\ue663ꝫ\uf238\uea43\ueaa7팚⣞銥識\u177d嘲럲", (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 20).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bq.6
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                return C2686bq.m5749((MediationManager) list.get(0));
            }
        });
        map.put(m5727((byte) (Color.red(0) + 124), "\u000f\b\u0003\f\u0005\u0010\u000e\u001b\u0005$\n#é", 12 - TextUtils.lastIndexOf("", '0', 0)).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bq.9
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                return C2686bq.m5743((String) list.get(0));
            }
        });
        map.put(m5733("옥喪弒懠\uf238\uea43嘲럲ി⢆䓐⼑喣\ue790訔\uef54퀏ꪰ\uea5e\ud995邅뾠䃲ꦬ", Gravity.getAbsoluteGravity(0, 0) + 23).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bq.13
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                C2686bq.m5740((InterstitialListener) list.get(0));
                return null;
            }
        });
        map.put(m5727((byte) (64 - (ViewConfiguration.getTapTimeout() >> 16)), "\b\u0004\u0000(\u0003\u0016\u0002\u000b\u0003\u0002\u0006%\u0004\n\u0006\u0002\b\u0000²", (ViewConfiguration.getTouchSlop() >> 8) + 19).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bq.12
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                C2686bq.m5735((RewardedListener) list.get(0));
                return null;
            }
        });
        map.put(m5727((byte) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 119), "\u000b\u0012\b\u0004\f\u0002\u001a\u0001\u0002\u000b\u0006\u0002Ú", (ViewConfiguration.getKeyRepeatDelay() >> 16) + 13).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bq.14
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                return Boolean.valueOf(C2686bq.m5722());
            }
        });
        int i = f5300 + 79;
        f5301 = i % 128;
        if (i % 2 == 0) {
            return map;
        }
        throw null;
    }

    /* renamed from: ﾇ */
    private static String m5744(FairBid.AdsConfig adsConfig) {
        int i = f5300 + 67;
        f5301 = i % 128;
        int i2 = i % 2;
        String str = adsConfig.store;
        if (i2 == 0) {
            return str;
        }
        throw null;
    }

    /* renamed from: ﾒ */
    private static Constants.AdType m5748(Placement placement) {
        int i = f5301 + 91;
        f5300 = i % 128;
        if (i % 2 == 0) {
            placement.getAdType();
            throw null;
        }
        Constants.AdType adType = placement.getAdType();
        f5300 = (f5301 + 125) % 128;
        return adType;
    }

    /* renamed from: ﻛ */
    private static List<AdapterConfiguration> m5734(MediationConfig mediationConfig) {
        int i = f5301 + 71;
        f5300 = i % 128;
        if (i % 2 != 0) {
            return mediationConfig.getAdapterConfigurations();
        }
        mediationConfig.getAdapterConfigurations();
        throw null;
    }

    /* renamed from: ﻛ */
    private static String m5733(String str, int i) {
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
                            char c3 = (char) (c - (((c2 + i3) ^ ((c2 << 4) + f5305)) ^ ((c2 >>> 5) + f5304)));
                            cArr3[1] = c3;
                            cArr3[0] = (char) (c2 - (((c3 >>> 5) + f5306) ^ ((c3 + i3) ^ ((c3 << 4) + f5307))));
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

    /* renamed from: ｋ */
    private static PlacementType m5736(Constants.AdType adType) {
        int i = f5301 + 53;
        f5300 = i % 128;
        int i2 = i % 2;
        PlacementType placementType = adType.getPlacementType();
        if (i2 == 0) {
            int i3 = 86 / 0;
        }
        return placementType;
    }

    /* renamed from: ｋ */
    private static String m5737(FairBid.AdsConfig adsConfig) {
        f5301 = (f5300 + 7) % 128;
        String str = adsConfig.appId;
        f5300 = (f5301 + 95) % 128;
        return str;
    }

    /* renamed from: ｋ */
    private static String m5739(Placement placement) {
        int i = f5301 + 65;
        f5300 = i % 128;
        if (i % 2 == 0) {
            placement.getName();
            throw null;
        }
        String name = placement.getName();
        f5300 = (f5301 + InterfaceC3173h3.d.b.f8821d) % 128;
        return name;
    }

    /* renamed from: ｋ */
    private static void m5741(RewardedListener rewardedListener) {
        f5301 = (f5300 + 5) % 128;
        Rewarded.setRewardedListener(rewardedListener);
        f5300 = (f5301 + 61) % 128;
    }
}
