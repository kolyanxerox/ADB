package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;

/* loaded from: classes2.dex */
public final class f41 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final il0 f18779OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final e41 f18780OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public t41 f18781OooO0OO;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public float f18783OooO0o0 = 1.0f;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public int f18782OooO0Oo = 0;

    public f41(Context context, Handler handler, t41 t41Var) {
        this.f18779OooO00o = ii0.OooO0oO(new nh0(context, 2));
        this.f18781OooO0OO = t41Var;
        this.f18780OooO0O0 = new e41(this, handler);
    }

    public final void OooO00o() {
        int i = this.f18782OooO0Oo;
        if (i == 1 || i == 0 || i80.f19994OooO00o >= 26) {
            return;
        }
        ((AudioManager) this.f18779OooO00o.mo13704zza()).abandonAudioFocus(this.f18780OooO0O0);
    }

    public final void OooO0O0(int i) {
        if (this.f18782OooO0Oo == i) {
            return;
        }
        this.f18782OooO0Oo = i;
        float f = i == 4 ? 0.2f : 1.0f;
        if (this.f18783OooO0o0 != f) {
            this.f18783OooO0o0 = f;
            t41 t41Var = this.f18781OooO0OO;
            if (t41Var != null) {
                w41 w41Var = t41Var.f24239OooOo0O;
                w41Var.o0000O(1, 2, Float.valueOf(w41Var.f25217OooooOo * w41Var.f25204OoooO0.f18783OooO0o0));
            }
        }
    }
}
