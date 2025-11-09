package androidx.lifecycle;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.OooOo;
import o00O0oOo.o0000OO0;
import o00O0oOo.o000O0O0;
import o00O0oOo.o00OOO0;
import o00O0ooo.o0O0000O;
import o00O0ooo.o0OoOoOo;
import o00O0ooo.o0o0000;
import o00OO000.Oooo0;

/* loaded from: classes.dex */
public final class LifecycleKt {
    public static final LifecycleCoroutineScope getCoroutineScope(Lifecycle lifecycle) {
        OooOo.OooO0o0(lifecycle, "<this>");
        while (true) {
            LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl = (LifecycleCoroutineScopeImpl) lifecycle.getInternalScopeRef().get();
            if (lifecycleCoroutineScopeImpl != null) {
                return lifecycleCoroutineScopeImpl;
            }
            o00OOO0 o00ooo0OooO0o0 = o0000OO0.OooO0o0();
            o00OO00o.OooO oooO = o000O0O0.f31514OooO00o;
            LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl2 = new LifecycleCoroutineScopeImpl(lifecycle, OooO00o.OooO00o.OooOo00(o00ooo0OooO0o0, Oooo0.f31951OooO00o.f31652OooOo));
            AtomicReference<Object> internalScopeRef = lifecycle.getInternalScopeRef();
            while (!internalScopeRef.compareAndSet(null, lifecycleCoroutineScopeImpl2)) {
                if (internalScopeRef.get() != null) {
                    break;
                }
            }
            lifecycleCoroutineScopeImpl2.register();
            return lifecycleCoroutineScopeImpl2;
        }
    }

    public static final o0OoOoOo getEventFlow(Lifecycle lifecycle) {
        OooOo.OooO0o0(lifecycle, "<this>");
        o0O0000O o0o0000oOooO0oo = o0o0000.OooO0oo(new LifecycleKt$eventFlow$1(lifecycle, null));
        o00OO00o.OooO oooO = o000O0O0.f31514OooO00o;
        return o0o0000.OooOOOO(o0o0000oOooO0oo, Oooo0.f31951OooO00o.f31652OooOo);
    }
}
