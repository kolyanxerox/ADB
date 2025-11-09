package com.google.android.gms.internal.ads;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.media.AudioAttributes;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.RemoteException;
import android.os.SystemClock;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.internal.client.zzeb;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzn;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.ads.mediation.InitializationCompleteCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.rewarded.RewardItem;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ScheduledFuture;

/* loaded from: classes2.dex */
public final class wj0 implements ooooO000, vi0, Oooo00O.OooO0OO, InitializationStatus, InterfaceC1427bm, InitializationCompleteCallback, MediationRewardedAdCallback, vp0, InterfaceC1730jw, zzn, x40, InterfaceC2318zs, InterfaceC2064sx, h90, sc0 {

    /* renamed from: OooOo */
    public static wj0 f25316OooOo;

    /* renamed from: OooOo0O */
    public final /* synthetic */ int f25317OooOo0O;

    /* renamed from: OooOo0o */
    public final Object f25318OooOo0o;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wj0() {
        this(false);
        this.f25317OooOo0O = 10;
    }

    public static final wj0 OooO0oo(Context context) {
        wj0 wj0Var;
        synchronized (wj0.class) {
            try {
                if (f25316OooOo == null) {
                    f25316OooOo = new wj0(context);
                }
                wj0Var = f25316OooOo;
            } catch (Throwable th) {
                throw th;
            }
        }
        return wj0Var;
    }

    @Override // com.google.android.gms.internal.ads.ooooO000
    public void OooO00o(MessageDigest[] messageDigestArr, long j, int i) {
        ByteBuffer byteBufferSlice;
        synchronized (((ByteBuffer) this.f25318OooOo0o)) {
            int i2 = (int) j;
            ((ByteBuffer) this.f25318OooOo0o).position(i2);
            ((ByteBuffer) this.f25318OooOo0o).limit(i2 + i);
            byteBufferSlice = ((ByteBuffer) this.f25318OooOo0o).slice();
        }
        for (MessageDigest messageDigest : messageDigestArr) {
            byteBufferSlice.position(0);
            messageDigest.update(byteBufferSlice);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2064sx
    public void OooO0o(boolean z, Context context, C2246xu c2246xu) throws C2027rx, yd0 {
        Object obj = ((l60) this.f25318OooOo0o).f20809OooO0O0;
        try {
            ((ee0) obj).OooO0O0(z);
            try {
                ((ee0) obj).f18580OooO00o.o00Oo0(new Oooo0o.OooO0OO(context));
            } catch (Throwable th) {
                throw new yd0(th);
            }
        } catch (yd0 e) {
            throw new C2027rx(e.getCause());
        }
    }

    @Override // com.google.android.gms.internal.ads.h90
    public void OooO0o0(AbstractC1397at abstractC1397at) {
        switch (this.f25317OooOo0O) {
            case 27:
                C1768kx c1768kx = (C1768kx) abstractC1397at;
                synchronized (((f90) this.f25318OooOo0o)) {
                    ((f90) this.f25318OooOo0o).f18900OooOooo = c1768kx;
                    c1768kx.OooO00o();
                }
                return;
            default:
                C2317zr c2317zr = (C2317zr) abstractC1397at;
                synchronized (((ic0) this.f25318OooOo0o)) {
                    try {
                        C2317zr c2317zr2 = ((ic0) this.f25318OooOo0o).f20021Oooo000;
                        if (c2317zr2 != null) {
                            c2317zr2.OooO0O0();
                        }
                        ic0 ic0Var = (ic0) this.f25318OooOo0o;
                        ic0Var.f20021Oooo000 = c2317zr;
                        InterfaceC1722jo interfaceC1722jo = c2317zr.f26361OooOO0;
                        if (interfaceC1722jo != null) {
                            interfaceC1722jo.OooooO0(ic0Var);
                        }
                        ic0 ic0Var2 = (ic0) this.f25318OooOo0o;
                        ic0Var2.f20016OooOoOO.OooO0oo(new BinderC1396as(c2317zr, ic0Var2, ic0Var2.f20016OooOoOO, ic0Var2.f20017OooOoo));
                        c2317zr.OooO00o();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }

    @Override // Oooo00O.OooO0OO
    public void OooOO0(Bundle bundle) {
        C1592g4 c1592g4;
        C1666i4 c1666i4;
        synchronized (((C1592g4) this.f25318OooOo0o).f19219OooO0OO) {
            try {
                c1592g4 = (C1592g4) this.f25318OooOo0o;
                c1666i4 = c1592g4.f19220OooO0Oo;
            } catch (DeadObjectException e) {
                zzo.zzh("Unable to obtain a cache service instance.", e);
                C1592g4.OooO0O0((C1592g4) this.f25318OooOo0o);
            }
            if (c1666i4 != null) {
                c1592g4.f19221OooO0o = (C1739k4) c1666i4.getService();
                ((C1592g4) this.f25318OooOo0o).f19219OooO0OO.notifyAll();
            } else {
                ((C1592g4) this.f25318OooOo0o).f19219OooO0OO.notifyAll();
            }
        }
    }

    @Override // Oooo00O.OooO0OO
    public void OooOOO(int i) {
        synchronized (((C1592g4) this.f25318OooOo0o).f19219OooO0OO) {
            C1592g4 c1592g4 = (C1592g4) this.f25318OooOo0o;
            c1592g4.f19221OooO0o = null;
            c1592g4.f19219OooO0OO.notifyAll();
        }
    }

    @Override // com.google.android.gms.internal.ads.x40
    public o00000oO.OooOOO Oooo000(C2197wi c2197wi) {
        q40 q40Var = (q40) ((de0) this.f25318OooOo0o).f18240OooOo;
        String str = c2197wi.zzh;
        synchronized (q40Var.f22330OooOo0o) {
            try {
                int i = q40Var.f23507OooOoo;
                if (i != 1 && i != 3) {
                    return ii0.Ooooo00(new v40(2));
                }
                if (q40Var.f22328OooOo) {
                    return q40Var.f22329OooOo0O;
                }
                q40Var.f23507OooOoo = 3;
                q40Var.f22328OooOo = true;
                q40Var.f23508OooOoo0 = str;
                q40Var.f22333OooOoOO.checkAvailabilityAndConnect();
                q40Var.f22329OooOo0O.addListener(new p40(q40Var, 1), AbstractC2200wl.f25327OooO0oO);
                return q40Var.f22329OooOo0O;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.sc0
    public C2204wp Oooo0oO(rc0 rc0Var) {
        return ((fd0) this.f25318OooOo0o).OooO0O0(rc0Var);
    }

    public void OoooO0() {
        synchronized (wj0.class) {
            ((C1548ey) this.f25318OooOo0o).OooOO0o("vendor_scoped_gpid_v2_id");
            ((C1548ey) this.f25318OooOo0o).OooOO0o("vendor_scoped_gpid_v2_creation_time");
        }
    }

    @Override // com.google.android.gms.ads.initialization.InitializationStatus
    public Map getAdapterStatusMap() {
        return (HashMap) this.f25318OooOo0o;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdCallback
    public void onAdClosed() {
        Oooo00O.o000000O.OooO0Oo("#008 Must be called on the main UI thread.");
        zzo.zze("Adapter called onAdClosed.");
        try {
            ((InterfaceC1383af) this.f25318OooOo0o).zzf();
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAdCallback, com.google.android.gms.ads.mediation.MediationAppOpenAdCallback
    public void onAdFailedToShow(AdError adError) {
        Oooo00O.o000000O.OooO0Oo("#008 Must be called on the main UI thread.");
        zzo.zze("Adapter called onAdFailedToShow.");
        zzo.zzj("Mediation ad failed to show: Error Code = " + adError.getCode() + ". Error Message = " + adError.getMessage() + " Error Domain = " + adError.getDomain());
        try {
            ((InterfaceC1383af) this.f25318OooOo0o).OoooOOo(adError.zza());
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdCallback
    public void onAdOpened() {
        Oooo00O.o000000O.OooO0Oo("#008 Must be called on the main UI thread.");
        zzo.zze("Adapter called onAdOpened.");
        try {
            ((InterfaceC1383af) this.f25318OooOo0o).zzp();
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.InitializationCompleteCallback
    public void onInitializationFailed(String str) {
        try {
            ((InterfaceC2154vc) this.f25318OooOo0o).zze(str);
        } catch (RemoteException e) {
            zzo.zzh("", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.InitializationCompleteCallback
    public void onInitializationSucceeded() {
        try {
            ((InterfaceC2154vc) this.f25318OooOo0o).zzf();
        } catch (RemoteException e) {
            zzo.zzh("", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAdCallback
    public void onUserEarnedReward(RewardItem rewardItem) {
        Oooo00O.o000000O.OooO0Oo("#008 Must be called on the main UI thread.");
        zzo.zze("Adapter called onUserEarnedReward.");
        try {
            ((InterfaceC1383af) this.f25318OooOo0o).o0000oo(new BinderC1608gk(rewardItem));
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAdCallback, com.google.android.gms.ads.mediation.MediationNativeAdCallback
    public void onVideoComplete() {
        Oooo00O.o000000O.OooO0Oo("#008 Must be called on the main UI thread.");
        zzo.zze("Adapter called onVideoComplete.");
        try {
            ((InterfaceC1383af) this.f25318OooOo0o).zzu();
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAdCallback
    public void onVideoStart() {
        Oooo00O.o000000O.OooO0Oo("#008 Must be called on the main UI thread.");
        zzo.zze("Adapter called onVideoStart.");
        try {
            ((InterfaceC1383af) this.f25318OooOo0o).OooOoO0();
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdCallback
    public void reportAdClicked() {
        Oooo00O.o000000O.OooO0Oo("#008 Must be called on the main UI thread.");
        zzo.zze("Adapter called reportAdClicked.");
        try {
            ((InterfaceC1383af) this.f25318OooOo0o).zze();
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdCallback
    public void reportAdImpression() {
        Oooo00O.o000000O.OooO0Oo("#008 Must be called on the main UI thread.");
        zzo.zze("Adapter called reportAdImpression.");
        try {
            ((InterfaceC1383af) this.f25318OooOo0o).zzm();
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.ooooO000
    public long zza() {
        return ((ByteBuffer) this.f25318OooOo0o).capacity();
    }

    @Override // com.google.android.gms.internal.ads.vi0
    public void zzb(int i, long j, String str) {
        ((OoooOOO.o0O0oo00) this.f25318OooOo0o).OooOO0(i, System.currentTimeMillis() - j, null, null, str);
    }

    @Override // com.google.android.gms.ads.internal.zzn
    public void zzde() {
        C2099tv c2099tv = ((n10) this.f25318OooOo0o).f21389OooO0oO;
        synchronized (c2099tv) {
            try {
                if (c2099tv.f24517OooOooO) {
                    return;
                }
                ScheduledFuture scheduledFuture = c2099tv.f24518OooOooo;
                if (scheduledFuture == null || scheduledFuture.isCancelled()) {
                    c2099tv.f24516OooOoo0 = -1L;
                } else {
                    c2099tv.f24518OooOooo.cancel(false);
                    long j = c2099tv.f24512OooOoO;
                    ((Oooo0OO.oo000o) c2099tv.f24513OooOoO0).getClass();
                    c2099tv.f24516OooOoo0 = j - SystemClock.elapsedRealtime();
                }
                ScheduledFuture scheduledFuture2 = c2099tv.f24519Oooo000;
                if (scheduledFuture2 == null || scheduledFuture2.isCancelled()) {
                    c2099tv.f24515OooOoo = -1L;
                } else {
                    c2099tv.f24519Oooo000.cancel(false);
                    long j2 = c2099tv.f24514OooOoOO;
                    ((Oooo0OO.oo000o) c2099tv.f24513OooOoO0).getClass();
                    c2099tv.f24515OooOoo = j2 - SystemClock.elapsedRealtime();
                }
                c2099tv.f24517OooOooO = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.zzn
    public void zzdf() {
        ScheduledFuture scheduledFuture;
        ScheduledFuture scheduledFuture2;
        C2099tv c2099tv = ((n10) this.f25318OooOo0o).f21389OooO0oO;
        synchronized (c2099tv) {
            try {
                if (c2099tv.f24517OooOooO) {
                    if (c2099tv.f24516OooOoo0 > 0 && (scheduledFuture2 = c2099tv.f24518OooOooo) != null && scheduledFuture2.isCancelled()) {
                        c2099tv.o0000O00(c2099tv.f24516OooOoo0);
                    }
                    if (c2099tv.f24515OooOoo > 0 && (scheduledFuture = c2099tv.f24519Oooo000) != null && scheduledFuture.isCancelled()) {
                        c2099tv.o0000oo(c2099tv.f24515OooOoo);
                    }
                    c2099tv.f24517OooOooO = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public /* synthetic */ wj0(Object obj, int i) {
        this.f25317OooOo0O = i;
        this.f25318OooOo0o = obj;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2318zs, com.google.android.gms.internal.ads.il0
    /* renamed from: zza */
    public zzeb mo13704zza() throws yd0 {
        try {
            return ((ee0) this.f25318OooOo0o).f18580OooO00o.zzh();
        } catch (Throwable th) {
            throw new yd0(th);
        }
    }

    public wj0(Context context) {
        this.f25317OooOo0O = 0;
        if (C1548ey.f18705OooOoO0 == null) {
            C1548ey.f18705OooOoO0 = new C1548ey(context, 26);
        }
        this.f25318OooOo0o = C1548ey.f18705OooOoO0;
        sj0.OooO00o(context);
    }

    @Override // com.google.android.gms.internal.ads.vp0
    /* renamed from: zzb */
    public void mo13705zzb(Object obj) {
        switch (this.f25317OooOo0O) {
            case 14:
                ((C1435bu) this.f25318OooOo0o).f17600OooOo0O.zza();
                return;
            case 21:
                String str = (String) obj;
                synchronized (this) {
                    d30 d30Var = (d30) this.f25318OooOo0o;
                    d30Var.f18142OooO0OO = true;
                    ((Oooo0OO.oo000o) zzv.zzC()).getClass();
                    d30Var.OooO0Oo("com.google.android.gms.ads.MobileAds", (int) (SystemClock.elapsedRealtime() - ((d30) this.f25318OooOo0o).f18143OooO0Oo), "", true);
                    ((d30) this.f25318OooOo0o).f18139OooO.execute(new wp0(26, this, str));
                }
                return;
            default:
                try {
                    ((bf0) this.f25318OooOo0o).zza((SQLiteDatabase) obj);
                    return;
                } catch (Exception e) {
                    zzo.zzg("Error executing function on offline buffered ping database: ".concat(String.valueOf(e.getMessage())));
                    return;
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.h90
    /* renamed from: zza */
    public void mo13707zza() {
        switch (this.f25317OooOo0O) {
            case 27:
                synchronized (((f90) this.f25318OooOo0o)) {
                    ((f90) this.f25318OooOo0o).f18900OooOooo = null;
                }
                return;
            default:
                synchronized (((ic0) this.f25318OooOo0o)) {
                    ((ic0) this.f25318OooOo0o).f20021Oooo000 = null;
                }
                return;
        }
    }

    public wj0(ByteBuffer byteBuffer) {
        this.f25317OooOo0O = 3;
        this.f25318OooOo0o = byteBuffer.slice();
    }

    public /* synthetic */ wj0(boolean z) {
        AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(0).setFlags(0).setUsage(1);
        int i = i80.f19994OooO00o;
        if (i >= 29) {
            usage.setAllowedCapturePolicy(1);
        }
        if (i >= 32) {
            usage.setSpatializationBehavior(0);
        }
        this.f25318OooOo0o = usage.build();
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAdCallback
    public void onAdFailedToShow(String str) {
        Oooo00O.o000000O.OooO0Oo("#008 Must be called on the main UI thread.");
        zzo.zze("Adapter called onAdFailedToShow.");
        zzo.zzj("Mediation ad failed to show: ".concat(String.valueOf(str)));
        try {
            ((InterfaceC1383af) this.f25318OooOo0o).zzl(str);
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.vi0
    public void zza(int i, long j) {
        ((OoooOOO.o0O0oo00) this.f25318OooOo0o).OooO0oo(i, System.currentTimeMillis() - j);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1427bm
    /* renamed from: zza */
    public void mo13708zza(Object obj) {
        switch (this.f25317OooOo0O) {
            case 7:
                zze.zza("Releasing engine reference.");
                ((C2155vd) this.f25318OooOo0o).f24948OooO0Oo.OooOOOO();
                break;
            case 15:
                InterfaceC2283yu interfaceC2283yu = (InterfaceC2283yu) obj;
                String message = ((C2027rx) this.f25318OooOo0o).getMessage();
                if (message == null) {
                    message = "Internal show error.";
                }
                interfaceC2283yu.OooO0o0(af0.Oooo0O0(12, message, null));
                break;
            case 16:
                ((InterfaceC2173vv) obj).OoooO0((C2197wi) this.f25318OooOo0o);
                break;
            case 17:
                ((InterfaceC1620gw) obj).Oooooo0((C2184w5) this.f25318OooOo0o);
                break;
            default:
                ((InterfaceC1417bc) obj).o00o0O((C1865nj) this.f25318OooOo0o);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.vp0
    public void zza(Throwable th) {
        switch (this.f25317OooOo0O) {
            case 14:
                return;
            case 21:
                synchronized (this) {
                    d30 d30Var = (d30) this.f25318OooOo0o;
                    d30Var.f18142OooO0OO = true;
                    ((Oooo0OO.oo000o) zzv.zzC()).getClass();
                    d30Var.OooO0Oo("com.google.android.gms.ads.MobileAds", (int) (SystemClock.elapsedRealtime() - ((d30) this.f25318OooOo0o).f18143OooO0Oo), "Internal Error.", false);
                    ((d30) this.f25318OooOo0o).f18145OooO0o0.zzd(new Exception());
                }
                return;
            default:
                zzo.zzg("Failed to get offline buffered ping database: ".concat(String.valueOf(th.getMessage())));
                return;
        }
    }

    private final void OoooO00(Throwable th) {
    }
}
