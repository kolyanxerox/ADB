package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.zzt;
import com.google.android.gms.ads.internal.util.client.zzu;
import com.google.android.gms.ads.internal.util.client.zzv;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes2.dex */
public final class hg0 {

    /* renamed from: OooO00o */
    public final Context f19773OooO00o;

    /* renamed from: OooO0O0 */
    public final cq0 f19774OooO0O0;

    /* renamed from: OooO0OO */
    public final dq0 f19775OooO0OO;

    /* renamed from: OooO0Oo */
    public final zzu f19776OooO0Oo;

    /* renamed from: OooO0o */
    public final nf0 f19777OooO0o;

    /* renamed from: OooO0o0 */
    public final eg0 f19778OooO0o0;

    public hg0(Context context, cq0 cq0Var, dq0 dq0Var, zzu zzuVar, eg0 eg0Var, nf0 nf0Var) {
        this.f19773OooO00o = context;
        this.f19774OooO0O0 = cq0Var;
        this.f19775OooO0OO = dq0Var;
        this.f19776OooO0Oo = zzuVar;
        this.f19778OooO0o0 = eg0Var;
        this.f19777OooO0o = nf0Var;
    }

    public final o00000oO.OooOOO OooO00o(String str, zzv zzvVar) {
        cq0 cq0Var = this.f19775OooO0OO;
        if (zzvVar != null) {
            try {
                return new C1386ai(zzvVar.zzb(), this.f19776OooO0Oo, cq0Var, this.f19778OooO0o0, 15).OooOoO(1, 0L, str);
            } catch (NullPointerException | RejectedExecutionException unused) {
                return ii0.OooooOO(zzt.zzb);
            }
        }
        return ((C2163vl) cq0Var).OooO0O0(new CallableC2031s0(10, this, str));
    }

    public final void OooO0O0(String str, zzv zzvVar, mf0 mf0Var) {
        boolean zOooO00o = nf0.OooO00o();
        cq0 cq0Var = this.f19774OooO0O0;
        if (!zOooO00o || !((Boolean) AbstractC1449c8.f17951OooO0Oo.OooOOO()).booleanValue()) {
            cq0Var.execute(new RunnableC1432br(this, str, zzvVar, 1));
            return;
        }
        jf0 jf0VarOooO0oO = ze0.OooO0oO(this.f19773OooO00o, 14);
        jf0VarOooO0oO.zzi();
        o00000oO.OooOOO oooOOOOooO00o = OooO00o(str, zzvVar);
        oooOOOOooO00o.addListener(new wp0(0, oooOOOOooO00o, new de0(this, jf0VarOooO0oO, mf0Var, 29)), cq0Var);
    }

    public final void OooO0OO(List list, zzv zzvVar) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            OooO0O0((String) it.next(), zzvVar, null);
        }
    }
}
