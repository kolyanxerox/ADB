package com.google.protobuf;

/* loaded from: classes2.dex */
public final class o0O0oo00 implements o00Oo00 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final ProtoSyntax f28336OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final boolean f28337OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final int[] f28338OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final o00O0000[] f28339OooO0Oo;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final MessageLite f28340OooO0o0;

    public o0O0oo00(ProtoSyntax protoSyntax, boolean z, int[] iArr, o00O0000[] o00o0000Arr, Object obj) {
        this.f28336OooO00o = protoSyntax;
        this.f28337OooO0O0 = z;
        this.f28338OooO0OO = iArr;
        this.f28339OooO0Oo = o00o0000Arr;
        this.f28340OooO0o0 = (MessageLite) Internal.checkNotNull(obj, "defaultInstance");
    }

    @Override // com.google.protobuf.o00Oo00
    public final MessageLite getDefaultInstance() {
        return this.f28340OooO0o0;
    }

    @Override // com.google.protobuf.o00Oo00
    public final ProtoSyntax getSyntax() {
        return this.f28336OooO00o;
    }

    @Override // com.google.protobuf.o00Oo00
    public final boolean isMessageSetWireFormat() {
        return this.f28337OooO0O0;
    }
}
