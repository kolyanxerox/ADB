package OooooOO;

import android.view.View;
import androidx.core.view.ViewCompat;
import androidx.customview.widget.ViewDragHelper;
import com.google.android.material.behavior.SwipeDismissBehavior;

/* loaded from: classes2.dex */
public final class oOOO00 implements Runnable {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ SwipeDismissBehavior f15042OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final View f15043OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final boolean f15044OooOo0o;

    public oOOO00(SwipeDismissBehavior swipeDismissBehavior, View view, boolean z) {
        this.f15042OooOo = swipeDismissBehavior;
        this.f15043OooOo0O = view;
        this.f15044OooOo0o = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SwipeDismissBehavior swipeDismissBehavior = this.f15042OooOo;
        ViewDragHelper viewDragHelper = swipeDismissBehavior.f27338OooO00o;
        if (viewDragHelper != null && viewDragHelper.continueSettling(true)) {
            ViewCompat.postOnAnimation(this.f15043OooOo0O, this);
        } else if (this.f15044OooOo0o) {
            swipeDismissBehavior.getClass();
        }
    }
}
