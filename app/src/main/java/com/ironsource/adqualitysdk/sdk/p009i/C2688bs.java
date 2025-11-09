package com.ironsource.adqualitysdk.sdk.p009i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Process;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.ironsource.InterfaceC3173h3;
import com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg;
import com.moloco.sdk.BuildConfig;
import com.moloco.sdk.publisher.Banner;
import com.moloco.sdk.publisher.BannerAdShowListener;
import com.moloco.sdk.publisher.Moloco;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.bs */
/* loaded from: classes2.dex */
public final class C2688bs extends AbstractC2676bg {

    /* renamed from: ﮐ */
    private static int f5340 = 0;

    /* renamed from: ﻏ */
    private static int f5342 = 1;

    /* renamed from: ﻛ */
    private static int f5344 = 53;

    /* renamed from: ｋ */
    private static int f5345 = 22445185;

    /* renamed from: ﾇ */
    private static int f5346 = 1237376607;

    /* renamed from: ﾒ */
    private static short[] f5347;

    /* renamed from: ﻐ */
    private static byte[] f5343 = {-42, 6, 13, -40, 57, -44, 18, 11, 1, 18, 8, -37, 12, 18, -11, 23, 23, -30, 17, 1, 43, -32, 18, -6, 9, 3, 40, -47, 1, -23, -8, -14, 23, -45, 46, -35, 23, -1, 14, 8, 45, -41, -28, -26, 20, -49, 2, -29, -22, -14, 24, -47, 18, -39, 80, 58, 76, 52, 68, 77, 96, 24, 75, 74, 88, 50, 102, -22, -58, -80, -71, -58, -40, -51, 117, -58, -74, -82, -61, -74, -61, -90, -66, -5, 124, -64, -86, -2, 120, -59, -83, -68, -74, -69, -8, 122, -73, -59, -33, -58, -80, -62, -86, -70, -61, -42, -114, -63, -64, -50, -88, -36, -120, -58, -80, -71, -58, -40, -40, -30, -47, -2, -76, -40, -33, -50, -20, -47, -34, -40, -15, -31, -91, 87, -115, 122, 119, -115, 119, -125, -125, -113, 115, -120, -89, 103, -127, -125, 116, -109, 108, -108, -107, 26, -48, -42, -66, -40, -64, -36, -19, -88, -58, -45, -70, -16, -22, -107, -58, -45, -70, -48, 10, -115, -42, -66, -57, -40, -68, -47, -48, 6, -121, -40, -66, -40, -52, -63, -44, -66, -39, -50, -2, -107, -58, -59, -56, -39, -63, -40, -2, -123, -42, -55, -64, -36, -52, -60, -46, -68, 16, -122, -53, -49, -52, -44, -72, 21, -114, -46, -68, 16, -118, -41, -65, -50, -56, -51, 10, -116, -55, -41, -37, -1, 5, -19, 7, -17, 11, 28, -41, 29, -40, -12, -17, 13, -25, 27, 38, 41, 47, 23, 49, 25, 53, 70, 1, 71, 2, 30, 25, 55, 17, 69, 73, -32, 49, 23, 49, 37, 26, 45, 23, 51, 30, 25, 55, 17, 37, 105, -26, 47, 23, 32, 49, 21, 42, 41, 95, -32, 49, 23, 49, 37, 26, 45, 23, 50, 39, 87, -18, 31, 30, 33, 50, 26, 49, 87, -34, 47, 34, 25, 53, 37, 29, 43, 21, 105, -33, 36, 40, 37, 45, 17, 110, -25, 43, 21, 105, -29, 48, 24, 39, 33, 38, 99, -27, 34, 48, 24, -9, -3, -27, -1, -25, 3, 20, -65, -13, 4, -3, 26, -84, -13, 4, -35, 58, -76, -3, -27, -18, -1, -29, -8, -9, 45, -82, -1, -27, -1, -13, -24, -5, -27, 0, -11, 37, -68, -19, -20, -17, 0, -24, -1, 37, -84, -3, -16, -25, 3, -13, -21, -7, -29, 55, -83, -14, -10, -13, -5, -33, 60, -75, -7, -29, 55, -79, -2, -26, -11, -17, -12, 49, -77, -16, -2, -30, 36, 14, 32, 8, 24, 33, 52, -20, 31, 30, 44, 6, 58, -26, 36, 14, 23, 36, 54, -27, 38, 21, -30, -59, -81, -63, -87, -71, -62, -43, -115, -64, -65, -51, -89, -37, -121, -59, -81, -72, -59, -41, -122, -57, -86};

    /* renamed from: ﱡ */
    private static long f5341 = -4336831210449940258L;

    public C2688bs(String str) {
        super(str);
    }

    /* renamed from: ﮐ */
    private static Object m5761() {
        int i = f5342 + 73;
        f5340 = i % 128;
        if (i % 2 == 0) {
            return Moloco.INSTANCE;
        }
        int i2 = 14 / 0;
        return Moloco.INSTANCE;
    }

    /* renamed from: ﱡ */
    public static /* synthetic */ Object m5762() {
        f5340 = (f5342 + 21) % 128;
        Object objM5761 = m5761();
        f5342 = (f5340 + 15) % 128;
        return objM5761;
    }

    /* renamed from: ﻐ */
    private static void m5764(Banner banner, BannerAdShowListener bannerAdShowListener) {
        int i = f5340 + 109;
        f5342 = i % 128;
        int i2 = i % 2;
        banner.setAdShowListener(bannerAdShowListener);
        if (i2 == 0) {
            int i3 = 94 / 0;
        }
        f5340 = (f5342 + 109) % 128;
    }

    /* renamed from: ﻛ */
    public static /* synthetic */ void m5766(Banner banner, BannerAdShowListener bannerAdShowListener) {
        int i = f5340 + 19;
        f5342 = i % 128;
        int i2 = i % 2;
        m5764(banner, bannerAdShowListener);
        if (i2 == 0) {
            throw null;
        }
    }

    /* renamed from: ｋ */
    public static /* synthetic */ BannerAdShowListener m5767(Banner banner) {
        int i = f5340 + 27;
        f5342 = i % 128;
        if (i % 2 == 0) {
            m5768(banner);
            throw null;
        }
        BannerAdShowListener bannerAdShowListenerM5768 = m5768(banner);
        int i2 = f5340 + 71;
        f5342 = i2 % 128;
        if (i2 % 2 != 0) {
            return bannerAdShowListenerM5768;
        }
        throw null;
    }

    /* renamed from: ﾇ */
    private static BannerAdShowListener m5768(Banner banner) {
        f5342 = (f5340 + 63) % 128;
        BannerAdShowListener adShowListener = banner.getAdShowListener();
        int i = f5340 + 35;
        f5342 = i % 128;
        if (i % 2 == 0) {
            int i2 = 57 / 0;
        }
        return adShowListener;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg
    /* renamed from: ﾒ */
    public final String mo5383() {
        f5342 = (f5340 + 47) % 128;
        try {
            String strM6988 = C2849hr.m6916().m6919().m6988(BuildConfig.class, m5765((byte) (ViewConfiguration.getDoubleTapTimeout() >> 16), (short) ((ViewConfiguration.getKeyRepeatDelay() >> 16) - 10), (-54) - TextUtils.indexOf("", "", 0, 0), View.MeasureSpec.getMode(0) - 22445185, Gravity.getAbsoluteGravity(0, 0) - 1237376513).intern());
            int i = f5342 + 123;
            f5340 = i % 128;
            if (i % 2 == 0) {
                return strM6988;
            }
            throw null;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: ﻐ */
    private static String m5763(String str, int i) {
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
                        cArr2[i2] = (char) ((cArr[i2] ^ (C2804g.f6423 * i2)) ^ f5341);
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

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg
    /* renamed from: ﻛ */
    public final Map<String, AbstractC2676bg.b> mo5381() {
        HashMap map = new HashMap();
        map.put(m5763("킹졆\ue150驤덅걃䕟繖\u1759と⥘쉪וֹ鑩赻ꙹ彯硽ᅷ\u0a7c", Process.getGidForName("") + 6398).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bs.2
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                return C2688bs.m5762();
            }
        });
        map.put(m5765((byte) (ViewConfiguration.getPressedStateDuration() >> 16), (short) ((-23) - View.getDefaultSize(0, 0)), (-53) - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (-22444769) - (ViewConfiguration.getTapTimeout() >> 16), KeyEvent.normalizeMetaState(0) - 1237376504).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bs.1
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                return C2688bs.m5767((Banner) list.get(0));
            }
        });
        map.put(m5765((byte) (ImageFormat.getBitsPerPixel(0) + 1), (short) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 72), Color.green(0) - 54, TextUtils.getCapsMode("", 0, 0) - 22444746, (-1237376492) - (ViewConfiguration.getMaximumFlingVelocity() >> 16)).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bs.4
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                C2688bs.m5766((Banner) list.get(0), (BannerAdShowListener) list.get(1));
                return null;
            }
        });
        f5340 = (f5342 + InterfaceC3173h3.d.b.f8821d) % 128;
        return map;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:71:0x03e7  */
    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg
    /* renamed from: ｋ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Class mo5382(java.lang.String r21) {
        /*
            Method dump skipped, instructions count: 1180
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.p009i.C2688bs.mo5382(java.lang.String):java.lang.Class");
    }

    /* renamed from: ﻛ */
    private static String m5765(byte b, short s, int i, int i2, int i3) {
        String string;
        synchronized (C2912k.f7200) {
            try {
                StringBuilder sb = new StringBuilder();
                int i4 = f5344;
                int i5 = i + i4;
                int i6 = i5 == -1 ? 1 : 0;
                if (i6 != 0) {
                    byte[] bArr = f5343;
                    if (bArr != null) {
                        i5 = (byte) (bArr[f5345 + i2] + i4);
                    } else {
                        i5 = (short) (f5347[f5345 + i2] + i4);
                    }
                }
                if (i5 > 0) {
                    C2912k.f7203 = ((i2 + i5) - 2) + f5345 + i6;
                    C2912k.f7201 = b;
                    char c = (char) (i3 + f5346);
                    C2912k.f7204 = c;
                    sb.append(c);
                    C2912k.f7202 = C2912k.f7204;
                    C2912k.f7205 = 1;
                    while (C2912k.f7205 < i5) {
                        byte[] bArr2 = f5343;
                        if (bArr2 != null) {
                            int i7 = C2912k.f7203;
                            C2912k.f7203 = i7 - 1;
                            C2912k.f7204 = (char) (C2912k.f7202 + (((byte) (bArr2[i7] + s)) ^ C2912k.f7201));
                        } else {
                            short[] sArr = f5347;
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
}
