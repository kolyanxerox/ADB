package androidx.window.embedding;

import android.app.Activity;
import android.content.Intent;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.OooOo;
import kotlin.jvm.internal.Oooo000;
import o00O0Oo.o00O0O;

/* renamed from: androidx.window.embedding.EmbeddingAdapter$VendorApiLevel1Impl$translateActivityIntentPredicates$1 */
/* loaded from: classes.dex */
public final class C0839xa3f240b1 extends Oooo000 implements o00O0O {
    final /* synthetic */ Set<SplitPairFilter> $splitPairFilters;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0839xa3f240b1(Set<SplitPairFilter> set) {
        super(2);
        this.$splitPairFilters = set;
    }

    @Override // o00O0Oo.o00O0O
    public final Boolean invoke(Activity first, Intent second) {
        OooOo.OooO0o0(first, "first");
        OooOo.OooO0o0(second, "second");
        Set<SplitPairFilter> set = this.$splitPairFilters;
        boolean z = false;
        if (set == null || !set.isEmpty()) {
            Iterator<T> it = set.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((SplitPairFilter) it.next()).matchesActivityIntentPair(first, second)) {
                    z = true;
                    break;
                }
            }
        }
        return Boolean.valueOf(z);
    }
}
