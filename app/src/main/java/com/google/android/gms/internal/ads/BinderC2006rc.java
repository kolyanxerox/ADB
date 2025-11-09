package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.Bundle;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.rc */
/* loaded from: classes2.dex */
public final class BinderC2006rc extends AbstractBinderC2181w2 {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f23845OooOo0O = 0;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final Object f23846OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC2006rc(C2274yl c2274yl) {
        super("com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheCallback");
        this.f23846OooOo0o = c2274yl;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2181w2
    public final boolean o000OO0O(int i, Parcel parcel, Parcel parcel2) {
        Object obj = this.f23846OooOo0o;
        switch (this.f23845OooOo0O) {
            case 0:
                if (i != 1) {
                    return false;
                }
                ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) AbstractC2218x2.OooO00o(parcel, ParcelFileDescriptor.CREATOR);
                AbstractC2218x2.OooO0O0(parcel);
                ((C2274yl) obj).zzc(parcelFileDescriptor);
                return true;
            default:
                o000Ooo.o00oO0o o00oo0o = (o000Ooo.o00oO0o) obj;
                switch (i) {
                    case 1:
                        Bundle bundle = (Bundle) AbstractC2218x2.OooO00o(parcel, Bundle.CREATOR);
                        AbstractC2218x2.OooO0O0(parcel);
                        com.google.android.gms.internal.measurement.o00O00OO o00o00oo = (com.google.android.gms.internal.measurement.o00O00OO) o00oo0o.f30487OooOo0o;
                        o00o00oo.getClass();
                        o00o00oo.OooO0OO(new com.google.android.gms.internal.measurement.o000OOo0(o00o00oo, bundle, new com.google.android.gms.internal.measurement.o00000O()));
                        parcel2.writeNoException();
                        break;
                    case 2:
                        Bundle bundle2 = (Bundle) AbstractC2218x2.OooO00o(parcel, Bundle.CREATOR);
                        AbstractC2218x2.OooO0O0(parcel);
                        com.google.android.gms.internal.measurement.o00O00OO o00o00oo2 = (com.google.android.gms.internal.measurement.o00O00OO) o00oo0o.f30487OooOo0o;
                        o00o00oo2.getClass();
                        com.google.android.gms.internal.measurement.o00000O o00000o = new com.google.android.gms.internal.measurement.o00000O();
                        o00o00oo2.OooO0OO(new com.google.android.gms.internal.measurement.o000OOo0(o00o00oo2, bundle2, o00000o));
                        Bundle bundleO000OO0O = o00000o.o000OO0O(5000L);
                        parcel2.writeNoException();
                        AbstractC2218x2.OooO0Oo(parcel2, bundleO000OO0O);
                        break;
                    case 3:
                        String string = parcel.readString();
                        String string2 = parcel.readString();
                        Bundle bundle3 = (Bundle) AbstractC2218x2.OooO00o(parcel, Bundle.CREATOR);
                        AbstractC2218x2.OooO0O0(parcel);
                        com.google.android.gms.internal.measurement.o00O00OO o00o00oo3 = (com.google.android.gms.internal.measurement.o00O00OO) o00oo0o.f30487OooOo0o;
                        o00o00oo3.getClass();
                        o00o00oo3.OooO0OO(new com.google.android.gms.internal.measurement.o000O00O(o00o00oo3, string, string2, bundle3, true));
                        parcel2.writeNoException();
                        break;
                    case 4:
                        String string3 = parcel.readString();
                        String string4 = parcel.readString();
                        Oooo0o.OooO0O0 oooO0O0O000O0o0 = Oooo0o.OooO0OO.o000O0o0(parcel.readStrongBinder());
                        AbstractC2218x2.OooO0O0(parcel);
                        Object objO000O0oO = oooO0O0O000O0o0 != null ? Oooo0o.OooO0OO.o000O0oO(oooO0O0O000O0o0) : null;
                        com.google.android.gms.internal.measurement.o00O00OO o00o00oo4 = (com.google.android.gms.internal.measurement.o00O00OO) o00oo0o.f30487OooOo0o;
                        o00o00oo4.getClass();
                        o00o00oo4.OooO0OO(new com.google.android.gms.internal.measurement.o000O00O(o00o00oo4, string3, string4, objO000O0oO, true));
                        parcel2.writeNoException();
                        break;
                    case 5:
                        String string5 = parcel.readString();
                        String string6 = parcel.readString();
                        ClassLoader classLoader = AbstractC2218x2.f25497OooO00o;
                        boolean z = parcel.readInt() != 0;
                        AbstractC2218x2.OooO0O0(parcel);
                        Map mapOooO00o = ((com.google.android.gms.internal.measurement.o00O00OO) o00oo0o.f30487OooOo0o).OooO00o(string5, string6, z);
                        parcel2.writeNoException();
                        parcel2.writeMap(mapOooO00o);
                        break;
                    case 6:
                        String string7 = parcel.readString();
                        AbstractC2218x2.OooO0O0(parcel);
                        int iOooO0O0 = ((com.google.android.gms.internal.measurement.o00O00OO) o00oo0o.f30487OooOo0o).OooO0O0(string7);
                        parcel2.writeNoException();
                        parcel2.writeInt(iOooO0O0);
                        break;
                    case 7:
                        Bundle bundle4 = (Bundle) AbstractC2218x2.OooO00o(parcel, Bundle.CREATOR);
                        AbstractC2218x2.OooO0O0(parcel);
                        com.google.android.gms.internal.measurement.o00O00OO o00o00oo5 = (com.google.android.gms.internal.measurement.o00O00OO) o00oo0o.f30487OooOo0o;
                        o00o00oo5.getClass();
                        o00o00oo5.OooO0OO(new com.google.android.gms.internal.measurement.o000O0(o00o00oo5, bundle4, 0));
                        parcel2.writeNoException();
                        break;
                    case 8:
                        String string8 = parcel.readString();
                        String string9 = parcel.readString();
                        Bundle bundle5 = (Bundle) AbstractC2218x2.OooO00o(parcel, Bundle.CREATOR);
                        AbstractC2218x2.OooO0O0(parcel);
                        com.google.android.gms.internal.measurement.o00O00OO o00o00oo6 = (com.google.android.gms.internal.measurement.o00O00OO) o00oo0o.f30487OooOo0o;
                        o00o00oo6.getClass();
                        o00o00oo6.OooO0OO(new com.google.android.gms.internal.measurement.o000O0Oo(o00o00oo6, string8, string9, bundle5));
                        parcel2.writeNoException();
                        break;
                    case 9:
                        String string10 = parcel.readString();
                        String string11 = parcel.readString();
                        AbstractC2218x2.OooO0O0(parcel);
                        List listOooO0o = ((com.google.android.gms.internal.measurement.o00O00OO) o00oo0o.f30487OooOo0o).OooO0o(string10, string11);
                        parcel2.writeNoException();
                        parcel2.writeList(listOooO0o);
                        break;
                    case 10:
                        com.google.android.gms.internal.measurement.o00O00OO o00o00oo7 = (com.google.android.gms.internal.measurement.o00O00OO) o00oo0o.f30487OooOo0o;
                        o00o00oo7.getClass();
                        com.google.android.gms.internal.measurement.o00000O o00000o2 = new com.google.android.gms.internal.measurement.o00000O();
                        o00o00oo7.OooO0OO(new com.google.android.gms.internal.measurement.o00O0000(o00o00oo7, o00000o2, 1));
                        String strOooOOO = o00000o2.OooOOO(50L);
                        parcel2.writeNoException();
                        parcel2.writeString(strOooOOO);
                        break;
                    case 11:
                        com.google.android.gms.internal.measurement.o00O00OO o00o00oo8 = (com.google.android.gms.internal.measurement.o00O00OO) o00oo0o.f30487OooOo0o;
                        o00o00oo8.getClass();
                        com.google.android.gms.internal.measurement.o00000O o00000o3 = new com.google.android.gms.internal.measurement.o00000O();
                        o00o00oo8.OooO0OO(new com.google.android.gms.internal.measurement.o00O0000(o00o00oo8, o00000o3, 0));
                        String strOooOOO2 = o00000o3.OooOOO(500L);
                        parcel2.writeNoException();
                        parcel2.writeString(strOooOOO2);
                        break;
                    case 12:
                        long jOooO0oO = ((com.google.android.gms.internal.measurement.o00O00OO) o00oo0o.f30487OooOo0o).OooO0oO();
                        parcel2.writeNoException();
                        parcel2.writeLong(jOooO0oO);
                        break;
                    case 13:
                        String string12 = parcel.readString();
                        AbstractC2218x2.OooO0O0(parcel);
                        com.google.android.gms.internal.measurement.o00O00OO o00o00oo9 = (com.google.android.gms.internal.measurement.o00O00OO) o00oo0o.f30487OooOo0o;
                        o00o00oo9.getClass();
                        o00o00oo9.OooO0OO(new com.google.android.gms.internal.measurement.o000OO0O(o00o00oo9, string12, 1));
                        parcel2.writeNoException();
                        break;
                    case 14:
                        String string13 = parcel.readString();
                        AbstractC2218x2.OooO0O0(parcel);
                        com.google.android.gms.internal.measurement.o00O00OO o00o00oo10 = (com.google.android.gms.internal.measurement.o00O00OO) o00oo0o.f30487OooOo0o;
                        o00o00oo10.getClass();
                        o00o00oo10.OooO0OO(new com.google.android.gms.internal.measurement.o000OO0O(o00o00oo10, string13, 2));
                        parcel2.writeNoException();
                        break;
                    case 15:
                        Oooo0o.OooO0O0 oooO0O0O000O0o02 = Oooo0o.OooO0OO.o000O0o0(parcel.readStrongBinder());
                        String string14 = parcel.readString();
                        String string15 = parcel.readString();
                        AbstractC2218x2.OooO0O0(parcel);
                        Activity activity = oooO0O0O000O0o02 != null ? (Activity) Oooo0o.OooO0OO.o000O0oO(oooO0O0O000O0o02) : null;
                        o00oo0o.getClass();
                        com.google.android.gms.internal.measurement.o000O00 o000o00OooO0o0 = com.google.android.gms.internal.measurement.o000O00.OooO0o0(activity);
                        com.google.android.gms.internal.measurement.o00O00OO o00o00oo11 = (com.google.android.gms.internal.measurement.o00O00OO) o00oo0o.f30487OooOo0o;
                        o00o00oo11.getClass();
                        o00o00oo11.OooO0OO(new com.google.android.gms.internal.measurement.o000O0Oo(o00o00oo11, o000o00OooO0o0, string14, string15));
                        parcel2.writeNoException();
                        break;
                    case 16:
                        com.google.android.gms.internal.measurement.o00O00OO o00o00oo12 = (com.google.android.gms.internal.measurement.o00O00OO) o00oo0o.f30487OooOo0o;
                        o00o00oo12.getClass();
                        com.google.android.gms.internal.measurement.o00000O o00000o4 = new com.google.android.gms.internal.measurement.o00000O();
                        o00o00oo12.OooO0OO(new com.google.android.gms.internal.measurement.o00O0000(o00o00oo12, o00000o4, 3));
                        String strOooOOO3 = o00000o4.OooOOO(500L);
                        parcel2.writeNoException();
                        parcel2.writeString(strOooOOO3);
                        break;
                    case 17:
                        com.google.android.gms.internal.measurement.o00O00OO o00o00oo13 = (com.google.android.gms.internal.measurement.o00O00OO) o00oo0o.f30487OooOo0o;
                        o00o00oo13.getClass();
                        com.google.android.gms.internal.measurement.o00000O o00000o5 = new com.google.android.gms.internal.measurement.o00000O();
                        o00o00oo13.OooO0OO(new com.google.android.gms.internal.measurement.o00O0000(o00o00oo13, o00000o5, 4));
                        String strOooOOO4 = o00000o5.OooOOO(500L);
                        parcel2.writeNoException();
                        parcel2.writeString(strOooOOO4);
                        break;
                    case 18:
                        String str = ((com.google.android.gms.internal.measurement.o00O00OO) o00oo0o.f30487OooOo0o).f26529OooO0o;
                        parcel2.writeNoException();
                        parcel2.writeString(str);
                        break;
                    case 19:
                        AbstractC2218x2.OooO0O0(parcel);
                        o00oo0o.getClass();
                        parcel2.writeNoException();
                        break;
                    default:
                        return false;
                }
                return true;
        }
    }

    public BinderC2006rc(o000Ooo.o00oO0o o00oo0o) {
        super("com.google.android.gms.ads.measurement.IAppMeasurementProxy");
        this.f23846OooOo0o = o00oo0o;
    }
}
