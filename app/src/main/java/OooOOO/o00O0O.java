package Oooooo;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* loaded from: classes2.dex */
public final class o00O0O implements Runnable {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ BottomSheetBehavior f15073OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ View f15074OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f15075OooOo0o;

    public o00O0O(BottomSheetBehavior bottomSheetBehavior, View view, int i) {
        this.f15073OooOo = bottomSheetBehavior;
        this.f15074OooOo0O = view;
        this.f15075OooOo0o = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f15073OooOo.OooOO0o(this.f15074OooOo0O, this.f15075OooOo0o, false);
    }
}
