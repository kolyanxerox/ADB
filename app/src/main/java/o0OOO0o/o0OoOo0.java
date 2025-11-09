package o0OOO0o;

import OooooOo.oOOOOo0O;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.customview.view.AbsSavedState;

/* loaded from: classes2.dex */
public final class o0OoOo0 extends AbsSavedState {
    public static final Parcelable.Creator<o0OoOo0> CREATOR = new oOOOOo0O(6);

    @Nullable
    public Bundle menuState;

    public o0OoOo0(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.menuState = parcel.readBundle(classLoader);
    }

    @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeBundle(this.menuState);
    }
}
