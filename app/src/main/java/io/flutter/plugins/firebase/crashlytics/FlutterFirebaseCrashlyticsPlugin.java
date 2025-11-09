package io.flutter.plugins.firebase.crashlytics;

import OooOo0o.OooO;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.ironsource.o0000O0O;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import io.flutter.plugins.webviewflutter.OooOOOO;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import o0000o0.Oooo0;
import o000Ooo.o000000;
import o000Ooo.o0O0O00;
import o000Ooo.o0OO00O;
import o000Ooo.o0OOO0o;
import o000Ooo.oo0o0Oo;
import o00OoO00.OooOOO0;

/* loaded from: classes3.dex */
public class FlutterFirebaseCrashlyticsPlugin implements FlutterFirebasePlugin, FlutterPlugin, MethodChannel.MethodCallHandler {
    private static final String FIREBASE_CRASHLYTICS_COLLECTION_ENABLED = "firebase_crashlytics_collection_enabled";
    public static final String TAG = "FLTFirebaseCrashlytics";
    private MethodChannel channel;

    /* renamed from: io.flutter.plugins.firebase.crashlytics.FlutterFirebaseCrashlyticsPlugin$1 */
    public class C44541 extends HashMap<String, Object> {
        final /* synthetic */ boolean val$unsentReports;

        public C44541(boolean z) {
            this.val$unsentReports = z;
            put(Constants.UNSENT_REPORTS, Boolean.valueOf(z));
        }
    }

    /* renamed from: io.flutter.plugins.firebase.crashlytics.FlutterFirebaseCrashlyticsPlugin$2 */
    public class C44552 extends HashMap<String, Object> {
        final /* synthetic */ boolean val$didCrashOnPreviousExecution;

        public C44552(boolean z) {
            this.val$didCrashOnPreviousExecution = z;
            put(Constants.DID_CRASH_ON_PREVIOUS_EXECUTION, Boolean.valueOf(z));
        }
    }

    /* renamed from: io.flutter.plugins.firebase.crashlytics.FlutterFirebaseCrashlyticsPlugin$3 */
    public class C44563 extends HashMap<String, Object> {
        public C44563() {
            put(Constants.IS_CRASHLYTICS_COLLECTION_ENABLED, Boolean.valueOf(FlutterFirebaseCrashlyticsPlugin.this.isCrashlyticsCollectionEnabled(Oooo0.OooO0Oo())));
        }
    }

    /* renamed from: io.flutter.plugins.firebase.crashlytics.FlutterFirebaseCrashlyticsPlugin$4 */
    public class C44574 extends HashMap<String, Object> {
        final /* synthetic */ Oooo0 val$firebaseApp;

        public C44574(Oooo0 oooo0) {
            this.val$firebaseApp = oooo0;
            oooo0.OooO00o();
            if (oooo0.f29589OooO0O0.equals("[DEFAULT]")) {
                put(Constants.IS_CRASHLYTICS_COLLECTION_ENABLED, Boolean.valueOf(FlutterFirebaseCrashlyticsPlugin.this.isCrashlyticsCollectionEnabled(Oooo0.OooO0Oo())));
            }
        }
    }

    private Task<Map<String, Object>> checkForUnsentReports() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new OooO0OO(this, taskCompletionSource, 0));
        return taskCompletionSource.getTask();
    }

    private void crash() {
        new Handler(Looper.myLooper()).postDelayed(new OooO(3), 50L);
    }

    private Task<Void> deleteUnsentReports() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new io.flutter.plugins.firebase.analytics.OooO(taskCompletionSource, 3));
        return taskCompletionSource.getTask();
    }

    private Task<Map<String, Object>> didCrashOnPreviousExecution() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new OooO0OO(this, taskCompletionSource, 1));
        return taskCompletionSource.getTask();
    }

    private StackTraceElement generateStackTraceElement(Map<String, String> map) {
        try {
            String str = map.get("file");
            String str2 = map.get(Constants.LINE);
            String str3 = map.get(Constants.CLASS);
            String str4 = map.get("method");
            if (str3 == null) {
                str3 = "";
            }
            Objects.requireNonNull(str2);
            return new StackTraceElement(str3, str4, str, Integer.parseInt(str2));
        } catch (Exception unused) {
            Log.e(TAG, "Unable to generate stack trace element from Dart error.");
            return null;
        }
    }

    private SharedPreferences getCrashlyticsSharedPrefs(Context context) {
        return context.getSharedPreferences("com.google.firebase.crashlytics", 0);
    }

    private void initInstance(BinaryMessenger binaryMessenger) {
        MethodChannel methodChannel = new MethodChannel(binaryMessenger, "plugins.flutter.io/firebase_crashlytics");
        this.channel = methodChannel;
        methodChannel.setMethodCallHandler(this);
        FlutterFirebasePluginRegistry.registerPlugin("plugins.flutter.io/firebase_crashlytics", this);
    }

    public boolean isCrashlyticsCollectionEnabled(Oooo0 oooo0) {
        oooo0.OooO00o();
        Context context = oooo0.f29588OooO00o;
        SharedPreferences crashlyticsSharedPrefs = getCrashlyticsSharedPrefs(context);
        if (crashlyticsSharedPrefs.contains(FIREBASE_CRASHLYTICS_COLLECTION_ENABLED)) {
            return crashlyticsSharedPrefs.getBoolean(FIREBASE_CRASHLYTICS_COLLECTION_ENABLED, true);
        }
        oooo0.OooO00o();
        Boolean crashlyticsDataCollectionEnabledFromManifest = readCrashlyticsDataCollectionEnabledFromManifest(context);
        o000.OooO0OO.OooO00o().OooO0O0(crashlyticsDataCollectionEnabledFromManifest);
        return crashlyticsDataCollectionEnabledFromManifest.booleanValue();
    }

    public void lambda$checkForUnsentReports$0(TaskCompletionSource taskCompletionSource) {
        Task task;
        try {
            o0OOO0o o0ooo0o = o000.OooO0OO.OooO00o().f28892OooO00o.f30440OooO0oo;
            if (o0ooo0o.f30514OooOOoo.compareAndSet(false, true)) {
                task = o0ooo0o.f30511OooOOOo.getTask();
            } else {
                Log.w("FirebaseCrashlytics", "checkForUnsentReports should only be called once per execution.", null);
                task = Tasks.forResult(Boolean.FALSE);
            }
            taskCompletionSource.setResult(new HashMap<String, Object>(((Boolean) Tasks.await(task)).booleanValue()) { // from class: io.flutter.plugins.firebase.crashlytics.FlutterFirebaseCrashlyticsPlugin.1
                final /* synthetic */ boolean val$unsentReports;

                public C44541(boolean z) {
                    this.val$unsentReports = z;
                    put(Constants.UNSENT_REPORTS, Boolean.valueOf(z));
                }
            });
        } catch (Exception e) {
            taskCompletionSource.setException(e);
        }
    }

    public static /* synthetic */ void lambda$crash$1() {
        throw new FirebaseCrashlyticsTestCrash();
    }

    public static void lambda$deleteUnsentReports$2(TaskCompletionSource taskCompletionSource) {
        try {
            o0OOO0o o0ooo0o = o000.OooO0OO.OooO00o().f28892OooO00o.f30440OooO0oo;
            o0ooo0o.f30513OooOOo0.trySetResult(Boolean.FALSE);
            o0ooo0o.f30512OooOOo.getTask();
            taskCompletionSource.setResult(null);
        } catch (Exception e) {
            taskCompletionSource.setException(e);
        }
    }

    public void lambda$didCrashOnPreviousExecution$3(TaskCompletionSource taskCompletionSource) {
        try {
            taskCompletionSource.setResult(new HashMap<String, Object>(o000.OooO0OO.OooO00o().f28892OooO00o.f30439OooO0oO) { // from class: io.flutter.plugins.firebase.crashlytics.FlutterFirebaseCrashlyticsPlugin.2
                final /* synthetic */ boolean val$didCrashOnPreviousExecution;

                public C44552(boolean z) {
                    this.val$didCrashOnPreviousExecution = z;
                    put(Constants.DID_CRASH_ON_PREVIOUS_EXECUTION, Boolean.valueOf(z));
                }
            });
        } catch (Exception e) {
            taskCompletionSource.setException(e);
        }
    }

    public static /* synthetic */ void lambda$didReinitializeFirebaseCore$12(TaskCompletionSource taskCompletionSource) {
        try {
            taskCompletionSource.setResult(null);
        } catch (Exception e) {
            taskCompletionSource.setException(e);
        }
    }

    public /* synthetic */ void lambda$getPluginConstantsForFirebaseApp$11(TaskCompletionSource taskCompletionSource, Oooo0 oooo0) {
        try {
            taskCompletionSource.setResult(new HashMap<String, Object>(oooo0) { // from class: io.flutter.plugins.firebase.crashlytics.FlutterFirebaseCrashlyticsPlugin.4
                final /* synthetic */ Oooo0 val$firebaseApp;

                public C44574(Oooo0 oooo02) {
                    this.val$firebaseApp = oooo02;
                    oooo02.OooO00o();
                    if (oooo02.f29589OooO0O0.equals("[DEFAULT]")) {
                        put(Constants.IS_CRASHLYTICS_COLLECTION_ENABLED, Boolean.valueOf(FlutterFirebaseCrashlyticsPlugin.this.isCrashlyticsCollectionEnabled(Oooo0.OooO0Oo())));
                    }
                }
            });
        } catch (Exception e) {
            taskCompletionSource.setException(e);
        }
    }

    public static void lambda$log$5(Map map, TaskCompletionSource taskCompletionSource) {
        try {
            Object obj = map.get(Constants.MESSAGE);
            Objects.requireNonNull(obj);
            o000000 o000000Var = o000.OooO0OO.OooO00o().f28892OooO00o;
            long jCurrentTimeMillis = System.currentTimeMillis() - o000000Var.f30436OooO0Oo;
            o000000Var.f30446OooOOOo.f30099OooO00o.OooO00o(new o0OO00O(o000000Var, jCurrentTimeMillis, (String) obj, 1));
            taskCompletionSource.setResult(null);
        } catch (Exception e) {
            taskCompletionSource.setException(e);
        }
    }

    public static /* synthetic */ void lambda$onMethodCall$10(MethodChannel.Result result, Task task) {
        if (task.isSuccessful()) {
            result.success(task.getResult());
        } else {
            Exception exception = task.getException();
            result.error("firebase_crashlytics", exception != null ? exception.getMessage() : "An unknown error occurred", null);
        }
    }

    public void lambda$recordError$4(Map map, TaskCompletionSource taskCompletionSource) {
        FlutterError flutterError;
        o000000 o000000Var;
        try {
            o000.OooO0OO oooO0OOOooO00o = o000.OooO0OO.OooO00o();
            Object obj = map.get(Constants.EXCEPTION);
            Objects.requireNonNull(obj);
            String str = (String) obj;
            String str2 = (String) map.get("reason");
            Object obj2 = map.get(Constants.INFORMATION);
            Objects.requireNonNull(obj2);
            String str3 = (String) obj2;
            Object obj3 = map.get(Constants.FATAL);
            Objects.requireNonNull(obj3);
            boolean zBooleanValue = ((Boolean) obj3).booleanValue();
            Object obj4 = map.get(Constants.BUILD_ID);
            Objects.requireNonNull(obj4);
            String str4 = (String) obj4;
            Object obj5 = map.get(Constants.LOADING_UNITS);
            Objects.requireNonNull(obj5);
            List<String> list = (List) obj5;
            if (str4.length() > 0) {
                o000000 o000000Var2 = o000.OooO0OO.OooO00o().f28892OooO00o;
                o000000Var2.f30446OooOOOo.f30099OooO00o.OooO00o(new o0O0O00(o000000Var2, "com.crashlytics.flutter.build-id.0", str4, 1));
            }
            int i = 0;
            for (String str5 : list) {
                i++;
                o000000 o000000Var3 = o000.OooO0OO.OooO00o().f28892OooO00o;
                o000000Var3.f30446OooOOOo.f30099OooO00o.OooO00o(new o0O0O00(o000000Var3, "com.crashlytics.flutter.build-id." + i, str5, 1));
            }
            o000000 o000000Var4 = oooO0OOOooO00o.f28892OooO00o;
            if (str2 != null) {
                o000000Var4.f30446OooOOOo.f30099OooO00o.OooO00o(new o0O0O00(o000000Var4, Constants.FLUTTER_ERROR_REASON, "thrown " + str2, 0));
                flutterError = new FlutterError(str + ". Error thrown " + str2 + ".");
            } else {
                flutterError = new FlutterError(str);
            }
            FlutterError flutterError2 = flutterError;
            o000000Var4.f30446OooOOOo.f30099OooO00o.OooO00o(new o0O0O00(o000000Var4, Constants.FLUTTER_ERROR_EXCEPTION, str, 0));
            ArrayList arrayList = new ArrayList();
            Object obj6 = map.get(Constants.STACK_TRACE_ELEMENTS);
            Objects.requireNonNull(obj6);
            Iterator it = ((List) obj6).iterator();
            while (it.hasNext()) {
                try {
                    StackTraceElement stackTraceElementGenerateStackTraceElement = generateStackTraceElement((Map) it.next());
                    if (stackTraceElementGenerateStackTraceElement != null) {
                        arrayList.add(stackTraceElementGenerateStackTraceElement);
                    }
                } catch (Exception e) {
                    e = e;
                    taskCompletionSource.setException(e);
                    return;
                }
            }
            flutterError2.setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
            if (str3.isEmpty()) {
                o000000Var = o000000Var4;
            } else {
                o000000Var = o000000Var4;
                o000000Var4.f30446OooOOOo.f30099OooO00o.OooO00o(new o0OO00O(o000000Var, System.currentTimeMillis() - o000000Var4.f30436OooO0Oo, str3, 1));
            }
            if (zBooleanValue) {
                OooOOO0.OooO0oO(flutterError2);
            } else {
                Map map2 = Collections.EMPTY_MAP;
                o000000Var.f30446OooOOOo.f30099OooO00o.OooO00o(new oo0o0Oo(o000000Var, flutterError2, 1));
            }
            taskCompletionSource.setResult(null);
        } catch (Exception e2) {
            e = e2;
        }
    }

    public static void lambda$sendUnsentReports$6(TaskCompletionSource taskCompletionSource) {
        try {
            o0OOO0o o0ooo0o = o000.OooO0OO.OooO00o().f28892OooO00o.f30440OooO0oo;
            o0ooo0o.f30513OooOOo0.trySetResult(Boolean.TRUE);
            o0ooo0o.f30512OooOOo.getTask();
            taskCompletionSource.setResult(null);
        } catch (Exception e) {
            taskCompletionSource.setException(e);
        }
    }

    public /* synthetic */ void lambda$setCrashlyticsCollectionEnabled$7(Map map, TaskCompletionSource taskCompletionSource) {
        try {
            Object obj = map.get("enabled");
            Objects.requireNonNull(obj);
            o000.OooO0OO.OooO00o().OooO0O0((Boolean) obj);
            taskCompletionSource.setResult(new HashMap<String, Object>() { // from class: io.flutter.plugins.firebase.crashlytics.FlutterFirebaseCrashlyticsPlugin.3
                public C44563() {
                    put(Constants.IS_CRASHLYTICS_COLLECTION_ENABLED, Boolean.valueOf(FlutterFirebaseCrashlyticsPlugin.this.isCrashlyticsCollectionEnabled(Oooo0.OooO0Oo())));
                }
            });
        } catch (Exception e) {
            taskCompletionSource.setException(e);
        }
    }

    public static void lambda$setCustomKey$9(Map map, TaskCompletionSource taskCompletionSource) {
        try {
            Object obj = map.get("key");
            Objects.requireNonNull(obj);
            Object obj2 = map.get("value");
            Objects.requireNonNull(obj2);
            o000000 o000000Var = o000.OooO0OO.OooO00o().f28892OooO00o;
            o000000Var.f30446OooOOOo.f30099OooO00o.OooO00o(new o0O0O00(o000000Var, (String) obj, (String) obj2, 0));
            taskCompletionSource.setResult(null);
        } catch (Exception e) {
            taskCompletionSource.setException(e);
        }
    }

    public static void lambda$setUserIdentifier$8(Map map, TaskCompletionSource taskCompletionSource) {
        try {
            Object obj = map.get(Constants.IDENTIFIER);
            Objects.requireNonNull(obj);
            o000000 o000000Var = o000.OooO0OO.OooO00o().f28892OooO00o;
            o000000Var.f30446OooOOOo.f30099OooO00o.OooO00o(new OooOOOO(9, o000000Var, (String) obj));
            taskCompletionSource.setResult(null);
        } catch (Exception e) {
            taskCompletionSource.setException(e);
        }
    }

    private Task<Void> log(Map<String, Object> map) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new OooO0O0(map, taskCompletionSource, 0));
        return taskCompletionSource.getTask();
    }

    private static Boolean readCrashlyticsDataCollectionEnabledFromManifest(Context context) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey(FIREBASE_CRASHLYTICS_COLLECTION_ENABLED)) {
                return Boolean.valueOf(applicationInfo.metaData.getBoolean(FIREBASE_CRASHLYTICS_COLLECTION_ENABLED));
            }
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("FirebaseCrashlytics", "Could not read data collection permission from manifest", e);
        }
        return Boolean.TRUE;
    }

    private Task<Void> recordError(Map<String, Object> map) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new OooO00o(this, map, taskCompletionSource, 0));
        return taskCompletionSource.getTask();
    }

    private Task<Void> sendUnsentReports() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new io.flutter.plugins.firebase.analytics.OooO(taskCompletionSource, 4));
        return taskCompletionSource.getTask();
    }

    private Task<Map<String, Object>> setCrashlyticsCollectionEnabled(Map<String, Object> map) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new OooO00o(this, map, taskCompletionSource, 1));
        return taskCompletionSource.getTask();
    }

    private Task<Void> setCustomKey(Map<String, Object> map) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new OooO0O0(map, taskCompletionSource, 2));
        return taskCompletionSource.getTask();
    }

    private Task<Void> setUserIdentifier(Map<String, Object> map) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new OooO0O0(map, taskCompletionSource, 1));
        return taskCompletionSource.getTask();
    }

    @Override // io.flutter.plugins.firebase.core.FlutterFirebasePlugin
    public Task<Void> didReinitializeFirebaseCore() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new io.flutter.plugins.firebase.analytics.OooO(taskCompletionSource, 5));
        return taskCompletionSource.getTask();
    }

    @Override // io.flutter.plugins.firebase.core.FlutterFirebasePlugin
    public Task<Map<String, Object>> getPluginConstantsForFirebaseApp(Oooo0 oooo0) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new o0000O0O(this, taskCompletionSource, oooo0, 6));
        return taskCompletionSource.getTask();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        initInstance(flutterPluginBinding.getBinaryMessenger());
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(@NonNull FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        MethodChannel methodChannel = this.channel;
        if (methodChannel != null) {
            methodChannel.setMethodCallHandler(null);
            this.channel = null;
        }
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall methodCall, @NonNull MethodChannel.Result result) {
        Task taskDidCrashOnPreviousExecution;
        String str = methodCall.method;
        str.getClass();
        switch (str) {
            case "Crashlytics#didCrashOnPreviousExecution":
                taskDidCrashOnPreviousExecution = didCrashOnPreviousExecution();
                break;
            case "Crashlytics#recordError":
                taskDidCrashOnPreviousExecution = recordError((Map) methodCall.arguments());
                break;
            case "Crashlytics#checkForUnsentReports":
                taskDidCrashOnPreviousExecution = checkForUnsentReports();
                break;
            case "Crashlytics#sendUnsentReports":
                taskDidCrashOnPreviousExecution = sendUnsentReports();
                break;
            case "Crashlytics#setCrashlyticsCollectionEnabled":
                taskDidCrashOnPreviousExecution = setCrashlyticsCollectionEnabled((Map) methodCall.arguments());
                break;
            case "Crashlytics#log":
                taskDidCrashOnPreviousExecution = log((Map) methodCall.arguments());
                break;
            case "Crashlytics#setCustomKey":
                taskDidCrashOnPreviousExecution = setCustomKey((Map) methodCall.arguments());
                break;
            case "Crashlytics#deleteUnsentReports":
                taskDidCrashOnPreviousExecution = deleteUnsentReports();
                break;
            case "Crashlytics#setUserIdentifier":
                taskDidCrashOnPreviousExecution = setUserIdentifier((Map) methodCall.arguments());
                break;
            case "Crashlytics#crash":
                crash();
                return;
            default:
                result.notImplemented();
                return;
        }
        taskDidCrashOnPreviousExecution.addOnCompleteListener(new OooO.OooO00o(result));
    }
}
