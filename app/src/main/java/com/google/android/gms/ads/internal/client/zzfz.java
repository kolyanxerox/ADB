package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.VideoController;

/* loaded from: classes2.dex */
public final class zzfz extends zzed {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final VideoController.VideoLifecycleCallbacks f16097OooOo0O;

    public zzfz(VideoController.VideoLifecycleCallbacks videoLifecycleCallbacks) {
        this.f16097OooOo0O = videoLifecycleCallbacks;
    }

    @Override // com.google.android.gms.ads.internal.client.zzee
    public final void zze() {
        this.f16097OooOo0O.onVideoEnd();
    }

    @Override // com.google.android.gms.ads.internal.client.zzee
    public final void zzf(boolean z) {
        this.f16097OooOo0O.onVideoMute(z);
    }

    @Override // com.google.android.gms.ads.internal.client.zzee
    public final void zzg() {
        this.f16097OooOo0O.onVideoPause();
    }

    @Override // com.google.android.gms.ads.internal.client.zzee
    public final void zzh() {
        this.f16097OooOo0O.onVideoPlay();
    }

    @Override // com.google.android.gms.ads.internal.client.zzee
    public final void zzi() {
        this.f16097OooOo0O.onVideoStart();
    }
}
