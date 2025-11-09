package OoooOoo;

import OooOooo.o000Oo0;
import Oooo00O.o00oO0o;
import Oooo00o.o000O000;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;

/* loaded from: classes2.dex */
public final class oOO0Oo00 extends o000O000 {
    public static final Parcelable.Creator<oOO0Oo00> CREATOR = new oOO0OoO0(0);

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final int f14948OooOo0O;
    private final o000Oo0 zab;

    @Nullable
    private final o00oO0o zac;

    public oOO0Oo00(int i, o000Oo0 o000oo02, o00oO0o o00oo0o) {
        this.f14948OooOo0O = i;
        this.zab = o000oo02;
        this.zac = o00oo0o;
    }

    public final o00oO0o OooO0o() {
        return this.zac;
    }

    public final o000Oo0 OooO0o0() {
        return this.zab;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iOooOoO = o00Oo0oo.o00oO0o.OooOoO(parcel, 20293);
        o00Oo0oo.o00oO0o.OooOooo(parcel, 1, 4);
        parcel.writeInt(this.f14948OooOo0O);
        o00Oo0oo.o00oO0o.OooOo00(parcel, 2, this.zab, i);
        o00Oo0oo.o00oO0o.OooOo00(parcel, 3, this.zac, i);
        o00Oo0oo.o00oO0o.OooOoo(parcel, iOooOoO);
    }
}
