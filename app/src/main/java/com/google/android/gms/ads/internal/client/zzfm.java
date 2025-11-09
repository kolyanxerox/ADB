package com.google.android.gms.ads.internal.client;

import Oooo0o.OooO0O0;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.InterfaceC2156ve;
import com.google.android.gms.internal.ads.InterfaceC2265yc;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzfm extends zzcy {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public InterfaceC2265yc f16094OooOo0O;

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final float zze() throws RemoteException {
        return 1.0f;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final String zzf() {
        return "";
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final List zzg() throws RemoteException {
        return Collections.EMPTY_LIST;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzh(@Nullable String str) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzi() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzj(boolean z) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzk() throws RemoteException {
        com.google.android.gms.ads.internal.util.client.zzo.zzg("The initialization is not processed because MobileAdsSettingsManager is not created successfully.");
        com.google.android.gms.ads.internal.util.client.zzf.zza.post(new Runnable() { // from class: com.google.android.gms.ads.internal.client.zzfl
            @Override // java.lang.Runnable
            public final void run() {
                InterfaceC2265yc interfaceC2265yc = this.zza.f16094OooOo0O;
                if (interfaceC2265yc != null) {
                    try {
                        interfaceC2265yc.zzb(Collections.EMPTY_LIST);
                    } catch (RemoteException e) {
                        com.google.android.gms.ads.internal.util.client.zzo.zzk("Could not notify onComplete event.", e);
                    }
                }
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzm(zzdl zzdlVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzo(InterfaceC2156ve interfaceC2156ve) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzp(boolean z) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzq(float f) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzr(String str) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzs(InterfaceC2265yc interfaceC2265yc) throws RemoteException {
        this.f16094OooOo0O = interfaceC2265yc;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzt(String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzu(zzfv zzfvVar) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final boolean zzv() throws RemoteException {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzl(@Nullable String str, OooO0O0 oooO0O0) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzn(OooO0O0 oooO0O0, String str) throws RemoteException {
    }
}
