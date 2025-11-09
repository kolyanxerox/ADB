package com.ironsource.adqualitysdk.sdk.p009i;

import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import com.ironsource.InterfaceC3173h3;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.da */
/* loaded from: classes2.dex */
public final class C2724da extends C2722cz {

    /* renamed from: ﻐ */
    private static int f5955 = 1;

    /* renamed from: ﻛ */
    private static long f5956 = -5546091287408753775L;

    /* renamed from: ﾇ */
    private static int f5957;

    /* renamed from: ﻐ */
    public static Object m6463(C2712cp c2712cp, List<Object> list) {
        List list2;
        Class cls = (Class) C2722cz.m6459(list, 0, Class.class);
        List arrayList = new ArrayList();
        if (list.size() > 1) {
            f5957 = (f5955 + 75) % 128;
            arrayList = (List) C2722cz.m6459(list, 1, List.class);
        }
        if (list.size() > 2) {
            f5957 = (f5955 + 19) % 128;
            list2 = (List) C2722cz.m6459(list, 2, List.class);
        } else {
            list2 = null;
        }
        try {
            if (list2 == null) {
                Object objM7395 = C2911jz.m7395(cls, arrayList);
                int i = f5955 + 53;
                f5957 = i % 128;
                if (i % 2 == 0) {
                    return objM7395;
                }
                throw null;
            }
            int i2 = f5955 + 89;
            f5957 = i2 % 128;
            if (i2 % 2 == 0) {
                Class[] clsArr = new Class[list2.size()];
                list2.toArray(clsArr);
                return C2911jz.m7403(cls, arrayList, clsArr);
            }
            Class[] clsArr2 = new Class[list2.size()];
            list2.toArray(clsArr2);
            C2911jz.m7403(cls, arrayList, clsArr2);
            throw null;
        } catch (Exception e) {
            String strM6231 = c2712cp.m6292().m6231();
            StringBuilder sb = new StringBuilder();
            sb.append(m6466("臤膡撒쐢ꝱㅭ迒䍲箱的홷⌴鴉䜉\ue0ac᳣ꭆ䥋\uf2bcຠ뢑宧荠", 1 - ((Process.getThreadPriority(0) + 20) >> 6)).intern());
            sb.append(cls.getName());
            String string = "";
            sb.append(m6466("魾魞歬䖉ꢊ끉镒싂搜祿埅ꈋ螑䣠慈", -TextUtils.lastIndexOf("", '0')).intern());
            sb.append(arrayList);
            if (list2 != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(m6466("쒞쒾䅋\ue592芻ኲ쫺拞塥匍\uf7d4ó\ud865拑섑㼭\uee72", KeyEvent.normalizeMetaState(0) + 1).intern());
                sb2.append(list2);
                string = sb2.toString();
            }
            sb.append(string);
            C2713cq.m6350(strM6231, sb.toString(), e);
            return null;
        }
    }

    /* renamed from: ｋ */
    public static boolean m6464(List<Object> list) {
        int i = f5955 + 65;
        f5957 = i % 128;
        if (i % 2 == 0 ? C2911jz.m7400(C2722cz.m6459(list, 0, Object.class), (String) C2722cz.m6459(list, 1, String.class), (List) C2722cz.m6459(list, 2, List.class)) != null : C2911jz.m7400(C2722cz.m6459(list, 1, Object.class), (String) C2722cz.m6459(list, 0, String.class), (List) C2722cz.m6459(list, 5, List.class)) != null) {
            return true;
        }
        int i2 = f5955 + 83;
        f5957 = i2 % 128;
        if (i2 % 2 == 0) {
            return false;
        }
        throw null;
    }

    /* renamed from: ﾇ */
    public static Class m6465(List<Object> list) {
        f5957 = (f5955 + InterfaceC3173h3.d.b.f8819b) % 128;
        Class<?> cls = Array.newInstance((Class<?>) C2722cz.m6459(list, 0, Class.class), 0).getClass();
        int i = f5955 + 7;
        f5957 = i % 128;
        if (i % 2 == 0) {
            return cls;
        }
        throw null;
    }

    /* renamed from: ﾒ */
    public static char m6467(List<Object> list) {
        int i = f5955 + 31;
        f5957 = i % 128;
        int i2 = i % 2;
        char cIntValue = (char) ((Number) C2722cz.m6459(list, 0, Number.class)).intValue();
        f5957 = (f5955 + 39) % 128;
        return cIntValue;
    }

    /* renamed from: ﾇ */
    private static String m6466(String str, int i) {
        String str2;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (C2777f.f6322) {
            try {
                char[] cArrM6790 = C2777f.m6790(f5956, cArr, i);
                C2777f.f6321 = 4;
                while (true) {
                    int i2 = C2777f.f6321;
                    if (i2 < cArrM6790.length) {
                        C2777f.f6320 = i2 - 4;
                        cArrM6790[i2] = (char) ((cArrM6790[i2] ^ cArrM6790[i2 % 4]) ^ (r2 * f5956));
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
}
