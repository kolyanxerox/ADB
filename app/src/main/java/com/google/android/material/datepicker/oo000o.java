package com.google.android.material.datepicker;

import android.widget.BaseAdapter;

/* loaded from: classes2.dex */
public final class oo000o extends BaseAdapter {

    /* renamed from: OooOo */
    public final OooO0OO f27602OooOo;

    /* renamed from: OooOo0O */
    public final o00Ooo f27603OooOo0O;

    /* renamed from: OooOo0o */
    public Oooo.OooOo00 f27604OooOo0o;

    /* renamed from: OooOoO0 */
    public static final int f27601OooOoO0 = o000OOo.OooO0OO(null).getMaximum(4);

    /* renamed from: OooOoO */
    public static final int f27600OooOoO = (o000OOo.OooO0OO(null).getMaximum(7) + o000OOo.OooO0OO(null).getMaximum(5)) - 1;

    public oo000o(o00Ooo o00ooo2, OooO0OO oooO0OO) {
        this.f27603OooOo0O = o00ooo2;
        this.f27602OooOo = oooO0OO;
        throw null;
    }

    public final int OooO00o() {
        return this.f27603OooOo0O.OooO0o0(this.f27602OooOo.OooO());
    }

    @Override // android.widget.Adapter
    /* renamed from: OooO0O0 */
    public final Long getItem(int i) {
        if (i < OooO00o() || i > OooO0OO()) {
            return null;
        }
        return Long.valueOf(this.f27603OooOo0O.OooO0o((i - OooO00o()) + 1));
    }

    public final int OooO0OO() {
        return (OooO00o() + this.f27603OooOo0O.f27588OooOoO0) - 1;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return f27600OooOoO;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i / this.f27603OooOo0O.f27584OooOo;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00af  */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View getView(int r9, android.view.View r10, android.view.ViewGroup r11) {
        /*
            Method dump skipped, instructions count: 313
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.oo000o.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return true;
    }
}
