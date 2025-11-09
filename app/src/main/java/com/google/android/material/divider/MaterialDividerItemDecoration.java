package com.google.android.material.divider;

import Ooooo00.OooOo;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.github.superadb.R;
import o0ooOO0.o00000O0;
import oo0o0Oo.OooO0OO;

/* loaded from: classes2.dex */
public class MaterialDividerItemDecoration extends RecyclerView.ItemDecoration {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final Drawable f27610OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final int f27611OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final int f27612OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final int f27613OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public final int f27614OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final int f27615OooO0o0;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public final boolean f27616OooO0oO;

    /* renamed from: OooO0oo, reason: collision with root package name */
    public final Rect f27617OooO0oo = new Rect();

    public MaterialDividerItemDecoration(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        TypedArray typedArrayOooO0Oo = o00000O0.OooO0Oo(context, attributeSet, OooOo.f14978OooOooo, R.attr.materialDividerStyle, R.style.Widget_MaterialComponents_MaterialDivider, new int[0]);
        this.f27612OooO0OO = OooO0OO.OooO00o(context, typedArrayOooO0Oo, 0).getDefaultColor();
        this.f27611OooO0O0 = typedArrayOooO0Oo.getDimensionPixelSize(3, context.getResources().getDimensionPixelSize(R.dimen.material_divider_thickness));
        this.f27615OooO0o0 = typedArrayOooO0Oo.getDimensionPixelOffset(2, 0);
        this.f27614OooO0o = typedArrayOooO0Oo.getDimensionPixelOffset(1, 0);
        this.f27616OooO0oO = typedArrayOooO0Oo.getBoolean(4, true);
        typedArrayOooO0Oo.recycle();
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        this.f27610OooO00o = shapeDrawable;
        int i2 = this.f27612OooO0OO;
        this.f27612OooO0OO = i2;
        Drawable drawableWrap = DrawableCompat.wrap(shapeDrawable);
        this.f27610OooO00o = drawableWrap;
        DrawableCompat.setTint(drawableWrap, i2);
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException(OooO0oO.OooOo.OooO0oO(i, "Invalid orientation: ", ". It should be either HORIZONTAL or VERTICAL"));
        }
        this.f27613OooO0Oo = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        rect.set(0, 0, 0, 0);
        if (this.f27616OooO0oO || recyclerView.getChildLayoutPosition(view) != state.getItemCount() - 1) {
            int i = this.f27613OooO0Oo;
            int i2 = this.f27611OooO0O0;
            if (i == 1) {
                rect.bottom = this.f27610OooO00o.getIntrinsicHeight() + i2;
            } else {
                rect.right = this.f27610OooO00o.getIntrinsicWidth() + i2;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        int height;
        int paddingTop;
        int width;
        int paddingLeft;
        if (recyclerView.getLayoutManager() == null) {
            return;
        }
        int i = this.f27613OooO0Oo;
        int i2 = this.f27611OooO0O0;
        Rect rect = this.f27617OooO0oo;
        boolean z = this.f27616OooO0oO;
        int i3 = this.f27614OooO0o;
        int i4 = this.f27615OooO0o0;
        int i5 = 0;
        if (i != 1) {
            canvas.save();
            if (recyclerView.getClipToPadding()) {
                paddingTop = recyclerView.getPaddingTop();
                height = recyclerView.getHeight() - recyclerView.getPaddingBottom();
                canvas.clipRect(recyclerView.getPaddingLeft(), paddingTop, recyclerView.getWidth() - recyclerView.getPaddingRight(), height);
            } else {
                height = recyclerView.getHeight();
                paddingTop = 0;
            }
            int i6 = paddingTop + i4;
            int i7 = height - i3;
            int childCount = recyclerView.getChildCount();
            if (!z) {
                childCount--;
            }
            while (i5 < childCount) {
                View childAt = recyclerView.getChildAt(i5);
                recyclerView.getDecoratedBoundsWithMargins(childAt, rect);
                int iRound = Math.round(childAt.getTranslationX()) + rect.right;
                this.f27610OooO00o.setBounds((iRound - this.f27610OooO00o.getIntrinsicWidth()) - i2, i6, iRound, i7);
                this.f27610OooO00o.draw(canvas);
                i5++;
            }
            canvas.restore();
            return;
        }
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            paddingLeft = recyclerView.getPaddingLeft();
            width = recyclerView.getWidth() - recyclerView.getPaddingRight();
            canvas.clipRect(paddingLeft, recyclerView.getPaddingTop(), width, recyclerView.getHeight() - recyclerView.getPaddingBottom());
        } else {
            width = recyclerView.getWidth();
            paddingLeft = 0;
        }
        boolean z2 = ViewCompat.getLayoutDirection(recyclerView) == 1;
        int i8 = paddingLeft + (z2 ? i3 : i4);
        if (z2) {
            i3 = i4;
        }
        int i9 = width - i3;
        int childCount2 = recyclerView.getChildCount();
        if (!z) {
            childCount2--;
        }
        while (i5 < childCount2) {
            View childAt2 = recyclerView.getChildAt(i5);
            recyclerView.getDecoratedBoundsWithMargins(childAt2, rect);
            int iRound2 = Math.round(childAt2.getTranslationY()) + rect.bottom;
            this.f27610OooO00o.setBounds(i8, (iRound2 - this.f27610OooO00o.getIntrinsicHeight()) - i2, i9, iRound2);
            this.f27610OooO00o.draw(canvas);
            i5++;
        }
        canvas.restore();
    }
}
