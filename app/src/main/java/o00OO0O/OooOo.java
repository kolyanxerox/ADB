package o00oO0o;

import android.view.ViewGroup;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;

/* loaded from: classes2.dex */
public final class OooOo {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f32708OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ ExtendedFloatingActionButton f32709OooO0O0;

    public /* synthetic */ OooOo(ExtendedFloatingActionButton extendedFloatingActionButton, int i) {
        this.f32708OooO00o = i;
        this.f32709OooO0O0 = extendedFloatingActionButton;
    }

    public final ViewGroup.LayoutParams OooO00o() {
        switch (this.f32708OooO00o) {
            case 0:
                return new ViewGroup.LayoutParams(-2, -2);
            default:
                ExtendedFloatingActionButton extendedFloatingActionButton = this.f32709OooO0O0;
                return new ViewGroup.LayoutParams(extendedFloatingActionButton.getCollapsedSize(), extendedFloatingActionButton.getCollapsedSize());
        }
    }

    public final int OooO0O0() {
        switch (this.f32708OooO00o) {
            case 0:
                return this.f32709OooO0O0.f27629OoooO0;
            default:
                return this.f32709OooO0O0.getCollapsedPadding();
        }
    }

    public final int OooO0OO() {
        switch (this.f32708OooO00o) {
            case 0:
                return this.f32709OooO0O0.f27630OoooO00;
            default:
                return this.f32709OooO0O0.getCollapsedPadding();
        }
    }
}
