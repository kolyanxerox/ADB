package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public abstract class g31 implements InterfaceC1513e {

    /* renamed from: OooOoo, reason: collision with root package name */
    public static final ii0 f19209OooOoo = ii0.OooOoOO(g31.class);

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final String f19211OooOo0O;

    /* renamed from: OooOoO, reason: collision with root package name */
    public long f19213OooOoO;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public ByteBuffer f19214OooOoO0;

    /* renamed from: OooOoo0, reason: collision with root package name */
    public C1428bn f19216OooOoo0;

    /* renamed from: OooOoOO, reason: collision with root package name */
    public long f19215OooOoOO = -1;

    /* renamed from: OooOo, reason: collision with root package name */
    public boolean f19210OooOo = true;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public boolean f19212OooOo0o = true;

    public g31(String str) {
        this.f19211OooOo0O = str;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1513e
    public final void OooO00o(C1428bn c1428bn, ByteBuffer byteBuffer, long j, AbstractC1440c abstractC1440c) {
        this.f19213OooOoO = c1428bn.OooO0O0();
        byteBuffer.remaining();
        this.f19215OooOoOO = j;
        this.f19216OooOoo0 = c1428bn;
        c1428bn.f17524OooOo0O.position((int) (c1428bn.OooO0O0() + j));
        this.f19210OooOo = false;
        this.f19212OooOo0o = false;
        OooO0Oo();
    }

    public final synchronized void OooO0O0() {
        try {
            if (this.f19210OooOo) {
                return;
            }
            try {
                ii0 ii0Var = f19209OooOoo;
                String str = this.f19211OooOo0O;
                ii0Var.OooOOO(str.length() != 0 ? "mem mapping ".concat(str) : new String("mem mapping "));
                C1428bn c1428bn = this.f19216OooOoo0;
                long j = this.f19213OooOoO;
                long j2 = this.f19215OooOoOO;
                ByteBuffer byteBuffer = c1428bn.f17524OooOo0O;
                int iPosition = byteBuffer.position();
                byteBuffer.position((int) j);
                ByteBuffer byteBufferSlice = byteBuffer.slice();
                byteBufferSlice.limit((int) j2);
                byteBuffer.position(iPosition);
                this.f19214OooOoO0 = byteBufferSlice;
                this.f19210OooOo = true;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public abstract void OooO0OO(ByteBuffer byteBuffer);

    public final synchronized void OooO0Oo() {
        try {
            OooO0O0();
            ii0 ii0Var = f19209OooOoo;
            String str = this.f19211OooOo0O;
            ii0Var.OooOOO(str.length() != 0 ? "parsing details of ".concat(str) : new String("parsing details of "));
            ByteBuffer byteBuffer = this.f19214OooOoO0;
            if (byteBuffer != null) {
                this.f19212OooOo0o = true;
                byteBuffer.rewind();
                OooO0OO(byteBuffer);
                if (byteBuffer.remaining() > 0) {
                    byteBuffer.slice();
                }
                this.f19214OooOoO0 = null;
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
