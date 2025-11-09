package com.google.android.material.datepicker;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;

/* loaded from: classes2.dex */
public final class OooOo00 extends RecyclerView.OnScrollListener {

    /* renamed from: OooO00o */
    public final /* synthetic */ o0OOO0o f27546OooO00o;

    /* renamed from: OooO0O0 */
    public final /* synthetic */ MaterialButton f27547OooO0O0;

    /* renamed from: OooO0OO */
    public final /* synthetic */ o000oOoO f27548OooO0OO;

    public OooOo00(o000oOoO o000oooo2, o0OOO0o o0ooo0o, MaterialButton materialButton) {
        this.f27548OooO0OO = o000oooo2;
        this.f27546OooO00o = o0ooo0o;
        this.f27547OooO0O0 = materialButton;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        if (i == 0) {
            recyclerView.announceForAccessibility(this.f27547OooO0O0.getText());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        o000oOoO o000oooo2 = this.f27548OooO0OO;
        int iFindFirstVisibleItemPosition = i < 0 ? ((LinearLayoutManager) o000oooo2.f27561OooOoo.getLayoutManager()).findFirstVisibleItemPosition() : ((LinearLayoutManager) o000oooo2.f27561OooOoo.getLayoutManager()).findLastVisibleItemPosition();
        OooO0OO oooO0OO = this.f27546OooO00o.f27591OooO00o;
        o000oooo2.f27559OooOoO0 = oooO0OO.OooOO0o().OooOO0(iFindFirstVisibleItemPosition);
        this.f27547OooO0O0.setText(oooO0OO.OooOO0o().OooOO0(iFindFirstVisibleItemPosition).OooO0oo());
    }
}
