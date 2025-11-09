package android.support.customtabs.trusted;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class OooO00o implements OooO0OO {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public IBinder f15155OooOo0O;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f15155OooOo0O;
    }

    @Override // android.support.customtabs.trusted.OooO0OO
    public final void onExtraCallback(String str, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(OooO0OO.f15156OooO0o);
            parcelObtain.writeString(str);
            if (bundle != null) {
                parcelObtain.writeInt(1);
                bundle.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            this.f15155OooOo0O.transact(2, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }
}
