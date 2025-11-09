package androidx.datastore.core;

import o00O0OO0.OooO;
import o00O0OO0.OooO0OO;

@OooO(m13471c = "androidx.datastore.core.DataStoreImpl$InitDataStore", m13472f = "DataStoreImpl.kt", m13473l = {430, 434}, m13474m = "doRun")
/* loaded from: classes.dex */
public final class DataStoreImpl$InitDataStore$doRun$1 extends OooO0OO {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DataStoreImpl<T>.InitDataStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataStoreImpl$InitDataStore$doRun$1(DataStoreImpl<T>.InitDataStore initDataStore, o00O0O0O.OooO0OO oooO0OO) {
        super(oooO0OO);
        this.this$0 = initDataStore;
    }

    @Override // o00O0OO0.OooO00o
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.doRun(this);
    }
}
