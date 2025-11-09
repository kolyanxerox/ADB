package com.google.android.gms.internal.ads;

import android.os.Parcel;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.internal.client.zze;

/* renamed from: com.google.android.gms.internal.ads.w3 */
/* loaded from: classes2.dex */
public final class BinderC2182w3 extends AbstractBinderC2181w2 implements InterfaceC1482d4 {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public FullScreenContentCallback f25176OooOo0O;

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2181w2
    public final boolean o000OO0O(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            zzf();
        } else if (i == 2) {
            zzc();
        } else if (i == 3) {
            zze zzeVar = (zze) AbstractC2218x2.OooO00o(parcel, zze.CREATOR);
            AbstractC2218x2.OooO0O0(parcel);
            zzd(zzeVar);
        } else if (i == 4) {
            zze();
        } else {
            if (i != 5) {
                return false;
            }
            zzb();
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1482d4
    public final void zzb() {
        FullScreenContentCallback fullScreenContentCallback = this.f25176OooOo0O;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdClicked();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1482d4
    public final void zzc() {
        FullScreenContentCallback fullScreenContentCallback = this.f25176OooOo0O;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdDismissedFullScreenContent();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1482d4
    public final void zzd(zze zzeVar) {
        FullScreenContentCallback fullScreenContentCallback = this.f25176OooOo0O;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdFailedToShowFullScreenContent(zzeVar.zza());
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1482d4
    public final void zze() {
        FullScreenContentCallback fullScreenContentCallback = this.f25176OooOo0O;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdImpression();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1482d4
    public final void zzf() {
        FullScreenContentCallback fullScreenContentCallback = this.f25176OooOo0O;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdShowedFullScreenContent();
        }
    }
}
