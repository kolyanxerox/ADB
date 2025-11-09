package com.ironsource.adqualitysdk.sdk.p009i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.facebook.ads.Ad;
import com.facebook.ads.AdListener;
import com.facebook.ads.AdView;
import com.facebook.ads.BuildConfig;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdListener;
import com.facebook.ads.internal.adapters.AdAdapter;
import com.facebook.ads.internal.dynamicloading.DynamicLoader;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;
import com.facebook.ads.internal.protocol.AdPlacementType;
import com.facebook.ads.internal.settings.AdSdkVersion;
import com.ironsource.InterfaceC3173h3;
import com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.bn */
/* loaded from: classes2.dex */
public final class C2683bn extends AbstractC2676bg {

    /* renamed from: ﱡ */
    private static int f5250 = 0;

    /* renamed from: ﻏ */
    private static int f5251 = 1;

    /* renamed from: ﻐ */
    private static short[] f5252 = null;

    /* renamed from: ﻛ */
    private static int f5253 = 376809258;

    /* renamed from: ﾇ */
    private static int f5255 = -326310726;

    /* renamed from: ﾒ */
    private static int f5256 = 50;

    /* renamed from: ｋ */
    private static byte[] f5254 = {-7, 24, -28, 17, 26, -24, 54, -56, 54, 83, -67, 82, -77, 98, 82, -6, 78, 66, 114, -126, -67, 65, 76, -68, 67, 67, -70, 121, -128, -65, 77, -59, -57, 21, -48, 54, 57, -56, 56, 50, 50, -59, 44, -36, 19, -15, 11, -11, 13, -3, -10, -31, 20, -33, 46, -10, -3, 7, -17, 14, 3, -3, 14, -19, 22, -18, -17, -108, 101, -67, -74, 76, -92, 69, 72, -74, 69, -90, 93, -91, -92, -56, -58, 62, -64, 56, -36, -17, 27, 52, -50, 53, -50, -62, -38, 36, -49, 56, -60, 49, -56, 34, -7, -34, 118, -62, -50, -2, 14, 49, -51, -64, 48, -49, -49, 54, -11, 12, 51, -63, 114, -98, 92, -90, 81, 92, 78, -116, -66, 92, -92, 66, 66, 66, -72, 70, -66, 78, 69, 82, -89, 108, -109, -96, 66, -70, 92, 92, 73, -89, 72, -72, 91, 85, -88, 80, -93, -90, 121, -123, 74, -82, -84, 73, -86, 82, 125, 71, 92, -83, -67, 90, 81, -107, 66, -76, 70, -69, 107, -108, -89, 69, -67, 91, 91, 68, -90, -87, 71, -88, 73, -104, 111, 69, 70, -105, 89, -96, 110, -67, -78, 67, -77, -71, -71, 78, -89, 103, -76, 69, -35, 42, 0, 3, -46, 28, -27, 43, -8, -9, 6, -10, -4, -4, 11, -30, 34, -15, 0, -69, 65, -65, 71, -73, -68, -85, 94, -107, 99, -67, 91, -67, 67, -73, -73, -69, 71, -80, -109, 99, -71, 68, 110, 98, 96, -111, 64, -118, -103, -97, 111, -112, -106, 86, -77, 108, -99, 21, 23, -59, 61, -14, 28, 19, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    /* renamed from: ﱟ */
    private static int[] f5249 = {-430698963, -2003236910, -2029704512, 1951320306, -1215273134, 196410576, 649184828, -1146103415, 1169575746, -1044387006, -1033512969, 439963913, 1979789364, 1515421723, -1870450121, 1762292628, -1169026890, 1037321564};

    public C2683bn(String str) {
        super(str);
    }

    /* renamed from: ﭖ */
    public static /* synthetic */ DynamicLoader m5641() {
        int i = f5250 + 115;
        f5251 = i % 128;
        if (i % 2 != 0) {
            return m5644();
        }
        m5644();
        throw null;
    }

    /* renamed from: ﭴ */
    private static String m5642() {
        f5250 = (f5251 + 43) % 128;
        String strIntern = m5649((byte) ((-32) - View.MeasureSpec.getMode(0)), (short) View.resolveSizeAndState(0, 0, 0), (-42) - ((Process.getThreadPriority(0) + 20) >> 6), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) - 376808991, 326310844 - View.combineMeasuredStates(0, 0)).intern();
        f5250 = (f5251 + 17) % 128;
        return strIntern;
    }

    /* renamed from: ﮉ */
    private static String m5643() {
        f5250 = (f5251 + 117) % 128;
        String strIntern = m5651(new int[]{1207198177, 625223037, -552261088, 1662369656, 468022935, -2056893454, -1948063090, -1876406516, -1333808309, 969285805, -1368876728, -628603570, -18120543, 158410549, -802175160, 400720799, 1263160242, 1604999795}, 34 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)).intern();
        f5251 = (f5250 + InterfaceC3173h3.d.b.f8826i) % 128;
        return strIntern;
    }

    /* renamed from: ﮌ */
    private static DynamicLoader m5644() {
        int i = f5250 + 31;
        f5251 = i % 128;
        if (i % 2 != 0) {
            return DynamicLoaderFactory.getDynamicLoader();
        }
        int i2 = 99 / 0;
        return DynamicLoaderFactory.getDynamicLoader();
    }

    /* renamed from: ﮐ */
    public static /* synthetic */ String m5645() {
        int i = f5251 + 99;
        f5250 = i % 128;
        if (i % 2 == 0) {
            return m5642();
        }
        m5642();
        throw null;
    }

    /* renamed from: ﱡ */
    public static /* synthetic */ String m5646() {
        f5251 = (f5250 + 125) % 128;
        String strM5643 = m5643();
        int i = f5250 + 81;
        f5251 = i % 128;
        if (i % 2 != 0) {
            return strM5643;
        }
        throw null;
    }

    /* renamed from: ﻐ */
    public static /* synthetic */ WeakHashMap m5647(C2683bn c2683bn, WeakHashMap weakHashMap, InterfaceC2704ch interfaceC2704ch) {
        f5250 = (f5251 + 99) % 128;
        WeakHashMap<View, WeakReference<Object>> weakHashMapM5655 = c2683bn.m5655(weakHashMap, interfaceC2704ch);
        f5250 = (f5251 + 41) % 128;
        return weakHashMapM5655;
    }

    /* renamed from: ﻛ */
    public static /* synthetic */ void m5652(AdView adView, AdListener adListener) {
        f5250 = (f5251 + 99) % 128;
        m5648(adView, adListener);
        f5250 = (f5251 + 31) % 128;
    }

    /* renamed from: ｋ */
    public static /* synthetic */ AdPlacementType m5653(AdAdapter adAdapter) {
        int i = f5250 + 99;
        f5251 = i % 128;
        if (i % 2 != 0) {
            return m5658(adAdapter);
        }
        m5658(adAdapter);
        throw null;
    }

    /* renamed from: ﾇ */
    public static /* synthetic */ void m5657(InterstitialAd interstitialAd, InterstitialAdListener interstitialAdListener) {
        int i = f5250 + 13;
        f5251 = i % 128;
        int i2 = i % 2;
        m5660(interstitialAd, interstitialAdListener);
        if (i2 == 0) {
            throw null;
        }
        f5250 = (f5251 + 21) % 128;
    }

    /* renamed from: ﾒ */
    public static /* synthetic */ String m5659(Ad ad) {
        f5250 = (f5251 + 107) % 128;
        String strM5656 = m5656(ad);
        int i = f5251 + 73;
        f5250 = i % 128;
        if (i % 2 == 0) {
            return strM5656;
        }
        throw null;
    }

    /* renamed from: ﻐ */
    private static void m5648(AdView adView, AdListener adListener) {
        int i = f5250 + 123;
        f5251 = i % 128;
        int i2 = i % 2;
        adView.setAdListener(adListener);
        if (i2 == 0) {
            int i3 = 19 / 0;
        }
    }

    /* renamed from: ｋ */
    public static /* synthetic */ String m5654(AdView adView) {
        int i = f5251 + 87;
        f5250 = i % 128;
        int i2 = i % 2;
        String strM5650 = m5650(adView);
        if (i2 != 0) {
            int i3 = 31 / 0;
        }
        int i4 = f5250 + 117;
        f5251 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 51 / 0;
        }
        return strM5650;
    }

    /* renamed from: ﾇ */
    private static String m5656(Ad ad) {
        f5250 = (f5251 + 77) % 128;
        String placementId = ad.getPlacementId();
        f5250 = (f5251 + 45) % 128;
        return placementId;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg
    /* renamed from: ﻛ */
    public final Map<String, AbstractC2676bg.b> mo5381() {
        HashMap map = new HashMap();
        map.put(m5649((byte) ((ViewConfiguration.getWindowTouchSlop() >> 8) - 69), (short) (ViewConfiguration.getTouchSlop() >> 8), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 27, Color.argb(0, 0, 0, 0) - 376809071, Color.rgb(0, 0, 0) + 343088045).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bn.5
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                return C2683bn.m5654((AdView) list.get(0));
            }
        });
        map.put(m5649((byte) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) - 2), (short) (ViewConfiguration.getTouchSlop() >> 8), (ViewConfiguration.getKeyRepeatDelay() >> 16) - 30, Color.red(0) - 376809048, (Process.myPid() >> 22) + 326310829).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bn.3
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                return C2683bn.m5659((Ad) list.get(0));
            }
        });
        map.put(m5651(new int[]{-1861075117, 351407506, -1495300914, -1361763390, -2005380754, 131337817, -458278376, -1074906245}, (ViewConfiguration.getPressedStateDuration() >> 16) + 13).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bn.4
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                C2683bn.m5652((AdView) list.get(0), (AdListener) list.get(1));
                return null;
            }
        });
        map.put(m5651(new int[]{-318815349, 1452408044, 916972031, 95267109, -1099077259, -233885232, 1610148717, 265292137, -271549054, -641244792, -1206054019, -1028182396, -630354702, 1158313358, -74295664, -1416545899, 515022916, -24728399, 556655568, 1109276888}, (-16777179) - Color.rgb(0, 0, 0)).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bn.2
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                return C2683bn.m5645();
            }
        });
        map.put(m5651(new int[]{-318815349, 1452408044, 916972031, 95267109, -1099077259, -233885232, 1610148717, 265292137, -271549054, -641244792, -1206054019, -1028182396, -1619139838, -1370766182, -1533346972, -1936936767, -467045401, -160544948, 1814198522, -784110289, -227085412, 991057580}, Color.red(0) + 42).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bn.1
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                return C2683bn.m5646();
            }
        });
        map.put(m5649((byte) (ExpandableListView.getPackedPositionGroup(0L) - 74), (short) Color.green(0), TextUtils.lastIndexOf("", '0', 0) - 25, View.MeasureSpec.getSize(0) - 376809029, 326310840 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bn.6
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                C2683bn.m5657((InterstitialAd) list.get(0), (InterstitialAdListener) list.get(1));
                return null;
            }
        });
        map.put(m5649((byte) (99 - View.resolveSizeAndState(0, 0, 0)), (short) ((-1) - ImageFormat.getBitsPerPixel(0)), (-34) - ((Process.getThreadPriority(0) + 20) >> 6), (-376809006) - TextUtils.getCapsMode("", 0, 0), 326310828 - Process.getGidForName("")).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bn.7
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                return C2683bn.m5641();
            }
        });
        map.put(m5651(new int[]{1599751928, 1498067375, 898044856, -2021296126, -551133019, 1705189397, -145177279, -552826620}, AndroidCharacter.getMirror('0') - ' ').intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bn.10
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                return C2683bn.m5653((AdAdapter) list.get(0));
            }
        });
        map.put(m5651(new int[]{1436340282, 1208694166, 1629176647, 850675859, -535135762, -1208643697, 302138615, 1270218642, -594155615, -1430388808, -1392522205, -1719649913, 91392489, -852233752}, ((byte) KeyEvent.getModifierMetaStateMask()) + 28).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bn.9
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                return C2683bn.m5647(C2683bn.this, (WeakHashMap) list.get(0), interfaceC2704ch);
            }
        });
        f5250 = (f5251 + 87) % 128;
        return map;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg
    /* renamed from: ﾒ */
    public final String mo5383() {
        int i = f5251 + 75;
        f5250 = i % 128;
        try {
            try {
                try {
                    if (i % 2 != 0) {
                        throw null;
                    }
                    String str = (String) C2849hr.m6916().m6918().m6889(AdSdkVersion.class, String.class).get(null);
                    f5251 = (f5250 + 79) % 128;
                    return str;
                } catch (Throwable unused) {
                    return null;
                }
            } catch (Throwable unused2) {
                return C2849hr.m6916().m6919().m6988(BuildConfig.class, m5651(new int[]{-111118604, 1523175981, 1399725015, 857004947, -1801980406, 1287523742}, (ViewConfiguration.getEdgeSlop() >> 16) + 11).intern());
            }
        } catch (Throwable unused3) {
            return (String) C2849hr.m6916().m6918().m6889(AdSdkVersion.class, String.class).get(null);
        }
    }

    /* renamed from: com.ironsource.adqualitysdk.sdk.i.bn$b */
    public class b extends WeakHashMap<View, WeakReference<Object>> implements InterfaceC2838hg<WeakHashMap<View, WeakReference<Object>>> {

        /* renamed from: ﻛ */
        private static int f5266 = 0;

        /* renamed from: ｋ */
        private static int[] f5267 = {-385886798, 745331598, 1831195489, 2045223183, -960637106, 295959003, -1232580144, -1952370024, 537905372, 127981140, 117572922, -1317577429, -1123801853, -1836623907, -1860457439, 872741355, -2144286434, 232608061};

        /* renamed from: ﾇ */
        private static int f5268 = 1;

        /* renamed from: ﾒ */
        private InterfaceC2704ch f5270;

        public b(WeakHashMap<View, WeakReference<Object>> weakHashMap, InterfaceC2704ch interfaceC2704ch) {
            super(weakHashMap);
            this.f5270 = interfaceC2704ch;
        }

        /* renamed from: ﻐ */
        private static String m5661(int[] iArr, int i) {
            String str;
            synchronized (C2723d.f5953) {
                try {
                    char[] cArr = new char[4];
                    char[] cArr2 = new char[iArr.length << 1];
                    int[] iArr2 = (int[]) f5267.clone();
                    C2723d.f5951 = 0;
                    while (true) {
                        int i2 = C2723d.f5951;
                        if (i2 < iArr.length) {
                            int i3 = iArr[i2];
                            char c = (char) (i3 >> 16);
                            cArr[0] = c;
                            char c2 = (char) i3;
                            cArr[1] = c2;
                            char c3 = (char) (iArr[i2 + 1] >> 16);
                            cArr[2] = c3;
                            char c4 = (char) iArr[i2 + 1];
                            cArr[3] = c4;
                            C2723d.f5954 = (c << 16) + c2;
                            C2723d.f5952 = (c3 << 16) + c4;
                            C2723d.m6462(iArr2);
                            for (int i4 = 0; i4 < 16; i4++) {
                                int i5 = C2723d.f5954 ^ iArr2[i4];
                                C2723d.f5954 = i5;
                                int iM6461 = C2723d.m6461(i5) ^ C2723d.f5952;
                                int i6 = C2723d.f5954;
                                C2723d.f5954 = iM6461;
                                C2723d.f5952 = i6;
                            }
                            int i7 = C2723d.f5954;
                            int i8 = C2723d.f5952;
                            C2723d.f5954 = i8;
                            C2723d.f5952 = i7;
                            int i9 = i7 ^ iArr2[16];
                            C2723d.f5952 = i9;
                            int i10 = i8 ^ iArr2[17];
                            C2723d.f5954 = i10;
                            cArr[0] = (char) (i10 >>> 16);
                            cArr[1] = (char) i10;
                            cArr[2] = (char) (i9 >>> 16);
                            cArr[3] = (char) i9;
                            C2723d.m6462(iArr2);
                            int i11 = C2723d.f5951;
                            cArr2[i11 << 1] = cArr[0];
                            cArr2[(i11 << 1) + 1] = cArr[1];
                            cArr2[(i11 << 1) + 2] = cArr[2];
                            cArr2[(i11 << 1) + 3] = cArr[3];
                            C2723d.f5951 = i11 + 2;
                        } else {
                            str = new String(cArr2, 0, i);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return str;
        }

        /* renamed from: ﾇ */
        private WeakReference<Object> m5662(View view, WeakReference<Object> weakReference) {
            f5266 = (f5268 + 17) % 128;
            C2683bn.this.m5464(this, this.f5270, m5661(new int[]{879552831, 1518624264, -1886429358, -2104164823, 1673675908, -946979709, 84609426, -1772777691, -1823747821, -1098701446, 1269215863, 1813292483}, 23 - (ViewConfiguration.getPressedStateDuration() >> 16)).intern(), view, weakReference);
            WeakReference<Object> weakReference2 = (WeakReference) super.put(view, weakReference);
            int i = f5268 + 85;
            f5266 = i % 128;
            if (i % 2 == 0) {
                return weakReference2;
            }
            throw null;
        }

        @Override // java.util.WeakHashMap, java.util.AbstractMap, java.util.Map
        public /* synthetic */ Object put(Object obj, Object obj2) {
            f5266 = (f5268 + InterfaceC3173h3.d.b.f8821d) % 128;
            WeakReference<Object> weakReferenceM5662 = m5662((View) obj, (WeakReference) obj2);
            int i = f5266 + 7;
            f5268 = i % 128;
            if (i % 2 != 0) {
                return weakReferenceM5662;
            }
            throw null;
        }

        @Override // com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2838hg
        /* renamed from: ﻛ */
        public final /* synthetic */ WeakHashMap<View, WeakReference<Object>> mo5387() {
            int i = f5266 + 71;
            f5268 = i % 128;
            if (i % 2 == 0) {
                m5663();
                throw null;
            }
            WeakHashMap<View, WeakReference<Object>> weakHashMapM5663 = m5663();
            int i2 = f5266 + 39;
            f5268 = i2 % 128;
            if (i2 % 2 != 0) {
                return weakHashMapM5663;
            }
            throw null;
        }

        /* renamed from: ﾇ */
        private WeakHashMap<View, WeakReference<Object>> m5663() {
            int i = f5266 + 121;
            f5268 = i % 128;
            if (i % 2 == 0) {
                int i2 = 54 / 0;
            }
            return this;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:89:0x047d  */
    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg
    /* renamed from: ｋ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Class mo5382(java.lang.String r30) {
        /*
            Method dump skipped, instructions count: 1580
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.p009i.C2683bn.mo5382(java.lang.String):java.lang.Class");
    }

    /* renamed from: ﾒ */
    private static void m5660(InterstitialAd interstitialAd, InterstitialAdListener interstitialAdListener) {
        int i = f5251 + 121;
        f5250 = i % 128;
        int i2 = i % 2;
        interstitialAd.setAdListener(interstitialAdListener);
        if (i2 != 0) {
            throw null;
        }
    }

    /* renamed from: ﾒ */
    private static AdPlacementType m5658(AdAdapter adAdapter) {
        f5251 = (f5250 + 99) % 128;
        AdPlacementType placementType = adAdapter.getPlacementType();
        f5250 = (f5251 + 21) % 128;
        return placementType;
    }

    /* renamed from: ﻛ */
    private static String m5650(AdView adView) {
        f5251 = (f5250 + 5) % 128;
        String placementId = adView.getPlacementId();
        f5251 = (f5250 + 51) % 128;
        return placementId;
    }

    /* renamed from: ﻛ */
    private static String m5649(byte b2, short s, int i, int i2, int i3) {
        String string;
        synchronized (C2912k.f7200) {
            try {
                StringBuilder sb = new StringBuilder();
                int i4 = f5256;
                int i5 = i + i4;
                int i6 = i5 == -1 ? 1 : 0;
                if (i6 != 0) {
                    byte[] bArr = f5254;
                    if (bArr != null) {
                        i5 = (byte) (bArr[f5253 + i2] + i4);
                    } else {
                        i5 = (short) (f5252[f5253 + i2] + i4);
                    }
                }
                if (i5 > 0) {
                    C2912k.f7203 = ((i2 + i5) - 2) + f5253 + i6;
                    C2912k.f7201 = b2;
                    char c = (char) (i3 + f5255);
                    C2912k.f7204 = c;
                    sb.append(c);
                    C2912k.f7202 = C2912k.f7204;
                    C2912k.f7205 = 1;
                    while (C2912k.f7205 < i5) {
                        byte[] bArr2 = f5254;
                        if (bArr2 != null) {
                            int i7 = C2912k.f7203;
                            C2912k.f7203 = i7 - 1;
                            C2912k.f7204 = (char) (C2912k.f7202 + (((byte) (bArr2[i7] + s)) ^ C2912k.f7201));
                        } else {
                            short[] sArr = f5252;
                            int i8 = C2912k.f7203;
                            C2912k.f7203 = i8 - 1;
                            C2912k.f7204 = (char) (C2912k.f7202 + (((short) (sArr[i8] + s)) ^ C2912k.f7201));
                        }
                        sb.append(C2912k.f7204);
                        C2912k.f7202 = C2912k.f7204;
                        C2912k.f7205++;
                    }
                }
                string = sb.toString();
            } catch (Throwable th) {
                throw th;
            }
        }
        return string;
    }

    /* renamed from: ﻛ */
    private static String m5651(int[] iArr, int i) {
        String str;
        synchronized (C2723d.f5953) {
            try {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) f5249.clone();
                C2723d.f5951 = 0;
                while (true) {
                    int i2 = C2723d.f5951;
                    if (i2 < iArr.length) {
                        int i3 = iArr[i2];
                        char c = (char) (i3 >> 16);
                        cArr[0] = c;
                        char c2 = (char) i3;
                        cArr[1] = c2;
                        char c3 = (char) (iArr[i2 + 1] >> 16);
                        cArr[2] = c3;
                        char c4 = (char) iArr[i2 + 1];
                        cArr[3] = c4;
                        C2723d.f5954 = (c << 16) + c2;
                        C2723d.f5952 = (c3 << 16) + c4;
                        C2723d.m6462(iArr2);
                        for (int i4 = 0; i4 < 16; i4++) {
                            int i5 = C2723d.f5954 ^ iArr2[i4];
                            C2723d.f5954 = i5;
                            int iM6461 = C2723d.m6461(i5) ^ C2723d.f5952;
                            int i6 = C2723d.f5954;
                            C2723d.f5954 = iM6461;
                            C2723d.f5952 = i6;
                        }
                        int i7 = C2723d.f5954;
                        int i8 = C2723d.f5952;
                        C2723d.f5954 = i8;
                        C2723d.f5952 = i7;
                        int i9 = i7 ^ iArr2[16];
                        C2723d.f5952 = i9;
                        int i10 = i8 ^ iArr2[17];
                        C2723d.f5954 = i10;
                        cArr[0] = (char) (i10 >>> 16);
                        cArr[1] = (char) i10;
                        cArr[2] = (char) (i9 >>> 16);
                        cArr[3] = (char) i9;
                        C2723d.m6462(iArr2);
                        int i11 = C2723d.f5951;
                        cArr2[i11 << 1] = cArr[0];
                        cArr2[(i11 << 1) + 1] = cArr[1];
                        cArr2[(i11 << 1) + 2] = cArr[2];
                        cArr2[(i11 << 1) + 3] = cArr[3];
                        C2723d.f5951 = i11 + 2;
                    } else {
                        str = new String(cArr2, 0, i);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    /* renamed from: ｋ */
    private WeakHashMap<View, WeakReference<Object>> m5655(WeakHashMap<View, WeakReference<Object>> weakHashMap, InterfaceC2704ch interfaceC2704ch) {
        b bVar = new b(weakHashMap, interfaceC2704ch);
        f5250 = (f5251 + 47) % 128;
        return bVar;
    }
}
