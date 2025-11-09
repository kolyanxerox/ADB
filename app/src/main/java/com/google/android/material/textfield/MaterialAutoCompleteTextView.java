package com.google.android.material.textfield;

import Ooooo00.OooOo;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.Filterable;
import android.widget.ListAdapter;
import androidx.annotation.ArrayRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.ListPopupWindow;
import com.github.superadb.R;
import java.lang.reflect.InvocationTargetException;
import java.util.Locale;
import o00000O.OooO00o;
import o00000O0.o00O0O;
import o00000O0.o00Oo0;
import o0ooOO0.o00000O0;
import oo0o0Oo.OooO0OO;

/* loaded from: classes2.dex */
public class MaterialAutoCompleteTextView extends AppCompatAutoCompleteTextView {

    /* renamed from: OooOo, reason: collision with root package name */
    public final Rect f27867OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final ListPopupWindow f27868OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final AccessibilityManager f27869OooOo0o;

    /* renamed from: OooOoO, reason: collision with root package name */
    public final float f27870OooOoO;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final int f27871OooOoO0;

    /* renamed from: OooOoOO, reason: collision with root package name */
    public int f27872OooOoOO;

    /* renamed from: OooOoo0, reason: collision with root package name */
    public ColorStateList f27873OooOoo0;

    public MaterialAutoCompleteTextView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.autoCompleteTextViewStyle);
    }

    public static void OooO00o(MaterialAutoCompleteTextView materialAutoCompleteTextView, Object obj) {
        materialAutoCompleteTextView.setText(materialAutoCompleteTextView.convertSelectionToString(obj), false);
    }

    public final TextInputLayout OooO0O0() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    @Override // android.widget.TextView
    @Nullable
    public CharSequence getHint() {
        TextInputLayout textInputLayoutOooO0O0 = OooO0O0();
        return (textInputLayoutOooO0O0 == null || !textInputLayoutOooO0O0.f27903OoooOOO) ? super.getHint() : textInputLayoutOooO0O0.getHint();
    }

    public float getPopupElevation() {
        return this.f27870OooOoO;
    }

    public int getSimpleItemSelectedColor() {
        return this.f27872OooOoOO;
    }

    @Nullable
    public ColorStateList getSimpleItemSelectedRippleColor() {
        return this.f27873OooOoo0;
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout textInputLayoutOooO0O0 = OooO0O0();
        if (textInputLayoutOooO0O0 != null && textInputLayoutOooO0O0.f27903OoooOOO && super.getHint() == null && Build.MANUFACTURER.toLowerCase(Locale.ENGLISH).equals("meizu")) {
            setHint("");
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            int measuredWidth = getMeasuredWidth();
            ListAdapter adapter = getAdapter();
            TextInputLayout textInputLayoutOooO0O0 = OooO0O0();
            int measuredWidth2 = 0;
            if (adapter != null && textInputLayoutOooO0O0 != null) {
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
                int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
                ListPopupWindow listPopupWindow = this.f27868OooOo0O;
                int iMin = Math.min(adapter.getCount(), Math.max(0, listPopupWindow.getSelectedItemPosition()) + 15);
                View view = null;
                int iMax = 0;
                for (int iMax2 = Math.max(0, iMin - 15); iMax2 < iMin; iMax2++) {
                    int itemViewType = adapter.getItemViewType(iMax2);
                    if (itemViewType != measuredWidth2) {
                        view = null;
                        measuredWidth2 = itemViewType;
                    }
                    view = adapter.getView(iMax2, view, textInputLayoutOooO0O0);
                    if (view.getLayoutParams() == null) {
                        view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                    }
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    iMax = Math.max(iMax, view.getMeasuredWidth());
                }
                Drawable background = listPopupWindow.getBackground();
                if (background != null) {
                    Rect rect = this.f27867OooOo;
                    background.getPadding(rect);
                    iMax += rect.left + rect.right;
                }
                measuredWidth2 = textInputLayoutOooO0O0.getEndIconView().getMeasuredWidth() + iMax;
            }
            setMeasuredDimension(Math.min(Math.max(measuredWidth, measuredWidth2), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(@Nullable T t) {
        super.setAdapter(t);
        this.f27868OooOo0O.setAdapter(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public void setOnItemSelectedListener(@Nullable AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        this.f27868OooOo0O.setOnItemSelectedListener(getOnItemSelectedListener());
    }

    @Override // android.widget.TextView
    public void setRawInputType(int i) {
        super.setRawInputType(i);
        TextInputLayout textInputLayoutOooO0O0 = OooO0O0();
        if (textInputLayoutOooO0O0 != null) {
            textInputLayoutOooO0O0.OooOOo0();
        }
    }

    public void setSimpleItemSelectedColor(int i) {
        this.f27872OooOoOO = i;
        if (getAdapter() instanceof o00Oo0) {
            ((o00Oo0) getAdapter()).OooO00o();
        }
    }

    public void setSimpleItemSelectedRippleColor(@Nullable ColorStateList colorStateList) {
        this.f27873OooOoo0 = colorStateList;
        if (getAdapter() instanceof o00Oo0) {
            ((o00Oo0) getAdapter()).OooO00o();
        }
    }

    public void setSimpleItems(@ArrayRes int i) {
        setSimpleItems(getResources().getStringArray(i));
    }

    @Override // android.widget.AutoCompleteTextView
    public final void showDropDown() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        AccessibilityManager accessibilityManager = this.f27869OooOo0o;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            super.showDropDown();
        } else {
            this.f27868OooOo0O.show();
        }
    }

    public MaterialAutoCompleteTextView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(OooO00o.OooO00o(context, attributeSet, i, 0), attributeSet, i);
        this.f27867OooOo = new Rect();
        Context context2 = getContext();
        TypedArray typedArrayOooO0Oo = o00000O0.OooO0Oo(context2, attributeSet, OooOo.f14968OooOo, i, R.style.Widget_AppCompat_AutoCompleteTextView, new int[0]);
        if (typedArrayOooO0Oo.hasValue(0) && typedArrayOooO0Oo.getInt(0, 0) == 0) {
            setKeyListener(null);
        }
        this.f27871OooOoO0 = typedArrayOooO0Oo.getResourceId(2, R.layout.mtrl_auto_complete_simple_item);
        this.f27870OooOoO = typedArrayOooO0Oo.getDimensionPixelOffset(1, R.dimen.mtrl_exposed_dropdown_menu_popup_elevation);
        this.f27872OooOoOO = typedArrayOooO0Oo.getColor(3, 0);
        this.f27873OooOoo0 = OooO0OO.OooO00o(context2, typedArrayOooO0Oo, 4);
        this.f27869OooOo0o = (AccessibilityManager) context2.getSystemService("accessibility");
        ListPopupWindow listPopupWindow = new ListPopupWindow(context2);
        this.f27868OooOo0O = listPopupWindow;
        listPopupWindow.setModal(true);
        listPopupWindow.setAnchorView(this);
        listPopupWindow.setInputMethodMode(2);
        listPopupWindow.setAdapter(getAdapter());
        listPopupWindow.setOnItemClickListener(new o00O0O(this));
        if (typedArrayOooO0Oo.hasValue(5)) {
            setSimpleItems(typedArrayOooO0Oo.getResourceId(5, 0));
        }
        typedArrayOooO0Oo.recycle();
    }

    public void setSimpleItems(@NonNull String[] strArr) {
        setAdapter(new o00Oo0(this, getContext(), this.f27871OooOoO0, strArr));
    }
}
