package androidx.datastore.core;

import kotlin.jvm.internal.Oooo000;
import o00O0Oo.OooO0O0;

/* loaded from: classes.dex */
public final class DataStoreImpl$storageConnectionDelegate$1 extends Oooo000 implements OooO0O0 {
    final /* synthetic */ DataStoreImpl<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataStoreImpl$storageConnectionDelegate$1(DataStoreImpl<T> dataStoreImpl) {
        super(0);
        this.this$0 = dataStoreImpl;
    }

    @Override // o00O0Oo.OooO0O0
    public final StorageConnection<T> invoke() {
        return ((DataStoreImpl) this.this$0).storage.createConnection();
    }
}
