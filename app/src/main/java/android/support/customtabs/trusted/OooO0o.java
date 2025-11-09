package android.support.customtabs.trusted;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.measurement.o0OO00OO;

/* loaded from: classes.dex */
public final class OooO0o implements OooOO0 {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public IBinder f15157OooOo0O;

    @Override // android.support.customtabs.trusted.OooOO0
    public final Bundle areNotificationsEnabled(Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(OooOO0.f15158OooO0oO);
            o0OO00OO.OooO0O0(0, bundle, parcelObtain);
            this.f15157OooOo0O.transact(6, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return (Bundle) o0OO00OO.OooO00o(parcelObtain2, Bundle.CREATOR);
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f15157OooOo0O;
    }

    @Override // android.support.customtabs.trusted.OooOO0
    public final void cancelNotification(Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(OooOO0.f15158OooO0oO);
            o0OO00OO.OooO0O0(0, bundle, parcelObtain);
            this.f15157OooOo0O.transact(3, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.support.customtabs.trusted.OooOO0
    public final Bundle extraCommand(String str, Bundle bundle, IBinder iBinder) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(OooOO0.f15158OooO0oO);
            parcelObtain.writeString(str);
            o0OO00OO.OooO0O0(0, bundle, parcelObtain);
            parcelObtain.writeStrongBinder(iBinder);
            this.f15157OooOo0O.transact(9, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return (Bundle) o0OO00OO.OooO00o(parcelObtain2, Bundle.CREATOR);
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.support.customtabs.trusted.OooOO0
    public final Bundle getActiveNotifications() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(OooOO0.f15158OooO0oO);
            this.f15157OooOo0O.transact(5, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return (Bundle) o0OO00OO.OooO00o(parcelObtain2, Bundle.CREATOR);
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.support.customtabs.trusted.OooOO0
    public final Bundle getSmallIconBitmap() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(OooOO0.f15158OooO0oO);
            this.f15157OooOo0O.transact(7, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return (Bundle) o0OO00OO.OooO00o(parcelObtain2, Bundle.CREATOR);
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.support.customtabs.trusted.OooOO0
    public final int getSmallIconId() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(OooOO0.f15158OooO0oO);
            this.f15157OooOo0O.transact(4, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.support.customtabs.trusted.OooOO0
    public final Bundle notifyNotificationWithChannel(Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(OooOO0.f15158OooO0oO);
            o0OO00OO.OooO0O0(0, bundle, parcelObtain);
            this.f15157OooOo0O.transact(2, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return (Bundle) o0OO00OO.OooO00o(parcelObtain2, Bundle.CREATOR);
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }
}
