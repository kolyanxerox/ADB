package com.ironsource;

import org.json.JSONObject;

/* renamed from: com.ironsource.bl */
/* loaded from: classes2.dex */
public final class C2976bl implements InterfaceC3536pt<JSONObject> {

    /* renamed from: a */
    private final InterfaceC3536pt<String> f7604a;

    public C2976bl(InterfaceC3536pt<String> serverResponse) {
        kotlin.jvm.internal.OooOo.OooO0o0(serverResponse, "serverResponse");
        this.f7604a = serverResponse;
    }

    @Override // com.ironsource.InterfaceC3536pt
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject mo7938a() {
        return new JSONObject(this.f7604a.mo7938a());
    }
}
