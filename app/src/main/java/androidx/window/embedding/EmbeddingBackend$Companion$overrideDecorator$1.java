package androidx.window.embedding;

import kotlin.jvm.internal.OooOo;
import kotlin.jvm.internal.OooOo00;
import o00O0Oo.Oooo000;

/* loaded from: classes.dex */
public /* synthetic */ class EmbeddingBackend$Companion$overrideDecorator$1 extends OooOo00 implements Oooo000 {
    public EmbeddingBackend$Companion$overrideDecorator$1(Object obj) {
        super(1, obj, EmbeddingBackendDecorator.class, "decorate", "decorate(Landroidx/window/embedding/EmbeddingBackend;)Landroidx/window/embedding/EmbeddingBackend;", 0);
    }

    @Override // o00O0Oo.Oooo000
    public final EmbeddingBackend invoke(EmbeddingBackend p0) {
        OooOo.OooO0o0(p0, "p0");
        return ((EmbeddingBackendDecorator) this.receiver).decorate(p0);
    }
}
