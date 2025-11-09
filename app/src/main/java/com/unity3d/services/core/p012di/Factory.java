package com.unity3d.services.core.p012di;

import kotlin.jvm.internal.OooOo;
import o00O0Oo.OooO0O0;
import oo00o.OooO0OO;

/* loaded from: classes3.dex */
final class Factory<T> implements OooO0OO {
    private final OooO0O0 initializer;

    public Factory(OooO0O0 initializer) {
        OooOo.OooO0o0(initializer, "initializer");
        this.initializer = initializer;
    }

    @Override // oo00o.OooO0OO
    public T getValue() {
        return (T) this.initializer.invoke();
    }

    @Override // oo00o.OooO0OO
    public boolean isInitialized() {
        return false;
    }
}
