package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;

/* loaded from: classes2.dex */
public abstract class gp0 extends jp0 {

    /* renamed from: Oooo0O0 */
    public static final bq0 f19395Oooo0O0 = new bq0(gp0.class, 0);

    /* renamed from: Oooo0 */
    public final boolean f19396Oooo0;

    /* renamed from: Oooo00O */
    public mm0 f19397Oooo00O;

    /* renamed from: Oooo00o */
    public final boolean f19398Oooo00o;

    public gp0(mm0 mm0Var, boolean z, boolean z2) {
        int size = mm0Var.size();
        this.f20348OooOoo = null;
        this.f20349OooOooO = size;
        this.f19397Oooo00O = mm0Var;
        this.f19398Oooo00o = z;
        this.f19396Oooo0 = z2;
    }

    @Override // com.google.android.gms.internal.ads.ap0
    public final String OooO0Oo() {
        mm0 mm0Var = this.f19397Oooo00O;
        return mm0Var != null ? "futures=".concat(mm0Var.toString()) : super.OooO0Oo();
    }

    @Override // com.google.android.gms.internal.ads.ap0
    public final void OooO0o0() {
        mm0 mm0Var = this.f19397Oooo00O;
        OooOo(1);
        if ((mm0Var != null) && (this.f17078OooOo0O instanceof no0)) {
            boolean zOooOOO0 = OooOOO0();
            vn0 vn0VarOooOO0 = mm0Var.OooOO0();
            while (vn0VarOooOO0.hasNext()) {
                ((Future) vn0VarOooOO0.next()).cancel(zOooOOO0);
            }
        }
    }

    public final void OooOOo(mm0 mm0Var) {
        int iOooO0Oo = jp0.f20346OooOooo.OooO0Oo(this);
        int i = 0;
        ii0.o0OoOo0("Less than 0 remaining futures", iOooO0Oo >= 0);
        if (iOooO0Oo == 0) {
            if (mm0Var != null) {
                vn0 vn0VarOooOO0 = mm0Var.OooOO0();
                while (vn0VarOooOO0.hasNext()) {
                    Future future = (Future) vn0VarOooOO0.next();
                    if (!future.isCancelled()) {
                        try {
                            OooOo0(i, ii0.OooO0oo(future));
                        } catch (ExecutionException e) {
                            OooOOoo(e.getCause());
                        } catch (Throwable th) {
                            OooOOoo(th);
                        }
                    }
                    i++;
                }
            }
            this.f20348OooOoo = null;
            OooOo0O();
            OooOo(2);
        }
    }

    public final void OooOOoo(Throwable th) {
        th.getClass();
        if (this.f19398Oooo00o && !OooO0oO(th)) {
            Set set = this.f20348OooOoo;
            if (set == null) {
                Set setNewSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
                setNewSetFromMap.getClass();
                if (!(this.f17078OooOo0O instanceof no0)) {
                    Throwable thOooO0O0 = OooO0O0();
                    Objects.requireNonNull(thOooO0O0);
                    while (thOooO0O0 != null && setNewSetFromMap.add(thOooO0O0)) {
                        thOooO0O0 = thOooO0O0.getCause();
                    }
                }
                jp0.f20346OooOooo.Oooo0OO(this, setNewSetFromMap);
                set = this.f20348OooOoo;
                Objects.requireNonNull(set);
            }
            for (Throwable cause = th; cause != null; cause = cause.getCause()) {
                if (set.add(cause)) {
                }
            }
            f19395Oooo0O0.OooO00o().logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFuture", "log", true != (th instanceof Error) ? "Got more than one input Future failure. Logging failures after the first" : "Input Future failed with Error", th);
            return;
        }
        boolean z = th instanceof Error;
        if (z) {
            f19395Oooo0O0.OooO00o().logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFuture", "log", true != z ? "Got more than one input Future failure. Logging failures after the first" : "Input Future failed with Error", th);
        }
    }

    public abstract void OooOo(int i);

    public abstract void OooOo0(int i, Object obj);

    public final void OooOo00(int i, o00000oO.OooOOO oooOOO) {
        try {
            if (oooOOO.isCancelled()) {
                this.f19397Oooo00O = null;
                cancel(false);
            } else {
                try {
                    OooOo0(i, ii0.OooO0oo(oooOOO));
                } catch (ExecutionException e) {
                    OooOOoo(e.getCause());
                } catch (Throwable th) {
                    OooOOoo(th);
                }
            }
        } finally {
            OooOOo(null);
        }
    }

    public abstract void OooOo0O();

    public final void OooOo0o() {
        Objects.requireNonNull(this.f19397Oooo00O);
        if (this.f19397Oooo00O.isEmpty()) {
            OooOo0O();
            return;
        }
        qp0 qp0Var = qp0.f23673OooOo0O;
        if (!this.f19398Oooo00o) {
            mm0 mm0Var = this.f19396Oooo0 ? this.f19397Oooo00O : null;
            c60 c60Var = new c60(12, this, mm0Var);
            vn0 vn0VarOooOO0 = this.f19397Oooo00O.OooOO0();
            while (vn0VarOooOO0.hasNext()) {
                o00000oO.OooOOO oooOOO = (o00000oO.OooOOO) vn0VarOooOO0.next();
                if (oooOOO.isDone()) {
                    OooOOo(mm0Var);
                } else {
                    oooOOO.addListener(c60Var, qp0Var);
                }
            }
            return;
        }
        vn0 vn0VarOooOO02 = this.f19397Oooo00O.OooOO0();
        int i = 0;
        while (vn0VarOooOO02.hasNext()) {
            o00000oO.OooOOO oooOOO2 = (o00000oO.OooOOO) vn0VarOooOO02.next();
            int i2 = i + 1;
            if (oooOOO2.isDone()) {
                OooOo00(i, oooOOO2);
            } else {
                oooOOO2.addListener(new RunnableC2324zy(i, this, 1, oooOOO2), qp0Var);
            }
            i = i2;
        }
    }
}
