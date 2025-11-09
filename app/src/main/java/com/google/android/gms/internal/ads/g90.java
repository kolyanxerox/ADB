package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.util.client.zzo;

/* loaded from: classes2.dex */
public final /* synthetic */ class g90 implements InterfaceC2135uu {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ c90 f19281OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1601gd f19282OooOo0o;

    public /* synthetic */ g90(c90 c90Var, InterfaceC1601gd interfaceC1601gd) {
        this.f19281OooOo0O = c90Var;
        this.f19282OooOo0o = interfaceC1601gd;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2135uu
    public final void o0OOO0o(zze zzeVar) {
        this.f19281OooOo0O.o0OOO0o(zzeVar);
        InterfaceC1601gd interfaceC1601gd = this.f19282OooOo0o;
        if (interfaceC1601gd != null) {
            try {
                C1564fd c1564fd = (C1564fd) interfaceC1601gd;
                Parcel parcelOooO = c1564fd.OooO();
                AbstractC2218x2.OooO0OO(parcelOooO, zzeVar);
                c1564fd.o000OO0O(parcelOooO, 3);
            } catch (RemoteException e) {
                zzo.zzl("#007 Could not call remote method.", e);
            }
        }
        if (interfaceC1601gd != null) {
            try {
                int i = zzeVar.zza;
                C1564fd c1564fd2 = (C1564fd) interfaceC1601gd;
                Parcel parcelOooO2 = c1564fd2.OooO();
                parcelOooO2.writeInt(i);
                c1564fd2.o000OO0O(parcelOooO2, 2);
            } catch (RemoteException e2) {
                zzo.zzl("#007 Could not call remote method.", e2);
            }
        }
    }
}
