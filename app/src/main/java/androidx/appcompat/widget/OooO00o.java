package androidx.appcompat.widget;

/* loaded from: classes.dex */
public final /* synthetic */ class OooO00o implements Runnable {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f15178OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ Toolbar f15179OooOo0o;

    public /* synthetic */ OooO00o(Toolbar toolbar, int i) {
        this.f15178OooOo0O = i;
        this.f15179OooOo0o = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15178OooOo0O) {
            case 0:
                this.f15179OooOo0o.collapseActionView();
                break;
            default:
                this.f15179OooOo0o.invalidateMenu();
                break;
        }
    }
}
