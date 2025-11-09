package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class r31 implements q31, n31 {

    /* renamed from: OooO0O0, reason: collision with root package name */
    public static final r31 f23737OooO0O0 = new r31(null);

    /* renamed from: OooO00o, reason: collision with root package name */
    public final Object f23738OooO00o;

    public r31(Object obj) {
        this.f23738OooO00o = obj;
    }

    public static r31 OooO00o(Object obj) {
        ii0.OooOOO0(obj, "instance cannot be null");
        return new r31(obj);
    }

    public static r31 OooO0O0(Object obj) {
        return obj == null ? f23737OooO0O0 : new r31(obj);
    }

    @Override // com.google.android.gms.internal.ads.z31
    public final Object zzb() {
        return this.f23738OooO00o;
    }
}
