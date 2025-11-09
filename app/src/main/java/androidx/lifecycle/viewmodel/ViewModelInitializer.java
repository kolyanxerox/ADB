package androidx.lifecycle.viewmodel;

import androidx.lifecycle.ViewModel;
import kotlin.jvm.internal.OooOo;
import kotlin.jvm.internal.o0OO00O;
import o00O0Oo.Oooo000;
import o00O0o0o.o0ooOOo;

/* loaded from: classes.dex */
public final class ViewModelInitializer<T extends ViewModel> {
    private final o0ooOOo clazz;
    private final Oooo000 initializer;

    public ViewModelInitializer(o0ooOOo clazz, Oooo000 initializer) {
        OooOo.OooO0o0(clazz, "clazz");
        OooOo.OooO0o0(initializer, "initializer");
        this.clazz = clazz;
        this.initializer = initializer;
    }

    public final o0ooOOo getClazz$lifecycle_viewmodel_release() {
        return this.clazz;
    }

    public final Oooo000 getInitializer$lifecycle_viewmodel_release() {
        return this.initializer;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ViewModelInitializer(Class<T> clazz, Oooo000 initializer) {
        this(o0OO00O.OooO00o(clazz), initializer);
        OooOo.OooO0o0(clazz, "clazz");
        OooOo.OooO0o0(initializer, "initializer");
    }
}
