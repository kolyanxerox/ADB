package o00OO00o;

import o00O0oOo.o0000O00;
import o00OO000.o000oOoO;

/* loaded from: classes3.dex */
public final class OooO extends OooOOO0 {

    /* renamed from: OooOo0o, reason: collision with root package name */
    public static final OooO f31972OooOo0o;

    static {
        int i = OooOo00.f32009OooO0OO;
        int i2 = OooOo00.f32010OooO0Oo;
        long j = OooOo00.f32012OooO0o0;
        String str = OooOo00.f32007OooO00o;
        OooO oooO = new OooO();
        oooO.f32004OooOo0O = new OooO0OO(i, i2, str, j);
        f31972OooOo0o = oooO;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // o00O0oOo.o0000O00
    public final o0000O00 limitedParallelism(int i, String str) {
        o00OO000.OooO00o.OooO00o(i);
        return i >= OooOo00.f32009OooO0OO ? str != null ? new o000oOoO(this, str) : this : super.limitedParallelism(i, str);
    }

    @Override // o00O0oOo.o0000O00
    public final String toString() {
        return "Dispatchers.Default";
    }
}
