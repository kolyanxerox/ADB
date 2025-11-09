package com.google.android.gms.internal.ads;

import androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class x71 extends c41 {

    /* renamed from: OooOO0, reason: collision with root package name */
    public long f25548OooOO0;

    /* renamed from: OooOO0O, reason: collision with root package name */
    public int f25549OooOO0O;
    public int OooOO0o;

    public final int OooO() {
        return this.f25549OooOO0O;
    }

    @Override // com.google.android.gms.internal.ads.c41
    public final void OooO0Oo() {
        super.OooO0Oo();
        this.f25549OooOO0O = 0;
    }

    public final boolean OooOO0(c41 c41Var) {
        ByteBuffer byteBuffer;
        af0.OoooO0(!c41Var.OooO00o(BasicMeasure.EXACTLY));
        af0.OoooO0(!c41Var.OooO00o(268435456));
        af0.OoooO0(!c41Var.OooO00o(4));
        if (OooOO0O()) {
            if (this.f25549OooOO0O >= this.OooOO0o) {
                return false;
            }
            ByteBuffer byteBuffer2 = c41Var.f17682OooO0o0;
            if (byteBuffer2 != null && (byteBuffer = this.f17682OooO0o0) != null) {
                if (byteBuffer2.remaining() + byteBuffer.position() > 3072000) {
                    return false;
                }
            }
        }
        int i = this.f25549OooOO0O;
        this.f25549OooOO0O = i + 1;
        if (i == 0) {
            this.f17683OooO0oO = c41Var.f17683OooO0oO;
            if (c41Var.OooO00o(1)) {
                this.f24281OooO0O0 = 1;
            }
        }
        ByteBuffer byteBuffer3 = c41Var.f17682OooO0o0;
        if (byteBuffer3 != null) {
            OooO0o0(byteBuffer3.remaining());
            this.f17682OooO0o0.put(byteBuffer3);
        }
        this.f25548OooOO0 = c41Var.f17683OooO0oO;
        return true;
    }

    public final boolean OooOO0O() {
        return this.f25549OooOO0O > 0;
    }
}
