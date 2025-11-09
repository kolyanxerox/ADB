package com.unity3d.ads.core.data.repository;

import gatewayprotocol.p014v1.DiagnosticEventRequestOuterClass;
import kotlin.jvm.internal.OooOo;
import kotlin.jvm.internal.Oooo000;

/* loaded from: classes3.dex */
public final class AndroidDiagnosticEventRepository$flush$events$4 extends Oooo000 implements o00O0Oo.Oooo000 {
    final /* synthetic */ AndroidDiagnosticEventRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidDiagnosticEventRepository$flush$events$4(AndroidDiagnosticEventRepository androidDiagnosticEventRepository) {
        super(1);
        this.this$0 = androidDiagnosticEventRepository;
    }

    @Override // o00O0Oo.Oooo000
    public final Boolean invoke(DiagnosticEventRequestOuterClass.DiagnosticEvent it) {
        OooOo.OooO0o0(it, "it");
        return Boolean.valueOf(!this.this$0.blockedEvents.contains(it.getEventType()));
    }
}
