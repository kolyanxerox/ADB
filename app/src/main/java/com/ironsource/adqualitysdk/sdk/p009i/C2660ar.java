package com.ironsource.adqualitysdk.sdk.p009i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.ironsource.InterfaceC3173h3;
import com.ironsource.adqualitysdk.sdk.p009i.AbstractC2661as;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ar */
/* loaded from: classes2.dex */
public final class C2660ar extends AbstractC2661as.AnonymousClass3 {

    /* renamed from: ﱟ */
    private static int f4705 = 1;

    /* renamed from: ﻏ */
    private static int f4706;

    /* renamed from: ﻛ */
    private final int f4711 = (int) TimeUnit.SECONDS.toMillis(120);

    /* renamed from: ﾇ */
    private static int[] f4709 = {184801126, -1639353577, -274655506, 1648228947, -1057480481, 1068008412, 123411374, -1006540659, -1715508370, -553615642, -2114135597, 8010784, 1319891523, -680565863, 1621223362, 1899910779, 1537152614, -2094689366};

    /* renamed from: ﻐ */
    private static long f4707 = 80902793371995309L;

    /* renamed from: ﾒ */
    private static int f4710 = 0;

    /* renamed from: ｋ */
    private static char f4708 = 0;

    public C2660ar(C2663au c2663au) {
        m5129(new int[]{2064642512, -613354505, -92546326, -1347088344}, ImageFormat.getBitsPerPixel(0) + 8).intern();
        m5129(new int[]{-288167223, 1809715455, 749762090, -1856919781, 330684367, -511995380}, 9 - View.combineMeasuredStates(0, 0)).intern();
        m5176(c2663au);
    }

    /* renamed from: ﮐ */
    public final long m5131() {
        JSONObject jSONObjectM5175;
        int i;
        int packedPositionChild;
        int i2 = f4706 + 113;
        f4705 = i2 % 128;
        if (i2 % 2 == 0) {
            jSONObjectM5175 = m5175();
            i = (PointF.length(1.0f, 0.0f) > 1.0f ? 1 : (PointF.length(1.0f, 0.0f) == 1.0f ? 0 : -1));
            packedPositionChild = 38131 / ExpandableListView.getPackedPositionChild(0L);
        } else {
            jSONObjectM5175 = m5175();
            i = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
            packedPositionChild = 38131 - ExpandableListView.getPackedPositionChild(0L);
        }
        long jOptLong = jSONObjectM5175.optLong(m5130(i, (char) packedPositionChild, "蚾\ueb8d\uf429貔", "꾎盧", "䲭瑆沩ğ").intern(), 0L);
        f4705 = (f4706 + 123) % 128;
        return jOptLong;
    }

    /* renamed from: ﱟ */
    public final long m5132() {
        f4706 = (f4705 + 27) % 128;
        long jOptLong = m5175().optLong(m5130(1219151686 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) (56056 - View.resolveSizeAndState(0, 0, 0)), "䘠\uaac7\uf848䯚", "곒\uec9bï", "䲭瑆沩ğ").intern(), 0L);
        int i = f4705 + 3;
        f4706 = i % 128;
        if (i % 2 == 0) {
            return jOptLong;
        }
        throw null;
    }

    /* renamed from: ﱡ */
    public final String m5133() {
        JSONObject jSONObjectOptJSONObject;
        int i = f4705 + 115;
        f4706 = i % 128;
        if (i % 2 == 0 ? (jSONObjectOptJSONObject = m5175().optJSONObject(m5130((-1942049510) - (Process.myPid() >> 22), (char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 39885), "ᩩ㺭춌\uf39b", "䒬韁촾", "䲭瑆沩ğ").intern())) != null : (jSONObjectOptJSONObject = m5175().optJSONObject(m5130((-1942049510) / (Process.myPid() + 102), (char) (39885 - View.MeasureSpec.makeMeasureSpec(0, 1)), "ᩩ㺭춌\uf39b", "䒬韁촾", "䲭瑆沩ğ").intern())) != null) {
            return jSONObjectOptJSONObject.optString(m5130((-945719977) - ExpandableListView.getPackedPositionChild(0L), (char) (6401 - Color.alpha(0)), "壴ꅵǇน", "\ueddd", "䲭瑆沩ğ").intern(), m5129(new int[]{-288167223, 1809715455, 749762090, -1856919781, 330684367, -511995380}, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 10).intern());
        }
        String strIntern = m5129(new int[]{-288167223, 1809715455, 749762090, -1856919781, 330684367, -511995380}, (-16777207) - Color.rgb(0, 0, 0)).intern();
        int i2 = f4706 + 75;
        f4705 = i2 % 128;
        if (i2 % 2 != 0) {
            return strIntern;
        }
        throw null;
    }

    /* renamed from: ﺙ */
    public final long m5134() {
        JSONObject jSONObjectM5175;
        String strM5129;
        int i = f4705 + InterfaceC3173h3.d.b.f8823f;
        f4706 = i % 128;
        if (i % 2 != 0) {
            jSONObjectM5175 = m5175();
            strM5129 = m5129(new int[]{-1968164846, 1771119708}, 5 / TextUtils.getOffsetAfter("", 1));
        } else {
            jSONObjectM5175 = m5175();
            strM5129 = m5129(new int[]{-1968164846, 1771119708}, TextUtils.getOffsetAfter("", 0) + 2);
        }
        return jSONObjectM5175.optLong(strM5129.intern(), 0L);
    }

    /* renamed from: ﻏ */
    public final String m5135() {
        JSONObject jSONObjectOptJSONObject;
        int i = f4706 + 59;
        f4705 = i % 128;
        if (i % 2 != 0 ? (jSONObjectOptJSONObject = m5175().optJSONObject(m5130((ViewConfiguration.getTouchSlop() >> 8) - 1942049510, (char) (39885 - (Process.myTid() >> 22)), "ᩩ㺭춌\uf39b", "䒬韁촾", "䲭瑆沩ğ").intern())) != null : (jSONObjectOptJSONObject = m5175().optJSONObject(m5130((-1942049510) >>> (ViewConfiguration.getTouchSlop() << 44), (char) (39885 >> (Process.myTid() - 58)), "ᩩ㺭춌\uf39b", "䒬韁촾", "䲭瑆沩ğ").intern())) != null) {
            return jSONObjectOptJSONObject.optString(m5130((-2020579062) - ImageFormat.getBitsPerPixel(0), (char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 33912), "\u0b97適碇誄", "찿", "䲭瑆沩ğ").intern(), m5129(new int[]{2064642512, -613354505, -92546326, -1347088344}, 6 - TextUtils.lastIndexOf("", '0')).intern());
        }
        String strIntern = m5129(new int[]{2064642512, -613354505, -92546326, -1347088344}, TextUtils.getCapsMode("", 0, 0) + 7).intern();
        int i2 = f4705 + 89;
        f4706 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 49 / 0;
        }
        return strIntern;
    }

    /* renamed from: ﻐ */
    public final List<String> m5136() {
        List<String> listM5217 = m5174().m5217();
        listM5217.addAll(C2915kc.m7436(m5175(), m5129(new int[]{-311205064, -1346332935}, Color.green(0) + 3).intern(), new ArrayList()));
        int i = f4706 + 123;
        f4705 = i % 128;
        if (i % 2 != 0) {
            return listM5217;
        }
        throw null;
    }

    /* renamed from: ﻛ */
    public final List<String> m5137() {
        List<String> listM5220 = m5174().m5220();
        listM5220.addAll(C2915kc.m7436(m5175(), m5130((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) - 1619279477, (char) (59130 - (ViewConfiguration.getScrollBarSize() >> 8)), "诮篁犯\uf5e6", "娊䀃\u0c53", "䲭瑆沩ğ").intern(), new ArrayList()));
        f4706 = (f4705 + 17) % 128;
        return listM5220;
    }

    /* renamed from: ｋ */
    public final int m5138() {
        f4705 = (f4706 + 123) % 128;
        int iOptInt = m5175().optInt(m5129(new int[]{-52602431, 1162499507}, 3 - TextUtils.getTrimmedLength("")).intern(), 9850);
        f4706 = (f4705 + 29) % 128;
        return iOptInt;
    }

    /* renamed from: ﾇ */
    public final int m5139() {
        f4705 = (f4706 + 41) % 128;
        int iOptInt = m5175().optInt(m5130((ViewConfiguration.getScrollBarSize() >> 8) - 299405563, (char) (3125 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), "Հ❯㗮稌", "쭅倯\udbf1", "䲭瑆沩ğ").intern(), this.f4711);
        f4705 = (f4706 + 65) % 128;
        return iOptInt;
    }

    /* renamed from: ﾒ */
    public final int m5140() {
        f4705 = (f4706 + 75) % 128;
        int iOptInt = m5175().optInt(m5130(2132691028 - (ViewConfiguration.getFadingEdgeLength() >> 16), (char) (56076 - View.MeasureSpec.makeMeasureSpec(0, 0)), "呖Ṉ౿맛", "뀺촐ᇝ", "䲭瑆沩ğ").intern(), 40);
        int i = f4706 + 15;
        f4705 = i % 128;
        if (i % 2 != 0) {
            return iOptInt;
        }
        throw null;
    }

    /* renamed from: ﻐ */
    private static String m5129(int[] iArr, int i) {
        String str;
        synchronized (C2723d.f5953) {
            try {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) f4709.clone();
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

    /* renamed from: ﻛ */
    private static String m5130(int i, char c, String str, String str2, String str3) {
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
                        cArr6[i6] = (char) ((((c3 ^ cArr2[i6]) ^ f4707) ^ f4710) ^ f4708);
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
}
