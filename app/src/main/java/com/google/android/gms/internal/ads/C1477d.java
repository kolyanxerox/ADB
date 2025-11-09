package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* renamed from: com.google.android.gms.internal.ads.d */
/* loaded from: classes2.dex */
public final class C1477d extends i31 {
    static {
        ii0.OooOoOO(C1477d.class);
    }

    public C1477d(C1428bn c1428bn, C1501dn c1501dn) {
        ByteBuffer byteBuffer = c1428bn.f17524OooOo0O;
        long jLimit = byteBuffer.limit();
        this.f19935OooOo0o = c1428bn;
        this.f19937OooOoO0 = c1428bn.OooO0O0();
        byteBuffer.position((int) (c1428bn.OooO0O0() + jLimit));
        this.f19936OooOoO = c1428bn.OooO0O0();
        this.f19934OooOo0O = c1501dn;
    }

    @Override // com.google.android.gms.internal.ads.i31, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // com.google.android.gms.internal.ads.i31
    public final String toString() {
        String string = this.f19935OooOo0o.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 7);
        sb.append("model(");
        sb.append(string);
        sb.append(")");
        return sb.toString();
    }
}
