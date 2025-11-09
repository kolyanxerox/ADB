package com.google.android.material.timepicker;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;

/* loaded from: classes2.dex */
public final class OooOOO implements View.OnTouchListener {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ GestureDetector f27977OooOo0O;

    public OooOOO(GestureDetector gestureDetector) {
        this.f27977OooOo0O = gestureDetector;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (((Checkable) view).isChecked()) {
            return this.f27977OooOo0O.onTouchEvent(motionEvent);
        }
        return false;
    }
}
