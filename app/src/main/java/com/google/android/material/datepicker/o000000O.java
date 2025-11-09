package com.google.android.material.datepicker;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.github.superadb.R;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class o000000O extends RecyclerView.Adapter {

    /* renamed from: OooO00o */
    public final o000oOoO f27554OooO00o;

    public o000000O(o000oOoO o000oooo2) {
        this.f27554OooO00o = o000oooo2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f27554OooO00o.f27556OooOo.OooOOO0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        o000000 o000000Var = (o000000) viewHolder;
        o000oOoO o000oooo2 = this.f27554OooO00o;
        int i2 = o000oooo2.f27556OooOo.OooOO0o().f27586OooOo0o + i;
        String string = o000000Var.f27553OooO00o.getContext().getString(R.string.mtrl_picker_navigate_to_year_description);
        String str = String.format(Locale.getDefault(), "%d", Integer.valueOf(i2));
        TextView textView = o000000Var.f27553OooO00o;
        textView.setText(str);
        textView.setContentDescription(String.format(string, Integer.valueOf(i2)));
        Oooo.OooOo00 oooOo00 = o000oooo2.f27560OooOoOO;
        if (o000OOo.OooO0O0().get(1) == i2) {
            Object obj = oooOo00.f13710OooOo;
        } else {
            Object obj2 = oooOo00.f13712OooOo0o;
        }
        throw null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new o000000((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_year, viewGroup, false));
    }
}
