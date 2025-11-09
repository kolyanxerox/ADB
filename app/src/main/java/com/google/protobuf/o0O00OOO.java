package com.google.protobuf;

/* loaded from: classes2.dex */
public final class o0O00OOO implements o00Oo00 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final MessageLite f28296OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final String f28297OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final Object[] f28298OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final int f28299OooO0Oo;

    public o0O00OOO(MessageLite messageLite, String str, Object[] objArr) {
        this.f28296OooO00o = messageLite;
        this.f28297OooO0O0 = str;
        this.f28298OooO0OO = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f28299OooO0Oo = cCharAt;
            return;
        }
        int i = cCharAt & 8191;
        int i2 = 13;
        int i3 = 1;
        while (true) {
            int i4 = i3 + 1;
            char cCharAt2 = str.charAt(i3);
            if (cCharAt2 < 55296) {
                this.f28299OooO0Oo = i | (cCharAt2 << i2);
                return;
            } else {
                i |= (cCharAt2 & 8191) << i2;
                i2 += 13;
                i3 = i4;
            }
        }
    }

    @Override // com.google.protobuf.o00Oo00
    public final MessageLite getDefaultInstance() {
        return this.f28296OooO00o;
    }

    @Override // com.google.protobuf.o00Oo00
    public final ProtoSyntax getSyntax() {
        int i = this.f28299OooO0Oo;
        return (i & 1) != 0 ? ProtoSyntax.PROTO2 : (i & 4) == 4 ? ProtoSyntax.EDITIONS : ProtoSyntax.PROTO3;
    }

    @Override // com.google.protobuf.o00Oo00
    public final boolean isMessageSetWireFormat() {
        return (this.f28299OooO0Oo & 2) == 2;
    }
}
