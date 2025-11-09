package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class o0O0OO0 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public boolean f21958OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public boolean f21959OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public boolean f21960OooO0OO;

    public /* synthetic */ o0O0OO0(boolean z, boolean z2, boolean z3) {
        this.f21958OooO00o = z;
        this.f21959OooO0O0 = z2;
        this.f21960OooO0OO = z3;
    }

    public t61 OooO00o() {
        if (this.f21958OooO00o || !(this.f21959OooO0O0 || this.f21960OooO0OO)) {
            return new t61(this);
        }
        throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
    }
}
