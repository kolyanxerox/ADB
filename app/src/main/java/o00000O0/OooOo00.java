package o00000O0;

import android.view.View;
import android.view.accessibility.AccessibilityManager;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityManagerCompat;

/* loaded from: classes2.dex */
public final class OooOo00 implements View.OnAttachStateChangeListener {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ OooOo f29190OooOo0O;

    public OooOo00(OooOo oooOo) {
        this.f29190OooOo0O = oooOo;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        AccessibilityManager accessibilityManager;
        OooOo oooOo = this.f29190OooOo0O;
        if (oooOo.f29188Oooo0oO == null || (accessibilityManager = oooOo.f29186Oooo0o) == null || !ViewCompat.isAttachedToWindow(oooOo)) {
            return;
        }
        AccessibilityManagerCompat.addTouchExplorationStateChangeListener(accessibilityManager, oooOo.f29188Oooo0oO);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        AccessibilityManager accessibilityManager;
        OooOo oooOo = this.f29190OooOo0O;
        AccessibilityManagerCompat.TouchExplorationStateChangeListener touchExplorationStateChangeListener = oooOo.f29188Oooo0oO;
        if (touchExplorationStateChangeListener == null || (accessibilityManager = oooOo.f29186Oooo0o) == null) {
            return;
        }
        AccessibilityManagerCompat.removeTouchExplorationStateChangeListener(accessibilityManager, touchExplorationStateChangeListener);
    }
}
