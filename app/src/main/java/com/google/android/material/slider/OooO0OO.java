package com.google.android.material.slider;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import android.view.ViewOverlay;
import java.util.ArrayList;
import o000Ooo.o00oO0o;
import o0ooOO0.o0000oo;

/* loaded from: classes2.dex */
public final class OooO0OO extends AnimatorListenerAdapter {

    /* renamed from: OooO00o */
    public final /* synthetic */ BaseSlider f27803OooO00o;

    public OooO0OO(BaseSlider baseSlider) {
        this.f27803OooO00o = baseSlider;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        BaseSlider baseSlider = this.f27803OooO00o;
        ViewGroup viewGroupOooO0OO = o0000oo.OooO0OO(baseSlider);
        o00oO0o o00oo0o = viewGroupOooO0OO == null ? null : new o00oO0o(viewGroupOooO0OO);
        ArrayList arrayList = baseSlider.f27758Oooo000;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((ViewOverlay) o00oo0o.f30487OooOo0o).remove((o00000OO.OooO0O0) obj);
        }
    }
}
