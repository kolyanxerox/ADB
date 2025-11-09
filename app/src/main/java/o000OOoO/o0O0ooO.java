package o000oooo;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.unity3d.scar.adapter.common.OooO00o;
import com.unity3d.scar.adapter.common.OooO0OO;
import o000ooOO.o000O0;
import o000ooOO.o000O0Oo;
import o000oooO.o000O0O0;

/* loaded from: classes3.dex */
public final class o0O0ooO extends o000O implements o000O0 {

    /* renamed from: OooO0oo */
    public final /* synthetic */ int f31161OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o0O0ooO(Context context, o000O0Oo o000o0oo2, o000O0O0 o000o0o02, OooO0OO oooO0OO, int i) {
        super(context, o000o0oo2, o000o0o02, oooO0OO, 0);
        this.f31161OooO0oo = i;
    }

    @Override // o000ooOO.o000O0
    public final void OooO00o(Activity activity) {
        switch (this.f31161OooO0oo) {
            case 0:
                Object obj = this.f31133OooO0OO;
                if (obj == null) {
                    ((OooO0OO) this.f31137OooO0oO).handleError(OooO00o.OooO00o((o000O0Oo) this.f31134OooO0Oo));
                    break;
                } else {
                    ((InterstitialAd) obj).show(activity);
                    break;
                }
            default:
                Object obj2 = this.f31133OooO0OO;
                if (obj2 == null) {
                    ((OooO0OO) this.f31137OooO0oO).handleError(OooO00o.OooO00o((o000O0Oo) this.f31134OooO0Oo));
                    break;
                } else {
                    ((RewardedAd) obj2).show(activity, ((o00O00O) ((o000OO00) this.f31135OooO0o)).f31158OooO0o0);
                    break;
                }
        }
    }

    @Override // o000oooo.o000O
    public final void OooO0o(AdRequest adRequest) {
        switch (this.f31161OooO0oo) {
            case 0:
                InterstitialAd.load(this.f31132OooO0O0, ((o000O0Oo) this.f31134OooO0Oo).f31115OooO0OO, adRequest, ((o00O000o) ((o000OO00) this.f31135OooO0o)).f31152OooO0Oo);
                break;
            default:
                RewardedAd.load(this.f31132OooO0O0, ((o000O0Oo) this.f31134OooO0Oo).f31115OooO0OO, adRequest, ((o00O00O) ((o000OO00) this.f31135OooO0o)).f31156OooO0Oo);
                break;
        }
    }
}
