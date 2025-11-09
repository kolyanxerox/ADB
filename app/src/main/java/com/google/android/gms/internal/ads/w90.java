package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: classes2.dex */
public final class w90 implements q31 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f25268OooO00o = 1;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public v31 f25269OooO0O0;

    public /* synthetic */ w90() {
    }

    public static void OooO00o(w90 w90Var, v31 v31Var) {
        if (w90Var.f25269OooO0O0 != null) {
            throw new IllegalStateException();
        }
        w90Var.f25269OooO0O0 = v31Var;
    }

    @Override // com.google.android.gms.internal.ads.z31
    public final Object zzb() {
        switch (this.f25268OooO00o) {
            case 0:
                return new k90((Set) this.f25269OooO0O0.zzb(), 1);
            default:
                v31 v31Var = this.f25269OooO0O0;
                if (v31Var != null) {
                    return v31Var.zzb();
                }
                throw new IllegalStateException();
        }
    }

    public w90(v31 v31Var) {
        this.f25269OooO0O0 = v31Var;
    }
}
