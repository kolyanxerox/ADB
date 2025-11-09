package androidx.privacysandbox.ads.adservices.customaudience;

import Oooo0o0.OooO;
import android.adservices.common.AdData;
import android.adservices.customaudience.CustomAudience;
import androidx.core.os.OutcomeReceiverKt;
import androidx.privacysandbox.ads.adservices.common.AdSelectionSignals;
import androidx.privacysandbox.ads.adservices.internal.AdServicesInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.OooOO0O;
import o00O0O0O.OooO0OO;
import o00O0O0o.OooOo00;
import o00O0oOo.oo0o0Oo;
import oo00o.OooOo;

/* loaded from: classes.dex */
public class CustomAudienceManagerImplCommon extends CustomAudienceManager {
    private final android.adservices.customaudience.CustomAudienceManager customAudienceManager;

    public static final class Ext10Impl {
        public static final Companion Companion = new Companion(null);

        public static final class Companion {
            public /* synthetic */ Companion(OooOO0O oooOO0O) {
                this();
            }

            public final Object fetchAndJoinCustomAudience(android.adservices.customaudience.CustomAudienceManager customAudienceManager, FetchAndJoinCustomAudienceRequest fetchAndJoinCustomAudienceRequest, OooO0OO oooO0OO) {
                oo0o0Oo oo0o0oo = new oo0o0Oo(1, OooO.OooOOOO(oooO0OO));
                oo0o0oo.OooOOo0();
                customAudienceManager.fetchAndJoinCustomAudience(fetchAndJoinCustomAudienceRequest.convertToAdServices$ads_adservices_release(), new androidx.arch.core.executor.OooO00o(2), OutcomeReceiverKt.asOutcomeReceiver(oo0o0oo));
                Object objOooOOOo = oo0o0oo.OooOOOo();
                return objOooOOOo == OooOo00.f31365OooOo0O ? objOooOOOo : OooOo.f33195OooO00o;
            }

            private Companion() {
            }
        }

        private Ext10Impl() {
        }
    }

    public CustomAudienceManagerImplCommon(android.adservices.customaudience.CustomAudienceManager customAudienceManager) {
        kotlin.jvm.internal.OooOo.OooO0o0(customAudienceManager, "customAudienceManager");
        this.customAudienceManager = customAudienceManager;
    }

    private final List<AdData> convertAds(List<androidx.privacysandbox.ads.adservices.common.AdData> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<androidx.privacysandbox.ads.adservices.common.AdData> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().convertToAdServices$ads_adservices_release());
        }
        return arrayList;
    }

    private final android.adservices.customaudience.CustomAudience convertCustomAudience(CustomAudience customAudience) {
        CustomAudience.Builder trustedBiddingData = androidx.privacysandbox.ads.adservices.appsetid.OooO00o.OooO().setActivationTime(customAudience.getActivationTime()).setAds(convertAds(customAudience.getAds())).setBiddingLogicUri(customAudience.getBiddingLogicUri()).setBuyer(customAudience.getBuyer().convertToAdServices$ads_adservices_release()).setDailyUpdateUri(customAudience.getDailyUpdateUri()).setExpirationTime(customAudience.getExpirationTime()).setName(customAudience.getName()).setTrustedBiddingData(convertTrustedSignals(customAudience.getTrustedBiddingSignals()));
        AdSelectionSignals userBiddingSignals = customAudience.getUserBiddingSignals();
        android.adservices.customaudience.CustomAudience customAudienceBuild = trustedBiddingData.setUserBiddingSignals(userBiddingSignals != null ? userBiddingSignals.convertToAdServices$ads_adservices_release() : null).build();
        kotlin.jvm.internal.OooOo.OooO0Oo(customAudienceBuild, "Builder()\n            .s…s())\n            .build()");
        return customAudienceBuild;
    }

    public final android.adservices.customaudience.JoinCustomAudienceRequest convertJoinRequest(JoinCustomAudienceRequest joinCustomAudienceRequest) {
        android.adservices.customaudience.JoinCustomAudienceRequest joinCustomAudienceRequestBuild = androidx.privacysandbox.ads.adservices.appsetid.OooO00o.OooOo00().setCustomAudience(convertCustomAudience(joinCustomAudienceRequest.getCustomAudience())).build();
        kotlin.jvm.internal.OooOo.OooO0Oo(joinCustomAudienceRequestBuild, "Builder()\n            .s…ce))\n            .build()");
        return joinCustomAudienceRequestBuild;
    }

    public final android.adservices.customaudience.LeaveCustomAudienceRequest convertLeaveRequest(LeaveCustomAudienceRequest leaveCustomAudienceRequest) {
        android.adservices.customaudience.LeaveCustomAudienceRequest leaveCustomAudienceRequestBuild = androidx.privacysandbox.ads.adservices.appsetid.OooO00o.OooOo0().setBuyer(leaveCustomAudienceRequest.getBuyer().convertToAdServices$ads_adservices_release()).setName(leaveCustomAudienceRequest.getName()).build();
        kotlin.jvm.internal.OooOo.OooO0Oo(leaveCustomAudienceRequestBuild, "Builder()\n            .s…ame)\n            .build()");
        return leaveCustomAudienceRequestBuild;
    }

    private final android.adservices.customaudience.TrustedBiddingData convertTrustedSignals(TrustedBiddingData trustedBiddingData) {
        if (trustedBiddingData == null) {
            return null;
        }
        return androidx.privacysandbox.ads.adservices.appsetid.OooO00o.OooOoO0().setTrustedBiddingKeys(trustedBiddingData.getTrustedBiddingKeys()).setTrustedBiddingUri(trustedBiddingData.getTrustedBiddingUri()).build();
    }

    public static Object fetchAndJoinCustomAudience$suspendImpl(CustomAudienceManagerImplCommon customAudienceManagerImplCommon, FetchAndJoinCustomAudienceRequest fetchAndJoinCustomAudienceRequest, OooO0OO oooO0OO) {
        AdServicesInfo adServicesInfo = AdServicesInfo.INSTANCE;
        if (adServicesInfo.adServicesVersion() < 10 && adServicesInfo.extServicesVersionS() < 10) {
            throw new UnsupportedOperationException("API is not available. Min version is API 31 ext 10");
        }
        Object objFetchAndJoinCustomAudience = Ext10Impl.Companion.fetchAndJoinCustomAudience(customAudienceManagerImplCommon.customAudienceManager, fetchAndJoinCustomAudienceRequest, oooO0OO);
        return objFetchAndJoinCustomAudience == OooOo00.f31365OooOo0O ? objFetchAndJoinCustomAudience : OooOo.f33195OooO00o;
    }

    public static Object joinCustomAudience$suspendImpl(CustomAudienceManagerImplCommon customAudienceManagerImplCommon, JoinCustomAudienceRequest joinCustomAudienceRequest, OooO0OO oooO0OO) {
        oo0o0Oo oo0o0oo = new oo0o0Oo(1, OooO.OooOOOO(oooO0OO));
        oo0o0oo.OooOOo0();
        customAudienceManagerImplCommon.getCustomAudienceManager().joinCustomAudience(customAudienceManagerImplCommon.convertJoinRequest(joinCustomAudienceRequest), new androidx.arch.core.executor.OooO00o(2), OutcomeReceiverKt.asOutcomeReceiver(oo0o0oo));
        Object objOooOOOo = oo0o0oo.OooOOOo();
        return objOooOOOo == OooOo00.f31365OooOo0O ? objOooOOOo : OooOo.f33195OooO00o;
    }

    public static Object leaveCustomAudience$suspendImpl(CustomAudienceManagerImplCommon customAudienceManagerImplCommon, LeaveCustomAudienceRequest leaveCustomAudienceRequest, OooO0OO oooO0OO) {
        oo0o0Oo oo0o0oo = new oo0o0Oo(1, OooO.OooOOOO(oooO0OO));
        oo0o0oo.OooOOo0();
        customAudienceManagerImplCommon.getCustomAudienceManager().leaveCustomAudience(customAudienceManagerImplCommon.convertLeaveRequest(leaveCustomAudienceRequest), new androidx.arch.core.executor.OooO00o(2), OutcomeReceiverKt.asOutcomeReceiver(oo0o0oo));
        Object objOooOOOo = oo0o0oo.OooOOOo();
        return objOooOOOo == OooOo00.f31365OooOo0O ? objOooOOOo : OooOo.f33195OooO00o;
    }

    @Override // androidx.privacysandbox.ads.adservices.customaudience.CustomAudienceManager
    public Object fetchAndJoinCustomAudience(FetchAndJoinCustomAudienceRequest fetchAndJoinCustomAudienceRequest, OooO0OO oooO0OO) {
        return fetchAndJoinCustomAudience$suspendImpl(this, fetchAndJoinCustomAudienceRequest, oooO0OO);
    }

    public final android.adservices.customaudience.CustomAudienceManager getCustomAudienceManager() {
        return this.customAudienceManager;
    }

    @Override // androidx.privacysandbox.ads.adservices.customaudience.CustomAudienceManager
    public Object joinCustomAudience(JoinCustomAudienceRequest joinCustomAudienceRequest, OooO0OO oooO0OO) {
        return joinCustomAudience$suspendImpl(this, joinCustomAudienceRequest, oooO0OO);
    }

    @Override // androidx.privacysandbox.ads.adservices.customaudience.CustomAudienceManager
    public Object leaveCustomAudience(LeaveCustomAudienceRequest leaveCustomAudienceRequest, OooO0OO oooO0OO) {
        return leaveCustomAudience$suspendImpl(this, leaveCustomAudienceRequest, oooO0OO);
    }
}
