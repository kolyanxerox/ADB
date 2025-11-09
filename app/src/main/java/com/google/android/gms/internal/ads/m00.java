package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zzeb;
import com.ironsource.C3034d9;
import java.util.List;

/* loaded from: classes2.dex */
public final class m00 extends AbstractBinderC2181w2 implements InterfaceC2262y9 {

    /* renamed from: OooOo, reason: collision with root package name */
    public final C2065sy f20996OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final String f20997OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final C1917oy f20998OooOo0o;

    public m00(String str, C1917oy c1917oy, C2065sy c2065sy) {
        super("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
        this.f20997OooOo0O = str;
        this.f20998OooOo0o = c1917oy;
        this.f20996OooOo = c2065sy;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2181w2
    public final boolean o000OO0O(int i, Parcel parcel, Parcel parcel2) {
        List list;
        InterfaceC1707j9 interfaceC1707j9;
        double d;
        String strOooO0OO;
        String strOooO0OO2;
        Oooo0o.OooO0O0 oooO0O0;
        C1917oy c1917oy = this.f20998OooOo0o;
        C2065sy c2065sy = this.f20996OooOo;
        switch (i) {
            case 2:
                Oooo0o.OooO0OO oooO0OO = new Oooo0o.OooO0OO(c1917oy);
                parcel2.writeNoException();
                AbstractC2218x2.OooO0o0(parcel2, oooO0OO);
                return true;
            case 3:
                String strOooO0O0 = c2065sy.OooO0O0();
                parcel2.writeNoException();
                parcel2.writeString(strOooO0O0);
                return true;
            case 4:
                synchronized (c2065sy) {
                    list = c2065sy.f24184OooO0o0;
                }
                parcel2.writeNoException();
                parcel2.writeList(list);
                return true;
            case 5:
                String strOooOOo0 = c2065sy.OooOOo0();
                parcel2.writeNoException();
                parcel2.writeString(strOooOOo0);
                return true;
            case 6:
                synchronized (c2065sy) {
                    interfaceC1707j9 = c2065sy.f24195OooOOoo;
                }
                parcel2.writeNoException();
                AbstractC2218x2.OooO0o0(parcel2, interfaceC1707j9);
                return true;
            case 7:
                String strOooOOo = c2065sy.OooOOo();
                parcel2.writeNoException();
                parcel2.writeString(strOooOOo);
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
                Bundle bundleOooO0oo = c2065sy.OooO0oo();
                parcel2.writeNoException();
                AbstractC2218x2.OooO0Oo(parcel2, bundleOooO0oo);
                return true;
            case 12:
                c1917oy.OooOOOo();
                parcel2.writeNoException();
                return true;
            case 13:
                zzeb zzebVarOooO = c2065sy.OooO();
                parcel2.writeNoException();
                AbstractC2218x2.OooO0o0(parcel2, zzebVarOooO);
                return true;
            case 14:
                Bundle bundle = (Bundle) AbstractC2218x2.OooO00o(parcel, Bundle.CREATOR);
                AbstractC2218x2.OooO0O0(parcel);
                synchronized (c1917oy) {
                    c1917oy.OooOO0o.OooO0o0(bundle);
                }
                parcel2.writeNoException();
                return true;
            case 15:
                Bundle bundle2 = (Bundle) AbstractC2218x2.OooO00o(parcel, Bundle.CREATOR);
                AbstractC2218x2.OooO0O0(parcel);
                boolean zOooO = c1917oy.OooO(bundle2);
                parcel2.writeNoException();
                parcel2.writeInt(zOooO ? 1 : 0);
                return true;
            case 16:
                Bundle bundle3 = (Bundle) AbstractC2218x2.OooO00o(parcel, Bundle.CREATOR);
                AbstractC2218x2.OooO0O0(parcel);
                synchronized (c1917oy) {
                    c1917oy.OooOO0o.OooOOO0(bundle3);
                }
                parcel2.writeNoException();
                return true;
            case 17:
                InterfaceC1523e9 interfaceC1523e9OooOO0 = c2065sy.OooOO0();
                parcel2.writeNoException();
                AbstractC2218x2.OooO0o0(parcel2, interfaceC1523e9OooOO0);
                return true;
            case 18:
                synchronized (c2065sy) {
                    oooO0O0 = c2065sy.f24194OooOOo0;
                }
                parcel2.writeNoException();
                AbstractC2218x2.OooO0o0(parcel2, oooO0O0);
                return true;
            case 19:
                parcel2.writeNoException();
                parcel2.writeString(this.f20997OooOo0O);
                return true;
            default:
                return false;
        }
    }
}
