package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.ads.d9 */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC1487d9 extends AbstractBinderC2181w2 implements InterfaceC1523e9 {
    public static InterfaceC1523e9 o000O0O0(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
        return iInterfaceQueryLocalInterface instanceof InterfaceC1523e9 ? (InterfaceC1523e9) iInterfaceQueryLocalInterface : new C1450c9(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2181w2
    public final boolean o000OO0O(int i, Parcel parcel, Parcel parcel2) {
        if (i == 2) {
            parcel2.writeNoException();
            parcel2.writeString(((BinderC2224x8) this).f25553OooOo0O);
            return true;
        }
        if (i != 3) {
            return false;
        }
        ArrayList arrayList = ((BinderC2224x8) this).f25552OooOo;
        parcel2.writeNoException();
        parcel2.writeList(arrayList);
        return true;
    }
}
