package androidx.window.embedding;

import android.app.Activity;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.OooOo;
import kotlin.jvm.internal.Oooo000;

/* renamed from: androidx.window.embedding.EmbeddingAdapter$VendorApiLevel1Impl$translateActivityPredicates$1 */
/* loaded from: classes.dex */
public final class C0841x71bd48f5 extends Oooo000 implements o00O0Oo.Oooo000 {
    final /* synthetic */ Set<ActivityFilter> $activityFilters;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0841x71bd48f5(Set<ActivityFilter> set) {
        super(1);
        this.$activityFilters = set;
    }

    @Override // o00O0Oo.Oooo000
    public final Boolean invoke(Activity activity) {
        OooOo.OooO0o0(activity, "activity");
        Set<ActivityFilter> set = this.$activityFilters;
        boolean z = false;
        if (set == null || !set.isEmpty()) {
            Iterator<T> it = set.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((ActivityFilter) it.next()).matchesActivity(activity)) {
                    z = true;
                    break;
                }
            }
        }
        return Boolean.valueOf(z);
    }
}
