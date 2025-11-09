package com.unity3d.ads.core.domain.scar;

import com.google.android.gms.internal.measurement.o0OO0O0;
import com.google.protobuf.ByteString;
import com.ironsource.mediationsdk.metadata.C3401a;
import com.unity3d.ads.TokenConfiguration;
import com.unity3d.ads.core.data.manager.ScarManager;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.extensions.AdFormatExtensions;
import gatewayprotocol.p014v1.InitializationResponseOuterClass;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import o00O0.oo000o;
import o00O0O0O.OooO0OO;
import o00O0OO0.OooO;
import o00O0OO0.OooOOOO;
import o00O0Oo.o00O0O;
import o00O0oOo.o0000OO0;
import o00O0oOo.o000OO;
import oo00o.OooOo;

/* loaded from: classes3.dex */
public final class AndroidFetchSignalsAndSendUseCase implements FetchSignalsAndSendUseCase {
    private final HandleGetTokenRequest handleGetTokenRequest;
    private final ScarManager scarManager;
    private final o000OO scope;
    private final SendDiagnosticEvent sendDiagnosticEvent;
    private final SessionRepository sessionRepository;

    @OooO(m13471c = "com.unity3d.ads.core.domain.scar.AndroidFetchSignalsAndSendUseCase$invoke$2", m13472f = "AndroidFetchSignalsAndSendUseCase.kt", m13473l = {36, 56}, m13474m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.core.domain.scar.AndroidFetchSignalsAndSendUseCase$invoke$2 */
    public static final class C41832 extends OooOOOO implements o00O0O {
        final /* synthetic */ TokenConfiguration $tokenConfiguration;
        final /* synthetic */ ByteString $tokenId;
        final /* synthetic */ int $tokenNumber;
        long J$0;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41832(TokenConfiguration tokenConfiguration, int i, ByteString byteString, OooO0OO oooO0OO) {
            super(2, oooO0OO);
            this.$tokenConfiguration = tokenConfiguration;
            this.$tokenNumber = i;
            this.$tokenId = byteString;
        }

        @Override // o00O0OO0.OooO00o
        public final OooO0OO create(Object obj, OooO0OO oooO0OO) {
            C41832 c41832 = AndroidFetchSignalsAndSendUseCase.this.new C41832(this.$tokenConfiguration, this.$tokenNumber, this.$tokenId, oooO0OO);
            c41832.L$0 = obj;
            return c41832;
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x0080  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0085  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x0089  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00b9  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x00f3  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x00f7  */
        @Override // o00O0OO0.OooO00o
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r19) {
            /*
                Method dump skipped, instructions count: 292
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.scar.AndroidFetchSignalsAndSendUseCase.C41832.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // o00O0Oo.o00O0O
        public final Object invoke(o000OO o000oo2, OooO0OO oooO0OO) {
            return ((C41832) create(o000oo2, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
        }
    }

    public AndroidFetchSignalsAndSendUseCase(o000OO scope, SessionRepository sessionRepository, ScarManager scarManager, HandleGetTokenRequest handleGetTokenRequest, SendDiagnosticEvent sendDiagnosticEvent) {
        kotlin.jvm.internal.OooOo.OooO0o0(scope, "scope");
        kotlin.jvm.internal.OooOo.OooO0o0(sessionRepository, "sessionRepository");
        kotlin.jvm.internal.OooOo.OooO0o0(scarManager, "scarManager");
        kotlin.jvm.internal.OooOo.OooO0o0(handleGetTokenRequest, "handleGetTokenRequest");
        kotlin.jvm.internal.OooOo.OooO0o0(sendDiagnosticEvent, "sendDiagnosticEvent");
        this.scope = scope;
        this.sessionRepository = sessionRepository;
        this.scarManager = scarManager;
        this.handleGetTokenRequest = handleGetTokenRequest;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<InitializationResponseOuterClass.AdFormat> getRequestedSignalFormats(TokenConfiguration tokenConfiguration) {
        if (tokenConfiguration == null) {
            return this.sessionRepository.getScarEligibleFormats();
        }
        InitializationResponseOuterClass.AdFormat protoAdFormat = AdFormatExtensions.toProtoAdFormat(tokenConfiguration.getAdFormat());
        if (!this.sessionRepository.getScarEligibleFormats().contains(protoAdFormat)) {
            protoAdFormat = null;
        }
        return protoAdFormat != null ? o0OO0O0.OooOO0o(protoAdFormat) : oo000o.f31251OooOo0O;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<String, String> getTags() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List<InitializationResponseOuterClass.AdFormat> scarEligibleFormats = this.sessionRepository.getScarEligibleFormats();
        if (scarEligibleFormats.contains(InitializationResponseOuterClass.AdFormat.AD_FORMAT_BANNER)) {
            linkedHashMap.put("banner", C3401a.f9920g);
        }
        if (scarEligibleFormats.contains(InitializationResponseOuterClass.AdFormat.AD_FORMAT_REWARDED)) {
            linkedHashMap.put("rewarded", C3401a.f9920g);
        }
        if (scarEligibleFormats.contains(InitializationResponseOuterClass.AdFormat.AD_FORMAT_INTERSTITIAL)) {
            linkedHashMap.put("interstitial", C3401a.f9920g);
        }
        return linkedHashMap;
    }

    @Override // com.unity3d.ads.core.domain.scar.FetchSignalsAndSendUseCase
    public Object invoke(int i, ByteString byteString, TokenConfiguration tokenConfiguration, OooO0OO oooO0OO) {
        o0000OO0.OooOo0(this.scope, null, new C41832(tokenConfiguration, i, byteString, null), 3);
        return OooOo.f33195OooO00o;
    }
}
