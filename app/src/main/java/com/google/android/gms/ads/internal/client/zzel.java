package com.google.android.gms.ads.internal.client;

import Oooo0o.OooO0O0;
import Oooo0o.OooO0OO;
import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.internal.ads.BinderC1628h3;
import com.google.android.gms.internal.ads.BinderC2082te;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class zzel {

    /* renamed from: OooO */
    public AppEventListener f16054OooO;

    /* renamed from: OooO00o */
    public final BinderC2082te f16055OooO00o;

    /* renamed from: OooO0O0 */
    public final zzr f16056OooO0O0;

    /* renamed from: OooO0OO */
    public final AtomicBoolean f16057OooO0OO;

    /* renamed from: OooO0Oo */
    public final VideoController f16058OooO0Oo;

    /* renamed from: OooO0o */
    public zza f16059OooO0o;

    /* renamed from: OooO0o0 */
    public final zzbd f16060OooO0o0;

    /* renamed from: OooO0oO */
    public AdListener f16061OooO0oO;

    /* renamed from: OooO0oo */
    public AdSize[] f16062OooO0oo;

    /* renamed from: OooOO0 */
    public zzby f16063OooOO0;

    /* renamed from: OooOO0O */
    public VideoOptions f16064OooOO0O;
    public String OooOO0o;

    /* renamed from: OooOOO */
    public final int f16065OooOOO;

    /* renamed from: OooOOO0 */
    public final ViewGroup f16066OooOOO0;

    /* renamed from: OooOOOO */
    public boolean f16067OooOOOO;

    /* renamed from: OooOOOo */
    public OnPaidEventListener f16068OooOOOo;

    public zzel(ViewGroup viewGroup) {
        this(viewGroup, null, false, zzr.zza, 0);
    }

    public static zzs OooO00o(Context context, AdSize[] adSizeArr, int i) {
        for (AdSize adSize : adSizeArr) {
            if (adSize.equals(AdSize.INVALID)) {
                return new zzs("invalid", 0, 0, false, 0, 0, null, false, false, false, true, false, false, false, false);
            }
        }
        zzs zzsVar = new zzs(context, adSizeArr);
        zzsVar.zzj = i == 1;
        return zzsVar;
    }

    public final boolean zzA() {
        try {
            zzby zzbyVar = this.f16063OooOO0;
            if (zzbyVar != null) {
                return zzbyVar.zzY();
            }
            return false;
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
            return false;
        }
    }

    public final boolean zzB() {
        try {
            zzby zzbyVar = this.f16063OooOO0;
            if (zzbyVar != null) {
                return zzbyVar.zzZ();
            }
            return false;
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
            return false;
        }
    }

    public final AdSize[] zzC() {
        return this.f16062OooO0oo;
    }

    public final AdListener zza() {
        return this.f16061OooO0oO;
    }

    @Nullable
    public final AdSize zzb() {
        zzs zzsVarZzg;
        try {
            zzby zzbyVar = this.f16063OooOO0;
            if (zzbyVar != null && (zzsVarZzg = zzbyVar.zzg()) != null) {
                return com.google.android.gms.ads.zzc.zzc(zzsVarZzg.zze, zzsVarZzg.zzb, zzsVarZzg.zza);
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
        AdSize[] adSizeArr = this.f16062OooO0oo;
        if (adSizeArr != null) {
            return adSizeArr[0];
        }
        return null;
    }

    @Nullable
    public final OnPaidEventListener zzc() {
        return this.f16068OooOOOo;
    }

    @Nullable
    public final ResponseInfo zzd() {
        zzdy zzdyVarZzk = null;
        try {
            zzby zzbyVar = this.f16063OooOO0;
            if (zzbyVar != null) {
                zzdyVarZzk = zzbyVar.zzk();
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
        return ResponseInfo.zza(zzdyVarZzk);
    }

    public final VideoController zzf() {
        return this.f16058OooO0Oo;
    }

    public final VideoOptions zzg() {
        return this.f16064OooOO0O;
    }

    @Nullable
    public final AppEventListener zzh() {
        return this.f16054OooO;
    }

    @Nullable
    public final zzeb zzi() {
        zzby zzbyVar = this.f16063OooOO0;
        if (zzbyVar != null) {
            try {
                return zzbyVar.zzl();
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
            }
        }
        return null;
    }

    public final String zzj() {
        zzby zzbyVar;
        if (this.OooOO0o == null && (zzbyVar = this.f16063OooOO0) != null) {
            try {
                this.OooOO0o = zzbyVar.zzr();
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
            }
        }
        return this.OooOO0o;
    }

    public final void zzk() {
        try {
            zzby zzbyVar = this.f16063OooOO0;
            if (zzbyVar != null) {
                zzbyVar.zzx();
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:93:0x00d7 A[Catch: RemoteException -> 0x00d5, TRY_LEAVE, TryCatch #1 {RemoteException -> 0x00d5, blocks: (B:84:0x00a4, B:86:0x00aa, B:88:0x00b8, B:90:0x00ca, B:93:0x00d7), top: B:110:0x00a4, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzm(com.google.android.gms.ads.internal.client.zzei r13) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.client.zzel.zzm(com.google.android.gms.ads.internal.client.zzei):void");
    }

    public final void zzn() {
        try {
            zzby zzbyVar = this.f16063OooOO0;
            if (zzbyVar != null) {
                zzbyVar.zzz();
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void zzo() {
        if (this.f16057OooO0OO.getAndSet(true)) {
            return;
        }
        try {
            zzby zzbyVar = this.f16063OooOO0;
            if (zzbyVar != null) {
                zzbyVar.zzA();
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void zzp() {
        try {
            zzby zzbyVar = this.f16063OooOO0;
            if (zzbyVar != null) {
                zzbyVar.zzB();
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void zzq(@Nullable zza zzaVar) {
        try {
            this.f16059OooO0o = zzaVar;
            zzby zzbyVar = this.f16063OooOO0;
            if (zzbyVar != null) {
                zzbyVar.zzC(zzaVar != null ? new zzb(zzaVar) : null);
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void zzr(AdListener adListener) {
        this.f16061OooO0oO = adListener;
        this.f16060OooO0o0.zza(adListener);
    }

    public final void zzs(AdSize... adSizeArr) {
        if (this.f16062OooO0oo != null) {
            throw new IllegalStateException("The ad size can only be set once on AdView.");
        }
        zzt(adSizeArr);
    }

    public final void zzt(AdSize... adSizeArr) {
        ViewGroup viewGroup = this.f16066OooOOO0;
        this.f16062OooO0oo = adSizeArr;
        try {
            zzby zzbyVar = this.f16063OooOO0;
            if (zzbyVar != null) {
                zzbyVar.zzF(OooO00o(viewGroup.getContext(), this.f16062OooO0oo, this.f16065OooOOO));
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
        viewGroup.requestLayout();
    }

    public final void zzu(String str) {
        if (this.OooOO0o != null) {
            throw new IllegalStateException("The ad unit ID can only be set once on AdView.");
        }
        this.OooOO0o = str;
    }

    public final void zzv(@Nullable AppEventListener appEventListener) {
        try {
            this.f16054OooO = appEventListener;
            zzby zzbyVar = this.f16063OooOO0;
            if (zzbyVar != null) {
                zzbyVar.zzG(appEventListener != null ? new BinderC1628h3(appEventListener) : null);
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void zzw(boolean z) {
        this.f16067OooOOOO = z;
        try {
            zzby zzbyVar = this.f16063OooOO0;
            if (zzbyVar != null) {
                zzbyVar.zzN(z);
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void zzx(@Nullable OnPaidEventListener onPaidEventListener) {
        try {
            this.f16068OooOOOo = onPaidEventListener;
            zzby zzbyVar = this.f16063OooOO0;
            if (zzbyVar != null) {
                zzbyVar.zzP(new zzfs(onPaidEventListener));
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void zzy(VideoOptions videoOptions) {
        this.f16064OooOO0O = videoOptions;
        try {
            zzby zzbyVar = this.f16063OooOO0;
            if (zzbyVar != null) {
                zzbyVar.zzU(videoOptions == null ? null : new zzga(videoOptions));
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    public final boolean zzz(zzby zzbyVar) {
        try {
            OooO0O0 oooO0O0Zzn = zzbyVar.zzn();
            if (oooO0O0Zzn == null || ((View) OooO0OO.o000O0oO(oooO0O0Zzn)).getParent() != null) {
                return false;
            }
            this.f16066OooOOO0.addView((View) OooO0OO.o000O0oO(oooO0O0Zzn));
            this.f16063OooOO0 = zzbyVar;
            return true;
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
            return false;
        }
    }

    public zzel(ViewGroup viewGroup, int i) {
        this(viewGroup, null, false, zzr.zza, i);
    }

    public zzel(ViewGroup viewGroup, AttributeSet attributeSet, boolean z) {
        this(viewGroup, attributeSet, z, zzr.zza, 0);
    }

    public zzel(ViewGroup viewGroup, AttributeSet attributeSet, boolean z, int i) {
        this(viewGroup, attributeSet, z, zzr.zza, i);
    }

    public zzel(ViewGroup viewGroup, AttributeSet attributeSet, boolean z, zzr zzrVar, int i) {
        zzs zzsVar;
        this.f16055OooO00o = new BinderC2082te();
        this.f16058OooO0Oo = new VideoController();
        this.f16060OooO0o0 = new zzek(this);
        this.f16066OooOOO0 = viewGroup;
        this.f16056OooO0O0 = zzrVar;
        this.f16063OooOO0 = null;
        this.f16057OooO0OO = new AtomicBoolean(false);
        this.f16065OooOOO = i;
        if (attributeSet != null) {
            Context context = viewGroup.getContext();
            try {
                zzaa zzaaVar = new zzaa(context, attributeSet);
                this.f16062OooO0oo = zzaaVar.zzb(z);
                this.OooOO0o = zzaaVar.zza();
                if (viewGroup.isInEditMode()) {
                    com.google.android.gms.ads.internal.util.client.zzf zzfVarZzb = zzbc.zzb();
                    AdSize adSize = this.f16062OooO0oo[0];
                    if (adSize.equals(AdSize.INVALID)) {
                        zzsVar = new zzs("invalid", 0, 0, false, 0, 0, null, false, false, false, true, false, false, false, false);
                    } else {
                        zzsVar = new zzs(context, adSize);
                        zzsVar.zzj = i == 1;
                    }
                    zzfVarZzb.zzm(viewGroup, zzsVar, "Ads by Google");
                }
            } catch (IllegalArgumentException e) {
                zzbc.zzb().zzl(viewGroup, new zzs(context, AdSize.BANNER), e.getMessage(), e.getMessage());
            }
        }
    }
}
