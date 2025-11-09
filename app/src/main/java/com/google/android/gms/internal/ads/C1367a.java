package com.google.android.gms.internal.ads;

import java.io.ByteArrayOutputStream;

/* renamed from: com.google.android.gms.internal.ads.a */
/* loaded from: classes2.dex */
public final class C1367a extends ByteArrayOutputStream implements AutoCloseable {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final oOo0o00 f16860OooOo0O;

    public C1367a(oOo0o00 ooo0o00, int i) {
        this.f16860OooOo0O = ooo0o00;
        ((ByteArrayOutputStream) this).buf = ooo0o00.OooO(Math.max(i, 256));
    }

    public final void OooO00o(int i) {
        int i2 = ((ByteArrayOutputStream) this).count;
        if (i2 + i <= ((ByteArrayOutputStream) this).buf.length) {
            return;
        }
        int i3 = i2 + i;
        oOo0o00 ooo0o00 = this.f16860OooOo0O;
        byte[] bArrOooO = ooo0o00.OooO(i3 + i3);
        System.arraycopy(((ByteArrayOutputStream) this).buf, 0, bArrOooO, 0, ((ByteArrayOutputStream) this).count);
        ooo0o00.OooO0o(((ByteArrayOutputStream) this).buf);
        ((ByteArrayOutputStream) this).buf = bArrOooO;
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f16860OooOo0O.OooO0o(((ByteArrayOutputStream) this).buf);
        ((ByteArrayOutputStream) this).buf = null;
        super.close();
    }

    public final void finalize() {
        this.f16860OooOo0O.OooO0o(((ByteArrayOutputStream) this).buf);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public final synchronized void write(int i) {
        OooO00o(1);
        super.write(i);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i, int i2) {
        OooO00o(i2);
        super.write(bArr, i, i2);
    }
}
