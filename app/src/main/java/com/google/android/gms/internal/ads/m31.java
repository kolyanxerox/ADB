package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class m31 {

    /* renamed from: OooOO0, reason: collision with root package name */
    public static final m31 f21046OooOO0 = new m31(1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* renamed from: OooOO0O, reason: collision with root package name */
    public static final m31 f21047OooOO0O = new m31(0.0d, 1.0d, -1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final m31 OooOO0o = new m31(-1.0d, 0.0d, 0.0d, -1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* renamed from: OooOOO0, reason: collision with root package name */
    public static final m31 f21048OooOOO0 = new m31(0.0d, -1.0d, 1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* renamed from: OooO, reason: collision with root package name */
    public final double f21049OooO;

    /* renamed from: OooO00o, reason: collision with root package name */
    public final double f21050OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final double f21051OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final double f21052OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final double f21053OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public final double f21054OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final double f21055OooO0o0;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public final double f21056OooO0oO;

    /* renamed from: OooO0oo, reason: collision with root package name */
    public final double f21057OooO0oo;

    public m31(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9) {
        this.f21050OooO00o = d5;
        this.f21051OooO0O0 = d6;
        this.f21052OooO0OO = d7;
        this.f21053OooO0Oo = d;
        this.f21055OooO0o0 = d2;
        this.f21054OooO0o = d3;
        this.f21056OooO0oO = d4;
        this.f21057OooO0oo = d8;
        this.f21049OooO = d9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m31.class != obj.getClass()) {
            return false;
        }
        m31 m31Var = (m31) obj;
        return Double.compare(m31Var.f21053OooO0Oo, this.f21053OooO0Oo) == 0 && Double.compare(m31Var.f21055OooO0o0, this.f21055OooO0o0) == 0 && Double.compare(m31Var.f21054OooO0o, this.f21054OooO0o) == 0 && Double.compare(m31Var.f21056OooO0oO, this.f21056OooO0oO) == 0 && Double.compare(m31Var.f21057OooO0oo, this.f21057OooO0oo) == 0 && Double.compare(m31Var.f21049OooO, this.f21049OooO) == 0 && Double.compare(m31Var.f21050OooO00o, this.f21050OooO00o) == 0 && Double.compare(m31Var.f21051OooO0O0, this.f21051OooO0O0) == 0 && Double.compare(m31Var.f21052OooO0OO, this.f21052OooO0OO) == 0;
    }

    public final int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.f21050OooO00o);
        long j = jDoubleToLongBits ^ (jDoubleToLongBits >>> 32);
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.f21051OooO0O0);
        long j2 = jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32);
        long jDoubleToLongBits3 = Double.doubleToLongBits(this.f21052OooO0OO);
        long j3 = jDoubleToLongBits3 ^ (jDoubleToLongBits3 >>> 32);
        long jDoubleToLongBits4 = Double.doubleToLongBits(this.f21053OooO0Oo);
        long j4 = jDoubleToLongBits4 ^ (jDoubleToLongBits4 >>> 32);
        long jDoubleToLongBits5 = Double.doubleToLongBits(this.f21055OooO0o0);
        long j5 = jDoubleToLongBits5 ^ (jDoubleToLongBits5 >>> 32);
        long jDoubleToLongBits6 = Double.doubleToLongBits(this.f21054OooO0o);
        long j6 = jDoubleToLongBits6 ^ (jDoubleToLongBits6 >>> 32);
        long jDoubleToLongBits7 = Double.doubleToLongBits(this.f21056OooO0oO);
        long jDoubleToLongBits8 = Double.doubleToLongBits(this.f21057OooO0oo);
        long j7 = jDoubleToLongBits8 ^ (jDoubleToLongBits8 >>> 32);
        long jDoubleToLongBits9 = Double.doubleToLongBits(this.f21049OooO);
        return (((((((((((((((((int) j) * 31) + ((int) j2)) * 31) + ((int) j3)) * 31) + ((int) j4)) * 31) + ((int) j5)) * 31) + ((int) j6)) * 31) + ((int) (jDoubleToLongBits7 ^ (jDoubleToLongBits7 >>> 32)))) * 31) + ((int) j7)) * 31) + ((int) (jDoubleToLongBits9 ^ (jDoubleToLongBits9 >>> 32)));
    }

    public final String toString() {
        if (equals(f21046OooOO0)) {
            return "Rotate 0°";
        }
        if (equals(f21047OooOO0O)) {
            return "Rotate 90°";
        }
        if (equals(OooOO0o)) {
            return "Rotate 180°";
        }
        if (equals(f21048OooOOO0)) {
            return "Rotate 270°";
        }
        StringBuilder sb = new StringBuilder(260);
        sb.append("Matrix{u=");
        sb.append(this.f21050OooO00o);
        sb.append(", v=");
        sb.append(this.f21051OooO0O0);
        sb.append(", w=");
        sb.append(this.f21052OooO0OO);
        sb.append(", a=");
        sb.append(this.f21053OooO0Oo);
        sb.append(", b=");
        sb.append(this.f21055OooO0o0);
        sb.append(", c=");
        sb.append(this.f21054OooO0o);
        sb.append(", d=");
        sb.append(this.f21056OooO0oO);
        sb.append(", tx=");
        sb.append(this.f21057OooO0oo);
        sb.append(", ty=");
        sb.append(this.f21049OooO);
        sb.append("}");
        return sb.toString();
    }
}
