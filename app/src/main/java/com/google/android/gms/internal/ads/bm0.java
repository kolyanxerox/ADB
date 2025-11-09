package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.NavigableMap;
import java.util.SortedMap;

/* loaded from: classes2.dex */
public abstract class bm0 {

    /* renamed from: OooOo */
    public transient pl0 f17521OooOo;

    /* renamed from: OooOo0O */
    public transient ql0 f17522OooOo0O;

    /* renamed from: OooOo0o */
    public transient am0 f17523OooOo0o;

    public final Map OooO00o() {
        pl0 pl0Var = this.f17521OooOo;
        if (pl0Var != null) {
            return pl0Var;
        }
        dn0 dn0Var = (dn0) this;
        Map map = dn0Var.f18275OooOoO0;
        pl0 rl0Var = map instanceof NavigableMap ? new rl0(dn0Var, (NavigableMap) map) : map instanceof SortedMap ? new vl0(dn0Var, (SortedMap) map) : new pl0(dn0Var, map);
        this.f17521OooOo = rl0Var;
        return rl0Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bm0) {
            return OooO00o().equals(((bm0) obj).OooO00o());
        }
        return false;
    }

    public final int hashCode() {
        return ((pl0) OooO00o()).f23368OooOo.hashCode();
    }

    public final String toString() {
        return ((pl0) OooO00o()).f23368OooOo.toString();
    }
}
