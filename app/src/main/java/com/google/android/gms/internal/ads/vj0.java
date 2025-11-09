package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes2.dex */
public final class vj0 extends tj0 {

    /* renamed from: OooO */
    public static vj0 f24982OooO;

    public static final vj0 OooO0oO(Context context) {
        vj0 vj0Var;
        synchronized (vj0.class) {
            try {
                if (f24982OooO == null) {
                    f24982OooO = new vj0(context, "paidv2_id", "paidv2_creation_time", "PaidV2LifecycleImpl");
                }
                vj0Var = f24982OooO;
            } catch (Throwable th) {
                throw th;
            }
        }
        return vj0Var;
    }

    public final OoooOOO.o0O0O0O OooO0o(long j, boolean z) {
        boolean z2;
        synchronized (vj0.class) {
            try {
                sj0 sj0Var = this.f24324OooO0oO;
                sj0Var.getClass();
                synchronized (sj0.class) {
                    z2 = ((SharedPreferences) ((C1548ey) sj0Var.f24094OooOo0o).f18706OooOo).getBoolean("paidv2_publisher_option", true);
                }
                if (z2) {
                    return OooO00o(null, null, j, z);
                }
                return new OoooOOO.o0O0O0O(7);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void OooO0oo() {
        synchronized (vj0.class) {
            try {
                if (((SharedPreferences) this.f24322OooO0o.f18706OooOo).contains(this.f24318OooO00o)) {
                    OooO0Oo(false);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
