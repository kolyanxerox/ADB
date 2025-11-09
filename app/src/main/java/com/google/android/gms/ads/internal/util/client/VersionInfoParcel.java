package com.google.android.gms.ads.internal.util.client;

import OooO0oO.OooOo;
import Oooo00o.o000O000;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken;
import o00Oo0oo.o00oO0o;

/* loaded from: classes2.dex */
public final class VersionInfoParcel extends o000O000 {

    @NonNull
    public static final Parcelable.Creator<VersionInfoParcel> CREATOR = new zzy();

    @NonNull
    public String afmaVersion;
    public int buddyApkVersion;
    public int clientJarVersion;
    public boolean isClientJar;
    public boolean isLiteSdk;

    public VersionInfoParcel(String str, int i, int i2, boolean z, boolean z2) {
        this.afmaVersion = str;
        this.buddyApkVersion = i;
        this.clientJarVersion = i2;
        this.isClientJar = z;
        this.isLiteSdk = z2;
    }

    @NonNull
    public static VersionInfoParcel forPackage() {
        return new VersionInfoParcel(12451000, 12451000, true);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int iOooOoO = o00oO0o.OooOoO(parcel, 20293);
        o00oO0o.OooOo0(parcel, 2, this.afmaVersion);
        int i2 = this.buddyApkVersion;
        o00oO0o.OooOooo(parcel, 3, 4);
        parcel.writeInt(i2);
        int i3 = this.clientJarVersion;
        o00oO0o.OooOooo(parcel, 4, 4);
        parcel.writeInt(i3);
        boolean z = this.isClientJar;
        o00oO0o.OooOooo(parcel, 5, 4);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = this.isLiteSdk;
        o00oO0o.OooOooo(parcel, 6, 4);
        parcel.writeInt(z2 ? 1 : 0);
        o00oO0o.OooOoo(parcel, iOooOoO);
    }

    public VersionInfoParcel(int i, int i2, boolean z) {
        this(i, i2, z, false, false);
    }

    public VersionInfoParcel(int i, int i2, boolean z, boolean z2) {
        this(i, i2, z, false, z2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public VersionInfoParcel(int i, int i2, boolean z, boolean z2, boolean z3) {
        String str;
        if (z) {
            str = "0";
        } else {
            str = z2 ? CommonGetHeaderBiddingToken.HB_TOKEN_VERSION : "1";
        }
        StringBuilder sbOooOo0o = OooOo.OooOo0o("afma-sdk-a-v", i, ".", i2, ".");
        sbOooOo0o.append(str);
        this(sbOooOo0o.toString(), i, i2, z, z3);
    }
}
