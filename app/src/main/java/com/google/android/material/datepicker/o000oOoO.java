package com.google.android.material.datepicker;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.annotation.RestrictTo;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public final class o000oOoO<S> extends o0Oo0oo {

    /* renamed from: OooOo, reason: collision with root package name */
    public OooO0OO f27556OooOo;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public int f27557OooOo0o;

    /* renamed from: OooOoO, reason: collision with root package name */
    public int f27558OooOoO;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public o00Ooo f27559OooOoO0;

    /* renamed from: OooOoOO, reason: collision with root package name */
    public Oooo.OooOo00 f27560OooOoOO;

    /* renamed from: OooOoo, reason: collision with root package name */
    public RecyclerView f27561OooOoo;

    /* renamed from: OooOoo0, reason: collision with root package name */
    public RecyclerView f27562OooOoo0;

    /* renamed from: OooOooO, reason: collision with root package name */
    public View f27563OooOooO;

    /* renamed from: OooOooo, reason: collision with root package name */
    public View f27564OooOooo;

    public final void OooO0o(int i) {
        this.f27558OooOoO = i;
        if (i == 2) {
            this.f27562OooOoo0.getLayoutManager().scrollToPosition(this.f27559OooOoO0.f27586OooOo0o - ((o000000O) this.f27562OooOoo0.getAdapter()).f27554OooO00o.f27556OooOo.OooOO0o().f27586OooOo0o);
            this.f27563OooOooO.setVisibility(0);
            this.f27564OooOooo.setVisibility(8);
            return;
        }
        if (i == 1) {
            this.f27563OooOooO.setVisibility(8);
            this.f27564OooOooo.setVisibility(0);
            OooO0o0(this.f27559OooOoO0);
        }
    }

    public final void OooO0o0(o00Ooo o00ooo2) {
        o0OOO0o o0ooo0o = (o0OOO0o) this.f27561OooOoo.getAdapter();
        int iOooOO0O = o0ooo0o.f27591OooO00o.OooOO0o().OooOO0O(o00ooo2);
        int iOooOO0O2 = iOooOO0O - o0ooo0o.f27591OooO00o.OooOO0o().OooOO0O(this.f27559OooOoO0);
        boolean z = Math.abs(iOooOO0O2) > 3;
        boolean z2 = iOooOO0O2 > 0;
        this.f27559OooOoO0 = o00ooo2;
        if (z && z2) {
            this.f27561OooOoo.scrollToPosition(iOooOO0O - 3);
            this.f27561OooOoo.post(new com.google.android.gms.common.api.internal.Oooo000(this, iOooOO0O, 7));
        } else if (!z) {
            this.f27561OooOoo.post(new com.google.android.gms.common.api.internal.Oooo000(this, iOooOO0O, 7));
        } else {
            this.f27561OooOoo.scrollToPosition(iOooOO0O + 3);
            this.f27561OooOoo.post(new com.google.android.gms.common.api.internal.Oooo000(this, iOooOO0O, 7));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f27557OooOo0o = bundle.getInt("THEME_RES_ID_KEY");
        if (bundle.getParcelable("GRID_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f27556OooOo = (OooO0OO) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f27559OooOoO0 = (o00Ooo) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) throws IllegalStateException, Resources.NotFoundException {
        int i;
        int i2;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getContext(), this.f27557OooOo0o);
        this.f27560OooOoOO = new Oooo.OooOo00(contextThemeWrapper, 17);
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        o00Ooo o00oooOooOO0o = this.f27556OooOo.OooOO0o();
        if (o00O0O.OooO0oO(contextThemeWrapper, R.attr.windowFullscreen)) {
            i = com.github.superadb.R.layout.mtrl_calendar_vertical;
            i2 = 1;
        } else {
            i = com.github.superadb.R.layout.mtrl_calendar_horizontal;
            i2 = 0;
        }
        View viewInflate = layoutInflaterCloneInContext.inflate(i, viewGroup, false);
        Resources resources = requireContext().getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(com.github.superadb.R.dimen.mtrl_calendar_navigation_bottom_padding) + resources.getDimensionPixelOffset(com.github.superadb.R.dimen.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelSize(com.github.superadb.R.dimen.mtrl_calendar_navigation_height);
        int dimensionPixelSize = resources.getDimensionPixelSize(com.github.superadb.R.dimen.mtrl_calendar_days_of_week_height);
        int i3 = oo000o.f27601OooOoO0;
        viewInflate.setMinimumHeight(dimensionPixelOffset + dimensionPixelSize + (resources.getDimensionPixelOffset(com.github.superadb.R.dimen.mtrl_calendar_month_vertical_padding) * (i3 - 1)) + (resources.getDimensionPixelSize(com.github.superadb.R.dimen.mtrl_calendar_day_height) * i3) + resources.getDimensionPixelOffset(com.github.superadb.R.dimen.mtrl_calendar_bottom_padding));
        GridView gridView = (GridView) viewInflate.findViewById(com.github.superadb.R.id.mtrl_calendar_days_of_week);
        ViewCompat.setAccessibilityDelegate(gridView, new OooOO0O(0));
        int iOooO = this.f27556OooOo.OooO();
        gridView.setAdapter((ListAdapter) (iOooO > 0 ? new OooOO0(iOooO) : new OooOO0()));
        gridView.setNumColumns(o00oooOooOO0o.f27584OooOo);
        gridView.setEnabled(false);
        this.f27561OooOoo = (RecyclerView) viewInflate.findViewById(com.github.superadb.R.id.mtrl_calendar_months);
        this.f27561OooOoo.setLayoutManager(new OooOOO0(this, getContext(), i2, i2));
        this.f27561OooOoo.setTag("MONTHS_VIEW_GROUP_TAG");
        o0OOO0o o0ooo0o = new o0OOO0o(contextThemeWrapper, this.f27556OooOo, new OooOOO(this));
        this.f27561OooOoo.setAdapter(o0ooo0o);
        int integer = contextThemeWrapper.getResources().getInteger(com.github.superadb.R.integer.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(com.github.superadb.R.id.mtrl_calendar_year_selector_frame);
        this.f27562OooOoo0 = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.f27562OooOoo0.setLayoutManager(new GridLayoutManager((Context) contextThemeWrapper, integer, 1, false));
            this.f27562OooOoo0.setAdapter(new o000000O(this));
            this.f27562OooOoo0.addItemDecoration(new OooOOOO(this));
        }
        if (viewInflate.findViewById(com.github.superadb.R.id.month_navigation_fragment_toggle) != null) {
            MaterialButton materialButton = (MaterialButton) viewInflate.findViewById(com.github.superadb.R.id.month_navigation_fragment_toggle);
            materialButton.setTag("SELECTOR_TOGGLE_TAG");
            ViewCompat.setAccessibilityDelegate(materialButton, new Oooooo.o0OO00O(this, 1));
            MaterialButton materialButton2 = (MaterialButton) viewInflate.findViewById(com.github.superadb.R.id.month_navigation_previous);
            materialButton2.setTag("NAVIGATION_PREV_TAG");
            MaterialButton materialButton3 = (MaterialButton) viewInflate.findViewById(com.github.superadb.R.id.month_navigation_next);
            materialButton3.setTag("NAVIGATION_NEXT_TAG");
            this.f27563OooOooO = viewInflate.findViewById(com.github.superadb.R.id.mtrl_calendar_year_selector_frame);
            this.f27564OooOooo = viewInflate.findViewById(com.github.superadb.R.id.mtrl_calendar_day_selector_frame);
            OooO0o(1);
            materialButton.setText(this.f27559OooOoO0.OooO0oo());
            this.f27561OooOoo.addOnScrollListener(new OooOo00(this, o0ooo0o, materialButton));
            materialButton.setOnClickListener(new OooOo(this, 0));
            materialButton3.setOnClickListener(new Oooo000(this, o0ooo0o));
            materialButton2.setOnClickListener(new Oooo0(this, o0ooo0o));
        }
        if (!o00O0O.OooO0oO(contextThemeWrapper, R.attr.windowFullscreen)) {
            new PagerSnapHelper().attachToRecyclerView(this.f27561OooOoo);
        }
        this.f27561OooOoo.scrollToPosition(o0ooo0o.f27591OooO00o.OooOO0o().OooOO0O(this.f27559OooOoO0));
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f27557OooOo0o);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f27556OooOo);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f27559OooOoO0);
    }
}
