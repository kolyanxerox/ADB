package OooooOo;

import Oooooo.o0ooOOo;
import OoooooO.oo000000;
import android.os.Parcel;
import android.os.Parcelable;
import o000000o.OooOO0O;
import o00000O0.o0OO00O;
import o0OOO0o.OooOo00;
import o0OOO0o.o0OoOo0;
import o0ooOO0.OooO0o;
import o0ooOO0.o0OOO0o;

/* loaded from: classes2.dex */
public final class oOOOOo0O implements Parcelable.ClassLoaderCreator {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f15059OooO00o;

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.f15059OooO00o) {
            case 0:
                return new oOOo0000(parcel, classLoader);
            case 1:
                return new o0ooOOo(parcel, classLoader);
            case 2:
                return new oo000000(parcel, classLoader);
            case 3:
                return new OooOO0O(parcel, classLoader);
            case 4:
                return new o0OO00O(parcel, classLoader);
            case 5:
                return new OooOo00(parcel, classLoader);
            case 6:
                return new o0OoOo0(parcel, classLoader);
            case 7:
                return new OooO0o(parcel, classLoader);
            default:
                return new o0OOO0o(parcel, classLoader);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f15059OooO00o) {
            case 0:
                return new oOOo0000[i];
            case 1:
                return new o0ooOOo[i];
            case 2:
                return new oo000000[i];
            case 3:
                return new OooOO0O[i];
            case 4:
                return new o0OO00O[i];
            case 5:
                return new OooOo00[i];
            case 6:
                return new o0OoOo0[i];
            case 7:
                return new OooO0o[i];
            default:
                return new o0OOO0o[i];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f15059OooO00o) {
            case 0:
                return new oOOo0000(parcel, null);
            case 1:
                return new o0ooOOo(parcel, (ClassLoader) null);
            case 2:
                return new oo000000(parcel, null);
            case 3:
                return new OooOO0O(parcel, null);
            case 4:
                return new o0OO00O(parcel, null);
            case 5:
                return new OooOo00(parcel, null);
            case 6:
                return new o0OoOo0(parcel, null);
            case 7:
                return new OooO0o(parcel, null);
            default:
                return new o0OOO0o(parcel, null);
        }
    }
}
