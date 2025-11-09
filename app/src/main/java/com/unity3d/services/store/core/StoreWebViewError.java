package com.unity3d.services.store.core;

import com.unity3d.scar.adapter.common.OooOOO0;
import com.unity3d.services.core.webview.WebViewEventCategory;
import java.util.Arrays;
import kotlin.jvm.internal.OooOo;

/* loaded from: classes3.dex */
public final class StoreWebViewError extends OooOOO0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StoreWebViewError(Enum<?> r2, String str, Object... errorArguments) {
        super(r2, str, Arrays.copyOf(errorArguments, errorArguments.length));
        OooOo.OooO0o0(errorArguments, "errorArguments");
    }

    @Override // com.unity3d.scar.adapter.common.OooOOO0
    public String getDomain() {
        return WebViewEventCategory.STORE.name();
    }
}
