package com.unity3d.ads.adplayer;

import com.unity3d.ads.core.data.repository.AdRepository;
import com.unity3d.services.core.p012di.IServiceComponent;
import kotlin.jvm.internal.Oooo000;
import kotlin.jvm.internal.o0OO00O;
import o00O0Oo.OooO0O0;

/* renamed from: com.unity3d.ads.adplayer.FullScreenWebViewDisplay$adObject$2$invoke$$inlined$inject$default$1 */
/* loaded from: classes2.dex */
public final class C3963x376b6040 extends Oooo000 implements OooO0O0 {
    final /* synthetic */ String $named;
    final /* synthetic */ IServiceComponent $this_inject;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3963x376b6040(IServiceComponent iServiceComponent, String str) {
        super(0);
        this.$this_inject = iServiceComponent;
        this.$named = str;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.unity3d.ads.core.data.repository.AdRepository, java.lang.Object] */
    @Override // o00O0Oo.OooO0O0
    public final AdRepository invoke() {
        IServiceComponent iServiceComponent = this.$this_inject;
        return iServiceComponent.getServiceProvider().getRegistry().getService(this.$named, o0OO00O.OooO00o(AdRepository.class));
    }
}
