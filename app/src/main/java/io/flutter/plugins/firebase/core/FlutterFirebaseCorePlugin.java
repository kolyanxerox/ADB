package io.flutter.plugins.firebase.core;

import OooO0oo.o00Oo0;
import Oooo00O.o000000O;
import android.content.Context;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.ironsource.o0000O0O;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugins.firebase.core.GeneratedAndroidFirebaseCore;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import o0000o0.Oooo0;
import o0000o0.o0OoOo0;

/* loaded from: classes3.dex */
public class FlutterFirebaseCorePlugin implements FlutterPlugin, GeneratedAndroidFirebaseCore.FirebaseCoreHostApi, GeneratedAndroidFirebaseCore.FirebaseAppHostApi {
    public static Map<String, String> customAuthDomain = new HashMap();
    private Context applicationContext;
    private boolean coreInitialized = false;

    private Task<GeneratedAndroidFirebaseCore.CoreInitializeResponse> firebaseAppToMap(Oooo0 oooo0) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new o0000O0O(this, oooo0, taskCompletionSource, 5));
        return taskCompletionSource.getTask();
    }

    private GeneratedAndroidFirebaseCore.CoreFirebaseOptions firebaseOptionsToMap(o0OoOo0 o0oooo0) {
        GeneratedAndroidFirebaseCore.CoreFirebaseOptions.Builder builder = new GeneratedAndroidFirebaseCore.CoreFirebaseOptions.Builder();
        builder.setApiKey(o0oooo0.f29604OooO00o);
        builder.setAppId(o0oooo0.f29605OooO0O0);
        String str = o0oooo0.f29609OooO0o0;
        if (str != null) {
            builder.setMessagingSenderId(str);
        }
        String str2 = o0oooo0.f29610OooO0oO;
        if (str2 != null) {
            builder.setProjectId(str2);
        }
        builder.setDatabaseURL(o0oooo0.f29606OooO0OO);
        builder.setStorageBucket(o0oooo0.f29608OooO0o);
        builder.setTrackingId(o0oooo0.f29607OooO0Oo);
        return builder.build();
    }

    public static /* synthetic */ void lambda$delete$8(String str, TaskCompletionSource taskCompletionSource) {
        try {
            try {
                Oooo0.OooO0o0(str).OooO0O0();
            } catch (IllegalStateException unused) {
            }
            taskCompletionSource.setResult(null);
        } catch (Exception e) {
            taskCompletionSource.setException(e);
        }
    }

    public void lambda$firebaseAppToMap$0(Oooo0 oooo0, TaskCompletionSource taskCompletionSource) {
        try {
            GeneratedAndroidFirebaseCore.CoreInitializeResponse.Builder builder = new GeneratedAndroidFirebaseCore.CoreInitializeResponse.Builder();
            oooo0.OooO00o();
            builder.setName(oooo0.f29589OooO0O0);
            oooo0.OooO00o();
            builder.setOptions(firebaseOptionsToMap(oooo0.f29590OooO0OO));
            builder.setIsAutomaticDataCollectionEnabled(Boolean.valueOf(oooo0.OooOO0()));
            builder.setPluginConstants((Map) Tasks.await(FlutterFirebasePluginRegistry.getPluginConstantsForFirebaseApp(oooo0)));
            taskCompletionSource.setResult(builder.build());
        } catch (Exception e) {
            taskCompletionSource.setException(e);
        }
    }

    public void lambda$initializeApp$3(GeneratedAndroidFirebaseCore.CoreFirebaseOptions coreFirebaseOptions, String str, TaskCompletionSource taskCompletionSource) {
        try {
            String apiKey = coreFirebaseOptions.getApiKey();
            o000000O.OooO0o(apiKey, "ApiKey must be set.");
            String appId = coreFirebaseOptions.getAppId();
            o000000O.OooO0o(appId, "ApplicationId must be set.");
            String databaseURL = coreFirebaseOptions.getDatabaseURL();
            String messagingSenderId = coreFirebaseOptions.getMessagingSenderId();
            String projectId = coreFirebaseOptions.getProjectId();
            o0OoOo0 o0oooo0 = new o0OoOo0(appId, apiKey, databaseURL, coreFirebaseOptions.getTrackingId(), messagingSenderId, coreFirebaseOptions.getStorageBucket(), projectId);
            try {
                Looper.prepare();
            } catch (Exception unused) {
            }
            if (coreFirebaseOptions.getAuthDomain() != null) {
                customAuthDomain.put(str, coreFirebaseOptions.getAuthDomain());
            }
            taskCompletionSource.setResult((GeneratedAndroidFirebaseCore.CoreInitializeResponse) Tasks.await(firebaseAppToMap(Oooo0.OooO(this.applicationContext, str, o0oooo0))));
        } catch (Exception e) {
            taskCompletionSource.setException(e);
        }
    }

    public void lambda$initializeCore$4(TaskCompletionSource taskCompletionSource) {
        ArrayList arrayList;
        try {
            if (this.coreInitialized) {
                Tasks.await(FlutterFirebasePluginRegistry.didReinitializeFirebaseCore());
            } else {
                this.coreInitialized = true;
            }
            synchronized (Oooo0.f29586OooOO0O) {
                arrayList = new ArrayList(Oooo0.OooOO0o.values());
            }
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                arrayList2.add((GeneratedAndroidFirebaseCore.CoreInitializeResponse) Tasks.await(firebaseAppToMap((Oooo0) obj)));
            }
            taskCompletionSource.setResult(arrayList2);
        } catch (Exception e) {
            taskCompletionSource.setException(e);
        }
    }

    public static /* synthetic */ void lambda$listenToResponse$1(GeneratedAndroidFirebaseCore.Result result, Task task) {
        if (task.isSuccessful()) {
            result.success(task.getResult());
        } else {
            result.error(task.getException());
        }
    }

    public static /* synthetic */ void lambda$listenToVoidResponse$2(GeneratedAndroidFirebaseCore.VoidResult voidResult, Task task) {
        if (task.isSuccessful()) {
            voidResult.success();
        } else {
            voidResult.error(task.getException());
        }
    }

    public /* synthetic */ void lambda$optionsFromResource$5(TaskCompletionSource taskCompletionSource) {
        try {
            o0OoOo0 o0oooo0OooO00o = o0OoOo0.OooO00o(this.applicationContext);
            if (o0oooo0OooO00o == null) {
                taskCompletionSource.setException(new Exception("Failed to load FirebaseOptions from resource. Check that you have defined values.xml correctly."));
            } else {
                taskCompletionSource.setResult(firebaseOptionsToMap(o0oooo0OooO00o));
            }
        } catch (Exception e) {
            taskCompletionSource.setException(e);
        }
    }

    public static /* synthetic */ void lambda$setAutomaticDataCollectionEnabled$6(String str, Boolean bool, TaskCompletionSource taskCompletionSource) {
        try {
            Oooo0.OooO0o0(str).OooOO0o(bool);
            taskCompletionSource.setResult(null);
        } catch (Exception e) {
            taskCompletionSource.setException(e);
        }
    }

    public static void lambda$setAutomaticResourceManagementEnabled$7(String str, Boolean bool, TaskCompletionSource taskCompletionSource) {
        try {
            Oooo0 oooo0OooO0o0 = Oooo0.OooO0o0(str);
            boolean zBooleanValue = bool.booleanValue();
            oooo0OooO0o0.OooO00o();
            if (oooo0OooO0o0.f29593OooO0o0.compareAndSet(!zBooleanValue, zBooleanValue)) {
                boolean z = com.google.android.gms.common.api.internal.OooO0OO.f16689OooOoO.f16691OooOo0O.get();
                if (zBooleanValue && z) {
                    oooo0OooO0o0.OooOO0O(true);
                } else if (!zBooleanValue && z) {
                    oooo0OooO0o0.OooOO0O(false);
                }
            }
            taskCompletionSource.setResult(null);
        } catch (Exception e) {
            taskCompletionSource.setException(e);
        }
    }

    private <T> void listenToResponse(TaskCompletionSource<T> taskCompletionSource, GeneratedAndroidFirebaseCore.Result<T> result) {
        taskCompletionSource.getTask().addOnCompleteListener(new o00Oo0(result, 17));
    }

    private void listenToVoidResponse(TaskCompletionSource<Void> taskCompletionSource, GeneratedAndroidFirebaseCore.VoidResult voidResult) {
        taskCompletionSource.getTask().addOnCompleteListener(new o00Oo0(voidResult, 16));
    }

    @Override // io.flutter.plugins.firebase.core.GeneratedAndroidFirebaseCore.FirebaseAppHostApi
    public void delete(@NonNull String str, GeneratedAndroidFirebaseCore.VoidResult voidResult) {
        TaskCompletionSource<Void> taskCompletionSource = new TaskCompletionSource<>();
        FlutterFirebasePlugin.cachedThreadPool.execute(new OooO0Oo.OooO0O0(26, str, taskCompletionSource));
        listenToVoidResponse(taskCompletionSource, voidResult);
    }

    @Override // io.flutter.plugins.firebase.core.GeneratedAndroidFirebaseCore.FirebaseCoreHostApi
    public void initializeApp(@NonNull String str, @NonNull GeneratedAndroidFirebaseCore.CoreFirebaseOptions coreFirebaseOptions, GeneratedAndroidFirebaseCore.Result<GeneratedAndroidFirebaseCore.CoreInitializeResponse> result) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new OooOo0O.OooO0O0(this, coreFirebaseOptions, str, taskCompletionSource, 15));
        listenToResponse(taskCompletionSource, result);
    }

    @Override // io.flutter.plugins.firebase.core.GeneratedAndroidFirebaseCore.FirebaseCoreHostApi
    public void initializeCore(GeneratedAndroidFirebaseCore.Result<List<GeneratedAndroidFirebaseCore.CoreInitializeResponse>> result) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new OooO0O0(this, taskCompletionSource, 1));
        listenToResponse(taskCompletionSource, result);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        GeneratedAndroidFirebaseCore.FirebaseCoreHostApi.setUp(flutterPluginBinding.getBinaryMessenger(), this);
        GeneratedAndroidFirebaseCore.FirebaseAppHostApi.setUp(flutterPluginBinding.getBinaryMessenger(), this);
        this.applicationContext = flutterPluginBinding.getApplicationContext();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(@NonNull FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.applicationContext = null;
        GeneratedAndroidFirebaseCore.FirebaseCoreHostApi.setUp(flutterPluginBinding.getBinaryMessenger(), null);
        GeneratedAndroidFirebaseCore.FirebaseAppHostApi.setUp(flutterPluginBinding.getBinaryMessenger(), null);
    }

    @Override // io.flutter.plugins.firebase.core.GeneratedAndroidFirebaseCore.FirebaseCoreHostApi
    public void optionsFromResource(GeneratedAndroidFirebaseCore.Result<GeneratedAndroidFirebaseCore.CoreFirebaseOptions> result) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new OooO0O0(this, taskCompletionSource, 0));
        listenToResponse(taskCompletionSource, result);
    }

    @Override // io.flutter.plugins.firebase.core.GeneratedAndroidFirebaseCore.FirebaseAppHostApi
    public void setAutomaticDataCollectionEnabled(@NonNull String str, @NonNull Boolean bool, GeneratedAndroidFirebaseCore.VoidResult voidResult) {
        TaskCompletionSource<Void> taskCompletionSource = new TaskCompletionSource<>();
        FlutterFirebasePlugin.cachedThreadPool.execute(new OooO00o(str, bool, taskCompletionSource, 1));
        listenToVoidResponse(taskCompletionSource, voidResult);
    }

    @Override // io.flutter.plugins.firebase.core.GeneratedAndroidFirebaseCore.FirebaseAppHostApi
    public void setAutomaticResourceManagementEnabled(@NonNull String str, @NonNull Boolean bool, GeneratedAndroidFirebaseCore.VoidResult voidResult) {
        TaskCompletionSource<Void> taskCompletionSource = new TaskCompletionSource<>();
        FlutterFirebasePlugin.cachedThreadPool.execute(new OooO00o(str, bool, taskCompletionSource, 0));
        listenToVoidResponse(taskCompletionSource, voidResult);
    }
}
