package com.google.android.gms.ads.internal.overlay;

import Oooo00o.o000O000;
import Oooo0o.OooO0OO;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.internal.ads.AbstractC1448c7;
import com.google.android.gms.internal.ads.AbstractC2200wl;
import com.google.android.gms.internal.ads.C2246xu;
import com.google.android.gms.internal.ads.InterfaceC1401ax;
import com.google.android.gms.internal.ads.InterfaceC1605gh;
import com.google.android.gms.internal.ads.InterfaceC1722jo;
import com.google.android.gms.internal.ads.InterfaceC1746kb;
import com.google.android.gms.internal.ads.InterfaceC1783lb;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import o00Oo0oo.o00oO0o;

/* loaded from: classes2.dex */
public final class AdOverlayInfoParcel extends o000O000 implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<AdOverlayInfoParcel> CREATOR = new zzo();
    private static final AtomicLong zzy = new AtomicLong(0);
    private static final ConcurrentHashMap zzz = new ConcurrentHashMap();
    public final zzc zza;
    public final com.google.android.gms.ads.internal.client.zza zzb;
    public final zzr zzc;
    public final InterfaceC1722jo zzd;
    public final InterfaceC1783lb zze;

    @NonNull
    public final String zzf;
    public final boolean zzg;

    @NonNull
    public final String zzh;
    public final zzac zzi;
    public final int zzj;
    public final int zzk;

    @NonNull
    public final String zzl;

    @NonNull
    public final VersionInfoParcel zzm;

    @NonNull
    public final String zzn;
    public final com.google.android.gms.ads.internal.zzl zzo;
    public final InterfaceC1746kb zzp;

    @NonNull
    public final String zzq;

    @NonNull
    public final String zzr;

    @NonNull
    public final String zzs;
    public final C2246xu zzt;
    public final InterfaceC1401ax zzu;
    public final InterfaceC1605gh zzv;
    public final boolean zzw;
    public final long zzx;

    public AdOverlayInfoParcel(com.google.android.gms.ads.internal.client.zza zzaVar, zzr zzrVar, zzac zzacVar, InterfaceC1722jo interfaceC1722jo, int i, VersionInfoParcel versionInfoParcel, String str, com.google.android.gms.ads.internal.zzl zzlVar, String str2, String str3, String str4, C2246xu c2246xu, InterfaceC1605gh interfaceC1605gh, String str5) {
        this.zza = null;
        this.zzb = null;
        this.zzc = zzrVar;
        this.zzd = interfaceC1722jo;
        this.zzp = null;
        this.zze = null;
        this.zzg = false;
        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17783o0000O0)).booleanValue()) {
            this.zzf = null;
            this.zzh = null;
        } else {
            this.zzf = str2;
            this.zzh = str3;
        }
        this.zzi = null;
        this.zzj = i;
        this.zzk = 1;
        this.zzl = null;
        this.zzm = versionInfoParcel;
        this.zzn = str;
        this.zzo = zzlVar;
        this.zzq = str5;
        this.zzr = null;
        this.zzs = str4;
        this.zzt = c2246xu;
        this.zzu = null;
        this.zzv = interfaceC1605gh;
        this.zzw = false;
        this.zzx = zzy.getAndIncrement();
    }

    public static final OooO0OO OooO0o(Object obj) {
        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0o0OO0O)).booleanValue()) {
            return null;
        }
        return new OooO0OO(obj);
    }

    @Nullable
    public static AdOverlayInfoParcel zza(@NonNull Intent intent) {
        try {
            Bundle bundleExtra = intent.getBundleExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
            bundleExtra.setClassLoader(AdOverlayInfoParcel.class.getClassLoader());
            return (AdOverlayInfoParcel) bundleExtra.getParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
        } catch (Exception e) {
            if (!((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0o0OO0O)).booleanValue()) {
                return null;
            }
            com.google.android.gms.ads.internal.zzv.zzp().OooO0oo("AdOverlayInfoParcel.getFromIntent", e);
            return null;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int iOooOoO = o00oO0o.OooOoO(parcel, 20293);
        o00oO0o.OooOo00(parcel, 2, this.zza, i);
        o00oO0o.OooOOo(parcel, 3, OooO0o(this.zzb));
        o00oO0o.OooOOo(parcel, 4, OooO0o(this.zzc));
        o00oO0o.OooOOo(parcel, 5, OooO0o(this.zzd));
        o00oO0o.OooOOo(parcel, 6, OooO0o(this.zze));
        o00oO0o.OooOo0(parcel, 7, this.zzf);
        boolean z = this.zzg;
        o00oO0o.OooOooo(parcel, 8, 4);
        parcel.writeInt(z ? 1 : 0);
        o00oO0o.OooOo0(parcel, 9, this.zzh);
        o00oO0o.OooOOo(parcel, 10, OooO0o(this.zzi));
        int i2 = this.zzj;
        o00oO0o.OooOooo(parcel, 11, 4);
        parcel.writeInt(i2);
        int i3 = this.zzk;
        o00oO0o.OooOooo(parcel, 12, 4);
        parcel.writeInt(i3);
        o00oO0o.OooOo0(parcel, 13, this.zzl);
        o00oO0o.OooOo00(parcel, 14, this.zzm, i);
        o00oO0o.OooOo0(parcel, 16, this.zzn);
        o00oO0o.OooOo00(parcel, 17, this.zzo, i);
        o00oO0o.OooOOo(parcel, 18, OooO0o(this.zzp));
        o00oO0o.OooOo0(parcel, 19, this.zzq);
        o00oO0o.OooOo0(parcel, 24, this.zzr);
        o00oO0o.OooOo0(parcel, 25, this.zzs);
        o00oO0o.OooOOo(parcel, 26, OooO0o(this.zzt));
        o00oO0o.OooOOo(parcel, 27, OooO0o(this.zzu));
        o00oO0o.OooOOo(parcel, 28, OooO0o(this.zzv));
        boolean z2 = this.zzw;
        o00oO0o.OooOooo(parcel, 29, 4);
        parcel.writeInt(z2 ? 1 : 0);
        long j = this.zzx;
        o00oO0o.OooOooo(parcel, 30, 8);
        parcel.writeLong(j);
        o00oO0o.OooOoo(parcel, iOooOoO);
        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0o0OO0O)).booleanValue()) {
            zzz.put(Long.valueOf(this.zzx), new zzp(this.zzb, this.zzc, this.zzd, this.zzp, this.zze, this.zzi, this.zzt, this.zzu, this.zzv, AbstractC2200wl.f25324OooO0Oo.schedule(new zzq(this.zzx), ((Integer) zzbe.zzc().OooO00o(AbstractC1448c7.o0o0OO)).intValue(), TimeUnit.SECONDS)));
        }
    }

    public AdOverlayInfoParcel(com.google.android.gms.ads.internal.client.zza zzaVar, zzr zzrVar, zzac zzacVar, InterfaceC1722jo interfaceC1722jo, boolean z, int i, VersionInfoParcel versionInfoParcel, InterfaceC1401ax interfaceC1401ax, InterfaceC1605gh interfaceC1605gh) {
        this.zza = null;
        this.zzb = zzaVar;
        this.zzc = zzrVar;
        this.zzd = interfaceC1722jo;
        this.zzp = null;
        this.zze = null;
        this.zzf = null;
        this.zzg = z;
        this.zzh = null;
        this.zzi = zzacVar;
        this.zzj = i;
        this.zzk = 2;
        this.zzl = null;
        this.zzm = versionInfoParcel;
        this.zzn = null;
        this.zzo = null;
        this.zzq = null;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = interfaceC1401ax;
        this.zzv = interfaceC1605gh;
        this.zzw = false;
        this.zzx = zzy.getAndIncrement();
    }

    public AdOverlayInfoParcel(com.google.android.gms.ads.internal.client.zza zzaVar, zzr zzrVar, InterfaceC1746kb interfaceC1746kb, InterfaceC1783lb interfaceC1783lb, zzac zzacVar, InterfaceC1722jo interfaceC1722jo, boolean z, int i, String str, VersionInfoParcel versionInfoParcel, InterfaceC1401ax interfaceC1401ax, InterfaceC1605gh interfaceC1605gh, boolean z2) {
        this.zza = null;
        this.zzb = zzaVar;
        this.zzc = zzrVar;
        this.zzd = interfaceC1722jo;
        this.zzp = interfaceC1746kb;
        this.zze = interfaceC1783lb;
        this.zzf = null;
        this.zzg = z;
        this.zzh = null;
        this.zzi = zzacVar;
        this.zzj = i;
        this.zzk = 3;
        this.zzl = str;
        this.zzm = versionInfoParcel;
        this.zzn = null;
        this.zzo = null;
        this.zzq = null;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = interfaceC1401ax;
        this.zzv = interfaceC1605gh;
        this.zzw = z2;
        this.zzx = zzy.getAndIncrement();
    }

    public AdOverlayInfoParcel(com.google.android.gms.ads.internal.client.zza zzaVar, zzr zzrVar, InterfaceC1746kb interfaceC1746kb, InterfaceC1783lb interfaceC1783lb, zzac zzacVar, InterfaceC1722jo interfaceC1722jo, boolean z, int i, String str, String str2, VersionInfoParcel versionInfoParcel, InterfaceC1401ax interfaceC1401ax, InterfaceC1605gh interfaceC1605gh) {
        this.zza = null;
        this.zzb = zzaVar;
        this.zzc = zzrVar;
        this.zzd = interfaceC1722jo;
        this.zzp = interfaceC1746kb;
        this.zze = interfaceC1783lb;
        this.zzf = str2;
        this.zzg = z;
        this.zzh = str;
        this.zzi = zzacVar;
        this.zzj = i;
        this.zzk = 3;
        this.zzl = null;
        this.zzm = versionInfoParcel;
        this.zzn = null;
        this.zzo = null;
        this.zzq = null;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = interfaceC1401ax;
        this.zzv = interfaceC1605gh;
        this.zzw = false;
        this.zzx = zzy.getAndIncrement();
    }

    public AdOverlayInfoParcel(zzc zzcVar, IBinder iBinder, IBinder iBinder2, IBinder iBinder3, IBinder iBinder4, String str, boolean z, String str2, IBinder iBinder5, int i, int i2, String str3, VersionInfoParcel versionInfoParcel, String str4, com.google.android.gms.ads.internal.zzl zzlVar, IBinder iBinder6, String str5, String str6, String str7, IBinder iBinder7, IBinder iBinder8, IBinder iBinder9, boolean z2, long j) {
        this.zza = zzcVar;
        this.zzf = str;
        this.zzg = z;
        this.zzh = str2;
        this.zzj = i;
        this.zzk = i2;
        this.zzl = str3;
        this.zzm = versionInfoParcel;
        this.zzn = str4;
        this.zzo = zzlVar;
        this.zzq = str5;
        this.zzr = str6;
        this.zzs = str7;
        this.zzw = z2;
        this.zzx = j;
        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0o0OO0O)).booleanValue()) {
            zzp zzpVar = (zzp) zzz.remove(Long.valueOf(j));
            if (zzpVar != null) {
                this.zzb = zzpVar.f16148OooO00o;
                this.zzc = zzpVar.f16149OooO0O0;
                this.zzd = zzpVar.f16150OooO0OO;
                this.zzp = zzpVar.f16151OooO0Oo;
                this.zze = zzpVar.f16153OooO0o0;
                this.zzt = zzpVar.f16154OooO0oO;
                this.zzu = zzpVar.f16155OooO0oo;
                this.zzv = zzpVar.f16147OooO;
                this.zzi = zzpVar.f16152OooO0o;
                zzpVar.f16156OooOO0.cancel(false);
                return;
            }
            throw new NullPointerException("AdOverlayObjects is null");
        }
        this.zzb = (com.google.android.gms.ads.internal.client.zza) OooO0OO.o000O0oO(OooO0OO.o000O0o0(iBinder));
        this.zzc = (zzr) OooO0OO.o000O0oO(OooO0OO.o000O0o0(iBinder2));
        this.zzd = (InterfaceC1722jo) OooO0OO.o000O0oO(OooO0OO.o000O0o0(iBinder3));
        this.zzp = (InterfaceC1746kb) OooO0OO.o000O0oO(OooO0OO.o000O0o0(iBinder6));
        this.zze = (InterfaceC1783lb) OooO0OO.o000O0oO(OooO0OO.o000O0o0(iBinder4));
        this.zzi = (zzac) OooO0OO.o000O0oO(OooO0OO.o000O0o0(iBinder5));
        this.zzt = (C2246xu) OooO0OO.o000O0oO(OooO0OO.o000O0o0(iBinder7));
        this.zzu = (InterfaceC1401ax) OooO0OO.o000O0oO(OooO0OO.o000O0o0(iBinder8));
        this.zzv = (InterfaceC1605gh) OooO0OO.o000O0oO(OooO0OO.o000O0o0(iBinder9));
    }

    public AdOverlayInfoParcel(zzc zzcVar, com.google.android.gms.ads.internal.client.zza zzaVar, zzr zzrVar, zzac zzacVar, VersionInfoParcel versionInfoParcel, InterfaceC1722jo interfaceC1722jo, InterfaceC1401ax interfaceC1401ax, String str) {
        this.zza = zzcVar;
        this.zzb = zzaVar;
        this.zzc = zzrVar;
        this.zzd = interfaceC1722jo;
        this.zzp = null;
        this.zze = null;
        this.zzf = null;
        this.zzg = false;
        this.zzh = null;
        this.zzi = zzacVar;
        this.zzj = -1;
        this.zzk = 4;
        this.zzl = null;
        this.zzm = versionInfoParcel;
        this.zzn = null;
        this.zzo = null;
        this.zzq = str;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = interfaceC1401ax;
        this.zzv = null;
        this.zzw = false;
        this.zzx = zzy.getAndIncrement();
    }

    public AdOverlayInfoParcel(zzr zzrVar, InterfaceC1722jo interfaceC1722jo, int i, VersionInfoParcel versionInfoParcel) {
        this.zzc = zzrVar;
        this.zzd = interfaceC1722jo;
        this.zzj = 1;
        this.zzm = versionInfoParcel;
        this.zza = null;
        this.zzb = null;
        this.zzp = null;
        this.zze = null;
        this.zzf = null;
        this.zzg = false;
        this.zzh = null;
        this.zzi = null;
        this.zzk = 1;
        this.zzl = null;
        this.zzn = null;
        this.zzo = null;
        this.zzq = null;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = null;
        this.zzv = null;
        this.zzw = false;
        this.zzx = zzy.getAndIncrement();
    }

    public AdOverlayInfoParcel(InterfaceC1722jo interfaceC1722jo, VersionInfoParcel versionInfoParcel, String str, String str2, int i, InterfaceC1605gh interfaceC1605gh) {
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
        this.zzd = interfaceC1722jo;
        this.zzp = null;
        this.zze = null;
        this.zzf = null;
        this.zzg = false;
        this.zzh = null;
        this.zzi = null;
        this.zzj = 14;
        this.zzk = 5;
        this.zzl = null;
        this.zzm = versionInfoParcel;
        this.zzn = null;
        this.zzo = null;
        this.zzq = str;
        this.zzr = str2;
        this.zzs = null;
        this.zzt = null;
        this.zzu = null;
        this.zzv = interfaceC1605gh;
        this.zzw = false;
        this.zzx = zzy.getAndIncrement();
    }
}
