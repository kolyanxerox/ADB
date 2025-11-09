package OoooOOO;

import OooOoo0.o000OOo;
import Oooo00O.o000000O;
import Oooo00o.o000O000;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;

/* loaded from: classes2.dex */
public final class oOO000o extends o000O000 {
    public static final Parcelable.Creator<oOO000o> CREATOR = new o000OOo(26);
    public final int zza;
    public final String zzb;
    public final long zzc;

    @Nullable
    public final Long zzd;

    @Nullable
    public final String zze;
    public final String zzf;

    @Nullable
    public final Double zzg;

    public oOO000o(int i, String str, long j, Long l, Float f, String str2, String str3, Double d) {
        this.zza = i;
        this.zzb = str;
        this.zzc = j;
        this.zzd = l;
        this.zzg = i == 1 ? f != null ? Double.valueOf(f.doubleValue()) : null : d;
        this.zze = str2;
        this.zzf = str3;
    }

    public final Object OooO0o0() {
        Long l = this.zzd;
        if (l != null) {
            return l;
        }
        Double d = this.zzg;
        if (d != null) {
            return d;
        }
        String str = this.zze;
        if (str != null) {
            return str;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        o000OOo.OooO0OO(this, parcel);
    }

    public oOO000o(long j, Object obj, String str, String str2) {
        o000000O.OooO0o0(str);
        this.zza = 2;
        this.zzb = str;
        this.zzc = j;
        this.zzf = str2;
        if (obj == null) {
            this.zzd = null;
            this.zzg = null;
            this.zze = null;
            return;
        }
        if (obj instanceof Long) {
            this.zzd = (Long) obj;
            this.zzg = null;
            this.zze = null;
        } else if (obj instanceof String) {
            this.zzd = null;
            this.zzg = null;
            this.zze = (String) obj;
        } else {
            if (obj instanceof Double) {
                this.zzd = null;
                this.zzg = (Double) obj;
                this.zze = null;
                return;
            }
            throw new IllegalArgumentException("User attribute given of un-supported type");
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public oOO000o(oOO00 ooo00) {
        String str = ooo00.f14779OooO0OO;
        this(ooo00.f14780OooO0Oo, ooo00.f14781OooO0o0, str, ooo00.f14778OooO0O0);
    }
}
