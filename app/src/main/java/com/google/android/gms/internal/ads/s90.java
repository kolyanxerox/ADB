package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class s90 implements InterfaceC1774l2 {
    public static final Parcelable.Creator<s90> CREATOR = new C1569fi(11);
    public final String zza;
    public final byte[] zzb;
    public final int zzc;
    public final int zzd;

    public /* synthetic */ s90(Parcel parcel) {
        String string = parcel.readString();
        int i = i80.f19994OooO00o;
        this.zza = string;
        byte[] bArrCreateByteArray = parcel.createByteArray();
        this.zzb = bArrCreateByteArray;
        this.zzc = parcel.readInt();
        int i2 = parcel.readInt();
        this.zzd = i2;
        OooO00o(string, bArrCreateByteArray, i2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void OooO00o(java.lang.String r6, byte[] r7, int r8) {
        /*
            int r0 = r6.hashCode()
            r1 = 2
            r2 = 3
            r3 = 4
            r4 = 1
            r5 = 0
            switch(r0) {
                case -1949883051: goto L35;
                case -1555642602: goto L2b;
                case 101820674: goto L21;
                case 188404399: goto L17;
                case 1805012160: goto Ld;
                default: goto Lc;
            }
        Lc:
            goto L3f
        Ld:
            java.lang.String r0 = "editable.tracks.map"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L3f
            r6 = r2
            goto L40
        L17:
            java.lang.String r0 = "editable.tracks.offset"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L3f
            r6 = r4
            goto L40
        L21:
            java.lang.String r0 = "editable.tracks.length"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L3f
            r6 = r1
            goto L40
        L2b:
            java.lang.String r0 = "editable.tracks.samples.location"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L3f
            r6 = r3
            goto L40
        L35:
            java.lang.String r0 = "com.android.capture.fps"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L3f
            r6 = r5
            goto L40
        L3f:
            r6 = -1
        L40:
            if (r6 == 0) goto L75
            if (r6 == r4) goto L66
            if (r6 == r1) goto L66
            if (r6 == r2) goto L5e
            if (r6 == r3) goto L4b
            return
        L4b:
            r6 = 75
            if (r8 != r6) goto L59
            int r6 = r7.length
            if (r6 != r4) goto L59
            r6 = r7[r5]
            if (r6 == 0) goto L5a
            if (r6 != r4) goto L59
            goto L5a
        L59:
            r4 = r5
        L5a:
            com.google.android.gms.internal.ads.af0.OoooO0(r4)
            return
        L5e:
            if (r8 != 0) goto L61
            goto L62
        L61:
            r4 = r5
        L62:
            com.google.android.gms.internal.ads.af0.OoooO0(r4)
            return
        L66:
            r6 = 78
            if (r8 != r6) goto L70
            int r6 = r7.length
            r7 = 8
            if (r6 != r7) goto L70
            goto L71
        L70:
            r4 = r5
        L71:
            com.google.android.gms.internal.ads.af0.OoooO0(r4)
            return
        L75:
            r6 = 23
            if (r8 != r6) goto L7d
            int r6 = r7.length
            if (r6 != r3) goto L7d
            goto L7e
        L7d:
            r4 = r5
        L7e:
            com.google.android.gms.internal.ads.af0.OoooO0(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.s90.OooO00o(java.lang.String, byte[], int):void");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1774l2
    public final /* synthetic */ void OooO0Oo(C1551f0 c1551f0) {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && s90.class == obj.getClass()) {
            s90 s90Var = (s90) obj;
            if (this.zza.equals(s90Var.zza) && Arrays.equals(this.zzb, s90Var.zzb) && this.zzc == s90Var.zzc && this.zzd == s90Var.zzd) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.zza.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE;
        return ((((Arrays.hashCode(this.zzb) + (iHashCode * 31)) * 31) + this.zzc) * 31) + this.zzd;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String toString() {
        /*
            r6 = this;
            r0 = 1
            int r1 = r6.zzd
            r2 = 0
            if (r1 == 0) goto L61
            if (r1 == r0) goto L53
            r3 = 23
            if (r1 == r3) goto L43
            r3 = 67
            if (r1 == r3) goto L37
            r3 = 75
            if (r1 == r3) goto L2b
            r3 = 78
            if (r1 == r3) goto L1a
            goto La9
        L1a:
            byte[] r0 = r6.zzb
            com.google.android.gms.internal.ads.r40 r1 = new com.google.android.gms.internal.ads.r40
            r1.<init>(r0)
            long r0 = r1.OooOooo()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            goto Ld5
        L2b:
            byte[] r0 = r6.zzb
            r0 = r0[r2]
            r0 = r0 & 255(0xff, float:3.57E-43)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            goto Ld5
        L37:
            byte[] r0 = r6.zzb
            int r0 = com.google.android.gms.internal.ads.ii0.OoooO00(r0)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            goto Ld5
        L43:
            byte[] r0 = r6.zzb
            int r0 = com.google.android.gms.internal.ads.ii0.OoooO00(r0)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            goto Ld5
        L53:
            byte[] r0 = r6.zzb
            int r1 = com.google.android.gms.internal.ads.i80.f19994OooO00o
            java.lang.String r1 = new java.lang.String
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.UTF_8
            r1.<init>(r0, r2)
            r0 = r1
            goto Ld5
        L61:
            java.lang.String r1 = r6.zza
            java.lang.String r3 = "editable.tracks.map"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto La9
            java.lang.String r1 = r6.zza
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto La1
            byte[] r1 = r6.zzb
            r1 = r1[r0]
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
        L7c:
            if (r2 >= r1) goto L8d
            byte[] r4 = r6.zzb
            int r5 = r2 + 2
            r4 = r4[r5]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3.add(r4)
            int r2 = r2 + r0
            goto L7c
        L8d:
            java.lang.String r0 = "track types = "
            java.lang.StringBuilder r0 = OooO0oO.OooOo.OooOo0O(r0)
            java.util.Iterator r1 = r3.iterator()
            java.lang.String r2 = ","
            com.google.android.gms.internal.ads.xh0.OoooO0(r0, r1, r2)
            java.lang.String r0 = r0.toString()
            goto Ld5
        La1:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Metadata is not an editable tracks map"
            r0.<init>(r1)
            throw r0
        La9:
            byte[] r1 = r6.zzb
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r4 = r1.length
            int r4 = r4 + r4
            r3.<init>(r4)
        Lb2:
            int r4 = r1.length
            if (r2 >= r4) goto Ld1
            r4 = r1[r2]
            int r4 = r4 >> 4
            r4 = r4 & 15
            r5 = 16
            char r4 = java.lang.Character.forDigit(r4, r5)
            r3.append(r4)
            r4 = r1[r2]
            r4 = r4 & 15
            char r4 = java.lang.Character.forDigit(r4, r5)
            r3.append(r4)
            int r2 = r2 + r0
            goto Lb2
        Ld1:
            java.lang.String r0 = r3.toString()
        Ld5:
            java.lang.String r1 = r6.zza
            java.lang.String r2 = "mdta: key="
            java.lang.String r3 = ", value="
            java.lang.String r0 = androidx.datastore.preferences.protobuf.OooO00o.OooOO0o(r2, r1, r3, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.s90.toString():java.lang.String");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zza);
        parcel.writeByteArray(this.zzb);
        parcel.writeInt(this.zzc);
        parcel.writeInt(this.zzd);
    }

    public s90(String str, byte[] bArr, int i, int i2) {
        OooO00o(str, bArr, i2);
        this.zza = str;
        this.zzb = bArr;
        this.zzc = i;
        this.zzd = i2;
    }
}
