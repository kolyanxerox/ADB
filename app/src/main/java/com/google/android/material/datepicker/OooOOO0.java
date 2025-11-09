package com.google.android.material.datepicker;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public final class OooOOO0 extends oo0o0Oo {

    /* renamed from: OooO00o */
    public final /* synthetic */ int f27541OooO00o;

    /* renamed from: OooO0O0 */
    public final /* synthetic */ o000oOoO f27542OooO0O0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOO0(o000oOoO o000oooo2, Context context, int i, int i2) {
        super(context, i, false);
        this.f27542OooO0O0 = o000oooo2;
        this.f27541OooO00o = i2;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void calculateExtraLayoutSpace(RecyclerView.State state, int[] iArr) {
        int i = this.f27541OooO00o;
        o000oOoO o000oooo2 = this.f27542OooO0O0;
        if (i == 0) {
            iArr[0] = o000oooo2.f27561OooOoo.getWidth();
            iArr[1] = o000oooo2.f27561OooOoo.getWidth();
        } else {
            iArr[0] = o000oooo2.f27561OooOoo.getHeight();
            iArr[1] = o000oooo2.f27561OooOoo.getHeight();
        }
    }
}
