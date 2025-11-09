package com.unity3d.services.core.p012di;

import com.unity3d.ads.core.data.repository.DiagnosticEventRepository;
import kotlin.jvm.internal.Oooo000;
import oo00o.OooOo;

/* loaded from: classes3.dex */
public final class UnityAdsModule$publicApiJob$1$1 extends Oooo000 implements o00O0Oo.Oooo000 {
    final /* synthetic */ DiagnosticEventRepository $diagnosticEventRepository;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnityAdsModule$publicApiJob$1$1(DiagnosticEventRepository diagnosticEventRepository) {
        super(1);
        this.$diagnosticEventRepository = diagnosticEventRepository;
    }

    @Override // o00O0Oo.Oooo000
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return OooOo.f33195OooO00o;
    }

    public final void invoke(Throwable th) {
        this.$diagnosticEventRepository.flush();
    }
}
