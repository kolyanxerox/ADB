package o000ooo;

import Oooo.OooOOO;
import Oooo0oO.o00000;
import OoooO0O.o00000OO;
import android.content.Context;
import com.google.android.gms.ads.AdView;
import com.unity3d.scar.adapter.common.OooO;
import com.unity3d.scar.adapter.common.OooO0OO;
import com.unity3d.services.ads.gmascar.handlers.ScarBannerAdHandler;
import com.unity3d.services.ads.gmascar.handlers.ScarInterstitialAdHandler;
import com.unity3d.services.ads.gmascar.handlers.ScarRewardedAdHandler;
import com.unity3d.services.banners.BannerView;
import java.util.concurrent.ConcurrentHashMap;
import o000ooOO.o000O0;
import o000ooOO.o000O0Oo;
import o000oooO.o000O0O0;
import o000oooo.o000OOo0;
import o000oooo.o00O0000;
import o000oooo.o00O000o;
import o000oooo.o00O00O;
import o000oooo.o0O0ooO;
import o00Oo0oo.o00oO0o;
import o00oOoo.o000000;
import o00oOoo.o000OOo;
import o00oOoo.o0O0O00;
import o00oOoo.o0OO00O;
import o00oOoo.oo0o0Oo;
import o0O0ooO.OooO00o;

/* loaded from: classes3.dex */
public final class o0000O00 implements OooO {

    /* renamed from: OooO00o, reason: collision with root package name */
    public o00000 f31122OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final ConcurrentHashMap f31123OooO0O0 = new ConcurrentHashMap();

    /* renamed from: OooO0OO, reason: collision with root package name */
    public o000O0 f31124OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final OooO0OO f31125OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public Object f31126OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ int f31127OooO0o0;

    public o0000O00(OooO0OO oooO0OO, int i) {
        this.f31127OooO0o0 = i;
        this.f31125OooO0Oo = oooO0OO;
    }

    @Override // com.unity3d.scar.adapter.common.OooO
    public final void OooO00o(Context context, o000O0Oo o000o0oo2, ScarInterstitialAdHandler scarInterstitialAdHandler) {
        switch (this.f31127OooO0o0) {
            case 0:
                o0O0ooO o0o0ooo = new o0O0ooO(context, o000o0oo2, (o000O0O0) this.f31126OooO0o, this.f31125OooO0Oo, 0);
                o0o0ooo.f31135OooO0o = new o00O000o(scarInterstitialAdHandler, o0o0ooo);
                o00oO0o.OooOO0(new o00000OO(this, o0o0ooo, o000o0oo2, false, 13));
                break;
            default:
                o0O0O00 o0o0o00 = new o0O0O00(context, o000o0oo2, (OooO00o) this.f31126OooO0o, this.f31125OooO0Oo, 0);
                o0o0o00.f31135OooO0o = new o000OOo(scarInterstitialAdHandler, o0o0o00);
                o00oO0o.OooOO0(new o00000OO(this, o0o0o00, o000o0oo2, false, 15));
                break;
        }
    }

    @Override // com.unity3d.scar.adapter.common.OooO
    public final void OooO0O0(Context context, BannerView bannerView, o000O0Oo o000o0oo2, int i, int i2, ScarBannerAdHandler scarBannerAdHandler) {
        switch (this.f31127OooO0o0) {
            case 0:
                o000OOo0 o000ooo02 = new o000OOo0(context, o000o0oo2, (o000O0O0) this.f31126OooO0o, this.f31125OooO0Oo, 0);
                o000ooo02.f31140OooO0oo = bannerView;
                o000ooo02.f31139OooO = i;
                o000ooo02.f31141OooOO0 = i2;
                o000ooo02.f31142OooOO0O = new AdView(context);
                o000ooo02.f31135OooO0o = new o00O0000(scarBannerAdHandler, o000ooo02);
                o00oO0o.OooOO0(new OooOOO(o000ooo02, 17));
                break;
            default:
                o0OO00O o0oo00o = new o0OO00O(context, o000o0oo2, (OooO00o) this.f31126OooO0o, this.f31125OooO0Oo, 2);
                o0oo00o.f32810OooO0oo = bannerView;
                o0oo00o.f32809OooO = i;
                o0oo00o.f32811OooOO0 = i2;
                o0oo00o.f32812OooOO0O = new AdView(context);
                o0oo00o.f31135OooO0o = new oo0o0Oo(scarBannerAdHandler, o0oo00o);
                o00oO0o.OooOO0(new OooOOO(o0oo00o, 18));
                break;
        }
    }

    @Override // com.unity3d.scar.adapter.common.OooO
    public final void OooO0OO(Context context, o000O0Oo o000o0oo2, ScarRewardedAdHandler scarRewardedAdHandler) {
        switch (this.f31127OooO0o0) {
            case 0:
                o0O0ooO o0o0ooo = new o0O0ooO(context, o000o0oo2, (o000O0O0) this.f31126OooO0o, this.f31125OooO0Oo, 1);
                o0o0ooo.f31135OooO0o = new o00O00O(scarRewardedAdHandler, o0o0ooo);
                o00oO0o.OooOO0(new o00000OO(this, o0o0ooo, o000o0oo2, false, 14));
                break;
            default:
                o0O0O00 o0o0o00 = new o0O0O00(context, o000o0oo2, (OooO00o) this.f31126OooO0o, this.f31125OooO0Oo, 1);
                o0o0o00.f31135OooO0o = new o000000(scarRewardedAdHandler, o0o0o00);
                o00oO0o.OooOO0(new o00000OO(this, o0o0o00, o000o0oo2, false, 16));
                break;
        }
    }
}
