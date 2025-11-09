package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.View;
import androidx.core.app.NotificationCompat;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.ln */
/* loaded from: classes2.dex */
public final class RunnableC1795ln implements Runnable {

    /* renamed from: OooOo */
    public final /* synthetic */ Object f20908OooOo;

    /* renamed from: OooOo0O */
    public final /* synthetic */ int f20909OooOo0O = 2;

    /* renamed from: OooOo0o */
    public final /* synthetic */ int f20910OooOo0o;

    /* renamed from: OooOoO */
    public final /* synthetic */ Object f20911OooOoO;

    /* renamed from: OooOoO0 */
    public final /* synthetic */ Object f20912OooOoO0;

    public RunnableC1795ln(AbstractC1869nn abstractC1869nn, String str, String str2, int i) {
        this.f20908OooOo = str;
        this.f20912OooOoO0 = str2;
        this.f20910OooOo0o = i;
        this.f20911OooOoO = abstractC1869nn;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f20909OooOo0O) {
            case 0:
                HashMap mapOooOOo = androidx.datastore.preferences.protobuf.OooO00o.OooOOo(NotificationCompat.CATEGORY_EVENT, "precacheComplete");
                mapOooOOo.put("src", (String) this.f20908OooOo);
                mapOooOOo.put("cachedSrc", (String) this.f20912OooOoO0);
                mapOooOOo.put("totalBytes", Integer.toString(this.f20910OooOo0o));
                AbstractC1869nn.OooO0oo((AbstractC1869nn) this.f20911OooOoO, mapOooOOo);
                return;
            case 1:
                ((AbstractC1870no) this.f20908OooOo).OoooO0O((View) this.f20912OooOoO0, (InterfaceC1792lk) this.f20911OooOoO, this.f20910OooOo0o - 1);
                return;
            default:
                gk0 gk0Var = (gk0) this.f20912OooOoO0;
                int i = this.f20910OooOo0o;
                ok0 ok0Var = (ok0) this.f20911OooOoO;
                kk0 kk0Var = (kk0) this.f20908OooOo;
                String str = kk0Var.f20614OooO0O0;
                try {
                    C1643hi c1643hi = kk0Var.f20613OooO00o;
                    if (c1643hi == null) {
                        throw null;
                    }
                    bk0 bk0Var = (bk0) c1643hi.f19794OooOooo;
                    if (bk0Var == null) {
                        return;
                    }
                    Bundle bundle = new Bundle();
                    bundle.putString("callerPackage", str);
                    bundle.putInt("displayMode", i);
                    kk0.OooO0O0(gk0Var.f19375OooO00o, new ik0(0, bundle));
                    kk0.OooO0O0(gk0Var.f19376OooO0O0, new ik0(5, bundle));
                    jk0 jk0Var = new jk0(kk0Var, ok0Var);
                    zj0 zj0Var = (zj0) bk0Var;
                    Parcel parcelOooO = zj0Var.OooO();
                    AbstractC2218x2.OooO0OO(parcelOooO, bundle);
                    AbstractC2218x2.OooO0o0(parcelOooO, jk0Var);
                    zj0Var.o000O0O0(parcelOooO, 3);
                    return;
                } catch (RemoteException e) {
                    kk0.f20611OooO0OO.OooO0O0(e, "switchDisplayMode overlay display to %d from: %s", Integer.valueOf(i), str);
                    return;
                }
        }
    }

    public /* synthetic */ RunnableC1795ln(AbstractC1870no abstractC1870no, View view, InterfaceC1792lk interfaceC1792lk, int i) {
        this.f20908OooOo = abstractC1870no;
        this.f20912OooOoO0 = view;
        this.f20911OooOoO = interfaceC1792lk;
        this.f20910OooOo0o = i;
    }

    public /* synthetic */ RunnableC1795ln(kk0 kk0Var, gk0 gk0Var, int i, ok0 ok0Var) {
        this.f20908OooOo = kk0Var;
        this.f20912OooOoO0 = gk0Var;
        this.f20910OooOo0o = i;
        this.f20911OooOoO = ok0Var;
    }
}
