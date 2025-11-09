package androidx.window.embedding;

import android.content.res.Configuration;
import androidx.window.layout.WindowLayoutInfo;
import androidx.window.layout.WindowMetrics;
import kotlin.jvm.internal.OooOo;

/* loaded from: classes.dex */
public final class SplitAttributesCalculatorParams {
    private final boolean areDefaultConstraintsSatisfied;
    private final SplitAttributes defaultSplitAttributes;
    private final Configuration parentConfiguration;
    private final WindowLayoutInfo parentWindowLayoutInfo;
    private final WindowMetrics parentWindowMetrics;
    private final String splitRuleTag;

    public SplitAttributesCalculatorParams(WindowMetrics parentWindowMetrics, Configuration parentConfiguration, WindowLayoutInfo parentWindowLayoutInfo, SplitAttributes defaultSplitAttributes, boolean z, String str) {
        OooOo.OooO0o0(parentWindowMetrics, "parentWindowMetrics");
        OooOo.OooO0o0(parentConfiguration, "parentConfiguration");
        OooOo.OooO0o0(parentWindowLayoutInfo, "parentWindowLayoutInfo");
        OooOo.OooO0o0(defaultSplitAttributes, "defaultSplitAttributes");
        this.parentWindowMetrics = parentWindowMetrics;
        this.parentConfiguration = parentConfiguration;
        this.parentWindowLayoutInfo = parentWindowLayoutInfo;
        this.defaultSplitAttributes = defaultSplitAttributes;
        this.areDefaultConstraintsSatisfied = z;
        this.splitRuleTag = str;
    }

    public final boolean areDefaultConstraintsSatisfied() {
        return this.areDefaultConstraintsSatisfied;
    }

    public final SplitAttributes getDefaultSplitAttributes() {
        return this.defaultSplitAttributes;
    }

    public final Configuration getParentConfiguration() {
        return this.parentConfiguration;
    }

    public final WindowLayoutInfo getParentWindowLayoutInfo() {
        return this.parentWindowLayoutInfo;
    }

    public final WindowMetrics getParentWindowMetrics() {
        return this.parentWindowMetrics;
    }

    public final String getSplitRuleTag() {
        return this.splitRuleTag;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SplitAttributesCalculatorParams:{windowMetrics=");
        sb.append(this.parentWindowMetrics);
        sb.append(", configuration=");
        sb.append(this.parentConfiguration);
        sb.append(", windowLayoutInfo=");
        sb.append(this.parentWindowLayoutInfo);
        sb.append(", defaultSplitAttributes=");
        sb.append(this.defaultSplitAttributes);
        sb.append(", areDefaultConstraintsSatisfied=");
        sb.append(this.areDefaultConstraintsSatisfied);
        sb.append(", tag=");
        return androidx.datastore.preferences.protobuf.OooO00o.OooO0oO('}', this.splitRuleTag, sb);
    }
}
