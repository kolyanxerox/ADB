package o00OOOoO;

import androidx.core.location.LocationRequestCompat;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import kotlin.jvm.internal.OooOo;

/* loaded from: classes3.dex */
public final class o000O000 implements o0O0ooO {

    /* renamed from: OooOo, reason: collision with root package name */
    public final Inflater f32571OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public byte f32572OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final o000O0O0 f32573OooOo0o;

    /* renamed from: OooOoO, reason: collision with root package name */
    public final CRC32 f32574OooOoO;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final o000O0o f32575OooOoO0;

    public o000O000(o0O0ooO source) {
        OooOo.OooO0o0(source, "source");
        o000O0O0 o000o0o02 = new o000O0O0(source);
        this.f32573OooOo0o = o000o0o02;
        Inflater inflater = new Inflater(true);
        this.f32571OooOo = inflater;
        this.f32575OooOoO0 = new o000O0o(o000o0o02, inflater);
        this.f32574OooOoO = new CRC32();
    }

    public static void OooO00o(String str, int i, int i2) throws IOException {
        if (i2 != i) {
            throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", Arrays.copyOf(new Object[]{str, Integer.valueOf(i2), Integer.valueOf(i)}, 3)));
        }
    }

    public final void OooO0O0(o0000 o0000Var, long j, long j2) {
        o000O o000o = o0000Var.f32534OooOo0O;
        OooOo.OooO0O0(o000o);
        while (true) {
            int i = o000o.f32565OooO0OO;
            int i2 = o000o.f32564OooO0O0;
            if (j < i - i2) {
                break;
            }
            j -= i - i2;
            o000o = o000o.f32567OooO0o;
            OooOo.OooO0O0(o000o);
        }
        while (j2 > 0) {
            int iMin = (int) Math.min(o000o.f32565OooO0OO - r6, j2);
            this.f32574OooOoO.update(o000o.f32563OooO00o, (int) (o000o.f32564OooO0O0 + j), iMin);
            j2 -= iMin;
            o000o = o000o.f32567OooO0o;
            OooOo.OooO0O0(o000o);
            j = 0;
        }
    }

    @Override // o00OOOoO.o0O0ooO
    public final long OooO0oO(long j, o0000 sink) throws DataFormatException, IOException {
        o000O000 o000o0002 = this;
        OooOo.OooO0o0(sink, "sink");
        if (j < 0) {
            throw new IllegalArgumentException(OooO0oO.OooOo.OooO0oo(j, "byteCount < 0: ").toString());
        }
        if (j == 0) {
            return 0L;
        }
        byte b = o000o0002.f32572OooOo0O;
        CRC32 crc32 = o000o0002.f32574OooOoO;
        o000O0O0 o000o0o02 = o000o0002.f32573OooOo0o;
        if (b == 0) {
            o000o0o02.require(10L);
            o0000 o0000Var = o000o0o02.f32578OooOo0o;
            byte bOooO00o = o0000Var.OooO00o(3L);
            boolean z = ((bOooO00o >> 1) & 1) == 1;
            if (z) {
                o000o0002.OooO0O0(o0000Var, 0L, 10L);
            }
            OooO00o("ID1ID2", 8075, o000o0o02.readShort());
            o000o0o02.skip(8L);
            if (((bOooO00o >> 2) & 1) == 1) {
                o000o0o02.require(2L);
                if (z) {
                    OooO0O0(o0000Var, 0L, 2L);
                }
                long shortLe = o0000Var.readShortLe() & 65535;
                o000o0o02.require(shortLe);
                if (z) {
                    OooO0O0(o0000Var, 0L, shortLe);
                }
                o000o0o02.skip(shortLe);
            }
            if (((bOooO00o >> 3) & 1) == 1) {
                long jIndexOf = o000o0o02.indexOf((byte) 0, 0L, LocationRequestCompat.PASSIVE_INTERVAL);
                if (jIndexOf == -1) {
                    throw new EOFException();
                }
                if (z) {
                    OooO0O0(o0000Var, 0L, jIndexOf + 1);
                }
                o000o0o02.skip(jIndexOf + 1);
            }
            if (((bOooO00o >> 4) & 1) == 1) {
                long jIndexOf2 = o000o0o02.indexOf((byte) 0, 0L, LocationRequestCompat.PASSIVE_INTERVAL);
                if (jIndexOf2 == -1) {
                    throw new EOFException();
                }
                if (z) {
                    o000o0002 = this;
                    o000o0002.OooO0O0(o0000Var, 0L, jIndexOf2 + 1);
                } else {
                    o000o0002 = this;
                }
                o000o0o02.skip(jIndexOf2 + 1);
            } else {
                o000o0002 = this;
            }
            if (z) {
                OooO00o("FHCRC", o000o0o02.readShortLe(), (short) crc32.getValue());
                crc32.reset();
            }
            o000o0002.f32572OooOo0O = (byte) 1;
        }
        if (o000o0002.f32572OooOo0O == 1) {
            long j2 = sink.f32535OooOo0o;
            long jOooO0oO = o000o0002.f32575OooOoO0.OooO0oO(j, sink);
            if (jOooO0oO != -1) {
                o000o0002.OooO0O0(sink, j2, jOooO0oO);
                return jOooO0oO;
            }
            o000o0002.f32572OooOo0O = (byte) 2;
        }
        if (o000o0002.f32572OooOo0O == 2) {
            OooO00o("CRC", o000o0o02.readIntLe(), (int) crc32.getValue());
            OooO00o("ISIZE", o000o0o02.readIntLe(), (int) o000o0002.f32571OooOo.getBytesWritten());
            o000o0002.f32572OooOo0O = (byte) 3;
            if (!o000o0o02.exhausted()) {
                throw new IOException("gzip finished without exhausting source");
            }
        }
        return -1L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f32575OooOoO0.close();
    }

    @Override // o00OOOoO.o0O0ooO
    public final o00O000 timeout() {
        return this.f32573OooOo0o.f32577OooOo0O.timeout();
    }
}
