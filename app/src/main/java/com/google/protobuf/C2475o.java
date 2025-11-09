package com.google.protobuf;

/* renamed from: com.google.protobuf.o */
/* loaded from: classes2.dex */
public enum C2475o extends oO00000o {
    public C2475o() {
        super("STRICT", 1);
    }

    @Override // com.google.protobuf.oO00000o
    public final Object OooO00o(CodedInputStream codedInputStream) {
        return codedInputStream.readStringRequireUtf8();
    }
}
