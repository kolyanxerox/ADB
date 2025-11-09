package com.ironsource.adqualitysdk.sdk.p009i;

import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import com.google.android.gms.internal.ads.AbstractC2183w4;
import com.ironsource.InterfaceC3173h3;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.du */
/* loaded from: classes2.dex */
public final class C2744du {

    /* renamed from: ﮐ */
    private static int f6171 = 1;

    /* renamed from: ﺙ */
    private static int f6172 = 0;

    /* renamed from: ﾒ */
    private static long f6173 = 3675794903966310633L;

    /* renamed from: ﻐ */
    private boolean f6174;

    /* renamed from: ﻛ */
    private boolean f6175;

    /* renamed from: ｋ */
    private boolean f6176;

    /* renamed from: ﾇ */
    private Object f6177;

    public C2744du(Object obj) {
        this.f6177 = obj;
    }

    public final String toString() {
        f6171 = (f6172 + 73) % 128;
        if (!(this.f6177 instanceof String)) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f6177);
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m6713("惋", (Process.myPid() >> 22) + 55201).intern());
        sb2.append(this.f6177);
        String strOooOO0O = AbstractC2183w4.OooOO0O(sb2, m6713("惋", 55200 - ((byte) KeyEvent.getModifierMetaStateMask())));
        int i = f6172 + 109;
        f6171 = i % 128;
        if (i % 2 != 0) {
            return strOooOO0O;
        }
        throw null;
    }

    /* renamed from: ﮐ */
    public final boolean m6714() {
        int i = f6172;
        boolean z = this.f6176;
        f6171 = (i + 79) % 128;
        return z;
    }

    /* renamed from: ﱡ */
    public final C2744du m6715() {
        int i = f6172;
        int i2 = i + 29;
        f6171 = i2 % 128;
        int i3 = i2 % 2;
        this.f6175 = true;
        int i4 = i + 7;
        f6171 = i4 % 128;
        if (i4 % 2 != 0) {
            return this;
        }
        throw null;
    }

    /* renamed from: ﺙ */
    public final C2744du m6716() {
        int i = (f6171 + 85) % 128;
        f6172 = i;
        this.f6176 = true;
        int i2 = i + InterfaceC3173h3.d.b.f8826i;
        f6171 = i2 % 128;
        if (i2 % 2 != 0) {
            return this;
        }
        throw null;
    }

    /* renamed from: ﻐ */
    public final Object m6717() {
        int i = f6172 + 89;
        f6171 = i % 128;
        if (i % 2 != 0) {
            return this.f6177;
        }
        int i2 = 61 / 0;
        return this.f6177;
    }

    /* renamed from: ﻛ */
    public final boolean m6718() {
        int i = (f6171 + 45) % 128;
        f6172 = i;
        boolean z = this.f6175;
        f6171 = (i + 9) % 128;
        return z;
    }

    /* renamed from: ｋ */
    public final boolean m6720() {
        int i = (f6171 + 35) % 128;
        f6172 = i;
        boolean z = this.f6174;
        f6171 = (i + 97) % 128;
        return z;
    }

    /* renamed from: ﾇ */
    public final boolean m6721() {
        Object obj = this.f6177;
        if (obj == null) {
            int i = f6172 + 51;
            f6171 = i % 128;
            if (i % 2 != 0) {
                return false;
            }
            throw null;
        }
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        if (obj instanceof Integer) {
            if (((Integer) obj).intValue() == 0) {
                return false;
            }
            f6171 = (f6172 + 79) % 128;
            return true;
        }
        if (obj instanceof Long) {
            if (((Long) obj).longValue() == 0) {
                return false;
            }
            int i2 = f6171 + InterfaceC3173h3.d.b.f8826i;
            f6172 = i2 % 128;
            return i2 % 2 == 0;
        }
        if (!(obj instanceof Double)) {
            if (!(obj instanceof String)) {
                return true;
            }
            f6172 = (f6171 + 11) % 128;
            return !TextUtils.isEmpty((String) obj);
        }
        int i3 = f6171 + InterfaceC3173h3.d.b.f8826i;
        f6172 = i3 % 128;
        if (i3 % 2 == 0 ? ((Double) obj).doubleValue() == 0.0d : ((Double) obj).doubleValue() == 1.0d) {
            return false;
        }
        f6172 = (f6171 + 13) % 128;
        return true;
    }

    /* renamed from: ﾒ */
    public final Number m6722() {
        int i = f6172;
        int i2 = (i + InterfaceC3173h3.d.b.f8823f) % 128;
        f6171 = i2;
        Object obj = this.f6177;
        if (obj instanceof Integer) {
            return (Integer) obj;
        }
        if (obj instanceof Long) {
            f6172 = (i2 + 97) % 128;
            return (Long) obj;
        }
        if (!(obj instanceof Double)) {
            return null;
        }
        int i3 = i + 67;
        f6171 = i3 % 128;
        if (i3 % 2 != 0) {
            return (Double) obj;
        }
        int i4 = 58 / 0;
        return (Double) obj;
    }

    /* renamed from: ｋ */
    public final C2744du m6719(boolean z) {
        int i = (f6172 + 107) % 128;
        f6171 = i;
        this.f6174 = z;
        f6172 = (i + 119) % 128;
        return this;
    }

    /* renamed from: ﾒ */
    private static String m6713(String str, int i) {
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
                        cArr2[i2] = (char) ((cArr[i2] ^ (C2804g.f6423 * i2)) ^ f6173);
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
