package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.InterfaceC2309zj;

/* loaded from: classes2.dex */
public final /* synthetic */ class zzfp implements Runnable {
    public final /* synthetic */ InterfaceC2309zj zza;

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC2309zj interfaceC2309zj = this.zza;
        if (interfaceC2309zj != null) {
            try {
                interfaceC2309zj.zze(1);
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
            }
        }
    }
}
