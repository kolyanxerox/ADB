package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes2.dex */
public final class uj0 extends tj0 {

    /* renamed from: OooO, reason: collision with root package name */
    public static uj0 f24650OooO;

    public static final uj0 OooO0o(Context context) {
        uj0 uj0Var;
        synchronized (uj0.class) {
            try {
                if (f24650OooO == null) {
                    f24650OooO = new uj0(context, "paidv1_id", "paidv1_creation_time", "PaidV1LifecycleImpl");
                }
                uj0Var = f24650OooO;
            } catch (Throwable th) {
                throw th;
            }
        }
        return uj0Var;
    }
}
