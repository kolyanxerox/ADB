package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd;

/* renamed from: com.google.android.gms.internal.ads.vg */
/* loaded from: classes2.dex */
public final class C2158vg implements NativeCustomFormatAd.DisplayOpenMeasurement {

    /* renamed from: OooO00o */
    public final InterfaceC1415ba f24971OooO00o;

    public C2158vg(InterfaceC1415ba interfaceC1415ba) {
        this.f24971OooO00o = interfaceC1415ba;
        try {
            interfaceC1415ba.zzm();
        } catch (RemoteException e) {
            zzo.zzh("", e);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd.DisplayOpenMeasurement
    public final void setView(View view) {
        try {
            this.f24971OooO00o.o00000O0(new Oooo0o.OooO0OO(view));
        } catch (RemoteException e) {
            zzo.zzh("", e);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd.DisplayOpenMeasurement
    public final boolean start() {
        try {
            return this.f24971OooO00o.zzt();
        } catch (RemoteException e) {
            zzo.zzh("", e);
            return false;
        }
    }
}
