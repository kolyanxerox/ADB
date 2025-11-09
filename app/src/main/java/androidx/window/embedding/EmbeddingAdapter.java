package androidx.window.embedding;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Binder;
import android.os.IBinder;
import android.util.Pair;
import android.view.WindowMetrics;
import androidx.core.view.Oooo0;
import androidx.window.WindowSdkExtensions;
import androidx.window.core.PredicateAdapter;
import androidx.window.embedding.SplitAttributes;
import androidx.window.embedding.SplitRule;
import androidx.window.extensions.core.util.function.Function;
import androidx.window.extensions.core.util.function.Predicate;
import androidx.window.extensions.embedding.ActivityRule;
import androidx.window.extensions.embedding.SplitAttributes;
import androidx.window.extensions.embedding.SplitPairRule;
import androidx.window.extensions.embedding.SplitPlaceholderRule;
import androidx.window.extensions.layout.WindowLayoutInfo;
import androidx.window.layout.WindowMetricsCalculator;
import androidx.window.layout.adapter.extensions.ExtensionsWindowLayoutInfoAdapter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.OooOo;
import kotlin.jvm.internal.o0OO00O;
import o00O0.OooOOO;
import o00O0.OooOo00;
import o00O0.o0ooOOo;
import o00O0Oo.Oooo000;

/* loaded from: classes.dex */
public final class EmbeddingAdapter {
    private final VendorApiLevel1Impl api1Impl;
    private final VendorApiLevel2Impl api2Impl;
    private final PredicateAdapter predicateAdapter;
    public static final Companion Companion = new Companion(null);
    private static final Binder INVALID_SPLIT_INFO_TOKEN = new Binder();
    private static final Binder INVALID_ACTIVITY_STACK_TOKEN = new Binder();

    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.OooOO0O oooOO0O) {
            this();
        }

        public final Binder getINVALID_ACTIVITY_STACK_TOKEN() {
            return EmbeddingAdapter.INVALID_ACTIVITY_STACK_TOKEN;
        }

        public final Binder getINVALID_SPLIT_INFO_TOKEN() {
            return EmbeddingAdapter.INVALID_SPLIT_INFO_TOKEN;
        }

        private Companion() {
        }
    }

    public final class VendorApiLevel2Impl {
        public VendorApiLevel2Impl() {
        }

        public final SplitInfo translateCompat(androidx.window.extensions.embedding.SplitInfo splitInfo) {
            OooOo.OooO0o0(splitInfo, "splitInfo");
            androidx.window.extensions.embedding.ActivityStack primaryActivityStack = splitInfo.getPrimaryActivityStack();
            OooOo.OooO0Oo(primaryActivityStack, "splitInfo.primaryActivityStack");
            List activities = primaryActivityStack.getActivities();
            OooOo.OooO0Oo(activities, "primaryActivityStack.activities");
            ActivityStack activityStack = new ActivityStack(activities, primaryActivityStack.isEmpty());
            androidx.window.extensions.embedding.ActivityStack secondaryActivityStack = splitInfo.getSecondaryActivityStack();
            OooOo.OooO0Oo(secondaryActivityStack, "splitInfo.secondaryActivityStack");
            List activities2 = secondaryActivityStack.getActivities();
            OooOo.OooO0Oo(activities2, "secondaryActivityStack.activities");
            ActivityStack activityStack2 = new ActivityStack(activities2, secondaryActivityStack.isEmpty());
            EmbeddingAdapter embeddingAdapter = EmbeddingAdapter.this;
            androidx.window.extensions.embedding.SplitAttributes splitAttributes = splitInfo.getSplitAttributes();
            OooOo.OooO0Oo(splitAttributes, "splitInfo.splitAttributes");
            return new SplitInfo(activityStack, activityStack2, embeddingAdapter.translate$window_release(splitAttributes), EmbeddingAdapter.Companion.getINVALID_SPLIT_INFO_TOKEN());
        }
    }

    public EmbeddingAdapter(PredicateAdapter predicateAdapter) {
        OooOo.OooO0o0(predicateAdapter, "predicateAdapter");
        this.predicateAdapter = predicateAdapter;
        this.api1Impl = new VendorApiLevel1Impl(this, predicateAdapter);
        this.api2Impl = new VendorApiLevel2Impl();
    }

    private final int getVendorApiLevel() {
        return WindowSdkExtensions.Companion.getInstance().getExtensionVersion();
    }

    private final SplitInfo translate(androidx.window.extensions.embedding.SplitInfo splitInfo) {
        int vendorApiLevel = getVendorApiLevel();
        if (vendorApiLevel == 1) {
            return this.api1Impl.translateCompat(splitInfo);
        }
        if (vendorApiLevel == 2) {
            return this.api2Impl.translateCompat(splitInfo);
        }
        androidx.window.extensions.embedding.ActivityStack primaryActivityStack = splitInfo.getPrimaryActivityStack();
        OooOo.OooO0Oo(primaryActivityStack, "splitInfo.primaryActivityStack");
        androidx.window.extensions.embedding.ActivityStack secondaryActivityStack = splitInfo.getSecondaryActivityStack();
        OooOo.OooO0Oo(secondaryActivityStack, "splitInfo.secondaryActivityStack");
        List activities = primaryActivityStack.getActivities();
        OooOo.OooO0Oo(activities, "primaryActivityStack.activities");
        ActivityStack activityStack = new ActivityStack(activities, primaryActivityStack.isEmpty());
        List activities2 = secondaryActivityStack.getActivities();
        OooOo.OooO0Oo(activities2, "secondaryActivityStack.activities");
        ActivityStack activityStack2 = new ActivityStack(activities2, secondaryActivityStack.isEmpty());
        androidx.window.extensions.embedding.SplitAttributes splitAttributes = splitInfo.getSplitAttributes();
        OooOo.OooO0Oo(splitAttributes, "splitInfo.splitAttributes");
        SplitAttributes splitAttributesTranslate$window_release = translate$window_release(splitAttributes);
        IBinder token = splitInfo.getToken();
        OooOo.OooO0Oo(token, "splitInfo.token");
        return new SplitInfo(activityStack, activityStack2, splitAttributesTranslate$window_release, token);
    }

    private final androidx.window.extensions.embedding.ActivityRule translateActivityRule(final ActivityRule activityRule, Class<?> cls) {
        if (getVendorApiLevel() < 2) {
            return this.api1Impl.translateActivityRuleCompat(activityRule, cls);
        }
        final int i = 0;
        final int i2 = 1;
        ActivityRule.Builder shouldAlwaysExpand = new ActivityRule.Builder(new Predicate() { // from class: androidx.window.embedding.OooO
            @Override // androidx.window.extensions.core.util.function.Predicate
            public final boolean test(Object obj) {
                switch (i) {
                    case 0:
                        return EmbeddingAdapter.translateActivityRule$lambda$13(activityRule, (Activity) obj);
                    default:
                        return EmbeddingAdapter.translateActivityRule$lambda$15(activityRule, (Intent) obj);
                }
            }
        }, new Predicate() { // from class: androidx.window.embedding.OooO
            @Override // androidx.window.extensions.core.util.function.Predicate
            public final boolean test(Object obj) {
                switch (i2) {
                    case 0:
                        return EmbeddingAdapter.translateActivityRule$lambda$13(activityRule, (Activity) obj);
                    default:
                        return EmbeddingAdapter.translateActivityRule$lambda$15(activityRule, (Intent) obj);
                }
            }
        }).setShouldAlwaysExpand(activityRule.getAlwaysExpand());
        OooOo.OooO0Oo(shouldAlwaysExpand, "ActivityRuleBuilder(acti…Expand(rule.alwaysExpand)");
        String tag = activityRule.getTag();
        if (tag != null) {
            shouldAlwaysExpand.setTag(tag);
        }
        androidx.window.extensions.embedding.ActivityRule activityRuleBuild = shouldAlwaysExpand.build();
        OooOo.OooO0Oo(activityRuleBuild, "builder.build()");
        return activityRuleBuild;
    }

    public static final boolean translateActivityRule$lambda$13(ActivityRule rule, Activity activity) {
        OooOo.OooO0o0(rule, "$rule");
        Set<ActivityFilter> filters = rule.getFilters();
        if (filters != null && filters.isEmpty()) {
            return false;
        }
        for (ActivityFilter activityFilter : filters) {
            OooOo.OooO0Oo(activity, "activity");
            if (activityFilter.matchesActivity(activity)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean translateActivityRule$lambda$15(ActivityRule rule, Intent intent) {
        OooOo.OooO0o0(rule, "$rule");
        Set<ActivityFilter> filters = rule.getFilters();
        if (filters != null && filters.isEmpty()) {
            return false;
        }
        for (ActivityFilter activityFilter : filters) {
            OooOo.OooO0Oo(intent, "intent");
            if (activityFilter.matchesIntent(intent)) {
                return true;
            }
        }
        return false;
    }

    public static final androidx.window.extensions.embedding.SplitAttributes translateSplitAttributesCalculator$lambda$0(EmbeddingAdapter this$0, Oooo000 calculator, androidx.window.extensions.embedding.SplitAttributesCalculatorParams oemParams) {
        OooOo.OooO0o0(this$0, "this$0");
        OooOo.OooO0o0(calculator, "$calculator");
        OooOo.OooO0Oo(oemParams, "oemParams");
        return this$0.translateSplitAttributes((SplitAttributes) calculator.invoke(this$0.translate(oemParams)));
    }

    private final androidx.window.extensions.embedding.SplitPairRule translateSplitPairRule(Context context, final SplitPairRule splitPairRule, Class<?> cls) {
        if (getVendorApiLevel() < 2) {
            return this.api1Impl.translateSplitPairRuleCompat(context, splitPairRule, cls);
        }
        final int i = 0;
        Predicate predicate = new Predicate() { // from class: androidx.window.embedding.OooO0o
            @Override // androidx.window.extensions.core.util.function.Predicate
            public final boolean test(Object obj) {
                switch (i) {
                    case 0:
                        return EmbeddingAdapter.translateSplitPairRule$lambda$3(splitPairRule, (Pair) obj);
                    default:
                        return EmbeddingAdapter.translateSplitPairRule$lambda$5(splitPairRule, (Pair) obj);
                }
            }
        };
        final int i2 = 1;
        Predicate predicate2 = new Predicate() { // from class: androidx.window.embedding.OooO0o
            @Override // androidx.window.extensions.core.util.function.Predicate
            public final boolean test(Object obj) {
                switch (i2) {
                    case 0:
                        return EmbeddingAdapter.translateSplitPairRule$lambda$3(splitPairRule, (Pair) obj);
                    default:
                        return EmbeddingAdapter.translateSplitPairRule$lambda$5(splitPairRule, (Pair) obj);
                }
            }
        };
        OooO0O0 oooO0O0 = new OooO0O0(splitPairRule, context, 1);
        String tag = splitPairRule.getTag();
        SplitPairRule.Builder shouldClearTop = new SplitPairRule.Builder(predicate, predicate2, oooO0O0).setDefaultSplitAttributes(translateSplitAttributes(splitPairRule.getDefaultSplitAttributes())).setFinishPrimaryWithSecondary(translateFinishBehavior(splitPairRule.getFinishPrimaryWithSecondary())).setFinishSecondaryWithPrimary(translateFinishBehavior(splitPairRule.getFinishSecondaryWithPrimary())).setShouldClearTop(splitPairRule.getClearTop());
        OooOo.OooO0Oo(shouldClearTop, "SplitPairRuleBuilder(\n  …ldClearTop(rule.clearTop)");
        if (tag != null) {
            shouldClearTop.setTag(tag);
        }
        androidx.window.extensions.embedding.SplitPairRule splitPairRuleBuild = shouldClearTop.build();
        OooOo.OooO0Oo(splitPairRuleBuild, "builder.build()");
        return splitPairRuleBuild;
    }

    public static final boolean translateSplitPairRule$lambda$3(SplitPairRule rule, Pair pair) {
        OooOo.OooO0o0(rule, "$rule");
        Set<SplitPairFilter> filters = rule.getFilters();
        if (filters != null && filters.isEmpty()) {
            return false;
        }
        for (SplitPairFilter splitPairFilter : filters) {
            Object obj = pair.first;
            OooOo.OooO0Oo(obj, "activitiesPair.first");
            Object obj2 = pair.second;
            OooOo.OooO0Oo(obj2, "activitiesPair.second");
            if (splitPairFilter.matchesActivityPair((Activity) obj, (Activity) obj2)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean translateSplitPairRule$lambda$5(SplitPairRule rule, Pair pair) {
        OooOo.OooO0o0(rule, "$rule");
        Set<SplitPairFilter> filters = rule.getFilters();
        if (filters != null && filters.isEmpty()) {
            return false;
        }
        for (SplitPairFilter splitPairFilter : filters) {
            Object obj = pair.first;
            OooOo.OooO0Oo(obj, "activityIntentPair.first");
            Object obj2 = pair.second;
            OooOo.OooO0Oo(obj2, "activityIntentPair.second");
            if (splitPairFilter.matchesActivityIntentPair((Activity) obj, (Intent) obj2)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean translateSplitPairRule$lambda$6(SplitPairRule rule, Context context, WindowMetrics windowMetrics) {
        OooOo.OooO0o0(rule, "$rule");
        OooOo.OooO0o0(context, "$context");
        OooOo.OooO0Oo(windowMetrics, "windowMetrics");
        return rule.checkParentMetrics$window_release(context, windowMetrics);
    }

    private final androidx.window.extensions.embedding.SplitPlaceholderRule translateSplitPlaceholderRule(Context context, final SplitPlaceholderRule splitPlaceholderRule, Class<?> cls) {
        if (getVendorApiLevel() < 2) {
            return this.api1Impl.translateSplitPlaceholderRuleCompat(context, splitPlaceholderRule, cls);
        }
        final int i = 0;
        Predicate predicate = new Predicate() { // from class: androidx.window.embedding.OooO00o
            @Override // androidx.window.extensions.core.util.function.Predicate
            public final boolean test(Object obj) {
                switch (i) {
                    case 0:
                        return EmbeddingAdapter.translateSplitPlaceholderRule$lambda$8(splitPlaceholderRule, (Activity) obj);
                    default:
                        return EmbeddingAdapter.translateSplitPlaceholderRule$lambda$10(splitPlaceholderRule, (Intent) obj);
                }
            }
        };
        final int i2 = 1;
        Predicate predicate2 = new Predicate() { // from class: androidx.window.embedding.OooO00o
            @Override // androidx.window.extensions.core.util.function.Predicate
            public final boolean test(Object obj) {
                switch (i2) {
                    case 0:
                        return EmbeddingAdapter.translateSplitPlaceholderRule$lambda$8(splitPlaceholderRule, (Activity) obj);
                    default:
                        return EmbeddingAdapter.translateSplitPlaceholderRule$lambda$10(splitPlaceholderRule, (Intent) obj);
                }
            }
        };
        OooO0O0 oooO0O0 = new OooO0O0(splitPlaceholderRule, context, 0);
        String tag = splitPlaceholderRule.getTag();
        SplitPlaceholderRule.Builder finishPrimaryWithPlaceholder = new SplitPlaceholderRule.Builder(splitPlaceholderRule.getPlaceholderIntent(), predicate, predicate2, oooO0O0).setSticky(splitPlaceholderRule.isSticky()).setDefaultSplitAttributes(translateSplitAttributes(splitPlaceholderRule.getDefaultSplitAttributes())).setFinishPrimaryWithPlaceholder(translateFinishBehavior(splitPlaceholderRule.getFinishPrimaryWithPlaceholder()));
        OooOo.OooO0Oo(finishPrimaryWithPlaceholder, "SplitPlaceholderRuleBuil…holder)\n                )");
        if (tag != null) {
            finishPrimaryWithPlaceholder.setTag(tag);
        }
        androidx.window.extensions.embedding.SplitPlaceholderRule splitPlaceholderRuleBuild = finishPrimaryWithPlaceholder.build();
        OooOo.OooO0Oo(splitPlaceholderRuleBuild, "builder.build()");
        return splitPlaceholderRuleBuild;
    }

    public static final boolean translateSplitPlaceholderRule$lambda$10(SplitPlaceholderRule rule, Intent intent) {
        OooOo.OooO0o0(rule, "$rule");
        Set<ActivityFilter> filters = rule.getFilters();
        if (filters != null && filters.isEmpty()) {
            return false;
        }
        for (ActivityFilter activityFilter : filters) {
            OooOo.OooO0Oo(intent, "intent");
            if (activityFilter.matchesIntent(intent)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean translateSplitPlaceholderRule$lambda$11(SplitPlaceholderRule rule, Context context, WindowMetrics windowMetrics) {
        OooOo.OooO0o0(rule, "$rule");
        OooOo.OooO0o0(context, "$context");
        OooOo.OooO0Oo(windowMetrics, "windowMetrics");
        return rule.checkParentMetrics$window_release(context, windowMetrics);
    }

    public static final boolean translateSplitPlaceholderRule$lambda$8(SplitPlaceholderRule rule, Activity activity) {
        OooOo.OooO0o0(rule, "$rule");
        Set<ActivityFilter> filters = rule.getFilters();
        if (filters != null && filters.isEmpty()) {
            return false;
        }
        for (ActivityFilter activityFilter : filters) {
            OooOo.OooO0Oo(activity, "activity");
            if (activityFilter.matchesActivity(activity)) {
                return true;
            }
        }
        return false;
    }

    private final SplitAttributes.SplitType translateSplitType(SplitAttributes.SplitType splitType) {
        if (getVendorApiLevel() < 2) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (OooOo.OooO00o(splitType, SplitAttributes.SplitType.SPLIT_TYPE_HINGE)) {
            return new SplitAttributes.SplitType.HingeSplitType(translateSplitType(SplitAttributes.SplitType.SPLIT_TYPE_EQUAL));
        }
        if (OooOo.OooO00o(splitType, SplitAttributes.SplitType.SPLIT_TYPE_EXPAND)) {
            return new SplitAttributes.SplitType.ExpandContainersSplitType();
        }
        float value$window_release = splitType.getValue$window_release();
        double d = value$window_release;
        if (d > 0.0d && d < 1.0d) {
            return new SplitAttributes.SplitType.RatioSplitType(value$window_release);
        }
        throw new IllegalArgumentException("Unsupported SplitType: " + splitType + " with value: " + splitType.getValue$window_release());
    }

    public final SplitAttributes translate$window_release(androidx.window.extensions.embedding.SplitAttributes splitAttributes) {
        SplitAttributes.SplitType splitTypeRatio;
        SplitAttributes.LayoutDirection layoutDirection;
        OooOo.OooO0o0(splitAttributes, "splitAttributes");
        SplitAttributes.Builder builder = new SplitAttributes.Builder();
        SplitAttributes.SplitType.RatioSplitType splitType = splitAttributes.getSplitType();
        OooOo.OooO0Oo(splitType, "splitAttributes.splitType");
        if (splitType instanceof SplitAttributes.SplitType.HingeSplitType) {
            splitTypeRatio = SplitAttributes.SplitType.SPLIT_TYPE_HINGE;
        } else if (splitType instanceof SplitAttributes.SplitType.ExpandContainersSplitType) {
            splitTypeRatio = SplitAttributes.SplitType.SPLIT_TYPE_EXPAND;
        } else {
            if (!(splitType instanceof SplitAttributes.SplitType.RatioSplitType)) {
                throw new IllegalArgumentException("Unknown split type: " + splitType);
            }
            splitTypeRatio = SplitAttributes.SplitType.Companion.ratio(splitType.getRatio());
        }
        SplitAttributes.Builder splitType2 = builder.setSplitType(splitTypeRatio);
        int layoutDirection2 = splitAttributes.getLayoutDirection();
        if (layoutDirection2 == 0) {
            layoutDirection = SplitAttributes.LayoutDirection.LEFT_TO_RIGHT;
        } else if (layoutDirection2 == 1) {
            layoutDirection = SplitAttributes.LayoutDirection.RIGHT_TO_LEFT;
        } else if (layoutDirection2 == 3) {
            layoutDirection = SplitAttributes.LayoutDirection.LOCALE;
        } else if (layoutDirection2 == 4) {
            layoutDirection = SplitAttributes.LayoutDirection.TOP_TO_BOTTOM;
        } else {
            if (layoutDirection2 != 5) {
                throw new IllegalArgumentException(OooO0oO.OooOo.OooO0o(layoutDirection2, "Unknown layout direction: "));
            }
            layoutDirection = SplitAttributes.LayoutDirection.BOTTOM_TO_TOP;
        }
        return splitType2.setLayoutDirection(layoutDirection).build();
    }

    public final int translateFinishBehavior(SplitRule.FinishBehavior behavior) {
        OooOo.OooO0o0(behavior, "behavior");
        if (behavior.equals(SplitRule.FinishBehavior.NEVER)) {
            return 0;
        }
        if (behavior.equals(SplitRule.FinishBehavior.ALWAYS)) {
            return 1;
        }
        if (behavior.equals(SplitRule.FinishBehavior.ADJACENT)) {
            return 2;
        }
        throw new IllegalArgumentException("Unknown finish behavior:" + behavior);
    }

    public final androidx.window.extensions.embedding.SplitAttributes translateSplitAttributes(SplitAttributes splitAttributes) {
        int i;
        OooOo.OooO0o0(splitAttributes, "splitAttributes");
        if (getVendorApiLevel() < 2) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        SplitAttributes.Builder splitType = new SplitAttributes.Builder().setSplitType(translateSplitType(splitAttributes.getSplitType()));
        SplitAttributes.LayoutDirection layoutDirection = splitAttributes.getLayoutDirection();
        if (OooOo.OooO00o(layoutDirection, SplitAttributes.LayoutDirection.LOCALE)) {
            i = 3;
        } else if (OooOo.OooO00o(layoutDirection, SplitAttributes.LayoutDirection.LEFT_TO_RIGHT)) {
            i = 0;
        } else if (OooOo.OooO00o(layoutDirection, SplitAttributes.LayoutDirection.RIGHT_TO_LEFT)) {
            i = 1;
        } else if (OooOo.OooO00o(layoutDirection, SplitAttributes.LayoutDirection.TOP_TO_BOTTOM)) {
            i = 4;
        } else {
            if (!OooOo.OooO00o(layoutDirection, SplitAttributes.LayoutDirection.BOTTOM_TO_TOP)) {
                throw new IllegalArgumentException("Unsupported layoutDirection:" + splitAttributes + ".layoutDirection");
            }
            i = 5;
        }
        androidx.window.extensions.embedding.SplitAttributes splitAttributesBuild = splitType.setLayoutDirection(i).build();
        OooOo.OooO0Oo(splitAttributesBuild, "Builder()\n            .s…   )\n            .build()");
        return splitAttributesBuild;
    }

    public final Function<androidx.window.extensions.embedding.SplitAttributesCalculatorParams, androidx.window.extensions.embedding.SplitAttributes> translateSplitAttributesCalculator(final Oooo000 calculator) {
        OooOo.OooO0o0(calculator, "calculator");
        return new Function() { // from class: androidx.window.embedding.OooO0OO
            @Override // androidx.window.extensions.core.util.function.Function
            public final Object apply(Object obj) {
                return EmbeddingAdapter.translateSplitAttributesCalculator$lambda$0(this.f15355OooO00o, calculator, (androidx.window.extensions.embedding.SplitAttributesCalculatorParams) obj);
            }
        };
    }

    public final class VendorApiLevel1Impl {
        private final PredicateAdapter predicateAdapter;
        final /* synthetic */ EmbeddingAdapter this$0;

        public VendorApiLevel1Impl(EmbeddingAdapter embeddingAdapter, PredicateAdapter predicateAdapter) {
            OooOo.OooO0o0(predicateAdapter, "predicateAdapter");
            this.this$0 = embeddingAdapter;
            this.predicateAdapter = predicateAdapter;
        }

        private final boolean isSplitAttributesSupported(SplitAttributes splitAttributes) {
            double value$window_release = splitAttributes.getSplitType().getValue$window_release();
            return 0.0d <= value$window_release && value$window_release <= 1.0d && splitAttributes.getSplitType().getValue$window_release() != 1.0f && OooOOO.Oooo00O(new SplitAttributes.LayoutDirection[]{SplitAttributes.LayoutDirection.LEFT_TO_RIGHT, SplitAttributes.LayoutDirection.RIGHT_TO_LEFT, SplitAttributes.LayoutDirection.LOCALE}, splitAttributes.getLayoutDirection());
        }

        private final SplitPlaceholderRule.Builder setDefaultSplitAttributesCompat(SplitPlaceholderRule.Builder builder, SplitAttributes splitAttributes) {
            oo00o.OooOO0 oooOO0TranslateSplitAttributesCompatInternal = translateSplitAttributesCompatInternal(splitAttributes);
            float fFloatValue = ((Number) oooOO0TranslateSplitAttributesCompatInternal.f33185OooOo0O).floatValue();
            int iIntValue = ((Number) oooOO0TranslateSplitAttributesCompatInternal.f33186OooOo0o).intValue();
            builder.setSplitRatio(fFloatValue);
            builder.setLayoutDirection(iIntValue);
            return builder;
        }

        private final Object translateActivityIntentPredicates(Set<SplitPairFilter> set) {
            return this.predicateAdapter.buildPairPredicate(o0OO00O.OooO00o(Activity.class), o0OO00O.OooO00o(Intent.class), new C0839xa3f240b1(set));
        }

        private final Object translateActivityPairPredicates(Set<SplitPairFilter> set) {
            return this.predicateAdapter.buildPairPredicate(o0OO00O.OooO00o(Activity.class), o0OO00O.OooO00o(Activity.class), new C0840x2d69c2ef(set));
        }

        private final Object translateActivityPredicates(Set<ActivityFilter> set) {
            return this.predicateAdapter.buildPredicate(o0OO00O.OooO00o(Activity.class), new C0841x71bd48f5(set));
        }

        private final Object translateIntentPredicates(Set<ActivityFilter> set) {
            return this.predicateAdapter.buildPredicate(o0OO00O.OooO00o(Intent.class), new EmbeddingAdapter$VendorApiLevel1Impl$translateIntentPredicates$1(set));
        }

        private final Object translateParentMetricsPredicate(Context context, SplitRule splitRule) {
            return this.predicateAdapter.buildPredicate(o0OO00O.OooO00o(Oooo0.OooO()), new C0842xa92858a8(splitRule, context));
        }

        private final oo00o.OooOO0 translateSplitAttributesCompatInternal(SplitAttributes splitAttributes) {
            int i = 3;
            if (!isSplitAttributesSupported(splitAttributes)) {
                return new oo00o.OooOO0(Float.valueOf(0.0f), 3);
            }
            Float fValueOf = Float.valueOf(splitAttributes.getSplitType().getValue$window_release());
            SplitAttributes.LayoutDirection layoutDirection = splitAttributes.getLayoutDirection();
            if (!OooOo.OooO00o(layoutDirection, SplitAttributes.LayoutDirection.LOCALE)) {
                if (OooOo.OooO00o(layoutDirection, SplitAttributes.LayoutDirection.LEFT_TO_RIGHT)) {
                    i = 0;
                } else {
                    if (!OooOo.OooO00o(layoutDirection, SplitAttributes.LayoutDirection.RIGHT_TO_LEFT)) {
                        throw new IllegalStateException("Unsupported layout direction must be covered in @isSplitAttributesSupported!");
                    }
                    i = 1;
                }
            }
            return new oo00o.OooOO0(fValueOf, Integer.valueOf(i));
        }

        public final PredicateAdapter getPredicateAdapter() {
            return this.predicateAdapter;
        }

        public final SplitAttributes getSplitAttributesCompat(androidx.window.extensions.embedding.SplitInfo splitInfo) {
            OooOo.OooO0o0(splitInfo, "splitInfo");
            return new SplitAttributes.Builder().setSplitType(SplitAttributes.SplitType.Companion.buildSplitTypeFromValue$window_release(splitInfo.getSplitRatio())).setLayoutDirection(SplitAttributes.LayoutDirection.LOCALE).build();
        }

        public final androidx.window.extensions.embedding.ActivityRule translateActivityRuleCompat(ActivityRule rule, Class<?> predicateClass) {
            OooOo.OooO0o0(rule, "rule");
            OooOo.OooO0o0(predicateClass, "predicateClass");
            androidx.window.extensions.embedding.ActivityRule activityRuleBuild = ((ActivityRule.Builder) ActivityRule.Builder.class.getConstructor(predicateClass, predicateClass).newInstance(translateActivityPredicates(rule.getFilters()), translateIntentPredicates(rule.getFilters()))).setShouldAlwaysExpand(rule.getAlwaysExpand()).build();
            OooOo.OooO0Oo(activityRuleBuild, "ActivityRuleBuilder::cla…\n                .build()");
            return activityRuleBuild;
        }

        public final SplitInfo translateCompat(androidx.window.extensions.embedding.SplitInfo splitInfo) {
            OooOo.OooO0o0(splitInfo, "splitInfo");
            List activities = splitInfo.getPrimaryActivityStack().getActivities();
            OooOo.OooO0Oo(activities, "splitInfo.primaryActivityStack.activities");
            ActivityStack activityStack = new ActivityStack(activities, splitInfo.getPrimaryActivityStack().isEmpty());
            List activities2 = splitInfo.getSecondaryActivityStack().getActivities();
            OooOo.OooO0Oo(activities2, "splitInfo.secondaryActivityStack.activities");
            return new SplitInfo(activityStack, new ActivityStack(activities2, splitInfo.getSecondaryActivityStack().isEmpty()), getSplitAttributesCompat(splitInfo), EmbeddingAdapter.Companion.getINVALID_SPLIT_INFO_TOKEN());
        }

        public final androidx.window.extensions.embedding.SplitPairRule translateSplitPairRuleCompat(Context context, SplitPairRule rule, Class<?> predicateClass) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
            OooOo.OooO0o0(context, "context");
            OooOo.OooO0o0(rule, "rule");
            OooOo.OooO0o0(predicateClass, "predicateClass");
            Object objNewInstance = SplitPairRule.Builder.class.getConstructor(predicateClass, predicateClass, predicateClass).newInstance(translateActivityPairPredicates(rule.getFilters()), translateActivityIntentPredicates(rule.getFilters()), translateParentMetricsPredicate(context, rule));
            OooOo.OooO0Oo(objNewInstance, "SplitPairRuleBuilder::cl…text, rule)\n            )");
            androidx.window.extensions.embedding.SplitPairRule splitPairRuleBuild = setDefaultSplitAttributesCompat((SplitPairRule.Builder) objNewInstance, rule.getDefaultSplitAttributes()).setShouldClearTop(rule.getClearTop()).setFinishPrimaryWithSecondary(this.this$0.translateFinishBehavior(rule.getFinishPrimaryWithSecondary())).setFinishSecondaryWithPrimary(this.this$0.translateFinishBehavior(rule.getFinishSecondaryWithPrimary())).build();
            OooOo.OooO0Oo(splitPairRuleBuild, "SplitPairRuleBuilder::cl…                ).build()");
            return splitPairRuleBuild;
        }

        public final androidx.window.extensions.embedding.SplitPlaceholderRule translateSplitPlaceholderRuleCompat(Context context, SplitPlaceholderRule rule, Class<?> predicateClass) {
            OooOo.OooO0o0(context, "context");
            OooOo.OooO0o0(rule, "rule");
            OooOo.OooO0o0(predicateClass, "predicateClass");
            SplitPlaceholderRule.Builder finishPrimaryWithSecondary = ((SplitPlaceholderRule.Builder) SplitPlaceholderRule.Builder.class.getConstructor(Intent.class, predicateClass, predicateClass, predicateClass).newInstance(rule.getPlaceholderIntent(), translateActivityPredicates(rule.getFilters()), translateIntentPredicates(rule.getFilters()), translateParentMetricsPredicate(context, rule))).setSticky(rule.isSticky()).setFinishPrimaryWithSecondary(this.this$0.translateFinishBehavior(rule.getFinishPrimaryWithPlaceholder()));
            OooOo.OooO0Oo(finishPrimaryWithSecondary, "SplitPlaceholderRuleBuil…holder)\n                )");
            androidx.window.extensions.embedding.SplitPlaceholderRule splitPlaceholderRuleBuild = setDefaultSplitAttributesCompat(finishPrimaryWithSecondary, rule.getDefaultSplitAttributes()).build();
            OooOo.OooO0Oo(splitPlaceholderRuleBuild, "SplitPlaceholderRuleBuil…\n                .build()");
            return splitPlaceholderRuleBuild;
        }

        private final SplitPairRule.Builder setDefaultSplitAttributesCompat(SplitPairRule.Builder builder, SplitAttributes splitAttributes) {
            oo00o.OooOO0 oooOO0TranslateSplitAttributesCompatInternal = translateSplitAttributesCompatInternal(splitAttributes);
            float fFloatValue = ((Number) oooOO0TranslateSplitAttributesCompatInternal.f33185OooOo0O).floatValue();
            int iIntValue = ((Number) oooOO0TranslateSplitAttributesCompatInternal.f33186OooOo0o).intValue();
            builder.setSplitRatio(fFloatValue);
            builder.setLayoutDirection(iIntValue);
            return builder;
        }
    }

    public final SplitAttributesCalculatorParams translate(androidx.window.extensions.embedding.SplitAttributesCalculatorParams params) {
        OooOo.OooO0o0(params, "params");
        WindowMetrics parentWindowMetrics = params.getParentWindowMetrics();
        OooOo.OooO0Oo(parentWindowMetrics, "params.parentWindowMetrics");
        Configuration parentConfiguration = params.getParentConfiguration();
        OooOo.OooO0Oo(parentConfiguration, "params.parentConfiguration");
        WindowLayoutInfo parentWindowLayoutInfo = params.getParentWindowLayoutInfo();
        OooOo.OooO0Oo(parentWindowLayoutInfo, "params.parentWindowLayoutInfo");
        androidx.window.extensions.embedding.SplitAttributes defaultSplitAttributes = params.getDefaultSplitAttributes();
        OooOo.OooO0Oo(defaultSplitAttributes, "params.defaultSplitAttributes");
        boolean zAreDefaultConstraintsSatisfied = params.areDefaultConstraintsSatisfied();
        String splitRuleTag = params.getSplitRuleTag();
        androidx.window.layout.WindowMetrics windowMetricsTranslateWindowMetrics$window_release = WindowMetricsCalculator.Companion.translateWindowMetrics$window_release(parentWindowMetrics);
        return new SplitAttributesCalculatorParams(windowMetricsTranslateWindowMetrics$window_release, parentConfiguration, ExtensionsWindowLayoutInfoAdapter.INSTANCE.translate$window_release(windowMetricsTranslateWindowMetrics$window_release, parentWindowLayoutInfo), translate$window_release(defaultSplitAttributes), zAreDefaultConstraintsSatisfied, splitRuleTag);
    }

    public final Set<androidx.window.extensions.embedding.EmbeddingRule> translate(Context context, Set<? extends EmbeddingRule> rules) {
        androidx.window.extensions.embedding.SplitPairRule splitPairRuleTranslateActivityRule;
        OooOo.OooO0o0(context, "context");
        OooOo.OooO0o0(rules, "rules");
        Class<?> clsPredicateClassOrNull$window_release = this.predicateAdapter.predicateClassOrNull$window_release();
        if (clsPredicateClassOrNull$window_release == null) {
            return o0ooOOo.f31250OooOo0O;
        }
        ArrayList arrayList = new ArrayList(o00O0.Oooo000.OooOo0(rules, 10));
        for (EmbeddingRule embeddingRule : rules) {
            if (embeddingRule instanceof SplitPairRule) {
                splitPairRuleTranslateActivityRule = translateSplitPairRule(context, (SplitPairRule) embeddingRule, clsPredicateClassOrNull$window_release);
            } else if (embeddingRule instanceof SplitPlaceholderRule) {
                splitPairRuleTranslateActivityRule = translateSplitPlaceholderRule(context, (SplitPlaceholderRule) embeddingRule, clsPredicateClassOrNull$window_release);
            } else {
                if (!(embeddingRule instanceof ActivityRule)) {
                    throw new IllegalArgumentException("Unsupported rule type");
                }
                splitPairRuleTranslateActivityRule = translateActivityRule((ActivityRule) embeddingRule, clsPredicateClassOrNull$window_release);
            }
            arrayList.add((androidx.window.extensions.embedding.EmbeddingRule) splitPairRuleTranslateActivityRule);
        }
        return OooOo00.Oooo0oo(arrayList);
    }

    public final List<SplitInfo> translate(List<? extends androidx.window.extensions.embedding.SplitInfo> splitInfoList) {
        OooOo.OooO0o0(splitInfoList, "splitInfoList");
        ArrayList arrayList = new ArrayList(o00O0.Oooo000.OooOo0(splitInfoList, 10));
        Iterator<T> it = splitInfoList.iterator();
        while (it.hasNext()) {
            arrayList.add(translate((androidx.window.extensions.embedding.SplitInfo) it.next()));
        }
        return arrayList;
    }
}
