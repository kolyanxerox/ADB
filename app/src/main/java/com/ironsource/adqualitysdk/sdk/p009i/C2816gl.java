package com.ironsource.adqualitysdk.sdk.p009i;

import android.graphics.PointF;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.ironsource.InterfaceC3173h3;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.gl */
/* loaded from: classes2.dex */
public final class C2816gl extends AbstractC2813gi {

    /* renamed from: ﻐ */
    private static char f6478 = 55043;

    /* renamed from: ﻛ */
    private static long f6479 = 0;

    /* renamed from: ｋ */
    private static int f6480 = 0;

    /* renamed from: ﾇ */
    private static int f6481 = 1;

    /* renamed from: ﾒ */
    private static int f6482;

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2813gi
    /* renamed from: ﻐ */
    public final String mo6812() {
        int i = f6481 + 33;
        f6480 = i % 128;
        return (i % 2 != 0 ? m6834(1310322979 - KeyEvent.keyCodeFromString(""), (char) (18939 << (KeyEvent.getMaxKeyCode() << 88)), "⍵᧱㩎\uf853", "溧₷⚟矹杷쌍뗁멋వ鋉몄ᰆ新ﲻ髽\uf661봪跜\ue4a1並\udf3f晨탪⯄勹峏⦬杜ꚥ⤈慘ꩮ\uf219ꢭ״䳫崠\u1afa置ﰴ\udbbaဿ徳ྲྀ\udfe0䌎亶찑滥\ue81fⶭㅅ醙㜆즊", "\u0000\u0000\u0000\u0000") : m6834(KeyEvent.keyCodeFromString("") + 1310322979, (char) ((KeyEvent.getMaxKeyCode() >> 16) + 21306), "⍵᧱㩎\uf853", "溧₷⚟矹杷쌍뗁멋వ鋉몄ᰆ新ﲻ髽\uf661봪跜\ue4a1並\udf3f晨탪⯄勹峏⦬杜ꚥ⤈慘ꩮ\uf219ꢭ״䳫崠\u1afa置ﰴ\udbbaဿ徳ྲྀ\udfe0䌎亶찑滥\ue81fⶭㅅ醙㜆즊", "\u0000\u0000\u0000\u0000")).intern();
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2813gi
    /* renamed from: ﻛ */
    public final String mo6813() {
        int i = f6481 + 87;
        f6480 = i % 128;
        String strIntern = (i % 2 != 0 ? m6834((-1602387105) >>> (ViewConfiguration.getPressedStateDuration() << 53), (char) (PointF.length(1.0f, 2.0f) > 1.0f ? 1 : (PointF.length(1.0f, 2.0f) == 1.0f ? 0 : -1)), "彥綃\ue7a0婌", "䘯뽅녮烓颢\ud9bc鄀铦꒠孉ꆳ", "\u0000\u0000\u0000\u0000") : m6834((-1602387105) - (ViewConfiguration.getPressedStateDuration() >> 16), (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), "彥綃\ue7a0婌", "䘯뽅녮烓颢\ud9bc鄀铦꒠孉ꆳ", "\u0000\u0000\u0000\u0000")).intern();
        f6481 = (f6480 + InterfaceC3173h3.d.b.f8821d) % 128;
        return strIntern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2813gi
    /* renamed from: ｋ */
    public final Class mo6814() {
        int i = (f6481 + 5) % 128;
        f6480 = i;
        int i2 = i + 57;
        f6481 = i2 % 128;
        if (i2 % 2 != 0) {
            return InneractiveAdManager.class;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2813gi
    /* renamed from: ﾇ */
    public final AbstractC2676bg mo6815() {
        C2690bu c2690bu = new C2690bu(mo6813());
        f6481 = (f6480 + 57) % 128;
        return c2690bu;
    }

    /* renamed from: ﾇ */
    private static String m6834(int i, char c, String str, String str2, String str3) {
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
                        cArr6[i6] = (char) ((((c3 ^ cArr2[i6]) ^ f6479) ^ f6482) ^ f6478);
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
