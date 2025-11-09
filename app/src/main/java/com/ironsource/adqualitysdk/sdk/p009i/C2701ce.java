package com.ironsource.adqualitysdk.sdk.p009i;

import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import com.google.android.gms.internal.ads.AbstractC2183w4;
import com.ironsource.InterfaceC3173h3;
import com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg;
import com.tapjoy.TJPlacement;
import com.tapjoy.TJPlacementData;
import com.tapjoy.TJPlacementListener;
import com.tapjoy.TJPlacementVideoListener;
import com.tapjoy.TJSplitWebView;
import com.tapjoy.Tapjoy;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ce */
/* loaded from: classes2.dex */
public final class C2701ce extends AbstractC2676bg {

    /* renamed from: ﻐ */
    private static char f5597 = 6;

    /* renamed from: ｋ */
    private static int f5599 = 0;

    /* renamed from: ﾒ */
    private static int f5601 = 1;

    /* renamed from: ﾇ */
    private static char[] f5600 = {'T', 'J', 'A', 'd', 'U', 'n', 'i', 't', 'c', 'v', 'y', 'o', 'm', '.', 'a', 'p', 'j', 'C', 'e', 'P', 'l', 'D', 'B', 'r', 'w', 's', 'M', 'V', 'W', 'b', 'L', 'u', 'S', 'g', 'X', 'Y'};

    /* renamed from: ﻛ */
    private static int[] f5598 = {-1832991700, -1271061845, -1256523278, -800769962, 2144407180, 1758547183, -17435220, -876523492, 833547339, -54632056, -545200866, -1000302033, 590793179, -1817785845, 927544906, -1422408457, -1403340660, 874454846};

    public C2701ce(String str) {
        super(str);
    }

    /* renamed from: ﱡ */
    private static String m6114(TJPlacementData tJPlacementData) {
        f5599 = (f5601 + 65) % 128;
        String httpResponse = tJPlacementData.getHttpResponse();
        int i = f5601 + 37;
        f5599 = i % 128;
        if (i % 2 != 0) {
            int i2 = 75 / 0;
        }
        return httpResponse;
    }

    /* renamed from: ﻐ */
    public static /* synthetic */ void m6117(TJPlacement tJPlacement, TJPlacementVideoListener tJPlacementVideoListener) {
        int i = f5599 + 23;
        f5601 = i % 128;
        int i2 = i % 2;
        m6130(tJPlacement, tJPlacementVideoListener);
        if (i2 == 0) {
            throw null;
        }
    }

    /* renamed from: ﻛ */
    public static /* synthetic */ String m6118(TJPlacement tJPlacement) {
        f5601 = (f5599 + 81) % 128;
        String strM6120 = m6120(tJPlacement);
        f5599 = (f5601 + 47) % 128;
        return strM6120;
    }

    /* renamed from: ｋ */
    public static /* synthetic */ String m6121(TJPlacementData tJPlacementData) {
        f5599 = (f5601 + InterfaceC3173h3.d.b.f8823f) % 128;
        String strM6128 = m6128(tJPlacementData);
        f5601 = (f5599 + 71) % 128;
        return strM6128;
    }

    /* renamed from: ﾇ */
    public static /* synthetic */ TJPlacementListener m6123(TJPlacement tJPlacement) {
        f5599 = (f5601 + 57) % 128;
        TJPlacementListener tJPlacementListenerM6115 = m6115(tJPlacement);
        int i = f5601 + 21;
        f5599 = i % 128;
        if (i % 2 == 0) {
            return tJPlacementListenerM6115;
        }
        throw null;
    }

    /* renamed from: ﾒ */
    public static /* synthetic */ TJPlacementVideoListener m6127(TJPlacement tJPlacement) {
        int i = f5599 + 95;
        f5601 = i % 128;
        if (i % 2 == 0) {
            m6113(tJPlacement);
            throw null;
        }
        TJPlacementVideoListener tJPlacementVideoListenerM6113 = m6113(tJPlacement);
        int i2 = f5601 + 45;
        f5599 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 55 / 0;
        }
        return tJPlacementVideoListenerM6113;
    }

    /* renamed from: ﱡ */
    private static TJPlacementVideoListener m6113(TJPlacement tJPlacement) {
        f5599 = (f5601 + 109) % 128;
        TJPlacementVideoListener videoListener = tJPlacement.getVideoListener();
        int i = f5601 + 69;
        f5599 = i % 128;
        if (i % 2 == 0) {
            return videoListener;
        }
        throw null;
    }

    /* renamed from: ﻐ */
    private static String m6116(TJPlacementData tJPlacementData) {
        f5599 = (f5601 + 15) % 128;
        String placementName = tJPlacementData.getPlacementName();
        int i = f5599 + 119;
        f5601 = i % 128;
        if (i % 2 != 0) {
            return placementName;
        }
        throw null;
    }

    /* renamed from: ﻛ */
    public static /* synthetic */ String m6119(TJPlacementData tJPlacementData) {
        f5599 = (f5601 + 13) % 128;
        String strM6114 = m6114(tJPlacementData);
        int i = f5601 + 119;
        f5599 = i % 128;
        if (i % 2 == 0) {
            return strM6114;
        }
        throw null;
    }

    /* renamed from: ｋ */
    public static /* synthetic */ String m6122(TJSplitWebView tJSplitWebView) {
        int i = f5601 + 109;
        f5599 = i % 128;
        if (i % 2 == 0) {
            return m6129(tJSplitWebView);
        }
        m6129(tJSplitWebView);
        throw null;
    }

    /* renamed from: ﾇ */
    public static /* synthetic */ String m6125(TJPlacementData tJPlacementData) {
        f5599 = (f5601 + 71) % 128;
        String strM6116 = m6116(tJPlacementData);
        f5601 = (f5599 + 81) % 128;
        return strM6116;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg
    /* renamed from: ﾒ */
    public final String mo5383() {
        int i = f5599 + InterfaceC3173h3.d.b.f8826i;
        f5601 = i % 128;
        if (i % 2 == 0) {
            Tapjoy.getVersion();
            throw null;
        }
        String version = Tapjoy.getVersion();
        int i2 = f5601 + 67;
        f5599 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 58 / 0;
        }
        return version;
    }

    /* renamed from: ﻐ */
    private static TJPlacementListener m6115(TJPlacement tJPlacement) {
        int i = f5599 + 117;
        f5601 = i % 128;
        if (i % 2 == 0) {
            tJPlacement.getListener();
            throw null;
        }
        TJPlacementListener listener = tJPlacement.getListener();
        int i2 = f5601 + 27;
        f5599 = i2 % 128;
        if (i2 % 2 == 0) {
            return listener;
        }
        throw null;
    }

    /* renamed from: ﾇ */
    private static String m6124(byte b, String str, int i) {
        String str2;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (C2858i.f6710) {
            try {
                char[] cArr2 = f5600;
                char c = f5597;
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

    /* renamed from: ﾒ */
    private static String m6128(TJPlacementData tJPlacementData) {
        int i = f5601 + 39;
        f5599 = i % 128;
        if (i % 2 == 0) {
            return tJPlacementData.getUrl();
        }
        tJPlacementData.getUrl();
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg
    /* renamed from: ﻛ */
    public final Map<String, AbstractC2676bg.b> mo5381() {
        HashMap map = new HashMap();
        map.put(m6126(new int[]{459920644, -1422124477, -65989670, -112633383, -1408402046, -649397006, -1038326330, -248712669}, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 16).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.ce.2
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                return C2701ce.m6125((TJPlacementData) list.get(0));
            }
        });
        map.put(m6124((byte) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 124), "\u001e\u0015\n\u0001\u0012\u0015", TextUtils.indexOf("", "") + 6).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.ce.5
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                return C2701ce.m6121((TJPlacementData) list.get(0));
            }
        });
        map.put(m6126(new int[]{1313902396, -103693904, 270934848, 855532280, 808278591, 418902013, 444695141, 1214535014}, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 15).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.ce.1
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                return C2701ce.m6119((TJPlacementData) list.get(0));
            }
        });
        map.put(m6126(new int[]{843312343, 66431621, 389096977, 175060994}, Gravity.getAbsoluteGravity(0, 0) + 7).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.ce.3
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                return C2701ce.m6118((TJPlacement) list.get(0));
            }
        });
        map.put(m6124((byte) (55 - ImageFormat.getBitsPerPixel(0)), "\u001e\u0015\u0006\u001f\u0007\u0018\u0006\u0013\u0000\u0017ª", (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 11).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.ce.4
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                return C2701ce.m6123((TJPlacement) list.get(0));
            }
        });
        map.put(m6126(new int[]{-1493386152, 1708884378, -450822548, -504246282, 403891856, 466653388, 525083607, 2032251586}, (ViewConfiguration.getScrollBarSize() >> 8) + 16).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.ce.9
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                return C2701ce.m6127((TJPlacement) list.get(0));
            }
        });
        map.put(m6126(new int[]{-1416007910, 396799033, -450822548, -504246282, 403891856, 466653388, 525083607, 2032251586}, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 16).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.ce.8
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                C2701ce.m6117((TJPlacement) list.get(0), (TJPlacementVideoListener) list.get(1));
                return null;
            }
        });
        map.put(m6124((byte) ((ViewConfiguration.getTouchSlop() >> 8) + 53), "\u001e\u0015\u0006\u001f\r\u001a\n\u0001\u0012\u0015", 10 - KeyEvent.getDeadChar(0, 0)).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.ce.6
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                return C2701ce.m6122((TJSplitWebView) list.get(0));
            }
        });
        f5601 = (f5599 + 49) % 128;
        return map;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:97:0x03d7  */
    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg
    /* renamed from: ｋ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Class mo5382(java.lang.String r29) {
        /*
            Method dump skipped, instructions count: 1472
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.p009i.C2701ce.mo5382(java.lang.String):java.lang.Class");
    }

    /* renamed from: ﾒ */
    private static void m6130(TJPlacement tJPlacement, TJPlacementVideoListener tJPlacementVideoListener) {
        int i = f5601 + 5;
        f5599 = i % 128;
        int i2 = i % 2;
        tJPlacement.setVideoListener(tJPlacementVideoListener);
        if (i2 != 0) {
            throw null;
        }
        f5599 = (f5601 + 31) % 128;
    }

    /* renamed from: ﾒ */
    private static String m6129(TJSplitWebView tJSplitWebView) {
        int i = f5599 + 27;
        f5601 = i % 128;
        if (i % 2 != 0) {
            return tJSplitWebView.getLastUrl();
        }
        tJSplitWebView.getLastUrl();
        throw null;
    }

    /* renamed from: ｋ */
    private static String m6120(TJPlacement tJPlacement) {
        int i = f5599 + 69;
        f5601 = i % 128;
        if (i % 2 != 0) {
            return tJPlacement.getName();
        }
        tJPlacement.getName();
        throw null;
    }

    /* renamed from: ﾇ */
    private static String m6126(int[] iArr, int i) {
        String str;
        synchronized (C2723d.f5953) {
            try {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) f5598.clone();
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
}
