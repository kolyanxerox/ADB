package androidx.lifecycle.viewmodel;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import kotlin.jvm.internal.OooOo;
import o00O0o0o.o0ooOOo;
import o00Oo0oo.o00oO0o;

/* loaded from: classes.dex */
public final class ViewModelProviderImpl_androidKt {
    public static final <VM extends ViewModel> VM createViewModel(ViewModelProvider.Factory factory, o0ooOOo modelClass, CreationExtras extras) {
        OooOo.OooO0o0(factory, "factory");
        OooOo.OooO0o0(modelClass, "modelClass");
        OooOo.OooO0o0(extras, "extras");
        try {
            try {
                return (VM) factory.create(modelClass, extras);
            } catch (AbstractMethodError unused) {
                return (VM) factory.create(o00oO0o.OooO0oO(modelClass), extras);
            }
        } catch (AbstractMethodError unused2) {
            return (VM) factory.create(o00oO0o.OooO0oO(modelClass));
        }
    }
}
