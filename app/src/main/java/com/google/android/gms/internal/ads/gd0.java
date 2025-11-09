package com.google.android.gms.internal.ads;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzcc;
import com.google.android.gms.ads.internal.client.zzdo;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;

/* loaded from: classes2.dex */
public final class gd0 implements OnAdMetadataChangedListener {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ AbstractBinderC2181w2 f19322OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f19323OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ IInterface f19324OooOo0o;

    public /* synthetic */ gd0(AbstractBinderC2181w2 abstractBinderC2181w2, IInterface iInterface, int i) {
        this.f19323OooOo0O = i;
        this.f19324OooOo0o = iInterface;
        this.f19322OooOo = abstractBinderC2181w2;
    }

    @Override // com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener
    public final void onAdMetadataChanged() {
        switch (this.f19323OooOo0O) {
            case 0:
                if (((hd0) this.f19322OooOo).f19712OooOooO != null) {
                    try {
                        ((zzdo) this.f19324OooOo0o).zze();
                        break;
                    } catch (RemoteException e) {
                        zzo.zzl("#007 Could not call remote method.", e);
                        return;
                    }
                }
                break;
            default:
                if (((id0) this.f19322OooOo).f20026OooOoO0 != null) {
                    try {
                        ((zzcc) this.f19324OooOo0o).zze();
                        break;
                    } catch (RemoteException e2) {
                        zzo.zzl("#007 Could not call remote method.", e2);
                    }
                }
                break;
        }
    }
}
