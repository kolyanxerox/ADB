package androidx.activity;

import androidx.activity.ComponentActivity;

/* loaded from: classes.dex */
public final /* synthetic */ class OooO0o implements Runnable {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f15165OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ Object f15166OooOo0o;

    public /* synthetic */ OooO0o(Object obj, int i) {
        this.f15165OooOo0O = i;
        this.f15166OooOo0o = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15165OooOo0O) {
            case 0:
                ((ComponentActivity.ReportFullyDrawnExecutorApi16Impl) this.f15166OooOo0o).lambda$execute$0();
                break;
            case 1:
                ((ComponentActivity) this.f15166OooOo0o).invalidateMenu();
                break;
            case 2:
                ComponentDialog.onBackPressedDispatcher$lambda$1((ComponentDialog) this.f15166OooOo0o);
                break;
            default:
                FullyDrawnReporter.reportRunnable$lambda$2((FullyDrawnReporter) this.f15166OooOo0o);
                break;
        }
    }
}
