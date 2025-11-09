package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;

/* loaded from: classes2.dex */
public final class zzfr extends zzdn {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final OnAdMetadataChangedListener f16095OooOo0O;

    public zzfr(@Nullable OnAdMetadataChangedListener onAdMetadataChangedListener) {
        this.f16095OooOo0O = onAdMetadataChangedListener;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdo
    public final void zze() throws RemoteException {
        OnAdMetadataChangedListener onAdMetadataChangedListener = this.f16095OooOo0O;
        if (onAdMetadataChangedListener != null) {
            onAdMetadataChangedListener.onAdMetadataChanged();
        }
    }
}
