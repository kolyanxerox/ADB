package androidx.webkit.internal;

import android.webkit.ValueCallback;
import androidx.webkit.PrerenderOperationCallback;

/* loaded from: classes.dex */
public final /* synthetic */ class OooO implements ValueCallback {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f15327OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ PrerenderOperationCallback f15328OooO0O0;

    public /* synthetic */ OooO(PrerenderOperationCallback prerenderOperationCallback, int i) {
        this.f15327OooO00o = i;
        this.f15328OooO0O0 = prerenderOperationCallback;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        switch (this.f15327OooO00o) {
            case 0:
                this.f15328OooO0O0.onPrerenderActivated();
                break;
            case 1:
                WebViewProviderAdapter.lambda$prerenderUrlAsync$3(this.f15328OooO0O0, (Throwable) obj);
                break;
            case 2:
                this.f15328OooO0O0.onPrerenderActivated();
                break;
            default:
                WebViewProviderAdapter.lambda$prerenderUrlAsync$1(this.f15328OooO0O0, (Throwable) obj);
                break;
        }
    }
}
