package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class qh0 {

    /* renamed from: OooO0Oo */
    public static final qh0 f23613OooO0Oo;

    /* renamed from: OooO00o */
    public WeakReference f23614OooO00o;

    /* renamed from: OooO0O0 */
    public boolean f23615OooO0O0;

    /* renamed from: OooO0OO */
    public boolean f23616OooO0OO;

    static {
        qh0 qh0Var = new qh0();
        qh0Var.f23615OooO0O0 = false;
        qh0Var.f23616OooO0OO = false;
        f23613OooO0Oo = qh0Var;
    }

    public final void OooO00o(boolean z, boolean z2) {
        if ((z2 || z) == (this.f23616OooO0OO || this.f23615OooO0O0)) {
            return;
        }
        Iterator it = Collections.unmodifiableCollection(ih0.f20045OooO0OO.f20046OooO00o).iterator();
        while (it.hasNext()) {
            sh0 sh0Var = ((yg0) it.next()).f25909OooO0Oo;
            boolean z3 = z2 || z;
            if (sh0Var.f24088OooO0O0.get() != 0) {
                ze0.OooOooo(sh0Var.OooO00o(), "setDeviceLockState", true != z3 ? "unlocked" : "locked");
            }
        }
    }
}
