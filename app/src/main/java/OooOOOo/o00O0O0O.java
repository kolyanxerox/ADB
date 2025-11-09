package OoooOOO;

import OooOoo0.o000OOo;
import Oooo00o.o000O000;
import android.os.Parcel;
import android.os.Parcelable;
import o00Oo0oo.o00oO0o;

/* loaded from: classes2.dex */
public final class o00O0O0O extends o000O000 {
    public static final Parcelable.Creator<o00O0O0O> CREATOR = new o000OOo(17);
    public final long zza;
    public final int zzb;
    public final long zzc;

    public o00O0O0O(int i, long j, long j2) {
        this.zza = j;
        this.zzb = i;
        this.zzc = j2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        long j = this.zza;
        int iOooOoO = o00oO0o.OooOoO(parcel, 20293);
        o00oO0o.OooOooo(parcel, 1, 8);
        parcel.writeLong(j);
        int i2 = this.zzb;
        o00oO0o.OooOooo(parcel, 2, 4);
        parcel.writeInt(i2);
        long j2 = this.zzc;
        o00oO0o.OooOooo(parcel, 3, 8);
        parcel.writeLong(j2);
        o00oO0o.OooOoo(parcel, iOooOoO);
    }
}
