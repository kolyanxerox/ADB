package com.google.android.material.datepicker;

import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.github.superadb.R;

/* loaded from: classes2.dex */
public final class o0ooOOo extends RecyclerView.ViewHolder {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final TextView f27598OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final MaterialCalendarGridView f27599OooO0O0;

    public o0ooOOo(LinearLayout linearLayout, boolean z) {
        super(linearLayout);
        TextView textView = (TextView) linearLayout.findViewById(R.id.month_title);
        this.f27598OooO00o = textView;
        ViewCompat.setAccessibilityHeading(textView, true);
        this.f27599OooO0O0 = (MaterialCalendarGridView) linearLayout.findViewById(R.id.month_grid);
        if (z) {
            return;
        }
        textView.setVisibility(8);
    }
}
