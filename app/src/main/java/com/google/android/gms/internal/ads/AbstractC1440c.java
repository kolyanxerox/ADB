package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.android.gms.internal.ads.c */
/* loaded from: classes2.dex */
public abstract class AbstractC1440c {

    /* renamed from: OooO0O0 */
    public static final Logger f17627OooO0O0 = Logger.getLogger(AbstractC1440c.class.getName());

    /* renamed from: OooO00o */
    public final Oooo0oO.o00000O f17628OooO00o = new Oooo0oO.o00000O(1);

    /* JADX WARN: Multi-variable type inference failed */
    public final InterfaceC1513e OooO00o(C1428bn c1428bn, i31 i31Var) throws EOFException {
        int iOooO00o;
        ByteBuffer byteBuffer;
        long jLimit;
        InterfaceC1513e c1661i;
        InterfaceC1513e interfaceC1513e;
        long jOooO0O0 = c1428bn.OooO0O0();
        Oooo0oO.o00000O o00000o = this.f17628OooO00o;
        ((ByteBuffer) o00000o.get()).rewind().limit(8);
        do {
            iOooO00o = c1428bn.OooO00o((ByteBuffer) o00000o.get());
            byteBuffer = c1428bn.f17524OooOo0O;
            if (iOooO00o == 8) {
                ((ByteBuffer) o00000o.get()).rewind();
                long jOooo0oo = ze0.Oooo0oo((ByteBuffer) o00000o.get());
                if (jOooo0oo < 8 && jOooo0oo > 1) {
                    Level level = Level.SEVERE;
                    StringBuilder sb = new StringBuilder(80);
                    sb.append("Plausibility check failed: size < 8 (size = ");
                    sb.append(jOooo0oo);
                    sb.append("). Stop parsing!");
                    f17627OooO0O0.logp(level, "com.coremedia.iso.AbstractBoxParser", "parseBox", sb.toString());
                    return null;
                }
                byte[] bArr = new byte[4];
                ((ByteBuffer) o00000o.get()).get(bArr);
                try {
                    String str = new String(bArr, "ISO-8859-1");
                    if (jOooo0oo == 1) {
                        ((ByteBuffer) o00000o.get()).limit(16);
                        c1428bn.OooO00o((ByteBuffer) o00000o.get());
                        ((ByteBuffer) o00000o.get()).position(8);
                        jLimit = ze0.OoooO0((ByteBuffer) o00000o.get()) - 16;
                    } else {
                        jLimit = jOooo0oo == 0 ? byteBuffer.limit() - c1428bn.OooO0O0() : jOooo0oo - 8;
                    }
                    if ("uuid".equals(str)) {
                        ((ByteBuffer) o00000o.get()).limit(((ByteBuffer) o00000o.get()).limit() + 16);
                        c1428bn.OooO00o((ByteBuffer) o00000o.get());
                        byte[] bArr2 = new byte[16];
                        for (int iPosition = ((ByteBuffer) o00000o.get()).position() - 16; iPosition < ((ByteBuffer) o00000o.get()).position(); iPosition++) {
                            bArr2[iPosition - (((ByteBuffer) o00000o.get()).position() - 16)] = ((ByteBuffer) o00000o.get()).get(iPosition);
                        }
                        jLimit -= 16;
                    }
                    long j = jLimit;
                    if (i31Var instanceof InterfaceC1513e) {
                    }
                    if ("moov".equals(str)) {
                        c1661i = new C1587g();
                    } else {
                        if ("mvhd".equals(str)) {
                            C1624h c1624h = new C1624h("mvhd");
                            c1624h.f19489Oooo0 = 1.0d;
                            c1624h.f19493Oooo0O0 = 1.0f;
                            c1624h.f19494Oooo0OO = m31.f21046OooOO0;
                            interfaceC1513e = c1624h;
                            ((ByteBuffer) o00000o.get()).rewind();
                            interfaceC1513e.OooO00o(c1428bn, (ByteBuffer) o00000o.get(), j, this);
                            return interfaceC1513e;
                        }
                        c1661i = new C1661i(str, 0);
                    }
                    interfaceC1513e = c1661i;
                    ((ByteBuffer) o00000o.get()).rewind();
                    interfaceC1513e.OooO00o(c1428bn, (ByteBuffer) o00000o.get(), j, this);
                    return interfaceC1513e;
                } catch (UnsupportedEncodingException e) {
                    throw new RuntimeException(e);
                }
            }
        } while (iOooO00o >= 0);
        byteBuffer.position((int) jOooO0O0);
        throw new EOFException();
    }
}
