package o0OO00O;

import Ooooo0o.oo0o0O0;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.provider.Settings;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public abstract class Oooo000 extends Drawable implements Animatable2Compat {

    /* renamed from: Oooo000 */
    public static final o00oO0o.Oooo000 f32877Oooo000 = new o00oO0o.Oooo000(6, Float.class, "growFraction");

    /* renamed from: OooOo0O */
    public final Context f32879OooOo0O;

    /* renamed from: OooOo0o */
    public final OooOO0 f32880OooOo0o;

    /* renamed from: OooOoO */
    public ObjectAnimator f32881OooOoO;

    /* renamed from: OooOoO0 */
    public ObjectAnimator f32882OooOoO0;

    /* renamed from: OooOoOO */
    public ArrayList f32883OooOoOO;

    /* renamed from: OooOoo */
    public float f32884OooOoo;

    /* renamed from: OooOoo0 */
    public boolean f32885OooOoo0;

    /* renamed from: OooOooo */
    public int f32887OooOooo;

    /* renamed from: OooOooO */
    public final Paint f32886OooOooO = new Paint();

    /* renamed from: OooOo */
    public OooO00o f32878OooOo = new OooO00o();

    public Oooo000(Context context, OooOO0 oooOO0) {
        this.f32879OooOo0O = context;
        this.f32880OooOo0o = oooOO0;
        setAlpha(255);
    }

    public final float OooO0O0() {
        OooOO0 oooOO0 = this.f32880OooOo0o;
        if (oooOO0.f32849OooO0o0 == 0 && oooOO0.f32848OooO0o == 0) {
            return 1.0f;
        }
        return this.f32884OooOoo;
    }

    public final boolean OooO0OO() {
        ObjectAnimator objectAnimator = this.f32881OooOoO;
        return objectAnimator != null && objectAnimator.isRunning();
    }

    public final boolean OooO0Oo() {
        ObjectAnimator objectAnimator = this.f32882OooOoO0;
        return objectAnimator != null && objectAnimator.isRunning();
    }

    public boolean OooO0o(boolean z, boolean z2, boolean z3) {
        ObjectAnimator objectAnimator = this.f32882OooOoO0;
        o00oO0o.Oooo000 oooo000 = f32877Oooo000;
        if (objectAnimator == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, oooo000, 0.0f, 1.0f);
            this.f32882OooOoO0 = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(500L);
            this.f32882OooOoO0.setInterpolator(oo0o0O0.f15016OooO0O0);
            ObjectAnimator objectAnimator2 = this.f32882OooOoO0;
            if (objectAnimator2 != null && objectAnimator2.isRunning()) {
                throw new IllegalArgumentException("Cannot set showAnimator while the current showAnimator is running.");
            }
            this.f32882OooOoO0 = objectAnimator2;
            objectAnimator2.addListener(new OooOo(this, 0));
        }
        if (this.f32881OooOoO == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, oooo000, 1.0f, 0.0f);
            this.f32881OooOoO = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration(500L);
            this.f32881OooOoO.setInterpolator(oo0o0O0.f15016OooO0O0);
            ObjectAnimator objectAnimator3 = this.f32881OooOoO;
            if (objectAnimator3 != null && objectAnimator3.isRunning()) {
                throw new IllegalArgumentException("Cannot set hideAnimator while the current hideAnimator is running.");
            }
            this.f32881OooOoO = objectAnimator3;
            objectAnimator3.addListener(new OooOo(this, 1));
        }
        if (isVisible() || z) {
            ObjectAnimator objectAnimator4 = z ? this.f32882OooOoO0 : this.f32881OooOoO;
            if (!z3) {
                if (objectAnimator4.isRunning()) {
                    objectAnimator4.end();
                } else {
                    boolean z4 = this.f32885OooOoo0;
                    this.f32885OooOoo0 = true;
                    new ValueAnimator[]{objectAnimator4}[0].end();
                    this.f32885OooOoo0 = z4;
                }
                return super.setVisible(z, false);
            }
            if (!z3 || !objectAnimator4.isRunning()) {
                boolean z5 = !z || super.setVisible(z, false);
                OooOO0 oooOO0 = this.f32880OooOo0o;
                if (!z ? oooOO0.f32848OooO0o != 0 : oooOO0.f32849OooO0o0 != 0) {
                    boolean z6 = this.f32885OooOoo0;
                    this.f32885OooOoo0 = true;
                    new ValueAnimator[]{objectAnimator4}[0].end();
                    this.f32885OooOoo0 = z6;
                    return z5;
                }
                if (z2 || !objectAnimator4.isPaused()) {
                    objectAnimator4.start();
                    return z5;
                }
                objectAnimator4.resume();
                return z5;
            }
        }
        return false;
    }

    public final boolean OooO0o0(boolean z, boolean z2, boolean z3) {
        OooO00o oooO00o = this.f32878OooOo;
        ContentResolver contentResolver = this.f32879OooOo0O.getContentResolver();
        oooO00o.getClass();
        return OooO0o(z, z2, z3 && Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f) > 0.0f);
    }

    @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public final void clearAnimationCallbacks() {
        this.f32883OooOoOO.clear();
        this.f32883OooOoOO = null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f32887OooOooo;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return OooO0Oo() || OooO0OO();
    }

    @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public final void registerAnimationCallback(Animatable2Compat.AnimationCallback animationCallback) {
        if (this.f32883OooOoOO == null) {
            this.f32883OooOoOO = new ArrayList();
        }
        if (this.f32883OooOoOO.contains(animationCallback)) {
            return;
        }
        this.f32883OooOoOO.add(animationCallback);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f32887OooOooo = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f32886OooOooO.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        return OooO0o0(z, z2, true);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        OooO0o(true, true, false);
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        OooO0o(false, true, false);
    }

    @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public final boolean unregisterAnimationCallback(Animatable2Compat.AnimationCallback animationCallback) {
        ArrayList arrayList = this.f32883OooOoOO;
        if (arrayList == null || !arrayList.contains(animationCallback)) {
            return false;
        }
        this.f32883OooOoOO.remove(animationCallback);
        if (!this.f32883OooOoOO.isEmpty()) {
            return true;
        }
        this.f32883OooOoOO = null;
        return true;
    }
}
