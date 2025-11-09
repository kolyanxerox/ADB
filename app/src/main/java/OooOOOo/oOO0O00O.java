package OoooOOo;

import OooOooo.o000O0O0;
import OooOooo.o000O0Oo;
import OooOooo.o000OO0O;
import Oooo00O.o000000O;
import Oooo0oO.o000000;
import Oooo0oO.o0OO00O;
import android.content.Context;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.reflect.Method;
import o00000oO.OooOOO0;
import org.chromium.net.ApiVersion;

/* loaded from: classes2.dex */
public abstract class oOO0O00O {

    /* renamed from: OooO00o */
    public static final o000O0Oo f14933OooO00o = o000O0Oo.f13671OooO0O0;

    /* renamed from: OooO0O0 */
    public static final Object f14934OooO0O0 = new Object();

    /* renamed from: OooO0OO */
    public static o000000 f14935OooO0OO = null;

    /* renamed from: OooO0Oo */
    public static String f14936OooO0Oo = "0";

    public static Task OooO00o(Context context) {
        o000000 o000000Var;
        o000000O.OooO(context, "Context must not be null");
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        synchronized (f14934OooO0O0) {
            o000000Var = f14935OooO0OO;
        }
        if (o000000Var != null) {
            taskCompletionSource.setResult(null);
            return taskCompletionSource.getTask();
        }
        new Thread(new OooOOO0(19, context, taskCompletionSource)).start();
        return taskCompletionSource.getTask();
    }

    public static void OooO0O0(Context context) {
        o000000 o000000Var;
        Object obj = f14934OooO0O0;
        synchronized (obj) {
            try {
                synchronized (obj) {
                    o000000Var = f14935OooO0OO;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (o000000Var != null) {
            return;
        }
        o000000O.OooO(context, "Context must not be null");
        ClassLoader classLoader = oOO0O00O.class.getClassLoader();
        o000000O.OooO0oo(classLoader);
        try {
            classLoader.loadClass("org.chromium.net.CronetEngine");
            int apiLevel = ApiVersion.getApiLevel();
            o000O0Oo o000o0oo2 = f14933OooO00o;
            o000o0oo2.getClass();
            o000O0Oo.OooO0Oo(context);
            try {
                o000000 o000000VarOooO0OO = o000000.OooO0OO(context, o000000.f13867OooO0O0, "com.google.android.gms.cronet_dynamite");
                try {
                    Class<?> clsLoadClass = o000000VarOooO0OO.f13879OooO00o.getClassLoader().loadClass("org.chromium.net.impl.ImplVersion");
                    if (clsLoadClass.getClassLoader() == oOO0O00O.class.getClassLoader()) {
                        Log.e("oOO0O00O", "ImplVersion class is missing from Cronet module.");
                        throw new o000OO0O();
                    }
                    Method method = clsLoadClass.getMethod("getApiLevel", null);
                    Method method2 = clsLoadClass.getMethod("getCronetVersion", null);
                    Integer num = (Integer) method.invoke(null, null);
                    o000000O.OooO0oo(num);
                    int iIntValue = num.intValue();
                    String str = (String) method2.invoke(null, null);
                    o000000O.OooO0oo(str);
                    f14936OooO0Oo = str;
                    if (apiLevel <= iIntValue) {
                        f14935OooO0OO = o000000VarOooO0OO;
                        return;
                    }
                    if (o000o0oo2.OooO0O0(context, "cr", 2) == null) {
                        Log.e("oOO0O00O", "Unable to fetch error resolution intent");
                        throw new o000OO0O();
                    }
                    String str2 = f14936OooO0Oo;
                    StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 174);
                    sb.append("Google Play Services update is required. The API Level of the client is ");
                    sb.append(apiLevel);
                    sb.append(". The API Level of the implementation is ");
                    sb.append(iIntValue);
                    sb.append(". The Cronet implementation version is ");
                    sb.append(str2);
                    throw new o000O0O0(sb.toString());
                } catch (Exception e) {
                    Log.e("oOO0O00O", "Unable to read Cronet version from the Cronet module ", e);
                    throw ((o000OO0O) new o000OO0O().initCause(e));
                }
            } catch (o0OO00O e2) {
                Log.e("oOO0O00O", "Unable to load Cronet module", e2);
                throw ((o000OO0O) new o000OO0O().initCause(e2));
            }
        } catch (ClassNotFoundException e3) {
            Log.e("oOO0O00O", "Cronet API is not available. Have you included all required dependencies?");
            throw ((o000OO0O) new o000OO0O().initCause(e3));
        }
    }
}
