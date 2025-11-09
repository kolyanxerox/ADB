package Oooo00O;

import Oooo00o.o000O000;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes2.dex */
public final class OooOo extends o000O000 {

    @NonNull
    public static final Parcelable.Creator<OooOo> CREATOR = new OooOoo0.o000OOo(9);
    private final int zaa;
    private final int zab;
    private final int zac;
    private final long zad;
    private final long zae;

    @Nullable
    private final String zaf;

    @Nullable
    private final String zag;
    private final int zah;
    private final int zai;

    public OooOo(int i, int i2, int i3, long j, long j2, String str, String str2, int i4, int i5) {
        this.zaa = i;
        this.zab = i2;
        this.zac = i3;
        this.zad = j;
        this.zae = j2;
        this.zaf = str;
        this.zag = str2;
        this.zah = i4;
        this.zai = i5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.zaa;
        int iOooOoO = o00Oo0oo.o00oO0o.OooOoO(parcel, 20293);
        o00Oo0oo.o00oO0o.OooOooo(parcel, 1, 4);
        parcel.writeInt(i2);
        int i3 = this.zab;
        o00Oo0oo.o00oO0o.OooOooo(parcel, 2, 4);
        parcel.writeInt(i3);
        int i4 = this.zac;
        o00Oo0oo.o00oO0o.OooOooo(parcel, 3, 4);
        parcel.writeInt(i4);
        long j = this.zad;
        o00Oo0oo.o00oO0o.OooOooo(parcel, 4, 8);
        parcel.writeLong(j);
        long j2 = this.zae;
        o00Oo0oo.o00oO0o.OooOooo(parcel, 5, 8);
        parcel.writeLong(j2);
        o00Oo0oo.o00oO0o.OooOo0(parcel, 6, this.zaf);
        o00Oo0oo.o00oO0o.OooOo0(parcel, 7, this.zag);
        int i5 = this.zah;
        o00Oo0oo.o00oO0o.OooOooo(parcel, 8, 4);
        parcel.writeInt(i5);
        int i6 = this.zai;
        o00Oo0oo.o00oO0o.OooOooo(parcel, 9, 4);
        parcel.writeInt(i6);
        o00Oo0oo.o00oO0o.OooOoo(parcel, iOooOoO);
    }
}
