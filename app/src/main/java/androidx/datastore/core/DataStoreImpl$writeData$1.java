package androidx.datastore.core;

import o00O0OO0.OooO;
import o00O0OO0.OooO0OO;

@OooO(m13471c = "androidx.datastore.core.DataStoreImpl", m13472f = "DataStoreImpl.kt", m13473l = {348}, m13474m = "writeData$datastore_core_release")
/* loaded from: classes.dex */
public final class DataStoreImpl$writeData$1 extends OooO0OO {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DataStoreImpl<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataStoreImpl$writeData$1(DataStoreImpl<T> dataStoreImpl, o00O0O0O.OooO0OO oooO0OO) {
        super(oooO0OO);
        this.this$0 = dataStoreImpl;
    }

    @Override // o00O0OO0.OooO00o
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.writeData$datastore_core_release(null, false, this);
    }
}
