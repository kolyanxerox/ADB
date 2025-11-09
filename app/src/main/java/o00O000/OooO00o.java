package o00O000;

import OooO0oO.Oooo0;
import Oooo0oO.o00000;
import android.content.Context;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.query.QueryInfo;
import o000Oo0O.OooOo00;
import o000ooOO.o000OO0O;

/* loaded from: classes3.dex */
public final class OooO00o extends o00000 {

    /* renamed from: OooO0OO, reason: collision with root package name */
    public o0O0ooO.OooO00o f31256OooO0OO;

    @Override // Oooo0oO.o00000
    public final void OooO(Context context, o000OO0O o000oo0o, Oooo0 oooo0, OooOo00 oooOo00) {
        int iOrdinal = o000oo0o.ordinal();
        OooO0oo(context, iOrdinal != 0 ? iOrdinal != 1 ? iOrdinal != 2 ? "" : "gmaScarBiddingBannerSignal" : "gmaScarBiddingRewardedSignal" : "gmaScarBiddingInterstitialSignal", o000oo0o, oooo0, oooOo00);
    }

    @Override // Oooo0oO.o00000
    public final void OooO0oo(Context context, String str, o000OO0O o000oo0o, Oooo0 oooo0, OooOo00 oooOo00) {
        AdRequest.Builder requestAgent = new AdRequest.Builder().setRequestAgent(this.f31256OooO0OO.f32828OooO00o.f30118OooO0O0);
        Bundle bundle = new Bundle();
        bundle.putString("query_info_type", "requester_type_5");
        AdRequest adRequestBuild = requestAgent.addNetworkExtrasBundle(AdMobAdapter.class, bundle).build();
        OooOo00 oooOo002 = new OooOo00(10, oooo0, oooOo00);
        o00.OooO00o oooO00o = new o00.OooO00o(1);
        oooO00o.f28885OooO0O0 = str;
        oooO00o.f28886OooO0OO = oooOo002;
        int iOrdinal = o000oo0o.ordinal();
        QueryInfo.generate(context, iOrdinal != 1 ? iOrdinal != 2 ? AdFormat.INTERSTITIAL : AdFormat.BANNER : AdFormat.REWARDED, adRequestBuild, oooO00o);
    }
}
