package OoooOoo;

import OooOoo0.o000OOo;
import Oooo00o.o000O000;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import o00Oo0oo.o00oO0o;

/* loaded from: classes2.dex */
public final class oOO0OOO extends o000O000 {
    public static final Parcelable.Creator<oOO0OOO> CREATOR = new o000OOo(29);
    private final List zaa;

    @Nullable
    private final String zab;

    public oOO0OOO(String str, ArrayList arrayList) {
        this.zaa = arrayList;
        this.zab = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.zaa;
        int iOooOoO = o00oO0o.OooOoO(parcel, 20293);
        o00oO0o.OooOo0o(parcel, 1, list);
        o00oO0o.OooOo0(parcel, 2, this.zab);
        o00oO0o.OooOoo(parcel, iOooOoO);
    }
}
