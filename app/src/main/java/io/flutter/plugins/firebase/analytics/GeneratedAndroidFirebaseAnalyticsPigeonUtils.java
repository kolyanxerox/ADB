package io.flutter.plugins.firebase.analytics;

import android.util.Log;
import com.google.android.gms.internal.measurement.o0OO0O0;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.OooOo;
import o00O0.o0Oo0oo;
import o00O0o0O.o00Oo0;
import o00O0o0O.o00Ooo;

/* loaded from: classes3.dex */
final class GeneratedAndroidFirebaseAnalyticsPigeonUtils {
    public static final GeneratedAndroidFirebaseAnalyticsPigeonUtils INSTANCE = new GeneratedAndroidFirebaseAnalyticsPigeonUtils();

    private GeneratedAndroidFirebaseAnalyticsPigeonUtils() {
    }

    public final boolean deepEquals(Object obj, Object obj2) {
        if ((obj instanceof byte[]) && (obj2 instanceof byte[])) {
            return Arrays.equals((byte[]) obj, (byte[]) obj2);
        }
        if ((obj instanceof int[]) && (obj2 instanceof int[])) {
            return Arrays.equals((int[]) obj, (int[]) obj2);
        }
        if ((obj instanceof long[]) && (obj2 instanceof long[])) {
            return Arrays.equals((long[]) obj, (long[]) obj2);
        }
        if ((obj instanceof double[]) && (obj2 instanceof double[])) {
            return Arrays.equals((double[]) obj, (double[]) obj2);
        }
        if ((obj instanceof Object[]) && (obj2 instanceof Object[])) {
            Object[] objArr = (Object[]) obj;
            Object[] objArr2 = (Object[]) obj2;
            if (objArr.length == objArr2.length) {
                Iterable o00ooo2 = new o00Ooo(0, objArr.length - 1, 1);
                if (!(o00ooo2 instanceof Collection) || !((Collection) o00ooo2).isEmpty()) {
                    Iterator it = o00ooo2.iterator();
                    while (((o00Oo0) it).f31439OooOo) {
                        int iNextInt = ((o0Oo0oo) it).nextInt();
                        if (!INSTANCE.deepEquals(objArr[iNextInt], objArr2[iNextInt])) {
                        }
                    }
                }
                return true;
            }
            return false;
        }
        if ((obj instanceof List) && (obj2 instanceof List)) {
            List list = (List) obj;
            List list2 = (List) obj2;
            if (list.size() == list2.size()) {
                Collection collection = (Collection) obj;
                OooOo.OooO0o0(collection, "<this>");
                Iterable o00ooo3 = new o00Ooo(0, collection.size() - 1, 1);
                if (!(o00ooo3 instanceof Collection) || !((Collection) o00ooo3).isEmpty()) {
                    Iterator it2 = o00ooo3.iterator();
                    while (((o00Oo0) it2).f31439OooOo) {
                        int iNextInt2 = ((o0Oo0oo) it2).nextInt();
                        if (!INSTANCE.deepEquals(list.get(iNextInt2), list2.get(iNextInt2))) {
                        }
                    }
                }
                return true;
            }
            return false;
        }
        if (!(obj instanceof Map) || !(obj2 instanceof Map)) {
            return OooOo.OooO00o(obj, obj2);
        }
        Map map = (Map) obj;
        Map map2 = (Map) obj2;
        if (map.size() == map2.size()) {
            if (!map.isEmpty()) {
                for (Map.Entry entry : map.entrySet()) {
                    if (!map2.containsKey(entry.getKey()) || !INSTANCE.deepEquals(entry.getValue(), map2.get(entry.getKey()))) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final List<Object> wrapError(Throwable exception) {
        OooOo.OooO0o0(exception, "exception");
        if (exception instanceof FlutterError) {
            FlutterError flutterError = (FlutterError) exception;
            return o00O0.OooOo.OooOOo(flutterError.getCode(), flutterError.getMessage(), flutterError.getDetails());
        }
        return o00O0.OooOo.OooOOo(exception.getClass().getSimpleName(), exception.toString(), "Cause: " + exception.getCause() + ", Stacktrace: " + Log.getStackTraceString(exception));
    }

    public final List<Object> wrapResult(Object obj) {
        return o0OO0O0.OooOO0o(obj);
    }
}
