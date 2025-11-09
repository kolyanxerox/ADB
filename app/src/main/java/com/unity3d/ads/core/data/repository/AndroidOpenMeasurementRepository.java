package com.unity3d.ads.core.data.repository;

import android.content.Context;
import android.webkit.WebView;
import com.google.protobuf.ByteString;
import com.iab.omid.library.unity3d.adsession.AdEvents;
import com.iab.omid.library.unity3d.adsession.AdSession;
import com.iab.omid.library.unity3d.adsession.AdSessionConfiguration;
import com.iab.omid.library.unity3d.adsession.AdSessionContext;
import com.iab.omid.library.unity3d.adsession.CreativeType;
import com.iab.omid.library.unity3d.adsession.ImpressionType;
import com.iab.omid.library.unity3d.adsession.Owner;
import com.iab.omid.library.unity3d.adsession.Partner;
import com.unity3d.ads.core.data.manager.OmidManager;
import com.unity3d.ads.core.data.model.OMData;
import com.unity3d.ads.core.data.model.OMResult;
import com.unity3d.ads.core.data.model.OmidOptions;
import com.unity3d.ads.core.extensions.ExceptionExtensionsKt;
import com.unity3d.services.UnityAdsConstants;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import o00O0.o000OOo;
import o00O0.o00oO0o;
import o00O0.o0O0O00;
import o00O0.o0ooOOo;
import o00O0O0O.OooO0OO;
import o00O0O0o.OooOo00;
import o00O0OO0.OooO;
import o00O0OO0.OooOOOO;
import o00O0Oo.o00O0O;
import o00O0oOo.o0000O00;
import o00O0oOo.o0000OO0;
import o00O0oOo.o000OO;
import o00O0ooo.o0OO;
import o00O0ooo.o0o0000;
import o00O0ooo.oO00000o;
import oo00o.OooOO0;
import oo00o.OooOo;

/* loaded from: classes3.dex */
public final class AndroidOpenMeasurementRepository implements OpenMeasurementRepository {
    private final o0OO _isOMActive;
    private final o0OO activeSessions;
    private final o0OO finishedSessions;
    private final o0000O00 mainDispatcher;
    private final OmidManager omidManager;
    private final Partner partner;

    @OooO(m13471c = "com.unity3d.ads.core.data.repository.AndroidOpenMeasurementRepository$activateOM$2", m13472f = "AndroidOpenMeasurementRepository.kt", m13473l = {}, m13474m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.core.data.repository.AndroidOpenMeasurementRepository$activateOM$2 */
    public static final class C40412 extends OooOOOO implements o00O0O {
        final /* synthetic */ Context $context;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40412(Context context, OooO0OO oooO0OO) {
            super(2, oooO0OO);
            this.$context = context;
        }

        @Override // o00O0OO0.OooO00o
        public final OooO0OO create(Object obj, OooO0OO oooO0OO) {
            return AndroidOpenMeasurementRepository.this.new C40412(this.$context, oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o000OOo.OooOO0O(obj);
            if (AndroidOpenMeasurementRepository.this.isOMActive()) {
                return new OMResult.Failure("om_already_active", null, 2, null);
            }
            try {
                AndroidOpenMeasurementRepository.this.omidManager.activate(this.$context);
                AndroidOpenMeasurementRepository androidOpenMeasurementRepository = AndroidOpenMeasurementRepository.this;
                androidOpenMeasurementRepository.setOMActive(androidOpenMeasurementRepository.omidManager.isActive());
                return AndroidOpenMeasurementRepository.this.isOMActive() ? OMResult.Success.INSTANCE : new OMResult.Failure("om_activate_failure_time", null, 2, null);
            } catch (Throwable th) {
                return new OMResult.Failure("uncaught_exception", ExceptionExtensionsKt.getShortenedStackTrace$default(th, 0, 1, null));
            }
        }

        @Override // o00O0Oo.o00O0O
        public final Object invoke(o000OO o000oo2, OooO0OO oooO0OO) {
            return ((C40412) create(o000oo2, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
        }
    }

    @OooO(m13471c = "com.unity3d.ads.core.data.repository.AndroidOpenMeasurementRepository$finishSession$2", m13472f = "AndroidOpenMeasurementRepository.kt", m13473l = {}, m13474m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.core.data.repository.AndroidOpenMeasurementRepository$finishSession$2 */
    public static final class C40422 extends OooOOOO implements o00O0O {
        final /* synthetic */ ByteString $opportunityId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40422(ByteString byteString, OooO0OO oooO0OO) {
            super(2, oooO0OO);
            this.$opportunityId = byteString;
        }

        @Override // o00O0OO0.OooO00o
        public final OooO0OO create(Object obj, OooO0OO oooO0OO) {
            return AndroidOpenMeasurementRepository.this.new C40422(this.$opportunityId, oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o000OOo.OooOO0O(obj);
            if (!AndroidOpenMeasurementRepository.this.isOMActive()) {
                return new OMResult.Failure("om_not_active", null, 2, null);
            }
            AdSession session = AndroidOpenMeasurementRepository.this.getSession(this.$opportunityId);
            if (session == null) {
                return new OMResult.Failure("om_session_not_found", null, 2, null);
            }
            session.finish();
            AndroidOpenMeasurementRepository.this.sessionFinished(this.$opportunityId);
            return OMResult.Success.INSTANCE;
        }

        @Override // o00O0Oo.o00O0O
        public final Object invoke(o000OO o000oo2, OooO0OO oooO0OO) {
            return ((C40422) create(o000oo2, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
        }
    }

    @OooO(m13471c = "com.unity3d.ads.core.data.repository.AndroidOpenMeasurementRepository$impressionOccurred$2", m13472f = "AndroidOpenMeasurementRepository.kt", m13473l = {}, m13474m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.core.data.repository.AndroidOpenMeasurementRepository$impressionOccurred$2 */
    public static final class C40432 extends OooOOOO implements o00O0O {
        final /* synthetic */ ByteString $opportunityId;
        final /* synthetic */ boolean $signalLoaded;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40432(ByteString byteString, boolean z, OooO0OO oooO0OO) {
            super(2, oooO0OO);
            this.$opportunityId = byteString;
            this.$signalLoaded = z;
        }

        @Override // o00O0OO0.OooO00o
        public final OooO0OO create(Object obj, OooO0OO oooO0OO) {
            return AndroidOpenMeasurementRepository.this.new C40432(this.$opportunityId, this.$signalLoaded, oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o000OOo.OooOO0O(obj);
            AdSession session = AndroidOpenMeasurementRepository.this.getSession(this.$opportunityId);
            if (session == null) {
                return new OMResult.Failure("om_session_not_found", null, 2, null);
            }
            AdEvents adEventsCreateAdEvents = AndroidOpenMeasurementRepository.this.omidManager.createAdEvents(session);
            if (this.$signalLoaded) {
                adEventsCreateAdEvents.loaded();
            }
            adEventsCreateAdEvents.impressionOccurred();
            return OMResult.Success.INSTANCE;
        }

        @Override // o00O0Oo.o00O0O
        public final Object invoke(o000OO o000oo2, OooO0OO oooO0OO) {
            return ((C40432) create(o000oo2, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
        }
    }

    @OooO(m13471c = "com.unity3d.ads.core.data.repository.AndroidOpenMeasurementRepository$startSession$2", m13472f = "AndroidOpenMeasurementRepository.kt", m13473l = {}, m13474m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.core.data.repository.AndroidOpenMeasurementRepository$startSession$2 */
    public static final class C40442 extends OooOOOO implements o00O0O {
        final /* synthetic */ ByteString $opportunityId;
        final /* synthetic */ OmidOptions $options;
        final /* synthetic */ WebView $webView;
        int label;

        /* renamed from: com.unity3d.ads.core.data.repository.AndroidOpenMeasurementRepository$startSession$2$WhenMappings */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[CreativeType.values().length];
                try {
                    iArr[CreativeType.HTML_DISPLAY.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[CreativeType.VIDEO.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40442(ByteString byteString, OmidOptions omidOptions, WebView webView, OooO0OO oooO0OO) {
            super(2, oooO0OO);
            this.$opportunityId = byteString;
            this.$options = omidOptions;
            this.$webView = webView;
        }

        @Override // o00O0OO0.OooO00o
        public final OooO0OO create(Object obj, OooO0OO oooO0OO) {
            return AndroidOpenMeasurementRepository.this.new C40442(this.$opportunityId, this.$options, this.$webView, oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            AdSessionContext adSessionContextCreateHtmlAdSessionContext;
            OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o000OOo.OooOO0O(obj);
            try {
                if (!AndroidOpenMeasurementRepository.this.isOMActive()) {
                    return new OMResult.Failure("om_not_active", null, 2, null);
                }
                if (((Map) ((oO00000o) AndroidOpenMeasurementRepository.this.activeSessions).getValue()).containsKey(this.$opportunityId.toStringUtf8())) {
                    return new OMResult.Failure("om_session_already_exists", null, 2, null);
                }
                CreativeType creativeType = this.$options.getCreativeType();
                if (creativeType == null) {
                    return new OMResult.Failure("om_creative_type_null", null, 2, null);
                }
                OmidManager omidManager = AndroidOpenMeasurementRepository.this.omidManager;
                ImpressionType impressionType = this.$options.getImpressionType();
                if (impressionType == null) {
                    impressionType = ImpressionType.DEFINED_BY_JAVASCRIPT;
                }
                ImpressionType impressionType2 = impressionType;
                Owner impressionOwner = this.$options.getImpressionOwner();
                if (impressionOwner == null) {
                    impressionOwner = Owner.JAVASCRIPT;
                }
                Owner owner = impressionOwner;
                Owner videoEventsOwner = this.$options.getVideoEventsOwner();
                if (videoEventsOwner == null) {
                    videoEventsOwner = Owner.JAVASCRIPT;
                }
                AdSessionConfiguration adSessionConfigurationCreateAdSessionConfiguration = omidManager.createAdSessionConfiguration(creativeType, impressionType2, owner, videoEventsOwner, this.$options.getIsolateVerificationScripts());
                int i = WhenMappings.$EnumSwitchMapping$0[creativeType.ordinal()];
                if (i == 1) {
                    adSessionContextCreateHtmlAdSessionContext = AndroidOpenMeasurementRepository.this.omidManager.createHtmlAdSessionContext(AndroidOpenMeasurementRepository.this.partner, this.$webView, null, this.$options.getCustomReferenceData());
                } else {
                    if (i != 2) {
                        return new OMResult.Failure("om_creative_type_invalid", null, 2, null);
                    }
                    adSessionContextCreateHtmlAdSessionContext = AndroidOpenMeasurementRepository.this.omidManager.createJavaScriptAdSessionContext(AndroidOpenMeasurementRepository.this.partner, this.$webView, null, this.$options.getCustomReferenceData());
                }
                AdSession adSessionCreateAdSession = AndroidOpenMeasurementRepository.this.omidManager.createAdSession(adSessionConfigurationCreateAdSessionConfiguration, adSessionContextCreateHtmlAdSessionContext);
                adSessionCreateAdSession.registerAdView(this.$webView);
                adSessionCreateAdSession.start();
                AndroidOpenMeasurementRepository.this.addSession(this.$opportunityId, adSessionCreateAdSession);
                return OMResult.Success.INSTANCE;
            } catch (Throwable th) {
                return new OMResult.Failure("uncaught_exception", ExceptionExtensionsKt.getShortenedStackTrace$default(th, 0, 1, null));
            }
        }

        @Override // o00O0Oo.o00O0O
        public final Object invoke(o000OO o000oo2, OooO0OO oooO0OO) {
            return ((C40442) create(o000oo2, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
        }
    }

    public AndroidOpenMeasurementRepository(o0000O00 mainDispatcher, OmidManager omidManager) {
        kotlin.jvm.internal.OooOo.OooO0o0(mainDispatcher, "mainDispatcher");
        kotlin.jvm.internal.OooOo.OooO0o0(omidManager, "omidManager");
        this.mainDispatcher = mainDispatcher;
        this.omidManager = omidManager;
        this.partner = Partner.createPartner(UnityAdsConstants.OpenMeasurement.OM_PARTNER_NAME, "4.15.1");
        this.activeSessions = o0o0000.OooO0OO(o00oO0o.f31247OooOo0O);
        this.finishedSessions = o0o0000.OooO0OO(o0ooOOo.f31250OooOo0O);
        this._isOMActive = o0o0000.OooO0OO(Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addSession(ByteString byteString, AdSession adSession) {
        oO00000o oo00000o;
        Object value;
        o0OO o0oo = this.activeSessions;
        do {
            oo00000o = (oO00000o) o0oo;
            value = oo00000o.getValue();
        } while (!oo00000o.OooO0oO(value, o0O0O00.OooOo0((Map) value, new OooOO0(byteString.toStringUtf8(), adSession))));
    }

    private final OMData buildOmData() {
        return new OMData(this.omidManager.getVersion(), UnityAdsConstants.OpenMeasurement.OM_PARTNER_NAME, "1");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AdSession getSession(ByteString byteString) {
        return (AdSession) ((Map) ((oO00000o) this.activeSessions).getValue()).get(byteString.toStringUtf8());
    }

    private final void removeSession(ByteString byteString) {
        oO00000o oo00000o;
        Object value;
        LinkedHashMap linkedHashMapOooOoO0;
        o0OO o0oo = this.activeSessions;
        do {
            oo00000o = (oO00000o) o0oo;
            value = oo00000o.getValue();
            Map map = (Map) value;
            String stringUtf8 = byteString.toStringUtf8();
            kotlin.jvm.internal.OooOo.OooO0Oo(stringUtf8, "opportunityId.toStringUtf8()");
            kotlin.jvm.internal.OooOo.OooO0o0(map, "<this>");
            linkedHashMapOooOoO0 = o0O0O00.OooOoO0(map);
            linkedHashMapOooOoO0.remove(stringUtf8);
        } while (!oo00000o.OooO0oO(value, o0O0O00.OooOOoo(linkedHashMapOooOoO0)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sessionFinished(ByteString byteString) {
        oO00000o oo00000o;
        Object value;
        String stringUtf8;
        o0OO o0oo = this.finishedSessions;
        do {
            oo00000o = (oO00000o) o0oo;
            value = oo00000o.getValue();
            stringUtf8 = byteString.toStringUtf8();
            kotlin.jvm.internal.OooOo.OooO0Oo(stringUtf8, "opportunityId.toStringUtf8()");
        } while (!oo00000o.OooO0oO(value, o000OOo.OooO0oO((Set) value, stringUtf8)));
        removeSession(byteString);
    }

    @Override // com.unity3d.ads.core.data.repository.OpenMeasurementRepository
    public Object activateOM(Context context, OooO0OO oooO0OO) {
        return o0000OO0.Oooo00O(new C40412(context, null), this.mainDispatcher, oooO0OO);
    }

    @Override // com.unity3d.ads.core.data.repository.OpenMeasurementRepository
    public Object finishSession(ByteString byteString, OooO0OO oooO0OO) {
        return o0000OO0.Oooo00O(new C40422(byteString, null), this.mainDispatcher, oooO0OO);
    }

    @Override // com.unity3d.ads.core.data.repository.OpenMeasurementRepository
    public OMData getOmData() {
        return buildOmData();
    }

    @Override // com.unity3d.ads.core.data.repository.OpenMeasurementRepository
    public boolean hasSessionFinished(ByteString opportunityId) {
        kotlin.jvm.internal.OooOo.OooO0o0(opportunityId, "opportunityId");
        return ((Set) ((oO00000o) this.finishedSessions).getValue()).contains(opportunityId.toStringUtf8());
    }

    @Override // com.unity3d.ads.core.data.repository.OpenMeasurementRepository
    public Object impressionOccurred(ByteString byteString, boolean z, OooO0OO oooO0OO) {
        return o0000OO0.Oooo00O(new C40432(byteString, z, null), this.mainDispatcher, oooO0OO);
    }

    @Override // com.unity3d.ads.core.data.repository.OpenMeasurementRepository
    public boolean isOMActive() {
        return ((Boolean) ((oO00000o) this._isOMActive).getValue()).booleanValue();
    }

    @Override // com.unity3d.ads.core.data.repository.OpenMeasurementRepository
    public void setOMActive(boolean z) {
        oO00000o oo00000o;
        Object value;
        o0OO o0oo = this._isOMActive;
        do {
            oo00000o = (oO00000o) o0oo;
            value = oo00000o.getValue();
            ((Boolean) value).getClass();
        } while (!oo00000o.OooO0oO(value, Boolean.valueOf(z)));
    }

    @Override // com.unity3d.ads.core.data.repository.OpenMeasurementRepository
    public Object startSession(ByteString byteString, WebView webView, OmidOptions omidOptions, OooO0OO oooO0OO) {
        return o0000OO0.Oooo00O(new C40442(byteString, omidOptions, webView, null), this.mainDispatcher, oooO0OO);
    }
}
