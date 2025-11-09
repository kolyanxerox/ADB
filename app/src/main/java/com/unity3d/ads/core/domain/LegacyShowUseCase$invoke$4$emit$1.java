package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.model.ShowEvent;
import com.unity3d.ads.core.domain.LegacyShowUseCase;
import o00O0OO0.OooO;
import o00O0OO0.OooO0OO;

@OooO(m13471c = "com.unity3d.ads.core.domain.LegacyShowUseCase$invoke$4", m13472f = "LegacyShowUseCase.kt", m13473l = {186, 191}, m13474m = "emit")
/* loaded from: classes3.dex */
public final class LegacyShowUseCase$invoke$4$emit$1 extends OooO0OO {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ LegacyShowUseCase.C41144<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LegacyShowUseCase$invoke$4$emit$1(LegacyShowUseCase.C41144<? super T> c41144, o00O0O0O.OooO0OO oooO0OO) {
        super(oooO0OO);
        this.this$0 = c41144;
    }

    @Override // o00O0OO0.OooO00o
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit((ShowEvent) null, (o00O0O0O.OooO0OO) this);
    }
}
