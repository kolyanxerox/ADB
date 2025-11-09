package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.HashMap;

/* loaded from: classes2.dex */
public abstract class t81 extends n81 {

    /* renamed from: OooO */
    public Handler f24271OooO;

    /* renamed from: OooO0oo */
    public final HashMap f24272OooO0oo = new HashMap();

    /* renamed from: OooOO0 */
    public gb1 f24273OooOO0;

    @Override // com.google.android.gms.internal.ads.n81
    public final void OooO0o() {
        for (s81 s81Var : this.f24272OooO0oo.values()) {
            s81Var.f24036OooO00o.OooO0o0(s81Var.f24037OooO0O0);
        }
    }

    @Override // com.google.android.gms.internal.ads.n81
    public final void OooO0oo() {
        for (s81 s81Var : this.f24272OooO0oo.values()) {
            s81Var.f24036OooO00o.OooO0oO(s81Var.f24037OooO0O0);
        }
    }

    @Override // com.google.android.gms.internal.ads.n81
    public void OooOOO0() {
        HashMap map = this.f24272OooO0oo;
        for (s81 s81Var : map.values()) {
            s81Var.f24036OooO00o.OooOO0o(s81Var.f24037OooO0O0);
            r81 r81Var = s81Var.f24038OooO0OO;
            n81 n81Var = s81Var.f24036OooO00o;
            n81Var.OooOOOO(r81Var);
            n81Var.OooOOO(r81Var);
        }
        map.clear();
    }

    public abstract void OooOOoo(Integer num, n81 n81Var, AbstractC1787lf abstractC1787lf);

    public final void OooOo00(Integer num, n81 n81Var) {
        HashMap map = this.f24272OooO0oo;
        af0.OoooO0(!map.containsKey(num));
        q81 q81Var = new i91() { // from class: com.google.android.gms.internal.ads.q81

            /* renamed from: OooO0O0 */
            public final /* synthetic */ Integer f23546OooO0O0;

            public /* synthetic */ q81(Integer num2) {
                num = num2;
            }

            @Override // com.google.android.gms.internal.ads.i91
            public final void OooO00o(n81 n81Var2, AbstractC1787lf abstractC1787lf) {
                this.f23545OooO00o.OooOOoo(num, n81Var2, abstractC1787lf);
            }
        };
        r81 r81Var = new r81(this, num2);
        map.put(num2, new s81(n81Var, q81Var, r81Var));
        Handler handler = this.f24271OooO;
        handler.getClass();
        o71 o71Var = n81Var.f21438OooO0OO;
        o71Var.getClass();
        o71Var.f22355OooO0O0.add(new k91(handler, r81Var));
        this.f24271OooO.getClass();
        o71 o71Var2 = n81Var.f21439OooO0Oo;
        o71Var2.getClass();
        o71Var2.f22355OooO0O0.add(new n71(r81Var));
        gb1 gb1Var = this.f24273OooOO0;
        o61 o61Var = this.f21442OooO0oO;
        af0.OooOo0O(o61Var);
        n81Var.OooO(q81Var, gb1Var, o61Var);
        if (this.f21437OooO0O0.isEmpty()) {
            n81Var.OooO0o0(q81Var);
        }
    }

    public abstract h91 OooOo0o(Integer num, h91 h91Var);

    public void OooOo0(Integer num) {
    }

    public void OooOo0O(Integer num, long j) {
    }
}
