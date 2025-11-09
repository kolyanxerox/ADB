package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.ads.MuteThisAdReason;

/* loaded from: classes2.dex */
public final class zzdi implements MuteThisAdReason {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final String f16023OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final zzdh f16024OooO0O0;

    public zzdi(zzdh zzdhVar) {
        String strZze;
        this.f16024OooO0O0 = zzdhVar;
        try {
            strZze = zzdhVar.zze();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e);
            strZze = null;
        }
        this.f16023OooO00o = strZze;
    }

    @Override // com.google.android.gms.ads.MuteThisAdReason
    public final String getDescription() {
        return this.f16023OooO00o;
    }

    public final String toString() {
        return this.f16023OooO00o;
    }

    public final zzdh zza() {
        return this.f16024OooO0O0;
    }
}
