package o0000OOo;

/* loaded from: classes2.dex */
public enum o00O00O implements com.google.crypto.tink.shaded.protobuf.o0Oo0oo {
    UNKNOWN_STATUS(0),
    ENABLED(1),
    DISABLED(2),
    DESTROYED(3),
    UNRECOGNIZED(-1);


    /* renamed from: OooOo0O, reason: collision with root package name */
    public final int f29411OooOo0O;

    o00O00O(int i) {
        this.f29411OooOo0O = i;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f29411OooOo0O;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
