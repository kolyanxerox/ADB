package androidx.window.embedding;

import android.os.Build;
import androidx.window.embedding.ExtensionEmbeddingBackend;
import androidx.window.embedding.SplitController;
import kotlin.jvm.internal.Oooo000;

/* loaded from: classes.dex */
public final class ExtensionEmbeddingBackend$splitSupportStatus$2 extends Oooo000 implements o00O0Oo.OooO0O0 {
    final /* synthetic */ ExtensionEmbeddingBackend this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExtensionEmbeddingBackend$splitSupportStatus$2(ExtensionEmbeddingBackend extensionEmbeddingBackend) {
        super(0);
        this.this$0 = extensionEmbeddingBackend;
    }

    @Override // o00O0Oo.OooO0O0
    public final SplitController.SplitSupportStatus invoke() {
        return !this.this$0.areExtensionsAvailable() ? SplitController.SplitSupportStatus.SPLIT_UNAVAILABLE : Build.VERSION.SDK_INT >= 31 ? ExtensionEmbeddingBackend.Api31Impl.INSTANCE.isSplitPropertyEnabled(this.this$0.applicationContext) : SplitController.SplitSupportStatus.SPLIT_AVAILABLE;
    }
}
