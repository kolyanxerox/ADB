package androidx.lifecycle.viewmodel.internal;

import kotlin.jvm.internal.OooOo;
import o00O0O0O.OooOOO0;
import o00O0oOo.o000OO;
import o00O0oOo.o00O0;
import o00O0oOo.o00O0O00;

/* loaded from: classes.dex */
public final class CloseableCoroutineScope implements AutoCloseable, o000OO {
    private final OooOOO0 coroutineContext;

    public CloseableCoroutineScope(OooOOO0 coroutineContext) {
        OooOo.OooO0o0(coroutineContext, "coroutineContext");
        this.coroutineContext = coroutineContext;
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        o00O0O00 o00o0o00 = (o00O0O00) getCoroutineContext().get(o00O0.f31523OooOo0O);
        if (o00o0o00 != null) {
            o00o0o00.OooO00o(null);
        }
    }

    @Override // o00O0oOo.o000OO
    public OooOOO0 getCoroutineContext() {
        return this.coroutineContext;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CloseableCoroutineScope(o000OO coroutineScope) {
        this(coroutineScope.getCoroutineContext());
        OooOo.OooO0o0(coroutineScope, "coroutineScope");
    }
}
