package com.google.android.gms.ads.p008h5;

import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.internal.ads.AbstractC1448c7;
import com.google.android.gms.internal.ads.BinderC2082te;
import com.google.android.gms.internal.ads.InterfaceC1674ic;
import com.google.android.gms.internal.ads.de0;

/* loaded from: classes2.dex */
public final class H5AdsRequestHandler {

    /* renamed from: OooO00o */
    public final de0 f15946OooO00o;

    public H5AdsRequestHandler(@NonNull Context context, @NonNull OnH5AdsEventListener onH5AdsEventListener) {
        this.f15946OooO00o = new de0(context, onH5AdsEventListener);
    }

    public void clearAdObjects() {
        de0 de0Var = this.f15946OooO00o;
        de0Var.getClass();
        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0OOoo0)).booleanValue()) {
            if (((InterfaceC1674ic) de0Var.f18243OooOoO0) == null) {
                de0Var.f18243OooOoO0 = zzbc.zza().zzn((Context) de0Var.f18242OooOo0o, new BinderC2082te(), (OnH5AdsEventListener) de0Var.f18240OooOo);
            }
            InterfaceC1674ic interfaceC1674ic = (InterfaceC1674ic) de0Var.f18243OooOoO0;
            if (interfaceC1674ic != null) {
                try {
                    interfaceC1674ic.zze();
                } catch (RemoteException e) {
                    zzo.zzl("#007 Could not call remote method.", e);
                }
            }
        }
    }

    public boolean handleH5AdsRequest(@NonNull String str) {
        de0 de0Var = this.f15946OooO00o;
        de0Var.getClass();
        if (!de0.OooOOOO(str)) {
            return false;
        }
        if (((InterfaceC1674ic) de0Var.f18243OooOoO0) == null) {
            de0Var.f18243OooOoO0 = zzbc.zza().zzn((Context) de0Var.f18242OooOo0o, new BinderC2082te(), (OnH5AdsEventListener) de0Var.f18240OooOo);
        }
        InterfaceC1674ic interfaceC1674ic = (InterfaceC1674ic) de0Var.f18243OooOoO0;
        if (interfaceC1674ic == null) {
            return false;
        }
        try {
            interfaceC1674ic.zzf(str);
            return true;
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
            return true;
        }
    }

    public boolean shouldInterceptRequest(@NonNull String str) {
        return de0.OooOOOO(str);
    }
}
