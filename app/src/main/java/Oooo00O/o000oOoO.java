package Oooo00O;

import Oooo00o.o000O000;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class o000oOoO extends o000O000 {

    @NonNull
    public static final Parcelable.Creator<o000oOoO> CREATOR = new OooOoo0.o000OOo(8);
    private final int zaa;
    private List zab;

    public o000oOoO(int i, List list) {
        this.zaa = i;
        this.zab = list;
    }

    public final List OooO0o() {
        return this.zab;
    }

    public final int OooO0o0() {
        return this.zaa;
    }

    public final void OooO0oO(OooOo oooOo) {
        if (this.zab == null) {
            this.zab = new ArrayList();
        }
        this.zab.add(oooOo);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iOooOoO = o00Oo0oo.o00oO0o.OooOoO(parcel, 20293);
        int i2 = this.zaa;
        o00Oo0oo.o00oO0o.OooOooo(parcel, 1, 4);
        parcel.writeInt(i2);
        o00Oo0oo.o00oO0o.OooOoO0(parcel, 2, this.zab);
        o00Oo0oo.o00oO0o.OooOoo(parcel, iOooOoO);
    }
}
