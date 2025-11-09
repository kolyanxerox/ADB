package com.google.android.gms.ads.internal.client;

import Oooo0o.OooO0O0;
import Oooo0o.OooO0OO;
import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.internal.ads.InterfaceC1415ba;
import com.google.android.gms.internal.ads.InterfaceC1634h9;

/* loaded from: classes2.dex */
public final class zzfd implements MediaContent {

    /* renamed from: OooO00o */
    public final InterfaceC1634h9 f16086OooO00o;

    /* renamed from: OooO0O0 */
    public final VideoController f16087OooO0O0 = new VideoController();

    /* renamed from: OooO0OO */
    public final InterfaceC1415ba f16088OooO0OO;

    public zzfd(InterfaceC1634h9 interfaceC1634h9, @Nullable InterfaceC1415ba interfaceC1415ba) {
        this.f16086OooO00o = interfaceC1634h9;
        this.f16088OooO0OO = interfaceC1415ba;
    }

    @Override // com.google.android.gms.ads.MediaContent
    public final float getAspectRatio() {
        try {
            return this.f16086OooO00o.zze();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e);
            return 0.0f;
        }
    }

    @Override // com.google.android.gms.ads.MediaContent
    public final float getCurrentTime() {
        try {
            return this.f16086OooO00o.zzf();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e);
            return 0.0f;
        }
    }

    @Override // com.google.android.gms.ads.MediaContent
    public final float getDuration() {
        try {
            return this.f16086OooO00o.zzg();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e);
            return 0.0f;
        }
    }

    @Override // com.google.android.gms.ads.MediaContent
    @Nullable
    public final Drawable getMainImage() {
        try {
            OooO0O0 oooO0O0Zzi = this.f16086OooO00o.zzi();
            if (oooO0O0Zzi != null) {
                return (Drawable) OooO0OO.o000O0oO(oooO0O0Zzi);
            }
            return null;
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.MediaContent
    public final VideoController getVideoController() {
        VideoController videoController = this.f16087OooO0O0;
        InterfaceC1634h9 interfaceC1634h9 = this.f16086OooO00o;
        try {
            if (interfaceC1634h9.zzh() != null) {
                videoController.zzb(interfaceC1634h9.zzh());
                return videoController;
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Exception occurred while getting video controller", e);
        }
        return videoController;
    }

    @Override // com.google.android.gms.ads.MediaContent
    public final boolean hasVideoContent() {
        try {
            return this.f16086OooO00o.zzl();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e);
            return false;
        }
    }

    @Override // com.google.android.gms.ads.MediaContent
    public final void setMainImage(@Nullable Drawable drawable) {
        try {
            this.f16086OooO00o.zzj(new OooO0OO(drawable));
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e);
        }
    }

    @Override // com.google.android.gms.ads.MediaContent
    @Nullable
    public final InterfaceC1415ba zza() {
        return this.f16088OooO0OO;
    }

    @Override // com.google.android.gms.ads.MediaContent
    public final boolean zzb() {
        try {
            return this.f16086OooO00o.zzk();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e);
            return false;
        }
    }

    public final InterfaceC1634h9 zzc() {
        return this.f16086OooO00o;
    }
}
