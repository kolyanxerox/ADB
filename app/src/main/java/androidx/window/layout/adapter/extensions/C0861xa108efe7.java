package androidx.window.layout.adapter.extensions;

import androidx.window.extensions.layout.WindowLayoutInfo;
import kotlin.jvm.internal.OooOo00;
import o00O0Oo.Oooo000;
import oo00o.OooOo;

/* renamed from: androidx.window.layout.adapter.extensions.ExtensionWindowBackendApi1$registerLayoutChangeCallback$1$2$disposableToken$1 */
/* loaded from: classes.dex */
public /* synthetic */ class C0861xa108efe7 extends OooOo00 implements Oooo000 {
    public C0861xa108efe7(Object obj) {
        super(1, obj, MulticastConsumer.class, "accept", "accept(Landroidx/window/extensions/layout/WindowLayoutInfo;)V", 0);
    }

    @Override // o00O0Oo.Oooo000
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((WindowLayoutInfo) obj);
        return OooOo.f33195OooO00o;
    }

    public final void invoke(WindowLayoutInfo p0) {
        kotlin.jvm.internal.OooOo.OooO0o0(p0, "p0");
        ((MulticastConsumer) this.receiver).accept(p0);
    }
}
