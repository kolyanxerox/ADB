package com.google.android.gms.ads.mediation.rtb;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import java.util.List;

/* loaded from: classes2.dex */
public class RtbSignalData {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final Context f16448OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final List f16449OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final Bundle f16450OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final AdSize f16451OooO0Oo;

    public RtbSignalData(@NonNull Context context, @NonNull List<MediationConfiguration> list, @NonNull Bundle bundle, @Nullable AdSize adSize) {
        this.f16448OooO00o = context;
        this.f16449OooO0O0 = list;
        this.f16450OooO0OO = bundle;
        this.f16451OooO0Oo = adSize;
    }

    @Nullable
    public AdSize getAdSize() {
        return this.f16451OooO0Oo;
    }

    @Nullable
    @Deprecated
    public MediationConfiguration getConfiguration() {
        List list = this.f16449OooO0O0;
        if (list == null || list.size() <= 0) {
            return null;
        }
        return (MediationConfiguration) list.get(0);
    }

    @NonNull
    public List<MediationConfiguration> getConfigurations() {
        return this.f16449OooO0O0;
    }

    @NonNull
    public Context getContext() {
        return this.f16448OooO00o;
    }

    @NonNull
    public Bundle getNetworkExtras() {
        return this.f16450OooO0OO;
    }
}
