package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class n51 implements l91, p71 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final p51 f21413OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ g80 f21414OooO0O0;

    public n51(g80 g80Var, p51 p51Var) {
        this.f21414OooO0O0 = g80Var;
        this.f21413OooO00o = p51Var;
    }

    @Override // com.google.android.gms.internal.ads.l91
    public final void OooO00o(int i, h91 h91Var, y81 y81Var, e91 e91Var) {
        Pair pairOooO0o = OooO0o(h91Var);
        if (pairOooO0o != null) {
            ((m60) this.f21414OooO0O0.f19277OooOooo).OooO0O0(new m51(this, pairOooO0o, y81Var, e91Var, 0));
        }
    }

    @Override // com.google.android.gms.internal.ads.l91
    public final void OooO0O0(int i, h91 h91Var, y81 y81Var, e91 e91Var) {
        Pair pairOooO0o = OooO0o(h91Var);
        if (pairOooO0o != null) {
            ((m60) this.f21414OooO0O0.f19277OooOooo).OooO0O0(new m51(this, pairOooO0o, y81Var, e91Var, 1));
        }
    }

    @Override // com.google.android.gms.internal.ads.l91
    public final void OooO0OO(int i, h91 h91Var, y81 y81Var, e91 e91Var) {
        Pair pairOooO0o = OooO0o(h91Var);
        if (pairOooO0o != null) {
            ((m60) this.f21414OooO0O0.f19277OooOooo).OooO0O0(new m51(this, pairOooO0o, y81Var, e91Var, 2));
        }
    }

    @Override // com.google.android.gms.internal.ads.l91
    public final void OooO0Oo(int i, h91 h91Var, e91 e91Var) {
        Pair pairOooO0o = OooO0o(h91Var);
        if (pairOooO0o != null) {
            ((m60) this.f21414OooO0O0.f19277OooOooo).OooO0O0(new o000oOoO(this, pairOooO0o, e91Var, 11));
        }
    }

    public final Pair OooO0o(h91 h91Var) {
        h91 h91VarOooO00o;
        p51 p51Var = this.f21413OooO00o;
        h91 h91Var2 = null;
        if (h91Var != null) {
            int i = 0;
            while (true) {
                if (i >= p51Var.f23228OooO0OO.size()) {
                    h91VarOooO00o = null;
                    break;
                }
                if (((h91) p51Var.f23228OooO0OO.get(i)).f19660OooO0Oo == h91Var.f19660OooO0Oo) {
                    h91VarOooO00o = h91Var.OooO00o(Pair.create(p51Var.f23227OooO0O0, h91Var.f19657OooO00o));
                    break;
                }
                i++;
            }
            if (h91VarOooO00o == null) {
                return null;
            }
            h91Var2 = h91VarOooO00o;
        }
        return Pair.create(Integer.valueOf(p51Var.f23229OooO0Oo), h91Var2);
    }

    @Override // com.google.android.gms.internal.ads.l91
    public final void OooO0o0(int i, h91 h91Var, y81 y81Var, e91 e91Var, IOException iOException, boolean z) {
        Pair pairOooO0o = OooO0o(h91Var);
        if (pairOooO0o != null) {
            ((m60) this.f21414OooO0O0.f19277OooOooo).OooO0O0(new OoooOOO.oO00o00(this, pairOooO0o, y81Var, e91Var, iOException, z));
        }
    }
}
