package com.ironsource;

import android.app.Activity;
import com.ironsource.C3183hd;
import com.ironsource.InterfaceC3171h1;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;

/* renamed from: com.ironsource.od */
/* loaded from: classes2.dex */
public final class C3485od implements InterfaceC3520pd {

    /* renamed from: a */
    private final C3192hm f10647a;

    /* renamed from: b */
    private final LevelPlayAdInfo f10648b;

    public C3485od(C3192hm adInternal, LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.OooOo.OooO0o0(adInternal, "adInternal");
        kotlin.jvm.internal.OooOo.OooO0o0(adInfo, "adInfo");
        this.f10647a = adInternal;
        this.f10648b = adInfo;
    }

    @Override // com.ironsource.InterfaceC3520pd
    /* renamed from: a */
    public void mo9113a() {
        this.f10647a.m9193a("onAdExpired on shown state");
    }

    @Override // com.ironsource.InterfaceC3520pd
    /* renamed from: b */
    public void mo9116b() {
        this.f10647a.m9193a("onAdDisplayed on shown state");
    }

    @Override // com.ironsource.InterfaceC3520pd
    /* renamed from: c */
    public LevelPlayAdInfo mo9117c() {
        return this.f10648b;
    }

    @Override // com.ironsource.InterfaceC3520pd
    /* renamed from: d */
    public InterfaceC3171h1 mo9118d() {
        return new InterfaceC3171h1.a("ad is shown");
    }

    @Override // com.ironsource.InterfaceC3520pd
    public void loadAd() {
        String string = this.f10647a.m9196f().toString();
        kotlin.jvm.internal.OooOo.OooO0Oo(string, "adInternal.adId.toString()");
        C3192hm.m9170a(this.f10647a, new LevelPlayAdError(string, this.f10647a.m9199i(), LevelPlayAdError.ERROR_CODE_LOAD_WHILE_SHOW, "Load is called while ad is shown"), 0L, 2, null);
    }

    @Override // com.ironsource.InterfaceC3520pd
    public void onAdClicked() {
        IronLog.INTERNAL.verbose(C3349m1.m9956a(this.f10647a.m9197g(), "onAdClicked adInfo: " + this.f10648b, (String) null, 2, (Object) null));
        this.f10647a.m9197g().m13102e(new o0OOO0o(this, 2));
    }

    @Override // com.ironsource.InterfaceC3520pd
    public void onAdClosed() {
        IronLog.INTERNAL.verbose(C3349m1.m9956a(this.f10647a.m9197g(), "onAdClosed adInfo: " + this.f10648b, (String) null, 2, (Object) null));
        this.f10647a.m9197g().m13101d(new o0OOO0o(this, 0));
        this.f10647a.m9197g().m13102e(new o0OOO0o(this, 1));
    }

    @Override // com.ironsource.InterfaceC3520pd
    public void onAdInfoChanged(LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.OooOo.OooO0o0(adInfo, "adInfo");
        this.f10647a.m9193a("onAdInfoChanged on shown state");
    }

    @Override // com.ironsource.InterfaceC3520pd
    public void onAdLoadFailed(LevelPlayAdError error) {
        kotlin.jvm.internal.OooOo.OooO0o0(error, "error");
        this.f10647a.m9193a("onAdLoadFailed on shown state with error: " + error.getErrorMessage());
    }

    @Override // com.ironsource.InterfaceC3520pd
    public void onAdLoaded(LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.OooOo.OooO0o0(adInfo, "adInfo");
        this.f10647a.m9193a("onAdLoaded on shown state");
    }

    /* renamed from: b */
    public static final void m11133b(C3485od this$0) {
        kotlin.jvm.internal.OooOo.OooO0o0(this$0, "this$0");
        this$0.f10647a.m9187a(C3183hd.a.Closed);
    }

    /* renamed from: c */
    public static final void m11134c(C3485od this$0) {
        kotlin.jvm.internal.OooOo.OooO0o0(this$0, "this$0");
        InterfaceC3227im interfaceC3227imM9202l = this$0.f10647a.m9202l();
        if (interfaceC3227imM9202l != null) {
            interfaceC3227imM9202l.onAdClosed(this$0.f10648b);
        }
    }

    @Override // com.ironsource.InterfaceC3520pd
    /* renamed from: a */
    public void mo9114a(Activity activity, String str) {
        kotlin.jvm.internal.OooOo.OooO0o0(activity, "activity");
        String string = this.f10647a.m9196f().toString();
        kotlin.jvm.internal.OooOo.OooO0Oo(string, "adInternal.adId.toString()");
        this.f10647a.m9191a(new LevelPlayAdError(string, this.f10647a.m9199i(), LevelPlayAdError.ERROR_CODE_SHOW_WHILE_SHOW, "Ad is already shown"), this.f10648b);
    }

    /* renamed from: a */
    public static final void m11132a(C3485od this$0) {
        kotlin.jvm.internal.OooOo.OooO0o0(this$0, "this$0");
        InterfaceC3227im interfaceC3227imM9202l = this$0.f10647a.m9202l();
        if (interfaceC3227imM9202l != null) {
            interfaceC3227imM9202l.onAdClicked(this$0.f10648b);
        }
    }

    @Override // com.ironsource.InterfaceC3520pd
    /* renamed from: a */
    public void mo9115a(LevelPlayAdError error) {
        kotlin.jvm.internal.OooOo.OooO0o0(error, "error");
        this.f10647a.m9193a("onAdDisplayFailed on shown state with error: " + error.getErrorMessage());
    }
}
