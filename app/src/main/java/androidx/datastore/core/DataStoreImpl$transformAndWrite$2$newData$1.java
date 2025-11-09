package androidx.datastore.core;

import o00O0.o000OOo;
import o00O0O0O.OooO0OO;
import o00O0O0o.OooOo00;
import o00O0OO0.OooO;
import o00O0OO0.OooOOOO;
import o00O0Oo.o00O0O;
import o00O0oOo.o000OO;
import oo00o.OooOo;

@OooO(m13471c = "androidx.datastore.core.DataStoreImpl$transformAndWrite$2$newData$1", m13472f = "DataStoreImpl.kt", m13473l = {331}, m13474m = "invokeSuspend")
/* loaded from: classes.dex */
public final class DataStoreImpl$transformAndWrite$2$newData$1 extends OooOOOO implements o00O0O {
    final /* synthetic */ Data<T> $curData;
    final /* synthetic */ o00O0O $transform;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataStoreImpl$transformAndWrite$2$newData$1(o00O0O o00o0o, Data<T> data, OooO0OO oooO0OO) {
        super(2, oooO0OO);
        this.$transform = o00o0o;
        this.$curData = data;
    }

    @Override // o00O0OO0.OooO00o
    public final OooO0OO create(Object obj, OooO0OO oooO0OO) {
        return new DataStoreImpl$transformAndWrite$2$newData$1(this.$transform, this.$curData, oooO0OO);
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
        o00O0O o00o0o = this.$transform;
        Object value = this.$curData.getValue();
        this.label = 1;
        Object objInvoke = o00o0o.invoke(value, this);
        return objInvoke == oooOo00 ? oooOo00 : objInvoke;
    }

    @Override // o00O0Oo.o00O0O
    public final Object invoke(o000OO o000oo2, OooO0OO oooO0OO) {
        return ((DataStoreImpl$transformAndWrite$2$newData$1) create(o000oo2, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
    }
}
