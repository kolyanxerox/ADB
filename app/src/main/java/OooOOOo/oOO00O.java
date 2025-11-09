package OooOooo;

import OooOoo0.o000OOo;
import Oooo00o.o000O000;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.measurement.o0OO0O0;
import o00Oo0oo.o00oO0o;

/* loaded from: classes2.dex */
public final class oOO00O extends o000O000 {
    public static final Parcelable.Creator<oOO00O> CREATOR = new o000OOo(4);
    private final boolean zza;
    private final String zzb;
    private final int zzc;
    private final int zzd;

    public oOO00O(String str, int i, int i2, boolean z) {
        this.zza = z;
        this.zzb = str;
        this.zzc = o0OO0O0.OooOOO(i) - 1;
        int i3 = 1;
        int[] iArr = {1, 2, 3};
        int i4 = 0;
        while (true) {
            if (i4 >= 3) {
                break;
            }
            int i5 = iArr[i4];
            int i6 = i5 - 1;
            if (i5 == 0) {
                throw null;
            }
            if (i6 == i2) {
                i3 = i5;
                break;
            }
            i4++;
        }
        this.zzd = i3 - 1;
    }

    public final int OooO0o() {
        int i = this.zzd;
        int[] iArr = {1, 2, 3};
        for (int i2 = 0; i2 < 3; i2++) {
            int i3 = iArr[i2];
            int i4 = i3 - 1;
            if (i3 == 0) {
                throw null;
            }
            if (i4 == i) {
                return i3;
            }
        }
        return 1;
    }

    public final String OooO0o0() {
        return this.zzb;
    }

    public final int OooO0oO() {
        return o0OO0O0.OooOOO(this.zzc);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iOooOoO = o00oO0o.OooOoO(parcel, 20293);
        boolean z = this.zza;
        o00oO0o.OooOooo(parcel, 1, 4);
        parcel.writeInt(z ? 1 : 0);
        o00oO0o.OooOo0(parcel, 2, this.zzb);
        int i2 = this.zzc;
        o00oO0o.OooOooo(parcel, 3, 4);
        parcel.writeInt(i2);
        int i3 = this.zzd;
        o00oO0o.OooOooo(parcel, 4, 4);
        parcel.writeInt(i3);
        o00oO0o.OooOoo(parcel, iOooOoO);
    }

    public final boolean zzb() {
        return this.zza;
    }
}
