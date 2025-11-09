package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzo;

/* renamed from: com.google.android.gms.internal.ads.ly */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC1806ly implements Runnable {

    /* renamed from: OooOo0O */
    public final /* synthetic */ int f20979OooOo0O;

    /* renamed from: OooOo0o */
    public final /* synthetic */ C1917oy f20980OooOo0o;

    public /* synthetic */ RunnableC1806ly(C1917oy c1917oy, int i) {
        this.f20979OooOo0O = i;
        this.f20980OooOo0o = c1917oy;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f20979OooOo0O) {
            case 0:
                C1917oy c1917oy = this.f20980OooOo0o;
                try {
                    C2065sy c2065sy = c1917oy.f23140OooOO0O;
                    int iOooO0oO = c2065sy.OooO0oO();
                    C2213wy c2213wy = c1917oy.f23143OooOOOO;
                    if (iOooO0oO == 1) {
                        InterfaceC1598ga interfaceC1598ga = c2213wy.f25421OooO00o;
                        if (interfaceC1598ga != null) {
                            c1917oy.OooOO0O();
                            InterfaceC2299z9 interfaceC2299z9 = (InterfaceC2299z9) c1917oy.f23144OooOOOo.zzb();
                            C1561fa c1561fa = (C1561fa) interfaceC1598ga;
                            Parcel parcelOooO = c1561fa.OooO();
                            AbstractC2218x2.OooO0o0(parcelOooO, interfaceC2299z9);
                            c1561fa.o000OO0O(parcelOooO, 1);
                            return;
                        }
                        return;
                    }
                    if (iOooO0oO == 2) {
                        InterfaceC1524ea interfaceC1524ea = c2213wy.f25422OooO0O0;
                        if (interfaceC1524ea != null) {
                            c1917oy.OooOO0O();
                            InterfaceC2262y9 interfaceC2262y9 = (InterfaceC2262y9) c1917oy.f23146OooOOo0.zzb();
                            C1488da c1488da = (C1488da) interfaceC1524ea;
                            Parcel parcelOooO2 = c1488da.OooO();
                            AbstractC2218x2.OooO0o0(parcelOooO2, interfaceC2262y9);
                            c1488da.o000OO0O(parcelOooO2, 1);
                            return;
                        }
                        return;
                    }
                    if (iOooO0oO == 3) {
                        String strOooO00o = c2065sy.OooO00o();
                        InterfaceC1819ma interfaceC1819ma = strOooO00o == null ? null : (InterfaceC1819ma) c2213wy.f25425OooO0o.get(strOooO00o);
                        if (interfaceC1819ma != null) {
                            if (c1917oy.f23140OooOO0O.OooOOO0() != null) {
                                c1917oy.OooOOo0("Google", true);
                            }
                            interfaceC1819ma.o000oOoO((InterfaceC1415ba) c1917oy.f23149OooOo00.zzb());
                            return;
                        }
                        return;
                    }
                    if (iOooO0oO == 6) {
                        InterfaceC2041sa interfaceC2041sa = c2213wy.f25423OooO0OO;
                        if (interfaceC2041sa != null) {
                            c1917oy.OooOO0O();
                            interfaceC2041sa.OoooOOO((InterfaceC1379ab) c1917oy.f23145OooOOo.zzb());
                            return;
                        }
                        return;
                    }
                    if (iOooO0oO != 7) {
                        zzo.zzg("Wrong native template id!");
                        return;
                    }
                    InterfaceC1601gd interfaceC1601gd = c2213wy.f25426OooO0o0;
                    if (interfaceC1601gd != null) {
                        InterfaceC1454cd interfaceC1454cd = (InterfaceC1454cd) c1917oy.f23147OooOOoo.zzb();
                        C1564fd c1564fd = (C1564fd) interfaceC1601gd;
                        Parcel parcelOooO3 = c1564fd.OooO();
                        AbstractC2218x2.OooO0o0(parcelOooO3, interfaceC1454cd);
                        c1564fd.o000OO0O(parcelOooO3, 1);
                        return;
                    }
                    return;
                } catch (RemoteException e) {
                    zzo.zzh("RemoteException when notifyAdLoad is called", e);
                    return;
                }
            default:
                C1917oy c1917oy2 = this.f20980OooOo0o;
                c1917oy2.OooOO0o.zzj();
                C2065sy c2065sy2 = c1917oy2.f23140OooOO0O;
                synchronized (c2065sy2) {
                    try {
                        InterfaceC1722jo interfaceC1722jo = c2065sy2.f24178OooO;
                        if (interfaceC1722jo != null) {
                            interfaceC1722jo.destroy();
                            c2065sy2.f24178OooO = null;
                        }
                        InterfaceC1722jo interfaceC1722jo2 = c2065sy2.f24187OooOO0;
                        if (interfaceC1722jo2 != null) {
                            interfaceC1722jo2.destroy();
                            c2065sy2.f24187OooOO0 = null;
                        }
                        InterfaceC1722jo interfaceC1722jo3 = c2065sy2.f24188OooOO0O;
                        if (interfaceC1722jo3 != null) {
                            interfaceC1722jo3.destroy();
                            c2065sy2.f24188OooOO0O = null;
                        }
                        o00000oO.OooOOO oooOOO = c2065sy2.f24190OooOOO0;
                        if (oooOOO != null) {
                            oooOOO.cancel(false);
                            c2065sy2.f24190OooOOO0 = null;
                        }
                        C2274yl c2274yl = c2065sy2.f24189OooOOO;
                        if (c2274yl != null) {
                            c2274yl.cancel(false);
                            c2065sy2.f24189OooOOO = null;
                        }
                        c2065sy2.OooOO0o = null;
                        c2065sy2.f24198OooOo0O.clear();
                        c2065sy2.f24199OooOo0o.clear();
                        c2065sy2.f24180OooO0O0 = null;
                        c2065sy2.f24181OooO0OO = null;
                        c2065sy2.f24182OooO0Oo = null;
                        c2065sy2.f24184OooO0o0 = null;
                        c2065sy2.f24186OooO0oo = null;
                        c2065sy2.f24191OooOOOO = null;
                        c2065sy2.f24192OooOOOo = null;
                        c2065sy2.f24194OooOOo0 = null;
                        c2065sy2.f24195OooOOoo = null;
                        c2065sy2.f24197OooOo00 = null;
                        c2065sy2.OooOo0 = null;
                    } finally {
                    }
                }
                return;
        }
    }
}
