package androidx.window.embedding;

import android.app.Activity;
import android.app.ActivityOptions;
import android.os.IBinder;
import java.util.List;
import java.util.Set;
import o00O0Oo.Oooo000;

/* loaded from: classes.dex */
public interface EmbeddingInterfaceCompat {

    public interface EmbeddingCallbackInterface {
        void onSplitInfoChanged(List<SplitInfo> list);
    }

    void clearSplitAttributesCalculator();

    void invalidateTopVisibleSplitAttributes();

    boolean isActivityEmbedded(Activity activity);

    void setEmbeddingCallback(EmbeddingCallbackInterface embeddingCallbackInterface);

    ActivityOptions setLaunchingActivityStack(ActivityOptions activityOptions, IBinder iBinder);

    void setRules(Set<? extends EmbeddingRule> set);

    void setSplitAttributesCalculator(Oooo000 oooo000);

    void updateSplitAttributes(SplitInfo splitInfo, SplitAttributes splitAttributes);
}
