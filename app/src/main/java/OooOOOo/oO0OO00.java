package OoooOOO;

import OooOoo0.o000OOo;
import Oooo00o.o000O000;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import o00Oo0oo.o00oO0o;

/* loaded from: classes2.dex */
public final class oO0OO00 extends o000O000 {
    public static final Parcelable.Creator<oO0OO00> CREATOR = new o000OOo(24);
    public final List zza;

    public oO0OO00(ArrayList arrayList) {
        this.zza = arrayList;
    }

    public static oO0OO00 OooO0o0(oO00OOOo... oo00ooooArr) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(Integer.valueOf(oo00ooooArr[0].f14657OooOo0O));
        return new oO0OO00(arrayList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.zza;
        int iOooOoO = o00oO0o.OooOoO(parcel, 20293);
        o00oO0o.OooOOoo(parcel, 1, list);
        o00oO0o.OooOoo(parcel, iOooOoO);
    }
}
