package com.google.android.gms.ads.internal.client;

import Oooo0o.OooO0O0;
import Oooo0o.OooO0OO;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.AbstractBinderC2181w2;
import com.google.android.gms.internal.ads.AbstractC2218x2;

/* loaded from: classes2.dex */
public abstract class zzdt extends AbstractBinderC2181w2 implements zzdu {
    public zzdt() {
        super("com.google.android.gms.ads.internal.client.IOutOfContextTester");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2181w2
    public final boolean o000OO0O(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        String string = parcel.readString();
        OooO0O0 oooO0O0O000O0o0 = OooO0OO.o000O0o0(parcel.readStrongBinder());
        OooO0O0 oooO0O0O000O0o02 = OooO0OO.o000O0o0(parcel.readStrongBinder());
        AbstractC2218x2.OooO0O0(parcel);
        zze(string, oooO0O0O000O0o0, oooO0O0O000O0o02);
        parcel2.writeNoException();
        return true;
    }
}
