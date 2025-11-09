package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class x61 extends Exception {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final int f25536OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final boolean f25537OooOo0o;

    /* JADX WARN: Illegal instructions before constructor call */
    public x61(int i, int i2, int i3, int i4, o0OoOo0 o0oooo0, boolean z, RuntimeException runtimeException) {
        String strValueOf = String.valueOf(o0oooo0);
        StringBuilder sbOooOo0o = OooO0oO.OooOo.OooOo0o("AudioTrack init failed ", i, " Config(", i2, ", ");
        sbOooOo0o.append(i3);
        sbOooOo0o.append(", ");
        sbOooOo0o.append(i4);
        sbOooOo0o.append(") ");
        sbOooOo0o.append(strValueOf);
        sbOooOo0o.append(true != z ? "" : " (recoverable)");
        super(sbOooOo0o.toString(), runtimeException);
        this.f25536OooOo0O = i;
        this.f25537OooOo0o = z;
    }
}
