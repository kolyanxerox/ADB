package com.ironsource;

import androidx.lifecycle.ProcessLifecycleOwner;

/* renamed from: com.ironsource.tc */
/* loaded from: classes2.dex */
public final class C3694tc implements InterfaceC3006cg {
    @Override // com.ironsource.InterfaceC3006cg
    /* renamed from: a */
    public boolean mo8126a() {
        try {
            ProcessLifecycleOwner.Companion.get();
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
