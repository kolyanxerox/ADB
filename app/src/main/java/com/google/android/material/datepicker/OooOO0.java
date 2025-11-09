package com.google.android.material.datepicker;

import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.github.superadb.R;
import java.util.Calendar;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class OooOO0 extends BaseAdapter {

    /* renamed from: OooOoO0, reason: collision with root package name */
    public static final int f27535OooOoO0;

    /* renamed from: OooOo, reason: collision with root package name */
    public final int f27536OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final Calendar f27537OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final int f27538OooOo0o;

    static {
        f27535OooOoO0 = Build.VERSION.SDK_INT >= 26 ? 4 : 1;
    }

    public OooOO0() {
        Calendar calendarOooO0OO = o000OOo.OooO0OO(null);
        this.f27537OooOo0O = calendarOooO0OO;
        this.f27538OooOo0o = calendarOooO0OO.getMaximum(7);
        this.f27536OooOo = calendarOooO0OO.getFirstDayOfWeek();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f27538OooOo0o;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        int i2 = this.f27538OooOo0o;
        if (i >= i2) {
            return null;
        }
        int i3 = i + this.f27536OooOo;
        if (i3 > i2) {
            i3 -= i2;
        }
        return Integer.valueOf(i3);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_day_of_week, viewGroup, false);
        }
        int i2 = i + this.f27536OooOo;
        int i3 = this.f27538OooOo0o;
        if (i2 > i3) {
            i2 -= i3;
        }
        Calendar calendar = this.f27537OooOo0O;
        calendar.set(7, i2);
        textView.setText(calendar.getDisplayName(7, f27535OooOoO0, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(R.string.mtrl_picker_day_of_week_column_header), calendar.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }

    public OooOO0(int i) {
        Calendar calendarOooO0OO = o000OOo.OooO0OO(null);
        this.f27537OooOo0O = calendarOooO0OO;
        this.f27538OooOo0o = calendarOooO0OO.getMaximum(7);
        this.f27536OooOo = i;
    }
}
