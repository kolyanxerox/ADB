package com.google.android.material.bottomnavigation;

import OoooOOO.o0O00000;
import Oooooo0.o0000O0;
import Oooooo0.o0000O00;
import Oooooo0.o0000oo;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.TintTypedArray;
import androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure;
import com.github.superadb.R;
import o0OOO0o.OooO;
import o0OOO0o.OooOo;
import o0ooOO0.o00000O0;

/* loaded from: classes2.dex */
public class BottomNavigationView extends OooOo {
    public BottomNavigationView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.bottomNavigationStyle);
    }

    @Override // o0OOO0o.OooOo
    public final OooO OooO00o(Context context) {
        return new o0000O00(context);
    }

    @Override // o0OOO0o.OooOo
    public int getMaxItemCount() {
        return 5;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        if (View.MeasureSpec.getMode(i2) != 1073741824 && suggestedMinimumHeight > 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i2), getPaddingBottom() + getPaddingTop() + suggestedMinimumHeight), BasicMeasure.EXACTLY);
        }
        super.onMeasure(i, i2);
    }

    public void setItemHorizontalTranslationEnabled(boolean z) throws Resources.NotFoundException {
        o0000O00 o0000o00 = (o0000O00) getMenuView();
        if (o0000o00.f15099OooooOO != z) {
            o0000o00.setItemHorizontalTranslationEnabled(z);
            getPresenter().updateMenuView(false);
        }
    }

    @Deprecated
    public void setOnNavigationItemReselectedListener(@Nullable o0000oo o0000ooVar) {
        setOnItemReselectedListener(o0000ooVar);
    }

    @Deprecated
    public void setOnNavigationItemSelectedListener(@Nullable o0000O0 o0000o02) {
        setOnItemSelectedListener(o0000o02);
    }

    public BottomNavigationView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) throws Resources.NotFoundException {
        super(context, attributeSet, i, R.style.Widget_Design_BottomNavigationView);
        TintTypedArray tintTypedArrayOooO0o0 = o00000O0.OooO0o0(getContext(), attributeSet, Ooooo00.OooOo.f14955OooO0o, i, R.style.Widget_Design_BottomNavigationView, new int[0]);
        setItemHorizontalTranslationEnabled(tintTypedArrayOooO0o0.getBoolean(1, true));
        if (tintTypedArrayOooO0o0.hasValue(0)) {
            setMinimumHeight(tintTypedArrayOooO0o0.getDimensionPixelSize(0, 0));
        }
        tintTypedArrayOooO0o0.recycle();
        o0ooOO0.o0000oo.OooO00o(this, new o0O00000(9));
    }
}
