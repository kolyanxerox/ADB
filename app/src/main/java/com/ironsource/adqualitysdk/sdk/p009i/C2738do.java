package com.ironsource.adqualitysdk.sdk.p009i;

import android.graphics.Color;
import android.os.Process;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.do */
/* loaded from: classes2.dex */
public final class C2738do {

    /* renamed from: ﱟ */
    private static char f6094 = 27371;

    /* renamed from: ﱡ */
    private static int f6095 = 1;

    /* renamed from: ﺙ */
    private static int f6096;

    /* renamed from: ﾇ */
    private static long f6097;

    /* renamed from: ﾒ */
    private static int f6098;

    /* renamed from: ﻐ */
    private boolean f6099;

    /* renamed from: ﻛ */
    private boolean f6100;

    /* renamed from: ｋ */
    private String f6101;

    public C2738do(JSONObject jSONObject) {
        this.f6100 = jSONObject.optBoolean(m6633(View.MeasureSpec.getSize(0), (char) Color.alpha(0), "ꣻऀꮖ齆", "말\uf888䰹䶱炕ۑ\uded6溼䬨씩", "\u0000\u0000\u0000\u0000").intern());
        this.f6099 = jSONObject.optBoolean(m6633((-369488159) - Color.green(0), (char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), "\ue114﨎ᗩ쁮", "\ue3dd没\ud953Ӥ돵\ueadd쌊▵떻", "\u0000\u0000\u0000\u0000").intern());
        this.f6101 = C2746dw.m6725(jSONObject.optString(m6633(ViewConfiguration.getMinimumFlingVelocity() >> 16, (char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 54390), "諟閁癁棔", "壆ꅈ묆了뺜筗", "\u0000\u0000\u0000\u0000").intern()));
    }

    /* renamed from: ﻐ */
    public final boolean m6634() {
        int i = f6096 + 9;
        f6095 = i % 128;
        if (i % 2 != 0) {
            return this.f6100;
        }
        throw null;
    }

    /* renamed from: ｋ */
    public final boolean m6635() {
        int i = (f6095 + 85) % 128;
        f6096 = i;
        boolean z = this.f6099;
        f6095 = (i + 107) % 128;
        return z;
    }

    /* renamed from: ﾒ */
    public final String m6636() {
        String str;
        int i = f6095 + 57;
        int i2 = i % 128;
        f6096 = i2;
        if (i % 2 != 0) {
            str = this.f6101;
            int i3 = 50 / 0;
        } else {
            str = this.f6101;
        }
        int i4 = i2 + 121;
        f6095 = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    /* renamed from: ﾒ */
    private static String m6633(int i, char c, String str, String str2, String str3) {
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
                        cArr6[i6] = (char) ((((c3 ^ cArr2[i6]) ^ f6097) ^ f6098) ^ f6094);
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
