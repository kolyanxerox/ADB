package OoooOOO;

import OooOoo0.o000OOo;
import Oooo00o.o000O000;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import o00Oo0oo.o00oO0o;

/* loaded from: classes2.dex */
public final class oO0OO0O extends o000O000 {
    public static final Parcelable.Creator<oO0OO0O> CREATOR = new o000OOo(25);
    public final List zza;

    public oO0OO0O(ArrayList arrayList) {
        this.zza = arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.zza;
        int iOooOoO = o00oO0o.OooOoO(parcel, 20293);
        o00oO0o.OooOoO0(parcel, 1, list);
        o00oO0o.OooOoo(parcel, iOooOoO);
    }
}
