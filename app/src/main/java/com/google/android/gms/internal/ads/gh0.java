package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Date;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class gh0 implements jh0 {

    /* renamed from: OooO0o0 */
    public static final gh0 f19347OooO0o0 = new gh0(new kh0());

    /* renamed from: OooO00o */
    public boolean f19348OooO00o;

    /* renamed from: OooO0O0 */
    public boolean f19349OooO0O0;

    /* renamed from: OooO0OO */
    public Object f19350OooO0OO;

    /* renamed from: OooO0Oo */
    public final Object f19351OooO0Oo;

    public gh0(kh0 kh0Var) {
        this.f19351OooO0Oo = kh0Var;
    }

    @Override // com.google.android.gms.internal.ads.jh0
    public void OooO00o(boolean z) {
        if (!this.f19349OooO0O0 && z) {
            Date date = new Date();
            Date date2 = (Date) this.f19350OooO0OO;
            if (date2 == null || date.after(date2)) {
                this.f19350OooO0OO = date;
                if (this.f19348OooO00o) {
                    Iterator it = Collections.unmodifiableCollection(ih0.f20045OooO0OO.f20047OooO0O0).iterator();
                    while (it.hasNext()) {
                        sh0 sh0Var = ((yg0) it.next()).f25909OooO0Oo;
                        Date date3 = (Date) this.f19350OooO0OO;
                        sh0Var.OooO0OO(date3 != null ? (Date) date3.clone() : null);
                    }
                }
            }
        }
        this.f19349OooO0O0 = z;
    }

    public gh0(de0 de0Var, p80 p80Var, kc0 kc0Var) {
        this.f19348OooO00o = false;
        this.f19349OooO0O0 = false;
        this.f19350OooO0OO = kc0Var;
        o00000oO.OooOOO oooOOOOooO0O0 = ((C1847n1) p80Var.f23242OooOo0o).OooO0O0(kc0Var.f20477OooO0O0, kc0Var.f20476OooO00o, null);
        C1676ie c1676ie = new C1676ie(this, p80Var, de0Var, kc0Var, 4);
        cq0 cq0Var = kc0Var.f20481OooO0o0;
        this.f19351OooO0Oo = ii0.OoooOoO(ii0.ooOO(oooOOOOooO0O0, c1676ie, cq0Var), Exception.class, new C2043sc(this, p80Var), cq0Var);
    }
}
