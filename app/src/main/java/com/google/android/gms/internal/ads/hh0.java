package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class hh0 extends kh0 {

    /* renamed from: OooOoO0, reason: collision with root package name */
    public static final hh0 f19779OooOoO0 = new hh0();

    @Override // com.google.android.gms.internal.ads.kh0
    public final void OooO00o(boolean z) {
        Iterator it = Collections.unmodifiableCollection(ih0.f20045OooO0OO.f20046OooO00o).iterator();
        while (it.hasNext()) {
            sh0 sh0Var = ((yg0) it.next()).f25909OooO0Oo;
            if (sh0Var.f24088OooO0O0.get() != 0) {
                ze0.OooOooo(sh0Var.OooO00o(), "setState", true != z ? "backgrounded" : "foregrounded", sh0Var.f24087OooO00o);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.kh0
    public final boolean OooO0O0() {
        Iterator it = Collections.unmodifiableCollection(ih0.f20045OooO0OO.f20047OooO0O0).iterator();
        while (it.hasNext()) {
            View view = (View) ((yg0) it.next()).f25908OooO0OO.get();
            if (view != null && view.hasWindowFocus()) {
                return true;
            }
        }
        return false;
    }
}
