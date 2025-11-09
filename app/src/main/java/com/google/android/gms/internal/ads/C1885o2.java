package com.google.android.gms.internal.ads;

import android.view.View;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.internal.ads.o2 */
/* loaded from: classes2.dex */
public final class C1885o2 extends AbstractCallableC1959q2 {

    /* renamed from: OooOoo, reason: collision with root package name */
    public final ViewOnAttachStateChangeListenerC1370a2 f22302OooOoo;

    /* renamed from: OooOooO, reason: collision with root package name */
    public final long f22303OooOooO;

    public C1885o2(C2143v1 c2143v1, C2104u c2104u, int i, ViewOnAttachStateChangeListenerC1370a2 viewOnAttachStateChangeListenerC1370a2) {
        super(c2143v1, "IhZL/A+AP3q6BJHYZzhe50ZZY+joh9QA4Yw9iPAZ5epuj4PBIlbCfCRKNYc+Lpx6", "aH+LkkSrrb3t9z/9chsxYBmeH34qaSymsmB0IYlZ8kA=", c2104u, i, 53);
        this.f22302OooOoo = viewOnAttachStateChangeListenerC1370a2;
        if (viewOnAttachStateChangeListenerC1370a2 != null) {
            if (viewOnAttachStateChangeListenerC1370a2.f16890Oooo00O <= -2) {
                WeakReference weakReference = viewOnAttachStateChangeListenerC1370a2.f16885OooOoo;
                if ((weakReference != null ? (View) weakReference.get() : null) == null) {
                    viewOnAttachStateChangeListenerC1370a2.f16890Oooo00O = -3L;
                }
            }
            this.f22303OooOooO = viewOnAttachStateChangeListenerC1370a2.f16890Oooo00O;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC1959q2
    public final void OooO00o() {
        if (this.f22302OooOoo != null) {
            long jLongValue = ((Long) this.f23491OooOoO.invoke(null, Long.valueOf(this.f22303OooOooO))).longValue();
            C2104u c2104u = this.f23492OooOoO0;
            c2104u.OooO0Oo();
            C1514e0.OoooO((C1514e0) c2104u.f25822OooOo0o, jLongValue);
        }
    }
}
