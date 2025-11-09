package com.unity3d.services.core.p012di;

import kotlin.jvm.internal.OooOo;
import kotlin.jvm.internal.Oooo000;
import o00O0Oo.OooO0O0;
import oo00o.OooO0OO;
import oo00o.OooO0o;

/* loaded from: classes3.dex */
public final class IServiceComponentKt {

    /* renamed from: com.unity3d.services.core.di.IServiceComponentKt$inject$1 */
    public static final class C43171 extends Oooo000 implements OooO0O0 {
        final /* synthetic */ String $named;
        final /* synthetic */ IServiceComponent $this_inject;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C43171(IServiceComponent iServiceComponent, String str) {
            super(0);
            this.$this_inject = iServiceComponent;
            this.$named = str;
        }

        @Override // o00O0Oo.OooO0O0
        public final T invoke() {
            this.$this_inject.getServiceProvider().getRegistry();
            OooOo.OooOO0O();
            throw null;
        }
    }

    public static final <T> T get(IServiceComponent iServiceComponent, String named) {
        OooOo.OooO0o0(iServiceComponent, "<this>");
        OooOo.OooO0o0(named, "named");
        iServiceComponent.getServiceProvider().getRegistry();
        OooOo.OooOO0O();
        throw null;
    }

    public static Object get$default(IServiceComponent iServiceComponent, String named, int i, Object obj) {
        if ((i & 1) != 0) {
            named = "";
        }
        OooOo.OooO0o0(iServiceComponent, "<this>");
        OooOo.OooO0o0(named, "named");
        iServiceComponent.getServiceProvider().getRegistry();
        OooOo.OooOO0O();
        throw null;
    }

    public static final <T> OooO0OO inject(IServiceComponent iServiceComponent, String named, OooO0o mode) {
        OooOo.OooO0o0(iServiceComponent, "<this>");
        OooOo.OooO0o0(named, "named");
        OooOo.OooO0o0(mode, "mode");
        OooOo.OooOO0O();
        throw null;
    }

    public static OooO0OO inject$default(IServiceComponent iServiceComponent, String named, OooO0o mode, int i, Object obj) {
        if ((i & 1) != 0) {
            named = "";
        }
        if ((i & 2) != 0) {
            mode = OooO0o.f33184OooOo0o;
        }
        OooOo.OooO0o0(iServiceComponent, "<this>");
        OooOo.OooO0o0(named, "named");
        OooOo.OooO0o0(mode, "mode");
        OooOo.OooOO0O();
        throw null;
    }
}
