package androidx.window.embedding;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import androidx.window.core.ActivityComponentInfo;
import kotlin.jvm.internal.OooOo;

/* loaded from: classes.dex */
public final class SplitPairFilter {
    private final ActivityComponentInfo _primaryActivityName;
    private final ActivityComponentInfo _secondaryActivityName;
    private final String secondaryActivityIntentAction;

    public SplitPairFilter(ActivityComponentInfo _primaryActivityName, ActivityComponentInfo _secondaryActivityName, String str) {
        OooOo.OooO0o0(_primaryActivityName, "_primaryActivityName");
        OooOo.OooO0o0(_secondaryActivityName, "_secondaryActivityName");
        this._primaryActivityName = _primaryActivityName;
        this._secondaryActivityName = _secondaryActivityName;
        this.secondaryActivityIntentAction = str;
        MatcherUtils matcherUtils = MatcherUtils.INSTANCE;
        matcherUtils.validateComponentName$window_release(_primaryActivityName.getPackageName(), _primaryActivityName.getClassName());
        matcherUtils.validateComponentName$window_release(_secondaryActivityName.getPackageName(), _secondaryActivityName.getClassName());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!SplitPairFilter.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        OooOo.OooO0OO(obj, "null cannot be cast to non-null type androidx.window.embedding.SplitPairFilter");
        SplitPairFilter splitPairFilter = (SplitPairFilter) obj;
        return OooOo.OooO00o(this._primaryActivityName, splitPairFilter._primaryActivityName) && OooOo.OooO00o(this._secondaryActivityName, splitPairFilter._secondaryActivityName) && OooOo.OooO00o(this.secondaryActivityIntentAction, splitPairFilter.secondaryActivityIntentAction);
    }

    public final ComponentName getPrimaryActivityName() {
        return new ComponentName(this._primaryActivityName.getPackageName(), this._primaryActivityName.getClassName());
    }

    public final String getSecondaryActivityIntentAction() {
        return this.secondaryActivityIntentAction;
    }

    public final ComponentName getSecondaryActivityName() {
        return new ComponentName(this._secondaryActivityName.getPackageName(), this._secondaryActivityName.getClassName());
    }

    public int hashCode() {
        int iHashCode = (this._secondaryActivityName.hashCode() + (this._primaryActivityName.hashCode() * 31)) * 31;
        String str = this.secondaryActivityIntentAction;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final boolean matchesActivityIntentPair(Activity primaryActivity, Intent secondaryActivityIntent) {
        OooOo.OooO0o0(primaryActivity, "primaryActivity");
        OooOo.OooO0o0(secondaryActivityIntent, "secondaryActivityIntent");
        MatcherUtils matcherUtils = MatcherUtils.INSTANCE;
        if (!matcherUtils.isActivityMatching$window_release(primaryActivity, this._primaryActivityName) || !matcherUtils.isIntentMatching$window_release(secondaryActivityIntent, this._secondaryActivityName)) {
            return false;
        }
        String str = this.secondaryActivityIntentAction;
        return str == null || OooOo.OooO00o(str, secondaryActivityIntent.getAction());
    }

    public final boolean matchesActivityPair(Activity primaryActivity, Activity secondaryActivity) {
        OooOo.OooO0o0(primaryActivity, "primaryActivity");
        OooOo.OooO0o0(secondaryActivity, "secondaryActivity");
        MatcherUtils matcherUtils = MatcherUtils.INSTANCE;
        if (!matcherUtils.isActivityMatching$window_release(primaryActivity, this._primaryActivityName) || !matcherUtils.isActivityMatching$window_release(secondaryActivity, this._secondaryActivityName)) {
            return false;
        }
        String str = this.secondaryActivityIntentAction;
        if (str == null) {
            return true;
        }
        Intent intent = secondaryActivity.getIntent();
        return OooOo.OooO00o(str, intent != null ? intent.getAction() : null);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SplitPairFilter{primaryActivityName=");
        sb.append(getPrimaryActivityName());
        sb.append(", secondaryActivityName=");
        sb.append(getSecondaryActivityName());
        sb.append(", secondaryActivityAction=");
        return androidx.datastore.preferences.protobuf.OooO00o.OooO0oO('}', this.secondaryActivityIntentAction, sb);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SplitPairFilter(ComponentName primaryActivityName, ComponentName secondaryActivityName, String str) {
        this(new ActivityComponentInfo(primaryActivityName), new ActivityComponentInfo(secondaryActivityName), str);
        OooOo.OooO0o0(primaryActivityName, "primaryActivityName");
        OooOo.OooO0o0(secondaryActivityName, "secondaryActivityName");
    }
}
