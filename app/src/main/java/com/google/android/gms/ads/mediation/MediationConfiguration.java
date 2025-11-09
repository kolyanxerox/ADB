package com.google.android.gms.ads.mediation;

import android.os.Bundle;
import androidx.annotation.NonNull;
import com.google.android.gms.ads.AdFormat;

/* loaded from: classes2.dex */
public class MediationConfiguration {

    @NonNull
    public static final String CUSTOM_EVENT_SERVER_PARAMETER_FIELD = "parameter";

    /* renamed from: OooO00o, reason: collision with root package name */
    public final AdFormat f16400OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final Bundle f16401OooO0O0;

    public MediationConfiguration(@NonNull AdFormat adFormat, @NonNull Bundle bundle) {
        this.f16400OooO00o = adFormat;
        this.f16401OooO0O0 = bundle;
    }

    @NonNull
    public AdFormat getFormat() {
        return this.f16400OooO00o;
    }

    @NonNull
    public Bundle getServerParameters() {
        return this.f16401OooO0O0;
    }
}
