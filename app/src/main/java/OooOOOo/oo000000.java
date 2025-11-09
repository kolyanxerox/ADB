package OoooooO;

import OooooOo.oOOOOo0O;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.customview.view.AbsSavedState;

/* loaded from: classes2.dex */
public final class oo000000 extends AbsSavedState {
    public static final Parcelable.Creator<oo000000> CREATOR = new oOOOOo0O(2);

    /* renamed from: OooOo0O, reason: collision with root package name */
    public boolean f15127OooOo0O;

    public oo000000(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        if (classLoader == null) {
            oo000000.class.getClassLoader();
        }
        this.f15127OooOo0O = parcel.readInt() == 1;
    }

    @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f15127OooOo0O ? 1 : 0);
    }
}
