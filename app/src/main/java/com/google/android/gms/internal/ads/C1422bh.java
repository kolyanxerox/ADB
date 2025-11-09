package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.internal.client.zzfd;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.bh */
/* loaded from: classes2.dex */
public final class C1422bh implements NativeCustomFormatAd {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final InterfaceC1415ba f17497OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public C2158vg f17498OooO0O0;

    public C1422bh(InterfaceC1415ba interfaceC1415ba) {
        this.f17497OooO00o = interfaceC1415ba;
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    public final void destroy() {
        try {
            this.f17497OooO00o.zzl();
        } catch (RemoteException e) {
            zzo.zzh("", e);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    public final List getAvailableAssetNames() {
        try {
            return this.f17497OooO00o.zzk();
        } catch (RemoteException e) {
            zzo.zzh("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    public final String getCustomFormatId() {
        try {
            return this.f17497OooO00o.zzi();
        } catch (RemoteException e) {
            zzo.zzh("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    public final NativeCustomFormatAd.DisplayOpenMeasurement getDisplayOpenMeasurement() {
        InterfaceC1415ba interfaceC1415ba = this.f17497OooO00o;
        try {
            if (this.f17498OooO0O0 == null && interfaceC1415ba.zzq()) {
                this.f17498OooO0O0 = new C2158vg(interfaceC1415ba);
            }
        } catch (RemoteException e) {
            zzo.zzh("", e);
        }
        return this.f17498OooO0O0;
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    public final NativeAd.Image getImage(String str) {
        try {
            InterfaceC1707j9 interfaceC1707j9Zzg = this.f17497OooO00o.zzg(str);
            if (interfaceC1707j9Zzg != null) {
                return new C2195wg(interfaceC1707j9Zzg);
            }
            return null;
        } catch (RemoteException e) {
            zzo.zzh("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    public final MediaContent getMediaContent() {
        InterfaceC1415ba interfaceC1415ba = this.f17497OooO00o;
        try {
            if (interfaceC1415ba.zzf() != null) {
                return new zzfd(interfaceC1415ba.zzf(), interfaceC1415ba);
            }
            return null;
        } catch (RemoteException e) {
            zzo.zzh("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    public final CharSequence getText(String str) {
        try {
            return this.f17497OooO00o.zzj(str);
        } catch (RemoteException e) {
            zzo.zzh("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    public final void performClick(String str) {
        try {
            this.f17497OooO00o.OooO0oo(str);
        } catch (RemoteException e) {
            zzo.zzh("", e);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    public final void recordImpression() {
        try {
            this.f17497OooO00o.zzo();
        } catch (RemoteException e) {
            zzo.zzh("", e);
        }
    }
}
