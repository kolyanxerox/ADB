package com.ironsource.adqualitysdk.sdk.p009i;

import android.graphics.ImageFormat;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg;
import com.ogury.ad.OguryInterstitialAd;
import com.ogury.ad.OguryInterstitialAdListener;
import com.ogury.ad.OguryRewardedAd;
import com.ogury.ad.OguryRewardedAdListener;
import com.ogury.sdk.Ogury;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.by */
/* loaded from: classes2.dex */
public final class C2694by extends AbstractC2676bg {

    /* renamed from: ﻛ */
    private static int f5476 = 110;

    /* renamed from: ｋ */
    private static int f5477 = 1;

    /* renamed from: ﾇ */
    private static long f5478 = -477283186974895620L;

    /* renamed from: ﾒ */
    private static int f5479;

    public C2694by(String str) {
        super(str);
    }

    /* renamed from: ﻐ */
    private static String m5974(String str, int i) {
        String str2;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (C2777f.f6322) {
            try {
                char[] cArrM6790 = C2777f.m6790(f5478, cArr, i);
                C2777f.f6321 = 4;
                while (true) {
                    int i2 = C2777f.f6321;
                    if (i2 < cArrM6790.length) {
                        C2777f.f6320 = i2 - 4;
                        cArrM6790[i2] = (char) ((cArrM6790[i2] ^ cArrM6790[i2 % 4]) ^ (r2 * f5478));
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
    public static /* synthetic */ void m5977(OguryRewardedAd oguryRewardedAd, OguryRewardedAdListener oguryRewardedAdListener) {
        int i = f5477 + 67;
        f5479 = i % 128;
        int i2 = i % 2;
        m5979(oguryRewardedAd, oguryRewardedAdListener);
        if (i2 != 0) {
            int i3 = 76 / 0;
        }
    }

    /* renamed from: ﾇ */
    public static /* synthetic */ void m5978(OguryInterstitialAd oguryInterstitialAd, OguryInterstitialAdListener oguryInterstitialAdListener) {
        int i = f5479 + 119;
        f5477 = i % 128;
        int i2 = i % 2;
        m5975(oguryInterstitialAd, oguryInterstitialAdListener);
        if (i2 == 0) {
            int i3 = 78 / 0;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg
    /* renamed from: ﻛ */
    public final Map<String, AbstractC2676bg.b> mo5381() {
        HashMap map = new HashMap();
        map.put(m5976(11 - TextUtils.lastIndexOf("", '0', 0), (ViewConfiguration.getWindowTouchSlop() >> 8) + 25, ImageFormat.getBitsPerPixel(0) + 215, "\ufff9\u0004\uffd9￼￤\u0001\u000b\f�\u0006�\n\u000b�\f￡\u0006\f�\n\u000b\f\u0001\f\u0001", false).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.by.5
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                C2694by.m5978((OguryInterstitialAd) list.get(0), (OguryInterstitialAdListener) list.get(1));
                return null;
            }
        });
        map.put(m5974("滎醌溽쀕⬚徑⥛ࠗ挟袖\uaa37鞡\ue14a瀵묪⾢륺렌\uf337枀煺\ue055䭀뿦ऌ", (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.by.1
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                C2694by.m5977((OguryRewardedAd) list.get(0), (OguryRewardedAdListener) list.get(1));
                return null;
            }
        });
        f5479 = (f5477 + 49) % 128;
        return map;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg
    /* renamed from: ﾒ */
    public final String mo5383() {
        f5479 = (f5477 + 21) % 128;
        try {
            String sdkVersion = Ogury.getSdkVersion();
            f5479 = (f5477 + 61) % 128;
            return sdkVersion;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: ﾇ */
    private static void m5979(OguryRewardedAd oguryRewardedAd, OguryRewardedAdListener oguryRewardedAdListener) {
        int i = f5477 + 37;
        f5479 = i % 128;
        int i2 = i % 2;
        oguryRewardedAd.setListener(oguryRewardedAdListener);
        if (i2 != 0) {
            int i3 = 46 / 0;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0152  */
    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg
    /* renamed from: ｋ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Class mo5382(java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 420
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.p009i.C2694by.mo5382(java.lang.String):java.lang.Class");
    }

    /* renamed from: ﻛ */
    private static void m5975(OguryInterstitialAd oguryInterstitialAd, OguryInterstitialAdListener oguryInterstitialAdListener) {
        int i = f5479 + 53;
        f5477 = i % 128;
        int i2 = i % 2;
        oguryInterstitialAd.setListener(oguryInterstitialAdListener);
        if (i2 == 0) {
            throw null;
        }
    }

    /* renamed from: ｋ */
    private static String m5976(int i, int i2, int i3, String str, boolean z) {
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
                    cArr2[i5] = (char) (cArr2[i5] - f5476);
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
}
