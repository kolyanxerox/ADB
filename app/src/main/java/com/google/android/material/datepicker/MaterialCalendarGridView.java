package com.google.android.material.datepicker;

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Adapter;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.core.view.ViewCompat;

/* loaded from: classes2.dex */
final class MaterialCalendarGridView extends GridView {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final boolean f27526OooOo0O;

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final oo000o OooO00o() {
        return (oo000o) super.getAdapter();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final Adapter getAdapter() {
        return (oo000o) super.getAdapter();
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ((oo000o) super.getAdapter()).notifyDataSetChanged();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        oo000o oo000oVar = (oo000o) super.getAdapter();
        oo000oVar.getClass();
        int iMax = Math.max(oo000oVar.OooO00o(), getFirstVisiblePosition());
        int iMin = Math.min(oo000oVar.OooO0OO(), getLastVisiblePosition());
        oo000oVar.getItem(iMax);
        oo000oVar.getItem(iMin);
        throw null;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        if (!z) {
            super.onFocusChanged(false, i, rect);
            return;
        }
        if (i == 33) {
            setSelection(((oo000o) super.getAdapter()).OooO0OO());
        } else if (i == 130) {
            setSelection(((oo000o) super.getAdapter()).OooO00o());
        } else {
            super.onFocusChanged(true, i, rect);
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!super.onKeyDown(i, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= ((oo000o) super.getAdapter()).OooO00o()) {
            return true;
        }
        if (19 != i) {
            return false;
        }
        setSelection(((oo000o) super.getAdapter()).OooO00o());
        return true;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onMeasure(int i, int i2) {
        if (!this.f27526OooOo0O) {
            super.onMeasure(i, i2);
            return;
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(ViewCompat.MEASURED_SIZE_MASK, Integer.MIN_VALUE));
        getLayoutParams().height = getMeasuredHeight();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final void setSelection(int i) {
        if (i < ((oo000o) super.getAdapter()).OooO00o()) {
            super.setSelection(((oo000o) super.getAdapter()).OooO00o());
        } else {
            super.setSelection(i);
        }
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        o000OOo.OooO0OO(null);
        if (o00O0O.OooO0oO(getContext(), R.attr.windowFullscreen)) {
            setNextFocusLeftId(com.github.superadb.R.id.cancel_button);
            setNextFocusRightId(com.github.superadb.R.id.confirm_button);
        }
        this.f27526OooOo0O = o00O0O.OooO0oO(getContext(), com.github.superadb.R.attr.nestedScrollable);
        ViewCompat.setAccessibilityDelegate(this, new OooOO0O(1));
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final ListAdapter getAdapter() {
        return (oo000o) super.getAdapter();
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (!(listAdapter instanceof oo000o)) {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), oo000o.class.getCanonicalName()));
        }
        super.setAdapter(listAdapter);
    }
}
