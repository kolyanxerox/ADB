package androidx.fragment.app;

import android.os.Bundle;
import androidx.savedstate.SavedStateRegistry;

/* loaded from: classes.dex */
public final /* synthetic */ class OooO implements SavedStateRegistry.SavedStateProvider {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f15279OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Object f15280OooO0O0;

    public /* synthetic */ OooO(Object obj, int i) {
        this.f15279OooO00o = i;
        this.f15280OooO0O0 = obj;
    }

    @Override // androidx.savedstate.SavedStateRegistry.SavedStateProvider
    public final Bundle saveState() {
        switch (this.f15279OooO00o) {
            case 0:
                return ((FragmentActivity) this.f15280OooO0O0).lambda$init$0();
            default:
                return ((FragmentManager) this.f15280OooO0O0).lambda$attachController$4();
        }
    }
}
