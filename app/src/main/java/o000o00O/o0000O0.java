package o000o00o;

import androidx.datastore.preferences.protobuf.OooO00o;

/* loaded from: classes2.dex */
public final class o0000O0 {
    public static final o0000oo Companion = new o0000oo();

    /* renamed from: OooO00o */
    public final int f30757OooO00o;

    /* renamed from: OooO0O0 */
    public final String f30758OooO0O0;

    public /* synthetic */ o0000O0(int i, int i2, String str) {
        if (3 != (i & 3)) {
            o00OO0oo.Oooo0.OooO00o(i, 3, o0000O00.f30759OooO00o.OooO0Oo());
            throw null;
        }
        this.f30757OooO00o = i2;
        this.f30758OooO0O0 = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0000O0)) {
            return false;
        }
        o0000O0 o0000o02 = (o0000O0) obj;
        return this.f30757OooO00o == o0000o02.f30757OooO00o && kotlin.jvm.internal.OooOo.OooO00o(this.f30758OooO0O0, o0000o02.f30758OooO0O0);
    }

    public final int hashCode() {
        return this.f30758OooO0O0.hashCode() + (Integer.hashCode(this.f30757OooO00o) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProcessData(pid=");
        sb.append(this.f30757OooO00o);
        sb.append(", uuid=");
        return OooO00o.OooO0oO(')', this.f30758OooO0O0, sb);
    }

    public o0000O0(int i, String uuid) {
        kotlin.jvm.internal.OooOo.OooO0o0(uuid, "uuid");
        this.f30757OooO00o = i;
        this.f30758OooO0O0 = uuid;
    }
}
