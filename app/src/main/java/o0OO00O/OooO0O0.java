package o0OO00O;

import android.os.SystemClock;

/* loaded from: classes2.dex */
public final class OooO0O0 implements Runnable {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f32840OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ OooO f32841OooOo0o;

    public /* synthetic */ OooO0O0(OooO oooO, int i) {
        this.f32840OooOo0O = i;
        this.f32841OooOo0o = oooO;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f32840OooOo0O) {
            case 0:
                OooO oooO = this.f32841OooOo0o;
                if (oooO.f32833OooOoO0 > 0) {
                    SystemClock.uptimeMillis();
                }
                oooO.setVisibility(0);
                break;
            default:
                OooO oooO2 = this.f32841OooOo0o;
                ((Oooo000) oooO2.getCurrentDrawable()).OooO0o0(false, false, true);
                if ((oooO2.getProgressDrawable() == null || !oooO2.getProgressDrawable().isVisible()) && (oooO2.getIndeterminateDrawable() == null || !oooO2.getIndeterminateDrawable().isVisible())) {
                    oooO2.setVisibility(4);
                }
                oooO2.getClass();
                break;
        }
    }
}
