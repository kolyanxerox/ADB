package com.unity3d.ads.core.domain;

import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.adplayer.ExposedFunctionLocation;
import com.unity3d.ads.adplayer.Invocation;
import com.unity3d.ads.core.data.model.AdData;
import com.unity3d.ads.core.data.model.AdDataRefreshToken;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.ImpressionConfig;
import com.unity3d.services.core.p012di.IServiceComponent;
import com.unity3d.services.core.p012di.IServiceProvider;
import java.util.Map;
import kotlin.jvm.internal.OooOO0O;
import o00O0.o000OOo;
import o00O0.o0O0O00;
import o00O0O0O.OooO0OO;
import o00O0O0o.OooOo00;
import o00O0OO0.OooO;
import o00O0OO0.OooOOOO;
import o00O0Oo.OooO0O0;
import o00O0Oo.Oooo000;
import o00O0Oo.o00O0O;
import o00O0ooo.o0O000Oo;
import o00O0ooo.o0O0OOO0;
import o00O0ooo.o0OOO0OO;
import o00O0ooo.o0OoOoOo;
import o00O0ooo.oO000O0;
import oo00o.OooOO0;
import oo00o.OooOo;

/* loaded from: classes3.dex */
public final class HandleInvocationsFromAdViewer implements IServiceComponent {
    public static final Companion Companion = new Companion(null);
    public static final String KEY_AD_DATA = "adData";
    public static final String KEY_AD_DATA_REFRESH_TOKEN = "adDataRefreshToken";
    public static final String KEY_AD_STRING = "adString";
    public static final String KEY_AD_TYPE = "type";
    public static final String KEY_AD_UNIT_ID = "adUnitId";
    public static final String KEY_DOWNLOAD_PRIORITY = "priority";
    public static final String KEY_DOWNLOAD_URL = "url";
    public static final String KEY_IMPRESSION_CONFIG = "impressionConfig";
    public static final String KEY_IS_HEADER_BIDDING = "isHeaderBidding";
    public static final String KEY_LOAD_OPTIONS = "loadOptions";
    public static final String KEY_NATIVE_CONTEXT = "nativeContext";
    public static final String KEY_OMID = "openMeasurement";
    public static final String KEY_OMJS_SERVICE = "serviceFilePath";
    public static final String KEY_OMJS_SESSION = "sessionFilePath";
    public static final String KEY_OM_PARTNER = "partnerName";
    public static final String KEY_OM_PARTNER_VERSION = "partnerVersion";
    public static final String KEY_OM_VERSION = "version";
    public static final String KEY_PACKAGE_NAME = "packageName";
    public static final String KEY_PLACEMENT_ID = "placementId";
    public static final String KEY_PLACEMENT_NAME = "placementName";
    public static final String KEY_PRIVACY_UPDATE_CONTENT = "content";
    public static final String KEY_PRIVACY_UPDATE_VERSION = "version";
    public static final String KEY_QUERY_ID = "queryId";
    public static final String KEY_TRACKING_TOKEN = "trackingToken";
    public static final String KEY_VIDEO_LENGTH = "videoLength";

    public static final class Companion {
        public /* synthetic */ Companion(OooOO0O oooOO0O) {
            this();
        }

        private Companion() {
        }
    }

    @OooO(m13471c = "com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$1", m13472f = "HandleInvocationsFromAdViewer.kt", m13473l = {184}, m13474m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$1 */
    public static final class C41061 extends OooOOOO implements o00O0O {
        final /* synthetic */ Oooo000 $onSubscription;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41061(Oooo000 oooo000, OooO0OO oooO0OO) {
            super(2, oooO0OO);
            this.$onSubscription = oooo000;
        }

        @Override // o00O0OO0.OooO00o
        public final OooO0OO create(Object obj, OooO0OO oooO0OO) {
            return new C41061(this.$onSubscription, oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
            int i = this.label;
            if (i == 0) {
                o000OOo.OooOO0O(obj);
                Oooo000 oooo000 = this.$onSubscription;
                this.label = 1;
                if (oooo000.invoke(this) == oooOo00) {
                    return oooOo00;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o000OOo.OooOO0O(obj);
            }
            return OooOo.f33195OooO00o;
        }

        @Override // o00O0Oo.o00O0O
        public final Object invoke(o0O000Oo o0o000oo, OooO0OO oooO0OO) {
            return ((C41061) create(o0o000oo, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
        }
    }

    @OooO(m13471c = "com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$2", m13472f = "HandleInvocationsFromAdViewer.kt", m13473l = {188}, m13474m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$2 */
    public static final class C41072 extends OooOOOO implements o00O0O {
        final /* synthetic */ Map<String, OooO0O0> $definition;
        /* synthetic */ Object L$0;
        int label;

        @OooO(m13471c = "com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$2$1", m13472f = "HandleInvocationsFromAdViewer.kt", m13473l = {188}, m13474m = "invokeSuspend")
        /* renamed from: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends OooOOOO implements Oooo000 {
            final /* synthetic */ ExposedFunction $exposedFunction;
            final /* synthetic */ Invocation $it;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(ExposedFunction exposedFunction, Invocation invocation, OooO0OO oooO0OO) {
                super(1, oooO0OO);
                this.$exposedFunction = exposedFunction;
                this.$it = invocation;
            }

            @Override // o00O0OO0.OooO00o
            public final OooO0OO create(OooO0OO oooO0OO) {
                return new AnonymousClass1(this.$exposedFunction, this.$it, oooO0OO);
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
                ExposedFunction exposedFunction = this.$exposedFunction;
                Object[] parameters = this.$it.getParameters();
                this.label = 1;
                Object objInvoke = exposedFunction.invoke(parameters, this);
                return objInvoke == oooOo00 ? oooOo00 : objInvoke;
            }

            @Override // o00O0Oo.Oooo000
            public final Object invoke(OooO0OO oooO0OO) {
                return ((AnonymousClass1) create(oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C41072(Map<String, ? extends OooO0O0> map, OooO0OO oooO0OO) {
            super(2, oooO0OO);
            this.$definition = map;
        }

        @Override // o00O0OO0.OooO00o
        public final OooO0OO create(Object obj, OooO0OO oooO0OO) {
            C41072 c41072 = new C41072(this.$definition, oooO0OO);
            c41072.L$0 = obj;
            return c41072;
        }

        @Override // o00O0Oo.o00O0O
        public final Object invoke(Invocation invocation, OooO0OO oooO0OO) {
            return ((C41072) create(invocation, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            ExposedFunction exposedFunction;
            OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
            int i = this.label;
            OooOo oooOo = OooOo.f33195OooO00o;
            if (i == 0) {
                o000OOo.OooOO0O(obj);
                Invocation invocation = (Invocation) this.L$0;
                OooO0O0 oooO0O0 = this.$definition.get(invocation.getLocation());
                if (oooO0O0 != null && (exposedFunction = (ExposedFunction) oooO0O0.invoke()) != null) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(exposedFunction, invocation, null);
                    this.label = 1;
                    if (invocation.handle(anonymousClass1, this) == oooOo00) {
                        return oooOo00;
                    }
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o000OOo.OooOO0O(obj);
            }
            return oooOo;
        }
    }

    @Override // com.unity3d.services.core.p012di.IServiceComponent
    public IServiceProvider getServiceProvider() {
        return IServiceComponent.DefaultImpls.getServiceProvider(this);
    }

    public final o0OoOoOo invoke(o0OOO0OO onInvocations, String adData, String adDataRefreshToken, String impressionConfig, AdObject adObject, Oooo000 onSubscription) {
        kotlin.jvm.internal.OooOo.OooO0o0(onInvocations, "onInvocations");
        kotlin.jvm.internal.OooOo.OooO0o0(adData, "adData");
        kotlin.jvm.internal.OooOo.OooO0o0(adDataRefreshToken, "adDataRefreshToken");
        kotlin.jvm.internal.OooOo.OooO0o0(impressionConfig, "impressionConfig");
        kotlin.jvm.internal.OooOo.OooO0o0(adObject, "adObject");
        kotlin.jvm.internal.OooOo.OooO0o0(onSubscription, "onSubscription");
        return new o0O0OOO0(new oO000O0(onInvocations, new C41061(onSubscription, null)), new C41072(o0O0O00.OooOOo0(new OooOO0(ExposedFunctionLocation.GET_AD_CONTEXT, new HandleInvocationsFromAdViewer$invoke$definition$1(this, AdData.m13748constructorimpl(adData), ImpressionConfig.m13762constructorimpl(impressionConfig), AdDataRefreshToken.m13755constructorimpl(adDataRefreshToken), adObject)), new OooOO0(ExposedFunctionLocation.GET_CONNECTION_TYPE, new HandleInvocationsFromAdViewer$invoke$definition$2(this)), new OooOO0(ExposedFunctionLocation.GET_DEVICE_VOLUME, new HandleInvocationsFromAdViewer$invoke$definition$3(this)), new OooOO0(ExposedFunctionLocation.GET_DEVICE_MAX_VOLUME, new HandleInvocationsFromAdViewer$invoke$definition$4(this)), new OooOO0(ExposedFunctionLocation.GET_SCREEN_HEIGHT, new HandleInvocationsFromAdViewer$invoke$definition$5(this)), new OooOO0(ExposedFunctionLocation.GET_SCREEN_WIDTH, new HandleInvocationsFromAdViewer$invoke$definition$6(this)), new OooOO0(ExposedFunctionLocation.OPEN_URL, new HandleInvocationsFromAdViewer$invoke$definition$7(this)), new OooOO0(ExposedFunctionLocation.SET_ORIENTATION, new HandleInvocationsFromAdViewer$invoke$definition$8(adObject)), new OooOO0(ExposedFunctionLocation.SEND_OPERATIVE_EVENT, new HandleInvocationsFromAdViewer$invoke$definition$9(this, adObject)), new OooOO0(ExposedFunctionLocation.STORAGE_WRITE, HandleInvocationsFromAdViewer$invoke$definition$10.INSTANCE), new OooOO0(ExposedFunctionLocation.STORAGE_READ, HandleInvocationsFromAdViewer$invoke$definition$11.INSTANCE), new OooOO0(ExposedFunctionLocation.STORAGE_DELETE, HandleInvocationsFromAdViewer$invoke$definition$12.INSTANCE), new OooOO0(ExposedFunctionLocation.STORAGE_CLEAR, HandleInvocationsFromAdViewer$invoke$definition$13.INSTANCE), new OooOO0(ExposedFunctionLocation.STORAGE_GET_KEYS, HandleInvocationsFromAdViewer$invoke$definition$14.INSTANCE), new OooOO0(ExposedFunctionLocation.STORAGE_GET, HandleInvocationsFromAdViewer$invoke$definition$15.INSTANCE), new OooOO0(ExposedFunctionLocation.STORAGE_SET, HandleInvocationsFromAdViewer$invoke$definition$16.INSTANCE), new OooOO0(ExposedFunctionLocation.GET_PRIVACY_FSM, new HandleInvocationsFromAdViewer$invoke$definition$17(this)), new OooOO0(ExposedFunctionLocation.SET_PRIVACY_FSM, new HandleInvocationsFromAdViewer$invoke$definition$18(this)), new OooOO0(ExposedFunctionLocation.GET_PRIVACY, new HandleInvocationsFromAdViewer$invoke$definition$19(this)), new OooOO0(ExposedFunctionLocation.SET_PRIVACY, new HandleInvocationsFromAdViewer$invoke$definition$20(this)), new OooOO0(ExposedFunctionLocation.GET_ALLOWED_PII, new HandleInvocationsFromAdViewer$invoke$definition$21(this)), new OooOO0(ExposedFunctionLocation.SET_ALLOWED_PII, new HandleInvocationsFromAdViewer$invoke$definition$22(this)), new OooOO0(ExposedFunctionLocation.GET_SESSION_TOKEN, new HandleInvocationsFromAdViewer$invoke$definition$23(this)), new OooOO0(ExposedFunctionLocation.MARK_CAMPAIGN_STATE_SHOWN, new HandleInvocationsFromAdViewer$invoke$definition$24(this, adObject)), new OooOO0(ExposedFunctionLocation.REFRESH_AD_DATA, new HandleInvocationsFromAdViewer$invoke$definition$25(this, adObject)), new OooOO0(ExposedFunctionLocation.UPDATE_CAMPAIGN_STATE, new HandleInvocationsFromAdViewer$invoke$definition$26(this, adObject)), new OooOO0(ExposedFunctionLocation.UPDATE_TRACKING_TOKEN, new HandleInvocationsFromAdViewer$invoke$definition$27(adObject)), new OooOO0(ExposedFunctionLocation.SEND_PRIVACY_UPDATE_REQUEST, new HandleInvocationsFromAdViewer$invoke$definition$28(this)), new OooOO0(ExposedFunctionLocation.SEND_DIAGNOSTIC_EVENT, new HandleInvocationsFromAdViewer$invoke$definition$29(this, adObject)), new OooOO0(ExposedFunctionLocation.INCREMENT_BANNER_IMPRESSION_COUNT, new HandleInvocationsFromAdViewer$invoke$definition$30(this)), new OooOO0(ExposedFunctionLocation.DOWNLOAD, new HandleInvocationsFromAdViewer$invoke$definition$31(this, adObject)), new OooOO0(ExposedFunctionLocation.IS_FILE_CACHED, new HandleInvocationsFromAdViewer$invoke$definition$32(this)), new OooOO0(ExposedFunctionLocation.OM_START_SESSION, new HandleInvocationsFromAdViewer$invoke$definition$33(this, adObject)), new OooOO0(ExposedFunctionLocation.OM_FINISH_SESSION, new HandleInvocationsFromAdViewer$invoke$definition$34(this, adObject)), new OooOO0(ExposedFunctionLocation.OM_IMPRESSION, new HandleInvocationsFromAdViewer$invoke$definition$35(this, adObject)), new OooOO0(ExposedFunctionLocation.OM_GET_DATA, new HandleInvocationsFromAdViewer$invoke$definition$36(this)), new OooOO0(ExposedFunctionLocation.IS_ATTRIBUTION_AVAILABLE, new HandleInvocationsFromAdViewer$invoke$definition$37(this)), new OooOO0(ExposedFunctionLocation.ATTRIBUTION_REGISTER_VIEW, new HandleInvocationsFromAdViewer$invoke$definition$38(this, adObject)), new OooOO0(ExposedFunctionLocation.ATTRIBUTION_REGISTER_CLICK, new HandleInvocationsFromAdViewer$invoke$definition$39(this, adObject)), new OooOO0(ExposedFunctionLocation.LOAD_SCAR_AD, new HandleInvocationsFromAdViewer$invoke$definition$40(this, adObject)), new OooOO0(ExposedFunctionLocation.SHOW_SCAR_AD, HandleInvocationsFromAdViewer$invoke$definition$41.INSTANCE), new OooOO0(ExposedFunctionLocation.HEADER_BIDDING_TOKEN_INCREMENT_WINS, new HandleInvocationsFromAdViewer$invoke$definition$42(this)), new OooOO0(ExposedFunctionLocation.HEADER_BIDDING_TOKEN_INCREMENT_STARTS, new HandleInvocationsFromAdViewer$invoke$definition$43(this)), new OooOO0(ExposedFunctionLocation.HEADER_BIDDING_TOKEN_RESET, new HandleInvocationsFromAdViewer$invoke$definition$44(this)), new OooOO0(ExposedFunctionLocation.LOAD_OFFERWALL_AD, new HandleInvocationsFromAdViewer$invoke$definition$45(this, adObject)), new OooOO0(ExposedFunctionLocation.SHOW_OFFERWALL_AD, HandleInvocationsFromAdViewer$invoke$definition$46.INSTANCE), new OooOO0(ExposedFunctionLocation.IS_OFFERWALL_AD_READY, new HandleInvocationsFromAdViewer$invoke$definition$47(this)), new OooOO0(ExposedFunctionLocation.REQUEST_GET, new HandleInvocationsFromAdViewer$invoke$definition$48(this)), new OooOO0(ExposedFunctionLocation.REQUEST_POST, new HandleInvocationsFromAdViewer$invoke$definition$49(this)), new OooOO0(ExposedFunctionLocation.REQUEST_HEAD, new HandleInvocationsFromAdViewer$invoke$definition$50(this)), new OooOO0(ExposedFunctionLocation.SET_OPPORTUNITY_TTL, new HandleInvocationsFromAdViewer$invoke$definition$51(adObject))), null), 2);
    }
}
