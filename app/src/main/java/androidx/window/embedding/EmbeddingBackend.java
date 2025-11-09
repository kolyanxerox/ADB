package androidx.window.embedding;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Context;
import android.os.IBinder;
import androidx.core.util.Consumer;
import androidx.window.embedding.SplitController;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.OooOo;
import o00O0Oo.Oooo000;

/* loaded from: classes.dex */
public interface EmbeddingBackend {
    public static final Companion Companion = Companion.$$INSTANCE;

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static Oooo000 decorator = EmbeddingBackend$Companion$decorator$1.INSTANCE;

        private Companion() {
        }

        public final EmbeddingBackend getInstance(Context context) {
            OooOo.OooO0o0(context, "context");
            return (EmbeddingBackend) decorator.invoke(ExtensionEmbeddingBackend.Companion.getInstance(context));
        }

        public final void overrideDecorator(EmbeddingBackendDecorator overridingDecorator) {
            OooOo.OooO0o0(overridingDecorator, "overridingDecorator");
            decorator = new EmbeddingBackend$Companion$overrideDecorator$1(overridingDecorator);
        }

        public final void reset() {
            decorator = EmbeddingBackend$Companion$reset$1.INSTANCE;
        }
    }

    static EmbeddingBackend getInstance(Context context) {
        return Companion.getInstance(context);
    }

    static void overrideDecorator(EmbeddingBackendDecorator embeddingBackendDecorator) {
        Companion.overrideDecorator(embeddingBackendDecorator);
    }

    static void reset() {
        Companion.reset();
    }

    void addRule(EmbeddingRule embeddingRule);

    void addSplitListenerForActivity(Activity activity, Executor executor, Consumer<List<SplitInfo>> consumer);

    void clearSplitAttributesCalculator();

    ActivityStack getActivityStack(Activity activity);

    Set<EmbeddingRule> getRules();

    SplitController.SplitSupportStatus getSplitSupportStatus();

    void invalidateTopVisibleSplitAttributes();

    boolean isActivityEmbedded(Activity activity);

    void removeRule(EmbeddingRule embeddingRule);

    void removeSplitListenerForActivity(Consumer<List<SplitInfo>> consumer);

    ActivityOptions setLaunchingActivityStack(ActivityOptions activityOptions, IBinder iBinder);

    void setRules(Set<? extends EmbeddingRule> set);

    void setSplitAttributesCalculator(Oooo000 oooo000);

    void updateSplitAttributes(SplitInfo splitInfo, SplitAttributes splitAttributes);
}
