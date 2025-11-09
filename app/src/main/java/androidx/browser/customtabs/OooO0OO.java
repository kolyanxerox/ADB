package androidx.browser.customtabs;

import android.os.Bundle;

/* loaded from: classes.dex */
public final /* synthetic */ class OooO0OO implements Runnable {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ int f15190OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f15191OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ EngagementSignalsCallback f15192OooOo0o;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Bundle f15193OooOoO0;

    public /* synthetic */ OooO0OO(EngagementSignalsCallback engagementSignalsCallback, int i, Bundle bundle, int i2) {
        this.f15191OooOo0O = i2;
        this.f15192OooOo0o = engagementSignalsCallback;
        this.f15190OooOo = i;
        this.f15193OooOoO0 = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15191OooOo0O) {
            case 0:
                this.f15192OooOo0o.onGreatestScrollPercentageIncreased(this.f15190OooOo, this.f15193OooOoO0);
                break;
            default:
                this.f15192OooOo0o.onGreatestScrollPercentageIncreased(this.f15190OooOo, this.f15193OooOoO0);
                break;
        }
    }
}
