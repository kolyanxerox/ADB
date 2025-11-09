package androidx.webkit.internal;

import java.util.concurrent.Callable;
import org.chromium.support_lib_boundary.WebViewNavigationBoundaryInterface;

/* loaded from: classes.dex */
public final /* synthetic */ class OooO0o implements Callable {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f15333OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ WebViewNavigationBoundaryInterface f15334OooOo0o;

    public /* synthetic */ OooO0o(WebViewNavigationBoundaryInterface webViewNavigationBoundaryInterface, int i) {
        this.f15333OooOo0O = i;
        this.f15334OooOo0o = webViewNavigationBoundaryInterface;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f15333OooOo0O) {
            case 0:
                return WebNavigationClientAdapter.lambda$onNavigationStarted$0(this.f15334OooOo0o);
            case 1:
                return WebNavigationClientAdapter.lambda$onNavigationRedirected$1(this.f15334OooOo0o);
            default:
                return WebNavigationClientAdapter.lambda$onNavigationCompleted$2(this.f15334OooOo0o);
        }
    }
}
