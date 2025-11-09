package com.unity3d.ads.core.data.repository;

import o00O0.o000OOo;
import o00O0O0O.OooO0OO;
import o00O0O0o.OooOo00;
import o00O0OO0.OooO;
import o00O0OO0.OooOOOO;
import o00O0Oo.o00O0O;
import o00O0oOo.o000OO;
import o00O0ooo.o0OoOoOo;
import o00O0ooo.o0o0000;
import oo00o.OooOo;

@OooO(m13471c = "com.unity3d.ads.core.data.repository.AndroidSessionRepository$nativeConfiguration$1", m13472f = "AndroidSessionRepository.kt", m13473l = {175}, m13474m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class AndroidSessionRepository$nativeConfiguration$1 extends OooOOOO implements o00O0O {
    int label;
    final /* synthetic */ AndroidSessionRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidSessionRepository$nativeConfiguration$1(AndroidSessionRepository androidSessionRepository, OooO0OO oooO0OO) {
        super(2, oooO0OO);
        this.this$0 = androidSessionRepository;
    }

    @Override // o00O0OO0.OooO00o
    public final OooO0OO create(Object obj, OooO0OO oooO0OO) {
        return new AndroidSessionRepository$nativeConfiguration$1(this.this$0, oooO0OO);
    }

    @Override // o00O0OO0.OooO00o
    public final Object invokeSuspend(Object obj) {
        OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o000OOo.OooOO0O(obj);
            return obj;
        }
        o000OOo.OooOO0O(obj);
        o0OoOoOo o0oooooo = this.this$0.persistedNativeConfiguration;
        this.label = 1;
        Object objOooOO0o = o0o0000.OooOO0o(o0oooooo, this);
        return objOooOO0o == oooOo00 ? oooOo00 : objOooOO0o;
    }

    @Override // o00O0Oo.o00O0O
    public final Object invoke(o000OO o000oo2, OooO0OO oooO0OO) {
        return ((AndroidSessionRepository$nativeConfiguration$1) create(o000oo2, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
    }
}
