package Oooo00O;

import Oooo00o.o000O000;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes2.dex */
public final class OooOOO0 extends o000O000 {

    @NonNull
    public static final Parcelable.Creator<OooOOO0> CREATOR = new OooOoo0.o000OOo(15);
    private final Oooo0 zza;
    private final boolean zzb;
    private final boolean zzc;

    @Nullable
    private final int[] zzd;
    private final int zze;

    @Nullable
    private final int[] zzf;

    public OooOOO0(Oooo0 oooo0, boolean z, boolean z2, int[] iArr, int i, int[] iArr2) {
        this.zza = oooo0;
        this.zzb = z;
        this.zzc = z2;
        this.zzd = iArr;
        this.zze = i;
        this.zzf = iArr2;
    }

    public final boolean OooO() {
        return this.zzb;
    }

    public final int[] OooO0o() {
        return this.zzd;
    }

    public final int OooO0o0() {
        return this.zze;
    }

    public final int[] OooO0oO() {
        return this.zzf;
    }

    public final boolean OooOO0() {
        return this.zzc;
    }

    public final Oooo0 OooOO0O() {
        return this.zza;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iOooOoO = o00Oo0oo.o00oO0o.OooOoO(parcel, 20293);
        o00Oo0oo.o00oO0o.OooOo00(parcel, 1, this.zza, i);
        boolean z = this.zzb;
        o00Oo0oo.o00oO0o.OooOooo(parcel, 2, 4);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = this.zzc;
        o00Oo0oo.o00oO0o.OooOooo(parcel, 3, 4);
        parcel.writeInt(z2 ? 1 : 0);
        int[] iArr = this.zzd;
        if (iArr != null) {
            int iOooOoO2 = o00Oo0oo.o00oO0o.OooOoO(parcel, 4);
            parcel.writeIntArray(iArr);
            o00Oo0oo.o00oO0o.OooOoo(parcel, iOooOoO2);
        }
        int i2 = this.zze;
        o00Oo0oo.o00oO0o.OooOooo(parcel, 5, 4);
        parcel.writeInt(i2);
        int[] iArr2 = this.zzf;
        if (iArr2 != null) {
            int iOooOoO3 = o00Oo0oo.o00oO0o.OooOoO(parcel, 6);
            parcel.writeIntArray(iArr2);
            o00Oo0oo.o00oO0o.OooOoo(parcel, iOooOoO3);
        }
        o00Oo0oo.o00oO0o.OooOoo(parcel, iOooOoO);
    }
}
