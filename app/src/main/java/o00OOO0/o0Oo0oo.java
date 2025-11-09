package o00OOO0;

import com.google.android.gms.internal.ads.C2051sk;
import com.google.android.gms.internal.ads.C2229xd;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import oOooo0o.o00OOOOo;

/* loaded from: classes3.dex */
public final class o0Oo0oo implements OooO {

    /* renamed from: OooOo */
    public final o0ooOOo f32285OooOo;

    /* renamed from: OooOo0O */
    public final oo000o f32286OooOo0O;

    /* renamed from: OooOo0o */
    public final o00OOOO0.OooOOO0 f32287OooOo0o;

    /* renamed from: OooOoO */
    public final o0OO00O f32288OooOoO;

    /* renamed from: OooOoO0 */
    public OooO0O0 f32289OooOoO0;

    /* renamed from: OooOoOO */
    public boolean f32290OooOoOO;

    public o0Oo0oo(oo000o oo000oVar, o0OO00O o0oo00o) {
        this.f32286OooOo0O = oo000oVar;
        this.f32288OooOoO = o0oo00o;
        this.f32287OooOo0o = new o00OOOO0.OooOOO0(oo000oVar);
        o0ooOOo o0ooooo = new o0ooOOo(this);
        this.f32285OooOo = o0ooooo;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        o0ooooo.OooO0oO(0);
    }

    public static o0Oo0oo OooO0OO(oo000o oo000oVar, o0OO00O o0oo00o) {
        o0Oo0oo o0oo0oo = new o0Oo0oo(oo000oVar, o0oo00o);
        oo000oVar.f32309OooOoOO.getClass();
        o0oo0oo.f32289OooOoO0 = OooO0O0.f32136OooO0Oo;
        return o0oo0oo;
    }

    public final void OooO00o(OooOO0 oooOO0) {
        synchronized (this) {
            if (this.f32290OooOoOO) {
                throw new IllegalStateException("Already Executed");
            }
            this.f32290OooOoOO = true;
        }
        this.f32287OooOo0o.f32392OooO0OO = o00OOOOo.f33168OooO00o.OooOO0();
        this.f32289OooOoO0.getClass();
        C2051sk c2051sk = this.f32286OooOo0O.f32305OooOo0O;
        o0OOO0o o0ooo0o = new o0OOO0o(this, oooOO0);
        synchronized (c2051sk) {
            ((ArrayDeque) c2051sk.f24096OooOo).add(o0ooo0o);
        }
        c2051sk.OooO0Oo();
    }

    public final o000000 OooO0O0() throws IOException {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f32286OooOo0O.f32308OooOoO0);
        arrayList.add(this.f32287OooOo0o);
        arrayList.add(new o00OOO.OooO00o(this.f32286OooOo0O.f32310OooOoo, 1));
        arrayList.add(new o00OOOO0.OooO0O0(1));
        arrayList.add(new o00OOO.OooO00o(this.f32286OooOo0O, 0));
        arrayList.addAll(this.f32286OooOo0O.f32307OooOoO);
        arrayList.add(new o00OOOO0.OooO0O0(0));
        o0OO00O o0oo00o = this.f32288OooOoO;
        OooO0O0 oooO0O0 = this.f32289OooOoO0;
        oo000o oo000oVar = this.f32286OooOo0O;
        o000000 o000000VarOooO00o = new o00OOOO0.OooOO0(arrayList, null, null, null, 0, o0oo00o, this, oooO0O0, oo000oVar.f32314Oooo, oo000oVar.f32326OoooO00, oo000oVar.f32325OoooO0).OooO00o(o0oo00o, null, null, null);
        if (!this.f32287OooOo0o.f32393OooO0Oo) {
            return o000000VarOooO00o;
        }
        o00OOO0O.OooO0OO.OooO0o0(o000000VarOooO00o);
        throw new IOException("Canceled");
    }

    public final String OooO0Oo() {
        C2229xd c2229xd;
        o0OoOo0 o0oooo0 = this.f32288OooOoO.f32277OooO00o;
        o0oooo0.getClass();
        try {
            c2229xd = new C2229xd();
            c2229xd.OooO0O0(o0oooo0, "/...");
        } catch (IllegalArgumentException unused) {
            c2229xd = null;
        }
        c2229xd.getClass();
        c2229xd.f25607OooO0Oo = o0OoOo0.OooO00o("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
        c2229xd.f25609OooO0o0 = o0OoOo0.OooO00o("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
        return c2229xd.OooO00o().f32292OooO;
    }

    public final IOException OooO0o0(IOException iOException) {
        if (!this.f32285OooOo.OooO()) {
            return iOException;
        }
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public final void cancel() throws IOException {
        o00OOOO0.OooO0OO oooO0OO;
        o00OOO.OooO0O0 oooO0O0;
        o00OOOO0.OooOOO0 oooOOO0 = this.f32287OooOo0o;
        oooOOO0.f32393OooO0Oo = true;
        o00OOO.OooO oooO = oooOOO0.f32391OooO0O0;
        if (oooO != null) {
            synchronized (oooO.f32096OooO0Oo) {
                oooO.f32104OooOOO0 = true;
                oooO0OO = oooO.f32103OooOOO;
                oooO0O0 = oooO.f32101OooOO0;
            }
            if (oooO0OO != null) {
                oooO0OO.cancel();
            } else if (oooO0O0 != null) {
                o00OOO0O.OooO0OO.OooO0o(oooO0O0.f32110OooO0Oo);
            }
        }
    }

    public final Object clone() {
        return OooO0OO(this.f32286OooOo0O, this.f32288OooOoO);
    }
}
