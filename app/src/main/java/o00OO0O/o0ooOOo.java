package o00oO0o;

import android.view.ViewTreeObserver;

/* loaded from: classes2.dex */
public final class o0ooOOo implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ oo0o0Oo f32750OooOo0O;

    public o0ooOOo(oo0o0Oo oo0o0oo) {
        this.f32750OooOo0O = oo0o0oo;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        oo0o0Oo oo0o0oo = this.f32750OooOo0O;
        float rotation = oo0o0oo.f32791OooOo0O.getRotation();
        if (oo0o0oo.f32784OooOOOO == rotation) {
            return true;
        }
        oo0o0oo.f32784OooOOOO = rotation;
        oo0o0oo.OooOOo0();
        return true;
    }
}
