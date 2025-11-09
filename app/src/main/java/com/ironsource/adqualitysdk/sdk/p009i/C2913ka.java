package com.ironsource.adqualitysdk.sdk.p009i;

import com.ironsource.C3037dc;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ka */
/* loaded from: classes2.dex */
public final class C2913ka {

    /* renamed from: com.ironsource.adqualitysdk.sdk.i.ka$d */
    public static class d implements InvocationHandler {

        /* renamed from: ﻐ */
        private static int f7206 = 1;

        /* renamed from: ｋ */
        private static int f7207;

        /* renamed from: ﾇ */
        private static char[] f7208 = {281, 278, 289, 258, 294, 293, 284, 287, 253, 288, C3037dc.f8244T, 157, 196, 198, 201, 199, 196, 161, 167, 209, 201, 197, 193, 198, 190, 181, 189, 155, 157, 195, 200, 205, 205, 198, 159, 164, 203, 203, 205, 182, 128, 279, 302, 300, 300, 261, 256, 295, 302, 302, 297, 292, 254, 258, 294, 298, 303, 296, 293, 293, 295, 274, 233, 135, 271, 275, 274, 29, 'O', 'i', 'k', 'n', 'l', 'i', 'F', 'w', 260, 283, 281, 281, 242, 236, 271, 277, 285, 279, 276, 275, 236, 237, 276, 283, 283, 274, 267, 275, 279, 277, 279, 240, 233, 274, 277, 278, '5', 'g', 'b', 'a', 'g', 'l', 'f', 'R', 'S', 'd', 'l', 'j', 'i', 'p', 'i', 'd', 'T', '\\', 'l', 'f'};

        /* renamed from: ﻛ */
        private Object f7209;

        /* renamed from: ﾒ */
        private e f7210;

        public d(Object obj, e eVar) {
            this.f7209 = obj;
            this.f7210 = eVar;
        }

        /* renamed from: ﻛ */
        private Object m7413(Method method) {
            int i = f7206;
            f7207 = (i + 123) % 128;
            if (method != null) {
                int i2 = i + 73;
                f7207 = i2 % 128;
                if (i2 % 2 != 0) {
                    method.getName().hashCode();
                    throw null;
                }
                String name = method.getName();
                if (name.hashCode() == 1622498214 && name.equals(m7417(true, new int[]{104, 20, 0, 0}, "\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000").intern())) {
                    f7207 = (f7206 + 67) % 128;
                    return m7416();
                }
            }
            return null;
        }

        /* renamed from: ﾇ */
        private static Object[] m7415(Object[] objArr) {
            if (objArr != null) {
                try {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : objArr) {
                        f7206 = (f7207 + 81) % 128;
                        if (Proxy.isProxyClass(obj.getClass())) {
                            f7207 = (f7206 + 79) % 128;
                            arrayList.add(Proxy.getInvocationHandler(obj));
                        } else {
                            arrayList.add(obj);
                        }
                    }
                    return arrayList.toArray();
                } catch (Throwable th) {
                    C2914kb.m7426(m7417(true, new int[]{0, 10, 173, 9}, null).intern(), m7417(false, new int[]{75, 29, 169, 0}, "\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000").intern(), th, true);
                }
            }
            return objArr;
        }

        /* renamed from: ﾒ */
        private Object m7416() {
            int i = f7206;
            Object obj = this.f7209;
            f7207 = (i + 91) % 128;
            return obj;
        }

        @Override // java.lang.reflect.InvocationHandler
        public final Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            int i = f7206 + 97;
            f7207 = i % 128;
            if (i % 2 != 0) {
                m7414(method);
                throw null;
            }
            if (m7414(method)) {
                try {
                    return m7413(method);
                } catch (Throwable th) {
                    String strIntern = m7417(true, new int[]{0, 10, 173, 9}, null).intern();
                    StringBuilder sb = new StringBuilder();
                    sb.append(m7417(true, new int[]{10, 30, 91, 0}, "\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001").intern());
                    sb.append(method.getName());
                    C2914kb.m7426(strIntern, sb.toString(), th, true);
                    return null;
                }
            }
            try {
                this.f7210.mo6447(obj, method, objArr);
            } catch (Throwable th2) {
                String strIntern2 = m7417(true, new int[]{0, 10, 173, 9}, null).intern();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(m7417(false, new int[]{40, 23, 188, 0}, "\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000").intern());
                Object obj2 = this.f7209;
                sb2.append(obj2 != null ? obj2.toString() : m7417(false, new int[]{63, 4, 162, 1}, "\u0000\u0000\u0001\u0001").intern());
                sb2.append(m7417(true, new int[]{67, 8, 0, 0}, "\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001").intern());
                sb2.append(method.getName());
                C2914kb.m7426(strIntern2, sb2.toString(), th2, true);
            }
            Object obj3 = this.f7209;
            if (obj3 != null) {
                f7206 = (f7207 + 67) % 128;
                return method.invoke(obj3, objArr);
            }
            if (Object.class.equals(method.getDeclaringClass())) {
                Object objInvoke = method.invoke(this, m7415(objArr));
                f7207 = (f7206 + 125) % 128;
                return objInvoke;
            }
            int i2 = f7207 + 3;
            f7206 = i2 % 128;
            if (i2 % 2 != 0) {
                return null;
            }
            throw null;
        }

        /* renamed from: ﾒ */
        private static String m7417(boolean z, int[] iArr, String str) throws UnsupportedEncodingException {
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
                    System.arraycopy(f7208, i, cArr, 0, i2);
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

        /* renamed from: ﾇ */
        private static boolean m7414(Method method) {
            String name = method.getName();
            if (name.hashCode() == 1622498214 && name.equals(m7417(true, new int[]{104, 20, 0, 0}, "\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000").intern())) {
                f7207 = (f7206 + 85) % 128;
                return true;
            }
            int i = f7207 + 23;
            f7206 = i % 128;
            if (i % 2 != 0) {
                return false;
            }
            throw null;
        }
    }

    /* renamed from: com.ironsource.adqualitysdk.sdk.i.ka$e */
    public interface e {
        /* renamed from: ﻐ */
        void mo6447(Object obj, Method method, Object[] objArr);
    }

    /* renamed from: ﾇ */
    public static boolean m7411(Object obj) {
        return obj != null && Proxy.isProxyClass(obj.getClass()) && (obj instanceof InterfaceC2838hg);
    }

    /* renamed from: ﾒ */
    public static Object m7412(Class<?> cls, Object obj, e eVar) {
        return Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), new Class[]{cls, InterfaceC2838hg.class}, new d(obj, eVar));
    }
}
