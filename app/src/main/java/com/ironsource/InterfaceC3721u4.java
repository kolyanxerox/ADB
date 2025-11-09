package com.ironsource;

import com.ironsource.mediationsdk.demandOnly.InterfaceC3385p;
import org.json.JSONObject;

/* renamed from: com.ironsource.u4 */
/* loaded from: classes2.dex */
public interface InterfaceC3721u4 {

    /* renamed from: com.ironsource.u4$a */
    public static final class a implements InterfaceC3721u4 {

        /* renamed from: a */
        private final JSONObject f12144a;

        public a() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // com.ironsource.InterfaceC3721u4
        /* renamed from: a */
        public InterfaceC3385p mo12539a(String instanceId) {
            kotlin.jvm.internal.OooOo.OooO0o0(instanceId, "instanceId");
            JSONObject jSONObject = this.f12144a;
            JSONObject jSONObjectOptJSONObject = jSONObject != null ? jSONObject.optJSONObject(instanceId) : null;
            String strOptString = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optString("plumbus") : null;
            return strOptString != null ? new InterfaceC3385p.a(strOptString) : new InterfaceC3385p.b();
        }

        public a(JSONObject jSONObject) {
            this.f12144a = jSONObject;
        }

        public /* synthetic */ a(JSONObject jSONObject, int i, kotlin.jvm.internal.OooOO0O oooOO0O) {
            this((i & 1) != 0 ? new JSONObject() : jSONObject);
        }
    }

    /* renamed from: a */
    InterfaceC3385p mo12539a(String str);
}
