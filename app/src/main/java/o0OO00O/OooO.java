package o0OO00O;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.provider.Settings;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ProgressBar;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.core.view.ViewCompat;
import com.github.superadb.R;
import java.util.Arrays;
import o0ooOO0.o00000O0;

/* loaded from: classes2.dex */
public abstract class OooO extends ProgressBar {

    /* renamed from: OooOo */
    public final boolean f32829OooOo;

    /* renamed from: OooOo0O */
    public final OooOO0 f32830OooOo0O;

    /* renamed from: OooOo0o */
    public int f32831OooOo0o;

    /* renamed from: OooOoO */
    public OooO00o f32832OooOoO;

    /* renamed from: OooOoO0 */
    public final int f32833OooOoO0;

    /* renamed from: OooOoOO */
    public boolean f32834OooOoOO;

    /* renamed from: OooOoo */
    public final OooO0O0 f32835OooOoo;

    /* renamed from: OooOoo0 */
    public int f32836OooOoo0;

    /* renamed from: OooOooO */
    public final OooO0O0 f32837OooOooO;

    /* renamed from: OooOooo */
    public final OooO0OO f32838OooOooo;

    /* renamed from: Oooo000 */
    public final OooO0o f32839Oooo000;

    public OooO(Context context, AttributeSet attributeSet, int i, int i2) {
        super(o00000O.OooO00o.OooO00o(context, attributeSet, i, R.style.Widget_MaterialComponents_ProgressIndicator), attributeSet, i);
        this.f32834OooOoOO = false;
        this.f32836OooOoo0 = 4;
        this.f32835OooOoo = new OooO0O0(this, 0);
        this.f32837OooOooO = new OooO0O0(this, 1);
        this.f32838OooOooo = new OooO0OO(this);
        this.f32839Oooo000 = new OooO0o(this);
        Context context2 = getContext();
        this.f32830OooOo0O = OooO00o(context2, attributeSet);
        TypedArray typedArrayOooO0Oo = o00000O0.OooO0Oo(context2, attributeSet, Ooooo00.OooOo.f14954OooO0Oo, i, i2, new int[0]);
        typedArrayOooO0Oo.getInt(5, -1);
        this.f32833OooOoO0 = Math.min(typedArrayOooO0Oo.getInt(3, -1), 1000);
        typedArrayOooO0Oo.recycle();
        this.f32832OooOoO = new OooO00o();
        this.f32829OooOo = true;
    }

    @Nullable
    private Oooo0 getCurrentDrawingDelegate() {
        if (isIndeterminate()) {
            if (getIndeterminateDrawable() == null) {
                return null;
            }
            return getIndeterminateDrawable().f32902Oooo00O;
        }
        if (getProgressDrawable() == null) {
            return null;
        }
        return getProgressDrawable().f32871Oooo00O;
    }

    public abstract OooOO0 OooO00o(Context context, AttributeSet attributeSet);

    public void OooO0O0(int i) {
        if (!isIndeterminate()) {
            super.setProgress(i);
            if (getProgressDrawable() != null) {
                getProgressDrawable().jumpToCurrentState();
                return;
            }
            return;
        }
        if (getProgressDrawable() != null) {
            this.f32831OooOo0o = i;
            this.f32834OooOoOO = true;
            if (getIndeterminateDrawable().isVisible()) {
                OooO00o oooO00o = this.f32832OooOoO;
                ContentResolver contentResolver = getContext().getContentResolver();
                oooO00o.getClass();
                if (Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f) != 0.0f) {
                    getIndeterminateDrawable().f32903Oooo00o.OooO0Oo();
                    return;
                }
            }
            this.f32838OooOooo.onAnimationEnd(getIndeterminateDrawable());
        }
    }

    public final boolean OooO0OO() {
        if (!ViewCompat.isAttachedToWindow(this) || getWindowVisibility() != 0) {
            return false;
        }
        View view = this;
        while (view.getVisibility() == 0) {
            Object parent = view.getParent();
            if (parent == null) {
                return getWindowVisibility() == 0;
            }
            if (!(parent instanceof View)) {
                return true;
            }
            view = (View) parent;
        }
        return false;
    }

    @Override // android.widget.ProgressBar
    @Nullable
    public Drawable getCurrentDrawable() {
        return isIndeterminate() ? getIndeterminateDrawable() : getProgressDrawable();
    }

    public int getHideAnimationBehavior() {
        return this.f32830OooOo0O.f32848OooO0o;
    }

    @NonNull
    public int[] getIndicatorColor() {
        return this.f32830OooOo0O.f32846OooO0OO;
    }

    public int getShowAnimationBehavior() {
        return this.f32830OooOo0O.f32849OooO0o0;
    }

    @ColorInt
    public int getTrackColor() {
        return this.f32830OooOo0O.f32847OooO0Oo;
    }

    @Px
    public int getTrackCornerRadius() {
        return this.f32830OooOo0O.f32845OooO0O0;
    }

    @Px
    public int getTrackThickness() {
        return this.f32830OooOo0O.f32844OooO00o;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        if (getCurrentDrawable() != null) {
            getCurrentDrawable().invalidateSelf();
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getProgressDrawable() != null && getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().f32903Oooo00o.OooO0OO(this.f32838OooOooo);
        }
        OooOo00 progressDrawable = getProgressDrawable();
        OooO0o oooO0o = this.f32839Oooo000;
        if (progressDrawable != null) {
            getProgressDrawable().registerAnimationCallback(oooO0o);
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().registerAnimationCallback(oooO0o);
        }
        if (OooO0OO()) {
            if (this.f32833OooOoO0 > 0) {
                SystemClock.uptimeMillis();
            }
            setVisibility(0);
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f32837OooOooO);
        removeCallbacks(this.f32835OooOoo);
        ((Oooo000) getCurrentDrawable()).OooO0o0(false, false, false);
        o0OoOo0 indeterminateDrawable = getIndeterminateDrawable();
        OooO0o oooO0o = this.f32839Oooo000;
        if (indeterminateDrawable != null) {
            getIndeterminateDrawable().unregisterAnimationCallback(oooO0o);
            getIndeterminateDrawable().f32903Oooo00o.OooO0o();
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().unregisterAnimationCallback(oooO0o);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        try {
            int iSave = canvas.save();
            if (getPaddingLeft() != 0 || getPaddingTop() != 0) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            if (getPaddingRight() != 0 || getPaddingBottom() != 0) {
                canvas.clipRect(0, 0, getWidth() - (getPaddingLeft() + getPaddingRight()), getHeight() - (getPaddingTop() + getPaddingBottom()));
            }
            getCurrentDrawable().draw(canvas);
            canvas.restoreToCount(iSave);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final synchronized void onMeasure(int i, int i2) {
        try {
            Oooo0 currentDrawingDelegate = getCurrentDrawingDelegate();
            if (currentDrawingDelegate == null) {
                return;
            }
            setMeasuredDimension(currentDrawingDelegate.OooO0o0() < 0 ? ProgressBar.getDefaultSize(getSuggestedMinimumWidth(), i) : currentDrawingDelegate.OooO0o0() + getPaddingLeft() + getPaddingRight(), currentDrawingDelegate.OooO0Oo() < 0 ? ProgressBar.getDefaultSize(getSuggestedMinimumHeight(), i2) : currentDrawingDelegate.OooO0Oo() + getPaddingTop() + getPaddingBottom());
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        boolean z = i == 0;
        if (this.f32829OooOo) {
            ((Oooo000) getCurrentDrawable()).OooO0o0(OooO0OO(), false, z);
        }
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (this.f32829OooOo) {
            ((Oooo000) getCurrentDrawable()).OooO0o0(OooO0OO(), false, false);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @VisibleForTesting
    public void setAnimatorDurationScaleProvider(@NonNull OooO00o oooO00o) {
        this.f32832OooOoO = oooO00o;
        if (getProgressDrawable() != null) {
            getProgressDrawable().f32878OooOo = oooO00o;
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().f32878OooOo = oooO00o;
        }
    }

    public void setHideAnimationBehavior(int i) {
        this.f32830OooOo0O.f32848OooO0o = i;
        invalidate();
    }

    @Override // android.widget.ProgressBar
    public synchronized void setIndeterminate(boolean z) {
        try {
            if (z == isIndeterminate()) {
                return;
            }
            Oooo000 oooo000 = (Oooo000) getCurrentDrawable();
            if (oooo000 != null) {
                oooo000.OooO0o0(false, false, false);
            }
            super.setIndeterminate(z);
            Oooo000 oooo0002 = (Oooo000) getCurrentDrawable();
            if (oooo0002 != null) {
                oooo0002.OooO0o0(OooO0OO(), false, false);
            }
            if ((oooo0002 instanceof o0OoOo0) && OooO0OO()) {
                ((o0OoOo0) oooo0002).f32903Oooo00o.OooO0o0();
            }
            this.f32834OooOoOO = false;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.widget.ProgressBar
    public void setIndeterminateDrawable(@Nullable Drawable drawable) {
        if (drawable == null) {
            super.setIndeterminateDrawable(null);
        } else {
            if (!(drawable instanceof o0OoOo0)) {
                throw new IllegalArgumentException("Cannot set framework drawable as indeterminate drawable.");
            }
            ((Oooo000) drawable).OooO0o0(false, false, false);
            super.setIndeterminateDrawable(drawable);
        }
    }

    public void setIndicatorColor(@ColorInt int... iArr) {
        if (iArr.length == 0) {
            iArr = new int[]{OooO00o.OooO00o.OooOO0O(getContext(), R.attr.colorPrimary, -1)};
        }
        if (Arrays.equals(getIndicatorColor(), iArr)) {
            return;
        }
        this.f32830OooOo0O.f32846OooO0OO = iArr;
        getIndeterminateDrawable().f32903Oooo00o.OooO0O0();
        invalidate();
    }

    @Override // android.widget.ProgressBar
    public synchronized void setProgress(int i) {
        if (isIndeterminate()) {
            return;
        }
        OooO0O0(i);
    }

    @Override // android.widget.ProgressBar
    public void setProgressDrawable(@Nullable Drawable drawable) {
        if (drawable == null) {
            super.setProgressDrawable(null);
        } else {
            if (!(drawable instanceof OooOo00)) {
                throw new IllegalArgumentException("Cannot set framework drawable as progress drawable.");
            }
            OooOo00 oooOo00 = (OooOo00) drawable;
            oooOo00.OooO0o0(false, false, false);
            super.setProgressDrawable(oooOo00);
            oooOo00.setLevel((int) ((getProgress() / getMax()) * 10000.0f));
        }
    }

    public void setShowAnimationBehavior(int i) {
        this.f32830OooOo0O.f32849OooO0o0 = i;
        invalidate();
    }

    public void setTrackColor(@ColorInt int i) {
        OooOO0 oooOO0 = this.f32830OooOo0O;
        if (oooOO0.f32847OooO0Oo != i) {
            oooOO0.f32847OooO0Oo = i;
            invalidate();
        }
    }

    public void setTrackCornerRadius(@Px int i) {
        OooOO0 oooOO0 = this.f32830OooOo0O;
        if (oooOO0.f32845OooO0O0 != i) {
            oooOO0.f32845OooO0O0 = Math.min(i, oooOO0.f32844OooO00o / 2);
        }
    }

    public void setTrackThickness(@Px int i) {
        OooOO0 oooOO0 = this.f32830OooOo0O;
        if (oooOO0.f32844OooO00o != i) {
            oooOO0.f32844OooO00o = i;
            requestLayout();
        }
    }

    public void setVisibilityAfterHide(int i) {
        if (i != 0 && i != 4 && i != 8) {
            throw new IllegalArgumentException("The component's visibility must be one of VISIBLE, INVISIBLE, and GONE defined in View.");
        }
        this.f32836OooOoo0 = i;
    }

    @Override // android.widget.ProgressBar
    @Nullable
    public o0OoOo0 getIndeterminateDrawable() {
        return (o0OoOo0) super.getIndeterminateDrawable();
    }

    @Override // android.widget.ProgressBar
    @Nullable
    public OooOo00 getProgressDrawable() {
        return (OooOo00) super.getProgressDrawable();
    }
}
