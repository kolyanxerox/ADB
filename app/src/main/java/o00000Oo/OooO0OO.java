package o00000Oo;

import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.transformation.ExpandableBehavior;
import oo000o.OooO00o;

/* loaded from: classes2.dex */
public final class OooO0OO implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: OooOo */
    public final /* synthetic */ OooO00o f29260OooOo;

    /* renamed from: OooOo0O */
    public final /* synthetic */ View f29261OooOo0O;

    /* renamed from: OooOo0o */
    public final /* synthetic */ int f29262OooOo0o;

    /* renamed from: OooOoO0 */
    public final /* synthetic */ ExpandableBehavior f29263OooOoO0;

    public OooO0OO(ExpandableBehavior expandableBehavior, View view, int i, OooO00o oooO00o) {
        this.f29263OooOoO0 = expandableBehavior;
        this.f29261OooOo0O = view;
        this.f29262OooOo0o = i;
        this.f29260OooOo = oooO00o;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        View view = this.f29261OooOo0O;
        view.getViewTreeObserver().removeOnPreDrawListener(this);
        ExpandableBehavior expandableBehavior = this.f29263OooOoO0;
        if (expandableBehavior.f27984OooO00o == this.f29262OooOo0o) {
            Object obj = this.f29260OooOo;
            expandableBehavior.OooO00o((View) obj, view, ((FloatingActionButton) obj).f27650Oooo0O0.f26093OooO00o, false);
        }
        return false;
    }
}
