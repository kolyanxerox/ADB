package com.ironsource.adqualitysdk.sdk.p009i;

import android.text.TextUtils;
import android.view.ViewConfiguration;
import com.ironsource.InterfaceC3173h3;
import com.ironsource.adqualitysdk.sdk.ISAdQualityDeviceIdType;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ao */
/* loaded from: classes2.dex */
public final class C2657ao {

    /* renamed from: ﭴ */
    private static int f4684 = 0;

    /* renamed from: ﮌ */
    private static int f4685 = 1;

    /* renamed from: ﮐ */
    private static char[] f4686 = {53450, 34557, 31932, 53881, 34831, 32719, 54676};

    /* renamed from: ﱡ */
    private static long f4687 = -3457442536816159178L;

    /* renamed from: ﺙ */
    private ISAdQualityDeviceIdType f4689;

    /* renamed from: ﻛ */
    private String f4692 = "";

    /* renamed from: ﾇ */
    private String f4694 = m5106(TextUtils.lastIndexOf("", '0', 0) + 8, ViewConfiguration.getMinimumFlingVelocity() >> 16, (char) (53380 - TextUtils.getOffsetBefore("", 0))).intern();

    /* renamed from: ﾒ */
    private boolean f4695 = true;

    /* renamed from: ｋ */
    private String f4693 = "";

    /* renamed from: ﻐ */
    private boolean f4691 = false;

    /* renamed from: ﻏ */
    private Map<String, String> f4690 = new HashMap();

    /* renamed from: ﱟ */
    private boolean f4688 = false;

    /* renamed from: ﱟ */
    public final void m5107() {
        int i = f4684 + 71;
        f4685 = i % 128;
        int i2 = i % 2;
        this.f4688 = true;
    }

    /* renamed from: ﱡ */
    public final Map<String, String> m5108() {
        int i = f4684 + 89;
        f4685 = i % 128;
        if (i % 2 != 0) {
            return this.f4690;
        }
        throw null;
    }

    /* renamed from: ﺙ */
    public final boolean m5109() {
        int i = f4685 + InterfaceC3173h3.d.b.f8823f;
        f4684 = i % 128;
        if (i % 2 == 0) {
            return this.f4688;
        }
        throw null;
    }

    /* renamed from: ﻏ */
    public final ISAdQualityDeviceIdType m5110() {
        int i = f4685;
        ISAdQualityDeviceIdType iSAdQualityDeviceIdType = this.f4689;
        int i2 = i + 89;
        f4684 = i2 % 128;
        if (i2 % 2 == 0) {
            return iSAdQualityDeviceIdType;
        }
        throw null;
    }

    /* renamed from: ﻐ */
    public final void m5111(String str) {
        int i = f4685 + 71;
        int i2 = i % 128;
        f4684 = i2;
        int i3 = i % 2;
        this.f4692 = str;
        if (i3 != 0) {
            throw null;
        }
        int i4 = i2 + 3;
        f4685 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 28 / 0;
        }
    }

    /* renamed from: ﻛ */
    public final String m5113() {
        int i = f4685;
        String str = this.f4692;
        int i2 = i + 13;
        f4684 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 11 / 0;
        }
        return str;
    }

    /* renamed from: ｋ */
    public final synchronized String m5114() {
        String str;
        try {
            int i = f4685 + InterfaceC3173h3.d.b.f8826i;
            int i2 = i % 128;
            f4684 = i2;
            if (i % 2 != 0) {
                str = this.f4694;
                int i3 = 34 / 0;
            } else {
                str = this.f4694;
            }
            int i4 = i2 + 29;
            f4685 = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
        } catch (Throwable th) {
            throw th;
        }
        return str;
    }

    /* renamed from: ﾇ */
    public final synchronized void m5120(String str) {
        int i = f4684;
        int i2 = i + 97;
        f4685 = i2 % 128;
        if (i2 % 2 == 0) {
            this.f4694 = str;
            throw null;
        }
        this.f4694 = str;
        f4685 = (i + 119) % 128;
    }

    /* renamed from: ﾒ */
    public final boolean m5122() {
        int i = f4684 + 59;
        f4685 = i % 128;
        if (i % 2 != 0) {
            return this.f4695;
        }
        int i2 = 29 / 0;
        return this.f4695;
    }

    /* renamed from: ﻐ */
    public final boolean m5112() {
        int i = f4684;
        boolean z = this.f4691;
        f4685 = (i + InterfaceC3173h3.d.b.f8823f) % 128;
        return z;
    }

    /* renamed from: ｋ */
    public final void m5115(String str) {
        int i = f4684;
        int i2 = i + 9;
        f4685 = i2 % 128;
        int i3 = i2 % 2;
        this.f4693 = str;
        if (i3 == 0) {
            int i4 = 60 / 0;
        }
        int i5 = i + 37;
        f4685 = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ﾇ */
    public final String m5118() {
        int i = f4685 + InterfaceC3173h3.d.b.f8826i;
        f4684 = i % 128;
        if (i % 2 == 0) {
            return this.f4693;
        }
        throw null;
    }

    /* renamed from: ﾒ */
    public final void m5121(boolean z) {
        int i = f4685;
        this.f4695 = z;
        int i2 = i + InterfaceC3173h3.d.b.f8823f;
        f4684 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ﾒ */
    private static String m5106(int i, int i2, char c) {
        String str;
        synchronized (C2642a.f4435) {
            try {
                char[] cArr = new char[i];
                C2642a.f4436 = 0;
                while (true) {
                    int i3 = C2642a.f4436;
                    if (i3 < i) {
                        cArr[i3] = (char) ((f4686[i2 + i3] ^ (i3 * f4687)) ^ c);
                        C2642a.f4436 = i3 + 1;
                    } else {
                        str = new String(cArr);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    /* renamed from: ｋ */
    public final void m5117(boolean z) {
        int i = (f4684 + 7) % 128;
        f4685 = i;
        this.f4691 = z;
        f4684 = (i + 85) % 128;
    }

    /* renamed from: ﾇ */
    public final void m5119(ISAdQualityDeviceIdType iSAdQualityDeviceIdType) {
        int i = f4684 + 85;
        f4685 = i % 128;
        int i2 = i % 2;
        this.f4689 = iSAdQualityDeviceIdType;
        if (i2 == 0) {
            int i3 = 58 / 0;
        }
    }

    /* renamed from: ｋ */
    public final void m5116(Map<String, String> map) {
        int i = f4685 + 21;
        int i2 = i % 128;
        f4684 = i2;
        int i3 = i % 2;
        this.f4690 = map;
        if (i3 != 0) {
            int i4 = 92 / 0;
        }
        f4685 = (i2 + 51) % 128;
    }
}
