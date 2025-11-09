package androidx.core.widget;

/* loaded from: classes.dex */
public final /* synthetic */ class OooO00o implements Runnable {

    /* renamed from: OooOo0O */
    public final /* synthetic */ int f15264OooOo0O;

    /* renamed from: OooOo0o */
    public final /* synthetic */ ContentLoadingProgressBar f15265OooOo0o;

    public /* synthetic */ OooO00o(ContentLoadingProgressBar contentLoadingProgressBar, int i) {
        this.f15264OooOo0O = i;
        this.f15265OooOo0o = contentLoadingProgressBar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15264OooOo0O) {
            case 0:
                this.f15265OooOo0o.lambda$new$0();
                break;
            case 1:
                this.f15265OooOo0o.lambda$new$1();
                break;
            case 2:
                this.f15265OooOo0o.showOnUiThread();
                break;
            default:
                this.f15265OooOo0o.hideOnUiThread();
                break;
        }
    }
}
