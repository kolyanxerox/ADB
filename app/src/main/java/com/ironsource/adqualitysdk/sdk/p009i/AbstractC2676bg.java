package com.ironsource.adqualitysdk.sdk.p009i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.bg */
/* loaded from: classes2.dex */
public abstract class AbstractC2676bg extends C2722cz implements InterfaceC2707ck {

    /* renamed from: ﮉ */
    private static int f5113 = 1;

    /* renamed from: ﮌ */
    private static int f5114 = 0;

    /* renamed from: ﮐ */
    private static int f5115 = 20;

    /* renamed from: ﱡ */
    private static short[] f5117 = null;

    /* renamed from: ﺙ */
    private static int f5118 = 1685001878;

    /* renamed from: ﻛ */
    private static int f5120 = 1237197900;

    /* renamed from: ﻐ */
    private Map<String, b> f5121;

    /* renamed from: ｋ */
    private String f5122;

    /* renamed from: ﾇ */
    private String f5123;

    /* renamed from: ﾒ */
    private String f5124;

    /* renamed from: ﱟ */
    private static byte[] f5116 = {70, -65, 79, -72, -76, -74, 82, -66, -88, 94, -71, 78, -106, 107, -74, 75, -102, -121, 112, 106, -109, 99, -108, -104, -102, 126, -110, -124, 114, -107, 98, -70, 70, -97, -123, -105, 112, -84, 74, -118, 123, -2, -8, 11, 0, -14, 8, 22, 24, -21, -22, 22, -23, 18, -21, -70, 69, -20, -24, -89, 85, 28, -18, 29, -26, 17, -92, 15, -6, -31, 28, 17, 93, 87, -69, 125, 124, 120, -118, 56, 55, -56, -57, -120, 98, -53, -49, -128, 2, -75, -7, 30, -77, 77, -80, -99, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    /* renamed from: ﻏ */
    private static long f5119 = 6197488243105965917L;

    /* renamed from: com.ironsource.adqualitysdk.sdk.i.bg$b */
    public interface b {
        /* renamed from: ﾒ */
        Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch);
    }

    public AbstractC2676bg(String str) {
        this.f5122 = str;
    }

    /* renamed from: Ꮭ */
    public static /* synthetic */ Object m5454(List list, Class cls) {
        int i = f5113 + 71;
        f5114 = i % 128;
        int i2 = i % 2;
        Object objM6459 = C2722cz.m6459(list, 0, cls);
        int i3 = f5113 + 23;
        f5114 = i3 % 128;
        if (i3 % 2 == 0) {
            return objM6459;
        }
        throw null;
    }

    /* renamed from: ﻐ */
    public static /* synthetic */ String m5456(AbstractC2676bg abstractC2676bg) {
        int i = (f5114 + 5) % 128;
        f5113 = i;
        String str = abstractC2676bg.f5124;
        int i2 = i + 81;
        f5114 = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    /* renamed from: ﾇ */
    public static /* synthetic */ Class m5457(AbstractC2676bg abstractC2676bg, String str) {
        int i = f5114 + 27;
        f5113 = i % 128;
        int i2 = i % 2;
        return abstractC2676bg.m5455(str, false);
    }

    /* renamed from: ﱟ */
    public boolean mo5450() {
        f5114 = (f5113 + 29) % 128;
        return false;
    }

    /* renamed from: ﺙ */
    public final boolean m5460() {
        if (this.f5124 != null) {
            f5114 = (f5113 + 17) % 128;
            return true;
        }
        int i = f5114 + 65;
        f5113 = i % 128;
        if (i % 2 == 0) {
            int i2 = 23 / 0;
        }
        return false;
    }

    /* renamed from: ﻏ */
    public boolean mo5451() {
        int i = f5114 + 7;
        f5113 = i % 128;
        return i % 2 == 0;
    }

    /* renamed from: ﻛ */
    public final Class m5463(String str) {
        try {
            if (!Prode.m4894()) {
                f5114 = (f5113 + 55) % 128;
                return m5455(str, false);
            }
            Class clsMo5382 = mo5382(str);
            f5114 = (f5113 + 15) % 128;
            return clsMo5382;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: ﻛ */
    public abstract Map<String, b> mo5381();

    /* renamed from: ｋ */
    public abstract Class mo5382(String str);

    /* renamed from: ｋ */
    public final void m5465() {
        Map<String, b> mapMo5381 = mo5381();
        this.f5121 = mapMo5381;
        mapMo5381.put(m5458((byte) ((-70) - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), (short) TextUtils.getTrimmedLength(""), (ViewConfiguration.getWindowTouchSlop() >> 8) - 3, View.getDefaultSize(0, 0) - 1237197900, Drawable.resolveOpacity(0, 0) - 1685001763).intern(), new b() { // from class: com.ironsource.adqualitysdk.sdk.i.bg.1
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                AbstractC2676bg.this.m5462((String) AbstractC2676bg.m5454(list, String.class));
                return AbstractC2676bg.m5456(AbstractC2676bg.this);
            }
        });
        this.f5121.put(m5458((byte) ((-106) - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), (short) View.getDefaultSize(0, 0), -(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (-1237197884) - View.MeasureSpec.getSize(0), (ViewConfiguration.getScrollBarFadeDuration() >> 16) - 1685001773).intern(), new b() { // from class: com.ironsource.adqualitysdk.sdk.i.bg.5
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                return Boolean.valueOf(AbstractC2676bg.this.m5460());
            }
        });
        this.f5121.put(m5458((byte) ((-123) - Color.green(0)), (short) View.combineMeasuredStates(0, 0), (-13) - ImageFormat.getBitsPerPixel(0), (-1237197866) - TextUtils.indexOf("", ""), Color.red(0) - 1685001775).intern(), new b() { // from class: com.ironsource.adqualitysdk.sdk.i.bg.2
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.b
            /* renamed from: ﾒ */
            public final Object mo5384(List<Object> list, InterfaceC2704ch interfaceC2704ch) {
                return AbstractC2676bg.m5457(AbstractC2676bg.this, (String) list.get(0));
            }
        });
        f5113 = (f5114 + 69) % 128;
    }

    /* renamed from: ﾒ */
    public final Class m5468(String str) {
        f5113 = (f5114 + 47) % 128;
        Class clsM5455 = m5455(str, true);
        f5114 = (f5113 + 35) % 128;
        return clsM5455;
    }

    /* renamed from: ﾒ */
    public abstract String mo5383();

    /* renamed from: ﾒ */
    private static String m5459(String str, int i) {
        String str2;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (C2777f.f6322) {
            try {
                char[] cArrM6790 = C2777f.m6790(f5119, cArr, i);
                C2777f.f6321 = 4;
                while (true) {
                    int i2 = C2777f.f6321;
                    if (i2 < cArrM6790.length) {
                        C2777f.f6320 = i2 - 4;
                        cArrM6790[i2] = (char) ((cArrM6790[i2] ^ cArrM6790[i2 % 4]) ^ (r2 * f5119));
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

    /* renamed from: ﻐ */
    public final synchronized String m5461() {
        try {
            if (TextUtils.isEmpty(this.f5123)) {
                this.f5123 = mo5383();
                f5114 = (f5113 + 33) % 128;
            } else {
                f5113 = (f5114 + 33) % 128;
                if (this.f5123.equals(m5458((byte) (1 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), (short) TextUtils.indexOf("", "", 0), (-13) - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (-1237197859) - KeyEvent.getDeadChar(0, 0), (-1685001809) - Drawable.resolveOpacity(0, 0)).intern())) {
                    this.f5123 = mo5383();
                    f5114 = (f5113 + 33) % 128;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f5123;
    }

    /* renamed from: ﾇ */
    public String mo5467() {
        int i = f5113 + 21;
        int i2 = i % 128;
        f5114 = i2;
        if (i % 2 != 0) {
            throw null;
        }
        String str = this.f5124;
        if (str == null) {
            return m5461();
        }
        int i3 = i2 + 121;
        f5113 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 22 / 0;
        }
        return str;
    }

    /* renamed from: ﻛ */
    public final void m5464(InterfaceC2838hg interfaceC2838hg, InterfaceC2704ch interfaceC2704ch, String str, Object... objArr) {
        try {
            ArrayList arrayList = new ArrayList(Arrays.asList(objArr));
            arrayList.add(0, interfaceC2838hg);
            interfaceC2704ch.mo6153(str, arrayList);
            int i = f5113 + 49;
            f5114 = i % 128;
            if (i % 2 != 0) {
                int i2 = 56 / 0;
            }
        } catch (Throwable th) {
            String str2 = this.f5122;
            StringBuilder sb = new StringBuilder();
            sb.append(m5458((byte) (TextUtils.getTrimmedLength("") - 80), (short) Gravity.getAbsoluteGravity(0, 0), (-11) - Color.red(0), (-1237197812) - TextUtils.indexOf("", ""), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1685001810).intern());
            sb.append(this);
            C2713cq.m6350(str2, sb.toString(), th);
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2707ck
    /* renamed from: ﾇ */
    public final Object mo5466(String str, List<Object> list, InterfaceC2704ch interfaceC2704ch) {
        f5114 = (f5113 + 19) % 128;
        b bVar = this.f5121.get(str);
        try {
        } catch (Exception e) {
            String str2 = this.f5122;
            StringBuilder sb = new StringBuilder();
            sb.append(m5459("妉姌紏\ud8c2䙖\uda20阊뀮쒏㧾㒉향挄鼩儕盝膼˘ﾳ蠅ⰷ恃᰼ⷘ䪻쟋뤜你\ue954╮⟘\ue0f6េ袦䐃", 1 - TextUtils.indexOf("", "", 0, 0)).intern());
            sb.append(str);
            sb.append(m5459("竒竵䣁䦥¶", (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))).intern());
            C2713cq.m6350(str2, sb.toString(), e);
        }
        if (bVar != null) {
            f5114 = (f5113 + 77) % 128;
            return bVar.mo5384(list, interfaceC2704ch);
        }
        String str3 = this.f5122;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m5459("妉姌紏\ud8c2䙖\uda20阊뀮쒏㧾㒉향挄鼩儕盝膼˘ﾳ蠅ⰷ恃᰼ⷘ䪻쟋뤜你\ue954╮⟘\ue0f6េ袦䐃", 1 - (ViewConfiguration.getTouchSlop() >> 8)).intern());
        sb2.append(str);
        sb2.append(m5458((byte) (TextUtils.indexOf("", "") - 23), (short) KeyEvent.getDeadChar(0, 0), (-16777213) - Color.rgb(0, 0, 0), (-1237197854) - Process.getGidForName(""), View.MeasureSpec.makeMeasureSpec(0, 0) - 1685001839).intern());
        C2713cq.m6350(str3, sb2.toString(), null);
        f5114 = (f5113 + 79) % 128;
        return null;
    }

    /* renamed from: ﻐ */
    public final void m5462(String str) {
        int i = (f5114 + 67) % 128;
        f5113 = i;
        this.f5124 = str;
        f5114 = (i + 33) % 128;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0197  */
    /* renamed from: ﻐ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.Class m5455(java.lang.String r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 614
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.p009i.AbstractC2676bg.m5455(java.lang.String, boolean):java.lang.Class");
    }

    /* renamed from: ﾇ */
    private static String m5458(byte b2, short s, int i, int i2, int i3) {
        String string;
        synchronized (C2912k.f7200) {
            try {
                StringBuilder sb = new StringBuilder();
                int i4 = f5115;
                int i5 = i + i4;
                int i6 = i5 == -1 ? 1 : 0;
                if (i6 != 0) {
                    byte[] bArr = f5116;
                    if (bArr != null) {
                        i5 = (byte) (bArr[f5120 + i2] + i4);
                    } else {
                        i5 = (short) (f5117[f5120 + i2] + i4);
                    }
                }
                if (i5 > 0) {
                    C2912k.f7203 = ((i2 + i5) - 2) + f5120 + i6;
                    C2912k.f7201 = b2;
                    char c = (char) (i3 + f5118);
                    C2912k.f7204 = c;
                    sb.append(c);
                    C2912k.f7202 = C2912k.f7204;
                    C2912k.f7205 = 1;
                    while (C2912k.f7205 < i5) {
                        byte[] bArr2 = f5116;
                        if (bArr2 != null) {
                            int i7 = C2912k.f7203;
                            C2912k.f7203 = i7 - 1;
                            C2912k.f7204 = (char) (C2912k.f7202 + (((byte) (bArr2[i7] + s)) ^ C2912k.f7201));
                        } else {
                            short[] sArr = f5117;
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
