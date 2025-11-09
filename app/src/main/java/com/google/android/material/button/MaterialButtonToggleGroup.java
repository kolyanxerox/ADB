package com.google.android.material.button;

import OoooooO.O0000000;
import OoooooO.O0O0;
import OoooooO.O0OO00;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import androidx.annotation.BoolRes;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.MarginLayoutParamsCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.github.superadb.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import o000000.OooO00o;
import o000000.OooOo;
import o000000.Oooo000;
import o000Ooo0.OooOO0;
import o0ooOO0.o00000O0;
import o0ooOO0.o0000oo;

/* loaded from: classes2.dex */
public class MaterialButtonToggleGroup extends LinearLayout {

    /* renamed from: Oooo000 */
    public static final /* synthetic */ int f27450Oooo000 = 0;

    /* renamed from: OooOo */
    public final LinkedHashSet f27451OooOo;

    /* renamed from: OooOo0O */
    public final ArrayList f27452OooOo0O;

    /* renamed from: OooOo0o */
    public final OooOO0 f27453OooOo0o;

    /* renamed from: OooOoO */
    public Integer[] f27454OooOoO;

    /* renamed from: OooOoO0 */
    public final O0000000 f27455OooOoO0;

    /* renamed from: OooOoOO */
    public boolean f27456OooOoOO;

    /* renamed from: OooOoo */
    public boolean f27457OooOoo;

    /* renamed from: OooOoo0 */
    public boolean f27458OooOoo0;

    /* renamed from: OooOooO */
    public final int f27459OooOooO;

    /* renamed from: OooOooo */
    public HashSet f27460OooOooo;

    public MaterialButtonToggleGroup(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialButtonToggleGroupStyle);
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (OooO0OO(i)) {
                return i;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (OooO0OO(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private int getVisibleButtonCount() {
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if ((getChildAt(i2) instanceof MaterialButton) && OooO0OO(i2)) {
                i++;
            }
        }
        return i;
    }

    private void setGeneratedIdIfNeeded(@NonNull MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            materialButton.setId(ViewCompat.generateViewId());
        }
    }

    private void setupButtonChild(@NonNull MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setOnPressedChangeListenerInternal(this.f27453OooOo0o);
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    public final void OooO00o() {
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i = firstVisibleChildIndex + 1; i < getChildCount(); i++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i);
            int iMin = Math.min(materialButton.getStrokeWidth(), ((MaterialButton) getChildAt(i - 1)).getStrokeWidth());
            ViewGroup.LayoutParams layoutParams = materialButton.getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
            if (getOrientation() == 0) {
                MarginLayoutParamsCompat.setMarginEnd(layoutParams2, 0);
                MarginLayoutParamsCompat.setMarginStart(layoutParams2, -iMin);
                layoutParams2.topMargin = 0;
            } else {
                layoutParams2.bottomMargin = 0;
                layoutParams2.topMargin = -iMin;
                MarginLayoutParamsCompat.setMarginStart(layoutParams2, 0);
            }
            materialButton.setLayoutParams(layoutParams2);
        }
        if (getChildCount() == 0 || firstVisibleChildIndex == -1) {
            return;
        }
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) ((MaterialButton) getChildAt(firstVisibleChildIndex)).getLayoutParams();
        if (getOrientation() == 1) {
            layoutParams3.topMargin = 0;
            layoutParams3.bottomMargin = 0;
        } else {
            MarginLayoutParamsCompat.setMarginEnd(layoutParams3, 0);
            MarginLayoutParamsCompat.setMarginStart(layoutParams3, 0);
            layoutParams3.leftMargin = 0;
            layoutParams3.rightMargin = 0;
        }
    }

    public final void OooO0O0(int i, boolean z) {
        if (i == -1) {
            Log.e("MaterialButtonToggleGroup", "Button ID is not valid: " + i);
            return;
        }
        HashSet hashSet = new HashSet(this.f27460OooOooo);
        if (z && !hashSet.contains(Integer.valueOf(i))) {
            if (this.f27458OooOoo0 && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i));
        } else {
            if (z || !hashSet.contains(Integer.valueOf(i))) {
                return;
            }
            if (!this.f27457OooOoo || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i));
            }
        }
        OooO0Oo(hashSet);
    }

    public final boolean OooO0OO(int i) {
        return getChildAt(i).getVisibility() != 8;
    }

    public final void OooO0Oo(Set set) {
        HashSet hashSet = this.f27460OooOooo;
        this.f27460OooOooo = new HashSet(set);
        for (int i = 0; i < getChildCount(); i++) {
            int id = ((MaterialButton) getChildAt(i)).getId();
            boolean zContains = set.contains(Integer.valueOf(id));
            View viewFindViewById = findViewById(id);
            if (viewFindViewById instanceof MaterialButton) {
                this.f27456OooOoOO = true;
                ((MaterialButton) viewFindViewById).setChecked(zContains);
                this.f27456OooOoOO = false;
            }
            if (hashSet.contains(Integer.valueOf(id)) != set.contains(Integer.valueOf(id))) {
                set.contains(Integer.valueOf(id));
                Iterator it = this.f27451OooOo.iterator();
                while (it.hasNext()) {
                    ((com.google.android.material.timepicker.OooOO0) it.next()).OooO00o();
                }
            }
        }
        invalidate();
    }

    public final void OooO0o0() {
        O0OO00 o0oo00;
        int childCount = getChildCount();
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        for (int i = 0; i < childCount; i++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i);
            if (materialButton.getVisibility() != 8) {
                OooOo oooOoOooO0o = materialButton.getShapeAppearanceModel().OooO0o();
                O0OO00 o0oo002 = (O0OO00) this.f27452OooOo0O.get(i);
                if (firstVisibleChildIndex != lastVisibleChildIndex) {
                    boolean z = getOrientation() == 0;
                    OooO00o oooO00o = O0OO00.f15103OooO0o0;
                    if (i == firstVisibleChildIndex) {
                        o0oo00 = z ? o0000oo.OooO0Oo(this) ? new O0OO00(oooO00o, oooO00o, o0oo002.f15105OooO0O0, o0oo002.f15106OooO0OO) : new O0OO00(o0oo002.f15104OooO00o, o0oo002.f15107OooO0Oo, oooO00o, oooO00o) : new O0OO00(o0oo002.f15104OooO00o, oooO00o, o0oo002.f15105OooO0O0, oooO00o);
                    } else if (i == lastVisibleChildIndex) {
                        o0oo00 = z ? o0000oo.OooO0Oo(this) ? new O0OO00(o0oo002.f15104OooO00o, o0oo002.f15107OooO0Oo, oooO00o, oooO00o) : new O0OO00(oooO00o, oooO00o, o0oo002.f15105OooO0O0, o0oo002.f15106OooO0OO) : new O0OO00(oooO00o, o0oo002.f15107OooO0Oo, oooO00o, o0oo002.f15106OooO0OO);
                    } else {
                        o0oo002 = null;
                    }
                    o0oo002 = o0oo00;
                }
                if (o0oo002 == null) {
                    oooOoOooO0o.OooO0OO(0.0f);
                } else {
                    oooOoOooO0o.f29076OooO0o0 = o0oo002.f15104OooO00o;
                    oooOoOooO0o.f29078OooO0oo = o0oo002.f15107OooO0Oo;
                    oooOoOooO0o.f29075OooO0o = o0oo002.f15105OooO0O0;
                    oooOoOooO0o.f29077OooO0oO = o0oo002.f15106OooO0OO;
                }
                materialButton.setShapeAppearanceModel(oooOoOooO0o.OooO00o());
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MaterialButtonToggleGroup", "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        setupButtonChild(materialButton);
        OooO0O0(materialButton.getId(), materialButton.f27447Oooo000);
        Oooo000 shapeAppearanceModel = materialButton.getShapeAppearanceModel();
        this.f27452OooOo0O.add(new O0OO00(shapeAppearanceModel.f29089OooO0o0, shapeAppearanceModel.f29091OooO0oo, shapeAppearanceModel.f29088OooO0o, shapeAppearanceModel.f29090OooO0oO));
        ViewCompat.setAccessibilityDelegate(materialButton, new O0O0(this));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        TreeMap treeMap = new TreeMap(this.f27455OooOoO0);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            treeMap.put((MaterialButton) getChildAt(i), Integer.valueOf(i));
        }
        this.f27454OooOoO = (Integer[]) treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }

    @IdRes
    public int getCheckedButtonId() {
        if (!this.f27458OooOoo0 || this.f27460OooOooo.isEmpty()) {
            return -1;
        }
        return ((Integer) this.f27460OooOooo.iterator().next()).intValue();
    }

    @NonNull
    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            int id = ((MaterialButton) getChildAt(i)).getId();
            if (this.f27460OooOooo.contains(Integer.valueOf(id))) {
                arrayList.add(Integer.valueOf(id));
            }
        }
        return arrayList;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        Integer[] numArr = this.f27454OooOoO;
        if (numArr != null && i2 < numArr.length) {
            return numArr[i2].intValue();
        }
        Log.w("MaterialButtonToggleGroup", "Child order wasn't updated");
        return i2;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i = this.f27459OooOooO;
        if (i != -1) {
            OooO0Oo(Collections.singleton(Integer.valueOf(i)));
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        AccessibilityNodeInfoCompat.wrap(accessibilityNodeInfo).setCollectionInfo(AccessibilityNodeInfoCompat.CollectionInfoCompat.obtain(1, getVisibleButtonCount(), false, this.f27458OooOoo0 ? 1 : 2));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        OooO0o0();
        OooO00o();
        super.onMeasure(i, i2);
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal(null);
        }
        int iIndexOfChild = indexOfChild(view);
        if (iIndexOfChild >= 0) {
            this.f27452OooOo0O.remove(iIndexOfChild);
        }
        OooO0o0();
        OooO00o();
    }

    public void setSelectionRequired(boolean z) {
        this.f27457OooOoo = z;
    }

    public void setSingleSelection(boolean z) {
        if (this.f27458OooOoo0 != z) {
            this.f27458OooOoo0 = z;
            OooO0Oo(new HashSet());
        }
    }

    public MaterialButtonToggleGroup(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(o00000O.OooO00o.OooO00o(context, attributeSet, i, R.style.Widget_MaterialComponents_MaterialButtonToggleGroup), attributeSet, i);
        this.f27452OooOo0O = new ArrayList();
        this.f27453OooOo0o = new OooOO0(this, 16);
        this.f27451OooOo = new LinkedHashSet();
        this.f27455OooOoO0 = new O0000000(this);
        this.f27456OooOoOO = false;
        this.f27460OooOooo = new HashSet();
        TypedArray typedArrayOooO0Oo = o00000O0.OooO0Oo(getContext(), attributeSet, Ooooo00.OooOo.f14972OooOoO, i, R.style.Widget_MaterialComponents_MaterialButtonToggleGroup, new int[0]);
        setSingleSelection(typedArrayOooO0Oo.getBoolean(2, false));
        this.f27459OooOooO = typedArrayOooO0Oo.getResourceId(0, -1);
        this.f27457OooOoo = typedArrayOooO0Oo.getBoolean(1, false);
        setChildrenDrawingOrderEnabled(true);
        typedArrayOooO0Oo.recycle();
        ViewCompat.setImportantForAccessibility(this, 1);
    }

    public void setSingleSelection(@BoolRes int i) {
        setSingleSelection(getResources().getBoolean(i));
    }
}
