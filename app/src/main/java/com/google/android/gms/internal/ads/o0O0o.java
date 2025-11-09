package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.ArrayList;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class o0O0o extends o00Oo00 {
    public static final Parcelable.Creator<o0O0o> CREATOR = new o00OO000(13);

    @Nullable
    public final String zza;
    public final rm0 zzb;

    public o0O0o(String str, String str2, gn0 gn0Var) {
        super(str);
        af0.OoooO0(!gn0Var.isEmpty());
        this.zza = str2;
        rm0 rm0VarOooOOOO = rm0.OooOOOO(gn0Var);
        this.zzb = rm0VarOooOOOO;
    }

    public static ArrayList OooO00o(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(8, 10))));
                return arrayList;
            }
            if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                return arrayList;
            }
            if (str.length() >= 4) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0131  */
    @Override // com.google.android.gms.internal.ads.o00Oo00, com.google.android.gms.internal.ads.InterfaceC1774l2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void OooO0Oo(com.google.android.gms.internal.ads.C1551f0 r21) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 894
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.o0O0o.OooO0Oo(com.google.android.gms.internal.ads.f0):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o0O0o.class == obj.getClass()) {
            o0O0o o0o0o = (o0O0o) obj;
            if (Objects.equals(this.zzf, o0o0o.zzf) && Objects.equals(this.zza, o0o0o.zza) && this.zzb.equals(o0o0o.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.zzf.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE;
        String str = this.zza;
        return this.zzb.hashCode() + (((iHashCode * 31) + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // com.google.android.gms.internal.ads.o00Oo00
    public final String toString() {
        String strValueOf = String.valueOf(this.zzb);
        StringBuilder sb = new StringBuilder();
        sb.append(this.zzf);
        sb.append(": description=");
        return androidx.datastore.preferences.protobuf.OooO00o.OooOOO0(sb, this.zza, ": values=", strValueOf);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zzf);
        parcel.writeString(this.zza);
        parcel.writeStringArray((String[]) this.zzb.toArray(new String[0]));
    }
}
