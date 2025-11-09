package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzef;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.client.zzs;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.ki */
/* loaded from: classes2.dex */
public final class C1753ki extends Oooo00o.o000O000 {
    public static final Parcelable.Creator<C1753ki> CREATOR = new C1569fi(1);
    public final long zzA;
    public final String zzB;
    public final float zzC;
    public final int zzD;
    public final int zzE;
    public final boolean zzF;
    public final String zzG;
    public final boolean zzH;
    public final String zzI;
    public final boolean zzJ;
    public final int zzK;
    public final Bundle zzL;
    public final String zzM;

    @Nullable
    public final zzef zzN;
    public final boolean zzO;
    public final Bundle zzP;

    @Nullable
    public final String zzQ;

    @Nullable
    public final String zzR;

    @Nullable
    public final String zzS;
    public final boolean zzT;
    public final List zzU;
    public final String zzV;
    public final List zzW;
    public final int zzX;
    public final boolean zzY;
    public final boolean zzZ;
    public final int zza;
    public final boolean zzaa;
    public final ArrayList zzab;
    public final String zzac;
    public final C1418bd zzad;

    @Nullable
    public final String zzae;
    public final Bundle zzaf;

    @Nullable
    public final Bundle zzb;
    public final zzm zzc;
    public final zzs zzd;
    public final String zze;
    public final ApplicationInfo zzf;

    @Nullable
    public final PackageInfo zzg;
    public final String zzh;
    public final String zzi;
    public final String zzj;
    public final VersionInfoParcel zzk;
    public final Bundle zzl;
    public final int zzm;
    public final List zzn;
    public final Bundle zzo;
    public final boolean zzp;
    public final int zzq;
    public final int zzr;
    public final float zzs;
    public final String zzt;
    public final long zzu;
    public final String zzv;

    @Nullable
    public final List zzw;
    public final String zzx;
    public final C1414b9 zzy;
    public final List zzz;

    public C1753ki(int i, Bundle bundle, zzm zzmVar, zzs zzsVar, String str, ApplicationInfo applicationInfo, PackageInfo packageInfo, String str2, String str3, String str4, VersionInfoParcel versionInfoParcel, Bundle bundle2, int i2, ArrayList arrayList, Bundle bundle3, boolean z, int i3, int i4, float f, String str5, long j, String str6, ArrayList arrayList2, String str7, C1414b9 c1414b9, ArrayList arrayList3, long j2, String str8, float f2, boolean z2, int i5, int i6, boolean z3, String str9, String str10, boolean z4, int i7, Bundle bundle4, String str11, zzef zzefVar, boolean z5, Bundle bundle5, String str12, String str13, String str14, boolean z6, ArrayList arrayList4, String str15, ArrayList arrayList5, int i8, boolean z7, boolean z8, boolean z9, ArrayList arrayList6, String str16, C1418bd c1418bd, String str17, Bundle bundle6) {
        this.zza = i;
        this.zzb = bundle;
        this.zzc = zzmVar;
        this.zzd = zzsVar;
        this.zze = str;
        this.zzf = applicationInfo;
        this.zzg = packageInfo;
        this.zzh = str2;
        this.zzi = str3;
        this.zzj = str4;
        this.zzk = versionInfoParcel;
        this.zzl = bundle2;
        this.zzm = i2;
        this.zzn = arrayList;
        this.zzz = arrayList3 == null ? Collections.EMPTY_LIST : Collections.unmodifiableList(arrayList3);
        this.zzo = bundle3;
        this.zzp = z;
        this.zzq = i3;
        this.zzr = i4;
        this.zzs = f;
        this.zzt = str5;
        this.zzu = j;
        this.zzv = str6;
        this.zzw = arrayList2 == null ? Collections.EMPTY_LIST : Collections.unmodifiableList(arrayList2);
        this.zzx = str7;
        this.zzy = c1414b9;
        this.zzA = j2;
        this.zzB = str8;
        this.zzC = f2;
        this.zzH = z2;
        this.zzD = i5;
        this.zzE = i6;
        this.zzF = z3;
        this.zzG = str9;
        this.zzI = str10;
        this.zzJ = z4;
        this.zzK = i7;
        this.zzL = bundle4;
        this.zzM = str11;
        this.zzN = zzefVar;
        this.zzO = z5;
        this.zzP = bundle5;
        this.zzQ = str12;
        this.zzR = str13;
        this.zzS = str14;
        this.zzT = z6;
        this.zzU = arrayList4;
        this.zzV = str15;
        this.zzW = arrayList5;
        this.zzX = i8;
        this.zzY = z7;
        this.zzZ = z8;
        this.zzaa = z9;
        this.zzab = arrayList6;
        this.zzac = str16;
        this.zzad = c1418bd;
        this.zzae = str17;
        this.zzaf = bundle6;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.zza;
        int iOooOoO = o00Oo0oo.o00oO0o.OooOoO(parcel, 20293);
        o00Oo0oo.o00oO0o.OooOooo(parcel, 1, 4);
        parcel.writeInt(i2);
        o00Oo0oo.o00oO0o.OooOOOo(2, this.zzb, parcel);
        o00Oo0oo.o00oO0o.OooOo00(parcel, 3, this.zzc, i);
        o00Oo0oo.o00oO0o.OooOo00(parcel, 4, this.zzd, i);
        o00Oo0oo.o00oO0o.OooOo0(parcel, 5, this.zze);
        o00Oo0oo.o00oO0o.OooOo00(parcel, 6, this.zzf, i);
        o00Oo0oo.o00oO0o.OooOo00(parcel, 7, this.zzg, i);
        o00Oo0oo.o00oO0o.OooOo0(parcel, 8, this.zzh);
        o00Oo0oo.o00oO0o.OooOo0(parcel, 9, this.zzi);
        o00Oo0oo.o00oO0o.OooOo0(parcel, 10, this.zzj);
        o00Oo0oo.o00oO0o.OooOo00(parcel, 11, this.zzk, i);
        o00Oo0oo.o00oO0o.OooOOOo(12, this.zzl, parcel);
        int i3 = this.zzm;
        o00Oo0oo.o00oO0o.OooOooo(parcel, 13, 4);
        parcel.writeInt(i3);
        o00Oo0oo.o00oO0o.OooOo0o(parcel, 14, this.zzn);
        o00Oo0oo.o00oO0o.OooOOOo(15, this.zzo, parcel);
        boolean z = this.zzp;
        o00Oo0oo.o00oO0o.OooOooo(parcel, 16, 4);
        parcel.writeInt(z ? 1 : 0);
        int i4 = this.zzq;
        o00Oo0oo.o00oO0o.OooOooo(parcel, 18, 4);
        parcel.writeInt(i4);
        int i5 = this.zzr;
        o00Oo0oo.o00oO0o.OooOooo(parcel, 19, 4);
        parcel.writeInt(i5);
        float f = this.zzs;
        o00Oo0oo.o00oO0o.OooOooo(parcel, 20, 4);
        parcel.writeFloat(f);
        o00Oo0oo.o00oO0o.OooOo0(parcel, 21, this.zzt);
        long j = this.zzu;
        o00Oo0oo.o00oO0o.OooOooo(parcel, 25, 8);
        parcel.writeLong(j);
        o00Oo0oo.o00oO0o.OooOo0(parcel, 26, this.zzv);
        o00Oo0oo.o00oO0o.OooOo0o(parcel, 27, this.zzw);
        o00Oo0oo.o00oO0o.OooOo0(parcel, 28, this.zzx);
        o00Oo0oo.o00oO0o.OooOo00(parcel, 29, this.zzy, i);
        o00Oo0oo.o00oO0o.OooOo0o(parcel, 30, this.zzz);
        long j2 = this.zzA;
        o00Oo0oo.o00oO0o.OooOooo(parcel, 31, 8);
        parcel.writeLong(j2);
        o00Oo0oo.o00oO0o.OooOo0(parcel, 33, this.zzB);
        float f2 = this.zzC;
        o00Oo0oo.o00oO0o.OooOooo(parcel, 34, 4);
        parcel.writeFloat(f2);
        int i6 = this.zzD;
        o00Oo0oo.o00oO0o.OooOooo(parcel, 35, 4);
        parcel.writeInt(i6);
        int i7 = this.zzE;
        o00Oo0oo.o00oO0o.OooOooo(parcel, 36, 4);
        parcel.writeInt(i7);
        boolean z2 = this.zzF;
        o00Oo0oo.o00oO0o.OooOooo(parcel, 37, 4);
        parcel.writeInt(z2 ? 1 : 0);
        o00Oo0oo.o00oO0o.OooOo0(parcel, 39, this.zzG);
        boolean z3 = this.zzH;
        o00Oo0oo.o00oO0o.OooOooo(parcel, 40, 4);
        parcel.writeInt(z3 ? 1 : 0);
        o00Oo0oo.o00oO0o.OooOo0(parcel, 41, this.zzI);
        boolean z4 = this.zzJ;
        o00Oo0oo.o00oO0o.OooOooo(parcel, 42, 4);
        parcel.writeInt(z4 ? 1 : 0);
        int i8 = this.zzK;
        o00Oo0oo.o00oO0o.OooOooo(parcel, 43, 4);
        parcel.writeInt(i8);
        o00Oo0oo.o00oO0o.OooOOOo(44, this.zzL, parcel);
        o00Oo0oo.o00oO0o.OooOo0(parcel, 45, this.zzM);
        o00Oo0oo.o00oO0o.OooOo00(parcel, 46, this.zzN, i);
        boolean z5 = this.zzO;
        o00Oo0oo.o00oO0o.OooOooo(parcel, 47, 4);
        parcel.writeInt(z5 ? 1 : 0);
        o00Oo0oo.o00oO0o.OooOOOo(48, this.zzP, parcel);
        o00Oo0oo.o00oO0o.OooOo0(parcel, 49, this.zzQ);
        o00Oo0oo.o00oO0o.OooOo0(parcel, 50, this.zzR);
        o00Oo0oo.o00oO0o.OooOo0(parcel, 51, this.zzS);
        boolean z6 = this.zzT;
        o00Oo0oo.o00oO0o.OooOooo(parcel, 52, 4);
        parcel.writeInt(z6 ? 1 : 0);
        o00Oo0oo.o00oO0o.OooOOoo(parcel, 53, this.zzU);
        o00Oo0oo.o00oO0o.OooOo0(parcel, 54, this.zzV);
        o00Oo0oo.o00oO0o.OooOo0o(parcel, 55, this.zzW);
        int i9 = this.zzX;
        o00Oo0oo.o00oO0o.OooOooo(parcel, 56, 4);
        parcel.writeInt(i9);
        boolean z7 = this.zzY;
        o00Oo0oo.o00oO0o.OooOooo(parcel, 57, 4);
        parcel.writeInt(z7 ? 1 : 0);
        boolean z8 = this.zzZ;
        o00Oo0oo.o00oO0o.OooOooo(parcel, 58, 4);
        parcel.writeInt(z8 ? 1 : 0);
        boolean z9 = this.zzaa;
        o00Oo0oo.o00oO0o.OooOooo(parcel, 59, 4);
        parcel.writeInt(z9 ? 1 : 0);
        o00Oo0oo.o00oO0o.OooOo0o(parcel, 60, this.zzab);
        o00Oo0oo.o00oO0o.OooOo0(parcel, 61, this.zzac);
        o00Oo0oo.o00oO0o.OooOo00(parcel, 63, this.zzad, i);
        o00Oo0oo.o00oO0o.OooOo0(parcel, 64, this.zzae);
        o00Oo0oo.o00oO0o.OooOOOo(65, this.zzaf, parcel);
        o00Oo0oo.o00oO0o.OooOoo(parcel, iOooOoO);
    }
}
