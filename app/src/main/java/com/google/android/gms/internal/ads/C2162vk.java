package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.unity3d.services.core.fid.Constants;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.ads.vk */
/* loaded from: classes2.dex */
public final class C2162vk {

    /* renamed from: OooO */
    public final Object f24983OooO;

    /* renamed from: OooO00o */
    public final AtomicReference f24984OooO00o = new AtomicReference(null);

    /* renamed from: OooO0O0 */
    public final Object f24985OooO0O0 = new Object();

    /* renamed from: OooO0OO */
    public String f24986OooO0OO = null;

    /* renamed from: OooO0Oo */
    public final AtomicBoolean f24987OooO0Oo = new AtomicBoolean(false);

    /* renamed from: OooO0o0 */
    public final AtomicInteger f24989OooO0o0 = new AtomicInteger(-1);

    /* renamed from: OooO0o */
    public final AtomicReference f24988OooO0o = new AtomicReference(null);

    /* renamed from: OooO0oO */
    public final AtomicReference f24990OooO0oO = new AtomicReference(null);

    /* renamed from: OooO0oo */
    public final ConcurrentHashMap f24991OooO0oo = new ConcurrentHashMap(9);

    public C2162vk() {
        new AtomicReference(null);
        new ArrayBlockingQueue(20);
        this.f24983OooO = new Object();
    }

    public static final Bundle OooO0o(Map map) {
        Bundle bundle = new Bundle();
        if (map != null) {
            for (String str : map.keySet()) {
                try {
                    if (Objects.equals(str, "value")) {
                        bundle.putDouble(str, Double.parseDouble((String) map.get(str)));
                    } else {
                        bundle.putString(str, (String) map.get(str));
                    }
                } catch (NullPointerException | NumberFormatException unused) {
                }
            }
        }
        return bundle;
    }

    public static final boolean OooO0oO(Context context) throws ClassNotFoundException {
        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0ooOOo)).booleanValue()) {
            if (Oooo0oO.o000000.OooO00o(context, ModuleDescriptor.MODULE_ID) >= ((Integer) zzbe.zzc().OooO00o(AbstractC1448c7.o0ooOoO)).intValue()) {
                if (!((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17928o0OOO0o)).booleanValue()) {
                    return true;
                }
                try {
                    context.getClassLoader().loadClass(Constants.FID_CLASS);
                    return false;
                } catch (ClassNotFoundException unused) {
                    return true;
                }
            }
        }
        return false;
    }

    public final Method OooO(Context context, String str) throws NoSuchMethodException, SecurityException {
        ConcurrentHashMap concurrentHashMap = this.f24991OooO0oo;
        Method method = (Method) concurrentHashMap.get(str);
        if (method != null) {
            return method;
        }
        try {
            Method declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str, null);
            concurrentHashMap.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception unused) {
            OooOO0o(str, false);
            return null;
        }
    }

    public final String OooO00o(Context context) {
        Object objOooO0oo;
        if (OooO0o0(context) && (objOooO0oo = OooO0oo(context, "generateEventId")) != null) {
            return objOooO0oo.toString();
        }
        return null;
    }

    public final String OooO0O0(Context context) {
        if (OooO0o0(context)) {
            long jLongValue = ((Long) zzbe.zzc().OooO00o(AbstractC1448c7.f17920o00oO0O)).longValue();
            if (jLongValue < 0) {
                return (String) OooO0oo(context, Constants.GET_APP_INSTANCE_ID);
            }
            AtomicReference atomicReference = this.f24984OooO00o;
            if (atomicReference.get() == null) {
                C2148v6 c2148v6 = AbstractC1448c7.f17933o0ooOO0;
                ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(((Integer) zzbe.zzc().OooO00o(c2148v6)).intValue(), ((Integer) zzbe.zzc().OooO00o(c2148v6)).intValue(), 1L, TimeUnit.MINUTES, new LinkedBlockingQueue(), new ThreadFactoryC2125uk(0));
                while (!atomicReference.compareAndSet(null, threadPoolExecutor) && (atomicReference.get() == null || atomicReference.get() == null)) {
                }
            }
            try {
                return (String) ((ExecutorService) atomicReference.get()).submit(new CallableC2031s0(3, this, context)).get(jLongValue, TimeUnit.MILLISECONDS);
            } catch (TimeoutException unused) {
                return "TIME_OUT";
            } catch (Exception unused2) {
            }
        }
        return null;
    }

    public final String OooO0OO(Context context) {
        if (!OooO0o0(context)) {
            return null;
        }
        synchronized (this.f24985OooO0O0) {
            try {
                String str = this.f24986OooO0OO;
                if (str != null) {
                    return str;
                }
                String str2 = (String) OooO0oo(context, "getGmpAppId");
                this.f24986OooO0OO = str2;
                return str2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void OooO0Oo(Context context, String str, String str2, String str3, int i) {
        if (OooO0o0(context)) {
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str2);
            bundle.putString("reward_type", str3);
            bundle.putInt("reward_value", i);
            OooOO0O(context, "_ar", str, bundle);
            zze.zza("Log a Firebase reward video event, reward type: " + str3 + ", reward value: " + i);
        }
    }

    public final boolean OooO0o0(Context context) {
        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17911o00Oo0)).booleanValue() && !this.f24987OooO0Oo.get()) {
            if (!((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17929o0Oo0oo)).booleanValue()) {
                AtomicInteger atomicInteger = this.f24989OooO0o0;
                if (atomicInteger.get() == -1) {
                    zzbc.zzb();
                    if (!zzf.zzs(context, 12451000)) {
                        zzbc.zzb();
                        if (zzf.zzt(context)) {
                            zzo.zzj("Google Play Service is out of date, the Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires updated Google Play Service.");
                            atomicInteger.set(0);
                        }
                    }
                    atomicInteger.set(1);
                }
                if (atomicInteger.get() == 1) {
                }
            }
            return true;
        }
        return false;
    }

    public final Object OooO0oo(Context context, String str) throws NoSuchMethodException, SecurityException {
        AtomicReference atomicReference = this.f24988OooO0o;
        if (!OooOOO0(context, "com.google.android.gms.measurement.AppMeasurement", atomicReference, true)) {
            return null;
        }
        try {
            return OooO(context, str).invoke(atomicReference.get(), null);
        } catch (Exception unused) {
            OooOO0o(str, true);
            return null;
        }
    }

    public final void OooOO0(Context context, String str, String str2) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        AtomicReference atomicReference = this.f24988OooO0o;
        if (OooOOO0(context, "com.google.android.gms.measurement.AppMeasurement", atomicReference, true)) {
            ConcurrentHashMap concurrentHashMap = this.f24991OooO0oo;
            Method declaredMethod = (Method) concurrentHashMap.get(str2);
            if (declaredMethod == null) {
                try {
                    declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str2, String.class);
                    concurrentHashMap.put(str2, declaredMethod);
                } catch (Exception unused) {
                    OooOO0o(str2, false);
                    declaredMethod = null;
                }
            }
            try {
                declaredMethod.invoke(atomicReference.get(), str);
                zze.zza("Invoke Firebase method " + str2 + ", Ad Unit Id: " + str);
            } catch (Exception unused2) {
                OooOO0o(str2, false);
            }
        }
    }

    public final void OooOO0O(Context context, String str, String str2, Bundle bundle) {
        if (OooO0o0(context)) {
            Bundle bundle2 = new Bundle();
            try {
                bundle2.putLong("_aeid", Long.parseLong(str2));
            } catch (NullPointerException | NumberFormatException e) {
                zzo.zzh("Invalid event ID: ".concat(String.valueOf(str2)), e);
            }
            if ("_ac".equals(str)) {
                bundle2.putInt("_r", 1);
            }
            if (bundle != null) {
                bundle2.putAll(bundle);
            }
            AtomicReference atomicReference = this.f24988OooO0o;
            if (OooOOO0(context, "com.google.android.gms.measurement.AppMeasurement", atomicReference, true)) {
                ConcurrentHashMap concurrentHashMap = this.f24991OooO0oo;
                Method declaredMethod = (Method) concurrentHashMap.get("logEventInternal");
                if (declaredMethod == null) {
                    try {
                        declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod("logEventInternal", String.class, String.class, Bundle.class);
                        concurrentHashMap.put("logEventInternal", declaredMethod);
                    } catch (Exception unused) {
                        OooOO0o("logEventInternal", true);
                        declaredMethod = null;
                    }
                }
                try {
                    declaredMethod.invoke(atomicReference.get(), "am", str, bundle2);
                } catch (Exception unused2) {
                    OooOO0o("logEventInternal", true);
                }
            }
        }
    }

    public final void OooOO0o(String str, boolean z) {
        AtomicBoolean atomicBoolean = this.f24987OooO0Oo;
        if (atomicBoolean.get()) {
            return;
        }
        zzo.zzj("Invoke Firebase method " + str + " error.");
        if (z) {
            zzo.zzj("The Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires the latest Firebase SDK jar, but Firebase SDK is either missing or out of date");
            atomicBoolean.set(true);
        }
    }

    public final boolean OooOOO0(Context context, String str, AtomicReference atomicReference, boolean z) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (atomicReference.get() != null) {
            return true;
        }
        try {
            Object objInvoke = context.getClassLoader().loadClass(str).getDeclaredMethod(Constants.GET_INSTANCE, Context.class).invoke(null, context);
            while (!atomicReference.compareAndSet(null, objInvoke)) {
                if (atomicReference.get() != null && atomicReference.get() != null) {
                    return true;
                }
            }
            return true;
        } catch (Exception unused) {
            OooOO0o(Constants.GET_INSTANCE, z);
            return false;
        }
    }
}
