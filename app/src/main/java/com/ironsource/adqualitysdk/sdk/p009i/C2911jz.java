package com.ironsource.adqualitysdk.sdk.p009i;

import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.ironsource.InterfaceC3173h3;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.jz */
/* loaded from: classes2.dex */
public class C2911jz {

    /* renamed from: ﻐ */
    private static int f7189 = 1;

    /* renamed from: ﻛ */
    private static long f7190;

    /* renamed from: ｋ */
    private static int f7191;

    /* renamed from: ﾇ */
    private static Map<e, Method> f7192;

    /* renamed from: com.ironsource.adqualitysdk.sdk.i.jz$e */
    public static class e {

        /* renamed from: ﮐ */
        private static int f7193 = 0;

        /* renamed from: ﱟ */
        private static int f7194 = 1;

        /* renamed from: ｋ */
        private static char[] f7195 = {25073, 41935, 58852, 10134, 27019, 43958, 60796, 12099, 29034, 45843, 62734, 14119, 30912, 47819, 64743, 16024, 16551, 'm', 49753, 33870, 17960, 2109, 51725, 36080, 20185, 4316, 53927, 38063, 22145, 6453, ',', 49718, 33857, 17935, 2109, 51738, 36076, 20213, 4308, 53896, 38077, 22175, 6509, 56099, 40211, 19361, 35259, 53196, 3470, 17319, 33156, 51018, 1403, 23388, 39224, 57122, 7450, 21238, 37038};

        /* renamed from: ﾇ */
        private static long f7196 = -233828083858685418L;

        /* renamed from: ﻐ */
        private Class f7197;

        /* renamed from: ﻛ */
        private List<Class> f7198;

        /* renamed from: ﾒ */
        private String f7199;

        public e(Object obj, String str, List<Class> list) {
            if (obj instanceof Class) {
                this.f7197 = (Class) obj;
            } else {
                this.f7197 = obj.getClass();
            }
            this.f7199 = str;
            this.f7198 = list;
        }

        /* renamed from: ﻛ */
        private static String m7410(int i, int i2, char c) {
            String str;
            synchronized (C2642a.f4435) {
                try {
                    char[] cArr = new char[i];
                    C2642a.f4436 = 0;
                    while (true) {
                        int i3 = C2642a.f4436;
                        if (i3 < i) {
                            cArr[i3] = (char) ((f7195[i2 + i3] ^ (i3 * f7196)) ^ c);
                            C2642a.f4436 = i3 + 1;
                        } else {
                            str = new String(cArr);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                int i = f7194 + 61;
                f7193 = i % 128;
                return i % 2 == 0;
            }
            if (obj != null) {
                int i2 = f7193 + InterfaceC3173h3.d.b.f8821d;
                f7194 = i2 % 128;
                if (i2 % 2 == 0) {
                    throw null;
                }
                if (e.class == obj.getClass()) {
                    e eVar = (e) obj;
                    if (!this.f7197.equals(eVar.f7197)) {
                        return false;
                    }
                    if (!this.f7199.equals(eVar.f7199)) {
                        f7194 = (f7193 + 113) % 128;
                        return false;
                    }
                    boolean zEquals = this.f7198.equals(eVar.f7198);
                    int i3 = f7194 + 71;
                    f7193 = i3 % 128;
                    if (i3 % 2 != 0) {
                        int i4 = 53 / 0;
                    }
                    return zEquals;
                }
            }
            return false;
        }

        public final int hashCode() {
            f7193 = (f7194 + 115) % 128;
            int iHashCode = this.f7198.hashCode() + ((this.f7199.hashCode() + (this.f7197.hashCode() * 31)) * 31);
            f7193 = (f7194 + 41) % 128;
            return iHashCode;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder(m7410('A' - AndroidCharacter.getMirror('0'), TextUtils.indexOf("", "", 0, 0), (char) (25020 - KeyEvent.keyCodeFromString(""))).intern());
            sb.append(m7410((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 12, 17 - Color.blue(0), (char) (ViewConfiguration.getScrollBarSize() >> 8)).intern());
            sb.append(this.f7197);
            sb.append(m7410(15 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 30 - KeyEvent.getDeadChar(0, 0), (char) (ViewConfiguration.getTapTimeout() >> 16)).intern());
            sb.append(this.f7199);
            sb.append('\'');
            sb.append(m7410(14 - View.combineMeasuredStates(0, 0), TextUtils.lastIndexOf("", '0', 0, 0) + 46, (char) (Color.argb(0, 0, 0, 0) + 19341)).intern());
            sb.append(this.f7198);
            sb.append('}');
            String string = sb.toString();
            int i = f7194 + 19;
            f7193 = i % 128;
            if (i % 2 == 0) {
                return string;
            }
            throw null;
        }
    }

    static {
        m7404();
        f7192 = new ConcurrentHashMap();
        int i = f7189 + 41;
        f7191 = i % 128;
        if (i % 2 != 0) {
            int i2 = 83 / 0;
        }
    }

    /* renamed from: ﻐ */
    private static boolean m7393(Constructor constructor, List<Object> list) {
        int i = f7191 + 41;
        f7189 = i % 128;
        int i2 = i % 2;
        Class<?>[] parameterTypes = constructor.getParameterTypes();
        if (i2 != 0) {
            return m7402(parameterTypes, list);
        }
        m7402(parameterTypes, list);
        throw null;
    }

    /* renamed from: ﻛ */
    public static Object m7395(Class cls, List<Object> list) throws Exception {
        f7191 = (f7189 + 11) % 128;
        Object objNewInstance = m7399(cls, list).newInstance(list.toArray());
        int i = f7191 + 37;
        f7189 = i % 128;
        if (i % 2 == 0) {
            int i2 = 69 / 0;
        }
        return objNewInstance;
    }

    /* renamed from: ｋ */
    public static Class m7398(String str, boolean z) {
        f7189 = (f7191 + 33) % 128;
        try {
            return Class.forName(str);
        } catch (Throwable th) {
            if (z) {
                String strIntern = m7391("꓂\ue182⸘璙넩ﾠЮ䊸轇헑ባ壹\ue56d⏷桡", 17782 - ExpandableListView.getPackedPositionChild(0L)).intern();
                StringBuilder sb = new StringBuilder();
                sb.append(m7391("ꓓ硹᷻ㅬ훷\uea29", Color.red(0) + 56453).intern());
                sb.append(str);
                sb.append(m7391("꒰夛張嵋匤冏垡喦䯖䧹", (ViewConfiguration.getScrollDefaultDelay() >> 16) + 64997).intern());
                C2713cq.m6350(strIntern, sb.toString(), th);
            }
            f7189 = (f7191 + 93) % 128;
            return null;
        }
    }

    /* renamed from: ﾇ */
    public static void m7404() {
        f7190 = 3592604619336492176L;
    }

    /* renamed from: ﾒ */
    private static List<Class> m7408(List<Object> list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            f7189 = (f7191 + 5) % 128;
            if (obj != null) {
                int i = f7191 + 27;
                f7189 = i % 128;
                if (i % 2 == 0) {
                    arrayList.add(obj.getClass());
                    throw null;
                }
                arrayList.add(obj.getClass());
            } else {
                arrayList.add(Object.class);
                f7191 = (f7189 + 65) % 128;
            }
        }
        return arrayList;
    }

    /* renamed from: ﻐ */
    public static Method[] m7394(Method[] methodArr, Method[] methodArr2) {
        int i = f7191 + 35;
        f7189 = i % 128;
        if (i % 2 == 0) {
            int length = methodArr.length;
            int length2 = methodArr2.length;
            Method[] methodArr3 = new Method[length - length2];
            System.arraycopy(methodArr, 1, methodArr3, 0, length);
            System.arraycopy(methodArr2, 0, methodArr3, length, length2);
            return methodArr3;
        }
        int length3 = methodArr.length;
        int length4 = methodArr2.length;
        Method[] methodArr4 = new Method[length3 + length4];
        System.arraycopy(methodArr, 0, methodArr4, 0, length3);
        System.arraycopy(methodArr2, 0, methodArr4, length3, length4);
        return methodArr4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.reflect.Method] */
    /* renamed from: ﻛ */
    public static Method m7396(Object obj, String str, List<Class> list) throws NoSuchMethodException, SecurityException {
        try {
            Class<?>[] clsArrM7397 = m7397(list);
            if (!(obj instanceof Class)) {
                return obj.getClass().getMethod(str, clsArrM7397);
            }
            f7191 = (f7189 + 23) % 128;
            try {
                obj = ((Class) obj).getMethod(str, clsArrM7397);
                int i = f7189 + 29;
                f7191 = i % 128;
                if (i % 2 == 0) {
                    return obj;
                }
                throw null;
            } catch (NoSuchMethodException unused) {
                return Class.class.getMethod(str, clsArrM7397);
            }
        } catch (NoSuchMethodException e2) {
            String strIntern = m7391("꓂\ue182⸘璙넩ﾠЮ䊸轇헑ባ壹\ue56d⏷桡", Color.argb(0, 0, 0, 0) + 17783).intern();
            StringBuilder sb = new StringBuilder();
            sb.append(m7391("ꓞ\ued68㞞硲", TextUtils.lastIndexOf("", '0', 0, 0) + 18840).intern());
            sb.append(str);
            sb.append(m7391("꒷欹㯯쩮髀\ua955秉ࡋ\ud8f8\uef27뾥丆Ẓⴁ\ufdce跱屯泻㌒", 53130 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))).intern());
            sb.append(obj);
            C2713cq.m6350(strIntern, sb.toString(), e2);
            return null;
        }
    }

    /* renamed from: ﾇ */
    public static Object m7403(Class cls, List<Object> list, Class... clsArr) throws Exception {
        int i = f7191 + 85;
        f7189 = i % 128;
        int i2 = i % 2;
        Constructor constructor = cls.getConstructor(clsArr);
        Object[] array = list.toArray();
        if (i2 != 0) {
            return constructor.newInstance(array);
        }
        Object objNewInstance = constructor.newInstance(array);
        int i3 = 53 / 0;
        return objNewInstance;
    }

    /* renamed from: ﾇ */
    private static boolean m7405(Method method, List<Object> list) {
        int i = f7191 + 11;
        f7189 = i % 128;
        int i2 = i % 2;
        Class<?>[] parameterTypes = method.getParameterTypes();
        if (i2 != 0) {
            return m7402(parameterTypes, list);
        }
        m7402(parameterTypes, list);
        throw null;
    }

    /* renamed from: ｋ */
    private static Constructor m7399(Class cls, List<Object> list) throws SecurityException {
        Constructor<?>[] constructors;
        int length;
        int i = f7191 + 89;
        f7189 = i % 128;
        if (i % 2 == 0) {
            constructors = cls.getConstructors();
            length = constructors.length;
        } else {
            constructors = cls.getConstructors();
            length = constructors.length;
        }
        for (int i2 = 0; i2 < length; i2++) {
            Constructor<?> constructor = constructors[i2];
            if (constructor.getParameterTypes().length == list.size()) {
                int i3 = f7191 + 125;
                f7189 = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 39 / 0;
                    if (m7393(constructor, list)) {
                        return constructor;
                    }
                } else if (m7393(constructor, list)) {
                    return constructor;
                }
            }
        }
        f7191 = (f7189 + 3) % 128;
        return null;
    }

    /* renamed from: ﾒ */
    private static Method m7407(Object obj, String str, List<Object> list) throws SecurityException {
        f7189 = (f7191 + 79) % 128;
        Method methodM7406 = m7406(obj.getClass(), str, list, false);
        int i = f7189 + 95;
        f7191 = i % 128;
        if (i % 2 == 0) {
            return methodM7406;
        }
        throw null;
    }

    /* renamed from: ﻛ */
    private static Class[] m7397(List<Class> list) {
        f7191 = (f7189 + 63) % 128;
        Class[] clsArr = new Class[list.size()];
        f7191 = (f7189 + 17) % 128;
        int i = 0;
        while (i < list.size()) {
            int i2 = f7191 + 123;
            f7189 = i2 % 128;
            if (i2 % 2 == 0) {
                clsArr[i] = list.get(i);
                i += 61;
            } else {
                clsArr[i] = list.get(i);
                i++;
            }
        }
        return clsArr;
    }

    /* renamed from: ﾒ */
    private static Method m7406(Class cls, String str, List<Object> list, boolean z) throws SecurityException {
        f7191 = (f7189 + 87) % 128;
        for (Method method : cls.getMethods()) {
            if (method.getName().equals(str) && method.getParameterTypes().length == list.size()) {
                f7191 = (f7189 + 69) % 128;
                if (Modifier.isStatic(method.getModifiers()) == z && m7405(method, list)) {
                    return method;
                }
            }
        }
        int i = f7189 + InterfaceC3173h3.d.b.f8823f;
        f7191 = i % 128;
        if (i % 2 != 0) {
            int i2 = 22 / 0;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0081  */
    /* renamed from: ﻐ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean m7392(java.lang.Class r5, java.util.List<java.lang.String> r6) {
        /*
            r0 = 0
            if (r5 == 0) goto L98
            r1 = 1
            if (r6 == 0) goto L97
            boolean r2 = r6.isEmpty()
            if (r2 == r1) goto L97
            java.util.Iterator r6 = r6.iterator()
        L10:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L51
            int r2 = com.ironsource.adqualitysdk.sdk.p009i.C2911jz.f7189
            int r2 = r2 + 83
            int r2 = r2 % 128
            com.ironsource.adqualitysdk.sdk.p009i.C2911jz.f7191 = r2
            java.lang.Object r2 = r6.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = ""
            boolean r4 = r2.equals(r3)
            if (r4 == 0) goto L40
            java.lang.Package r4 = r5.getPackage()
            if (r4 == 0) goto L50
            java.lang.Package r4 = r5.getPackage()
            java.lang.String r4 = r4.getName()
            boolean r4 = r4.equals(r3)
            if (r4 != 0) goto L50
        L40:
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L10
            java.lang.String r3 = r5.getName()
            boolean r2 = r3.startsWith(r2)
            if (r2 == 0) goto L10
        L50:
            return r1
        L51:
            java.lang.Class<com.ironsource.adqualitysdk.sdk.i.jz> r6 = com.ironsource.adqualitysdk.sdk.p009i.C2911jz.class
            java.lang.String r2 = r6.getName()
            int r3 = android.graphics.Color.green(r0)
            int r3 = r3 + 5591
            java.lang.String r4 = "ꓳ넨轓\ue53b\uf3a5집⟵㰟ਜ਼恰纃哟ꋧ뼞镼\ue368濾\ud7a6ⷻ㨄ူ湚䒞劸"
            java.lang.String r3 = m7391(r4, r3)
            java.lang.String r3 = r3.intern()
            boolean r2 = r2.startsWith(r3)
            if (r2 != 0) goto L98
            java.lang.Package r2 = r6.getPackage()
            if (r2 != 0) goto L81
            int r2 = com.ironsource.adqualitysdk.sdk.p009i.C2911jz.f7191
            int r2 = r2 + 67
            int r2 = r2 % 128
            com.ironsource.adqualitysdk.sdk.p009i.C2911jz.f7189 = r2
            java.lang.Package r2 = r5.getPackage()
            if (r2 == 0) goto L95
        L81:
            java.lang.Package r2 = r6.getPackage()
            if (r2 == 0) goto L96
            java.lang.Package r6 = r6.getPackage()
            java.lang.Package r5 = r5.getPackage()
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L96
        L95:
            return r1
        L96:
            return r0
        L97:
            return r1
        L98:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.p009i.C2911jz.m7392(java.lang.Class, java.util.List):boolean");
    }

    /* renamed from: ｋ */
    public static Method m7400(Object obj, String str, List<Object> list) throws SecurityException {
        Method methodM7407;
        e eVar = new e(obj, str, m7408(list));
        Method method = f7192.get(eVar);
        if (method != null) {
            if (m7402(method.getParameterTypes(), list)) {
                int i = f7189 + 17;
                f7191 = i % 128;
                if (i % 2 == 0) {
                    return method;
                }
                throw null;
            }
            String strIntern = m7391("꓂\ue182⸘璙넩ﾠЮ䊸轇헑ባ壹\ue56d⏷桡", 17783 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))).intern();
            StringBuilder sb = new StringBuilder();
            sb.append(m7391("ꓕ錑쬄̦笮댏\ueb45⍐᭼卯讇쎏㮓珧ꮹ\ue3cc\udbc3Ꮫ䯣菽社㈒樗ꈱ騰퉄ਗ਼䈑", AndroidCharacter.getMirror('0') + 14275).intern());
            sb.append(eVar);
            C2713cq.m6350(strIntern, sb.toString(), null);
        }
        if (obj instanceof Class) {
            methodM7407 = m7406((Class) obj, str, list, true);
            if (methodM7407 == null) {
                methodM7407 = m7407(Class.class, str, list);
                f7189 = (f7191 + 5) % 128;
            }
        } else {
            methodM7407 = m7407(obj, str, list);
        }
        if (methodM7407 != null) {
            f7192.put(eVar, methodM7407);
        }
        return methodM7407;
    }

    /* renamed from: ﾒ */
    public static Field[] m7409(Field[] fieldArr, Field[] fieldArr2) {
        int i = f7189 + 61;
        f7191 = i % 128;
        if (i % 2 != 0) {
            int length = fieldArr.length;
            int length2 = fieldArr2.length;
            Field[] fieldArr3 = new Field[length * length2];
            System.arraycopy(fieldArr, 1, fieldArr3, 0, length);
            System.arraycopy(fieldArr2, 1, fieldArr3, length, length2);
            return fieldArr3;
        }
        int length3 = fieldArr.length;
        int length4 = fieldArr2.length;
        Field[] fieldArr4 = new Field[length3 + length4];
        System.arraycopy(fieldArr, 0, fieldArr4, 0, length3);
        System.arraycopy(fieldArr2, 0, fieldArr4, length3, length4);
        return fieldArr4;
    }

    /* renamed from: ﻐ */
    private static String m7391(String str, int i) {
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
                        cArr2[i2] = (char) ((cArr[i2] ^ (C2804g.f6423 * i2)) ^ f7190);
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

    /* renamed from: ｋ */
    private static boolean m7402(Class[] clsArr, List<Object> list) {
        f7189 = (f7191 + 87) % 128;
        for (int i = 0; i < clsArr.length; i++) {
            f7189 = (f7191 + 55) % 128;
            Object obj = list.get(i);
            if ((obj == null && !Object.class.isAssignableFrom(clsArr[i])) || (obj != null && (!m7401(clsArr[i], obj)))) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ed  */
    /* renamed from: ｋ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean m7401(java.lang.Class r9, java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 373
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.p009i.C2911jz.m7401(java.lang.Class, java.lang.Object):boolean");
    }
}
