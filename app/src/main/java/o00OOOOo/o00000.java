package o00OOOoO;

import com.google.android.gms.internal.measurement.o0OOO0;
import java.io.IOException;
import java.io.OutputStream;
import kotlin.jvm.internal.OooOo;

/* loaded from: classes3.dex */
public final class o00000 implements o00 {

    /* renamed from: OooOo, reason: collision with root package name */
    public final Object f32536OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f32537OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final Object f32538OooOo0o;

    public /* synthetic */ o00000(int i, Object obj, Object obj2) {
        this.f32537OooOo0O = i;
        this.f32538OooOo0o = obj;
        this.f32536OooOo = obj2;
    }

    @Override // o00OOOoO.o00
    public final void OooOO0(long j, o0000 o0000Var) throws IOException {
        switch (this.f32537OooOo0O) {
            case 0:
                o0OOO0.OooO0o0(o0000Var.f32535OooOo0o, 0L, j);
                long j2 = j;
                while (true) {
                    long j3 = 0;
                    if (j2 <= 0) {
                        return;
                    }
                    o000O o000o = o0000Var.f32534OooOo0O;
                    OooOo.OooO0O0(o000o);
                    while (true) {
                        if (j3 < 65536) {
                            j3 += o000o.f32565OooO0OO - o000o.f32564OooO0O0;
                            if (j3 >= j2) {
                                j3 = j2;
                            } else {
                                o000o = o000o.f32567OooO0o;
                                OooOo.OooO0O0(o000o);
                            }
                        }
                    }
                    o00000 o00000Var = (o00000) this.f32536OooOo;
                    o00O0000 o00o0000 = (o00O0000) this.f32538OooOo0o;
                    o00o0000.OooO0oo();
                    try {
                        try {
                            o00000Var.OooOO0(j3, o0000Var);
                            if (o00o0000.OooO()) {
                                throw o00o0000.OooOO0O(null);
                            }
                            j2 -= j3;
                        } catch (IOException e) {
                            if (!o00o0000.OooO()) {
                                throw e;
                            }
                            throw o00o0000.OooOO0O(e);
                        }
                    } catch (Throwable th) {
                        o00o0000.OooO();
                        throw th;
                    }
                }
            default:
                o0OOO0.OooO0o0(o0000Var.f32535OooOo0o, 0L, j);
                while (j > 0) {
                    ((o00O000) this.f32536OooOo).OooO0o();
                    o000O o000o2 = o0000Var.f32534OooOo0O;
                    OooOo.OooO0O0(o000o2);
                    int iMin = (int) Math.min(j, o000o2.f32565OooO0OO - o000o2.f32564OooO0O0);
                    ((OutputStream) this.f32538OooOo0o).write(o000o2.f32563OooO00o, o000o2.f32564OooO0O0, iMin);
                    int i = o000o2.f32564OooO0O0 + iMin;
                    o000o2.f32564OooO0O0 = i;
                    long j4 = iMin;
                    j -= j4;
                    o0000Var.f32535OooOo0o -= j4;
                    if (i == o000o2.f32565OooO0OO) {
                        o0000Var.f32534OooOo0O = o000o2.OooO00o();
                        o000OO00.OooO00o(o000o2);
                    }
                }
                return;
        }
    }

    @Override // o00OOOoO.o00, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        switch (this.f32537OooOo0O) {
            case 0:
                o00000 o00000Var = (o00000) this.f32536OooOo;
                o00O0000 o00o0000 = (o00O0000) this.f32538OooOo0o;
                o00o0000.OooO0oo();
                try {
                    o00000Var.close();
                    if (o00o0000.OooO()) {
                        throw o00o0000.OooOO0O(null);
                    }
                    return;
                } catch (IOException e) {
                    if (!o00o0000.OooO()) {
                        throw e;
                    }
                    throw o00o0000.OooOO0O(e);
                } finally {
                    o00o0000.OooO();
                }
            default:
                ((OutputStream) this.f32538OooOo0o).close();
                return;
        }
    }

    @Override // o00OOOoO.o00, java.io.Flushable
    public final void flush() throws IOException {
        switch (this.f32537OooOo0O) {
            case 0:
                o00000 o00000Var = (o00000) this.f32536OooOo;
                o00O0000 o00o0000 = (o00O0000) this.f32538OooOo0o;
                o00o0000.OooO0oo();
                try {
                    o00000Var.flush();
                    if (o00o0000.OooO()) {
                        throw o00o0000.OooOO0O(null);
                    }
                    return;
                } catch (IOException e) {
                    if (!o00o0000.OooO()) {
                        throw e;
                    }
                    throw o00o0000.OooOO0O(e);
                } finally {
                    o00o0000.OooO();
                }
            default:
                ((OutputStream) this.f32538OooOo0o).flush();
                return;
        }
    }

    @Override // o00OOOoO.o00
    public final o00O000 timeout() {
        switch (this.f32537OooOo0O) {
            case 0:
                return (o00O0000) this.f32538OooOo0o;
            default:
                return (o00O000) this.f32536OooOo;
        }
    }

    public final String toString() {
        switch (this.f32537OooOo0O) {
            case 0:
                return "AsyncTimeout.sink(" + ((o00000) this.f32536OooOo) + ')';
            default:
                return "sink(" + ((OutputStream) this.f32538OooOo0o) + ')';
        }
    }
}
