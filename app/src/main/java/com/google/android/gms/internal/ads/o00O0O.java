package com.google.android.gms.internal.ads;

import android.os.Handler;

/* loaded from: classes2.dex */
public final class o00O0O {

    /* renamed from: OooO00o */
    public final Handler f21767OooO00o;

    /* renamed from: OooO0O0 */
    public final t41 f21768OooO0O0;

    public /* synthetic */ o00O0O(Handler handler, t41 t41Var) {
        this.f21767OooO00o = handler;
        this.f21768OooO0O0 = t41Var;
    }

    public void OooO00o(C1721jn c1721jn) {
        Handler handler = this.f21767OooO00o;
        if (handler != null) {
            handler.post(new wp0(1, this, c1721jn));
        }
    }
}
