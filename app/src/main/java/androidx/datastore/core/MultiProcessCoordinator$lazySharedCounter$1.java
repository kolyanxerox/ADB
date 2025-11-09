package androidx.datastore.core;

import androidx.datastore.core.SharedCounter;
import java.io.File;
import java.io.IOException;
import kotlin.jvm.internal.Oooo000;
import o00O0Oo.OooO0O0;

/* loaded from: classes.dex */
public final class MultiProcessCoordinator$lazySharedCounter$1 extends Oooo000 implements OooO0O0 {
    final /* synthetic */ MultiProcessCoordinator this$0;

    /* renamed from: androidx.datastore.core.MultiProcessCoordinator$lazySharedCounter$1$1 */
    public static final class C03141 extends Oooo000 implements OooO0O0 {
        final /* synthetic */ MultiProcessCoordinator this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C03141(MultiProcessCoordinator multiProcessCoordinator) {
            super(0);
            this.this$0 = multiProcessCoordinator;
        }

        @Override // o00O0Oo.OooO0O0
        public final File invoke() throws IOException {
            MultiProcessCoordinator multiProcessCoordinator = this.this$0;
            File fileFileWithSuffix = multiProcessCoordinator.fileWithSuffix(multiProcessCoordinator.VERSION_SUFFIX);
            this.this$0.createIfNotExists(fileFileWithSuffix);
            return fileFileWithSuffix;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiProcessCoordinator$lazySharedCounter$1(MultiProcessCoordinator multiProcessCoordinator) {
        super(0);
        this.this$0 = multiProcessCoordinator;
    }

    @Override // o00O0Oo.OooO0O0
    public final SharedCounter invoke() {
        SharedCounter.Factory factory = SharedCounter.Factory;
        factory.loadLib();
        return factory.create$datastore_core_release(new C03141(this.this$0));
    }
}
