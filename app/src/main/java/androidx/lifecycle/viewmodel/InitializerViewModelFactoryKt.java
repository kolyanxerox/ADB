package androidx.lifecycle.viewmodel;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import kotlin.jvm.internal.OooOo;
import o00O0Oo.Oooo000;

/* loaded from: classes.dex */
public final class InitializerViewModelFactoryKt {
    public static final <VM extends ViewModel> void initializer(InitializerViewModelFactoryBuilder initializerViewModelFactoryBuilder, Oooo000 initializer) {
        OooOo.OooO0o0(initializerViewModelFactoryBuilder, "<this>");
        OooOo.OooO0o0(initializer, "initializer");
        OooOo.OooOO0O();
        throw null;
    }

    public static final ViewModelProvider.Factory viewModelFactory(Oooo000 builder) {
        OooOo.OooO0o0(builder, "builder");
        InitializerViewModelFactoryBuilder initializerViewModelFactoryBuilder = new InitializerViewModelFactoryBuilder();
        builder.invoke(initializerViewModelFactoryBuilder);
        return initializerViewModelFactoryBuilder.build();
    }
}
