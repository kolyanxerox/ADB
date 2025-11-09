package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.ads.xh */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC2233xh extends AbstractBinderC2181w2 implements InterfaceC2270yh {
    public AbstractBinderC2233xh() {
        super("com.google.android.gms.ads.internal.query.IUpdateUrlsCallback");
    }

    public static InterfaceC2270yh o000O0O0(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.query.IUpdateUrlsCallback");
        return iInterfaceQueryLocalInterface instanceof InterfaceC2270yh ? (InterfaceC2270yh) iInterfaceQueryLocalInterface : new C2196wh(iBinder, "com.google.android.gms.ads.internal.query.IUpdateUrlsCallback");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2181w2
    public final boolean o000OO0O(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(Uri.CREATOR);
            AbstractC2218x2.OooO0O0(parcel);
            Oooo000(arrayListCreateTypedArrayList);
        } else {
            if (i != 2) {
                return false;
            }
            String string = parcel.readString();
            AbstractC2218x2.OooO0O0(parcel);
            zze(string);
        }
        parcel2.writeNoException();
        return true;
    }
}
