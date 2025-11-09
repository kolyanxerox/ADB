package o00OoO00;

import OooO0oO.OooOo;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.ironsource.C3034d9;
import io.flutter.plugins.firebase.crashlytics.FlutterError;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Level;
import java.util.logging.Logger;
import o0000o0.Oooo0;
import o000Ooo.o000000;
import o000Ooo.o00oO0o;
import o000o00o.o00000OO;
import o000o00o.o000oOoO;
import o000o00o.o00O0O00;
import o000o00o.o0O0O00;
import o00O0O0o.OooOo00;
import o00O0o0o.o0ooOOo;
import o00O0oOo.oo0o0Oo;
import o00OO0O.OooO00o;

/* loaded from: classes3.dex */
public abstract class OooOOO0 {

    /* renamed from: OooO00o */
    public static OooOO0O f32697OooO00o = null;

    /* renamed from: OooO0O0 */
    public static boolean f32698OooO0O0 = false;

    /* renamed from: OooO0OO */
    public static o00O0O00 f32699OooO0OO;

    public static String OooO(Object... objArr) {
        int length;
        int length2;
        int iIndexOf;
        String strOooOO0o;
        int i = 0;
        int i2 = 0;
        while (true) {
            length = objArr.length;
            if (i2 >= length) {
                break;
            }
            Object obj = objArr[i2];
            if (obj == null) {
                strOooOO0o = "null";
            } else {
                try {
                    strOooOO0o = obj.toString();
                } catch (Exception e) {
                    String strOooOoo = OooOo.OooOoo(obj.getClass().getName(), "@", Integer.toHexString(System.identityHashCode(obj)));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(strOooOoo), (Throwable) e);
                    strOooOO0o = OooOo.OooOO0o("<", strOooOoo, " threw ", e.getClass().getName(), ">");
                }
            }
            objArr[i2] = strOooOO0o;
            i2++;
        }
        StringBuilder sb = new StringBuilder((length * 16) + 29);
        int i3 = 0;
        while (true) {
            length2 = objArr.length;
            if (i >= length2 || (iIndexOf = "expected a non-null reference".indexOf("%s", i3)) == -1) {
                break;
            }
            sb.append((CharSequence) "expected a non-null reference", i3, iIndexOf);
            sb.append(objArr[i]);
            i++;
            i3 = iIndexOf + 2;
        }
        sb.append((CharSequence) "expected a non-null reference", i3, 29);
        if (i < length2) {
            sb.append(" [");
            sb.append(objArr[i]);
            for (int i4 = i + 1; i4 < objArr.length; i4++) {
                sb.append(", ");
                sb.append(objArr[i4]);
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static final boolean OooO00o(Object[] objArr, int i, int i2, List list) {
        if (i2 == list.size()) {
            for (int i3 = 0; i3 < i2; i3++) {
                if (kotlin.jvm.internal.OooOo.OooO00o(objArr[i + i3], list.get(i3))) {
                }
            }
            return true;
        }
        return false;
    }

    public static final String OooO0O0(Object[] objArr, int i, int i2, o00O0.OooOO0 oooOO0) {
        StringBuilder sb = new StringBuilder((i2 * 3) + 2);
        sb.append(C3034d9.i.f8177d);
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            Object obj = objArr[i + i3];
            if (obj == oooOO0) {
                sb.append("(this Collection)");
            } else {
                sb.append(obj);
            }
        }
        sb.append(C3034d9.i.f8179e);
        String string = sb.toString();
        kotlin.jvm.internal.OooOo.OooO0Oo(string, "toString(...)");
        return string;
    }

    public static final Object OooO0OO(Task task, o00000OO o00000oo2) throws Exception {
        if (!task.isComplete()) {
            oo0o0Oo oo0o0oo = new oo0o0Oo(1, Oooo0o0.OooO.OooOOOO(o00000oo2));
            oo0o0oo.OooOOo0();
            task.addOnCompleteListener(OooO00o.f32018OooOo0O, new o00oO0o(oo0o0oo, 13));
            Object objOooOOOo = oo0o0oo.OooOOOo();
            OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
            return objOooOOOo;
        }
        Exception exception = task.getException();
        if (exception != null) {
            throw exception;
        }
        if (!task.isCanceled()) {
            return task.getResult();
        }
        throw new CancellationException("Task " + task + " was cancelled normally.");
    }

    public static final void OooO0Oo(o0ooOOo o0ooooo, Object obj) {
        kotlin.jvm.internal.OooOo.OooO0o0(o0ooooo, "<this>");
        kotlin.jvm.internal.OooOO0 oooOO0 = (kotlin.jvm.internal.OooOO0) o0ooooo;
        if (oooOO0.OooO0Oo(obj)) {
            kotlin.jvm.internal.OooOo.OooO0OO(obj, "null cannot be cast to non-null type T of kotlin.reflect.KClasses.cast");
        } else {
            throw new ClassCastException("Value cannot be cast to " + oooOO0.OooO0O0());
        }
    }

    public static final void OooO0o() {
        try {
            if (f32699OooO0OO == null) {
                Oooo0 oooo0OooO0Oo = Oooo0.OooO0Oo();
                oooo0OooO0Oo.OooO00o();
                o00O0O00 o00o0o00 = (o00O0O00) ((o000oOoO) ((o0O0O00) oooo0OooO0Oo.f29591OooO0Oo.get(o0O0O00.class))).f30820OooOOOO.get();
                kotlin.jvm.internal.OooOo.OooO0o0(o00o0o00, "<set-?>");
                f32699OooO0OO = o00o0o00;
            }
            o00O0O00 o00o0o002 = f32699OooO0OO;
            if (o00o0o002 == null) {
                kotlin.jvm.internal.OooOo.OooOO0o("sharedSessionRepository");
                throw null;
            }
            if (o00o0o002.f30849OooO) {
                if (o00o0o002 != null) {
                    o00o0o002.OooO0O0();
                } else {
                    kotlin.jvm.internal.OooOo.OooOO0o("sharedSessionRepository");
                    throw null;
                }
            }
        } catch (Exception unused) {
        }
    }

    public static void OooO0o0(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static void OooO0oO(FlutterError flutterError) {
        o000.OooO0OO oooO0OOOooO00o = o000.OooO0OO.OooO00o();
        StringBuilder sb = new StringBuilder("Recorded on-demand fatal events: ");
        o000000 o000000Var = oooO0OOOooO00o.f28892OooO00o;
        o000Oo0O.OooOo00 oooOo00 = o000000Var.f30435OooO0OO;
        sb.append(((AtomicInteger) oooOo00.f30372OooOo0o).get());
        String string = sb.toString();
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", string, null);
        }
        String str = "Dropped on-demand fatal events: " + ((AtomicInteger) oooOo00.f30370OooOo).get();
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
        o000000Var.f30446OooOOOo.f30099OooO00o.OooO00o(new o000Ooo.oo0o0Oo(o000000Var, flutterError, 0));
    }

    public static final void OooO0oo(Object[] objArr, int i, int i2) {
        kotlin.jvm.internal.OooOo.OooO0o0(objArr, "<this>");
        while (i < i2) {
            objArr[i] = null;
            i++;
        }
    }
}
