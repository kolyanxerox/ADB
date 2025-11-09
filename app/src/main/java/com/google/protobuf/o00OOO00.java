package com.google.protobuf;

/* loaded from: classes2.dex */
public final class o00OOO00 implements o0oOO {

    /* renamed from: OooO00o, reason: collision with root package name */
    public o0oOO[] f28276OooO00o;

    @Override // com.google.protobuf.o0oOO
    public final boolean isSupported(Class cls) {
        for (o0oOO o0ooo : this.f28276OooO00o) {
            if (o0ooo.isSupported(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.protobuf.o0oOO
    public final o00Oo00 messageInfoFor(Class cls) {
        for (o0oOO o0ooo : this.f28276OooO00o) {
            if (o0ooo.isSupported(cls)) {
                return o0ooo.messageInfoFor(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }
}
