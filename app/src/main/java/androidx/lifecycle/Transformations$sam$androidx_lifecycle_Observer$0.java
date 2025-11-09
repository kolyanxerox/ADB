package androidx.lifecycle;

import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOo;
import o00O0Oo.Oooo000;

/* loaded from: classes.dex */
public final class Transformations$sam$androidx_lifecycle_Observer$0 implements Observer, OooOOO0 {
    private final /* synthetic */ Oooo000 function;

    public Transformations$sam$androidx_lifecycle_Observer$0(Oooo000 function) {
        OooOo.OooO0o0(function, "function");
        this.function = function;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof Observer) && (obj instanceof OooOOO0)) {
            return OooOo.OooO00o(getFunctionDelegate(), ((OooOOO0) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.OooOOO0
    public final oo00o.OooO00o getFunctionDelegate() {
        return this.function;
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // androidx.lifecycle.Observer
    public final /* synthetic */ void onChanged(Object obj) {
        this.function.invoke(obj);
    }
}
