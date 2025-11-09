package com.google.protobuf;

/* loaded from: classes2.dex */
public final class o00O00OO implements o0oOO {

    /* renamed from: OooO0O0, reason: collision with root package name */
    public static final o00O00OO f28255OooO0O0 = new o00O00OO(0);

    /* renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f28256OooO00o;

    public /* synthetic */ o00O00OO(int i) {
        this.f28256OooO00o = i;
    }

    @Override // com.google.protobuf.o0oOO
    public final boolean isSupported(Class cls) {
        switch (this.f28256OooO00o) {
            case 0:
                return GeneratedMessageLite.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }

    @Override // com.google.protobuf.o0oOO
    public final o00Oo00 messageInfoFor(Class cls) {
        switch (this.f28256OooO00o) {
            case 0:
                if (!GeneratedMessageLite.class.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
                }
                try {
                    return (o00Oo00) GeneratedMessageLite.getDefaultInstance(cls.asSubclass(GeneratedMessageLite.class)).buildMessageInfo();
                } catch (Exception e) {
                    throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }
}
