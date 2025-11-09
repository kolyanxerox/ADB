package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zzeb;
import java.util.List;

/* loaded from: classes2.dex */
public final class p00 extends AbstractBinderC2181w2 implements InterfaceC2299z9 {

    /* renamed from: OooOo, reason: collision with root package name */
    public final C2065sy f23167OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final String f23168OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final C1917oy f23169OooOo0o;

    public p00(String str, C1917oy c1917oy, C2065sy c2065sy) {
        super("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
        this.f23168OooOo0O = str;
        this.f23169OooOo0o = c1917oy;
        this.f23167OooOo = c2065sy;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2181w2
    public final boolean o000OO0O(int i, Parcel parcel, Parcel parcel2) {
        List list;
        InterfaceC1707j9 interfaceC1707j9;
        Oooo0o.OooO0O0 oooO0O0;
        switch (i) {
            case 2:
                Oooo0o.OooO0OO oooO0OO = new Oooo0o.OooO0OO(this.f23169OooOo0o);
                parcel2.writeNoException();
                AbstractC2218x2.OooO0o0(parcel2, oooO0OO);
                return true;
            case 3:
                String strOooO0O0 = this.f23167OooOo.OooO0O0();
                parcel2.writeNoException();
                parcel2.writeString(strOooO0O0);
                return true;
            case 4:
                C2065sy c2065sy = this.f23167OooOo;
                synchronized (c2065sy) {
                    list = c2065sy.f24184OooO0o0;
                }
                parcel2.writeNoException();
                parcel2.writeList(list);
                return true;
            case 5:
                String strOooOOo0 = this.f23167OooOo.OooOOo0();
                parcel2.writeNoException();
                parcel2.writeString(strOooOOo0);
                return true;
            case 6:
                C2065sy c2065sy2 = this.f23167OooOo;
                synchronized (c2065sy2) {
                    interfaceC1707j9 = c2065sy2.f24197OooOo00;
                }
                parcel2.writeNoException();
                AbstractC2218x2.OooO0o0(parcel2, interfaceC1707j9);
                return true;
            case 7:
                String strOooOOo = this.f23167OooOo.OooOOo();
                parcel2.writeNoException();
                parcel2.writeString(strOooOOo);
                return true;
            case 8:
                String strOooOOOo = this.f23167OooOo.OooOOOo();
                parcel2.writeNoException();
                parcel2.writeString(strOooOOOo);
                return true;
            case 9:
                Bundle bundleOooO0oo = this.f23167OooOo.OooO0oo();
                parcel2.writeNoException();
                AbstractC2218x2.OooO0Oo(parcel2, bundleOooO0oo);
                return true;
            case 10:
                this.f23169OooOo0o.OooOOOo();
                parcel2.writeNoException();
                return true;
            case 11:
                zzeb zzebVarOooO = this.f23167OooOo.OooO();
                parcel2.writeNoException();
                AbstractC2218x2.OooO0o0(parcel2, zzebVarOooO);
                return true;
            case 12:
                Bundle bundle = (Bundle) AbstractC2218x2.OooO00o(parcel, Bundle.CREATOR);
                AbstractC2218x2.OooO0O0(parcel);
                C1917oy c1917oy = this.f23169OooOo0o;
                synchronized (c1917oy) {
                    c1917oy.OooOO0o.OooO0o0(bundle);
                }
                parcel2.writeNoException();
                return true;
            case 13:
                Bundle bundle2 = (Bundle) AbstractC2218x2.OooO00o(parcel, Bundle.CREATOR);
                AbstractC2218x2.OooO0O0(parcel);
                boolean zOooO = this.f23169OooOo0o.OooO(bundle2);
                parcel2.writeNoException();
                parcel2.writeInt(zOooO ? 1 : 0);
                return true;
            case 14:
                Bundle bundle3 = (Bundle) AbstractC2218x2.OooO00o(parcel, Bundle.CREATOR);
                AbstractC2218x2.OooO0O0(parcel);
                C1917oy c1917oy2 = this.f23169OooOo0o;
                synchronized (c1917oy2) {
                    c1917oy2.OooOO0o.OooOOO0(bundle3);
                }
                parcel2.writeNoException();
                return true;
            case 15:
                InterfaceC1523e9 interfaceC1523e9OooOO0 = this.f23167OooOo.OooOO0();
                parcel2.writeNoException();
                AbstractC2218x2.OooO0o0(parcel2, interfaceC1523e9OooOO0);
                return true;
            case 16:
                C2065sy c2065sy3 = this.f23167OooOo;
                synchronized (c2065sy3) {
                    oooO0O0 = c2065sy3.f24194OooOOo0;
                }
                parcel2.writeNoException();
                AbstractC2218x2.OooO0o0(parcel2, oooO0O0);
                return true;
            case 17:
                String str = this.f23168OooOo0O;
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            default:
                return false;
        }
    }
}
