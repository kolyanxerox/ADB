package o00000Oo;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* loaded from: classes2.dex */
public final class OooOO0O extends AnimatorListenerAdapter {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ boolean f29270OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ View f29271OooO0O0;

    public OooOO0O(View view, boolean z) {
        this.f29270OooO00o = z;
        this.f29271OooO0O0 = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.f29270OooO00o) {
            return;
        }
        this.f29271OooO0O0.setVisibility(4);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        if (this.f29270OooO00o) {
            this.f29271OooO0O0.setVisibility(0);
        }
    }
}
