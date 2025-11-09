package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class zzez extends zzdg {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final String f16081OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final String f16082OooOo0o;

    public zzez(String str, String str2) {
        this.f16081OooOo0O = str;
        this.f16082OooOo0o = str2;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdh
    public final String zze() throws RemoteException {
        return this.f16081OooOo0O;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdh
    public final String zzf() throws RemoteException {
        return this.f16082OooOo0o;
    }
}
