package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzdc;
import com.google.android.gms.ads.internal.client.zzdd;
import com.google.android.gms.ads.internal.client.zzdg;
import com.google.android.gms.ads.internal.client.zzdh;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.client.zzdr;
import com.google.android.gms.ads.internal.client.zzdy;
import com.google.android.gms.ads.internal.client.zzeb;
import com.google.android.gms.ads.internal.client.zzez;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.ironsource.C3034d9;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class r00 extends AbstractBinderC2181w2 implements InterfaceC1379ab {

    /* renamed from: OooOo, reason: collision with root package name */
    public final C2065sy f23721OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final String f23722OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final C1917oy f23723OooOo0o;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final h20 f23724OooOoO0;

    public r00(String str, C1917oy c1917oy, C2065sy c2065sy, h20 h20Var) {
        super("com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
        this.f23722OooOo0O = str;
        this.f23723OooOo0o = c1917oy;
        this.f23721OooOo = c2065sy;
        this.f23724OooOoO0 = h20Var;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1379ab
    public final void OooO0O0() {
        C1917oy c1917oy = this.f23723OooOo0o;
        synchronized (c1917oy) {
            c1917oy.OooOO0o.zzi();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1379ab
    public final void OooO0OO() {
        C1917oy c1917oy = this.f23723OooOo0o;
        synchronized (c1917oy) {
            c1917oy.OooOO0o.OooO0O0();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1379ab
    public final boolean OooO0Oo() {
        List list;
        zzez zzezVar;
        C2065sy c2065sy = this.f23721OooOo;
        synchronized (c2065sy) {
            list = c2065sy.f24183OooO0o;
        }
        if (list.isEmpty()) {
            return false;
        }
        synchronized (c2065sy) {
            zzezVar = c2065sy.f24185OooO0oO;
        }
        return zzezVar != null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1379ab
    public final void OooOo0o(zzdh zzdhVar) {
        C1917oy c1917oy = this.f23723OooOo0o;
        synchronized (c1917oy) {
            c1917oy.OooOO0o.OooOOo0(zzdhVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1379ab
    public final List Oooo0o0() {
        List list;
        C2065sy c2065sy = this.f23721OooOo;
        synchronized (c2065sy) {
            list = c2065sy.f24184OooO0o0;
        }
        return list;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1379ab
    public final void OoooO0(InterfaceC2263ya interfaceC2263ya) {
        C1917oy c1917oy = this.f23723OooOo0o;
        synchronized (c1917oy) {
            c1917oy.OooOO0o.OooO0oO(interfaceC2263ya);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1379ab
    public final boolean OoooOoo(Bundle bundle) {
        return this.f23723OooOo0o.OooO(bundle);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1379ab
    public final void OooooO0(zzdd zzddVar) {
        C1917oy c1917oy = this.f23723OooOo0o;
        synchronized (c1917oy) {
            c1917oy.OooOO0o.OooO0oo(zzddVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1379ab
    public final void o000000(Bundle bundle) {
        C1917oy c1917oy = this.f23723OooOo0o;
        synchronized (c1917oy) {
            c1917oy.OooOO0o.OooO0o0(bundle);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1379ab
    public final void o0000O0(Bundle bundle) {
        C1917oy c1917oy = this.f23723OooOo0o;
        synchronized (c1917oy) {
            c1917oy.OooOO0o.OooOOO0(bundle);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1379ab
    public final void o0000OO0(Bundle bundle) throws JSONException {
        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0o0OOO0)).booleanValue()) {
            C1917oy c1917oy = this.f23723OooOo0o;
            InterfaceC1722jo interfaceC1722joOooOOO0 = c1917oy.f23140OooOO0O.OooOOO0();
            if (interfaceC1722joOooOOO0 == null) {
                zzo.zzg("Video webview is null");
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject();
                for (String str : bundle.keySet()) {
                    jSONObject.put(str, bundle.get(str));
                }
                c1917oy.f23139OooOO0.execute(new RunnableC1873nr(interfaceC1722joOooOOO0, jSONObject, 1));
            } catch (JSONException e) {
                zzo.zzh("Error reading event signals", e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2181w2
    public final boolean o000OO0O(int i, Parcel parcel, Parcel parcel2) throws JSONException {
        List list;
        InterfaceC1707j9 interfaceC1707j9;
        double d;
        String strOooO0OO;
        String strOooO0OO2;
        Oooo0o.OooO0O0 oooO0O0;
        InterfaceC2263ya c2189wa;
        C2065sy c2065sy = this.f23721OooOo;
        switch (i) {
            case 2:
                String strOooO0O0 = c2065sy.OooO0O0();
                parcel2.writeNoException();
                parcel2.writeString(strOooO0O0);
                return true;
            case 3:
                synchronized (c2065sy) {
                    list = c2065sy.f24184OooO0o0;
                }
                parcel2.writeNoException();
                parcel2.writeList(list);
                return true;
            case 4:
                String strOooOOo0 = c2065sy.OooOOo0();
                parcel2.writeNoException();
                parcel2.writeString(strOooOOo0);
                return true;
            case 5:
                synchronized (c2065sy) {
                    interfaceC1707j9 = c2065sy.f24195OooOOoo;
                }
                parcel2.writeNoException();
                AbstractC2218x2.OooO0o0(parcel2, interfaceC1707j9);
                return true;
            case 6:
                String strOooOOo = c2065sy.OooOOo();
                parcel2.writeNoException();
                parcel2.writeString(strOooOOo);
                return true;
            case 7:
                String strOooOOOo = c2065sy.OooOOOo();
                parcel2.writeNoException();
                parcel2.writeString(strOooOOOo);
                return true;
            case 8:
                synchronized (c2065sy) {
                    d = c2065sy.f24193OooOOo;
                }
                parcel2.writeNoException();
                parcel2.writeDouble(d);
                return true;
            case 9:
                synchronized (c2065sy) {
                    strOooO0OO = c2065sy.OooO0OO(C3034d9.h.f8088U);
                }
                parcel2.writeNoException();
                parcel2.writeString(strOooO0OO);
                return true;
            case 10:
                synchronized (c2065sy) {
                    strOooO0OO2 = c2065sy.OooO0OO("price");
                }
                parcel2.writeNoException();
                parcel2.writeString(strOooO0OO2);
                return true;
            case 11:
                zzeb zzebVarOooO = c2065sy.OooO();
                parcel2.writeNoException();
                AbstractC2218x2.OooO0o0(parcel2, zzebVarOooO);
                return true;
            case 12:
                parcel2.writeNoException();
                parcel2.writeString(this.f23722OooOo0O);
                return true;
            case 13:
                zzx();
                parcel2.writeNoException();
                return true;
            case 14:
                InterfaceC1523e9 interfaceC1523e9OooOO0 = c2065sy.OooOO0();
                parcel2.writeNoException();
                AbstractC2218x2.OooO0o0(parcel2, interfaceC1523e9OooOO0);
                return true;
            case 15:
                Bundle bundle = (Bundle) AbstractC2218x2.OooO00o(parcel, Bundle.CREATOR);
                AbstractC2218x2.OooO0O0(parcel);
                o000000(bundle);
                parcel2.writeNoException();
                return true;
            case 16:
                Bundle bundle2 = (Bundle) AbstractC2218x2.OooO00o(parcel, Bundle.CREATOR);
                AbstractC2218x2.OooO0O0(parcel);
                boolean zOooO = this.f23723OooOo0o.OooO(bundle2);
                parcel2.writeNoException();
                parcel2.writeInt(zOooO ? 1 : 0);
                return true;
            case 17:
                Bundle bundle3 = (Bundle) AbstractC2218x2.OooO00o(parcel, Bundle.CREATOR);
                AbstractC2218x2.OooO0O0(parcel);
                o0000O0(bundle3);
                parcel2.writeNoException();
                return true;
            case 18:
                Oooo0o.OooO0O0 oooO0O0Zzm = zzm();
                parcel2.writeNoException();
                AbstractC2218x2.OooO0o0(parcel2, oooO0O0Zzm);
                return true;
            case 19:
                synchronized (c2065sy) {
                    oooO0O0 = c2065sy.f24194OooOOo0;
                }
                parcel2.writeNoException();
                AbstractC2218x2.OooO0o0(parcel2, oooO0O0);
                return true;
            case 20:
                Bundle bundleOooO0oo = c2065sy.OooO0oo();
                parcel2.writeNoException();
                AbstractC2218x2.OooO0Oo(parcel2, bundleOooO0oo);
                return true;
            case 21:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    c2189wa = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener");
                    c2189wa = iInterfaceQueryLocalInterface instanceof InterfaceC2263ya ? (InterfaceC2263ya) iInterfaceQueryLocalInterface : new C2189wa(strongBinder, "com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener");
                }
                AbstractC2218x2.OooO0O0(parcel);
                OoooO0(c2189wa);
                parcel2.writeNoException();
                return true;
            case 22:
                OooO0O0();
                parcel2.writeNoException();
                return true;
            case 23:
                List listZzv = zzv();
                parcel2.writeNoException();
                parcel2.writeList(listZzv);
                return true;
            case 24:
                boolean zOooO0Oo = OooO0Oo();
                parcel2.writeNoException();
                ClassLoader classLoader = AbstractC2218x2.f25497OooO00o;
                parcel2.writeInt(zOooO0Oo ? 1 : 0);
                return true;
            case 25:
                zzdh zzdhVarZzb = zzdg.zzb(parcel.readStrongBinder());
                AbstractC2218x2.OooO0O0(parcel);
                OooOo0o(zzdhVarZzb);
                parcel2.writeNoException();
                return true;
            case 26:
                zzdd zzddVarZzb = zzdc.zzb(parcel.readStrongBinder());
                AbstractC2218x2.OooO0O0(parcel);
                OooooO0(zzddVarZzb);
                parcel2.writeNoException();
                return true;
            case 27:
                OooO0OO();
                parcel2.writeNoException();
                return true;
            case 28:
                zzA();
                parcel2.writeNoException();
                return true;
            case 29:
                InterfaceC1634h9 interfaceC1634h9Zzj = zzj();
                parcel2.writeNoException();
                AbstractC2218x2.OooO0o0(parcel2, interfaceC1634h9Zzj);
                return true;
            case 30:
                boolean zZzH = zzH();
                parcel2.writeNoException();
                ClassLoader classLoader2 = AbstractC2218x2.f25497OooO00o;
                parcel2.writeInt(zZzH ? 1 : 0);
                return true;
            case 31:
                zzdy zzdyVarZzg = zzg();
                parcel2.writeNoException();
                AbstractC2218x2.OooO0o0(parcel2, zzdyVarZzg);
                return true;
            case 32:
                zzdr zzdrVarZzb = zzdq.zzb(parcel.readStrongBinder());
                AbstractC2218x2.OooO0O0(parcel);
                o0ooOoO(zzdrVarZzb);
                parcel2.writeNoException();
                return true;
            case 33:
                Bundle bundle4 = (Bundle) AbstractC2218x2.OooO00o(parcel, Bundle.CREATOR);
                AbstractC2218x2.OooO0O0(parcel);
                o0000OO0(bundle4);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1379ab
    public final void o0ooOoO(zzdr zzdrVar) {
        try {
            if (!zzdrVar.zzf()) {
                this.f23724OooOoO0.OooO0O0();
            }
        } catch (RemoteException e) {
            zzo.zzf("Error in making CSI ping for reporting paid event callback", e);
        }
        C1917oy c1917oy = this.f23723OooOo0o;
        synchronized (c1917oy) {
            c1917oy.f23157OooOooO.f18209OooOo0O.set(zzdrVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1379ab
    public final void zzA() {
        C1917oy c1917oy = this.f23723OooOo0o;
        synchronized (c1917oy) {
            AbstractBinderC2181w2 abstractBinderC2181w2 = c1917oy.OooOo0;
            if (abstractBinderC2181w2 == null) {
                zzo.zze("Ad should be associated with an ad view before calling recordCustomClickGesture()");
            } else {
                c1917oy.f23139OooOO0.execute(new OoooOOO.oO000O0O(c1917oy, abstractBinderC2181w2 instanceof ViewTreeObserverOnGlobalLayoutListenerC2287yy, 2));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1379ab
    public final boolean zzH() {
        boolean zOooOOOo;
        C1917oy c1917oy = this.f23723OooOo0o;
        synchronized (c1917oy) {
            zOooOOOo = c1917oy.OooOO0o.OooOOOo();
        }
        return zOooOOOo;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1379ab
    public final double zze() {
        double d;
        C2065sy c2065sy = this.f23721OooOo;
        synchronized (c2065sy) {
            d = c2065sy.f24193OooOOo;
        }
        return d;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1379ab
    public final Bundle zzf() {
        return this.f23721OooOo.OooO0oo();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1379ab
    public final zzdy zzg() {
        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0OoO00O)).booleanValue()) {
            return this.f23723OooOo0o.f17103OooO0o;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1379ab
    public final zzeb zzh() {
        return this.f23721OooOo.OooO();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1379ab
    public final InterfaceC1523e9 zzi() {
        return this.f23721OooOo.OooOO0();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1379ab
    public final InterfaceC1634h9 zzj() {
        InterfaceC1634h9 interfaceC1634h9;
        C1991qy c1991qy = this.f23723OooOo0o.f23155OooOoo;
        synchronized (c1991qy) {
            interfaceC1634h9 = c1991qy.f23708OooO00o;
        }
        return interfaceC1634h9;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1379ab
    public final InterfaceC1707j9 zzk() {
        InterfaceC1707j9 interfaceC1707j9;
        C2065sy c2065sy = this.f23721OooOo;
        synchronized (c2065sy) {
            interfaceC1707j9 = c2065sy.f24195OooOOoo;
        }
        return interfaceC1707j9;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1379ab
    public final Oooo0o.OooO0O0 zzl() {
        Oooo0o.OooO0O0 oooO0O0;
        C2065sy c2065sy = this.f23721OooOo;
        synchronized (c2065sy) {
            oooO0O0 = c2065sy.f24194OooOOo0;
        }
        return oooO0O0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1379ab
    public final Oooo0o.OooO0O0 zzm() {
        return new Oooo0o.OooO0OO(this.f23723OooOo0o);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1379ab
    public final String zzn() {
        return this.f23721OooOo.OooOOOo();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1379ab
    public final String zzo() {
        return this.f23721OooOo.OooOOo0();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1379ab
    public final String zzp() {
        return this.f23721OooOo.OooOOo();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1379ab
    public final String zzq() {
        return this.f23721OooOo.OooO0O0();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1379ab
    public final String zzs() {
        String strOooO0OO;
        C2065sy c2065sy = this.f23721OooOo;
        synchronized (c2065sy) {
            strOooO0OO = c2065sy.OooO0OO("price");
        }
        return strOooO0OO;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1379ab
    public final String zzt() {
        String strOooO0OO;
        C2065sy c2065sy = this.f23721OooOo;
        synchronized (c2065sy) {
            strOooO0OO = c2065sy.OooO0OO(C3034d9.h.f8088U);
        }
        return strOooO0OO;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1379ab
    public final List zzv() {
        List list;
        if (!OooO0Oo()) {
            return Collections.EMPTY_LIST;
        }
        C2065sy c2065sy = this.f23721OooOo;
        synchronized (c2065sy) {
            list = c2065sy.f24183OooO0o;
        }
        return list;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1379ab
    public final void zzx() {
        this.f23723OooOo0o.OooOOOo();
    }
}
