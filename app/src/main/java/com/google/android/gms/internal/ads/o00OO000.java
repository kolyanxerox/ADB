package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.zzga;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class o00OO000 implements Parcelable.Creator {

    /* renamed from: OooO00o */
    public final /* synthetic */ int f21819OooO00o;

    public /* synthetic */ o00OO000(int i) {
        this.f21819OooO00o = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f21819OooO00o) {
            case 0:
                return new o00OO00O(parcel);
            case 1:
                return new o00OO0O0(parcel);
            case 2:
                return new o00OO0OO(parcel);
            case 3:
                return new oo0O(parcel);
            case 4:
                return new o00OO(parcel);
            case 5:
                return new o00OOO00(parcel);
            case 6:
                return new o00OOO0(parcel);
            case 7:
                return new o00OOO0O(parcel);
            case 8:
                return new o0o0Oo(parcel);
            case 9:
                return new o00OOOO0(parcel);
            case 10:
                return new o0O00o0(parcel);
            case 11:
                return new oo00oO(parcel);
            case 12:
                return new o0oOOo(parcel);
            case 13:
                String string = parcel.readString();
                string.getClass();
                String string2 = parcel.readString();
                String[] strArrCreateStringArray = parcel.createStringArray();
                strArrCreateStringArray.getClass();
                return new o0O0o(string, string2, rm0.OooOOOo(strArrCreateStringArray));
            case 14:
                return new C1883o0(parcel);
            case 15:
                return new o0O00000(parcel);
            case 16:
                ArrayList arrayList = new ArrayList();
                parcel.readList(arrayList, o0O0000O.class.getClassLoader());
                return new o0O000(arrayList);
            case 17:
                return new o0O0000O(parcel.readLong(), parcel.readLong(), parcel.readInt());
            case 18:
                return new o0OoOoOo(parcel);
            case 19:
                return new o0O000Oo(parcel);
            case 20:
                return new C2107u2(parcel);
            case 21:
                int iOooOooO = o000O00.o00O0O0O.OooOooO(parcel);
                boolean zOooOo0o = false;
                boolean zOooOo0o2 = false;
                boolean zOooOo0o3 = false;
                long jOooOoO = 0;
                ParcelFileDescriptor parcelFileDescriptor = null;
                while (parcel.dataPosition() < iOooOooO) {
                    int i = parcel.readInt();
                    char c = (char) i;
                    if (c == 2) {
                        parcelFileDescriptor = (ParcelFileDescriptor) o000O00.o00O0O0O.OooO0oo(parcel, i, ParcelFileDescriptor.CREATOR);
                    } else if (c == 3) {
                        zOooOo0o = o000O00.o00O0O0O.OooOo0o(parcel, i);
                    } else if (c == 4) {
                        zOooOo0o2 = o000O00.o00O0O0O.OooOo0o(parcel, i);
                    } else if (c == 5) {
                        jOooOoO = o000O00.o00O0O0O.OooOoO(parcel, i);
                    } else if (c != 6) {
                        o000O00.o00O0O0O.OooOoo0(parcel, i);
                    } else {
                        zOooOo0o3 = o000O00.o00O0O0O.OooOo0o(parcel, i);
                    }
                }
                o000O00.o00O0O0O.OooOOo0(parcel, iOooOooO);
                return new C1629h4(parcelFileDescriptor, zOooOo0o, zOooOo0o2, jOooOoO, zOooOo0o3);
            case 22:
                int iOooOooO2 = o000O00.o00O0O0O.OooOooO(parcel);
                boolean zOooOo0o4 = false;
                int iOooOoO0 = 0;
                String strOooO = null;
                String strOooO2 = null;
                String strOooO3 = null;
                String strOooO4 = null;
                Bundle bundleOooO0Oo = null;
                String strOooO5 = null;
                long jOooOoO2 = 0;
                long jOooOoO3 = 0;
                while (parcel.dataPosition() < iOooOooO2) {
                    int i2 = parcel.readInt();
                    switch ((char) i2) {
                        case 2:
                            strOooO = o000O00.o00O0O0O.OooO(parcel, i2);
                            break;
                        case 3:
                            jOooOoO2 = o000O00.o00O0O0O.OooOoO(parcel, i2);
                            break;
                        case 4:
                            strOooO2 = o000O00.o00O0O0O.OooO(parcel, i2);
                            break;
                        case 5:
                            strOooO3 = o000O00.o00O0O0O.OooO(parcel, i2);
                            break;
                        case 6:
                            strOooO4 = o000O00.o00O0O0O.OooO(parcel, i2);
                            break;
                        case 7:
                            bundleOooO0Oo = o000O00.o00O0O0O.OooO0Oo(parcel, i2);
                            break;
                        case '\b':
                            zOooOo0o4 = o000O00.o00O0O0O.OooOo0o(parcel, i2);
                            break;
                        case '\t':
                            jOooOoO3 = o000O00.o00O0O0O.OooOoO(parcel, i2);
                            break;
                        case '\n':
                            strOooO5 = o000O00.o00O0O0O.OooO(parcel, i2);
                            break;
                        case 11:
                            iOooOoO0 = o000O00.o00O0O0O.OooOoO0(parcel, i2);
                            break;
                        default:
                            o000O00.o00O0O0O.OooOoo0(parcel, i2);
                            break;
                    }
                }
                o000O00.o00O0O0O.OooOOo0(parcel, iOooOooO2);
                return new C1702j4(strOooO, jOooOoO2, strOooO2, strOooO3, strOooO4, bundleOooO0Oo, zOooOo0o4, jOooOoO3, strOooO5, iOooOoO0);
            case 23:
                int iOooOooO3 = o000O00.o00O0O0O.OooOooO(parcel);
                int iOooOoO02 = 0;
                boolean zOooOo0o5 = false;
                int iOooOoO03 = 0;
                boolean zOooOo0o6 = false;
                int iOooOoO04 = 0;
                boolean zOooOo0o7 = false;
                int iOooOoO05 = 0;
                int iOooOoO06 = 0;
                boolean zOooOo0o8 = false;
                int iOooOoO07 = 0;
                zzga zzgaVar = null;
                while (parcel.dataPosition() < iOooOooO3) {
                    int i3 = parcel.readInt();
                    switch ((char) i3) {
                        case 1:
                            iOooOoO02 = o000O00.o00O0O0O.OooOoO0(parcel, i3);
                            break;
                        case 2:
                            zOooOo0o5 = o000O00.o00O0O0O.OooOo0o(parcel, i3);
                            break;
                        case 3:
                            iOooOoO03 = o000O00.o00O0O0O.OooOoO0(parcel, i3);
                            break;
                        case 4:
                            zOooOo0o6 = o000O00.o00O0O0O.OooOo0o(parcel, i3);
                            break;
                        case 5:
                            iOooOoO04 = o000O00.o00O0O0O.OooOoO0(parcel, i3);
                            break;
                        case 6:
                            zzgaVar = (zzga) o000O00.o00O0O0O.OooO0oo(parcel, i3, zzga.CREATOR);
                            break;
                        case 7:
                            zOooOo0o7 = o000O00.o00O0O0O.OooOo0o(parcel, i3);
                            break;
                        case '\b':
                            iOooOoO05 = o000O00.o00O0O0O.OooOoO0(parcel, i3);
                            break;
                        case '\t':
                            iOooOoO06 = o000O00.o00O0O0O.OooOoO0(parcel, i3);
                            break;
                        case '\n':
                            zOooOo0o8 = o000O00.o00O0O0O.OooOo0o(parcel, i3);
                            break;
                        case 11:
                            iOooOoO07 = o000O00.o00O0O0O.OooOoO0(parcel, i3);
                            break;
                        default:
                            o000O00.o00O0O0O.OooOoo0(parcel, i3);
                            break;
                    }
                }
                o000O00.o00O0O0O.OooOOo0(parcel, iOooOooO3);
                return new C1414b9(iOooOoO02, zOooOo0o5, iOooOoO03, zOooOo0o6, iOooOoO04, zzgaVar, zOooOo0o7, iOooOoO05, iOooOoO06, zOooOo0o8, iOooOoO07);
            case 24:
                int iOooOooO4 = o000O00.o00O0O0O.OooOooO(parcel);
                String strOooO6 = null;
                String[] strArrOooOO0 = null;
                String[] strArrOooOO02 = null;
                while (parcel.dataPosition() < iOooOooO4) {
                    int i4 = parcel.readInt();
                    char c2 = (char) i4;
                    if (c2 == 1) {
                        strOooO6 = o000O00.o00O0O0O.OooO(parcel, i4);
                    } else if (c2 == 2) {
                        strArrOooOO0 = o000O00.o00O0O0O.OooOO0(parcel, i4);
                    } else if (c2 != 3) {
                        o000O00.o00O0O0O.OooOoo0(parcel, i4);
                    } else {
                        strArrOooOO02 = o000O00.o00O0O0O.OooOO0(parcel, i4);
                    }
                }
                o000O00.o00O0O0O.OooOOo0(parcel, iOooOooO4);
                return new C1896oc(strOooO6, strArrOooOO0, strArrOooOO02);
            case 25:
                int iOooOooO5 = o000O00.o00O0O0O.OooOooO(parcel);
                long jOooOoO4 = 0;
                boolean zOooOo0o9 = false;
                int iOooOoO08 = 0;
                boolean zOooOo0o10 = false;
                String strOooO7 = null;
                byte[] bArrOooO0o0 = null;
                String[] strArrOooOO03 = null;
                String[] strArrOooOO04 = null;
                while (parcel.dataPosition() < iOooOooO5) {
                    int i5 = parcel.readInt();
                    switch ((char) i5) {
                        case 1:
                            zOooOo0o9 = o000O00.o00O0O0O.OooOo0o(parcel, i5);
                            break;
                        case 2:
                            strOooO7 = o000O00.o00O0O0O.OooO(parcel, i5);
                            break;
                        case 3:
                            iOooOoO08 = o000O00.o00O0O0O.OooOoO0(parcel, i5);
                            break;
                        case 4:
                            bArrOooO0o0 = o000O00.o00O0O0O.OooO0o0(parcel, i5);
                            break;
                        case 5:
                            strArrOooOO03 = o000O00.o00O0O0O.OooOO0(parcel, i5);
                            break;
                        case 6:
                            strArrOooOO04 = o000O00.o00O0O0O.OooOO0(parcel, i5);
                            break;
                        case 7:
                            zOooOo0o10 = o000O00.o00O0O0O.OooOo0o(parcel, i5);
                            break;
                        case '\b':
                            jOooOoO4 = o000O00.o00O0O0O.OooOoO(parcel, i5);
                            break;
                        default:
                            o000O00.o00O0O0O.OooOoo0(parcel, i5);
                            break;
                    }
                }
                o000O00.o00O0O0O.OooOOo0(parcel, iOooOooO5);
                return new C1932pc(zOooOo0o9, strOooO7, iOooOoO08, bArrOooO0o0, strArrOooOO03, strArrOooOO04, zOooOo0o10, jOooOoO4);
            case 26:
                int iOooOooO6 = o000O00.o00O0O0O.OooOooO(parcel);
                String strOooO8 = null;
                boolean zOooOo0o11 = false;
                int iOooOoO09 = 0;
                String strOooO9 = null;
                while (parcel.dataPosition() < iOooOooO6) {
                    int i6 = parcel.readInt();
                    char c3 = (char) i6;
                    if (c3 == 1) {
                        strOooO8 = o000O00.o00O0O0O.OooO(parcel, i6);
                    } else if (c3 == 2) {
                        zOooOo0o11 = o000O00.o00O0O0O.OooOo0o(parcel, i6);
                    } else if (c3 == 3) {
                        iOooOoO09 = o000O00.o00O0O0O.OooOoO0(parcel, i6);
                    } else if (c3 != 4) {
                        o000O00.o00O0O0O.OooOoo0(parcel, i6);
                    } else {
                        strOooO9 = o000O00.o00O0O0O.OooO(parcel, i6);
                    }
                }
                o000O00.o00O0O0O.OooOOo0(parcel, iOooOooO6);
                return new C2080tc(strOooO8, iOooOoO09, strOooO9, zOooOo0o11);
            case 27:
                int iOooOooO7 = o000O00.o00O0O0O.OooOooO(parcel);
                String strOooO10 = null;
                Bundle bundleOooO0Oo2 = null;
                while (parcel.dataPosition() < iOooOooO7) {
                    int i7 = parcel.readInt();
                    char c4 = (char) i7;
                    if (c4 == 1) {
                        strOooO10 = o000O00.o00O0O0O.OooO(parcel, i7);
                    } else if (c4 != 2) {
                        o000O00.o00O0O0O.OooOoo0(parcel, i7);
                    } else {
                        bundleOooO0Oo2 = o000O00.o00O0O0O.OooO0Oo(parcel, i7);
                    }
                }
                o000O00.o00O0O0O.OooOOo0(parcel, iOooOooO7);
                return new C1381ad(bundleOooO0Oo2, strOooO10);
            case 28:
                int iOooOooO8 = o000O00.o00O0O0O.OooOooO(parcel);
                int iOooOoO010 = 0;
                int iOooOoO011 = 0;
                String strOooO11 = null;
                int iOooOoO012 = 0;
                while (parcel.dataPosition() < iOooOooO8) {
                    int i8 = parcel.readInt();
                    char c5 = (char) i8;
                    if (c5 == 1) {
                        iOooOoO012 = o000O00.o00O0O0O.OooOoO0(parcel, i8);
                    } else if (c5 == 2) {
                        strOooO11 = o000O00.o00O0O0O.OooO(parcel, i8);
                    } else if (c5 == 3) {
                        iOooOoO011 = o000O00.o00O0O0O.OooOoO0(parcel, i8);
                    } else if (c5 != 1000) {
                        o000O00.o00O0O0O.OooOoo0(parcel, i8);
                    } else {
                        iOooOoO010 = o000O00.o00O0O0O.OooOoO0(parcel, i8);
                    }
                }
                o000O00.o00O0O0O.OooOOo0(parcel, iOooOooO8);
                return new C1418bd(iOooOoO010, iOooOoO012, iOooOoO011, strOooO11);
            default:
                int iOooOooO9 = o000O00.o00O0O0O.OooOooO(parcel);
                int iOooOoO013 = 0;
                int iOooOoO014 = 0;
                int iOooOoO015 = 0;
                while (parcel.dataPosition() < iOooOooO9) {
                    int i9 = parcel.readInt();
                    char c6 = (char) i9;
                    if (c6 == 1) {
                        iOooOoO013 = o000O00.o00O0O0O.OooOoO0(parcel, i9);
                    } else if (c6 == 2) {
                        iOooOoO014 = o000O00.o00O0O0O.OooOoO0(parcel, i9);
                    } else if (c6 != 3) {
                        o000O00.o00O0O0O.OooOoo0(parcel, i9);
                    } else {
                        iOooOoO015 = o000O00.o00O0O0O.OooOoO0(parcel, i9);
                    }
                }
                o000O00.o00O0O0O.OooOOo0(parcel, iOooOooO9);
                return new C1788lg(iOooOoO013, iOooOoO014, iOooOoO015);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.f21819OooO00o) {
            case 0:
                return new o00OO00O[i];
            case 1:
                return new o00OO0O0[i];
            case 2:
                return new o00OO0OO[i];
            case 3:
                return new oo0O[i];
            case 4:
                return new o00OO[i];
            case 5:
                return new o00OOO00[i];
            case 6:
                return new o00OOO0[i];
            case 7:
                return new o00OOO0O[i];
            case 8:
                return new o0o0Oo[i];
            case 9:
                return new o00OOOO0[i];
            case 10:
                return new o0O00o0[i];
            case 11:
                return new oo00oO[i];
            case 12:
                return new o0oOOo[i];
            case 13:
                return new o0O0o[i];
            case 14:
                return new C1883o0[i];
            case 15:
                return new o0O00000[i];
            case 16:
                return new o0O000[i];
            case 17:
                return new o0O0000O[i];
            case 18:
                return new o0OoOoOo[i];
            case 19:
                return new o0O000Oo[i];
            case 20:
                return new C2107u2[i];
            case 21:
                return new C1629h4[i];
            case 22:
                return new C1702j4[i];
            case 23:
                return new C1414b9[i];
            case 24:
                return new C1896oc[i];
            case 25:
                return new C1932pc[i];
            case 26:
                return new C2080tc[i];
            case 27:
                return new C1381ad[i];
            case 28:
                return new C1418bd[i];
            default:
                return new C1788lg[i];
        }
    }
}
