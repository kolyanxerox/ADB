package androidx.datastore.core;

import kotlin.jvm.internal.Oooo000;
import o00O0Oo.OooO0O0;

/* loaded from: classes.dex */
public final class DataStoreImpl$coordinator$2 extends Oooo000 implements OooO0O0 {
    final /* synthetic */ DataStoreImpl<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataStoreImpl$coordinator$2(DataStoreImpl<T> dataStoreImpl) {
        super(0);
        this.this$0 = dataStoreImpl;
    }

    @Override // o00O0Oo.OooO0O0
    public final InterProcessCoordinator invoke() {
        return this.this$0.getStorageConnection$datastore_core_release().getCoordinator();
    }
}
