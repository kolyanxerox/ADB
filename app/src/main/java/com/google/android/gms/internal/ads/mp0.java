package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class mp0 extends gp0 {

    /* renamed from: Oooo0OO */
    public List f21320Oooo0OO;

    public mp0(rm0 rm0Var, boolean z) {
        List arrayList;
        super(rm0Var, z, true);
        if (rm0Var.isEmpty()) {
            arrayList = Collections.EMPTY_LIST;
        } else {
            int size = rm0Var.size();
            xh0.OooOOoo(size, "initialArraySize");
            arrayList = new ArrayList(size);
        }
        for (int i = 0; i < rm0Var.size(); i++) {
            arrayList.add(null);
        }
        this.f21320Oooo0OO = arrayList;
        OooOo0o();
    }

    @Override // com.google.android.gms.internal.ads.gp0
    public final void OooOo(int i) {
        this.f19397Oooo00O = null;
        this.f21320Oooo0OO = null;
    }

    @Override // com.google.android.gms.internal.ads.gp0
    public final void OooOo0(int i, Object obj) {
        List list = this.f21320Oooo0OO;
        if (list != null) {
            list.set(i, new np0(obj));
        }
    }

    @Override // com.google.android.gms.internal.ads.gp0
    public final void OooOo0O() {
        List<np0> list = this.f21320Oooo0OO;
        if (list != null) {
            int size = list.size();
            xh0.OooOOoo(size, "initialArraySize");
            ArrayList arrayList = new ArrayList(size);
            for (np0 np0Var : list) {
                arrayList.add(np0Var != null ? np0Var.f21564OooO00o : null);
            }
            OooO0o(Collections.unmodifiableList(arrayList));
        }
    }
}
