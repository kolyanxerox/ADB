package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.preload.PreloadCallback;
import com.google.android.gms.ads.preload.PreloadConfiguration;
import java.util.Optional;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
final class zzes extends zzce {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ PreloadCallback f16069OooOo0O;

    public zzes(zzex zzexVar, PreloadCallback preloadCallback) {
        this.f16069OooOo0O = preloadCallback;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcf
    public final void zze(zzft zzftVar) {
        Optional optionalOooO0Oo = zzex.OooO0Oo(zzftVar);
        final PreloadCallback preloadCallback = this.f16069OooOo0O;
        optionalOooO0Oo.ifPresent(new Consumer() { // from class: com.google.android.gms.ads.internal.client.zzeq
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                preloadCallback.onAdsAvailable((PreloadConfiguration) obj);
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.client.zzcf
    public final void zzf(zzft zzftVar) {
        Optional optionalOooO0Oo = zzex.OooO0Oo(zzftVar);
        final PreloadCallback preloadCallback = this.f16069OooOo0O;
        optionalOooO0Oo.ifPresent(new Consumer() { // from class: com.google.android.gms.ads.internal.client.zzer
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                preloadCallback.onAdsExhausted((PreloadConfiguration) obj);
            }
        });
    }
}
