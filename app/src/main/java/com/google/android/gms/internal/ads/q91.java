package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final /* synthetic */ class q91 implements Runnable {

    /* renamed from: OooOo0O */
    public final /* synthetic */ int f23551OooOo0O;

    /* renamed from: OooOo0o */
    public final v91 f23552OooOo0o;

    public /* synthetic */ q91(v91 v91Var, int i) {
        this.f23551OooOo0O = i;
        this.f23552OooOo0o = v91Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f23551OooOo0O) {
            case 0:
                this.f23552OooOo0o.f24925OoooOoo = true;
                break;
            case 1:
                this.f23552OooOo0o.OooOOo0();
                break;
            case 2:
                v91 v91Var = this.f23552OooOo0o;
                if (!v91Var.f24932Oooooo0) {
                    f91 f91Var = v91Var.f24910Oooo0O0;
                    f91Var.getClass();
                    f91Var.OooO0oO(v91Var);
                    break;
                }
                break;
            default:
                v91 v91Var2 = this.f23552OooOo0o;
                for (aa1 aa1Var : v91Var2.f24913Oooo0o0) {
                    aa1Var.OooOOO0(true);
                    if (aa1Var.f17015OooOoOO != null) {
                        aa1Var.f17015OooOoOO = null;
                        aa1Var.f16996OooO0o = null;
                    }
                }
                bi0 bi0Var = v91Var2.f24904OooOooo;
                if (((o00000O) bi0Var.f17507OooOo) != null) {
                    bi0Var.f17507OooOo = null;
                }
                bi0Var.f17510OooOoO0 = null;
                break;
        }
    }
}
