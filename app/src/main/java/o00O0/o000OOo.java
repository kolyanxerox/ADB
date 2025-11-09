package o00O0;

import com.google.android.gms.internal.ads.C2051sk;
import com.google.android.gms.internal.measurement.o0OOO0;
import com.google.android.gms.internal.measurement.oO000O0;
import com.google.android.gms.internal.measurement.oO000O0O;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.ServiceConfigurationError;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import o00O0oOo.o0000OO0;
import o00O0oo.o000O;
import o00O0oo.o000O0Oo;
import o00O0oo.o000OO0O;
import o00O0oo.o00O00;
import o00OOOoO.o00000O;

/* loaded from: classes3.dex */
public abstract class o000OOo {
    public static int OooO(float f) {
        if (Float.isNaN(f)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(f);
    }

    public static o00000O OooO00o() throws InterruptedException {
        o00000O o00000o = o00000O.OooOO0o;
        kotlin.jvm.internal.OooOo.OooO0O0(o00000o);
        o00000O o00000o2 = o00000o.f32544OooO0o;
        if (o00000o2 == null) {
            long jNanoTime = System.nanoTime();
            o00000O.f32540OooO.await(o00000O.f32542OooOO0, TimeUnit.MILLISECONDS);
            o00000O o00000o3 = o00000O.OooOO0o;
            kotlin.jvm.internal.OooOo.OooO0O0(o00000o3);
            if (o00000o3.f32544OooO0o != null || System.nanoTime() - jNanoTime < o00000O.f32543OooOO0O) {
                return null;
            }
            return o00000O.OooOO0o;
        }
        long jNanoTime2 = o00000o2.f32546OooO0oO - System.nanoTime();
        if (jNanoTime2 > 0) {
            o00000O.f32540OooO.await(jNanoTime2, TimeUnit.NANOSECONDS);
            return null;
        }
        o00000O o00000o4 = o00000O.OooOO0o;
        kotlin.jvm.internal.OooOo.OooO0O0(o00000o4);
        o00000o4.f32544OooO0o = o00000o2.f32544OooO0o;
        o00000o2.f32544OooO0o = null;
        return o00000o2;
    }

    public static final oo00o.OooOO0O OooO0O0(Throwable exception) {
        kotlin.jvm.internal.OooOo.OooO0o0(exception, "exception");
        return new oo00o.OooOO0O(exception);
    }

    public static int OooO0OO(int i, int i2) {
        if (i2 < 0) {
            throw new AssertionError("cannot store more than MAX_VALUE elements");
        }
        int iHighestOneBit = i + (i >> 1) + 1;
        if (iHighestOneBit < i2) {
            iHighestOneBit = Integer.highestOneBit(i2 - 1) << 1;
        }
        if (iHighestOneBit < 0) {
            return Integer.MAX_VALUE;
        }
        return iHighestOneBit;
    }

    public static void OooO0Oo(o00000oO.OooOOO oooOOO) {
        if (!oooOOO.isDone()) {
            throw new IllegalStateException(o0OOO0.OooO("Future was expected to be done: %s", oooOOO));
        }
        boolean z = false;
        while (true) {
            try {
                oooOOO.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public static boolean OooO0o(byte b) {
        return b > -65;
    }

    public static String OooO0o0(int i) {
        switch (i) {
            case -1:
                return "SUCCESS_CACHE";
            case 0:
                return "SUCCESS";
            case 1:
            case 9:
            case 11:
            case 12:
            default:
                return OooO0oO.OooOo.OooO0o(i, "unknown status code: ");
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 10:
                return "DEVELOPER_ERROR";
            case 13:
                return "ERROR";
            case 14:
                return "INTERRUPTED";
            case 15:
                return "TIMEOUT";
            case 16:
                return "CANCELED";
            case 17:
                return "API_NOT_CONNECTED";
            case 18:
                return "DEAD_CLIENT";
            case 19:
                return "REMOTE_EXCEPTION";
            case 20:
                return "CONNECTION_SUSPENDED_DURING_CALL";
            case 21:
                return "RECONNECTION_TIMED_OUT_DURING_UPDATE";
            case 22:
                return "RECONNECTION_TIMED_OUT";
        }
    }

    public static LinkedHashSet OooO0oO(Set set, Object obj) {
        kotlin.jvm.internal.OooOo.OooO0o0(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(o0O0O00.OooOOOO(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(obj);
        return linkedHashSet;
    }

    public static LinkedHashSet OooO0oo(Set set, Set elements) {
        kotlin.jvm.internal.OooOo.OooO0o0(set, "<this>");
        kotlin.jvm.internal.OooOo.OooO0o0(elements, "elements");
        LinkedHashSet linkedHashSet = new LinkedHashSet(o0O0O00.OooOOOO(set.size() + Integer.valueOf(elements.size()).intValue()));
        linkedHashSet.addAll(set);
        o00O0O.OooOo0o(elements, linkedHashSet);
        return linkedHashSet;
    }

    public static Set OooOO0(Object... objArr) {
        int length = objArr.length;
        if (length == 0) {
            return o0ooOOo.f31250OooOo0O;
        }
        if (length == 1) {
            Set setSingleton = Collections.singleton(objArr[0]);
            kotlin.jvm.internal.OooOo.OooO0Oo(setSingleton, "singleton(...)");
            return setSingleton;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(o0O0O00.OooOOOO(objArr.length));
        for (Object obj : objArr) {
            linkedHashSet.add(obj);
        }
        return linkedHashSet;
    }

    public static final void OooOO0O(Object obj) {
        if (obj instanceof oo00o.OooOO0O) {
            throw ((oo00o.OooOO0O) obj).f33187OooOo0O;
        }
    }

    public static final void OooOO0o(o00O00 o00o00, Object obj) {
        Object objOooO = o00o00.OooO(obj);
        if (!(objOooO instanceof o000O0Oo)) {
        } else {
            Object obj2 = ((o000OO0O) o0000OO0.OooOoO(o00O0O0O.OooOOO.f31358OooOo0O, new o000O(o00o00, obj, null))).f31628OooO00o;
        }
    }

    public static oO000O0O OooOOO() {
        String str;
        ClassLoader classLoader = o000OOo.class.getClassLoader();
        if (oO000O0O.class.equals(oO000O0O.class)) {
            str = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";
        } else {
            if (!oO000O0O.class.getPackage().equals(o000OOo.class.getPackage())) {
                throw new IllegalArgumentException(oO000O0O.class.getName());
            }
            str = oO000O0O.class.getPackage().getName() + ".BlazeGenerated" + oO000O0O.class.getSimpleName() + "Loader";
        }
        try {
            try {
                try {
                    androidx.datastore.preferences.protobuf.OooO00o.OooOo(Class.forName(str, true, classLoader).getConstructor(null).newInstance(null));
                    throw null;
                } catch (InstantiationException e) {
                    throw new IllegalStateException(e);
                } catch (NoSuchMethodException e2) {
                    throw new IllegalStateException(e2);
                }
            } catch (IllegalAccessException e3) {
                throw new IllegalStateException(e3);
            } catch (InvocationTargetException e4) {
                throw new IllegalStateException(e4);
            }
        } catch (ClassNotFoundException unused) {
            try {
                Iterator it = Arrays.asList(new o000OOo[0]).iterator();
                ArrayList arrayList = new ArrayList();
                while (it.hasNext()) {
                    try {
                        if (it.next() == null) {
                            throw null;
                        }
                        throw new ClassCastException();
                    } catch (ServiceConfigurationError e5) {
                        Logger.getLogger(oO000O0.class.getName()).logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load ".concat(oO000O0O.class.getSimpleName()), (Throwable) e5);
                    }
                }
                if (arrayList.size() == 1) {
                    return (oO000O0O) arrayList.get(0);
                }
                if (arrayList.size() == 0) {
                    return null;
                }
                try {
                    return (oO000O0O) oO000O0O.class.getMethod("combine", Collection.class).invoke(null, arrayList);
                } catch (IllegalAccessException e6) {
                    throw new IllegalStateException(e6);
                } catch (NoSuchMethodException e7) {
                    throw new IllegalStateException(e7);
                } catch (InvocationTargetException e8) {
                    throw new IllegalStateException(e8);
                }
            } catch (Throwable th) {
                throw new ServiceConfigurationError(th.getMessage(), th);
            }
        }
    }

    public static void OooOOO0(String str, List list, int i) {
        if (list.size() == i) {
            return;
        }
        throw new IllegalArgumentException(str + " operation requires " + i + " parameters found " + list.size());
    }

    public static void OooOOOO(String str, List list, int i) {
        if (list.size() >= i) {
            return;
        }
        throw new IllegalArgumentException(str + " operation requires at least " + i + " parameters found " + list.size());
    }

    public static void OooOOOo(int i, String str, ArrayList arrayList) {
        if (arrayList.size() <= i) {
            return;
        }
        throw new IllegalArgumentException(str + " operation requires at most " + i + " parameters found " + arrayList.size());
    }

    public static com.google.android.gms.internal.measurement.o0OOO0o OooOOo(String str) throws NumberFormatException {
        com.google.android.gms.internal.measurement.o0OOO0o o0ooo0o = null;
        if (str != null && !str.isEmpty()) {
            o0ooo0o = (com.google.android.gms.internal.measurement.o0OOO0o) com.google.android.gms.internal.measurement.o0OOO0o.f26606o00000.get(Integer.valueOf(Integer.parseInt(str)));
        }
        if (o0ooo0o != null) {
            return o0ooo0o;
        }
        throw new IllegalArgumentException(OooO0oO.OooOo.OooOO0("Unsupported commandId ", str));
    }

    public static boolean OooOOo0(com.google.android.gms.internal.measurement.Oooo0 oooo0) {
        if (oooo0 == null) {
            return false;
        }
        Double dZzd = oooo0.zzd();
        return !dZzd.isNaN() && dZzd.doubleValue() >= 0.0d && dZzd.equals(Double.valueOf(Math.floor(dZzd.doubleValue())));
    }

    public static boolean OooOOoo(com.google.android.gms.internal.measurement.Oooo0 oooo0, com.google.android.gms.internal.measurement.Oooo0 oooo02) {
        if (!oooo0.getClass().equals(oooo02.getClass())) {
            return false;
        }
        if ((oooo0 instanceof com.google.android.gms.internal.measurement.o00Oo0) || (oooo0 instanceof com.google.android.gms.internal.measurement.OooOo)) {
            return true;
        }
        if (!(oooo0 instanceof com.google.android.gms.internal.measurement.OooOO0O)) {
            return oooo0 instanceof com.google.android.gms.internal.measurement.o00O0O ? oooo0.zzc().equals(oooo02.zzc()) : oooo0 instanceof com.google.android.gms.internal.measurement.OooO ? oooo0.zze().equals(oooo02.zze()) : oooo0 == oooo02;
        }
        if (Double.isNaN(oooo0.zzd().doubleValue()) || Double.isNaN(oooo02.zzd().doubleValue())) {
            return false;
        }
        return oooo0.zzd().equals(oooo02.zzd());
    }

    public static void OooOo(C2051sk c2051sk) {
        int iOooOo00 = OooOo00(c2051sk.OooOoo("runtime.counter").zzd().doubleValue() + 1.0d);
        if (iOooOo00 > 1000000) {
            throw new IllegalStateException("Instructions allowed exceeded");
        }
        c2051sk.OooOoO("runtime.counter", new com.google.android.gms.internal.measurement.OooOO0O(Double.valueOf(iOooOo00)));
    }

    public static double OooOo0(double d) {
        if (Double.isNaN(d)) {
            return 0.0d;
        }
        if (Double.isInfinite(d) || d == 0.0d || d == 0.0d) {
            return d;
        }
        return (d > 0.0d ? 1 : -1) * Math.floor(Math.abs(d));
    }

    public static int OooOo00(double d) {
        if (Double.isNaN(d) || Double.isInfinite(d) || d == 0.0d) {
            return 0;
        }
        return (int) (((d > 0.0d ? 1 : -1) * Math.floor(Math.abs(d))) % 4.294967296E9d);
    }

    public static Object OooOo0O(com.google.android.gms.internal.measurement.Oooo0 oooo0) {
        if (com.google.android.gms.internal.measurement.Oooo0.f26431OooOOO0.equals(oooo0)) {
            return null;
        }
        if (com.google.android.gms.internal.measurement.Oooo0.OooOO0o.equals(oooo0)) {
            return "";
        }
        if (oooo0 instanceof com.google.android.gms.internal.measurement.OooOo00) {
            return OooOo0o((com.google.android.gms.internal.measurement.OooOo00) oooo0);
        }
        if (!(oooo0 instanceof com.google.android.gms.internal.measurement.OooO0o)) {
            return !oooo0.zzd().isNaN() ? oooo0.zzd() : oooo0.zzc();
        }
        ArrayList arrayList = new ArrayList();
        com.google.android.gms.internal.measurement.OooO0o oooO0o = (com.google.android.gms.internal.measurement.OooO0o) oooo0;
        oooO0o.getClass();
        int i = 0;
        while (i < oooO0o.OooOO0()) {
            if (i >= oooO0o.OooOO0()) {
                StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 21);
                sb.append("Out of bounds index: ");
                sb.append(i);
                throw new NoSuchElementException(sb.toString());
            }
            int i2 = i + 1;
            Object objOooOo0O = OooOo0O(oooO0o.OooOO0O(i));
            if (objOooOo0O != null) {
                arrayList.add(objOooOo0O);
            }
            i = i2;
        }
        return arrayList;
    }

    public static HashMap OooOo0o(com.google.android.gms.internal.measurement.OooOo00 oooOo00) {
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList(oooOo00.f26429OooOo0O.keySet());
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            String str = (String) obj;
            Object objOooOo0O = OooOo0O(oooOo00.zzk(str));
            if (objOooOo0O != null) {
                map.put(str, objOooOo0O);
            }
        }
        return map;
    }
}
