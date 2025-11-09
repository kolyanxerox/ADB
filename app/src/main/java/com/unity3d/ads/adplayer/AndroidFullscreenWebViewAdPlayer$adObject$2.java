package com.unity3d.ads.adplayer;

import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.repository.AdRepository;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import java.util.UUID;
import kotlin.jvm.internal.OooOo;
import kotlin.jvm.internal.Oooo000;
import o00O0.o000OOo;
import o00O0Oo.OooO0O0;
import oo00o.OooOO0O;

/* loaded from: classes2.dex */
public final class AndroidFullscreenWebViewAdPlayer$adObject$2 extends Oooo000 implements OooO0O0 {
    final /* synthetic */ AndroidFullscreenWebViewAdPlayer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidFullscreenWebViewAdPlayer$adObject$2(AndroidFullscreenWebViewAdPlayer androidFullscreenWebViewAdPlayer) {
        super(0);
        this.this$0 = androidFullscreenWebViewAdPlayer;
    }

    @Override // o00O0Oo.OooO0O0
    public final AdObject invoke() {
        Object objOooO0O0;
        AndroidFullscreenWebViewAdPlayer androidFullscreenWebViewAdPlayer = this.this$0;
        try {
            AdRepository adRepository = androidFullscreenWebViewAdPlayer.adRepository;
            UUID uuidFromString = UUID.fromString(androidFullscreenWebViewAdPlayer.opportunityId);
            OooOo.OooO0Oo(uuidFromString, "fromString(opportunityId)");
            objOooO0O0 = adRepository.getAd(ProtobufExtensionsKt.toByteString(uuidFromString));
        } catch (Throwable th) {
            objOooO0O0 = o000OOo.OooO0O0(th);
        }
        if (objOooO0O0 instanceof OooOO0O) {
            objOooO0O0 = null;
        }
        return (AdObject) objOooO0O0;
    }
}
