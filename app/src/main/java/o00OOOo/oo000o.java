package o00OOoo;

import java.io.IOException;
import kotlin.jvm.internal.o0Oo0oo;
import o00OOOoO.o000O0O0;

/* loaded from: classes3.dex */
public final class oo000o extends kotlin.jvm.internal.Oooo000 implements o00O0Oo.o00O0O {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ o0Oo0oo f32637OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ o000O0O0 f32638OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ o0Oo0oo f32639OooOo0o;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ o0Oo0oo f32640OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo000o(o000O0O0 o000o0o02, o0Oo0oo o0oo0oo, o0Oo0oo o0oo0oo2, o0Oo0oo o0oo0oo3) {
        super(2);
        this.f32638OooOo0O = o000o0o02;
        this.f32639OooOo0o = o0oo0oo;
        this.f32637OooOo = o0oo0oo2;
        this.f32640OooOoO0 = o0oo0oo3;
    }

    @Override // o00O0Oo.o00O0O
    public final Object invoke(Object obj, Object obj2) throws IOException {
        int iIntValue = ((Number) obj).intValue();
        long jLongValue = ((Number) obj2).longValue();
        if (iIntValue == 21589) {
            if (jLongValue < 1) {
                throw new IOException("bad zip: extended timestamp extra too short");
            }
            byte b = this.f32638OooOo0O.readByte();
            boolean z = (b & 1) == 1;
            boolean z2 = (b & 2) == 2;
            boolean z3 = (b & 4) == 4;
            long j = z ? 5L : 1L;
            if (z2) {
                j += 4;
            }
            if (z3) {
                j += 4;
            }
            if (jLongValue < j) {
                throw new IOException("bad zip: extended timestamp extra too short");
            }
            if (z) {
                this.f32639OooOo0o.f28880OooOo0O = Long.valueOf(r2.readIntLe() * 1000);
            }
            if (z2) {
                this.f32637OooOo.f28880OooOo0O = Long.valueOf(r2.readIntLe() * 1000);
            }
            if (z3) {
                this.f32640OooOoO0.f28880OooOo0O = Long.valueOf(r2.readIntLe() * 1000);
            }
        }
        return oo00o.OooOo.f33195OooO00o;
    }
}
