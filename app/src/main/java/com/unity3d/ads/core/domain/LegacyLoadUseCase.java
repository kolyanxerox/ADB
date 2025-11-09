package com.unity3d.ads.core.domain;

import android.content.Context;
import com.google.protobuf.ByteString;
import com.unity3d.ads.IUnityAdsLoadListener;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.AdObjectState;
import com.unity3d.ads.core.data.model.LoadResult;
import com.unity3d.ads.core.data.model.OperationType;
import com.unity3d.ads.core.data.repository.AdRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.GetInitializationState;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import com.unity3d.ads.core.extensions.TimeExtensionsKt;
import com.unity3d.services.banners.UnityBannerSize;
import com.unity3d.services.core.log.DeviceLog;
import gatewayprotocol.p014v1.AdRequestOuterClass;
import gatewayprotocol.p014v1.BannerSizeKt;
import gatewayprotocol.p014v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.p014v1.HeaderBiddingAdMarkupOuterClass;
import java.lang.reflect.InvocationTargetException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.OooOO0O;
import kotlin.jvm.internal.Oooo000;
import o00O0.o0O0O00;
import o00O0OO0.OooO;
import o00O0OO0.OooO0OO;
import o00O0Oo.OooO0O0;
import o00O0oO.o000000;
import o00O0oOO.OooOOOO;
import o00O0oOO.OooOo00;
import o00O0ooo.oO00000o;
import oo00o.OooOO0;
import oo00o.OooOo;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class LegacyLoadUseCase {
    public static final Companion Companion = new Companion(null);
    public static final String KEY_AD_MARKUP = "adMarkup";
    public static final String KEY_OBJECT_ID = "objectId";
    private String adMarkup;
    private final AdRepository adRepository;
    private final AwaitInitialization awaitInitialization;
    private final CleanUpWhenOpportunityExpires cleanUpWhenOpportunityExpires;
    private final GetInitializationState getInitializationState;
    private boolean isBanner;
    private boolean isHeaderBidding;
    private IUnityAdsLoadListener listener;
    private final Load load;
    private UnityAdsLoadOptions loadOptions;
    private ByteString opportunity;
    private String placement;
    private final SafeCallbackInvoke safeCallbackInvoke;
    private final SendDiagnosticEvent sendDiagnosticEvent;
    private final SessionRepository sessionRepository;
    private OooOo00 startTime;

    public static final class Companion {
        public /* synthetic */ Companion(OooOO0O oooOO0O) {
            this();
        }

        private Companion() {
        }
    }

    @OooO(m13471c = "com.unity3d.ads.core.domain.LegacyLoadUseCase", m13472f = "LegacyLoadUseCase.kt", m13473l = {94}, m13474m = "invoke")
    /* renamed from: com.unity3d.ads.core.domain.LegacyLoadUseCase$invoke$1 */
    public static final class C41081 extends OooO0OO {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C41081(o00O0O0O.OooO0OO oooO0OO) {
            super(oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LegacyLoadUseCase.this.invoke(null, null, null, null, null, this);
        }
    }

    /* renamed from: com.unity3d.ads.core.domain.LegacyLoadUseCase$loadFailure$1 */
    public static final class C41091 extends Oooo000 implements OooO0O0 {
        final /* synthetic */ LoadResult.Failure $loadResult;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41091(LoadResult.Failure failure) {
            super(0);
            this.$loadResult = failure;
        }

        @Override // o00O0Oo.OooO0O0
        public /* bridge */ /* synthetic */ Object invoke() {
            m13773invoke();
            return OooOo.f33195OooO00o;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m13773invoke() {
            IUnityAdsLoadListener iUnityAdsLoadListener = LegacyLoadUseCase.this.listener;
            if (iUnityAdsLoadListener != null) {
                iUnityAdsLoadListener.onUnityAdsFailedToLoad(LegacyLoadUseCase.this.placement, this.$loadResult.getError(), this.$loadResult.getMessage());
            }
        }
    }

    /* renamed from: com.unity3d.ads.core.domain.LegacyLoadUseCase$loadSuccess$1 */
    public static final class C41101 extends Oooo000 implements OooO0O0 {
        public C41101() {
            super(0);
        }

        @Override // o00O0Oo.OooO0O0
        public /* bridge */ /* synthetic */ Object invoke() {
            m13774invoke();
            return OooOo.f33195OooO00o;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m13774invoke() {
            IUnityAdsLoadListener iUnityAdsLoadListener = LegacyLoadUseCase.this.listener;
            if (iUnityAdsLoadListener != null) {
                iUnityAdsLoadListener.onUnityAdsAdLoaded(LegacyLoadUseCase.this.placement);
            }
        }
    }

    public LegacyLoadUseCase(Load load, SendDiagnosticEvent sendDiagnosticEvent, GetInitializationState getInitializationState, AwaitInitialization awaitInitialization, SessionRepository sessionRepository, AdRepository adRepository, SafeCallbackInvoke safeCallbackInvoke, CleanUpWhenOpportunityExpires cleanUpWhenOpportunityExpires) {
        kotlin.jvm.internal.OooOo.OooO0o0(load, "load");
        kotlin.jvm.internal.OooOo.OooO0o0(sendDiagnosticEvent, "sendDiagnosticEvent");
        kotlin.jvm.internal.OooOo.OooO0o0(getInitializationState, "getInitializationState");
        kotlin.jvm.internal.OooOo.OooO0o0(awaitInitialization, "awaitInitialization");
        kotlin.jvm.internal.OooOo.OooO0o0(sessionRepository, "sessionRepository");
        kotlin.jvm.internal.OooOo.OooO0o0(adRepository, "adRepository");
        kotlin.jvm.internal.OooOo.OooO0o0(safeCallbackInvoke, "safeCallbackInvoke");
        kotlin.jvm.internal.OooOo.OooO0o0(cleanUpWhenOpportunityExpires, "cleanUpWhenOpportunityExpires");
        this.load = load;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.getInitializationState = getInitializationState;
        this.awaitInitialization = awaitInitialization;
        this.sessionRepository = sessionRepository;
        this.adRepository = adRepository;
        this.safeCallbackInvoke = safeCallbackInvoke;
        this.cleanUpWhenOpportunityExpires = cleanUpWhenOpportunityExpires;
    }

    private final String getAdMarkup(UnityAdsLoadOptions unityAdsLoadOptions) {
        Object objOpt;
        JSONObject data = unityAdsLoadOptions.getData();
        if (data == null || (objOpt = data.opt("adMarkup")) == null) {
            return null;
        }
        return objOpt.toString();
    }

    private final DiagnosticEventRequestOuterClass.DiagnosticAdType getAdType() {
        return this.isBanner ? DiagnosticEventRequestOuterClass.DiagnosticAdType.DIAGNOSTIC_AD_TYPE_BANNER : DiagnosticEventRequestOuterClass.DiagnosticAdType.DIAGNOSTIC_AD_TYPE_FULLSCREEN;
    }

    private final AdRequestOuterClass.BannerSize getBannerSize(UnityBannerSize unityBannerSize) {
        if (unityBannerSize == null) {
            return null;
        }
        BannerSizeKt.Dsl.Companion companion = BannerSizeKt.Dsl.Companion;
        AdRequestOuterClass.BannerSize.Builder builderNewBuilder = AdRequestOuterClass.BannerSize.newBuilder();
        kotlin.jvm.internal.OooOo.OooO0Oo(builderNewBuilder, "newBuilder()");
        BannerSizeKt.Dsl dsl_create = companion._create(builderNewBuilder);
        dsl_create.setWidth(unityBannerSize.getWidth());
        dsl_create.setHeight(unityBannerSize.getHeight());
        return dsl_create._build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup getHeaderBiddingAdMarkup(String str) {
        if (str == null || o000000.OoooOO0(str)) {
            return HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup.getDefaultInstance();
        }
        try {
            return HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup.parseFrom(ProtobufExtensionsKt.fromBase64$default(str, false, 1, null).toByteArray());
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getOpportunityId(UnityAdsLoadOptions unityAdsLoadOptions) {
        Object objOpt;
        JSONObject data = unityAdsLoadOptions.getData();
        if (data == null || (objOpt = data.opt("objectId")) == null) {
            return null;
        }
        return objOpt.toString();
    }

    private final Map<String, String> getTags(String str, String str2) {
        LinkedHashMap linkedHashMapOooOOo = o0O0O00.OooOOo(new OooOO0("state", GetInitializationState.DefaultImpls.invoke$default(this.getInitializationState, false, 1, null).toString()), new OooOO0("operation", OperationType.LOAD.toString()));
        if (str != null && str.length() != 0) {
            linkedHashMapOooOOo.put("reason", str);
        }
        if (str2 != null && str2.length() != 0) {
            linkedHashMapOooOOo.put("reason_debug", str2);
        }
        return linkedHashMapOooOOo;
    }

    public static /* synthetic */ Map getTags$default(LegacyLoadUseCase legacyLoadUseCase, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        return legacyLoadUseCase.getTags(str, str2);
    }

    private final AdObject getTmpAdObject(boolean z) {
        ByteString byteString;
        UnityAdsLoadOptions unityAdsLoadOptions = this.loadOptions;
        if (unityAdsLoadOptions == null) {
            kotlin.jvm.internal.OooOo.OooOO0o(HandleInvocationsFromAdViewer.KEY_LOAD_OPTIONS);
            throw null;
        }
        String opportunityId = getOpportunityId(unityAdsLoadOptions);
        if (opportunityId != null) {
            UUID uuidFromString = UUID.fromString(opportunityId);
            kotlin.jvm.internal.OooOo.OooO0Oo(uuidFromString, "fromString(tmpOpportunityId)");
            byteString = ProtobufExtensionsKt.toByteString(uuidFromString);
        } else {
            byteString = ByteString.EMPTY;
        }
        ByteString tmpOpportunityByteString = byteString;
        String str = this.placement;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        ByteString EMPTY = ByteString.EMPTY;
        UnityAdsLoadOptions unityAdsLoadOptions2 = this.loadOptions;
        if (unityAdsLoadOptions2 == null) {
            kotlin.jvm.internal.OooOo.OooOO0o(HandleInvocationsFromAdViewer.KEY_LOAD_OPTIONS);
            throw null;
        }
        boolean z2 = this.isHeaderBidding;
        DiagnosticEventRequestOuterClass.DiagnosticAdType adType = getAdType();
        kotlin.jvm.internal.OooOo.OooO0Oo(tmpOpportunityByteString, "tmpOpportunityByteString");
        kotlin.jvm.internal.OooOo.OooO0Oo(EMPTY, "EMPTY");
        return new AdObject(tmpOpportunityByteString, str2, EMPTY, z, null, null, null, false, null, null, null, unityAdsLoadOptions2, z2, adType, null, null, 50672, null);
    }

    public static /* synthetic */ AdObject getTmpAdObject$default(LegacyLoadUseCase legacyLoadUseCase, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return legacyLoadUseCase.getTmpAdObject(z);
    }

    public static /* synthetic */ Object invoke$default(LegacyLoadUseCase legacyLoadUseCase, Context context, String str, UnityAdsLoadOptions unityAdsLoadOptions, IUnityAdsLoadListener iUnityAdsLoadListener, UnityBannerSize unityBannerSize, o00O0O0O.OooO0OO oooO0OO, int i, Object obj) {
        if ((i & 16) != 0) {
            unityBannerSize = null;
        }
        return legacyLoadUseCase.invoke(context, str, unityAdsLoadOptions, iUnityAdsLoadListener, unityBannerSize, oooO0OO);
    }

    private final void loadFailure(LoadResult.Failure failure) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        DeviceLog.debug("Unity Ads Load Failure for placement: " + this.placement + " reason: " + failure.getError() + " :: " + failure.getMessage());
        SendDiagnosticEvent sendDiagnosticEvent = this.sendDiagnosticEvent;
        OooOo00 oooOo00 = this.startTime;
        SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, "native_load_failure_time", oooOo00 != null ? Double.valueOf(TimeExtensionsKt.elapsedMillis(oooOo00)) : null, getTags(failure.getReason(), failure.getReasonDebug()), null, getTmpAdObject(failure.isScarAd()), null, 40, null);
        this.safeCallbackInvoke.invoke(new C41091(failure));
    }

    private final OooOo00 loadStart() {
        long jOooO0O0 = OooOOOO.OooO0O0();
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_load_started", null, getTags$default(this, null, null, 3, null), null, getTmpAdObject$default(this, false, 1, null), null, 42, null);
        return new o00O0oOO.OooOo(jOooO0O0);
    }

    private final void loadSuccess(AdObject adObject) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        DeviceLog.debug("Unity Ads Load Success for placement: " + this.placement);
        ((oO00000o) adObject.getState()).OooO0oo(AdObjectState.LOADED);
        this.cleanUpWhenOpportunityExpires.invoke(adObject);
        SendDiagnosticEvent sendDiagnosticEvent = this.sendDiagnosticEvent;
        OooOo00 oooOo00 = this.startTime;
        SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, "native_load_success_time", oooOo00 != null ? Double.valueOf(TimeExtensionsKt.elapsedMillis(oooOo00)) : null, getTags$default(this, null, null, 3, null), null, adObject, null, 40, null);
        this.safeCallbackInvoke.invoke(new C41101());
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00b7 A[Catch: all -> 0x003f, TryCatch #1 {all -> 0x003f, blocks: (B:13:0x003a, B:35:0x00b3, B:37:0x00b7, B:38:0x00d6, B:40:0x00da, B:41:0x00e4, B:43:0x00e8), top: B:52:0x003a }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00da A[Catch: all -> 0x003f, TryCatch #1 {all -> 0x003f, blocks: (B:13:0x003a, B:35:0x00b3, B:37:0x00b7, B:38:0x00d6, B:40:0x00da, B:41:0x00e4, B:43:0x00e8), top: B:52:0x003a }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e4 A[Catch: all -> 0x003f, TryCatch #1 {all -> 0x003f, blocks: (B:13:0x003a, B:35:0x00b3, B:37:0x00b7, B:38:0x00d6, B:40:0x00da, B:41:0x00e4, B:43:0x00e8), top: B:52:0x003a }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invoke(android.content.Context r22, java.lang.String r23, com.unity3d.ads.UnityAdsLoadOptions r24, com.unity3d.ads.IUnityAdsLoadListener r25, com.unity3d.services.banners.UnityBannerSize r26, o00O0O0O.OooO0OO r27) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.SecurityException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 269
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.LegacyLoadUseCase.invoke(android.content.Context, java.lang.String, com.unity3d.ads.UnityAdsLoadOptions, com.unity3d.ads.IUnityAdsLoadListener, com.unity3d.services.banners.UnityBannerSize, o00O0O0O.OooO0OO):java.lang.Object");
    }
}
