package com.unity3d.services.core.network.core;

import kotlin.jvm.internal.Oooo000;
import oo00o.OooOo;
import org.chromium.net.UrlRequest;

/* loaded from: classes3.dex */
public final class CronetClient$execute$2$2 extends Oooo000 implements o00O0Oo.Oooo000 {
    final /* synthetic */ UrlRequest $req;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CronetClient$execute$2$2(UrlRequest urlRequest) {
        super(1);
        this.$req = urlRequest;
    }

    @Override // o00O0Oo.Oooo000
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return OooOo.f33195OooO00o;
    }

    public final void invoke(Throwable th) {
        this.$req.cancel();
    }
}
