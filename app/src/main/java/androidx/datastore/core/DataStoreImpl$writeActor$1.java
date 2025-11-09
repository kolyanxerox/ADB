package androidx.datastore.core;

import kotlin.jvm.internal.Oooo000;
import oo00o.OooOo;

/* loaded from: classes.dex */
public final class DataStoreImpl$writeActor$1 extends Oooo000 implements o00O0Oo.Oooo000 {
    final /* synthetic */ DataStoreImpl<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataStoreImpl$writeActor$1(DataStoreImpl<T> dataStoreImpl) {
        super(1);
        this.this$0 = dataStoreImpl;
    }

    @Override // o00O0Oo.Oooo000
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return OooOo.f33195OooO00o;
    }

    public final void invoke(Throwable th) {
        if (th != null) {
            ((DataStoreImpl) this.this$0).inMemoryCache.tryUpdate(new Final(th));
        }
        if (((DataStoreImpl) this.this$0).storageConnectionDelegate.isInitialized()) {
            this.this$0.getStorageConnection$datastore_core_release().close();
        }
    }
}
