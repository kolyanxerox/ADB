package com.google.android.gms.ads.nativead;

import Oooo0o.OooO0OO;
import android.annotation.TargetApi;
import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.internal.ads.InterfaceC1415ba;
import com.google.android.gms.internal.ads.InterfaceC1892o9;

/* loaded from: classes2.dex */
public class MediaView extends FrameLayout {

    @Nullable
    private MediaContent zza;
    private boolean zzb;
    private ImageView.ScaleType zzc;
    private boolean zzd;
    private zzb zze;
    private zzc zzf;

    public MediaView(@NonNull Context context) {
        super(context);
    }

    @Nullable
    public MediaContent getMediaContent() {
        return this.zza;
    }

    public void setImageScaleType(@NonNull ImageView.ScaleType scaleType) {
        InterfaceC1892o9 interfaceC1892o9;
        this.zzd = true;
        this.zzc = scaleType;
        zzc zzcVar = this.zzf;
        if (zzcVar == null || (interfaceC1892o9 = zzcVar.zza.f16471OooOo0o) == null || scaleType == null) {
            return;
        }
        try {
            interfaceC1892o9.zzdw(new OooO0OO(scaleType));
        } catch (RemoteException e) {
            zzo.zzh("Unable to call setMediaViewImageScaleType on delegate", e);
        }
    }

    public void setMediaContent(@Nullable MediaContent mediaContent) {
        boolean zOooOO0o;
        this.zzb = true;
        this.zza = mediaContent;
        zzb zzbVar = this.zze;
        if (zzbVar != null) {
            zzbVar.zza.OooO0O0(mediaContent);
        }
        if (mediaContent == null) {
            return;
        }
        try {
            InterfaceC1415ba interfaceC1415baZza = mediaContent.zza();
            if (interfaceC1415baZza != null) {
                if (!mediaContent.hasVideoContent()) {
                    if (mediaContent.zzb()) {
                        zOooOO0o = interfaceC1415baZza.OooOO0o(new OooO0OO(this));
                    }
                    removeAllViews();
                }
                zOooOO0o = interfaceC1415baZza.OooOOO0(new OooO0OO(this));
                if (zOooOO0o) {
                    return;
                }
                removeAllViews();
            }
        } catch (RemoteException e) {
            removeAllViews();
            zzo.zzh("", e);
        }
    }

    public final synchronized void zza(zzb zzbVar) {
        this.zze = zzbVar;
        if (this.zzb) {
            zzbVar.zza.OooO0O0(this.zza);
        }
    }

    public final synchronized void zzb(zzc zzcVar) {
        this.zzf = zzcVar;
        if (this.zzd) {
            ImageView.ScaleType scaleType = this.zzc;
            InterfaceC1892o9 interfaceC1892o9 = zzcVar.zza.f16471OooOo0o;
            if (interfaceC1892o9 != null && scaleType != null) {
                try {
                    interfaceC1892o9.zzdw(new OooO0OO(scaleType));
                } catch (RemoteException e) {
                    zzo.zzh("Unable to call setMediaViewImageScaleType on delegate", e);
                }
            }
        }
    }

    public MediaView(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MediaView(@NonNull Context context, @NonNull AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @TargetApi(21)
    public MediaView(@NonNull Context context, @NonNull AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
