package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdSize;

/* loaded from: classes2.dex */
public class MediationBannerAdConfiguration extends MediationAdConfiguration {

    /* renamed from: OooOO0, reason: collision with root package name */
    public final AdSize f16399OooOO0;

    public MediationBannerAdConfiguration(@NonNull Context context, @NonNull String str, @NonNull Bundle bundle, @NonNull Bundle bundle2, boolean z, @Nullable Location location, int i, int i2, @NonNull String str2, @NonNull AdSize adSize, @NonNull String str3) {
        super(context, str, bundle, bundle2, z, location, i, i2, str2, str3);
        this.f16399OooOO0 = adSize;
    }

    @NonNull
    public AdSize getAdSize() {
        return this.f16399OooOO0;
    }
}
