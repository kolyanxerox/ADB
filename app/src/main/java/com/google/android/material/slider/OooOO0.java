package com.google.android.material.slider;

import OoooOoo.oOO0OoO0;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class OooOO0 extends View.BaseSavedState {
    public static final Parcelable.Creator<OooOO0> CREATOR = new oOO0OoO0(5);

    /* renamed from: OooOo, reason: collision with root package name */
    public ArrayList f27806OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public float f27807OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public float f27808OooOo0o;

    /* renamed from: OooOoO, reason: collision with root package name */
    public boolean f27809OooOoO;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public float f27810OooOoO0;

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeFloat(this.f27807OooOo0O);
        parcel.writeFloat(this.f27808OooOo0o);
        parcel.writeList(this.f27806OooOo);
        parcel.writeFloat(this.f27810OooOoO0);
        parcel.writeBooleanArray(new boolean[]{this.f27809OooOoO});
    }
}
