package androidx.window.embedding;

import kotlin.jvm.internal.OooOo;

/* loaded from: classes.dex */
public final class EmbeddingAspectRatio {
    private final String description;
    private final float value;
    public static final Companion Companion = new Companion(null);
    public static final EmbeddingAspectRatio ALWAYS_ALLOW = new EmbeddingAspectRatio("ALWAYS_ALLOW", 0.0f);
    public static final EmbeddingAspectRatio ALWAYS_DISALLOW = new EmbeddingAspectRatio("ALWAYS_DISALLOW", -1.0f);

    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.OooOO0O oooOO0O) {
            this();
        }

        public final EmbeddingAspectRatio buildAspectRatioFromValue$window_release(float f) {
            EmbeddingAspectRatio embeddingAspectRatio = EmbeddingAspectRatio.ALWAYS_ALLOW;
            if (f == embeddingAspectRatio.getValue$window_release()) {
                return embeddingAspectRatio;
            }
            EmbeddingAspectRatio embeddingAspectRatio2 = EmbeddingAspectRatio.ALWAYS_DISALLOW;
            return f == embeddingAspectRatio2.getValue$window_release() ? embeddingAspectRatio2 : ratio(f);
        }

        public final EmbeddingAspectRatio ratio(float f) {
            if (f <= 1.0f) {
                throw new IllegalArgumentException("Ratio must be greater than 1.");
            }
            return new EmbeddingAspectRatio("ratio:" + f, f, null);
        }

        private Companion() {
        }
    }

    public /* synthetic */ EmbeddingAspectRatio(String str, float f, kotlin.jvm.internal.OooOO0O oooOO0O) {
        this(str, f);
    }

    public static final EmbeddingAspectRatio ratio(float f) {
        return Companion.ratio(f);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof EmbeddingAspectRatio)) {
            return false;
        }
        EmbeddingAspectRatio embeddingAspectRatio = (EmbeddingAspectRatio) obj;
        return this.value == embeddingAspectRatio.value && OooOo.OooO00o(this.description, embeddingAspectRatio.description);
    }

    public final String getDescription$window_release() {
        return this.description;
    }

    public final float getValue$window_release() {
        return this.value;
    }

    public int hashCode() {
        return (Float.hashCode(this.value) * 31) + this.description.hashCode();
    }

    public String toString() {
        return androidx.datastore.preferences.protobuf.OooO00o.OooO0oO(')', this.description, new StringBuilder("EmbeddingAspectRatio("));
    }

    private EmbeddingAspectRatio(String str, float f) {
        this.description = str;
        this.value = f;
    }
}
