package com.ironsource;

import com.ironsource.mediationsdk.C3368d;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.nb */
/* loaded from: classes2.dex */
public final class C3448nb implements InterfaceC3460nn<String, C3368d.a> {
    @Override // com.ironsource.InterfaceC3460nn
    /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public C3368d.a mo8213a(String input) throws JSONException {
        kotlin.jvm.internal.OooOo.OooO0o0(input, "input");
        C3368d.a aVarM10128a = C3368d.m10127b().m10128a(new JSONObject(input));
        kotlin.jvm.internal.OooOo.OooO0Oo(aVarM10128a, "getInstance().getAuction…sponse(JSONObject(input))");
        return aVarM10128a;
    }
}
