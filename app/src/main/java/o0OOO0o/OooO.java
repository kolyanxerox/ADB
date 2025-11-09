package o0OOO0o;

import Ooooo0o.oo0o0O0;
import OooooO0.o00000O;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.Dimension;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.StyleRes;
import androidx.appcompat.C0038R;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.MenuView;
import androidx.core.util.Pools;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.transition.AutoTransition;
import com.google.android.gms.internal.measurement.o0OO00OO;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import o0ooOO0.o000000O;

/* loaded from: classes2.dex */
public abstract class OooO extends ViewGroup implements MenuView {

    /* renamed from: OoooOo0 */
    public static final int[] f32914OoooOo0 = {R.attr.state_checked};

    /* renamed from: OoooOoO */
    public static final int[] f32915OoooOoO = {-16842910};

    /* renamed from: OooOo */
    public final Pools.SynchronizedPool f32916OooOo;

    /* renamed from: OooOo0O */
    public final AutoTransition f32917OooOo0O;

    /* renamed from: OooOo0o */
    public final com.google.android.material.datepicker.OooOo f32918OooOo0o;

    /* renamed from: OooOoO */
    public int f32919OooOoO;

    /* renamed from: OooOoO0 */
    public final SparseArray f32920OooOoO0;

    /* renamed from: OooOoOO */
    public OooO0OO[] f32921OooOoOO;

    /* renamed from: OooOoo */
    public int f32922OooOoo;

    /* renamed from: OooOoo0 */
    public int f32923OooOoo0;

    /* renamed from: OooOooO */
    public ColorStateList f32924OooOooO;

    /* renamed from: OooOooo */
    public int f32925OooOooo;

    /* renamed from: Oooo */
    public boolean f32926Oooo;

    /* renamed from: Oooo0 */
    public int f32927Oooo0;

    /* renamed from: Oooo000 */
    public ColorStateList f32928Oooo000;

    /* renamed from: Oooo00O */
    public final ColorStateList f32929Oooo00O;

    /* renamed from: Oooo00o */
    public int f32930Oooo00o;

    /* renamed from: Oooo0O0 */
    public Drawable f32931Oooo0O0;

    /* renamed from: Oooo0OO */
    public ColorStateList f32932Oooo0OO;

    /* renamed from: Oooo0o */
    public final SparseArray f32933Oooo0o;

    /* renamed from: Oooo0o0 */
    public int f32934Oooo0o0;

    /* renamed from: Oooo0oO */
    public int f32935Oooo0oO;

    /* renamed from: Oooo0oo */
    public int f32936Oooo0oo;

    /* renamed from: OoooO */
    public o000000.Oooo000 f32937OoooO;

    /* renamed from: OoooO0 */
    public int f32938OoooO0;

    /* renamed from: OoooO00 */
    public int f32939OoooO00;

    /* renamed from: OoooO0O */
    public int f32940OoooO0O;

    /* renamed from: OoooOO0 */
    public boolean f32941OoooOO0;

    /* renamed from: OoooOOO */
    public OooOO0O f32942OoooOOO;

    /* renamed from: OoooOOo */
    public MenuBuilder f32943OoooOOo;
    public ColorStateList o000oOoO;

    public OooO(Context context) {
        super(context);
        this.f32916OooOo = new Pools.SynchronizedPool(5);
        this.f32920OooOoO0 = new SparseArray(5);
        this.f32923OooOoo0 = 0;
        this.f32922OooOoo = 0;
        this.f32933Oooo0o = new SparseArray(5);
        this.f32935Oooo0oO = -1;
        this.f32936Oooo0oo = -1;
        this.f32941OoooOO0 = false;
        this.f32929Oooo00O = OooO0O0();
        if (isInEditMode()) {
            this.f32917OooOo0O = null;
        } else {
            AutoTransition autoTransition = new AutoTransition();
            this.f32917OooOo0O = autoTransition;
            autoTransition.setOrdering(0);
            autoTransition.setDuration(o0OO00OO.OooOoo0(getContext(), com.github.superadb.R.attr.motionDurationLong1, getResources().getInteger(com.github.superadb.R.integer.material_motion_duration_long_1)));
            autoTransition.setInterpolator(o0OO00OO.OooOoo(getContext(), com.github.superadb.R.attr.motionEasingStandard, oo0o0O0.f15016OooO0O0));
            autoTransition.addTransition(new o000000O());
        }
        this.f32918OooOo0o = new com.google.android.material.datepicker.OooOo(this, 2);
        ViewCompat.setImportantForAccessibility(this, 1);
    }

    public static boolean OooO0o0(int i, int i2) {
        return i == -1 ? i2 > 3 : i == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private OooO0OO getNewItem() {
        OooO0OO oooO0OO = (OooO0OO) this.f32916OooOo.acquire();
        return oooO0OO == null ? OooO0Oo(getContext()) : oooO0OO;
    }

    private void setBadgeIfNeeded(@NonNull OooO0OO oooO0OO) throws Resources.NotFoundException {
        o00000O o00000o;
        int id = oooO0OO.getId();
        if (id == -1 || (o00000o = (o00000O) this.f32933Oooo0o.get(id)) == null) {
            return;
        }
        oooO0OO.setBadge(o00000o);
    }

    public final void OooO00o() throws Resources.NotFoundException {
        removeAllViews();
        OooO0OO[] oooO0OOArr = this.f32921OooOoOO;
        if (oooO0OOArr != null) {
            for (OooO0OO oooO0OO : oooO0OOArr) {
                if (oooO0OO != null) {
                    this.f32916OooOo.release(oooO0OO);
                    if (oooO0OO.f32977OoooOo0 != null) {
                        ImageView imageView = oooO0OO.f32963Oooo00o;
                        if (imageView != null) {
                            oooO0OO.setClipChildren(true);
                            oooO0OO.setClipToPadding(true);
                            o00000O o00000o = oooO0OO.f32977OoooOo0;
                            if (o00000o != null) {
                                WeakReference weakReference = o00000o.f15033Oooo00o;
                                if ((weakReference != null ? (FrameLayout) weakReference.get() : null) != null) {
                                    WeakReference weakReference2 = o00000o.f15033Oooo00o;
                                    (weakReference2 != null ? (FrameLayout) weakReference2.get() : null).setForeground(null);
                                } else {
                                    imageView.getOverlay().remove(o00000o);
                                }
                            }
                        }
                        oooO0OO.f32977OoooOo0 = null;
                    }
                    oooO0OO.f32966Oooo0o = null;
                    oooO0OO.f32973OoooO0O = 0.0f;
                    oooO0OO.f32950OooOo0O = false;
                }
            }
        }
        if (this.f32943OoooOOo.size() == 0) {
            this.f32923OooOoo0 = 0;
            this.f32922OooOoo = 0;
            this.f32921OooOoOO = null;
            return;
        }
        HashSet hashSet = new HashSet();
        for (int i = 0; i < this.f32943OoooOOo.size(); i++) {
            hashSet.add(Integer.valueOf(this.f32943OoooOOo.getItem(i).getItemId()));
        }
        int i2 = 0;
        while (true) {
            SparseArray sparseArray = this.f32933Oooo0o;
            if (i2 >= sparseArray.size()) {
                break;
            }
            int iKeyAt = sparseArray.keyAt(i2);
            if (!hashSet.contains(Integer.valueOf(iKeyAt))) {
                sparseArray.delete(iKeyAt);
            }
            i2++;
        }
        this.f32921OooOoOO = new OooO0OO[this.f32943OoooOOo.size()];
        boolean zOooO0o0 = OooO0o0(this.f32919OooOoO, this.f32943OoooOOo.getVisibleItems().size());
        for (int i3 = 0; i3 < this.f32943OoooOOo.size(); i3++) {
            this.f32942OoooOOO.f32984OooOo0o = true;
            this.f32943OoooOOo.getItem(i3).setCheckable(true);
            this.f32942OoooOOO.f32984OooOo0o = false;
            OooO0OO newItem = getNewItem();
            this.f32921OooOoOO[i3] = newItem;
            newItem.setIconTintList(this.f32924OooOooO);
            newItem.setIconSize(this.f32925OooOooo);
            newItem.setTextColor(this.f32929Oooo00O);
            newItem.setTextAppearanceInactive(this.f32930Oooo00o);
            newItem.setTextAppearanceActive(this.f32927Oooo0);
            newItem.setTextColor(this.f32928Oooo000);
            int i4 = this.f32935Oooo0oO;
            if (i4 != -1) {
                newItem.setItemPaddingTop(i4);
            }
            int i5 = this.f32936Oooo0oo;
            if (i5 != -1) {
                newItem.setItemPaddingBottom(i5);
            }
            newItem.setActiveIndicatorWidth(this.f32939OoooO00);
            newItem.setActiveIndicatorHeight(this.f32938OoooO0);
            newItem.setActiveIndicatorMarginHorizontal(this.f32940OoooO0O);
            newItem.setActiveIndicatorDrawable(OooO0OO());
            newItem.setActiveIndicatorResizeable(this.f32941OoooOO0);
            newItem.setActiveIndicatorEnabled(this.f32926Oooo);
            Drawable drawable = this.f32931Oooo0O0;
            if (drawable != null) {
                newItem.setItemBackground(drawable);
            } else {
                newItem.setItemBackground(this.f32934Oooo0o0);
            }
            newItem.setItemRippleColor(this.f32932Oooo0OO);
            newItem.setShifting(zOooO0o0);
            newItem.setLabelVisibilityMode(this.f32919OooOoO);
            MenuItemImpl menuItemImpl = (MenuItemImpl) this.f32943OoooOOo.getItem(i3);
            newItem.initialize(menuItemImpl, 0);
            newItem.setItemPosition(i3);
            int itemId = menuItemImpl.getItemId();
            newItem.setOnTouchListener((View.OnTouchListener) this.f32920OooOoO0.get(itemId));
            newItem.setOnClickListener(this.f32918OooOo0o);
            int i6 = this.f32923OooOoo0;
            if (i6 != 0 && itemId == i6) {
                this.f32922OooOoo = i3;
            }
            setBadgeIfNeeded(newItem);
            addView(newItem);
        }
        int iMin = Math.min(this.f32943OoooOOo.size() - 1, this.f32922OooOoo);
        this.f32922OooOoo = iMin;
        this.f32943OoooOOo.getItem(iMin).setChecked(true);
    }

    public final ColorStateList OooO0O0() {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(R.attr.textColorSecondary, typedValue, true)) {
            return null;
        }
        ColorStateList colorStateList = AppCompatResources.getColorStateList(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(C0038R.attr.colorPrimary, typedValue, true)) {
            return null;
        }
        int i = typedValue.data;
        int defaultColor = colorStateList.getDefaultColor();
        int[] iArr = f32915OoooOoO;
        return new ColorStateList(new int[][]{iArr, f32914OoooOo0, ViewGroup.EMPTY_STATE_SET}, new int[]{colorStateList.getColorForState(iArr, defaultColor), i, defaultColor});
    }

    public final o000000.OooOOO0 OooO0OO() {
        if (this.f32937OoooO == null || this.o000oOoO == null) {
            return null;
        }
        o000000.OooOOO0 oooOOO0 = new o000000.OooOOO0(this.f32937OoooO);
        oooOOO0.OooOOO0(this.o000oOoO);
        return oooOOO0;
    }

    public abstract OooO0OO OooO0Oo(Context context);

    public SparseArray<o00000O> getBadgeDrawables() {
        return this.f32933Oooo0o;
    }

    @Nullable
    public ColorStateList getIconTintList() {
        return this.f32924OooOooO;
    }

    @Nullable
    public ColorStateList getItemActiveIndicatorColor() {
        return this.o000oOoO;
    }

    public boolean getItemActiveIndicatorEnabled() {
        return this.f32926Oooo;
    }

    @Px
    public int getItemActiveIndicatorHeight() {
        return this.f32938OoooO0;
    }

    @Px
    public int getItemActiveIndicatorMarginHorizontal() {
        return this.f32940OoooO0O;
    }

    @Nullable
    public o000000.Oooo000 getItemActiveIndicatorShapeAppearance() {
        return this.f32937OoooO;
    }

    @Px
    public int getItemActiveIndicatorWidth() {
        return this.f32939OoooO00;
    }

    @Nullable
    public Drawable getItemBackground() {
        OooO0OO[] oooO0OOArr = this.f32921OooOoOO;
        return (oooO0OOArr == null || oooO0OOArr.length <= 0) ? this.f32931Oooo0O0 : oooO0OOArr[0].getBackground();
    }

    @Deprecated
    public int getItemBackgroundRes() {
        return this.f32934Oooo0o0;
    }

    @Dimension
    public int getItemIconSize() {
        return this.f32925OooOooo;
    }

    @Px
    public int getItemPaddingBottom() {
        return this.f32936Oooo0oo;
    }

    @Px
    public int getItemPaddingTop() {
        return this.f32935Oooo0oO;
    }

    @Nullable
    public ColorStateList getItemRippleColor() {
        return this.f32932Oooo0OO;
    }

    @StyleRes
    public int getItemTextAppearanceActive() {
        return this.f32927Oooo0;
    }

    @StyleRes
    public int getItemTextAppearanceInactive() {
        return this.f32930Oooo00o;
    }

    @Nullable
    public ColorStateList getItemTextColor() {
        return this.f32928Oooo000;
    }

    public int getLabelVisibilityMode() {
        return this.f32919OooOoO;
    }

    @Nullable
    public MenuBuilder getMenu() {
        return this.f32943OoooOOo;
    }

    public int getSelectedItemId() {
        return this.f32923OooOoo0;
    }

    public int getSelectedItemPosition() {
        return this.f32922OooOoo;
    }

    @Override // androidx.appcompat.view.menu.MenuView
    public int getWindowAnimations() {
        return 0;
    }

    @Override // androidx.appcompat.view.menu.MenuView
    public final void initialize(MenuBuilder menuBuilder) {
        this.f32943OoooOOo = menuBuilder;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        AccessibilityNodeInfoCompat.wrap(accessibilityNodeInfo).setCollectionInfo(AccessibilityNodeInfoCompat.CollectionInfoCompat.obtain(1, this.f32943OoooOOo.getVisibleItems().size(), false, 1));
    }

    public void setIconTintList(@Nullable ColorStateList colorStateList) {
        this.f32924OooOooO = colorStateList;
        OooO0OO[] oooO0OOArr = this.f32921OooOoOO;
        if (oooO0OOArr != null) {
            for (OooO0OO oooO0OO : oooO0OOArr) {
                oooO0OO.setIconTintList(colorStateList);
            }
        }
    }

    public void setItemActiveIndicatorColor(@Nullable ColorStateList colorStateList) {
        this.o000oOoO = colorStateList;
        OooO0OO[] oooO0OOArr = this.f32921OooOoOO;
        if (oooO0OOArr != null) {
            for (OooO0OO oooO0OO : oooO0OOArr) {
                oooO0OO.setActiveIndicatorDrawable(OooO0OO());
            }
        }
    }

    public void setItemActiveIndicatorEnabled(boolean z) {
        this.f32926Oooo = z;
        OooO0OO[] oooO0OOArr = this.f32921OooOoOO;
        if (oooO0OOArr != null) {
            for (OooO0OO oooO0OO : oooO0OOArr) {
                oooO0OO.setActiveIndicatorEnabled(z);
            }
        }
    }

    public void setItemActiveIndicatorHeight(@Px int i) {
        this.f32938OoooO0 = i;
        OooO0OO[] oooO0OOArr = this.f32921OooOoOO;
        if (oooO0OOArr != null) {
            for (OooO0OO oooO0OO : oooO0OOArr) {
                oooO0OO.setActiveIndicatorHeight(i);
            }
        }
    }

    public void setItemActiveIndicatorMarginHorizontal(@Px int i) {
        this.f32940OoooO0O = i;
        OooO0OO[] oooO0OOArr = this.f32921OooOoOO;
        if (oooO0OOArr != null) {
            for (OooO0OO oooO0OO : oooO0OOArr) {
                oooO0OO.setActiveIndicatorMarginHorizontal(i);
            }
        }
    }

    public void setItemActiveIndicatorResizeable(boolean z) {
        this.f32941OoooOO0 = z;
        OooO0OO[] oooO0OOArr = this.f32921OooOoOO;
        if (oooO0OOArr != null) {
            for (OooO0OO oooO0OO : oooO0OOArr) {
                oooO0OO.setActiveIndicatorResizeable(z);
            }
        }
    }

    public void setItemActiveIndicatorShapeAppearance(@Nullable o000000.Oooo000 oooo000) {
        this.f32937OoooO = oooo000;
        OooO0OO[] oooO0OOArr = this.f32921OooOoOO;
        if (oooO0OOArr != null) {
            for (OooO0OO oooO0OO : oooO0OOArr) {
                oooO0OO.setActiveIndicatorDrawable(OooO0OO());
            }
        }
    }

    public void setItemActiveIndicatorWidth(@Px int i) {
        this.f32939OoooO00 = i;
        OooO0OO[] oooO0OOArr = this.f32921OooOoOO;
        if (oooO0OOArr != null) {
            for (OooO0OO oooO0OO : oooO0OOArr) {
                oooO0OO.setActiveIndicatorWidth(i);
            }
        }
    }

    public void setItemBackground(@Nullable Drawable drawable) {
        this.f32931Oooo0O0 = drawable;
        OooO0OO[] oooO0OOArr = this.f32921OooOoOO;
        if (oooO0OOArr != null) {
            for (OooO0OO oooO0OO : oooO0OOArr) {
                oooO0OO.setItemBackground(drawable);
            }
        }
    }

    public void setItemBackgroundRes(int i) {
        this.f32934Oooo0o0 = i;
        OooO0OO[] oooO0OOArr = this.f32921OooOoOO;
        if (oooO0OOArr != null) {
            for (OooO0OO oooO0OO : oooO0OOArr) {
                oooO0OO.setItemBackground(i);
            }
        }
    }

    public void setItemIconSize(@Dimension int i) {
        this.f32925OooOooo = i;
        OooO0OO[] oooO0OOArr = this.f32921OooOoOO;
        if (oooO0OOArr != null) {
            for (OooO0OO oooO0OO : oooO0OOArr) {
                oooO0OO.setIconSize(i);
            }
        }
    }

    public void setItemPaddingBottom(@Px int i) {
        this.f32936Oooo0oo = i;
        OooO0OO[] oooO0OOArr = this.f32921OooOoOO;
        if (oooO0OOArr != null) {
            for (OooO0OO oooO0OO : oooO0OOArr) {
                oooO0OO.setItemPaddingBottom(i);
            }
        }
    }

    public void setItemPaddingTop(@Px int i) {
        this.f32935Oooo0oO = i;
        OooO0OO[] oooO0OOArr = this.f32921OooOoOO;
        if (oooO0OOArr != null) {
            for (OooO0OO oooO0OO : oooO0OOArr) {
                oooO0OO.setItemPaddingTop(i);
            }
        }
    }

    public void setItemRippleColor(@Nullable ColorStateList colorStateList) {
        this.f32932Oooo0OO = colorStateList;
        OooO0OO[] oooO0OOArr = this.f32921OooOoOO;
        if (oooO0OOArr != null) {
            for (OooO0OO oooO0OO : oooO0OOArr) {
                oooO0OO.setItemRippleColor(colorStateList);
            }
        }
    }

    public void setItemTextAppearanceActive(@StyleRes int i) throws Resources.NotFoundException {
        this.f32927Oooo0 = i;
        OooO0OO[] oooO0OOArr = this.f32921OooOoOO;
        if (oooO0OOArr != null) {
            for (OooO0OO oooO0OO : oooO0OOArr) {
                oooO0OO.setTextAppearanceActive(i);
                ColorStateList colorStateList = this.f32928Oooo000;
                if (colorStateList != null) {
                    oooO0OO.setTextColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextAppearanceInactive(@StyleRes int i) throws Resources.NotFoundException {
        this.f32930Oooo00o = i;
        OooO0OO[] oooO0OOArr = this.f32921OooOoOO;
        if (oooO0OOArr != null) {
            for (OooO0OO oooO0OO : oooO0OOArr) {
                oooO0OO.setTextAppearanceInactive(i);
                ColorStateList colorStateList = this.f32928Oooo000;
                if (colorStateList != null) {
                    oooO0OO.setTextColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextColor(@Nullable ColorStateList colorStateList) {
        this.f32928Oooo000 = colorStateList;
        OooO0OO[] oooO0OOArr = this.f32921OooOoOO;
        if (oooO0OOArr != null) {
            for (OooO0OO oooO0OO : oooO0OOArr) {
                oooO0OO.setTextColor(colorStateList);
            }
        }
    }

    public void setLabelVisibilityMode(int i) {
        this.f32919OooOoO = i;
    }

    public void setPresenter(@NonNull OooOO0O oooOO0O) {
        this.f32942OoooOOO = oooOO0O;
    }
}
