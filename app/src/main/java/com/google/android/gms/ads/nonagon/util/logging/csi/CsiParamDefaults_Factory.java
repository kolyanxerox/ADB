package com.google.android.gms.ads.nonagon.util.logging.csi;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.ads.q31;
import com.google.android.gms.internal.ads.z31;

/* loaded from: classes2.dex */
public final class CsiParamDefaults_Factory implements q31 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final z31 f16647OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final z31 f16648OooO0O0;

    public CsiParamDefaults_Factory(z31 z31Var, z31 z31Var2) {
        this.f16647OooO00o = z31Var;
        this.f16648OooO0O0 = z31Var2;
    }

    public static CsiParamDefaults_Factory create(z31 z31Var, z31 z31Var2) {
        return new CsiParamDefaults_Factory(z31Var, z31Var2);
    }

    @NonNull
    public static CsiParamDefaults newInstance(@NonNull Context context, @NonNull VersionInfoParcel versionInfoParcel) {
        return new CsiParamDefaults(context, versionInfoParcel);
    }

    @Override // com.google.android.gms.internal.ads.z31
    @NonNull
    /* renamed from: get, reason: merged with bridge method [inline-methods] */
    public CsiParamDefaults zzb() {
        return newInstance((Context) this.f16647OooO00o.zzb(), (VersionInfoParcel) this.f16648OooO0O0.zzb());
    }
}
