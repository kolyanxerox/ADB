package o0OoOo0;

import OooO0oO.OooOo;
import OoooOoo.oOO0OoO0;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.annotation.NonNull;

/* loaded from: classes2.dex */
public final class OooO0O0 extends View.BaseSavedState {

    @NonNull
    public static final Parcelable.Creator<OooO0O0> CREATOR = new oOO0OoO0(8);

    /* renamed from: OooOo0O, reason: collision with root package name */
    public int f32997OooOo0O;

    public final String toString() {
        StringBuilder sb = new StringBuilder("MaterialCheckBox.SavedState{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" CheckedState=");
        int i = this.f32997OooOo0O;
        return OooOo.OooOOOo(sb, i != 1 ? i != 2 ? "unchecked" : "indeterminate" : "checked", "}");
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeValue(Integer.valueOf(this.f32997OooOo0O));
    }
}
