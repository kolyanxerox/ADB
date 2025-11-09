package o00OOoo;

import java.io.IOException;
import o00OOOoO.o0000;
import o00OOOoO.o0000OO0;
import o00OOOoO.o0O0ooO;

/* loaded from: classes3.dex */
public final class o000oOoO extends o0000OO0 {

    /* renamed from: OooOo, reason: collision with root package name */
    public final boolean f32617OooOo;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final long f32618OooOo0o;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public long f32619OooOoO0;

    public o000oOoO(o0O0ooO o0o0ooo, long j, boolean z) {
        super(o0o0ooo);
        this.f32618OooOo0o = j;
        this.f32617OooOo = z;
    }

    @Override // o00OOOoO.o0O0ooO
    public final long OooO0oO(long j, o0000 sink) throws IOException {
        kotlin.jvm.internal.OooOo.OooO0o0(sink, "sink");
        long j2 = this.f32619OooOoO0;
        long j3 = this.f32618OooOo0o;
        if (j2 > j3) {
            j = 0;
        } else if (this.f32617OooOo) {
            long j4 = j3 - j2;
            if (j4 == 0) {
                return -1L;
            }
            j = Math.min(j, j4);
        }
        long jOooO0oO = this.f32560OooOo0O.OooO0oO(j, sink);
        if (jOooO0oO != -1) {
            this.f32619OooOoO0 += jOooO0oO;
        }
        long j5 = this.f32619OooOoO0;
        if ((j5 >= j3 || jOooO0oO != -1) && j5 <= j3) {
            return jOooO0oO;
        }
        if (jOooO0oO > 0 && j5 > j3) {
            long j6 = sink.f32535OooOo0o - (j5 - j3);
            o0000 o0000Var = new o0000();
            o0000Var.OooO(sink);
            sink.OooOO0(j6, o0000Var);
            o0000Var.skip(o0000Var.f32535OooOo0o);
        }
        StringBuilder sbOooOOo = OooO0oO.OooOo.OooOOo(j3, "expected ", " bytes but got ");
        sbOooOOo.append(this.f32619OooOoO0);
        throw new IOException(sbOooOOo.toString());
    }
}
