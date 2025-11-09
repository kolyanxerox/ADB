package androidx.window.embedding;

import android.content.Context;
import android.view.WindowMetrics;
import androidx.window.extensions.core.util.function.Predicate;

/* loaded from: classes.dex */
public final /* synthetic */ class OooO0O0 implements Predicate {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f15352OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Context f15353OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ SplitRule f15354OooO0OO;

    public /* synthetic */ OooO0O0(SplitRule splitRule, Context context, int i) {
        this.f15352OooO00o = i;
        this.f15354OooO0OO = splitRule;
        this.f15353OooO0O0 = context;
    }

    @Override // androidx.window.extensions.core.util.function.Predicate
    public final boolean test(Object obj) {
        WindowMetrics windowMetrics = (WindowMetrics) obj;
        switch (this.f15352OooO00o) {
            case 0:
                return EmbeddingAdapter.translateSplitPlaceholderRule$lambda$11((SplitPlaceholderRule) this.f15354OooO0OO, this.f15353OooO0O0, windowMetrics);
            default:
                return EmbeddingAdapter.translateSplitPairRule$lambda$6((SplitPairRule) this.f15354OooO0OO, this.f15353OooO0O0, windowMetrics);
        }
    }
}
