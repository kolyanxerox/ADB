package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.text.HtmlCompat;
import com.google.android.gms.ads.internal.client.zzef;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.client.zzs;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayList;
import org.apache.tika.pipes.PipesConfigBase;

/* renamed from: com.google.android.gms.internal.ads.fi */
/* loaded from: classes2.dex */
public final class C1569fi implements Parcelable.Creator {

    /* renamed from: OooO00o */
    public final /* synthetic */ int f18952OooO00o;

    public /* synthetic */ C1569fi(int i) {
        this.f18952OooO00o = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f18952OooO00o) {
            case 0:
                int iOooOooO = o000O00.o00O0O0O.OooOooO(parcel);
                IBinder iBinderOooOo = null;
                IBinder iBinderOooOo2 = null;
                while (parcel.dataPosition() < iOooOooO) {
                    int i = parcel.readInt();
                    char c = (char) i;
                    if (c == 1) {
                        iBinderOooOo = o000O00.o00O0O0O.OooOo(parcel, i);
                    } else if (c != 2) {
                        o000O00.o00O0O0O.OooOoo0(parcel, i);
                    } else {
                        iBinderOooOo2 = o000O00.o00O0O0O.OooOo(parcel, i);
                    }
                }
                o000O00.o00O0O0O.OooOOo0(parcel, iOooOooO);
                return new C1532ei(iBinderOooOo, iBinderOooOo2);
            case 1:
                int iOooOooO2 = o000O00.o00O0O0O.OooOooO(parcel);
                Bundle bundleOooO0Oo = null;
                zzm zzmVar = null;
                zzs zzsVar = null;
                String strOooO = null;
                ApplicationInfo applicationInfo = null;
                PackageInfo packageInfo = null;
                String strOooO2 = null;
                String strOooO3 = null;
                String strOooO4 = null;
                VersionInfoParcel versionInfoParcel = null;
                Bundle bundleOooO0Oo2 = null;
                ArrayList arrayListOooOO0O = null;
                Bundle bundleOooO0Oo3 = null;
                String strOooO5 = null;
                String strOooO6 = null;
                ArrayList arrayListOooOO0O2 = null;
                String strOooO7 = null;
                C1414b9 c1414b9 = null;
                ArrayList arrayListOooOO0O3 = null;
                String strOooO8 = null;
                String strOooO9 = null;
                String strOooO10 = null;
                Bundle bundleOooO0Oo4 = null;
                String strOooO11 = null;
                zzef zzefVar = null;
                Bundle bundleOooO0Oo5 = null;
                String strOooO12 = null;
                String strOooO13 = null;
                String strOooO14 = null;
                ArrayList arrayListOooO0oO = null;
                String strOooO15 = null;
                ArrayList arrayListOooOO0O4 = null;
                ArrayList arrayListOooOO0O5 = null;
                String strOooO16 = null;
                C1418bd c1418bd = null;
                String strOooO17 = null;
                Bundle bundleOooO0Oo6 = null;
                int iOooOoO0 = 0;
                int iOooOoO02 = 0;
                boolean zOooOo0o = false;
                int iOooOoO03 = 0;
                int iOooOoO04 = 0;
                boolean zOooOo0o2 = false;
                int iOooOoO05 = 0;
                int iOooOoO06 = 0;
                boolean zOooOo0o3 = false;
                boolean zOooOo0o4 = false;
                int iOooOoO07 = 0;
                boolean zOooOo0o5 = false;
                boolean zOooOo0o6 = false;
                int iOooOoO08 = 0;
                boolean zOooOo0o7 = false;
                boolean zOooOo0o8 = false;
                boolean zOooOo0o9 = false;
                float f = 0.0f;
                float f2 = 0.0f;
                long jOooOoO = 0;
                long jOooOoO2 = 0;
                while (parcel.dataPosition() < iOooOooO2) {
                    int i2 = parcel.readInt();
                    switch ((char) i2) {
                        case 1:
                            iOooOoO0 = o000O00.o00O0O0O.OooOoO0(parcel, i2);
                            break;
                        case 2:
                            bundleOooO0Oo = o000O00.o00O0O0O.OooO0Oo(parcel, i2);
                            break;
                        case 3:
                            zzmVar = (zzm) o000O00.o00O0O0O.OooO0oo(parcel, i2, zzm.CREATOR);
                            break;
                        case 4:
                            zzsVar = (zzs) o000O00.o00O0O0O.OooO0oo(parcel, i2, zzs.CREATOR);
                            break;
                        case 5:
                            strOooO = o000O00.o00O0O0O.OooO(parcel, i2);
                            break;
                        case 6:
                            applicationInfo = (ApplicationInfo) o000O00.o00O0O0O.OooO0oo(parcel, i2, ApplicationInfo.CREATOR);
                            break;
                        case 7:
                            packageInfo = (PackageInfo) o000O00.o00O0O0O.OooO0oo(parcel, i2, PackageInfo.CREATOR);
                            break;
                        case '\b':
                            strOooO2 = o000O00.o00O0O0O.OooO(parcel, i2);
                            break;
                        case '\t':
                            strOooO3 = o000O00.o00O0O0O.OooO(parcel, i2);
                            break;
                        case '\n':
                            strOooO4 = o000O00.o00O0O0O.OooO(parcel, i2);
                            break;
                        case 11:
                            versionInfoParcel = (VersionInfoParcel) o000O00.o00O0O0O.OooO0oo(parcel, i2, VersionInfoParcel.CREATOR);
                            break;
                        case '\f':
                            bundleOooO0Oo2 = o000O00.o00O0O0O.OooO0Oo(parcel, i2);
                            break;
                        case '\r':
                            iOooOoO02 = o000O00.o00O0O0O.OooOoO0(parcel, i2);
                            break;
                        case 14:
                            arrayListOooOO0O = o000O00.o00O0O0O.OooOO0O(parcel, i2);
                            break;
                        case 15:
                            bundleOooO0Oo3 = o000O00.o00O0O0O.OooO0Oo(parcel, i2);
                            break;
                        case 16:
                            zOooOo0o = o000O00.o00O0O0O.OooOo0o(parcel, i2);
                            break;
                        case 17:
                        case 22:
                        case 23:
                        case 24:
                        case ' ':
                        case '&':
                        case IronSourceConstants.RETRY_LIMIT /* 62 */:
                        default:
                            o000O00.o00O0O0O.OooOoo0(parcel, i2);
                            break;
                        case 18:
                            iOooOoO03 = o000O00.o00O0O0O.OooOoO0(parcel, i2);
                            break;
                        case 19:
                            iOooOoO04 = o000O00.o00O0O0O.OooOoO0(parcel, i2);
                            break;
                        case 20:
                            o000O00.o00O0O0O.Oooo00o(parcel, i2, 4);
                            f = parcel.readFloat();
                            break;
                        case 21:
                            strOooO5 = o000O00.o00O0O0O.OooO(parcel, i2);
                            break;
                        case 25:
                            jOooOoO = o000O00.o00O0O0O.OooOoO(parcel, i2);
                            break;
                        case 26:
                            strOooO6 = o000O00.o00O0O0O.OooO(parcel, i2);
                            break;
                        case 27:
                            arrayListOooOO0O2 = o000O00.o00O0O0O.OooOO0O(parcel, i2);
                            break;
                        case 28:
                            strOooO7 = o000O00.o00O0O0O.OooO(parcel, i2);
                            break;
                        case 29:
                            c1414b9 = (C1414b9) o000O00.o00O0O0O.OooO0oo(parcel, i2, C1414b9.CREATOR);
                            break;
                        case 30:
                            arrayListOooOO0O3 = o000O00.o00O0O0O.OooOO0O(parcel, i2);
                            break;
                        case 31:
                            jOooOoO2 = o000O00.o00O0O0O.OooOoO(parcel, i2);
                            break;
                        case '!':
                            strOooO8 = o000O00.o00O0O0O.OooO(parcel, i2);
                            break;
                        case '\"':
                            o000O00.o00O0O0O.Oooo00o(parcel, i2, 4);
                            f2 = parcel.readFloat();
                            break;
                        case '#':
                            iOooOoO05 = o000O00.o00O0O0O.OooOoO0(parcel, i2);
                            break;
                        case '$':
                            iOooOoO06 = o000O00.o00O0O0O.OooOoO0(parcel, i2);
                            break;
                        case '%':
                            zOooOo0o3 = o000O00.o00O0O0O.OooOo0o(parcel, i2);
                            break;
                        case '\'':
                            strOooO9 = o000O00.o00O0O0O.OooO(parcel, i2);
                            break;
                        case '(':
                            zOooOo0o2 = o000O00.o00O0O0O.OooOo0o(parcel, i2);
                            break;
                        case ')':
                            strOooO10 = o000O00.o00O0O0O.OooO(parcel, i2);
                            break;
                        case '*':
                            zOooOo0o4 = o000O00.o00O0O0O.OooOo0o(parcel, i2);
                            break;
                        case '+':
                            iOooOoO07 = o000O00.o00O0O0O.OooOoO0(parcel, i2);
                            break;
                        case ',':
                            bundleOooO0Oo4 = o000O00.o00O0O0O.OooO0Oo(parcel, i2);
                            break;
                        case '-':
                            strOooO11 = o000O00.o00O0O0O.OooO(parcel, i2);
                            break;
                        case '.':
                            zzefVar = (zzef) o000O00.o00O0O0O.OooO0oo(parcel, i2, zzef.CREATOR);
                            break;
                        case '/':
                            zOooOo0o5 = o000O00.o00O0O0O.OooOo0o(parcel, i2);
                            break;
                        case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE /* 48 */:
                            bundleOooO0Oo5 = o000O00.o00O0O0O.OooO0Oo(parcel, i2);
                            break;
                        case ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                            strOooO12 = o000O00.o00O0O0O.OooO(parcel, i2);
                            break;
                        case '2':
                            strOooO13 = o000O00.o00O0O0O.OooO(parcel, i2);
                            break;
                        case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                            strOooO14 = o000O00.o00O0O0O.OooO(parcel, i2);
                            break;
                        case '4':
                            zOooOo0o6 = o000O00.o00O0O0O.OooOo0o(parcel, i2);
                            break;
                        case '5':
                            arrayListOooO0oO = o000O00.o00O0O0O.OooO0oO(parcel, i2);
                            break;
                        case '6':
                            strOooO15 = o000O00.o00O0O0O.OooO(parcel, i2);
                            break;
                        case '7':
                            arrayListOooOO0O4 = o000O00.o00O0O0O.OooOO0O(parcel, i2);
                            break;
                        case '8':
                            iOooOoO08 = o000O00.o00O0O0O.OooOoO0(parcel, i2);
                            break;
                        case '9':
                            zOooOo0o7 = o000O00.o00O0O0O.OooOo0o(parcel, i2);
                            break;
                        case ':':
                            zOooOo0o8 = o000O00.o00O0O0O.OooOo0o(parcel, i2);
                            break;
                        case ';':
                            zOooOo0o9 = o000O00.o00O0O0O.OooOo0o(parcel, i2);
                            break;
                        case PipesConfigBase.DEFAULT_STALE_FETCHER_DELAY_SECONDS /* 60 */:
                            arrayListOooOO0O5 = o000O00.o00O0O0O.OooOO0O(parcel, i2);
                            break;
                        case '=':
                            strOooO16 = o000O00.o00O0O0O.OooO(parcel, i2);
                            break;
                        case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
                            c1418bd = (C1418bd) o000O00.o00O0O0O.OooO0oo(parcel, i2, C1418bd.CREATOR);
                            break;
                        case '@':
                            strOooO17 = o000O00.o00O0O0O.OooO(parcel, i2);
                            break;
                        case 'A':
                            bundleOooO0Oo6 = o000O00.o00O0O0O.OooO0Oo(parcel, i2);
                            break;
                    }
                }
                o000O00.o00O0O0O.OooOOo0(parcel, iOooOooO2);
                return new C1753ki(iOooOoO0, bundleOooO0Oo, zzmVar, zzsVar, strOooO, applicationInfo, packageInfo, strOooO2, strOooO3, strOooO4, versionInfoParcel, bundleOooO0Oo2, iOooOoO02, arrayListOooOO0O, bundleOooO0Oo3, zOooOo0o, iOooOoO03, iOooOoO04, f, strOooO5, jOooOoO, strOooO6, arrayListOooOO0O2, strOooO7, c1414b9, arrayListOooOO0O3, jOooOoO2, strOooO8, f2, zOooOo0o2, iOooOoO05, iOooOoO06, zOooOo0o3, strOooO9, strOooO10, zOooOo0o4, iOooOoO07, bundleOooO0Oo4, strOooO11, zzefVar, zOooOo0o5, bundleOooO0Oo5, strOooO12, strOooO13, strOooO14, zOooOo0o6, arrayListOooO0oO, strOooO15, arrayListOooOO0O4, iOooOoO08, zOooOo0o7, zOooOo0o8, zOooOo0o9, arrayListOooOO0O5, strOooO16, c1418bd, strOooO17, bundleOooO0Oo6);
            case 2:
                int iOooOooO3 = o000O00.o00O0O0O.OooOooO(parcel);
                ArrayList arrayListOooOO0O6 = null;
                boolean zOooOo0o10 = false;
                while (parcel.dataPosition() < iOooOooO3) {
                    int i3 = parcel.readInt();
                    char c2 = (char) i3;
                    if (c2 == 2) {
                        zOooOo0o10 = o000O00.o00O0O0O.OooOo0o(parcel, i3);
                    } else if (c2 != 3) {
                        o000O00.o00O0O0O.OooOoo0(parcel, i3);
                    } else {
                        arrayListOooOO0O6 = o000O00.o00O0O0O.OooOO0O(parcel, i3);
                    }
                }
                o000O00.o00O0O0O.OooOOo0(parcel, iOooOooO3);
                return new C1790li(arrayListOooOO0O6, zOooOo0o10);
            case 3:
                int iOooOooO4 = o000O00.o00O0O0O.OooOooO(parcel);
                String strOooO18 = null;
                while (parcel.dataPosition() < iOooOooO4) {
                    int i4 = parcel.readInt();
                    if (((char) i4) != 1) {
                        o000O00.o00O0O0O.OooOoo0(parcel, i4);
                    } else {
                        strOooO18 = o000O00.o00O0O0O.OooO(parcel, i4);
                    }
                }
                o000O00.o00O0O0O.OooOOo0(parcel, iOooOooO4);
                return new C1827mi(strOooO18);
            case 4:
                int iOooOooO5 = o000O00.o00O0O0O.OooOooO(parcel);
                ParcelFileDescriptor parcelFileDescriptor = null;
                while (parcel.dataPosition() < iOooOooO5) {
                    int i5 = parcel.readInt();
                    if (((char) i5) != 2) {
                        o000O00.o00O0O0O.OooOoo0(parcel, i5);
                    } else {
                        parcelFileDescriptor = (ParcelFileDescriptor) o000O00.o00O0O0O.OooO0oo(parcel, i5, ParcelFileDescriptor.CREATOR);
                    }
                }
                o000O00.o00O0O0O.OooOOo0(parcel, iOooOooO5);
                return new C2160vi(parcelFileDescriptor);
            case 5:
                int iOooOooO6 = o000O00.o00O0O0O.OooOooO(parcel);
                Bundle bundleOooO0Oo7 = null;
                VersionInfoParcel versionInfoParcel2 = null;
                ApplicationInfo applicationInfo2 = null;
                String strOooO19 = null;
                ArrayList arrayListOooOO0O7 = null;
                PackageInfo packageInfo2 = null;
                String strOooO20 = null;
                String strOooO21 = null;
                ne0 ne0Var = null;
                String strOooO22 = null;
                Bundle bundleOooO0Oo8 = null;
                Bundle bundleOooO0Oo9 = null;
                boolean zOooOo0o11 = false;
                boolean zOooOo0o12 = false;
                while (parcel.dataPosition() < iOooOooO6) {
                    int i6 = parcel.readInt();
                    switch ((char) i6) {
                        case 1:
                            bundleOooO0Oo7 = o000O00.o00O0O0O.OooO0Oo(parcel, i6);
                            break;
                        case 2:
                            versionInfoParcel2 = (VersionInfoParcel) o000O00.o00O0O0O.OooO0oo(parcel, i6, VersionInfoParcel.CREATOR);
                            break;
                        case 3:
                            applicationInfo2 = (ApplicationInfo) o000O00.o00O0O0O.OooO0oo(parcel, i6, ApplicationInfo.CREATOR);
                            break;
                        case 4:
                            strOooO19 = o000O00.o00O0O0O.OooO(parcel, i6);
                            break;
                        case 5:
                            arrayListOooOO0O7 = o000O00.o00O0O0O.OooOO0O(parcel, i6);
                            break;
                        case 6:
                            packageInfo2 = (PackageInfo) o000O00.o00O0O0O.OooO0oo(parcel, i6, PackageInfo.CREATOR);
                            break;
                        case 7:
                            strOooO20 = o000O00.o00O0O0O.OooO(parcel, i6);
                            break;
                        case '\b':
                        default:
                            o000O00.o00O0O0O.OooOoo0(parcel, i6);
                            break;
                        case '\t':
                            strOooO21 = o000O00.o00O0O0O.OooO(parcel, i6);
                            break;
                        case '\n':
                            ne0Var = (ne0) o000O00.o00O0O0O.OooO0oo(parcel, i6, ne0.CREATOR);
                            break;
                        case 11:
                            strOooO22 = o000O00.o00O0O0O.OooO(parcel, i6);
                            break;
                        case '\f':
                            zOooOo0o11 = o000O00.o00O0O0O.OooOo0o(parcel, i6);
                            break;
                        case '\r':
                            zOooOo0o12 = o000O00.o00O0O0O.OooOo0o(parcel, i6);
                            break;
                        case 14:
                            bundleOooO0Oo8 = o000O00.o00O0O0O.OooO0Oo(parcel, i6);
                            break;
                        case 15:
                            bundleOooO0Oo9 = o000O00.o00O0O0O.OooO0Oo(parcel, i6);
                            break;
                    }
                }
                o000O00.o00O0O0O.OooOOo0(parcel, iOooOooO6);
                return new C2197wi(bundleOooO0Oo7, versionInfoParcel2, applicationInfo2, strOooO19, arrayListOooOO0O7, packageInfo2, strOooO20, strOooO21, ne0Var, strOooO22, zOooOo0o11, zOooOo0o12, bundleOooO0Oo8, bundleOooO0Oo9);
            case 6:
                int iOooOooO7 = o000O00.o00O0O0O.OooOooO(parcel);
                zzm zzmVar2 = null;
                String strOooO23 = null;
                while (parcel.dataPosition() < iOooOooO7) {
                    int i7 = parcel.readInt();
                    char c3 = (char) i7;
                    if (c3 == 2) {
                        zzmVar2 = (zzm) o000O00.o00O0O0O.OooO0oo(parcel, i7, zzm.CREATOR);
                    } else if (c3 != 3) {
                        o000O00.o00O0O0O.OooOoo0(parcel, i7);
                    } else {
                        strOooO23 = o000O00.o00O0O0O.OooO(parcel, i7);
                    }
                }
                o000O00.o00O0O0O.OooOOo0(parcel, iOooOooO7);
                return new C1717jj(zzmVar2, strOooO23);
            case 7:
                int iOooOooO8 = o000O00.o00O0O0O.OooOooO(parcel);
                int iOooOoO09 = 0;
                String strOooO24 = null;
                while (parcel.dataPosition() < iOooOooO8) {
                    int i8 = parcel.readInt();
                    char c4 = (char) i8;
                    if (c4 == 2) {
                        strOooO24 = o000O00.o00O0O0O.OooO(parcel, i8);
                    } else if (c4 != 3) {
                        o000O00.o00O0O0O.OooOoo0(parcel, i8);
                    } else {
                        iOooOoO09 = o000O00.o00O0O0O.OooOoO0(parcel, i8);
                    }
                }
                o000O00.o00O0O0O.OooOOo0(parcel, iOooOooO8);
                return new C1865nj(strOooO24, iOooOoO09);
            case 8:
                int iOooOooO9 = o000O00.o00O0O0O.OooOooO(parcel);
                String strOooO25 = null;
                String strOooO26 = null;
                while (parcel.dataPosition() < iOooOooO9) {
                    int i9 = parcel.readInt();
                    char c5 = (char) i9;
                    if (c5 == 1) {
                        strOooO25 = o000O00.o00O0O0O.OooO(parcel, i9);
                    } else if (c5 != 2) {
                        o000O00.o00O0O0O.OooOoo0(parcel, i9);
                    } else {
                        strOooO26 = o000O00.o00O0O0O.OooO(parcel, i9);
                    }
                }
                o000O00.o00O0O0O.OooOOo0(parcel, iOooOooO9);
                return new C1571fk(strOooO25, strOooO26);
            case 9:
                int iOooOooO10 = o000O00.o00O0O0O.OooOooO(parcel);
                String strOooO27 = null;
                String strOooO28 = null;
                ArrayList arrayListOooOO0O8 = null;
                ArrayList arrayListOooOO0O9 = null;
                boolean zOooOo0o13 = false;
                boolean zOooOo0o14 = false;
                boolean zOooOo0o15 = false;
                boolean zOooOo0o16 = false;
                while (parcel.dataPosition() < iOooOooO10) {
                    int i10 = parcel.readInt();
                    switch ((char) i10) {
                        case 2:
                            strOooO27 = o000O00.o00O0O0O.OooO(parcel, i10);
                            break;
                        case 3:
                            strOooO28 = o000O00.o00O0O0O.OooO(parcel, i10);
                            break;
                        case 4:
                            zOooOo0o13 = o000O00.o00O0O0O.OooOo0o(parcel, i10);
                            break;
                        case 5:
                            zOooOo0o14 = o000O00.o00O0O0O.OooOo0o(parcel, i10);
                            break;
                        case 6:
                            arrayListOooOO0O8 = o000O00.o00O0O0O.OooOO0O(parcel, i10);
                            break;
                        case 7:
                            zOooOo0o15 = o000O00.o00O0O0O.OooOo0o(parcel, i10);
                            break;
                        case '\b':
                            zOooOo0o16 = o000O00.o00O0O0O.OooOo0o(parcel, i10);
                            break;
                        case '\t':
                            arrayListOooOO0O9 = o000O00.o00O0O0O.OooOO0O(parcel, i10);
                            break;
                        default:
                            o000O00.o00O0O0O.OooOoo0(parcel, i10);
                            break;
                    }
                }
                o000O00.o00O0O0O.OooOOo0(parcel, iOooOooO10);
                return new C1755kk(strOooO27, strOooO28, zOooOo0o13, zOooOo0o14, arrayListOooOO0O8, zOooOo0o15, zOooOo0o16, arrayListOooOO0O9);
            case 10:
                int iOooOooO11 = o000O00.o00O0O0O.OooOooO(parcel);
                String strOooO29 = null;
                String strOooO30 = null;
                zzs zzsVar2 = null;
                zzm zzmVar3 = null;
                String strOooO31 = null;
                int iOooOoO010 = 0;
                while (parcel.dataPosition() < iOooOooO11) {
                    int i11 = parcel.readInt();
                    switch ((char) i11) {
                        case 1:
                            strOooO29 = o000O00.o00O0O0O.OooO(parcel, i11);
                            break;
                        case 2:
                            strOooO30 = o000O00.o00O0O0O.OooO(parcel, i11);
                            break;
                        case 3:
                            zzsVar2 = (zzs) o000O00.o00O0O0O.OooO0oo(parcel, i11, zzs.CREATOR);
                            break;
                        case 4:
                            zzmVar3 = (zzm) o000O00.o00O0O0O.OooO0oo(parcel, i11, zzm.CREATOR);
                            break;
                        case 5:
                            iOooOoO010 = o000O00.o00O0O0O.OooOoO0(parcel, i11);
                            break;
                        case 6:
                            strOooO31 = o000O00.o00O0O0O.OooO(parcel, i11);
                            break;
                        default:
                            o000O00.o00O0O0O.OooOoo0(parcel, i11);
                            break;
                    }
                }
                o000O00.o00O0O0O.OooOOo0(parcel, iOooOooO11);
                return new C1646hl(strOooO29, strOooO30, zzsVar2, zzmVar3, iOooOoO010, strOooO31);
            case 11:
                return new s90(parcel);
            case 12:
                return new fb0(parcel);
            case 13:
                return new ac0(parcel);
            case 14:
                int iOooOooO12 = o000O00.o00O0O0O.OooOooO(parcel);
                int iOooOoO011 = 0;
                int iOooOoO012 = 0;
                int iOooOoO013 = 0;
                int iOooOoO014 = 0;
                int iOooOoO015 = 0;
                int iOooOoO016 = 0;
                String strOooO32 = null;
                while (parcel.dataPosition() < iOooOooO12) {
                    int i12 = parcel.readInt();
                    switch ((char) i12) {
                        case 1:
                            iOooOoO011 = o000O00.o00O0O0O.OooOoO0(parcel, i12);
                            break;
                        case 2:
                            iOooOoO012 = o000O00.o00O0O0O.OooOoO0(parcel, i12);
                            break;
                        case 3:
                            iOooOoO013 = o000O00.o00O0O0O.OooOoO0(parcel, i12);
                            break;
                        case 4:
                            iOooOoO014 = o000O00.o00O0O0O.OooOoO0(parcel, i12);
                            break;
                        case 5:
                            strOooO32 = o000O00.o00O0O0O.OooO(parcel, i12);
                            break;
                        case 6:
                            iOooOoO015 = o000O00.o00O0O0O.OooOoO0(parcel, i12);
                            break;
                        case 7:
                            iOooOoO016 = o000O00.o00O0O0O.OooOoO0(parcel, i12);
                            break;
                        default:
                            o000O00.o00O0O0O.OooOoo0(parcel, i12);
                            break;
                    }
                }
                o000O00.o00O0O0O.OooOOo0(parcel, iOooOooO12);
                return new ne0(iOooOoO011, iOooOoO012, iOooOoO013, iOooOoO014, strOooO32, iOooOoO015, iOooOoO016);
            case 15:
                int iOooOooO13 = o000O00.o00O0O0O.OooOooO(parcel);
                byte[] bArrOooO0o0 = null;
                int iOooOoO017 = 0;
                while (parcel.dataPosition() < iOooOooO13) {
                    int i13 = parcel.readInt();
                    char c6 = (char) i13;
                    if (c6 == 1) {
                        iOooOoO017 = o000O00.o00O0O0O.OooOoO0(parcel, i13);
                    } else if (c6 != 2) {
                        o000O00.o00O0O0O.OooOoo0(parcel, i13);
                    } else {
                        bArrOooO0o0 = o000O00.o00O0O0O.OooO0o0(parcel, i13);
                    }
                }
                o000O00.o00O0O0O.OooOOo0(parcel, iOooOooO13);
                return new xi0(iOooOoO017, bArrOooO0o0);
            case 16:
                int iOooOooO14 = o000O00.o00O0O0O.OooOooO(parcel);
                String strOooO33 = null;
                int iOooOoO018 = 0;
                String strOooO34 = null;
                while (parcel.dataPosition() < iOooOooO14) {
                    int i14 = parcel.readInt();
                    char c7 = (char) i14;
                    if (c7 == 1) {
                        iOooOoO018 = o000O00.o00O0O0O.OooOoO0(parcel, i14);
                    } else if (c7 == 2) {
                        strOooO33 = o000O00.o00O0O0O.OooO(parcel, i14);
                    } else if (c7 != 3) {
                        o000O00.o00O0O0O.OooOoo0(parcel, i14);
                    } else {
                        strOooO34 = o000O00.o00O0O0O.OooO(parcel, i14);
                    }
                }
                o000O00.o00O0O0O.OooOOo0(parcel, iOooOooO14);
                return new zi0(iOooOoO018, strOooO33, strOooO34);
            case 17:
                int iOooOooO15 = o000O00.o00O0O0O.OooOooO(parcel);
                byte[] bArrOooO0o02 = null;
                int iOooOoO019 = 0;
                while (parcel.dataPosition() < iOooOooO15) {
                    int i15 = parcel.readInt();
                    char c8 = (char) i15;
                    if (c8 == 1) {
                        iOooOoO019 = o000O00.o00O0O0O.OooOoO0(parcel, i15);
                    } else if (c8 != 2) {
                        o000O00.o00O0O0O.OooOoo0(parcel, i15);
                    } else {
                        bArrOooO0o02 = o000O00.o00O0O0O.OooO0o0(parcel, i15);
                    }
                }
                o000O00.o00O0O0O.OooOOo0(parcel, iOooOooO15);
                return new aj0(iOooOoO019, bArrOooO0o02);
            case 18:
                int iOooOooO16 = o000O00.o00O0O0O.OooOooO(parcel);
                String strOooO35 = null;
                String strOooO36 = null;
                int iOooOoO020 = 0;
                int iOooOoO021 = 0;
                int iOooOoO022 = 0;
                while (parcel.dataPosition() < iOooOooO16) {
                    int i16 = parcel.readInt();
                    char c9 = (char) i16;
                    if (c9 == 1) {
                        iOooOoO020 = o000O00.o00O0O0O.OooOoO0(parcel, i16);
                    } else if (c9 == 2) {
                        iOooOoO021 = o000O00.o00O0O0O.OooOoO0(parcel, i16);
                    } else if (c9 == 3) {
                        strOooO35 = o000O00.o00O0O0O.OooO(parcel, i16);
                    } else if (c9 == 4) {
                        strOooO36 = o000O00.o00O0O0O.OooO(parcel, i16);
                    } else if (c9 != 5) {
                        o000O00.o00O0O0O.OooOoo0(parcel, i16);
                    } else {
                        iOooOoO022 = o000O00.o00O0O0O.OooOoO0(parcel, i16);
                    }
                }
                o000O00.o00O0O0O.OooOOo0(parcel, iOooOooO16);
                return new cj0(iOooOoO020, iOooOoO021, iOooOoO022, strOooO35, strOooO36);
            case 19:
                int iOooOooO17 = o000O00.o00O0O0O.OooOooO(parcel);
                int iOooOoO023 = 0;
                byte[] bArrOooO0o03 = null;
                int iOooOoO024 = 0;
                while (parcel.dataPosition() < iOooOooO17) {
                    int i17 = parcel.readInt();
                    char c10 = (char) i17;
                    if (c10 == 1) {
                        iOooOoO023 = o000O00.o00O0O0O.OooOoO0(parcel, i17);
                    } else if (c10 == 2) {
                        bArrOooO0o03 = o000O00.o00O0O0O.OooO0o0(parcel, i17);
                    } else if (c10 != 3) {
                        o000O00.o00O0O0O.OooOoo0(parcel, i17);
                    } else {
                        iOooOoO024 = o000O00.o00O0O0O.OooOoO0(parcel, i17);
                    }
                }
                o000O00.o00O0O0O.OooOOo0(parcel, iOooOooO17);
                return new ej0(bArrOooO0o03, iOooOoO023, iOooOoO024);
            case 20:
                return new b91(parcel);
            default:
                return new l81(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.f18952OooO00o) {
            case 0:
                return new C1532ei[i];
            case 1:
                return new C1753ki[i];
            case 2:
                return new C1790li[i];
            case 3:
                return new C1827mi[i];
            case 4:
                return new C2160vi[i];
            case 5:
                return new C2197wi[i];
            case 6:
                return new C1717jj[i];
            case 7:
                return new C1865nj[i];
            case 8:
                return new C1571fk[i];
            case 9:
                return new C1755kk[i];
            case 10:
                return new C1646hl[i];
            case 11:
                return new s90[i];
            case 12:
                return new fb0[i];
            case 13:
                return new ac0[i];
            case 14:
                return new ne0[i];
            case 15:
                return new xi0[i];
            case 16:
                return new zi0[i];
            case 17:
                return new aj0[i];
            case 18:
                return new cj0[i];
            case 19:
                return new ej0[i];
            case 20:
                return new b91[i];
            default:
                return new l81[i];
        }
    }
}
