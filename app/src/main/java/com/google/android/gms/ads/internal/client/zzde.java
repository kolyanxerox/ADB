package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.MuteThisAdListener;

/* loaded from: classes2.dex */
public final class zzde extends zzdc {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final MuteThisAdListener f16022OooOo0O;

    public zzde(MuteThisAdListener muteThisAdListener) {
        this.f16022OooOo0O = muteThisAdListener;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdd
    public final void zze() {
        this.f16022OooOo0O.onAdMuted();
    }
}
