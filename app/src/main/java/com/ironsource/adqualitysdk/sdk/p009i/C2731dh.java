package com.ironsource.adqualitysdk.sdk.p009i;

import android.text.TextUtils;
import com.google.android.gms.internal.ads.AbstractC2183w4;
import com.ironsource.C3037dc;
import com.ironsource.InterfaceC3173h3;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.dh */
/* loaded from: classes2.dex */
public class C2731dh extends C2722cz implements InterfaceC2707ck {

    /* renamed from: ﭖ */
    private static int f6004 = 0;

    /* renamed from: ﭸ */
    private static int f6005 = 1;

    /* renamed from: ﺙ */
    private static char f6008 = 5;

    /* renamed from: ﮐ */
    private EnumC2845hn f6009;

    /* renamed from: ﱡ */
    private EnumC2845hn f6010;

    /* renamed from: ﱟ */
    private static char[] f6007 = {'g', 'e', 't', 'S', 'o', 'u', 'r', 'c', 'U', 'l', 's', 'E', 'n', 'd', 'C', 'a', 'i', 'v', 'T', 'y', 'p', 'I', 'm', 'V', 'J'};

    /* renamed from: ﮉ */
    private static char[] f6006 = {'q', 225, 231, 217, 214, 226, 223, 225, 216, 222, 234, 234, '>', 'x', 'x', 'l', 'k', 's', 'm', 'o', 'h', 'n', 'u', 'o', '2', 'f', 'm', 'o', 'o', 'c', 'a', 'n', 'i', 'V', '^', 'Q', 168, 178, 164, 154, 171, 173, 172, 168, 161, 169, 152, 153, 170, 164, '8', 'r', 't', 'd', 'i', 'y', 'c', 'b', 'y', '{', 'l', 's', 127, '2', 'f', 'h', 'a', 'c', 'j', 'h', 'n', 'f', 'g', 's', 'A', 129, 135, 144, 143, '~', '|', 140, 128, 'z', 131, 129, 132, 'x', '{', 137, 137, '2', 'd', 'j', 's', 'r', 'a', '_', 'o', 'c', 'b', 'j', 'd', 'f', '_', 'e', 'l', 'l', '9', 'l', 'l', '^', 'V', 'i', 'n', 'a', 'c', 'o', '_', 'a', 'r', 's', 'j', 'd', '2', 'd', 'j', 's', 'r', 'a', '_', 'o', 'c', 'a', 'n', 'i', 'V', '^', 'l', 'f', '6', '_', 'a', 'r', 's', 'j', 'd', 'f', 'f', 'l', '\\', 'Y', 'i', 'S', 'R', 'i', 'k', '\\', 'c', 132, 273, 277, 278, 276, 259, 264, 281, 282, 273, 267, 254, 261, 280, 277, 273, 269, 275, 258, 257, 274, 'H', 143, 137, 132, 138, 'z', C3037dc.f8244T, 145, 167, 167, 162, 162, 'o', 213, 207, 214, 213, 213, 198, 194, 216, 218, 217, 213, 206, 214, 197};

    /* renamed from: ﻐ */
    private final List<String> f6012 = new ArrayList();

    /* renamed from: ﾇ */
    private final List<String> f6015 = new ArrayList();

    /* renamed from: ｋ */
    private final List<String> f6014 = new ArrayList();

    /* renamed from: ﾒ */
    private final List<String> f6016 = new ArrayList();

    /* renamed from: ﻛ */
    private final List<String> f6013 = new ArrayList();

    /* renamed from: ﻏ */
    private JSONObject f6011 = new JSONObject();

    /* renamed from: טּ */
    private JSONObject m6521() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            EnumC2845hn enumC2845hn = this.f6010;
            if (enumC2845hn != null) {
                jSONObject.put(C2869ik.f6821, enumC2845hn.m6883());
            }
            EnumC2845hn enumC2845hn2 = this.f6009;
            if (enumC2845hn2 != null) {
                jSONObject.put(C2869ik.f6818, enumC2845hn2.m6883());
            }
            if (this.f6012.size() > 0) {
                jSONObject.put(C2869ik.f6819, new JSONArray((Collection) this.f6012));
                f6005 = (f6004 + 51) % 128;
            }
            if (this.f6015.size() > 0) {
                jSONObject.put(C2869ik.f6814, new JSONArray((Collection) this.f6015));
            }
            if (this.f6014.size() > 0) {
                jSONObject.put(C2869ik.f6812, new JSONArray((Collection) this.f6014));
            }
            if (this.f6016.size() > 0) {
                jSONObject.put(C2869ik.f6817, new JSONArray((Collection) this.f6016));
            }
            if (this.f6013.size() > 0) {
                jSONObject.put(C2869ik.f6816, new JSONArray((Collection) this.f6013));
            }
            if (this.f6011.length() > 0) {
                jSONObject.putOpt(C2869ik.f6820, this.f6011.toString());
                f6005 = (f6004 + 99) % 128;
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* renamed from: ﭖ */
    private JSONObject m6522() {
        int i = f6005 + 39;
        f6004 = i % 128;
        if (i % 2 == 0) {
            return this.f6011;
        }
        int i2 = 26 / 0;
        return this.f6011;
    }

    /* renamed from: ﭴ */
    private String m6523() {
        f6005 = (f6004 + 123) % 128;
        String strOptString = this.f6011.optString(C2869ik.f6812);
        f6004 = (f6005 + 97) % 128;
        return strOptString;
    }

    /* renamed from: ﭸ */
    private String m6524() {
        f6004 = (f6005 + 77) % 128;
        String strOptString = this.f6011.optString(C2869ik.f6817);
        int i = f6005 + 21;
        f6004 = i % 128;
        if (i % 2 == 0) {
            return strOptString;
        }
        throw null;
    }

    /* renamed from: ﮉ */
    private void m6526(String str) throws JSONException {
        int i = f6005 + 53;
        f6004 = i % 128;
        try {
            if (i % 2 != 0) {
                this.f6011.put(C2869ik.f6809, str);
                throw null;
            }
            this.f6011.put(C2869ik.f6809, str);
            int i2 = f6005 + InterfaceC3173h3.d.b.f8819b;
            f6004 = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
        } catch (JSONException unused) {
        }
    }

    /* renamed from: ﮌ */
    private Object m6527() {
        int i = f6004 + 55;
        f6005 = i % 128;
        if (i % 2 == 0) {
            this.f6012.size();
            throw null;
        }
        Boolean boolValueOf = Boolean.valueOf(this.f6012.size() > 0 || this.f6015.size() > 0 || this.f6013.size() > 0);
        int i2 = f6004 + 107;
        f6005 = i2 % 128;
        if (i2 % 2 != 0) {
            return boolValueOf;
        }
        throw null;
    }

    /* renamed from: ﮐ */
    private void m6529(String str) throws JSONException {
        int i = f6004 + 21;
        f6005 = i % 128;
        try {
            if (i % 2 == 0) {
                this.f6011.put(C2869ik.f6819, str);
                throw null;
            }
            this.f6011.put(C2869ik.f6819, str);
            f6004 = (f6005 + 115) % 128;
        } catch (JSONException unused) {
        }
    }

    /* renamed from: ﱟ */
    private String m6530() {
        int i = f6005 + 61;
        f6004 = i % 128;
        if (i % 2 != 0) {
            this.f6011.optString(C2869ik.f6814);
            throw null;
        }
        String strOptString = this.f6011.optString(C2869ik.f6814);
        f6005 = (f6004 + 83) % 128;
        return strOptString;
    }

    /* renamed from: ﱡ */
    private String m6532() {
        int i = f6004 + 41;
        f6005 = i % 128;
        if (i % 2 != 0) {
            return this.f6011.optString(C2869ik.f6819);
        }
        this.f6011.optString(C2869ik.f6819);
        throw null;
    }

    /* renamed from: ﺙ */
    private EnumC2845hn m6534() {
        int i = f6004;
        EnumC2845hn enumC2845hn = this.f6010;
        int i2 = i + 107;
        f6005 = i2 % 128;
        if (i2 % 2 != 0) {
            return enumC2845hn;
        }
        throw null;
    }

    /* renamed from: ﻏ */
    private EnumC2845hn m6536() {
        int i = f6004;
        EnumC2845hn enumC2845hn = this.f6009;
        int i2 = i + 31;
        f6005 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 63 / 0;
        }
        return enumC2845hn;
    }

    /* renamed from: ﻐ */
    private List<String> m6538() {
        int i = f6004;
        List<String> list = this.f6014;
        int i2 = i + 59;
        f6005 = i2 % 128;
        if (i2 % 2 != 0) {
            return list;
        }
        throw null;
    }

    /* renamed from: ﻛ */
    private List<String> m6541() {
        int i = f6005 + 95;
        f6004 = i % 128;
        if (i % 2 == 0) {
            return this.f6013;
        }
        throw null;
    }

    /* renamed from: ｋ */
    private List<String> m6547() {
        int i = f6004 + 1;
        f6005 = i % 128;
        if (i % 2 != 0) {
            return this.f6016;
        }
        throw null;
    }

    /* renamed from: ﾇ */
    private List<String> m6552() {
        int i = (f6005 + 93) % 128;
        f6004 = i;
        List<String> list = this.f6015;
        int i2 = i + 95;
        f6005 = i2 % 128;
        if (i2 % 2 != 0) {
            return list;
        }
        throw null;
    }

    /* renamed from: ﾒ */
    private List<String> m6557() {
        int i = (f6005 + 43) % 128;
        f6004 = i;
        List<String> list = this.f6012;
        int i2 = i + InterfaceC3173h3.d.b.f8821d;
        f6005 = i2 % 128;
        if (i2 % 2 != 0) {
            return list;
        }
        throw null;
    }

    /* renamed from: ﱟ */
    private void m6531(String str) throws JSONException {
        int i = f6004 + 31;
        f6005 = i % 128;
        try {
            if (i % 2 != 0) {
                this.f6011.put(C2869ik.f6817, str);
            } else {
                this.f6011.put(C2869ik.f6817, str);
                throw null;
            }
        } catch (JSONException unused) {
        }
    }

    /* renamed from: ﱡ */
    private void m6533(String str) throws JSONException {
        f6004 = (f6005 + 25) % 128;
        try {
            this.f6011.put(C2869ik.f6816, str);
            f6004 = (f6005 + 67) % 128;
        } catch (JSONException unused) {
        }
    }

    /* renamed from: ﺙ */
    private void m6535(String str) throws JSONException {
        int i = f6004 + 21;
        f6005 = i % 128;
        try {
            if (i % 2 == 0) {
                this.f6011.put(C2869ik.f6814, str);
                throw null;
            }
            this.f6011.put(C2869ik.f6814, str);
            int i2 = f6004 + 35;
            f6005 = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
        } catch (JSONException unused) {
        }
    }

    /* renamed from: ﻏ */
    private void m6537(String str) throws JSONException {
        int i = f6005 + 71;
        f6004 = i % 128;
        try {
            if (i % 2 == 0) {
                this.f6011.put(C2869ik.f6812, str);
            } else {
                this.f6011.put(C2869ik.f6812, str);
                throw null;
            }
        } catch (JSONException unused) {
        }
    }

    /* renamed from: ﻐ */
    private void m6539(String str) {
        f6005 = (f6004 + 57) % 128;
        m6550(str, this.f6012);
        int i = f6004 + 17;
        f6005 = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ﻛ */
    private void m6542(String str) {
        f6005 = (f6004 + 43) % 128;
        m6550(str, this.f6015);
        int i = f6004 + 11;
        f6005 = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ｋ */
    private void m6549(String str) {
        f6004 = (f6005 + 61) % 128;
        m6550(str, this.f6016);
        int i = f6004 + 9;
        f6005 = i % 128;
        if (i % 2 == 0) {
            int i2 = 75 / 0;
        }
    }

    /* renamed from: ﾇ */
    private void m6555(List<String> list) {
        f6004 = (f6005 + 3) % 128;
        m6544(list, this.f6016);
        int i = f6004 + 125;
        f6005 = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ﾒ */
    private void m6558(String str) {
        int i = f6005 + 19;
        f6004 = i % 128;
        if (i % 2 == 0) {
            m6550(str, this.f6014);
        } else {
            m6550(str, this.f6014);
            throw null;
        }
    }

    /* renamed from: ﻐ */
    private void m6540(List<String> list) {
        f6005 = (f6004 + 19) % 128;
        m6544(list, this.f6012);
        int i = f6005 + 89;
        f6004 = i % 128;
        if (i % 2 != 0) {
            int i2 = 84 / 0;
        }
    }

    /* renamed from: ﻛ */
    private void m6543(List<String> list) {
        f6005 = (f6004 + 77) % 128;
        m6544(list, this.f6015);
        int i = f6004 + 47;
        f6005 = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ｋ */
    private void m6551(List<String> list) {
        f6004 = (f6005 + 5) % 128;
        m6544(list, this.f6013);
        f6005 = (f6004 + 117) % 128;
    }

    /* renamed from: ﾇ */
    private void m6554(String str) {
        f6005 = (f6004 + 115) % 128;
        m6550(str, this.f6013);
        f6005 = (f6004 + 63) % 128;
    }

    /* renamed from: ﾒ */
    private void m6559(List<String> list) {
        int i = f6005 + 29;
        f6004 = i % 128;
        if (i % 2 == 0) {
            m6544(list, this.f6014);
        } else {
            m6544(list, this.f6014);
            throw null;
        }
    }

    /* renamed from: ﻛ */
    private void m6545(JSONObject jSONObject) {
        int i = f6004 + 31;
        f6005 = i % 128;
        int i2 = i % 2;
        this.f6011 = C2915kc.m7441(jSONObject);
        if (i2 == 0) {
            int i3 = 62 / 0;
        }
    }

    /* renamed from: ｋ */
    private void m6548(EnumC2845hn enumC2845hn) {
        int i = f6004 + 9;
        int i2 = i % 128;
        f6005 = i2;
        if (i % 2 == 0) {
            throw null;
        }
        if (enumC2845hn != null) {
            int i3 = i2 + 53;
            f6004 = i3 % 128;
            int i4 = i3 % 2;
            this.f6009 = enumC2845hn;
            if (i4 != 0) {
                throw null;
            }
        }
        f6004 = (i2 + 93) % 128;
    }

    /* renamed from: ﾇ */
    private void m6553(EnumC2845hn enumC2845hn) {
        if (enumC2845hn != null) {
            int i = f6005 + 39;
            f6004 = i % 128;
            int i2 = i % 2;
            this.f6010 = enumC2845hn;
            if (i2 != 0) {
                throw null;
            }
        }
        f6005 = (f6004 + InterfaceC3173h3.d.b.f8819b) % 128;
    }

    /* renamed from: ﾒ */
    private static String m6556(byte b, String str, int i) {
        String str2;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (C2858i.f6710) {
            try {
                char[] cArr2 = f6007;
                char c = f6008;
                char[] cArr3 = new char[i];
                if (i % 2 != 0) {
                    i--;
                    cArr3[i] = (char) (cArr[i] - b);
                }
                if (i > 1) {
                    C2858i.f6715 = 0;
                    while (true) {
                        int i2 = C2858i.f6715;
                        if (i2 >= i) {
                            break;
                        }
                        C2858i.f6714 = cArr[i2];
                        C2858i.f6712 = cArr[C2858i.f6715 + 1];
                        if (C2858i.f6714 == C2858i.f6712) {
                            cArr3[C2858i.f6715] = (char) (C2858i.f6714 - b);
                            cArr3[C2858i.f6715 + 1] = (char) (C2858i.f6712 - b);
                        } else {
                            C2858i.f6713 = C2858i.f6714 / c;
                            C2858i.f6709 = C2858i.f6714 % c;
                            C2858i.f6711 = C2858i.f6712 / c;
                            C2858i.f6708 = C2858i.f6712 % c;
                            if (C2858i.f6709 == C2858i.f6708) {
                                C2858i.f6713 = AbstractC2183w4.OooOoOO(C2858i.f6713, c, 1, c);
                                C2858i.f6711 = AbstractC2183w4.OooOoOO(C2858i.f6711, c, 1, c);
                                int i3 = (C2858i.f6713 * c) + C2858i.f6709;
                                int i4 = (C2858i.f6711 * c) + C2858i.f6708;
                                int i5 = C2858i.f6715;
                                cArr3[i5] = cArr2[i3];
                                cArr3[i5 + 1] = cArr2[i4];
                            } else if (C2858i.f6713 == C2858i.f6711) {
                                C2858i.f6709 = AbstractC2183w4.OooOoOO(C2858i.f6709, c, 1, c);
                                C2858i.f6708 = AbstractC2183w4.OooOoOO(C2858i.f6708, c, 1, c);
                                int i6 = (C2858i.f6713 * c) + C2858i.f6709;
                                int i7 = (C2858i.f6711 * c) + C2858i.f6708;
                                int i8 = C2858i.f6715;
                                cArr3[i8] = cArr2[i6];
                                cArr3[i8 + 1] = cArr2[i7];
                            } else {
                                int i9 = (C2858i.f6713 * c) + C2858i.f6708;
                                int i10 = (C2858i.f6711 * c) + C2858i.f6709;
                                int i11 = C2858i.f6715;
                                cArr3[i11] = cArr2[i9];
                                cArr3[i11 + 1] = cArr2[i10];
                            }
                        }
                        C2858i.f6715 += 2;
                    }
                }
                str2 = new String(cArr3);
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }

    /* renamed from: ﮉ */
    private String m6525() {
        int i = f6005 + 17;
        f6004 = i % 128;
        if (i % 2 != 0) {
            this.f6011.optString(C2869ik.f6809);
            throw null;
        }
        String strOptString = this.f6011.optString(C2869ik.f6809);
        int i2 = f6004 + 113;
        f6005 = i2 % 128;
        if (i2 % 2 != 0) {
            return strOptString;
        }
        throw null;
    }

    /* renamed from: ﮐ */
    private String m6528() {
        String strOptString;
        int i = f6005 + 33;
        f6004 = i % 128;
        if (i % 2 != 0) {
            strOptString = this.f6011.optString(C2869ik.f6816);
            int i2 = 70 / 0;
        } else {
            strOptString = this.f6011.optString(C2869ik.f6816);
        }
        f6004 = (f6005 + 75) % 128;
        return strOptString;
    }

    /* renamed from: ﻛ */
    private static void m6544(List<String> list, List<String> list2) {
        int i = f6005 + 67;
        f6004 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
        if (list != null) {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                int i2 = f6005 + 81;
                f6004 = i2 % 128;
                if (i2 % 2 != 0) {
                    m6550(it.next(), list2);
                    int i3 = 57 / 0;
                } else {
                    m6550(it.next(), list2);
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:126:0x04de  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x004f  */
    @Override // com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2707ck
    /* renamed from: ﾇ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object mo5466(java.lang.String r24, java.util.List<java.lang.Object> r25, com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2704ch r26) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 1810
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.p009i.C2731dh.mo5466(java.lang.String, java.util.List, com.ironsource.adqualitysdk.sdk.i.ch):java.lang.Object");
    }

    /* renamed from: ｋ */
    private static void m6550(String str, List<String> list) {
        int i = f6005 + 73;
        f6004 = i % 128;
        if (i % 2 == 0) {
            if (list == null || TextUtils.isEmpty(str)) {
                return;
            }
            f6004 = (f6005 + 91) % 128;
            if (list.contains(str)) {
                return;
            }
            list.add(str);
            return;
        }
        throw null;
    }

    /* renamed from: ｋ */
    private static String m6546(boolean z, int[] iArr, String str) throws UnsupportedEncodingException {
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
                System.arraycopy(f6006, i, cArr, 0, i2);
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
