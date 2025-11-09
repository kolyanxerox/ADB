package com.google.android.material.datepicker;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes2.dex */
public final class Oooo000 implements View.OnClickListener {

    /* renamed from: OooOo0O */
    public final /* synthetic */ o0OOO0o f27551OooOo0O;

    /* renamed from: OooOo0o */
    public final /* synthetic */ o000oOoO f27552OooOo0o;

    public Oooo000(o000oOoO o000oooo2, o0OOO0o o0ooo0o) {
        this.f27552OooOo0o = o000oooo2;
        this.f27551OooOo0O = o0ooo0o;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        o000oOoO o000oooo2 = this.f27552OooOo0o;
        int iFindFirstVisibleItemPosition = ((LinearLayoutManager) o000oooo2.f27561OooOoo.getLayoutManager()).findFirstVisibleItemPosition() + 1;
        if (iFindFirstVisibleItemPosition < o000oooo2.f27561OooOoo.getAdapter().getItemCount()) {
            o000oooo2.OooO0o0(this.f27551OooOo0O.f27591OooO00o.OooOO0o().OooOO0(iFindFirstVisibleItemPosition));
        }
    }
}
