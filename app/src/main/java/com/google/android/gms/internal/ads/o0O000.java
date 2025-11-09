package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class o0O000 implements InterfaceC1774l2 {
    public static final Parcelable.Creator<o0O000> CREATOR = new o00OO000(16);
    public final List zza;

    public o0O000(ArrayList arrayList) {
        this.zza = arrayList;
        boolean z = false;
        if (!arrayList.isEmpty()) {
            long j = ((o0O0000O) arrayList.get(0)).zzb;
            int i = 1;
            while (true) {
                if (i >= arrayList.size()) {
                    break;
                }
                if (((o0O0000O) arrayList.get(i)).zza < j) {
                    z = true;
                    break;
                } else {
                    j = ((o0O0000O) arrayList.get(i)).zzb;
                    i++;
                }
            }
        }
        af0.OoooO0(!z);
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
        if (obj == null || o0O000.class != obj.getClass()) {
            return false;
        }
        return this.zza.equals(((o0O000) obj).zza);
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final String toString() {
        return "SlowMotion: segments=".concat(this.zza.toString());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.zza);
    }
}
