package com.google.android.gms.internal.ads;

import android.util.Pair;

/* loaded from: classes2.dex */
public final /* synthetic */ class m51 implements Runnable {

    /* renamed from: OooOo */
    public final /* synthetic */ Pair f21089OooOo;

    /* renamed from: OooOo0O */
    public final /* synthetic */ int f21090OooOo0O;

    /* renamed from: OooOo0o */
    public final /* synthetic */ n51 f21091OooOo0o;

    /* renamed from: OooOoO */
    public final /* synthetic */ e91 f21092OooOoO;

    /* renamed from: OooOoO0 */
    public final /* synthetic */ y81 f21093OooOoO0;

    public /* synthetic */ m51(n51 n51Var, Pair pair, y81 y81Var, e91 e91Var, int i) {
        this.f21090OooOo0O = i;
        this.f21091OooOo0o = n51Var;
        this.f21089OooOo = pair;
        this.f21093OooOoO0 = y81Var;
        this.f21092OooOoO = e91Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f21090OooOo0O) {
            case 0:
                h61 h61Var = (h61) this.f21091OooOo0o.f21414OooO0O0.f19276OooOooO;
                Pair pair = this.f21089OooOo;
                h61Var.OooO00o(((Integer) pair.first).intValue(), (h91) pair.second, this.f21093OooOoO0, this.f21092OooOoO);
                break;
            case 1:
                h61 h61Var2 = (h61) this.f21091OooOo0o.f21414OooO0O0.f19276OooOooO;
                Pair pair2 = this.f21089OooOo;
                h61Var2.OooO0O0(((Integer) pair2.first).intValue(), (h91) pair2.second, this.f21093OooOoO0, this.f21092OooOoO);
                break;
            default:
                h61 h61Var3 = (h61) this.f21091OooOo0o.f21414OooO0O0.f19276OooOooO;
                Pair pair3 = this.f21089OooOo;
                h61Var3.OooO0OO(((Integer) pair3.first).intValue(), (h91) pair3.second, this.f21093OooOoO0, this.f21092OooOoO);
                break;
        }
    }
}
