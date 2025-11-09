package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.internal.ads.InterfaceC1722jo;

@VisibleForTesting
/* loaded from: classes2.dex */
public final class zzi {
    public final int zza;
    public final ViewGroup.LayoutParams zzb;
    public final ViewGroup zzc;
    public final Context zzd;

    public zzi(InterfaceC1722jo interfaceC1722jo) throws zzg {
        this.zzb = interfaceC1722jo.getLayoutParams();
        ViewParent parent = interfaceC1722jo.getParent();
        this.zzd = interfaceC1722jo.zzE();
        if (parent == null || !(parent instanceof ViewGroup)) {
            throw new zzg("Could not get the parent of the WebView for an overlay.");
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        this.zzc = viewGroup;
        this.zza = viewGroup.indexOfChild(interfaceC1722jo.OooO0oO());
        viewGroup.removeView(interfaceC1722jo.OooO0oO());
        interfaceC1722jo.o00O0O(true);
    }
}
