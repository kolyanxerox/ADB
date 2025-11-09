package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.C3034d9;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* loaded from: classes2.dex */
public class o00OO0OO implements InterfaceC1774l2 {
    public static final Parcelable.Creator<o00OO0OO> CREATOR = new o00OO000(2);
    public final String zza;
    public final String zzb;

    public o00OO0OO(Parcel parcel) {
        String string = parcel.readString();
        int i = i80.f19994OooO00o;
        this.zza = string;
        this.zzb = parcel.readString();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0040  */
    @Override // com.google.android.gms.internal.ads.InterfaceC1774l2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void OooO0Oo(com.google.android.gms.internal.ads.C1551f0 r7) {
        /*
            r6 = this;
            java.lang.String r0 = r6.zza
            int r1 = r0.hashCode()
            r2 = 2
            r3 = 4
            r4 = 3
            r5 = 1
            switch(r1) {
                case 62359119: goto L36;
                case 79833656: goto L2c;
                case 428414940: goto L22;
                case 1746739798: goto L18;
                case 1939198791: goto Le;
                default: goto Ld;
            }
        Ld:
            goto L40
        Le:
            java.lang.String r1 = "ARTIST"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L40
            r0 = r5
            goto L41
        L18:
            java.lang.String r1 = "ALBUMARTIST"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L40
            r0 = r4
            goto L41
        L22:
            java.lang.String r1 = "DESCRIPTION"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L40
            r0 = r3
            goto L41
        L2c:
            java.lang.String r1 = "TITLE"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L40
            r0 = 0
            goto L41
        L36:
            java.lang.String r1 = "ALBUM"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L40
            r0 = r2
            goto L41
        L40:
            r0 = -1
        L41:
            if (r0 == 0) goto L60
            if (r0 == r5) goto L5b
            if (r0 == r2) goto L56
            if (r0 == r4) goto L51
            if (r0 == r3) goto L4c
            return
        L4c:
            java.lang.String r0 = r6.zzb
            r7.f18726OooO0o0 = r0
            return
        L51:
            java.lang.String r0 = r6.zzb
            r7.f18724OooO0Oo = r0
            return
        L56:
            java.lang.String r0 = r6.zzb
            r7.f18723OooO0OO = r0
            return
        L5b:
            java.lang.String r0 = r6.zzb
            r7.f18722OooO0O0 = r0
            return
        L60:
            java.lang.String r0 = r6.zzb
            r7.f18721OooO00o = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.o00OO0OO.OooO0Oo(com.google.android.gms.internal.ads.f0):void");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            o00OO0OO o00oo0oo = (o00OO0OO) obj;
            if (this.zza.equals(o00oo0oo.zza) && this.zzb.equals(o00oo0oo.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.zza.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE;
        return this.zzb.hashCode() + (iHashCode * 31);
    }

    public final String toString() {
        return "VC: " + this.zza + C3034d9.i.f8173b + this.zzb;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zza);
        parcel.writeString(this.zzb);
    }

    public o00OO0OO(String str, String str2) {
        this.zza = xh0.Oooo00o(str);
        this.zzb = str2;
    }
}
