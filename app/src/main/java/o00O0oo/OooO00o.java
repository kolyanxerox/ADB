package o00O0OO;

import java.lang.reflect.Method;
import kotlin.jvm.internal.OooOo;

/* loaded from: classes3.dex */
public abstract class OooO00o {

    /* renamed from: OooO00o, reason: collision with root package name */
    public static final Method f31371OooO00o;

    static {
        Method method;
        Method[] methods = Throwable.class.getMethods();
        OooOo.OooO0O0(methods);
        int length = methods.length;
        int i = 0;
        while (true) {
            method = null;
            if (i >= length) {
                break;
            }
            Method method2 = methods[i];
            if (OooOo.OooO00o(method2.getName(), "addSuppressed")) {
                Class<?>[] parameterTypes = method2.getParameterTypes();
                OooOo.OooO0Oo(parameterTypes, "getParameterTypes(...)");
                if (OooOo.OooO00o(parameterTypes.length == 1 ? parameterTypes[0] : null, Throwable.class)) {
                    method = method2;
                    break;
                }
            }
            i++;
        }
        f31371OooO00o = method;
        int length2 = methods.length;
        for (int i2 = 0; i2 < length2 && !OooOo.OooO00o(methods[i2].getName(), "getSuppressed"); i2++) {
        }
    }
}
