package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.zzo;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.j4 */
/* loaded from: classes2.dex */
public final class C1702j4 extends Oooo00o.o000O000 {
    public static final Parcelable.Creator<C1702j4> CREATOR = new o00OO000(22);

    @Nullable
    public final String zza;
    public final long zzb;
    public final String zzc;
    public final String zzd;
    public final String zze;
    public final Bundle zzf;
    public final boolean zzg;
    public long zzh;
    public String zzi;
    public int zzj;

    public C1702j4(String str, long j, String str2, String str3, String str4, Bundle bundle, boolean z, long j2, String str5, int i) {
        this.zza = str;
        this.zzb = j;
        this.zzc = str2 == null ? "" : str2;
        this.zzd = str3 == null ? "" : str3;
        this.zze = str4 == null ? "" : str4;
        this.zzf = bundle == null ? new Bundle() : bundle;
        this.zzg = z;
        this.zzh = j2;
        this.zzi = str5;
        this.zzj = i;
    }

    public static C1702j4 OooO0o0(Uri uri) {
        try {
            if (!"gcache".equals(uri.getScheme())) {
                return null;
            }
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments.size() != 2) {
                zzo.zzj("Expected 2 path parts for namespace and id, found :" + pathSegments.size());
                return null;
            }
            String str = pathSegments.get(0);
            String str2 = pathSegments.get(1);
            String host = uri.getHost();
            String queryParameter = uri.getQueryParameter("url");
            boolean zEquals = "1".equals(uri.getQueryParameter("read_only"));
            String queryParameter2 = uri.getQueryParameter("expiration");
            long j = queryParameter2 == null ? 0L : Long.parseLong(queryParameter2);
            Bundle bundle = new Bundle();
            for (String str3 : uri.getQueryParameterNames()) {
                if (str3.startsWith("tag.")) {
                    bundle.putString(str3.substring(4), uri.getQueryParameter(str3));
                }
            }
            return new C1702j4(queryParameter, j, host, str, str2, bundle, zEquals, 0L, "", 0);
        } catch (NullPointerException e) {
            e = e;
            zzo.zzk("Unable to parse Uri into cache offering.", e);
            return null;
        } catch (NumberFormatException e2) {
            e = e2;
            zzo.zzk("Unable to parse Uri into cache offering.", e);
            return null;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.zza;
        int iOooOoO = o00Oo0oo.o00oO0o.OooOoO(parcel, 20293);
        o00Oo0oo.o00oO0o.OooOo0(parcel, 2, str);
        long j = this.zzb;
        o00Oo0oo.o00oO0o.OooOooo(parcel, 3, 8);
        parcel.writeLong(j);
        o00Oo0oo.o00oO0o.OooOo0(parcel, 4, this.zzc);
        o00Oo0oo.o00oO0o.OooOo0(parcel, 5, this.zzd);
        o00Oo0oo.o00oO0o.OooOo0(parcel, 6, this.zze);
        o00Oo0oo.o00oO0o.OooOOOo(7, this.zzf, parcel);
        boolean z = this.zzg;
        o00Oo0oo.o00oO0o.OooOooo(parcel, 8, 4);
        parcel.writeInt(z ? 1 : 0);
        long j2 = this.zzh;
        o00Oo0oo.o00oO0o.OooOooo(parcel, 9, 8);
        parcel.writeLong(j2);
        o00Oo0oo.o00oO0o.OooOo0(parcel, 10, this.zzi);
        int i2 = this.zzj;
        o00Oo0oo.o00oO0o.OooOooo(parcel, 11, 4);
        parcel.writeInt(i2);
        o00Oo0oo.o00oO0o.OooOoo(parcel, iOooOoO);
    }
}
