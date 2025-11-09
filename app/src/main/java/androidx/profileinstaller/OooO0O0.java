package androidx.profileinstaller;

import androidx.profileinstaller.ProfileInstaller;

/* loaded from: classes.dex */
public final /* synthetic */ class OooO0O0 implements Runnable {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ int f15315OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f15316OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ ProfileInstaller.DiagnosticsCallback f15317OooOo0o;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Object f15318OooOoO0;

    public /* synthetic */ OooO0O0(ProfileInstaller.DiagnosticsCallback diagnosticsCallback, int i, Object obj, int i2) {
        this.f15316OooOo0O = i2;
        this.f15317OooOo0o = diagnosticsCallback;
        this.f15315OooOo = i;
        this.f15318OooOoO0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15316OooOo0O) {
            case 0:
                this.f15317OooOo0o.onResultReceived(this.f15315OooOo, this.f15318OooOoO0);
                break;
            default:
                this.f15317OooOo0o.onDiagnosticReceived(this.f15315OooOo, this.f15318OooOoO0);
                break;
        }
    }
}
