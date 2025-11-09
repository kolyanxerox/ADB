package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.client.zzbe;

/* loaded from: classes2.dex */
public final class nb0 implements jb0 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final int f21462OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final int f21463OooO0O0;

    public nb0(int i, int i2) {
        this.f21462OooO00o = i;
        this.f21463OooO0O0 = i2;
    }

    @Override // com.google.android.gms.internal.ads.jb0
    public final /* synthetic */ void zza(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.jb0
    public final void zzb(Object obj) {
        int i;
        Bundle bundle = ((C1581fu) obj).f19125OooO00o;
        int i2 = this.f21462OooO00o;
        if (i2 == -1 || (i = this.f21463OooO0O0) == -1) {
            return;
        }
        bundle.putInt("sessions_without_flags", i2);
        bundle.putInt("crashes_without_flags", i);
        zzbc zzbcVar = zzbc.f16009OooO0o;
        if (zzbe.zzc().f16929OooOO0) {
            bundle.putBoolean("did_reset", true);
        }
    }
}
