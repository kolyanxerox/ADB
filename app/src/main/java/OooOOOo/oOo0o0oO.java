package OoooOOO;

import OooOoo0.o000OOo;
import Oooo00o.o000O000;
import android.os.Parcel;
import android.os.Parcelable;
import o00Oo0oo.o00oO0o;

/* loaded from: classes2.dex */
public final class oOo0o0oO extends o000O000 {
    public static final Parcelable.Creator<oOo0o0oO> CREATOR = new o000OOo(22);
    public final String zza;
    public final long zzb;
    public final int zzc;

    public oOo0o0oO(int i, long j, String str) {
        this.zza = str;
        this.zzb = j;
        this.zzc = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.zza;
        int iOooOoO = o00oO0o.OooOoO(parcel, 20293);
        o00oO0o.OooOo0(parcel, 1, str);
        long j = this.zzb;
        o00oO0o.OooOooo(parcel, 2, 8);
        parcel.writeLong(j);
        int i2 = this.zzc;
        o00oO0o.OooOooo(parcel, 3, 4);
        parcel.writeInt(i2);
        o00oO0o.OooOoo(parcel, iOooOoO);
    }
}
