package OoooOOO;

import OooO0oO.OooOo;
import OooOoo0.o000OOo;
import Oooo00O.o000000O;
import Oooo00o.o000O000;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.datastore.preferences.protobuf.OooO00o;

/* loaded from: classes2.dex */
public final class o00OOOOo extends o000O000 {
    public static final Parcelable.Creator<o00OOOOo> CREATOR = new o000OOo(21);
    public final String zza;
    public final o00OOOO0 zzb;
    public final String zzc;
    public final long zzd;

    public o00OOOOo(o00OOOOo o00ooooo, long j) {
        o000000O.OooO0oo(o00ooooo);
        this.zza = o00ooooo.zza;
        this.zzb = o00ooooo.zzb;
        this.zzc = o00ooooo.zzc;
        this.zzd = j;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.zzb);
        String str = this.zzc;
        int length = String.valueOf(str).length();
        String str2 = this.zza;
        StringBuilder sb = new StringBuilder(length + 13 + String.valueOf(str2).length() + 8 + strValueOf.length());
        OooO00o.OooOooO(sb, "origin=", str, ",name=", str2);
        return OooOo.OooOOOo(sb, ",params=", strValueOf);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        o000OOo.OooO0O0(this, parcel, i);
    }

    public o00OOOOo(String str, o00OOOO0 o00oooo0, String str2, long j) {
        this.zza = str;
        this.zzb = o00oooo0;
        this.zzc = str2;
        this.zzd = j;
    }
}
