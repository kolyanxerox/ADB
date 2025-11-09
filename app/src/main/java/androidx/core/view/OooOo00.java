package androidx.core.view;

import android.view.ViewConfiguration;
import androidx.core.util.Supplier;

/* loaded from: classes.dex */
public final /* synthetic */ class OooOo00 implements Supplier {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f15260OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ ViewConfiguration f15261OooO0O0;

    public /* synthetic */ OooOo00(ViewConfiguration viewConfiguration, int i) {
        this.f15260OooO00o = i;
        this.f15261OooO0O0 = viewConfiguration;
    }

    @Override // androidx.core.util.Supplier
    public final Object get() {
        switch (this.f15260OooO00o) {
            case 0:
                return Integer.valueOf(this.f15261OooO0O0.getScaledMaximumFlingVelocity());
            default:
                return Integer.valueOf(this.f15261OooO0O0.getScaledMinimumFlingVelocity());
        }
    }
}
