package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.zzv;

/* loaded from: classes2.dex */
public final class q40 extends o40 {

    /* renamed from: OooOoo, reason: collision with root package name */
    public int f23507OooOoo;

    /* renamed from: OooOoo0, reason: collision with root package name */
    public String f23508OooOoo0;

    @Override // com.google.android.gms.internal.ads.o40, Oooo00O.OooO0o
    public final void OooO(OooOooo.o000Oo0 o000oo02) {
        zzo.zze("Cannot connect to remote service, fallback to local instance.");
        this.f22329OooOo0O.zzd(new v40(1));
    }

    @Override // Oooo00O.OooO0OO
    public final void OooOO0(Bundle bundle) {
        synchronized (this.f22330OooOo0o) {
            try {
                if (!this.f22332OooOoO0) {
                    this.f22332OooOoO0 = true;
                    try {
                        try {
                            int i = this.f23507OooOoo;
                            if (i == 2) {
                                ((InterfaceC1902oi) this.f22333OooOoOO.getService()).o00000o0(this.f22331OooOoO, ((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0o0OO0o)).booleanValue() ? new n40(this.f22329OooOo0O, this.f22331OooOoO) : new m40(this));
                            } else if (i == 3) {
                                ((InterfaceC1902oi) this.f22333OooOoOO.getService()).OoooOo0(this.f23508OooOoo0, ((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0o0OO0o)).booleanValue() ? new n40(this.f22329OooOo0O, this.f22331OooOoO) : new m40(this));
                            } else {
                                this.f22329OooOo0O.zzd(new v40(1));
                            }
                        } catch (RemoteException | IllegalArgumentException unused) {
                            this.f22329OooOo0O.zzd(new v40(1));
                        }
                    } catch (Throwable th) {
                        zzv.zzp().OooO0oo("RemoteUrlAndCacheKeyClientTask.onConnected", th);
                        this.f22329OooOo0O.zzd(new v40(1));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
