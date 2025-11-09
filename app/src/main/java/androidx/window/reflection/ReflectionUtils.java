package androidx.window.reflection;

import android.util.Log;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import kotlin.jvm.internal.OooOo;
import o00O0Oo.OooO0O0;
import o00O0o0o.o0ooOOo;
import o00Oo0oo.o00oO0o;

/* loaded from: classes.dex */
public final class ReflectionUtils {
    public static final ReflectionUtils INSTANCE = new ReflectionUtils();

    private ReflectionUtils() {
    }

    public static final boolean validateReflection$window_release(String str, OooO0O0 block) {
        OooOo.OooO0o0(block, "block");
        try {
            boolean zBooleanValue = ((Boolean) block.invoke()).booleanValue();
            if (!zBooleanValue && str != null) {
                Log.e("ReflectionGuard", str);
            }
            return zBooleanValue;
        } catch (ClassNotFoundException unused) {
            if (str == null) {
                str = "";
            }
            Log.e("ReflectionGuard", "ClassNotFound: ".concat(str));
            return false;
        } catch (NoSuchMethodException unused2) {
            if (str == null) {
                str = "";
            }
            Log.e("ReflectionGuard", "NoSuchMethod: ".concat(str));
            return false;
        }
    }

    public static /* synthetic */ boolean validateReflection$window_release$default(String str, OooO0O0 oooO0O0, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return validateReflection$window_release(str, oooO0O0);
    }

    public final boolean checkIsPresent$window_release(OooO0O0 classLoader) {
        OooOo.OooO0o0(classLoader, "classLoader");
        try {
            classLoader.invoke();
            return true;
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
            return false;
        }
    }

    public final boolean doesReturn$window_release(Method method, o0ooOOo clazz) {
        OooOo.OooO0o0(method, "<this>");
        OooOo.OooO0o0(clazz, "clazz");
        return doesReturn$window_release(method, o00oO0o.OooO0oO(clazz));
    }

    public final boolean isPublic$window_release(Method method) {
        OooOo.OooO0o0(method, "<this>");
        return Modifier.isPublic(method.getModifiers());
    }

    public final boolean validateImplementation$window_release(Class<?> implementation, Class<?> requirements) throws SecurityException {
        OooOo.OooO0o0(implementation, "implementation");
        OooOo.OooO0o0(requirements, "requirements");
        Method[] methods = requirements.getMethods();
        OooOo.OooO0Oo(methods, "requirements.methods");
        for (Method method : methods) {
            if (!validateReflection$window_release(implementation.getName() + '#' + method.getName() + " is not valid", new ReflectionUtils$validateImplementation$1$1(implementation, method))) {
                return false;
            }
        }
        return true;
    }

    public final boolean doesReturn$window_release(Method method, Class<?> clazz) {
        OooOo.OooO0o0(method, "<this>");
        OooOo.OooO0o0(clazz, "clazz");
        return method.getReturnType().equals(clazz);
    }
}
