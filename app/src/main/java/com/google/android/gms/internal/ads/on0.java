package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* loaded from: classes2.dex */
public final class on0 extends fn0 implements Serializable {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return xa1.f25584OooOO0.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof on0)) {
            return false;
        }
        gm0 gm0Var = xa1.f25584OooOO0;
        ((on0) obj).getClass();
        return gm0Var.equals(gm0Var);
    }

    public final int hashCode() {
        return -xa1.f25584OooOO0.hashCode();
    }

    public final String toString() {
        return xa1.f25584OooOO0.toString().concat(".reverse()");
    }
}
