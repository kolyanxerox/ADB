package com.google.android.gms.internal.play_billing;

/* loaded from: classes2.dex */
public final class o0ooOOo extends o0OOO0o {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f27180OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public static final o0ooOOo f27179OooOo0o = new o0ooOOo(0);

    /* renamed from: OooOo, reason: collision with root package name */
    public static final o0ooOOo f27178OooOo = new o0ooOOo(1);

    public /* synthetic */ o0ooOOo(int i) {
        this.f27180OooOo0O = i;
    }

    @Override // com.google.android.gms.internal.play_billing.o0OOO0o
    public final int OooO00o(o0OOO0o o0ooo0o) {
        switch (this.f27180OooOo0O) {
            case 0:
                return o0ooo0o == this ? 0 : 1;
            default:
                return o0ooo0o == this ? 0 : -1;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.o0OOO0o
    public final void OooO0O0(StringBuilder sb) {
        switch (this.f27180OooOo0O) {
            case 0:
                throw new AssertionError();
            default:
                sb.append("(-∞");
                return;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.o0OOO0o
    public final void OooO0OO(StringBuilder sb) {
        switch (this.f27180OooOo0O) {
            case 0:
                sb.append("+∞)");
                return;
            default:
                throw new AssertionError();
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        switch (this.f27180OooOo0O) {
            case 0:
                return ((o0OOO0o) obj) == this ? 0 : 1;
            default:
                return ((o0OOO0o) obj) == this ? 0 : -1;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.o0OOO0o
    public final int hashCode() {
        switch (this.f27180OooOo0O) {
        }
        return System.identityHashCode(this);
    }

    public final String toString() {
        switch (this.f27180OooOo0O) {
            case 0:
                return "+∞";
            default:
                return "-∞";
        }
    }
}
