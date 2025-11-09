package o00;

import OooO0oO.Oooo0;
import Oooo0oO.o00000;
import android.content.Context;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.query.QueryInfo;
import o000Oo0O.OooOo00;
import o000ooOO.o000OO0O;
import o000oooO.o000O0O0;

/* loaded from: classes3.dex */
public final class OooO0O0 extends o00000 {

    /* renamed from: OooO0OO, reason: collision with root package name */
    public o000O0O0 f28887OooO0OO;

    @Override // Oooo0oO.o00000
    public final void OooO(Context context, o000OO0O o000oo0o, Oooo0 oooo0, OooOo00 oooOo00) {
        int iOrdinal = o000oo0o.ordinal();
        OooO0oo(context, iOrdinal != 0 ? iOrdinal != 1 ? iOrdinal != 2 ? "" : "gmaScarBiddingBannerSignal" : "gmaScarBiddingRewardedSignal" : "gmaScarBiddingInterstitialSignal", o000oo0o, oooo0, oooOo00);
    }

    @Override // Oooo0oO.o00000
    public final void OooO0oo(Context context, String str, o000OO0O o000oo0o, Oooo0 oooo0, OooOo00 oooOo00) {
        AdRequest adRequestBuild = this.f28887OooO0OO.OooO0O0().build();
        OooOo00 oooOo002 = new OooOo00(10, oooo0, oooOo00);
        OooO00o oooO00o = new OooO00o(0);
        oooO00o.f28885OooO0O0 = str;
        oooO00o.f28886OooO0OO = oooOo002;
        QueryInfo.generate(context, OooOOo0(o000oo0o), adRequestBuild, oooO00o);
    }

    public final AdFormat OooOOo0(o000OO0O o000oo0o) {
        int iOrdinal = o000oo0o.ordinal();
        return iOrdinal != 0 ? iOrdinal != 1 ? iOrdinal != 2 ? AdFormat.UNKNOWN : AdFormat.BANNER : AdFormat.REWARDED : AdFormat.INTERSTITIAL;
    }
}
