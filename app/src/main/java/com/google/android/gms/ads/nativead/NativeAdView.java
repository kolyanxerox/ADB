package com.google.android.gms.ads.nativead;

import Oooo0o.OooO0O0;
import Oooo0o.OooO0OO;
import android.annotation.TargetApi;
import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzfd;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.internal.ads.AbstractC1448c7;
import com.google.android.gms.internal.ads.InterfaceC1892o9;

/* loaded from: classes2.dex */
public final class NativeAdView extends FrameLayout {

    /* renamed from: OooOo0O */
    public final FrameLayout f16470OooOo0O;

    /* renamed from: OooOo0o */
    public final InterfaceC1892o9 f16471OooOo0o;

    public NativeAdView(@NonNull Context context) {
        super(context);
        this.f16470OooOo0O = OooO0OO(context);
        this.f16471OooOo0o = OooO0Oo();
    }

    public final View OooO00o(String str) {
        InterfaceC1892o9 interfaceC1892o9 = this.f16471OooOo0o;
        if (interfaceC1892o9 == null) {
            return null;
        }
        try {
            OooO0O0 oooO0O0Zzb = interfaceC1892o9.zzb(str);
            if (oooO0O0Zzb != null) {
                return (View) OooO0OO.o000O0oO(oooO0O0Zzb);
            }
            return null;
        } catch (RemoteException e) {
            zzo.zzh("Unable to call getAssetView on delegate", e);
            return null;
        }
    }

    public final /* synthetic */ void OooO0O0(MediaContent mediaContent) {
        InterfaceC1892o9 interfaceC1892o9 = this.f16471OooOo0o;
        if (interfaceC1892o9 == null) {
            return;
        }
        try {
            if (mediaContent instanceof zzfd) {
                interfaceC1892o9.zzdv(((zzfd) mediaContent).zzc());
            } else if (mediaContent == null) {
                interfaceC1892o9.zzdv(null);
            } else {
                zzo.zze("Use MediaContent provided by NativeAd.getMediaContent");
            }
        } catch (RemoteException e) {
            zzo.zzh("Unable to call setMediaContent on delegate", e);
        }
    }

    public final FrameLayout OooO0OO(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(frameLayout);
        return frameLayout;
    }

    public final InterfaceC1892o9 OooO0Oo() {
        if (isInEditMode()) {
            return null;
        }
        zzba zzbaVarZza = zzbc.zza();
        FrameLayout frameLayout = this.f16470OooOo0O;
        return zzbaVarZza.zzj(frameLayout.getContext(), this, frameLayout);
    }

    public final void OooO0o0(String str, View view) {
        InterfaceC1892o9 interfaceC1892o9 = this.f16471OooOo0o;
        if (interfaceC1892o9 == null) {
            return;
        }
        try {
            interfaceC1892o9.zzdt(str, new OooO0OO(view));
        } catch (RemoteException e) {
            zzo.zzh("Unable to call setAssetView on delegate", e);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(@NonNull View view, int i, @NonNull ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        super.bringChildToFront(this.f16470OooOo0O);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void bringChildToFront(@NonNull View view) {
        super.bringChildToFront(view);
        FrameLayout frameLayout = this.f16470OooOo0O;
        if (frameLayout != view) {
            super.bringChildToFront(frameLayout);
        }
    }

    public void destroy() {
        InterfaceC1892o9 interfaceC1892o9 = this.f16471OooOo0o;
        if (interfaceC1892o9 == null) {
            return;
        }
        try {
            interfaceC1892o9.zzc();
        } catch (RemoteException e) {
            zzo.zzh("Unable to destroy native ad view", e);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(@NonNull MotionEvent motionEvent) {
        InterfaceC1892o9 interfaceC1892o9 = this.f16471OooOo0o;
        if (interfaceC1892o9 != null) {
            if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0oOOO0o)).booleanValue()) {
                try {
                    interfaceC1892o9.zzd(new OooO0OO(motionEvent));
                } catch (RemoteException e) {
                    zzo.zzh("Unable to call handleTouchEvent on delegate", e);
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Nullable
    public AdChoicesView getAdChoicesView() {
        View viewOooO00o = OooO00o("3011");
        if (viewOooO00o instanceof AdChoicesView) {
            return (AdChoicesView) viewOooO00o;
        }
        return null;
    }

    @Nullable
    public final View getAdvertiserView() {
        return OooO00o("3005");
    }

    @Nullable
    public final View getBodyView() {
        return OooO00o("3004");
    }

    @Nullable
    public final View getCallToActionView() {
        return OooO00o("3002");
    }

    @Nullable
    public final View getHeadlineView() {
        return OooO00o("3001");
    }

    @Nullable
    public final View getIconView() {
        return OooO00o("3003");
    }

    @Nullable
    public final View getImageView() {
        return OooO00o("3008");
    }

    @Nullable
    public final MediaView getMediaView() {
        View viewOooO00o = OooO00o("3010");
        if (viewOooO00o instanceof MediaView) {
            return (MediaView) viewOooO00o;
        }
        if (viewOooO00o == null) {
            return null;
        }
        zzo.zze("View is not an instance of MediaView");
        return null;
    }

    @Nullable
    public final View getPriceView() {
        return OooO00o("3007");
    }

    @Nullable
    public final View getStarRatingView() {
        return OooO00o("3009");
    }

    @Nullable
    public final View getStoreView() {
        return OooO00o("3006");
    }

    @Override // android.view.View
    public final void onVisibilityChanged(@NonNull View view, int i) {
        super.onVisibilityChanged(view, i);
        InterfaceC1892o9 interfaceC1892o9 = this.f16471OooOo0o;
        if (interfaceC1892o9 == null) {
            return;
        }
        try {
            interfaceC1892o9.zze(new OooO0OO(view), i);
        } catch (RemoteException e) {
            zzo.zzh("Unable to call onVisibilityChanged on delegate", e);
        }
    }

    @Override // android.view.ViewGroup
    public final void removeAllViews() {
        super.removeAllViews();
        addView(this.f16470OooOo0O);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(@NonNull View view) {
        if (this.f16470OooOo0O == view) {
            return;
        }
        super.removeView(view);
    }

    public void setAdChoicesView(@Nullable AdChoicesView adChoicesView) {
        OooO0o0("3011", adChoicesView);
    }

    public final void setAdvertiserView(@Nullable View view) {
        OooO0o0("3005", view);
    }

    public final void setBodyView(@Nullable View view) {
        OooO0o0("3004", view);
    }

    public final void setCallToActionView(@Nullable View view) {
        OooO0o0("3002", view);
    }

    public final void setClickConfirmingView(@Nullable View view) {
        InterfaceC1892o9 interfaceC1892o9 = this.f16471OooOo0o;
        if (interfaceC1892o9 == null) {
            return;
        }
        try {
            interfaceC1892o9.zzdu(new OooO0OO(view));
        } catch (RemoteException e) {
            zzo.zzh("Unable to call setClickConfirmingView on delegate", e);
        }
    }

    public final void setHeadlineView(@Nullable View view) {
        OooO0o0("3001", view);
    }

    public final void setIconView(@Nullable View view) {
        OooO0o0("3003", view);
    }

    public final void setImageView(@Nullable View view) {
        OooO0o0("3008", view);
    }

    public final void setMediaView(@Nullable MediaView mediaView) {
        OooO0o0("3010", mediaView);
        if (mediaView == null) {
            return;
        }
        mediaView.zza(new zzb(this));
        mediaView.zzb(new zzc(this));
    }

    public void setNativeAd(@NonNull NativeAd nativeAd) {
        InterfaceC1892o9 interfaceC1892o9 = this.f16471OooOo0o;
        if (interfaceC1892o9 == null) {
            return;
        }
        try {
            interfaceC1892o9.zzdx(nativeAd.OooO00o());
        } catch (RemoteException e) {
            zzo.zzh("Unable to call setNativeAd on delegate", e);
        }
    }

    public final void setPriceView(@Nullable View view) {
        OooO0o0("3007", view);
    }

    public final void setStarRatingView(@Nullable View view) {
        OooO0o0("3009", view);
    }

    public final void setStoreView(@Nullable View view) {
        OooO0o0("3006", view);
    }

    public NativeAdView(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f16470OooOo0O = OooO0OO(context);
        this.f16471OooOo0o = OooO0Oo();
    }

    public NativeAdView(@NonNull Context context, @NonNull AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f16470OooOo0O = OooO0OO(context);
        this.f16471OooOo0o = OooO0Oo();
    }

    @TargetApi(21)
    public NativeAdView(@NonNull Context context, @NonNull AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f16470OooOo0O = OooO0OO(context);
        this.f16471OooOo0o = OooO0Oo();
    }
}
