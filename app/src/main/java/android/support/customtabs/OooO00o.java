package android.support.customtabs;

import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class OooO00o implements OooO0OO {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public IBinder f15147OooOo0O;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f15147OooOo0O;
    }

    @Override // android.support.customtabs.OooO0OO
    public final void extraCallback(String str, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(OooO0OO.f15148OooO0O0);
            parcelObtain.writeString(str);
            Oooo0o0.OooO.OooO0OO(parcelObtain, bundle, 0);
            this.f15147OooOo0O.transact(3, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // android.support.customtabs.OooO0OO
    public final Bundle extraCallbackWithResult(String str, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(OooO0OO.f15148OooO0O0);
            parcelObtain.writeString(str);
            Oooo0o0.OooO.OooO0OO(parcelObtain, bundle, 0);
            this.f15147OooOo0O.transact(7, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return (Bundle) Oooo0o0.OooO.OooO0O0(parcelObtain2, Bundle.CREATOR);
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.support.customtabs.OooO0OO
    public final void onActivityLayout(int i, int i2, int i3, int i4, int i5, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(OooO0OO.f15148OooO0O0);
            parcelObtain.writeInt(i);
            parcelObtain.writeInt(i2);
            parcelObtain.writeInt(i3);
            parcelObtain.writeInt(i4);
            parcelObtain.writeInt(i5);
            Oooo0o0.OooO.OooO0OO(parcelObtain, bundle, 0);
            this.f15147OooOo0O.transact(10, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // android.support.customtabs.OooO0OO
    public final void onActivityResized(int i, int i2, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(OooO0OO.f15148OooO0O0);
            parcelObtain.writeInt(i);
            parcelObtain.writeInt(i2);
            Oooo0o0.OooO.OooO0OO(parcelObtain, bundle, 0);
            this.f15147OooOo0O.transact(8, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // android.support.customtabs.OooO0OO
    public final void onMessageChannelReady(Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(OooO0OO.f15148OooO0O0);
            Oooo0o0.OooO.OooO0OO(parcelObtain, bundle, 0);
            this.f15147OooOo0O.transact(4, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.support.customtabs.OooO0OO
    public final void onMinimized(Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(OooO0OO.f15148OooO0O0);
            Oooo0o0.OooO.OooO0OO(parcelObtain, bundle, 0);
            this.f15147OooOo0O.transact(11, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // android.support.customtabs.OooO0OO
    public final void onNavigationEvent(int i, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(OooO0OO.f15148OooO0O0);
            parcelObtain.writeInt(i);
            Oooo0o0.OooO.OooO0OO(parcelObtain, bundle, 0);
            this.f15147OooOo0O.transact(2, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // android.support.customtabs.OooO0OO
    public final void onPostMessage(String str, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(OooO0OO.f15148OooO0O0);
            parcelObtain.writeString(str);
            Oooo0o0.OooO.OooO0OO(parcelObtain, bundle, 0);
            this.f15147OooOo0O.transact(5, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.support.customtabs.OooO0OO
    public final void onRelationshipValidationResult(int i, Uri uri, boolean z, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(OooO0OO.f15148OooO0O0);
            parcelObtain.writeInt(i);
            Oooo0o0.OooO.OooO0OO(parcelObtain, uri, 0);
            parcelObtain.writeInt(z ? 1 : 0);
            Oooo0o0.OooO.OooO0OO(parcelObtain, bundle, 0);
            this.f15147OooOo0O.transact(6, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // android.support.customtabs.OooO0OO
    public final void onUnminimized(Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(OooO0OO.f15148OooO0O0);
            Oooo0o0.OooO.OooO0OO(parcelObtain, bundle, 0);
            this.f15147OooOo0O.transact(12, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // android.support.customtabs.OooO0OO
    public final void onWarmupCompleted(Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(OooO0OO.f15148OooO0O0);
            Oooo0o0.OooO.OooO0OO(parcelObtain, bundle, 0);
            this.f15147OooOo0O.transact(9, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }
}
