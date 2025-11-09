package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes2.dex */
public final class o0000 implements o000OO {

    /* renamed from: OooO00o, reason: collision with root package name */
    public o000OO[] f28059OooO00o;

    @Override // com.google.crypto.tink.shaded.protobuf.o000OO
    public final boolean isSupported(Class cls) {
        for (o000OO o000oo2 : this.f28059OooO00o) {
            if (o000oo2.isSupported(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o000OO
    public final o000OO0O messageInfoFor(Class cls) {
        for (o000OO o000oo2 : this.f28059OooO00o) {
            if (o000oo2.isSupported(cls)) {
                return o000oo2.messageInfoFor(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }
}
