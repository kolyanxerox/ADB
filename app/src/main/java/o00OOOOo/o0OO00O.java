package o00OOOOo;

import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import o00OOOoO.o0000;
import o00OOOoO.o000OO0O;
import org.apache.tika.fork.ForkServer;

/* loaded from: classes3.dex */
public final class o0OO00O implements Closeable, AutoCloseable {

    /* renamed from: OooOoo0, reason: collision with root package name */
    public static final Logger f32493OooOoo0 = Logger.getLogger(OooOO0.class.getName());

    /* renamed from: OooOo, reason: collision with root package name */
    public final o0000 f32494OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final o000OO0O f32495OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final boolean f32496OooOo0o;

    /* renamed from: OooOoO, reason: collision with root package name */
    public boolean f32497OooOoO;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public int f32498OooOoO0;

    /* renamed from: OooOoOO, reason: collision with root package name */
    public final OooO0o f32499OooOoOO;

    public o0OO00O(o000OO0O o000oo0o, boolean z) {
        this.f32495OooOo0O = o000oo0o;
        this.f32496OooOo0o = z;
        o0000 o0000Var = new o0000();
        this.f32494OooOo = o0000Var;
        this.f32499OooOoOO = new OooO0o(o0000Var);
        this.f32498OooOoO0 = 16384;
    }

    public final synchronized void OooO(int i, long j) {
        if (this.f32497OooOoO) {
            throw new IOException("closed");
        }
        if (j == 0 || j > 2147483647L) {
            OooOO0.OooO0O0("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", Long.valueOf(j));
            throw null;
        }
        OooO0OO(i, 4, (byte) 8, (byte) 0);
        this.f32495OooOo0O.OooO0Oo((int) j);
        this.f32495OooOo0O.flush();
    }

    public final synchronized void OooO00o(OooO0oO.Oooo0 oooo0) {
        try {
            if (this.f32497OooOoO) {
                throw new IOException("closed");
            }
            int i = this.f32498OooOoO0;
            int i2 = oooo0.f13285OooOo0o;
            if ((i2 & 32) != 0) {
                i = ((int[]) oooo0.f13283OooOo)[5];
            }
            this.f32498OooOoO0 = i;
            if (((i2 & 2) != 0 ? ((int[]) oooo0.f13283OooOo)[1] : -1) != -1) {
                OooO0o oooO0o = this.f32499OooOoOO;
                int iMin = Math.min((i2 & 2) != 0 ? ((int[]) oooo0.f13283OooOo)[1] : -1, 16384);
                int i3 = oooO0o.f32416OooO0Oo;
                if (i3 != iMin) {
                    if (iMin < i3) {
                        oooO0o.f32414OooO0O0 = Math.min(oooO0o.f32414OooO0O0, iMin);
                    }
                    oooO0o.f32415OooO0OO = true;
                    oooO0o.f32416OooO0Oo = iMin;
                    int i4 = oooO0o.f32420OooO0oo;
                    if (iMin < i4) {
                        if (iMin == 0) {
                            Arrays.fill(oooO0o.f32418OooO0o0, (Object) null);
                            oooO0o.f32417OooO0o = oooO0o.f32418OooO0o0.length - 1;
                            oooO0o.f32419OooO0oO = 0;
                            oooO0o.f32420OooO0oo = 0;
                        } else {
                            oooO0o.OooO00o(i4 - iMin);
                        }
                    }
                }
            }
            OooO0OO(0, 0, (byte) 4, (byte) 1);
            this.f32495OooOo0O.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void OooO0O0(boolean z, int i, o0000 o0000Var, int i2) {
        if (this.f32497OooOoO) {
            throw new IOException("closed");
        }
        OooO0OO(i, i2, (byte) 0, z ? (byte) 1 : (byte) 0);
        if (i2 > 0) {
            this.f32495OooOo0O.OooOO0(i2, o0000Var);
        }
    }

    public final void OooO0OO(int i, int i2, byte b, byte b2) {
        Level level = Level.FINE;
        Logger logger = f32493OooOoo0;
        if (logger.isLoggable(level)) {
            logger.fine(OooOO0.OooO00o(false, i, i2, b, b2));
        }
        int i3 = this.f32498OooOoO0;
        if (i2 > i3) {
            OooOO0.OooO0O0("FRAME_SIZE_ERROR length > %d: %d", Integer.valueOf(i3), Integer.valueOf(i2));
            throw null;
        }
        if ((Integer.MIN_VALUE & i) != 0) {
            OooOO0.OooO0O0("reserved bit set: %s", Integer.valueOf(i));
            throw null;
        }
        o000OO0O o000oo0o = this.f32495OooOo0O;
        o000oo0o.OooO0OO((i2 >>> 16) & 255);
        o000oo0o.OooO0OO((i2 >>> 8) & 255);
        o000oo0o.OooO0OO(i2 & 255);
        o000oo0o.OooO0OO(b & ForkServer.ERROR);
        o000oo0o.OooO0OO(b2 & ForkServer.ERROR);
        o000oo0o.OooO0Oo(i & Integer.MAX_VALUE);
    }

    public final synchronized void OooO0Oo(byte[] bArr, int i, int i2) {
        try {
            if (this.f32497OooOoO) {
                throw new IOException("closed");
            }
            if (o000Oo.o0OO00O.OooO00o(i2) == -1) {
                OooOO0.OooO0O0("errorCode.httpCode == -1", new Object[0]);
                throw null;
            }
            OooO0OO(0, bArr.length + 8, (byte) 7, (byte) 0);
            this.f32495OooOo0O.OooO0Oo(i);
            this.f32495OooOo0O.OooO0Oo(o000Oo.o0OO00O.OooO00o(i2));
            if (bArr.length > 0) {
                this.f32495OooOo0O.OooO0O0(bArr);
            }
            this.f32495OooOo0O.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void OooO0o(boolean z, int i, int i2) {
        if (this.f32497OooOoO) {
            throw new IOException("closed");
        }
        OooO0OO(0, 8, (byte) 6, z ? (byte) 1 : (byte) 0);
        this.f32495OooOo0O.OooO0Oo(i);
        this.f32495OooOo0O.OooO0Oo(i2);
        this.f32495OooOo0O.flush();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void OooO0o0(java.util.ArrayList r18, int r19, boolean r20) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 338
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o00OOOOo.o0OO00O.OooO0o0(java.util.ArrayList, int, boolean):void");
    }

    public final synchronized void OooO0oo(int i, int i2) {
        if (this.f32497OooOoO) {
            throw new IOException("closed");
        }
        if (o000Oo.o0OO00O.OooO00o(i2) == -1) {
            throw new IllegalArgumentException();
        }
        OooO0OO(i, 4, (byte) 3, (byte) 0);
        this.f32495OooOo0O.OooO0Oo(o000Oo.o0OO00O.OooO00o(i2));
        this.f32495OooOo0O.flush();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f32497OooOoO = true;
        this.f32495OooOo0O.close();
    }

    public final synchronized void flush() {
        if (this.f32497OooOoO) {
            throw new IOException("closed");
        }
        this.f32495OooOo0O.flush();
    }
}
