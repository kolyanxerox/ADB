package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.internal.client.zzeb;
import com.google.android.gms.ads.internal.client.zzee;
import com.google.android.gms.ads.internal.util.client.zzo;

/* loaded from: classes2.dex */
public final class d10 extends VideoController.VideoLifecycleCallbacks {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final C2065sy f18129OooO00o;

    public d10(C2065sy c2065sy) {
        this.f18129OooO00o = c2065sy;
    }

    @Override // com.google.android.gms.ads.VideoController.VideoLifecycleCallbacks
    public final void onVideoEnd() {
        zzee zzeeVarZzi;
        zzeb zzebVarOooO = this.f18129OooO00o.OooO();
        if (zzebVarOooO == null) {
            zzeeVarZzi = null;
        } else {
            try {
                zzeeVarZzi = zzebVarOooO.zzi();
            } catch (RemoteException unused) {
            }
        }
        if (zzeeVarZzi == null) {
            return;
        }
        try {
            zzeeVarZzi.zze();
        } catch (RemoteException e) {
            zzo.zzk("Unable to call onVideoEnd()", e);
        }
    }

    @Override // com.google.android.gms.ads.VideoController.VideoLifecycleCallbacks
    public final void onVideoPause() {
        zzee zzeeVarZzi;
        zzeb zzebVarOooO = this.f18129OooO00o.OooO();
        if (zzebVarOooO == null) {
            zzeeVarZzi = null;
        } else {
            try {
                zzeeVarZzi = zzebVarOooO.zzi();
            } catch (RemoteException unused) {
            }
        }
        if (zzeeVarZzi == null) {
            return;
        }
        try {
            zzeeVarZzi.zzg();
        } catch (RemoteException e) {
            zzo.zzk("Unable to call onVideoEnd()", e);
        }
    }

    @Override // com.google.android.gms.ads.VideoController.VideoLifecycleCallbacks
    public final void onVideoStart() {
        zzee zzeeVarZzi;
        zzeb zzebVarOooO = this.f18129OooO00o.OooO();
        if (zzebVarOooO == null) {
            zzeeVarZzi = null;
        } else {
            try {
                zzeeVarZzi = zzebVarOooO.zzi();
            } catch (RemoteException unused) {
            }
        }
        if (zzeeVarZzi == null) {
            return;
        }
        try {
            zzeeVarZzi.zzi();
        } catch (RemoteException e) {
            zzo.zzk("Unable to call onVideoEnd()", e);
        }
    }
}
