package Oooo00O;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes2.dex */
public final class oo0o0Oo implements IInterface {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final IBinder f13839OooOo0O;

    public oo0o0Oo(IBinder iBinder) {
        this.f13839OooOo0O = iBinder;
    }

    public final void OooO(o00000O o00000o, OooOOO oooOOO) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            parcelObtain.writeStrongBinder(o00000o);
            parcelObtain.writeInt(1);
            OooOoo0.o000OOo.OooO00o(oooOOO, parcelObtain, 0);
            this.f13839OooOo0O.transact(46, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f13839OooOo0O;
    }
}
