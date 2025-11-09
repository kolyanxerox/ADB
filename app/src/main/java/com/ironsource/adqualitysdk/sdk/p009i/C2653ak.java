package com.ironsource.adqualitysdk.sdk.p009i;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatDelegate;
import com.ironsource.InterfaceC3173h3;
import com.ironsource.adqualitysdk.sdk.ISAdQualityAdType;
import com.ironsource.adqualitysdk.sdk.ISAdQualityCustomMediationRevenue;
import com.ironsource.adqualitysdk.sdk.ISAdQualityMediationNetwork;
import java.util.Collections;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ak */
/* loaded from: classes2.dex */
public final class C2653ak {

    /* renamed from: ﮐ */
    private static int f4648 = 1;

    /* renamed from: ﻏ */
    private static int f4649;

    /* renamed from: ﾇ */
    private final C2666ax f4653;

    /* renamed from: ﾒ */
    private boolean f4654;

    /* renamed from: ﻛ */
    private static int[] f4651 = {2094579259, -1379537717, -2085660492, 869151432, 903032347, 547164408, 1191891304, -87243759, -656985281, 1899473992, 2147099519, 1470694587, -1616454559, 1503493146, -1710259946, 1202049857, -1240026151, 974460477};

    /* renamed from: ｋ */
    private static char[] f4652 = {'C', 25875, 51850, 12401, 38332, 64282, 24799, 50811, 11262, 37222, 63060, 23429, 49453, 9913, 35912, 61889, 22349, 48306, 8809, 34579, 60556, 21043, 47021, 7498, 33497, 59469, 19962, 45862, 6154, 32143, 58154, 18603, 44590, 5063, 31041, 57004, 17448, 43287, 3717, 29741, 55715, 16171, 42202, 2625, 28600, 54631, 14873, 40842, 1289, 27315, 53296, 13791, 39751, 244, 26156, 51984, 12437, 38422, 64419, 24873, 50890, 11329, 'C', 25875, 51850, 12401, 38332, 64282, 24799, 50811, 11262, 37222, 63060, 23429, 49453, 9913, 35912, 61889, 22349, 48306, 8809, 34579, 60556, 21043, 47021, 7498, 33497, 59469, 19962, 45862, 6154, 32143, 58154, 18603, 44590, 5063, 31041, 57004, 17448, 43273, 3737, 29742, 55712, 16173, 42182, 2642, 28669, 54638, 14940, 40847, 1284, 27378, 53296, 13775, 39768, 255, 26239, 52062, 12433, 38416, 64433, 24934, 50897, 11332, 37352, 63339, 23794, 49537, 10000, 36031, 62012, 22483, 48461, 8946, 34876, 60834, 21122, 47119, 7612, 33583, 59603, 19970, 45952, 6496, 32481, 58241, 18697, 44712, 5160, 31195, 57172, 17538, 43618, 4079, 29852, 55823, 16307, 42350, 2721, 28764, 54720, 15158, 41210, 1439, 27419, 53439, 13858, 39846, 337, 26306, 6483, 31783, 54196, 10515, 35994, 57961, 31203, 57168, 13017, 34881, 'a', 25858, 51860, 12346, 38311, 64332, 24773, 50800, 'u', 25884, 51853, 12322, 38321, 64347, 24776, 50797};

    /* renamed from: ﻐ */
    private static long f4650 = -7614355510583990926L;

    public C2653ak(C2666ax c2666ax) {
        this.f4653 = c2666ax;
        AbstractC2894ji.m7268().m7271(new AbstractC2891jf() { // from class: com.ironsource.adqualitysdk.sdk.i.ak.2
            @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2891jf, android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityDestroyed(Activity activity) {
                C2926s.m7600(new AbstractRunnableC2878it() { // from class: com.ironsource.adqualitysdk.sdk.i.ak.2.5

                    /* renamed from: ｋ */
                    private static int f4656 = 0;

                    /* renamed from: ﾇ */
                    private static int f4657 = 1;

                    /* renamed from: ﾒ */
                    private static int[] f4658 = {2021090716, -56670383, -916671756, -1963451209, 158197227, -1800375646, 1926547179, -1980354249, -251462498, -1354540345, -1236338105, -1196346869, 1579866417, 2002748715, -945706649, 1979894415, -1984455466, -698115778};

                    /* renamed from: ｋ */
                    private static String m5091(int[] iArr, int i) {
                        String str;
                        synchronized (C2723d.f5953) {
                            try {
                                char[] cArr = new char[4];
                                char[] cArr2 = new char[iArr.length << 1];
                                int[] iArr2 = (int[]) f4658.clone();
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
                    public final void mo4950() throws Exception {
                        int i = f4657 + InterfaceC3173h3.d.b.f8821d;
                        f4656 = i % 128;
                        if (i % 2 != 0) {
                            C2653ak.m5081(C2653ak.this);
                            throw null;
                        }
                        if (C2653ak.m5081(C2653ak.this)) {
                            C2653ak.m5085(C2653ak.this).m5302(m5091(new int[]{-638106459, 1934979984, -220688607, 956241831, -1919236838, -1986767602, -1739069842, 22791544, 1676545103, 662583075, 2142220737, -961711105}, (ViewConfiguration.getTapTimeout() >> 16) + 24).intern());
                            C2653ak.m5088(C2653ak.this, false);
                            f4656 = (f4657 + 7) % 128;
                        }
                    }
                });
            }
        });
    }

    /* renamed from: ﻐ */
    public static /* synthetic */ JSONObject m5079(C2653ak c2653ak, ISAdQualityCustomMediationRevenue iSAdQualityCustomMediationRevenue) throws JSONException {
        f4649 = (f4648 + 17) % 128;
        JSONObject jSONObjectM5084 = m5084(iSAdQualityCustomMediationRevenue);
        f4648 = (f4649 + 57) % 128;
        return jSONObjectM5084;
    }

    /* renamed from: ﻛ */
    public static /* synthetic */ boolean m5081(C2653ak c2653ak) {
        int i = (f4648 + 43) % 128;
        f4649 = i;
        boolean z = c2653ak.f4654;
        int i2 = i + InterfaceC3173h3.d.b.f8826i;
        f4648 = i2 % 128;
        if (i2 % 2 != 0) {
            return z;
        }
        throw null;
    }

    /* renamed from: ｋ */
    private static JSONObject m5084(ISAdQualityCustomMediationRevenue iSAdQualityCustomMediationRevenue) throws JSONException {
        C2734dk c2734dk = new C2734dk();
        c2734dk.m6616(true);
        c2734dk.m6614(Double.valueOf(iSAdQualityCustomMediationRevenue.getRevenue()));
        c2734dk.m6615(m5082(iSAdQualityCustomMediationRevenue.getMediationNetwork()));
        c2734dk.m6612(iSAdQualityCustomMediationRevenue.getPlacement());
        JSONObject jSONObjectM6613 = c2734dk.m6613();
        f4648 = (f4649 + 55) % 128;
        return jSONObjectM6613;
    }

    /* renamed from: ﾇ */
    public static /* synthetic */ C2666ax m5085(C2653ak c2653ak) {
        int i = (f4649 + 107) % 128;
        f4648 = i;
        C2666ax c2666ax = c2653ak.f4653;
        int i2 = i + 71;
        f4649 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 64 / 0;
        }
        return c2666ax;
    }

    /* renamed from: ﾒ */
    private boolean m5089(ISAdQualityCustomMediationRevenue iSAdQualityCustomMediationRevenue) {
        if (iSAdQualityCustomMediationRevenue == null) {
            return false;
        }
        if (iSAdQualityCustomMediationRevenue.getRevenue() < 0.0d) {
            f4648 = (f4649 + 55) % 128;
            C2921n.m7502(m5083(new int[]{1539288035, -2044068693, 1236177411, 584287002, -1806784742, -576803014, -594459417, 582118488, 605154402, 2130284189, 1653296393, 702607237, -1716675478, 254688898, 1590052673, -2103564681}, 33 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))).intern(), m5083(new int[]{707595153, -351969792, 674255082, -1186328441, -1908375730, -1822714859, 960298743, -1792339411, -1772820768, -1277632656, -499234418, 1363279653, -1198600496, 891201343, 280849393, 1207193725, 695862594, -337816098, 412596950, -640986931, 1590052673, -2103564681, 1978460924, -1091187760, 132651280, -2014947537, -1270087199, -952193824, -11379966, 827392690, 1575076592, -1107888948, -1101117365, 289872756}, Process.getGidForName("") + 68).intern());
            return false;
        }
        if (m5080(iSAdQualityCustomMediationRevenue.getMediationNetwork())) {
            if (m5087(iSAdQualityCustomMediationRevenue.getAdType())) {
                return true;
            }
            C2921n.m7502(m5083(new int[]{1539288035, -2044068693, 1236177411, 584287002, -1806784742, -576803014, -594459417, 582118488, 605154402, 2130284189, 1653296393, 702607237, -1716675478, 254688898, 1590052673, -2103564681}, (Process.myTid() >> 22) + 32).intern(), m5086((KeyEvent.getMaxKeyCode() >> 16) + AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR, 62 - (KeyEvent.getMaxKeyCode() >> 16), (char) (ViewConfiguration.getScrollBarSize() >> 8)).intern());
            return false;
        }
        f4648 = (f4649 + 15) % 128;
        C2921n.m7502(m5083(new int[]{1539288035, -2044068693, 1236177411, 584287002, -1806784742, -576803014, -594459417, 582118488, 605154402, 2130284189, 1653296393, 702607237, -1716675478, 254688898, 1590052673, -2103564681}, 32 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)).intern(), m5086(TextUtils.indexOf("", "", 0) + 62, TextUtils.getOffsetBefore("", 0), (char) (ViewConfiguration.getKeyRepeatDelay() >> 16)).intern());
        f4648 = (f4649 + 95) % 128;
        return false;
    }

    /* renamed from: ﻐ */
    private static boolean m5080(ISAdQualityMediationNetwork iSAdQualityMediationNetwork) {
        if (iSAdQualityMediationNetwork == null) {
            return false;
        }
        int i = f4648 + 39;
        f4649 = i % 128;
        int i2 = i % 2;
        String strM5082 = m5082(iSAdQualityMediationNetwork);
        if (i2 != 0) {
            TextUtils.isEmpty(strM5082);
            throw null;
        }
        if (TextUtils.isEmpty(strM5082)) {
            return false;
        }
        f4649 = (f4648 + 31) % 128;
        return true;
    }

    /* renamed from: ﾇ */
    public static /* synthetic */ boolean m5088(C2653ak c2653ak, boolean z) {
        int i = f4648;
        f4649 = (i + 55) % 128;
        c2653ak.f4654 = z;
        f4649 = (i + 125) % 128;
        return z;
    }

    /* renamed from: ﾇ */
    public final void m5090(@NonNull final ISAdQualityCustomMediationRevenue iSAdQualityCustomMediationRevenue) {
        f4649 = (f4648 + 123) % 128;
        if (m5089(iSAdQualityCustomMediationRevenue)) {
            C2926s.m7594(new AbstractRunnableC2878it() { // from class: com.ironsource.adqualitysdk.sdk.i.ak.5

                /* renamed from: ﱡ */
                private static int f4660 = 0;

                /* renamed from: ﺙ */
                private static int f4661 = 1;

                /* renamed from: ﻐ */
                private static int f4662 = 0;

                /* renamed from: ﻛ */
                private static char f4663 = 0;

                /* renamed from: ﾒ */
                private static long f4664 = 6566127689784953448L;

                /* renamed from: ﻐ */
                private static String m5092(int i, char c, String str, String str2, String str3) {
                    String str4;
                    char[] charArray = str3;
                    if (str3 != null) {
                        charArray = str3.toCharArray();
                    }
                    char[] cArr = charArray;
                    char[] charArray2 = str2;
                    if (str2 != null) {
                        charArray2 = str2.toCharArray();
                    }
                    char[] cArr2 = charArray2;
                    char[] charArray3 = str;
                    if (str != null) {
                        charArray3 = str.toCharArray();
                    }
                    char[] cArr3 = charArray3;
                    synchronized (C2885j.f6936) {
                        try {
                            char[] cArr4 = (char[]) cArr3.clone();
                            char[] cArr5 = (char[]) cArr.clone();
                            cArr4[0] = (char) (c ^ cArr4[0]);
                            cArr5[2] = (char) (cArr5[2] + ((char) i));
                            int length = cArr2.length;
                            char[] cArr6 = new char[length];
                            C2885j.f6934 = 0;
                            while (true) {
                                int i2 = C2885j.f6934;
                                if (i2 < length) {
                                    int i3 = (i2 + 2) % 4;
                                    int i4 = (i2 + 3) % 4;
                                    int i5 = cArr4[i2 % 4] * 32718;
                                    char c2 = cArr5[i3];
                                    char c3 = (char) ((i5 + c2) % 65535);
                                    C2885j.f6935 = c3;
                                    cArr5[i4] = (char) (((cArr4[i4] * 32718) + c2) / 65535);
                                    cArr4[i4] = c3;
                                    int i6 = C2885j.f6934;
                                    cArr6[i6] = (char) ((((c3 ^ cArr2[i6]) ^ f4664) ^ f4662) ^ f4663);
                                    C2885j.f6934 = i6 + 1;
                                } else {
                                    str4 = new String(cArr6);
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return str4;
                }

                @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractRunnableC2878it
                /* renamed from: ﾒ */
                public final void mo4950() {
                    f4660 = (f4661 + 73) % 128;
                    C2653ak.m5085(C2653ak.this).m5304(m5092(261718382 - (ViewConfiguration.getWindowTouchSlop() >> 8), (char) TextUtils.getTrimmedLength(""), "滴馁匏҆", "閇\ud9bf귡绠な崲娙莡哢ꨴ蟕쓕㒥줵\ud83e\u2450ꃘ\uf6ef枉풧△", "੨卽鉘嬟").intern(), Collections.singletonList(C2653ak.m5079(C2653ak.this, iSAdQualityCustomMediationRevenue)));
                    C2653ak.m5088(C2653ak.this, true);
                    int i = f4661 + 85;
                    f4660 = i % 128;
                    if (i % 2 != 0) {
                        throw null;
                    }
                }
            }, AbstractC2661as.m5141().mo5160());
        }
        f4648 = (f4649 + 13) % 128;
    }

    /* renamed from: ｋ */
    private static String m5082(ISAdQualityMediationNetwork iSAdQualityMediationNetwork) {
        if (iSAdQualityMediationNetwork == ISAdQualityMediationNetwork.ADMOB) {
            int i = f4649 + 109;
            f4648 = i % 128;
            return i % 2 == 0 ? m5083(new int[]{-1416935936, -1870916322, -1599992611, -178358419}, (ViewConfiguration.getFadingEdgeLength() % 25) + 4).intern() : m5083(new int[]{-1416935936, -1870916322, -1599992611, -178358419}, 5 - (ViewConfiguration.getFadingEdgeLength() >> 16)).intern();
        }
        if (iSAdQualityMediationNetwork == ISAdQualityMediationNetwork.DT_FAIR_BID) {
            return m5083(new int[]{-231184948, -2092786356, -983193274, -381664093}, (ViewConfiguration.getLongPressTimeout() >> 16) + 7).intern();
        }
        if (iSAdQualityMediationNetwork == ISAdQualityMediationNetwork.HELIUM) {
            return m5083(new int[]{-2015239621, -887947085, 549693568, 608918031}, 6 - View.resolveSize(0, 0)).intern();
        }
        if (iSAdQualityMediationNetwork == ISAdQualityMediationNetwork.LEVEL_PLAY) {
            return m5086(10 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), View.getDefaultSize(0, 0) + 170, (char) (6432 - (ViewConfiguration.getDoubleTapTimeout() >> 16))).intern();
        }
        if (iSAdQualityMediationNetwork == ISAdQualityMediationNetwork.MAX) {
            return m5086(Color.red(0) + 8, (ViewConfiguration.getTouchSlop() >> 8) + 180, (char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)))).intern();
        }
        if (iSAdQualityMediationNetwork == ISAdQualityMediationNetwork.UNITY) {
            String strIntern = m5086(7 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 189 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) Drawable.resolveOpacity(0, 0)).intern();
            int i2 = f4648 + 71;
            f4649 = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 37 / 0;
            }
            return strIntern;
        }
        if (iSAdQualityMediationNetwork == ISAdQualityMediationNetwork.SELF_MEDIATED) {
            return m5083(new int[]{-486545385, -1531874444, -64195124, -440541167, -824957293, -863121247}, TextUtils.getCapsMode("", 0, 0) + 12).intern();
        }
        if (iSAdQualityMediationNetwork != ISAdQualityMediationNetwork.OTHER) {
            return "";
        }
        int i4 = f4649 + 9;
        f4648 = i4 % 128;
        return i4 % 2 == 0 ? m5083(new int[]{1808733009, -542980471, 1721613191, -12525561}, 5 >>> (ViewConfiguration.getScrollDefaultDelay() >>> 125)).intern() : m5083(new int[]{1808733009, -542980471, 1721613191, -12525561}, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 5).intern();
    }

    /* renamed from: ﾇ */
    private static boolean m5087(ISAdQualityAdType iSAdQualityAdType) {
        if (iSAdQualityAdType == ISAdQualityAdType.INTERSTITIAL) {
            return true;
        }
        f4649 = (f4648 + 61) % 128;
        if (iSAdQualityAdType == ISAdQualityAdType.VIDEO) {
            return true;
        }
        f4649 = (f4648 + 27) % 128;
        if (iSAdQualityAdType == ISAdQualityAdType.REWARDED_VIDEO) {
            return true;
        }
        f4649 = (f4648 + 27) % 128;
        return iSAdQualityAdType == ISAdQualityAdType.REWARDED;
    }

    /* renamed from: ﾇ */
    private static String m5086(int i, int i2, char c) {
        String str;
        synchronized (C2642a.f4435) {
            try {
                char[] cArr = new char[i];
                C2642a.f4436 = 0;
                while (true) {
                    int i3 = C2642a.f4436;
                    if (i3 < i) {
                        cArr[i3] = (char) ((f4652[i2 + i3] ^ (i3 * f4650)) ^ c);
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
    private static String m5083(int[] iArr, int i) {
        String str;
        synchronized (C2723d.f5953) {
            try {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) f4651.clone();
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
