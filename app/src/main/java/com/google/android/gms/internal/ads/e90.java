package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzbi;
import com.google.android.gms.ads.internal.util.client.zzo;

/* loaded from: classes2.dex */
public final class e90 implements zza, InterfaceC1401ax {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public zzbi f18524OooOo0O;

    @Override // com.google.android.gms.internal.ads.InterfaceC1401ax
    public final synchronized void Oooo000() {
        zzbi zzbiVar = this.f18524OooOo0O;
        if (zzbiVar != null) {
            try {
                zzbiVar.zzb();
            } catch (RemoteException e) {
                zzo.zzk("Remote Exception at onPhysicalClick.", e);
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final synchronized void onAdClicked() {
        zzbi zzbiVar = this.f18524OooOo0O;
        if (zzbiVar != null) {
            try {
                zzbiVar.zzb();
            } catch (RemoteException e) {
                zzo.zzk("Remote Exception at onAdClicked.", e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1401ax
    public final synchronized void zzu() {
    }
}
