package com.google.android.gms.internal.play_billing;

import com.google.android.gms.internal.ads.po0;

/* loaded from: classes2.dex */
public final class oO0O0OoO {

    /* renamed from: OooO00o */
    public Object f27199OooO00o;

    /* renamed from: OooO0O0 */
    public oO00O0o f27200OooO0O0;

    /* renamed from: OooO0OO */
    public oOo00OO0 f27201OooO0OO;

    /* renamed from: OooO0Oo */
    public boolean f27202OooO0Oo;

    public final void finalize() {
        oOo00OO0 ooo00oo0;
        oO00O0o oo00o0o = this.f27200OooO0O0;
        if (oo00o0o != null) {
            oO00O0o0 oo00o0o0 = oo00o0o.f27197OooOo0o;
            if (!oo00o0o0.isDone()) {
                if (oO000o00.f27191OooOoOO.OooOo0O(oo00o0o0, null, new o0O0oo0o(new po0("The completer object was garbage collected - this future would otherwise never complete. The tag was: ".concat(String.valueOf(this.f27199OooO00o)), 3)))) {
                    oO000o00.OooO0OO(oo00o0o0);
                }
            }
        }
        if (this.f27202OooO0Oo || (ooo00oo0 = this.f27201OooO0OO) == null) {
            return;
        }
        ooo00oo0.OooO0oo(null);
    }
}
