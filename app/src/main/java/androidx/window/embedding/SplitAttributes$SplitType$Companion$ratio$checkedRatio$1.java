package androidx.window.embedding;

import kotlin.jvm.internal.Oooo000;
import o00O0.OooOOO;

/* loaded from: classes.dex */
public final class SplitAttributes$SplitType$Companion$ratio$checkedRatio$1 extends Oooo000 implements o00O0Oo.Oooo000 {
    final /* synthetic */ float $ratio;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SplitAttributes$SplitType$Companion$ratio$checkedRatio$1(float f) {
        super(1);
        this.$ratio = f;
    }

    @Override // o00O0Oo.Oooo000
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).floatValue());
    }

    public final Boolean invoke(float f) {
        double d = this.$ratio;
        return Boolean.valueOf(0.0d <= d && d <= 1.0d && !OooOOO.Oooo00O(new Float[]{Float.valueOf(0.0f), Float.valueOf(1.0f)}, Float.valueOf(this.$ratio)));
    }
}
