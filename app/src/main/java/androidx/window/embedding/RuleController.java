package androidx.window.embedding;

import android.content.Context;
import android.content.res.Resources;
import androidx.window.embedding.EmbeddingBackend;
import java.io.IOException;
import java.util.Set;
import kotlin.jvm.internal.OooOo;
import o00O0.o0ooOOo;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class RuleController {
    public static final Companion Companion = new Companion(null);
    private final EmbeddingBackend embeddingBackend;

    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.OooOO0O oooOO0O) {
            this();
        }

        public final RuleController getInstance(Context context) {
            OooOo.OooO0o0(context, "context");
            Context applicationContext = context.getApplicationContext();
            EmbeddingBackend.Companion companion = EmbeddingBackend.Companion;
            OooOo.OooO0Oo(applicationContext, "applicationContext");
            return new RuleController(companion.getInstance(applicationContext));
        }

        public final Set<EmbeddingRule> parseRules(Context context, int i) throws XmlPullParserException, Resources.NotFoundException, IOException {
            OooOo.OooO0o0(context, "context");
            RuleParser ruleParser = RuleParser.INSTANCE;
            Context applicationContext = context.getApplicationContext();
            OooOo.OooO0Oo(applicationContext, "context.applicationContext");
            Set<EmbeddingRule> rules$window_release = ruleParser.parseRules$window_release(applicationContext, i);
            return rules$window_release == null ? o0ooOOo.f31250OooOo0O : rules$window_release;
        }

        private Companion() {
        }
    }

    public RuleController(EmbeddingBackend embeddingBackend) {
        OooOo.OooO0o0(embeddingBackend, "embeddingBackend");
        this.embeddingBackend = embeddingBackend;
    }

    public static final RuleController getInstance(Context context) {
        return Companion.getInstance(context);
    }

    public static final Set<EmbeddingRule> parseRules(Context context, int i) {
        return Companion.parseRules(context, i);
    }

    public final void addRule(EmbeddingRule rule) {
        OooOo.OooO0o0(rule, "rule");
        this.embeddingBackend.addRule(rule);
    }

    public final void clearRules() {
        this.embeddingBackend.setRules(o0ooOOo.f31250OooOo0O);
    }

    public final Set<EmbeddingRule> getRules() {
        return this.embeddingBackend.getRules();
    }

    public final void removeRule(EmbeddingRule rule) {
        OooOo.OooO0o0(rule, "rule");
        this.embeddingBackend.removeRule(rule);
    }

    public final void setRules(Set<? extends EmbeddingRule> rules) {
        OooOo.OooO0o0(rules, "rules");
        this.embeddingBackend.setRules(rules);
    }
}
