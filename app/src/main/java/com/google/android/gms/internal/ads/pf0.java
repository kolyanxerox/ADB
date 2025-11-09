package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public enum pf0 implements b01 {
    SCAR_REQUEST_TYPE_ADMOB(0),
    SCAR_REQUEST_TYPE_UNSPECIFIED(-1),
    SCAR_REQUEST_TYPE_INBOUND_MEDIATION(1),
    SCAR_REQUEST_TYPE_GBID(2),
    SCAR_REQUEST_TYPE_GOLDENEYE(3),
    SCAR_REQUEST_TYPE_YAVIN(4),
    SCAR_REQUEST_TYPE_UNITY(5),
    SCAR_REQUEST_TYPE_PAW(6),
    SCAR_REQUEST_TYPE_GUILDER(7),
    SCAR_REQUEST_TYPE_GAM_S2S(8),
    UNRECOGNIZED(-1);


    /* renamed from: OooOo0O, reason: collision with root package name */
    public final int f23342OooOo0O;

    pf0(int i) {
        this.f23342OooOo0O = i;
    }

    public final int OooO00o() {
        if (this != UNRECOGNIZED) {
            return this.f23342OooOo0O;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(OooO00o());
    }
}
