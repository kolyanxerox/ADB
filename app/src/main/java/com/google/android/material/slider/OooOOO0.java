package com.google.android.material.slider;

import OoooOoo.oOO0OoO0;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;

/* loaded from: classes2.dex */
public final class OooOOO0 extends AbsSavedState {
    public static final Parcelable.Creator<OooOOO0> CREATOR = new oOO0OoO0(6);
    private float minSeparation;
    private int separationUnit;

    public OooOOO0(OooOO0 oooOO0) {
        super(oooOO0);
    }

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeFloat(this.minSeparation);
        parcel.writeInt(this.separationUnit);
    }

    public OooOOO0(Parcel parcel) {
        super(parcel.readParcelable(OooOOO0.class.getClassLoader()));
        this.minSeparation = parcel.readFloat();
        this.separationUnit = parcel.readInt();
    }
}
