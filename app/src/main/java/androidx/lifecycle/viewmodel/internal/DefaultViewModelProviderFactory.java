package androidx.lifecycle.viewmodel.internal;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import kotlin.jvm.internal.OooOo;
import o00O0o0o.o0ooOOo;
import o00Oo0oo.o00oO0o;

/* loaded from: classes.dex */
public final class DefaultViewModelProviderFactory implements ViewModelProvider.Factory {
    public static final DefaultViewModelProviderFactory INSTANCE = new DefaultViewModelProviderFactory();

    private DefaultViewModelProviderFactory() {
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public <T extends ViewModel> T create(o0ooOOo modelClass, CreationExtras extras) {
        OooOo.OooO0o0(modelClass, "modelClass");
        OooOo.OooO0o0(extras, "extras");
        return (T) JvmViewModelProviders.INSTANCE.createViewModel(o00oO0o.OooO0oO(modelClass));
    }
}
