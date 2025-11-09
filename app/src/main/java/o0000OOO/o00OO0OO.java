package o0000OOo;

/* loaded from: classes2.dex */
public enum o00OO0OO implements com.google.crypto.tink.shaded.protobuf.o0Oo0oo {
    UNKNOWN_PREFIX(0),
    TINK(1),
    LEGACY(2),
    RAW(3),
    CRUNCHY(4),
    UNRECOGNIZED(-1);


    /* renamed from: OooOo0O, reason: collision with root package name */
    public final int f29419OooOo0O;

    o00OO0OO(int i) {
        this.f29419OooOo0O = i;
    }

    public static o00OO0OO OooO00o(int i) {
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

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f29419OooOo0O;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
