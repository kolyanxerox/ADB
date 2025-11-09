package OooOOo0;

import OooOOO.OooO0O0;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class o000oOoO {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final OooO0O0 f13506OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final byte[] f13507OooO0O0;

    public o000oOoO(OooO0O0 oooO0O0, byte[] bArr) {
        if (oooO0O0 == null) {
            throw new NullPointerException("encoding is null");
        }
        if (bArr == null) {
            throw new NullPointerException("bytes is null");
        }
        this.f13506OooO00o = oooO0O0;
        this.f13507OooO0O0 = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o000oOoO)) {
            return false;
        }
        o000oOoO o000oooo2 = (o000oOoO) obj;
        if (this.f13506OooO00o.equals(o000oooo2.f13506OooO00o)) {
            return Arrays.equals(this.f13507OooO0O0, o000oooo2.f13507OooO0O0);
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f13506OooO00o.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f13507OooO0O0);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.f13506OooO00o + ", bytes=[...]}";
    }
}
