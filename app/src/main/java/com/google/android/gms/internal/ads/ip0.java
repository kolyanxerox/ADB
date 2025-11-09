package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: classes2.dex */
public final class ip0 extends xh0 {
    @Override // com.google.android.gms.internal.ads.xh0
    public final int OooO0Oo(gp0 gp0Var) {
        int i;
        synchronized (gp0Var) {
            i = gp0Var.f20349OooOooO - 1;
            gp0Var.f20349OooOooO = i;
        }
        return i;
    }

    @Override // com.google.android.gms.internal.ads.xh0
    public final void Oooo0OO(gp0 gp0Var, Set set) {
        synchronized (gp0Var) {
            if (gp0Var.f20348OooOoo == null) {
                gp0Var.f20348OooOoo = set;
            }
        }
    }
}
