package com.ironsource.adqualitysdk.sdk.p009i;

import android.graphics.Color;
import android.os.Process;
import com.applovin.shadow.okhttp3.internal.p007ws.WebSocketProtocol;
import com.ironsource.InterfaceC3173h3;
import com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg;
import io.presage.Presage;
import io.presage.common.PresageSdk;
import io.presage.interstitial.PresageInterstitial;
import io.presage.interstitial.PresageInterstitialCallback;
import io.presage.interstitial.optinvideo.PresageOptinVideo;
import io.presage.interstitial.optinvideo.PresageOptinVideoCallback;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.cb */
/* loaded from: classes2.dex */
public final class C2698cb extends AbstractC2676bg {

    /* renamed from: ﱡ */
    private static int f5540 = 1;

    /* renamed from: ﺙ */
    private static int f5541;

    /* renamed from: ﾒ */
    private static char[] f5546 = {':', 'n', 'e', 'f', 'V', 'R', 'k', 'n', 'o', 'o', 'n', 'v', 'q', 'l', 'N', 'O', 'q', 'k', 'l', 'j', 'd', 'f', 'I', 'K', 'k', 'q', 'l', 'k', 'r', 's', 'n', 'n', 'n', 'e', 'f', 'M', ';', '[', 'q', 'l', 'k', 'r', 's', 'n', '<', 'v', 'n', 'o', 'o', 'n', 'k', 'R', 'V', 'f', 'e', 'n', 'n', 'n', 's', 'r', 'k', 'l', 'q', '[', '<', 'v', 'n', 'o', 'o', 'n', 'k', 'R', 'V', 'f', 'e', 'n', 'n', 'n', 's', 'r', 'k', 'l', 'q', '[', 'Y', '_', '0', 'j', 'l', 'k', 'a', 'Z', 'f', ')', '\\', 'f', 'd', 'j', 'l', 'k', 'a', ']', 'g', '7', 'Y', 'S', 'R', 'T', 'h', 'g', 'j', '9', 's', 'j', 'g', 'h', 'd', 'f', 'f', 'l', 'b', 'a', 'k', 'l', 'j', 'd', 'f', 'W', '[', '5', 'o', 'l', 'l', '^', '[', 'q', 'l', 'k', 'r', 's', 'n', 'n', 'n', 'e', 'f', 'W', 'R', 'f', 'l', 'g', 'a', 'b', '9', 'l', 'l', 'a', '_', 'r', 'n', 'k', 'b', '_', 'f', 'd', 'j', 'Y', 'R', 'f', 'l', 'g', 'a', 'b', 'g', '0'};

    /* renamed from: ﻐ */
    private static boolean f5542 = true;

    /* renamed from: ｋ */
    private static boolean f5544 = true;

    /* renamed from: ﾇ */
    private static int f5545 = 97;

    /* renamed from: ﻛ */
    private static char[] f5543 = {202, 208, 143, 209, 211, 198, 212, 194, 200, 207, 213, 205, 214, 170, 162, 196, 215, 218, 176, 177, 164, 195, 204, 183, 197, 179, 216, 206, 142, 199, 201, 165, 174};

    public C2698cb(String str) {
        super(str);
    }

    /* renamed from: ﮐ */
    public static /* synthetic */ Presage m6065() {
        int i = f5541 + 65;
        f5540 = i % 128;
        if (i % 2 != 0) {
            return m6066();
        }
        m6066();
        throw null;
    }

    /* renamed from: ﱡ */
    private static Presage m6066() {
        int i = f5541 + 51;
        f5540 = i % 128;
        if (i % 2 == 0) {
            Presage.getInstance();
            throw null;
        }
        Presage presage = Presage.getInstance();
        f5541 = (f5540 + 117) % 128;
        return presage;
    }

    /* renamed from: ﻐ */
    private static void m6068(PresageInterstitial presageInterstitial, PresageInterstitialCallback presageInterstitialCallback) {
        f5541 = (f5540 + 95) % 128;
        presageInterstitial.setInterstitialCallback(presageInterstitialCallback);
        f5540 = (f5541 + 61) % 128;
    }

    /* renamed from: ﾇ */
    public static /* synthetic */ void m6070(PresageInterstitial presageInterstitial, PresageInterstitialCallback presageInterstitialCallback) {
        f5540 = (f5541 + 99) % 128;
        m6068(presageInterstitial, presageInterstitialCallback);
        f5540 = (f5541 + 83) % 128;
    }

    /* renamed from: ﾒ */
    public static /* synthetic */ void m6072(PresageOptinVideo presageOptinVideo, PresageOptinVideoCallback presageOptinVideoCallback) {
        int i = f5540 + 9;
        f5541 = i % 128;
        int i2 = i % 2;
        m6071(presageOptinVideo, presageOptinVideoCallback);
        if (i2 != 0) {
            throw null;
        }
        int i3 = f5540 + 27;
        f5541 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 46 / 0;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg
    /* renamed from: ﻛ */
    public final Map<String, AbstractC2676bg.b> mo5381() {
        HashMap map = new HashMap();
        map.put(m6067(false, new int[]{InterfaceC3173h3.d.b.f8826i, 18, 0, 6}, "\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0001").intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cb.1
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                return C2698cb.m6065();
            }
        });
        map.put(m6067(false, new int[]{129, 23, 0, 1}, "\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000").intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cb.2
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                C2698cb.m6070((PresageInterstitial) list.get(0), (PresageInterstitialCallback) list.get(1));
                return null;
            }
        });
        map.put(m6067(false, new int[]{152, 21, 0, 0}, "\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0000").intern(), new AbstractC2676bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cb.5
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                C2698cb.m6072((PresageOptinVideo) list.get(0), (PresageOptinVideoCallback) list.get(1));
                return null;
            }
        });
        int i = f5541 + 117;
        f5540 = i % 128;
        if (i % 2 != 0) {
            return map;
        }
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0024  */
    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg
    /* renamed from: ｋ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Class mo5382(java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 578
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.p009i.C2698cb.mo5382(java.lang.String):java.lang.Class");
    }

    /* renamed from: ﻐ */
    private static String m6067(boolean z, int[] iArr, String str) throws UnsupportedEncodingException {
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
                System.arraycopy(f5546, i, cArr, 0, i2);
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

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg
    /* renamed from: ﾇ */
    public final String mo5467() {
        f5540 = (f5541 + 7) % 128;
        try {
            try {
                String str = (String) Class.forName(m6069(null, null, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + WebSocketProtocol.PAYLOAD_SHORT, "\u0085\u0093\u0099\u008b\u008a\u0082¡\u0087\u0096\u008d\u0082 \u008b\u008d\u0088\u009f\u008d\u0099\u008a\u0081\u0085\u0086\u009f\u0090\u0088\u0098\u0083\u009e\u0081\u0083\u008a\u0082\u009c\u009c\u0082\u0090\u0083\u0086\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern()).getMethod(m6067(false, new int[]{173, 1, 0, 1}, "\u0001").intern(), null).invoke(null, null);
                f5540 = (f5541 + 51) % 128;
                return str;
            } catch (Exception unused) {
                return PresageSdk.getAdsSdkVersion();
            }
        } catch (Throwable unused2) {
            return null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg
    /* renamed from: ﾒ */
    public final String mo5383() {
        f5541 = (f5540 + 77) % 128;
        String strMo5467 = mo5467();
        if (strMo5467 == null) {
            return null;
        }
        int i = f5541 + 39;
        f5540 = i % 128;
        return i % 2 == 0 ? strMo5467.split(m6069(null, null, (-16777089) >> Color.rgb(0, 1, 1), "\u009d").intern())[0] : strMo5467.split(m6069(null, null, (-16777089) - Color.rgb(0, 0, 0), "\u009d").intern())[0];
    }

    /* renamed from: ﾇ */
    private static void m6071(PresageOptinVideo presageOptinVideo, PresageOptinVideoCallback presageOptinVideoCallback) {
        int i = f5540 + 99;
        f5541 = i % 128;
        int i2 = i % 2;
        presageOptinVideo.setOptinVideoCallback(presageOptinVideoCallback);
        if (i2 != 0) {
            throw null;
        }
        f5541 = (f5540 + 61) % 128;
    }

    /* renamed from: ｋ */
    private static String m6069(String str, int[] iArr, int i, String str2) throws UnsupportedEncodingException {
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
                char[] cArr2 = f5543;
                int i2 = f5545;
                if (f5544) {
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
                if (f5542) {
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
