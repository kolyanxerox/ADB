package OoooOOO;

import OoooO0.OooO0o;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.measurement.o0OO00O;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class o0OoOoOo extends OooO0o implements o0O000o0 {
    public o0OoOoOo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService", 2);
    }

    @Override // OoooOOO.o0O000o0
    public final List OooOo0(String str, String str2, String str3, boolean z) {
        Parcel parcelO000OO0O = o000OO0O();
        parcelO000OO0O.writeString(null);
        parcelO000OO0O.writeString(str2);
        parcelO000OO0O.writeString(str3);
        ClassLoader classLoader = o0OO00O.f26540OooO00o;
        parcelO000OO0O.writeInt(z ? 1 : 0);
        Parcel parcelOooOOO = OooOOO(parcelO000OO0O, 15);
        ArrayList arrayListCreateTypedArrayList = parcelOooOOO.createTypedArrayList(oOO000o.CREATOR);
        parcelOooOOO.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // OoooOOO.o0O000o0
    public final void OooOo0O(oOO0 ooo0) {
        Parcel parcelO000OO0O = o000OO0O();
        o0OO00O.OooO0O0(parcelO000OO0O, ooo0);
        o000O0O0(parcelO000OO0O, 4);
    }

    @Override // OoooOOO.o0O000o0
    public final oo0oOO0 OooOoo(oOO0 ooo0) {
        Parcel parcelO000OO0O = o000OO0O();
        o0OO00O.OooO0O0(parcelO000OO0O, ooo0);
        Parcel parcelOooOOO = OooOOO(parcelO000OO0O, 21);
        oo0oOO0 oo0ooo0 = (oo0oOO0) o0OO00O.OooO00o(parcelOooOOO, oo0oOO0.CREATOR);
        parcelOooOOO.recycle();
        return oo0ooo0;
    }

    @Override // OoooOOO.o0O000o0
    public final void OooOooO(oOO0 ooo0, Bundle bundle) {
        Parcel parcelO000OO0O = o000OO0O();
        o0OO00O.OooO0O0(parcelO000OO0O, bundle);
        o0OO00O.OooO0O0(parcelO000OO0O, ooo0);
        o000O0O0(parcelO000OO0O, 19);
    }

    @Override // OoooOOO.o0O000o0
    public final List Oooo0OO(String str, String str2, String str3) {
        Parcel parcelO000OO0O = o000OO0O();
        parcelO000OO0O.writeString(null);
        parcelO000OO0O.writeString(str2);
        parcelO000OO0O.writeString(str3);
        Parcel parcelOooOOO = OooOOO(parcelO000OO0O, 17);
        ArrayList arrayListCreateTypedArrayList = parcelOooOOO.createTypedArrayList(o00O0OO0.CREATOR);
        parcelOooOOO.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // OoooOOO.o0O000o0
    public final void Oooo0o(oOO0 ooo0) {
        Parcel parcelO000OO0O = o000OO0O();
        o0OO00O.OooO0O0(parcelO000OO0O, ooo0);
        o000O0O0(parcelO000OO0O, 26);
    }

    @Override // OoooOOO.o0O000o0
    public final void Oooo0oO(oOO0 ooo0) {
        Parcel parcelO000OO0O = o000OO0O();
        o0OO00O.OooO0O0(parcelO000OO0O, ooo0);
        o000O0O0(parcelO000OO0O, 6);
    }

    @Override // OoooOOO.o0O000o0
    public final void OoooO(oOO0 ooo0) {
        Parcel parcelO000OO0O = o000OO0O();
        o0OO00O.OooO0O0(parcelO000OO0O, ooo0);
        o000O0O0(parcelO000OO0O, 25);
    }

    @Override // OoooOOO.o0O000o0
    public final void OoooOO0(oOO0 ooo0) {
        Parcel parcelO000OO0O = o000OO0O();
        o0OO00O.OooO0O0(parcelO000OO0O, ooo0);
        o000O0O0(parcelO000OO0O, 18);
    }

    @Override // OoooOOO.o0O000o0
    public final void OooooOO(oOO0 ooo0) {
        Parcel parcelO000OO0O = o000OO0O();
        o0OO00O.OooO0O0(parcelO000OO0O, ooo0);
        o000O0O0(parcelO000OO0O, 27);
    }

    @Override // OoooOOO.o0O000o0
    public final void Ooooooo(oOO0 ooo0, oO0OO00 oo0oo00, o0O00O o0o00o) {
        Parcel parcelO000OO0O = o000OO0O();
        o0OO00O.OooO0O0(parcelO000OO0O, ooo0);
        o0OO00O.OooO0O0(parcelO000OO0O, oo0oo00);
        o0OO00O.OooO0OO(parcelO000OO0O, o0o00o);
        o000O0O0(parcelO000OO0O, 29);
    }

    @Override // OoooOOO.o0O000o0
    public final List o00000O(String str, String str2, boolean z, oOO0 ooo0) {
        Parcel parcelO000OO0O = o000OO0O();
        parcelO000OO0O.writeString(str);
        parcelO000OO0O.writeString(str2);
        ClassLoader classLoader = o0OO00O.f26540OooO00o;
        parcelO000OO0O.writeInt(z ? 1 : 0);
        o0OO00O.OooO0O0(parcelO000OO0O, ooo0);
        Parcel parcelOooOOO = OooOOO(parcelO000OO0O, 14);
        ArrayList arrayListCreateTypedArrayList = parcelOooOOO.createTypedArrayList(oOO000o.CREATOR);
        parcelOooOOO.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // OoooOOO.o0O000o0
    public final byte[] o0000OO(o00OOOOo o00ooooo, String str) {
        Parcel parcelO000OO0O = o000OO0O();
        o0OO00O.OooO0O0(parcelO000OO0O, o00ooooo);
        parcelO000OO0O.writeString(str);
        Parcel parcelOooOOO = OooOOO(parcelO000OO0O, 9);
        byte[] bArrCreateByteArray = parcelOooOOO.createByteArray();
        parcelOooOOO.recycle();
        return bArrCreateByteArray;
    }

    @Override // OoooOOO.o0O000o0
    public final void o0000Oo(o00O0OO0 o00o0oo0, oOO0 ooo0) {
        Parcel parcelO000OO0O = o000OO0O();
        o0OO00O.OooO0O0(parcelO000OO0O, o00o0oo0);
        o0OO00O.OooO0O0(parcelO000OO0O, ooo0);
        o000O0O0(parcelO000OO0O, 12);
    }

    @Override // OoooOOO.o0O000o0
    public final void o0000Ooo(long j, String str, String str2, String str3) {
        Parcel parcelO000OO0O = o000OO0O();
        parcelO000OO0O.writeLong(j);
        parcelO000OO0O.writeString(str);
        parcelO000OO0O.writeString(str2);
        parcelO000OO0O.writeString(str3);
        o000O0O0(parcelO000OO0O, 10);
    }

    @Override // OoooOOO.o0O000o0
    public final void o0000o0(o00OOOOo o00ooooo, oOO0 ooo0) {
        Parcel parcelO000OO0O = o000OO0O();
        o0OO00O.OooO0O0(parcelO000OO0O, o00ooooo);
        o0OO00O.OooO0O0(parcelO000OO0O, ooo0);
        o000O0O0(parcelO000OO0O, 1);
    }

    @Override // OoooOOO.o0O000o0
    public final void o0000ooO(oOO0 ooo0, o00O0O0O o00o0o0o) {
        Parcel parcelO000OO0O = o000OO0O();
        o0OO00O.OooO0O0(parcelO000OO0O, ooo0);
        o0OO00O.OooO0O0(parcelO000OO0O, o00o0o0o);
        o000O0O0(parcelO000OO0O, 30);
    }

    @Override // OoooOOO.o0O000o0
    public final String o000O0Oo(oOO0 ooo0) {
        Parcel parcelO000OO0O = o000OO0O();
        o0OO00O.OooO0O0(parcelO000OO0O, ooo0);
        Parcel parcelOooOOO = OooOOO(parcelO000OO0O, 11);
        String string = parcelOooOOO.readString();
        parcelOooOOO.recycle();
        return string;
    }

    @Override // OoooOOO.o0O000o0
    public final void o00Ooo(oOO0 ooo0) {
        Parcel parcelO000OO0O = o000OO0O();
        o0OO00O.OooO0O0(parcelO000OO0O, ooo0);
        o000O0O0(parcelO000OO0O, 20);
    }

    @Override // OoooOOO.o0O000o0
    public final void o0O0O00(oOO000o ooo000o, oOO0 ooo0) {
        Parcel parcelO000OO0O = o000OO0O();
        o0OO00O.OooO0O0(parcelO000OO0O, ooo000o);
        o0OO00O.OooO0O0(parcelO000OO0O, ooo0);
        o000O0O0(parcelO000OO0O, 2);
    }

    @Override // OoooOOO.o0O000o0
    public final void o0OoOo0(oOO0 ooo0, Bundle bundle, o0OoO00O o0ooo00o) {
        Parcel parcelO000OO0O = o000OO0O();
        o0OO00O.OooO0O0(parcelO000OO0O, ooo0);
        o0OO00O.OooO0O0(parcelO000OO0O, bundle);
        o0OO00O.OooO0OO(parcelO000OO0O, o0ooo00o);
        o000O0O0(parcelO000OO0O, 31);
    }

    @Override // OoooOOO.o0O000o0
    public final List oo000o(String str, String str2, oOO0 ooo0) {
        Parcel parcelO000OO0O = o000OO0O();
        parcelO000OO0O.writeString(str);
        parcelO000OO0O.writeString(str2);
        o0OO00O.OooO0O0(parcelO000OO0O, ooo0);
        Parcel parcelOooOOO = OooOOO(parcelO000OO0O, 16);
        ArrayList arrayListCreateTypedArrayList = parcelOooOOO.createTypedArrayList(o00O0OO0.CREATOR);
        parcelOooOOO.recycle();
        return arrayListCreateTypedArrayList;
    }
}
