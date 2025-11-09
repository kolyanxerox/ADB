package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.oz */
/* loaded from: classes2.dex */
public final class C1918oz implements InterfaceC1399av {

    /* renamed from: OooOo, reason: collision with root package name */
    public final Executor f23160OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final C2065sy f23161OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final C2102ty f23162OooOo0o;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final cq0 f23163OooOoO0;

    public C1918oz(C2065sy c2065sy, C2102ty c2102ty, Executor executor, cq0 cq0Var) {
        this.f23161OooOo0O = c2065sy;
        this.f23162OooOo0o = c2102ty;
        this.f23160OooOo = executor;
        this.f23163OooOoO0 = cq0Var;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1399av
    public final void zzr() {
        o00000oO.OooOOO oooOOO;
        o00000oO.OooOOO oooOOO2;
        C2274yl c2274yl;
        int i = 0;
        if (this.f23162OooOo0o.f24531OooO0o0) {
            C2065sy c2065sy = this.f23161OooOo0O;
            f60 f60VarOooOOOO = c2065sy.OooOOOO();
            if (f60VarOooOOOO == null) {
                synchronized (c2065sy) {
                    oooOOO = c2065sy.f24190OooOOO0;
                }
                if (oooOOO != null && ((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o00oO0)).booleanValue()) {
                    synchronized (c2065sy) {
                        oooOOO2 = c2065sy.f24190OooOOO0;
                    }
                    synchronized (c2065sy) {
                        c2274yl = c2065sy.f24189OooOOO;
                    }
                    if (oooOOO2 == null || c2274yl == null) {
                        return;
                    }
                    mp0 mp0Var = new mp0(rm0.OooOOOo(new o00000oO.OooOOO[]{oooOOO2, c2274yl}), false);
                    mp0Var.addListener(new wp0(i, mp0Var, new C1847n1(this, 17)), this.f23163OooOoO0);
                    return;
                }
            }
            if (f60VarOooOOOO != null) {
                InterfaceC1722jo interfaceC1722joOooOO0o = c2065sy.OooOO0o();
                InterfaceC1722jo interfaceC1722joOooOOO0 = c2065sy.OooOOO0();
                if (interfaceC1722joOooOO0o == null) {
                    interfaceC1722joOooOO0o = interfaceC1722joOooOOO0 != null ? interfaceC1722joOooOOO0 : null;
                }
                if (interfaceC1722joOooOO0o != null) {
                    this.f23160OooOo.execute(new RunnableC1911os(interfaceC1722joOooOO0o, 3));
                }
            }
        }
    }
}
