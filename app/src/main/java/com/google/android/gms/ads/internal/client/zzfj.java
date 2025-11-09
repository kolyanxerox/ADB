package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;

/* loaded from: classes2.dex */
final class zzfj implements Runnable {

    /* renamed from: OooOo0O */
    public final /* synthetic */ zzfk f16092OooOo0O;

    public zzfj(zzfk zzfkVar) {
        this.f16092OooOo0O = zzfkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbl zzblVar = this.f16092OooOo0O.f16093OooOo0O;
        if (zzblVar != null) {
            try {
                zzblVar.zze(1);
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzk("Could not notify onAdFailedToLoad event.", e);
            }
        }
    }
}
