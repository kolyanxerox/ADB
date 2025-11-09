package OoooOoo;

import OooOoo0.o000OOo;
import Oooo00o.o000O000;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import o00Oo0oo.o00oO0o;

/* loaded from: classes2.dex */
public final class oOO0OO0O extends o000O000 {
    public static final Parcelable.Creator<oOO0OO0O> CREATOR = new o000OOo(28);

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final int f14947OooOo0O;
    private int zab;

    @Nullable
    private Intent zac;

    public oOO0OO0O(int i, int i2, Intent intent) {
        this.f14947OooOo0O = i;
        this.zab = i2;
        this.zac = intent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iOooOoO = o00oO0o.OooOoO(parcel, 20293);
        o00oO0o.OooOooo(parcel, 1, 4);
        parcel.writeInt(this.f14947OooOo0O);
        int i2 = this.zab;
        o00oO0o.OooOooo(parcel, 2, 4);
        parcel.writeInt(i2);
        o00oO0o.OooOo00(parcel, 3, this.zac, i);
        o00oO0o.OooOoo(parcel, iOooOoO);
    }
}
