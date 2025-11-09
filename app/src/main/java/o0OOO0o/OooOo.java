package o0OOO0o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.FrameLayout;
import androidx.annotation.DimenRes;
import androidx.annotation.Dimension;
import androidx.annotation.DrawableRes;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.appcompat.view.SupportMenuInflater;
import androidx.appcompat.view.menu.MenuView;
import androidx.appcompat.widget.TintTypedArray;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.ViewCompat;
import com.github.superadb.R;
import o0ooOO0.o00000O0;

/* loaded from: classes2.dex */
public abstract class OooOo extends FrameLayout {

    /* renamed from: OooOo, reason: collision with root package name */
    public final OooOO0O f32986OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final OooO0o f32987OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final OooO f32988OooOo0o;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public SupportMenuInflater f32989OooOoO0;

    public OooOo(Context context, AttributeSet attributeSet, int i, int i2) throws Resources.NotFoundException {
        super(o00000O.OooO00o.OooO00o(context, attributeSet, i, i2), attributeSet, i);
        OooOO0O oooOO0O = new OooOO0O();
        oooOO0O.f32984OooOo0o = false;
        this.f32986OooOo = oooOO0O;
        Context context2 = getContext();
        TintTypedArray tintTypedArrayOooO0o0 = o00000O0.OooO0o0(context2, attributeSet, Ooooo00.OooOo.f14986Oooo0o, i, i2, 10, 9);
        OooO0o oooO0o = new OooO0o(context2, getClass(), getMaxItemCount());
        this.f32987OooOo0O = oooO0o;
        OooO oooOOooO00o = OooO00o(context2);
        this.f32988OooOo0o = oooOOooO00o;
        oooOO0O.f32983OooOo0O = oooOOooO00o;
        oooOO0O.f32982OooOo = 1;
        oooOOooO00o.setPresenter(oooOO0O);
        oooO0o.addMenuPresenter(oooOO0O);
        getContext();
        oooOO0O.f32983OooOo0O.f32943OoooOOo = oooO0o;
        if (tintTypedArrayOooO0o0.hasValue(5)) {
            oooOOooO00o.setIconTintList(tintTypedArrayOooO0o0.getColorStateList(5));
        } else {
            oooOOooO00o.setIconTintList(oooOOooO00o.OooO0O0());
        }
        setItemIconSize(tintTypedArrayOooO0o0.getDimensionPixelSize(4, getResources().getDimensionPixelSize(R.dimen.mtrl_navigation_bar_item_default_icon_size)));
        if (tintTypedArrayOooO0o0.hasValue(10)) {
            setItemTextAppearanceInactive(tintTypedArrayOooO0o0.getResourceId(10, 0));
        }
        if (tintTypedArrayOooO0o0.hasValue(9)) {
            setItemTextAppearanceActive(tintTypedArrayOooO0o0.getResourceId(9, 0));
        }
        if (tintTypedArrayOooO0o0.hasValue(11)) {
            setItemTextColor(tintTypedArrayOooO0o0.getColorStateList(11));
        }
        if (getBackground() == null || (getBackground() instanceof ColorDrawable)) {
            o000000.OooOOO0 oooOOO0 = new o000000.OooOOO0();
            Drawable background = getBackground();
            if (background instanceof ColorDrawable) {
                oooOOO0.OooOOO0(ColorStateList.valueOf(((ColorDrawable) background).getColor()));
            }
            oooOOO0.OooOO0O(context2);
            ViewCompat.setBackground(this, oooOOO0);
        }
        if (tintTypedArrayOooO0o0.hasValue(7)) {
            setItemPaddingTop(tintTypedArrayOooO0o0.getDimensionPixelSize(7, 0));
        }
        if (tintTypedArrayOooO0o0.hasValue(6)) {
            setItemPaddingBottom(tintTypedArrayOooO0o0.getDimensionPixelSize(6, 0));
        }
        if (tintTypedArrayOooO0o0.hasValue(1)) {
            setElevation(tintTypedArrayOooO0o0.getDimensionPixelSize(1, 0));
        }
        DrawableCompat.setTintList(getBackground().mutate(), oo0o0Oo.OooO0OO.OooO0O0(context2, tintTypedArrayOooO0o0, 0));
        setLabelVisibilityMode(tintTypedArrayOooO0o0.getInteger(12, -1));
        int resourceId = tintTypedArrayOooO0o0.getResourceId(3, 0);
        if (resourceId != 0) {
            oooOOooO00o.setItemBackgroundRes(resourceId);
        } else {
            setItemRippleColor(oo0o0Oo.OooO0OO.OooO0O0(context2, tintTypedArrayOooO0o0, 8));
        }
        int resourceId2 = tintTypedArrayOooO0o0.getResourceId(2, 0);
        if (resourceId2 != 0) {
            setItemActiveIndicatorEnabled(true);
            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(resourceId2, Ooooo00.OooOo.f14987Oooo0o0);
            setItemActiveIndicatorWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0));
            setItemActiveIndicatorHeight(typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0));
            setItemActiveIndicatorMarginHorizontal(typedArrayObtainStyledAttributes.getDimensionPixelOffset(3, 0));
            setItemActiveIndicatorColor(oo0o0Oo.OooO0OO.OooO00o(context2, typedArrayObtainStyledAttributes, 2));
            setItemActiveIndicatorShapeAppearance(o000000.Oooo000.OooO00o(context2, typedArrayObtainStyledAttributes.getResourceId(4, 0), 0, new o000000.OooO00o(0)).OooO00o());
            typedArrayObtainStyledAttributes.recycle();
        }
        if (tintTypedArrayOooO0o0.hasValue(13)) {
            int resourceId3 = tintTypedArrayOooO0o0.getResourceId(13, 0);
            oooOO0O.f32984OooOo0o = true;
            getMenuInflater().inflate(resourceId3, oooO0o);
            oooOO0O.f32984OooOo0o = false;
            oooOO0O.updateMenuView(true);
        }
        tintTypedArrayOooO0o0.recycle();
        addView(oooOOooO00o);
        oooO0o.setCallback(new OooOOO0(this));
    }

    private MenuInflater getMenuInflater() {
        if (this.f32989OooOoO0 == null) {
            this.f32989OooOoO0 = new SupportMenuInflater(getContext());
        }
        return this.f32989OooOoO0;
    }

    public abstract OooO OooO00o(Context context);

    @Nullable
    public ColorStateList getItemActiveIndicatorColor() {
        return this.f32988OooOo0o.getItemActiveIndicatorColor();
    }

    @Px
    public int getItemActiveIndicatorHeight() {
        return this.f32988OooOo0o.getItemActiveIndicatorHeight();
    }

    @Px
    public int getItemActiveIndicatorMarginHorizontal() {
        return this.f32988OooOo0o.getItemActiveIndicatorMarginHorizontal();
    }

    @Nullable
    public o000000.Oooo000 getItemActiveIndicatorShapeAppearance() {
        return this.f32988OooOo0o.getItemActiveIndicatorShapeAppearance();
    }

    @Px
    public int getItemActiveIndicatorWidth() {
        return this.f32988OooOo0o.getItemActiveIndicatorWidth();
    }

    @Nullable
    public Drawable getItemBackground() {
        return this.f32988OooOo0o.getItemBackground();
    }

    @DrawableRes
    @Deprecated
    public int getItemBackgroundResource() {
        return this.f32988OooOo0o.getItemBackgroundRes();
    }

    @Dimension
    public int getItemIconSize() {
        return this.f32988OooOo0o.getItemIconSize();
    }

    @Nullable
    public ColorStateList getItemIconTintList() {
        return this.f32988OooOo0o.getIconTintList();
    }

    @Px
    public int getItemPaddingBottom() {
        return this.f32988OooOo0o.getItemPaddingBottom();
    }

    @Px
    public int getItemPaddingTop() {
        return this.f32988OooOo0o.getItemPaddingTop();
    }

    @Nullable
    public ColorStateList getItemRippleColor() {
        return this.f32988OooOo0o.getItemRippleColor();
    }

    @StyleRes
    public int getItemTextAppearanceActive() {
        return this.f32988OooOo0o.getItemTextAppearanceActive();
    }

    @StyleRes
    public int getItemTextAppearanceInactive() {
        return this.f32988OooOo0o.getItemTextAppearanceInactive();
    }

    @Nullable
    public ColorStateList getItemTextColor() {
        return this.f32988OooOo0o.getItemTextColor();
    }

    public int getLabelVisibilityMode() {
        return this.f32988OooOo0o.getLabelVisibilityMode();
    }

    public abstract int getMaxItemCount();

    @NonNull
    public Menu getMenu() {
        return this.f32987OooOo0O;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public MenuView getMenuView() {
        return this.f32988OooOo0o;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public OooOO0O getPresenter() {
        return this.f32986OooOo;
    }

    @IdRes
    public int getSelectedItemId() {
        return this.f32988OooOo0o.getSelectedItemId();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Oooo0o0.OooO.OooOo0O(this);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof OooOo00)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        OooOo00 oooOo00 = (OooOo00) parcelable;
        super.onRestoreInstanceState(oooOo00.getSuperState());
        this.f32987OooOo0O.restorePresenterStates(oooOo00.f32990OooOo0O);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        OooOo00 oooOo00 = new OooOo00(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        oooOo00.f32990OooOo0O = bundle;
        this.f32987OooOo0O.savePresenterStates(bundle);
        return oooOo00;
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        Oooo0o0.OooO.OooOo00(this, f);
    }

    public void setItemActiveIndicatorColor(@Nullable ColorStateList colorStateList) {
        this.f32988OooOo0o.setItemActiveIndicatorColor(colorStateList);
    }

    public void setItemActiveIndicatorEnabled(boolean z) {
        this.f32988OooOo0o.setItemActiveIndicatorEnabled(z);
    }

    public void setItemActiveIndicatorHeight(@Px int i) {
        this.f32988OooOo0o.setItemActiveIndicatorHeight(i);
    }

    public void setItemActiveIndicatorMarginHorizontal(@Px int i) {
        this.f32988OooOo0o.setItemActiveIndicatorMarginHorizontal(i);
    }

    public void setItemActiveIndicatorShapeAppearance(@Nullable o000000.Oooo000 oooo000) {
        this.f32988OooOo0o.setItemActiveIndicatorShapeAppearance(oooo000);
    }

    public void setItemActiveIndicatorWidth(@Px int i) {
        this.f32988OooOo0o.setItemActiveIndicatorWidth(i);
    }

    public void setItemBackground(@Nullable Drawable drawable) {
        this.f32988OooOo0o.setItemBackground(drawable);
    }

    public void setItemBackgroundResource(@DrawableRes int i) {
        this.f32988OooOo0o.setItemBackgroundRes(i);
    }

    public void setItemIconSize(@Dimension int i) {
        this.f32988OooOo0o.setItemIconSize(i);
    }

    public void setItemIconSizeRes(@DimenRes int i) {
        setItemIconSize(getResources().getDimensionPixelSize(i));
    }

    public void setItemIconTintList(@Nullable ColorStateList colorStateList) {
        this.f32988OooOo0o.setIconTintList(colorStateList);
    }

    public void setItemPaddingBottom(@Px int i) {
        this.f32988OooOo0o.setItemPaddingBottom(i);
    }

    public void setItemPaddingTop(@Px int i) {
        this.f32988OooOo0o.setItemPaddingTop(i);
    }

    public void setItemRippleColor(@Nullable ColorStateList colorStateList) {
        this.f32988OooOo0o.setItemRippleColor(colorStateList);
    }

    public void setItemTextAppearanceActive(@StyleRes int i) throws Resources.NotFoundException {
        this.f32988OooOo0o.setItemTextAppearanceActive(i);
    }

    public void setItemTextAppearanceInactive(@StyleRes int i) throws Resources.NotFoundException {
        this.f32988OooOo0o.setItemTextAppearanceInactive(i);
    }

    public void setItemTextColor(@Nullable ColorStateList colorStateList) {
        this.f32988OooOo0o.setItemTextColor(colorStateList);
    }

    public void setLabelVisibilityMode(int i) throws Resources.NotFoundException {
        OooO oooO = this.f32988OooOo0o;
        if (oooO.getLabelVisibilityMode() != i) {
            oooO.setLabelVisibilityMode(i);
            this.f32986OooOo.updateMenuView(false);
        }
    }

    public void setSelectedItemId(@IdRes int i) {
        OooO0o oooO0o = this.f32987OooOo0O;
        MenuItem menuItemFindItem = oooO0o.findItem(i);
        if (menuItemFindItem == null || oooO0o.performItemAction(menuItemFindItem, this.f32986OooOo, 0)) {
            return;
        }
        menuItemFindItem.setChecked(true);
    }

    public void setOnItemReselectedListener(@Nullable OooOOO oooOOO) {
    }

    public void setOnItemSelectedListener(@Nullable OooOOOO oooOOOO) {
    }
}
