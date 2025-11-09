package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class oO00o00O {

    /* renamed from: OooO00o */
    public final Uri f22536OooO00o;

    /* renamed from: OooO0O0 */
    public final List f22537OooO0O0;

    /* renamed from: OooO0OO */
    public final gn0 f22538OooO0OO;

    static {
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
        Integer.toString(7, 36);
    }

    public oO00o00O(Uri uri, gn0 gn0Var) {
        List list = Collections.EMPTY_LIST;
        this.f22536OooO00o = uri;
        ArrayList arrayList = AbstractC1813m4.f21058OooO00o;
        this.f22537OooO0O0 = list;
        this.f22538OooO0OO = gn0Var;
        xh0.OooOOoo(4, "initialCapacity");
        Object[] objArr = new Object[4];
        if (gn0Var.f19390OooOoO0 <= 0) {
            rm0.OooOOO(0, objArr);
        } else {
            gn0Var.get(0);
            throw new ClassCastException();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oO00o00O)) {
            return false;
        }
        oO00o00O oo00o00o = (oO00o00O) obj;
        if (!this.f22536OooO00o.equals(oo00o00o.f22536OooO00o) || !this.f22537OooO0O0.equals(oo00o00o.f22537OooO0O0) || !this.f22538OooO0OO.equals(oo00o00o.f22538OooO0OO)) {
            return false;
        }
        Object obj2 = -9223372036854775807L;
        return obj2.equals(obj2);
    }

    public final int hashCode() {
        return (int) ((((this.f22538OooO0OO.hashCode() + ((this.f22537OooO0O0.hashCode() + (this.f22536OooO00o.hashCode() * 923521)) * 961)) * 31) * 31) - Long.MAX_VALUE);
    }
}
