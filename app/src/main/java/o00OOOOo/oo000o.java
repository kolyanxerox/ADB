package o00OOOOo;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import o00OOOoO.o0000O0;
import o00OOOoO.o000O0O0;
import org.apache.tika.fork.ForkServer;

/* loaded from: classes3.dex */
public final class oo000o implements Closeable, AutoCloseable {

    /* renamed from: OooOoO, reason: collision with root package name */
    public static final Logger f32522OooOoO = Logger.getLogger(OooOO0.class.getName());

    /* renamed from: OooOo, reason: collision with root package name */
    public final boolean f32523OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final o000O0O0 f32524OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final o00Ooo f32525OooOo0o;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final OooO0OO f32526OooOoO0;

    public oo000o(o000O0O0 o000o0o02, boolean z) {
        this.f32524OooOo0O = o000o0o02;
        this.f32523OooOo = z;
        o00Ooo o00ooo2 = new o00Ooo(o000o0o02);
        this.f32525OooOo0o = o00ooo2;
        this.f32526OooOoO0 = new OooO0OO(o00ooo2);
    }

    public static int OooO00o(int i, byte b, short s) throws IOException {
        if ((b & 8) != 0) {
            i--;
        }
        if (s <= i) {
            return (short) (i - s);
        }
        OooOO0.OooO0OO("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s), Integer.valueOf(i));
        throw null;
    }

    public static int OooO0oo(o000O0O0 o000o0o02) {
        return (o000o0o02.readByte() & ForkServer.ERROR) | ((o000o0o02.readByte() & ForkServer.ERROR) << 16) | ((o000o0o02.readByte() & ForkServer.ERROR) << 8);
    }

    public final void OooO(o00O0O o00o0o, int i, byte b, int i2) throws IOException {
        if (i2 == 0) {
            OooOO0.OooO0OO("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
            throw null;
        }
        short s = (b & 8) != 0 ? (short) (this.f32524OooOo0O.readByte() & ForkServer.ERROR) : (short) 0;
        int i3 = this.f32524OooOo0O.readInt() & Integer.MAX_VALUE;
        ArrayList arrayListOooO0o0 = OooO0o0(OooO00o(i - 4, b, s), s, b, i2);
        o00Oo0 o00oo0 = (o00Oo0) o00o0o.f32453OooOo;
        synchronized (o00oo0) {
            try {
                if (o00oo0.f32478OoooO00.contains(Integer.valueOf(i3))) {
                    o00oo0.OooOOO0(i3, 2);
                    return;
                }
                o00oo0.f32478OoooO00.add(Integer.valueOf(i3));
                try {
                    o00oo0.OooO0o0(new OooOo(o00oo0, new Object[]{o00oo0.f32461OooOoO0, Integer.valueOf(i3)}, i3, arrayListOooO0o0));
                } catch (RejectedExecutionException unused) {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean OooO0O0(boolean z, o00O0O o00o0o) throws IOException {
        int i;
        int i2;
        o0Oo0oo[] o0oo0ooArr;
        try {
            this.f32524OooOo0O.require(9L);
            int iOooO0oo = OooO0oo(this.f32524OooOo0O);
            if (iOooO0oo < 0 || iOooO0oo > 16384) {
                OooOO0.OooO0OO("FRAME_SIZE_ERROR: %s", Integer.valueOf(iOooO0oo));
                throw null;
            }
            byte b = (byte) (this.f32524OooOo0O.readByte() & ForkServer.ERROR);
            if (z && b != 4) {
                OooOO0.OooO0OO("Expected a SETTINGS frame but was %s", Byte.valueOf(b));
                throw null;
            }
            byte b2 = (byte) (this.f32524OooOo0O.readByte() & ForkServer.ERROR);
            int i3 = this.f32524OooOo0O.readInt();
            int i4 = Integer.MAX_VALUE & i3;
            Logger logger = f32522OooOoO;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(OooOO0.OooO00o(true, i4, iOooO0oo, b, b2));
            }
            switch (b) {
                case 0:
                    OooO0Oo(o00o0o, iOooO0oo, b2, i4);
                    return true;
                case 1:
                    OooO0o(o00o0o, iOooO0oo, b2, i4);
                    return true;
                case 2:
                    if (iOooO0oo != 5) {
                        OooOO0.OooO0OO("TYPE_PRIORITY length: %d != 5", Integer.valueOf(iOooO0oo));
                        throw null;
                    }
                    if (i4 == 0) {
                        OooOO0.OooO0OO("TYPE_PRIORITY streamId == 0", new Object[0]);
                        throw null;
                    }
                    o000O0O0 o000o0o02 = this.f32524OooOo0O;
                    o000o0o02.readInt();
                    o000o0o02.readByte();
                    o00o0o.getClass();
                    return true;
                case 3:
                    if (iOooO0oo != 4) {
                        OooOO0.OooO0OO("TYPE_RST_STREAM length: %d != 4", Integer.valueOf(iOooO0oo));
                        throw null;
                    }
                    if (i4 == 0) {
                        OooOO0.OooO0OO("TYPE_RST_STREAM streamId == 0", new Object[0]);
                        throw null;
                    }
                    int i5 = this.f32524OooOo0O.readInt();
                    int[] iArrOooO0OO = OooOOo.OooOOO.OooO0OO(11);
                    int length = iArrOooO0OO.length;
                    int i6 = 0;
                    while (true) {
                        if (i6 < length) {
                            i = iArrOooO0OO[i6];
                            if (o000Oo.o0OO00O.OooO00o(i) != i5) {
                                i6++;
                            }
                        } else {
                            i = 0;
                        }
                    }
                    if (i == 0) {
                        OooOO0.OooO0OO("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(i5));
                        throw null;
                    }
                    o00Oo0 o00oo0 = (o00Oo0) o00o0o.f32453OooOo;
                    o00oo0.getClass();
                    if (i4 != 0 && (i3 & 1) == 0) {
                        i = 1;
                    }
                    if (i != 0) {
                        o00oo0.OooO0o0(new OooOo(o00oo0, new Object[]{o00oo0.f32461OooOoO0, Integer.valueOf(i4)}, i4, i));
                        return true;
                    }
                    o0Oo0oo o0oo0ooOooO0o = o00oo0.OooO0o(i4);
                    if (o0oo0ooOooO0o != null) {
                        synchronized (o0oo0ooOooO0o) {
                            if (o0oo0ooOooO0o.f32511OooOO0O == 0) {
                                o0oo0ooOooO0o.f32511OooOO0O = i;
                                o0oo0ooOooO0o.notifyAll();
                            }
                        }
                        return true;
                    }
                    return true;
                case 4:
                    if (i4 != 0) {
                        OooOO0.OooO0OO("TYPE_SETTINGS streamId != 0", new Object[0]);
                        throw null;
                    }
                    if ((b2 & 1) != 0) {
                        if (iOooO0oo == 0) {
                            o00o0o.getClass();
                            return true;
                        }
                        OooOO0.OooO0OO("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
                        throw null;
                    }
                    if (iOooO0oo % 6 != 0) {
                        OooOO0.OooO0OO("TYPE_SETTINGS length %% 6 != 0: %s", Integer.valueOf(iOooO0oo));
                        throw null;
                    }
                    OooO0oO.Oooo0 oooo0 = new OooO0oO.Oooo0(13, (byte) 0);
                    for (int i7 = 0; i7 < iOooO0oo; i7 += 6) {
                        o000O0O0 o000o0o03 = this.f32524OooOo0O;
                        int i8 = o000o0o03.readShort() & 65535;
                        int i9 = o000o0o03.readInt();
                        if (i8 == 2) {
                            if (i9 != 0 && i9 != 1) {
                                OooOO0.OooO0OO("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
                                throw null;
                            }
                        } else if (i8 == 3) {
                            i8 = 4;
                        } else if (i8 != 4) {
                            if (i8 == 5 && (i9 < 16384 || i9 > 16777215)) {
                                OooOO0.OooO0OO("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", Integer.valueOf(i9));
                                throw null;
                            }
                        } else {
                            if (i9 < 0) {
                                OooOO0.OooO0OO("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
                                throw null;
                            }
                            i8 = 7;
                        }
                        oooo0.OooO0oO(i8, i9);
                    }
                    o00o0o.getClass();
                    o00Oo0 o00oo02 = (o00Oo0) o00o0o.f32453OooOo;
                    o00oo02.f32463OooOoo.execute(new o00O0O(o00o0o, new Object[]{o00oo02.f32461OooOoO0}, oooo0));
                    return true;
                case 5:
                    OooO(o00o0o, iOooO0oo, b2, i4);
                    return true;
                case 6:
                    if (iOooO0oo != 8) {
                        OooOO0.OooO0OO("TYPE_PING length != 8: %s", Integer.valueOf(iOooO0oo));
                        throw null;
                    }
                    if (i4 != 0) {
                        OooOO0.OooO0OO("TYPE_PING streamId != 0", new Object[0]);
                        throw null;
                    }
                    int i10 = this.f32524OooOo0O.readInt();
                    int i11 = this.f32524OooOo0O.readInt();
                    i = (b2 & 1) != 0 ? 1 : 0;
                    o00o0o.getClass();
                    if (i == 0) {
                        o00Oo0 o00oo03 = (o00Oo0) o00o0o.f32453OooOo;
                        o00oo03.f32463OooOoo.execute(new o0OoOo0(o00oo03, i10, i11));
                        return true;
                    }
                    synchronized (((o00Oo0) o00o0o.f32453OooOo)) {
                        try {
                            if (i10 == 1) {
                                ((o00Oo0) o00o0o.f32453OooOo).f32469Oooo000++;
                            } else if (i10 == 2) {
                                ((o00Oo0) o00o0o.f32453OooOo).f32471Oooo00o++;
                            } else if (i10 == 3) {
                                o00Oo0 o00oo04 = (o00Oo0) o00o0o.f32453OooOo;
                                o00oo04.getClass();
                                o00oo04.notifyAll();
                            }
                        } finally {
                        }
                    }
                    return true;
                case 7:
                    if (iOooO0oo < 8) {
                        OooOO0.OooO0OO("TYPE_GOAWAY length < 8: %s", Integer.valueOf(iOooO0oo));
                        throw null;
                    }
                    if (i4 != 0) {
                        OooOO0.OooO0OO("TYPE_GOAWAY streamId != 0", new Object[0]);
                        throw null;
                    }
                    int i12 = this.f32524OooOo0O.readInt();
                    int i13 = this.f32524OooOo0O.readInt();
                    int i14 = iOooO0oo - 8;
                    int[] iArrOooO0OO2 = OooOOo.OooOOO.OooO0OO(11);
                    int length2 = iArrOooO0OO2.length;
                    int i15 = 0;
                    while (true) {
                        if (i15 < length2) {
                            i2 = iArrOooO0OO2[i15];
                            if (o000Oo.o0OO00O.OooO00o(i2) != i13) {
                                i15++;
                            }
                        } else {
                            i2 = 0;
                        }
                    }
                    if (i2 == 0) {
                        OooOO0.OooO0OO("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(i13));
                        throw null;
                    }
                    o0000O0 o0000o0OooO00o = o0000O0.f32553OooOoO0;
                    if (i14 > 0) {
                        o0000o0OooO00o = this.f32524OooOo0O.OooO00o(i14);
                    }
                    o00o0o.getClass();
                    o0000o0OooO00o.OooO0o0();
                    synchronized (((o00Oo0) o00o0o.f32453OooOo)) {
                        o0oo0ooArr = (o0Oo0oo[]) ((o00Oo0) o00o0o.f32453OooOo).f32457OooOo.values().toArray(new o0Oo0oo[((o00Oo0) o00o0o.f32453OooOo).f32457OooOo.size()]);
                        ((o00Oo0) o00o0o.f32453OooOo).f32464OooOoo0 = true;
                    }
                    int length3 = o0oo0ooArr.length;
                    while (i < length3) {
                        o0Oo0oo o0oo0oo = o0oo0ooArr[i];
                        if (o0oo0oo.f32504OooO0OO > i12 && o0oo0oo.OooO0o()) {
                            synchronized (o0oo0oo) {
                                if (o0oo0oo.f32511OooOO0O == 0) {
                                    o0oo0oo.f32511OooOO0O = 5;
                                    o0oo0oo.notifyAll();
                                }
                            }
                            ((o00Oo0) o00o0o.f32453OooOo).OooO0o(o0oo0oo.f32504OooO0OO);
                        }
                        i++;
                    }
                    return true;
                case 8:
                    if (iOooO0oo != 4) {
                        OooOO0.OooO0OO("TYPE_WINDOW_UPDATE length !=4: %s", Integer.valueOf(iOooO0oo));
                        throw null;
                    }
                    long j = this.f32524OooOo0O.readInt() & 2147483647L;
                    if (j == 0) {
                        OooOO0.OooO0OO("windowSizeIncrement was 0", Long.valueOf(j));
                        throw null;
                    }
                    if (i4 == 0) {
                        synchronized (((o00Oo0) o00o0o.f32453OooOo)) {
                            o00Oo0 o00oo05 = (o00Oo0) o00o0o.f32453OooOo;
                            o00oo05.f32473Oooo0OO += j;
                            o00oo05.notifyAll();
                        }
                        return true;
                    }
                    o0Oo0oo o0oo0ooOooO0OO = ((o00Oo0) o00o0o.f32453OooOo).OooO0OO(i4);
                    if (o0oo0ooOooO0OO != null) {
                        synchronized (o0oo0ooOooO0OO) {
                            o0oo0ooOooO0OO.f32503OooO0O0 += j;
                            if (j > 0) {
                                o0oo0ooOooO0OO.notifyAll();
                            }
                        }
                        return true;
                    }
                    return true;
                default:
                    this.f32524OooOo0O.skip(iOooO0oo);
                    return true;
            }
        } catch (IOException unused) {
            return false;
        }
    }

    public final void OooO0OO(o00O0O o00o0o) throws IOException {
        if (this.f32523OooOo) {
            if (OooO0O0(true, o00o0o)) {
                return;
            }
            OooOO0.OooO0OO("Required SETTINGS preface not received", new Object[0]);
            throw null;
        }
        o0000O0 o0000o02 = OooOO0.f32421OooO00o;
        o0000O0 o0000o0OooO00o = this.f32524OooOo0O.OooO00o(o0000o02.f32555OooOo0O.length);
        Level level = Level.FINE;
        Logger logger = f32522OooOoO;
        if (logger.isLoggable(level)) {
            String strOooO0o = o0000o0OooO00o.OooO0o();
            byte[] bArr = o00OOO0O.OooO0OO.f32335OooO00o;
            Locale locale = Locale.US;
            logger.fine("<< CONNECTION " + strOooO0o);
        }
        if (o0000o02.equals(o0000o0OooO00o)) {
            return;
        }
        OooOO0.OooO0OO("Expected a connection header but was %s", o0000o0OooO00o.OooOOoo());
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x0135, code lost:
    
        if (r8 == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0137, code lost:
    
        r3.OooO0oo();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void OooO0Oo(o00OOOOo.o00O0O r17, int r18, byte r19, int r20) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 337
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o00OOOOo.oo000o.OooO0Oo(o00OOOOo.o00O0O, int, byte, int):void");
    }

    public final void OooO0o(o00O0O o00o0o, int i, byte b, int i2) throws IOException {
        boolean zOooO0oO;
        if (i2 == 0) {
            OooOO0.OooO0OO("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
            throw null;
        }
        boolean z = (b & 1) != 0;
        short s = (b & 8) != 0 ? (short) (this.f32524OooOo0O.readByte() & ForkServer.ERROR) : (short) 0;
        if ((b & 32) != 0) {
            o000O0O0 o000o0o02 = this.f32524OooOo0O;
            o000o0o02.readInt();
            o000o0o02.readByte();
            o00o0o.getClass();
            i -= 5;
        }
        ArrayList arrayListOooO0o0 = OooO0o0(OooO00o(i, b, s), s, b, i2);
        ((o00Oo0) o00o0o.f32453OooOo).getClass();
        if (i2 != 0 && (i2 & 1) == 0) {
            o00Oo0 o00oo0 = (o00Oo0) o00o0o.f32453OooOo;
            o00oo0.getClass();
            try {
                o00oo0.OooO0o0(new OooOo(o00oo0, new Object[]{o00oo0.f32461OooOoO0, Integer.valueOf(i2)}, i2, arrayListOooO0o0, z));
                return;
            } catch (RejectedExecutionException unused) {
                return;
            }
        }
        synchronized (((o00Oo0) o00o0o.f32453OooOo)) {
            try {
                o0Oo0oo o0oo0ooOooO0OO = ((o00Oo0) o00o0o.f32453OooOo).OooO0OO(i2);
                if (o0oo0ooOooO0OO != null) {
                    synchronized (o0oo0ooOooO0OO) {
                        o0oo0ooOooO0OO.f32506OooO0o = true;
                        o0oo0ooOooO0OO.f32507OooO0o0.add(o00OOO0O.OooO0OO.OooOo00(arrayListOooO0o0));
                        zOooO0oO = o0oo0ooOooO0OO.OooO0oO();
                        o0oo0ooOooO0OO.notifyAll();
                    }
                    if (!zOooO0oO) {
                        o0oo0ooOooO0OO.f32505OooO0Oo.OooO0o(o0oo0ooOooO0OO.f32504OooO0OO);
                    }
                    if (z) {
                        o0oo0ooOooO0OO.OooO0oo();
                        return;
                    }
                    return;
                }
                o00Oo0 o00oo02 = (o00Oo0) o00o0o.f32453OooOo;
                if (o00oo02.f32464OooOoo0) {
                    return;
                }
                if (i2 <= o00oo02.f32460OooOoO) {
                    return;
                }
                if (i2 % 2 == o00oo02.f32462OooOoOO % 2) {
                    return;
                }
                o0Oo0oo o0oo0oo = new o0Oo0oo(i2, (o00Oo0) o00o0o.f32453OooOo, false, z, o00OOO0O.OooO0OO.OooOo00(arrayListOooO0o0));
                o00Oo0 o00oo03 = (o00Oo0) o00o0o.f32453OooOo;
                o00oo03.f32460OooOoO = i2;
                o00oo03.f32457OooOo.put(Integer.valueOf(i2), o0oo0oo);
                o00Oo0.f32456OoooO0.execute(new o00O0O(o00o0o, new Object[]{((o00Oo0) o00o0o.f32453OooOo).f32461OooOoO0, Integer.valueOf(i2)}, o0oo0oo));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005e, code lost:
    
        throw new java.io.IOException(OooO0oO.OooOo.OooO0o(r4, "Header index too large "));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.ArrayList OooO0o0(int r3, short r4, byte r5, int r6) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 294
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o00OOOOo.oo000o.OooO0o0(int, short, byte, int):java.util.ArrayList");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f32524OooOo0O.close();
    }
}
