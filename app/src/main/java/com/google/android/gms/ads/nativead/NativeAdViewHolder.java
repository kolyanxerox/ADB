package com.google.android.gms.ads.nativead;

import Oooo00O.o000000O;
import Oooo0o.OooO0O0;
import Oooo0o.OooO0OO;
import android.os.RemoteException;
import android.view.View;
import androidx.annotation.NonNull;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.internal.ads.InterfaceC2114u9;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public final class NativeAdViewHolder {

    @NonNull
    public static final WeakHashMap zza = new WeakHashMap();

    /* renamed from: OooO00o */
    public final InterfaceC2114u9 f16472OooO00o;

    /* renamed from: OooO0O0 */
    public final WeakReference f16473OooO0O0;

    public NativeAdViewHolder(@NonNull View view, @NonNull Map<String, View> map, @NonNull Map<String, View> map2) {
        o000000O.OooO(view, "ContainerView must not be null");
        if (view instanceof NativeAdView) {
            zzo.zzg("The provided containerView is of type of NativeAdView, which cannot be usedwith NativeAdViewHolder.");
            return;
        }
        WeakHashMap weakHashMap = zza;
        if (weakHashMap.get(view) != null) {
            zzo.zzg("The provided containerView is already in use with another NativeAdViewHolder.");
            return;
        }
        weakHashMap.put(view, this);
        this.f16473OooO0O0 = new WeakReference(view);
        this.f16472OooO00o = zzbc.zza().zzk(view, map == null ? new HashMap() : new HashMap(map), map2 == null ? new HashMap() : new HashMap(map2));
    }

    public final void setClickConfirmingView(@NonNull View view) {
        try {
            this.f16472OooO00o.zzb(new OooO0OO(view));
        } catch (RemoteException e) {
            zzo.zzh("Unable to call setClickConfirmingView on delegate", e);
        }
    }

    public void setNativeAd(@NonNull NativeAd nativeAd) {
        OooO0O0 oooO0O0OooO00o = nativeAd.OooO00o();
        WeakReference weakReference = this.f16473OooO0O0;
        View view = weakReference != null ? (View) weakReference.get() : null;
        if (view == null) {
            zzo.zzj("NativeAdViewHolder.setNativeAd containerView doesn't exist, returning");
            return;
        }
        WeakHashMap weakHashMap = zza;
        if (!weakHashMap.containsKey(view)) {
            weakHashMap.put(view, this);
        }
        InterfaceC2114u9 interfaceC2114u9 = this.f16472OooO00o;
        if (interfaceC2114u9 != null) {
            try {
                interfaceC2114u9.zzc(oooO0O0OooO00o);
            } catch (RemoteException e) {
                zzo.zzh("Unable to call setNativeAd on delegate", e);
            }
        }
    }

    public void unregisterNativeAd() {
        InterfaceC2114u9 interfaceC2114u9 = this.f16472OooO00o;
        if (interfaceC2114u9 != null) {
            try {
                interfaceC2114u9.zzd();
            } catch (RemoteException e) {
                zzo.zzh("Unable to call unregisterNativeAd on delegate", e);
            }
        }
        WeakReference weakReference = this.f16473OooO0O0;
        View view = weakReference != null ? (View) weakReference.get() : null;
        if (view != null) {
            zza.remove(view);
        }
    }
}
