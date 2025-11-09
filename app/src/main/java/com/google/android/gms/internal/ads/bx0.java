package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public enum bx0 implements b01 {
    UNKNOWN_HASH(0),
    SHA1(1),
    SHA384(2),
    SHA256(3),
    SHA512(4),
    SHA224(5),
    UNRECOGNIZED(-1);


    /* renamed from: OooOo0O, reason: collision with root package name */
    public final int f17615OooOo0O;

    bx0(int i) {
        this.f17615OooOo0O = i;
    }

    public final int OooO00o() {
        if (this != UNRECOGNIZED) {
            return this.f17615OooOo0O;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(OooO00o());
    }
}
