package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class y31 implements v31 {

    /* renamed from: OooO0OO, reason: collision with root package name */
    public static final Object f25841OooO0OO = new Object();

    /* renamed from: OooO00o, reason: collision with root package name */
    public volatile q31 f25842OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public volatile Object f25843OooO0O0;

    public static v31 OooO00o(q31 q31Var) {
        if ((q31Var instanceof y31) || (q31Var instanceof p31)) {
            return q31Var;
        }
        y31 y31Var = new y31();
        y31Var.f25843OooO0O0 = f25841OooO0OO;
        y31Var.f25842OooO00o = q31Var;
        return y31Var;
    }

    @Override // com.google.android.gms.internal.ads.z31
    public final Object zzb() {
        Object obj = this.f25843OooO0O0;
        if (obj != f25841OooO0OO) {
            return obj;
        }
        q31 q31Var = this.f25842OooO00o;
        if (q31Var == null) {
            return this.f25843OooO0O0;
        }
        Object objZzb = q31Var.zzb();
        this.f25843OooO0O0 = objZzb;
        this.f25842OooO00o = null;
        return objZzb;
    }
}
