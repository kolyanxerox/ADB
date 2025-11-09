package io.flutter.plugins.firebase.firebaseremoteconfig;

import OooOo.OooO;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.internal.ads.AbstractC2183w4;
import com.google.android.gms.internal.ads.y91;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.ironsource.o0000O0O;
import com.unity3d.services.core.p012di.ServiceProvider;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.EventChannel;
import io.flutter.plugins.firebase.analytics.Constants;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import io.flutter.plugins.firebase.firebaseremoteconfig.FirebaseRemoteConfigHostApi;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.OooOO0O;
import kotlin.jvm.internal.OooOo;
import o0000o0.Oooo0;
import o0000ooO.o0O0O0o0;
import o000OooO.OooOo00;
import o000OooO.Oooo000;
import o000OooO.o000oOoO;
import o000OooO.o00O0O;
import o000OooO.o00Oo0;
import o000OooO.o00Ooo;
import o000OooO.o00oO0o;
import o000OooO.o0OO00O;
import o000OooO.o0OoOo0;
import o000OooO.o0ooOOo;
import o000OooO.oo000o;
import o000Oooo.o00000O;
import o000Oooo.o00000OO;
import o000Oooo.o000OO;
import o00O0.o000OOo;
import o00O0oO.o000000;
import oo00o.OooOOO0;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class FirebaseRemoteConfigPlugin implements FlutterFirebasePlugin, FlutterPlugin, EventChannel.StreamHandler, FirebaseRemoteConfigHostApi {
    public static final Companion Companion = new Companion(null);
    public static final String EVENT_CHANNEL = "plugins.flutter.io/firebase_remote_config_updated";
    public static final String METHOD_CHANNEL = "plugins.flutter.io/firebase_remote_config";
    public static final String TAG = "FRCPlugin";
    private EventChannel eventChannel;
    private final Map<String, o00000OO> listenersMap = new HashMap();
    private final Handler mainThreadHandler = new Handler(Looper.getMainLooper());
    private BinaryMessenger messenger;

    public static final class Companion {
        public /* synthetic */ Companion(OooOO0O oooOO0O) {
            this();
        }

        private Companion() {
        }
    }

    /* renamed from: io.flutter.plugins.firebase.firebaseremoteconfig.FirebaseRemoteConfigPlugin$onListen$1 */
    public static final class C44591 implements Oooo000 {
        final /* synthetic */ EventChannel.EventSink $events;

        public C44591(EventChannel.EventSink eventSink) {
            this.$events = eventSink;
        }

        @Override // o000OooO.Oooo000
        public void onError(o00Ooo error) {
            OooOo.OooO0o0(error, "error");
            this.$events.error("firebase_remote_config", error.getMessage(), null);
        }

        @Override // o000OooO.Oooo000
        public void onUpdate(o000OooO.OooOo configUpdate) {
            OooOo.OooO0o0(configUpdate, "configUpdate");
            FirebaseRemoteConfigPlugin.this.mainThreadHandler.post(new OooO0Oo.OooO0O0(29, this.$events, new ArrayList(((OooOo00) configUpdate).f30539OooO00o)));
        }
    }

    public static final void activate$lambda$5(o00O0Oo.Oooo000 oooo000, FirebaseRemoteConfigPlugin firebaseRemoteConfigPlugin, Task task) {
        OooOo.OooO0o0(task, "task");
        if (task.isSuccessful()) {
            oooo000.invoke(new OooOOO0(task.getResult()));
        } else {
            firebaseRemoteConfigPlugin.handleFailure(oooo000, task.getException());
        }
    }

    private final Map<String, Object> createRemoteConfigValueMap(o0ooOOo o0ooooo) {
        HashMap map = new HashMap();
        o000OO o000oo2 = (o000OO) o0ooooo;
        map.put("value", o000oo2.f30639OooO0O0 == 0 ? o00O0O.OooOO0o : o000oo2.f30638OooO00o.getBytes(o00000O.f30605OooO0o0));
        map.put("source", mapValueSource(o000oo2.f30639OooO0O0));
        return map;
    }

    public static final void didReinitializeFirebaseCore$lambda$1(FirebaseRemoteConfigPlugin firebaseRemoteConfigPlugin, TaskCompletionSource taskCompletionSource) {
        try {
            firebaseRemoteConfigPlugin.removeEventListeners();
            taskCompletionSource.setResult(null);
        } catch (Exception e) {
            taskCompletionSource.setException(e);
        }
    }

    public static final void ensureInitialized$lambda$8(o00O0Oo.Oooo000 oooo000, FirebaseRemoteConfigPlugin firebaseRemoteConfigPlugin, Task task) {
        OooOo.OooO0o0(task, "task");
        if (task.isSuccessful()) {
            AbstractC2183w4.OooOo00(oo00o.OooOo.f33195OooO00o, oooo000);
        } else {
            firebaseRemoteConfigPlugin.handleFailure(oooo000, task.getException());
        }
    }

    public static final void fetch$lambda$3(o00O0Oo.Oooo000 oooo000, FirebaseRemoteConfigPlugin firebaseRemoteConfigPlugin, Task task) {
        OooOo.OooO0o0(task, "task");
        if (task.isSuccessful()) {
            AbstractC2183w4.OooOo00(oo00o.OooOo.f33195OooO00o, oooo000);
        } else {
            firebaseRemoteConfigPlugin.handleFailure(oooo000, task.getException());
        }
    }

    public static final void fetchAndActivate$lambda$4(o00O0Oo.Oooo000 oooo000, FirebaseRemoteConfigPlugin firebaseRemoteConfigPlugin, Task task) {
        OooOo.OooO0o0(task, "task");
        if (task.isSuccessful()) {
            oooo000.invoke(new OooOOO0(task.getResult()));
        } else {
            firebaseRemoteConfigPlugin.handleFailure(oooo000, task.getException());
        }
    }

    private final Map<String, Object> getConfigProperties(o00O0O o00o0o) {
        HashMap map = new HashMap();
        map.put("fetchTimeout", Long.valueOf(o00o0o.OooO0OO().f30629OooO0OO.f16808OooO00o));
        map.put("minimumFetchInterval", Long.valueOf(o00o0o.OooO0OO().f30629OooO0OO.f16809OooO0O0));
        map.put("lastFetchTime", Long.valueOf(o00o0o.OooO0OO().f30627OooO00o));
        map.put("lastFetchStatus", mapLastFetchStatus(o00o0o.OooO0OO().f30628OooO0O0));
        return map;
    }

    public static final void getPluginConstantsForFirebaseApp$lambda$0(Oooo0 oooo0, FirebaseRemoteConfigPlugin firebaseRemoteConfigPlugin, TaskCompletionSource taskCompletionSource) {
        try {
            oooo0.OooO00o();
            o00O0O o00o0oOooO00o = ((o0OO00O) oooo0.f29591OooO0Oo.get(o0OO00O.class)).OooO00o();
            OooOo.OooO0Oo(o00o0oOooO00o, "getInstance(...)");
            HashMap map = new HashMap(firebaseRemoteConfigPlugin.getConfigProperties(o00o0oOooO00o));
            map.put(Constants.PARAMETERS, firebaseRemoteConfigPlugin.parseParameters(o00o0oOooO00o.OooO0O0()));
            taskCompletionSource.setResult(map);
        } catch (Exception e) {
            taskCompletionSource.setException(e);
        }
    }

    private final o00O0O getRemoteConfig(String str) {
        Oooo0 oooo0OooO0o0 = Oooo0.OooO0o0(str);
        oooo0OooO0o0.OooO00o();
        o00O0O o00o0oOooO00o = ((o0OO00O) oooo0OooO0o0.f29591OooO0Oo.get(o0OO00O.class)).OooO00o();
        OooOo.OooO0Oo(o00o0oOooO00o, "getInstance(...)");
        return o00o0oOooO00o;
    }

    private final <T> void handleFailure(o00O0Oo.Oooo000 oooo000, Exception exc) {
        String message;
        HashMap map = new HashMap();
        if (exc instanceof oo000o) {
            map.put("code", "throttled");
            map.put(io.flutter.plugins.firebase.crashlytics.Constants.MESSAGE, "frequency of requests exceeds throttled limits");
        } else if (exc instanceof o00Oo0) {
            map.put("code", "internal");
            map.put(io.flutter.plugins.firebase.crashlytics.Constants.MESSAGE, "internal remote config fetch error");
        } else if (exc instanceof o00oO0o) {
            map.put("code", "remote-config-server-error");
            o00oO0o o00oo0o = (o00oO0o) exc;
            map.put(io.flutter.plugins.firebase.crashlytics.Constants.MESSAGE, o00oo0o.getMessage());
            Throwable cause = o00oo0o.getCause();
            if (cause != null && (message = cause.getMessage()) != null && o000000.Oooo0o("Forbidden", message)) {
                map.put("code", "forbidden");
            }
        } else {
            map.put("code", "unknown");
            map.put(io.flutter.plugins.firebase.crashlytics.Constants.MESSAGE, "unknown remote config error");
        }
        AbstractC2183w4.OooOOoo(o000OOo.OooO0O0(new FlutterError("firebase_remote_config", exc != null ? exc.getMessage() : null, map)), oooo000);
    }

    private final String mapLastFetchStatus(int i) {
        return i != -1 ? i != 0 ? (i == 1 || i != 2) ? "failure" : "throttled" : "noFetchYet" : "success";
    }

    private final String mapValueSource(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "static" : ServiceProvider.NAMED_REMOTE : "default" : "static";
    }

    private final Map<String, Object> parseParameters(Map<String, ? extends o0ooOOo> map) {
        HashMap map2 = new HashMap();
        for (String str : map.keySet()) {
            o0ooOOo o0ooooo = map.get(str);
            OooOo.OooO0O0(o0ooooo);
            map2.put(str, createRemoteConfigValueMap(o0ooooo));
        }
        return map2;
    }

    private final void removeEventListeners() {
        for (o00000OO o00000oo2 : this.listenersMap.values()) {
            o000OOO.OooOO0O oooOO0O = o00000oo2.f30621OooO0O0;
            C44591 c44591 = o00000oo2.f30620OooO00o;
            synchronized (oooOO0O) {
                ((LinkedHashSet) oooOO0O.f30249OooOo0O).remove(c44591);
            }
        }
        this.listenersMap.clear();
    }

    public static final void setConfigSettings$lambda$6(o00O0Oo.Oooo000 oooo000, FirebaseRemoteConfigPlugin firebaseRemoteConfigPlugin, Task task) {
        OooOo.OooO0o0(task, "task");
        if (task.isSuccessful()) {
            AbstractC2183w4.OooOo00(oo00o.OooOo.f33195OooO00o, oooo000);
        } else {
            firebaseRemoteConfigPlugin.handleFailure(oooo000, task.getException());
        }
    }

    private final Task<Void> setCustomSignals(o00O0O o00o0o, Map<String, ? extends Object> map) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new o0000O0O(map, o00o0o, taskCompletionSource, 7));
        Task<Void> task = taskCompletionSource.getTask();
        OooOo.OooO0Oo(task, "getTask(...)");
        return task;
    }

    public static final void setCustomSignals$lambda$2(Map map, o00O0O o00o0o, TaskCompletionSource taskCompletionSource) {
        try {
            o000OooO.Oooo0 oooo0 = new o000OooO.Oooo0();
            oooo0.f30540OooO00o = new HashMap();
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                if (value instanceof String) {
                    oooo0.f30540OooO00o.put(str, (String) value);
                } else if (value instanceof Long) {
                    oooo0.f30540OooO00o.put(str, Long.toString(((Number) value).longValue()));
                } else if (value instanceof Integer) {
                    oooo0.f30540OooO00o.put(str, Long.toString(((Number) value).intValue()));
                } else if (value instanceof Double) {
                    oooo0.f30540OooO00o.put(str, Double.toString(((Number) value).doubleValue()));
                } else if (value == null) {
                    oooo0.f30540OooO00o.put(str, null);
                }
            }
            o000OooO.Oooo0 oooo02 = new o000OooO.Oooo0();
            oooo02.f30540OooO00o = oooo0.f30540OooO00o;
            o00o0o.getClass();
            Tasks.await(Tasks.call(o00o0o.f30546OooO0O0, new o000oOoO(0, o00o0o, oooo02)));
            taskCompletionSource.setResult(null);
        } catch (Exception e) {
            taskCompletionSource.setException(e);
        }
    }

    public static final void setCustomSignals$lambda$9(o00O0Oo.Oooo000 oooo000, FirebaseRemoteConfigPlugin firebaseRemoteConfigPlugin, Task task) {
        OooOo.OooO0o0(task, "task");
        if (task.isSuccessful()) {
            AbstractC2183w4.OooOo00(oo00o.OooOo.f33195OooO00o, oooo000);
        } else {
            firebaseRemoteConfigPlugin.handleFailure(oooo000, task.getException());
        }
    }

    public static final void setDefaults$lambda$7(o00O0Oo.Oooo000 oooo000, FirebaseRemoteConfigPlugin firebaseRemoteConfigPlugin, Task task) {
        OooOo.OooO0o0(task, "task");
        if (task.isSuccessful()) {
            AbstractC2183w4.OooOo00(oo00o.OooOo.f33195OooO00o, oooo000);
        } else {
            firebaseRemoteConfigPlugin.handleFailure(oooo000, task.getException());
        }
    }

    private final void setupChannel(BinaryMessenger binaryMessenger) {
        FirebaseRemoteConfigHostApi.Companion.setUp$default(FirebaseRemoteConfigHostApi.Companion, binaryMessenger, this, null, 4, null);
        FlutterFirebasePluginRegistry.registerPlugin(METHOD_CHANNEL, this);
        EventChannel eventChannel = new EventChannel(binaryMessenger, EVENT_CHANNEL);
        this.eventChannel = eventChannel;
        eventChannel.setStreamHandler(this);
        this.messenger = binaryMessenger;
    }

    private final void tearDownChannel() {
        BinaryMessenger binaryMessenger = this.messenger;
        if (binaryMessenger == null) {
            throw new IllegalStateException("Required value was null.");
        }
        FirebaseRemoteConfigHostApi.Companion companion = FirebaseRemoteConfigHostApi.Companion;
        OooOo.OooO0O0(binaryMessenger);
        FirebaseRemoteConfigHostApi.Companion.setUp$default(companion, binaryMessenger, null, null, 4, null);
        this.messenger = null;
        EventChannel eventChannel = this.eventChannel;
        OooOo.OooO0O0(eventChannel);
        eventChannel.setStreamHandler(null);
        this.eventChannel = null;
        removeEventListeners();
    }

    @Override // io.flutter.plugins.firebase.firebaseremoteconfig.FirebaseRemoteConfigHostApi
    public void activate(String appName, o00O0Oo.Oooo000 callback) {
        OooOo.OooO0o0(appName, "appName");
        OooOo.OooO0o0(callback, "callback");
        o00O0O remoteConfig = getRemoteConfig(appName);
        Task taskOooO0O0 = remoteConfig.f30547OooO0OO.OooO0O0();
        Task taskOooO0O02 = remoteConfig.f30548OooO0Oo.OooO0O0();
        Tasks.whenAllComplete((Task<?>[]) new Task[]{taskOooO0O0, taskOooO0O02}).continueWithTask(remoteConfig.f30546OooO0O0, new OooO(remoteConfig, taskOooO0O0, taskOooO0O02, 10)).addOnCompleteListener(new OooO0O0(callback, this, 6));
    }

    @Override // io.flutter.plugins.firebase.core.FlutterFirebasePlugin
    public Task<Void> didReinitializeFirebaseCore() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new OooO0Oo.OooO0O0(28, this, taskCompletionSource));
        Task<Void> task = taskCompletionSource.getTask();
        OooOo.OooO0Oo(task, "getTask(...)");
        return task;
    }

    @Override // io.flutter.plugins.firebase.firebaseremoteconfig.FirebaseRemoteConfigHostApi
    public void ensureInitialized(String appName, o00O0Oo.Oooo000 callback) {
        OooOo.OooO0o0(appName, "appName");
        OooOo.OooO0o0(callback, "callback");
        o00O0O remoteConfig = getRemoteConfig(appName);
        Task taskOooO0O0 = remoteConfig.f30548OooO0Oo.OooO0O0();
        Task taskOooO0O02 = remoteConfig.f30550OooO0o0.OooO0O0();
        Task taskOooO0O03 = remoteConfig.f30547OooO0OO.OooO0O0();
        androidx.webkit.internal.OooO0O0 oooO0O0 = new androidx.webkit.internal.OooO0O0(remoteConfig, 4);
        Executor executor = remoteConfig.f30546OooO0O0;
        Task taskCall = Tasks.call(executor, oooO0O0);
        o000Oo0O.Oooo000 oooo000 = (o000Oo0O.Oooo000) remoteConfig.f30544OooO;
        Tasks.whenAllComplete((Task<?>[]) new Task[]{taskOooO0O0, taskOooO0O02, taskOooO0O03, taskCall, oooo000.OooO0OO(), oooo000.OooO0o0()}).continueWith(executor, new OooO0oo.o00Oo0(taskCall, 27)).addOnCompleteListener(new OooO0O0(callback, this, 4));
    }

    @Override // io.flutter.plugins.firebase.firebaseremoteconfig.FirebaseRemoteConfigHostApi
    public void fetch(String appName, o00O0Oo.Oooo000 callback) {
        OooOo.OooO0o0(appName, "appName");
        OooOo.OooO0o0(callback, "callback");
        getRemoteConfig(appName).OooO00o().addOnCompleteListener(new OooO0O0(callback, this, 0));
    }

    @Override // io.flutter.plugins.firebase.firebaseremoteconfig.FirebaseRemoteConfigHostApi
    public void fetchAndActivate(String appName, o00O0Oo.Oooo000 callback) {
        OooOo.OooO0o0(appName, "appName");
        OooOo.OooO0o0(callback, "callback");
        o00O0O remoteConfig = getRemoteConfig(appName);
        remoteConfig.OooO00o().onSuccessTask(remoteConfig.f30546OooO0O0, new o0OoOo0(remoteConfig)).addOnCompleteListener(new OooO0O0(callback, this, 3));
    }

    @Override // io.flutter.plugins.firebase.firebaseremoteconfig.FirebaseRemoteConfigHostApi
    public void getAll(String appName, o00O0Oo.Oooo000 callback) {
        OooOo.OooO0o0(appName, "appName");
        OooOo.OooO0o0(callback, "callback");
        callback.invoke(new OooOOO0(parseParameters(getRemoteConfig(appName).OooO0O0())));
    }

    @Override // io.flutter.plugins.firebase.core.FlutterFirebasePlugin
    public Task<Map<String, Object>> getPluginConstantsForFirebaseApp(Oooo0 firebaseApp) {
        OooOo.OooO0o0(firebaseApp, "firebaseApp");
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new o0000O0O(firebaseApp, this, taskCompletionSource, 8));
        Task<Map<String, Object>> task = taskCompletionSource.getTask();
        OooOo.OooO0Oo(task, "getTask(...)");
        return task;
    }

    @Override // io.flutter.plugins.firebase.firebaseremoteconfig.FirebaseRemoteConfigHostApi
    public void getProperties(String appName, o00O0Oo.Oooo000 callback) {
        OooOo.OooO0o0(appName, "appName");
        OooOo.OooO0o0(callback, "callback");
        callback.invoke(new OooOOO0(getConfigProperties(getRemoteConfig(appName))));
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding binding) {
        OooOo.OooO0o0(binding, "binding");
        BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        OooOo.OooO0Oo(binaryMessenger, "getBinaryMessenger(...)");
        setupChannel(binaryMessenger);
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public void onCancel(Object obj) {
        Map map = obj instanceof Map ? (Map) obj : null;
        if (map == null) {
            return;
        }
        Object obj2 = map.get("appName");
        Objects.requireNonNull(obj2);
        String str = (String) obj2;
        o00000OO o00000oo2 = this.listenersMap.get(str);
        if (o00000oo2 != null) {
            o000OOO.OooOO0O oooOO0O = o00000oo2.f30621OooO0O0;
            C44591 c44591 = o00000oo2.f30620OooO00o;
            synchronized (oooOO0O) {
                ((LinkedHashSet) oooOO0O.f30249OooOo0O).remove(c44591);
            }
            this.listenersMap.remove(str);
        }
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding binding) {
        OooOo.OooO0o0(binding, "binding");
        tearDownChannel();
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public void onListen(Object arguments, EventChannel.EventSink events) {
        o00000OO o00000oo2;
        OooOo.OooO0o0(arguments, "arguments");
        OooOo.OooO0o0(events, "events");
        Object obj = ((Map) arguments).get("appName");
        Objects.requireNonNull(obj);
        String str = (String) obj;
        o00O0O remoteConfig = getRemoteConfig(str);
        Map<String, o00000OO> map = this.listenersMap;
        C44591 c44591 = new C44591(events);
        o000OOO.OooOO0O oooOO0O = remoteConfig.f30553OooOO0;
        synchronized (oooOO0O) {
            ((LinkedHashSet) oooOO0O.f30249OooOo0O).add(c44591);
            oooOO0O.OooO00o();
            o00000oo2 = new o00000OO(oooOO0O, c44591);
        }
        map.put(str, o00000oo2);
    }

    @Override // io.flutter.plugins.firebase.firebaseremoteconfig.FirebaseRemoteConfigHostApi
    public void setConfigSettings(String appName, RemoteConfigPigeonSettings settings, o00O0Oo.Oooo000 callback) {
        OooOo.OooO0o0(appName, "appName");
        OooOo.OooO0o0(settings, "settings");
        OooOo.OooO0o0(callback, "callback");
        com.google.android.gms.internal.ads.OooOO0O oooOO0O = new com.google.android.gms.internal.ads.OooOO0O(1);
        long fetchTimeoutSeconds = settings.getFetchTimeoutSeconds();
        if (fetchTimeoutSeconds < 0) {
            throw new IllegalArgumentException(String.format("Fetch connection timeout has to be a non-negative number. %d is an invalid argument", Long.valueOf(fetchTimeoutSeconds)));
        }
        oooOO0O.f16808OooO00o = fetchTimeoutSeconds;
        oooOO0O.OooO00o(settings.getMinimumFetchIntervalSeconds());
        com.google.android.gms.internal.ads.OooOO0O oooOO0O2 = new com.google.android.gms.internal.ads.OooOO0O(oooOO0O);
        o00O0O remoteConfig = getRemoteConfig(appName);
        remoteConfig.getClass();
        Tasks.call(remoteConfig.f30546OooO0O0, new o000oOoO(1, remoteConfig, oooOO0O2)).addOnCompleteListener(new OooO0O0(callback, this, 1));
    }

    @Override // io.flutter.plugins.firebase.firebaseremoteconfig.FirebaseRemoteConfigHostApi
    public void setDefaults(String appName, Map<String, ? extends Object> defaultParameters, o00O0Oo.Oooo000 callback) {
        Task taskForResult;
        OooOo.OooO0o0(appName, "appName");
        OooOo.OooO0o0(defaultParameters, "defaultParameters");
        OooOo.OooO0o0(callback, "callback");
        o00O0O remoteConfig = getRemoteConfig(appName);
        remoteConfig.getClass();
        HashMap map = new HashMap();
        for (Map.Entry<String, ? extends Object> entry : defaultParameters.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                map.put(entry.getKey(), new String((byte[]) value));
            } else {
                map.put(entry.getKey(), value.toString());
            }
        }
        try {
            y91 y91VarOooO0OO = o000Oooo.o000000.OooO0OO();
            y91VarOooO0OO.f25875OooO0O0 = new JSONObject(map);
            taskForResult = remoteConfig.f30550OooO0o0.OooO0Oo(y91VarOooO0OO.OooO00o()).onSuccessTask(o0O0O0o0.f29715OooOo0O, new o0000O.OooOo00(27));
        } catch (JSONException e) {
            Log.e("FirebaseRemoteConfig", "The provided defaults map could not be processed.", e);
            taskForResult = Tasks.forResult(null);
        }
        taskForResult.addOnCompleteListener(new OooO0O0(callback, this, 5));
    }

    @Override // io.flutter.plugins.firebase.firebaseremoteconfig.FirebaseRemoteConfigHostApi
    public void setCustomSignals(String appName, Map<String, ? extends Object> customSignals, o00O0Oo.Oooo000 callback) {
        OooOo.OooO0o0(appName, "appName");
        OooOo.OooO0o0(customSignals, "customSignals");
        OooOo.OooO0o0(callback, "callback");
        setCustomSignals(getRemoteConfig(appName), customSignals).addOnCompleteListener(new OooO0O0(callback, this, 2));
    }
}
