package androidx.datastore.core;

import java.io.File;
import kotlin.jvm.internal.Oooo000;
import o00O0.o000OOo;
import o00O0oo.o00oOoo;
import oo00o.OooOo;

/* loaded from: classes.dex */
public final class MulticastFileObserver$Companion$observe$1$flowObserver$1 extends Oooo000 implements o00O0Oo.Oooo000 {
    final /* synthetic */ o00oOoo $$this$channelFlow;
    final /* synthetic */ File $file;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MulticastFileObserver$Companion$observe$1$flowObserver$1(File file, o00oOoo o00oooo) {
        super(1);
        this.$file = file;
        this.$$this$channelFlow = o00oooo;
    }

    @Override // o00O0Oo.Oooo000
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((String) obj);
        return OooOo.f33195OooO00o;
    }

    public final void invoke(String str) {
        if (kotlin.jvm.internal.OooOo.OooO00o(str, this.$file.getName())) {
            o000OOo.OooOO0o(this.$$this$channelFlow, OooOo.f33195OooO00o);
        }
    }
}
