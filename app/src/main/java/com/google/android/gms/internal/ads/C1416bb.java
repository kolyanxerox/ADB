package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.formats.UnifiedNativeAd;
import com.google.android.gms.ads.internal.client.zzdg;
import com.google.android.gms.ads.internal.client.zzdh;
import com.google.android.gms.ads.internal.client.zzdi;
import com.google.android.gms.ads.internal.util.client.zzo;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.bb */
/* loaded from: classes2.dex */
public final class C1416bb extends UnifiedNativeAd {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final InterfaceC1379ab f17465OooO00o;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final C1744k9 f17467OooO0OO;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final ArrayList f17466OooO0O0 = new ArrayList();

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final VideoController f17468OooO0Oo = new VideoController();

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final ArrayList f17469OooO0o0 = new ArrayList();

    public C1416bb(InterfaceC1379ab interfaceC1379ab) {
        InterfaceC1707j9 c1671i9;
        IBinder iBinder;
        this.f17465OooO00o = interfaceC1379ab;
        C1744k9 c1744k9 = null;
        try {
            List listOooo0o0 = interfaceC1379ab.Oooo0o0();
            if (listOooo0o0 != null) {
                for (Object obj : listOooo0o0) {
                    if (!(obj instanceof IBinder) || (iBinder = (IBinder) obj) == null) {
                        c1671i9 = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                        c1671i9 = iInterfaceQueryLocalInterface instanceof InterfaceC1707j9 ? (InterfaceC1707j9) iInterfaceQueryLocalInterface : new C1671i9(iBinder);
                    }
                    if (c1671i9 != null) {
                        this.f17466OooO0O0.add(new C1744k9(c1671i9));
                    }
                }
            }
        } catch (RemoteException e) {
            zzo.zzh("", e);
        }
        try {
            List listZzv = this.f17465OooO00o.zzv();
            if (listZzv != null) {
                for (Object obj2 : listZzv) {
                    zzdh zzdhVarZzb = obj2 instanceof IBinder ? zzdg.zzb((IBinder) obj2) : null;
                    if (zzdhVarZzb != null) {
                        this.f17469OooO0o0.add(new zzdi(zzdhVarZzb));
                    }
                }
            }
        } catch (RemoteException e2) {
            zzo.zzh("", e2);
        }
        try {
            InterfaceC1707j9 interfaceC1707j9Zzk = this.f17465OooO00o.zzk();
            if (interfaceC1707j9Zzk != null) {
                c1744k9 = new C1744k9(interfaceC1707j9Zzk);
            }
        } catch (RemoteException e3) {
            zzo.zzh("", e3);
        }
        this.f17467OooO0OO = c1744k9;
        try {
            if (this.f17465OooO00o.zzi() != null) {
                new C1560f9(this.f17465OooO00o.zzi());
            }
        } catch (RemoteException e4) {
            zzo.zzh("", e4);
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void performClick(Bundle bundle) {
        try {
            this.f17465OooO00o.o000000(bundle);
        } catch (RemoteException e) {
            zzo.zzh("", e);
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final boolean recordImpression(Bundle bundle) {
        try {
            return this.f17465OooO00o.OoooOoo(bundle);
        } catch (RemoteException e) {
            zzo.zzh("", e);
            return false;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void reportTouchEvent(Bundle bundle) {
        try {
            this.f17465OooO00o.o0000O0(bundle);
        } catch (RemoteException e) {
            zzo.zzh("", e);
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final VideoController zza() {
        VideoController videoController = this.f17468OooO0Oo;
        InterfaceC1379ab interfaceC1379ab = this.f17465OooO00o;
        try {
            if (interfaceC1379ab.zzh() != null) {
                videoController.zzb(interfaceC1379ab.zzh());
                return videoController;
            }
        } catch (RemoteException e) {
            zzo.zzh("Exception occurred while getting video controller", e);
        }
        return videoController;
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final NativeAd.Image zzb() {
        return this.f17467OooO0OO;
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final Double zzc() {
        try {
            double dZze = this.f17465OooO00o.zze();
            if (dZze == -1.0d) {
                return null;
            }
            return Double.valueOf(dZze);
        } catch (RemoteException e) {
            zzo.zzh("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final Object zzd() {
        try {
            Oooo0o.OooO0O0 oooO0O0Zzl = this.f17465OooO00o.zzl();
            if (oooO0O0Zzl != null) {
                return Oooo0o.OooO0OO.o000O0oO(oooO0O0Zzl);
            }
            return null;
        } catch (RemoteException e) {
            zzo.zzh("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final String zze() {
        try {
            return this.f17465OooO00o.zzn();
        } catch (RemoteException e) {
            zzo.zzh("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final String zzf() {
        try {
            return this.f17465OooO00o.zzo();
        } catch (RemoteException e) {
            zzo.zzh("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final String zzg() {
        try {
            return this.f17465OooO00o.zzp();
        } catch (RemoteException e) {
            zzo.zzh("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final String zzh() {
        try {
            return this.f17465OooO00o.zzq();
        } catch (RemoteException e) {
            zzo.zzh("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final String zzi() {
        try {
            return this.f17465OooO00o.zzs();
        } catch (RemoteException e) {
            zzo.zzh("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final String zzj() {
        try {
            return this.f17465OooO00o.zzt();
        } catch (RemoteException e) {
            zzo.zzh("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final List zzk() {
        return this.f17466OooO0O0;
    }
}
