package com.ironsource;

import com.ironsource.mediationsdk.model.BasePlacement;

/* renamed from: com.ironsource.h7 */
/* loaded from: classes2.dex */
public class C3177h7 extends BasePlacement {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3177h7(int i, String placementName, boolean z, C3463nq c3463nq) {
        super(i, placementName, z, c3463nq);
        kotlin.jvm.internal.OooOo.OooO0o0(placementName, "placementName");
    }

    @Override // com.ironsource.mediationsdk.model.BasePlacement
    public String toString() {
        return super.toString() + ", placementId: " + getPlacementId();
    }
}
