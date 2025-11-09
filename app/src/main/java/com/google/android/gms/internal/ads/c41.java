package com.google.android.gms.internal.ads;

import androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public class c41 extends ta0 {

    /* renamed from: OooO */
    public final int f17678OooO;

    /* renamed from: OooO0OO */
    public o0OoOo0 f17679OooO0OO;

    /* renamed from: OooO0Oo */
    public final h31 f17680OooO0Oo = new h31();

    /* renamed from: OooO0o */
    public boolean f17681OooO0o;

    /* renamed from: OooO0o0 */
    public ByteBuffer f17682OooO0o0;

    /* renamed from: OooO0oO */
    public long f17683OooO0oO;

    /* renamed from: OooO0oo */
    public ByteBuffer f17684OooO0oo;

    static {
        AbstractC2030s.OooO00o("media3.decoder");
    }

    public c41(int i) {
        this.f17678OooO = i;
    }

    public void OooO0Oo() {
        this.f24281OooO0O0 = 0;
        ByteBuffer byteBuffer = this.f17682OooO0o0;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f17684OooO0oo;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f17681OooO0o = false;
    }

    public final void OooO0o() {
        ByteBuffer byteBuffer = this.f17682OooO0o0;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f17684OooO0oo;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }

    public final void OooO0o0(int i) {
        ByteBuffer byteBuffer = this.f17682OooO0o0;
        if (byteBuffer == null) {
            this.f17682OooO0o0 = OooO0oo(i);
            return;
        }
        int iCapacity = byteBuffer.capacity();
        int iPosition = byteBuffer.position();
        int i2 = i + iPosition;
        if (iCapacity >= i2) {
            this.f17682OooO0o0 = byteBuffer;
            return;
        }
        ByteBuffer byteBufferOooO0oo = OooO0oo(i2);
        byteBufferOooO0oo.order(byteBuffer.order());
        if (iPosition > 0) {
            byteBuffer.flip();
            byteBufferOooO0oo.put(byteBuffer);
        }
        this.f17682OooO0o0 = byteBufferOooO0oo;
    }

    public final boolean OooO0oO() {
        return OooO00o(BasicMeasure.EXACTLY);
    }

    public final ByteBuffer OooO0oo(int i) {
        int i2 = this.f17678OooO;
        if (i2 == 1) {
            return ByteBuffer.allocate(i);
        }
        if (i2 == 2) {
            return ByteBuffer.allocateDirect(i);
        }
        ByteBuffer byteBuffer = this.f17682OooO0o0;
        throw new b41(OooO0oO.OooOo.OooO("Buffer too small (", byteBuffer == null ? 0 : byteBuffer.capacity(), " < ", i, ")"));
    }
}
