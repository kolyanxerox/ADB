package com.ironsource.adqualitysdk.sdk.p009i;

import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.jv */
/* loaded from: classes2.dex */
public final class C2907jv {

    /* renamed from: ﻐ */
    private static int f7158 = 0;

    /* renamed from: ﾇ */
    private static long f7159 = -4897670081812094941L;

    /* renamed from: ﾒ */
    private static int f7160 = 1;

    /* renamed from: ﻛ */
    public static String m7344(String str) throws NoSuchAlgorithmException, InvalidKeyException {
        try {
            Mac mac = Mac.getInstance("HmacSHA1");
            mac.init(new SecretKeySpec(m7345("\u2063ꗉ⬍냾㛙밿Ǉ蜥൵鋷ᠯ鹉掴\ue928滯\uf4ed穼\uffc8䕢쭟働홑屢⇨ꝒⲚ닉㡗부̛襫ຩ鐇ᨁ", 34211 - View.combineMeasuredStates(0, 0)).intern().getBytes(m7345("⁶蹜簳⪏颷", ExpandableListView.getPackedPositionGroup(0L) + 44587).intern()), mac.getAlgorithm()));
            String strM7071 = C2861ic.m7071(mac.doFinal(str.replaceAll(m7345("\u2003", 55603 - TextUtils.getOffsetAfter("", 0)).intern(), "").replaceAll(m7345("\u2029", (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 28978).intern(), "").getBytes(m7345("⁶蹜簳⪏颷", (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 44587).intern())));
            int i = f7160 + 125;
            f7158 = i % 128;
            if (i % 2 == 0) {
                return strM7071;
            }
            throw null;
        } catch (Exception e) {
            String strIntern = m7345("\u2062䇣\ue33dՔꚢ죞橴讼ⷸ", 25013 - View.getDefaultSize(0, 0)).intern();
            StringBuilder sb = new StringBuilder();
            sb.append(m7345("\u2066퉊쑧\uf61d\ue83d骞財", 61979 - (ViewConfiguration.getPressedStateDuration() >> 16)).intern());
            sb.append(e.getLocalizedMessage());
            C2921n.m7509(strIntern, sb.toString());
            return null;
        }
    }

    /* renamed from: ﻛ */
    private static String m7345(String str, int i) {
        String str2;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (C2804g.f6422) {
            try {
                C2804g.f6423 = i;
                char[] cArr2 = new char[cArr.length];
                C2804g.f6421 = 0;
                while (true) {
                    int i2 = C2804g.f6421;
                    if (i2 < cArr.length) {
                        cArr2[i2] = (char) ((cArr[i2] ^ (C2804g.f6423 * i2)) ^ f7159);
                        C2804g.f6421++;
                    } else {
                        str2 = new String(cArr2);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }
}
