package com.google.android.gms.ads.internal.client;

import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.internal.ads.C1414b9;
import com.google.android.gms.internal.ads.C1418bd;
import com.google.android.gms.internal.ads.InterfaceC1524ea;
import com.google.android.gms.internal.ads.InterfaceC1598ga;
import com.google.android.gms.internal.ads.InterfaceC1601gd;
import com.google.android.gms.internal.ads.InterfaceC1708ja;
import com.google.android.gms.internal.ads.InterfaceC1819ma;
import com.google.android.gms.internal.ads.InterfaceC1930pa;
import com.google.android.gms.internal.ads.InterfaceC2041sa;

/* loaded from: classes2.dex */
public interface zzbu extends IInterface {
    zzbr zze() throws RemoteException;

    void zzf(InterfaceC1524ea interfaceC1524ea) throws RemoteException;

    void zzg(InterfaceC1598ga interfaceC1598ga) throws RemoteException;

    void zzh(String str, InterfaceC1819ma interfaceC1819ma, @Nullable InterfaceC1708ja interfaceC1708ja) throws RemoteException;

    void zzi(InterfaceC1601gd interfaceC1601gd) throws RemoteException;

    void zzj(InterfaceC1930pa interfaceC1930pa, zzs zzsVar) throws RemoteException;

    void zzk(InterfaceC2041sa interfaceC2041sa) throws RemoteException;

    void zzl(zzbl zzblVar) throws RemoteException;

    void zzm(AdManagerAdViewOptions adManagerAdViewOptions) throws RemoteException;

    void zzn(C1418bd c1418bd) throws RemoteException;

    void zzo(C1414b9 c1414b9) throws RemoteException;

    void zzp(PublisherAdViewOptions publisherAdViewOptions) throws RemoteException;

    void zzq(zzcq zzcqVar) throws RemoteException;
}
