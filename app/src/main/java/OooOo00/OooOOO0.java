package OoooO00;

import OooO0oO.OooOo;
import android.os.BadParcelableException;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public abstract class OooOOO0 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public static final /* synthetic */ int f13898OooO00o = 0;

    static {
        OooOOO0.class.getClassLoader();
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
}
