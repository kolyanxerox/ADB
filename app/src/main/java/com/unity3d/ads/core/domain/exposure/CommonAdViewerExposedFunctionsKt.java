package com.unity3d.ads.core.domain.exposure;

import Oooo0o0.OooO;
import Oooo0oO.o00000;
import android.util.Base64;
import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.repository.CampaignRepository;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.AndroidGetAdPlayerContext;
import com.unity3d.ads.core.domain.CacheFile;
import com.unity3d.ads.core.domain.ExecuteAdViewerRequest;
import com.unity3d.ads.core.domain.GetIsFileCache;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.ads.core.domain.HandleOpenUrl;
import com.unity3d.ads.core.domain.Refresh;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.domain.SendPrivacyUpdateRequest;
import com.unity3d.ads.core.domain.attribution.AndroidAttribution;
import com.unity3d.ads.core.domain.events.GetOperativeEventApi;
import com.unity3d.ads.core.domain.offerwall.GetIsOfferwallAdReady;
import com.unity3d.ads.core.domain.offerwall.LoadOfferwallAd;
import com.unity3d.ads.core.domain.p010om.AndroidOmStartSession;
import com.unity3d.ads.core.domain.p010om.GetOmData;
import com.unity3d.ads.core.domain.p010om.IsOMActivated;
import com.unity3d.ads.core.domain.p010om.OmFinishSession;
import com.unity3d.ads.core.domain.p010om.OmImpressionOccurred;
import com.unity3d.ads.core.domain.scar.LoadScarAd;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import com.unity3d.ads.core.utils.ContinuationFromCallback;
import com.unity3d.services.core.api.Storage;
import com.unity3d.services.core.network.model.RequestType;
import gatewayprotocol.p014v1.AllowedPiiKt;
import gatewayprotocol.p014v1.AllowedPiiOuterClass;
import gatewayprotocol.p014v1.DynamicDeviceInfoOuterClass;
import java.util.Iterator;
import kotlin.jvm.internal.OooOo;
import kotlin.jvm.internal.o000oOoO;
import o00O0.OooOOO;
import o00O0.o0O0O00;
import o00O0O00.OooOO0;
import o00O0O0O.OooO0OO;
import o00O0O0O.OooOOOO;
import o00O0O0o.OooOo00;
import o00O0oOO.OooOO0O;
import o00O0ooo.o0OO;
import o00O0ooo.oO00000o;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class CommonAdViewerExposedFunctionsKt {

    /* renamed from: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$download$1 */
    public static final class C41341 implements ExposedFunction {
        final /* synthetic */ AdObject $adObject;
        final /* synthetic */ CacheFile $cacheFile;

        public C41341(CacheFile cacheFile, AdObject adObject) {
            this.$cacheFile = cacheFile;
            this.$adObject = adObject;
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
        @Override // com.unity3d.ads.adplayer.ExposedFunction, o00O0Oo.o00O0O
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invoke(java.lang.Object[] r8, o00O0O0O.OooO0OO r9) throws org.json.JSONException {
            /*
                r7 = this;
                boolean r0 = r9 instanceof com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$download$1$invoke$1
                if (r0 == 0) goto L14
                r0 = r9
                com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$download$1$invoke$1 r0 = (com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$download$1$invoke$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L14
                int r1 = r1 - r2
                r0.label = r1
            L12:
                r6 = r0
                goto L1a
            L14:
                com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$download$1$invoke$1 r0 = new com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$download$1$invoke$1
                r0.<init>(r7, r9)
                goto L12
            L1a:
                java.lang.Object r9 = r6.result
                o00O0O0o.OooOo00 r0 = o00O0O0o.OooOo00.f31365OooOo0O
                int r1 = r6.label
                r2 = 1
                if (r1 == 0) goto L31
                if (r1 != r2) goto L29
                o00O0.o000OOo.OooOO0O(r9)
                goto L63
            L29:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L31:
                o00O0.o000OOo.OooOO0O(r9)
                r9 = 0
                r1 = r8[r9]
                java.lang.String r3 = "null cannot be cast to non-null type org.json.JSONObject"
                kotlin.jvm.internal.OooOo.OooO0OO(r1, r3)
                org.json.JSONObject r1 = (org.json.JSONObject) r1
                java.lang.String r3 = "url"
                r4 = r2
                java.lang.String r2 = r1.getString(r3)
                r5 = 2
                java.lang.Object r8 = o00O0.OooOOO.o000oOoO(r5, r8)
                org.json.JSONArray r8 = (org.json.JSONArray) r8
                java.lang.String r5 = "priority"
                int r5 = r1.optInt(r5, r9)
                com.unity3d.ads.core.domain.CacheFile r1 = r7.$cacheFile
                kotlin.jvm.internal.OooOo.OooO0Oo(r2, r3)
                com.unity3d.ads.core.data.model.AdObject r3 = r7.$adObject
                r6.label = r4
                r4 = r8
                java.lang.Object r9 = r1.invoke(r2, r3, r4, r5, r6)
                if (r9 != r0) goto L63
                return r0
            L63:
                com.unity3d.ads.core.data.model.CacheResult r9 = (com.unity3d.ads.core.data.model.CacheResult) r9
                boolean r8 = r9 instanceof com.unity3d.ads.core.data.model.CacheResult.Success
                if (r8 == 0) goto L82
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                java.lang.String r0 = "unity-ads-cache://unity.ads.cache/"
                r8.<init>(r0)
                com.unity3d.ads.core.data.model.CacheResult$Success r9 = (com.unity3d.ads.core.data.model.CacheResult.Success) r9
                com.unity3d.ads.core.data.model.CachedFile r9 = r9.getCachedFile()
                java.lang.String r9 = r9.getName()
                r8.append(r9)
                java.lang.String r8 = r8.toString()
                return r8
            L82:
                boolean r8 = r9 instanceof com.unity3d.ads.core.data.model.CacheResult.Failure
                if (r8 == 0) goto L9a
                com.unity3d.ads.core.data.model.CacheResult$Failure r9 = (com.unity3d.ads.core.data.model.CacheResult.Failure) r9
                com.unity3d.ads.core.data.model.CacheError r8 = r9.getError()
                java.lang.String r8 = r8.name()
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r8 = r8.toString()
                r9.<init>(r8)
                throw r9
            L9a:
                OooOOO0.OooO00o r8 = new OooOOO0.OooO00o
                r8.<init>()
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.C41341.invoke(java.lang.Object[], o00O0O0O.OooO0OO):java.lang.Object");
        }
    }

    /* renamed from: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$getPrivacy$1 */
    public static final class C41401 implements ExposedFunction {
        final /* synthetic */ SessionRepository $sessionRepository;

        public C41401(SessionRepository sessionRepository) {
            this.$sessionRepository = sessionRepository;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // com.unity3d.ads.adplayer.ExposedFunction, o00O0Oo.o00O0O
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invoke(java.lang.Object[] r4, o00O0O0O.OooO0OO r5) {
            /*
                r3 = this;
                boolean r4 = r5 instanceof com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$getPrivacy$1$invoke$1
                if (r4 == 0) goto L13
                r4 = r5
                com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$getPrivacy$1$invoke$1 r4 = (com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$getPrivacy$1$invoke$1) r4
                int r0 = r4.label
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r2 = r0 & r1
                if (r2 == 0) goto L13
                int r0 = r0 - r1
                r4.label = r0
                goto L18
            L13:
                com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$getPrivacy$1$invoke$1 r4 = new com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$getPrivacy$1$invoke$1
                r4.<init>(r3, r5)
            L18:
                java.lang.Object r5 = r4.result
                o00O0O0o.OooOo00 r0 = o00O0O0o.OooOo00.f31365OooOo0O
                int r1 = r4.label
                r2 = 1
                if (r1 == 0) goto L2f
                if (r1 != r2) goto L27
                o00O0.o000OOo.OooOO0O(r5)
                goto L3d
            L27:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r5)
                throw r4
            L2f:
                o00O0.o000OOo.OooOO0O(r5)
                com.unity3d.ads.core.data.repository.SessionRepository r5 = r3.$sessionRepository
                r4.label = r2
                java.lang.Object r5 = r5.getPrivacy(r4)
                if (r5 != r0) goto L3d
                return r0
            L3d:
                com.google.protobuf.ByteString r5 = (com.google.protobuf.ByteString) r5
                r4 = 0
                r0 = 0
                java.lang.String r4 = com.unity3d.ads.core.extensions.ProtobufExtensionsKt.toBase64$default(r5, r4, r2, r0)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.C41401.invoke(java.lang.Object[], o00O0O0O.OooO0OO):java.lang.Object");
        }
    }

    /* renamed from: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$getPrivacyFsm$1 */
    public static final class C41411 implements ExposedFunction {
        final /* synthetic */ SessionRepository $sessionRepository;

        public C41411(SessionRepository sessionRepository) {
            this.$sessionRepository = sessionRepository;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // com.unity3d.ads.adplayer.ExposedFunction, o00O0Oo.o00O0O
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invoke(java.lang.Object[] r4, o00O0O0O.OooO0OO r5) {
            /*
                r3 = this;
                boolean r4 = r5 instanceof com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$getPrivacyFsm$1$invoke$1
                if (r4 == 0) goto L13
                r4 = r5
                com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$getPrivacyFsm$1$invoke$1 r4 = (com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$getPrivacyFsm$1$invoke$1) r4
                int r0 = r4.label
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r2 = r0 & r1
                if (r2 == 0) goto L13
                int r0 = r0 - r1
                r4.label = r0
                goto L18
            L13:
                com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$getPrivacyFsm$1$invoke$1 r4 = new com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$getPrivacyFsm$1$invoke$1
                r4.<init>(r3, r5)
            L18:
                java.lang.Object r5 = r4.result
                o00O0O0o.OooOo00 r0 = o00O0O0o.OooOo00.f31365OooOo0O
                int r1 = r4.label
                r2 = 1
                if (r1 == 0) goto L2f
                if (r1 != r2) goto L27
                o00O0.o000OOo.OooOO0O(r5)
                goto L3d
            L27:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r5)
                throw r4
            L2f:
                o00O0.o000OOo.OooOO0O(r5)
                com.unity3d.ads.core.data.repository.SessionRepository r5 = r3.$sessionRepository
                r4.label = r2
                java.lang.Object r5 = r5.getPrivacyFsm(r4)
                if (r5 != r0) goto L3d
                return r0
            L3d:
                com.google.protobuf.ByteString r5 = (com.google.protobuf.ByteString) r5
                r4 = 0
                r0 = 0
                java.lang.String r4 = com.unity3d.ads.core.extensions.ProtobufExtensionsKt.toBase64$default(r5, r4, r2, r0)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.C41411.invoke(java.lang.Object[], o00O0O0O.OooO0OO):java.lang.Object");
        }
    }

    /* renamed from: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$loadOfferwallAd$1 */
    public static final class C41531 implements ExposedFunction {
        final /* synthetic */ AdObject $adObject;
        final /* synthetic */ LoadOfferwallAd $loadOfferwallAd;

        public C41531(AdObject adObject, LoadOfferwallAd loadOfferwallAd) {
            this.$adObject = adObject;
            this.$loadOfferwallAd = loadOfferwallAd;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // com.unity3d.ads.adplayer.ExposedFunction, o00O0Oo.o00O0O
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invoke(java.lang.Object[] r5, o00O0O0O.OooO0OO r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$loadOfferwallAd$1$invoke$1
                if (r0 == 0) goto L13
                r0 = r6
                com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$loadOfferwallAd$1$invoke$1 r0 = (com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$loadOfferwallAd$1$invoke$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$loadOfferwallAd$1$invoke$1 r0 = new com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$loadOfferwallAd$1$invoke$1
                r0.<init>(r4, r6)
            L18:
                java.lang.Object r6 = r0.result
                o00O0O0o.OooOo00 r1 = o00O0O0o.OooOo00.f31365OooOo0O
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L2f
                if (r2 != r3) goto L27
                o00O0.o000OOo.OooOO0O(r6)
                goto L5a
            L27:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L2f:
                o00O0.o000OOo.OooOO0O(r6)
                r6 = 0
                r5 = r5[r6]
                java.lang.String r6 = "null cannot be cast to non-null type org.json.JSONObject"
                kotlin.jvm.internal.OooOo.OooO0OO(r5, r6)
                org.json.JSONObject r5 = (org.json.JSONObject) r5
                java.lang.String r6 = "placementName"
                java.lang.String r5 = r5.optString(r6)
                com.unity3d.ads.core.data.model.AdObject r2 = r4.$adObject
                r2.setOfferwallAd(r3)
                com.unity3d.ads.core.data.model.AdObject r2 = r4.$adObject
                r2.setOfferwallPlacementName(r5)
                com.unity3d.ads.core.domain.offerwall.LoadOfferwallAd r2 = r4.$loadOfferwallAd
                kotlin.jvm.internal.OooOo.OooO0Oo(r5, r6)
                r0.label = r3
                java.lang.Object r5 = r2.invoke(r5, r0)
                if (r5 != r1) goto L5a
                return r1
            L5a:
                oo00o.OooOo r5 = oo00o.OooOo.f33195OooO00o
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.C41531.invoke(java.lang.Object[], o00O0O0O.OooO0OO):java.lang.Object");
        }
    }

    /* renamed from: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$loadScarAd$1 */
    public static final class C41541 implements ExposedFunction {
        final /* synthetic */ AdObject $adObject;
        final /* synthetic */ LoadScarAd $loadScarAd;

        public C41541(AdObject adObject, LoadScarAd loadScarAd) {
            this.$adObject = adObject;
            this.$loadScarAd = loadScarAd;
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
        @Override // com.unity3d.ads.adplayer.ExposedFunction, o00O0Oo.o00O0O
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invoke(java.lang.Object[] r12, o00O0O0O.OooO0OO r13) {
            /*
                r11 = this;
                boolean r0 = r13 instanceof com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$loadScarAd$1$invoke$1
                if (r0 == 0) goto L14
                r0 = r13
                com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$loadScarAd$1$invoke$1 r0 = (com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$loadScarAd$1$invoke$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L14
                int r1 = r1 - r2
                r0.label = r1
            L12:
                r8 = r0
                goto L1a
            L14:
                com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$loadScarAd$1$invoke$1 r0 = new com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$loadScarAd$1$invoke$1
                r0.<init>(r11, r13)
                goto L12
            L1a:
                java.lang.Object r13 = r8.result
                o00O0O0o.OooOo00 r0 = o00O0O0o.OooOo00.f31365OooOo0O
                int r1 = r8.label
                r2 = 1
                if (r1 == 0) goto L31
                if (r1 != r2) goto L29
                o00O0.o000OOo.OooOO0O(r13)
                goto L94
            L29:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r13)
                throw r12
            L31:
                o00O0.o000OOo.OooOO0O(r13)
                r13 = 0
                r12 = r12[r13]
                java.lang.String r13 = "null cannot be cast to non-null type org.json.JSONObject"
                kotlin.jvm.internal.OooOo.OooO0OO(r12, r13)
                org.json.JSONObject r12 = (org.json.JSONObject) r12
                java.lang.String r13 = "type"
                java.lang.String r13 = r12.optString(r13)
                java.lang.String r1 = "adUnitId"
                java.lang.String r4 = r12.optString(r1)
                java.lang.String r3 = "adString"
                java.lang.String r5 = r12.optString(r3)
                java.lang.String r6 = "queryId"
                r7 = r6
                java.lang.String r6 = r12.optString(r7)
                java.lang.String r9 = "videoLength"
                int r12 = r12.optInt(r9)
                com.unity3d.ads.core.data.model.AdObject r9 = r11.$adObject
                r9.setScarAd(r2)
                com.unity3d.ads.core.data.model.AdObject r9 = r11.$adObject
                r9.setScarAdUnitId(r4)
                com.unity3d.ads.core.data.model.AdObject r9 = r11.$adObject
                r9.setScarQueryId(r6)
                com.unity3d.ads.core.data.model.AdObject r9 = r11.$adObject
                r9.setScarAdString(r5)
                r9 = r1
                com.unity3d.ads.core.domain.scar.LoadScarAd r1 = r11.$loadScarAd
                java.lang.String r10 = "adType"
                kotlin.jvm.internal.OooOo.OooO0Oo(r13, r10)
                com.unity3d.ads.core.data.model.AdObject r10 = r11.$adObject
                java.lang.String r10 = r10.getPlacementId()
                kotlin.jvm.internal.OooOo.OooO0Oo(r4, r9)
                kotlin.jvm.internal.OooOo.OooO0Oo(r5, r3)
                kotlin.jvm.internal.OooOo.OooO0Oo(r6, r7)
                r8.label = r2
                r7 = r12
                r2 = r13
                r3 = r10
                java.lang.Object r12 = r1.invoke(r2, r3, r4, r5, r6, r7, r8)
                if (r12 != r0) goto L94
                return r0
            L94:
                oo00o.OooOo r12 = oo00o.OooOo.f33195OooO00o
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.C41541.invoke(java.lang.Object[], o00O0O0O.OooO0OO):java.lang.Object");
        }
    }

    /* renamed from: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omFinishSession$1 */
    public static final class C41561 implements ExposedFunction {
        final /* synthetic */ AdObject $adObject;
        final /* synthetic */ OmFinishSession $omFinishSession;

        public C41561(OmFinishSession omFinishSession, AdObject adObject) {
            this.$omFinishSession = omFinishSession;
            this.$adObject = adObject;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // com.unity3d.ads.adplayer.ExposedFunction, o00O0Oo.o00O0O
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invoke(java.lang.Object[] r4, o00O0O0O.OooO0OO r5) {
            /*
                r3 = this;
                boolean r4 = r5 instanceof com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omFinishSession$1$invoke$1
                if (r4 == 0) goto L13
                r4 = r5
                com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omFinishSession$1$invoke$1 r4 = (com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omFinishSession$1$invoke$1) r4
                int r0 = r4.label
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r2 = r0 & r1
                if (r2 == 0) goto L13
                int r0 = r0 - r1
                r4.label = r0
                goto L18
            L13:
                com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omFinishSession$1$invoke$1 r4 = new com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omFinishSession$1$invoke$1
                r4.<init>(r3, r5)
            L18:
                java.lang.Object r5 = r4.result
                o00O0O0o.OooOo00 r0 = o00O0O0o.OooOo00.f31365OooOo0O
                int r1 = r4.label
                r2 = 1
                if (r1 == 0) goto L2f
                if (r1 != r2) goto L27
                o00O0.o000OOo.OooOO0O(r5)
                goto L3f
            L27:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r5)
                throw r4
            L2f:
                o00O0.o000OOo.OooOO0O(r5)
                com.unity3d.ads.core.domain.om.OmFinishSession r5 = r3.$omFinishSession
                com.unity3d.ads.core.data.model.AdObject r1 = r3.$adObject
                r4.label = r2
                java.lang.Object r4 = r5.invoke(r1, r4)
                if (r4 != r0) goto L3f
                return r0
            L3f:
                oo00o.OooOo r4 = oo00o.OooOo.f33195OooO00o
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.C41561.invoke(java.lang.Object[], o00O0O0O.OooO0OO):java.lang.Object");
        }
    }

    /* renamed from: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omGetData$1 */
    public static final class C41571 implements ExposedFunction {
        final /* synthetic */ GetOmData $getOmData;

        public C41571(GetOmData getOmData) {
            this.$getOmData = getOmData;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // com.unity3d.ads.adplayer.ExposedFunction, o00O0Oo.o00O0O
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invoke(java.lang.Object[] r4, o00O0O0O.OooO0OO r5) {
            /*
                r3 = this;
                boolean r4 = r5 instanceof com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omGetData$1$invoke$1
                if (r4 == 0) goto L13
                r4 = r5
                com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omGetData$1$invoke$1 r4 = (com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omGetData$1$invoke$1) r4
                int r0 = r4.label
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r2 = r0 & r1
                if (r2 == 0) goto L13
                int r0 = r0 - r1
                r4.label = r0
                goto L18
            L13:
                com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omGetData$1$invoke$1 r4 = new com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omGetData$1$invoke$1
                r4.<init>(r3, r5)
            L18:
                java.lang.Object r5 = r4.result
                o00O0O0o.OooOo00 r0 = o00O0O0o.OooOo00.f31365OooOo0O
                int r1 = r4.label
                r2 = 1
                if (r1 == 0) goto L2f
                if (r1 != r2) goto L27
                o00O0.o000OOo.OooOO0O(r5)
                goto L3d
            L27:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r5)
                throw r4
            L2f:
                o00O0.o000OOo.OooOO0O(r5)
                com.unity3d.ads.core.domain.om.GetOmData r5 = r3.$getOmData
                r4.label = r2
                java.lang.Object r5 = r5.invoke(r4)
                if (r5 != r0) goto L3d
                return r0
            L3d:
                com.unity3d.ads.core.data.model.OMData r5 = (com.unity3d.ads.core.data.model.OMData) r5
                o00O0O00.OooOO0 r4 = o00O0.o0O0O00.OooOOO0()
                java.lang.String r0 = r5.getVersion()
                java.lang.String r1 = "version"
                r4.put(r1, r0)
                java.lang.String r0 = "partnerName"
                java.lang.String r1 = r5.getPartnerName()
                r4.put(r0, r1)
                java.lang.String r0 = "partnerVersion"
                java.lang.String r5 = r5.getPartnerVersion()
                r4.put(r0, r5)
                o00O0O00.OooOO0 r4 = o00O0.o0O0O00.OooOO0o(r4)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.C41571.invoke(java.lang.Object[], o00O0O0O.OooO0OO):java.lang.Object");
        }
    }

    /* renamed from: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omImpression$1 */
    public static final class C41581 implements ExposedFunction {
        final /* synthetic */ AdObject $adObject;
        final /* synthetic */ OmImpressionOccurred $omImpressionOccurred;

        public C41581(OmImpressionOccurred omImpressionOccurred, AdObject adObject) {
            this.$omImpressionOccurred = omImpressionOccurred;
            this.$adObject = adObject;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // com.unity3d.ads.adplayer.ExposedFunction, o00O0Oo.o00O0O
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invoke(java.lang.Object[] r5, o00O0O0O.OooO0OO r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omImpression$1$invoke$1
                if (r0 == 0) goto L13
                r0 = r6
                com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omImpression$1$invoke$1 r0 = (com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omImpression$1$invoke$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omImpression$1$invoke$1 r0 = new com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omImpression$1$invoke$1
                r0.<init>(r4, r6)
            L18:
                java.lang.Object r6 = r0.result
                o00O0O0o.OooOo00 r1 = o00O0O0o.OooOo00.f31365OooOo0O
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L2f
                if (r2 != r3) goto L27
                o00O0.o000OOo.OooOO0O(r6)
                goto L4d
            L27:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L2f:
                o00O0.o000OOo.OooOO0O(r6)
                r6 = 0
                r5 = r5[r6]
                java.lang.String r6 = "null cannot be cast to non-null type kotlin.Boolean"
                kotlin.jvm.internal.OooOo.OooO0OO(r5, r6)
                java.lang.Boolean r5 = (java.lang.Boolean) r5
                boolean r5 = r5.booleanValue()
                com.unity3d.ads.core.domain.om.OmImpressionOccurred r6 = r4.$omImpressionOccurred
                com.unity3d.ads.core.data.model.AdObject r2 = r4.$adObject
                r0.label = r3
                java.lang.Object r5 = r6.invoke(r2, r5, r0)
                if (r5 != r1) goto L4d
                return r1
            L4d:
                oo00o.OooOo r5 = oo00o.OooOo.f33195OooO00o
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.C41581.invoke(java.lang.Object[], o00O0O0O.OooO0OO):java.lang.Object");
        }
    }

    /* renamed from: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omStartSession$1 */
    public static final class C41591 implements ExposedFunction {
        final /* synthetic */ AdObject $adObject;
        final /* synthetic */ AndroidOmStartSession $omStartSession;

        public C41591(AndroidOmStartSession androidOmStartSession, AdObject adObject) {
            this.$omStartSession = androidOmStartSession;
            this.$adObject = adObject;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // com.unity3d.ads.adplayer.ExposedFunction, o00O0Oo.o00O0O
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invoke(java.lang.Object[] r5, o00O0O0O.OooO0OO r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omStartSession$1$invoke$1
                if (r0 == 0) goto L13
                r0 = r6
                com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omStartSession$1$invoke$1 r0 = (com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omStartSession$1$invoke$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omStartSession$1$invoke$1 r0 = new com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omStartSession$1$invoke$1
                r0.<init>(r4, r6)
            L18:
                java.lang.Object r6 = r0.result
                o00O0O0o.OooOo00 r1 = o00O0O0o.OooOo00.f31365OooOo0O
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L2f
                if (r2 != r3) goto L27
                o00O0.o000OOo.OooOO0O(r6)
                goto L49
            L27:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L2f:
                o00O0.o000OOo.OooOO0O(r6)
                r6 = 0
                r5 = r5[r6]
                java.lang.String r6 = "null cannot be cast to non-null type org.json.JSONObject"
                kotlin.jvm.internal.OooOo.OooO0OO(r5, r6)
                org.json.JSONObject r5 = (org.json.JSONObject) r5
                com.unity3d.ads.core.domain.om.AndroidOmStartSession r6 = r4.$omStartSession
                com.unity3d.ads.core.data.model.AdObject r2 = r4.$adObject
                r0.label = r3
                java.lang.Object r5 = r6.invoke(r2, r5, r0)
                if (r5 != r1) goto L49
                return r1
            L49:
                oo00o.OooOo r5 = oo00o.OooOo.f33195OooO00o
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.C41591.invoke(java.lang.Object[], o00O0O0O.OooO0OO):java.lang.Object");
        }
    }

    /* renamed from: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$refreshAdData$1 */
    public static final class C41621 implements ExposedFunction {
        final /* synthetic */ AdObject $adObject;
        final /* synthetic */ Refresh $refresh;

        public C41621(Refresh refresh, AdObject adObject) {
            this.$refresh = refresh;
            this.$adObject = adObject;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // com.unity3d.ads.adplayer.ExposedFunction, o00O0Oo.o00O0O
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invoke(java.lang.Object[] r8, o00O0O0O.OooO0OO r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$refreshAdData$1$invoke$1
                if (r0 == 0) goto L13
                r0 = r9
                com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$refreshAdData$1$invoke$1 r0 = (com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$refreshAdData$1$invoke$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$refreshAdData$1$invoke$1 r0 = new com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$refreshAdData$1$invoke$1
                r0.<init>(r7, r9)
            L18:
                java.lang.Object r9 = r0.result
                o00O0O0o.OooOo00 r1 = o00O0O0o.OooOo00.f31365OooOo0O
                int r2 = r0.label
                java.lang.String r3 = "adDataRefreshToken"
                r4 = 0
                r5 = 0
                r6 = 1
                if (r2 == 0) goto L33
                if (r2 != r6) goto L2b
                o00O0.o000OOo.OooOO0O(r9)
                goto L68
            L2b:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L33:
                o00O0.o000OOo.OooOO0O(r9)
                int r9 = r8.length
                if (r9 != 0) goto L3c
                com.google.protobuf.ByteString r8 = com.google.protobuf.ByteString.EMPTY
                goto L52
            L3c:
                r8 = r8[r5]
                java.lang.String r9 = "null cannot be cast to non-null type org.json.JSONObject"
                kotlin.jvm.internal.OooOo.OooO0OO(r8, r9)
                org.json.JSONObject r8 = (org.json.JSONObject) r8
                java.lang.String r8 = r8.optString(r3)
                java.lang.String r9 = "refreshToken"
                kotlin.jvm.internal.OooOo.OooO0Oo(r8, r9)
                com.google.protobuf.ByteString r8 = com.unity3d.ads.core.extensions.ProtobufExtensionsKt.fromBase64$default(r8, r5, r6, r4)
            L52:
                com.unity3d.ads.core.domain.Refresh r9 = r7.$refresh
                java.lang.String r2 = "refreshTokenByteString"
                kotlin.jvm.internal.OooOo.OooO0Oo(r8, r2)
                com.unity3d.ads.core.data.model.AdObject r2 = r7.$adObject
                com.google.protobuf.ByteString r2 = r2.getOpportunityId()
                r0.label = r6
                java.lang.Object r9 = r9.invoke(r8, r2, r0)
                if (r9 != r1) goto L68
                return r1
            L68:
                gatewayprotocol.v1.AdDataRefreshResponseOuterClass$AdDataRefreshResponse r9 = (gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse) r9
                boolean r8 = r9.hasError()
                if (r8 != 0) goto Lad
                o00O0O00.OooOO0 r8 = o00O0.o0O0O00.OooOOO0()
                com.google.protobuf.ByteString r0 = r9.getAdData()
                java.lang.String r1 = "adRefreshResponse.adData"
                kotlin.jvm.internal.OooOo.OooO0Oo(r0, r1)
                java.lang.String r0 = com.unity3d.ads.core.extensions.ProtobufExtensionsKt.toBase64$default(r0, r5, r6, r4)
                java.lang.String r1 = "adData"
                r8.put(r1, r0)
                com.google.protobuf.ByteString r0 = r9.getAdDataRefreshToken()
                java.lang.String r1 = "adRefreshResponse.adDataRefreshToken"
                kotlin.jvm.internal.OooOo.OooO0Oo(r0, r1)
                java.lang.String r0 = com.unity3d.ads.core.extensions.ProtobufExtensionsKt.toBase64$default(r0, r5, r6, r4)
                r8.put(r3, r0)
                com.google.protobuf.ByteString r9 = r9.getTrackingToken()
                java.lang.String r0 = "adRefreshResponse.trackingToken"
                kotlin.jvm.internal.OooOo.OooO0Oo(r9, r0)
                java.lang.String r9 = com.unity3d.ads.core.extensions.ProtobufExtensionsKt.toBase64$default(r9, r5, r6, r4)
                java.lang.String r0 = "trackingToken"
                r8.put(r0, r9)
                o00O0O00.OooOO0 r8 = o00O0.o0O0O00.OooOO0o(r8)
                return r8
            Lad:
                java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
                java.lang.String r9 = "Refresh failed"
                r8.<init>(r9)
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.C41621.invoke(java.lang.Object[], o00O0O0O.OooO0OO):java.lang.Object");
        }
    }

    /* renamed from: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$request$1 */
    public static final class C41631 implements ExposedFunction {
        final /* synthetic */ ExecuteAdViewerRequest $executeAdViewerRequest;
        final /* synthetic */ RequestType $type;

        public C41631(ExecuteAdViewerRequest executeAdViewerRequest, RequestType requestType) {
            this.$executeAdViewerRequest = executeAdViewerRequest;
            this.$type = requestType;
        }

        /* JADX WARN: Removed duplicated region for block: B:36:0x00ae  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // com.unity3d.ads.adplayer.ExposedFunction, o00O0Oo.o00O0O
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invoke(java.lang.Object[] r7, o00O0O0O.OooO0OO r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$request$1$invoke$1
                if (r0 == 0) goto L13
                r0 = r8
                com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$request$1$invoke$1 r0 = (com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$request$1$invoke$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$request$1$invoke$1 r0 = new com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$request$1$invoke$1
                r0.<init>(r6, r8)
            L18:
                java.lang.Object r8 = r0.result
                o00O0O0o.OooOo00 r1 = o00O0O0o.OooOo00.f31365OooOo0O
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L3a
                if (r2 != r3) goto L32
                java.lang.Object r7 = r0.L$1
                java.lang.String r7 = (java.lang.String) r7
                java.lang.Object r0 = r0.L$0
                java.lang.String r0 = (java.lang.String) r0
                o00O0.o000OOo.OooOO0O(r8)     // Catch: java.lang.Exception -> L2f
                goto L62
            L2f:
                r8 = move-exception
                goto La6
            L32:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L3a:
                o00O0.o000OOo.OooOO0O(r8)
                java.lang.Object r8 = o00O0.OooOOO.OoooOO0(r7)
                java.lang.String r2 = "null cannot be cast to non-null type kotlin.String"
                kotlin.jvm.internal.OooOo.OooO0OO(r8, r2)
                java.lang.String r8 = (java.lang.String) r8
                java.lang.Object r2 = o00O0.OooOOO.o000oOoO(r3, r7)
                java.lang.String r2 = (java.lang.String) r2
                com.unity3d.ads.core.domain.ExecuteAdViewerRequest r4 = r6.$executeAdViewerRequest     // Catch: java.lang.Exception -> La2
                com.unity3d.services.core.network.model.RequestType r5 = r6.$type     // Catch: java.lang.Exception -> La2
                r0.L$0 = r8     // Catch: java.lang.Exception -> La2
                r0.L$1 = r2     // Catch: java.lang.Exception -> La2
                r0.label = r3     // Catch: java.lang.Exception -> La2
                java.lang.Object r7 = r4.invoke(r5, r7, r0)     // Catch: java.lang.Exception -> La2
                if (r7 != r1) goto L5f
                return r1
            L5f:
                r0 = r8
                r8 = r7
                r7 = r2
            L62:
                com.unity3d.services.core.network.model.HttpResponse r8 = (com.unity3d.services.core.network.model.HttpResponse) r8     // Catch: java.lang.Exception -> L2f
                java.lang.Object r1 = r8.getBody()     // Catch: java.lang.Exception -> L2f
                boolean r2 = r1 instanceof java.lang.String     // Catch: java.lang.Exception -> L2f
                if (r2 == 0) goto L6f
                java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L2f
                goto L7f
            L6f:
                boolean r2 = r1 instanceof byte[]     // Catch: java.lang.Exception -> L2f
                if (r2 == 0) goto L7e
                java.lang.String r2 = new java.lang.String     // Catch: java.lang.Exception -> L2f
                byte[] r1 = (byte[]) r1     // Catch: java.lang.Exception -> L2f
                java.nio.charset.Charset r3 = o00O0oO.o0OO00O.f31451OooO00o     // Catch: java.lang.Exception -> L2f
                r2.<init>(r1, r3)     // Catch: java.lang.Exception -> L2f
                r1 = r2
                goto L7f
            L7e:
                r1 = 0
            L7f:
                com.unity3d.ads.adplayer.model.OnWebRequestComplete r2 = new com.unity3d.ads.adplayer.model.OnWebRequestComplete     // Catch: java.lang.Exception -> L2f
                java.lang.String r3 = r8.getUrlString()     // Catch: java.lang.Exception -> L2f
                int r4 = r8.getStatusCode()     // Catch: java.lang.Exception -> L2f
                java.lang.Integer r5 = new java.lang.Integer     // Catch: java.lang.Exception -> L2f
                r5.<init>(r4)     // Catch: java.lang.Exception -> L2f
                java.util.Map r8 = r8.getHeaders()     // Catch: java.lang.Exception -> L2f
                org.json.JSONArray r8 = com.unity3d.services.core.network.mapper.HttpResponseHeaderToJSONArrayKt.toResponseHeadersMap(r8)     // Catch: java.lang.Exception -> L2f
                java.lang.Object[] r8 = new java.lang.Object[]{r0, r3, r1, r5, r8}     // Catch: java.lang.Exception -> L2f
                java.util.List r8 = o00O0.OooOo.OooOOo(r8)     // Catch: java.lang.Exception -> L2f
                r2.<init>(r8)     // Catch: java.lang.Exception -> L2f
                return r2
            La2:
                r7 = move-exception
                r0 = r8
                r8 = r7
                r7 = r2
            La6:
                com.unity3d.ads.adplayer.model.OnWebRequestFailed r1 = new com.unity3d.ads.adplayer.model.OnWebRequestFailed
                java.lang.String r8 = r8.getMessage()
                if (r8 != 0) goto Lb0
                java.lang.String r8 = ""
            Lb0:
                java.lang.String[] r7 = new java.lang.String[]{r0, r7, r8}
                java.util.List r7 = o00O0.OooOo.OooOOo(r7)
                r1.<init>(r7)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.C41631.invoke(java.lang.Object[], o00O0O0O.OooO0OO):java.lang.Object");
        }
    }

    /* renamed from: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$sendOperativeEvent$1 */
    public static final class C41651 implements ExposedFunction {
        final /* synthetic */ AdObject $adObject;
        final /* synthetic */ GetOperativeEventApi $getOperativeEventApi;

        public C41651(GetOperativeEventApi getOperativeEventApi, AdObject adObject) {
            this.$getOperativeEventApi = getOperativeEventApi;
            this.$adObject = adObject;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // com.unity3d.ads.adplayer.ExposedFunction, o00O0Oo.o00O0O
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invoke(java.lang.Object[] r6, o00O0O0O.OooO0OO r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$sendOperativeEvent$1$invoke$1
                if (r0 == 0) goto L13
                r0 = r7
                com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$sendOperativeEvent$1$invoke$1 r0 = (com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$sendOperativeEvent$1$invoke$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$sendOperativeEvent$1$invoke$1 r0 = new com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$sendOperativeEvent$1$invoke$1
                r0.<init>(r5, r7)
            L18:
                java.lang.Object r7 = r0.result
                o00O0O0o.OooOo00 r1 = o00O0O0o.OooOo00.f31365OooOo0O
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L2f
                if (r2 != r3) goto L27
                o00O0.o000OOo.OooOO0O(r7)
                goto L59
            L27:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L2f:
                o00O0.o000OOo.OooOO0O(r7)
                gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventType r7 = gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventType.OPERATIVE_EVENT_TYPE_SPECIFIED_BY_AD_PLAYER
                r2 = 0
                r6 = r6[r2]
                java.lang.String r2 = "null cannot be cast to non-null type kotlin.String"
                kotlin.jvm.internal.OooOo.OooO0OO(r6, r2)
                java.lang.String r6 = (java.lang.String) r6
                r2 = 2
                byte[] r6 = android.util.Base64.decode(r6, r2)
                java.lang.String r2 = "decode(it[0] as String, Base64.NO_WRAP)"
                kotlin.jvm.internal.OooOo.OooO0Oo(r6, r2)
                com.google.protobuf.ByteString r6 = com.google.protobuf.kotlin.ByteStringsKt.toByteString(r6)
                com.unity3d.ads.core.domain.events.GetOperativeEventApi r2 = r5.$getOperativeEventApi
                com.unity3d.ads.core.data.model.AdObject r4 = r5.$adObject
                r0.label = r3
                java.lang.Object r6 = r2.invoke(r7, r4, r6, r0)
                if (r6 != r1) goto L59
                return r1
            L59:
                oo00o.OooOo r6 = oo00o.OooOo.f33195OooO00o
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.C41651.invoke(java.lang.Object[], o00O0O0O.OooO0OO):java.lang.Object");
        }
    }

    /* renamed from: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1 */
    public static final class C41661 implements ExposedFunction {
        final /* synthetic */ SendPrivacyUpdateRequest $sendPrivacyUpdateRequest;

        public C41661(SendPrivacyUpdateRequest sendPrivacyUpdateRequest) {
            this.$sendPrivacyUpdateRequest = sendPrivacyUpdateRequest;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // com.unity3d.ads.adplayer.ExposedFunction, o00O0Oo.o00O0O
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invoke(java.lang.Object[] r10, o00O0O0O.OooO0OO r11) {
            /*
                r9 = this;
                boolean r0 = r11 instanceof com.unity3d.ads.core.domain.exposure.C4167x9d370ad6
                if (r0 == 0) goto L13
                r0 = r11
                com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1$invoke$1 r0 = (com.unity3d.ads.core.domain.exposure.C4167x9d370ad6) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1$invoke$1 r0 = new com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1$invoke$1
                r0.<init>(r9, r11)
            L18:
                java.lang.Object r11 = r0.result
                o00O0O0o.OooOo00 r1 = o00O0O0o.OooOo00.f31365OooOo0O
                int r2 = r0.label
                r3 = 0
                java.lang.String r4 = "version"
                java.lang.String r5 = "content"
                r6 = 0
                r7 = 1
                if (r2 == 0) goto L35
                if (r2 != r7) goto L2d
                o00O0.o000OOo.OooOO0O(r11)
                goto L5d
            L2d:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r11)
                throw r10
            L35:
                o00O0.o000OOo.OooOO0O(r11)
                r10 = r10[r6]
                java.lang.String r11 = "null cannot be cast to non-null type org.json.JSONObject"
                kotlin.jvm.internal.OooOo.OooO0OO(r10, r11)
                org.json.JSONObject r10 = (org.json.JSONObject) r10
                java.lang.String r11 = r10.optString(r5)
                int r10 = r10.optInt(r4)
                com.unity3d.ads.core.domain.SendPrivacyUpdateRequest r2 = r9.$sendPrivacyUpdateRequest
                java.lang.String r8 = "privacyUpdateContentBase64"
                kotlin.jvm.internal.OooOo.OooO0Oo(r11, r8)
                com.google.protobuf.ByteString r11 = com.unity3d.ads.core.extensions.ProtobufExtensionsKt.fromBase64$default(r11, r6, r7, r3)
                r0.label = r7
                java.lang.Object r11 = r2.invoke(r10, r11, r0)
                if (r11 != r1) goto L5d
                return r1
            L5d:
                gatewayprotocol.v1.PrivacyUpdateResponseOuterClass$PrivacyUpdateResponse r11 = (gatewayprotocol.v1.PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse) r11
                o00O0O00.OooOO0 r10 = o00O0.o0O0O00.OooOOO0()
                int r0 = r11.getVersion()
                java.lang.Integer r1 = new java.lang.Integer
                r1.<init>(r0)
                r10.put(r4, r1)
                com.google.protobuf.ByteString r11 = r11.getContent()
                java.lang.String r0 = "response.content"
                kotlin.jvm.internal.OooOo.OooO0Oo(r11, r0)
                java.lang.String r11 = com.unity3d.ads.core.extensions.ProtobufExtensionsKt.toBase64$default(r11, r6, r7, r3)
                r10.put(r5, r11)
                o00O0O00.OooOO0 r10 = o00O0.o0O0O00.OooOO0o(r10)
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.C41661.invoke(java.lang.Object[], o00O0O0O.OooO0OO):java.lang.Object");
        }
    }

    /* renamed from: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$setOrientation$1 */
    public static final class C41701 implements ExposedFunction {
        final /* synthetic */ AdObject $adObject;

        public C41701(AdObject adObject) {
            this.$adObject = adObject;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // com.unity3d.ads.adplayer.ExposedFunction, o00O0Oo.o00O0O
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invoke(java.lang.Object[] r7, o00O0O0O.OooO0OO r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$setOrientation$1$invoke$1
                if (r0 == 0) goto L13
                r0 = r8
                com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$setOrientation$1$invoke$1 r0 = (com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$setOrientation$1$invoke$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$setOrientation$1$invoke$1 r0 = new com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$setOrientation$1$invoke$1
                r0.<init>(r6, r8)
            L18:
                java.lang.Object r8 = r0.result
                o00O0O0o.OooOo00 r1 = o00O0O0o.OooOo00.f31365OooOo0O
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L2f
                if (r2 != r3) goto L27
                o00O0.o000OOo.OooOO0O(r8)
                goto L63
            L27:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L2f:
                o00O0.o000OOo.OooOO0O(r8)
                r8 = 0
                r7 = r7[r8]
                java.lang.String r8 = "null cannot be cast to non-null type kotlin.Int"
                kotlin.jvm.internal.OooOo.OooO0OO(r7, r8)
                java.lang.Integer r7 = (java.lang.Integer) r7
                int r7 = r7.intValue()
                com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$Companion r8 = com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.Companion
                o00O0ooo.o0OO0oO0 r8 = r8.getDisplayMessages()
                com.unity3d.ads.adplayer.DisplayMessage$SetOrientation r2 = new com.unity3d.ads.adplayer.DisplayMessage$SetOrientation
                com.unity3d.ads.core.data.model.AdObject r4 = r6.$adObject
                com.google.protobuf.ByteString r4 = r4.getOpportunityId()
                java.lang.String r4 = r4.toStringUtf8()
                java.lang.String r5 = "adObject.opportunityId.toStringUtf8()"
                kotlin.jvm.internal.OooOo.OooO0Oo(r4, r5)
                r2.<init>(r4, r7)
                r0.label = r3
                java.lang.Object r7 = r8.emit(r2, r0)
                if (r7 != r1) goto L63
                return r1
            L63:
                oo00o.OooOo r7 = oo00o.OooOo.f33195OooO00o
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.C41701.invoke(java.lang.Object[], o00O0O0O.OooO0OO):java.lang.Object");
        }
    }

    /* renamed from: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$setPrivacy$1 */
    public static final class C41711 implements ExposedFunction {
        final /* synthetic */ SessionRepository $sessionRepository;

        public C41711(SessionRepository sessionRepository) {
            this.$sessionRepository = sessionRepository;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // com.unity3d.ads.adplayer.ExposedFunction, o00O0Oo.o00O0O
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invoke(java.lang.Object[] r5, o00O0O0O.OooO0OO r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$setPrivacy$1$invoke$1
                if (r0 == 0) goto L13
                r0 = r6
                com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$setPrivacy$1$invoke$1 r0 = (com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$setPrivacy$1$invoke$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$setPrivacy$1$invoke$1 r0 = new com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$setPrivacy$1$invoke$1
                r0.<init>(r4, r6)
            L18:
                java.lang.Object r6 = r0.result
                o00O0O0o.OooOo00 r1 = o00O0O0o.OooOo00.f31365OooOo0O
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L2f
                if (r2 != r3) goto L27
                o00O0.o000OOo.OooOO0O(r6)
                goto L55
            L27:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L2f:
                o00O0.o000OOo.OooOO0O(r6)
                com.unity3d.ads.core.data.repository.SessionRepository r6 = r4.$sessionRepository
                r2 = 0
                r5 = r5[r2]
                java.lang.String r2 = "null cannot be cast to non-null type kotlin.String"
                kotlin.jvm.internal.OooOo.OooO0OO(r5, r2)
                java.lang.String r5 = (java.lang.String) r5
                r2 = 2
                byte[] r5 = android.util.Base64.decode(r5, r2)
                java.lang.String r2 = "decode(it[0] as String, Base64.NO_WRAP)"
                kotlin.jvm.internal.OooOo.OooO0Oo(r5, r2)
                com.google.protobuf.ByteString r5 = com.google.protobuf.kotlin.ByteStringsKt.toByteString(r5)
                r0.label = r3
                java.lang.Object r5 = r6.setPrivacy(r5, r0)
                if (r5 != r1) goto L55
                return r1
            L55:
                oo00o.OooOo r5 = oo00o.OooOo.f33195OooO00o
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.C41711.invoke(java.lang.Object[], o00O0O0O.OooO0OO):java.lang.Object");
        }
    }

    /* renamed from: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$setPrivacyFsm$1 */
    public static final class C41721 implements ExposedFunction {
        final /* synthetic */ SessionRepository $sessionRepository;

        public C41721(SessionRepository sessionRepository) {
            this.$sessionRepository = sessionRepository;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // com.unity3d.ads.adplayer.ExposedFunction, o00O0Oo.o00O0O
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invoke(java.lang.Object[] r5, o00O0O0O.OooO0OO r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$setPrivacyFsm$1$invoke$1
                if (r0 == 0) goto L13
                r0 = r6
                com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$setPrivacyFsm$1$invoke$1 r0 = (com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$setPrivacyFsm$1$invoke$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$setPrivacyFsm$1$invoke$1 r0 = new com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$setPrivacyFsm$1$invoke$1
                r0.<init>(r4, r6)
            L18:
                java.lang.Object r6 = r0.result
                o00O0O0o.OooOo00 r1 = o00O0O0o.OooOo00.f31365OooOo0O
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L2f
                if (r2 != r3) goto L27
                o00O0.o000OOo.OooOO0O(r6)
                goto L55
            L27:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L2f:
                o00O0.o000OOo.OooOO0O(r6)
                com.unity3d.ads.core.data.repository.SessionRepository r6 = r4.$sessionRepository
                r2 = 0
                r5 = r5[r2]
                java.lang.String r2 = "null cannot be cast to non-null type kotlin.String"
                kotlin.jvm.internal.OooOo.OooO0OO(r5, r2)
                java.lang.String r5 = (java.lang.String) r5
                r2 = 2
                byte[] r5 = android.util.Base64.decode(r5, r2)
                java.lang.String r2 = "decode(it[0] as String, Base64.NO_WRAP)"
                kotlin.jvm.internal.OooOo.OooO0Oo(r5, r2)
                com.google.protobuf.ByteString r5 = com.google.protobuf.kotlin.ByteStringsKt.toByteString(r5)
                r0.label = r3
                java.lang.Object r5 = r6.setPrivacyFsm(r5, r0)
                if (r5 != r1) goto L55
                return r1
            L55:
                oo00o.OooOo r5 = oo00o.OooOo.f33195OooO00o
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.C41721.invoke(java.lang.Object[], o00O0O0O.OooO0OO):java.lang.Object");
        }
    }

    public static final ExposedFunction attributionRegisterClick(final AndroidAttribution androidAttribution, final AdObject adObject) {
        OooOo.OooO0o0(androidAttribution, "androidAttribution");
        OooOo.OooO0o0(adObject, "adObject");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.attributionRegisterClick.1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, o00O0Oo.o00O0O
            public final Object invoke(Object[] objArr, OooO0OO oooO0OO) {
                AndroidAttribution androidAttribution2 = androidAttribution;
                Object obj = objArr[0];
                OooOo.OooO0OO(obj, "null cannot be cast to non-null type kotlin.String");
                return androidAttribution2.registerClick((String) obj, adObject, oooO0OO);
            }
        };
    }

    public static final ExposedFunction attributionRegisterView(final AndroidAttribution androidAttribution, final AdObject adObject) {
        OooOo.OooO0o0(androidAttribution, "androidAttribution");
        OooOo.OooO0o0(adObject, "adObject");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.attributionRegisterView.1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, o00O0Oo.o00O0O
            public final Object invoke(Object[] objArr, OooO0OO oooO0OO) {
                AndroidAttribution androidAttribution2 = androidAttribution;
                Object obj = objArr[0];
                OooOo.OooO0OO(obj, "null cannot be cast to non-null type kotlin.String");
                return androidAttribution2.registerView((String) obj, adObject, oooO0OO);
            }
        };
    }

    public static final ExposedFunction clearStorage() {
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.clearStorage.1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, o00O0Oo.o00O0O
            public final Object invoke(Object[] objArr, OooO0OO oooO0OO) throws Throwable {
                OooOOOO oooOOOO = new OooOOOO(OooO.OooOOOO(oooO0OO));
                Object obj = objArr[0];
                OooOo.OooO0OO(obj, "null cannot be cast to non-null type kotlin.String");
                Storage.clear((String) obj, new ContinuationFromCallback(oooOOOO));
                Object objOooO00o = oooOOOO.OooO00o();
                OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
                return objOooO00o;
            }
        };
    }

    public static final ExposedFunction deleteStorage() {
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.deleteStorage.1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, o00O0Oo.o00O0O
            public final Object invoke(Object[] objArr, OooO0OO oooO0OO) throws Throwable {
                OooOOOO oooOOOO = new OooOOOO(OooO.OooOOOO(oooO0OO));
                Object obj = objArr[0];
                OooOo.OooO0OO(obj, "null cannot be cast to non-null type kotlin.String");
                Object obj2 = objArr[1];
                OooOo.OooO0OO(obj2, "null cannot be cast to non-null type kotlin.String");
                Storage.delete((String) obj, (String) obj2, new ContinuationFromCallback(oooOOOO));
                Object objOooO00o = oooOOOO.OooO00o();
                OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
                return objOooO00o;
            }
        };
    }

    public static final ExposedFunction download(CacheFile cacheFile, AdObject adObject) {
        OooOo.OooO0o0(cacheFile, "cacheFile");
        OooOo.OooO0o0(adObject, "adObject");
        return new C41341(cacheFile, adObject);
    }

    /* renamed from: getAdContext-yLuu4LI, reason: not valid java name */
    public static final ExposedFunction m13779getAdContextyLuu4LI(AndroidGetAdPlayerContext getAndroidAdPlayerContext, String adData, String impressionConfig, String adDataRefreshToken, IsOMActivated isOMActivated, AdObject adObject) {
        OooOo.OooO0o0(getAndroidAdPlayerContext, "getAndroidAdPlayerContext");
        OooOo.OooO0o0(adData, "adData");
        OooOo.OooO0o0(impressionConfig, "impressionConfig");
        OooOo.OooO0o0(adDataRefreshToken, "adDataRefreshToken");
        OooOo.OooO0o0(isOMActivated, "isOMActivated");
        OooOo.OooO0o0(adObject, "adObject");
        return new CommonAdViewerExposedFunctionsKt$getAdContext$1(adData, impressionConfig, adDataRefreshToken, getAndroidAdPlayerContext, adObject, isOMActivated);
    }

    public static final ExposedFunction getAllowedPii(final DeviceInfoRepository deviceInfoRepository) {
        OooOo.OooO0o0(deviceInfoRepository, "deviceInfoRepository");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.getAllowedPii.1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, o00O0Oo.o00O0O
            public final Object invoke(Object[] objArr, OooO0OO oooO0OO) {
                String strEncodeToString = Base64.encodeToString(((AllowedPiiOuterClass.AllowedPii) ((oO00000o) deviceInfoRepository.getAllowedPii()).getValue()).toByteArray(), 2);
                OooOo.OooO0Oo(strEncodeToString, "encodeToString(deviceInf…eArray(), Base64.NO_WRAP)");
                return strEncodeToString;
            }
        };
    }

    public static final ExposedFunction getConnectionType(final DeviceInfoRepository deviceInfoRepository) {
        OooOo.OooO0o0(deviceInfoRepository, "deviceInfoRepository");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.getConnectionType.1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, o00O0Oo.o00O0O
            public final Object invoke(Object[] objArr, OooO0OO oooO0OO) {
                DynamicDeviceInfoOuterClass.ConnectionType connectionType = deviceInfoRepository.getDynamicDeviceInfo().getConnectionType();
                OooOo.OooO0Oo(connectionType, "deviceInfoRepository.dyn…DeviceInfo.connectionType");
                return connectionType;
            }
        };
    }

    public static final ExposedFunction getDeviceMaxVolume(final DeviceInfoRepository deviceInfoRepository) {
        OooOo.OooO0o0(deviceInfoRepository, "deviceInfoRepository");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.getDeviceMaxVolume.1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, o00O0Oo.o00O0O
            public final Object invoke(Object[] objArr, OooO0OO oooO0OO) {
                return new Double(deviceInfoRepository.getDynamicDeviceInfo().getAndroid().getMaxVolume());
            }
        };
    }

    public static final ExposedFunction getDeviceVolume(final DeviceInfoRepository deviceInfoRepository) {
        OooOo.OooO0o0(deviceInfoRepository, "deviceInfoRepository");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.getDeviceVolume.1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, o00O0Oo.o00O0O
            public final Object invoke(Object[] objArr, OooO0OO oooO0OO) {
                return new Double(deviceInfoRepository.getDynamicDeviceInfo().getAndroid().getVolume());
            }
        };
    }

    public static final ExposedFunction getKeysStorage() {
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.getKeysStorage.1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, o00O0Oo.o00O0O
            public final Object invoke(Object[] objArr, OooO0OO oooO0OO) throws Throwable {
                OooOOOO oooOOOO = new OooOOOO(OooO.OooOOOO(oooO0OO));
                Object obj = objArr[0];
                OooOo.OooO0OO(obj, "null cannot be cast to non-null type kotlin.String");
                Object obj2 = objArr[1];
                OooOo.OooO0OO(obj2, "null cannot be cast to non-null type kotlin.String");
                Object obj3 = objArr[2];
                OooOo.OooO0OO(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                Storage.getKeys((String) obj, (String) obj2, (Boolean) obj3, new ContinuationFromCallback(oooOOOO));
                Object objOooO00o = oooOOOO.OooO00o();
                OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
                return objOooO00o;
            }
        };
    }

    public static final ExposedFunction getPrivacy(SessionRepository sessionRepository) {
        OooOo.OooO0o0(sessionRepository, "sessionRepository");
        return new C41401(sessionRepository);
    }

    public static final ExposedFunction getPrivacyFsm(SessionRepository sessionRepository) {
        OooOo.OooO0o0(sessionRepository, "sessionRepository");
        return new C41411(sessionRepository);
    }

    public static final ExposedFunction getScreenHeight(final DeviceInfoRepository deviceInfoRepository) {
        OooOo.OooO0o0(deviceInfoRepository, "deviceInfoRepository");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.getScreenHeight.1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, o00O0Oo.o00O0O
            public final Object invoke(Object[] objArr, OooO0OO oooO0OO) {
                return new Integer(deviceInfoRepository.getDynamicDeviceInfo().getScreenHeight());
            }
        };
    }

    public static final ExposedFunction getScreenWidth(final DeviceInfoRepository deviceInfoRepository) {
        OooOo.OooO0o0(deviceInfoRepository, "deviceInfoRepository");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.getScreenWidth.1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, o00O0Oo.o00O0O
            public final Object invoke(Object[] objArr, OooO0OO oooO0OO) {
                return new Integer(deviceInfoRepository.getDynamicDeviceInfo().getScreenWidth());
            }
        };
    }

    public static final ExposedFunction getSessionToken(final SessionRepository sessionRepository) {
        OooOo.OooO0o0(sessionRepository, "sessionRepository");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.getSessionToken.1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, o00O0Oo.o00O0O
            public final Object invoke(Object[] objArr, OooO0OO oooO0OO) {
                return ProtobufExtensionsKt.toBase64$default(sessionRepository.getSessionToken(), false, 1, null);
            }
        };
    }

    public static final ExposedFunction getStorage() {
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.getStorage.1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, o00O0Oo.o00O0O
            public final Object invoke(Object[] objArr, OooO0OO oooO0OO) throws Throwable {
                OooOOOO oooOOOO = new OooOOOO(OooO.OooOOOO(oooO0OO));
                Object obj = objArr[0];
                OooOo.OooO0OO(obj, "null cannot be cast to non-null type kotlin.String");
                Object obj2 = objArr[1];
                OooOo.OooO0OO(obj2, "null cannot be cast to non-null type kotlin.String");
                Storage.get((String) obj, (String) obj2, new ContinuationFromCallback(oooOOOO));
                Object objOooO00o = oooOOOO.OooO00o();
                OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
                return objOooO00o;
            }
        };
    }

    public static final ExposedFunction hbTokenIncrementStarts(final SessionRepository sessionRepository) {
        OooOo.OooO0o0(sessionRepository, "sessionRepository");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.hbTokenIncrementStarts.1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, o00O0Oo.o00O0O
            public final Object invoke(Object[] objArr, OooO0OO oooO0OO) {
                sessionRepository.incrementTokenStartsCount();
                return oo00o.OooOo.f33195OooO00o;
            }
        };
    }

    public static final ExposedFunction hbTokenIncrementWins(final SessionRepository sessionRepository) {
        OooOo.OooO0o0(sessionRepository, "sessionRepository");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.hbTokenIncrementWins.1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, o00O0Oo.o00O0O
            public final Object invoke(Object[] objArr, OooO0OO oooO0OO) {
                sessionRepository.incrementTokenWinsCount();
                return oo00o.OooOo.f33195OooO00o;
            }
        };
    }

    public static final ExposedFunction hbTokenReset(final SessionRepository sessionRepository) {
        OooOo.OooO0o0(sessionRepository, "sessionRepository");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.hbTokenReset.1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, o00O0Oo.o00O0O
            public final Object invoke(Object[] objArr, OooO0OO oooO0OO) {
                sessionRepository.resetTokenCounters();
                return oo00o.OooOo.f33195OooO00o;
            }
        };
    }

    public static final ExposedFunction incrementBannerImpressionCount(final SessionRepository sessionRepository) {
        OooOo.OooO0o0(sessionRepository, "sessionRepository");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.incrementBannerImpressionCount.1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, o00O0Oo.o00O0O
            public final Object invoke(Object[] objArr, OooO0OO oooO0OO) {
                sessionRepository.incrementBannerImpressionCount();
                return oo00o.OooOo.f33195OooO00o;
            }
        };
    }

    public static final ExposedFunction isAttributionAvailable(final AndroidAttribution androidAttribution) {
        OooOo.OooO0o0(androidAttribution, "androidAttribution");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.isAttributionAvailable.1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, o00O0Oo.o00O0O
            public final Object invoke(Object[] objArr, OooO0OO oooO0OO) {
                return androidAttribution.isAvailable(oooO0OO);
            }
        };
    }

    public static final ExposedFunction isFileCached(final GetIsFileCache getIfFileCache) {
        OooOo.OooO0o0(getIfFileCache, "getIfFileCache");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.isFileCached.1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, o00O0Oo.o00O0O
            public final Object invoke(Object[] objArr, OooO0OO oooO0OO) {
                Object obj = objArr[0];
                OooOo.OooO0OO(obj, "null cannot be cast to non-null type kotlin.String");
                return getIfFileCache.invoke((String) obj, oooO0OO);
            }
        };
    }

    public static final ExposedFunction isOfferwallAdReady(final GetIsOfferwallAdReady getIsOfferwallAdReady) {
        OooOo.OooO0o0(getIsOfferwallAdReady, "getIsOfferwallAdReady");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.isOfferwallAdReady.1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, o00O0Oo.o00O0O
            public final Object invoke(Object[] objArr, OooO0OO oooO0OO) {
                Object obj = objArr[0];
                OooOo.OooO0OO(obj, "null cannot be cast to non-null type org.json.JSONObject");
                String placementName = ((JSONObject) obj).optString("placementName");
                GetIsOfferwallAdReady getIsOfferwallAdReady2 = getIsOfferwallAdReady;
                OooOo.OooO0Oo(placementName, "placementName");
                return getIsOfferwallAdReady2.invoke(placementName, oooO0OO);
            }
        };
    }

    public static final ExposedFunction loadOfferwallAd(LoadOfferwallAd loadOfferwallAd, AdObject adObject) {
        OooOo.OooO0o0(loadOfferwallAd, "loadOfferwallAd");
        OooOo.OooO0o0(adObject, "adObject");
        return new C41531(adObject, loadOfferwallAd);
    }

    public static final ExposedFunction loadScarAd(LoadScarAd loadScarAd, AdObject adObject) {
        OooOo.OooO0o0(loadScarAd, "loadScarAd");
        OooOo.OooO0o0(adObject, "adObject");
        return new C41541(adObject, loadScarAd);
    }

    public static final ExposedFunction markCampaignStateShown(final CampaignRepository campaignRepository, final AdObject adObject) {
        OooOo.OooO0o0(campaignRepository, "campaignRepository");
        OooOo.OooO0o0(adObject, "adObject");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.markCampaignStateShown.1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, o00O0Oo.o00O0O
            public final Object invoke(Object[] objArr, OooO0OO oooO0OO) {
                campaignRepository.setShowTimestamp(adObject.getOpportunityId());
                return oo00o.OooOo.f33195OooO00o;
            }
        };
    }

    public static final ExposedFunction omFinishSession(OmFinishSession omFinishSession, AdObject adObject) {
        OooOo.OooO0o0(omFinishSession, "omFinishSession");
        OooOo.OooO0o0(adObject, "adObject");
        return new C41561(omFinishSession, adObject);
    }

    public static final ExposedFunction omGetData(GetOmData getOmData) {
        OooOo.OooO0o0(getOmData, "getOmData");
        return new C41571(getOmData);
    }

    public static final ExposedFunction omImpression(OmImpressionOccurred omImpressionOccurred, AdObject adObject) {
        OooOo.OooO0o0(omImpressionOccurred, "omImpressionOccurred");
        OooOo.OooO0o0(adObject, "adObject");
        return new C41581(omImpressionOccurred, adObject);
    }

    public static final ExposedFunction omStartSession(AndroidOmStartSession omStartSession, AdObject adObject) {
        OooOo.OooO0o0(omStartSession, "omStartSession");
        OooOo.OooO0o0(adObject, "adObject");
        return new C41591(omStartSession, adObject);
    }

    public static final ExposedFunction openUrl(final HandleOpenUrl handleOpenUrl) {
        OooOo.OooO0o0(handleOpenUrl, "handleOpenUrl");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.openUrl.1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, o00O0Oo.o00O0O
            public final Object invoke(Object[] objArr, OooO0OO oooO0OO) {
                Object obj = objArr[0];
                OooOo.OooO0OO(obj, "null cannot be cast to non-null type kotlin.String");
                String str = (String) obj;
                Object objO000oOoO = OooOOO.o000oOoO(1, objArr);
                JSONObject jSONObject = objO000oOoO instanceof JSONObject ? (JSONObject) objO000oOoO : null;
                handleOpenUrl.invoke(str, jSONObject != null ? jSONObject.optString(HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME) : null);
                return oo00o.OooOo.f33195OooO00o;
            }
        };
    }

    public static final ExposedFunction readStorage() {
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.readStorage.1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, o00O0Oo.o00O0O
            public final Object invoke(Object[] objArr, OooO0OO oooO0OO) throws Throwable {
                OooOOOO oooOOOO = new OooOOOO(OooO.OooOOOO(oooO0OO));
                Object obj = objArr[0];
                OooOo.OooO0OO(obj, "null cannot be cast to non-null type kotlin.String");
                Storage.read((String) obj, new ContinuationFromCallback(oooOOOO));
                Object objOooO00o = oooOOOO.OooO00o();
                OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
                return objOooO00o;
            }
        };
    }

    public static final ExposedFunction refreshAdData(Refresh refresh, AdObject adObject) {
        OooOo.OooO0o0(refresh, "refresh");
        OooOo.OooO0o0(adObject, "adObject");
        return new C41621(refresh, adObject);
    }

    public static final ExposedFunction request(RequestType type, ExecuteAdViewerRequest executeAdViewerRequest) {
        OooOo.OooO0o0(type, "type");
        OooOo.OooO0o0(executeAdViewerRequest, "executeAdViewerRequest");
        return new C41631(executeAdViewerRequest, type);
    }

    public static final ExposedFunction sendDiagnosticEvent(final SendDiagnosticEvent sendDiagnosticEvent, final AdObject adObject) {
        OooOo.OooO0o0(sendDiagnosticEvent, "sendDiagnosticEvent");
        OooOo.OooO0o0(adObject, "adObject");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.sendDiagnosticEvent.1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, o00O0Oo.o00O0O
            public final Object invoke(Object[] objArr, OooO0OO oooO0OO) {
                String string;
                Object obj = objArr[0];
                OooOo.OooO0OO(obj, "null cannot be cast to non-null type kotlin.String");
                String str = (String) obj;
                Object obj2 = objArr[1];
                OooOo.OooO0OO(obj2, "null cannot be cast to non-null type org.json.JSONObject");
                JSONObject jSONObject = (JSONObject) obj2;
                OooOO0 oooOO0OooOOO0 = o0O0O00.OooOOO0();
                Iterator<String> itKeys = jSONObject.keys();
                OooOo.OooO0Oo(itKeys, "tags.keys()");
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    oooOO0OooOOO0.put(next, jSONObject.getString(next));
                }
                OooOO0 oooOO0OooOO0o = o0O0O00.OooOO0o(oooOO0OooOOO0);
                Object objO000oOoO = OooOOO.o000oOoO(2, objArr);
                SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, str, (objO000oOoO == null || (string = objO000oOoO.toString()) == null) ? null : new Double(Double.parseDouble(string)), oooOO0OooOO0o, null, adObject, null, 40, null);
                return oo00o.OooOo.f33195OooO00o;
            }
        };
    }

    public static final ExposedFunction sendOperativeEvent(GetOperativeEventApi getOperativeEventApi, AdObject adObject) {
        OooOo.OooO0o0(getOperativeEventApi, "getOperativeEventApi");
        OooOo.OooO0o0(adObject, "adObject");
        return new C41651(getOperativeEventApi, adObject);
    }

    public static final ExposedFunction sendPrivacyUpdateRequest(SendPrivacyUpdateRequest sendPrivacyUpdateRequest) {
        OooOo.OooO0o0(sendPrivacyUpdateRequest, "sendPrivacyUpdateRequest");
        return new C41661(sendPrivacyUpdateRequest);
    }

    public static final ExposedFunction setAllowedPii(final DeviceInfoRepository deviceInfoRepository) {
        OooOo.OooO0o0(deviceInfoRepository, "deviceInfoRepository");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.setAllowedPii.1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, o00O0Oo.o00O0O
            public final Object invoke(Object[] objArr, OooO0OO oooO0OO) {
                oO00000o oo00000o;
                Object value;
                final AllowedPiiKt.Dsl dsl_create;
                Object obj = objArr[0];
                OooOo.OooO0OO(obj, "null cannot be cast to non-null type org.json.JSONObject");
                JSONObject jSONObject = (JSONObject) obj;
                o0OO allowedPii = deviceInfoRepository.getAllowedPii();
                do {
                    oo00000o = (oO00000o) allowedPii;
                    value = oo00000o.getValue();
                    AllowedPiiKt.Dsl.Companion companion = AllowedPiiKt.Dsl.Companion;
                    AllowedPiiOuterClass.AllowedPii.Builder builder = ((AllowedPiiOuterClass.AllowedPii) value).toBuilder();
                    OooOo.OooO0Oo(builder, "this.toBuilder()");
                    dsl_create = companion._create(builder);
                    new o000oOoO(dsl_create) { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$setAllowedPii$1$1$1$2
                        @Override // o00O0o0o.o000000O
                        public Object get() {
                            return Boolean.valueOf(((AllowedPiiKt.Dsl) this.receiver).getIdfa());
                        }

                        @Override // o00O0o0o.o0O0O00
                        public void set(Object obj2) {
                            ((AllowedPiiKt.Dsl) this.receiver).setIdfa(((Boolean) obj2).booleanValue());
                        }
                    }.set(Boolean.valueOf(jSONObject.optBoolean("idfa")));
                    new o000oOoO(dsl_create) { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$setAllowedPii$1$1$1$4
                        @Override // o00O0o0o.o000000O
                        public Object get() {
                            return Boolean.valueOf(((AllowedPiiKt.Dsl) this.receiver).getIdfv());
                        }

                        @Override // o00O0o0o.o0O0O00
                        public void set(Object obj2) {
                            ((AllowedPiiKt.Dsl) this.receiver).setIdfv(((Boolean) obj2).booleanValue());
                        }
                    }.set(Boolean.valueOf(jSONObject.optBoolean("idfv")));
                } while (!oo00000o.OooO0oO(value, dsl_create._build()));
                return oo00o.OooOo.f33195OooO00o;
            }
        };
    }

    public static final ExposedFunction setOpportunityTTL(final AdObject adObject) {
        OooOo.OooO0o0(adObject, "adObject");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.setOpportunityTTL.1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, o00O0Oo.o00O0O
            public final Object invoke(Object[] objArr, OooO0OO oooO0OO) {
                Object obj = objArr[0];
                OooOo.OooO0OO(obj, "null cannot be cast to non-null type kotlin.Int");
                int iIntValue = ((Integer) obj).intValue();
                o0OO ttl = adObject.getTtl();
                int i = OooOO0O.f31462OooOoO0;
                OooOO0O oooOO0O = new OooOO0O(o00000.OooOO0o(iIntValue, o00O0oOO.OooOOO.f31467OooOoO0));
                oO00000o oo00000o = (oO00000o) ttl;
                oo00000o.getClass();
                oo00000o.OooO(null, oooOO0O);
                return oo00o.OooOo.f33195OooO00o;
            }
        };
    }

    public static final ExposedFunction setOrientation(AdObject adObject) {
        OooOo.OooO0o0(adObject, "adObject");
        return new C41701(adObject);
    }

    public static final ExposedFunction setPrivacy(SessionRepository sessionRepository) {
        OooOo.OooO0o0(sessionRepository, "sessionRepository");
        return new C41711(sessionRepository);
    }

    public static final ExposedFunction setPrivacyFsm(SessionRepository sessionRepository) {
        OooOo.OooO0o0(sessionRepository, "sessionRepository");
        return new C41721(sessionRepository);
    }

    public static final ExposedFunction setStorage() {
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.setStorage.1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, o00O0Oo.o00O0O
            public final Object invoke(Object[] objArr, OooO0OO oooO0OO) throws Throwable {
                OooOOOO oooOOOO = new OooOOOO(OooO.OooOOOO(oooO0OO));
                Object obj = objArr[0];
                OooOo.OooO0OO(obj, "null cannot be cast to non-null type kotlin.String");
                Object obj2 = objArr[1];
                OooOo.OooO0OO(obj2, "null cannot be cast to non-null type kotlin.String");
                Storage.set((String) obj, (String) obj2, objArr[2], new ContinuationFromCallback(oooOOOO));
                Object objOooO00o = oooOOOO.OooO00o();
                OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
                return objOooO00o;
            }
        };
    }

    public static final ExposedFunction showOfferwallAd() {
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.showOfferwallAd.1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, o00O0Oo.o00O0O
            public final Object invoke(Object[] objArr, OooO0OO oooO0OO) {
                return oo00o.OooOo.f33195OooO00o;
            }
        };
    }

    public static final ExposedFunction showScarAd() {
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.showScarAd.1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, o00O0Oo.o00O0O
            public final Object invoke(Object[] objArr, OooO0OO oooO0OO) {
                return oo00o.OooOo.f33195OooO00o;
            }
        };
    }

    public static final ExposedFunction updateCampaignState(final CampaignRepository campaignRepository, final AdObject adObject) {
        OooOo.OooO0o0(campaignRepository, "campaignRepository");
        OooOo.OooO0o0(adObject, "adObject");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.updateCampaignState.1
            /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
            @Override // com.unity3d.ads.adplayer.ExposedFunction, o00O0Oo.o00O0O
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invoke(java.lang.Object[] r7, o00O0O0O.OooO0OO r8) {
                /*
                    r6 = this;
                    java.lang.String r8 = "<this>"
                    kotlin.jvm.internal.OooOo.OooO0o0(r7, r8)
                    int r8 = r7.length
                    r0 = 0
                    r1 = 0
                    if (r8 != 0) goto Lc
                    r7 = r1
                    goto Le
                Lc:
                    r7 = r7[r0]
                Le:
                    boolean r8 = r7 instanceof org.json.JSONObject
                    if (r8 == 0) goto L15
                    org.json.JSONObject r7 = (org.json.JSONObject) r7
                    goto L16
                L15:
                    r7 = r1
                L16:
                    if (r7 == 0) goto Lb3
                    java.lang.String r8 = "data"
                    java.lang.String r2 = r7.optString(r8)
                    r3 = 1
                    if (r2 == 0) goto L2a
                    boolean r4 = o00O0oO.o000000.OoooOO0(r2)
                    if (r4 == 0) goto L28
                    goto L2a
                L28:
                    r4 = r0
                    goto L2b
                L2a:
                    r4 = r3
                L2b:
                    if (r4 != 0) goto Lab
                    java.lang.String r4 = "dataVersion"
                    int r7 = r7.optInt(r4)
                    if (r7 == 0) goto La3
                    com.unity3d.ads.core.data.model.AdObject r4 = r1
                    com.google.protobuf.ByteString r4 = r4.getOpportunityId()
                    com.unity3d.ads.core.data.model.AdObject r5 = r1
                    java.lang.String r5 = r5.getPlacementId()
                    kotlin.jvm.internal.OooOo.OooO0Oo(r2, r8)
                    com.google.protobuf.ByteString r8 = com.unity3d.ads.core.extensions.ProtobufExtensionsKt.fromBase64$default(r2, r0, r3, r1)
                    boolean r0 = r8.isEmpty()
                    if (r0 != 0) goto L9b
                    com.unity3d.ads.core.data.repository.CampaignRepository r0 = r2
                    gatewayprotocol.v1.CampaignStateOuterClass$Campaign r0 = r0.getCampaign(r4)
                    if (r0 == 0) goto L74
                    gatewayprotocol.v1.CampaignKt$Dsl$Companion r1 = gatewayprotocol.v1.CampaignKt.Dsl.Companion
                    com.google.protobuf.GeneratedMessageLite$Builder r0 = r0.toBuilder()
                    java.lang.String r2 = "this.toBuilder()"
                    kotlin.jvm.internal.OooOo.OooO0Oo(r0, r2)
                    gatewayprotocol.v1.CampaignStateOuterClass$Campaign$Builder r0 = (gatewayprotocol.v1.CampaignStateOuterClass.Campaign.Builder) r0
                    gatewayprotocol.v1.CampaignKt$Dsl r0 = r1._create(r0)
                    r0.setData(r8)
                    r0.setDataVersion(r7)
                    gatewayprotocol.v1.CampaignStateOuterClass$Campaign r0 = r0._build()
                    if (r0 == 0) goto L74
                    goto L93
                L74:
                    gatewayprotocol.v1.CampaignKt$Dsl$Companion r0 = gatewayprotocol.v1.CampaignKt.Dsl.Companion
                    gatewayprotocol.v1.CampaignStateOuterClass$Campaign$Builder r1 = gatewayprotocol.v1.CampaignStateOuterClass.Campaign.newBuilder()
                    java.lang.String r2 = "newBuilder()"
                    kotlin.jvm.internal.OooOo.OooO0Oo(r1, r2)
                    gatewayprotocol.v1.CampaignKt$Dsl r0 = r0._create(r1)
                    r0.setData(r8)
                    r0.setDataVersion(r7)
                    r0.setPlacementId(r5)
                    r0.setImpressionOpportunityId(r4)
                    gatewayprotocol.v1.CampaignStateOuterClass$Campaign r0 = r0._build()
                L93:
                    com.unity3d.ads.core.data.repository.CampaignRepository r7 = r2
                    r7.setCampaign(r4, r0)
                    oo00o.OooOo r7 = oo00o.OooOo.f33195OooO00o
                    return r7
                L9b:
                    java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
                    java.lang.String r8 = "Update campaign state requires a non-empty data byte string"
                    r7.<init>(r8)
                    throw r7
                La3:
                    java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
                    java.lang.String r8 = "Update campaign state requires a dataVersion integer"
                    r7.<init>(r8)
                    throw r7
                Lab:
                    java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
                    java.lang.String r8 = "Update campaign state requires a data string"
                    r7.<init>(r8)
                    throw r7
                Lb3:
                    java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
                    java.lang.String r8 = "Update campaign state requires a JSONObject"
                    r7.<init>(r8)
                    throw r7
                */
                throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.C41761.invoke(java.lang.Object[], o00O0O0O.OooO0OO):java.lang.Object");
            }
        };
    }

    public static final ExposedFunction updateTrackingToken(final AdObject adObject) {
        OooOo.OooO0o0(adObject, "adObject");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.updateTrackingToken.1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, o00O0Oo.o00O0O
            public final Object invoke(Object[] objArr, OooO0OO oooO0OO) {
                Object obj = objArr[0];
                OooOo.OooO0OO(obj, "null cannot be cast to non-null type org.json.JSONObject");
                String token = ((JSONObject) obj).optString(HandleInvocationsFromAdViewer.KEY_TRACKING_TOKEN);
                if (token != null && token.length() != 0) {
                    AdObject adObject2 = adObject;
                    OooOo.OooO0Oo(token, "token");
                    adObject2.setTrackingToken(ProtobufExtensionsKt.fromBase64$default(token, false, 1, null));
                }
                return oo00o.OooOo.f33195OooO00o;
            }
        };
    }

    public static final ExposedFunction writeStorage() {
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.writeStorage.1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, o00O0Oo.o00O0O
            public final Object invoke(Object[] objArr, OooO0OO oooO0OO) throws Throwable {
                OooOOOO oooOOOO = new OooOOOO(OooO.OooOOOO(oooO0OO));
                Object obj = objArr[0];
                OooOo.OooO0OO(obj, "null cannot be cast to non-null type kotlin.String");
                Storage.write((String) obj, new ContinuationFromCallback(oooOOOO));
                Object objOooO00o = oooOOOO.OooO00o();
                OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
                return objOooO00o;
            }
        };
    }
}
