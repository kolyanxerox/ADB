package OooooOo;

import Oooo0o0.OooO;
import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* loaded from: classes2.dex */
public final class oOOO0OO0 extends OooO {

    /* renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ BottomAppBar f15052OooOoO;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ int f15053OooOoO0;

    public oOOO0OO0(BottomAppBar bottomAppBar, int i) {
        super(10);
        this.f15052OooOoO = bottomAppBar;
        this.f15053OooOoO0 = i;
    }

    @Override // Oooo0o0.OooO
    public final void OooOOo(FloatingActionButton floatingActionButton) {
        int i = BottomAppBar.f27345OoooO0O;
        floatingActionButton.setTranslationX(this.f15052OooOoO.OooO0oo(this.f15053OooOoO0));
        floatingActionButton.OooOO0o(new oOOO0O0o(this), true);
    }
}
