package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import org.json.JSONArray;

/* renamed from: com.google.android.gms.internal.ads.nj */
/* loaded from: classes2.dex */
public final class C1865nj extends Oooo00o.o000O000 {
    public static final Parcelable.Creator<C1865nj> CREATOR = new C1569fi(7);
    public final String zza;
    public final int zzb;

    public C1865nj(String str, int i) {
        this.zza = str;
        this.zzb = i;
    }

    public static C1865nj OooO0o0(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        return new C1865nj(jSONArray.getJSONObject(0).optString("rb_type"), jSONArray.getJSONObject(0).optInt("rb_amount"));
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof C1865nj)) {
            C1865nj c1865nj = (C1865nj) obj;
            if (Oooo00O.o000000O.OooOO0o(this.zza, c1865nj.zza)) {
                if (Oooo00O.o000000O.OooOO0o(Integer.valueOf(this.zzb), Integer.valueOf(c1865nj.zzb))) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, Integer.valueOf(this.zzb)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.zza;
        int iOooOoO = o00Oo0oo.o00oO0o.OooOoO(parcel, 20293);
        o00Oo0oo.o00oO0o.OooOo0(parcel, 2, str);
        int i2 = this.zzb;
        o00Oo0oo.o00oO0o.OooOooo(parcel, 3, 4);
        parcel.writeInt(i2);
        o00Oo0oo.o00oO0o.OooOoo(parcel, iOooOoO);
    }
}
