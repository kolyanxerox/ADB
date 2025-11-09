package com.ironsource.adqualitysdk.sdk.p009i;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.hs */
/* loaded from: classes2.dex */
public final class C2850hs {

    /* renamed from: ﻛ */
    private C2850hs f6656;

    /* renamed from: ｋ */
    private C2739dp f6657;

    /* renamed from: com.ironsource.adqualitysdk.sdk.i.hs$b */
    public static class b {

        /* renamed from: ｋ */
        private C2853hv f6658;

        /* renamed from: ﾒ */
        private int f6659;

        private b() {
        }

        /* renamed from: ｋ */
        public final C2853hv m6931() {
            return this.f6658;
        }

        /* renamed from: ﾒ */
        public final void m6933(C2853hv c2853hv) {
            this.f6658 = c2853hv;
            this.f6659 = c2853hv.m6949();
        }

        public /* synthetic */ b(byte b) {
            this();
        }

        /* renamed from: ｋ */
        public final boolean m6932(Method method) {
            if (this.f6658 == null || (method.getModifiers() & this.f6658.m6876()) != this.f6658.m6876() || (method.getModifiers() & this.f6658.m6878()) != 0 || this.f6658.m6950().contains(method.getReturnType())) {
                return false;
            }
            Class<?>[] parameterTypes = method.getParameterTypes();
            if (this.f6658.m6947() != -1 && this.f6658.m6947() != parameterTypes.length) {
                return false;
            }
            List<Class> listM6948 = this.f6658.m6948();
            if (listM6948 != null) {
                if (listM6948.size() != parameterTypes.length) {
                    return false;
                }
                for (int i = 0; i < listM6948.size(); i++) {
                    if (!listM6948.get(i).equals(parameterTypes[i])) {
                        return false;
                    }
                }
            }
            if (this.f6658.m6952() != null ? this.f6658.m6951() ? method.getReturnType().equals(this.f6658.m6952()) : this.f6658.m6952().isAssignableFrom(method.getReturnType()) : true) {
                int i2 = this.f6659;
                if (i2 == 0) {
                    return true;
                }
                this.f6659 = i2 - 1;
            }
            return false;
        }
    }

    public C2850hs() {
    }

    /* renamed from: ﻐ */
    private static void m6921(Class cls, C2853hv c2853hv, List<Method> list) {
        b bVar = new b((byte) 0);
        bVar.m6933(c2853hv);
        m6923(cls, bVar, list);
    }

    /* renamed from: ｋ */
    public static List<Method> m6922(Class cls, C2853hv c2853hv) {
        ArrayList arrayList = new ArrayList();
        m6921(cls, c2853hv, arrayList);
        return arrayList;
    }

    /* renamed from: ﾇ */
    public static Method m6924(Class cls, C2853hv c2853hv) {
        ArrayList arrayList = new ArrayList();
        m6921(cls, c2853hv, arrayList);
        if (arrayList.isEmpty()) {
            return null;
        }
        return (Method) arrayList.get(0);
    }

    /* renamed from: ﻛ */
    public final C2850hs m6926() {
        return this.f6656;
    }

    /* renamed from: ﾒ */
    public final String m6930() {
        return this.f6657.m6644();
    }

    public C2850hs(C2739dp c2739dp, C2850hs c2850hs) {
        this.f6657 = c2739dp;
        this.f6656 = c2850hs;
    }

    /* renamed from: ｋ */
    private static void m6923(Class cls, b bVar, List<Method> list) {
        List<Method> listAsList;
        C2853hv c2853hvM6931 = bVar.m6931();
        if (c2853hvM6931 != null && c2853hvM6931.m6879()) {
            listAsList = m6920(cls, c2853hvM6931.m6879(), c2853hvM6931.m6877());
        } else {
            listAsList = Arrays.asList(cls.getDeclaredMethods());
        }
        for (Method method : listAsList) {
            if (bVar.m6932(method)) {
                list.add(method);
            }
        }
    }

    /* renamed from: ﻐ */
    private static List<Method> m6920(Class cls, boolean z, int i) {
        Method[] methodArrM7394 = new Method[0];
        if (cls != null) {
            methodArrM7394 = C2911jz.m7394(cls.getDeclaredMethods(), cls.getMethods());
            if (!z) {
                return Arrays.asList(methodArrM7394);
            }
            Class superclass = cls.getSuperclass();
            for (int i2 = 0; superclass != null && i2 != i; i2++) {
                methodArrM7394 = C2911jz.m7394(C2911jz.m7394(methodArrM7394, superclass.getDeclaredMethods()), superclass.getMethods());
                superclass = superclass.getSuperclass();
            }
        }
        return Arrays.asList(methodArrM7394);
    }

    /* renamed from: ﾇ */
    public final C2738do m6929(String str) {
        C2738do c2738do;
        C2850hs c2850hs = this;
        do {
            c2738do = c2850hs.f6657.m6641().get(str);
            if (c2738do != null) {
                break;
            }
            c2850hs = c2850hs.f6656;
        } while (c2850hs != null);
        return c2738do;
    }

    /* renamed from: ｋ */
    public final List<C2737dn> m6928() {
        ArrayList arrayList = new ArrayList(this.f6657.m6640());
        C2850hs c2850hs = this.f6656;
        if (c2850hs != null) {
            arrayList.addAll(c2850hs.m6928());
        }
        return arrayList;
    }

    /* renamed from: ｋ */
    public final C2743dt m6927(String str) {
        C2743dt c2743dt;
        C2850hs c2850hs = this;
        do {
            c2743dt = c2850hs.f6657.m6645().get(str);
            if (c2743dt != null) {
                break;
            }
            c2850hs = c2850hs.f6656;
        } while (c2850hs != null);
        return c2743dt;
    }

    /* renamed from: ﻐ */
    public final List<String> m6925() {
        ArrayList arrayList = new ArrayList(this.f6657.m6642());
        C2850hs c2850hs = this.f6656;
        if (c2850hs != null) {
            arrayList.addAll(c2850hs.m6925());
        }
        return arrayList;
    }
}
