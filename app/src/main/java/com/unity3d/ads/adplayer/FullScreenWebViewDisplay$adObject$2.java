package com.unity3d.ads.adplayer;

import com.google.android.gms.internal.measurement.o0OOO0;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.repository.AdRepository;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import java.util.UUID;
import kotlin.jvm.internal.OooOo;
import kotlin.jvm.internal.Oooo000;
import o00O0.o000OOo;
import o00O0Oo.OooO0O0;
import oo00o.OooO0OO;
import oo00o.OooO0o;
import oo00o.OooOO0O;

/* loaded from: classes2.dex */
public final class FullScreenWebViewDisplay$adObject$2 extends Oooo000 implements OooO0O0 {
    final /* synthetic */ FullScreenWebViewDisplay this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FullScreenWebViewDisplay$adObject$2(FullScreenWebViewDisplay fullScreenWebViewDisplay) {
        super(0);
        this.this$0 = fullScreenWebViewDisplay;
    }

    private static final AdRepository invoke$lambda$0(OooO0OO oooO0OO) {
        return (AdRepository) oooO0OO.getValue();
    }

    @Override // o00O0Oo.OooO0O0
    public final AdObject invoke() {
        Object objOooO0O0;
        OooO0OO OooO0oO2 = o0OOO0.OooO0oO(OooO0o.f33184OooOo0o, new C3963x376b6040(this.this$0, ""));
        FullScreenWebViewDisplay fullScreenWebViewDisplay = this.this$0;
        try {
            AdRepository adRepositoryInvoke$lambda$0 = invoke$lambda$0(OooO0oO2);
            UUID uuidFromString = UUID.fromString(fullScreenWebViewDisplay.opportunityId);
            OooOo.OooO0Oo(uuidFromString, "fromString(opportunityId)");
            objOooO0O0 = adRepositoryInvoke$lambda$0.getAd(ProtobufExtensionsKt.toByteString(uuidFromString));
        } catch (Throwable th) {
            objOooO0O0 = o000OOo.OooO0O0(th);
        }
        if (objOooO0O0 instanceof OooOO0O) {
            objOooO0O0 = null;
        }
        return (AdObject) objOooO0O0;
    }
}
