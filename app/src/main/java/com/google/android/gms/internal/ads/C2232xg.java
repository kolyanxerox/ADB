package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.MuteThisAdListener;
import com.google.android.gms.ads.MuteThisAdReason;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.internal.client.zzde;
import com.google.android.gms.ads.internal.client.zzdg;
import com.google.android.gms.ads.internal.client.zzdh;
import com.google.android.gms.ads.internal.client.zzdi;
import com.google.android.gms.ads.internal.client.zzdy;
import com.google.android.gms.ads.internal.client.zzfd;
import com.google.android.gms.ads.internal.client.zzfs;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.nativead.NativeAd;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.xg */
/* loaded from: classes2.dex */
public final class C2232xg extends NativeAd {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final InterfaceC1379ab f25616OooO00o;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final C2195wg f25618OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final C2121ug f25619OooO0Oo;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final ArrayList f25617OooO0O0 = new ArrayList();

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final ArrayList f25620OooO0o0 = new ArrayList();

    public C2232xg(InterfaceC1379ab interfaceC1379ab) {
        InterfaceC1707j9 interfaceC1707j9Zzk;
        this.f25616OooO00o = interfaceC1379ab;
        C2121ug c2121ug = null;
        try {
            List listOooo0o0 = interfaceC1379ab.Oooo0o0();
            if (listOooo0o0 != null) {
                for (Object obj : listOooo0o0) {
                    InterfaceC1707j9 interfaceC1707j9O000O0O0 = obj instanceof IBinder ? BinderC2298z8.o000O0O0((IBinder) obj) : null;
                    if (interfaceC1707j9O000O0O0 != null) {
                        this.f25617OooO0O0.add(new C2195wg(interfaceC1707j9O000O0O0));
                    }
                }
            }
        } catch (RemoteException e) {
            zzo.zzh("", e);
        }
        try {
            List listZzv = this.f25616OooO00o.zzv();
            if (listZzv != null) {
                for (Object obj2 : listZzv) {
                    zzdh zzdhVarZzb = obj2 instanceof IBinder ? zzdg.zzb((IBinder) obj2) : null;
                    if (zzdhVarZzb != null) {
                        this.f25620OooO0o0.add(new zzdi(zzdhVarZzb));
                    }
                }
            }
        } catch (RemoteException e2) {
            zzo.zzh("", e2);
        }
        try {
            interfaceC1707j9Zzk = this.f25616OooO00o.zzk();
        } catch (RemoteException e3) {
            zzo.zzh("", e3);
        }
        C2195wg c2195wg = interfaceC1707j9Zzk != null ? new C2195wg(interfaceC1707j9Zzk) : null;
        this.f25618OooO0OO = c2195wg;
        try {
            if (this.f25616OooO00o.zzi() != null) {
                c2121ug = new C2121ug(this.f25616OooO00o.zzi());
            }
        } catch (RemoteException e4) {
            zzo.zzh("", e4);
        }
        this.f25619OooO0Oo = c2121ug;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final /* bridge */ /* synthetic */ Oooo0o.OooO0O0 OooO00o() {
        try {
            return this.f25616OooO00o.zzm();
        } catch (RemoteException e) {
            zzo.zzh("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void cancelUnconfirmedClick() {
        try {
            this.f25616OooO00o.OooO0O0();
        } catch (RemoteException e) {
            zzo.zzh("Failed to cancelUnconfirmedClick", e);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void destroy() {
        try {
            this.f25616OooO00o.zzx();
        } catch (RemoteException e) {
            zzo.zzh("", e);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void enableCustomClickGesture() {
        try {
            this.f25616OooO00o.OooO0OO();
        } catch (RemoteException e) {
            zzo.zzh("", e);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final NativeAd.AdChoicesInfo getAdChoicesInfo() {
        return this.f25619OooO0Oo;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final String getAdvertiser() {
        try {
            return this.f25616OooO00o.zzn();
        } catch (RemoteException e) {
            zzo.zzh("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final String getBody() {
        try {
            return this.f25616OooO00o.zzo();
        } catch (RemoteException e) {
            zzo.zzh("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final String getCallToAction() {
        try {
            return this.f25616OooO00o.zzp();
        } catch (RemoteException e) {
            zzo.zzh("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final Bundle getExtras() {
        try {
            Bundle bundleZzf = this.f25616OooO00o.zzf();
            if (bundleZzf != null) {
                return bundleZzf;
            }
        } catch (RemoteException e) {
            zzo.zzh("", e);
        }
        return new Bundle();
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final String getHeadline() {
        try {
            return this.f25616OooO00o.zzq();
        } catch (RemoteException e) {
            zzo.zzh("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final NativeAd.Image getIcon() {
        return this.f25618OooO0OO;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final List getImages() {
        return this.f25617OooO0O0;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final MediaContent getMediaContent() {
        InterfaceC1379ab interfaceC1379ab = this.f25616OooO00o;
        try {
            if (interfaceC1379ab.zzj() != null) {
                return new zzfd(interfaceC1379ab.zzj(), null);
            }
        } catch (RemoteException e) {
            zzo.zzh("", e);
        }
        return null;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final List getMuteThisAdReasons() {
        return this.f25620OooO0o0;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final String getPrice() {
        try {
            return this.f25616OooO00o.zzs();
        } catch (RemoteException e) {
            zzo.zzh("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final ResponseInfo getResponseInfo() {
        zzdy zzdyVarZzg;
        try {
            zzdyVarZzg = this.f25616OooO00o.zzg();
        } catch (RemoteException e) {
            zzo.zzh("", e);
            zzdyVarZzg = null;
        }
        return ResponseInfo.zza(zzdyVarZzg);
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final Double getStarRating() {
        try {
            double dZze = this.f25616OooO00o.zze();
            if (dZze == -1.0d) {
                return null;
            }
            return Double.valueOf(dZze);
        } catch (RemoteException e) {
            zzo.zzh("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final String getStore() {
        try {
            return this.f25616OooO00o.zzt();
        } catch (RemoteException e) {
            zzo.zzh("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final boolean isCustomClickGestureEnabled() {
        try {
            return this.f25616OooO00o.zzH();
        } catch (RemoteException e) {
            zzo.zzh("", e);
            return false;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final boolean isCustomMuteThisAdEnabled() {
        try {
            return this.f25616OooO00o.OooO0Oo();
        } catch (RemoteException e) {
            zzo.zzh("", e);
            return false;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void muteThisAd(MuteThisAdReason muteThisAdReason) {
        InterfaceC1379ab interfaceC1379ab = this.f25616OooO00o;
        try {
            try {
                if (interfaceC1379ab.OooO0Oo()) {
                    if (muteThisAdReason == null) {
                        interfaceC1379ab.OooOo0o(null);
                        return;
                    } else if (muteThisAdReason instanceof zzdi) {
                        interfaceC1379ab.OooOo0o(((zzdi) muteThisAdReason).zza());
                        return;
                    } else {
                        zzo.zzg("Use mute reason from UnifiedNativeAd.getMuteThisAdReasons() or null");
                        return;
                    }
                }
            } catch (RemoteException e) {
                zzo.zzh("", e);
            }
            zzo.zzg("Ad is not custom mute enabled");
        } catch (RemoteException e2) {
            zzo.zzh("", e2);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void performClick(Bundle bundle) {
        try {
            this.f25616OooO00o.o000000(bundle);
        } catch (RemoteException e) {
            zzo.zzh("", e);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void recordCustomClickGesture() {
        try {
            this.f25616OooO00o.zzA();
        } catch (RemoteException e) {
            zzo.zzh("", e);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void recordEvent(Bundle bundle) {
        try {
            this.f25616OooO00o.o0000OO0(bundle);
        } catch (RemoteException e) {
            zzo.zzh("Failed to record native event", e);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final boolean recordImpression(Bundle bundle) {
        try {
            return this.f25616OooO00o.OoooOoo(bundle);
        } catch (RemoteException e) {
            zzo.zzh("", e);
            return false;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void reportTouchEvent(Bundle bundle) {
        try {
            this.f25616OooO00o.o0000O0(bundle);
        } catch (RemoteException e) {
            zzo.zzh("", e);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void setMuteThisAdListener(MuteThisAdListener muteThisAdListener) {
        try {
            this.f25616OooO00o.OooooO0(new zzde(muteThisAdListener));
        } catch (RemoteException e) {
            zzo.zzh("", e);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void setOnPaidEventListener(OnPaidEventListener onPaidEventListener) {
        try {
            this.f25616OooO00o.o0ooOoO(new zzfs(onPaidEventListener));
        } catch (RemoteException e) {
            zzo.zzh("Failed to setOnPaidEventListener", e);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void setUnconfirmedClickListener(NativeAd.UnconfirmedClickListener unconfirmedClickListener) {
        try {
            this.f25616OooO00o.OoooO0(new BinderC1495dh(unconfirmedClickListener));
        } catch (RemoteException e) {
            zzo.zzh("Failed to setUnconfirmedClickListener", e);
        }
    }
}
