package io.flutter.plugins.firebase.analytics;

import OooO0oO.OooOo;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import com.applovin.impl.o0OoOo0;
import com.google.android.gms.internal.ads.AbstractC2183w4;
import com.google.android.gms.internal.measurement.o000O;
import com.google.android.gms.internal.measurement.o000O0;
import com.google.android.gms.internal.measurement.o000O00O;
import com.google.android.gms.internal.measurement.o000O0O0;
import com.google.android.gms.internal.measurement.o000OO00;
import com.google.android.gms.internal.measurement.o000OO0O;
import com.google.android.gms.internal.measurement.o000OOo0;
import com.google.android.gms.internal.measurement.o00O00OO;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ironsource.o0000O0O;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugins.firebase.analytics.FirebaseAnalyticsHostApi;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import o0000o.o00Oo0;
import o0000o.o00Ooo;
import o0000o.o00oO0o;
import o0000o0.Oooo0;
import o00O0.o000OOo;
import o00O0Oo.Oooo000;
import oo00o.OooOOO0;

/* loaded from: classes3.dex */
public final class FlutterFirebaseAnalyticsPlugin implements FlutterFirebasePlugin, FlutterPlugin, FirebaseAnalyticsHostApi {
    private FirebaseAnalytics analytics;
    private MethodChannel channel;
    private BinaryMessenger messenger;

    private final Bundle createBundleFromMap(Map<String, ? extends Object> map) {
        if (map == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof String) {
                bundle.putString(key, (String) value);
            } else if (value instanceof Integer) {
                bundle.putLong(key, ((Number) value).intValue());
            } else if (value instanceof Long) {
                bundle.putLong(key, ((Number) value).longValue());
            } else if (value instanceof Double) {
                bundle.putDouble(key, ((Number) value).doubleValue());
            } else if (value instanceof Boolean) {
                bundle.putBoolean(key, ((Boolean) value).booleanValue());
            } else if (value == null) {
                bundle.putString(key, null);
            } else if (value instanceof Iterable) {
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                for (Object obj : (Iterable) value) {
                    if (obj instanceof Map) {
                        arrayList.add(createBundleFromMap((Map) obj));
                    } else if (obj != null) {
                        throw new IllegalArgumentException(androidx.datastore.preferences.protobuf.OooO00o.OooOO0o("Unsupported value type: ", obj.getClass().getCanonicalName(), " in list at key ", key));
                    }
                }
                bundle.putParcelableArrayList(key, arrayList);
            } else {
                if (!(value instanceof Map)) {
                    throw new IllegalArgumentException(OooOo.OooOO0("Unsupported value type: ", value.getClass().getCanonicalName()));
                }
                bundle.putParcelable(key, createBundleFromMap((Map) value));
            }
        }
        return bundle;
    }

    public static final void didReinitializeFirebaseCore$lambda$1(TaskCompletionSource taskCompletionSource) {
        try {
            taskCompletionSource.setResult(null);
        } catch (Exception e) {
            taskCompletionSource.setException(e);
        }
    }

    public static final void getAppInstanceId$lambda$20(FlutterFirebaseAnalyticsPlugin flutterFirebaseAnalyticsPlugin, Oooo000 oooo000, Task task) {
        kotlin.jvm.internal.OooOo.OooO0o0(task, "task");
        flutterFirebaseAnalyticsPlugin.handleTypedTaskResult(task, oooo000);
    }

    public static final void getPluginConstantsForFirebaseApp$lambda$0(TaskCompletionSource taskCompletionSource) {
        try {
            taskCompletionSource.setResult(new HashMap());
        } catch (Exception e) {
            taskCompletionSource.setException(e);
        }
    }

    public static final void getSessionId$lambda$21(FlutterFirebaseAnalyticsPlugin flutterFirebaseAnalyticsPlugin, Oooo000 oooo000, Task task) {
        kotlin.jvm.internal.OooOo.OooO0o0(task, "task");
        flutterFirebaseAnalyticsPlugin.handleTypedTaskResult(task, oooo000);
    }

    private final Task<String> handleGetAppInstanceId() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new OooOO0(taskCompletionSource, this, 0));
        Task<String> task = taskCompletionSource.getTask();
        kotlin.jvm.internal.OooOo.OooO0Oo(task, "getTask(...)");
        return task;
    }

    public static final void handleGetAppInstanceId$lambda$11(TaskCompletionSource taskCompletionSource, FlutterFirebaseAnalyticsPlugin flutterFirebaseAnalyticsPlugin) {
        Task taskForException;
        try {
            FirebaseAnalytics firebaseAnalytics = flutterFirebaseAnalyticsPlugin.analytics;
            if (firebaseAnalytics == null) {
                kotlin.jvm.internal.OooOo.OooOO0o("analytics");
                throw null;
            }
            try {
                taskForException = Tasks.call(firebaseAnalytics.OooO0O0(), new o00oO0o(firebaseAnalytics, 0));
            } catch (RuntimeException e) {
                o00O00OO o00o00oo = firebaseAnalytics.f28137OooO00o;
                o00o00oo.getClass();
                o00o00oo.OooO0OO(new o000OOo0(o00o00oo, "Failed to schedule task for getAppInstanceId", (Exception) null));
                taskForException = Tasks.forException(e);
            }
            taskCompletionSource.setResult(Tasks.await(taskForException));
        } catch (Exception e2) {
            taskCompletionSource.setException(e2);
        }
    }

    private final Task<Long> handleGetSessionId() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new OooOO0(taskCompletionSource, this, 2));
        Task<Long> task = taskCompletionSource.getTask();
        kotlin.jvm.internal.OooOo.OooO0Oo(task, "getTask(...)");
        return task;
    }

    public static final void handleGetSessionId$lambda$2(TaskCompletionSource taskCompletionSource, FlutterFirebaseAnalyticsPlugin flutterFirebaseAnalyticsPlugin) {
        Task taskForException;
        try {
            FirebaseAnalytics firebaseAnalytics = flutterFirebaseAnalyticsPlugin.analytics;
            if (firebaseAnalytics == null) {
                kotlin.jvm.internal.OooOo.OooOO0o("analytics");
                throw null;
            }
            try {
                taskForException = Tasks.call(firebaseAnalytics.OooO0O0(), new o00oO0o(firebaseAnalytics, 1));
            } catch (RuntimeException e) {
                o00O00OO o00o00oo = firebaseAnalytics.f28137OooO00o;
                o00o00oo.getClass();
                o00o00oo.OooO0OO(new o000OOo0(o00o00oo, "Failed to schedule task for getSessionId", (Exception) null));
                taskForException = Tasks.forException(e);
            }
            taskCompletionSource.setResult(Tasks.await(taskForException));
        } catch (Exception e2) {
            taskCompletionSource.setException(e2);
        }
    }

    private final Task<Void> handleLogEvent(Map<String, ? extends Object> map) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new OooO0o(map, this, taskCompletionSource, 0));
        Task<Void> task = taskCompletionSource.getTask();
        kotlin.jvm.internal.OooOo.OooO0Oo(task, "getTask(...)");
        return task;
    }

    public static final void handleLogEvent$lambda$3(Map map, FlutterFirebaseAnalyticsPlugin flutterFirebaseAnalyticsPlugin, TaskCompletionSource taskCompletionSource) {
        try {
            Object obj = map.get("eventName");
            Objects.requireNonNull(obj);
            String str = (String) obj;
            Bundle bundleCreateBundleFromMap = flutterFirebaseAnalyticsPlugin.createBundleFromMap((Map) map.get(Constants.PARAMETERS));
            FirebaseAnalytics firebaseAnalytics = flutterFirebaseAnalyticsPlugin.analytics;
            if (firebaseAnalytics == null) {
                kotlin.jvm.internal.OooOo.OooOO0o("analytics");
                throw null;
            }
            o00O00OO o00o00oo = firebaseAnalytics.f28137OooO00o;
            o00o00oo.getClass();
            o00o00oo.OooO0OO(new o000O00O(o00o00oo, (String) null, str, bundleCreateBundleFromMap, false));
            taskCompletionSource.setResult(null);
        } catch (Exception e) {
            taskCompletionSource.setException(e);
        }
    }

    private final Task<Void> handleResetAnalyticsData() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new OooOO0(taskCompletionSource, this));
        Task<Void> task = taskCompletionSource.getTask();
        kotlin.jvm.internal.OooOo.OooO0Oo(task, "getTask(...)");
        return task;
    }

    public static final void handleResetAnalyticsData$lambda$8(FlutterFirebaseAnalyticsPlugin flutterFirebaseAnalyticsPlugin, TaskCompletionSource taskCompletionSource) {
        try {
            FirebaseAnalytics firebaseAnalytics = flutterFirebaseAnalyticsPlugin.analytics;
            if (firebaseAnalytics == null) {
                kotlin.jvm.internal.OooOo.OooOO0o("analytics");
                throw null;
            }
            o00O00OO o00o00oo = firebaseAnalytics.f28137OooO00o;
            o00o00oo.getClass();
            o00o00oo.OooO0OO(new o000O(o00o00oo));
            taskCompletionSource.setResult(null);
        } catch (Exception e) {
            taskCompletionSource.setException(e);
        }
    }

    private final Task<Void> handleSetAnalyticsCollectionEnabled(boolean z) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new o0OoOo0(this, z, taskCompletionSource, 5));
        Task<Void> task = taskCompletionSource.getTask();
        kotlin.jvm.internal.OooOo.OooO0Oo(task, "getTask(...)");
        return task;
    }

    public static final void handleSetAnalyticsCollectionEnabled$lambda$5(FlutterFirebaseAnalyticsPlugin flutterFirebaseAnalyticsPlugin, boolean z, TaskCompletionSource taskCompletionSource) {
        try {
            FirebaseAnalytics firebaseAnalytics = flutterFirebaseAnalyticsPlugin.analytics;
            if (firebaseAnalytics == null) {
                kotlin.jvm.internal.OooOo.OooOO0o("analytics");
                throw null;
            }
            Boolean boolValueOf = Boolean.valueOf(z);
            o00O00OO o00o00oo = firebaseAnalytics.f28137OooO00o;
            o00o00oo.getClass();
            o00o00oo.OooO0OO(new o000O0O0(o00o00oo, boolValueOf));
            taskCompletionSource.setResult(null);
        } catch (Exception e) {
            taskCompletionSource.setException(e);
        }
    }

    private final Task<Void> handleSetConsent(Map<String, Boolean> map) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new OooO0o(map, this, taskCompletionSource, 2));
        Task<Void> task = taskCompletionSource.getTask();
        kotlin.jvm.internal.OooOo.OooO0Oo(task, "getTask(...)");
        return task;
    }

    public static final void handleSetConsent$lambda$9(Map map, FlutterFirebaseAnalyticsPlugin flutterFirebaseAnalyticsPlugin, TaskCompletionSource taskCompletionSource) {
        try {
            Boolean bool = (Boolean) map.get(Constants.AD_STORAGE_CONSENT_GRANTED);
            Boolean bool2 = (Boolean) map.get(Constants.ANALYTICS_STORAGE_CONSENT_GRANTED);
            Boolean bool3 = (Boolean) map.get(Constants.AD_PERSONALIZATION_SIGNALS_CONSENT_GRANTED);
            Boolean bool4 = (Boolean) map.get(Constants.AD_USER_DATA_CONSENT_GRANTED);
            HashMap map2 = new HashMap();
            o00Oo0 o00oo0 = o00Oo0.f29567OooOo0o;
            o00Oo0 o00oo02 = o00Oo0.f29566OooOo0O;
            if (bool != null) {
                map2.put(o00Ooo.f29569OooOo0O, bool.booleanValue() ? o00oo02 : o00oo0);
            }
            if (bool2 != null) {
                map2.put(o00Ooo.f29570OooOo0o, bool2.booleanValue() ? o00oo02 : o00oo0);
            }
            if (bool3 != null) {
                map2.put(o00Ooo.f29572OooOoO0, bool3.booleanValue() ? o00oo02 : o00oo0);
            }
            if (bool4 != null) {
                o00Ooo o00ooo2 = o00Ooo.f29568OooOo;
                if (bool4.booleanValue()) {
                    o00oo0 = o00oo02;
                }
                map2.put(o00ooo2, o00oo0);
            }
            FirebaseAnalytics firebaseAnalytics = flutterFirebaseAnalyticsPlugin.analytics;
            if (firebaseAnalytics == null) {
                kotlin.jvm.internal.OooOo.OooOO0o("analytics");
                throw null;
            }
            firebaseAnalytics.OooO00o(map2);
            taskCompletionSource.setResult(null);
        } catch (Exception e) {
            taskCompletionSource.setException(e);
        }
    }

    private final Task<Void> handleSetDefaultEventParameters(Map<String, ? extends Object> map) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new OooO0o(this, map, taskCompletionSource));
        Task<Void> task = taskCompletionSource.getTask();
        kotlin.jvm.internal.OooOo.OooO0Oo(task, "getTask(...)");
        return task;
    }

    public static final void handleSetDefaultEventParameters$lambda$10(FlutterFirebaseAnalyticsPlugin flutterFirebaseAnalyticsPlugin, Map map, TaskCompletionSource taskCompletionSource) {
        try {
            FirebaseAnalytics firebaseAnalytics = flutterFirebaseAnalyticsPlugin.analytics;
            if (firebaseAnalytics == null) {
                kotlin.jvm.internal.OooOo.OooOO0o("analytics");
                throw null;
            }
            Bundle bundleCreateBundleFromMap = flutterFirebaseAnalyticsPlugin.createBundleFromMap(map);
            if (bundleCreateBundleFromMap != null) {
                bundleCreateBundleFromMap = new Bundle(bundleCreateBundleFromMap);
            }
            o00O00OO o00o00oo = firebaseAnalytics.f28137OooO00o;
            o00o00oo.getClass();
            o00o00oo.OooO0OO(new o000O0(o00o00oo, bundleCreateBundleFromMap, 2));
            taskCompletionSource.setResult(null);
        } catch (Exception e) {
            taskCompletionSource.setException(e);
        }
    }

    private final Task<Void> handleSetSessionTimeoutDuration(long j) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new com.applovin.impl.o00Oo0(this, j, taskCompletionSource, 2));
        Task<Void> task = taskCompletionSource.getTask();
        kotlin.jvm.internal.OooOo.OooO0Oo(task, "getTask(...)");
        return task;
    }

    public static final void handleSetSessionTimeoutDuration$lambda$6(FlutterFirebaseAnalyticsPlugin flutterFirebaseAnalyticsPlugin, long j, TaskCompletionSource taskCompletionSource) {
        try {
            FirebaseAnalytics firebaseAnalytics = flutterFirebaseAnalyticsPlugin.analytics;
            if (firebaseAnalytics == null) {
                kotlin.jvm.internal.OooOo.OooOO0o("analytics");
                throw null;
            }
            o00O00OO o00o00oo = firebaseAnalytics.f28137OooO00o;
            o00o00oo.getClass();
            o00o00oo.OooO0OO(new o000OO00(o00o00oo, j));
            taskCompletionSource.setResult(null);
        } catch (Exception e) {
            taskCompletionSource.setException(e);
        }
    }

    private final Task<Void> handleSetUserId(String str) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new o0000O0O(this, str, taskCompletionSource, 4));
        Task<Void> task = taskCompletionSource.getTask();
        kotlin.jvm.internal.OooOo.OooO0Oo(task, "getTask(...)");
        return task;
    }

    public static final void handleSetUserId$lambda$4(FlutterFirebaseAnalyticsPlugin flutterFirebaseAnalyticsPlugin, String str, TaskCompletionSource taskCompletionSource) {
        try {
            FirebaseAnalytics firebaseAnalytics = flutterFirebaseAnalyticsPlugin.analytics;
            if (firebaseAnalytics == null) {
                kotlin.jvm.internal.OooOo.OooOO0o("analytics");
                throw null;
            }
            o00O00OO o00o00oo = firebaseAnalytics.f28137OooO00o;
            o00o00oo.getClass();
            o00o00oo.OooO0OO(new o000OO0O(o00o00oo, str, 0));
            taskCompletionSource.setResult(null);
        } catch (Exception e) {
            taskCompletionSource.setException(e);
        }
    }

    private final Task<Void> handleSetUserProperty(String str, String str2) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new OooOo0O.OooO0O0(this, str, str2, taskCompletionSource, 14));
        Task<Void> task = taskCompletionSource.getTask();
        kotlin.jvm.internal.OooOo.OooO0Oo(task, "getTask(...)");
        return task;
    }

    public static final void handleSetUserProperty$lambda$7(FlutterFirebaseAnalyticsPlugin flutterFirebaseAnalyticsPlugin, String str, String str2, TaskCompletionSource taskCompletionSource) {
        try {
            FirebaseAnalytics firebaseAnalytics = flutterFirebaseAnalyticsPlugin.analytics;
            if (firebaseAnalytics == null) {
                kotlin.jvm.internal.OooOo.OooOO0o("analytics");
                throw null;
            }
            o00O00OO o00o00oo = firebaseAnalytics.f28137OooO00o;
            o00o00oo.getClass();
            o00o00oo.OooO0OO(new o000O00O(o00o00oo, (String) null, str, (Object) str2, false));
            taskCompletionSource.setResult(null);
        } catch (Exception e) {
            taskCompletionSource.setException(e);
        }
    }

    private final <T> void handleTypedTaskResult(Task<T> task, Oooo000 oooo000) {
        String message;
        if (task.isSuccessful()) {
            oooo000.invoke(new OooOOO0(task.getResult()));
            return;
        }
        Exception exception = task.getException();
        if (exception == null || (message = exception.getMessage()) == null) {
            message = "An unknown error occurred";
        }
        AbstractC2183w4.OooOOoo(o000OOo.OooO0O0(new FlutterError("firebase_analytics", message, null)), oooo000);
    }

    private final void handleVoidTaskResult(Task<Void> task, Oooo000 oooo000) {
        String message;
        if (task.isSuccessful()) {
            AbstractC2183w4.OooOo00(oo00o.OooOo.f33195OooO00o, oooo000);
            return;
        }
        Exception exception = task.getException();
        if (exception == null || (message = exception.getMessage()) == null) {
            message = "An unknown error occurred";
        }
        AbstractC2183w4.OooOOoo(o000OOo.OooO0O0(new FlutterError("firebase_analytics", message, null)), oooo000);
    }

    private final void initInstance(BinaryMessenger binaryMessenger, Context context) {
        FirebaseAnalytics firebaseAnalytics = FirebaseAnalytics.getInstance(context);
        kotlin.jvm.internal.OooOo.OooO0Oo(firebaseAnalytics, "getInstance(...)");
        this.analytics = firebaseAnalytics;
        this.channel = new MethodChannel(binaryMessenger, "plugins.flutter.io/firebase_analytics");
        FirebaseAnalyticsHostApi.Companion.setUp$default(FirebaseAnalyticsHostApi.Companion, binaryMessenger, this, null, 4, null);
        FlutterFirebasePluginRegistry.registerPlugin("plugins.flutter.io/firebase_analytics", this);
        this.messenger = binaryMessenger;
    }

    public static final void logEvent$lambda$12(FlutterFirebaseAnalyticsPlugin flutterFirebaseAnalyticsPlugin, Oooo000 oooo000, Task task) {
        kotlin.jvm.internal.OooOo.OooO0o0(task, "task");
        flutterFirebaseAnalyticsPlugin.handleVoidTaskResult(task, oooo000);
    }

    public static final void resetAnalyticsData$lambda$16(FlutterFirebaseAnalyticsPlugin flutterFirebaseAnalyticsPlugin, Oooo000 oooo000, Task task) {
        kotlin.jvm.internal.OooOo.OooO0o0(task, "task");
        flutterFirebaseAnalyticsPlugin.handleVoidTaskResult(task, oooo000);
    }

    public static final void setAnalyticsCollectionEnabled$lambda$15(FlutterFirebaseAnalyticsPlugin flutterFirebaseAnalyticsPlugin, Oooo000 oooo000, Task task) {
        kotlin.jvm.internal.OooOo.OooO0o0(task, "task");
        flutterFirebaseAnalyticsPlugin.handleVoidTaskResult(task, oooo000);
    }

    public static final void setConsent$lambda$18(FlutterFirebaseAnalyticsPlugin flutterFirebaseAnalyticsPlugin, Oooo000 oooo000, Task task) {
        kotlin.jvm.internal.OooOo.OooO0o0(task, "task");
        flutterFirebaseAnalyticsPlugin.handleVoidTaskResult(task, oooo000);
    }

    public static final void setDefaultEventParameters$lambda$19(FlutterFirebaseAnalyticsPlugin flutterFirebaseAnalyticsPlugin, Oooo000 oooo000, Task task) {
        kotlin.jvm.internal.OooOo.OooO0o0(task, "task");
        flutterFirebaseAnalyticsPlugin.handleVoidTaskResult(task, oooo000);
    }

    public static final void setSessionTimeoutDuration$lambda$17(FlutterFirebaseAnalyticsPlugin flutterFirebaseAnalyticsPlugin, Oooo000 oooo000, Task task) {
        kotlin.jvm.internal.OooOo.OooO0o0(task, "task");
        flutterFirebaseAnalyticsPlugin.handleVoidTaskResult(task, oooo000);
    }

    public static final void setUserId$lambda$13(FlutterFirebaseAnalyticsPlugin flutterFirebaseAnalyticsPlugin, Oooo000 oooo000, Task task) {
        kotlin.jvm.internal.OooOo.OooO0o0(task, "task");
        flutterFirebaseAnalyticsPlugin.handleVoidTaskResult(task, oooo000);
    }

    public static final void setUserProperty$lambda$14(FlutterFirebaseAnalyticsPlugin flutterFirebaseAnalyticsPlugin, Oooo000 oooo000, Task task) {
        kotlin.jvm.internal.OooOo.OooO0o0(task, "task");
        flutterFirebaseAnalyticsPlugin.handleVoidTaskResult(task, oooo000);
    }

    @Override // io.flutter.plugins.firebase.core.FlutterFirebasePlugin
    public Task<Void> didReinitializeFirebaseCore() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new OooO(taskCompletionSource, 1));
        Task<Void> task = taskCompletionSource.getTask();
        kotlin.jvm.internal.OooOo.OooO0Oo(task, "getTask(...)");
        return task;
    }

    @Override // io.flutter.plugins.firebase.analytics.FirebaseAnalyticsHostApi
    public void getAppInstanceId(Oooo000 callback) {
        kotlin.jvm.internal.OooOo.OooO0o0(callback, "callback");
        handleGetAppInstanceId().addOnCompleteListener(new OooO0OO(this, callback, 9));
    }

    @Override // io.flutter.plugins.firebase.core.FlutterFirebasePlugin
    public Task<Map<String, Object>> getPluginConstantsForFirebaseApp(Oooo0 oooo0) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new OooO(taskCompletionSource, 0));
        Task<Map<String, Object>> task = taskCompletionSource.getTask();
        kotlin.jvm.internal.OooOo.OooO0Oo(task, "getTask(...)");
        return task;
    }

    @Override // io.flutter.plugins.firebase.analytics.FirebaseAnalyticsHostApi
    public void getSessionId(Oooo000 callback) {
        kotlin.jvm.internal.OooOo.OooO0o0(callback, "callback");
        handleGetSessionId().addOnCompleteListener(new OooO0OO(this, callback, 4));
    }

    @Override // io.flutter.plugins.firebase.analytics.FirebaseAnalyticsHostApi
    public void initiateOnDeviceConversionMeasurement(Map<String, String> arguments, Oooo000 callback) {
        kotlin.jvm.internal.OooOo.OooO0o0(arguments, "arguments");
        kotlin.jvm.internal.OooOo.OooO0o0(callback, "callback");
        AbstractC2183w4.OooOOoo(o000OOo.OooO0O0(new FlutterError("unimplemented", "initiateOnDeviceConversionMeasurement is only available on iOS.", null)), callback);
    }

    @Override // io.flutter.plugins.firebase.analytics.FirebaseAnalyticsHostApi
    public void logEvent(Map<String, ? extends Object> event, Oooo000 callback) {
        kotlin.jvm.internal.OooOo.OooO0o0(event, "event");
        kotlin.jvm.internal.OooOo.OooO0o0(callback, "callback");
        handleLogEvent(event).addOnCompleteListener(new OooO0OO(this, callback, 3));
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.OooOo.OooO0o0(binding, "binding");
        BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        kotlin.jvm.internal.OooOo.OooO0Oo(binaryMessenger, "getBinaryMessenger(...)");
        Context applicationContext = binding.getApplicationContext();
        kotlin.jvm.internal.OooOo.OooO0Oo(applicationContext, "getApplicationContext(...)");
        initInstance(binaryMessenger, applicationContext);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.OooOo.OooO0o0(binding, "binding");
        MethodChannel methodChannel = this.channel;
        if (methodChannel != null) {
            methodChannel.setMethodCallHandler(null);
        }
        BinaryMessenger binaryMessenger = this.messenger;
        if (binaryMessenger == null) {
            throw new IllegalStateException("Required value was null.");
        }
        FirebaseAnalyticsHostApi.Companion companion = FirebaseAnalyticsHostApi.Companion;
        kotlin.jvm.internal.OooOo.OooO0O0(binaryMessenger);
        FirebaseAnalyticsHostApi.Companion.setUp$default(companion, binaryMessenger, null, null, 4, null);
        this.channel = null;
        this.messenger = null;
    }

    @Override // io.flutter.plugins.firebase.analytics.FirebaseAnalyticsHostApi
    public void resetAnalyticsData(Oooo000 callback) {
        kotlin.jvm.internal.OooOo.OooO0o0(callback, "callback");
        handleResetAnalyticsData().addOnCompleteListener(new OooO0OO(this, callback, 2));
    }

    @Override // io.flutter.plugins.firebase.analytics.FirebaseAnalyticsHostApi
    public void setAnalyticsCollectionEnabled(boolean z, Oooo000 callback) {
        kotlin.jvm.internal.OooOo.OooO0o0(callback, "callback");
        handleSetAnalyticsCollectionEnabled(z).addOnCompleteListener(new OooO0OO(this, callback, 6));
    }

    @Override // io.flutter.plugins.firebase.analytics.FirebaseAnalyticsHostApi
    public void setConsent(Map<String, Boolean> consent, Oooo000 callback) {
        kotlin.jvm.internal.OooOo.OooO0o0(consent, "consent");
        kotlin.jvm.internal.OooOo.OooO0o0(callback, "callback");
        handleSetConsent(consent).addOnCompleteListener(new OooO0OO(this, callback, 0));
    }

    @Override // io.flutter.plugins.firebase.analytics.FirebaseAnalyticsHostApi
    public void setDefaultEventParameters(Map<String, ? extends Object> map, Oooo000 callback) {
        kotlin.jvm.internal.OooOo.OooO0o0(callback, "callback");
        handleSetDefaultEventParameters(map).addOnCompleteListener(new OooO0OO(this, callback, 1));
    }

    @Override // io.flutter.plugins.firebase.analytics.FirebaseAnalyticsHostApi
    public void setSessionTimeoutDuration(long j, Oooo000 callback) {
        kotlin.jvm.internal.OooOo.OooO0o0(callback, "callback");
        handleSetSessionTimeoutDuration(j).addOnCompleteListener(new OooO0OO(this, callback, 8));
    }

    @Override // io.flutter.plugins.firebase.analytics.FirebaseAnalyticsHostApi
    public void setUserId(String str, Oooo000 callback) {
        kotlin.jvm.internal.OooOo.OooO0o0(callback, "callback");
        handleSetUserId(str).addOnCompleteListener(new OooO0OO(this, callback, 7));
    }

    @Override // io.flutter.plugins.firebase.analytics.FirebaseAnalyticsHostApi
    public void setUserProperty(String name, String str, Oooo000 callback) {
        kotlin.jvm.internal.OooOo.OooO0o0(name, "name");
        kotlin.jvm.internal.OooOo.OooO0o0(callback, "callback");
        handleSetUserProperty(name, str).addOnCompleteListener(new OooO0OO(this, callback, 5));
    }
}
