package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.u2 */
/* loaded from: classes2.dex */
public final class C2107u2 implements Parcelable {
    public static final Parcelable.Creator<C2107u2> CREATOR = new o00OO000(20);
    public final long zza;
    private final InterfaceC1774l2[] zzb;

    public C2107u2(long j, InterfaceC1774l2... interfaceC1774l2Arr) {
        this.zza = j;
        this.zzb = interfaceC1774l2Arr;
    }

    public final int OooO00o() {
        return this.zzb.length;
    }

    public final InterfaceC1774l2 OooO0O0(int i) {
        return this.zzb[i];
    }

    public final C2107u2 OooO0OO(InterfaceC1774l2... interfaceC1774l2Arr) {
        int length = interfaceC1774l2Arr.length;
        if (length == 0) {
            return this;
        }
        long j = this.zza;
        InterfaceC1774l2[] interfaceC1774l2Arr2 = this.zzb;
        int i = i80.f19994OooO00o;
        int length2 = interfaceC1774l2Arr2.length;
        Object[] objArrCopyOf = Arrays.copyOf(interfaceC1774l2Arr2, length2 + length);
        System.arraycopy(interfaceC1774l2Arr, 0, objArrCopyOf, length2, length);
        return new C2107u2(j, (InterfaceC1774l2[]) objArrCopyOf);
    }

    public final C2107u2 OooO0o0(C2107u2 c2107u2) {
        return c2107u2 == null ? this : OooO0OO(c2107u2.zzb);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C2107u2.class == obj.getClass()) {
            C2107u2 c2107u2 = (C2107u2) obj;
            if (Arrays.equals(this.zzb, c2107u2.zzb) && this.zza == c2107u2.zza) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = Arrays.hashCode(this.zzb) * 31;
        long j = this.zza;
        return iHashCode + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        long j = this.zza;
        return OooO0oO.OooOo.OooOO0O("entries=", Arrays.toString(this.zzb), j == -9223372036854775807L ? "" : OooO0oO.OooOo.OooO0oo(j, ", presentationTimeUs="));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.zzb.length);
        for (InterfaceC1774l2 interfaceC1774l2 : this.zzb) {
            parcel.writeParcelable(interfaceC1774l2, 0);
        }
        parcel.writeLong(this.zza);
    }

    public C2107u2(Parcel parcel) {
        this.zzb = new InterfaceC1774l2[parcel.readInt()];
        int i = 0;
        while (true) {
            InterfaceC1774l2[] interfaceC1774l2Arr = this.zzb;
            if (i >= interfaceC1774l2Arr.length) {
                this.zza = parcel.readLong();
                return;
            } else {
                interfaceC1774l2Arr[i] = (InterfaceC1774l2) parcel.readParcelable(InterfaceC1774l2.class.getClassLoader());
                i++;
            }
        }
    }

    public C2107u2(List list) {
        this(-9223372036854775807L, (InterfaceC1774l2[]) list.toArray(new InterfaceC1774l2[0]));
    }
}
