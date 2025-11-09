package oo0o0Oo;

import android.graphics.Typeface;

/* loaded from: classes2.dex */
public final class OooO00o extends OooOO0O {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final Typeface f33210OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final o0ooOO0.OooO f33211OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public boolean f33212OooO0OO;

    public OooO00o(o0ooOO0.OooO oooO, Typeface typeface) {
        this.f33210OooO00o = typeface;
        this.f33211OooO0O0 = oooO;
    }

    @Override // oo0o0Oo.OooOO0O
    public final void OooO00o(int i) {
        if (this.f33212OooO0OO) {
            return;
        }
        this.f33211OooO0O0.OooO00o(this.f33210OooO00o);
    }

    @Override // oo0o0Oo.OooOO0O
    public final void OooO0O0(Typeface typeface, boolean z) {
        if (this.f33212OooO0OO) {
            return;
        }
        this.f33211OooO0O0.OooO00o(typeface);
    }
}
