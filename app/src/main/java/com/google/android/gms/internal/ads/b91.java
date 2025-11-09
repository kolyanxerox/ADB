package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
import java.util.UUID;

/* loaded from: classes2.dex */
public final class b91 implements Comparator, Parcelable {
    public static final Parcelable.Creator<b91> CREATOR = new C1569fi(20);

    @Nullable
    public final String zza;
    public final int zzb;
    private final l81[] zzc;
    private int zzd;

    public b91(Parcel parcel) {
        this.zza = parcel.readString();
        l81[] l81VarArr = (l81[]) parcel.createTypedArray(l81.CREATOR);
        int i = i80.f19994OooO00o;
        this.zzc = l81VarArr;
        this.zzb = l81VarArr.length;
    }

    public final l81 OooO00o(int i) {
        return this.zzc[i];
    }

    public final b91 OooO0O0(String str) {
        return Objects.equals(this.zza, str) ? this : new b91(str, false, this.zzc);
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        l81 l81Var = (l81) obj;
        l81 l81Var2 = (l81) obj2;
        UUID uuid = i11.f19894OooO00o;
        return uuid.equals(l81Var.zza) ? !uuid.equals(l81Var2.zza) ? 1 : 0 : l81Var.zza.compareTo(l81Var2.zza);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b91.class == obj.getClass()) {
            b91 b91Var = (b91) obj;
            if (Objects.equals(this.zza, b91Var.zza) && Arrays.equals(this.zzc, b91Var.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzd;
        if (i != 0) {
            return i;
        }
        String str = this.zza;
        int iHashCode = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.zzc);
        this.zzd = iHashCode;
        return iHashCode;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zza);
        parcel.writeTypedArray(this.zzc, 0);
    }

    public b91(String str, boolean z, l81... l81VarArr) {
        this.zza = str;
        l81VarArr = z ? (l81[]) l81VarArr.clone() : l81VarArr;
        this.zzc = l81VarArr;
        this.zzb = l81VarArr.length;
        Arrays.sort(l81VarArr, this);
    }
}
