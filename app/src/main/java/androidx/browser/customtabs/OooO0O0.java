package androidx.browser.customtabs;

import android.os.Bundle;

/* loaded from: classes.dex */
public final /* synthetic */ class OooO0O0 implements Runnable {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ boolean f15186OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f15187OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ EngagementSignalsCallback f15188OooOo0o;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Bundle f15189OooOoO0;

    public /* synthetic */ OooO0O0(EngagementSignalsCallback engagementSignalsCallback, boolean z, Bundle bundle, int i) {
        this.f15187OooOo0O = i;
        this.f15188OooOo0o = engagementSignalsCallback;
        this.f15186OooOo = z;
        this.f15189OooOoO0 = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15187OooOo0O) {
            case 0:
                this.f15188OooOo0o.onSessionEnded(this.f15186OooOo, this.f15189OooOoO0);
                break;
            case 1:
                this.f15188OooOo0o.onVerticalScrollEvent(this.f15186OooOo, this.f15189OooOoO0);
                break;
            case 2:
                this.f15188OooOo0o.onVerticalScrollEvent(this.f15186OooOo, this.f15189OooOoO0);
                break;
            default:
                this.f15188OooOo0o.onSessionEnded(this.f15186OooOo, this.f15189OooOoO0);
                break;
        }
    }
}
