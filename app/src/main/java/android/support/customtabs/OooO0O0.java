package android.support.customtabs;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public abstract class OooO0O0 extends Binder implements OooO0OO {
    static final int TRANSACTION_extraCallback = 3;
    static final int TRANSACTION_extraCallbackWithResult = 7;
    static final int TRANSACTION_onActivityLayout = 10;
    static final int TRANSACTION_onActivityResized = 8;
    static final int TRANSACTION_onMessageChannelReady = 4;
    static final int TRANSACTION_onMinimized = 11;
    static final int TRANSACTION_onNavigationEvent = 2;
    static final int TRANSACTION_onPostMessage = 5;
    static final int TRANSACTION_onRelationshipValidationResult = 6;
    static final int TRANSACTION_onUnminimized = 12;
    static final int TRANSACTION_onWarmupCompleted = 9;

    public OooO0O0() {
        attachInterface(this, OooO0OO.f15148OooO0O0);
    }

    public static OooO0OO asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(OooO0OO.f15148OooO0O0);
        if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof OooO0OO)) {
            return (OooO0OO) iInterfaceQueryLocalInterface;
        }
        OooO00o oooO00o = new OooO00o();
        oooO00o.f15147OooOo0O = iBinder;
        return oooO00o;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        String str = OooO0OO.f15148OooO0O0;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        switch (i) {
            case 2:
                onNavigationEvent(parcel.readInt(), (Bundle) Oooo0o0.OooO.OooO0O0(parcel, Bundle.CREATOR));
                return true;
            case 3:
                extraCallback(parcel.readString(), (Bundle) Oooo0o0.OooO.OooO0O0(parcel, Bundle.CREATOR));
                return true;
            case 4:
                onMessageChannelReady((Bundle) Oooo0o0.OooO.OooO0O0(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 5:
                onPostMessage(parcel.readString(), (Bundle) Oooo0o0.OooO.OooO0O0(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 6:
                onRelationshipValidationResult(parcel.readInt(), (Uri) Oooo0o0.OooO.OooO0O0(parcel, Uri.CREATOR), parcel.readInt() != 0, (Bundle) Oooo0o0.OooO.OooO0O0(parcel, Bundle.CREATOR));
                return true;
            case 7:
                Bundle bundleExtraCallbackWithResult = extraCallbackWithResult(parcel.readString(), (Bundle) Oooo0o0.OooO.OooO0O0(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                Oooo0o0.OooO.OooO0OO(parcel2, bundleExtraCallbackWithResult, 1);
                return true;
            case 8:
                onActivityResized(parcel.readInt(), parcel.readInt(), (Bundle) Oooo0o0.OooO.OooO0O0(parcel, Bundle.CREATOR));
                return true;
            case 9:
                onWarmupCompleted((Bundle) Oooo0o0.OooO.OooO0O0(parcel, Bundle.CREATOR));
                return true;
            case 10:
                onActivityLayout(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), (Bundle) Oooo0o0.OooO.OooO0O0(parcel, Bundle.CREATOR));
                return true;
            case 11:
                onMinimized((Bundle) Oooo0o0.OooO.OooO0O0(parcel, Bundle.CREATOR));
                return true;
            case 12:
                onUnminimized((Bundle) Oooo0o0.OooO.OooO0O0(parcel, Bundle.CREATOR));
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
