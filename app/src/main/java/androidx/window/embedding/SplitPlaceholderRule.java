package androidx.window.embedding;

import android.content.Intent;
import androidx.core.util.Preconditions;
import androidx.window.embedding.SplitAttributes;
import androidx.window.embedding.SplitRule;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.OooOo;
import o00O0.OooOo00;

/* loaded from: classes.dex */
public final class SplitPlaceholderRule extends SplitRule {
    private final Set<ActivityFilter> filters;
    private final SplitRule.FinishBehavior finishPrimaryWithPlaceholder;
    private final boolean isSticky;
    private final Intent placeholderIntent;

    public static final class Builder {
        private SplitAttributes defaultSplitAttributes;
        private final Set<ActivityFilter> filters;
        private SplitRule.FinishBehavior finishPrimaryWithPlaceholder;
        private boolean isSticky;
        private EmbeddingAspectRatio maxAspectRatioInLandscape;
        private EmbeddingAspectRatio maxAspectRatioInPortrait;
        private int minHeightDp;
        private int minSmallestWidthDp;
        private int minWidthDp;
        private final Intent placeholderIntent;
        private String tag;

        public Builder(Set<ActivityFilter> filters, Intent placeholderIntent) {
            OooOo.OooO0o0(filters, "filters");
            OooOo.OooO0o0(placeholderIntent, "placeholderIntent");
            this.filters = filters;
            this.placeholderIntent = placeholderIntent;
            this.minWidthDp = 600;
            this.minHeightDp = 600;
            this.minSmallestWidthDp = 600;
            this.maxAspectRatioInPortrait = SplitRule.SPLIT_MAX_ASPECT_RATIO_PORTRAIT_DEFAULT;
            this.maxAspectRatioInLandscape = SplitRule.SPLIT_MAX_ASPECT_RATIO_LANDSCAPE_DEFAULT;
            this.finishPrimaryWithPlaceholder = SplitRule.FinishBehavior.ALWAYS;
            this.defaultSplitAttributes = new SplitAttributes.Builder().build();
        }

        public final SplitPlaceholderRule build() {
            return new SplitPlaceholderRule(this.tag, this.filters, this.placeholderIntent, this.isSticky, this.finishPrimaryWithPlaceholder, this.minWidthDp, this.minHeightDp, this.minSmallestWidthDp, this.maxAspectRatioInPortrait, this.maxAspectRatioInLandscape, this.defaultSplitAttributes);
        }

        public final Builder setDefaultSplitAttributes(SplitAttributes defaultSplitAttributes) {
            OooOo.OooO0o0(defaultSplitAttributes, "defaultSplitAttributes");
            this.defaultSplitAttributes = defaultSplitAttributes;
            return this;
        }

        public final Builder setFinishPrimaryWithPlaceholder(SplitRule.FinishBehavior finishPrimaryWithPlaceholder) {
            OooOo.OooO0o0(finishPrimaryWithPlaceholder, "finishPrimaryWithPlaceholder");
            this.finishPrimaryWithPlaceholder = finishPrimaryWithPlaceholder;
            return this;
        }

        public final Builder setMaxAspectRatioInLandscape(EmbeddingAspectRatio aspectRatio) {
            OooOo.OooO0o0(aspectRatio, "aspectRatio");
            this.maxAspectRatioInLandscape = aspectRatio;
            return this;
        }

        public final Builder setMaxAspectRatioInPortrait(EmbeddingAspectRatio aspectRatio) {
            OooOo.OooO0o0(aspectRatio, "aspectRatio");
            this.maxAspectRatioInPortrait = aspectRatio;
            return this;
        }

        public final Builder setMinHeightDp(int i) {
            this.minHeightDp = i;
            return this;
        }

        public final Builder setMinSmallestWidthDp(int i) {
            this.minSmallestWidthDp = i;
            return this;
        }

        public final Builder setMinWidthDp(int i) {
            this.minWidthDp = i;
            return this;
        }

        public final Builder setSticky(boolean z) {
            this.isSticky = z;
            return this;
        }

        public final Builder setTag(String str) {
            this.tag = str;
            return this;
        }
    }

    public /* synthetic */ SplitPlaceholderRule(String str, Set set, Intent intent, boolean z, SplitRule.FinishBehavior finishBehavior, int i, int i2, int i3, EmbeddingAspectRatio embeddingAspectRatio, EmbeddingAspectRatio embeddingAspectRatio2, SplitAttributes splitAttributes, int i4, kotlin.jvm.internal.OooOO0O oooOO0O) {
        this((i4 & 1) != 0 ? null : str, set, intent, z, (i4 & 16) != 0 ? SplitRule.FinishBehavior.ALWAYS : finishBehavior, (i4 & 32) != 0 ? 600 : i, (i4 & 64) != 0 ? 600 : i2, (i4 & 128) != 0 ? 600 : i3, (i4 & 256) != 0 ? SplitRule.SPLIT_MAX_ASPECT_RATIO_PORTRAIT_DEFAULT : embeddingAspectRatio, (i4 & 512) != 0 ? SplitRule.SPLIT_MAX_ASPECT_RATIO_LANDSCAPE_DEFAULT : embeddingAspectRatio2, splitAttributes);
    }

    @Override // androidx.window.embedding.SplitRule, androidx.window.embedding.EmbeddingRule
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SplitPlaceholderRule) || !super.equals(obj)) {
            return false;
        }
        SplitPlaceholderRule splitPlaceholderRule = (SplitPlaceholderRule) obj;
        return OooOo.OooO00o(this.placeholderIntent, splitPlaceholderRule.placeholderIntent) && this.isSticky == splitPlaceholderRule.isSticky && OooOo.OooO00o(this.finishPrimaryWithPlaceholder, splitPlaceholderRule.finishPrimaryWithPlaceholder) && OooOo.OooO00o(this.filters, splitPlaceholderRule.filters);
    }

    public final Set<ActivityFilter> getFilters() {
        return this.filters;
    }

    public final SplitRule.FinishBehavior getFinishPrimaryWithPlaceholder() {
        return this.finishPrimaryWithPlaceholder;
    }

    public final Intent getPlaceholderIntent() {
        return this.placeholderIntent;
    }

    @Override // androidx.window.embedding.SplitRule, androidx.window.embedding.EmbeddingRule
    public int hashCode() {
        return this.filters.hashCode() + ((this.finishPrimaryWithPlaceholder.hashCode() + ((Boolean.hashCode(this.isSticky) + ((this.placeholderIntent.hashCode() + (super.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final boolean isSticky() {
        return this.isSticky;
    }

    public final SplitPlaceholderRule plus$window_release(ActivityFilter filter) {
        OooOo.OooO0o0(filter, "filter");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(this.filters);
        linkedHashSet.add(filter);
        return new Builder(OooOo00.Oooo0oo(linkedHashSet), this.placeholderIntent).setTag(getTag()).setMinWidthDp(getMinWidthDp()).setMinHeightDp(getMinHeightDp()).setMinSmallestWidthDp(getMinSmallestWidthDp()).setMaxAspectRatioInPortrait(getMaxAspectRatioInPortrait()).setMaxAspectRatioInLandscape(getMaxAspectRatioInLandscape()).setSticky(this.isSticky).setFinishPrimaryWithPlaceholder(this.finishPrimaryWithPlaceholder).setDefaultSplitAttributes(getDefaultSplitAttributes()).build();
    }

    @Override // androidx.window.embedding.SplitRule
    public String toString() {
        return "SplitPlaceholderRule{tag=" + getTag() + ", defaultSplitAttributes=" + getDefaultSplitAttributes() + ", minWidthDp=" + getMinWidthDp() + ", minHeightDp=" + getMinHeightDp() + ", minSmallestWidthDp=" + getMinSmallestWidthDp() + ", maxAspectRatioInPortrait=" + getMaxAspectRatioInPortrait() + ", maxAspectRatioInLandscape=" + getMaxAspectRatioInLandscape() + ", placeholderIntent=" + this.placeholderIntent + ", isSticky=" + this.isSticky + ", finishPrimaryWithPlaceholder=" + this.finishPrimaryWithPlaceholder + ", filters=" + this.filters + '}';
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SplitPlaceholderRule(String str, Set<ActivityFilter> filters, Intent placeholderIntent, boolean z, SplitRule.FinishBehavior finishPrimaryWithPlaceholder, int i, int i2, int i3, EmbeddingAspectRatio maxAspectRatioInPortrait, EmbeddingAspectRatio maxAspectRatioInLandscape, SplitAttributes defaultSplitAttributes) {
        super(str, i, i2, i3, maxAspectRatioInPortrait, maxAspectRatioInLandscape, defaultSplitAttributes);
        OooOo.OooO0o0(filters, "filters");
        OooOo.OooO0o0(placeholderIntent, "placeholderIntent");
        OooOo.OooO0o0(finishPrimaryWithPlaceholder, "finishPrimaryWithPlaceholder");
        OooOo.OooO0o0(maxAspectRatioInPortrait, "maxAspectRatioInPortrait");
        OooOo.OooO0o0(maxAspectRatioInLandscape, "maxAspectRatioInLandscape");
        OooOo.OooO0o0(defaultSplitAttributes, "defaultSplitAttributes");
        Preconditions.checkArgument(!finishPrimaryWithPlaceholder.equals(SplitRule.FinishBehavior.NEVER), "NEVER is not a valid configuration for SplitPlaceholderRule. Please use FINISH_ALWAYS or FINISH_ADJACENT instead or refer to the current API.", new Object[0]);
        this.filters = OooOo00.Oooo0oo(filters);
        this.placeholderIntent = placeholderIntent;
        this.isSticky = z;
        this.finishPrimaryWithPlaceholder = finishPrimaryWithPlaceholder;
    }
}
