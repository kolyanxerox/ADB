package com.google.android.gms.internal.ads;

import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes2.dex */
public final class pp0 extends gp0 {

    /* renamed from: Oooo0OO, reason: collision with root package name */
    public op0 f23398Oooo0OO;

    @Override // com.google.android.gms.internal.ads.ap0
    public final void OooOO0() {
        op0 op0Var = this.f23398Oooo0OO;
        if (op0Var != null) {
            op0Var.OooO0oo();
        }
    }

    @Override // com.google.android.gms.internal.ads.gp0
    public final void OooOo(int i) {
        this.f19397Oooo00O = null;
        if (i == 1) {
            this.f23398Oooo0OO = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.gp0
    public final void OooOo0(int i, Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.gp0
    public final void OooOo0O() {
        op0 op0Var = this.f23398Oooo0OO;
        if (op0Var != null) {
            try {
                op0Var.f23077OooOo.execute(op0Var);
            } catch (RejectedExecutionException e) {
                op0Var.f23079OooOoO0.OooO0oO(e);
            }
        }
    }
}
