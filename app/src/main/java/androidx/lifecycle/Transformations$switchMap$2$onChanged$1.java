package androidx.lifecycle;

import kotlin.jvm.internal.Oooo000;
import oo00o.OooOo;

/* loaded from: classes.dex */
public final class Transformations$switchMap$2$onChanged$1 extends Oooo000 implements o00O0Oo.Oooo000 {
    final /* synthetic */ MediatorLiveData $result;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Transformations$switchMap$2$onChanged$1(MediatorLiveData mediatorLiveData) {
        super(1);
        this.$result = mediatorLiveData;
    }

    @Override // o00O0Oo.Oooo000
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m13533invoke(obj);
        return OooOo.f33195OooO00o;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m13533invoke(Object obj) {
        this.$result.setValue(obj);
    }
}
