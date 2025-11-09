package OoooOoo;

import OooOooo.o000Oo0;
import Oooo00O.o00oO0o;
import OooooO0.o00000OO;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.OooO;
import com.google.android.material.datepicker.OooO0O0;
import com.google.android.material.datepicker.OooO0OO;
import com.google.android.material.datepicker.o00Ooo;
import com.google.android.material.slider.OooOO0;
import com.google.android.material.slider.OooOOO0;
import java.util.ArrayList;
import o000O00.o00O0O0O;
import o0ooOO0.o0OOO0o;

/* loaded from: classes2.dex */
public final class oOO0OoO0 implements Parcelable.Creator {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f14949OooO00o;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f14949OooO00o) {
            case 0:
                int iOooOooO = o00O0O0O.OooOooO(parcel);
                o000Oo0 o000oo02 = null;
                int iOooOoO0 = 0;
                o00oO0o o00oo0o = null;
                while (parcel.dataPosition() < iOooOooO) {
                    int i = parcel.readInt();
                    char c = (char) i;
                    if (c == 1) {
                        iOooOoO0 = o00O0O0O.OooOoO0(parcel, i);
                    } else if (c == 2) {
                        o000oo02 = (o000Oo0) o00O0O0O.OooO0oo(parcel, i, o000Oo0.CREATOR);
                    } else if (c != 3) {
                        o00O0O0O.OooOoo0(parcel, i);
                    } else {
                        o00oo0o = (o00oO0o) o00O0O0O.OooO0oo(parcel, i, o00oO0o.CREATOR);
                    }
                }
                o00O0O0O.OooOOo0(parcel, iOooOooO);
                return new oOO0Oo00(iOooOoO0, o000oo02, o00oo0o);
            case 1:
                return new o00000OO(parcel);
            case 2:
                return new OooO0OO((o00Ooo) parcel.readParcelable(o00Ooo.class.getClassLoader()), (o00Ooo) parcel.readParcelable(o00Ooo.class.getClassLoader()), (OooO0O0) parcel.readParcelable(OooO0O0.class.getClassLoader()), (o00Ooo) parcel.readParcelable(o00Ooo.class.getClassLoader()), parcel.readInt());
            case 3:
                return new OooO(parcel.readLong());
            case 4:
                return o00Ooo.OooO0O0(parcel.readInt(), parcel.readInt());
            case 5:
                OooOO0 oooOO0 = new OooOO0(parcel);
                oooOO0.f27807OooOo0O = parcel.readFloat();
                oooOO0.f27808OooOo0o = parcel.readFloat();
                ArrayList arrayList = new ArrayList();
                oooOO0.f27806OooOo = arrayList;
                parcel.readList(arrayList, Float.class.getClassLoader());
                oooOO0.f27810OooOoO0 = parcel.readFloat();
                oooOO0.f27809OooOoO = parcel.createBooleanArray()[0];
                return oooOO0;
            case 6:
                return new OooOOO0(parcel);
            case 7:
                o0OOO0o.OooOO0 oooOO02 = new o0OOO0o.OooOO0();
                oooOO02.f32980OooOo0O = parcel.readInt();
                oooOO02.f32981OooOo0o = (o0OOO0o) parcel.readParcelable(o0OOO0o.OooOO0.class.getClassLoader());
                return oooOO02;
            default:
                o0OoOo0.OooO0O0 oooO0O0 = new o0OoOo0.OooO0O0(parcel);
                oooO0O0.f32997OooOo0O = ((Integer) parcel.readValue(o0OoOo0.OooO0O0.class.getClassLoader())).intValue();
                return oooO0O0;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f14949OooO00o) {
            case 0:
                return new oOO0Oo00[i];
            case 1:
                return new o00000OO[i];
            case 2:
                return new OooO0OO[i];
            case 3:
                return new OooO[i];
            case 4:
                return new o00Ooo[i];
            case 5:
                return new OooOO0[i];
            case 6:
                return new OooOOO0[i];
            case 7:
                return new o0OOO0o.OooOO0[i];
            default:
                return new o0OoOo0.OooO0O0[i];
        }
    }
}
