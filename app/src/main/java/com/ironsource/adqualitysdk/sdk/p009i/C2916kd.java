package com.ironsource.adqualitysdk.sdk.p009i;

import OooO0oO.OooOo;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.android.gms.internal.ads.AbstractC2183w4;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;
import org.json.JSONArray;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.kd */
/* loaded from: classes2.dex */
public final class C2916kd {

    /* renamed from: ﻐ */
    private static int[] f7219 = {1132528989, 2100046207, 772621006, -1676773601, -1716838290, -2080332474, 853767237, 751506620, -426276183, -1502417308, 514087459, -18383282, -1766603228, -1108171582, 1414490676, -1944048013, -1066531493, 1796500921};

    /* renamed from: ﾇ */
    private static int f7220 = 0;

    /* renamed from: ﾒ */
    private static int f7221 = 1;

    /* renamed from: ﻐ */
    public static String m7448(String str) {
        if (str == null || C2926s.m7601() || !m7454(str)) {
            f7221 = (f7220 + 123) % 128;
            return null;
        }
        int i = 0;
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(Base64.decode(str, 0));
            GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
            new ByteArrayOutputStream();
            byte[] bArr = new byte[8192];
            f7220 = (f7221 + 7) % 128;
            while (true) {
                int i2 = gZIPInputStream.read(bArr, i, 8192 - i);
                if (i2 == -1) {
                    gZIPInputStream.close();
                    byteArrayInputStream.close();
                    return new String(bArr, m7453(new int[]{560130318, -1453844843, -1639978930, 1598181672}, 5 - (ViewConfiguration.getTapTimeout() >> 16)).intern());
                }
                i += i2;
                f7221 = (f7220 + 19) % 128;
            }
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: ﻛ */
    public static List<String> m7449(String str, String str2) {
        f7220 = (f7221 + 51) % 128;
        List<String> listM7450 = m7450(str, str2, false);
        f7220 = (f7221 + 87) % 128;
        return listM7450;
    }

    /* renamed from: ｋ */
    public static String m7452(String str, String str2) {
        f7221 = (f7220 + 21) % 128;
        String strSubstring = str.substring(0, str.length() - str2.length());
        int i = f7220 + 1;
        f7221 = i % 128;
        if (i % 2 == 0) {
            int i2 = 30 / 0;
        }
        return strSubstring;
    }

    /* renamed from: ﾇ */
    public static int m7455(String str, String str2) {
        int i = 0;
        String[] strArrSplit = str.replaceAll(m7453(new int[]{985409169, -359610529, 2060529772, 1743535469}, 7 - View.MeasureSpec.getMode(0)).intern(), "").split(m7453(new int[]{-228065143, 445564217}, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 2).intern());
        String[] strArrSplit2 = str2.replaceAll(m7453(new int[]{985409169, -359610529, 2060529772, 1743535469}, View.MeasureSpec.makeMeasureSpec(0, 0) + 7).intern(), "").split(m7453(new int[]{-228065143, 445564217}, 1 - Process.getGidForName("")).intern());
        while (i < strArrSplit.length) {
            f7220 = (f7221 + 117) % 128;
            if (i >= strArrSplit2.length || !strArrSplit[i].equals(strArrSplit2[i])) {
                break;
            }
            int i2 = (f7220 + 25) % 128;
            f7221 = i2;
            i++;
            f7220 = (i2 + 11) % 128;
        }
        if (i < strArrSplit.length && i < strArrSplit2.length) {
            f7220 = (f7221 + 55) % 128;
            return Integer.signum(Integer.valueOf(strArrSplit[i]).compareTo(Integer.valueOf(strArrSplit2[i])));
        }
        int iSignum = Integer.signum(strArrSplit.length - strArrSplit2.length);
        int i3 = f7221 + 31;
        f7220 = i3 % 128;
        if (i3 % 2 == 0) {
            return iSignum;
        }
        throw null;
    }

    /* renamed from: ﾒ */
    public static boolean m7460(String str) {
        f7220 = (f7221 + 71) % 128;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        boolean zMatches = str.matches(m7453(new int[]{-1656398929, 1521400588, -1725874605, 1404441267, 1359639015, -641560657, 1095001018, -1965658872}, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 14).intern());
        f7221 = (f7220 + 55) % 128;
        return zMatches;
    }

    /* renamed from: ﻛ */
    private static List<String> m7450(String str, String str2, boolean z) {
        ArrayList arrayList = new ArrayList();
        Matcher matcher = Pattern.compile(str2).matcher(str);
        loop0: while (matcher.find()) {
            if (matcher.groupCount() == 0) {
                int i = f7220 + 63;
                f7221 = i % 128;
                if (i % 2 == 0) {
                    arrayList.add(matcher.group());
                    throw null;
                }
                arrayList.add(matcher.group());
                if (z) {
                    break;
                }
            } else {
                for (int i2 = 1; i2 <= matcher.groupCount(); i2++) {
                    f7220 = (f7221 + 5) % 128;
                    arrayList.add(matcher.group(i2));
                    if (z) {
                        break loop0;
                    }
                }
                f7220 = (f7221 + 89) % 128;
            }
        }
        return arrayList;
    }

    /* renamed from: ｋ */
    public static boolean m7454(String str) {
        if (!C2926s.m7601()) {
            try {
                new GZIPInputStream(new ByteArrayInputStream(Base64.decode(str, 0)));
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }
        int i = (f7221 + 33) % 128;
        f7220 = i;
        f7221 = (i + 85) % 128;
        return false;
    }

    /* renamed from: ｋ */
    private static String m7453(int[] iArr, int i) {
        String str;
        synchronized (C2723d.f5953) {
            try {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) f7219.clone();
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
    public static List<String> m7459(String str, JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < jSONArray.length()) {
            int i2 = f7221 + 1;
            f7220 = i2 % 128;
            if (i2 % 2 != 0) {
                arrayList.addAll(m7450(str, jSONArray.optString(i), false));
                i += 67;
            } else {
                arrayList.addAll(m7450(str, jSONArray.optString(i), false));
                i++;
            }
            f7221 = (f7220 + 95) % 128;
        }
        return arrayList;
    }

    /* renamed from: ﻛ */
    public static boolean m7451(String str, int i) {
        if (TextUtils.isEmpty(str) || str.length() <= 0 || str.length() > i) {
            f7221 = (f7220 + 23) % 128;
            return false;
        }
        f7221 = (f7220 + 47) % 128;
        return true;
    }

    /* renamed from: ﾇ */
    public static String m7458(String str, JSONArray jSONArray, boolean z) {
        f7220 = (f7221 + 73) % 128;
        for (int i = 0; i < jSONArray.length(); i++) {
            int i2 = f7220 + 119;
            f7221 = i2 % 128;
            if (i2 % 2 != 0) {
                String strM7457 = m7457(str, jSONArray.optString(i), z);
                if (strM7457 != null) {
                    f7221 = (f7220 + 69) % 128;
                    return strM7457;
                }
            } else {
                m7457(str, jSONArray.optString(i), z);
                throw null;
            }
        }
        return null;
    }

    /* renamed from: ﾇ */
    public static String m7457(String str, String str2, boolean z) {
        if (!(!z)) {
            str2 = m7456(str2);
        }
        List<String> listM7450 = m7450(str, str2, true);
        if (listM7450.size() <= 0) {
            return null;
        }
        f7220 = (f7221 + 1) % 128;
        String str3 = listM7450.get(0);
        f7220 = (f7221 + 123) % 128;
        return str3;
    }

    /* renamed from: ﾇ */
    private static String m7456(String str) {
        f7221 = (f7220 + 25) % 128;
        if (!TextUtils.isEmpty(str)) {
            if (!str.startsWith(m7453(new int[]{-868200626, -230600055}, View.resolveSize(0, 0) + 1).intern())) {
                str = AbstractC2183w4.OooOO0o(new StringBuilder(), m7453(new int[]{-1503753903, -986068475, -1279442120, -436675457}, 8 - Color.argb(0, 0, 0, 0)), str);
            }
            if (!str.endsWith(m7453(new int[]{-696718996, 273500843}, View.resolveSize(0, 0) + 1).intern())) {
                str = AbstractC2183w4.OooOO0O(OooOo.OooOo0O(str), m7453(new int[]{-397471083, -2042626781, 368099735, -712857515}, 7 - TextUtils.indexOf("", "", 0, 0)));
                f7220 = (f7221 + 91) % 128;
            }
        }
        int i = f7220 + 123;
        f7221 = i % 128;
        if (i % 2 != 0) {
            return str;
        }
        throw null;
    }
}
