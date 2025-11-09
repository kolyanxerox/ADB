package o0OOO0o;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.view.ViewTreeObserver;
import com.google.android.material.internal.NavigationMenuView;
import com.google.android.material.navigation.NavigationView;
import o0ooOO0.o00oO0o;

/* loaded from: classes2.dex */
public final class Oooo0 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: OooOo0O */
    public final /* synthetic */ NavigationView f32991OooOo0O;

    public Oooo0(NavigationView navigationView) {
        this.f32991OooOo0O = navigationView;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        Activity activity;
        NavigationView navigationView = this.f32991OooOo0O;
        int[] iArr = navigationView.f27722OooOooO;
        navigationView.getLocationOnScreen(iArr);
        boolean z = iArr[1] == 0;
        o00oO0o o00oo0o = navigationView.f27721OooOoo0;
        if (o00oo0o.f33130OoooO0 != z) {
            o00oo0o.f33130OoooO0 = z;
            int i = (o00oo0o.f33110OooOo0o.getChildCount() == 0 && o00oo0o.f33130OoooO0) ? o00oo0o.f33129OoooO : 0;
            NavigationMenuView navigationMenuView = o00oo0o.f33109OooOo0O;
            navigationMenuView.setPadding(0, i, 0, navigationMenuView.getPaddingBottom());
        }
        navigationView.setDrawTopInsetForeground(z && navigationView.f27726Oooo00O);
        Context context = navigationView.getContext();
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                activity = null;
                break;
            } else {
                if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
        }
        if (activity != null) {
            navigationView.setDrawBottomInsetForeground((activity.findViewById(R.id.content).getHeight() == navigationView.getHeight()) && (Color.alpha(activity.getWindow().getNavigationBarColor()) != 0) && navigationView.f27727Oooo00o);
        }
    }
}
