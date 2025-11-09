package com.google.android.gms.internal.ads;

import com.ironsource.C3034d9;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.je */
/* loaded from: classes2.dex */
public final /* synthetic */ class C1712je implements wk0 {

    /* renamed from: OooO00o */
    public final /* synthetic */ int f20291OooO00o;

    /* renamed from: OooO0O0 */
    public final /* synthetic */ Object f20292OooO0O0;

    /* renamed from: OooO0OO */
    public final /* synthetic */ Object f20293OooO0OO;

    public /* synthetic */ C1712je(int i, Object obj, Object obj2) {
        this.f20291OooO00o = i;
        this.f20292OooO0O0 = obj;
        this.f20293OooO0OO = obj2;
    }

    @Override // com.google.android.gms.internal.ads.wk0
    public final Object apply(Object obj) {
        switch (this.f20291OooO00o) {
            case 0:
                InterfaceC2266yd interfaceC2266yd = (InterfaceC2266yd) obj;
                interfaceC2266yd.OooOO0((String) this.f20292OooO0O0, (InterfaceC2042sb) this.f20293OooO0OO);
                return interfaceC2266yd;
            default:
                List list = (List) obj;
                b00 b00Var = (b00) this.f20292OooO0O0;
                b00Var.getClass();
                if (list == null || list.isEmpty()) {
                    return null;
                }
                JSONObject jSONObject = (JSONObject) this.f20293OooO0OO;
                String strOptString = jSONObject.optString(C3034d9.h.f8077K0);
                Integer numOooO0Oo = b00.OooO0Oo("bg_color", jSONObject);
                Integer numOooO0Oo2 = b00.OooO0Oo("text_color", jSONObject);
                int iOptInt = jSONObject.optInt("text_size", -1);
                jSONObject.optBoolean("allow_pub_rendering");
                return new BinderC2224x8(strOptString, list, numOooO0Oo, numOooO0Oo2, iOptInt > 0 ? Integer.valueOf(iOptInt) : null, jSONObject.optInt("animation_ms", 1000) + jSONObject.optInt("presentation_ms", 4000), b00Var.f17151OooO0oo.zze);
        }
    }
}
