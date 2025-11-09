package android.support.customtabs;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class OooOOOO implements OooOo {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public IBinder f15153OooOo0O;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f15153OooOo0O;
    }

    @Override // android.support.customtabs.OooOo
    public final void onMessageChannelReady(OooO0OO oooO0OO, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(OooOo.f15154OooO0o0);
            parcelObtain.writeStrongInterface(oooO0OO);
            if (bundle != null) {
                parcelObtain.writeInt(1);
                bundle.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            this.f15153OooOo0O.transact(2, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.support.customtabs.OooOo
    public final void onPostMessage(OooO0OO oooO0OO, String str, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(OooOo.f15154OooO0o0);
            parcelObtain.writeStrongInterface(oooO0OO);
            parcelObtain.writeString(str);
            if (bundle != null) {
                parcelObtain.writeInt(1);
                bundle.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            this.f15153OooOo0O.transact(3, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }
}
