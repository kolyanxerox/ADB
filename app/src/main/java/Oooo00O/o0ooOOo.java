package Oooo00O;

import Oooo00o.o000O000;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Scope;

/* loaded from: classes2.dex */
public final class o0ooOOo extends o000O000 {
    public static final Parcelable.Creator<o0ooOOo> CREATOR = new OooOoo0.o000OOo(12);

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final int f13837OooOo0O;
    private final int zab;
    private final int zac;

    @Nullable
    @Deprecated
    private final Scope[] zad;

    public o0ooOOo(int i, int i2, int i3, Scope[] scopeArr) {
        this.f13837OooOo0O = i;
        this.zab = i2;
        this.zac = i3;
        this.zad = scopeArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iOooOoO = o00Oo0oo.o00oO0o.OooOoO(parcel, 20293);
        o00Oo0oo.o00oO0o.OooOooo(parcel, 1, 4);
        parcel.writeInt(this.f13837OooOo0O);
        int i2 = this.zab;
        o00Oo0oo.o00oO0o.OooOooo(parcel, 2, 4);
        parcel.writeInt(i2);
        int i3 = this.zac;
        o00Oo0oo.o00oO0o.OooOooo(parcel, 3, 4);
        parcel.writeInt(i3);
        o00Oo0oo.o00oO0o.OooOo(parcel, 4, this.zad, i);
        o00Oo0oo.o00oO0o.OooOoo(parcel, iOooOoO);
    }
}
