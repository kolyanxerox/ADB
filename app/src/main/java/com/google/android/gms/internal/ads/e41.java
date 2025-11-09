package com.google.android.gms.internal.ads;

import android.media.AudioManager;
import android.os.Handler;

/* loaded from: classes2.dex */
public final class e41 implements AudioManager.OnAudioFocusChangeListener {

    /* renamed from: OooO00o */
    public final Handler f18491OooO00o;

    /* renamed from: OooO0O0 */
    public final /* synthetic */ f41 f18492OooO0O0;

    public e41(f41 f41Var, Handler handler) {
        this.f18492OooO0O0 = f41Var;
        this.f18491OooO00o = handler;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        this.f18491OooO00o.post(new com.google.android.gms.common.api.internal.Oooo000(this, i, 5));
    }
}
