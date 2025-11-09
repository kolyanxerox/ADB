package com.google.android.gms.internal.ads;

import android.os.IBinder;

/* loaded from: classes2.dex */
public final class dk0 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public IBinder f18263OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public String f18264OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public int f18265OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public float f18266OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public String f18267OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public int f18268OooO0o0;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public byte f18269OooO0oO;

    public final ek0 OooO00o() {
        IBinder iBinder;
        if (this.f18269OooO0oO == 31 && (iBinder = this.f18263OooO00o) != null) {
            return new ek0(iBinder, this.f18264OooO0O0, this.f18265OooO0OO, this.f18266OooO0Oo, this.f18268OooO0o0, this.f18267OooO0o);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f18263OooO00o == null) {
            sb.append(" windowToken");
        }
        if ((this.f18269OooO0oO & 1) == 0) {
            sb.append(" layoutGravity");
        }
        if ((this.f18269OooO0oO & 2) == 0) {
            sb.append(" layoutVerticalMargin");
        }
        if ((this.f18269OooO0oO & 4) == 0) {
            sb.append(" displayMode");
        }
        if ((this.f18269OooO0oO & 8) == 0) {
            sb.append(" triggerMode");
        }
        if ((this.f18269OooO0oO & 16) == 0) {
            sb.append(" windowWidthPx");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
