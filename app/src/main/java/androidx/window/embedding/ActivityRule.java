package androidx.window.embedding;

import java.util.Set;
import kotlin.jvm.internal.OooOo;
import o00O0.o000OOo;

/* loaded from: classes.dex */
public final class ActivityRule extends EmbeddingRule {
    private final boolean alwaysExpand;
    private final Set<ActivityFilter> filters;

    public static final class Builder {
        private boolean alwaysExpand;
        private final Set<ActivityFilter> filters;
        private String tag;

        public Builder(Set<ActivityFilter> filters) {
            OooOo.OooO0o0(filters, "filters");
            this.filters = filters;
        }

        public final ActivityRule build() {
            return new ActivityRule(this.tag, this.filters, this.alwaysExpand);
        }

        public final Builder setAlwaysExpand(boolean z) {
            this.alwaysExpand = z;
            return this;
        }

        public final Builder setTag(String str) {
            this.tag = str;
            return this;
        }
    }

    public /* synthetic */ ActivityRule(String str, Set set, boolean z, int i, kotlin.jvm.internal.OooOO0O oooOO0O) {
        this(str, set, (i & 4) != 0 ? false : z);
    }

    @Override // androidx.window.embedding.EmbeddingRule
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivityRule) || !super.equals(obj)) {
            return false;
        }
        ActivityRule activityRule = (ActivityRule) obj;
        return OooOo.OooO00o(this.filters, activityRule.filters) && this.alwaysExpand == activityRule.alwaysExpand;
    }

    public final boolean getAlwaysExpand() {
        return this.alwaysExpand;
    }

    public final Set<ActivityFilter> getFilters() {
        return this.filters;
    }

    @Override // androidx.window.embedding.EmbeddingRule
    public int hashCode() {
        return Boolean.hashCode(this.alwaysExpand) + ((this.filters.hashCode() + (super.hashCode() * 31)) * 31);
    }

    public final ActivityRule plus$window_release(ActivityFilter filter) {
        OooOo.OooO0o0(filter, "filter");
        return new ActivityRule(getTag(), o000OOo.OooO0oO(this.filters, filter), this.alwaysExpand);
    }

    public String toString() {
        return "ActivityRule:{tag={" + getTag() + "},filters={" + this.filters + "}, alwaysExpand={" + this.alwaysExpand + "}}";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivityRule(String str, Set<ActivityFilter> filters, boolean z) {
        super(str);
        OooOo.OooO0o0(filters, "filters");
        this.filters = filters;
        this.alwaysExpand = z;
    }
}
