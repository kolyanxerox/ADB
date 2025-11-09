package androidx.privacysandbox.ads.adservices.appsetid;

import android.content.Context;
import kotlin.jvm.internal.OooOo;
import kotlin.jvm.internal.Oooo000;

/* loaded from: classes.dex */
public final class AppSetIdManager$Companion$obtain$1 extends Oooo000 implements o00O0Oo.Oooo000 {
    final /* synthetic */ Context $context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppSetIdManager$Companion$obtain$1(Context context) {
        super(1);
        this.$context = context;
    }

    @Override // o00O0Oo.Oooo000
    public final AppSetIdManagerApi31Ext9Impl invoke(Context it) {
        OooOo.OooO0o0(it, "it");
        return new AppSetIdManagerApi31Ext9Impl(this.$context);
    }
}
