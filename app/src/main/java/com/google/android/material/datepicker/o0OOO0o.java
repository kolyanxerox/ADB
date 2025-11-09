package com.google.android.material.datepicker;

import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.github.superadb.R;

/* loaded from: classes2.dex */
public final class o0OOO0o extends RecyclerView.Adapter {

    /* renamed from: OooO00o */
    public final OooO0OO f27591OooO00o;

    /* renamed from: OooO0O0 */
    public final OooOOO f27592OooO0O0;

    /* renamed from: OooO0OO */
    public final int f27593OooO0OO;

    public o0OOO0o(ContextThemeWrapper contextThemeWrapper, OooO0OO oooO0OO, OooOOO oooOOO) {
        o00Ooo o00oooOooOO0o = oooO0OO.OooOO0o();
        o00Ooo o00oooOooO0oo = oooO0OO.OooO0oo();
        o00Ooo o00oooOooOO0O = oooO0OO.OooOO0O();
        if (o00oooOooOO0o.compareTo(o00oooOooOO0O) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        }
        if (o00oooOooOO0O.compareTo(o00oooOooO0oo) > 0) {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        this.f27593OooO0OO = (contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * oo000o.f27601OooOoO0) + (o00O0O.OooO0oO(contextThemeWrapper, android.R.attr.windowFullscreen) ? contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) : 0);
        this.f27591OooO00o = oooO0OO;
        this.f27592OooO0O0 = oooOOO;
        setHasStableIds(true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f27591OooO00o.OooOO0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final long getItemId(int i) {
        return this.f27591OooO00o.OooOO0o().OooOO0(i).OooO();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        o0ooOOo o0ooooo = (o0ooOOo) viewHolder;
        OooO0OO oooO0OO = this.f27591OooO00o;
        o00Ooo o00oooOooOO0 = oooO0OO.OooOO0o().OooOO0(i);
        o0ooooo.f27598OooO00o.setText(o00oooOooOO0.OooO0oo());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) o0ooooo.f27599OooO0O0.findViewById(R.id.month_grid);
        if (materialCalendarGridView.OooO00o() == null || !o00oooOooOO0.equals(materialCalendarGridView.OooO00o().f27603OooOo0O)) {
            new oo000o(o00oooOooOO0, oooO0OO);
            throw null;
        }
        materialCalendarGridView.invalidate();
        materialCalendarGridView.OooO00o().getClass();
        throw null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_month_labeled, viewGroup, false);
        if (!o00O0O.OooO0oO(viewGroup.getContext(), android.R.attr.windowFullscreen)) {
            return new o0ooOOo(linearLayout, false);
        }
        linearLayout.setLayoutParams(new RecyclerView.LayoutParams(-1, this.f27593OooO0OO));
        return new o0ooOOo(linearLayout, true);
    }
}
