package o0000;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class Oooo0 extends OooO0OO {

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final int f28935OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final int f28936OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final int f28937OooO0Oo;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final OooOOOO f28938OooO0o0;

    public Oooo0(int i, int i2, int i3, OooOOOO oooOOOO) {
        this.f28935OooO0O0 = i;
        this.f28936OooO0OO = i2;
        this.f28937OooO0Oo = i3;
        this.f28938OooO0o0 = oooOOOO;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Oooo0)) {
            return false;
        }
        Oooo0 oooo0 = (Oooo0) obj;
        return oooo0.f28935OooO0O0 == this.f28935OooO0O0 && oooo0.f28936OooO0OO == this.f28936OooO0OO && oooo0.f28937OooO0Oo == this.f28937OooO0Oo && oooo0.f28938OooO0o0 == this.f28938OooO0o0;
    }

    public final int hashCode() {
        return Objects.hash(Oooo0.class, Integer.valueOf(this.f28935OooO0O0), Integer.valueOf(this.f28936OooO0OO), Integer.valueOf(this.f28937OooO0Oo), this.f28938OooO0o0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AesEax Parameters (variant: ");
        sb.append(this.f28938OooO0o0);
        sb.append(", ");
        sb.append(this.f28936OooO0OO);
        sb.append("-byte IV, ");
        sb.append(this.f28937OooO0Oo);
        sb.append("-byte tag, and ");
        return OooO0oO.OooOo.OooOOO(sb, this.f28935OooO0O0, "-byte key)");
    }
}
