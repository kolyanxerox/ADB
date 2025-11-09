package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.admanager.AdManagerAdView;
import com.google.android.gms.ads.formats.OnAdManagerAdViewLoadedListener;
import com.google.android.gms.ads.internal.client.zzbx;
import com.google.android.gms.ads.internal.client.zzby;
import com.google.android.gms.ads.internal.client.zzg;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzo;

/* renamed from: com.google.android.gms.internal.ads.hb */
/* loaded from: classes2.dex */
public final class BinderC1636hb extends AbstractBinderC2181w2 implements InterfaceC1930pa {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final OnAdManagerAdViewLoadedListener f19677OooOo0O;

    public BinderC1636hb(OnAdManagerAdViewLoadedListener onAdManagerAdViewLoadedListener) {
        super("com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
        this.f19677OooOo0O = onAdManagerAdViewLoadedListener;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1930pa
    public final void o0000o0o(zzby zzbyVar, Oooo0o.OooO0O0 oooO0O0) {
        if (zzbyVar == null || oooO0O0 == null) {
            return;
        }
        AdManagerAdView adManagerAdView = new AdManagerAdView((Context) Oooo0o.OooO0OO.o000O0oO(oooO0O0));
        try {
            if (zzbyVar.zzi() instanceof zzg) {
                zzg zzgVar = (zzg) zzbyVar.zzi();
                adManagerAdView.setAdListener(zzgVar != null ? zzgVar.zzb() : null);
            }
        } catch (RemoteException e) {
            zzo.zzh("", e);
        }
        try {
            if (zzbyVar.zzj() instanceof BinderC1628h3) {
                BinderC1628h3 binderC1628h3 = (BinderC1628h3) zzbyVar.zzj();
                adManagerAdView.setAppEventListener(binderC1628h3 != null ? binderC1628h3.f19528OooOo0O : null);
            }
        } catch (RemoteException e2) {
            zzo.zzh("", e2);
        }
        zzf.zza.post(new o000oOoO(this, adManagerAdView, zzbyVar, false, 3));
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2181w2
    public final boolean o000OO0O(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        zzby zzbyVarZzad = zzbx.zzad(parcel.readStrongBinder());
        Oooo0o.OooO0O0 oooO0O0O000O0o0 = Oooo0o.OooO0OO.o000O0o0(parcel.readStrongBinder());
        AbstractC2218x2.OooO0O0(parcel);
        o0000o0o(zzbyVarZzad, oooO0O0O000O0o0);
        parcel2.writeNoException();
        return true;
    }
}
