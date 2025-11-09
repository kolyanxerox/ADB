package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;

/* loaded from: classes2.dex */
public final class g71 extends AudioTrack$StreamEventCallback {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ bi0 f19258OooO00o;

    public g71(bi0 bi0Var) {
        this.f19258OooO00o = bi0Var;
    }

    public final void onDataRequest(AudioTrack audioTrack, int i) {
        audioTrack.equals(((h71) this.f19258OooO00o.f17510OooOoO0).f19605OooOOOo);
    }

    public final void onPresentationEnded(AudioTrack audioTrack) {
        if (audioTrack.equals(((h71) this.f19258OooO00o.f17510OooOoO0).f19605OooOOOo)) {
            ((h71) this.f19258OooO00o.f17510OooOoO0).f19627Oooo0o = true;
        }
    }

    public final void onTearDown(AudioTrack audioTrack) {
        audioTrack.equals(((h71) this.f19258OooO00o.f17510OooOoO0).f19605OooOOOo);
    }
}
