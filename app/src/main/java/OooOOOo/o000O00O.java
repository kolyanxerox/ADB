package OooOooo;

import OooO0oO.OooOOO0;
import OooOoo0.o000OOo;
import Oooo00o.o000O000;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.Arrays;
import o00Oo0oo.o00oO0o;

/* loaded from: classes2.dex */
public final class o000O00O extends o000O000 {

    @NonNull
    public static final Parcelable.Creator<o000O00O> CREATOR = new o000OOo(2);
    private final String zza;

    @Deprecated
    private final int zzb;
    private final long zzc;

    public o000O00O(String str) {
        this.zza = str;
        this.zzc = 1L;
        this.zzb = -1;
    }

    public final long OooO0o() {
        long j = this.zzc;
        return j == -1 ? this.zzb : j;
    }

    public final String OooO0o0() {
        return this.zza;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o000O00O) {
            o000O00O o000o00o2 = (o000O00O) obj;
            String str = this.zza;
            if (((str != null && str.equals(o000o00o2.zza)) || (this.zza == null && o000o00o2.zza == null)) && OooO0o() == o000o00o2.OooO0o()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, Long.valueOf(OooO0o())});
    }

    public final String toString() {
        OooOOO0 oooOOO0 = new OooOOO0(this);
        oooOOO0.OooO00o(this.zza, "name");
        oooOOO0.OooO00o(Long.valueOf(OooO0o()), "version");
        return oooOOO0.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iOooOoO = o00oO0o.OooOoO(parcel, 20293);
        o00oO0o.OooOo0(parcel, 1, this.zza);
        int i2 = this.zzb;
        o00oO0o.OooOooo(parcel, 2, 4);
        parcel.writeInt(i2);
        long jOooO0o = OooO0o();
        o00oO0o.OooOooo(parcel, 3, 8);
        parcel.writeLong(jOooO0o);
        o00oO0o.OooOoo(parcel, iOooOoO);
    }

    public o000O00O(String str, int i, long j) {
        this.zza = str;
        this.zzb = i;
        this.zzc = j;
    }
}
