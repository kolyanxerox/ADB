package com.google.android.gms.internal.measurement;

import android.content.Context;

/* loaded from: classes2.dex */
public final class o0OOooO0 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final Context f26641OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final o00000o0.o000000 f26642OooO0O0;

    public o0OOooO0(Context context, o00000o0.o000000 o000000Var) {
        this.f26641OooO00o = context;
        this.f26642OooO0O0 = o000000Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o0OOooO0) {
            o0OOooO0 o0ooooo0 = (o0OOooO0) obj;
            if (this.f26641OooO00o.equals(o0ooooo0.f26641OooO00o)) {
                o00000o0.o000000 o000000Var = o0ooooo0.f26642OooO0O0;
                o00000o0.o000000 o000000Var2 = this.f26642OooO0O0;
                if (o000000Var2 != null ? o000000Var2.equals(o000000Var) : o000000Var == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f26641OooO00o.hashCode() ^ 1000003;
        o00000o0.o000000 o000000Var = this.f26642OooO0O0;
        return (iHashCode * 1000003) ^ (o000000Var == null ? 0 : o000000Var.hashCode());
    }

    public final String toString() {
        String string = this.f26641OooO00o.toString();
        int length = string.length();
        String strValueOf = String.valueOf(this.f26642OooO0O0);
        StringBuilder sb = new StringBuilder(length + 45 + strValueOf.length() + 1);
        androidx.datastore.preferences.protobuf.OooO00o.OooOooO(sb, "FlagsContext{context=", string, ", hermeticFileOverrides=", strValueOf);
        sb.append("}");
        return sb.toString();
    }
}
