package OoooO0;

import OoooOoo.oOO0Oo00;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.internal.o0ooOOo;

/* loaded from: classes2.dex */
public abstract class OooO extends Binder implements IInterface {

    /* renamed from: OooOo0O */
    public final /* synthetic */ int f13891OooOo0O;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        int i = this.f13891OooOo0O;
        return this;
    }

    public abstract boolean o000O0O0(int i, Parcel parcel, Parcel parcel2);

    public boolean o000OO0O(int i, Parcel parcel, Parcel parcel2) {
        return false;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (this.f13891OooOo0O) {
            case 0:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                    return true;
                }
                return o000OO0O(i, parcel, parcel2);
            case 1:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                    return true;
                }
                switch (i) {
                    case 3:
                        OoooO00.OooOOO0.OooO0O0(parcel);
                        break;
                    case 4:
                        OoooO00.OooOOO0.OooO0O0(parcel);
                        break;
                    case 5:
                    default:
                        return false;
                    case 6:
                        OoooO00.OooOOO0.OooO0O0(parcel);
                        break;
                    case 7:
                        OoooO00.OooOOO0.OooO0O0(parcel);
                        break;
                    case 8:
                        oOO0Oo00 ooo0oo00 = (oOO0Oo00) OoooO00.OooOOO0.OooO00o(parcel, oOO0Oo00.CREATOR);
                        OoooO00.OooOOO0.OooO0O0(parcel);
                        o0ooOOo o0ooooo = (o0ooOOo) this;
                        o0ooooo.f16753OooOo.post(new o00000oO.OooOOO0(o0ooooo, false, ooo0oo00, 21));
                        break;
                    case 9:
                        OoooO00.OooOOO0.OooO0O0(parcel);
                        break;
                }
                parcel2.writeNoException();
                return true;
            default:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                    return true;
                }
                return o000O0O0(i, parcel, parcel2);
        }
    }

    public OooO(String str, int i) {
        this.f13891OooOo0O = i;
        switch (i) {
            case 2:
                attachInterface(this, str);
                break;
            default:
                attachInterface(this, str);
                break;
        }
    }
}
