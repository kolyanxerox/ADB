package com.applovin.shadow.okhttp3;

import java.security.cert.Certificate;
import java.util.List;
import kotlin.jvm.internal.Oooo000;
import o00O0Oo.OooO0O0;

/* loaded from: classes.dex */
public final class Handshake$Companion$get$1 extends Oooo000 implements OooO0O0 {
    final /* synthetic */ List<Certificate> $peerCertificatesCopy;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public Handshake$Companion$get$1(List<? extends Certificate> list) {
        super(0);
        this.$peerCertificatesCopy = list;
    }

    @Override // o00O0Oo.OooO0O0
    public final List<Certificate> invoke() {
        return this.$peerCertificatesCopy;
    }
}
