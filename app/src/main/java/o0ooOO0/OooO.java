package o0ooOO0;

import android.graphics.Typeface;

/* loaded from: classes2.dex */
public final class OooO {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f33005OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ OooOO0 f33006OooO0O0;

    public /* synthetic */ OooO(OooOO0 oooOO0, int i) {
        this.f33005OooO00o = i;
        this.f33006OooO0O0 = oooOO0;
    }

    public final void OooO00o(Typeface typeface) {
        switch (this.f33005OooO00o) {
            case 0:
                OooOO0 oooOO0 = this.f33006OooO0O0;
                if (oooOO0.OooOOO0(typeface)) {
                    oooOO0.OooO(false);
                    break;
                }
                break;
            default:
                OooOO0 oooOO02 = this.f33006OooO0O0;
                if (oooOO02.OooOOOO(typeface)) {
                    oooOO02.OooO(false);
                    break;
                }
                break;
        }
    }
}
