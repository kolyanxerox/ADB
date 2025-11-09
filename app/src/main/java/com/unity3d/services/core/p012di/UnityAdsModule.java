package com.unity3d.services.core.p012di;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.datastore.core.DataMigration;
import androidx.datastore.core.DataStore;
import androidx.datastore.core.DataStoreFactory;
import com.google.android.gms.internal.measurement.o0OO0O0;
import com.unity3d.ads.core.data.datasource.AndroidByteStringDataSource;
import com.unity3d.ads.core.data.datasource.ByteStringDataSource;
import com.unity3d.ads.core.data.model.ByteStringSerializer;
import com.unity3d.ads.core.data.model.UniversalRequestStoreSerializer;
import com.unity3d.ads.core.data.model.WebViewConfigurationStoreSerializer;
import com.unity3d.ads.core.data.repository.DiagnosticEventRepository;
import com.unity3d.ads.core.extensions.ContextExtensionsKt;
import com.unity3d.ads.datastore.ByteStringStoreOuterClass;
import com.unity3d.ads.datastore.UniversalRequestStoreOuterClass;
import com.unity3d.ads.datastore.WebviewConfigurationStore;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.ads.measurements.MeasurementsService;
import com.unity3d.services.ads.token.AsyncTokenStorage;
import com.unity3d.services.ads.token.InMemoryAsyncTokenStorage;
import com.unity3d.services.ads.token.TokenStorage;
import com.unity3d.services.ads.topics.TopicsService;
import com.unity3d.services.core.device.Storage;
import com.unity3d.services.core.device.StorageManager;
import com.unity3d.services.core.device.VolumeChange;
import com.unity3d.services.core.device.VolumeChangeMonitor;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.domain.SDKDispatchers;
import com.unity3d.services.core.misc.JsonStorage;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.request.metrics.SDKMetrics;
import com.unity3d.services.core.request.metrics.SDKMetricsSender;
import com.unity3d.services.core.webview.bridge.SharedInstances;
import gatewayprotocol.p014v1.AdOperationsConfigurationKt;
import gatewayprotocol.p014v1.DiagnosticEventsConfigurationKt;
import gatewayprotocol.p014v1.NativeConfigurationKt;
import gatewayprotocol.p014v1.NativeConfigurationOuterClass;
import gatewayprotocol.p014v1.RequestPolicyKt;
import gatewayprotocol.p014v1.RequestRetryPolicyKt;
import gatewayprotocol.p014v1.RequestTimeoutPolicyKt;
import java.io.File;
import kotlin.jvm.internal.OooOo;
import kotlin.jvm.internal.Oooo000;
import o00O0Oo.OooO0O0;
import o00O0oOo.o0000O0;
import o00O0oOo.o0000O00;
import o00O0oOo.o0000O0O;
import o00O0oOo.o0000OO0;
import o00O0oOo.o000O0O0;
import o00O0oOo.o000OO;
import o00O0oOo.o00O0O00;
import o00O0oOo.o00O0O0O;
import o00OO000.Oooo0;
import o00OO00o.OooO;
import o00OO00o.OooO0o;

/* loaded from: classes3.dex */
public final class UnityAdsModule {

    /* renamed from: com.unity3d.services.core.di.UnityAdsModule$glInfoDataStore$1 */
    public static final class C43191 extends Oooo000 implements OooO0O0 {
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C43191(Context context) {
            super(0);
            this.$context = context;
        }

        @Override // o00O0Oo.OooO0O0
        public final File invoke() {
            return ContextExtensionsKt.unityAdsDataStoreFile(this.$context, ServiceProvider.DATA_STORE_GL_INFO);
        }
    }

    /* renamed from: com.unity3d.services.core.di.UnityAdsModule$provideByteStringDataStore$1 */
    public static final class C43201 extends Oooo000 implements OooO0O0 {
        final /* synthetic */ Context $context;
        final /* synthetic */ String $dataStoreFile;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C43201(Context context, String str) {
            super(0);
            this.$context = context;
            this.$dataStoreFile = str;
        }

        @Override // o00O0Oo.OooO0O0
        public final File invoke() {
            return ContextExtensionsKt.unityAdsDataStoreFile(this.$context, this.$dataStoreFile);
        }
    }

    /* renamed from: com.unity3d.services.core.di.UnityAdsModule$universalRequestDataStore$1 */
    public static final class C43211 extends Oooo000 implements OooO0O0 {
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C43211(Context context) {
            super(0);
            this.$context = context;
        }

        @Override // o00O0Oo.OooO0O0
        public final File invoke() {
            return ContextExtensionsKt.unityAdsDataStoreFile(this.$context, ServiceProvider.DATA_STORE_UNIVERSAL_REQUEST);
        }
    }

    /* renamed from: com.unity3d.services.core.di.UnityAdsModule$webViewConfigurationDataStore$1 */
    public static final class C43221 extends Oooo000 implements OooO0O0 {
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C43221(Context context) {
            super(0);
            this.$context = context;
        }

        @Override // o00O0Oo.OooO0O0
        public final File invoke() {
            return ContextExtensionsKt.unityAdsDataStoreFile(this.$context, ServiceProvider.DATA_STORE_WEBVIEW_CONFIG);
        }
    }

    private final NativeConfigurationOuterClass.AdOperationsConfiguration getDefaultAdOperations() {
        AdOperationsConfigurationKt.Dsl.Companion companion = AdOperationsConfigurationKt.Dsl.Companion;
        NativeConfigurationOuterClass.AdOperationsConfiguration.Builder builderNewBuilder = NativeConfigurationOuterClass.AdOperationsConfiguration.newBuilder();
        OooOo.OooO0Oo(builderNewBuilder, "newBuilder()");
        AdOperationsConfigurationKt.Dsl dsl_create = companion._create(builderNewBuilder);
        dsl_create.setLoadTimeoutMs(30000);
        dsl_create.setShowTimeoutMs(10000);
        dsl_create.setGetTokenTimeoutMs(UnityAdsConstants.AdOperations.GET_TOKEN_TIMEOUT_MS);
        return dsl_create._build();
    }

    private final NativeConfigurationOuterClass.RequestPolicy getDefaultRequestPolicy() {
        RequestPolicyKt.Dsl.Companion companion = RequestPolicyKt.Dsl.Companion;
        NativeConfigurationOuterClass.RequestPolicy.Builder builderNewBuilder = NativeConfigurationOuterClass.RequestPolicy.newBuilder();
        OooOo.OooO0Oo(builderNewBuilder, "newBuilder()");
        RequestPolicyKt.Dsl dsl_create = companion._create(builderNewBuilder);
        dsl_create.setRetryPolicy(getDefaultRequestRetryPolicy());
        dsl_create.setTimeoutPolicy(getDefaultRequestTimeoutPolicy());
        return dsl_create._build();
    }

    private final NativeConfigurationOuterClass.RequestRetryPolicy getDefaultRequestRetryPolicy() {
        RequestRetryPolicyKt.Dsl.Companion companion = RequestRetryPolicyKt.Dsl.Companion;
        NativeConfigurationOuterClass.RequestRetryPolicy.Builder builderNewBuilder = NativeConfigurationOuterClass.RequestRetryPolicy.newBuilder();
        OooOo.OooO0Oo(builderNewBuilder, "newBuilder()");
        RequestRetryPolicyKt.Dsl dsl_create = companion._create(builderNewBuilder);
        dsl_create.setMaxDuration(UnityAdsConstants.RequestPolicy.RETRY_MAX_DURATION);
        dsl_create.setRetryWaitBase(UnityAdsConstants.RequestPolicy.RETRY_WAIT_BASE);
        dsl_create.setRetryJitterPct(0.1f);
        dsl_create.setShouldStoreLocally(false);
        dsl_create.setRetryMaxInterval(UnityAdsConstants.RequestPolicy.RETRY_MAX_INTERVAL);
        dsl_create.setRetryScalingFactor(2.0f);
        return dsl_create._build();
    }

    private final NativeConfigurationOuterClass.RequestTimeoutPolicy getDefaultRequestTimeoutPolicy() {
        RequestTimeoutPolicyKt.Dsl.Companion companion = RequestTimeoutPolicyKt.Dsl.Companion;
        NativeConfigurationOuterClass.RequestTimeoutPolicy.Builder builderNewBuilder = NativeConfigurationOuterClass.RequestTimeoutPolicy.newBuilder();
        OooOo.OooO0Oo(builderNewBuilder, "newBuilder()");
        RequestTimeoutPolicyKt.Dsl dsl_create = companion._create(builderNewBuilder);
        dsl_create.setConnectTimeoutMs(30000);
        dsl_create.setReadTimeoutMs(30000);
        dsl_create.setWriteTimeoutMs(30000);
        dsl_create.setOverallTimeoutMs(30000);
        return dsl_create._build();
    }

    private final ByteStringDataSource provideByteStringDataSource(DataStore<ByteStringStoreOuterClass.ByteStringStore> dataStore) {
        return new AndroidByteStringDataSource(dataStore);
    }

    private final DataStore<ByteStringStoreOuterClass.ByteStringStore> provideByteStringDataStore(Context context, o0000O00 o0000o00, String str) {
        return DataStoreFactory.create$default(DataStoreFactory.INSTANCE, new ByteStringSerializer(), null, null, o0000OO0.OooO0O0(o0000o00.plus(o0000OO0.OooO0o0())), new C43201(context, str), 4, null);
    }

    private final JsonStorage provideJsonStorage(StorageManager.StorageType storageType) {
        if (!StorageManager.init(ClientProperties.getApplicationContext())) {
            throw new IllegalStateException("StorageManager failed to initialize");
        }
        Storage storage = StorageManager.getStorage(storageType);
        OooOo.OooO0Oo(storage, "getStorage(storageType)");
        return storage;
    }

    public final Context androidContext() {
        Context applicationContext = ClientProperties.getApplicationContext();
        OooOo.OooO0Oo(applicationContext, "getApplicationContext()");
        return applicationContext;
    }

    public final AsyncTokenStorage asyncTokenStorage(TokenStorage tokenStorage, SDKMetricsSender sdkMetricsSender) {
        OooOo.OooO0o0(tokenStorage, "tokenStorage");
        OooOo.OooO0o0(sdkMetricsSender, "sdkMetricsSender");
        return new InMemoryAsyncTokenStorage(null, new Handler(Looper.getMainLooper()), sdkMetricsSender, tokenStorage);
    }

    public final ByteStringDataSource auidDataStore(DataStore<ByteStringStoreOuterClass.ByteStringStore> dataStore) {
        OooOo.OooO0o0(dataStore, "dataStore");
        return provideByteStringDataSource(dataStore);
    }

    public final o0000O00 defaultDispatcher() {
        return o000O0O0.f31514OooO00o;
    }

    public final NativeConfigurationOuterClass.NativeConfiguration defaultNativeConfiguration() {
        NativeConfigurationKt.Dsl.Companion companion = NativeConfigurationKt.Dsl.Companion;
        NativeConfigurationOuterClass.NativeConfiguration.Builder builderNewBuilder = NativeConfigurationOuterClass.NativeConfiguration.newBuilder();
        OooOo.OooO0Oo(builderNewBuilder, "newBuilder()");
        NativeConfigurationKt.Dsl dsl_create = companion._create(builderNewBuilder);
        dsl_create.setAdOperations(getDefaultAdOperations());
        dsl_create.setInitPolicy(getDefaultRequestPolicy());
        dsl_create.setAdPolicy(getDefaultRequestPolicy());
        dsl_create.setOtherPolicy(getDefaultRequestPolicy());
        dsl_create.setOperativeEventPolicy(getDefaultRequestPolicy());
        DiagnosticEventsConfigurationKt.Dsl.Companion companion2 = DiagnosticEventsConfigurationKt.Dsl.Companion;
        NativeConfigurationOuterClass.DiagnosticEventsConfiguration.Builder builderNewBuilder2 = NativeConfigurationOuterClass.DiagnosticEventsConfiguration.newBuilder();
        OooOo.OooO0Oo(builderNewBuilder2, "newBuilder()");
        DiagnosticEventsConfigurationKt.Dsl dsl_create2 = companion2._create(builderNewBuilder2);
        dsl_create2.setEnabled(true);
        dsl_create2.setMaxBatchSize(10);
        dsl_create2.setMaxBatchIntervalMs(30000);
        dsl_create2.setTtmEnabled(false);
        dsl_create.setDiagnosticEvents(dsl_create2._build());
        return dsl_create._build();
    }

    public final ByteStringDataSource gatewayCacheDataStore(DataStore<ByteStringStoreOuterClass.ByteStringStore> dataStore) {
        OooOo.OooO0o0(dataStore, "dataStore");
        return provideByteStringDataSource(dataStore);
    }

    public final DataStore<ByteStringStoreOuterClass.ByteStringStore> gatewayDataStore(Context context, o0000O00 dispatcher) {
        OooOo.OooO0o0(context, "context");
        OooOo.OooO0o0(dispatcher, "dispatcher");
        return provideByteStringDataStore(context, dispatcher, ServiceProvider.DATA_STORE_GATEWAY_CACHE);
    }

    public final o000OO getTokenCoroutineScope(ISDKDispatchers dispatchers, o0000O0 errorHandler, o00O0O00 parentJob) {
        OooOo.OooO0o0(dispatchers, "dispatchers");
        OooOo.OooO0o0(errorHandler, "errorHandler");
        OooOo.OooO0o0(parentJob, "parentJob");
        return o0000OO0.OooO0O0(parentJob.plus(dispatchers.getDefault()).plus(new o0000O0O(ServiceProvider.NAMED_GET_TOKEN_SCOPE)).plus(errorHandler));
    }

    public final DataStore<ByteStringStoreOuterClass.ByteStringStore> glInfoDataStore(Context context, o0000O00 dispatcher, DataMigration<ByteStringStoreOuterClass.ByteStringStore> fetchGLInfo) {
        OooOo.OooO0o0(context, "context");
        OooOo.OooO0o0(dispatcher, "dispatcher");
        OooOo.OooO0o0(fetchGLInfo, "fetchGLInfo");
        return DataStoreFactory.create$default(DataStoreFactory.INSTANCE, new ByteStringSerializer(), null, o0OO0O0.OooOO0o(fetchGLInfo), o0000OO0.OooO0O0(dispatcher.plus(o0000OO0.OooO0o0())), new C43191(context), 2, null);
    }

    public final DataStore<ByteStringStoreOuterClass.ByteStringStore> iapTransactionDataStore(Context context, o0000O00 dispatcher) {
        OooOo.OooO0o0(context, "context");
        OooOo.OooO0o0(dispatcher, "dispatcher");
        return provideByteStringDataStore(context, dispatcher, ServiceProvider.DATA_STORE_IAP_TRANSACTION);
    }

    public final ByteStringDataSource idfiDataStore(DataStore<ByteStringStoreOuterClass.ByteStringStore> dataStore) {
        OooOo.OooO0o0(dataStore, "dataStore");
        return provideByteStringDataSource(dataStore);
    }

    public final o000OO initCoroutineScope(ISDKDispatchers dispatchers, o0000O0 errorHandler, o00O0O00 parentJob) {
        OooOo.OooO0o0(dispatchers, "dispatchers");
        OooOo.OooO0o0(errorHandler, "errorHandler");
        OooOo.OooO0o0(parentJob, "parentJob");
        return o0000OO0.OooO0O0(parentJob.plus(dispatchers.getDefault()).plus(new o0000O0O(ServiceProvider.NAMED_INIT_SCOPE)).plus(errorHandler));
    }

    public final o0000O00 ioDispatcher() {
        OooO oooO = o000O0O0.f31514OooO00o;
        return OooO0o.f31999OooOo0O;
    }

    public final o000OO loadCoroutineScope(ISDKDispatchers dispatchers, o0000O0 errorHandler, o00O0O00 parentJob) {
        OooOo.OooO0o0(dispatchers, "dispatchers");
        OooOo.OooO0o0(errorHandler, "errorHandler");
        OooOo.OooO0o0(parentJob, "parentJob");
        return o0000OO0.OooO0O0(parentJob.plus(dispatchers.getDefault()).plus(new o0000O0O(ServiceProvider.NAMED_LOAD_SCOPE)).plus(errorHandler));
    }

    public final o0000O00 mainDispatcher() {
        OooO oooO = o000O0O0.f31514OooO00o;
        return Oooo0.f31951OooO00o;
    }

    public final MeasurementsService measurementService(Context context, ISDKDispatchers dispatchers) {
        OooOo.OooO0o0(context, "context");
        OooOo.OooO0o0(dispatchers, "dispatchers");
        return new MeasurementsService(context, dispatchers, SharedInstances.INSTANCE.getWebViewEventSender());
    }

    public final JsonStorage memoryJsonStorage() {
        return provideJsonStorage(StorageManager.StorageType.MEMORY);
    }

    public final DataStore<ByteStringStoreOuterClass.ByteStringStore> nativeConfigurationDataStore(Context context, o0000O00 dispatcher) {
        OooOo.OooO0o0(context, "context");
        OooOo.OooO0o0(dispatcher, "dispatcher");
        return provideByteStringDataStore(context, dispatcher, ServiceProvider.DATA_STORE_NATIVE_CONFIG);
    }

    public final o000OO offerwallSignalsCoroutineScope(ISDKDispatchers dispatchers, o0000O0 errorHandler, o00O0O00 parentJob) {
        OooOo.OooO0o0(dispatchers, "dispatchers");
        OooOo.OooO0o0(errorHandler, "errorHandler");
        OooOo.OooO0o0(parentJob, "parentJob");
        return o0000OO0.OooO0O0(parentJob.plus(dispatchers.getDefault()).plus(new o0000O0O(ServiceProvider.NAMED_OFFERWALL_SCOPE)).plus(errorHandler));
    }

    public final o000OO omidCoroutineScope(ISDKDispatchers dispatchers, o0000O0 errorHandler, o00O0O00 parentJob) {
        OooOo.OooO0o0(dispatchers, "dispatchers");
        OooOo.OooO0o0(errorHandler, "errorHandler");
        OooOo.OooO0o0(parentJob, "parentJob");
        return o0000OO0.OooO0O0(parentJob.plus(dispatchers.getDefault()).plus(new o0000O0O(ServiceProvider.NAMED_OMID_SCOPE)).plus(errorHandler));
    }

    public final DataStore<ByteStringStoreOuterClass.ByteStringStore> privacyDataStore(Context context, o0000O00 dispatcher) {
        OooOo.OooO0o0(context, "context");
        OooOo.OooO0o0(dispatcher, "dispatcher");
        return provideByteStringDataStore(context, dispatcher, ServiceProvider.DATA_STORE_PRIVACY);
    }

    public final DataStore<ByteStringStoreOuterClass.ByteStringStore> privacyFsmDataStore(Context context, o0000O00 dispatcher) {
        OooOo.OooO0o0(context, "context");
        OooOo.OooO0o0(dispatcher, "dispatcher");
        return provideByteStringDataStore(context, dispatcher, ServiceProvider.DATA_STORE_PRIVACY_FSM);
    }

    public final JsonStorage privateJsonStorage() {
        return provideJsonStorage(StorageManager.StorageType.PRIVATE);
    }

    public final o00O0O00 publicApiJob(DiagnosticEventRepository diagnosticEventRepository) {
        OooOo.OooO0o0(diagnosticEventRepository, "diagnosticEventRepository");
        o00O0O0O o00o0o0oOooO0OO = o0000OO0.OooO0OO();
        o00o0o0oOooO0OO.OooO0oo(new UnityAdsModule$publicApiJob$1$1(diagnosticEventRepository));
        return o00o0o0oOooO0OO;
    }

    public final JsonStorage publicJsonStorage() {
        return provideJsonStorage(StorageManager.StorageType.PUBLIC);
    }

    public final o000OO scarSignalsCoroutineScope(ISDKDispatchers dispatchers, o0000O0 errorHandler, o00O0O00 parentJob) {
        OooOo.OooO0o0(dispatchers, "dispatchers");
        OooOo.OooO0o0(errorHandler, "errorHandler");
        OooOo.OooO0o0(parentJob, "parentJob");
        return o0000OO0.OooO0O0(parentJob.plus(dispatchers.getDefault()).plus(new o0000O0O(ServiceProvider.NAMED_SCAR_SCOPE)).plus(errorHandler));
    }

    public final ISDKDispatchers sdkDispatchers() {
        return new SDKDispatchers();
    }

    public final SDKMetricsSender sdkMetrics() {
        SDKMetricsSender sDKMetrics = SDKMetrics.getInstance();
        OooOo.OooO0Oo(sDKMetrics, "getInstance()");
        return sDKMetrics;
    }

    public final o000OO showCoroutineScope(ISDKDispatchers dispatchers, o0000O0 errorHandler, o00O0O00 parentJob) {
        OooOo.OooO0o0(dispatchers, "dispatchers");
        OooOo.OooO0o0(errorHandler, "errorHandler");
        OooOo.OooO0o0(parentJob, "parentJob");
        return o0000OO0.OooO0O0(parentJob.plus(dispatchers.getDefault()).plus(new o0000O0O(ServiceProvider.NAMED_SHOW_SCOPE)).plus(errorHandler));
    }

    public final TopicsService topicsService(Context context, ISDKDispatchers dispatchers) {
        OooOo.OooO0o0(context, "context");
        OooOo.OooO0o0(dispatchers, "dispatchers");
        return new TopicsService(context, dispatchers, SharedInstances.INSTANCE.getWebViewEventSender());
    }

    public final o000OO transactionCoroutineScope(ISDKDispatchers dispatchers, o0000O0 errorHandler, o00O0O00 parentJob) {
        OooOo.OooO0o0(dispatchers, "dispatchers");
        OooOo.OooO0o0(errorHandler, "errorHandler");
        OooOo.OooO0o0(parentJob, "parentJob");
        return o0000OO0.OooO0O0(parentJob.plus(dispatchers.getDefault()).plus(new o0000O0O(ServiceProvider.NAMED_TRANSACTION_SCOPE)).plus(errorHandler));
    }

    public final DataStore<UniversalRequestStoreOuterClass.UniversalRequestStore> universalRequestDataStore(Context context, o0000O00 dispatcher) {
        OooOo.OooO0o0(context, "context");
        OooOo.OooO0o0(dispatcher, "dispatcher");
        return DataStoreFactory.create$default(DataStoreFactory.INSTANCE, new UniversalRequestStoreSerializer(), null, null, o0000OO0.OooO0O0(dispatcher.plus(o0000OO0.OooO0o0())), new C43211(context), 4, null);
    }

    public final VolumeChangeMonitor volumeChangeMonitor(VolumeChange volumeChange) {
        OooOo.OooO0o0(volumeChange, "volumeChange");
        return new VolumeChangeMonitor(SharedInstances.INSTANCE.getWebViewEventSender(), volumeChange);
    }

    public final DataStore<WebviewConfigurationStore.WebViewConfigurationStore> webViewConfigurationDataStore(Context context, o0000O00 dispatcher) {
        OooOo.OooO0o0(context, "context");
        OooOo.OooO0o0(dispatcher, "dispatcher");
        return DataStoreFactory.create$default(DataStoreFactory.INSTANCE, new WebViewConfigurationStoreSerializer(), null, null, o0000OO0.OooO0O0(dispatcher.plus(o0000OO0.OooO0o0())), new C43221(context), 4, null);
    }

    public final ByteStringDataSource iapTransactionDataStore(DataStore<ByteStringStoreOuterClass.ByteStringStore> dataStore) {
        OooOo.OooO0o0(dataStore, "dataStore");
        return provideByteStringDataSource(dataStore);
    }

    public final ByteStringDataSource nativeConfigurationDataStore(DataStore<ByteStringStoreOuterClass.ByteStringStore> dataStore) {
        OooOo.OooO0o0(dataStore, "dataStore");
        return provideByteStringDataSource(dataStore);
    }

    public final ByteStringDataSource privacyDataStore(DataStore<ByteStringStoreOuterClass.ByteStringStore> dataStore) {
        OooOo.OooO0o0(dataStore, "dataStore");
        return provideByteStringDataSource(dataStore);
    }

    public final ByteStringDataSource privacyFsmDataStore(DataStore<ByteStringStoreOuterClass.ByteStringStore> dataStore) {
        OooOo.OooO0o0(dataStore, "dataStore");
        return provideByteStringDataSource(dataStore);
    }

    public final ByteStringDataSource glInfoDataStore(DataStore<ByteStringStoreOuterClass.ByteStringStore> dataStore) {
        OooOo.OooO0o0(dataStore, "dataStore");
        return provideByteStringDataSource(dataStore);
    }
}
