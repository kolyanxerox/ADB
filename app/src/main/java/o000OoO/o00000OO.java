package o000Ooo;

import androidx.datastore.preferences.protobuf.OooO00o;

/* loaded from: classes2.dex */
public final class o00000OO {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final String f30464OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final String f30465OooO0O0;

    public o00000OO(String str, String str2) {
        this.f30464OooO00o = str;
        this.f30465OooO0O0 = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o00000OO)) {
            return false;
        }
        o00000OO o00000oo2 = (o00000OO) obj;
        return kotlin.jvm.internal.OooOo.OooO00o(this.f30464OooO00o, o00000oo2.f30464OooO00o) && kotlin.jvm.internal.OooOo.OooO00o(this.f30465OooO0O0, o00000oo2.f30465OooO0O0);
    }

    public final int hashCode() {
        String str = this.f30464OooO00o;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f30465OooO0O0;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FirebaseInstallationId(fid=");
        sb.append(this.f30464OooO00o);
        sb.append(", authToken=");
        return OooO00o.OooO0oO(')', this.f30465OooO0O0, sb);
    }
}
