package o000o0O;

import java.util.concurrent.atomic.AtomicReference;
import o00O0O0O.OooO0OO;
import o00O0ooo.o0O000Oo;
import oo00o.OooO00o;

/* loaded from: classes2.dex */
public final /* synthetic */ class o00oO0o implements o0O000Oo, kotlin.jvm.internal.OooOOO0 {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f30936OooOo0O;

    public o00oO0o(AtomicReference atomicReference) {
        this.f30936OooOo0O = atomicReference;
    }

    @Override // o00O0ooo.o0O000Oo
    public final Object emit(Object obj, OooO0OO oooO0OO) {
        this.f30936OooOo0O.set((o00O0O) obj);
        oo00o.OooOo oooOo = oo00o.OooOo.f33195OooO00o;
        o00O0O0o.OooOo00 oooOo00 = o00O0O0o.OooOo00.f31365OooOo0O;
        return oooOo;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof o0O000Oo) && (obj instanceof kotlin.jvm.internal.OooOOO0)) {
            return kotlin.jvm.internal.OooOo.OooO00o(getFunctionDelegate(), ((kotlin.jvm.internal.OooOOO0) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.OooOOO0
    public final OooO00o getFunctionDelegate() {
        return new kotlin.jvm.internal.OooO00o(2, this.f30936OooOo0O, AtomicReference.class, "set", "set(Ljava/lang/Object;)V", 4);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
