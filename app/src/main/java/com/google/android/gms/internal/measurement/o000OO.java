package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes2.dex */
public final class o000OO extends OoooO0.OooO0o implements o0000OO0 {
    public o000OO(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy", 2);
    }

    @Override // com.google.android.gms.internal.measurement.o0000OO0
    public final void o00000oO(long j, Bundle bundle, String str, String str2) {
        Parcel parcelO000OO0O = o000OO0O();
        parcelO000OO0O.writeString(str);
        parcelO000OO0O.writeString(str2);
        o0OO00O.OooO0O0(parcelO000OO0O, bundle);
        parcelO000OO0O.writeLong(j);
        o000O0O0(parcelO000OO0O, 1);
    }

    @Override // com.google.android.gms.internal.measurement.o0000OO0
    public final int zzf() {
        Parcel parcelOooOOO = OooOOO(o000OO0O(), 2);
        int i = parcelOooOOO.readInt();
        parcelOooOOO.recycle();
        return i;
    }
}
