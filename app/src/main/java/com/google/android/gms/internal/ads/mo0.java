package com.google.android.gms.internal.ads;

import com.ironsource.C3034d9;
import java.util.concurrent.ExecutionException;

/* loaded from: classes2.dex */
public abstract class mo0 extends sp0 implements Runnable {

    /* renamed from: OooOoo, reason: collision with root package name */
    public o00000oO.OooOOO f21316OooOoo;

    /* renamed from: OooOooO, reason: collision with root package name */
    public Class f21317OooOooO;

    /* renamed from: OooOooo, reason: collision with root package name */
    public Object f21318OooOooo;

    public mo0(o00000oO.OooOOO oooOOO, Class cls, Object obj) {
        oooOOO.getClass();
        this.f21316OooOoo = oooOOO;
        this.f21317OooOooO = cls;
        this.f21318OooOooo = obj;
    }

    @Override // com.google.android.gms.internal.ads.ap0
    public final String OooO0Oo() {
        o00000oO.OooOOO oooOOO = this.f21316OooOoo;
        Class cls = this.f21317OooOooO;
        Object obj = this.f21318OooOooo;
        String strOooO0Oo = super.OooO0Oo();
        String strOooOO0O = oooOOO != null ? OooO0oO.OooOo.OooOO0O("inputFuture=[", oooOOO.toString(), "], ") : "";
        if (cls == null || obj == null) {
            if (strOooO0Oo != null) {
                return strOooOO0O.concat(strOooO0Oo);
            }
            return null;
        }
        return strOooOO0O + "exceptionType=[" + cls.toString() + "], fallback=[" + obj.toString() + C3034d9.i.f8179e;
    }

    @Override // com.google.android.gms.internal.ads.ap0
    public final void OooO0o0() {
        OooOO0O(this.f21316OooOoo);
        this.f21316OooOoo = null;
        this.f21317OooOooO = null;
        this.f21318OooOooo = null;
    }

    public abstract Object OooOOoo(Object obj, Throwable th);

    public abstract void OooOo00(Object obj);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        o00000oO.OooOOO oooOOO = this.f21316OooOoo;
        Class cls = this.f21317OooOooO;
        Object obj = this.f21318OooOooo;
        if (((obj == null) || ((oooOOO == 0) | (cls == null))) || (this.f17078OooOo0O instanceof no0)) {
            return;
        }
        this.f21316OooOoo = null;
        try {
            th = oooOOO instanceof oq0 ? ((oq0) oooOOO).OooO0O0() : null;
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause == null) {
                cause = new NullPointerException(OooO0oO.OooOo.OooOO0o("Future type ", String.valueOf(oooOOO.getClass()), " threw ", String.valueOf(e.getClass()), " without a cause"));
            }
            th = cause;
        } catch (Throwable th) {
            th = th;
        }
        Object objO00Ooo = th == null ? ii0.o00Ooo(oooOOO) : null;
        if (th == null) {
            OooO0o(objO00Ooo);
            return;
        }
        if (!cls.isInstance(th)) {
            OooOO0o(oooOOO);
            return;
        }
        try {
            Object objOooOOoo = OooOOoo(obj, th);
            this.f21317OooOooO = null;
            this.f21318OooOooo = null;
            OooOo00(objOooOOoo);
        } catch (Throwable th2) {
            try {
                if (th2 instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                }
                OooO0oO(th2);
            } finally {
                this.f21317OooOooO = null;
                this.f21318OooOooo = null;
            }
        }
    }
}
