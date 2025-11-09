package android.support.v4.app;

import android.app.Notification;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class OooO00o implements OooO0OO {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public IBinder f15159OooOo0O;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f15159OooOo0O;
    }

    @Override // android.support.v4.app.OooO0OO
    public final void cancel(String str, int i, String str2) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(OooO0OO.f15160OooO0oo);
            parcelObtain.writeString(str);
            parcelObtain.writeInt(i);
            parcelObtain.writeString(str2);
            this.f15159OooOo0O.transact(2, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // android.support.v4.app.OooO0OO
    public final void cancelAll(String str) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(OooO0OO.f15160OooO0oo);
            parcelObtain.writeString(str);
            this.f15159OooOo0O.transact(3, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // android.support.v4.app.OooO0OO
    public final void notify(String str, int i, String str2, Notification notification) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(OooO0OO.f15160OooO0oo);
            parcelObtain.writeString(str);
            parcelObtain.writeInt(i);
            parcelObtain.writeString(str2);
            if (notification != null) {
                parcelObtain.writeInt(1);
                notification.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            this.f15159OooOo0O.transact(1, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }
}
