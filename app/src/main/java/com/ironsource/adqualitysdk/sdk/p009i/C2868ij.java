package com.ironsource.adqualitysdk.sdk.p009i;

import android.content.Context;
import android.content.SharedPreferences;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import com.ironsource.InterfaceC3173h3;
import java.util.UUID;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ij */
/* loaded from: classes2.dex */
public final class C2868ij {

    /* renamed from: ﻐ */
    private static int f6778 = 1;

    /* renamed from: ｋ */
    private static int f6779 = 0;

    /* renamed from: ﾇ */
    private static long f6780 = -687744399354335608L;

    /* renamed from: ﻛ */
    public static void m7109(String str, String str2) {
        int i = f6778 + 77;
        f6779 = i % 128;
        int i2 = i % 2;
        C2921n.m7500(str, str2);
        if (i2 != 0) {
            throw null;
        }
        f6778 = (f6779 + 23) % 128;
    }

    /* renamed from: ｋ */
    private static String m7110(String str, int i) {
        String str2;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (C2777f.f6322) {
            try {
                char[] cArrM6790 = C2777f.m6790(f6780, cArr, i);
                C2777f.f6321 = 4;
                while (true) {
                    int i2 = C2777f.f6321;
                    if (i2 < cArrM6790.length) {
                        C2777f.f6320 = i2 - 4;
                        cArrM6790[i2] = (char) ((cArrM6790[i2] ^ cArrM6790[i2 % 4]) ^ (r2 * f6780));
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

    /* renamed from: ﾇ */
    private static void m7112(String str, String str2) {
        f6779 = (f6778 + InterfaceC3173h3.d.b.f8821d) % 128;
        C2921n.m7509(str, str2);
        int i = f6778 + 81;
        f6779 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ﻛ */
    private static String m7108(Context context) {
        String string;
        SharedPreferences.Editor editorEdit;
        String strM7110;
        f6779 = (f6778 + 19) % 128;
        SharedPreferences sharedPreferences = context.getSharedPreferences(m7110("ﳈ飻ᐊﲻ阜\uf607쥵\uddf6䚍끽荑鏒袦穗䔸", TextUtils.getTrimmedLength("")).intern(), 0);
        String string2 = sharedPreferences.getString(m7110("氕\ue9a3웍汦ꄗ蝄᮲\ueae2홙셪凓\ua4c8ᠰଅ韸ẽ䈔甿췘\ud88b蓼뻏", View.MeasureSpec.getMode(0)).intern(), null);
        if (!TextUtils.isEmpty(string2)) {
            return string2;
        }
        int i = f6779 + 13;
        f6778 = i % 128;
        if (i % 2 == 0) {
            string = UUID.randomUUID().toString();
            editorEdit = sharedPreferences.edit();
            TextUtils.lastIndexOf("", '%', 1, 1);
            strM7110 = m7110("氕\ue9a3웍汦ꄗ蝄᮲\ueae2홙셪凓\ua4c8ᠰଅ韸ẽ䈔甿췘\ud88b蓼뻏", 0);
        } else {
            string = UUID.randomUUID().toString();
            editorEdit = sharedPreferences.edit();
            strM7110 = m7110("氕\ue9a3웍汦ꄗ蝄᮲\ueae2홙셪凓\ua4c8ᠰଅ韸ẽ䈔甿췘\ud88b蓼뻏", TextUtils.lastIndexOf("", '0', 0, 0) + 1);
        }
        editorEdit.putString(strM7110.intern(), string).commit();
        f6778 = (f6779 + 95) % 128;
        return string;
    }

    /* renamed from: ﾇ */
    public static String m7111(Context context) {
        String string;
        String strIntern;
        int i;
        int i2 = f6779 + 37;
        f6778 = i2 % 128;
        if (i2 % 2 != 0 ? (string = Settings.Secure.getString(context.getApplicationContext().getContentResolver(), m7110("䃮줗䴧䂏\uf4b1\ua7f1道뽛瑱\ue1d6\uda73\uf156㓇⮻", ViewConfiguration.getPressedStateDuration() >> 16).intern())) == null : (string = Settings.Secure.getString(context.getApplicationContext().getContentResolver(), m7110("䃮줗䴧䂏\uf4b1\ua7f1道뽛瑱\ue1d6\uda73\uf156㓇⮻", ViewConfiguration.getPressedStateDuration() >>> 8).intern())) == null) {
            int i3 = f6779 + 43;
            f6778 = i3 % 128;
            if (i3 % 2 == 0) {
                strIntern = m7110("\ufbcc晴\u17eeﮅﶽ鑊쪵뙠䆩퉯肟\uf825迃ᠻ䛍䈆헙昋\u1cfb萡ጟ귱툟짗変\uebdd栎\u13f7ꝩㆿ⹛喗\ued49羗\ue47d龠⪿", ViewConfiguration.getScrollBarFadeDuration() >> 127).intern();
                i = 1;
            } else {
                strIntern = m7110("\ufbcc晴\u17eeﮅﶽ鑊쪵뙠䆩퉯肟\uf825迃ᠻ䛍䈆헙昋\u1cfb萡ጟ귱툟짗変\uebdd栎\u13f7ꝩㆿ⹛喗\ued49羗\ue47d龠⪿", ViewConfiguration.getScrollBarFadeDuration() >> 16).intern();
                i = 0;
            }
            m7112(strIntern, m7110("ྰ蒕괩\u0ff3ឧ\uea72灌屓뗴걓㨾ቫ篐昻ﰜꠋ↳᠕ꙹ渞\ue77e폙棫⏰굙闹틆淪匴俳铙뾪ᤣƔ康疸\ude90뭺͜\u0b51蓵絏앸셫䪕㜹轙蜖\uf0b4\ue953", View.MeasureSpec.getMode(i)).intern());
            string = m7108(context);
        }
        f6778 = (f6779 + 79) % 128;
        return string;
    }
}
