package o00O0oo0;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.OooOo;
import o00O0.o000OOo;
import oo00o.OooOO0O;

/* loaded from: classes3.dex */
public abstract class o0OO00O {
    private static volatile Choreographer choreographer;

    static {
        Object objOooO0O0;
        try {
            objOooO0O0 = new o0Oo0oo(OooO00o(Looper.getMainLooper()), false);
        } catch (Throwable th) {
            objOooO0O0 = o000OOo.OooO0O0(th);
        }
        if (objOooO0O0 instanceof OooOO0O) {
            objOooO0O0 = null;
        }
    }

    public static final Handler OooO00o(Looper looper) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (Build.VERSION.SDK_INT >= 28) {
            Object objInvoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
            OooOo.OooO0OO(objInvoke, "null cannot be cast to non-null type android.os.Handler");
            return (Handler) objInvoke;
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (NoSuchMethodException unused) {
            return new Handler(looper);
        }
    }
}
