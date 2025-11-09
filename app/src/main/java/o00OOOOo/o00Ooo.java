package o00OOOOo;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import o00OOOoO.o0000;
import o00OOOoO.o000O0O0;
import o00OOOoO.o00O000;
import o00OOOoO.o0O0ooO;
import org.apache.tika.fork.ForkServer;

/* loaded from: classes3.dex */
public final class o00Ooo implements o0O0ooO {

    /* renamed from: OooOo */
    public byte f32479OooOo;

    /* renamed from: OooOo0O */
    public final o000O0O0 f32480OooOo0O;

    /* renamed from: OooOo0o */
    public int f32481OooOo0o;

    /* renamed from: OooOoO */
    public int f32482OooOoO;

    /* renamed from: OooOoO0 */
    public int f32483OooOoO0;

    /* renamed from: OooOoOO */
    public short f32484OooOoOO;

    public o00Ooo(o000O0O0 o000o0o02) {
        this.f32480OooOo0O = o000o0o02;
    }

    @Override // o00OOOoO.o0O0ooO
    public final long OooO0oO(long j, o0000 o0000Var) throws IOException {
        int i;
        int i2;
        do {
            int i3 = this.f32482OooOoO;
            o000O0O0 o000o0o02 = this.f32480OooOo0O;
            if (i3 == 0) {
                o000o0o02.skip(this.f32484OooOoOO);
                this.f32484OooOoOO = (short) 0;
                if ((this.f32479OooOo & 4) == 0) {
                    i = this.f32483OooOoO0;
                    int iOooO0oo = oo000o.OooO0oo(o000o0o02);
                    this.f32482OooOoO = iOooO0oo;
                    this.f32481OooOo0o = iOooO0oo;
                    byte b = (byte) (o000o0o02.readByte() & ForkServer.ERROR);
                    this.f32479OooOo = (byte) (o000o0o02.readByte() & ForkServer.ERROR);
                    Logger logger = oo000o.f32522OooOoO;
                    if (logger.isLoggable(Level.FINE)) {
                        logger.fine(OooOO0.OooO00o(true, this.f32483OooOoO0, this.f32481OooOo0o, b, this.f32479OooOo));
                    }
                    i2 = o000o0o02.readInt() & Integer.MAX_VALUE;
                    this.f32483OooOoO0 = i2;
                    if (b != 9) {
                        OooOO0.OooO0OO("%s != TYPE_CONTINUATION", Byte.valueOf(b));
                        throw null;
                    }
                }
            } else {
                long jOooO0oO = o000o0o02.OooO0oO(Math.min(j, i3), o0000Var);
                if (jOooO0oO != -1) {
                    this.f32482OooOoO = (int) (this.f32482OooOoO - jOooO0oO);
                    return jOooO0oO;
                }
            }
            return -1L;
        } while (i2 == i);
        OooOO0.OooO0OO("TYPE_CONTINUATION streamId changed", new Object[0]);
        throw null;
    }

    @Override // o00OOOoO.o0O0ooO
    public final o00O000 timeout() {
        return this.f32480OooOo0O.f32577OooOo0O.timeout();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
