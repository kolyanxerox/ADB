package o00000;

import android.view.View;

/* loaded from: classes2.dex */
public final class OooOOOO implements View.OnLayoutChangeListener {

    /* renamed from: OooOo0O */
    public final /* synthetic */ View f28988OooOo0O;

    /* renamed from: OooOo0o */
    public final /* synthetic */ OooOo00 f28989OooOo0o;

    public OooOOOO(OooOo00 oooOo00, View view) {
        this.f28989OooOo0o = oooOo00;
        this.f28988OooOo0O = view;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        View view2 = this.f28988OooOo0O;
        if (view2.getVisibility() == 0) {
            this.f28989OooOo0o.OooO0OO(view2);
        }
    }
}
