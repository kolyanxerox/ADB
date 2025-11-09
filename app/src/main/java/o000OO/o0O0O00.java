package o000oo;

import com.ironsource.InterfaceC3048dn;
import com.unity3d.ironsourceads.banner.BannerAdLoader;
import com.unity3d.ironsourceads.interstitial.InterstitialAdLoader;
import com.unity3d.ironsourceads.rewarded.RewardedAdLoader;

/* loaded from: classes3.dex */
public final /* synthetic */ class o0O0O00 implements Runnable {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f31018OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC3048dn f31019OooOo0o;

    public /* synthetic */ o0O0O00(InterfaceC3048dn interfaceC3048dn, int i) {
        this.f31018OooOo0O = i;
        this.f31019OooOo0o = interfaceC3048dn;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f31018OooOo0O) {
            case 0:
                InterstitialAdLoader.m13442a(this.f31019OooOo0o);
                break;
            case 1:
                BannerAdLoader.m13441a(this.f31019OooOo0o);
                break;
            default:
                RewardedAdLoader.m13443a(this.f31019OooOo0o);
                break;
        }
    }
}
