package com.google.android.gms.internal.measurement;

/* loaded from: classes2.dex */
public enum ooo0Oo0 implements oO000Oo0 {
    PURPOSE_RESTRICTION_NOT_ALLOWED(0),
    PURPOSE_RESTRICTION_REQUIRE_CONSENT(1),
    PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST(2),
    PURPOSE_RESTRICTION_UNDEFINED(3),
    UNRECOGNIZED(-1);


    /* renamed from: OooOo0O, reason: collision with root package name */
    public final int f26925OooOo0O;

    ooo0Oo0(int i) {
        this.f26925OooOo0O = i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f26925OooOo0O);
    }

    @Override // com.google.android.gms.internal.measurement.oO000Oo0
    public final int zza() {
        if (this != UNRECOGNIZED) {
            return this.f26925OooOo0O;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
