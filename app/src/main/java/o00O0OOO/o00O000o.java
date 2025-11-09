package o00O0oOo;

import java.lang.reflect.InvocationTargetException;
import o00O0.OooOOO0;
import o00OO000.OooO00o;

/* loaded from: classes3.dex */
public abstract class o00O000o extends o0000O00 {

    /* renamed from: OooOoO0, reason: collision with root package name */
    public static final /* synthetic */ int f31528OooOoO0 = 0;

    /* renamed from: OooOo, reason: collision with root package name */
    public OooOOO0 f31529OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public long f31530OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public boolean f31531OooOo0o;

    public final void OooOOO(o000O0Oo o000o0oo2) {
        OooOOO0 oooOOO0 = this.f31529OooOo;
        if (oooOOO0 == null) {
            oooOOO0 = new OooOOO0();
            this.f31529OooOo = oooOOO0;
        }
        oooOOO0.addLast(o000o0oo2);
    }

    public final void OooOOO0(boolean z) {
        long j = this.f31530OooOo0O - (z ? 4294967296L : 1L);
        this.f31530OooOo0O = j;
        if (j <= 0 && this.f31531OooOo0o) {
            shutdown();
        }
    }

    public abstract Thread OooOOOO();

    public final void OooOOOo(boolean z) {
        this.f31530OooOo0O = (z ? 4294967296L : 1L) + this.f31530OooOo0O;
        if (z) {
            return;
        }
        this.f31531OooOo0o = true;
    }

    public abstract long OooOOo();

    public final boolean OooOOoo() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        OooOOO0 oooOOO0 = this.f31529OooOo;
        if (oooOOO0 == null) {
            return false;
        }
        o000O0Oo o000o0oo2 = (o000O0Oo) (oooOOO0.isEmpty() ? null : oooOOO0.removeFirst());
        if (o000o0oo2 == null) {
            return false;
        }
        o000o0oo2.run();
        return true;
    }

    public void OooOo00(long j, o0O0ooO o0o0ooo) {
        o000.f31479OooOoo.OooOoO0(j, o0o0ooo);
    }

    @Override // o00O0oOo.o0000O00
    public final o0000O00 limitedParallelism(int i, String str) {
        OooO00o.OooO00o(i);
        return str != null ? new o00OO000.o000oOoO(this, str) : this;
    }

    public abstract void shutdown();
}
