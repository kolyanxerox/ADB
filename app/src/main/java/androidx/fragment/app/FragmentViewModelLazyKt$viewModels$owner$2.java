package androidx.fragment.app;

import androidx.lifecycle.ViewModelStoreOwner;
import kotlin.jvm.internal.Oooo000;

/* loaded from: classes.dex */
public final class FragmentViewModelLazyKt$viewModels$owner$2 extends Oooo000 implements o00O0Oo.OooO0O0 {
    final /* synthetic */ o00O0Oo.OooO0O0 $ownerProducer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentViewModelLazyKt$viewModels$owner$2(o00O0Oo.OooO0O0 oooO0O0) {
        super(0);
        this.$ownerProducer = oooO0O0;
    }

    @Override // o00O0Oo.OooO0O0
    public final ViewModelStoreOwner invoke() {
        return (ViewModelStoreOwner) this.$ownerProducer.invoke();
    }
}
