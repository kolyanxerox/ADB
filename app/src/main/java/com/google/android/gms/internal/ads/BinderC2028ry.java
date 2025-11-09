package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzea;
import com.google.android.gms.ads.internal.client.zzeb;
import com.google.android.gms.ads.internal.client.zzee;

/* renamed from: com.google.android.gms.internal.ads.ry */
/* loaded from: classes2.dex */
public final class BinderC2028ry extends zzea {

    /* renamed from: OooOo, reason: collision with root package name */
    public final InterfaceC1640hf f23949OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final Object f23950OooOo0O = new Object();

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final zzeb f23951OooOo0o;

    public BinderC2028ry(zzeb zzebVar, InterfaceC1640hf interfaceC1640hf) {
        this.f23951OooOo0o = zzebVar;
        this.f23949OooOo = interfaceC1640hf;
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final float zze() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final float zzf() {
        InterfaceC1640hf interfaceC1640hf = this.f23949OooOo;
        if (interfaceC1640hf != null) {
            return interfaceC1640hf.zzg();
        }
        return 0.0f;
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final float zzg() {
        InterfaceC1640hf interfaceC1640hf = this.f23949OooOo;
        if (interfaceC1640hf != null) {
            return interfaceC1640hf.zzh();
        }
        return 0.0f;
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final int zzh() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final zzee zzi() {
        synchronized (this.f23950OooOo0O) {
            try {
                zzeb zzebVar = this.f23951OooOo0o;
                if (zzebVar == null) {
                    return null;
                }
                return zzebVar.zzi();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final void zzj(boolean z) throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final void zzk() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final void zzl() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final void zzm(zzee zzeeVar) {
        synchronized (this.f23950OooOo0O) {
            try {
                zzeb zzebVar = this.f23951OooOo0o;
                if (zzebVar != null) {
                    zzebVar.zzm(zzeeVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final void zzn() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final boolean zzo() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final boolean zzp() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final boolean zzq() throws RemoteException {
        throw new RemoteException();
    }
}
