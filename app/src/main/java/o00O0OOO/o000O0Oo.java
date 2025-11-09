package o00O0oOo;

import com.google.android.gms.internal.ads.rp0;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.OooOo;
import o00O0O0O.OooO0OO;
import o00O0O0O.OooOOO0;
import o00OO000.OooO00o;
import o00OO000.OooOO0;
import o00OO00o.OooOOO;

/* loaded from: classes3.dex */
public abstract class o000O0Oo extends OooOOO {

    /* renamed from: OooOo */
    public int f31515OooOo;

    public o000O0Oo(int i) {
        super(0L, false);
        this.f31515OooOo = i;
    }

    public abstract OooO0OO OooO0OO();

    public Throwable OooO0Oo(Object obj) {
        o0000Ooo o0000ooo = obj instanceof o0000Ooo ? (o0000Ooo) obj : null;
        if (o0000ooo != null) {
            return o0000ooo.f31507OooO00o;
        }
        return null;
    }

    public final void OooO0o(Throwable th) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        o0000OO0.OooOOo(OooO0OO().getContext(), new rp0("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    public abstract Object OooO0oo();

    @Override // java.lang.Runnable
    public final void run() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            OooO0OO OooO0OO2 = OooO0OO();
            OooOo.OooO0OO(OooO0OO2, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            OooOO0 oooOO0 = (OooOO0) OooO0OO2;
            OooO0OO oooO0OO = oooOO0.f31934OooOoO;
            Object obj = oooOO0.f31937OooOoo0;
            OooOOO0 context = oooO0OO.getContext();
            Object objOooOO0o = OooO00o.OooOO0o(context, obj);
            o00O0O00 o00o0o00 = null;
            o0O00o0 o0o00o0Oooo000 = objOooOO0o != OooO00o.f31925OooO0Oo ? o0000OO0.Oooo000(oooO0OO, context, objOooOO0o) : null;
            try {
                OooOOO0 context2 = oooO0OO.getContext();
                Object objOooO0oo = OooO0oo();
                Throwable thOooO0Oo = OooO0Oo(objOooO0oo);
                if (thOooO0Oo == null) {
                    int i = this.f31515OooOo;
                    boolean z = true;
                    if (i != 1 && i != 2) {
                        z = false;
                    }
                    if (z) {
                        o00o0o00 = (o00O0O00) context2.get(o00O0.f31523OooOo0O);
                    }
                }
                if (o00o0o00 != null && !o00o0o00.isActive()) {
                    CancellationException cancellationExceptionOooO0o0 = o00o0o00.OooO0o0();
                    OooO00o(cancellationExceptionOooO0o0);
                    oooO0OO.resumeWith(o00O0.o000OOo.OooO0O0(cancellationExceptionOooO0o0));
                } else if (thOooO0Oo != null) {
                    oooO0OO.resumeWith(o00O0.o000OOo.OooO0O0(thOooO0Oo));
                } else {
                    oooO0OO.resumeWith(OooO0o0(objOooO0oo));
                }
                if (o0o00o0Oooo000 == null || o0o00o0Oooo000.OooooO0()) {
                    OooO00o.OooO0oO(context, objOooOO0o);
                }
            } catch (Throwable th) {
                if (o0o00o0Oooo000 == null || o0o00o0Oooo000.OooooO0()) {
                    OooO00o.OooO0oO(context, objOooOO0o);
                }
                throw th;
            }
        } catch (Throwable th2) {
            OooO0o(th2);
        }
    }

    public void OooO00o(CancellationException cancellationException) {
    }

    public Object OooO0o0(Object obj) {
        return obj;
    }
}
