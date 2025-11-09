package com.google.android.gms.internal.measurement;

/* loaded from: classes2.dex */
public final class o000000 {

    /* renamed from: OooO0O0, reason: collision with root package name */
    public static final /* synthetic */ int f26471OooO0O0 = 0;

    /* renamed from: OooO00o, reason: collision with root package name */
    public final int f26472OooO00o;

    public o000000(int i) {
        this.f26472OooO00o = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o000000)) {
            return false;
        }
        o000000 o000000Var = (o000000) obj;
        o000000Var.getClass();
        int i = this.f26472OooO00o;
        if (i != 0) {
            return i == o000000Var.f26472OooO00o;
        }
        throw null;
    }

    public final int hashCode() {
        int i = this.f26472OooO00o;
        if (i != 0) {
            return ((i ^ (-485106924)) * 583896283) ^ 1;
        }
        throw null;
    }

    public final String toString() {
        int i = this.f26472OooO00o;
        String str = i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "NO_CHECKS" : "SKIP_SECURITY_CHECK" : "SKIP_COMPLIANCE_CHECK" : "ALL_CHECKS";
        StringBuilder sb = new StringBuilder("READ_AND_WRITE".length() + str.length() + "".length() + 73 + 91 + 1);
        androidx.datastore.preferences.protobuf.OooO00o.OooOooO(sb, "FileComplianceOptions{fileOwner=, hasDifferentDmaOwner=false, fileChecks=", str, ", dataForwardingNotAllowedResolver=null, multipleProductIdGroupsResolver=null, filePurpose=", "READ_AND_WRITE");
        sb.append("}");
        return sb.toString();
    }
}
