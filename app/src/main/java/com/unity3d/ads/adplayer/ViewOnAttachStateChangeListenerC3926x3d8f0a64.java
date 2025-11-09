package com.unity3d.ads.adplayer;

import android.view.View;
import kotlin.jvm.internal.OooOo;
import o00O0oOo.o0000OO0;

/* renamed from: com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$lambda$2$$inlined$doOnDetach$1 */
/* loaded from: classes2.dex */
public final class ViewOnAttachStateChangeListenerC3926x3d8f0a64 implements View.OnAttachStateChangeListener {
    final /* synthetic */ View $this_doOnDetach;
    final /* synthetic */ AndroidEmbeddableWebViewAdPlayer this$0;

    public ViewOnAttachStateChangeListenerC3926x3d8f0a64(View view, AndroidEmbeddableWebViewAdPlayer androidEmbeddableWebViewAdPlayer) {
        this.$this_doOnDetach = view;
        this.this$0 = androidEmbeddableWebViewAdPlayer;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        OooOo.OooO0o0(view, "view");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        OooOo.OooO0o0(view, "view");
        this.$this_doOnDetach.removeOnAttachStateChangeListener(this);
        o0000OO0.OooOo0(this.this$0.webViewAdPlayer.getScope(), null, new AndroidEmbeddableWebViewAdPlayer$show$1$2$1(this.this$0, null), 3);
    }
}
