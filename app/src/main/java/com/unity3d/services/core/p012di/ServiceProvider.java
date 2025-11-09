package com.unity3d.services.core.p012di;

import android.content.Context;
import androidx.datastore.core.DataMigration;
import androidx.datastore.core.DataStore;
import com.google.android.gms.internal.measurement.o0OOO0;
import com.unity3d.ads.adplayer.AdPlayerScope;
import com.unity3d.ads.adplayer.AndroidWebViewClient;
import com.unity3d.ads.core.configuration.AlternativeFlowReader;
import com.unity3d.ads.core.configuration.AndroidManifestIntPropertyReader;
import com.unity3d.ads.core.configuration.GameServerIdReader;
import com.unity3d.ads.core.configuration.MediationInitBlobMetadataReader;
import com.unity3d.ads.core.configuration.MediationTraitsMetadataReader;
import com.unity3d.ads.core.data.datasource.AnalyticsDataSource;
import com.unity3d.ads.core.data.datasource.AndroidAnalyticsDataSource;
import com.unity3d.ads.core.data.datasource.AndroidDeveloperConsentDataSource;
import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import com.unity3d.ads.core.data.datasource.AndroidFIdDataSource;
import com.unity3d.ads.core.data.datasource.AndroidFIdExistenceDataSource;
import com.unity3d.ads.core.data.datasource.AndroidLegacyConfigStoreDataSource;
import com.unity3d.ads.core.data.datasource.AndroidLegacyUserConsentDataSource;
import com.unity3d.ads.core.data.datasource.AndroidLifecycleDataSource;
import com.unity3d.ads.core.data.datasource.AndroidLocalCacheDataSource;
import com.unity3d.ads.core.data.datasource.AndroidMediationDataSource;
import com.unity3d.ads.core.data.datasource.AndroidPrivacyDeviceInfoDataSource;
import com.unity3d.ads.core.data.datasource.AndroidRemoteCacheDataSource;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import com.unity3d.ads.core.data.datasource.AndroidStoreDataSource;
import com.unity3d.ads.core.data.datasource.AndroidTcfDataSource;
import com.unity3d.ads.core.data.datasource.ByteStringDataSource;
import com.unity3d.ads.core.data.datasource.CacheDataSource;
import com.unity3d.ads.core.data.datasource.DeveloperConsentDataSource;
import com.unity3d.ads.core.data.datasource.DynamicDeviceInfoDataSource;
import com.unity3d.ads.core.data.datasource.FIdDataSource;
import com.unity3d.ads.core.data.datasource.FIdExistenceDataSource;
import com.unity3d.ads.core.data.datasource.FetchGLInfoDataMigration;
import com.unity3d.ads.core.data.datasource.LegacyUserConsentDataSource;
import com.unity3d.ads.core.data.datasource.LifecycleDataSource;
import com.unity3d.ads.core.data.datasource.MediationDataSource;
import com.unity3d.ads.core.data.datasource.PrivacyDeviceInfoDataSource;
import com.unity3d.ads.core.data.datasource.StaticDeviceInfoDataSource;
import com.unity3d.ads.core.data.datasource.StoreDataSource;
import com.unity3d.ads.core.data.datasource.TcfDataSource;
import com.unity3d.ads.core.data.datasource.UniversalRequestDataSource;
import com.unity3d.ads.core.data.datasource.WebviewConfigurationDataSource;
import com.unity3d.ads.core.data.manager.AndroidOfferwallManager;
import com.unity3d.ads.core.data.manager.AndroidOmidManager;
import com.unity3d.ads.core.data.manager.AndroidSDKPropertiesManager;
import com.unity3d.ads.core.data.manager.AndroidScarManager;
import com.unity3d.ads.core.data.manager.AndroidStorageManager;
import com.unity3d.ads.core.data.manager.OfferwallManager;
import com.unity3d.ads.core.data.manager.OmidManager;
import com.unity3d.ads.core.data.manager.SDKPropertiesManager;
import com.unity3d.ads.core.data.manager.ScarManager;
import com.unity3d.ads.core.data.manager.StorageManager;
import com.unity3d.ads.core.data.manager.TransactionEventManager;
import com.unity3d.ads.core.data.repository.AdRepository;
import com.unity3d.ads.core.data.repository.AndroidAdRepository;
import com.unity3d.ads.core.data.repository.AndroidCacheRepository;
import com.unity3d.ads.core.data.repository.AndroidCampaignRepository;
import com.unity3d.ads.core.data.repository.AndroidDeveloperConsentRepository;
import com.unity3d.ads.core.data.repository.AndroidDeviceInfoRepository;
import com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository;
import com.unity3d.ads.core.data.repository.AndroidLegacyUserConsentRepository;
import com.unity3d.ads.core.data.repository.AndroidMediationRepository;
import com.unity3d.ads.core.data.repository.AndroidOpenMeasurementRepository;
import com.unity3d.ads.core.data.repository.AndroidSessionRepository;
import com.unity3d.ads.core.data.repository.AndroidTcfRepository;
import com.unity3d.ads.core.data.repository.AndroidTransactionEventRepository;
import com.unity3d.ads.core.data.repository.CacheRepository;
import com.unity3d.ads.core.data.repository.CampaignRepository;
import com.unity3d.ads.core.data.repository.DeveloperConsentRepository;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.DiagnosticEventRepository;
import com.unity3d.ads.core.data.repository.FocusRepository;
import com.unity3d.ads.core.data.repository.LegacyUserConsentRepository;
import com.unity3d.ads.core.data.repository.MediationRepository;
import com.unity3d.ads.core.data.repository.OpenMeasurementRepository;
import com.unity3d.ads.core.data.repository.OperativeEventRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.data.repository.TcfRepository;
import com.unity3d.ads.core.data.repository.TransactionEventRepository;
import com.unity3d.ads.core.domain.AndroidBuildHeaderBiddingToken;
import com.unity3d.ads.core.domain.AndroidCacheWebViewAssets;
import com.unity3d.ads.core.domain.AndroidExecuteAdViewerRequest;
import com.unity3d.ads.core.domain.AndroidGenerateByteStringId;
import com.unity3d.ads.core.domain.AndroidGetAdDataRefreshRequest;
import com.unity3d.ads.core.domain.AndroidGetAdPlayerConfigRequest;
import com.unity3d.ads.core.domain.AndroidGetAdPlayerContext;
import com.unity3d.ads.core.domain.AndroidGetAdRequest;
import com.unity3d.ads.core.domain.AndroidGetAdRequestPolicy;
import com.unity3d.ads.core.domain.AndroidGetClientInfo;
import com.unity3d.ads.core.domain.AndroidGetInitializationCompletedRequest;
import com.unity3d.ads.core.domain.AndroidGetInitializationData;
import com.unity3d.ads.core.domain.AndroidGetInitializationRequest;
import com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload;
import com.unity3d.ads.core.domain.AndroidGetIsAdActivity;
import com.unity3d.ads.core.domain.AndroidGetLifecycleFlow;
import com.unity3d.ads.core.domain.AndroidGetLimitedSessionToken;
import com.unity3d.ads.core.domain.AndroidGetOpenGLRendererInfo;
import com.unity3d.ads.core.domain.AndroidGetSharedDataTimestamps;
import com.unity3d.ads.core.domain.AndroidGetUniversalRequestForPayLoad;
import com.unity3d.ads.core.domain.AndroidGetUniversalRequestSharedData;
import com.unity3d.ads.core.domain.AndroidGetWebViewContainerUseCase;
import com.unity3d.ads.core.domain.AndroidHandleFocusCounters;
import com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse;
import com.unity3d.ads.core.domain.AndroidHandleGatewayInitializationResponse;
import com.unity3d.ads.core.domain.AndroidHandleGatewayUniversalResponse;
import com.unity3d.ads.core.domain.AndroidHandleOpenUrl;
import com.unity3d.ads.core.domain.AndroidHttpClientProvider;
import com.unity3d.ads.core.domain.AndroidInitializeBoldSDK;
import com.unity3d.ads.core.domain.AndroidLoad;
import com.unity3d.ads.core.domain.AndroidRefresh;
import com.unity3d.ads.core.domain.AndroidRemoveUrlQuery;
import com.unity3d.ads.core.domain.AndroidSendDiagnosticEvent;
import com.unity3d.ads.core.domain.AndroidSendWebViewClientErrorDiagnostics;
import com.unity3d.ads.core.domain.AndroidShow;
import com.unity3d.ads.core.domain.AndroidTestDataInfo;
import com.unity3d.ads.core.domain.AndroidTriggerInitializationCompletedRequest;
import com.unity3d.ads.core.domain.AwaitInitialization;
import com.unity3d.ads.core.domain.BuildHeaderBiddingToken;
import com.unity3d.ads.core.domain.CacheFile;
import com.unity3d.ads.core.domain.CacheWebViewAssets;
import com.unity3d.ads.core.domain.CheckForGameIdAndTestModeChanges;
import com.unity3d.ads.core.domain.CleanAssets;
import com.unity3d.ads.core.domain.CleanUpWhenOpportunityExpires;
import com.unity3d.ads.core.domain.CommonAwaitInitialization;
import com.unity3d.ads.core.domain.CommonCacheFile;
import com.unity3d.ads.core.domain.CommonCheckForGameIdAndTestModeChanges;
import com.unity3d.ads.core.domain.CommonCleanAssets;
import com.unity3d.ads.core.domain.CommonCreateFile;
import com.unity3d.ads.core.domain.CommonGetAdObject;
import com.unity3d.ads.core.domain.CommonGetAdPlayer;
import com.unity3d.ads.core.domain.CommonGetCacheDirectory;
import com.unity3d.ads.core.domain.CommonGetFileExtensionFromUrl;
import com.unity3d.ads.core.domain.CommonGetGameId;
import com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken;
import com.unity3d.ads.core.domain.CommonGetInitializationState;
import com.unity3d.ads.core.domain.CommonGetIsFileCache;
import com.unity3d.ads.core.domain.CommonGetWebViewBridgeUseCase;
import com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken;
import com.unity3d.ads.core.domain.CommonSafeCallbackInvoke;
import com.unity3d.ads.core.domain.CommonSetGameId;
import com.unity3d.ads.core.domain.CommonSetInitializationState;
import com.unity3d.ads.core.domain.CommonShouldAllowInitialization;
import com.unity3d.ads.core.domain.CommonTokenNumberProvider;
import com.unity3d.ads.core.domain.CommonValidateGameId;
import com.unity3d.ads.core.domain.CreateFile;
import com.unity3d.ads.core.domain.ExecuteAdViewerRequest;
import com.unity3d.ads.core.domain.GetAdDataRefreshRequest;
import com.unity3d.ads.core.domain.GetAdObject;
import com.unity3d.ads.core.domain.GetAdPlayer;
import com.unity3d.ads.core.domain.GetAdPlayerConfigRequest;
import com.unity3d.ads.core.domain.GetAdRequest;
import com.unity3d.ads.core.domain.GetAsyncHeaderBiddingToken;
import com.unity3d.ads.core.domain.GetByteStringId;
import com.unity3d.ads.core.domain.GetCacheDirectory;
import com.unity3d.ads.core.domain.GetCachedAsset;
import com.unity3d.ads.core.domain.GetClientInfo;
import com.unity3d.ads.core.domain.GetFileExtensionFromUrl;
import com.unity3d.ads.core.domain.GetGameId;
import com.unity3d.ads.core.domain.GetHeaderBiddingToken;
import com.unity3d.ads.core.domain.GetInitRequestPolicy;
import com.unity3d.ads.core.domain.GetInitializationCompletedRequest;
import com.unity3d.ads.core.domain.GetInitializationData;
import com.unity3d.ads.core.domain.GetInitializationRequest;
import com.unity3d.ads.core.domain.GetInitializationRequestPayload;
import com.unity3d.ads.core.domain.GetInitializationState;
import com.unity3d.ads.core.domain.GetIsFileCache;
import com.unity3d.ads.core.domain.GetLatestWebViewConfiguration;
import com.unity3d.ads.core.domain.GetLimitedSessionToken;
import com.unity3d.ads.core.domain.GetOpenGLRendererInfo;
import com.unity3d.ads.core.domain.GetOperativeEventRequestPolicy;
import com.unity3d.ads.core.domain.GetOtherRequestPolicy;
import com.unity3d.ads.core.domain.GetPrivacyUpdateRequest;
import com.unity3d.ads.core.domain.GetRequestPolicy;
import com.unity3d.ads.core.domain.GetSharedDataTimestamps;
import com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad;
import com.unity3d.ads.core.domain.GetUniversalRequestSharedData;
import com.unity3d.ads.core.domain.GetWebViewBridgeUseCase;
import com.unity3d.ads.core.domain.HandleGatewayAdResponse;
import com.unity3d.ads.core.domain.HandleGatewayInitializationResponse;
import com.unity3d.ads.core.domain.HandleGatewayUniversalResponse;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.ads.core.domain.HandleOpenUrl;
import com.unity3d.ads.core.domain.HttpClientProvider;
import com.unity3d.ads.core.domain.InitializeBoldSDK;
import com.unity3d.ads.core.domain.LegacyLoadUseCase;
import com.unity3d.ads.core.domain.LegacyShowUseCase;
import com.unity3d.ads.core.domain.Load;
import com.unity3d.ads.core.domain.Refresh;
import com.unity3d.ads.core.domain.RemoveUrlQuery;
import com.unity3d.ads.core.domain.SafeCallbackInvoke;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.domain.SendPrivacyUpdateRequest;
import com.unity3d.ads.core.domain.SendWebViewClientErrorDiagnostics;
import com.unity3d.ads.core.domain.SetGameId;
import com.unity3d.ads.core.domain.SetInitializationState;
import com.unity3d.ads.core.domain.ShouldAllowInitialization;
import com.unity3d.ads.core.domain.Show;
import com.unity3d.ads.core.domain.TokenNumberProvider;
import com.unity3d.ads.core.domain.TriggerInitializationCompletedRequest;
import com.unity3d.ads.core.domain.TriggerInitializeListener;
import com.unity3d.ads.core.domain.ValidateGameId;
import com.unity3d.ads.core.domain.attribution.AndroidAttribution;
import com.unity3d.ads.core.domain.events.AndroidGetTransactionData;
import com.unity3d.ads.core.domain.events.AndroidHandleGatewayEventResponse;
import com.unity3d.ads.core.domain.events.CommonGetTransactionRequest;
import com.unity3d.ads.core.domain.events.CommonUniversalRequestTtlValidator;
import com.unity3d.ads.core.domain.events.DiagnosticEventObserver;
import com.unity3d.ads.core.domain.events.EventObservers;
import com.unity3d.ads.core.domain.events.GetDiagnosticEventBatchRequest;
import com.unity3d.ads.core.domain.events.GetDiagnosticEventRequest;
import com.unity3d.ads.core.domain.events.GetOperativeEventApi;
import com.unity3d.ads.core.domain.events.GetOperativeEventRequest;
import com.unity3d.ads.core.domain.events.GetTransactionData;
import com.unity3d.ads.core.domain.events.GetTransactionRequest;
import com.unity3d.ads.core.domain.events.HandleGatewayEventResponse;
import com.unity3d.ads.core.domain.events.OperativeEventObserver;
import com.unity3d.ads.core.domain.events.TransactionEventObserver;
import com.unity3d.ads.core.domain.events.UniversalRequestEventSender;
import com.unity3d.ads.core.domain.events.UniversalRequestTtlValidator;
import com.unity3d.ads.core.domain.offerwall.GetIsOfferwallAdReady;
import com.unity3d.ads.core.domain.offerwall.LoadOfferwallAd;
import com.unity3d.ads.core.domain.p010om.AndroidInitializeOMSDK;
import com.unity3d.ads.core.domain.p010om.AndroidOmFinishSession;
import com.unity3d.ads.core.domain.p010om.AndroidOmImpressionOccurred;
import com.unity3d.ads.core.domain.p010om.AndroidOmInteraction;
import com.unity3d.ads.core.domain.p010om.AndroidOmStartSession;
import com.unity3d.ads.core.domain.p010om.CommonGetOmData;
import com.unity3d.ads.core.domain.p010om.CommonIsOMActivated;
import com.unity3d.ads.core.domain.p010om.GetOmData;
import com.unity3d.ads.core.domain.p010om.InitializeOMSDK;
import com.unity3d.ads.core.domain.p010om.IsOMActivated;
import com.unity3d.ads.core.domain.p010om.OmFinishSession;
import com.unity3d.ads.core.domain.p010om.OmImpressionOccurred;
import com.unity3d.ads.core.domain.privacy.DeveloperConsentFlattenerRulesUseCase;
import com.unity3d.ads.core.domain.privacy.FlattenerRulesUseCase;
import com.unity3d.ads.core.domain.privacy.LegacyUserConsentFlattenerRulesUseCase;
import com.unity3d.ads.core.domain.scar.AndroidFetchSignalsAndSendUseCase;
import com.unity3d.ads.core.domain.scar.CommonScarEventReceiver;
import com.unity3d.ads.core.domain.scar.FetchSignalsAndSendUseCase;
import com.unity3d.ads.core.domain.scar.GetAndroidTokenEventRequest;
import com.unity3d.ads.core.domain.scar.GetHbTokenEventRequest;
import com.unity3d.ads.core.domain.scar.HandleAndroidGetTokenRequest;
import com.unity3d.ads.core.domain.scar.HandleGetTokenRequest;
import com.unity3d.ads.core.domain.scar.LoadScarAd;
import com.unity3d.ads.core.domain.scar.ScarTimeHackFixer;
import com.unity3d.ads.core.domain.work.BackgroundWorker;
import com.unity3d.ads.core.domain.work.DiagnosticEventRequestWorkModifier;
import com.unity3d.ads.core.domain.work.DownloadPriorityQueue;
import com.unity3d.ads.core.utils.CommonCoroutineTimer;
import com.unity3d.ads.core.utils.CoroutineTimer;
import com.unity3d.ads.datastore.ByteStringStoreOuterClass;
import com.unity3d.ads.datastore.UniversalRequestStoreOuterClass;
import com.unity3d.ads.datastore.WebviewConfigurationStore;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import com.unity3d.ads.gatewayclient.GatewayClient;
import com.unity3d.services.SDKErrorHandler;
import com.unity3d.services.ads.gmascar.GMA;
import com.unity3d.services.ads.gmascar.GMAScarAdapterBridge;
import com.unity3d.services.ads.gmascar.utils.GMAEventSender;
import com.unity3d.services.ads.measurements.MeasurementsService;
import com.unity3d.services.ads.offerwall.OfferwallAdapterBridge;
import com.unity3d.services.ads.token.AsyncTokenStorage;
import com.unity3d.services.ads.token.InMemoryTokenStorage;
import com.unity3d.services.ads.token.TokenStorage;
import com.unity3d.services.ads.topics.TopicsService;
import com.unity3d.services.core.configuration.ConfigurationReader;
import com.unity3d.services.core.device.VolumeChange;
import com.unity3d.services.core.device.VolumeChangeContentObserver;
import com.unity3d.services.core.device.VolumeChangeMonitor;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.domain.task.ConfigFileFromLocalStorage;
import com.unity3d.services.core.domain.task.InitializeSDK;
import com.unity3d.services.core.domain.task.InitializeStateComplete;
import com.unity3d.services.core.domain.task.InitializeStateConfig;
import com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader;
import com.unity3d.services.core.domain.task.InitializeStateCreate;
import com.unity3d.services.core.domain.task.InitializeStateError;
import com.unity3d.services.core.domain.task.InitializeStateLoadCache;
import com.unity3d.services.core.domain.task.InitializeStateLoadWeb;
import com.unity3d.services.core.domain.task.InitializeStateNetworkError;
import com.unity3d.services.core.domain.task.InitializeStateReset;
import com.unity3d.services.core.fid.Constants;
import com.unity3d.services.core.misc.JsonStorage;
import com.unity3d.services.core.network.core.CronetEngineBuilderFactory;
import com.unity3d.services.core.network.core.HttpClient;
import com.unity3d.services.core.network.domain.CleanupDirectory;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.request.metrics.SDKMetricsSender;
import com.unity3d.services.core.webview.bridge.IEventSender;
import com.unity3d.services.core.webview.bridge.SharedInstances;
import com.unity3d.services.store.StoreMonitor;
import com.unity3d.services.store.StoreWebViewEventSender;
import com.unity3d.services.store.core.GatewayStoreExceptionHandler;
import com.unity3d.services.store.core.StoreEventListenerFactory;
import com.unity3d.services.store.core.StoreExceptionHandler;
import gatewayprotocol.p014v1.NativeConfigurationOuterClass;
import kotlin.jvm.internal.OooOo;
import kotlin.jvm.internal.Oooo000;
import kotlin.jvm.internal.o0OO00O;
import o00O0.o000OOo;
import o00O0O0O.OooO0OO;
import o00O0O0O.OooOOO;
import o00O0O0o.OooOo00;
import o00O0OO0.OooO;
import o00O0OO0.OooOOOO;
import o00O0Oo.OooO0O0;
import o00O0Oo.o00O0O;
import o00O0oOo.o0000O0;
import o00O0oOo.o0000O00;
import o00O0oOo.o0000OO0;
import o00O0oOo.o000OO;
import o00O0oOo.o00O0O00;

/* loaded from: classes3.dex */
public final class ServiceProvider implements IServiceProvider {
    public static final String CDN_CREATIVES_HOST = "cdn-creatives-cf-prd.acquire.unity3dusercontent.com";
    public static final int CDN_CREATIVES_PORT = 443;
    public static final String DATA_STORE_GATEWAY_CACHE = "gateway_cache.pb";
    public static final String DATA_STORE_GL_INFO = "glinfo.pb";
    public static final String DATA_STORE_IAP_TRANSACTION = "iap_transaction.pb";
    public static final String DATA_STORE_NATIVE_CONFIG = "native_configuration.pb";
    public static final String DATA_STORE_PRIVACY = "privacy.pb";
    public static final String DATA_STORE_PRIVACY_FSM = "privacy_fsm.pb";
    public static final String DATA_STORE_UNIVERSAL_REQUEST = "universal_request.pb";
    public static final String DATA_STORE_WEBVIEW_CONFIG = "webview_config.pb";
    public static final String DEFAULT_DISPATCHER = "default_dispatcher";
    public static final String DEV_CONSENT_PRIVACY_RULES = "dev_consent_privacy_rules";
    public static final String GATEWAY_HOST = "gateway.unityads.unity3d.com";
    public static final int GATEWAY_PORT = 443;
    public static final long HTTP_CACHE_DISK_SIZE = 20971520;
    public static final long HTTP_CLIENT_FETCH_TIMEOUT = 500;
    public static final ServiceProvider INSTANCE;
    public static final String IO_DISPATCHER = "io_dispatcher";
    public static final String LEGACY_PRIVACY_RULES = "legacy_privacy_rules";
    public static final String MAIN_DISPATCHER = "main_dispatcher";
    public static final String NAMED_AD_REQ = "ad_req";
    public static final String NAMED_GATEWAY_HTTP_CLIENT = "gateway_http_client";
    public static final String NAMED_GET_TOKEN_SCOPE = "get_token_scope";
    public static final String NAMED_INIT_REQ = "init_req";
    public static final String NAMED_INIT_SCOPE = "init_scope";
    public static final String NAMED_LOAD_SCOPE = "load_scope";
    public static final String NAMED_LOCAL = "local";
    public static final String NAMED_OFFERWALL_SCOPE = "offerwall_scope";
    public static final String NAMED_OMID_SCOPE = "omid_scope";
    public static final String NAMED_OPERATIVE_REQ = "op_event_req";
    public static final String NAMED_OTHER_REQ = "other_req";
    public static final String NAMED_PUBLIC_JOB = "public_job";
    public static final String NAMED_REMOTE = "remote";
    public static final String NAMED_SCAR_SCOPE = "scar_scope";
    public static final String NAMED_SDK = "sdk";
    public static final String NAMED_SHOW_SCOPE = "show_scope";
    public static final String NAMED_TRANSACTION_SCOPE = "transaction_scope";
    public static final String PREF_GL_INFO = "glinfo";
    public static final long SCAR_SIGNALS_FETCH_TIMEOUT = 50000;
    public static final long SCAR_VERSION_FETCH_TIMEOUT = 5000;
    private static final IServicesRegistry serviceRegistry;

    /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1 */
    public static final class C43181 extends Oooo000 implements o00O0Oo.Oooo000 {
        public static final C43181 INSTANCE = new C43181();

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$1 */
        public static final class AnonymousClass1 extends Oooo000 implements OooO0O0 {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            public AnonymousClass1() {
                super(0);
            }

            @Override // o00O0Oo.OooO0O0
            public final Context invoke() {
                return ClientProperties.getApplicationContext();
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$10 */
        public static final class AnonymousClass10 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ UnityAdsModule $moduleInstance;
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass10(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
                super(0);
                this.$moduleInstance = unityAdsModule;
                this.$this_registry = servicesRegistry;
            }

            @Override // o00O0Oo.OooO0O0
            public final o000OO invoke() {
                return this.$moduleInstance.transactionCoroutineScope((ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(ISDKDispatchers.class))), (o0000O0) this.$this_registry.resolveService(new ServiceKey("sdk", o0OO00O.OooO00o(o0000O0.class))), (o00O0O00) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_PUBLIC_JOB, o0OO00O.OooO00o(o00O0O00.class))));
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$100 */
        public static final class AnonymousClass100 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass100(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // o00O0Oo.OooO0O0
            public final SetInitializationState invoke() {
                return new CommonSetInitializationState((SessionRepository) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(SessionRepository.class))), (SDKPropertiesManager) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(SDKPropertiesManager.class))));
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$101 */
        public static final class AnonymousClass101 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass101(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // o00O0Oo.OooO0O0
            public final GetRequestPolicy invoke() {
                return new AndroidGetAdRequestPolicy((SessionRepository) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(SessionRepository.class))));
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$102 */
        public static final class AnonymousClass102 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass102(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // o00O0Oo.OooO0O0
            public final GetAdDataRefreshRequest invoke() {
                return new AndroidGetAdDataRefreshRequest((GetUniversalRequestForPayLoad) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(GetUniversalRequestForPayLoad.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(SessionRepository.class))), (DeviceInfoRepository) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(DeviceInfoRepository.class))), (CampaignRepository) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(CampaignRepository.class))));
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$103 */
        public static final class AnonymousClass103 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass103(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // o00O0Oo.OooO0O0
            public final GetAdPlayerConfigRequest invoke() {
                return new AndroidGetAdPlayerConfigRequest((GetUniversalRequestForPayLoad) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(GetUniversalRequestForPayLoad.class))));
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$104 */
        public static final class AnonymousClass104 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass104(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // o00O0Oo.OooO0O0
            public final AndroidGetAdPlayerContext invoke() {
                return new AndroidGetAdPlayerContext((DeviceInfoRepository) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(DeviceInfoRepository.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(SessionRepository.class))));
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$105 */
        public static final class AnonymousClass105 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass105(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // o00O0Oo.OooO0O0
            public final GetAdRequest invoke() {
                return new AndroidGetAdRequest((GetUniversalRequestForPayLoad) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(GetUniversalRequestForPayLoad.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(SessionRepository.class))), (DeviceInfoRepository) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(DeviceInfoRepository.class))), (CampaignRepository) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(CampaignRepository.class))), (WebviewConfigurationDataSource) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(WebviewConfigurationDataSource.class))), (TcfRepository) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(TcfRepository.class))));
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$106 */
        public static final class AnonymousClass106 extends Oooo000 implements OooO0O0 {
            public static final AnonymousClass106 INSTANCE = new AnonymousClass106();

            public AnonymousClass106() {
                super(0);
            }

            @Override // o00O0Oo.OooO0O0
            public final GetHbTokenEventRequest invoke() {
                return new GetAndroidTokenEventRequest();
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$107 */
        public static final class AnonymousClass107 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass107(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // o00O0Oo.OooO0O0
            public final CommonScarEventReceiver invoke() {
                return new CommonScarEventReceiver((o000OO) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_SCAR_SCOPE, o0OO00O.OooO00o(o000OO.class))));
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$108 */
        public static final class AnonymousClass108 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass108(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // o00O0Oo.OooO0O0
            public final GMAScarAdapterBridge invoke() {
                GMAScarAdapterBridge bridge = GMA.getInstance(new GMAEventSender((IEventSender) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(CommonScarEventReceiver.class))))).getBridge();
                OooOo.OooO0Oo(bridge, "getInstance(GMAEventSend…EventReceiver>())).bridge");
                return bridge;
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$109 */
        public static final class AnonymousClass109 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass109(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // o00O0Oo.OooO0O0
            public final ScarTimeHackFixer invoke() {
                return new ScarTimeHackFixer((SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(SendDiagnosticEvent.class))));
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$11 */
        public static final class AnonymousClass11 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ UnityAdsModule $moduleInstance;
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass11(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
                super(0);
                this.$moduleInstance = unityAdsModule;
                this.$this_registry = servicesRegistry;
            }

            @Override // o00O0Oo.OooO0O0
            public final o000OO invoke() {
                return this.$moduleInstance.getTokenCoroutineScope((ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(ISDKDispatchers.class))), (o0000O0) this.$this_registry.resolveService(new ServiceKey("sdk", o0OO00O.OooO00o(o0000O0.class))), (o00O0O00) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_PUBLIC_JOB, o0OO00O.OooO00o(o00O0O00.class))));
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$110 */
        public static final class AnonymousClass110 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass110(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // o00O0Oo.OooO0O0
            public final ScarManager invoke() {
                return new AndroidScarManager((CommonScarEventReceiver) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(CommonScarEventReceiver.class))), (GMAScarAdapterBridge) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(GMAScarAdapterBridge.class))), (ScarTimeHackFixer) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(ScarTimeHackFixer.class))));
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$111 */
        public static final class AnonymousClass111 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass111(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // o00O0Oo.OooO0O0
            public final FetchSignalsAndSendUseCase invoke() {
                return new AndroidFetchSignalsAndSendUseCase((o000OO) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_SCAR_SCOPE, o0OO00O.OooO00o(o000OO.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(SessionRepository.class))), (ScarManager) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(ScarManager.class))), (HandleGetTokenRequest) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(HandleGetTokenRequest.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(SendDiagnosticEvent.class))));
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$112 */
        public static final class AnonymousClass112 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass112(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // o00O0Oo.OooO0O0
            public final LoadScarAd invoke() {
                return new LoadScarAd((ScarManager) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(ScarManager.class))));
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$113 */
        public static final class AnonymousClass113 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass113(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // o00O0Oo.OooO0O0
            public final HandleGetTokenRequest invoke() {
                return new HandleAndroidGetTokenRequest((GetUniversalRequestForPayLoad) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(GetUniversalRequestForPayLoad.class))), (GetHbTokenEventRequest) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(GetHbTokenEventRequest.class))), (GetRequestPolicy) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_OTHER_REQ, o0OO00O.OooO00o(GetRequestPolicy.class))), (GatewayClient) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(GatewayClient.class))));
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$114 */
        public static final class AnonymousClass114 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass114(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // o00O0Oo.OooO0O0
            public final GetClientInfo invoke() {
                return new AndroidGetClientInfo((SessionRepository) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(SessionRepository.class))), (MediationRepository) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(MediationRepository.class))), (OmidManager) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(OmidManager.class))), (ScarManager) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(ScarManager.class))), (OfferwallManager) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(OfferwallManager.class))), (FIdExistenceDataSource) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(FIdExistenceDataSource.class))));
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$115 */
        public static final class AnonymousClass115 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass115(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // o00O0Oo.OooO0O0
            public final GetInitializationCompletedRequest invoke() {
                return new AndroidGetInitializationCompletedRequest((GetUniversalRequestForPayLoad) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(GetUniversalRequestForPayLoad.class))), (DeviceInfoRepository) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(DeviceInfoRepository.class))));
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$116 */
        public static final class AnonymousClass116 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass116(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // o00O0Oo.OooO0O0
            public final GetInitializationRequest invoke() {
                return new AndroidGetInitializationRequest((GetInitializationRequestPayload) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(GetInitializationRequestPayload.class))), (GetUniversalRequestForPayLoad) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(GetUniversalRequestForPayLoad.class))));
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$117 */
        public static final class AnonymousClass117 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass117(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // o00O0Oo.OooO0O0
            public final GetLimitedSessionToken invoke() {
                return new AndroidGetLimitedSessionToken((DeviceInfoRepository) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(DeviceInfoRepository.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(SessionRepository.class))), (MediationRepository) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(MediationRepository.class))));
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$118 */
        public static final class AnonymousClass118 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass118(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // o00O0Oo.OooO0O0
            public final GetOpenGLRendererInfo invoke() {
                return new AndroidGetOpenGLRendererInfo((SessionRepository) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(SessionRepository.class))));
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$119 */
        public static final class AnonymousClass119 extends Oooo000 implements OooO0O0 {
            public static final AnonymousClass119 INSTANCE = new AnonymousClass119();

            public AnonymousClass119() {
                super(0);
            }

            @Override // o00O0Oo.OooO0O0
            public final GetSharedDataTimestamps invoke() {
                return new AndroidGetSharedDataTimestamps();
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$12 */
        public static final class AnonymousClass12 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ UnityAdsModule $moduleInstance;
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass12(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
                super(0);
                this.$moduleInstance = unityAdsModule;
                this.$this_registry = servicesRegistry;
            }

            @Override // o00O0Oo.OooO0O0
            public final o000OO invoke() {
                return this.$moduleInstance.scarSignalsCoroutineScope((ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(ISDKDispatchers.class))), (o0000O0) this.$this_registry.resolveService(new ServiceKey("sdk", o0OO00O.OooO00o(o0000O0.class))), (o00O0O00) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_PUBLIC_JOB, o0OO00O.OooO00o(o00O0O00.class))));
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$120 */
        public static final class AnonymousClass120 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass120(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // o00O0Oo.OooO0O0
            public final GetUniversalRequestForPayLoad invoke() {
                return new AndroidGetUniversalRequestForPayLoad((GetUniversalRequestSharedData) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(GetUniversalRequestSharedData.class))));
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$121 */
        public static final class AnonymousClass121 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass121(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // o00O0Oo.OooO0O0
            public final GetUniversalRequestSharedData invoke() {
                return new AndroidGetUniversalRequestSharedData((GetSharedDataTimestamps) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(GetSharedDataTimestamps.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(SessionRepository.class))), (DeviceInfoRepository) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(DeviceInfoRepository.class))), (GetLimitedSessionToken) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(GetLimitedSessionToken.class))), (DeveloperConsentRepository) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(DeveloperConsentRepository.class))));
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$122 */
        public static final class AnonymousClass122 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass122(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // o00O0Oo.OooO0O0
            public final GetCachedAsset invoke() {
                return new GetCachedAsset((CacheRepository) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(CacheRepository.class))), (Context) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(Context.class))), (CacheWebViewAssets) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(CacheWebViewAssets.class))));
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$123 */
        public static final class AnonymousClass123 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass123(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // o00O0Oo.OooO0O0
            public final GetWebViewBridgeUseCase invoke() {
                return new CommonGetWebViewBridgeUseCase((o0000O00) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, o0OO00O.OooO00o(o0000O00.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(SendDiagnosticEvent.class))));
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$124 */
        public static final class AnonymousClass124 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass124(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // o00O0Oo.OooO0O0
            public final GetRequestPolicy invoke() {
                return new GetInitRequestPolicy((SessionRepository) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(SessionRepository.class))));
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$125 */
        public static final class AnonymousClass125 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass125(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // o00O0Oo.OooO0O0
            public final GetLatestWebViewConfiguration invoke() {
                return new GetLatestWebViewConfiguration((WebviewConfigurationDataSource) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(WebviewConfigurationDataSource.class))));
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$126 */
        public static final class AnonymousClass126 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass126(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // o00O0Oo.OooO0O0
            public final GetRequestPolicy invoke() {
                return new GetOperativeEventRequestPolicy((SessionRepository) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(SessionRepository.class))));
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$127 */
        public static final class AnonymousClass127 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass127(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // o00O0Oo.OooO0O0
            public final GetRequestPolicy invoke() {
                return new GetOtherRequestPolicy((SessionRepository) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(SessionRepository.class))));
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$128 */
        public static final class AnonymousClass128 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass128(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // o00O0Oo.OooO0O0
            public final GetPrivacyUpdateRequest invoke() {
                return new GetPrivacyUpdateRequest((GetUniversalRequestForPayLoad) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(GetUniversalRequestForPayLoad.class))));
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$129 */
        public static final class AnonymousClass129 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass129(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // o00O0Oo.OooO0O0
            public final HandleGatewayInitializationResponse invoke() {
                return new AndroidHandleGatewayInitializationResponse((TransactionEventManager) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(TransactionEventManager.class))), (TriggerInitializationCompletedRequest) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(TriggerInitializationCompletedRequest.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(SessionRepository.class))), (o000OO) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_INIT_SCOPE, o0OO00O.OooO00o(o000OO.class))));
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$13 */
        public static final class AnonymousClass13 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ UnityAdsModule $moduleInstance;
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass13(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
                super(0);
                this.$moduleInstance = unityAdsModule;
                this.$this_registry = servicesRegistry;
            }

            @Override // o00O0Oo.OooO0O0
            public final o000OO invoke() {
                return this.$moduleInstance.offerwallSignalsCoroutineScope((ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(ISDKDispatchers.class))), (o0000O0) this.$this_registry.resolveService(new ServiceKey("sdk", o0OO00O.OooO00o(o0000O0.class))), (o00O0O00) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_PUBLIC_JOB, o0OO00O.OooO00o(o00O0O00.class))));
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$130 */
        public static final class AnonymousClass130 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass130(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // o00O0Oo.OooO0O0
            public final HandleGatewayUniversalResponse invoke() {
                return new AndroidHandleGatewayUniversalResponse((SessionRepository) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(SessionRepository.class))), (DeviceInfoRepository) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(DeviceInfoRepository.class))));
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$131 */
        public static final class AnonymousClass131 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass131(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // o00O0Oo.OooO0O0
            public final InitializeBoldSDK invoke() {
                return new AndroidInitializeBoldSDK((o0000O00) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, o0OO00O.OooO00o(o0000O00.class))), (InitializeOMSDK) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(InitializeOMSDK.class))), (GetInitializationRequest) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(GetInitializationRequest.class))), (GetRequestPolicy) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_INIT_REQ, o0OO00O.OooO00o(GetRequestPolicy.class))), (CleanAssets) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(CleanAssets.class))), (HandleGatewayInitializationResponse) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(HandleGatewayInitializationResponse.class))), (GatewayClient) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(GatewayClient.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(SessionRepository.class))), (EventObservers) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(EventObservers.class))), (TriggerInitializeListener) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(TriggerInitializeListener.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(SendDiagnosticEvent.class))), (DiagnosticEventRepository) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(DiagnosticEventRepository.class))), (StorageManager) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(StorageManager.class))), (ConfigurationReader) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(ConfigurationReader.class))), (SDKPropertiesManager) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(SDKPropertiesManager.class))), (GetGameId) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(GetGameId.class))), (AndroidHandleFocusCounters) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(AndroidHandleFocusCounters.class))));
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$132 */
        public static final class AnonymousClass132 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass132(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // o00O0Oo.OooO0O0
            public final LegacyShowUseCase invoke() {
                return new LegacyShowUseCase((Show) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(Show.class))), (AdRepository) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(AdRepository.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(SendDiagnosticEvent.class))), (GetOperativeEventApi) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(GetOperativeEventApi.class))), (GetInitializationState) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(GetInitializationState.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(SessionRepository.class))), (SafeCallbackInvoke) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(SafeCallbackInvoke.class))));
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$133 */
        public static final class AnonymousClass133 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass133(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // o00O0Oo.OooO0O0
            public final SendPrivacyUpdateRequest invoke() {
                return new SendPrivacyUpdateRequest((GetPrivacyUpdateRequest) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(GetPrivacyUpdateRequest.class))), (GetRequestPolicy) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_OTHER_REQ, o0OO00O.OooO00o(GetRequestPolicy.class))), (GatewayClient) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(GatewayClient.class))));
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$134 */
        public static final class AnonymousClass134 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass134(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // o00O0Oo.OooO0O0
            public final TriggerInitializationCompletedRequest invoke() {
                return new AndroidTriggerInitializationCompletedRequest((GetInitializationCompletedRequest) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(GetInitializationCompletedRequest.class))), (GetRequestPolicy) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_INIT_REQ, o0OO00O.OooO00o(GetRequestPolicy.class))), (GatewayClient) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(GatewayClient.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(SendDiagnosticEvent.class))));
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$135 */
        public static final class AnonymousClass135 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass135(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // o00O0Oo.OooO0O0
            public final TriggerInitializeListener invoke() {
                return new TriggerInitializeListener((o0000O00) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.MAIN_DISPATCHER, o0OO00O.OooO00o(o0000O00.class))));
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$136 */
        public static final class AnonymousClass136 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass136(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // o00O0Oo.OooO0O0
            public final DiagnosticEventObserver invoke() {
                return new DiagnosticEventObserver((GetUniversalRequestForPayLoad) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(GetUniversalRequestForPayLoad.class))), (GetDiagnosticEventBatchRequest) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(GetDiagnosticEventBatchRequest.class))), (o0000O00) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, o0OO00O.OooO00o(o0000O00.class))), (DiagnosticEventRepository) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(DiagnosticEventRepository.class))), (UniversalRequestDataSource) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(UniversalRequestDataSource.class))), (BackgroundWorker) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(BackgroundWorker.class))));
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$137 */
        public static final class AnonymousClass137 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass137(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // o00O0Oo.OooO0O0
            public final EventObservers invoke() {
                return new EventObservers((OperativeEventObserver) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(OperativeEventObserver.class))), (DiagnosticEventObserver) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(DiagnosticEventObserver.class))), (TransactionEventObserver) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(TransactionEventObserver.class))));
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$138 */
        public static final class AnonymousClass138 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass138(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // o00O0Oo.OooO0O0
            public final GetTransactionData invoke() {
                return new AndroidGetTransactionData((GetByteStringId) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(GetByteStringId.class))));
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$139 */
        public static final class AnonymousClass139 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass139(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // o00O0Oo.OooO0O0
            public final GetTransactionRequest invoke() {
                return new CommonGetTransactionRequest((DeviceInfoRepository) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(DeviceInfoRepository.class))));
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$14 */
        public static final class AnonymousClass14 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ UnityAdsModule $moduleInstance;
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass14(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
                super(0);
                this.$moduleInstance = unityAdsModule;
                this.$this_registry = servicesRegistry;
            }

            @Override // o00O0Oo.OooO0O0
            public final o000OO invoke() {
                return this.$moduleInstance.omidCoroutineScope((ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(ISDKDispatchers.class))), (o0000O0) this.$this_registry.resolveService(new ServiceKey("sdk", o0OO00O.OooO00o(o0000O0.class))), (o00O0O00) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_PUBLIC_JOB, o0OO00O.OooO00o(o00O0O00.class))));
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$140 */
        public static final class AnonymousClass140 extends Oooo000 implements OooO0O0 {
            public static final AnonymousClass140 INSTANCE = new AnonymousClass140();

            public AnonymousClass140() {
                super(0);
            }

            @Override // o00O0Oo.OooO0O0
            public final GetDiagnosticEventBatchRequest invoke() {
                return new GetDiagnosticEventBatchRequest();
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$141 */
        public static final class AnonymousClass141 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass141(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // o00O0Oo.OooO0O0
            public final GetDiagnosticEventRequest invoke() {
                return new GetDiagnosticEventRequest((GetSharedDataTimestamps) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(GetSharedDataTimestamps.class))));
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$142 */
        public static final class AnonymousClass142 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass142(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // o00O0Oo.OooO0O0
            public final GetOperativeEventApi invoke() {
                return new GetOperativeEventApi((OperativeEventRepository) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(OperativeEventRepository.class))), (GetOperativeEventRequest) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(GetOperativeEventRequest.class))));
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$143 */
        public static final class AnonymousClass143 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass143(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // o00O0Oo.OooO0O0
            public final GetOperativeEventRequest invoke() {
                return new GetOperativeEventRequest((GetByteStringId) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(GetByteStringId.class))), (DeviceInfoRepository) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(DeviceInfoRepository.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(SessionRepository.class))), (CampaignRepository) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(CampaignRepository.class))));
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$144 */
        public static final class AnonymousClass144 extends Oooo000 implements OooO0O0 {
            public static final AnonymousClass144 INSTANCE = new AnonymousClass144();

            public AnonymousClass144() {
                super(0);
            }

            @Override // o00O0Oo.OooO0O0
            public final HandleGatewayEventResponse invoke() {
                return new AndroidHandleGatewayEventResponse();
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$145 */
        public static final class AnonymousClass145 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass145(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // o00O0Oo.OooO0O0
            public final OperativeEventObserver invoke() {
                return new OperativeEventObserver((GetUniversalRequestForPayLoad) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(GetUniversalRequestForPayLoad.class))), (o0000O00) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, o0OO00O.OooO00o(o0000O00.class))), (OperativeEventRepository) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(OperativeEventRepository.class))), (UniversalRequestDataSource) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(UniversalRequestDataSource.class))), (BackgroundWorker) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(BackgroundWorker.class))));
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$146 */
        public static final class AnonymousClass146 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass146(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // o00O0Oo.OooO0O0
            public final TransactionEventObserver invoke() {
                return new TransactionEventObserver((GetUniversalRequestForPayLoad) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(GetUniversalRequestForPayLoad.class))), (o0000O00) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, o0OO00O.OooO00o(o0000O00.class))), (TransactionEventRepository) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(TransactionEventRepository.class))), (GatewayClient) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(GatewayClient.class))), (GetRequestPolicy) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_OTHER_REQ, o0OO00O.OooO00o(GetRequestPolicy.class))), (ByteStringDataSource) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_IAP_TRANSACTION, o0OO00O.OooO00o(ByteStringDataSource.class))));
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$147 */
        public static final class AnonymousClass147 extends Oooo000 implements OooO0O0 {
            public static final AnonymousClass147 INSTANCE = new AnonymousClass147();

            public AnonymousClass147() {
                super(0);
            }

            @Override // o00O0Oo.OooO0O0
            public final UniversalRequestTtlValidator invoke() {
                return new CommonUniversalRequestTtlValidator();
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$148 */
        public static final class AnonymousClass148 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass148(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // o00O0Oo.OooO0O0
            public final UniversalRequestEventSender invoke() {
                return new UniversalRequestEventSender((GatewayClient) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(GatewayClient.class))), (HandleGatewayEventResponse) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(HandleGatewayEventResponse.class))), (UniversalRequestTtlValidator) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(UniversalRequestTtlValidator.class))));
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$149 */
        public static final class AnonymousClass149 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass149(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // o00O0Oo.OooO0O0
            public final OmFinishSession invoke() {
                return new AndroidOmFinishSession((OpenMeasurementRepository) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(OpenMeasurementRepository.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(SendDiagnosticEvent.class))));
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$15 */
        public static final class AnonymousClass15 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ UnityAdsModule $moduleInstance;
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass15(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
                super(0);
                this.$moduleInstance = unityAdsModule;
                this.$this_registry = servicesRegistry;
            }

            @Override // o00O0Oo.OooO0O0
            public final o00O0O00 invoke() {
                return this.$moduleInstance.publicApiJob((DiagnosticEventRepository) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(DiagnosticEventRepository.class))));
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$150 */
        public static final class AnonymousClass150 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass150(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // o00O0Oo.OooO0O0
            public final OmImpressionOccurred invoke() {
                return new AndroidOmImpressionOccurred((OpenMeasurementRepository) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(OpenMeasurementRepository.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(SendDiagnosticEvent.class))));
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$151 */
        public static final class AnonymousClass151 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass151(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // o00O0Oo.OooO0O0
            public final AndroidOmInteraction invoke() {
                return new AndroidOmStartSession((OpenMeasurementRepository) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(OpenMeasurementRepository.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(SendDiagnosticEvent.class))));
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$152 */
        public static final class AnonymousClass152 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass152(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // o00O0Oo.OooO0O0
            public final GetOmData invoke() {
                return new CommonGetOmData((OpenMeasurementRepository) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(OpenMeasurementRepository.class))));
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$153 */
        public static final class AnonymousClass153 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass153(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // o00O0Oo.OooO0O0
            public final IsOMActivated invoke() {
                return new CommonIsOMActivated((OpenMeasurementRepository) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(OpenMeasurementRepository.class))));
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$154 */
        public static final class AnonymousClass154 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass154(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // o00O0Oo.OooO0O0
            public final InitializeOMSDK invoke() {
                return new AndroidInitializeOMSDK((Context) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(Context.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(SendDiagnosticEvent.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(SessionRepository.class))), (OpenMeasurementRepository) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(OpenMeasurementRepository.class))));
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$155 */
        public static final class AnonymousClass155 extends Oooo000 implements OooO0O0 {
            public static final AnonymousClass155 INSTANCE = new AnonymousClass155();

            public AnonymousClass155() {
                super(0);
            }

            @Override // o00O0Oo.OooO0O0
            public final FlattenerRulesUseCase invoke() {
                return new DeveloperConsentFlattenerRulesUseCase();
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$156 */
        public static final class AnonymousClass156 extends Oooo000 implements OooO0O0 {
            public static final AnonymousClass156 INSTANCE = new AnonymousClass156();

            public AnonymousClass156() {
                super(0);
            }

            @Override // o00O0Oo.OooO0O0
            public final FlattenerRulesUseCase invoke() {
                return new LegacyUserConsentFlattenerRulesUseCase();
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$157 */
        public static final class AnonymousClass157 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass157(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // o00O0Oo.OooO0O0
            public final BackgroundWorker invoke() {
                return new BackgroundWorker((Context) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(Context.class))));
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$158 */
        public static final class AnonymousClass158 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass158(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // o00O0Oo.OooO0O0
            public final DiagnosticEventRequestWorkModifier invoke() {
                return new DiagnosticEventRequestWorkModifier((SessionRepository) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(SessionRepository.class))), (LifecycleDataSource) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(LifecycleDataSource.class))));
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$159 */
        public static final class AnonymousClass159 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass159(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // o00O0Oo.OooO0O0
            public final GatewayClient invoke() {
                return new CommonGatewayClient((HttpClient) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_GATEWAY_HTTP_CLIENT, o0OO00O.OooO00o(HttpClient.class))), (HandleGatewayUniversalResponse) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(HandleGatewayUniversalResponse.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(SendDiagnosticEvent.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(SessionRepository.class))));
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$16 */
        public static final class AnonymousClass16 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass16(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // o00O0Oo.OooO0O0
            public final ByteStringDataSource invoke() {
                return new AndroidLegacyConfigStoreDataSource((StorageManager) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(StorageManager.class))));
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$160 */
        public static final class AnonymousClass160 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass160(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // o00O0Oo.OooO0O0
            public final o0000O0 invoke() {
                return new SDKErrorHandler((o0000O00) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.IO_DISPATCHER, o0OO00O.OooO00o(o0000O00.class))), (AlternativeFlowReader) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(AlternativeFlowReader.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(SendDiagnosticEvent.class))), (SDKMetricsSender) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(SDKMetricsSender.class))));
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$161 */
        public static final class AnonymousClass161 extends Oooo000 implements OooO0O0 {
            public static final AnonymousClass161 INSTANCE = new AnonymousClass161();

            public AnonymousClass161() {
                super(0);
            }

            @Override // o00O0Oo.OooO0O0
            public final TokenStorage invoke() {
                return new InMemoryTokenStorage();
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$162 */
        public static final class AnonymousClass162 extends Oooo000 implements OooO0O0 {
            public static final AnonymousClass162 INSTANCE = new AnonymousClass162();

            public AnonymousClass162() {
                super(0);
            }

            @Override // o00O0Oo.OooO0O0
            public final VolumeChange invoke() {
                return new VolumeChangeContentObserver();
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$163 */
        public static final class AnonymousClass163 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass163(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // o00O0Oo.OooO0O0
            public final ConfigFileFromLocalStorage invoke() {
                return new ConfigFileFromLocalStorage((ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(ISDKDispatchers.class))));
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$164 */
        public static final class AnonymousClass164 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass164(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // o00O0Oo.OooO0O0
            public final InitializeSDK invoke() {
                return new InitializeSDK((ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(ISDKDispatchers.class))), (ConfigFileFromLocalStorage) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(ConfigFileFromLocalStorage.class))), (InitializeStateReset) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(InitializeStateReset.class))), (InitializeStateError) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(InitializeStateError.class))), (InitializeStateConfig) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(InitializeStateConfig.class))), (InitializeStateCreate) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(InitializeStateCreate.class))), (InitializeStateLoadCache) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(InitializeStateLoadCache.class))), (InitializeStateLoadWeb) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(InitializeStateLoadWeb.class))), (InitializeStateComplete) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(InitializeStateComplete.class))));
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$165 */
        public static final class AnonymousClass165 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass165(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // o00O0Oo.OooO0O0
            public final InitializeStateComplete invoke() {
                return new InitializeStateComplete((ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(ISDKDispatchers.class))));
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$166 */
        public static final class AnonymousClass166 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass166(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // o00O0Oo.OooO0O0
            public final InitializeStateConfig invoke() {
                return new InitializeStateConfig((ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(ISDKDispatchers.class))), (InitializeStateConfigWithLoader) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(InitializeStateConfigWithLoader.class))));
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$167 */
        public static final class AnonymousClass167 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass167(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // o00O0Oo.OooO0O0
            public final InitializeStateConfigWithLoader invoke() {
                return new InitializeStateConfigWithLoader((ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(ISDKDispatchers.class))), (InitializeStateNetworkError) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(InitializeStateNetworkError.class))), (TokenStorage) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(TokenStorage.class))), (SDKMetricsSender) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(SDKMetricsSender.class))));
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$168 */
        public static final class AnonymousClass168 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass168(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // o00O0Oo.OooO0O0
            public final InitializeStateCreate invoke() {
                return new InitializeStateCreate((ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(ISDKDispatchers.class))));
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$169 */
        public static final class AnonymousClass169 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass169(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // o00O0Oo.OooO0O0
            public final InitializeStateError invoke() {
                return new InitializeStateError((ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(ISDKDispatchers.class))));
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$17 */
        public static final class AnonymousClass17 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ UnityAdsModule $moduleInstance;
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass17(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
                super(0);
                this.$moduleInstance = unityAdsModule;
                this.$this_registry = servicesRegistry;
            }

            @Override // o00O0Oo.OooO0O0
            public final DataStore<ByteStringStoreOuterClass.ByteStringStore> invoke() {
                return this.$moduleInstance.privacyDataStore((Context) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(Context.class))), (o0000O00) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.IO_DISPATCHER, o0OO00O.OooO00o(o0000O00.class))));
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$170 */
        public static final class AnonymousClass170 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass170(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // o00O0Oo.OooO0O0
            public final InitializeStateLoadCache invoke() {
                return new InitializeStateLoadCache((ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(ISDKDispatchers.class))));
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$171 */
        public static final class AnonymousClass171 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass171(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // o00O0Oo.OooO0O0
            public final InitializeStateLoadWeb invoke() {
                return new InitializeStateLoadWeb((ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(ISDKDispatchers.class))), (InitializeStateNetworkError) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(InitializeStateNetworkError.class))), (HttpClient) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(HttpClient.class))));
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$172 */
        public static final class AnonymousClass172 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass172(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // o00O0Oo.OooO0O0
            public final InitializeStateReset invoke() {
                return new InitializeStateReset((ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(ISDKDispatchers.class))));
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$173 */
        public static final class AnonymousClass173 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass173(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // o00O0Oo.OooO0O0
            public final StoreMonitor invoke() {
                return new StoreMonitor((StoreExceptionHandler) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(StoreExceptionHandler.class))));
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$174 */
        public static final class AnonymousClass174 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass174(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // o00O0Oo.OooO0O0
            public final StoreWebViewEventSender invoke() {
                return new StoreWebViewEventSender((IEventSender) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(IEventSender.class))));
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$175 */
        public static final class AnonymousClass175 extends Oooo000 implements OooO0O0 {
            public static final AnonymousClass175 INSTANCE = new AnonymousClass175();

            public AnonymousClass175() {
                super(0);
            }

            @Override // o00O0Oo.OooO0O0
            public final StoreExceptionHandler invoke() {
                return new GatewayStoreExceptionHandler();
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$176 */
        public static final class AnonymousClass176 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass176(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // o00O0Oo.OooO0O0
            public final StoreEventListenerFactory invoke() {
                return new StoreEventListenerFactory((StoreWebViewEventSender) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(StoreWebViewEventSender.class))));
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$177 */
        public static final class AnonymousClass177 extends Oooo000 implements OooO0O0 {
            public static final AnonymousClass177 INSTANCE = new AnonymousClass177();

            public AnonymousClass177() {
                super(0);
            }

            @Override // o00O0Oo.OooO0O0
            public final ConfigurationReader invoke() {
                return new ConfigurationReader();
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$178 */
        public static final class AnonymousClass178 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass178(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // o00O0Oo.OooO0O0
            public final AndroidAttribution invoke() {
                return new AndroidAttribution((Context) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(Context.class))), (ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(ISDKDispatchers.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(SessionRepository.class))));
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$179 */
        public static final class AnonymousClass179 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass179(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // o00O0Oo.OooO0O0
            public final AdPlayerScope invoke() {
                return new AdPlayerScope((o0000O00) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, o0OO00O.OooO00o(o0000O00.class))));
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$18 */
        public static final class AnonymousClass18 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ UnityAdsModule $moduleInstance;
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass18(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
                super(0);
                this.$moduleInstance = unityAdsModule;
                this.$this_registry = servicesRegistry;
            }

            @Override // o00O0Oo.OooO0O0
            public final ByteStringDataSource invoke() {
                return this.$moduleInstance.privacyDataStore((DataStore) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_PRIVACY, o0OO00O.OooO00o(DataStore.class))));
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$180 */
        public static final class AnonymousClass180 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass180(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // o00O0Oo.OooO0O0
            public final AndroidWebViewClient invoke() {
                return new AndroidWebViewClient((GetCachedAsset) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(GetCachedAsset.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(SendDiagnosticEvent.class))));
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$181 */
        public static final class AnonymousClass181 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass181(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // o00O0Oo.OooO0O0
            public final AndroidGetWebViewContainerUseCase invoke() {
                return new AndroidGetWebViewContainerUseCase((Context) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(Context.class))), (AndroidWebViewClient) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(AndroidWebViewClient.class))), (SendWebViewClientErrorDiagnostics) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(SendWebViewClientErrorDiagnostics.class))), (o0000O00) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.MAIN_DISPATCHER, o0OO00O.OooO00o(o0000O00.class))), (o0000O00) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, o0OO00O.OooO00o(o0000O00.class))));
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$182 */
        public static final class AnonymousClass182 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass182(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // o00O0Oo.OooO0O0
            public final Load invoke() {
                return new AndroidLoad((o0000O00) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, o0OO00O.OooO00o(o0000O00.class))), (GetAdRequest) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(GetAdRequest.class))), (GetAdPlayerConfigRequest) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(GetAdPlayerConfigRequest.class))), (GetRequestPolicy) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_AD_REQ, o0OO00O.OooO00o(GetRequestPolicy.class))), (HandleGatewayAdResponse) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(HandleGatewayAdResponse.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(SessionRepository.class))), (GatewayClient) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(GatewayClient.class))), (AdRepository) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(AdRepository.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(SendDiagnosticEvent.class))));
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$183 */
        public static final class AnonymousClass183 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass183(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // o00O0Oo.OooO0O0
            public final AwaitInitialization invoke() {
                return new CommonAwaitInitialization((SessionRepository) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(SessionRepository.class))));
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$184 */
        public static final class AnonymousClass184 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass184(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // o00O0Oo.OooO0O0
            public final GetAsyncHeaderBiddingToken invoke() {
                return new CommonInitAwaitingGetHeaderBiddingToken((GetHeaderBiddingToken) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(GetHeaderBiddingToken.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(SendDiagnosticEvent.class))), (GetInitializationState) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(GetInitializationState.class))), (AwaitInitialization) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(AwaitInitialization.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(SessionRepository.class))), (SafeCallbackInvoke) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(SafeCallbackInvoke.class))));
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$185 */
        public static final class AnonymousClass185 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass185(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // o00O0Oo.OooO0O0
            public final GetAdPlayer invoke() {
                return new CommonGetAdPlayer((DeviceInfoRepository) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(DeviceInfoRepository.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(SessionRepository.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(SendDiagnosticEvent.class))), (o0000O00) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, o0OO00O.OooO00o(o0000O00.class))), (o000OO) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(AdPlayerScope.class))), (OpenMeasurementRepository) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(OpenMeasurementRepository.class))), (ScarManager) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(ScarManager.class))), (OfferwallManager) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(OfferwallManager.class))), (AdRepository) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(AdRepository.class))), (LifecycleDataSource) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(LifecycleDataSource.class))));
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$186 */
        public static final class AnonymousClass186 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass186(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // o00O0Oo.OooO0O0
            public final CacheWebViewAssets invoke() {
                return new AndroidCacheWebViewAssets((CacheRepository) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(CacheRepository.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(SessionRepository.class))));
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$187 */
        public static final class AnonymousClass187 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass187(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // o00O0Oo.OooO0O0
            public final HandleGatewayAdResponse invoke() {
                return new AndroidHandleGatewayAdResponse((AdRepository) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(AdRepository.class))), (AndroidGetWebViewContainerUseCase) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(AndroidGetWebViewContainerUseCase.class))), (GetWebViewBridgeUseCase) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(GetWebViewBridgeUseCase.class))), (DeviceInfoRepository) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(DeviceInfoRepository.class))), (HandleInvocationsFromAdViewer) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(HandleInvocationsFromAdViewer.class))), (CampaignRepository) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(CampaignRepository.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(SendDiagnosticEvent.class))), (GetOperativeEventApi) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(GetOperativeEventApi.class))), (GetLatestWebViewConfiguration) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(GetLatestWebViewConfiguration.class))), (AdPlayerScope) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(AdPlayerScope.class))), (GetAdPlayer) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(GetAdPlayer.class))), (CacheWebViewAssets) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(CacheWebViewAssets.class))));
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$188 */
        public static final class AnonymousClass188 extends Oooo000 implements OooO0O0 {
            public static final AnonymousClass188 INSTANCE = new AnonymousClass188();

            public AnonymousClass188() {
                super(0);
            }

            @Override // o00O0Oo.OooO0O0
            public final HandleInvocationsFromAdViewer invoke() {
                return new HandleInvocationsFromAdViewer();
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$189 */
        public static final class AnonymousClass189 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass189(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // o00O0Oo.OooO0O0
            public final LegacyLoadUseCase invoke() {
                return new LegacyLoadUseCase((Load) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(Load.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(SendDiagnosticEvent.class))), (GetInitializationState) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(GetInitializationState.class))), (AwaitInitialization) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(AwaitInitialization.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(SessionRepository.class))), (AdRepository) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(AdRepository.class))), (SafeCallbackInvoke) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(SafeCallbackInvoke.class))), (CleanUpWhenOpportunityExpires) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(CleanUpWhenOpportunityExpires.class))));
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$19 */
        public static final class AnonymousClass19 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ UnityAdsModule $moduleInstance;
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass19(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
                super(0);
                this.$moduleInstance = unityAdsModule;
                this.$this_registry = servicesRegistry;
            }

            @Override // o00O0Oo.OooO0O0
            public final DataStore<ByteStringStoreOuterClass.ByteStringStore> invoke() {
                return this.$moduleInstance.privacyFsmDataStore((Context) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(Context.class))), (o0000O00) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.IO_DISPATCHER, o0OO00O.OooO00o(o0000O00.class))));
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$190 */
        public static final class AnonymousClass190 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass190(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // o00O0Oo.OooO0O0
            public final SafeCallbackInvoke invoke() {
                return new CommonSafeCallbackInvoke((o0000O00) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.MAIN_DISPATCHER, o0OO00O.OooO00o(o0000O00.class))));
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$191 */
        public static final class AnonymousClass191 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass191(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // o00O0Oo.OooO0O0
            public final InitializeStateNetworkError invoke() {
                return new InitializeStateNetworkError((ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(ISDKDispatchers.class))));
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$192 */
        public static final class AnonymousClass192 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass192(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // o00O0Oo.OooO0O0
            public final CoroutineTimer invoke() {
                return new CommonCoroutineTimer((o0000O00) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, o0OO00O.OooO00o(o0000O00.class))));
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$193 */
        public static final class AnonymousClass193 extends Oooo000 implements OooO0O0 {
            public static final AnonymousClass193 INSTANCE = new AnonymousClass193();

            public AnonymousClass193() {
                super(0);
            }

            @Override // o00O0Oo.OooO0O0
            public final IEventSender invoke() {
                return SharedInstances.INSTANCE.getWebViewEventSender();
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$194 */
        public static final class AnonymousClass194 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass194(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // o00O0Oo.OooO0O0
            public final SetGameId invoke() {
                return new CommonSetGameId((SessionRepository) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(SessionRepository.class))));
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$195 */
        public static final class AnonymousClass195 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass195(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // o00O0Oo.OooO0O0
            public final GetGameId invoke() {
                return new CommonGetGameId((SessionRepository) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(SessionRepository.class))));
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$196 */
        public static final class AnonymousClass196 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass196(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // o00O0Oo.OooO0O0
            public final ValidateGameId invoke() {
                return new CommonValidateGameId((GetGameId) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(GetGameId.class))), (SetGameId) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(SetGameId.class))));
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$197 */
        public static final class AnonymousClass197 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass197(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // o00O0Oo.OooO0O0
            public final ShouldAllowInitialization invoke() {
                return new CommonShouldAllowInitialization((AlternativeFlowReader) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(AlternativeFlowReader.class))), (CheckForGameIdAndTestModeChanges) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(CheckForGameIdAndTestModeChanges.class))), (GetInitializationState) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(GetInitializationState.class))), (SetInitializationState) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(SetInitializationState.class))), (ValidateGameId) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(ValidateGameId.class))));
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$198 */
        public static final class AnonymousClass198 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass198(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // o00O0Oo.OooO0O0
            public final CheckForGameIdAndTestModeChanges invoke() {
                return new CommonCheckForGameIdAndTestModeChanges((GetGameId) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(GetGameId.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(SendDiagnosticEvent.class))));
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$199 */
        public static final class AnonymousClass199 extends Oooo000 implements OooO0O0 {
            public static final AnonymousClass199 INSTANCE = new AnonymousClass199();

            public AnonymousClass199() {
                super(0);
            }

            @Override // o00O0Oo.OooO0O0
            public final DownloadPriorityQueue invoke() {
                return new DownloadPriorityQueue();
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$2 */
        public static final class AnonymousClass2 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ UnityAdsModule $moduleInstance;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(UnityAdsModule unityAdsModule) {
                super(0);
                this.$moduleInstance = unityAdsModule;
            }

            @Override // o00O0Oo.OooO0O0
            public final o0000O00 invoke() {
                return this.$moduleInstance.mainDispatcher();
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$20 */
        public static final class AnonymousClass20 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ UnityAdsModule $moduleInstance;
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass20(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
                super(0);
                this.$moduleInstance = unityAdsModule;
                this.$this_registry = servicesRegistry;
            }

            @Override // o00O0Oo.OooO0O0
            public final ByteStringDataSource invoke() {
                return this.$moduleInstance.privacyFsmDataStore((DataStore) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_PRIVACY_FSM, o0OO00O.OooO00o(DataStore.class))));
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$200 */
        public static final class AnonymousClass200 extends Oooo000 implements OooO0O0 {
            public static final AnonymousClass200 INSTANCE = new AnonymousClass200();

            public AnonymousClass200() {
                super(0);
            }

            @Override // o00O0Oo.OooO0O0
            public final CleanupDirectory invoke() {
                return new CleanupDirectory();
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$201 */
        public static final class AnonymousClass201 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass201(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // o00O0Oo.OooO0O0
            public final FocusRepository invoke() {
                return new FocusRepository((AndroidGetLifecycleFlow) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(AndroidGetLifecycleFlow.class))), (o0000O00) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, o0OO00O.OooO00o(o0000O00.class))));
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$202 */
        public static final class AnonymousClass202 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass202(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // o00O0Oo.OooO0O0
            public final AndroidGetIsAdActivity invoke() {
                return new AndroidGetIsAdActivity((SessionRepository) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(SessionRepository.class))));
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$203 */
        public static final class AnonymousClass203 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass203(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // o00O0Oo.OooO0O0
            public final AndroidGetLifecycleFlow invoke() {
                return new AndroidGetLifecycleFlow((Context) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(Context.class))));
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$204 */
        public static final class AnonymousClass204 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass204(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // o00O0Oo.OooO0O0
            public final AndroidHandleFocusCounters invoke() {
                return new AndroidHandleFocusCounters((SessionRepository) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(SessionRepository.class))), (FocusRepository) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(FocusRepository.class))), (AndroidGetIsAdActivity) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(AndroidGetIsAdActivity.class))), (o0000O00) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, o0OO00O.OooO00o(o0000O00.class))), null, 16, null);
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$205 */
        public static final class AnonymousClass205 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass205(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // o00O0Oo.OooO0O0
            public final OfferwallAdapterBridge invoke() {
                return new OfferwallAdapterBridge((o000OO) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_OFFERWALL_SCOPE, o0OO00O.OooO00o(o000OO.class))));
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$206 */
        public static final class AnonymousClass206 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass206(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // o00O0Oo.OooO0O0
            public final OfferwallManager invoke() {
                return new AndroidOfferwallManager((OfferwallAdapterBridge) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(OfferwallAdapterBridge.class))));
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$207 */
        public static final class AnonymousClass207 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass207(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // o00O0Oo.OooO0O0
            public final LoadOfferwallAd invoke() {
                return new LoadOfferwallAd((OfferwallManager) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(OfferwallManager.class))));
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$208 */
        public static final class AnonymousClass208 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass208(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // o00O0Oo.OooO0O0
            public final GetIsOfferwallAdReady invoke() {
                return new GetIsOfferwallAdReady((OfferwallManager) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(OfferwallManager.class))));
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$209 */
        public static final class AnonymousClass209 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass209(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // o00O0Oo.OooO0O0
            public final FIdDataSource invoke() {
                return new AndroidFIdDataSource((Context) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(Context.class))));
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$21 */
        public static final class AnonymousClass21 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ UnityAdsModule $moduleInstance;
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass21(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
                super(0);
                this.$moduleInstance = unityAdsModule;
                this.$this_registry = servicesRegistry;
            }

            @Override // o00O0Oo.OooO0O0
            public final DataStore<ByteStringStoreOuterClass.ByteStringStore> invoke() {
                return this.$moduleInstance.nativeConfigurationDataStore((Context) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(Context.class))), (o0000O00) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.IO_DISPATCHER, o0OO00O.OooO00o(o0000O00.class))));
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$210 */
        public static final class AnonymousClass210 extends Oooo000 implements OooO0O0 {
            public static final AnonymousClass210 INSTANCE = new AnonymousClass210();

            public AnonymousClass210() {
                super(0);
            }

            @Override // o00O0Oo.OooO0O0
            public final FIdExistenceDataSource invoke() {
                return new AndroidFIdExistenceDataSource(Constants.FID_CLASS);
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$211 */
        public static final class AnonymousClass211 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass211(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // o00O0Oo.OooO0O0
            public final CleanUpWhenOpportunityExpires invoke() {
                return new CleanUpWhenOpportunityExpires((o0000O00) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, o0OO00O.OooO00o(o0000O00.class))));
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$22 */
        public static final class AnonymousClass22 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ UnityAdsModule $moduleInstance;
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass22(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
                super(0);
                this.$moduleInstance = unityAdsModule;
                this.$this_registry = servicesRegistry;
            }

            @Override // o00O0Oo.OooO0O0
            public final ByteStringDataSource invoke() {
                return this.$moduleInstance.nativeConfigurationDataStore((DataStore) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_NATIVE_CONFIG, o0OO00O.OooO00o(DataStore.class))));
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$23 */
        public static final class AnonymousClass23 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ UnityAdsModule $moduleInstance;
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass23(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
                super(0);
                this.$moduleInstance = unityAdsModule;
                this.$this_registry = servicesRegistry;
            }

            @Override // o00O0Oo.OooO0O0
            public final DataStore<ByteStringStoreOuterClass.ByteStringStore> invoke() {
                return this.$moduleInstance.glInfoDataStore((Context) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(Context.class))), (o0000O00) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.IO_DISPATCHER, o0OO00O.OooO00o(o0000O00.class))), (DataMigration) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.PREF_GL_INFO, o0OO00O.OooO00o(DataMigration.class))));
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$24 */
        public static final class AnonymousClass24 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ UnityAdsModule $moduleInstance;
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass24(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
                super(0);
                this.$moduleInstance = unityAdsModule;
                this.$this_registry = servicesRegistry;
            }

            @Override // o00O0Oo.OooO0O0
            public final ByteStringDataSource invoke() {
                return this.$moduleInstance.glInfoDataStore((DataStore) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_GL_INFO, o0OO00O.OooO00o(DataStore.class))));
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$25 */
        public static final class AnonymousClass25 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ UnityAdsModule $moduleInstance;
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass25(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
                super(0);
                this.$moduleInstance = unityAdsModule;
                this.$this_registry = servicesRegistry;
            }

            @Override // o00O0Oo.OooO0O0
            public final DataStore<UniversalRequestStoreOuterClass.UniversalRequestStore> invoke() {
                return this.$moduleInstance.universalRequestDataStore((Context) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(Context.class))), (o0000O00) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.IO_DISPATCHER, o0OO00O.OooO00o(o0000O00.class))));
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$26 */
        public static final class AnonymousClass26 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ UnityAdsModule $moduleInstance;
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass26(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
                super(0);
                this.$moduleInstance = unityAdsModule;
                this.$this_registry = servicesRegistry;
            }

            @Override // o00O0Oo.OooO0O0
            public final DataStore<ByteStringStoreOuterClass.ByteStringStore> invoke() {
                return this.$moduleInstance.iapTransactionDataStore((Context) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(Context.class))), (o0000O00) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.IO_DISPATCHER, o0OO00O.OooO00o(o0000O00.class))));
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$27 */
        public static final class AnonymousClass27 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ UnityAdsModule $moduleInstance;
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass27(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
                super(0);
                this.$moduleInstance = unityAdsModule;
                this.$this_registry = servicesRegistry;
            }

            @Override // o00O0Oo.OooO0O0
            public final ByteStringDataSource invoke() {
                return this.$moduleInstance.iapTransactionDataStore((DataStore) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_IAP_TRANSACTION, o0OO00O.OooO00o(DataStore.class))));
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$28 */
        public static final class AnonymousClass28 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ UnityAdsModule $moduleInstance;
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass28(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
                super(0);
                this.$moduleInstance = unityAdsModule;
                this.$this_registry = servicesRegistry;
            }

            @Override // o00O0Oo.OooO0O0
            public final DataStore<WebviewConfigurationStore.WebViewConfigurationStore> invoke() {
                return this.$moduleInstance.webViewConfigurationDataStore((Context) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(Context.class))), (o0000O00) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.IO_DISPATCHER, o0OO00O.OooO00o(o0000O00.class))));
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$29 */
        public static final class AnonymousClass29 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ UnityAdsModule $moduleInstance;
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass29(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
                super(0);
                this.$moduleInstance = unityAdsModule;
                this.$this_registry = servicesRegistry;
            }

            @Override // o00O0Oo.OooO0O0
            public final AsyncTokenStorage invoke() {
                return this.$moduleInstance.asyncTokenStorage((TokenStorage) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(TokenStorage.class))), (SDKMetricsSender) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(SDKMetricsSender.class))));
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$3 */
        public static final class AnonymousClass3 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ UnityAdsModule $moduleInstance;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(UnityAdsModule unityAdsModule) {
                super(0);
                this.$moduleInstance = unityAdsModule;
            }

            @Override // o00O0Oo.OooO0O0
            public final o0000O00 invoke() {
                return this.$moduleInstance.defaultDispatcher();
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$30 */
        public static final class AnonymousClass30 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ UnityAdsModule $moduleInstance;
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass30(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
                super(0);
                this.$moduleInstance = unityAdsModule;
                this.$this_registry = servicesRegistry;
            }

            @Override // o00O0Oo.OooO0O0
            public final VolumeChangeMonitor invoke() {
                return this.$moduleInstance.volumeChangeMonitor((VolumeChange) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(VolumeChange.class))));
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$31 */
        public static final class AnonymousClass31 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ UnityAdsModule $moduleInstance;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass31(UnityAdsModule unityAdsModule) {
                super(0);
                this.$moduleInstance = unityAdsModule;
            }

            @Override // o00O0Oo.OooO0O0
            public final JsonStorage invoke() {
                return this.$moduleInstance.publicJsonStorage();
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$32 */
        public static final class AnonymousClass32 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ UnityAdsModule $moduleInstance;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass32(UnityAdsModule unityAdsModule) {
                super(0);
                this.$moduleInstance = unityAdsModule;
            }

            @Override // o00O0Oo.OooO0O0
            public final JsonStorage invoke() {
                return this.$moduleInstance.privateJsonStorage();
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$33 */
        public static final class AnonymousClass33 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ UnityAdsModule $moduleInstance;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass33(UnityAdsModule unityAdsModule) {
                super(0);
                this.$moduleInstance = unityAdsModule;
            }

            @Override // o00O0Oo.OooO0O0
            public final JsonStorage invoke() {
                return this.$moduleInstance.memoryJsonStorage();
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$34 */
        public static final class AnonymousClass34 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ UnityAdsModule $moduleInstance;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass34(UnityAdsModule unityAdsModule) {
                super(0);
                this.$moduleInstance = unityAdsModule;
            }

            @Override // o00O0Oo.OooO0O0
            public final NativeConfigurationOuterClass.NativeConfiguration invoke() {
                return this.$moduleInstance.defaultNativeConfiguration();
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$35 */
        public static final class AnonymousClass35 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ UnityAdsModule $moduleInstance;
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass35(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
                super(0);
                this.$moduleInstance = unityAdsModule;
                this.$this_registry = servicesRegistry;
            }

            @Override // o00O0Oo.OooO0O0
            public final MeasurementsService invoke() {
                return this.$moduleInstance.measurementService((Context) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(Context.class))), (ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(ISDKDispatchers.class))));
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$36 */
        public static final class AnonymousClass36 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ UnityAdsModule $moduleInstance;
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass36(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
                super(0);
                this.$moduleInstance = unityAdsModule;
                this.$this_registry = servicesRegistry;
            }

            @Override // o00O0Oo.OooO0O0
            public final TopicsService invoke() {
                return this.$moduleInstance.topicsService((Context) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(Context.class))), (ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(ISDKDispatchers.class))));
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$37 */
        public static final class AnonymousClass37 extends Oooo000 implements OooO0O0 {
            public static final AnonymousClass37 INSTANCE = new AnonymousClass37();

            public AnonymousClass37() {
                super(0);
            }

            @Override // o00O0Oo.OooO0O0
            public final CronetEngineBuilderFactory invoke() {
                return new CronetEngineBuilderFactory();
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$38 */
        public static final class AnonymousClass38 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass38(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // o00O0Oo.OooO0O0
            public final HttpClientProvider invoke() {
                return new AndroidHttpClientProvider((ConfigFileFromLocalStorage) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(ConfigFileFromLocalStorage.class))), (AlternativeFlowReader) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(AlternativeFlowReader.class))), (ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(ISDKDispatchers.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(SendDiagnosticEvent.class))), (Context) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(Context.class))), (CronetEngineBuilderFactory) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(CronetEngineBuilderFactory.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(SessionRepository.class))), (CleanupDirectory) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(CleanupDirectory.class))), (MediationTraitsMetadataReader) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(MediationTraitsMetadataReader.class))));
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$39 */
        public static final class AnonymousClass39 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ ServicesRegistry $this_registry;

            @OooO(m13471c = "com.unity3d.services.core.di.ServiceProvider$initialize$1$39$1", m13472f = "ServiceProvider.kt", m13473l = {444}, m13474m = "invokeSuspend")
            /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$39$1 */
            public static final class AnonymousClass1 extends OooOOOO implements o00O0O {
                final /* synthetic */ ServicesRegistry $this_registry;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(ServicesRegistry servicesRegistry, OooO0OO oooO0OO) {
                    super(2, oooO0OO);
                    this.$this_registry = servicesRegistry;
                }

                @Override // o00O0OO0.OooO00o
                public final OooO0OO create(Object obj, OooO0OO oooO0OO) {
                    return new AnonymousClass1(this.$this_registry, oooO0OO);
                }

                @Override // o00O0OO0.OooO00o
                public final Object invokeSuspend(Object obj) {
                    OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
                    int i = this.label;
                    if (i != 0) {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        o000OOo.OooOO0O(obj);
                        return obj;
                    }
                    o000OOo.OooOO0O(obj);
                    HttpClientProvider httpClientProvider = (HttpClientProvider) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(HttpClientProvider.class)));
                    this.label = 1;
                    Object objInvoke$default = HttpClientProvider.DefaultImpls.invoke$default(httpClientProvider, null, this, 1, null);
                    return objInvoke$default == oooOo00 ? oooOo00 : objInvoke$default;
                }

                @Override // o00O0Oo.o00O0O
                public final Object invoke(o000OO o000oo2, OooO0OO oooO0OO) {
                    return ((AnonymousClass1) create(o000oo2, oooO0OO)).invokeSuspend(oo00o.OooOo.f33195OooO00o);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass39(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // o00O0Oo.OooO0O0
            public final HttpClient invoke() {
                return (HttpClient) o0000OO0.OooOoO(OooOOO.f31358OooOo0O, new AnonymousClass1(this.$this_registry, null));
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$4 */
        public static final class AnonymousClass4 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ UnityAdsModule $moduleInstance;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass4(UnityAdsModule unityAdsModule) {
                super(0);
                this.$moduleInstance = unityAdsModule;
            }

            @Override // o00O0Oo.OooO0O0
            public final o0000O00 invoke() {
                return this.$moduleInstance.ioDispatcher();
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$40 */
        public static final class AnonymousClass40 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ ServicesRegistry $this_registry;

            @OooO(m13471c = "com.unity3d.services.core.di.ServiceProvider$initialize$1$40$1", m13472f = "ServiceProvider.kt", m13473l = {445}, m13474m = "invokeSuspend")
            /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$40$1 */
            public static final class AnonymousClass1 extends OooOOOO implements o00O0O {
                final /* synthetic */ ServicesRegistry $this_registry;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(ServicesRegistry servicesRegistry, OooO0OO oooO0OO) {
                    super(2, oooO0OO);
                    this.$this_registry = servicesRegistry;
                }

                @Override // o00O0OO0.OooO00o
                public final OooO0OO create(Object obj, OooO0OO oooO0OO) {
                    return new AnonymousClass1(this.$this_registry, oooO0OO);
                }

                @Override // o00O0OO0.OooO00o
                public final Object invokeSuspend(Object obj) {
                    OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
                    int i = this.label;
                    if (i != 0) {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        o000OOo.OooOO0O(obj);
                        return obj;
                    }
                    o000OOo.OooOO0O(obj);
                    HttpClientProvider httpClientProvider = (HttpClientProvider) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(HttpClientProvider.class)));
                    Boolean bool = Boolean.TRUE;
                    this.label = 1;
                    Object objInvoke = httpClientProvider.invoke(bool, this);
                    return objInvoke == oooOo00 ? oooOo00 : objInvoke;
                }

                @Override // o00O0Oo.o00O0O
                public final Object invoke(o000OO o000oo2, OooO0OO oooO0OO) {
                    return ((AnonymousClass1) create(o000oo2, oooO0OO)).invokeSuspend(oo00o.OooOo.f33195OooO00o);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass40(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // o00O0Oo.OooO0O0
            public final HttpClient invoke() {
                return (HttpClient) o0000OO0.OooOoO(OooOOO.f31358OooOo0O, new AnonymousClass1(this.$this_registry, null));
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$41 */
        public static final class AnonymousClass41 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass41(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // o00O0Oo.OooO0O0
            public final MediationTraitsMetadataReader invoke() {
                return new MediationTraitsMetadataReader((JsonStorage) this.$this_registry.resolveService(new ServiceKey("MEMORY", o0OO00O.OooO00o(JsonStorage.class))));
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$42 */
        public static final class AnonymousClass42 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass42(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // o00O0Oo.OooO0O0
            public final AlternativeFlowReader invoke() {
                return new AlternativeFlowReader((ConfigurationReader) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(ConfigurationReader.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(SessionRepository.class))), (MediationTraitsMetadataReader) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(MediationTraitsMetadataReader.class))));
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$43 */
        public static final class AnonymousClass43 extends Oooo000 implements OooO0O0 {
            public static final AnonymousClass43 INSTANCE = new AnonymousClass43();

            public AnonymousClass43() {
                super(0);
            }

            @Override // o00O0Oo.OooO0O0
            public final TcfDataSource invoke() {
                return new AndroidTcfDataSource();
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$44 */
        public static final class AnonymousClass44 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass44(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // o00O0Oo.OooO0O0
            public final TcfRepository invoke() {
                return new AndroidTcfRepository((TcfDataSource) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(TcfDataSource.class))));
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$45 */
        public static final class AnonymousClass45 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass45(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // o00O0Oo.OooO0O0
            public final AndroidManifestIntPropertyReader invoke() {
                return new AndroidManifestIntPropertyReader((Context) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(Context.class))));
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$46 */
        public static final class AnonymousClass46 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass46(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // o00O0Oo.OooO0O0
            public final AndroidTestDataInfo invoke() {
                return new AndroidTestDataInfo((AndroidManifestIntPropertyReader) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(AndroidManifestIntPropertyReader.class))));
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$47 */
        public static final class AnonymousClass47 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass47(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // o00O0Oo.OooO0O0
            public final GameServerIdReader invoke() {
                return new GameServerIdReader((JsonStorage) this.$this_registry.resolveService(new ServiceKey("PUBLIC", o0OO00O.OooO00o(JsonStorage.class))));
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$48 */
        public static final class AnonymousClass48 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass48(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // o00O0Oo.OooO0O0
            public final StoreDataSource invoke() {
                return new AndroidStoreDataSource((Context) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(Context.class))));
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$49 */
        public static final class AnonymousClass49 extends Oooo000 implements OooO0O0 {
            public static final AnonymousClass49 INSTANCE = new AnonymousClass49();

            public AnonymousClass49() {
                super(0);
            }

            @Override // o00O0Oo.OooO0O0
            public final AnalyticsDataSource invoke() {
                return new AndroidAnalyticsDataSource();
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$5 */
        public static final class AnonymousClass5 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ UnityAdsModule $moduleInstance;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass5(UnityAdsModule unityAdsModule) {
                super(0);
                this.$moduleInstance = unityAdsModule;
            }

            @Override // o00O0Oo.OooO0O0
            public final ISDKDispatchers invoke() {
                return this.$moduleInstance.sdkDispatchers();
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$50 */
        public static final class AnonymousClass50 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass50(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // o00O0Oo.OooO0O0
            public final DeveloperConsentDataSource invoke() {
                return new AndroidDeveloperConsentDataSource((FlattenerRulesUseCase) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DEV_CONSENT_PRIVACY_RULES, o0OO00O.OooO00o(FlattenerRulesUseCase.class))), (JsonStorage) this.$this_registry.resolveService(new ServiceKey("PUBLIC", o0OO00O.OooO00o(JsonStorage.class))));
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$51 */
        public static final class AnonymousClass51 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass51(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // o00O0Oo.OooO0O0
            public final DynamicDeviceInfoDataSource invoke() {
                return new AndroidDynamicDeviceInfoDataSource((Context) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(Context.class))), (LifecycleDataSource) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(LifecycleDataSource.class))));
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$52 */
        public static final class AnonymousClass52 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass52(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // o00O0Oo.OooO0O0
            public final LegacyUserConsentDataSource invoke() {
                return new AndroidLegacyUserConsentDataSource((FlattenerRulesUseCase) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.LEGACY_PRIVACY_RULES, o0OO00O.OooO00o(FlattenerRulesUseCase.class))), (JsonStorage) this.$this_registry.resolveService(new ServiceKey("PRIVATE", o0OO00O.OooO00o(JsonStorage.class))));
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$53 */
        public static final class AnonymousClass53 extends Oooo000 implements OooO0O0 {
            public static final AnonymousClass53 INSTANCE = new AnonymousClass53();

            public AnonymousClass53() {
                super(0);
            }

            @Override // o00O0Oo.OooO0O0
            public final LifecycleDataSource invoke() {
                return new AndroidLifecycleDataSource();
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$54 */
        public static final class AnonymousClass54 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass54(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // o00O0Oo.OooO0O0
            public final CacheDataSource invoke() {
                return new AndroidLocalCacheDataSource((CreateFile) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(CreateFile.class))), (GetFileExtensionFromUrl) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(GetFileExtensionFromUrl.class))));
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$55 */
        public static final class AnonymousClass55 extends Oooo000 implements OooO0O0 {
            public static final AnonymousClass55 INSTANCE = new AnonymousClass55();

            public AnonymousClass55() {
                super(0);
            }

            @Override // o00O0Oo.OooO0O0
            public final CreateFile invoke() {
                return new CommonCreateFile();
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$56 */
        public static final class AnonymousClass56 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass56(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // o00O0Oo.OooO0O0
            public final GetFileExtensionFromUrl invoke() {
                return new CommonGetFileExtensionFromUrl((RemoveUrlQuery) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(RemoveUrlQuery.class))));
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$57 */
        public static final class AnonymousClass57 extends Oooo000 implements OooO0O0 {
            public static final AnonymousClass57 INSTANCE = new AnonymousClass57();

            public AnonymousClass57() {
                super(0);
            }

            @Override // o00O0Oo.OooO0O0
            public final RemoveUrlQuery invoke() {
                return new AndroidRemoveUrlQuery();
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$58 */
        public static final class AnonymousClass58 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass58(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // o00O0Oo.OooO0O0
            public final MediationDataSource invoke() {
                return new AndroidMediationDataSource((JsonStorage) this.$this_registry.resolveService(new ServiceKey("MEMORY", o0OO00O.OooO00o(JsonStorage.class))));
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$59 */
        public static final class AnonymousClass59 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass59(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // o00O0Oo.OooO0O0
            public final PrivacyDeviceInfoDataSource invoke() {
                return new AndroidPrivacyDeviceInfoDataSource((Context) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(Context.class))), (FIdDataSource) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(FIdDataSource.class))));
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$6 */
        public static final class AnonymousClass6 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ UnityAdsModule $moduleInstance;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass6(UnityAdsModule unityAdsModule) {
                super(0);
                this.$moduleInstance = unityAdsModule;
            }

            @Override // o00O0Oo.OooO0O0
            public final SDKMetricsSender invoke() {
                return this.$moduleInstance.sdkMetrics();
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$60 */
        public static final class AnonymousClass60 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass60(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // o00O0Oo.OooO0O0
            public final CacheDataSource invoke() {
                return new AndroidRemoteCacheDataSource((o0000O00) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.IO_DISPATCHER, o0OO00O.OooO00o(o0000O00.class))), (CreateFile) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(CreateFile.class))), (GetFileExtensionFromUrl) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(GetFileExtensionFromUrl.class))), (HttpClient) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(HttpClient.class))));
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$61 */
        public static final class AnonymousClass61 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass61(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // o00O0Oo.OooO0O0
            public final StaticDeviceInfoDataSource invoke() {
                return new AndroidStaticDeviceInfoDataSource((Context) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(Context.class))), (ByteStringDataSource) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_GL_INFO, o0OO00O.OooO00o(ByteStringDataSource.class))), (AnalyticsDataSource) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(AnalyticsDataSource.class))), (StoreDataSource) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(StoreDataSource.class))));
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$62 */
        public static final class AnonymousClass62 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass62(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // o00O0Oo.OooO0O0
            public final DataMigration<ByteStringStoreOuterClass.ByteStringStore> invoke() {
                return new FetchGLInfoDataMigration((GetOpenGLRendererInfo) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(GetOpenGLRendererInfo.class))));
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$63 */
        public static final class AnonymousClass63 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass63(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // o00O0Oo.OooO0O0
            public final UniversalRequestDataSource invoke() {
                return new UniversalRequestDataSource((DataStore) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_UNIVERSAL_REQUEST, o0OO00O.OooO00o(DataStore.class))));
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$64 */
        public static final class AnonymousClass64 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass64(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // o00O0Oo.OooO0O0
            public final WebviewConfigurationDataSource invoke() {
                return new WebviewConfigurationDataSource((DataStore) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_WEBVIEW_CONFIG, o0OO00O.OooO00o(DataStore.class))));
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$65 */
        public static final class AnonymousClass65 extends Oooo000 implements OooO0O0 {
            public static final AnonymousClass65 INSTANCE = new AnonymousClass65();

            public AnonymousClass65() {
                super(0);
            }

            @Override // o00O0Oo.OooO0O0
            public final OmidManager invoke() {
                return new AndroidOmidManager();
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$66 */
        public static final class AnonymousClass66 extends Oooo000 implements OooO0O0 {
            public static final AnonymousClass66 INSTANCE = new AnonymousClass66();

            public AnonymousClass66() {
                super(0);
            }

            @Override // o00O0Oo.OooO0O0
            public final SDKPropertiesManager invoke() {
                return new AndroidSDKPropertiesManager();
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$67 */
        public static final class AnonymousClass67 extends Oooo000 implements OooO0O0 {
            public static final AnonymousClass67 INSTANCE = new AnonymousClass67();

            public AnonymousClass67() {
                super(0);
            }

            @Override // o00O0Oo.OooO0O0
            public final StorageManager invoke() {
                return new AndroidStorageManager();
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$68 */
        public static final class AnonymousClass68 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass68(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // o00O0Oo.OooO0O0
            public final TransactionEventManager invoke() {
                return new TransactionEventManager((o000OO) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_TRANSACTION_SCOPE, o0OO00O.OooO00o(o000OO.class))), (StoreMonitor) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(StoreMonitor.class))), (GetTransactionData) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(GetTransactionData.class))), (GetTransactionRequest) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(GetTransactionRequest.class))), (TransactionEventRepository) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(TransactionEventRepository.class))), (ByteStringDataSource) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_IAP_TRANSACTION, o0OO00O.OooO00o(ByteStringDataSource.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(SendDiagnosticEvent.class))));
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$69 */
        public static final class AnonymousClass69 extends Oooo000 implements OooO0O0 {
            public static final AnonymousClass69 INSTANCE = new AnonymousClass69();

            public AnonymousClass69() {
                super(0);
            }

            @Override // o00O0Oo.OooO0O0
            public final AdRepository invoke() {
                return new AndroidAdRepository();
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$7 */
        public static final class AnonymousClass7 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ UnityAdsModule $moduleInstance;
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass7(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
                super(0);
                this.$moduleInstance = unityAdsModule;
                this.$this_registry = servicesRegistry;
            }

            @Override // o00O0Oo.OooO0O0
            public final o000OO invoke() {
                return this.$moduleInstance.initCoroutineScope((ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(ISDKDispatchers.class))), (o0000O0) this.$this_registry.resolveService(new ServiceKey("sdk", o0OO00O.OooO00o(o0000O0.class))), (o00O0O00) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_PUBLIC_JOB, o0OO00O.OooO00o(o00O0O00.class))));
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$70 */
        public static final class AnonymousClass70 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass70(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // o00O0Oo.OooO0O0
            public final CacheRepository invoke() {
                return new AndroidCacheRepository((o0000O00) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.IO_DISPATCHER, o0OO00O.OooO00o(o0000O00.class))), (GetCacheDirectory) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(GetCacheDirectory.class))), (CacheDataSource) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_LOCAL, o0OO00O.OooO00o(CacheDataSource.class))), (CacheDataSource) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_REMOTE, o0OO00O.OooO00o(CacheDataSource.class))), (Context) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(Context.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(SessionRepository.class))), (CleanupDirectory) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(CleanupDirectory.class))), (DownloadPriorityQueue) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(DownloadPriorityQueue.class))), (CreateFile) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(CreateFile.class))));
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$71 */
        public static final class AnonymousClass71 extends Oooo000 implements OooO0O0 {
            public static final AnonymousClass71 INSTANCE = new AnonymousClass71();

            public AnonymousClass71() {
                super(0);
            }

            @Override // o00O0Oo.OooO0O0
            public final GetCacheDirectory invoke() {
                return new CommonGetCacheDirectory();
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$72 */
        public static final class AnonymousClass72 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass72(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // o00O0Oo.OooO0O0
            public final CampaignRepository invoke() {
                return new AndroidCampaignRepository((GetSharedDataTimestamps) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(GetSharedDataTimestamps.class))));
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$73 */
        public static final class AnonymousClass73 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass73(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // o00O0Oo.OooO0O0
            public final DeveloperConsentRepository invoke() {
                return new AndroidDeveloperConsentRepository((DeveloperConsentDataSource) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(DeveloperConsentDataSource.class))));
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$74 */
        public static final class AnonymousClass74 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass74(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // o00O0Oo.OooO0O0
            public final DeviceInfoRepository invoke() {
                return new AndroidDeviceInfoRepository((StaticDeviceInfoDataSource) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(StaticDeviceInfoDataSource.class))), (DynamicDeviceInfoDataSource) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(DynamicDeviceInfoDataSource.class))), (PrivacyDeviceInfoDataSource) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(PrivacyDeviceInfoDataSource.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(SessionRepository.class))));
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$75 */
        public static final class AnonymousClass75 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass75(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // o00O0Oo.OooO0O0
            public final DiagnosticEventRepository invoke() {
                return new AndroidDiagnosticEventRepository((CoroutineTimer) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(CoroutineTimer.class))), (GetDiagnosticEventRequest) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(GetDiagnosticEventRequest.class))), (o0000O00) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, o0OO00O.OooO00o(o0000O00.class))));
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$76 */
        public static final class AnonymousClass76 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass76(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // o00O0Oo.OooO0O0
            public final LegacyUserConsentRepository invoke() {
                return new AndroidLegacyUserConsentRepository((LegacyUserConsentDataSource) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(LegacyUserConsentDataSource.class))));
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$77 */
        public static final class AnonymousClass77 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass77(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // o00O0Oo.OooO0O0
            public final MediationRepository invoke() {
                return new AndroidMediationRepository((MediationDataSource) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(MediationDataSource.class))));
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$78 */
        public static final class AnonymousClass78 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass78(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // o00O0Oo.OooO0O0
            public final OpenMeasurementRepository invoke() {
                return new AndroidOpenMeasurementRepository((o0000O00) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.MAIN_DISPATCHER, o0OO00O.OooO00o(o0000O00.class))), (OmidManager) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(OmidManager.class))));
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$79 */
        public static final class AnonymousClass79 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass79(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // o00O0Oo.OooO0O0
            public final SessionRepository invoke() {
                return new AndroidSessionRepository((ByteStringDataSource) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_GATEWAY_CACHE, o0OO00O.OooO00o(ByteStringDataSource.class))), (ByteStringDataSource) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_PRIVACY, o0OO00O.OooO00o(ByteStringDataSource.class))), (ByteStringDataSource) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_PRIVACY_FSM, o0OO00O.OooO00o(ByteStringDataSource.class))), (ByteStringDataSource) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DATA_STORE_NATIVE_CONFIG, o0OO00O.OooO00o(ByteStringDataSource.class))), (NativeConfigurationOuterClass.NativeConfiguration) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(NativeConfigurationOuterClass.NativeConfiguration.class))), (o0000O00) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.IO_DISPATCHER, o0OO00O.OooO00o(o0000O00.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(SendDiagnosticEvent.class))));
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$8 */
        public static final class AnonymousClass8 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ UnityAdsModule $moduleInstance;
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass8(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
                super(0);
                this.$moduleInstance = unityAdsModule;
                this.$this_registry = servicesRegistry;
            }

            @Override // o00O0Oo.OooO0O0
            public final o000OO invoke() {
                return this.$moduleInstance.loadCoroutineScope((ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(ISDKDispatchers.class))), (o0000O0) this.$this_registry.resolveService(new ServiceKey("sdk", o0OO00O.OooO00o(o0000O0.class))), (o00O0O00) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_PUBLIC_JOB, o0OO00O.OooO00o(o00O0O00.class))));
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$80 */
        public static final class AnonymousClass80 extends Oooo000 implements OooO0O0 {
            public static final AnonymousClass80 INSTANCE = new AnonymousClass80();

            public AnonymousClass80() {
                super(0);
            }

            @Override // o00O0Oo.OooO0O0
            public final TransactionEventRepository invoke() {
                return new AndroidTransactionEventRepository();
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$81 */
        public static final class AnonymousClass81 extends Oooo000 implements OooO0O0 {
            public static final AnonymousClass81 INSTANCE = new AnonymousClass81();

            public AnonymousClass81() {
                super(0);
            }

            @Override // o00O0Oo.OooO0O0
            public final OperativeEventRepository invoke() {
                return new OperativeEventRepository();
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$82 */
        public static final class AnonymousClass82 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass82(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // o00O0Oo.OooO0O0
            public final ExecuteAdViewerRequest invoke() {
                return new AndroidExecuteAdViewerRequest((o0000O00) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.IO_DISPATCHER, o0OO00O.OooO00o(o0000O00.class))), (HttpClient) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(HttpClient.class))), (GetCachedAsset) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(GetCachedAsset.class))));
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$83 */
        public static final class AnonymousClass83 extends Oooo000 implements OooO0O0 {
            public static final AnonymousClass83 INSTANCE = new AnonymousClass83();

            public AnonymousClass83() {
                super(0);
            }

            @Override // o00O0Oo.OooO0O0
            public final GetByteStringId invoke() {
                return new AndroidGenerateByteStringId();
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$84 */
        public static final class AnonymousClass84 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass84(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // o00O0Oo.OooO0O0
            public final HandleOpenUrl invoke() {
                return new AndroidHandleOpenUrl((Context) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(Context.class))));
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$85 */
        public static final class AnonymousClass85 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass85(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // o00O0Oo.OooO0O0
            public final Refresh invoke() {
                return new AndroidRefresh((o0000O00) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, o0OO00O.OooO00o(o0000O00.class))), (GetAdDataRefreshRequest) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(GetAdDataRefreshRequest.class))), (GetRequestPolicy) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_AD_REQ, o0OO00O.OooO00o(GetRequestPolicy.class))), (GatewayClient) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(GatewayClient.class))));
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$86 */
        public static final class AnonymousClass86 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass86(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // o00O0Oo.OooO0O0
            public final SendDiagnosticEvent invoke() {
                return new AndroidSendDiagnosticEvent((DiagnosticEventRepository) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(DiagnosticEventRepository.class))), (GetDiagnosticEventRequest) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(GetDiagnosticEventRequest.class))));
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$87 */
        public static final class AnonymousClass87 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass87(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // o00O0Oo.OooO0O0
            public final SendWebViewClientErrorDiagnostics invoke() {
                return new AndroidSendWebViewClientErrorDiagnostics((SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(SendDiagnosticEvent.class))));
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$88 */
        public static final class AnonymousClass88 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass88(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // o00O0Oo.OooO0O0
            public final Show invoke() {
                return new AndroidShow((AdRepository) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(AdRepository.class))), (GameServerIdReader) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(GameServerIdReader.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(SendDiagnosticEvent.class))));
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$89 */
        public static final class AnonymousClass89 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass89(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // o00O0Oo.OooO0O0
            public final CacheFile invoke() {
                return new CommonCacheFile((CacheRepository) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(CacheRepository.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(SendDiagnosticEvent.class))));
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$9 */
        public static final class AnonymousClass9 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ UnityAdsModule $moduleInstance;
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass9(UnityAdsModule unityAdsModule, ServicesRegistry servicesRegistry) {
                super(0);
                this.$moduleInstance = unityAdsModule;
                this.$this_registry = servicesRegistry;
            }

            @Override // o00O0Oo.OooO0O0
            public final o000OO invoke() {
                return this.$moduleInstance.showCoroutineScope((ISDKDispatchers) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(ISDKDispatchers.class))), (o0000O0) this.$this_registry.resolveService(new ServiceKey("sdk", o0OO00O.OooO00o(o0000O0.class))), (o00O0O00) this.$this_registry.resolveService(new ServiceKey(ServiceProvider.NAMED_PUBLIC_JOB, o0OO00O.OooO00o(o00O0O00.class))));
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$90 */
        public static final class AnonymousClass90 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass90(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // o00O0Oo.OooO0O0
            public final CleanAssets invoke() {
                return new CommonCleanAssets((CacheRepository) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(CacheRepository.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(SendDiagnosticEvent.class))));
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$91 */
        public static final class AnonymousClass91 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass91(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // o00O0Oo.OooO0O0
            public final GetAdObject invoke() {
                return new CommonGetAdObject((AdRepository) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(AdRepository.class))));
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$92 */
        public static final class AnonymousClass92 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass92(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // o00O0Oo.OooO0O0
            public final GetHeaderBiddingToken invoke() {
                return new CommonGetHeaderBiddingToken((BuildHeaderBiddingToken) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(BuildHeaderBiddingToken.class))), (FetchSignalsAndSendUseCase) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(FetchSignalsAndSendUseCase.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(SessionRepository.class))));
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$93 */
        public static final class AnonymousClass93 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass93(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // o00O0Oo.OooO0O0
            public final BuildHeaderBiddingToken invoke() {
                return new AndroidBuildHeaderBiddingToken((GetByteStringId) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(GetByteStringId.class))), (GetClientInfo) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(GetClientInfo.class))), (GetSharedDataTimestamps) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(GetSharedDataTimestamps.class))), (GetLimitedSessionToken) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(GetLimitedSessionToken.class))), (GetInitializationData) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(GetInitializationData.class))), (DeviceInfoRepository) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(DeviceInfoRepository.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(SessionRepository.class))), (CampaignRepository) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(CampaignRepository.class))), (TcfRepository) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(TcfRepository.class))), (AndroidTestDataInfo) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(AndroidTestDataInfo.class))), (OfferwallManager) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(OfferwallManager.class))));
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$94 */
        public static final class AnonymousClass94 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass94(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // o00O0Oo.OooO0O0
            public final TokenNumberProvider invoke() {
                return new CommonTokenNumberProvider((SessionRepository) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(SessionRepository.class))));
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$95 */
        public static final class AnonymousClass95 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass95(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // o00O0Oo.OooO0O0
            public final GetInitializationData invoke() {
                return new AndroidGetInitializationData((GetInitializationRequestPayload) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(GetInitializationRequestPayload.class))), (GetUniversalRequestSharedData) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(GetUniversalRequestSharedData.class))));
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$96 */
        public static final class AnonymousClass96 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass96(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // o00O0Oo.OooO0O0
            public final MediationInitBlobMetadataReader invoke() {
                return new MediationInitBlobMetadataReader((JsonStorage) this.$this_registry.resolveService(new ServiceKey("MEMORY", o0OO00O.OooO00o(JsonStorage.class))));
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$97 */
        public static final class AnonymousClass97 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass97(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // o00O0Oo.OooO0O0
            public final GetInitializationRequestPayload invoke() {
                return new AndroidGetInitializationRequestPayload((GetClientInfo) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(GetClientInfo.class))), (SessionRepository) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(SessionRepository.class))), (DeviceInfoRepository) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(DeviceInfoRepository.class))), (LegacyUserConsentRepository) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(LegacyUserConsentRepository.class))), (MediationInitBlobMetadataReader) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(MediationInitBlobMetadataReader.class))));
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$98 */
        public static final class AnonymousClass98 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass98(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // o00O0Oo.OooO0O0
            public final GetInitializationState invoke() {
                return new CommonGetInitializationState((SessionRepository) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(SessionRepository.class))), (SDKPropertiesManager) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(SDKPropertiesManager.class))));
            }
        }

        /* renamed from: com.unity3d.services.core.di.ServiceProvider$initialize$1$99 */
        public static final class AnonymousClass99 extends Oooo000 implements OooO0O0 {
            final /* synthetic */ ServicesRegistry $this_registry;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass99(ServicesRegistry servicesRegistry) {
                super(0);
                this.$this_registry = servicesRegistry;
            }

            @Override // o00O0Oo.OooO0O0
            public final GetIsFileCache invoke() {
                return new CommonGetIsFileCache((CacheRepository) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(CacheRepository.class))), (SendDiagnosticEvent) this.$this_registry.resolveService(new ServiceKey("", o0OO00O.OooO00o(SendDiagnosticEvent.class))));
            }
        }

        public C43181() {
            super(1);
        }

        @Override // o00O0Oo.Oooo000
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((ServicesRegistry) obj);
            return oo00o.OooOo.f33195OooO00o;
        }

        public final void invoke(ServicesRegistry registry) {
            OooOo.OooO0o0(registry, "$this$registry");
            UnityAdsModule unityAdsModule = new UnityAdsModule();
            registry.updateService(new ServiceKey("", o0OO00O.OooO00o(Context.class)), o0OOO0.OooO0oo(AnonymousClass1.INSTANCE));
            registry.updateService(new ServiceKey(ServiceProvider.MAIN_DISPATCHER, o0OO00O.OooO00o(o0000O00.class)), o0OOO0.OooO0oo(new AnonymousClass2(unityAdsModule)));
            registry.updateService(new ServiceKey(ServiceProvider.DEFAULT_DISPATCHER, o0OO00O.OooO00o(o0000O00.class)), o0OOO0.OooO0oo(new AnonymousClass3(unityAdsModule)));
            registry.updateService(new ServiceKey(ServiceProvider.IO_DISPATCHER, o0OO00O.OooO00o(o0000O00.class)), o0OOO0.OooO0oo(new AnonymousClass4(unityAdsModule)));
            registry.updateService(new ServiceKey("", o0OO00O.OooO00o(ISDKDispatchers.class)), o0OOO0.OooO0oo(new AnonymousClass5(unityAdsModule)));
            registry.updateService(new ServiceKey("", o0OO00O.OooO00o(SDKMetricsSender.class)), o0OOO0.OooO0oo(new AnonymousClass6(unityAdsModule)));
            registry.updateService(new ServiceKey(ServiceProvider.NAMED_INIT_SCOPE, o0OO00O.OooO00o(o000OO.class)), ServiceFactoryKt.factoryOf(new AnonymousClass7(unityAdsModule, registry)));
            registry.updateService(new ServiceKey(ServiceProvider.NAMED_LOAD_SCOPE, o0OO00O.OooO00o(o000OO.class)), ServiceFactoryKt.factoryOf(new AnonymousClass8(unityAdsModule, registry)));
            registry.updateService(new ServiceKey(ServiceProvider.NAMED_SHOW_SCOPE, o0OO00O.OooO00o(o000OO.class)), ServiceFactoryKt.factoryOf(new AnonymousClass9(unityAdsModule, registry)));
            registry.updateService(new ServiceKey(ServiceProvider.NAMED_TRANSACTION_SCOPE, o0OO00O.OooO00o(o000OO.class)), ServiceFactoryKt.factoryOf(new AnonymousClass10(unityAdsModule, registry)));
            registry.updateService(new ServiceKey(ServiceProvider.NAMED_GET_TOKEN_SCOPE, o0OO00O.OooO00o(o000OO.class)), ServiceFactoryKt.factoryOf(new AnonymousClass11(unityAdsModule, registry)));
            registry.updateService(new ServiceKey(ServiceProvider.NAMED_SCAR_SCOPE, o0OO00O.OooO00o(o000OO.class)), ServiceFactoryKt.factoryOf(new AnonymousClass12(unityAdsModule, registry)));
            registry.updateService(new ServiceKey(ServiceProvider.NAMED_OFFERWALL_SCOPE, o0OO00O.OooO00o(o000OO.class)), ServiceFactoryKt.factoryOf(new AnonymousClass13(unityAdsModule, registry)));
            registry.updateService(new ServiceKey(ServiceProvider.NAMED_OMID_SCOPE, o0OO00O.OooO00o(o000OO.class)), ServiceFactoryKt.factoryOf(new AnonymousClass14(unityAdsModule, registry)));
            registry.updateService(new ServiceKey(ServiceProvider.NAMED_PUBLIC_JOB, o0OO00O.OooO00o(o00O0O00.class)), ServiceFactoryKt.factoryOf(new AnonymousClass15(unityAdsModule, registry)));
            registry.updateService(new ServiceKey(ServiceProvider.DATA_STORE_GATEWAY_CACHE, o0OO00O.OooO00o(ByteStringDataSource.class)), o0OOO0.OooO0oo(new AnonymousClass16(registry)));
            registry.updateService(new ServiceKey(ServiceProvider.DATA_STORE_PRIVACY, o0OO00O.OooO00o(DataStore.class)), o0OOO0.OooO0oo(new AnonymousClass17(unityAdsModule, registry)));
            registry.updateService(new ServiceKey(ServiceProvider.DATA_STORE_PRIVACY, o0OO00O.OooO00o(ByteStringDataSource.class)), o0OOO0.OooO0oo(new AnonymousClass18(unityAdsModule, registry)));
            registry.updateService(new ServiceKey(ServiceProvider.DATA_STORE_PRIVACY_FSM, o0OO00O.OooO00o(DataStore.class)), o0OOO0.OooO0oo(new AnonymousClass19(unityAdsModule, registry)));
            registry.updateService(new ServiceKey(ServiceProvider.DATA_STORE_PRIVACY_FSM, o0OO00O.OooO00o(ByteStringDataSource.class)), o0OOO0.OooO0oo(new AnonymousClass20(unityAdsModule, registry)));
            registry.updateService(new ServiceKey(ServiceProvider.DATA_STORE_NATIVE_CONFIG, o0OO00O.OooO00o(DataStore.class)), o0OOO0.OooO0oo(new AnonymousClass21(unityAdsModule, registry)));
            registry.updateService(new ServiceKey(ServiceProvider.DATA_STORE_NATIVE_CONFIG, o0OO00O.OooO00o(ByteStringDataSource.class)), o0OOO0.OooO0oo(new AnonymousClass22(unityAdsModule, registry)));
            registry.updateService(new ServiceKey(ServiceProvider.DATA_STORE_GL_INFO, o0OO00O.OooO00o(DataStore.class)), o0OOO0.OooO0oo(new AnonymousClass23(unityAdsModule, registry)));
            registry.updateService(new ServiceKey(ServiceProvider.DATA_STORE_GL_INFO, o0OO00O.OooO00o(ByteStringDataSource.class)), o0OOO0.OooO0oo(new AnonymousClass24(unityAdsModule, registry)));
            registry.updateService(new ServiceKey(ServiceProvider.DATA_STORE_UNIVERSAL_REQUEST, o0OO00O.OooO00o(DataStore.class)), o0OOO0.OooO0oo(new AnonymousClass25(unityAdsModule, registry)));
            registry.updateService(new ServiceKey(ServiceProvider.DATA_STORE_IAP_TRANSACTION, o0OO00O.OooO00o(DataStore.class)), o0OOO0.OooO0oo(new AnonymousClass26(unityAdsModule, registry)));
            registry.updateService(new ServiceKey(ServiceProvider.DATA_STORE_IAP_TRANSACTION, o0OO00O.OooO00o(ByteStringDataSource.class)), o0OOO0.OooO0oo(new AnonymousClass27(unityAdsModule, registry)));
            registry.updateService(new ServiceKey(ServiceProvider.DATA_STORE_WEBVIEW_CONFIG, o0OO00O.OooO00o(DataStore.class)), o0OOO0.OooO0oo(new AnonymousClass28(unityAdsModule, registry)));
            registry.updateService(new ServiceKey("", o0OO00O.OooO00o(AsyncTokenStorage.class)), o0OOO0.OooO0oo(new AnonymousClass29(unityAdsModule, registry)));
            registry.updateService(new ServiceKey("", o0OO00O.OooO00o(VolumeChangeMonitor.class)), o0OOO0.OooO0oo(new AnonymousClass30(unityAdsModule, registry)));
            registry.updateService(new ServiceKey("PUBLIC", o0OO00O.OooO00o(JsonStorage.class)), o0OOO0.OooO0oo(new AnonymousClass31(unityAdsModule)));
            registry.updateService(new ServiceKey("PRIVATE", o0OO00O.OooO00o(JsonStorage.class)), o0OOO0.OooO0oo(new AnonymousClass32(unityAdsModule)));
            registry.updateService(new ServiceKey("MEMORY", o0OO00O.OooO00o(JsonStorage.class)), o0OOO0.OooO0oo(new AnonymousClass33(unityAdsModule)));
            registry.updateService(new ServiceKey("", o0OO00O.OooO00o(NativeConfigurationOuterClass.NativeConfiguration.class)), o0OOO0.OooO0oo(new AnonymousClass34(unityAdsModule)));
            registry.updateService(new ServiceKey("", o0OO00O.OooO00o(MeasurementsService.class)), o0OOO0.OooO0oo(new AnonymousClass35(unityAdsModule, registry)));
            registry.updateService(new ServiceKey("", o0OO00O.OooO00o(TopicsService.class)), o0OOO0.OooO0oo(new AnonymousClass36(unityAdsModule, registry)));
            registry.updateService(new ServiceKey("", o0OO00O.OooO00o(CronetEngineBuilderFactory.class)), o0OOO0.OooO0oo(AnonymousClass37.INSTANCE));
            registry.updateService(new ServiceKey("", o0OO00O.OooO00o(HttpClientProvider.class)), o0OOO0.OooO0oo(new AnonymousClass38(registry)));
            registry.updateService(new ServiceKey("", o0OO00O.OooO00o(HttpClient.class)), o0OOO0.OooO0oo(new AnonymousClass39(registry)));
            registry.updateService(new ServiceKey(ServiceProvider.NAMED_GATEWAY_HTTP_CLIENT, o0OO00O.OooO00o(HttpClient.class)), o0OOO0.OooO0oo(new AnonymousClass40(registry)));
            registry.updateService(new ServiceKey("", o0OO00O.OooO00o(MediationTraitsMetadataReader.class)), ServiceFactoryKt.factoryOf(new AnonymousClass41(registry)));
            registry.updateService(new ServiceKey("", o0OO00O.OooO00o(AlternativeFlowReader.class)), o0OOO0.OooO0oo(new AnonymousClass42(registry)));
            registry.updateService(new ServiceKey("", o0OO00O.OooO00o(TcfDataSource.class)), o0OOO0.OooO0oo(AnonymousClass43.INSTANCE));
            registry.updateService(new ServiceKey("", o0OO00O.OooO00o(TcfRepository.class)), o0OOO0.OooO0oo(new AnonymousClass44(registry)));
            registry.updateService(new ServiceKey("", o0OO00O.OooO00o(AndroidManifestIntPropertyReader.class)), o0OOO0.OooO0oo(new AnonymousClass45(registry)));
            registry.updateService(new ServiceKey("", o0OO00O.OooO00o(AndroidTestDataInfo.class)), o0OOO0.OooO0oo(new AnonymousClass46(registry)));
            registry.updateService(new ServiceKey("", o0OO00O.OooO00o(GameServerIdReader.class)), o0OOO0.OooO0oo(new AnonymousClass47(registry)));
            registry.updateService(new ServiceKey("", o0OO00O.OooO00o(StoreDataSource.class)), o0OOO0.OooO0oo(new AnonymousClass48(registry)));
            registry.updateService(new ServiceKey("", o0OO00O.OooO00o(AnalyticsDataSource.class)), o0OOO0.OooO0oo(AnonymousClass49.INSTANCE));
            registry.updateService(new ServiceKey("", o0OO00O.OooO00o(DeveloperConsentDataSource.class)), o0OOO0.OooO0oo(new AnonymousClass50(registry)));
            registry.updateService(new ServiceKey("", o0OO00O.OooO00o(DynamicDeviceInfoDataSource.class)), o0OOO0.OooO0oo(new AnonymousClass51(registry)));
            registry.updateService(new ServiceKey("", o0OO00O.OooO00o(LegacyUserConsentDataSource.class)), o0OOO0.OooO0oo(new AnonymousClass52(registry)));
            registry.updateService(new ServiceKey("", o0OO00O.OooO00o(LifecycleDataSource.class)), o0OOO0.OooO0oo(AnonymousClass53.INSTANCE));
            registry.updateService(new ServiceKey(ServiceProvider.NAMED_LOCAL, o0OO00O.OooO00o(CacheDataSource.class)), o0OOO0.OooO0oo(new AnonymousClass54(registry)));
            registry.updateService(new ServiceKey("", o0OO00O.OooO00o(CreateFile.class)), o0OOO0.OooO0oo(AnonymousClass55.INSTANCE));
            registry.updateService(new ServiceKey("", o0OO00O.OooO00o(GetFileExtensionFromUrl.class)), o0OOO0.OooO0oo(new AnonymousClass56(registry)));
            registry.updateService(new ServiceKey("", o0OO00O.OooO00o(RemoveUrlQuery.class)), o0OOO0.OooO0oo(AnonymousClass57.INSTANCE));
            registry.updateService(new ServiceKey("", o0OO00O.OooO00o(MediationDataSource.class)), o0OOO0.OooO0oo(new AnonymousClass58(registry)));
            registry.updateService(new ServiceKey("", o0OO00O.OooO00o(PrivacyDeviceInfoDataSource.class)), o0OOO0.OooO0oo(new AnonymousClass59(registry)));
            registry.updateService(new ServiceKey(ServiceProvider.NAMED_REMOTE, o0OO00O.OooO00o(CacheDataSource.class)), o0OOO0.OooO0oo(new AnonymousClass60(registry)));
            registry.updateService(new ServiceKey("", o0OO00O.OooO00o(StaticDeviceInfoDataSource.class)), o0OOO0.OooO0oo(new AnonymousClass61(registry)));
            registry.updateService(new ServiceKey(ServiceProvider.PREF_GL_INFO, o0OO00O.OooO00o(DataMigration.class)), o0OOO0.OooO0oo(new AnonymousClass62(registry)));
            registry.updateService(new ServiceKey("", o0OO00O.OooO00o(UniversalRequestDataSource.class)), o0OOO0.OooO0oo(new AnonymousClass63(registry)));
            registry.updateService(new ServiceKey("", o0OO00O.OooO00o(WebviewConfigurationDataSource.class)), o0OOO0.OooO0oo(new AnonymousClass64(registry)));
            registry.updateService(new ServiceKey("", o0OO00O.OooO00o(OmidManager.class)), o0OOO0.OooO0oo(AnonymousClass65.INSTANCE));
            registry.updateService(new ServiceKey("", o0OO00O.OooO00o(SDKPropertiesManager.class)), o0OOO0.OooO0oo(AnonymousClass66.INSTANCE));
            registry.updateService(new ServiceKey("", o0OO00O.OooO00o(StorageManager.class)), o0OOO0.OooO0oo(AnonymousClass67.INSTANCE));
            registry.updateService(new ServiceKey("", o0OO00O.OooO00o(TransactionEventManager.class)), o0OOO0.OooO0oo(new AnonymousClass68(registry)));
            registry.updateService(new ServiceKey("", o0OO00O.OooO00o(AdRepository.class)), o0OOO0.OooO0oo(AnonymousClass69.INSTANCE));
            registry.updateService(new ServiceKey("", o0OO00O.OooO00o(CacheRepository.class)), o0OOO0.OooO0oo(new AnonymousClass70(registry)));
            registry.updateService(new ServiceKey("", o0OO00O.OooO00o(GetCacheDirectory.class)), o0OOO0.OooO0oo(AnonymousClass71.INSTANCE));
            registry.updateService(new ServiceKey("", o0OO00O.OooO00o(CampaignRepository.class)), o0OOO0.OooO0oo(new AnonymousClass72(registry)));
            registry.updateService(new ServiceKey("", o0OO00O.OooO00o(DeveloperConsentRepository.class)), o0OOO0.OooO0oo(new AnonymousClass73(registry)));
            registry.updateService(new ServiceKey("", o0OO00O.OooO00o(DeviceInfoRepository.class)), o0OOO0.OooO0oo(new AnonymousClass74(registry)));
            registry.updateService(new ServiceKey("", o0OO00O.OooO00o(DiagnosticEventRepository.class)), o0OOO0.OooO0oo(new AnonymousClass75(registry)));
            registry.updateService(new ServiceKey("", o0OO00O.OooO00o(LegacyUserConsentRepository.class)), o0OOO0.OooO0oo(new AnonymousClass76(registry)));
            registry.updateService(new ServiceKey("", o0OO00O.OooO00o(MediationRepository.class)), o0OOO0.OooO0oo(new AnonymousClass77(registry)));
            registry.updateService(new ServiceKey("", o0OO00O.OooO00o(OpenMeasurementRepository.class)), o0OOO0.OooO0oo(new AnonymousClass78(registry)));
            registry.updateService(new ServiceKey("", o0OO00O.OooO00o(SessionRepository.class)), o0OOO0.OooO0oo(new AnonymousClass79(registry)));
            registry.updateService(new ServiceKey("", o0OO00O.OooO00o(TransactionEventRepository.class)), o0OOO0.OooO0oo(AnonymousClass80.INSTANCE));
            registry.updateService(new ServiceKey("", o0OO00O.OooO00o(OperativeEventRepository.class)), o0OOO0.OooO0oo(AnonymousClass81.INSTANCE));
            registry.updateService(new ServiceKey("", o0OO00O.OooO00o(ExecuteAdViewerRequest.class)), o0OOO0.OooO0oo(new AnonymousClass82(registry)));
            registry.updateService(new ServiceKey("", o0OO00O.OooO00o(GetByteStringId.class)), o0OOO0.OooO0oo(AnonymousClass83.INSTANCE));
            registry.updateService(new ServiceKey("", o0OO00O.OooO00o(HandleOpenUrl.class)), o0OOO0.OooO0oo(new AnonymousClass84(registry)));
            registry.updateService(new ServiceKey("", o0OO00O.OooO00o(Refresh.class)), o0OOO0.OooO0oo(new AnonymousClass85(registry)));
            registry.updateService(new ServiceKey("", o0OO00O.OooO00o(SendDiagnosticEvent.class)), o0OOO0.OooO0oo(new AnonymousClass86(registry)));
            registry.updateService(new ServiceKey("", o0OO00O.OooO00o(SendWebViewClientErrorDiagnostics.class)), o0OOO0.OooO0oo(new AnonymousClass87(registry)));
            registry.updateService(new ServiceKey("", o0OO00O.OooO00o(Show.class)), o0OOO0.OooO0oo(new AnonymousClass88(registry)));
            registry.updateService(new ServiceKey("", o0OO00O.OooO00o(CacheFile.class)), o0OOO0.OooO0oo(new AnonymousClass89(registry)));
            registry.updateService(new ServiceKey("", o0OO00O.OooO00o(CleanAssets.class)), o0OOO0.OooO0oo(new AnonymousClass90(registry)));
            registry.updateService(new ServiceKey("", o0OO00O.OooO00o(GetAdObject.class)), o0OOO0.OooO0oo(new AnonymousClass91(registry)));
            registry.updateService(new ServiceKey("", o0OO00O.OooO00o(GetHeaderBiddingToken.class)), ServiceFactoryKt.factoryOf(new AnonymousClass92(registry)));
            registry.updateService(new ServiceKey("", o0OO00O.OooO00o(BuildHeaderBiddingToken.class)), ServiceFactoryKt.factoryOf(new AnonymousClass93(registry)));
            registry.updateService(new ServiceKey("", o0OO00O.OooO00o(TokenNumberProvider.class)), ServiceFactoryKt.factoryOf(new AnonymousClass94(registry)));
            registry.updateService(new ServiceKey("", o0OO00O.OooO00o(GetInitializationData.class)), o0OOO0.OooO0oo(new AnonymousClass95(registry)));
            registry.updateService(new ServiceKey("", o0OO00O.OooO00o(MediationInitBlobMetadataReader.class)), ServiceFactoryKt.factoryOf(new AnonymousClass96(registry)));
            registry.updateService(new ServiceKey("", o0OO00O.OooO00o(GetInitializationRequestPayload.class)), o0OOO0.OooO0oo(new AnonymousClass97(registry)));
            registry.updateService(new ServiceKey("", o0OO00O.OooO00o(GetInitializationState.class)), o0OOO0.OooO0oo(new AnonymousClass98(registry)));
            registry.updateService(new ServiceKey("", o0OO00O.OooO00o(GetIsFileCache.class)), o0OOO0.OooO0oo(new AnonymousClass99(registry)));
            registry.updateService(new ServiceKey("", o0OO00O.OooO00o(SetInitializationState.class)), o0OOO0.OooO0oo(new AnonymousClass100(registry)));
            registry.updateService(new ServiceKey(ServiceProvider.NAMED_AD_REQ, o0OO00O.OooO00o(GetRequestPolicy.class)), o0OOO0.OooO0oo(new AnonymousClass101(registry)));
            registry.updateService(new ServiceKey("", o0OO00O.OooO00o(GetAdDataRefreshRequest.class)), o0OOO0.OooO0oo(new AnonymousClass102(registry)));
            registry.updateService(new ServiceKey("", o0OO00O.OooO00o(GetAdPlayerConfigRequest.class)), o0OOO0.OooO0oo(new AnonymousClass103(registry)));
            registry.updateService(new ServiceKey("", o0OO00O.OooO00o(AndroidGetAdPlayerContext.class)), o0OOO0.OooO0oo(new AnonymousClass104(registry)));
            registry.updateService(new ServiceKey("", o0OO00O.OooO00o(GetAdRequest.class)), o0OOO0.OooO0oo(new AnonymousClass105(registry)));
            registry.updateService(new ServiceKey("", o0OO00O.OooO00o(GetHbTokenEventRequest.class)), o0OOO0.OooO0oo(AnonymousClass106.INSTANCE));
            registry.updateService(new ServiceKey("", o0OO00O.OooO00o(CommonScarEventReceiver.class)), o0OOO0.OooO0oo(new AnonymousClass107(registry)));
            registry.updateService(new ServiceKey("", o0OO00O.OooO00o(GMAScarAdapterBridge.class)), o0OOO0.OooO0oo(new AnonymousClass108(registry)));
            registry.updateService(new ServiceKey("", o0OO00O.OooO00o(ScarTimeHackFixer.class)), o0OOO0.OooO0oo(new AnonymousClass109(registry)));
            registry.updateService(new ServiceKey("", o0OO00O.OooO00o(ScarManager.class)), o0OOO0.OooO0oo(new AnonymousClass110(registry)));
            registry.updateService(new ServiceKey("", o0OO00O.OooO00o(FetchSignalsAndSendUseCase.class)), o0OOO0.OooO0oo(new AnonymousClass111(registry)));
            registry.updateService(new ServiceKey("", o0OO00O.OooO00o(LoadScarAd.class)), o0OOO0.OooO0oo(new AnonymousClass112(registry)));
            registry.updateService(new ServiceKey("", o0OO00O.OooO00o(HandleGetTokenRequest.class)), o0OOO0.OooO0oo(new AnonymousClass113(registry)));
            registry.updateService(new ServiceKey("", o0OO00O.OooO00o(GetClientInfo.class)), o0OOO0.OooO0oo(new AnonymousClass114(registry)));
            registry.updateService(new ServiceKey("", o0OO00O.OooO00o(GetInitializationCompletedRequest.class)), o0OOO0.OooO0oo(new AnonymousClass115(registry)));
            registry.updateService(new ServiceKey("", o0OO00O.OooO00o(GetInitializationRequest.class)), o0OOO0.OooO0oo(new AnonymousClass116(registry)));
            registry.updateService(new ServiceKey("", o0OO00O.OooO00o(GetLimitedSessionToken.class)), o0OOO0.OooO0oo(new AnonymousClass117(registry)));
            registry.updateService(new ServiceKey("", o0OO00O.OooO00o(GetOpenGLRendererInfo.class)), o0OOO0.OooO0oo(new AnonymousClass118(registry)));
            registry.updateService(new ServiceKey("", o0OO00O.OooO00o(GetSharedDataTimestamps.class)), o0OOO0.OooO0oo(AnonymousClass119.INSTANCE));
            registry.updateService(new ServiceKey("", o0OO00O.OooO00o(GetUniversalRequestForPayLoad.class)), o0OOO0.OooO0oo(new AnonymousClass120(registry)));
            registry.updateService(new ServiceKey("", o0OO00O.OooO00o(GetUniversalRequestSharedData.class)), o0OOO0.OooO0oo(new AnonymousClass121(registry)));
            registry.updateService(new ServiceKey("", o0OO00O.OooO00o(GetCachedAsset.class)), o0OOO0.OooO0oo(new AnonymousClass122(registry)));
            registry.updateService(new ServiceKey("", o0OO00O.OooO00o(GetWebViewBridgeUseCase.class)), o0OOO0.OooO0oo(new AnonymousClass123(registry)));
            registry.updateService(new ServiceKey(ServiceProvider.NAMED_INIT_REQ, o0OO00O.OooO00o(GetRequestPolicy.class)), o0OOO0.OooO0oo(new AnonymousClass124(registry)));
            registry.updateService(new ServiceKey("", o0OO00O.OooO00o(GetLatestWebViewConfiguration.class)), o0OOO0.OooO0oo(new AnonymousClass125(registry)));
            registry.updateService(new ServiceKey(ServiceProvider.NAMED_OPERATIVE_REQ, o0OO00O.OooO00o(GetRequestPolicy.class)), o0OOO0.OooO0oo(new AnonymousClass126(registry)));
            registry.updateService(new ServiceKey(ServiceProvider.NAMED_OTHER_REQ, o0OO00O.OooO00o(GetRequestPolicy.class)), o0OOO0.OooO0oo(new AnonymousClass127(registry)));
            registry.updateService(new ServiceKey("", o0OO00O.OooO00o(GetPrivacyUpdateRequest.class)), o0OOO0.OooO0oo(new AnonymousClass128(registry)));
            registry.updateService(new ServiceKey("", o0OO00O.OooO00o(HandleGatewayInitializationResponse.class)), o0OOO0.OooO0oo(new AnonymousClass129(registry)));
            registry.updateService(new ServiceKey("", o0OO00O.OooO00o(HandleGatewayUniversalResponse.class)), o0OOO0.OooO0oo(new AnonymousClass130(registry)));
            registry.updateService(new ServiceKey("", o0OO00O.OooO00o(InitializeBoldSDK.class)), o0OOO0.OooO0oo(new AnonymousClass131(registry)));
            registry.updateService(new ServiceKey("", o0OO00O.OooO00o(LegacyShowUseCase.class)), ServiceFactoryKt.factoryOf(new AnonymousClass132(registry)));
            registry.updateService(new ServiceKey("", o0OO00O.OooO00o(SendPrivacyUpdateRequest.class)), o0OOO0.OooO0oo(new AnonymousClass133(registry)));
            registry.updateService(new ServiceKey("", o0OO00O.OooO00o(TriggerInitializationCompletedRequest.class)), o0OOO0.OooO0oo(new AnonymousClass134(registry)));
            registry.updateService(new ServiceKey("", o0OO00O.OooO00o(TriggerInitializeListener.class)), o0OOO0.OooO0oo(new AnonymousClass135(registry)));
            registry.updateService(new ServiceKey("", o0OO00O.OooO00o(DiagnosticEventObserver.class)), o0OOO0.OooO0oo(new AnonymousClass136(registry)));
            registry.updateService(new ServiceKey("", o0OO00O.OooO00o(EventObservers.class)), o0OOO0.OooO0oo(new AnonymousClass137(registry)));
            registry.updateService(new ServiceKey("", o0OO00O.OooO00o(GetTransactionData.class)), o0OOO0.OooO0oo(new AnonymousClass138(registry)));
            registry.updateService(new ServiceKey("", o0OO00O.OooO00o(GetTransactionRequest.class)), o0OOO0.OooO0oo(new AnonymousClass139(registry)));
            registry.updateService(new ServiceKey("", o0OO00O.OooO00o(GetDiagnosticEventBatchRequest.class)), o0OOO0.OooO0oo(AnonymousClass140.INSTANCE));
            registry.updateService(new ServiceKey("", o0OO00O.OooO00o(GetDiagnosticEventRequest.class)), o0OOO0.OooO0oo(new AnonymousClass141(registry)));
            registry.updateService(new ServiceKey("", o0OO00O.OooO00o(GetOperativeEventApi.class)), o0OOO0.OooO0oo(new AnonymousClass142(registry)));
            registry.updateService(new ServiceKey("", o0OO00O.OooO00o(GetOperativeEventRequest.class)), o0OOO0.OooO0oo(new AnonymousClass143(registry)));
            registry.updateService(new ServiceKey("", o0OO00O.OooO00o(HandleGatewayEventResponse.class)), o0OOO0.OooO0oo(AnonymousClass144.INSTANCE));
            registry.updateService(new ServiceKey("", o0OO00O.OooO00o(OperativeEventObserver.class)), o0OOO0.OooO0oo(new AnonymousClass145(registry)));
            registry.updateService(new ServiceKey("", o0OO00O.OooO00o(TransactionEventObserver.class)), o0OOO0.OooO0oo(new AnonymousClass146(registry)));
            registry.updateService(new ServiceKey("", o0OO00O.OooO00o(UniversalRequestTtlValidator.class)), o0OOO0.OooO0oo(AnonymousClass147.INSTANCE));
            registry.updateService(new ServiceKey("", o0OO00O.OooO00o(UniversalRequestEventSender.class)), o0OOO0.OooO0oo(new AnonymousClass148(registry)));
            registry.updateService(new ServiceKey("", o0OO00O.OooO00o(OmFinishSession.class)), o0OOO0.OooO0oo(new AnonymousClass149(registry)));
            registry.updateService(new ServiceKey("", o0OO00O.OooO00o(OmImpressionOccurred.class)), o0OOO0.OooO0oo(new AnonymousClass150(registry)));
            registry.updateService(new ServiceKey("", o0OO00O.OooO00o(AndroidOmInteraction.class)), o0OOO0.OooO0oo(new AnonymousClass151(registry)));
            registry.updateService(new ServiceKey("", o0OO00O.OooO00o(GetOmData.class)), o0OOO0.OooO0oo(new AnonymousClass152(registry)));
            registry.updateService(new ServiceKey("", o0OO00O.OooO00o(IsOMActivated.class)), o0OOO0.OooO0oo(new AnonymousClass153(registry)));
            registry.updateService(new ServiceKey("", o0OO00O.OooO00o(InitializeOMSDK.class)), o0OOO0.OooO0oo(new AnonymousClass154(registry)));
            registry.updateService(new ServiceKey(ServiceProvider.DEV_CONSENT_PRIVACY_RULES, o0OO00O.OooO00o(FlattenerRulesUseCase.class)), o0OOO0.OooO0oo(AnonymousClass155.INSTANCE));
            registry.updateService(new ServiceKey(ServiceProvider.LEGACY_PRIVACY_RULES, o0OO00O.OooO00o(FlattenerRulesUseCase.class)), o0OOO0.OooO0oo(AnonymousClass156.INSTANCE));
            registry.updateService(new ServiceKey("", o0OO00O.OooO00o(BackgroundWorker.class)), o0OOO0.OooO0oo(new AnonymousClass157(registry)));
            registry.updateService(new ServiceKey("", o0OO00O.OooO00o(DiagnosticEventRequestWorkModifier.class)), o0OOO0.OooO0oo(new AnonymousClass158(registry)));
            registry.updateService(new ServiceKey("", o0OO00O.OooO00o(GatewayClient.class)), o0OOO0.OooO0oo(new AnonymousClass159(registry)));
            registry.updateService(new ServiceKey("sdk", o0OO00O.OooO00o(o0000O0.class)), o0OOO0.OooO0oo(new AnonymousClass160(registry)));
            registry.updateService(new ServiceKey("", o0OO00O.OooO00o(TokenStorage.class)), o0OOO0.OooO0oo(AnonymousClass161.INSTANCE));
            registry.updateService(new ServiceKey("", o0OO00O.OooO00o(VolumeChange.class)), o0OOO0.OooO0oo(AnonymousClass162.INSTANCE));
            registry.updateService(new ServiceKey("", o0OO00O.OooO00o(ConfigFileFromLocalStorage.class)), o0OOO0.OooO0oo(new AnonymousClass163(registry)));
            registry.updateService(new ServiceKey("", o0OO00O.OooO00o(InitializeSDK.class)), o0OOO0.OooO0oo(new AnonymousClass164(registry)));
            registry.updateService(new ServiceKey("", o0OO00O.OooO00o(InitializeStateComplete.class)), o0OOO0.OooO0oo(new AnonymousClass165(registry)));
            registry.updateService(new ServiceKey("", o0OO00O.OooO00o(InitializeStateConfig.class)), o0OOO0.OooO0oo(new AnonymousClass166(registry)));
            registry.updateService(new ServiceKey("", o0OO00O.OooO00o(InitializeStateConfigWithLoader.class)), o0OOO0.OooO0oo(new AnonymousClass167(registry)));
            registry.updateService(new ServiceKey("", o0OO00O.OooO00o(InitializeStateCreate.class)), o0OOO0.OooO0oo(new AnonymousClass168(registry)));
            registry.updateService(new ServiceKey("", o0OO00O.OooO00o(InitializeStateError.class)), o0OOO0.OooO0oo(new AnonymousClass169(registry)));
            registry.updateService(new ServiceKey("", o0OO00O.OooO00o(InitializeStateLoadCache.class)), o0OOO0.OooO0oo(new AnonymousClass170(registry)));
            registry.updateService(new ServiceKey("", o0OO00O.OooO00o(InitializeStateLoadWeb.class)), o0OOO0.OooO0oo(new AnonymousClass171(registry)));
            registry.updateService(new ServiceKey("", o0OO00O.OooO00o(InitializeStateReset.class)), o0OOO0.OooO0oo(new AnonymousClass172(registry)));
            registry.updateService(new ServiceKey("", o0OO00O.OooO00o(StoreMonitor.class)), o0OOO0.OooO0oo(new AnonymousClass173(registry)));
            registry.updateService(new ServiceKey("", o0OO00O.OooO00o(StoreWebViewEventSender.class)), o0OOO0.OooO0oo(new AnonymousClass174(registry)));
            registry.updateService(new ServiceKey("", o0OO00O.OooO00o(StoreExceptionHandler.class)), o0OOO0.OooO0oo(AnonymousClass175.INSTANCE));
            registry.updateService(new ServiceKey("", o0OO00O.OooO00o(StoreEventListenerFactory.class)), o0OOO0.OooO0oo(new AnonymousClass176(registry)));
            registry.updateService(new ServiceKey("", o0OO00O.OooO00o(ConfigurationReader.class)), o0OOO0.OooO0oo(AnonymousClass177.INSTANCE));
            registry.updateService(new ServiceKey("", o0OO00O.OooO00o(AndroidAttribution.class)), o0OOO0.OooO0oo(new AnonymousClass178(registry)));
            registry.updateService(new ServiceKey("", o0OO00O.OooO00o(AdPlayerScope.class)), ServiceFactoryKt.factoryOf(new AnonymousClass179(registry)));
            registry.updateService(new ServiceKey("", o0OO00O.OooO00o(AndroidWebViewClient.class)), ServiceFactoryKt.factoryOf(new AnonymousClass180(registry)));
            registry.updateService(new ServiceKey("", o0OO00O.OooO00o(AndroidGetWebViewContainerUseCase.class)), ServiceFactoryKt.factoryOf(new AnonymousClass181(registry)));
            registry.updateService(new ServiceKey("", o0OO00O.OooO00o(Load.class)), ServiceFactoryKt.factoryOf(new AnonymousClass182(registry)));
            registry.updateService(new ServiceKey("", o0OO00O.OooO00o(AwaitInitialization.class)), ServiceFactoryKt.factoryOf(new AnonymousClass183(registry)));
            registry.updateService(new ServiceKey("", o0OO00O.OooO00o(GetAsyncHeaderBiddingToken.class)), ServiceFactoryKt.factoryOf(new AnonymousClass184(registry)));
            registry.updateService(new ServiceKey("", o0OO00O.OooO00o(GetAdPlayer.class)), ServiceFactoryKt.factoryOf(new AnonymousClass185(registry)));
            registry.updateService(new ServiceKey("", o0OO00O.OooO00o(CacheWebViewAssets.class)), o0OOO0.OooO0oo(new AnonymousClass186(registry)));
            registry.updateService(new ServiceKey("", o0OO00O.OooO00o(HandleGatewayAdResponse.class)), ServiceFactoryKt.factoryOf(new AnonymousClass187(registry)));
            registry.updateService(new ServiceKey("", o0OO00O.OooO00o(HandleInvocationsFromAdViewer.class)), ServiceFactoryKt.factoryOf(AnonymousClass188.INSTANCE));
            registry.updateService(new ServiceKey("", o0OO00O.OooO00o(LegacyLoadUseCase.class)), ServiceFactoryKt.factoryOf(new AnonymousClass189(registry)));
            registry.updateService(new ServiceKey("", o0OO00O.OooO00o(SafeCallbackInvoke.class)), o0OOO0.OooO0oo(new AnonymousClass190(registry)));
            registry.updateService(new ServiceKey("", o0OO00O.OooO00o(InitializeStateNetworkError.class)), ServiceFactoryKt.factoryOf(new AnonymousClass191(registry)));
            registry.updateService(new ServiceKey("", o0OO00O.OooO00o(CoroutineTimer.class)), ServiceFactoryKt.factoryOf(new AnonymousClass192(registry)));
            registry.updateService(new ServiceKey("", o0OO00O.OooO00o(IEventSender.class)), o0OOO0.OooO0oo(AnonymousClass193.INSTANCE));
            registry.updateService(new ServiceKey("", o0OO00O.OooO00o(SetGameId.class)), o0OOO0.OooO0oo(new AnonymousClass194(registry)));
            registry.updateService(new ServiceKey("", o0OO00O.OooO00o(GetGameId.class)), o0OOO0.OooO0oo(new AnonymousClass195(registry)));
            registry.updateService(new ServiceKey("", o0OO00O.OooO00o(ValidateGameId.class)), o0OOO0.OooO0oo(new AnonymousClass196(registry)));
            registry.updateService(new ServiceKey("", o0OO00O.OooO00o(ShouldAllowInitialization.class)), o0OOO0.OooO0oo(new AnonymousClass197(registry)));
            registry.updateService(new ServiceKey("", o0OO00O.OooO00o(CheckForGameIdAndTestModeChanges.class)), o0OOO0.OooO0oo(new AnonymousClass198(registry)));
            registry.updateService(new ServiceKey("", o0OO00O.OooO00o(DownloadPriorityQueue.class)), o0OOO0.OooO0oo(AnonymousClass199.INSTANCE));
            registry.updateService(new ServiceKey("", o0OO00O.OooO00o(CleanupDirectory.class)), o0OOO0.OooO0oo(AnonymousClass200.INSTANCE));
            registry.updateService(new ServiceKey("", o0OO00O.OooO00o(FocusRepository.class)), o0OOO0.OooO0oo(new AnonymousClass201(registry)));
            registry.updateService(new ServiceKey("", o0OO00O.OooO00o(AndroidGetIsAdActivity.class)), o0OOO0.OooO0oo(new AnonymousClass202(registry)));
            registry.updateService(new ServiceKey("", o0OO00O.OooO00o(AndroidGetLifecycleFlow.class)), o0OOO0.OooO0oo(new AnonymousClass203(registry)));
            registry.updateService(new ServiceKey("", o0OO00O.OooO00o(AndroidHandleFocusCounters.class)), o0OOO0.OooO0oo(new AnonymousClass204(registry)));
            registry.updateService(new ServiceKey("", o0OO00O.OooO00o(OfferwallAdapterBridge.class)), o0OOO0.OooO0oo(new AnonymousClass205(registry)));
            registry.updateService(new ServiceKey("", o0OO00O.OooO00o(OfferwallManager.class)), o0OOO0.OooO0oo(new AnonymousClass206(registry)));
            registry.updateService(new ServiceKey("", o0OO00O.OooO00o(LoadOfferwallAd.class)), o0OOO0.OooO0oo(new AnonymousClass207(registry)));
            registry.updateService(new ServiceKey("", o0OO00O.OooO00o(GetIsOfferwallAdReady.class)), o0OOO0.OooO0oo(new AnonymousClass208(registry)));
            registry.updateService(new ServiceKey("", o0OO00O.OooO00o(FIdDataSource.class)), o0OOO0.OooO0oo(new AnonymousClass209(registry)));
            registry.updateService(new ServiceKey("", o0OO00O.OooO00o(FIdExistenceDataSource.class)), o0OOO0.OooO0oo(AnonymousClass210.INSTANCE));
            registry.updateService(new ServiceKey("", o0OO00O.OooO00o(CleanUpWhenOpportunityExpires.class)), o0OOO0.OooO0oo(new AnonymousClass211(registry)));
        }
    }

    static {
        ServiceProvider serviceProvider = new ServiceProvider();
        INSTANCE = serviceProvider;
        serviceRegistry = serviceProvider.initialize();
    }

    private ServiceProvider() {
    }

    @Override // com.unity3d.services.core.p012di.IServiceProvider
    public IServicesRegistry getRegistry() {
        return serviceRegistry;
    }

    @Override // com.unity3d.services.core.p012di.IServiceProvider
    public IServicesRegistry initialize() {
        return ServicesRegistryKt.registry(C43181.INSTANCE);
    }
}
