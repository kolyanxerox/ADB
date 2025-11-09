package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes2.dex */
public final class o00Ooo implements o000OO {

    /* renamed from: OooO0O0, reason: collision with root package name */
    public static final o00Ooo f28118OooO0O0 = new o00Ooo(0);

    /* renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f28119OooO00o;

    public /* synthetic */ o00Ooo(int i) {
        this.f28119OooO00o = i;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o000OO
    public final boolean isSupported(Class cls) {
        switch (this.f28119OooO00o) {
            case 0:
                return o0ooOOo.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o000OO
    public final o000OO0O messageInfoFor(Class cls) {
        switch (this.f28119OooO00o) {
            case 0:
                if (!o0ooOOo.class.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
                }
                try {
                    return (o000OO0O) o0ooOOo.OooO(cls.asSubclass(o0ooOOo.class)).OooO0oo(3);
                } catch (Exception e) {
                    throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }
}
