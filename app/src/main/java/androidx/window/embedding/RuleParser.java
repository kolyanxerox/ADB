package androidx.window.embedding;

import OooO0oO.OooOo;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import androidx.webkit.ProxyConfig;
import androidx.window.C0830R;
import androidx.window.embedding.ActivityRule;
import androidx.window.embedding.EmbeddingAspectRatio;
import androidx.window.embedding.SplitAttributes;
import androidx.window.embedding.SplitPairRule;
import androidx.window.embedding.SplitPlaceholderRule;
import androidx.window.embedding.SplitRule;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import o00O0.o0ooOOo;
import o00O0oO.o000000;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class RuleParser {
    public static final RuleParser INSTANCE = new RuleParser();

    private RuleParser() {
    }

    private final void addRuleWithDuplicatedTagCheck(HashSet<EmbeddingRule> hashSet, EmbeddingRule embeddingRule) {
        String tag = embeddingRule.getTag();
        for (EmbeddingRule embeddingRule2 : hashSet) {
            if (tag != null && tag.equals(embeddingRule2.getTag())) {
                throw new IllegalArgumentException("Duplicated tag: " + tag + " for " + embeddingRule + ". The tag must be unique in XML rule definition.");
            }
        }
        hashSet.add(embeddingRule);
    }

    private final ComponentName buildClassName(String str, CharSequence charSequence) {
        if (charSequence == null || charSequence.length() == 0) {
            throw new IllegalArgumentException("Activity name must not be null");
        }
        String string = charSequence.toString();
        if (string.charAt(0) == '.') {
            return new ComponentName(str, OooOo.OooOoo0(str, string));
        }
        int iOoooO0 = o000000.OoooO0(string, '/', 0, 6);
        if (iOoooO0 > 0) {
            str = string.substring(0, iOoooO0);
            kotlin.jvm.internal.OooOo.OooO0Oo(str, "this as java.lang.String…ing(startIndex, endIndex)");
            string = string.substring(iOoooO0 + 1);
            kotlin.jvm.internal.OooOo.OooO0Oo(string, "this as java.lang.String).substring(startIndex)");
        }
        if (string.equals(ProxyConfig.MATCH_ALL_SCHEMES) || o000000.OoooO0(string, '.', 0, 6) >= 0) {
            return new ComponentName(str, string);
        }
        return new ComponentName(str, str + '.' + string);
    }

    private final ActivityFilter parseActivityFilter(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(xmlResourceParser, C0830R.styleable.ActivityFilter, 0, 0);
        String string = typedArrayObtainStyledAttributes.getString(C0830R.styleable.ActivityFilter_activityName);
        String string2 = typedArrayObtainStyledAttributes.getString(C0830R.styleable.ActivityFilter_activityAction);
        String packageName = context.getApplicationContext().getPackageName();
        kotlin.jvm.internal.OooOo.OooO0Oo(packageName, "packageName");
        return new ActivityFilter(buildClassName(packageName, string), string2);
    }

    private final ActivityRule parseActivityRule(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(xmlResourceParser, C0830R.styleable.ActivityRule, 0, 0);
        String string = typedArrayObtainStyledAttributes.getString(C0830R.styleable.ActivityRule_tag);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(C0830R.styleable.ActivityRule_alwaysExpand, false);
        typedArrayObtainStyledAttributes.recycle();
        ActivityRule.Builder alwaysExpand = new ActivityRule.Builder(o0ooOOo.f31250OooOo0O).setAlwaysExpand(z);
        if (string != null) {
            alwaysExpand.setTag(string);
        }
        return alwaysExpand.build();
    }

    private final SplitPairFilter parseSplitPairFilter(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(xmlResourceParser, C0830R.styleable.SplitPairFilter, 0, 0);
        String string = typedArrayObtainStyledAttributes.getString(C0830R.styleable.SplitPairFilter_primaryActivityName);
        String string2 = typedArrayObtainStyledAttributes.getString(C0830R.styleable.SplitPairFilter_secondaryActivityName);
        String string3 = typedArrayObtainStyledAttributes.getString(C0830R.styleable.SplitPairFilter_secondaryActivityAction);
        String packageName = context.getApplicationContext().getPackageName();
        kotlin.jvm.internal.OooOo.OooO0Oo(packageName, "packageName");
        return new SplitPairFilter(buildClassName(packageName, string), buildClassName(packageName, string2), string3);
    }

    private final SplitPairRule parseSplitPairRule(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(xmlResourceParser, C0830R.styleable.SplitPairRule, 0, 0);
        String string = typedArrayObtainStyledAttributes.getString(C0830R.styleable.SplitPairRule_tag);
        float f = typedArrayObtainStyledAttributes.getFloat(C0830R.styleable.SplitPairRule_splitRatio, 0.5f);
        int integer = typedArrayObtainStyledAttributes.getInteger(C0830R.styleable.SplitPairRule_splitMinWidthDp, 600);
        int integer2 = typedArrayObtainStyledAttributes.getInteger(C0830R.styleable.SplitPairRule_splitMinHeightDp, 600);
        int integer3 = typedArrayObtainStyledAttributes.getInteger(C0830R.styleable.SplitPairRule_splitMinSmallestWidthDp, 600);
        float f2 = typedArrayObtainStyledAttributes.getFloat(C0830R.styleable.SplitPairRule_splitMaxAspectRatioInPortrait, SplitRule.SPLIT_MAX_ASPECT_RATIO_PORTRAIT_DEFAULT.getValue$window_release());
        float f3 = typedArrayObtainStyledAttributes.getFloat(C0830R.styleable.SplitPairRule_splitMaxAspectRatioInLandscape, SplitRule.SPLIT_MAX_ASPECT_RATIO_LANDSCAPE_DEFAULT.getValue$window_release());
        int i = typedArrayObtainStyledAttributes.getInt(C0830R.styleable.SplitPairRule_splitLayoutDirection, SplitAttributes.LayoutDirection.LOCALE.getValue$window_release());
        int i2 = typedArrayObtainStyledAttributes.getInt(C0830R.styleable.SplitPairRule_finishPrimaryWithSecondary, SplitRule.FinishBehavior.NEVER.getValue$window_release());
        int i3 = typedArrayObtainStyledAttributes.getInt(C0830R.styleable.SplitPairRule_finishSecondaryWithPrimary, SplitRule.FinishBehavior.ALWAYS.getValue$window_release());
        boolean z = typedArrayObtainStyledAttributes.getBoolean(C0830R.styleable.SplitPairRule_clearTop, false);
        SplitAttributes splitAttributesBuild = new SplitAttributes.Builder().setSplitType(SplitAttributes.SplitType.Companion.buildSplitTypeFromValue$window_release(f)).setLayoutDirection(SplitAttributes.LayoutDirection.Companion.getLayoutDirectionFromValue$window_release(i)).build();
        SplitPairRule.Builder minSmallestWidthDp = new SplitPairRule.Builder(o0ooOOo.f31250OooOo0O).setTag(string).setMinWidthDp(integer).setMinHeightDp(integer2).setMinSmallestWidthDp(integer3);
        EmbeddingAspectRatio.Companion companion = EmbeddingAspectRatio.Companion;
        SplitPairRule.Builder maxAspectRatioInLandscape = minSmallestWidthDp.setMaxAspectRatioInPortrait(companion.buildAspectRatioFromValue$window_release(f2)).setMaxAspectRatioInLandscape(companion.buildAspectRatioFromValue$window_release(f3));
        SplitRule.FinishBehavior.Companion companion2 = SplitRule.FinishBehavior.Companion;
        return maxAspectRatioInLandscape.setFinishPrimaryWithSecondary(companion2.getFinishBehaviorFromValue$window_release(i2)).setFinishSecondaryWithPrimary(companion2.getFinishBehaviorFromValue$window_release(i3)).setClearTop(z).setDefaultSplitAttributes(splitAttributesBuild).build();
    }

    private final SplitPlaceholderRule parseSplitPlaceholderRule(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(xmlResourceParser, C0830R.styleable.SplitPlaceholderRule, 0, 0);
        String string = typedArrayObtainStyledAttributes.getString(C0830R.styleable.SplitPlaceholderRule_tag);
        String string2 = typedArrayObtainStyledAttributes.getString(C0830R.styleable.SplitPlaceholderRule_placeholderActivityName);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(C0830R.styleable.SplitPlaceholderRule_stickyPlaceholder, false);
        int i = typedArrayObtainStyledAttributes.getInt(C0830R.styleable.SplitPlaceholderRule_finishPrimaryWithPlaceholder, SplitRule.FinishBehavior.ALWAYS.getValue$window_release());
        if (i == SplitRule.FinishBehavior.NEVER.getValue$window_release()) {
            throw new IllegalArgumentException("Never is not a valid configuration for Placeholder activities. Please use FINISH_ALWAYS or FINISH_ADJACENT instead or refer to the current API");
        }
        float f = typedArrayObtainStyledAttributes.getFloat(C0830R.styleable.SplitPlaceholderRule_splitRatio, 0.5f);
        int integer = typedArrayObtainStyledAttributes.getInteger(C0830R.styleable.SplitPlaceholderRule_splitMinWidthDp, 600);
        int integer2 = typedArrayObtainStyledAttributes.getInteger(C0830R.styleable.SplitPlaceholderRule_splitMinHeightDp, 600);
        int integer3 = typedArrayObtainStyledAttributes.getInteger(C0830R.styleable.SplitPlaceholderRule_splitMinSmallestWidthDp, 600);
        float f2 = typedArrayObtainStyledAttributes.getFloat(C0830R.styleable.SplitPlaceholderRule_splitMaxAspectRatioInPortrait, SplitRule.SPLIT_MAX_ASPECT_RATIO_PORTRAIT_DEFAULT.getValue$window_release());
        float f3 = typedArrayObtainStyledAttributes.getFloat(C0830R.styleable.SplitPlaceholderRule_splitMaxAspectRatioInLandscape, SplitRule.SPLIT_MAX_ASPECT_RATIO_LANDSCAPE_DEFAULT.getValue$window_release());
        SplitAttributes splitAttributesBuild = new SplitAttributes.Builder().setSplitType(SplitAttributes.SplitType.Companion.buildSplitTypeFromValue$window_release(f)).setLayoutDirection(SplitAttributes.LayoutDirection.Companion.getLayoutDirectionFromValue$window_release(typedArrayObtainStyledAttributes.getInt(C0830R.styleable.SplitPlaceholderRule_splitLayoutDirection, SplitAttributes.LayoutDirection.LOCALE.getValue$window_release()))).build();
        String packageName = context.getApplicationContext().getPackageName();
        RuleParser ruleParser = INSTANCE;
        kotlin.jvm.internal.OooOo.OooO0Oo(packageName, "packageName");
        ComponentName componentNameBuildClassName = ruleParser.buildClassName(packageName, string2);
        o0ooOOo o0ooooo = o0ooOOo.f31250OooOo0O;
        Intent component = new Intent().setComponent(componentNameBuildClassName);
        kotlin.jvm.internal.OooOo.OooO0Oo(component, "Intent().setComponent(pl…eholderActivityClassName)");
        SplitPlaceholderRule.Builder minSmallestWidthDp = new SplitPlaceholderRule.Builder(o0ooooo, component).setTag(string).setMinWidthDp(integer).setMinHeightDp(integer2).setMinSmallestWidthDp(integer3);
        EmbeddingAspectRatio.Companion companion = EmbeddingAspectRatio.Companion;
        return minSmallestWidthDp.setMaxAspectRatioInPortrait(companion.buildAspectRatioFromValue$window_release(f2)).setMaxAspectRatioInLandscape(companion.buildAspectRatioFromValue$window_release(f3)).setSticky(z).setFinishPrimaryWithPlaceholder(SplitRule.FinishBehavior.Companion.getFinishBehaviorFromValue$window_release(i)).setDefaultSplitAttributes(splitAttributesBuild).build();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final Set<EmbeddingRule> parseRules$window_release(Context context, int i) throws XmlPullParserException, Resources.NotFoundException, IOException {
        SplitPlaceholderRule splitPlaceholderRulePlus$window_release;
        ActivityRule activityRulePlus$window_release;
        SplitPairRule splitPairRule;
        kotlin.jvm.internal.OooOo.OooO0o0(context, "context");
        try {
            XmlResourceParser xml = context.getResources().getXml(i);
            kotlin.jvm.internal.OooOo.OooO0Oo(xml, "resources.getXml(staticRuleResourceId)");
            HashSet<EmbeddingRule> hashSet = new HashSet<>();
            int depth = xml.getDepth();
            int next = xml.next();
            ActivityRule activityRule = null;
            SplitPairRule splitPairRule2 = null;
            SplitPlaceholderRule splitPlaceholderRule = null;
            while (next != 1 && (next != 3 || xml.getDepth() > depth)) {
                if (xml.getEventType() != 2 || "split-config".equals(xml.getName())) {
                    next = xml.next();
                } else {
                    String name = xml.getName();
                    if (name != null) {
                        switch (name.hashCode()) {
                            case 511422343:
                                if (name.equals("ActivityFilter")) {
                                    if (activityRule != null || splitPlaceholderRule != null) {
                                        ActivityFilter activityFilter = parseActivityFilter(context, xml);
                                        if (activityRule == null) {
                                            if (splitPlaceholderRule != null) {
                                                hashSet.remove(splitPlaceholderRule);
                                                splitPlaceholderRulePlus$window_release = splitPlaceholderRule.plus$window_release(activityFilter);
                                                addRuleWithDuplicatedTagCheck(hashSet, splitPlaceholderRulePlus$window_release);
                                                splitPlaceholderRule = splitPlaceholderRulePlus$window_release;
                                                break;
                                            }
                                        } else {
                                            hashSet.remove(activityRule);
                                            activityRulePlus$window_release = activityRule.plus$window_release(activityFilter);
                                            addRuleWithDuplicatedTagCheck(hashSet, activityRulePlus$window_release);
                                            activityRule = activityRulePlus$window_release;
                                            break;
                                        }
                                    } else {
                                        throw new IllegalArgumentException("Found orphaned ActivityFilter");
                                    }
                                }
                                break;
                            case 520447504:
                                if (name.equals("SplitPairRule")) {
                                    splitPairRule = parseSplitPairRule(context, xml);
                                    addRuleWithDuplicatedTagCheck(hashSet, splitPairRule);
                                    activityRule = null;
                                    splitPlaceholderRule = null;
                                    splitPairRule2 = splitPairRule;
                                    break;
                                }
                                break;
                            case 1579230604:
                                if (name.equals("SplitPairFilter")) {
                                    if (splitPairRule2 == null) {
                                        throw new IllegalArgumentException("Found orphaned SplitPairFilter outside of SplitPairRule");
                                    }
                                    SplitPairFilter splitPairFilter = parseSplitPairFilter(context, xml);
                                    hashSet.remove(splitPairRule2);
                                    splitPairRule = splitPairRule2.plus$window_release(splitPairFilter);
                                    addRuleWithDuplicatedTagCheck(hashSet, splitPairRule);
                                    splitPairRule2 = splitPairRule;
                                    break;
                                }
                                break;
                            case 1793077963:
                                if (name.equals("ActivityRule")) {
                                    activityRulePlus$window_release = parseActivityRule(context, xml);
                                    addRuleWithDuplicatedTagCheck(hashSet, activityRulePlus$window_release);
                                    splitPairRule2 = null;
                                    splitPlaceholderRule = null;
                                    activityRule = activityRulePlus$window_release;
                                    break;
                                }
                                break;
                            case 2050988213:
                                if (name.equals("SplitPlaceholderRule")) {
                                    splitPlaceholderRulePlus$window_release = parseSplitPlaceholderRule(context, xml);
                                    addRuleWithDuplicatedTagCheck(hashSet, splitPlaceholderRulePlus$window_release);
                                    activityRule = null;
                                    splitPairRule2 = null;
                                    splitPlaceholderRule = splitPlaceholderRulePlus$window_release;
                                    break;
                                }
                                break;
                        }
                    }
                    next = xml.next();
                }
            }
            return hashSet;
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }
}
