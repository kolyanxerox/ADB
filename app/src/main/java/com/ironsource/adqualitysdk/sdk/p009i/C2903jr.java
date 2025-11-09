package com.ironsource.adqualitysdk.sdk.p009i;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.ironsource.InterfaceC3173h3;
import com.ironsource.adqualitysdk.sdk.IronSourceAdQuality;
import java.io.UnsupportedEncodingException;
import java.util.Calendar;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.jr */
/* loaded from: classes2.dex */
public class C2903jr {

    /* renamed from: ﮐ */
    private static int f7129 = 1;

    /* renamed from: ﱟ */
    private static char[] f7130 = {'6', 'g', 'k', 's', '4', 'f', 'l', ':', 'o', 'f', '1', 'l', ':', 'y', 243, 238, 233, 237, 'p', 217, 217, 225, 226, 217, 208, 209, 219, 223, 213, 213, 'l', 214, 219, 221, 223, 228, 224, '^', 177, 178, 184, '1', 'h', 'm', 'g', '`', 'i', 'n', 'k', 'k', 'd', 'h', 'j', 'b', '6', 'p', 'l', 'l', ' ', 'R', 'Z', 'c', 'k', 'f', 'j', 'n', 'v', 'e', '[', 'k', 's', 'm', 'l', 's', ']', 'V', 'i', 'i', 'k', 'i', 'j', 'q', 'p'};

    /* renamed from: ﺙ */
    private static int f7131 = 0;

    /* renamed from: ﻏ */
    private static char f7132 = 716;

    /* renamed from: ﻛ */
    private static int f7133;

    /* renamed from: ｋ */
    private static long f7134;

    /* renamed from: ﻐ */
    private C2657ao f7135;

    /* renamed from: ﾇ */
    private Context f7136;

    /* renamed from: ﾒ */
    private long f7137;

    public C2903jr(Context context, C2657ao c2657ao, long j) {
        this.f7136 = context;
        this.f7135 = c2657ao;
        this.f7137 = j;
        new C2820gp(context);
    }

    /* renamed from: ﻛ */
    public JSONObject mo4959(JSONObject jSONObject, boolean z, boolean z2, boolean z3) throws JSONException {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        JSONObject jSONObjectM7441 = C2915kc.m7441(jSONObject);
        jSONObjectM7441.put(m7324(ViewConfiguration.getScrollBarFadeDuration() >> 16, (char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 64494), "\ue463呥\uee75뫻", "撛襽煎搚\uf3b6씐", "\u0000\u0000\u0000\u0000").intern(), this.f7135.m5113());
        String strM5118 = this.f7135.m5118();
        if (!TextUtils.isEmpty(strM5118)) {
            jSONObjectM7441.put(m7324(View.getDefaultSize(0, 0), (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1311), "۔늄ẝ笅", "䛕멾鐼\u1fc5", "\u0000\u0000\u0000\u0000").intern(), strM5118);
        }
        if (z2) {
            f7131 = (f7129 + 33) % 128;
            if (this.f7137 > 0) {
                jSONObjectM7441.put(m7325(false, new int[]{0, 4, 0, 0}, "\u0000\u0001\u0001\u0001").intern(), this.f7137);
            }
            jSONObjectM7441.put(m7324(View.MeasureSpec.getMode(0) + 758450404, (char) (30109 - ((byte) KeyEvent.getModifierMetaStateMask())), "\ue411㔈鸭赵", "愎ܪづ呹빔", "\u0000\u0000\u0000\u0000").intern(), this.f7135.m5112());
            jSONObjectM7441.put(m7325(true, new int[]{4, 3, 0, 2}, "\u0001\u0001\u0000").intern(), this.f7135.m5110());
            jSONObjectM7441.put(m7325(false, new int[]{7, 3, 0, 0}, "\u0001\u0000\u0001").intern(), this.f7135.m5114());
            jSONObjectM7441.put(m7325(true, new int[]{10, 2, 0, 0}, "\u0001\u0000").intern(), this.f7135.m5122());
            jSONObjectM7441.put(m7324(ViewConfiguration.getScrollDefaultDelay() >> 16, (char) (2405 - KeyEvent.keyCodeFromString("")), "❠叠斄젉", "魇⥋", "\u0000\u0000\u0000\u0000").intern(), Calendar.getInstance().getTimeZone().getRawOffset() / 3600000.0d);
            jSONObjectM7441.put(m7324(Drawable.resolveOpacity(0, 0) + 1296659128, (char) (18929 - TextUtils.indexOf((CharSequence) "", '0')), "렭䥲\uf24d㹉", "⽓\ue9c2ᰴ섘\ued52", "\u0000\u0000\u0000\u0000").intern(), IronSourceAdQuality.getSDKVersion());
            jSONObjectM7441.put(m7325(true, new int[]{12, 1, 0, 1}, WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR).intern(), C2908jw.m7346());
            jSONObjectM7441.put(m7325(false, new int[]{13, 5, 133, 0}, "\u0000\u0000\u0001\u0001\u0001").intern(), Build.MODEL);
            jSONObjectM7441.put(m7325(true, new int[]{18, 12, InterfaceC3173h3.d.b.f8825h, 0}, "\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000").intern(), Build.MANUFACTURER);
            jSONObjectM7441.put(m7324((-1) - TextUtils.indexOf((CharSequence) "", '0'), (char) (ViewConfiguration.getPressedStateDuration() >> 16), "墘珄୷㏇", "\udc36뗼瘘㍉鏡岠㇙ꂆ", "\u0000\u0000\u0000\u0000").intern(), m7325(false, new int[]{30, 7, 116, 1}, "\u0000\u0001\u0001\u0000\u0000\u0001\u0000").intern());
            jSONObjectM7441.put(m7324(1217061422 - MotionEvent.axisFromString(""), (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 26541), "⿵諢깈퉧", "昪貂玫", "\u0000\u0000\u0000\u0000").intern(), C2910jy.m7381());
            C2908jw.m7347(this.f7136, jSONObjectM7441);
            C2910jy.m7388(this.f7136, jSONObjectM7441);
            C2910jy.m7371(this.f7136, jSONObjectM7441, z3);
            C2910jy.m7383(jSONObjectM7441);
            C2910jy.m7379(jSONObjectM7441);
            jSONObjectM7441.put(m7325(true, new int[]{37, 4, 70, 0}, "\u0000\u0001\u0000\u0001").intern(), z);
            C2910jy.m7375(this.f7136, jSONObjectM7441);
            C2910jy.m7372(jSONObjectM7441);
            try {
                JSONObject jSONObject2 = new JSONObject(this.f7135.m5108());
                jSONObject2.remove(m7325(true, new int[]{41, 13, 0, 0}, "\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001").intern());
                if (jSONObject2.length() > 0) {
                    f7129 = (f7131 + 119) % 128;
                    jSONObjectM7441.putOpt(m7325(false, new int[]{54, 4, 0, 4}, "\u0001\u0001\u0000\u0000").intern(), jSONObject2);
                }
                return jSONObjectM7441;
            } catch (Exception e) {
                C2921n.m7506(m7325(false, new int[]{58, 25, 0, 0}, "\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001").intern(), m7324(View.resolveSizeAndState(0, 0, 0), (char) ((Process.getThreadPriority(0) + 20) >> 6), "腨ꏲ\ua63b䲆", "\uf8c3灷麬\ueefaꎷ䶷݆ꠦ齿꧖⾪ｩ겤鬙䛍懕쟓έ醿\uf08c\uf5e6猧뿕瘴蘣晶곿룘㡗\u09b4㏉獣못Ḓنڌ", "\u0000\u0000\u0000\u0000").intern(), e);
            }
        }
        return jSONObjectM7441;
    }

    /* renamed from: ﾇ */
    public final C2657ao m7326() {
        int i = f7129 + 49;
        f7131 = i % 128;
        if (i % 2 == 0) {
            return this.f7135;
        }
        throw null;
    }

    /* renamed from: ﻛ */
    private static String m7324(int i, char c, String str, String str2, String str3) {
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
                        cArr6[i6] = (char) ((((c3 ^ cArr2[i6]) ^ f7134) ^ f7133) ^ f7132);
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

    /* renamed from: ﻛ */
    private static String m7325(boolean z, int[] iArr, String str) throws UnsupportedEncodingException {
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
                System.arraycopy(f7130, i, cArr, 0, i2);
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
}
