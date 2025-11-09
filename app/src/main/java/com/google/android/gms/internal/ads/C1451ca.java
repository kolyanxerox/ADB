package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.MediaView;
import com.google.android.gms.ads.internal.util.client.zzo;

/* renamed from: com.google.android.gms.internal.ads.ca */
/* loaded from: classes2.dex */
public final class C1451ca {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final InterfaceC1415ba f17977OooO00o;

    public C1451ca(InterfaceC1415ba interfaceC1415ba) {
        Context context;
        this.f17977OooO00o = interfaceC1415ba;
        try {
            context = (Context) Oooo0o.OooO0OO.o000O0oO(interfaceC1415ba.zzh());
        } catch (RemoteException | NullPointerException e) {
            zzo.zzh("", e);
            context = null;
        }
        if (context != null) {
            try {
                this.f17977OooO00o.OooOOO0(new Oooo0o.OooO0OO(new MediaView(context)));
            } catch (RemoteException e2) {
                zzo.zzh("", e2);
            }
        }
    }
}
