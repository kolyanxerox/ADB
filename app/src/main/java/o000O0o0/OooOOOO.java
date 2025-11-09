package o000o0o0;

import com.ironsource.mediationsdk.ads.nativead.LevelPlayNativeAd;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;

/* loaded from: classes2.dex */
public final /* synthetic */ class OooOOOO implements Runnable {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ AdInfo f30955OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f30956OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ LevelPlayNativeAd f30957OooOo0o;

    public /* synthetic */ OooOOOO(LevelPlayNativeAd levelPlayNativeAd, AdInfo adInfo, int i) {
        this.f30956OooOo0O = i;
        this.f30957OooOo0o = levelPlayNativeAd;
        this.f30955OooOo = adInfo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f30956OooOo0O) {
            case 0:
                LevelPlayNativeAd.m10056a(this.f30957OooOo0o, this.f30955OooOo);
                break;
            default:
                LevelPlayNativeAd.m10059b(this.f30957OooOo0o, this.f30955OooOo);
                break;
        }
    }
}
