package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;

/* loaded from: classes2.dex */
final class zzff implements Runnable {

    /* renamed from: OooOo0O */
    public final /* synthetic */ zzfg f16089OooOo0O;

    public zzff(zzfg zzfgVar) {
        this.f16089OooOo0O = zzfgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbl zzblVar = this.f16089OooOo0O.f16090OooOo0O.f16091OooOo0O;
        if (zzblVar != null) {
            try {
                zzblVar.zze(1);
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzk("Could not notify onAdFailedToLoad event.", e);
            }
        }
    }
}
