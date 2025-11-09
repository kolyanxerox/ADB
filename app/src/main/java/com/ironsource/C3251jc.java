package com.ironsource;

import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.jc */
/* loaded from: classes2.dex */
public final class C3251jc {

    /* renamed from: a */
    private final ArrayList<String> f9102a = new ArrayList<>(new C3217ic().m9305a());

    /* renamed from: b */
    private final C3521pe f9103b = new C3521pe();

    /* renamed from: a */
    public final JSONObject m9474a() throws JSONException {
        JSONObject jSONObjectM11387a = this.f9103b.m11387a(this.f9102a);
        kotlin.jvm.internal.OooOo.OooO0Oo(jSONObjectM11387a, "mGlobalDataReader.getDataByKeys(mEventsKeyList)");
        return jSONObjectM11387a;
    }
}
