package Oooo0oo;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes2.dex */
public final class o0000O0 implements o000OO, IInterface {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final IBinder f13888OooOo0O;

    public o0000O0(IBinder iBinder) {
        this.f13888OooOo0O = iBinder;
    }

    public final Parcel OooO(Parcel parcel, int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f13888OooOo0O.transact(i, parcel, parcelObtain, 0);
                parcelObtain.readException();
                return parcelObtain;
            } catch (RuntimeException e) {
                parcelObtain.recycle();
                throw e;
            }
        } finally {
            parcel.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f13888OooOo0O;
    }
}
