package OoooO0;

import OooO0oO.OooOo;
import android.os.BadParcelableException;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public abstract class OooOO0 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public static final /* synthetic */ int f13895OooO00o = 0;

    static {
        OooOO0.class.getClassLoader();
    }

    public static Parcelable OooO00o(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    public static void OooO0O0(Parcel parcel) {
        int iDataAvail = parcel.dataAvail();
        if (iDataAvail > 0) {
            throw new BadParcelableException(OooOo.OooO0o(iDataAvail, "Parcel data not fully consumed, unread size: "));
        }
    }

    public static void OooO0OO(Parcel parcel, IInterface iInterface) {
        if (iInterface == null) {
            parcel.writeStrongBinder(null);
        } else {
            parcel.writeStrongBinder(iInterface.asBinder());
        }
    }
}
