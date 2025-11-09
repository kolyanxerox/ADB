package com.google.android.gms.internal.ads;

import android.os.Handler;

/* loaded from: classes2.dex */
public final class oh0 implements jh0 {

    /* renamed from: OooO0Oo */
    public static oh0 f22994OooO0Oo;

    /* renamed from: OooO00o */
    public float f22995OooO00o;

    /* renamed from: OooO0O0 */
    public fh0 f22996OooO0O0;

    /* renamed from: OooO0OO */
    public ih0 f22997OooO0OO;

    public static oh0 OooO0O0() {
        if (f22994OooO0Oo == null) {
            oh0 oh0Var = new oh0();
            oh0Var.f22995OooO00o = 0.0f;
            f22994OooO0Oo = oh0Var;
        }
        return f22994OooO0Oo;
    }

    @Override // com.google.android.gms.internal.ads.jh0
    public final void OooO00o(boolean z) {
        if (z) {
            zh0.f26170OooO0oO.getClass();
            zh0.OooO0O0();
            return;
        }
        zh0.f26170OooO0oO.getClass();
        Handler handler = zh0.f26169OooO;
        if (handler != null) {
            handler.removeCallbacks(zh0.f26173OooOO0O);
            zh0.f26169OooO = null;
        }
    }
}
