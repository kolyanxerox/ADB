package Oooo00O;

import Oooo00o.o000O000;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* loaded from: classes2.dex */
public final class Oooo0 extends o000O000 {

    @NonNull
    public static final Parcelable.Creator<Oooo0> CREATOR = new OooOoo0.o000OOo(13);
    private final int zza;
    private final boolean zzb;
    private final boolean zzc;
    private final int zzd;
    private final int zze;

    public Oooo0(int i, int i2, int i3, boolean z, boolean z2) {
        this.zza = i;
        this.zzb = z;
        this.zzc = z2;
        this.zzd = i2;
        this.zze = i3;
    }

    public final boolean OooO() {
        return this.zzc;
    }

    public final int OooO0o() {
        return this.zze;
    }

    public final int OooO0o0() {
        return this.zzd;
    }

    public final boolean OooO0oO() {
        return this.zzb;
    }

    public final int OooOO0() {
        return this.zza;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iOooOoO = o00Oo0oo.o00oO0o.OooOoO(parcel, 20293);
        int i2 = this.zza;
        o00Oo0oo.o00oO0o.OooOooo(parcel, 1, 4);
        parcel.writeInt(i2);
        boolean z = this.zzb;
        o00Oo0oo.o00oO0o.OooOooo(parcel, 2, 4);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = this.zzc;
        o00Oo0oo.o00oO0o.OooOooo(parcel, 3, 4);
        parcel.writeInt(z2 ? 1 : 0);
        int i3 = this.zzd;
        o00Oo0oo.o00oO0o.OooOooo(parcel, 4, 4);
        parcel.writeInt(i3);
        int i4 = this.zze;
        o00Oo0oo.o00oO0o.OooOooo(parcel, 5, 4);
        parcel.writeInt(i4);
        o00Oo0oo.o00oO0o.OooOoo(parcel, iOooOoO);
    }
}
