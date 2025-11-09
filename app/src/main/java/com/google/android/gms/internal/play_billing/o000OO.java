package com.google.android.gms.internal.play_billing;

/* loaded from: classes2.dex */
public final class o000OO extends o0000O {

    /* renamed from: OooOo, reason: collision with root package name */
    public static final o000OO f27020OooOo = new o000OO(o0ooOOo.f27178OooOo, o0ooOOo.f27179OooOo0o);

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final o0OOO0o f27021OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final o0OOO0o f27022OooOo0o;

    public o000OO(o0OOO0o o0ooo0o, o0OOO0o o0ooo0o2) {
        this.f27021OooOo0O = o0ooo0o;
        this.f27022OooOo0o = o0ooo0o2;
        if (o0ooo0o.OooO00o(o0ooo0o2) > 0 || o0ooo0o == o0ooOOo.f27179OooOo0o || o0ooo0o2 == o0ooOOo.f27178OooOo) {
            StringBuilder sb = new StringBuilder(16);
            o0ooo0o.OooO0O0(sb);
            sb.append("..");
            o0ooo0o2.OooO0OO(sb);
            throw new IllegalArgumentException("Invalid range: ".concat(sb.toString()));
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o000OO) {
            o000OO o000oo2 = (o000OO) obj;
            if (this.f27021OooOo0O.equals(o000oo2.f27021OooOo0O) && this.f27022OooOo0o.equals(o000oo2.f27022OooOo0o)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f27022OooOo0o.hashCode() + (this.f27021OooOo0O.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(16);
        this.f27021OooOo0O.OooO0O0(sb);
        sb.append("..");
        this.f27022OooOo0o.OooO0OO(sb);
        return sb.toString();
    }
}
