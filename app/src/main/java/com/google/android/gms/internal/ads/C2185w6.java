package com.google.android.gms.internal.ads;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.w6 */
/* loaded from: classes2.dex */
public class C2185w6 extends IOException {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final boolean f25234OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final int f25235OooOo0o;

    public C2185w6(String str, RuntimeException runtimeException, boolean z, int i) {
        super(str, runtimeException);
        this.f25234OooOo0O = z;
        this.f25235OooOo0o = i;
    }

    public static C2185w6 OooO00o(RuntimeException runtimeException, String str) {
        return new C2185w6(str, runtimeException, true, 1);
    }

    public static C2185w6 OooO0O0(String str) {
        return new C2185w6(str, null, false, 1);
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        StringBuilder sbOooOo = OooO0oO.OooOo.OooOo(super.getMessage(), " {contentIsMalformed=");
        sbOooOo.append(this.f25234OooOo0O);
        sbOooOo.append(", dataType=");
        return OooO0oO.OooOo.OooOOO(sbOooOo, this.f25235OooOo0o, "}");
    }
}
