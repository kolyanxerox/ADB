package com.ironsource.adqualitysdk.sdk.p009i;

import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import com.google.android.gms.ads.MobileAds;
import com.ironsource.adqualitysdk.sdk.p009i.C2667ay;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.fx */
/* loaded from: classes2.dex */
public final class C2801fx extends AbstractC2813gi {

    /* renamed from: ﻐ */
    private static int f6409 = 1;

    /* renamed from: ﻛ */
    private static char f6410 = 24744;

    /* renamed from: ｋ */
    private static int f6411;

    /* renamed from: ﾇ */
    private static int f6412;

    /* renamed from: ﾒ */
    private static long f6413;

    /* renamed from: ﱡ */
    private static boolean m6816() {
        f6409 = (f6412 + 115) % 128;
        try {
            if (Prode.m4894()) {
                f6412 = (f6409 + 69) % 128;
                return true;
            }
            Class.forName(m6817(TextUtils.indexOf((CharSequence) "", '0') + 1, (char) View.getDefaultSize(0, 0), "싙䴏\u0e85岪", "눯꜊版㾿萻㏅\u1aefꌧ䉓뎴❩氊鵹졌ᄆ\uf38dᆿᩂ릵☪\uf63e\ud9f9杜\uda00㟢Ꙭ\udeed䢋ၺ륪灕獘鱇搋䉴喕ﳭ\u2efe", "\u0000\u0000\u0000\u0000").intern());
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: ﾒ */
    private static String m6817(int i, char c, String str, String str2, String str3) {
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
                        cArr6[i6] = (char) ((((c3 ^ cArr2[i6]) ^ f6413) ^ f6411) ^ f6410);
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

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2813gi
    /* renamed from: ﻐ */
    public final String mo6812() {
        int gidForName;
        int absoluteGravity;
        int i = f6409 + 5;
        f6412 = i % 128;
        if (i % 2 != 0) {
            gidForName = (-1) - Process.getGidForName("");
            absoluteGravity = Gravity.getAbsoluteGravity(1, 0);
        } else {
            gidForName = (-1) - Process.getGidForName("");
            absoluteGravity = Gravity.getAbsoluteGravity(0, 0);
        }
        String strIntern = m6817(gidForName, (char) absoluteGravity, "ﵷ巫疅ኲ", "ᶇ\u0095◹鐞全뮡葅혩浽紿潪⨄\uf039鉸碛Ṁ垚省\ue17e뜷䗆髎⧂\uf80f\uf05e蜞鋵僘魇蘋Ａ띞饛\uf349ꈏ添", "\u0000\u0000\u0000\u0000").intern();
        int i2 = f6409 + 27;
        f6412 = i2 % 128;
        if (i2 % 2 == 0) {
            return strIntern;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2813gi
    /* renamed from: ﻛ */
    public final String mo6813() {
        f6409 = (f6412 + 39) % 128;
        String strIntern = m6817(11823 - AndroidCharacter.getMirror('0'), (char) (46605 - TextUtils.lastIndexOf("", '0', 0)), "ￅꜭค\u07b6", "৹偉࿋鱞䗴", "\u0000\u0000\u0000\u0000").intern();
        f6409 = (f6412 + 61) % 128;
        return strIntern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2813gi
    /* renamed from: ｋ */
    public final Class mo6814() {
        int i = f6409 + 97;
        f6412 = i % 128;
        if (i % 2 != 0) {
            int i2 = 94 / 0;
        }
        return MobileAds.class;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2813gi
    /* renamed from: ﾇ */
    public final AbstractC2676bg mo6815() {
        int i = f6412 + 31;
        f6409 = i % 128;
        if (i % 2 == 0) {
            m6816();
            throw null;
        }
        if (!m6816()) {
            return new C2667ay(mo6813());
        }
        C2667ay.d dVar = new C2667ay.d(mo6813());
        f6409 = (f6412 + 85) % 128;
        return dVar;
    }
}
