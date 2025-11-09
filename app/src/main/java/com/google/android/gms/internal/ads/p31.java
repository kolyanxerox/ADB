package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class p31 implements v31, n31 {

    /* renamed from: OooO0OO, reason: collision with root package name */
    public static final Object f23211OooO0OO = new Object();

    /* renamed from: OooO00o, reason: collision with root package name */
    public volatile v31 f23212OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public volatile Object f23213OooO0O0 = f23211OooO0OO;

    public p31(v31 v31Var) {
        this.f23212OooO00o = v31Var;
    }

    public static n31 OooO00o(v31 v31Var) {
        return v31Var instanceof n31 ? (n31) v31Var : new p31(v31Var);
    }

    public static p31 OooO0O0(v31 v31Var) {
        return v31Var instanceof p31 ? (p31) v31Var : new p31(v31Var);
    }

    @Override // com.google.android.gms.internal.ads.z31
    public final Object zzb() {
        Object obj = this.f23213OooO0O0;
        Object obj2 = f23211OooO0OO;
        if (obj != obj2) {
            return obj;
        }
        synchronized (this) {
            try {
                Object obj3 = this.f23213OooO0O0;
                if (obj3 != obj2) {
                    return obj3;
                }
                Object objZzb = this.f23212OooO00o.zzb();
                Object obj4 = this.f23213OooO0O0;
                if (obj4 != obj2 && obj4 != objZzb) {
                    throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + objZzb + ". This is likely due to a circular dependency.");
                }
                this.f23213OooO0O0 = objZzb;
                this.f23212OooO00o = null;
                return objZzb;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
