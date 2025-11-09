package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class vt0 extends yq0 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final tu0 f25135OooO00o;

    public vt0(tu0 tu0Var) {
        this.f25135OooO00o = tu0Var;
    }

    @Override // com.google.android.gms.internal.ads.yq0
    public final boolean OooO00o() {
        return this.f25135OooO00o.f24510OooO0O0.OooOoO() != fy0.RAW;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof vt0)) {
            return false;
        }
        tu0 tu0Var = ((vt0) obj).f25135OooO00o;
        tu0 tu0Var2 = this.f25135OooO00o;
        if (tu0Var2.f24510OooO0O0.OooOoO().equals(tu0Var.f24510OooO0O0.OooOoO())) {
            String strOooOoo0 = tu0Var2.f24510OooO0O0.OooOoo0();
            mx0 mx0Var = tu0Var.f24510OooO0O0;
            if (strOooOoo0.equals(mx0Var.OooOoo0()) && tu0Var2.f24510OooO0O0.OooOoOO().equals(mx0Var.OooOoOO())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        tu0 tu0Var = this.f25135OooO00o;
        return Objects.hash(tu0Var.f24510OooO0O0, tu0Var.f24509OooO00o);
    }

    public final String toString() {
        tu0 tu0Var = this.f25135OooO00o;
        String strOooOoo0 = tu0Var.f24510OooO0O0.OooOoo0();
        int iOrdinal = tu0Var.f24510OooO0O0.OooOoO().ordinal();
        return OooO0oO.OooOo.OooOO0o("(typeUrl=", strOooOoo0, ", outputPrefixType=", iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? iOrdinal != 4 ? "UNKNOWN" : "CRUNCHY" : "RAW" : "LEGACY" : "TINK", ")");
    }
}
