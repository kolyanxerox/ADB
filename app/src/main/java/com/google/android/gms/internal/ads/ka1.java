package com.google.android.gms.internal.ads;

import android.util.SparseBooleanArray;

/* loaded from: classes2.dex */
public final class ka1 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final SparseBooleanArray f20471OooO00o;

    public final int OooO00o(int i) {
        SparseBooleanArray sparseBooleanArray = this.f20471OooO00o;
        af0.OooOOO0(i, sparseBooleanArray.size());
        return sparseBooleanArray.keyAt(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ka1)) {
            return false;
        }
        ka1 ka1Var = (ka1) obj;
        int i = i80.f19994OooO00o;
        SparseBooleanArray sparseBooleanArray = this.f20471OooO00o;
        if (i >= 24) {
            return sparseBooleanArray.equals(ka1Var.f20471OooO00o);
        }
        if (sparseBooleanArray.size() != ka1Var.f20471OooO00o.size()) {
            return false;
        }
        for (int i2 = 0; i2 < sparseBooleanArray.size(); i2++) {
            if (OooO00o(i2) != ka1Var.OooO00o(i2)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = i80.f19994OooO00o;
        SparseBooleanArray sparseBooleanArray = this.f20471OooO00o;
        if (i >= 24) {
            return sparseBooleanArray.hashCode();
        }
        int size = sparseBooleanArray.size();
        for (int i2 = 0; i2 < sparseBooleanArray.size(); i2++) {
            size = (size * 31) + OooO00o(i2);
        }
        return size;
    }
}
