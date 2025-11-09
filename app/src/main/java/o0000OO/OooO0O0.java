package o0000OO;

import OooO0oO.OooOo;
import java.util.Objects;
import o00000oo.o000oOoO;

/* loaded from: classes2.dex */
public final class OooO0O0 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final o000oOoO f29383OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final int f29384OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final String f29385OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final String f29386OooO0Oo;

    public OooO0O0(o000oOoO o000oooo2, int i, String str, String str2) {
        this.f29383OooO00o = o000oooo2;
        this.f29384OooO0O0 = i;
        this.f29385OooO0OO = str;
        this.f29386OooO0Oo = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof OooO0O0)) {
            return false;
        }
        OooO0O0 oooO0O0 = (OooO0O0) obj;
        return this.f29383OooO00o == oooO0O0.f29383OooO00o && this.f29384OooO0O0 == oooO0O0.f29384OooO0O0 && this.f29385OooO0OO.equals(oooO0O0.f29385OooO0OO) && this.f29386OooO0Oo.equals(oooO0O0.f29386OooO0Oo);
    }

    public final int hashCode() {
        return Objects.hash(this.f29383OooO00o, Integer.valueOf(this.f29384OooO0O0), this.f29385OooO0OO, this.f29386OooO0Oo);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(status=");
        sb.append(this.f29383OooO00o);
        sb.append(", keyId=");
        sb.append(this.f29384OooO0O0);
        sb.append(", keyType='");
        sb.append(this.f29385OooO0OO);
        sb.append("', keyPrefix='");
        return OooOo.OooOOOo(sb, this.f29386OooO0Oo, "')");
    }
}
