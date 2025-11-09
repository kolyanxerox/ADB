package com.google.android.gms.ads;

import Oooo00O.o000000O;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AbstractAdRequestBuilder;
import com.google.android.gms.ads.internal.client.zzeh;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.mediation.MediationExtrasReceiver;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class AbstractAdRequestBuilder<T extends AbstractAdRequestBuilder<T>> {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final zzeh f15874OooO00o;

    public AbstractAdRequestBuilder() {
        zzeh zzehVar = new zzeh();
        this.f15874OooO00o = zzehVar;
        zzehVar.zzt("B3EEABB8EE11C2BE770B684D95219ECB");
    }

    @NonNull
    @Deprecated
    public T addCustomEventExtrasBundle(@NonNull Class<? extends CustomEvent> cls, @NonNull Bundle bundle) {
        this.f15874OooO00o.zzo(cls, bundle);
        return (T) self();
    }

    @NonNull
    public T addCustomTargeting(@NonNull String str, @NonNull String str2) {
        if (!TextUtils.isEmpty(str2) && str2.contains(",")) {
            zzo.zzj("Value " + str2 + " contains invalid character ',' (comma). The server will parse it as a list of comma-separated values.");
        }
        this.f15874OooO00o.zzp(str, str2);
        return (T) self();
    }

    @NonNull
    public T addKeyword(@NonNull String str) {
        this.f15874OooO00o.zzq(str);
        return (T) self();
    }

    @NonNull
    public T addNetworkExtrasBundle(@NonNull Class<? extends MediationExtrasReceiver> cls, @NonNull Bundle bundle) {
        zzeh zzehVar = this.f15874OooO00o;
        zzehVar.zzr(cls, bundle);
        if (cls.equals(AdMobAdapter.class) && bundle.getBoolean("_emulatorLiveAds")) {
            zzehVar.zzu("B3EEABB8EE11C2BE770B684D95219ECB");
        }
        return (T) self();
    }

    public abstract AbstractAdRequestBuilder self();

    @NonNull
    public T setAdString(@NonNull String str) {
        this.f15874OooO00o.zzv(str);
        return (T) self();
    }

    @NonNull
    public T setContentUrl(@NonNull String str) {
        o000000O.OooO(str, "Content URL must be non-null.");
        o000000O.OooO0o(str, "Content URL must be non-empty.");
        int length = str.length();
        Object[] objArr = {512, Integer.valueOf(str.length())};
        if (length > 512) {
            throw new IllegalArgumentException(String.format("Content URL must not exceed %d in length.  Provided length was %d.", objArr));
        }
        this.f15874OooO00o.zzw(str);
        return (T) self();
    }

    @NonNull
    public T setHttpTimeoutMillis(int i) {
        this.f15874OooO00o.zzx(i);
        return (T) self();
    }

    @NonNull
    public T setNeighboringContentUrls(@NonNull List<String> list) {
        if (list == null) {
            zzo.zzj("neighboring content URLs list should not be null");
            return (T) self();
        }
        this.f15874OooO00o.zzz(list);
        return (T) self();
    }

    @NonNull
    public T setRequestAgent(@NonNull String str) {
        this.f15874OooO00o.zzC(str);
        return (T) self();
    }

    @NonNull
    @Deprecated
    public final AbstractAdRequestBuilder zza(@NonNull String str) {
        this.f15874OooO00o.zzt(str);
        return self();
    }

    @NonNull
    @Deprecated
    public final AbstractAdRequestBuilder zzb(boolean z) {
        this.f15874OooO00o.zzy(z);
        return self();
    }

    @NonNull
    public final AbstractAdRequestBuilder zzc(@NonNull Bundle bundle) {
        this.f15874OooO00o.zzA(bundle);
        return self();
    }

    @NonNull
    @Deprecated
    public final AbstractAdRequestBuilder zzd(boolean z) {
        this.f15874OooO00o.zzD(z);
        return self();
    }

    @NonNull
    public T addCustomTargeting(@NonNull String str, @NonNull List<String> list) {
        if (list != null) {
            for (String str2 : list) {
                if (!TextUtils.isEmpty(str2) && str2.contains(",")) {
                    zzo.zzj("Value " + str2 + " contains invalid character ',' (comma). The server will parse it as a list of comma-separated values.");
                }
            }
            this.f15874OooO00o.zzp(str, TextUtils.join(",", list));
        }
        return (T) self();
    }
}
