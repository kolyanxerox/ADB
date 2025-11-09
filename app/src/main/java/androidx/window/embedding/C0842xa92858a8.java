package androidx.window.embedding;

import android.content.Context;
import android.view.WindowMetrics;
import androidx.core.view.Oooo0;
import kotlin.jvm.internal.OooOo;
import kotlin.jvm.internal.Oooo000;

/* renamed from: androidx.window.embedding.EmbeddingAdapter$VendorApiLevel1Impl$translateParentMetricsPredicate$1 */
/* loaded from: classes.dex */
public final class C0842xa92858a8 extends Oooo000 implements o00O0Oo.Oooo000 {
    final /* synthetic */ Context $context;
    final /* synthetic */ SplitRule $splitRule;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0842xa92858a8(SplitRule splitRule, Context context) {
        super(1);
        this.$splitRule = splitRule;
        this.$context = context;
    }

    @Override // o00O0Oo.Oooo000
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(Oooo0.OooO0oo(obj));
    }

    public final Boolean invoke(WindowMetrics windowMetrics) {
        OooOo.OooO0o0(windowMetrics, "windowMetrics");
        return Boolean.valueOf(this.$splitRule.checkParentMetrics$window_release(this.$context, windowMetrics));
    }
}
