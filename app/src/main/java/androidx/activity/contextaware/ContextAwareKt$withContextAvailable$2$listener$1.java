package androidx.activity.contextaware;

import android.content.Context;
import kotlin.jvm.internal.OooOo;
import o00O0.o000OOo;
import o00O0Oo.Oooo000;
import o00O0oOo.o0Oo0oo;

/* loaded from: classes.dex */
public final class ContextAwareKt$withContextAvailable$2$listener$1 implements OnContextAvailableListener {
    final /* synthetic */ o0Oo0oo $co;
    final /* synthetic */ Oooo000 $onContextAvailable;

    public ContextAwareKt$withContextAvailable$2$listener$1(o0Oo0oo o0oo0oo, Oooo000 oooo000) {
        this.$co = o0oo0oo;
        this.$onContextAvailable = oooo000;
    }

    @Override // androidx.activity.contextaware.OnContextAvailableListener
    public void onContextAvailable(Context context) {
        Object objOooO0O0;
        OooOo.OooO0o0(context, "context");
        o0Oo0oo o0oo0oo = this.$co;
        try {
            objOooO0O0 = this.$onContextAvailable.invoke(context);
        } catch (Throwable th) {
            objOooO0O0 = o000OOo.OooO0O0(th);
        }
        o0oo0oo.resumeWith(objOooO0O0);
    }
}
