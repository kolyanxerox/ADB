package com.unity3d.ads.adplayer;

import kotlin.jvm.internal.OooOo;
import o00O0O0O.OooOOO0;
import o00O0oOo.o0000O00;
import o00O0oOo.o0000OO0;
import o00O0oOo.o000OO;

/* loaded from: classes2.dex */
public final class AdPlayerScope implements o000OO {
    private final /* synthetic */ o000OO $$delegate_0;
    private final o0000O00 defaultDispatcher;

    public AdPlayerScope(o0000O00 defaultDispatcher) {
        OooOo.OooO0o0(defaultDispatcher, "defaultDispatcher");
        this.defaultDispatcher = defaultDispatcher;
        this.$$delegate_0 = o0000OO0.OooO0O0(defaultDispatcher);
    }

    @Override // o00O0oOo.o000OO
    public OooOOO0 getCoroutineContext() {
        return this.$$delegate_0.getCoroutineContext();
    }
}
