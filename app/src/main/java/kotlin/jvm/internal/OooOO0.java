package kotlin.jvm.internal;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import o00O0oO.o000000;

/* loaded from: classes3.dex */
public final class OooOO0 implements o00O0o0o.o0ooOOo, OooO {

    /* renamed from: OooOo0o */
    public static final Map f28874OooOo0o;

    /* renamed from: OooOo0O */
    public final Class f28875OooOo0O;

    static {
        List listOooOOo = o00O0.OooOo.OooOOo(o00O0Oo.OooO0O0.class, o00O0Oo.Oooo000.class, o00O0Oo.o00O0O.class, o00O0Oo.o00Oo0.class, o00O0Oo.o00Ooo.class, o00O0Oo.oo000o.class, o00O0Oo.o00oO0o.class, o00O0Oo.o0ooOOo.class, o00O0Oo.o0OOO0o.class, o00O0Oo.o0Oo0oo.class, o00O0Oo.OooO0OO.class, o00O0Oo.OooO0o.class, o00O0Oo.OooO.class, o00O0Oo.OooOO0.class, o00O0Oo.OooOO0O.class, o00O0Oo.OooOOO0.class, o00O0Oo.OooOOO.class, o00O0Oo.OooOOOO.class, o00O0Oo.OooOo00.class, o00O0Oo.OooOo.class, o00O0Oo.Oooo0.class, o00O0Oo.o000oOoO.class, o00O0Oo.o0OoOo0.class);
        ArrayList arrayList = new ArrayList(o00O0.Oooo000.OooOo0(listOooOOo, 10));
        int i = 0;
        for (Object obj : listOooOOo) {
            int i2 = i + 1;
            if (i < 0) {
                o00O0.OooOo.OooOo00();
                throw null;
            }
            arrayList.add(new oo00o.OooOO0((Class) obj, Integer.valueOf(i)));
            i = i2;
        }
        f28874OooOo0o = o00O0.o0O0O00.OooOo0o(arrayList);
    }

    public OooOO0(Class jClass) {
        OooOo.OooO0o0(jClass, "jClass");
        this.f28875OooOo0O = jClass;
    }

    @Override // kotlin.jvm.internal.OooO
    public final Class OooO00o() {
        return this.f28875OooOo0O;
    }

    public final String OooO0O0() {
        String strOooO0o;
        Class jClass = this.f28875OooOo0O;
        OooOo.OooO0o0(jClass, "jClass");
        String strConcat = null;
        if (jClass.isAnonymousClass() || jClass.isLocalClass()) {
            return null;
        }
        if (!jClass.isArray()) {
            String strOooO0o2 = OooOo.OooO0o(jClass.getName());
            return strOooO0o2 == null ? jClass.getCanonicalName() : strOooO0o2;
        }
        Class<?> componentType = jClass.getComponentType();
        if (componentType.isPrimitive() && (strOooO0o = OooOo.OooO0o(componentType.getName())) != null) {
            strConcat = strOooO0o.concat("Array");
        }
        return strConcat == null ? "kotlin.Array" : strConcat;
    }

    public final String OooO0OO() {
        String strOooOO0;
        Class jClass = this.f28875OooOo0O;
        OooOo.OooO0o0(jClass, "jClass");
        String strConcat = null;
        if (jClass.isAnonymousClass()) {
            return null;
        }
        if (!jClass.isLocalClass()) {
            if (!jClass.isArray()) {
                String strOooOO02 = OooOo.OooOO0(jClass.getName());
                return strOooOO02 == null ? jClass.getSimpleName() : strOooOO02;
            }
            Class<?> componentType = jClass.getComponentType();
            if (componentType.isPrimitive() && (strOooOO0 = OooOo.OooOO0(componentType.getName())) != null) {
                strConcat = strOooOO0.concat("Array");
            }
            return strConcat == null ? "Array" : strConcat;
        }
        String simpleName = jClass.getSimpleName();
        Method enclosingMethod = jClass.getEnclosingMethod();
        if (enclosingMethod != null) {
            return o000000.OooooOO(simpleName, enclosingMethod.getName() + '$');
        }
        Constructor<?> enclosingConstructor = jClass.getEnclosingConstructor();
        if (enclosingConstructor != null) {
            return o000000.OooooOO(simpleName, enclosingConstructor.getName() + '$');
        }
        int iOoooO0 = o000000.OoooO0(simpleName, '$', 0, 6);
        if (iOoooO0 == -1) {
            return simpleName;
        }
        String strSubstring = simpleName.substring(iOoooO0 + 1, simpleName.length());
        OooOo.OooO0Oo(strSubstring, "substring(...)");
        return strSubstring;
    }

    public final boolean OooO0Oo(Object obj) {
        Class jClass = this.f28875OooOo0O;
        OooOo.OooO0o0(jClass, "jClass");
        Map map = f28874OooOo0o;
        OooOo.OooO0OO(map, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
        Integer num = (Integer) map.get(jClass);
        if (num != null) {
            return o0O0O00.OooO0OO(num.intValue(), obj);
        }
        if (jClass.isPrimitive()) {
            jClass = o00Oo0oo.o00oO0o.OooO0oo(o0OO00O.OooO00o(jClass));
        }
        return jClass.isInstance(obj);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof OooOO0) && o00Oo0oo.o00oO0o.OooO0oo(this).equals(o00Oo0oo.o00oO0o.OooO0oo((o00O0o0o.o0ooOOo) obj));
    }

    public final int hashCode() {
        return o00Oo0oo.o00oO0o.OooO0oo(this).hashCode();
    }

    public final String toString() {
        return this.f28875OooOo0O + " (Kotlin reflection is not available)";
    }
}
