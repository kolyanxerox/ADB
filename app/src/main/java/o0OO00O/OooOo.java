package o0OO00O;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class OooOo extends AnimatorListenerAdapter {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f32867OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Oooo000 f32868OooO0O0;

    public /* synthetic */ OooOo(Oooo000 oooo000, int i) {
        this.f32867OooO00o = i;
        this.f32868OooO0O0 = oooo000;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.f32867OooO00o) {
            case 1:
                super.onAnimationEnd(animator);
                Oooo000 oooo000 = this.f32868OooO0O0;
                super/*android.graphics.drawable.Drawable*/.setVisible(false, false);
                ArrayList arrayList = oooo000.f32883OooOoOO;
                if (arrayList != null && !oooo000.f32885OooOoo0) {
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        ((Animatable2Compat.AnimationCallback) obj).onAnimationEnd(oooo000);
                    }
                    break;
                }
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f32867OooO00o) {
            case 0:
                super.onAnimationStart(animator);
                Oooo000 oooo000 = this.f32868OooO0O0;
                ArrayList arrayList = oooo000.f32883OooOoOO;
                if (arrayList != null && !oooo000.f32885OooOoo0) {
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        ((Animatable2Compat.AnimationCallback) obj).onAnimationStart(oooo000);
                    }
                    break;
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
