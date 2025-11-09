package com.google.android.gms.ads.internal.client;

import Oooo00o.o000O000;
import android.os.Parcel;
import android.os.Parcelable;
import o00Oo0oo.o00oO0o;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzu extends o000O000 {
    public static final Parcelable.Creator<zzu> CREATOR = new zzv();
    public final int zza;
    public final int zzb;
    public final String zzc;
    public final long zzd;

    public zzu(int i, int i2, String str, long j) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = str;
        this.zzd = j;
    }

    public static zzu zza(JSONObject jSONObject) throws JSONException {
        return new zzu(jSONObject.getInt("type_num"), jSONObject.getInt("precision_num"), jSONObject.getString("currency"), jSONObject.getLong("value"));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.zza;
        int iOooOoO = o00oO0o.OooOoO(parcel, 20293);
        o00oO0o.OooOooo(parcel, 1, 4);
        parcel.writeInt(i2);
        int i3 = this.zzb;
        o00oO0o.OooOooo(parcel, 2, 4);
        parcel.writeInt(i3);
        o00oO0o.OooOo0(parcel, 3, this.zzc);
        long j = this.zzd;
        o00oO0o.OooOooo(parcel, 4, 8);
        parcel.writeLong(j);
        o00oO0o.OooOoo(parcel, iOooOoO);
    }
}
