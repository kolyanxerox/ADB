package com.google.android.gms.ads.internal.overlay;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* loaded from: classes2.dex */
final class zzs extends AnimatorListenerAdapter {

    /* renamed from: OooO00o */
    public final /* synthetic */ zzu f16158OooO00o;

    public zzs(zzu zzuVar) {
        this.f16158OooO00o = zzuVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        zzu zzuVar = this.f16158OooO00o;
        zzuVar.setEnabled(true);
        zzuVar.f16159OooOo0O.setEnabled(true);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        zzu zzuVar = this.f16158OooO00o;
        zzuVar.setEnabled(true);
        zzuVar.f16159OooOo0O.setEnabled(true);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        zzu zzuVar = this.f16158OooO00o;
        zzuVar.setEnabled(false);
        zzuVar.f16159OooOo0O.setEnabled(false);
    }
}
