package OooOooo;

import OooOoo0.o000OOo;
import Oooo00o.o000O000;
import Oooo0o.OooO0OO;
import android.content.Context;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import o00Oo0oo.o00oO0o;

/* loaded from: classes2.dex */
public final class o00O00O extends o000O000 {
    public static final Parcelable.Creator<o00O00O> CREATOR = new o000OOo(3);
    private final String zza;
    private final boolean zzb;
    private final boolean zzc;
    private final Context zzd;
    private final boolean zze;
    private final boolean zzf;

    public o00O00O(String str, boolean z, boolean z2, IBinder iBinder, boolean z3, boolean z4) {
        this.zza = str;
        this.zzb = z;
        this.zzc = z2;
        this.zzd = (Context) OooO0OO.o000O0oO(OooO0OO.o000O0o0(iBinder));
        this.zze = z3;
        this.zzf = z4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.zza;
        int iOooOoO = o00oO0o.OooOoO(parcel, 20293);
        o00oO0o.OooOo0(parcel, 1, str);
        boolean z = this.zzb;
        o00oO0o.OooOooo(parcel, 2, 4);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = this.zzc;
        o00oO0o.OooOooo(parcel, 3, 4);
        parcel.writeInt(z2 ? 1 : 0);
        o00oO0o.OooOOo(parcel, 4, new OooO0OO(this.zzd));
        boolean z3 = this.zze;
        o00oO0o.OooOooo(parcel, 5, 4);
        parcel.writeInt(z3 ? 1 : 0);
        boolean z4 = this.zzf;
        o00oO0o.OooOooo(parcel, 6, 4);
        parcel.writeInt(z4 ? 1 : 0);
        o00oO0o.OooOoo(parcel, iOooOoO);
    }
}
