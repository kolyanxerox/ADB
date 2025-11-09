package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.kv */
/* loaded from: classes2.dex */
public final class C1766kv extends p11 implements InterfaceC1746kb {

    /* renamed from: OooOo, reason: collision with root package name */
    public final Bundle f20689OooOo;

    public C1766kv(Set set) {
        super(set);
        this.f20689OooOo = new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1746kb
    public final synchronized void OoooO0O(Bundle bundle, String str) {
        this.f20689OooOo.putAll(bundle);
        o0000Ooo(new C1582fv(1));
    }
}
