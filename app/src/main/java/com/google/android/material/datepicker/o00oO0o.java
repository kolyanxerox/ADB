package com.google.android.material.datepicker;

import android.view.View;
import android.widget.AdapterView;

/* loaded from: classes2.dex */
public final class o00oO0o implements AdapterView.OnItemClickListener {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ MaterialCalendarGridView f27589OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ o0OOO0o f27590OooOo0o;

    public o00oO0o(o0OOO0o o0ooo0o, MaterialCalendarGridView materialCalendarGridView) {
        this.f27590OooOo0o = o0ooo0o;
        this.f27589OooOo0O = materialCalendarGridView;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        MaterialCalendarGridView materialCalendarGridView = this.f27589OooOo0O;
        oo000o oo000oVarOooO00o = materialCalendarGridView.OooO00o();
        if (i < oo000oVarOooO00o.OooO00o() || i > oo000oVarOooO00o.OooO0OO()) {
            return;
        }
        o0OOO0o o0ooo0o = this.f27590OooOo0o;
        if (((OooO) o0ooo0o.f27592OooO0O0.f27540OooO00o.f27556OooOo.OooO0oO()).OooO00o(materialCalendarGridView.OooO00o().getItem(i).longValue())) {
            throw null;
        }
    }
}
