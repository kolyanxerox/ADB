package com.google.android.gms.internal.play_billing;

import java.io.Serializable;

/* loaded from: classes2.dex */
public final class o0000O0 extends o0000O0O implements Serializable {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f26982OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public static final o0000O0 f26981OooOo0o = new o0000O0(0);

    /* renamed from: OooOo, reason: collision with root package name */
    public static final o0000O0 f26980OooOo = new o0000O0(1);

    public /* synthetic */ o0000O0(int i) {
        this.f26982OooOo0O = i;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        switch (this.f26982OooOo0O) {
            case 0:
                Comparable comparable = (Comparable) obj;
                Comparable comparable2 = (Comparable) obj2;
                comparable.getClass();
                comparable2.getClass();
                return comparable.compareTo(comparable2);
            default:
                o000OO o000oo2 = (o000OO) obj;
                o000OO o000oo3 = (o000OO) obj2;
                return o00oO0o.f27068OooO00o.OooO0O0(o000oo2.f27021OooOo0O, o000oo3.f27021OooOo0O).OooO0O0(o000oo2.f27022OooOo0o, o000oo3.f27022OooOo0o).OooO00o();
        }
    }

    public String toString() {
        switch (this.f26982OooOo0O) {
            case 0:
                return "Ordering.natural()";
            default:
                return super.toString();
        }
    }
}
