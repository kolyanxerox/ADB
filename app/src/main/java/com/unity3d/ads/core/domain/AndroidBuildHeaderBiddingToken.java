package com.unity3d.ads.core.domain;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.ads.core.data.manager.OfferwallManager;
import com.unity3d.ads.core.data.repository.CampaignRepository;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.data.repository.TcfRepository;
import kotlin.jvm.internal.OooOo;
import o00O0OO0.OooO;
import o00O0OO0.OooO0OO;
import org.apache.tika.pipes.PipesConfigBase;

/* loaded from: classes3.dex */
public final class AndroidBuildHeaderBiddingToken implements BuildHeaderBiddingToken {
    private final CampaignRepository campaignRepository;
    private final DeviceInfoRepository deviceInfoRepository;
    private final GetByteStringId generateId;
    private final GetClientInfo getClientInfo;
    private final GetInitializationData getInitializationData;
    private final GetLimitedSessionToken getLimitedSessionToken;
    private final GetSharedDataTimestamps getTimestamps;
    private final OfferwallManager offerwallManager;
    private final SessionRepository sessionRepository;
    private final TcfRepository tcfRepository;
    private final AndroidTestDataInfo testDataInfo;

    @OooO(m13471c = "com.unity3d.ads.core.domain.AndroidBuildHeaderBiddingToken", m13472f = "AndroidBuildHeaderBiddingToken.kt", m13473l = {40, 52, 57, PipesConfigBase.DEFAULT_STALE_FETCHER_DELAY_SECONDS, IronSourceConstants.RETRY_LIMIT}, m13474m = "invoke")
    /* renamed from: com.unity3d.ads.core.domain.AndroidBuildHeaderBiddingToken$invoke$1 */
    public static final class C40551 extends OooO0OO {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public C40551(o00O0O0O.OooO0OO oooO0OO) {
            super(oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidBuildHeaderBiddingToken.this.invoke(0, null, false, this);
        }
    }

    public AndroidBuildHeaderBiddingToken(GetByteStringId generateId, GetClientInfo getClientInfo, GetSharedDataTimestamps getTimestamps, GetLimitedSessionToken getLimitedSessionToken, GetInitializationData getInitializationData, DeviceInfoRepository deviceInfoRepository, SessionRepository sessionRepository, CampaignRepository campaignRepository, TcfRepository tcfRepository, AndroidTestDataInfo testDataInfo, OfferwallManager offerwallManager) {
        OooOo.OooO0o0(generateId, "generateId");
        OooOo.OooO0o0(getClientInfo, "getClientInfo");
        OooOo.OooO0o0(getTimestamps, "getTimestamps");
        OooOo.OooO0o0(getLimitedSessionToken, "getLimitedSessionToken");
        OooOo.OooO0o0(getInitializationData, "getInitializationData");
        OooOo.OooO0o0(deviceInfoRepository, "deviceInfoRepository");
        OooOo.OooO0o0(sessionRepository, "sessionRepository");
        OooOo.OooO0o0(campaignRepository, "campaignRepository");
        OooOo.OooO0o0(tcfRepository, "tcfRepository");
        OooOo.OooO0o0(testDataInfo, "testDataInfo");
        OooOo.OooO0o0(offerwallManager, "offerwallManager");
        this.generateId = generateId;
        this.getClientInfo = getClientInfo;
        this.getTimestamps = getTimestamps;
        this.getLimitedSessionToken = getLimitedSessionToken;
        this.getInitializationData = getInitializationData;
        this.deviceInfoRepository = deviceInfoRepository;
        this.sessionRepository = sessionRepository;
        this.campaignRepository = campaignRepository;
        this.tcfRepository = tcfRepository;
        this.testDataInfo = testDataInfo;
        this.offerwallManager = offerwallManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // com.unity3d.ads.core.domain.BuildHeaderBiddingToken
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object invoke(int r18, com.unity3d.ads.TokenConfiguration r19, boolean r20, o00O0O0O.OooO0OO r21) {
        /*
            Method dump skipped, instructions count: 631
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidBuildHeaderBiddingToken.invoke(int, com.unity3d.ads.TokenConfiguration, boolean, o00O0O0O.OooO0OO):java.lang.Object");
    }
}
