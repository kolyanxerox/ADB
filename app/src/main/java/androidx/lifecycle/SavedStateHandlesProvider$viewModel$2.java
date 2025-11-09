package androidx.lifecycle;

import kotlin.jvm.internal.Oooo000;

/* loaded from: classes.dex */
public final class SavedStateHandlesProvider$viewModel$2 extends Oooo000 implements o00O0Oo.OooO0O0 {
    final /* synthetic */ ViewModelStoreOwner $viewModelStoreOwner;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SavedStateHandlesProvider$viewModel$2(ViewModelStoreOwner viewModelStoreOwner) {
        super(0);
        this.$viewModelStoreOwner = viewModelStoreOwner;
    }

    @Override // o00O0Oo.OooO0O0
    public final SavedStateHandlesVM invoke() {
        return SavedStateHandleSupport.getSavedStateHandlesVM(this.$viewModelStoreOwner);
    }
}
