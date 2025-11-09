package com.google.android.gms.ads.internal.client;

import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.InterfaceC2050sj;
import com.google.android.gms.internal.ads.InterfaceC2156ve;
import com.google.android.gms.internal.ads.InterfaceC2256y3;
import java.util.List;

/* loaded from: classes2.dex */
public interface zzci extends IInterface {
    @Nullable
    InterfaceC2256y3 zze(String str) throws RemoteException;

    @Nullable
    zzby zzf(String str) throws RemoteException;

    @Nullable
    InterfaceC2050sj zzg(String str) throws RemoteException;

    void zzh(InterfaceC2156ve interfaceC2156ve) throws RemoteException;

    void zzi(List list, zzcf zzcfVar) throws RemoteException;

    boolean zzj(String str) throws RemoteException;

    boolean zzk(String str) throws RemoteException;

    boolean zzl(String str) throws RemoteException;
}
