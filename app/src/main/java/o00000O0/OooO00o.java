package o00000O0;

import android.view.View;

/* loaded from: classes2.dex */
public final /* synthetic */ class OooO00o implements View.OnFocusChangeListener {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f29145OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ Oooo000 f29146OooOo0o;

    public /* synthetic */ OooO00o(Oooo000 oooo000, int i) {
        this.f29145OooOo0O = i;
        this.f29146OooOo0o = oooo000;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        switch (this.f29145OooOo0O) {
            case 0:
                OooO0o oooO0o = (OooO0o) this.f29146OooOo0o;
                oooO0o.OooOo00(oooO0o.OooOo0());
                break;
            default:
                OooOOO0 oooOOO0 = (OooOOO0) this.f29146OooOo0o;
                oooOOO0.f29159OooO = z;
                oooOOO0.OooOOo0();
                if (!z) {
                    oooOOO0.OooOo00(false);
                    oooOOO0.f29164OooOO0 = false;
                    break;
                }
                break;
        }
    }
}
