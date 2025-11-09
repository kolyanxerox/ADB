package android.support.customtabs.trusted;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.o0OO00OO;

/* loaded from: classes.dex */
public abstract class OooO extends Binder implements OooOO0 {
    static final int TRANSACTION_areNotificationsEnabled = 6;
    static final int TRANSACTION_cancelNotification = 3;
    static final int TRANSACTION_extraCommand = 9;
    static final int TRANSACTION_getActiveNotifications = 5;
    static final int TRANSACTION_getSmallIconBitmap = 7;
    static final int TRANSACTION_getSmallIconId = 4;
    static final int TRANSACTION_notifyNotificationWithChannel = 2;

    public static OooOO0 asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(OooOO0.f15158OooO0oO);
        if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof OooOO0)) {
            return (OooOO0) iInterfaceQueryLocalInterface;
        }
        OooO0o oooO0o = new OooO0o();
        oooO0o.f15157OooOo0O = iBinder;
        return oooO0o;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        String str = OooOO0.f15158OooO0oO;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        switch (i) {
            case 2:
                Bundle bundleNotifyNotificationWithChannel = notifyNotificationWithChannel((Bundle) o0OO00OO.OooO00o(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                o0OO00OO.OooO0O0(1, bundleNotifyNotificationWithChannel, parcel2);
                return true;
            case 3:
                cancelNotification((Bundle) o0OO00OO.OooO00o(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 4:
                int smallIconId = getSmallIconId();
                parcel2.writeNoException();
                parcel2.writeInt(smallIconId);
                return true;
            case 5:
                Bundle activeNotifications = getActiveNotifications();
                parcel2.writeNoException();
                o0OO00OO.OooO0O0(1, activeNotifications, parcel2);
                return true;
            case 6:
                Bundle bundleAreNotificationsEnabled = areNotificationsEnabled((Bundle) o0OO00OO.OooO00o(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                o0OO00OO.OooO0O0(1, bundleAreNotificationsEnabled, parcel2);
                return true;
            case 7:
                Bundle smallIconBitmap = getSmallIconBitmap();
                parcel2.writeNoException();
                o0OO00OO.OooO0O0(1, smallIconBitmap, parcel2);
                return true;
            case 8:
            default:
                return super.onTransact(i, parcel, parcel2, i2);
            case 9:
                Bundle bundleExtraCommand = extraCommand(parcel.readString(), (Bundle) o0OO00OO.OooO00o(parcel, Bundle.CREATOR), parcel.readStrongBinder());
                parcel2.writeNoException();
                o0OO00OO.OooO0O0(1, bundleExtraCommand, parcel2);
                return true;
        }
    }
}
