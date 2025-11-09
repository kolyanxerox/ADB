package androidx.window.embedding;

import kotlin.jvm.internal.OooOo;

/* loaded from: classes.dex */
public abstract class EmbeddingRule {
    private final String tag;

    public EmbeddingRule(String str) {
        this.tag = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof EmbeddingRule) {
            return OooOo.OooO00o(this.tag, ((EmbeddingRule) obj).tag);
        }
        return false;
    }

    public final String getTag() {
        return this.tag;
    }

    public int hashCode() {
        String str = this.tag;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }
}
