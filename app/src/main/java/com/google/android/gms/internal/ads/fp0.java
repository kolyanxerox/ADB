package com.google.android.gms.internal.ads;

import com.ironsource.C3034d9;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* loaded from: classes2.dex */
public abstract class fp0 extends sp0 implements Runnable {

    /* renamed from: OooOooo, reason: collision with root package name */
    public static final /* synthetic */ int f18988OooOooo = 0;

    /* renamed from: OooOoo, reason: collision with root package name */
    public o00000oO.OooOOO f18989OooOoo;

    /* renamed from: OooOooO, reason: collision with root package name */
    public Object f18990OooOooO;

    public fp0(Object obj, o00000oO.OooOOO oooOOO) {
        oooOOO.getClass();
        this.f18989OooOoo = oooOOO;
        this.f18990OooOooO = obj;
    }

    @Override // com.google.android.gms.internal.ads.ap0
    public final String OooO0Oo() {
        o00000oO.OooOOO oooOOO = this.f18989OooOoo;
        Object obj = this.f18990OooOooO;
        String strOooO0Oo = super.OooO0Oo();
        String strOooOO0O = oooOOO != null ? OooO0oO.OooOo.OooOO0O("inputFuture=[", oooOOO.toString(), "], ") : "";
        if (obj == null) {
            if (strOooO0Oo != null) {
                return strOooOO0O.concat(strOooO0Oo);
            }
            return null;
        }
        return strOooOO0O + "function=[" + obj.toString() + C3034d9.i.f8179e;
    }

    @Override // com.google.android.gms.internal.ads.ap0
    public final void OooO0o0() {
        OooOO0O(this.f18989OooOoo);
        this.f18989OooOoo = null;
        this.f18990OooOooO = null;
    }

    public abstract Object OooOOoo(Object obj, Object obj2);

    public abstract void OooOo00(Object obj);

    @Override // java.lang.Runnable
    public final void run() {
        o00000oO.OooOOO oooOOO = this.f18989OooOoo;
        Object obj = this.f18990OooOooO;
        if (((this.f17078OooOo0O instanceof no0) | (oooOOO == null)) || (obj == null)) {
            return;
        }
        this.f18989OooOoo = null;
        if (oooOOO.isCancelled()) {
            OooOO0o(oooOOO);
            return;
        }
        try {
            try {
                Object objOooOOoo = OooOOoo(obj, ii0.o00Ooo(oooOOO));
                this.f18990OooOooO = null;
                OooOo00(objOooOOoo);
            } catch (Throwable th) {
                try {
                    if (th instanceof InterruptedException) {
                        Thread.currentThread().interrupt();
                    }
                    OooO0oO(th);
                } finally {
                    this.f18990OooOooO = null;
                }
            }
        } catch (Error e) {
            OooO0oO(e);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (ExecutionException e2) {
            OooO0oO(e2.getCause());
        } catch (Exception e3) {
            OooO0oO(e3);
        }
    }
}
