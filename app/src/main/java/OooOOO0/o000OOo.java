package OooOoo0;

import OooOooo.o000O00O;
import OooOooo.o000Oo0;
import OooOooo.o00O00O;
import OooOooo.o00O00OO;
import OooOooo.oOO00O;
import Oooo00O.OooOOO;
import Oooo00O.OooOOO0;
import Oooo00O.OooOo;
import Oooo00O.Oooo0;
import Oooo00O.o0000O00;
import Oooo00O.o000oOoO;
import Oooo00O.o0ooOOo;
import Oooo00O.oo000o;
import OoooOOO.o00O0OO0;
import OoooOOO.o00OOOO0;
import OoooOOO.o00OOOOo;
import OoooOOO.oO0OO00;
import OoooOOO.oO0OO0O;
import OoooOOO.oOO0;
import OoooOOO.oOO000o;
import OoooOOO.oOo0o0oO;
import OoooOOO.oo0oOO0;
import OoooOOO.ooo0o;
import OoooOoo.oOO0OO0O;
import OoooOoo.oOO0OOO;
import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import o000O00.o00O0O0O;
import o00Oo0oo.o00oO0o;

/* loaded from: classes2.dex */
public final class o000OOo implements Parcelable.Creator {

    /* renamed from: OooO00o */
    public final /* synthetic */ int f13656OooO00o;

    public /* synthetic */ o000OOo(int i) {
        this.f13656OooO00o = i;
    }

    public static void OooO00o(OooOOO oooOOO, Parcel parcel, int i) {
        int iOooOoO = o00oO0o.OooOoO(parcel, 20293);
        o00oO0o.OooOooo(parcel, 1, 4);
        parcel.writeInt(oooOOO.f13766OooOo0O);
        o00oO0o.OooOooo(parcel, 2, 4);
        parcel.writeInt(oooOOO.f13767OooOo0o);
        o00oO0o.OooOooo(parcel, 3, 4);
        parcel.writeInt(oooOOO.f13765OooOo);
        o00oO0o.OooOo0(parcel, 4, oooOOO.f13769OooOoO0);
        o00oO0o.OooOOo(parcel, 5, oooOOO.f13768OooOoO);
        o00oO0o.OooOo(parcel, 6, oooOOO.f13770OooOoOO, i);
        o00oO0o.OooOOOo(7, oooOOO.f13772OooOoo0, parcel);
        o00oO0o.OooOo00(parcel, 8, oooOOO.f13771OooOoo, i);
        o00oO0o.OooOo(parcel, 10, oooOOO.f13773OooOooO, i);
        o00oO0o.OooOo(parcel, 11, oooOOO.f13774OooOooo, i);
        o00oO0o.OooOooo(parcel, 12, 4);
        parcel.writeInt(oooOOO.f13775Oooo000 ? 1 : 0);
        o00oO0o.OooOooo(parcel, 13, 4);
        parcel.writeInt(oooOOO.f13776Oooo00O);
        boolean z = oooOOO.f13777Oooo00o;
        o00oO0o.OooOooo(parcel, 14, 4);
        parcel.writeInt(z ? 1 : 0);
        o00oO0o.OooOo0(parcel, 15, oooOOO.OooO0o0());
        o00oO0o.OooOoo(parcel, iOooOoO);
    }

    public static void OooO0O0(o00OOOOo o00ooooo, Parcel parcel, int i) {
        String str = o00ooooo.zza;
        int iOooOoO = o00oO0o.OooOoO(parcel, 20293);
        o00oO0o.OooOo0(parcel, 2, str);
        o00oO0o.OooOo00(parcel, 3, o00ooooo.zzb, i);
        o00oO0o.OooOo0(parcel, 4, o00ooooo.zzc);
        long j = o00ooooo.zzd;
        o00oO0o.OooOooo(parcel, 5, 8);
        parcel.writeLong(j);
        o00oO0o.OooOoo(parcel, iOooOoO);
    }

    public static void OooO0OO(oOO000o ooo000o, Parcel parcel) {
        int i = ooo000o.zza;
        int iOooOoO = o00oO0o.OooOoO(parcel, 20293);
        o00oO0o.OooOooo(parcel, 1, 4);
        parcel.writeInt(i);
        o00oO0o.OooOo0(parcel, 2, ooo000o.zzb);
        long j = ooo000o.zzc;
        o00oO0o.OooOooo(parcel, 3, 8);
        parcel.writeLong(j);
        Long l = ooo000o.zzd;
        if (l != null) {
            o00oO0o.OooOooo(parcel, 4, 8);
            parcel.writeLong(l.longValue());
        }
        o00oO0o.OooOo0(parcel, 6, ooo000o.zze);
        o00oO0o.OooOo0(parcel, 7, ooo000o.zzf);
        Double d = ooo000o.zzg;
        if (d != null) {
            o00oO0o.OooOooo(parcel, 8, 8);
            parcel.writeDouble(d.doubleValue());
        }
        o00oO0o.OooOoo(parcel, iOooOoO);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f13656OooO00o) {
            case 0:
                int iOooOooO = o00O0O0O.OooOooO(parcel);
                String strOooO = null;
                String strOooO2 = null;
                String strOooO3 = null;
                String strOooO4 = null;
                Uri uri = null;
                String strOooO5 = null;
                String strOooO6 = null;
                ArrayList arrayListOooOOO0 = null;
                String strOooO7 = null;
                String strOooO8 = null;
                long jOooOoO = 0;
                int iOooOoO0 = 0;
                while (parcel.dataPosition() < iOooOooO) {
                    int i = parcel.readInt();
                    switch ((char) i) {
                        case 1:
                            iOooOoO0 = o00O0O0O.OooOoO0(parcel, i);
                            break;
                        case 2:
                            strOooO = o00O0O0O.OooO(parcel, i);
                            break;
                        case 3:
                            strOooO2 = o00O0O0O.OooO(parcel, i);
                            break;
                        case 4:
                            strOooO3 = o00O0O0O.OooO(parcel, i);
                            break;
                        case 5:
                            strOooO4 = o00O0O0O.OooO(parcel, i);
                            break;
                        case 6:
                            uri = (Uri) o00O0O0O.OooO0oo(parcel, i, Uri.CREATOR);
                            break;
                        case 7:
                            strOooO5 = o00O0O0O.OooO(parcel, i);
                            break;
                        case '\b':
                            jOooOoO = o00O0O0O.OooOoO(parcel, i);
                            break;
                        case '\t':
                            strOooO6 = o00O0O0O.OooO(parcel, i);
                            break;
                        case '\n':
                            arrayListOooOOO0 = o00O0O0O.OooOOO0(parcel, i, Scope.CREATOR);
                            break;
                        case 11:
                            strOooO7 = o00O0O0O.OooO(parcel, i);
                            break;
                        case '\f':
                            strOooO8 = o00O0O0O.OooO(parcel, i);
                            break;
                        default:
                            o00O0O0O.OooOoo0(parcel, i);
                            break;
                    }
                }
                o00O0O0O.OooOOo0(parcel, iOooOooO);
                return new GoogleSignInAccount(iOooOoO0, strOooO, strOooO2, strOooO3, strOooO4, uri, strOooO5, jOooOoO, strOooO6, arrayListOooOOO0, strOooO7, strOooO8);
            case 1:
                int iOooOooO2 = o00O0O0O.OooOooO(parcel);
                PendingIntent pendingIntent = null;
                int iOooOoO02 = 0;
                int iOooOoO03 = 0;
                String strOooO9 = null;
                while (parcel.dataPosition() < iOooOooO2) {
                    int i2 = parcel.readInt();
                    char c = (char) i2;
                    if (c == 1) {
                        iOooOoO02 = o00O0O0O.OooOoO0(parcel, i2);
                    } else if (c == 2) {
                        iOooOoO03 = o00O0O0O.OooOoO0(parcel, i2);
                    } else if (c == 3) {
                        pendingIntent = (PendingIntent) o00O0O0O.OooO0oo(parcel, i2, PendingIntent.CREATOR);
                    } else if (c != 4) {
                        o00O0O0O.OooOoo0(parcel, i2);
                    } else {
                        strOooO9 = o00O0O0O.OooO(parcel, i2);
                    }
                }
                o00O0O0O.OooOOo0(parcel, iOooOooO2);
                return new o000Oo0(iOooOoO02, iOooOoO03, pendingIntent, strOooO9);
            case 2:
                int iOooOooO3 = o00O0O0O.OooOooO(parcel);
                long jOooOoO2 = -1;
                int iOooOoO04 = 0;
                String strOooO10 = null;
                while (parcel.dataPosition() < iOooOooO3) {
                    int i3 = parcel.readInt();
                    char c2 = (char) i3;
                    if (c2 == 1) {
                        strOooO10 = o00O0O0O.OooO(parcel, i3);
                    } else if (c2 == 2) {
                        iOooOoO04 = o00O0O0O.OooOoO0(parcel, i3);
                    } else if (c2 != 3) {
                        o00O0O0O.OooOoo0(parcel, i3);
                    } else {
                        jOooOoO2 = o00O0O0O.OooOoO(parcel, i3);
                    }
                }
                o00O0O0O.OooOOo0(parcel, iOooOooO3);
                return new o000O00O(strOooO10, iOooOoO04, jOooOoO2);
            case 3:
                int iOooOooO4 = o00O0O0O.OooOooO(parcel);
                boolean zOooOo0o = false;
                boolean zOooOo0o2 = false;
                boolean zOooOo0o3 = false;
                boolean zOooOo0o4 = false;
                String strOooO11 = null;
                IBinder iBinderOooOo = null;
                while (parcel.dataPosition() < iOooOooO4) {
                    int i4 = parcel.readInt();
                    switch ((char) i4) {
                        case 1:
                            strOooO11 = o00O0O0O.OooO(parcel, i4);
                            break;
                        case 2:
                            zOooOo0o = o00O0O0O.OooOo0o(parcel, i4);
                            break;
                        case 3:
                            zOooOo0o2 = o00O0O0O.OooOo0o(parcel, i4);
                            break;
                        case 4:
                            iBinderOooOo = o00O0O0O.OooOo(parcel, i4);
                            break;
                        case 5:
                            zOooOo0o3 = o00O0O0O.OooOo0o(parcel, i4);
                            break;
                        case 6:
                            zOooOo0o4 = o00O0O0O.OooOo0o(parcel, i4);
                            break;
                        default:
                            o00O0O0O.OooOoo0(parcel, i4);
                            break;
                    }
                }
                o00O0O0O.OooOOo0(parcel, iOooOooO4);
                return new o00O00O(strOooO11, zOooOo0o, zOooOo0o2, iBinderOooOo, zOooOo0o3, zOooOo0o4);
            case 4:
                int iOooOooO5 = o00O0O0O.OooOooO(parcel);
                boolean zOooOo0o5 = false;
                int iOooOoO05 = 0;
                String strOooO12 = null;
                int iOooOoO06 = 0;
                while (parcel.dataPosition() < iOooOooO5) {
                    int i5 = parcel.readInt();
                    char c3 = (char) i5;
                    if (c3 == 1) {
                        zOooOo0o5 = o00O0O0O.OooOo0o(parcel, i5);
                    } else if (c3 == 2) {
                        strOooO12 = o00O0O0O.OooO(parcel, i5);
                    } else if (c3 == 3) {
                        iOooOoO06 = o00O0O0O.OooOoO0(parcel, i5);
                    } else if (c3 != 4) {
                        o00O0O0O.OooOoo0(parcel, i5);
                    } else {
                        iOooOoO05 = o00O0O0O.OooOoO0(parcel, i5);
                    }
                }
                o00O0O0O.OooOOo0(parcel, iOooOooO5);
                return new oOO00O(strOooO12, iOooOoO06, iOooOoO05, zOooOo0o5);
            case 5:
                int iOooOooO6 = o00O0O0O.OooOooO(parcel);
                boolean zOooOo0o6 = false;
                String strOooO13 = null;
                IBinder iBinderOooOo2 = null;
                boolean zOooOo0o7 = false;
                while (parcel.dataPosition() < iOooOooO6) {
                    int i6 = parcel.readInt();
                    char c4 = (char) i6;
                    if (c4 == 1) {
                        strOooO13 = o00O0O0O.OooO(parcel, i6);
                    } else if (c4 == 2) {
                        iBinderOooOo2 = o00O0O0O.OooOo(parcel, i6);
                    } else if (c4 == 3) {
                        zOooOo0o6 = o00O0O0O.OooOo0o(parcel, i6);
                    } else if (c4 != 4) {
                        o00O0O0O.OooOoo0(parcel, i6);
                    } else {
                        zOooOo0o7 = o00O0O0O.OooOo0o(parcel, i6);
                    }
                }
                o00O0O0O.OooOOo0(parcel, iOooOooO6);
                return new o00O00OO(strOooO13, iBinderOooOo2, zOooOo0o6, zOooOo0o7);
            case 6:
                int iOooOooO7 = o00O0O0O.OooOooO(parcel);
                String strOooO14 = null;
                int iOooOoO07 = 0;
                while (parcel.dataPosition() < iOooOooO7) {
                    int i7 = parcel.readInt();
                    char c5 = (char) i7;
                    if (c5 == 1) {
                        iOooOoO07 = o00O0O0O.OooOoO0(parcel, i7);
                    } else if (c5 != 2) {
                        o00O0O0O.OooOoo0(parcel, i7);
                    } else {
                        strOooO14 = o00O0O0O.OooO(parcel, i7);
                    }
                }
                o00O0O0O.OooOOo0(parcel, iOooOooO7);
                return new Scope(iOooOoO07, strOooO14);
            case 7:
                int iOooOooO8 = o00O0O0O.OooOooO(parcel);
                String strOooO15 = null;
                o000Oo0 o000oo02 = null;
                int iOooOoO08 = 0;
                PendingIntent pendingIntent2 = null;
                while (parcel.dataPosition() < iOooOooO8) {
                    int i8 = parcel.readInt();
                    char c6 = (char) i8;
                    if (c6 == 1) {
                        iOooOoO08 = o00O0O0O.OooOoO0(parcel, i8);
                    } else if (c6 == 2) {
                        strOooO15 = o00O0O0O.OooO(parcel, i8);
                    } else if (c6 == 3) {
                        pendingIntent2 = (PendingIntent) o00O0O0O.OooO0oo(parcel, i8, PendingIntent.CREATOR);
                    } else if (c6 != 4) {
                        o00O0O0O.OooOoo0(parcel, i8);
                    } else {
                        o000oo02 = (o000Oo0) o00O0O0O.OooO0oo(parcel, i8, o000Oo0.CREATOR);
                    }
                }
                o00O0O0O.OooOOo0(parcel, iOooOooO8);
                return new Status(iOooOoO08, strOooO15, pendingIntent2, o000oo02);
            case 8:
                int iOooOooO9 = o00O0O0O.OooOooO(parcel);
                ArrayList arrayListOooOOO02 = null;
                int iOooOoO09 = 0;
                while (parcel.dataPosition() < iOooOooO9) {
                    int i9 = parcel.readInt();
                    char c7 = (char) i9;
                    if (c7 == 1) {
                        iOooOoO09 = o00O0O0O.OooOoO0(parcel, i9);
                    } else if (c7 != 2) {
                        o00O0O0O.OooOoo0(parcel, i9);
                    } else {
                        arrayListOooOOO02 = o00O0O0O.OooOOO0(parcel, i9, OooOo.CREATOR);
                    }
                }
                o00O0O0O.OooOOo0(parcel, iOooOooO9);
                return new o000oOoO(iOooOoO09, arrayListOooOOO02);
            case 9:
                int iOooOooO10 = o00O0O0O.OooOooO(parcel);
                int iOooOoO010 = -1;
                int iOooOoO011 = 0;
                int iOooOoO012 = 0;
                int iOooOoO013 = 0;
                int iOooOoO014 = 0;
                String strOooO16 = null;
                String strOooO17 = null;
                long jOooOoO3 = 0;
                long jOooOoO4 = 0;
                while (parcel.dataPosition() < iOooOooO10) {
                    int i10 = parcel.readInt();
                    switch ((char) i10) {
                        case 1:
                            iOooOoO011 = o00O0O0O.OooOoO0(parcel, i10);
                            break;
                        case 2:
                            iOooOoO012 = o00O0O0O.OooOoO0(parcel, i10);
                            break;
                        case 3:
                            iOooOoO013 = o00O0O0O.OooOoO0(parcel, i10);
                            break;
                        case 4:
                            jOooOoO3 = o00O0O0O.OooOoO(parcel, i10);
                            break;
                        case 5:
                            jOooOoO4 = o00O0O0O.OooOoO(parcel, i10);
                            break;
                        case 6:
                            strOooO16 = o00O0O0O.OooO(parcel, i10);
                            break;
                        case 7:
                            strOooO17 = o00O0O0O.OooO(parcel, i10);
                            break;
                        case '\b':
                            iOooOoO014 = o00O0O0O.OooOoO0(parcel, i10);
                            break;
                        case '\t':
                            iOooOoO010 = o00O0O0O.OooOoO0(parcel, i10);
                            break;
                        default:
                            o00O0O0O.OooOoo0(parcel, i10);
                            break;
                    }
                }
                o00O0O0O.OooOOo0(parcel, iOooOooO10);
                return new OooOo(iOooOoO011, iOooOoO012, iOooOoO013, jOooOoO3, jOooOoO4, strOooO16, strOooO17, iOooOoO014, iOooOoO010);
            case 10:
                int iOooOooO11 = o00O0O0O.OooOooO(parcel);
                Account account = null;
                int iOooOoO015 = 0;
                int iOooOoO016 = 0;
                GoogleSignInAccount googleSignInAccount = null;
                while (parcel.dataPosition() < iOooOooO11) {
                    int i11 = parcel.readInt();
                    char c8 = (char) i11;
                    if (c8 == 1) {
                        iOooOoO015 = o00O0O0O.OooOoO0(parcel, i11);
                    } else if (c8 == 2) {
                        account = (Account) o00O0O0O.OooO0oo(parcel, i11, Account.CREATOR);
                    } else if (c8 == 3) {
                        iOooOoO016 = o00O0O0O.OooOoO0(parcel, i11);
                    } else if (c8 != 4) {
                        o00O0O0O.OooOoo0(parcel, i11);
                    } else {
                        googleSignInAccount = (GoogleSignInAccount) o00O0O0O.OooO0oo(parcel, i11, GoogleSignInAccount.CREATOR);
                    }
                }
                o00O0O0O.OooOOo0(parcel, iOooOooO11);
                return new oo000o(iOooOoO015, account, iOooOoO016, googleSignInAccount);
            case 11:
                int iOooOooO12 = o00O0O0O.OooOooO(parcel);
                int iOooOoO017 = 0;
                boolean zOooOo0o8 = false;
                boolean zOooOo0o9 = false;
                IBinder iBinderOooOo3 = null;
                o000Oo0 o000oo03 = null;
                while (parcel.dataPosition() < iOooOooO12) {
                    int i12 = parcel.readInt();
                    char c9 = (char) i12;
                    if (c9 == 1) {
                        iOooOoO017 = o00O0O0O.OooOoO0(parcel, i12);
                    } else if (c9 == 2) {
                        iBinderOooOo3 = o00O0O0O.OooOo(parcel, i12);
                    } else if (c9 == 3) {
                        o000oo03 = (o000Oo0) o00O0O0O.OooO0oo(parcel, i12, o000Oo0.CREATOR);
                    } else if (c9 == 4) {
                        zOooOo0o8 = o00O0O0O.OooOo0o(parcel, i12);
                    } else if (c9 != 5) {
                        o00O0O0O.OooOoo0(parcel, i12);
                    } else {
                        zOooOo0o9 = o00O0O0O.OooOo0o(parcel, i12);
                    }
                }
                o00O0O0O.OooOOo0(parcel, iOooOooO12);
                return new Oooo00O.o00oO0o(iOooOoO017, iBinderOooOo3, o000oo03, zOooOo0o8, zOooOo0o9);
            case 12:
                int iOooOooO13 = o00O0O0O.OooOooO(parcel);
                Scope[] scopeArr = null;
                int iOooOoO018 = 0;
                int iOooOoO019 = 0;
                int iOooOoO020 = 0;
                while (parcel.dataPosition() < iOooOooO13) {
                    int i13 = parcel.readInt();
                    char c10 = (char) i13;
                    if (c10 == 1) {
                        iOooOoO018 = o00O0O0O.OooOoO0(parcel, i13);
                    } else if (c10 == 2) {
                        iOooOoO019 = o00O0O0O.OooOoO0(parcel, i13);
                    } else if (c10 == 3) {
                        iOooOoO020 = o00O0O0O.OooOoO0(parcel, i13);
                    } else if (c10 != 4) {
                        o00O0O0O.OooOoo0(parcel, i13);
                    } else {
                        scopeArr = (Scope[]) o00O0O0O.OooOO0o(parcel, i13, Scope.CREATOR);
                    }
                }
                o00O0O0O.OooOOo0(parcel, iOooOooO13);
                return new o0ooOOo(iOooOoO018, iOooOoO019, iOooOoO020, scopeArr);
            case 13:
                int iOooOooO14 = o00O0O0O.OooOooO(parcel);
                int iOooOoO021 = 0;
                int iOooOoO022 = 0;
                int iOooOoO023 = 0;
                boolean zOooOo0o10 = false;
                boolean zOooOo0o11 = false;
                while (parcel.dataPosition() < iOooOooO14) {
                    int i14 = parcel.readInt();
                    char c11 = (char) i14;
                    if (c11 == 1) {
                        iOooOoO021 = o00O0O0O.OooOoO0(parcel, i14);
                    } else if (c11 == 2) {
                        zOooOo0o10 = o00O0O0O.OooOo0o(parcel, i14);
                    } else if (c11 == 3) {
                        zOooOo0o11 = o00O0O0O.OooOo0o(parcel, i14);
                    } else if (c11 == 4) {
                        iOooOoO022 = o00O0O0O.OooOoO0(parcel, i14);
                    } else if (c11 != 5) {
                        o00O0O0O.OooOoo0(parcel, i14);
                    } else {
                        iOooOoO023 = o00O0O0O.OooOoO0(parcel, i14);
                    }
                }
                o00O0O0O.OooOOo0(parcel, iOooOooO14);
                return new Oooo0(iOooOoO021, iOooOoO022, iOooOoO023, zOooOo0o10, zOooOo0o11);
            case 14:
                int iOooOooO15 = o00O0O0O.OooOooO(parcel);
                Bundle bundleOooO0Oo = null;
                OooOOO0 oooOOO0 = null;
                int iOooOoO024 = 0;
                o000O00O[] o000o00oArr = null;
                while (parcel.dataPosition() < iOooOooO15) {
                    int i15 = parcel.readInt();
                    char c12 = (char) i15;
                    if (c12 == 1) {
                        bundleOooO0Oo = o00O0O0O.OooO0Oo(parcel, i15);
                    } else if (c12 == 2) {
                        o000o00oArr = (o000O00O[]) o00O0O0O.OooOO0o(parcel, i15, o000O00O.CREATOR);
                    } else if (c12 == 3) {
                        iOooOoO024 = o00O0O0O.OooOoO0(parcel, i15);
                    } else if (c12 != 4) {
                        o00O0O0O.OooOoo0(parcel, i15);
                    } else {
                        oooOOO0 = (OooOOO0) o00O0O0O.OooO0oo(parcel, i15, OooOOO0.CREATOR);
                    }
                }
                o00O0O0O.OooOOo0(parcel, iOooOooO15);
                o0000O00 o0000o00 = new o0000O00();
                o0000o00.f13801OooOo0O = bundleOooO0Oo;
                o0000o00.f13802OooOo0o = o000o00oArr;
                o0000o00.f13800OooOo = iOooOoO024;
                o0000o00.f13803OooOoO0 = oooOOO0;
                return o0000o00;
            case 15:
                int iOooOooO16 = o00O0O0O.OooOooO(parcel);
                Oooo0 oooo0 = null;
                int[] iArrCreateIntArray = null;
                int[] iArrCreateIntArray2 = null;
                boolean zOooOo0o12 = false;
                boolean zOooOo0o13 = false;
                int iOooOoO025 = 0;
                while (parcel.dataPosition() < iOooOooO16) {
                    int i16 = parcel.readInt();
                    switch ((char) i16) {
                        case 1:
                            oooo0 = (Oooo0) o00O0O0O.OooO0oo(parcel, i16, Oooo0.CREATOR);
                            break;
                        case 2:
                            zOooOo0o12 = o00O0O0O.OooOo0o(parcel, i16);
                            break;
                        case 3:
                            zOooOo0o13 = o00O0O0O.OooOo0o(parcel, i16);
                            break;
                        case 4:
                            int iOooOoOO = o00O0O0O.OooOoOO(parcel, i16);
                            int iDataPosition = parcel.dataPosition();
                            if (iOooOoOO != 0) {
                                iArrCreateIntArray = parcel.createIntArray();
                                parcel.setDataPosition(iDataPosition + iOooOoOO);
                                break;
                            } else {
                                iArrCreateIntArray = null;
                                break;
                            }
                        case 5:
                            iOooOoO025 = o00O0O0O.OooOoO0(parcel, i16);
                            break;
                        case 6:
                            int iOooOoOO2 = o00O0O0O.OooOoOO(parcel, i16);
                            int iDataPosition2 = parcel.dataPosition();
                            if (iOooOoOO2 != 0) {
                                iArrCreateIntArray2 = parcel.createIntArray();
                                parcel.setDataPosition(iDataPosition2 + iOooOoOO2);
                                break;
                            } else {
                                iArrCreateIntArray2 = null;
                                break;
                            }
                        default:
                            o00O0O0O.OooOoo0(parcel, i16);
                            break;
                    }
                }
                o00O0O0O.OooOOo0(parcel, iOooOooO16);
                return new OooOOO0(oooo0, zOooOo0o12, zOooOo0o13, iArrCreateIntArray, iOooOoO025, iArrCreateIntArray2);
            case 16:
                int iOooOooO17 = o00O0O0O.OooOooO(parcel);
                Scope[] scopeArr2 = OooOOO.f13763Oooo0;
                Bundle bundle = new Bundle();
                o000O00O[] o000o00oArr2 = OooOOO.f13764Oooo0O0;
                o000O00O[] o000o00oArr3 = o000o00oArr2;
                String strOooO18 = null;
                IBinder iBinderOooOo4 = null;
                Account account2 = null;
                String strOooO19 = null;
                int iOooOoO026 = 0;
                int iOooOoO027 = 0;
                int iOooOoO028 = 0;
                boolean zOooOo0o14 = false;
                int iOooOoO029 = 0;
                boolean zOooOo0o15 = false;
                while (parcel.dataPosition() < iOooOooO17) {
                    int i17 = parcel.readInt();
                    switch ((char) i17) {
                        case 1:
                            iOooOoO026 = o00O0O0O.OooOoO0(parcel, i17);
                            break;
                        case 2:
                            iOooOoO027 = o00O0O0O.OooOoO0(parcel, i17);
                            break;
                        case 3:
                            iOooOoO028 = o00O0O0O.OooOoO0(parcel, i17);
                            break;
                        case 4:
                            strOooO18 = o00O0O0O.OooO(parcel, i17);
                            break;
                        case 5:
                            iBinderOooOo4 = o00O0O0O.OooOo(parcel, i17);
                            break;
                        case 6:
                            scopeArr2 = (Scope[]) o00O0O0O.OooOO0o(parcel, i17, Scope.CREATOR);
                            break;
                        case 7:
                            bundle = o00O0O0O.OooO0Oo(parcel, i17);
                            break;
                        case '\b':
                            account2 = (Account) o00O0O0O.OooO0oo(parcel, i17, Account.CREATOR);
                            break;
                        case '\t':
                        default:
                            o00O0O0O.OooOoo0(parcel, i17);
                            break;
                        case '\n':
                            o000o00oArr2 = (o000O00O[]) o00O0O0O.OooOO0o(parcel, i17, o000O00O.CREATOR);
                            break;
                        case 11:
                            o000o00oArr3 = (o000O00O[]) o00O0O0O.OooOO0o(parcel, i17, o000O00O.CREATOR);
                            break;
                        case '\f':
                            zOooOo0o14 = o00O0O0O.OooOo0o(parcel, i17);
                            break;
                        case '\r':
                            iOooOoO029 = o00O0O0O.OooOoO0(parcel, i17);
                            break;
                        case 14:
                            zOooOo0o15 = o00O0O0O.OooOo0o(parcel, i17);
                            break;
                        case 15:
                            strOooO19 = o00O0O0O.OooO(parcel, i17);
                            break;
                    }
                }
                o00O0O0O.OooOOo0(parcel, iOooOooO17);
                return new OooOOO(iOooOoO026, iOooOoO027, iOooOoO028, strOooO18, iBinderOooOo4, scopeArr2, bundle, account2, o000o00oArr2, o000o00oArr3, zOooOo0o14, iOooOoO029, zOooOo0o15, strOooO19);
            case 17:
                int iOooOooO18 = o00O0O0O.OooOooO(parcel);
                long jOooOoO5 = 0;
                long jOooOoO6 = 0;
                int iOooOoO030 = 0;
                while (parcel.dataPosition() < iOooOooO18) {
                    int i18 = parcel.readInt();
                    char c13 = (char) i18;
                    if (c13 == 1) {
                        jOooOoO5 = o00O0O0O.OooOoO(parcel, i18);
                    } else if (c13 == 2) {
                        iOooOoO030 = o00O0O0O.OooOoO0(parcel, i18);
                    } else if (c13 != 3) {
                        o00O0O0O.OooOoo0(parcel, i18);
                    } else {
                        jOooOoO6 = o00O0O0O.OooOoO(parcel, i18);
                    }
                }
                o00O0O0O.OooOOo0(parcel, iOooOooO18);
                return new OoooOOO.o00O0O0O(iOooOoO030, jOooOoO5, jOooOoO6);
            case 18:
                int iOooOooO19 = o00O0O0O.OooOooO(parcel);
                String strOooO20 = null;
                String strOooO21 = null;
                oOO000o ooo000o = null;
                String strOooO22 = null;
                o00OOOOo o00ooooo = null;
                o00OOOOo o00ooooo2 = null;
                o00OOOOo o00ooooo3 = null;
                long jOooOoO7 = 0;
                long jOooOoO8 = 0;
                long jOooOoO9 = 0;
                boolean zOooOo0o16 = false;
                while (parcel.dataPosition() < iOooOooO19) {
                    int i19 = parcel.readInt();
                    switch ((char) i19) {
                        case 2:
                            strOooO20 = o00O0O0O.OooO(parcel, i19);
                            break;
                        case 3:
                            strOooO21 = o00O0O0O.OooO(parcel, i19);
                            break;
                        case 4:
                            ooo000o = (oOO000o) o00O0O0O.OooO0oo(parcel, i19, oOO000o.CREATOR);
                            break;
                        case 5:
                            jOooOoO7 = o00O0O0O.OooOoO(parcel, i19);
                            break;
                        case 6:
                            zOooOo0o16 = o00O0O0O.OooOo0o(parcel, i19);
                            break;
                        case 7:
                            strOooO22 = o00O0O0O.OooO(parcel, i19);
                            break;
                        case '\b':
                            o00ooooo = (o00OOOOo) o00O0O0O.OooO0oo(parcel, i19, o00OOOOo.CREATOR);
                            break;
                        case '\t':
                            jOooOoO8 = o00O0O0O.OooOoO(parcel, i19);
                            break;
                        case '\n':
                            o00ooooo2 = (o00OOOOo) o00O0O0O.OooO0oo(parcel, i19, o00OOOOo.CREATOR);
                            break;
                        case 11:
                            jOooOoO9 = o00O0O0O.OooOoO(parcel, i19);
                            break;
                        case '\f':
                            o00ooooo3 = (o00OOOOo) o00O0O0O.OooO0oo(parcel, i19, o00OOOOo.CREATOR);
                            break;
                        default:
                            o00O0O0O.OooOoo0(parcel, i19);
                            break;
                    }
                }
                o00O0O0O.OooOOo0(parcel, iOooOooO19);
                return new o00O0OO0(strOooO20, strOooO21, ooo000o, jOooOoO7, zOooOo0o16, strOooO22, o00ooooo, jOooOoO8, o00ooooo2, jOooOoO9, o00ooooo3);
            case 19:
                int iOooOooO20 = o00O0O0O.OooOooO(parcel);
                Bundle bundleOooO0Oo2 = null;
                while (parcel.dataPosition() < iOooOooO20) {
                    int i20 = parcel.readInt();
                    if (((char) i20) != 1) {
                        o00O0O0O.OooOoo0(parcel, i20);
                    } else {
                        bundleOooO0Oo2 = o00O0O0O.OooO0Oo(parcel, i20);
                    }
                }
                o00O0O0O.OooOOo0(parcel, iOooOooO20);
                return new oo0oOO0(bundleOooO0Oo2);
            case 20:
                int iOooOooO21 = o00O0O0O.OooOooO(parcel);
                Bundle bundleOooO0Oo3 = null;
                while (parcel.dataPosition() < iOooOooO21) {
                    int i21 = parcel.readInt();
                    if (((char) i21) != 2) {
                        o00O0O0O.OooOoo0(parcel, i21);
                    } else {
                        bundleOooO0Oo3 = o00O0O0O.OooO0Oo(parcel, i21);
                    }
                }
                o00O0O0O.OooOOo0(parcel, iOooOooO21);
                return new o00OOOO0(bundleOooO0Oo3);
            case 21:
                int iOooOooO22 = o00O0O0O.OooOooO(parcel);
                long jOooOoO10 = 0;
                String strOooO23 = null;
                o00OOOO0 o00oooo0 = null;
                String strOooO24 = null;
                while (parcel.dataPosition() < iOooOooO22) {
                    int i22 = parcel.readInt();
                    char c14 = (char) i22;
                    if (c14 == 2) {
                        strOooO23 = o00O0O0O.OooO(parcel, i22);
                    } else if (c14 == 3) {
                        o00oooo0 = (o00OOOO0) o00O0O0O.OooO0oo(parcel, i22, o00OOOO0.CREATOR);
                    } else if (c14 == 4) {
                        strOooO24 = o00O0O0O.OooO(parcel, i22);
                    } else if (c14 != 5) {
                        o00O0O0O.OooOoo0(parcel, i22);
                    } else {
                        jOooOoO10 = o00O0O0O.OooOoO(parcel, i22);
                    }
                }
                o00O0O0O.OooOOo0(parcel, iOooOooO22);
                return new o00OOOOo(strOooO23, o00oooo0, strOooO24, jOooOoO10);
            case 22:
                int iOooOooO23 = o00O0O0O.OooOooO(parcel);
                int iOooOoO031 = 0;
                long jOooOoO11 = 0;
                String strOooO25 = null;
                while (parcel.dataPosition() < iOooOooO23) {
                    int i23 = parcel.readInt();
                    char c15 = (char) i23;
                    if (c15 == 1) {
                        strOooO25 = o00O0O0O.OooO(parcel, i23);
                    } else if (c15 == 2) {
                        jOooOoO11 = o00O0O0O.OooOoO(parcel, i23);
                    } else if (c15 != 3) {
                        o00O0O0O.OooOoo0(parcel, i23);
                    } else {
                        iOooOoO031 = o00O0O0O.OooOoO0(parcel, i23);
                    }
                }
                o00O0O0O.OooOOo0(parcel, iOooOooO23);
                return new oOo0o0oO(iOooOoO031, jOooOoO11, strOooO25);
            case 23:
                int iOooOooO24 = o00O0O0O.OooOooO(parcel);
                byte[] bArrOooO0o0 = null;
                String strOooO26 = null;
                Bundle bundleOooO0Oo4 = null;
                String strOooO27 = null;
                long jOooOoO12 = 0;
                long jOooOoO13 = 0;
                int iOooOoO032 = 0;
                while (parcel.dataPosition() < iOooOooO24) {
                    int i24 = parcel.readInt();
                    switch ((char) i24) {
                        case 1:
                            jOooOoO12 = o00O0O0O.OooOoO(parcel, i24);
                            break;
                        case 2:
                            bArrOooO0o0 = o00O0O0O.OooO0o0(parcel, i24);
                            break;
                        case 3:
                            strOooO26 = o00O0O0O.OooO(parcel, i24);
                            break;
                        case 4:
                            bundleOooO0Oo4 = o00O0O0O.OooO0Oo(parcel, i24);
                            break;
                        case 5:
                            iOooOoO032 = o00O0O0O.OooOoO0(parcel, i24);
                            break;
                        case 6:
                            jOooOoO13 = o00O0O0O.OooOoO(parcel, i24);
                            break;
                        case 7:
                            strOooO27 = o00O0O0O.OooO(parcel, i24);
                            break;
                        default:
                            o00O0O0O.OooOoo0(parcel, i24);
                            break;
                    }
                }
                o00O0O0O.OooOOo0(parcel, iOooOooO24);
                return new ooo0o(jOooOoO12, bArrOooO0o0, strOooO26, bundleOooO0Oo4, iOooOoO032, jOooOoO13, strOooO27);
            case 24:
                int iOooOooO25 = o00O0O0O.OooOooO(parcel);
                ArrayList arrayListOooO0oO = null;
                while (parcel.dataPosition() < iOooOooO25) {
                    int i25 = parcel.readInt();
                    if (((char) i25) != 1) {
                        o00O0O0O.OooOoo0(parcel, i25);
                    } else {
                        arrayListOooO0oO = o00O0O0O.OooO0oO(parcel, i25);
                    }
                }
                o00O0O0O.OooOOo0(parcel, iOooOooO25);
                return new oO0OO00(arrayListOooO0oO);
            case 25:
                int iOooOooO26 = o00O0O0O.OooOooO(parcel);
                ArrayList arrayListOooOOO03 = null;
                while (parcel.dataPosition() < iOooOooO26) {
                    int i26 = parcel.readInt();
                    if (((char) i26) != 1) {
                        o00O0O0O.OooOoo0(parcel, i26);
                    } else {
                        arrayListOooOOO03 = o00O0O0O.OooOOO0(parcel, i26, ooo0o.CREATOR);
                    }
                }
                o00O0O0O.OooOOo0(parcel, iOooOooO26);
                return new oO0OO0O(arrayListOooOOO03);
            case 26:
                int iOooOooO27 = o00O0O0O.OooOooO(parcel);
                String strOooO28 = null;
                Long lValueOf = null;
                Float fValueOf = null;
                String strOooO29 = null;
                String strOooO30 = null;
                Double dValueOf = null;
                long jOooOoO14 = 0;
                int iOooOoO033 = 0;
                while (parcel.dataPosition() < iOooOooO27) {
                    int i27 = parcel.readInt();
                    switch ((char) i27) {
                        case 1:
                            iOooOoO033 = o00O0O0O.OooOoO0(parcel, i27);
                            break;
                        case 2:
                            strOooO28 = o00O0O0O.OooO(parcel, i27);
                            break;
                        case 3:
                            jOooOoO14 = o00O0O0O.OooOoO(parcel, i27);
                            break;
                        case 4:
                            int iOooOoOO3 = o00O0O0O.OooOoOO(parcel, i27);
                            if (iOooOoOO3 != 0) {
                                o00O0O0O.Oooo000(parcel, iOooOoOO3, 8);
                                lValueOf = Long.valueOf(parcel.readLong());
                                break;
                            } else {
                                lValueOf = null;
                                break;
                            }
                        case 5:
                            int iOooOoOO4 = o00O0O0O.OooOoOO(parcel, i27);
                            if (iOooOoOO4 != 0) {
                                o00O0O0O.Oooo000(parcel, iOooOoOO4, 4);
                                fValueOf = Float.valueOf(parcel.readFloat());
                                break;
                            } else {
                                fValueOf = null;
                                break;
                            }
                        case 6:
                            strOooO29 = o00O0O0O.OooO(parcel, i27);
                            break;
                        case 7:
                            strOooO30 = o00O0O0O.OooO(parcel, i27);
                            break;
                        case '\b':
                            int iOooOoOO5 = o00O0O0O.OooOoOO(parcel, i27);
                            if (iOooOoOO5 != 0) {
                                o00O0O0O.Oooo000(parcel, iOooOoOO5, 8);
                                dValueOf = Double.valueOf(parcel.readDouble());
                                break;
                            } else {
                                dValueOf = null;
                                break;
                            }
                        default:
                            o00O0O0O.OooOoo0(parcel, i27);
                            break;
                    }
                }
                o00O0O0O.OooOOo0(parcel, iOooOooO27);
                return new oOO000o(iOooOoO033, strOooO28, jOooOoO14, lValueOf, fValueOf, strOooO29, strOooO30, dValueOf);
            case 27:
                int iOooOooO28 = o00O0O0O.OooOooO(parcel);
                boolean zOooOo0o17 = false;
                int iOooOoO034 = 0;
                boolean zOooOo0o18 = false;
                boolean zOooOo0o19 = false;
                int iOooOoO035 = 0;
                int iOooOoO036 = 0;
                long jOooOoO15 = 0;
                long jOooOoO16 = 0;
                long jOooOoO17 = 0;
                long jOooOoO18 = 0;
                long jOooOoO19 = 0;
                long jOooOoO20 = 0;
                long jOooOoO21 = 0;
                String strOooO31 = "";
                String strOooO32 = strOooO31;
                String strOooO33 = strOooO32;
                String strOooO34 = strOooO33;
                String strOooO35 = null;
                String strOooO36 = null;
                String strOooO37 = null;
                String strOooO38 = null;
                String strOooO39 = null;
                String strOooO40 = null;
                Boolean boolValueOf = null;
                ArrayList arrayListOooOO0O = null;
                String strOooO41 = null;
                String strOooO42 = null;
                int iOooOoO037 = 100;
                boolean zOooOo0o20 = true;
                boolean zOooOo0o21 = true;
                long jOooOoO22 = -2147483648L;
                while (parcel.dataPosition() < iOooOooO28) {
                    int i28 = parcel.readInt();
                    switch ((char) i28) {
                        case 2:
                            strOooO35 = o00O0O0O.OooO(parcel, i28);
                            break;
                        case 3:
                            strOooO36 = o00O0O0O.OooO(parcel, i28);
                            break;
                        case 4:
                            strOooO37 = o00O0O0O.OooO(parcel, i28);
                            break;
                        case 5:
                            strOooO38 = o00O0O0O.OooO(parcel, i28);
                            break;
                        case 6:
                            jOooOoO15 = o00O0O0O.OooOoO(parcel, i28);
                            break;
                        case 7:
                            jOooOoO16 = o00O0O0O.OooOoO(parcel, i28);
                            break;
                        case '\b':
                            strOooO39 = o00O0O0O.OooO(parcel, i28);
                            break;
                        case '\t':
                            zOooOo0o20 = o00O0O0O.OooOo0o(parcel, i28);
                            break;
                        case '\n':
                            zOooOo0o17 = o00O0O0O.OooOo0o(parcel, i28);
                            break;
                        case 11:
                            jOooOoO22 = o00O0O0O.OooOoO(parcel, i28);
                            break;
                        case '\f':
                            strOooO40 = o00O0O0O.OooO(parcel, i28);
                            break;
                        case '\r':
                        case 17:
                        case 19:
                        case 20:
                        case 24:
                        case '!':
                        default:
                            o00O0O0O.OooOoo0(parcel, i28);
                            break;
                        case 14:
                            jOooOoO17 = o00O0O0O.OooOoO(parcel, i28);
                            break;
                        case 15:
                            iOooOoO034 = o00O0O0O.OooOoO0(parcel, i28);
                            break;
                        case 16:
                            zOooOo0o21 = o00O0O0O.OooOo0o(parcel, i28);
                            break;
                        case 18:
                            zOooOo0o18 = o00O0O0O.OooOo0o(parcel, i28);
                            break;
                        case 21:
                            int iOooOoOO6 = o00O0O0O.OooOoOO(parcel, i28);
                            if (iOooOoOO6 != 0) {
                                o00O0O0O.Oooo000(parcel, iOooOoOO6, 4);
                                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                                break;
                            } else {
                                boolValueOf = null;
                                break;
                            }
                        case 22:
                            jOooOoO18 = o00O0O0O.OooOoO(parcel, i28);
                            break;
                        case 23:
                            arrayListOooOO0O = o00O0O0O.OooOO0O(parcel, i28);
                            break;
                        case 25:
                            strOooO31 = o00O0O0O.OooO(parcel, i28);
                            break;
                        case 26:
                            strOooO32 = o00O0O0O.OooO(parcel, i28);
                            break;
                        case 27:
                            strOooO41 = o00O0O0O.OooO(parcel, i28);
                            break;
                        case 28:
                            zOooOo0o19 = o00O0O0O.OooOo0o(parcel, i28);
                            break;
                        case 29:
                            jOooOoO19 = o00O0O0O.OooOoO(parcel, i28);
                            break;
                        case 30:
                            iOooOoO037 = o00O0O0O.OooOoO0(parcel, i28);
                            break;
                        case 31:
                            strOooO33 = o00O0O0O.OooO(parcel, i28);
                            break;
                        case ' ':
                            iOooOoO035 = o00O0O0O.OooOoO0(parcel, i28);
                            break;
                        case '\"':
                            jOooOoO20 = o00O0O0O.OooOoO(parcel, i28);
                            break;
                        case '#':
                            strOooO42 = o00O0O0O.OooO(parcel, i28);
                            break;
                        case '$':
                            strOooO34 = o00O0O0O.OooO(parcel, i28);
                            break;
                        case '%':
                            jOooOoO21 = o00O0O0O.OooOoO(parcel, i28);
                            break;
                        case '&':
                            iOooOoO036 = o00O0O0O.OooOoO0(parcel, i28);
                            break;
                    }
                }
                o00O0O0O.OooOOo0(parcel, iOooOooO28);
                return new oOO0(strOooO35, strOooO36, strOooO37, strOooO38, jOooOoO15, jOooOoO16, strOooO39, zOooOo0o20, zOooOo0o17, jOooOoO22, strOooO40, jOooOoO17, iOooOoO034, zOooOo0o21, zOooOo0o18, boolValueOf, jOooOoO18, arrayListOooOO0O, strOooO31, strOooO32, strOooO41, zOooOo0o19, jOooOoO19, iOooOoO037, strOooO33, iOooOoO035, jOooOoO20, strOooO42, strOooO34, jOooOoO21, iOooOoO036);
            case 28:
                int iOooOooO29 = o00O0O0O.OooOooO(parcel);
                Intent intent = null;
                int iOooOoO038 = 0;
                int iOooOoO039 = 0;
                while (parcel.dataPosition() < iOooOooO29) {
                    int i29 = parcel.readInt();
                    char c16 = (char) i29;
                    if (c16 == 1) {
                        iOooOoO038 = o00O0O0O.OooOoO0(parcel, i29);
                    } else if (c16 == 2) {
                        iOooOoO039 = o00O0O0O.OooOoO0(parcel, i29);
                    } else if (c16 != 3) {
                        o00O0O0O.OooOoo0(parcel, i29);
                    } else {
                        intent = (Intent) o00O0O0O.OooO0oo(parcel, i29, Intent.CREATOR);
                    }
                }
                o00O0O0O.OooOOo0(parcel, iOooOooO29);
                return new oOO0OO0O(iOooOoO038, iOooOoO039, intent);
            default:
                int iOooOooO30 = o00O0O0O.OooOooO(parcel);
                ArrayList arrayListOooOO0O2 = null;
                String strOooO43 = null;
                while (parcel.dataPosition() < iOooOooO30) {
                    int i30 = parcel.readInt();
                    char c17 = (char) i30;
                    if (c17 == 1) {
                        arrayListOooOO0O2 = o00O0O0O.OooOO0O(parcel, i30);
                    } else if (c17 != 2) {
                        o00O0O0O.OooOoo0(parcel, i30);
                    } else {
                        strOooO43 = o00O0O0O.OooO(parcel, i30);
                    }
                }
                o00O0O0O.OooOOo0(parcel, iOooOooO30);
                return new oOO0OOO(strOooO43, arrayListOooOO0O2);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.f13656OooO00o) {
            case 0:
                return new GoogleSignInAccount[i];
            case 1:
                return new o000Oo0[i];
            case 2:
                return new o000O00O[i];
            case 3:
                return new o00O00O[i];
            case 4:
                return new oOO00O[i];
            case 5:
                return new o00O00OO[i];
            case 6:
                return new Scope[i];
            case 7:
                return new Status[i];
            case 8:
                return new o000oOoO[i];
            case 9:
                return new OooOo[i];
            case 10:
                return new oo000o[i];
            case 11:
                return new Oooo00O.o00oO0o[i];
            case 12:
                return new o0ooOOo[i];
            case 13:
                return new Oooo0[i];
            case 14:
                return new o0000O00[i];
            case 15:
                return new OooOOO0[i];
            case 16:
                return new OooOOO[i];
            case 17:
                return new OoooOOO.o00O0O0O[i];
            case 18:
                return new o00O0OO0[i];
            case 19:
                return new oo0oOO0[i];
            case 20:
                return new o00OOOO0[i];
            case 21:
                return new o00OOOOo[i];
            case 22:
                return new oOo0o0oO[i];
            case 23:
                return new ooo0o[i];
            case 24:
                return new oO0OO00[i];
            case 25:
                return new oO0OO0O[i];
            case 26:
                return new oOO000o[i];
            case 27:
                return new oOO0[i];
            case 28:
                return new oOO0OO0O[i];
            default:
                return new oOO0OOO[i];
        }
    }
}
