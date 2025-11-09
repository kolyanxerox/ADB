package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public enum fy0 implements b01 {
    UNKNOWN_PREFIX(0),
    TINK(1),
    LEGACY(2),
    RAW(3),
    CRUNCHY(4),
    UNRECOGNIZED(-1);


    /* renamed from: OooOo0O, reason: collision with root package name */
    public final int f19143OooOo0O;

    fy0(int i) {
        this.f19143OooOo0O = i;
    }

    public static fy0 OooO0O0(int i) {
        if (i == 0) {
            return UNKNOWN_PREFIX;
        }
        if (i == 1) {
            return TINK;
        }
        if (i == 2) {
            return LEGACY;
        }
        if (i == 3) {
            return RAW;
        }
        if (i != 4) {
            return null;
        }
        return CRUNCHY;
    }

    public final int OooO00o() {
        if (this != UNRECOGNIZED) {
            return this.f19143OooOo0O;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(OooO00o());
    }
}
