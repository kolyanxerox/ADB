package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* loaded from: classes2.dex */
public final class gm0 extends fn0 implements Serializable {

    /* renamed from: OooOo0O */
    public final oO00Oo00 f19386OooOo0O;

    public gm0(oO00Oo00 oo00oo00) {
        this.f19386OooOo0O = oo00oo00;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f19386OooOo0O.compare(obj, obj2);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof gm0) {
            return this.f19386OooOo0O.equals(((gm0) obj).f19386OooOo0O);
        }
        return false;
    }

    public final int hashCode() {
        return this.f19386OooOo0O.hashCode();
    }

    public final String toString() {
        return this.f19386OooOo0O.toString();
    }
}
