package o00O0oo0;

import android.os.Handler;
import android.os.Looper;
import androidx.datastore.core.OooO00o;
import io.flutter.plugins.webviewflutter.o00000;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.OooOo;
import o00000oO.OooOOO0;
import o00O0oOo.o0000O00;
import o00O0oOo.o000O00;
import o00O0oOo.o000O0O0;
import o00O0oOo.o000OO00;
import o00O0oOo.o00O0;
import o00O0oOo.o00O0O00;
import o00O0oOo.o00OO0OO;
import o00O0oOo.oo0o0Oo;
import o00OO000.Oooo0;
import o00OO000.o000oOoO;
import o00OO00o.OooO;
import o00OO00o.OooO0o;

/* loaded from: classes3.dex */
public final class o0Oo0oo extends o0000O00 implements o000O00 {

    /* renamed from: OooOo */
    public final o0Oo0oo f31652OooOo;

    /* renamed from: OooOo0O */
    public final Handler f31653OooOo0O;

    /* renamed from: OooOo0o */
    public final boolean f31654OooOo0o;

    public o0Oo0oo(Handler handler, boolean z) {
        this.f31653OooOo0O = handler;
        this.f31654OooOo0o = z;
        this.f31652OooOo = z ? this : new o0Oo0oo(handler, true);
    }

    @Override // o00O0oOo.o000O00
    public final void OooO(long j, oo0o0Oo oo0o0oo) {
        OooOOO0 oooOOO0 = new OooOOO0(26, oo0o0oo, this);
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.f31653OooOo0O.postDelayed(oooOOO0, j)) {
            oo0o0oo.OooOo00(new o00000(1, this, oooOOO0));
        } else {
            OooOOO0(oo0o0oo.f31582OooOoO, oooOOO0);
        }
    }

    @Override // o00O0oOo.o000O00
    public final o000OO00 OooO0Oo(long j, Runnable runnable, o00O0O0O.OooOOO0 oooOOO0) {
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.f31653OooOo0O.postDelayed(runnable, j)) {
            return new OooO00o(1, this, runnable);
        }
        OooOOO0(oooOOO0, runnable);
        return o00OO0OO.f31547OooOo0O;
    }

    public final void OooOOO0(o00O0O0O.OooOOO0 oooOOO0, Runnable runnable) {
        CancellationException cancellationException = new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed");
        o00O0O00 o00o0o00 = (o00O0O00) oooOOO0.get(o00O0.f31523OooOo0O);
        if (o00o0o00 != null) {
            o00o0o00.OooO00o(cancellationException);
        }
        OooO oooO = o000O0O0.f31514OooO00o;
        OooO0o.f31999OooOo0O.dispatch(oooOOO0, runnable);
    }

    @Override // o00O0oOo.o0000O00
    public final void dispatch(o00O0O0O.OooOOO0 oooOOO0, Runnable runnable) {
        if (this.f31653OooOo0O.post(runnable)) {
            return;
        }
        OooOOO0(oooOOO0, runnable);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o0Oo0oo)) {
            return false;
        }
        o0Oo0oo o0oo0oo = (o0Oo0oo) obj;
        return o0oo0oo.f31653OooOo0O == this.f31653OooOo0O && o0oo0oo.f31654OooOo0o == this.f31654OooOo0o;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f31653OooOo0O) ^ (this.f31654OooOo0o ? 1231 : 1237);
    }

    @Override // o00O0oOo.o0000O00
    public final boolean isDispatchNeeded(o00O0O0O.OooOOO0 oooOOO0) {
        return (this.f31654OooOo0o && OooOo.OooO00o(Looper.myLooper(), this.f31653OooOo0O.getLooper())) ? false : true;
    }

    @Override // o00O0oOo.o0000O00
    public o0000O00 limitedParallelism(int i, String str) {
        o00OO000.OooO00o.OooO00o(i);
        return str != null ? new o000oOoO(this, str) : this;
    }

    @Override // o00O0oOo.o0000O00
    public final String toString() {
        o0Oo0oo o0oo0oo;
        String str;
        OooO oooO = o000O0O0.f31514OooO00o;
        o0Oo0oo o0oo0oo2 = Oooo0.f31951OooO00o;
        if (this == o0oo0oo2) {
            str = "Dispatchers.Main";
        } else {
            try {
                o0oo0oo = o0oo0oo2.f31652OooOo;
            } catch (UnsupportedOperationException unused) {
                o0oo0oo = null;
            }
            str = this == o0oo0oo ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String string = this.f31653OooOo0O.toString();
        return this.f31654OooOo0o ? OooO0oO.OooOo.OooOoo0(string, ".immediate") : string;
    }
}
