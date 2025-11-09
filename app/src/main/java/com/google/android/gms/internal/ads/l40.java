package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.zzv;

/* loaded from: classes2.dex */
public final class l40 extends o40 {

    /* renamed from: OooOoo, reason: collision with root package name */
    public final Context f20793OooOoo;

    /* renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ int f20794OooOoo0;

    /* renamed from: OooOooO, reason: collision with root package name */
    public final cq0 f20795OooOooO;

    public l40(Context context, cq0 cq0Var, int i) {
        this.f20794OooOoo0 = i;
        switch (i) {
            case 1:
                this.f20793OooOoo = context;
                this.f20795OooOooO = cq0Var;
                this.f22333OooOoOO = new C1666i4(context, zzv.zzu().zzb(), (o40) this, (o40) this);
                break;
            default:
                this.f20793OooOoo = context;
                this.f20795OooOooO = cq0Var;
                this.f22333OooOoOO = new C1666i4(context, zzv.zzu().zzb(), (o40) this, (o40) this);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.o40, Oooo00O.OooO0o
    public void OooO(OooOooo.o000Oo0 o000oo02) {
        switch (this.f20794OooOoo0) {
            case 0:
                zzo.zze("Cannot connect to remote service, fallback to local instance.");
                this.f22329OooOo0O.zzd(new v40(1));
                break;
            default:
                super.OooO(o000oo02);
                break;
        }
    }

    public o00000oO.OooOOO OooO0OO(C2197wi c2197wi) {
        synchronized (this.f22330OooOo0o) {
            try {
                if (this.f22328OooOo) {
                    return this.f22329OooOo0O;
                }
                this.f22328OooOo = true;
                this.f22331OooOoO = c2197wi;
                this.f22333OooOoOO.checkAvailabilityAndConnect();
                this.f22329OooOo0O.addListener(new b30(this, 2), AbstractC2200wl.f25327OooO0oO);
                o40.OooO0O0(this.f20793OooOoo, this.f22329OooOo0O, this.f20795OooOooO);
                return this.f22329OooOo0O;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // Oooo00O.OooO0OO
    public final void OooOO0(Bundle bundle) {
        switch (this.f20794OooOoo0) {
            case 0:
                synchronized (this.f22330OooOo0o) {
                    try {
                        if (!this.f22332OooOoO0) {
                            this.f22332OooOoO0 = true;
                            try {
                                try {
                                    ((InterfaceC1902oi) this.f22333OooOoOO.getService()).o0000O(this.f22331OooOoO, ((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0o0OO0o)).booleanValue() ? new n40(this.f22329OooOo0O, this.f22331OooOoO) : new m40(this));
                                } catch (Throwable th) {
                                    zzv.zzp().OooO0oo("RemoteAdRequestClientTask.onConnected", th);
                                    this.f22329OooOo0O.zzd(new v40(1));
                                }
                            } catch (RemoteException | IllegalArgumentException unused) {
                                this.f22329OooOo0O.zzd(new v40(1));
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
            default:
                synchronized (this.f22330OooOo0o) {
                    try {
                        if (!this.f22332OooOoO0) {
                            this.f22332OooOoO0 = true;
                            try {
                                ((InterfaceC1902oi) this.f22333OooOoOO.getService()).o0000OOo(this.f22331OooOoO, ((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0o0OO0o)).booleanValue() ? new n40(this.f22329OooOo0O, this.f22331OooOoO) : new m40(this));
                            } catch (RemoteException | IllegalArgumentException unused2) {
                                this.f22329OooOo0O.zzd(new v40(1));
                            } catch (Throwable th3) {
                                zzv.zzp().OooO0oo("RemoteSignalsClientTask.onConnected", th3);
                                this.f22329OooOo0O.zzd(new v40(1));
                            }
                        }
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
                return;
        }
    }
}
