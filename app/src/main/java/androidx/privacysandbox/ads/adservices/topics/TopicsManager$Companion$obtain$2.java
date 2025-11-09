package androidx.privacysandbox.ads.adservices.topics;

import android.content.Context;
import kotlin.jvm.internal.OooOo;
import kotlin.jvm.internal.Oooo000;

/* loaded from: classes.dex */
public final class TopicsManager$Companion$obtain$2 extends Oooo000 implements o00O0Oo.Oooo000 {
    final /* synthetic */ Context $context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TopicsManager$Companion$obtain$2(Context context) {
        super(1);
        this.$context = context;
    }

    @Override // o00O0Oo.Oooo000
    public final TopicsManagerApi31Ext9Impl invoke(Context it) {
        OooOo.OooO0o0(it, "it");
        return new TopicsManagerApi31Ext9Impl(this.$context);
    }
}
