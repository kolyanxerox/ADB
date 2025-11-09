package com.ironsource.adqualitysdk.sdk.p009i;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import com.ironsource.InterfaceC3173h3;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.iz */
/* loaded from: classes2.dex */
public final class C2884iz extends BroadcastReceiver {

    /* renamed from: ﮐ */
    private static int f6918 = 1;

    /* renamed from: ﱡ */
    private static int f6919;

    /* renamed from: ｋ */
    private static int[] f6920;

    /* renamed from: ﾒ */
    private static String f6921;

    /* renamed from: ﻛ */
    private Context f6923;

    /* renamed from: ﾇ */
    private boolean f6924 = false;

    /* renamed from: ﻐ */
    private Set<InterfaceC2876ir> f6922 = new HashSet();

    static {
        m7168();
        f6921 = m7171(new int[]{1629707547, 657328492, 1858167539, -1219310141, -1651965719, 1346697530, -1156818960, -1995905252, -1348457785, 1815394219}, 20 - (Process.myPid() >> 22)).intern();
        int i = f6919 + 67;
        f6918 = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public C2884iz(Context context) {
        this.f6923 = context.getApplicationContext();
        C2921n.m7500(f6921, m7171(new int[]{1895305721, 1332865827, -1545500110, 243575598, -1149866182, -1645084613, 2145995328, -1912767410, -44128612, -1034827097, -1985035452, -1897914413, 1968464475, -1872792716, 1595739492, 1366971894}, (Process.myTid() >> 22) + 30).intern());
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(m7171(new int[]{-1072575139, -379969675, 1534352560, -567546495, -8009819, -1266244966, 702640470, -1164157678, -164169340, 1142584323, -1029995911, 2130581777, 2059563727, 183758623, 637897614, -1002058098, 180745230, 920622199}, 36 - (Process.myTid() >> 22)).intern());
        this.f6923.registerReceiver(this, intentFilter);
    }

    /* renamed from: ﱟ */
    private synchronized Set<InterfaceC2876ir> m7167() {
        HashSet hashSet = new HashSet(this.f6922);
        int i = f6919 + 89;
        f6918 = i % 128;
        if (i % 2 != 0) {
            return hashSet;
        }
        int i2 = 68 / 0;
        return hashSet;
    }

    /* renamed from: ﺙ */
    public static void m7168() {
        f6920 = new int[]{2122278966, -1028962310, -1551100526, 1750173566, -367908708, 1556435544, -1104251555, 1576056311, -877537701, 831993725, 889648699, 1487514202, -1075654584, -264053196, -1240711573, -1145202918, 145654545, -1923854875};
    }

    /* renamed from: ｋ */
    public static /* synthetic */ String m7170() {
        int i = f6919 + 59;
        f6918 = i % 128;
        if (i % 2 != 0) {
            return f6921;
        }
        throw null;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(final Context context, final Intent intent) {
        C2926s.m7600(new AbstractRunnableC2878it() { // from class: com.ironsource.adqualitysdk.sdk.i.iz.2

            /* renamed from: ﱟ */
            private static int f6925 = 1;

            /* renamed from: ﻐ */
            private static int[] f6926 = {2005493371, -841400590, 148556833, -27146506, -979854212, -204338742, -634901745, -435974402, -1622115050, 1237570580, 1516339807, 1823527510, -623880020, 292068933, -1174726423, -1703220422, -24503458, -804044852};

            /* renamed from: ﻛ */
            private static int f6927;

            /* renamed from: ﻐ */
            private static String m7182(int[] iArr, int i) {
                String str;
                synchronized (C2723d.f5953) {
                    try {
                        char[] cArr = new char[4];
                        char[] cArr2 = new char[iArr.length << 1];
                        int[] iArr2 = (int[]) f6926.clone();
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

            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
            /* renamed from: ﾒ */
            public final void mo4950() {
                int i = f6927 + 63;
                f6925 = i % 128;
                try {
                    if (i % 2 == 0) {
                        if (!intent.getAction().equals(m7182(new int[]{-99749323, 1845556534, 1803633288, 1179482042, -1184329417, -567585717, -133392581, 103764985, -2133062953, -1239390194, -2034173888, 1398933603, -33327527, 955762279, -1190007795, -752253118, -133220279, 1932281308}, 74 / (ViewConfiguration.getPressedStateDuration() >> 107)).intern())) {
                            return;
                        }
                    } else if (!intent.getAction().equals(m7182(new int[]{-99749323, 1845556534, 1803633288, 1179482042, -1184329417, -567585717, -133392581, 103764985, -2133062953, -1239390194, -2034173888, 1398933603, -33327527, 955762279, -1190007795, -752253118, -133220279, 1932281308}, (ViewConfiguration.getPressedStateDuration() >> 16) + 36).intern())) {
                        return;
                    }
                    C2921n.m7518(C2884iz.m7170(), m7182(new int[]{-525164393, 744399271, 261125374, -2132164689, -133392581, 103764985, -945656816, -1195558763, 957672357, -354227765, -1152515314, -1011681112, 1755163892, -1620884688}, Color.green(0) + 27).intern());
                    if (!intent.getBooleanExtra(m7182(new int[]{-2016248418, -731969610, 1737838229, -700703233, -161254375, -556305078, -2135494626, -1708897537}, 14 - (ViewConfiguration.getJumpTapTimeout() >> 16)).intern(), false)) {
                        if (C2884iz.m7173(C2884iz.this, context)) {
                            C2926s.m7596(new AbstractRunnableC2878it() { // from class: com.ironsource.adqualitysdk.sdk.i.iz.2.4
                                @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
                                /* renamed from: ﾒ */
                                public final void mo4950() {
                                    C2884iz.m7172(C2884iz.this, true);
                                    C2884iz.this.m7179();
                                }
                            });
                            return;
                        } else {
                            C2926s.m7596(new AbstractRunnableC2878it() { // from class: com.ironsource.adqualitysdk.sdk.i.iz.2.1
                                @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
                                /* renamed from: ﾒ */
                                public final void mo4950() {
                                    C2884iz.m7172(C2884iz.this, false);
                                    C2884iz.this.m7176();
                                }
                            });
                            return;
                        }
                    }
                    C2921n.m7518(C2884iz.m7170(), m7182(new int[]{1299578726, -1743615335, 1864001520, -1117432411, 959356649, -144690878, 191461418, -661585442, 1132738218, 1886173234, 1952749992, 1394423201, -1818828902, -844891427, 2045928282, 315570959}, ImageFormat.getBitsPerPixel(0) + 32).intern());
                    C2926s.m7596(new AbstractRunnableC2878it() { // from class: com.ironsource.adqualitysdk.sdk.i.iz.2.5
                        @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
                        /* renamed from: ﾒ */
                        public final void mo4950() {
                            C2884iz.this.m7176();
                            C2884iz.m7172(C2884iz.this, false);
                        }
                    });
                    int i2 = f6925 + 85;
                    f6927 = i2 % 128;
                    if (i2 % 2 != 0) {
                        int i3 = 52 / 0;
                    }
                } catch (Exception e) {
                    C2914kb.m7426(C2884iz.m7170(), m7182(new int[]{-972276052, 1405703199, -1817963556, 341685493, 716079971, 617782936, 382410257, 1806188021, 1407827197, -843576403}, 18 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))).intern(), (Throwable) e, false);
                }
            }
        });
        f6918 = (f6919 + 75) % 128;
    }

    /* renamed from: ﻐ */
    public final synchronized void m7177(InterfaceC2876ir interfaceC2876ir) {
        int i = f6919 + 123;
        f6918 = i % 128;
        if (i % 2 == 0) {
            this.f6922.add(interfaceC2876ir);
            throw null;
        }
        this.f6922.add(interfaceC2876ir);
    }

    /* renamed from: ﻛ */
    public final void m7178() {
        f6919 = (f6918 + 89) % 128;
        this.f6923.unregisterReceiver(this);
        f6918 = (f6919 + 81) % 128;
    }

    /* renamed from: ﾇ */
    public final void m7179() {
        Iterator<InterfaceC2876ir> it = m7167().iterator();
        while (it.hasNext()) {
            it.next().mo5050();
            f6918 = (f6919 + 57) % 128;
        }
        f6919 = (f6918 + 61) % 128;
    }

    /* renamed from: ﾒ */
    public final synchronized void m7180(InterfaceC2876ir interfaceC2876ir) {
        f6918 = (f6919 + InterfaceC3173h3.d.b.f8821d) % 128;
        this.f6922.remove(interfaceC2876ir);
        f6918 = (f6919 + 89) % 128;
    }

    /* renamed from: ﻛ */
    private static boolean m7169(Context context) {
        f6918 = (f6919 + 97) % 128;
        NetworkInfo networkInfoM7175 = m7175(context);
        if (networkInfoM7175 != null) {
            int i = f6919 + 73;
            f6918 = i % 128;
            if (i % 2 == 0) {
                networkInfoM7175.isConnected();
                throw null;
            }
            if (networkInfoM7175.isConnected()) {
                String str = f6921;
                StringBuilder sb = new StringBuilder();
                sb.append(m7171(new int[]{1629707547, 657328492, 1474289885, 1342520013}, TextUtils.indexOf((CharSequence) "", '0', 0) + 9).intern());
                sb.append(networkInfoM7175.getTypeName());
                sb.append(m7171(new int[]{2124198339, 179647037, 1262350957, -1871878628, 686545111, -1211493575}, (ViewConfiguration.getScrollBarSize() >> 8) + 11).intern());
                C2921n.m7518(str, sb.toString());
                return true;
            }
        }
        int i2 = f6918 + 13;
        f6919 = i2 % 128;
        if (i2 % 2 == 0) {
            return false;
        }
        throw null;
    }

    /* renamed from: ｋ */
    public static /* synthetic */ void m7172(C2884iz c2884iz, boolean z) {
        f6918 = (f6919 + 41) % 128;
        c2884iz.m7174(z);
        f6918 = (f6919 + 79) % 128;
    }

    /* renamed from: ﻐ */
    public final void m7176() {
        f6919 = (f6918 + InterfaceC3173h3.d.b.f8826i) % 128;
        Iterator<InterfaceC2876ir> it = m7167().iterator();
        f6918 = (f6919 + 87) % 128;
        while (it.hasNext()) {
            f6918 = (f6919 + 5) % 128;
            it.next();
        }
    }

    /* renamed from: ﾒ */
    public final synchronized boolean m7181() {
        boolean z;
        int i = f6918;
        int i2 = i + 19;
        f6919 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        z = this.f6924;
        f6919 = (i + 13) % 128;
        return z;
    }

    /* renamed from: ｋ */
    public static /* synthetic */ boolean m7173(C2884iz c2884iz, Context context) {
        int i = f6919 + 81;
        f6918 = i % 128;
        if (i % 2 != 0) {
            return m7169(context);
        }
        m7169(context);
        throw null;
    }

    /* renamed from: ﾒ */
    private static NetworkInfo m7175(Context context) {
        f6918 = (f6919 + 53) % 128;
        if (context == null) {
            return null;
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService(m7171(new int[]{702640470, -1164157678, -1392051323, -1684407193, -376239105, -269561256}, Drawable.resolveOpacity(0, 0) + 12).intern())).getActiveNetworkInfo();
        f6918 = (f6919 + 23) % 128;
        return activeNetworkInfo;
    }

    /* renamed from: ｋ */
    private static String m7171(int[] iArr, int i) {
        String str;
        synchronized (C2723d.f5953) {
            try {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) f6920.clone();
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
    private synchronized void m7174(boolean z) {
        int i = f6919;
        this.f6924 = z;
        f6918 = (i + 59) % 128;
    }
}
