package androidx.webkit.internal;

import java.util.concurrent.Callable;
import org.chromium.support_lib_boundary.WebViewPageBoundaryInterface;

/* loaded from: classes.dex */
public final /* synthetic */ class OooO0OO implements Callable {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f15331OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ WebViewPageBoundaryInterface f15332OooOo0o;

    public /* synthetic */ OooO0OO(WebViewPageBoundaryInterface webViewPageBoundaryInterface, int i) {
        this.f15331OooOo0O = i;
        this.f15332OooOo0o = webViewPageBoundaryInterface;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f15331OooOo0O) {
            case 0:
                return WebNavigationClientAdapter.lambda$onFirstContentfulPaint$6(this.f15332OooOo0o);
            case 1:
                return WebNavigationClientAdapter.lambda$onPageDeleted$3(this.f15332OooOo0o);
            case 2:
                return WebNavigationClientAdapter.lambda$onPageLoadEventFired$4(this.f15332OooOo0o);
            default:
                return WebNavigationClientAdapter.lambda$onPageDOMContentLoadedEventFired$5(this.f15332OooOo0o);
        }
    }
}
