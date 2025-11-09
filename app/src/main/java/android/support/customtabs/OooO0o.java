package android.support.customtabs;

import Oooo0oO.o00000;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: classes.dex */
public final class OooO0o implements OooOO0 {

    /* renamed from: OooOo0O */
    public IBinder f15149OooOo0O;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f15149OooOo0O;
    }

    @Override // android.support.customtabs.OooOO0
    public final Bundle extraCommand(String str, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(OooOO0.f15150OooO0OO);
            parcelObtain.writeString(str);
            o00000.OooOOO(parcelObtain, bundle, 0);
            this.f15149OooOo0O.transact(5, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return (Bundle) o00000.OooO00o(parcelObtain2, Bundle.CREATOR);
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.support.customtabs.OooOO0
    public final boolean isEngagementSignalsApiAvailable(OooO0OO oooO0OO, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(OooOO0.f15150OooO0OO);
            parcelObtain.writeStrongInterface(oooO0OO);
            o00000.OooOOO(parcelObtain, bundle, 0);
            this.f15149OooOo0O.transact(13, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.support.customtabs.OooOO0
    public final boolean mayLaunchUrl(OooO0OO oooO0OO, Uri uri, Bundle bundle, List list) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(OooOO0.f15150OooO0OO);
            parcelObtain.writeStrongInterface(oooO0OO);
            o00000.OooOOO(parcelObtain, uri, 0);
            o00000.OooOOO(parcelObtain, bundle, 0);
            if (list == null) {
                parcelObtain.writeInt(-1);
            } else {
                int size = list.size();
                parcelObtain.writeInt(size);
                for (int i = 0; i < size; i++) {
                    o00000.OooOOO(parcelObtain, (Parcelable) list.get(i), 0);
                }
            }
            this.f15149OooOo0O.transact(4, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.support.customtabs.OooOO0
    public final boolean newSession(OooO0OO oooO0OO) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(OooOO0.f15150OooO0OO);
            parcelObtain.writeStrongInterface(oooO0OO);
            this.f15149OooOo0O.transact(3, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.support.customtabs.OooOO0
    public final boolean newSessionWithExtras(OooO0OO oooO0OO, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(OooOO0.f15150OooO0OO);
            parcelObtain.writeStrongInterface(oooO0OO);
            o00000.OooOOO(parcelObtain, bundle, 0);
            this.f15149OooOo0O.transact(10, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.support.customtabs.OooOO0
    public final int postMessage(OooO0OO oooO0OO, String str, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(OooOO0.f15150OooO0OO);
            parcelObtain.writeStrongInterface(oooO0OO);
            parcelObtain.writeString(str);
            o00000.OooOOO(parcelObtain, bundle, 0);
            this.f15149OooOo0O.transact(8, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.support.customtabs.OooOO0
    public final boolean receiveFile(OooO0OO oooO0OO, Uri uri, int i, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(OooOO0.f15150OooO0OO);
            parcelObtain.writeStrongInterface(oooO0OO);
            o00000.OooOOO(parcelObtain, uri, 0);
            parcelObtain.writeInt(i);
            o00000.OooOOO(parcelObtain, bundle, 0);
            this.f15149OooOo0O.transact(12, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.support.customtabs.OooOO0
    public final boolean requestPostMessageChannel(OooO0OO oooO0OO, Uri uri) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(OooOO0.f15150OooO0OO);
            parcelObtain.writeStrongInterface(oooO0OO);
            o00000.OooOOO(parcelObtain, uri, 0);
            this.f15149OooOo0O.transact(7, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.support.customtabs.OooOO0
    public final boolean requestPostMessageChannelWithExtras(OooO0OO oooO0OO, Uri uri, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(OooOO0.f15150OooO0OO);
            parcelObtain.writeStrongInterface(oooO0OO);
            o00000.OooOOO(parcelObtain, uri, 0);
            o00000.OooOOO(parcelObtain, bundle, 0);
            this.f15149OooOo0O.transact(11, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.support.customtabs.OooOO0
    public final boolean setEngagementSignalsCallback(OooO0OO oooO0OO, IBinder iBinder, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(OooOO0.f15150OooO0OO);
            parcelObtain.writeStrongInterface(oooO0OO);
            parcelObtain.writeStrongBinder(iBinder);
            o00000.OooOOO(parcelObtain, bundle, 0);
            this.f15149OooOo0O.transact(14, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.support.customtabs.OooOO0
    public final boolean updateVisuals(OooO0OO oooO0OO, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(OooOO0.f15150OooO0OO);
            parcelObtain.writeStrongInterface(oooO0OO);
            o00000.OooOOO(parcelObtain, bundle, 0);
            this.f15149OooOo0O.transact(6, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.support.customtabs.OooOO0
    public final boolean validateRelationship(OooO0OO oooO0OO, int i, Uri uri, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(OooOO0.f15150OooO0OO);
            parcelObtain.writeStrongInterface(oooO0OO);
            parcelObtain.writeInt(i);
            o00000.OooOOO(parcelObtain, uri, 0);
            o00000.OooOOO(parcelObtain, bundle, 0);
            this.f15149OooOo0O.transact(9, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.support.customtabs.OooOO0
    public final boolean warmup(long j) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(OooOO0.f15150OooO0OO);
            parcelObtain.writeLong(j);
            this.f15149OooOo0O.transact(2, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }
}
