package com.unity3d.ads.core.domain;

import com.google.protobuf.ByteString;
import com.unity3d.ads.adplayer.AdPlayer;
import com.unity3d.ads.adplayer.AdPlayerScope;
import com.unity3d.ads.adplayer.AndroidWebViewContainer;
import com.unity3d.ads.adplayer.model.LoadEvent;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.repository.AdRepository;
import com.unity3d.ads.core.data.repository.CampaignRepository;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.domain.events.GetOperativeEventApi;
import gatewayprotocol.p014v1.AdResponseOuterClass;
import gatewayprotocol.p014v1.AllowedPiiOuterClass;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.o0Oo0oo;
import o00O0.o000OOo;
import o00O0O0o.OooOo00;
import o00O0OO0.OooO;
import o00O0OO0.OooO0OO;
import o00O0OO0.OooOOOO;
import o00O0Oo.Oooo000;
import o00O0Oo.o00O0O;
import o00O0oOo.o000OO;
import oo00o.OooOo;

/* loaded from: classes3.dex */
public final class AndroidHandleGatewayAdResponse implements HandleGatewayAdResponse {
    private final AdPlayerScope adPlayerScope;
    private final AdRepository adRepository;
    private final CacheWebViewAssets cacheWebViewAssets;
    private final CampaignRepository campaignRepository;
    private final DeviceInfoRepository deviceInfoRepository;
    private final GetAdPlayer getAdPlayer;
    private final HandleInvocationsFromAdViewer getHandleInvocationsFromAdViewer;
    private final GetLatestWebViewConfiguration getLatestWebViewConfiguration;
    private final GetOperativeEventApi getOperativeEventApi;
    private final GetWebViewBridgeUseCase getWebViewBridge;
    private final AndroidGetWebViewContainerUseCase getWebViewContainerUseCase;
    private final SendDiagnosticEvent sendDiagnosticEvent;

    @OooO(m13471c = "com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse", m13472f = "AndroidHandleGatewayAdResponse.kt", m13473l = {236, 242}, m13474m = "cleanup")
    /* renamed from: com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$cleanup$1 */
    public static final class C40741 extends OooO0OO {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C40741(o00O0O0O.OooO0OO oooO0OO) {
            super(oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidHandleGatewayAdResponse.this.cleanup(null, null, null, null, this);
        }
    }

    @OooO(m13471c = "com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse", m13472f = "AndroidHandleGatewayAdResponse.kt", m13473l = {97, 114, 145, 188, 192, 218}, m13474m = "invoke")
    /* renamed from: com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$invoke$1 */
    public static final class C40751 extends OooO0OO {
        long J$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public C40751(o00O0O0O.OooO0OO oooO0OO) {
            super(oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidHandleGatewayAdResponse.this.invoke(null, null, null, null, null, null, false, this);
        }
    }

    @OooO(m13471c = "com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$invoke$2", m13472f = "AndroidHandleGatewayAdResponse.kt", m13473l = {162}, m13474m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$invoke$2 */
    public static final class C40762 extends OooOOOO implements o00O0O {
        final /* synthetic */ o0Oo0oo $adPlayer;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40762(o0Oo0oo o0oo0oo, o00O0O0O.OooO0OO oooO0OO) {
            super(2, oooO0OO);
            this.$adPlayer = o0oo0oo;
        }

        @Override // o00O0OO0.OooO00o
        public final o00O0O0O.OooO0OO create(Object obj, o00O0O0O.OooO0OO oooO0OO) {
            C40762 c40762 = new C40762(this.$adPlayer, oooO0OO);
            c40762.L$0 = obj;
            return c40762;
        }

        @Override // o00O0Oo.o00O0O
        public final Object invoke(AllowedPiiOuterClass.AllowedPii allowedPii, o00O0O0O.OooO0OO oooO0OO) {
            return ((C40762) create(allowedPii, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
            int i = this.label;
            if (i == 0) {
                o000OOo.OooOO0O(obj);
                AllowedPiiOuterClass.AllowedPii allowedPii = (AllowedPiiOuterClass.AllowedPii) this.L$0;
                AdPlayer adPlayer = (AdPlayer) this.$adPlayer.f28880OooOo0O;
                byte[] byteArray = allowedPii.toByteArray();
                kotlin.jvm.internal.OooOo.OooO0Oo(byteArray, "it.toByteArray()");
                this.label = 1;
                if (adPlayer.onAllowedPiiChange(byteArray, this) == oooOo00) {
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
    }

    @OooO(m13471c = "com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$invoke$3", m13472f = "AndroidHandleGatewayAdResponse.kt", m13473l = {176}, m13474m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$invoke$3 */
    public static final class C40773 extends OooOOOO implements Oooo000 {
        final /* synthetic */ AdObject $tmpAdObject;
        final /* synthetic */ String $webViewUrl;
        final /* synthetic */ AndroidWebViewContainer $webviewContainer;
        long J$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40773(AndroidWebViewContainer androidWebViewContainer, String str, AdObject adObject, o00O0O0O.OooO0OO oooO0OO) {
            super(1, oooO0OO);
            this.$webviewContainer = androidWebViewContainer;
            this.$webViewUrl = str;
            this.$tmpAdObject = adObject;
        }

        @Override // o00O0OO0.OooO00o
        public final o00O0O0O.OooO0OO create(o00O0O0O.OooO0OO oooO0OO) {
            return AndroidHandleGatewayAdResponse.this.new C40773(this.$webviewContainer, this.$webViewUrl, this.$tmpAdObject, oooO0OO);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0050  */
        @Override // o00O0OO0.OooO00o
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                r13 = this;
                o00O0O0o.OooOo00 r0 = o00O0O0o.OooOo00.f31365OooOo0O
                int r1 = r13.label
                oo00o.OooOo r2 = oo00o.OooOo.f33195OooO00o
                r3 = 1
                if (r1 == 0) goto L1c
                if (r1 != r3) goto L14
                long r3 = r13.J$0
                o00O0.o000OOo.OooOO0O(r14)     // Catch: java.lang.Throwable -> L11
                goto L33
            L11:
                r0 = move-exception
                r14 = r0
                goto L38
            L14:
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r14.<init>(r0)
                throw r14
            L1c:
                o00O0.o000OOo.OooOO0O(r14)
                com.unity3d.ads.adplayer.AndroidWebViewContainer r14 = r13.$webviewContainer
                java.lang.String r1 = r13.$webViewUrl
                long r4 = o00O0oOO.OooOOOO.OooO0O0()
                r13.J$0 = r4     // Catch: java.lang.Throwable -> L35
                r13.label = r3     // Catch: java.lang.Throwable -> L35
                java.lang.Object r14 = r14.loadUrl(r1, r13)     // Catch: java.lang.Throwable -> L35
                if (r14 != r0) goto L32
                return r0
            L32:
                r3 = r4
            L33:
                r14 = r2
                goto L3c
            L35:
                r0 = move-exception
                r14 = r0
                r3 = r4
            L38:
                oo00o.OooOO0O r14 = o00O0.o000OOo.OooO0O0(r14)
            L3c:
                long r0 = o00O0oOO.OooOo.OooO00o(r3)
                com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse r3 = com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse.this
                com.unity3d.ads.core.data.model.AdObject r9 = r13.$tmpAdObject
                com.unity3d.ads.core.domain.SendDiagnosticEvent r4 = com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse.access$getSendDiagnosticEvent$p(r3)
                boolean r3 = r14 instanceof oo00o.OooOO0O
                if (r3 != 0) goto L50
                java.lang.String r3 = "native_load_file_task_success_time"
            L4e:
                r5 = r3
                goto L53
            L50:
                java.lang.String r3 = "native_load_file_task_failure_time"
                goto L4e
            L53:
                o00O0oOO.OooOOO r3 = o00O0oOO.OooOOO.f31464OooOo
                double r0 = o00O0oOO.OooOO0O.OooO0oO(r0, r3)
                java.lang.Double r6 = new java.lang.Double
                r6.<init>(r0)
                r8 = 0
                r10 = 0
                r7 = 0
                r11 = 44
                r12 = 0
                com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(r4, r5, r6, r7, r8, r9, r10, r11, r12)
                o00O0.o000OOo.OooOO0O(r14)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse.C40773.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // o00O0Oo.Oooo000
        public final Object invoke(o00O0O0O.OooO0OO oooO0OO) {
            return ((C40773) create(oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
        }
    }

    @OooO(m13471c = "com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$invoke$4", m13472f = "AndroidHandleGatewayAdResponse.kt", m13473l = {193}, m13474m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$invoke$4 */
    public static final class C40784 extends OooOOOO implements o00O0O {
        final /* synthetic */ o0Oo0oo $adPlayer;
        final /* synthetic */ LoadEvent $loadEvent;
        final /* synthetic */ ByteString $opportunityId;
        final /* synthetic */ AdResponseOuterClass.AdResponse $response;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40784(LoadEvent loadEvent, ByteString byteString, AdResponseOuterClass.AdResponse adResponse, o0Oo0oo o0oo0oo, o00O0O0O.OooO0OO oooO0OO) {
            super(2, oooO0OO);
            this.$loadEvent = loadEvent;
            this.$opportunityId = byteString;
            this.$response = adResponse;
            this.$adPlayer = o0oo0oo;
        }

        @Override // o00O0OO0.OooO00o
        public final o00O0O0O.OooO0OO create(Object obj, o00O0O0O.OooO0OO oooO0OO) {
            return AndroidHandleGatewayAdResponse.this.new C40784(this.$loadEvent, this.$opportunityId, this.$response, this.$adPlayer, oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
            int i = this.label;
            if (i == 0) {
                o000OOo.OooOO0O(obj);
                AndroidHandleGatewayAdResponse androidHandleGatewayAdResponse = AndroidHandleGatewayAdResponse.this;
                Error error = new Error(((LoadEvent.Error) this.$loadEvent).getMessage());
                ByteString byteString = this.$opportunityId;
                AdResponseOuterClass.AdResponse adResponse = this.$response;
                AdPlayer adPlayer = (AdPlayer) this.$adPlayer.f28880OooOo0O;
                this.label = 1;
                if (androidHandleGatewayAdResponse.cleanup(error, byteString, adResponse, adPlayer, this) == oooOo00) {
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
        public final Object invoke(o000OO o000oo2, o00O0O0O.OooO0OO oooO0OO) {
            return ((C40784) create(o000oo2, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
        }
    }

    @OooO(m13471c = "com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$invoke$5", m13472f = "AndroidHandleGatewayAdResponse.kt", m13473l = {219}, m13474m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$invoke$5 */
    public static final class C40795 extends OooOOOO implements o00O0O {
        final /* synthetic */ o0Oo0oo $adPlayer;
        final /* synthetic */ ByteString $opportunityId;
        final /* synthetic */ AdResponseOuterClass.AdResponse $response;

        /* renamed from: $t */
        final /* synthetic */ CancellationException f13057$t;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40795(CancellationException cancellationException, ByteString byteString, AdResponseOuterClass.AdResponse adResponse, o0Oo0oo o0oo0oo, o00O0O0O.OooO0OO oooO0OO) {
            super(2, oooO0OO);
            this.f13057$t = cancellationException;
            this.$opportunityId = byteString;
            this.$response = adResponse;
            this.$adPlayer = o0oo0oo;
        }

        @Override // o00O0OO0.OooO00o
        public final o00O0O0O.OooO0OO create(Object obj, o00O0O0O.OooO0OO oooO0OO) {
            return AndroidHandleGatewayAdResponse.this.new C40795(this.f13057$t, this.$opportunityId, this.$response, this.$adPlayer, oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
            int i = this.label;
            if (i == 0) {
                o000OOo.OooOO0O(obj);
                AndroidHandleGatewayAdResponse androidHandleGatewayAdResponse = AndroidHandleGatewayAdResponse.this;
                CancellationException cancellationException = this.f13057$t;
                ByteString byteString = this.$opportunityId;
                AdResponseOuterClass.AdResponse adResponse = this.$response;
                AdPlayer adPlayer = (AdPlayer) this.$adPlayer.f28880OooOo0O;
                this.label = 1;
                if (androidHandleGatewayAdResponse.cleanup(cancellationException, byteString, adResponse, adPlayer, this) == oooOo00) {
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
        public final Object invoke(o000OO o000oo2, o00O0O0O.OooO0OO oooO0OO) {
            return ((C40795) create(o000oo2, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
        }
    }

    public AndroidHandleGatewayAdResponse(AdRepository adRepository, AndroidGetWebViewContainerUseCase getWebViewContainerUseCase, GetWebViewBridgeUseCase getWebViewBridge, DeviceInfoRepository deviceInfoRepository, HandleInvocationsFromAdViewer getHandleInvocationsFromAdViewer, CampaignRepository campaignRepository, SendDiagnosticEvent sendDiagnosticEvent, GetOperativeEventApi getOperativeEventApi, GetLatestWebViewConfiguration getLatestWebViewConfiguration, AdPlayerScope adPlayerScope, GetAdPlayer getAdPlayer, CacheWebViewAssets cacheWebViewAssets) {
        kotlin.jvm.internal.OooOo.OooO0o0(adRepository, "adRepository");
        kotlin.jvm.internal.OooOo.OooO0o0(getWebViewContainerUseCase, "getWebViewContainerUseCase");
        kotlin.jvm.internal.OooOo.OooO0o0(getWebViewBridge, "getWebViewBridge");
        kotlin.jvm.internal.OooOo.OooO0o0(deviceInfoRepository, "deviceInfoRepository");
        kotlin.jvm.internal.OooOo.OooO0o0(getHandleInvocationsFromAdViewer, "getHandleInvocationsFromAdViewer");
        kotlin.jvm.internal.OooOo.OooO0o0(campaignRepository, "campaignRepository");
        kotlin.jvm.internal.OooOo.OooO0o0(sendDiagnosticEvent, "sendDiagnosticEvent");
        kotlin.jvm.internal.OooOo.OooO0o0(getOperativeEventApi, "getOperativeEventApi");
        kotlin.jvm.internal.OooOo.OooO0o0(getLatestWebViewConfiguration, "getLatestWebViewConfiguration");
        kotlin.jvm.internal.OooOo.OooO0o0(adPlayerScope, "adPlayerScope");
        kotlin.jvm.internal.OooOo.OooO0o0(getAdPlayer, "getAdPlayer");
        kotlin.jvm.internal.OooOo.OooO0o0(cacheWebViewAssets, "cacheWebViewAssets");
        this.adRepository = adRepository;
        this.getWebViewContainerUseCase = getWebViewContainerUseCase;
        this.getWebViewBridge = getWebViewBridge;
        this.deviceInfoRepository = deviceInfoRepository;
        this.getHandleInvocationsFromAdViewer = getHandleInvocationsFromAdViewer;
        this.campaignRepository = campaignRepository;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.getOperativeEventApi = getOperativeEventApi;
        this.getLatestWebViewConfiguration = getLatestWebViewConfiguration;
        this.adPlayerScope = adPlayerScope;
        this.getAdPlayer = getAdPlayer;
        this.cacheWebViewAssets = cacheWebViewAssets;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object cleanup(java.lang.Throwable r15, com.google.protobuf.ByteString r16, gatewayprotocol.v1.AdResponseOuterClass.AdResponse r17, com.unity3d.ads.adplayer.AdPlayer r18, o00O0O0O.OooO0OO r19) {
        /*
            r14 = this;
            r0 = r19
            boolean r1 = r0 instanceof com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse.C40741
            if (r1 == 0) goto L16
            r1 = r0
            com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$cleanup$1 r1 = (com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse.C40741) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L16
            int r2 = r2 - r3
            r1.label = r2
        L14:
            r9 = r1
            goto L1c
        L16:
            com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$cleanup$1 r1 = new com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$cleanup$1
            r1.<init>(r0)
            goto L14
        L1c:
            java.lang.Object r0 = r9.result
            o00O0O0o.OooOo00 r1 = o00O0O0o.OooOo00.f31365OooOo0O
            int r2 = r9.label
            oo00o.OooOo r12 = oo00o.OooOo.f33195OooO00o
            r13 = 2
            r3 = 1
            if (r2 == 0) goto L41
            if (r2 == r3) goto L39
            if (r2 != r13) goto L31
            o00O0.o000OOo.OooOO0O(r0)
            goto Lac
        L31:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L39:
            java.lang.Object r15 = r9.L$0
            com.unity3d.ads.adplayer.AdPlayer r15 = (com.unity3d.ads.adplayer.AdPlayer) r15
            o00O0.o000OOo.OooOO0O(r0)
            goto L9e
        L41:
            o00O0.o000OOo.OooOO0O(r0)
            gatewayprotocol.v1.OperativeEventErrorDataKt$Dsl$Companion r0 = gatewayprotocol.v1.OperativeEventErrorDataKt.Dsl.Companion
            gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventErrorData$Builder r2 = gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.newBuilder()
            java.lang.String r4 = "newBuilder()"
            kotlin.jvm.internal.OooOo.OooO0Oo(r2, r4)
            gatewayprotocol.v1.OperativeEventErrorDataKt$Dsl r0 = r0._create(r2)
            gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventErrorType r2 = gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorType.OPERATIVE_EVENT_ERROR_TYPE_UNSPECIFIED
            r0.setErrorType(r2)
            java.lang.Throwable r2 = r15.getCause()
            if (r2 == 0) goto L64
            java.lang.String r2 = r2.getMessage()
            if (r2 != 0) goto L6c
        L64:
            java.lang.String r2 = r15.getMessage()
            if (r2 != 0) goto L6c
            java.lang.String r2 = ""
        L6c:
            r0.setMessage(r2)
            gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventErrorData r15 = r0._build()
            com.unity3d.ads.core.domain.events.GetOperativeEventApi r2 = r14.getOperativeEventApi
            gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventType r0 = gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventType.OPERATIVE_EVENT_TYPE_LOAD_ERROR
            com.google.protobuf.ByteString r5 = r17.getTrackingToken()
            java.lang.String r4 = "response.trackingToken"
            kotlin.jvm.internal.OooOo.OooO0Oo(r5, r4)
            com.google.protobuf.ByteString r6 = r15.toByteString()
            java.lang.String r15 = "operativeEventErrorData.toByteString()"
            kotlin.jvm.internal.OooOo.OooO0Oo(r6, r15)
            r15 = r18
            r9.L$0 = r15
            r9.label = r3
            r7 = 0
            r8 = 0
            r10 = 48
            r11 = 0
            r4 = r16
            r3 = r0
            java.lang.Object r0 = com.unity3d.ads.core.domain.events.GetOperativeEventApi.invoke$default(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            if (r0 != r1) goto L9e
            goto Lab
        L9e:
            if (r15 == 0) goto Lac
            r0 = 0
            r9.L$0 = r0
            r9.label = r13
            java.lang.Object r15 = r15.destroy(r9)
            if (r15 != r1) goto Lac
        Lab:
            return r1
        Lac:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse.cleanup(java.lang.Throwable, com.google.protobuf.ByteString, gatewayprotocol.v1.AdResponseOuterClass$AdResponse, com.unity3d.ads.adplayer.AdPlayer, o00O0O0O.OooO0OO):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0440  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x044c A[Catch: CancellationException -> 0x04cc, TRY_LEAVE, TryCatch #11 {CancellationException -> 0x04cc, blocks: (B:111:0x0445, B:113:0x044c), top: B:184:0x0445 }] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x04d3  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0588  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0590  */
    /* JADX WARN: Removed duplicated region for block: B:198:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x023c A[Catch: CancellationException -> 0x00f1, TryCatch #10 {CancellationException -> 0x00f1, blocks: (B:117:0x0480, B:130:0x04d9, B:132:0x050e, B:139:0x0527, B:134:0x0514, B:136:0x051a, B:138:0x0522, B:94:0x0302, B:31:0x00ea, B:68:0x0232, B:70:0x023c, B:72:0x0252, B:77:0x0268, B:79:0x0271, B:82:0x028a, B:86:0x02b0, B:85:0x02a6, B:143:0x0532, B:78:0x026c), top: B:183:0x00ea, inners: #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0252 A[Catch: CancellationException -> 0x00f1, TryCatch #10 {CancellationException -> 0x00f1, blocks: (B:117:0x0480, B:130:0x04d9, B:132:0x050e, B:139:0x0527, B:134:0x0514, B:136:0x051a, B:138:0x0522, B:94:0x0302, B:31:0x00ea, B:68:0x0232, B:70:0x023c, B:72:0x0252, B:77:0x0268, B:79:0x0271, B:82:0x028a, B:86:0x02b0, B:85:0x02a6, B:143:0x0532, B:78:0x026c), top: B:183:0x00ea, inners: #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0317  */
    @Override // com.unity3d.ads.core.domain.HandleGatewayAdResponse
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object invoke(com.unity3d.ads.UnityAdsLoadOptions r52, com.google.protobuf.ByteString r53, gatewayprotocol.v1.AdResponseOuterClass.AdResponse r54, android.content.Context r55, java.lang.String r56, gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticAdType r57, boolean r58, o00O0O0O.OooO0OO r59) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1444
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse.invoke(com.unity3d.ads.UnityAdsLoadOptions, com.google.protobuf.ByteString, gatewayprotocol.v1.AdResponseOuterClass$AdResponse, android.content.Context, java.lang.String, gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticAdType, boolean, o00O0O0O.OooO0OO):java.lang.Object");
    }
}
