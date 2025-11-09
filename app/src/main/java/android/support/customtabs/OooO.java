package android.support.customtabs;

import Oooo0oO.o00000;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* loaded from: classes.dex */
public abstract class OooO extends Binder implements OooOO0 {
    static final int TRANSACTION_extraCommand = 5;
    static final int TRANSACTION_isEngagementSignalsApiAvailable = 13;
    static final int TRANSACTION_mayLaunchUrl = 4;
    static final int TRANSACTION_newSession = 3;
    static final int TRANSACTION_newSessionWithExtras = 10;
    static final int TRANSACTION_postMessage = 8;
    static final int TRANSACTION_receiveFile = 12;
    static final int TRANSACTION_requestPostMessageChannel = 7;
    static final int TRANSACTION_requestPostMessageChannelWithExtras = 11;
    static final int TRANSACTION_setEngagementSignalsCallback = 14;
    static final int TRANSACTION_updateVisuals = 6;
    static final int TRANSACTION_validateRelationship = 9;
    static final int TRANSACTION_warmup = 2;

    public OooO() {
        attachInterface(this, OooOO0.f15150OooO0OO);
    }

    public static OooOO0 asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(OooOO0.f15150OooO0OO);
        if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof OooOO0)) {
            return (OooOO0) iInterfaceQueryLocalInterface;
        }
        OooO0o oooO0o = new OooO0o();
        oooO0o.f15149OooOo0O = iBinder;
        return oooO0o;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        String str = OooOO0.f15150OooO0OO;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        switch (i) {
            case 2:
                boolean zWarmup = warmup(parcel.readLong());
                parcel2.writeNoException();
                parcel2.writeInt(zWarmup ? 1 : 0);
                return true;
            case 3:
                boolean zNewSession = newSession(OooO0O0.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                parcel2.writeInt(zNewSession ? 1 : 0);
                return true;
            case 4:
                OooO0OO oooO0OOAsInterface = OooO0O0.asInterface(parcel.readStrongBinder());
                Uri uri = (Uri) o00000.OooO00o(parcel, Uri.CREATOR);
                Parcelable.Creator creator = Bundle.CREATOR;
                boolean zMayLaunchUrl = mayLaunchUrl(oooO0OOAsInterface, uri, (Bundle) o00000.OooO00o(parcel, creator), parcel.createTypedArrayList(creator));
                parcel2.writeNoException();
                parcel2.writeInt(zMayLaunchUrl ? 1 : 0);
                return true;
            case 5:
                Bundle bundleExtraCommand = extraCommand(parcel.readString(), (Bundle) o00000.OooO00o(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                o00000.OooOOO(parcel2, bundleExtraCommand, 1);
                return true;
            case 6:
                boolean zUpdateVisuals = updateVisuals(OooO0O0.asInterface(parcel.readStrongBinder()), (Bundle) o00000.OooO00o(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                parcel2.writeInt(zUpdateVisuals ? 1 : 0);
                return true;
            case 7:
                boolean zRequestPostMessageChannel = requestPostMessageChannel(OooO0O0.asInterface(parcel.readStrongBinder()), (Uri) o00000.OooO00o(parcel, Uri.CREATOR));
                parcel2.writeNoException();
                parcel2.writeInt(zRequestPostMessageChannel ? 1 : 0);
                return true;
            case 8:
                int iPostMessage = postMessage(OooO0O0.asInterface(parcel.readStrongBinder()), parcel.readString(), (Bundle) o00000.OooO00o(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                parcel2.writeInt(iPostMessage);
                return true;
            case 9:
                boolean zValidateRelationship = validateRelationship(OooO0O0.asInterface(parcel.readStrongBinder()), parcel.readInt(), (Uri) o00000.OooO00o(parcel, Uri.CREATOR), (Bundle) o00000.OooO00o(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                parcel2.writeInt(zValidateRelationship ? 1 : 0);
                return true;
            case 10:
                boolean zNewSessionWithExtras = newSessionWithExtras(OooO0O0.asInterface(parcel.readStrongBinder()), (Bundle) o00000.OooO00o(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                parcel2.writeInt(zNewSessionWithExtras ? 1 : 0);
                return true;
            case 11:
                boolean zRequestPostMessageChannelWithExtras = requestPostMessageChannelWithExtras(OooO0O0.asInterface(parcel.readStrongBinder()), (Uri) o00000.OooO00o(parcel, Uri.CREATOR), (Bundle) o00000.OooO00o(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                parcel2.writeInt(zRequestPostMessageChannelWithExtras ? 1 : 0);
                return true;
            case 12:
                boolean zReceiveFile = receiveFile(OooO0O0.asInterface(parcel.readStrongBinder()), (Uri) o00000.OooO00o(parcel, Uri.CREATOR), parcel.readInt(), (Bundle) o00000.OooO00o(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                parcel2.writeInt(zReceiveFile ? 1 : 0);
                return true;
            case 13:
                boolean zIsEngagementSignalsApiAvailable = isEngagementSignalsApiAvailable(OooO0O0.asInterface(parcel.readStrongBinder()), (Bundle) o00000.OooO00o(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                parcel2.writeInt(zIsEngagementSignalsApiAvailable ? 1 : 0);
                return true;
            case 14:
                boolean engagementSignalsCallback = setEngagementSignalsCallback(OooO0O0.asInterface(parcel.readStrongBinder()), parcel.readStrongBinder(), (Bundle) o00000.OooO00o(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                parcel2.writeInt(engagementSignalsCallback ? 1 : 0);
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
