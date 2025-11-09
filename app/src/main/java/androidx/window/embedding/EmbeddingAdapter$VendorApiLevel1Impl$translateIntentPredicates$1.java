package androidx.window.embedding;

import android.content.Intent;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.OooOo;
import kotlin.jvm.internal.Oooo000;

/* loaded from: classes.dex */
public final class EmbeddingAdapter$VendorApiLevel1Impl$translateIntentPredicates$1 extends Oooo000 implements o00O0Oo.Oooo000 {
    final /* synthetic */ Set<ActivityFilter> $activityFilters;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmbeddingAdapter$VendorApiLevel1Impl$translateIntentPredicates$1(Set<ActivityFilter> set) {
        super(1);
        this.$activityFilters = set;
    }

    @Override // o00O0Oo.Oooo000
    public final Boolean invoke(Intent intent) {
        OooOo.OooO0o0(intent, "intent");
        Set<ActivityFilter> set = this.$activityFilters;
        boolean z = false;
        if (set == null || !set.isEmpty()) {
            Iterator<T> it = set.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((ActivityFilter) it.next()).matchesIntent(intent)) {
                    z = true;
                    break;
                }
            }
        }
        return Boolean.valueOf(z);
    }
}
