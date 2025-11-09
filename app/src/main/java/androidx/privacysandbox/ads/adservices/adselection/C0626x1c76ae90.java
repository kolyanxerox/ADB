package androidx.privacysandbox.ads.adservices.adselection;

import androidx.privacysandbox.ads.adservices.adselection.AdSelectionManagerImplCommon;
import o00O0OO0.OooO;
import o00O0OO0.OooO0OO;

@OooO(m13471c = "androidx.privacysandbox.ads.adservices.adselection.AdSelectionManagerImplCommon$Ext10Impl$Companion", m13472f = "AdSelectionManagerImplCommon.kt", m13473l = {231}, m13474m = "persistAdSelectionResult")
/* renamed from: androidx.privacysandbox.ads.adservices.adselection.AdSelectionManagerImplCommon$Ext10Impl$Companion$persistAdSelectionResult$1 */
/* loaded from: classes.dex */
public final class C0626x1c76ae90 extends OooO0OO {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AdSelectionManagerImplCommon.Ext10Impl.Companion this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0626x1c76ae90(AdSelectionManagerImplCommon.Ext10Impl.Companion companion, o00O0O0O.OooO0OO oooO0OO) {
        super(oooO0OO);
        this.this$0 = companion;
    }

    @Override // o00O0OO0.OooO00o
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.persistAdSelectionResult(null, null, this);
    }
}
