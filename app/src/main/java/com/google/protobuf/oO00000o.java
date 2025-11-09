package com.google.protobuf;

/* loaded from: classes2.dex */
public abstract class oO00000o extends java.lang.Enum {

    /* renamed from: OooOo */
    public static final /* synthetic */ oO00000o[] f28424OooOo;

    /* renamed from: OooOo0O */
    public static final ooo0Oo0 f28425OooOo0O;

    /* renamed from: OooOo0o */
    public static final C2475o f28426OooOo0o;

    static {
        ooo0Oo0 ooo0oo0 = new ooo0Oo0();
        f28425OooOo0O = ooo0oo0;
        C2475o c2475o = new C2475o();
        f28426OooOo0o = c2475o;
        f28424OooOo = new oO00000o[]{ooo0oo0, c2475o, new oO00000o() { // from class: com.google.protobuf.oO00000
            @Override // com.google.protobuf.oO00000o
            public final Object OooO00o(CodedInputStream codedInputStream) {
                return codedInputStream.readBytes();
            }
        }};
    }

    public static oO00000o valueOf(String str) {
        return (oO00000o) java.lang.Enum.valueOf(oO00000o.class, str);
    }

    public static oO00000o[] values() {
        return (oO00000o[]) f28424OooOo.clone();
    }

    public abstract Object OooO00o(CodedInputStream codedInputStream);
}
