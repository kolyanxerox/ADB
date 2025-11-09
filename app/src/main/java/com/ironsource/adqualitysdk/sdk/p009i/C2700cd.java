package com.ironsource.adqualitysdk.sdk.p009i;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import com.google.android.gms.internal.ads.AbstractC2183w4;
import com.ironsource.InterfaceC3173h3;
import com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg;
import com.vungle.warren.VungleApiClient;
import com.vungle.warren.model.Advertisement;
import com.vungle.warren.model.Placement;
import com.vungle.warren.persistence.Repository;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.cd */
/* loaded from: classes2.dex */
public final class C2700cd extends AbstractC2676bg {

    /* renamed from: ﺙ */
    private static int f5586 = 1;

    /* renamed from: ﻛ */
    private static int f5587 = 0;

    /* renamed from: ｋ */
    private static long f5588 = 1302285000612553467L;

    /* renamed from: ﾇ */
    private static char[] f5589 = {';', 'V', 'u', 'n', 'g', 'l', 'e', 'A', 'c', 't', 'i', 'v', 'y', 'o', 'm', '.', 'w', 'a', 'r', 'W', 'b', 'P', 'd', 'C', 'k', 'R', 'p', 's', 'L', 'M', 'I', 'D', 'F', 'B', 'N', '<'};

    /* renamed from: ﾒ */
    private static char f5590 = 6;

    /* renamed from: ﻐ */
    private String f5591;

    public C2700cd(String str) {
        super(str);
    }

    /* renamed from: ﮐ */
    private static String m6099() {
        f5587 = (f5586 + 17) % 128;
        Class clsM6100 = m6100();
        C2849hr.m6916().m6918();
        try {
            Iterator<Field> it = C2849hr.m6916().m6918().m6892(clsM6100, C2846ho.m6886().m6912(String.class).m6911(8).m6914(16).m6913()).iterator();
            while (it.hasNext()) {
                String str = (String) it.next().get(null);
                if (!str.startsWith(m6103("\uec25솰\uec73茄沯挾욜萹枥\uef32劧\u181fﮜ笙\udea5氈", 1 - TextUtils.indexOf("", "", 0, 0)).intern())) {
                    int i = f5586 + InterfaceC3173h3.d.b.f8821d;
                    f5587 = i % 128;
                    if (i % 2 != 0) {
                        if (!str.startsWith(m6103("䄂雲䅔灅\u187a㑼㗝\uf0ec쪂롰ꇣ法嚵ⱈⷯ", 1 << KeyEvent.getDeadChar(0, 1)).intern())) {
                            f5586 = (f5587 + InterfaceC3173h3.d.b.f8821d) % 128;
                        }
                    } else if (!str.startsWith(m6103("䄂雲䅔灅\u187a㑼㗝\uf0ec쪂롰ꇣ法嚵ⱈⷯ", KeyEvent.getDeadChar(0, 0) + 1).intern())) {
                        f5586 = (f5587 + InterfaceC3173h3.d.b.f8821d) % 128;
                    }
                }
                String str2 = str.split(m6108((byte) (97 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), "\u009d", Color.argb(0, 0, 0, 0) + 1).intern())[0];
                f5587 = (f5586 + 9) % 128;
                return str2;
            }
        } catch (Exception unused) {
        }
        return null;
    }

    /* renamed from: ﱡ */
    private static Map<String, String> m6101(Advertisement advertisement) {
        int i = f5586 + 61;
        f5587 = i % 128;
        if (i % 2 == 0) {
            return advertisement.getDownloadableUrls();
        }
        advertisement.getDownloadableUrls();
        throw null;
    }

    /* renamed from: ﻐ */
    private static String m6102(Advertisement advertisement) {
        f5586 = (f5587 + 63) % 128;
        String campaign = advertisement.getCampaign();
        f5586 = (f5587 + 53) % 128;
        return campaign;
    }

    /* renamed from: ｋ */
    public static /* synthetic */ Placement m6106(Repository repository, String str) {
        int i = f5587 + 109;
        f5586 = i % 128;
        if (i % 2 != 0) {
            return m6104(repository, str);
        }
        m6104(repository, str);
        throw null;
    }

    /* renamed from: ﾇ */
    public static /* synthetic */ Map m6109(Advertisement advertisement) {
        f5587 = (f5586 + 1) % 128;
        Map<String, String> mapM6101 = m6101(advertisement);
        int i = f5586 + 37;
        f5587 = i % 128;
        if (i % 2 == 0) {
            return mapM6101;
        }
        throw null;
    }

    /* renamed from: ﾒ */
    public static /* synthetic */ String m6111(Advertisement advertisement) {
        int i = f5587 + 65;
        f5586 = i % 128;
        if (i % 2 == 0) {
            m6102(advertisement);
            throw null;
        }
        String strM6102 = m6102(advertisement);
        int i2 = f5587 + 17;
        f5586 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 96 / 0;
        }
        return strM6102;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg
    /* renamed from: ﻛ */
    public final Map<String, AbstractC2676bg.b> mo5381() {
        HashMap map = new HashMap();
        map.put(m6108((byte) (TextUtils.getCapsMode("", 0, 0) + 28), "\u0000\n\u000f\u001b\u000b\u0017\t\u0007\f\b\t\u000f", (ViewConfiguration.getWindowTouchSlop() >> 8) + 12).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cd.1
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                return C2700cd.m6106((Repository) list.get(0), (String) list.get(1));
            }
        });
        map.put(m6103("\ue3fcᾍ\ue395\uda07Ⱥ봅龸\ueaa5桳ㄏ\u0b8b皓\uf44dꔨ螠ʉ䁝奖", Drawable.resolveOpacity(0, 0) + 1).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cd.5
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                return Boolean.valueOf(C2700cd.m6110((Placement) list.get(0)));
            }
        });
        map.put(m6103("렸鐤롟䪱鳞㚺༳瑮㎰몎鬲\ue871꾋⺒ᜋ鱞ᮘ", (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cd.2
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                return C2700cd.m6107((Advertisement) list.get(0));
            }
        });
        map.put(m6103("采\uf7f8醠诖ꘃ啦칔亱ᩊ\ud972婄튿虶䵌홶", TextUtils.indexOf("", "", 0) + 1).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cd.3
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                return C2700cd.m6111((Advertisement) list.get(0));
            }
        });
        map.put(m6103("軑殠躶斱臋줾″楾Ւ䔰됽\uf57a饦턒㠛腣\u2d77\u2d73豮ഫꄓ륧ၤ", (ViewConfiguration.getTapTimeout() >> 16) + 1).intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cd.4
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                return C2700cd.m6109((Advertisement) list.get(0));
            }
        });
        f5586 = (f5587 + 81) % 128;
        return map;
    }

    /* renamed from: ﱡ */
    private static Class m6100() {
        Class<VungleApiClient> cls;
        int i = f5587 + 83;
        int i2 = i % 128;
        f5586 = i2;
        if (i % 2 == 0) {
            cls = VungleApiClient.class;
            int i3 = 68 / 0;
        } else {
            cls = VungleApiClient.class;
        }
        f5587 = (i2 + 75) % 128;
        return cls;
    }

    /* renamed from: ﻐ */
    private static String m6103(String str, int i) {
        String str2;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (C2777f.f6322) {
            try {
                char[] cArrM6790 = C2777f.m6790(f5588, cArr, i);
                C2777f.f6321 = 4;
                while (true) {
                    int i2 = C2777f.f6321;
                    if (i2 < cArrM6790.length) {
                        C2777f.f6320 = i2 - 4;
                        cArrM6790[i2] = (char) ((cArrM6790[i2] ^ cArrM6790[i2 % 4]) ^ (r2 * f5588));
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
    public static /* synthetic */ String m6107(Advertisement advertisement) {
        int i = f5587 + 95;
        f5586 = i % 128;
        if (i % 2 != 0) {
            return m6105(advertisement);
        }
        m6105(advertisement);
        throw null;
    }

    /* renamed from: ﾇ */
    public static /* synthetic */ boolean m6110(Placement placement) {
        int i = f5587 + 61;
        f5586 = i % 128;
        int i2 = i % 2;
        boolean zM6112 = m6112(placement);
        if (i2 == 0) {
            int i3 = 84 / 0;
        }
        f5587 = (f5586 + 65) % 128;
        return zM6112;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg
    /* renamed from: ﾒ */
    public final String mo5383() {
        f5587 = (f5586 + 53) % 128;
        String strMo5467 = mo5467();
        if (strMo5467 == null) {
            return null;
        }
        int i = f5586 + 55;
        f5587 = i % 128;
        String str = i % 2 != 0 ? strMo5467.split(m6103("鵥૪鵊\uf505縉", 0 % (ViewConfiguration.getLongPressTimeout() * 70)).intern())[1] : strMo5467.split(m6103("鵥૪鵊\uf505縉", (ViewConfiguration.getLongPressTimeout() >> 16) + 1).intern())[1];
        int i2 = f5587 + 5;
        f5586 = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0473  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01a2  */
    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg
    /* renamed from: ｋ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Class mo5382(java.lang.String r25) {
        /*
            Method dump skipped, instructions count: 1434
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.p009i.C2700cd.mo5382(java.lang.String):java.lang.Class");
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg
    /* renamed from: ﾇ */
    public final String mo5467() {
        int i = f5586;
        f5587 = (i + 27) % 128;
        if (this.f5591 == null) {
            int i2 = i + 95;
            f5587 = i2 % 128;
            if (i2 % 2 != 0) {
                String strM6099 = m6099();
                this.f5591 = strM6099;
                m5462(strM6099);
                int i3 = 11 / 0;
            } else {
                String strM60992 = m6099();
                this.f5591 = strM60992;
                m5462(strM60992);
            }
        }
        String str = this.f5591;
        int i4 = f5587 + 87;
        f5586 = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    /* renamed from: ﾒ */
    private static boolean m6112(Placement placement) {
        f5587 = (f5586 + 11) % 128;
        boolean zIsIncentivized = placement.isIncentivized();
        int i = f5586 + 15;
        f5587 = i % 128;
        if (i % 2 == 0) {
            return zIsIncentivized;
        }
        throw null;
    }

    /* renamed from: ﻛ */
    private static String m6105(Advertisement advertisement) {
        int i = f5587 + 41;
        f5586 = i % 128;
        if (i % 2 != 0) {
            return advertisement.getAdMarketId();
        }
        advertisement.getAdMarketId();
        throw null;
    }

    /* renamed from: ﻛ */
    private static Placement m6104(Repository repository, String str) {
        int i = f5587 + 69;
        f5586 = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
        Placement placement = (Placement) repository.load(str, Placement.class).get();
        f5586 = (f5587 + 85) % 128;
        return placement;
    }

    /* renamed from: ﾇ */
    private static String m6108(byte b, String str, int i) {
        String str2;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (C2858i.f6710) {
            try {
                char[] cArr2 = f5589;
                char c = f5590;
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
}
