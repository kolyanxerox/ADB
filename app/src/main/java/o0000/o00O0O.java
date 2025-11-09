package o0000;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class o00O0O extends OooO0OO {

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final int f28947OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final int f28948OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final int f28949OooO0Oo;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final OooOOOO f28950OooO0o0;

    public o00O0O(int i, int i2, int i3, OooOOOO oooOOOO) {
        this.f28947OooO0O0 = i;
        this.f28948OooO0OO = i2;
        this.f28949OooO0Oo = i3;
        this.f28950OooO0o0 = oooOOOO;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o00O0O)) {
            return false;
        }
        o00O0O o00o0o = (o00O0O) obj;
        return o00o0o.f28947OooO0O0 == this.f28947OooO0O0 && o00o0o.f28948OooO0OO == this.f28948OooO0OO && o00o0o.f28949OooO0Oo == this.f28949OooO0Oo && o00o0o.f28950OooO0o0 == this.f28950OooO0o0;
    }

    public final int hashCode() {
        return Objects.hash(o00O0O.class, Integer.valueOf(this.f28947OooO0O0), Integer.valueOf(this.f28948OooO0OO), Integer.valueOf(this.f28949OooO0Oo), this.f28950OooO0o0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AesGcm Parameters (variant: ");
        sb.append(this.f28950OooO0o0);
        sb.append(", ");
        sb.append(this.f28948OooO0OO);
        sb.append("-byte IV, ");
        sb.append(this.f28949OooO0Oo);
        sb.append("-byte tag, and ");
        return OooO0oO.OooOo.OooOOO(sb, this.f28947OooO0O0, "-byte key)");
    }
}
