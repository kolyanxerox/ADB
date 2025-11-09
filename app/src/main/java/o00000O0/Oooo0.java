package o00000O0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;

/* loaded from: classes2.dex */
public final class Oooo0 extends AnimatorListenerAdapter {

    /* renamed from: OooO00o */
    public final /* synthetic */ int f29191OooO00o;

    /* renamed from: OooO0O0 */
    public final /* synthetic */ TextView f29192OooO0O0;

    /* renamed from: OooO0OO */
    public final /* synthetic */ int f29193OooO0OO;

    /* renamed from: OooO0Oo */
    public final /* synthetic */ TextView f29194OooO0Oo;

    /* renamed from: OooO0o0 */
    public final /* synthetic */ o0OoOo0 f29195OooO0o0;

    public Oooo0(o0OoOo0 o0oooo0, int i, TextView textView, int i2, TextView textView2) {
        this.f29195OooO0o0 = o0oooo0;
        this.f29191OooO00o = i;
        this.f29192OooO0O0 = textView;
        this.f29193OooO0OO = i2;
        this.f29194OooO0Oo = textView2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        AppCompatTextView appCompatTextView;
        int i = this.f29191OooO00o;
        o0OoOo0 o0oooo0 = this.f29195OooO0o0;
        o0oooo0.f29220OooO0oo = i;
        o0oooo0.f29217OooO0o = null;
        TextView textView = this.f29192OooO0O0;
        if (textView != null) {
            textView.setVisibility(4);
            if (this.f29193OooO0OO == 1 && (appCompatTextView = o0oooo0.OooOO0o) != null) {
                appCompatTextView.setText((CharSequence) null);
            }
        }
        TextView textView2 = this.f29194OooO0Oo;
        if (textView2 != null) {
            textView2.setTranslationY(0.0f);
            textView2.setAlpha(1.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        TextView textView = this.f29194OooO0Oo;
        if (textView != null) {
            textView.setVisibility(0);
        }
    }
}
