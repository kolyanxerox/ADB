package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.internal.ads.AbstractBinderC2181w2;
import com.google.android.gms.internal.ads.AbstractC2218x2;
import com.google.android.gms.internal.ads.C1414b9;
import com.google.android.gms.internal.ads.C1418bd;
import com.google.android.gms.internal.ads.C1488da;
import com.google.android.gms.internal.ads.C1561fa;
import com.google.android.gms.internal.ads.C1564fd;
import com.google.android.gms.internal.ads.C1635ha;
import com.google.android.gms.internal.ads.C1745ka;
import com.google.android.gms.internal.ads.C1894oa;
import com.google.android.gms.internal.ads.C1967qa;
import com.google.android.gms.internal.ads.InterfaceC1524ea;
import com.google.android.gms.internal.ads.InterfaceC1598ga;
import com.google.android.gms.internal.ads.InterfaceC1601gd;
import com.google.android.gms.internal.ads.InterfaceC1708ja;
import com.google.android.gms.internal.ads.InterfaceC1819ma;
import com.google.android.gms.internal.ads.InterfaceC1930pa;
import com.google.android.gms.internal.ads.InterfaceC2041sa;

/* loaded from: classes2.dex */
public abstract class zzbt extends AbstractBinderC2181w2 implements zzbu {
    public zzbt() {
        super("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2181w2
    public final boolean o000OO0O(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        InterfaceC1819ma c1745ka;
        zzbl zzbjVar = null;
        InterfaceC1601gd c1564fd = null;
        InterfaceC2041sa c1967qa = null;
        InterfaceC1930pa c1894oa = null;
        zzcq zzcqVar = null;
        InterfaceC1708ja c1635ha = null;
        InterfaceC1598ga c1561fa = null;
        InterfaceC1524ea c1488da = null;
        switch (i) {
            case 1:
                zzbr zzbrVarZze = zze();
                parcel2.writeNoException();
                AbstractC2218x2.OooO0o0(parcel2, zzbrVarZze);
                return true;
            case 2:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    zzbjVar = iInterfaceQueryLocalInterface instanceof zzbl ? (zzbl) iInterfaceQueryLocalInterface : new zzbj(strongBinder);
                }
                AbstractC2218x2.OooO0O0(parcel);
                zzl(zzbjVar);
                parcel2.writeNoException();
                return true;
            case 3:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
                    c1488da = iInterfaceQueryLocalInterface2 instanceof InterfaceC1524ea ? (InterfaceC1524ea) iInterfaceQueryLocalInterface2 : new C1488da(strongBinder2, "com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
                }
                AbstractC2218x2.OooO0O0(parcel);
                zzf(c1488da);
                parcel2.writeNoException();
                return true;
            case 4:
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
                    c1561fa = iInterfaceQueryLocalInterface3 instanceof InterfaceC1598ga ? (InterfaceC1598ga) iInterfaceQueryLocalInterface3 : new C1561fa(strongBinder3, "com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
                }
                AbstractC2218x2.OooO0O0(parcel);
                zzg(c1561fa);
                parcel2.writeNoException();
                return true;
            case 5:
                String string = parcel.readString();
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 == null) {
                    c1745ka = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
                    c1745ka = iInterfaceQueryLocalInterface4 instanceof InterfaceC1819ma ? (InterfaceC1819ma) iInterfaceQueryLocalInterface4 : new C1745ka(strongBinder4, "com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
                }
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
                    c1635ha = iInterfaceQueryLocalInterface5 instanceof InterfaceC1708ja ? (InterfaceC1708ja) iInterfaceQueryLocalInterface5 : new C1635ha(strongBinder5, "com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
                }
                AbstractC2218x2.OooO0O0(parcel);
                zzh(string, c1745ka, c1635ha);
                parcel2.writeNoException();
                return true;
            case 6:
                C1414b9 c1414b9 = (C1414b9) AbstractC2218x2.OooO00o(parcel, C1414b9.CREATOR);
                AbstractC2218x2.OooO0O0(parcel);
                zzo(c1414b9);
                parcel2.writeNoException();
                return true;
            case 7:
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    zzcqVar = iInterfaceQueryLocalInterface6 instanceof zzcq ? (zzcq) iInterfaceQueryLocalInterface6 : new zzcq(strongBinder6);
                }
                AbstractC2218x2.OooO0O0(parcel);
                zzq(zzcqVar);
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 != null) {
                    IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
                    c1894oa = iInterfaceQueryLocalInterface7 instanceof InterfaceC1930pa ? (InterfaceC1930pa) iInterfaceQueryLocalInterface7 : new C1894oa(strongBinder7, "com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
                }
                zzs zzsVar = (zzs) AbstractC2218x2.OooO00o(parcel, zzs.CREATOR);
                AbstractC2218x2.OooO0O0(parcel);
                zzj(c1894oa, zzsVar);
                parcel2.writeNoException();
                return true;
            case 9:
                PublisherAdViewOptions publisherAdViewOptions = (PublisherAdViewOptions) AbstractC2218x2.OooO00o(parcel, PublisherAdViewOptions.CREATOR);
                AbstractC2218x2.OooO0O0(parcel);
                zzp(publisherAdViewOptions);
                parcel2.writeNoException();
                return true;
            case 10:
                IBinder strongBinder8 = parcel.readStrongBinder();
                if (strongBinder8 != null) {
                    IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
                    c1967qa = iInterfaceQueryLocalInterface8 instanceof InterfaceC2041sa ? (InterfaceC2041sa) iInterfaceQueryLocalInterface8 : new C1967qa(strongBinder8, "com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
                }
                AbstractC2218x2.OooO0O0(parcel);
                zzk(c1967qa);
                parcel2.writeNoException();
                return true;
            case 11:
            case 12:
            default:
                return false;
            case 13:
                C1418bd c1418bd = (C1418bd) AbstractC2218x2.OooO00o(parcel, C1418bd.CREATOR);
                AbstractC2218x2.OooO0O0(parcel);
                zzn(c1418bd);
                parcel2.writeNoException();
                return true;
            case 14:
                IBinder strongBinder9 = parcel.readStrongBinder();
                if (strongBinder9 != null) {
                    IInterface iInterfaceQueryLocalInterface9 = strongBinder9.queryLocalInterface("com.google.android.gms.ads.internal.instream.client.IInstreamAdLoadCallback");
                    c1564fd = iInterfaceQueryLocalInterface9 instanceof InterfaceC1601gd ? (InterfaceC1601gd) iInterfaceQueryLocalInterface9 : new C1564fd(strongBinder9, "com.google.android.gms.ads.internal.instream.client.IInstreamAdLoadCallback");
                }
                AbstractC2218x2.OooO0O0(parcel);
                zzi(c1564fd);
                parcel2.writeNoException();
                return true;
            case 15:
                AdManagerAdViewOptions adManagerAdViewOptions = (AdManagerAdViewOptions) AbstractC2218x2.OooO00o(parcel, AdManagerAdViewOptions.CREATOR);
                AbstractC2218x2.OooO0O0(parcel);
                zzm(adManagerAdViewOptions);
                parcel2.writeNoException();
                return true;
        }
    }
}
