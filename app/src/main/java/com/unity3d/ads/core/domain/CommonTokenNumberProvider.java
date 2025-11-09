package com.unity3d.ads.core.domain;

import com.google.android.gms.internal.measurement.o0OOO0;
import com.unity3d.ads.core.data.repository.SessionRepository;
import kotlin.jvm.internal.OooOo;
import oo00o.OooO0OO;

/* loaded from: classes3.dex */
public final class CommonTokenNumberProvider implements TokenNumberProvider {
    private final OooO0OO number$delegate;

    public CommonTokenNumberProvider(SessionRepository sessionRepository) {
        OooOo.OooO0o0(sessionRepository, "sessionRepository");
        this.number$delegate = o0OOO0.OooO0oo(new CommonTokenNumberProvider$number$2(sessionRepository));
    }

    private final int getNumber() {
        return ((Number) this.number$delegate.getValue()).intValue();
    }

    @Override // com.unity3d.ads.core.domain.TokenNumberProvider
    public int invoke() {
        return getNumber();
    }
}
