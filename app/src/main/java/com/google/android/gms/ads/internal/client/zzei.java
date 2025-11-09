package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.ads.search.SearchAdRequest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public final class zzei {

    /* renamed from: OooO */
    public final int f16038OooO;

    /* renamed from: OooO00o */
    public final String f16039OooO00o;

    /* renamed from: OooO0O0 */
    public final ArrayList f16040OooO0O0;

    /* renamed from: OooO0OO */
    public final Set f16041OooO0OO;

    /* renamed from: OooO0Oo */
    public final Bundle f16042OooO0Oo;

    /* renamed from: OooO0o */
    public final String f16043OooO0o;

    /* renamed from: OooO0o0 */
    public final Map f16044OooO0o0;

    /* renamed from: OooO0oO */
    public final String f16045OooO0oO;

    /* renamed from: OooO0oo */
    public final SearchAdRequest f16046OooO0oo;

    /* renamed from: OooOO0 */
    public final Set f16047OooOO0;

    /* renamed from: OooOO0O */
    public final Bundle f16048OooOO0O;
    public final Set OooOO0o;

    /* renamed from: OooOOO */
    public final String f16049OooOOO;

    /* renamed from: OooOOO0 */
    public final boolean f16050OooOOO0;

    /* renamed from: OooOOOO */
    public final int f16051OooOOOO;

    /* renamed from: OooOOOo */
    public long f16052OooOOOo = 0;

    public zzei(zzeh zzehVar, @Nullable SearchAdRequest searchAdRequest) {
        this.f16039OooO00o = zzehVar.f16032OooO0oO;
        this.f16040OooO0O0 = zzehVar.f16033OooO0oo;
        this.f16041OooO0OO = Collections.unmodifiableSet(zzehVar.f16026OooO00o);
        this.f16042OooO0Oo = zzehVar.f16027OooO0O0;
        this.f16044OooO0o0 = Collections.unmodifiableMap(zzehVar.f16028OooO0OO);
        this.f16043OooO0o = zzehVar.f16025OooO;
        this.f16045OooO0oO = zzehVar.f16034OooOO0;
        this.f16046OooO0oo = searchAdRequest;
        this.f16038OooO = zzehVar.f16035OooOO0O;
        this.f16047OooOO0 = Collections.unmodifiableSet(zzehVar.f16029OooO0Oo);
        this.f16048OooOO0O = zzehVar.f16031OooO0o0;
        this.OooOO0o = Collections.unmodifiableSet(zzehVar.f16030OooO0o);
        this.f16050OooOOO0 = zzehVar.OooOO0o;
        this.f16049OooOOO = zzehVar.f16037OooOOO0;
        this.f16051OooOOOO = zzehVar.f16036OooOOO;
    }

    public final int zza() {
        return this.f16051OooOOOO;
    }

    public final int zzb() {
        return this.f16038OooO;
    }

    public final long zzc() {
        return this.f16052OooOOOo;
    }

    @Nullable
    public final Bundle zzd(Class cls) {
        Bundle bundle = this.f16042OooO0Oo.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter");
        if (bundle != null) {
            return bundle.getBundle(cls.getName());
        }
        return null;
    }

    public final Bundle zze() {
        return this.f16048OooOO0O;
    }

    @Nullable
    public final Bundle zzf(Class cls) {
        return this.f16042OooO0Oo.getBundle(cls.getName());
    }

    public final Bundle zzg() {
        return this.f16042OooO0Oo;
    }

    @Nullable
    @Deprecated
    public final NetworkExtras zzh(Class cls) {
        return (NetworkExtras) this.f16044OooO0o0.get(cls);
    }

    @Nullable
    public final SearchAdRequest zzi() {
        return this.f16046OooO0oo;
    }

    @Nullable
    public final String zzj() {
        return this.f16049OooOOO;
    }

    public final String zzk() {
        return this.f16039OooO00o;
    }

    public final String zzl() {
        return this.f16043OooO0o;
    }

    public final String zzm() {
        return this.f16045OooO0oO;
    }

    public final List zzn() {
        return new ArrayList(this.f16040OooO0O0);
    }

    public final Set zzo() {
        return this.OooOO0o;
    }

    public final Set zzp() {
        return this.f16041OooO0OO;
    }

    public final void zzq(long j) {
        this.f16052OooOOOo = j;
    }

    @Deprecated
    public final boolean zzr() {
        return this.f16050OooOOO0;
    }

    public final boolean zzs(Context context) {
        RequestConfiguration requestConfigurationZzc = zzex.zzf().zzc();
        zzbc.zzb();
        String strZzy = com.google.android.gms.ads.internal.util.client.zzf.zzy(context);
        return this.f16047OooOO0.contains(strZzy) || requestConfigurationZzc.getTestDeviceIds().contains(strZzy);
    }
}
