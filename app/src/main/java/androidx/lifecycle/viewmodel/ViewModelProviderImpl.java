package androidx.lifecycle.viewmodel;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.internal.ViewModelProviders;
import kotlin.jvm.internal.OooOO0;
import kotlin.jvm.internal.OooOo;
import o00O0o0o.o0ooOOo;

/* loaded from: classes.dex */
public final class ViewModelProviderImpl {
    private final CreationExtras extras;
    private final ViewModelProvider.Factory factory;
    private final ViewModelStore store;

    public ViewModelProviderImpl(ViewModelStore store, ViewModelProvider.Factory factory, CreationExtras extras) {
        OooOo.OooO0o0(store, "store");
        OooOo.OooO0o0(factory, "factory");
        OooOo.OooO0o0(extras, "extras");
        this.store = store;
        this.factory = factory;
        this.extras = extras;
    }

    public static /* synthetic */ ViewModel getViewModel$lifecycle_viewmodel_release$default(ViewModelProviderImpl viewModelProviderImpl, o0ooOOo o0ooooo, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = ViewModelProviders.INSTANCE.getDefaultKey$lifecycle_viewmodel_release(o0ooooo);
        }
        return viewModelProviderImpl.getViewModel$lifecycle_viewmodel_release(o0ooooo, str);
    }

    public final <T extends ViewModel> T getViewModel$lifecycle_viewmodel_release(o0ooOOo modelClass, String key) {
        OooOo.OooO0o0(modelClass, "modelClass");
        OooOo.OooO0o0(key, "key");
        T t = (T) this.store.get(key);
        if (!((OooOO0) modelClass).OooO0Oo(t)) {
            MutableCreationExtras mutableCreationExtras = new MutableCreationExtras(this.extras);
            mutableCreationExtras.set(ViewModelProviders.ViewModelKey.INSTANCE, key);
            T t2 = (T) ViewModelProviderImpl_androidKt.createViewModel(this.factory, modelClass, mutableCreationExtras);
            this.store.put(key, t2);
            return t2;
        }
        Object obj = this.factory;
        if (obj instanceof ViewModelProvider.OnRequeryFactory) {
            OooOo.OooO0O0(t);
            ((ViewModelProvider.OnRequeryFactory) obj).onRequery(t);
        }
        OooOo.OooO0OO(t, "null cannot be cast to non-null type T of androidx.lifecycle.viewmodel.ViewModelProviderImpl.getViewModel");
        return t;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ViewModelProviderImpl(ViewModelStoreOwner owner, ViewModelProvider.Factory factory, CreationExtras extras) {
        this(owner.getViewModelStore(), factory, extras);
        OooOo.OooO0o0(owner, "owner");
        OooOo.OooO0o0(factory, "factory");
        OooOo.OooO0o0(extras, "extras");
    }
}
