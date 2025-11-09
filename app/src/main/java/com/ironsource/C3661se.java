package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.metadata.C3401a;
import java.util.ArrayList;
import org.json.JSONObject;

/* renamed from: com.ironsource.se */
/* loaded from: classes2.dex */
public final class C3661se {

    /* renamed from: a */
    private final C3190hk f11867a;

    public C3661se(C3190hk globalDataWriter) {
        kotlin.jvm.internal.OooOo.OooO0o0(globalDataWriter, "globalDataWriter");
        this.f11867a = globalDataWriter;
    }

    /* renamed from: a */
    public final void m12273a(JSONObject metaDataJson) {
        kotlin.jvm.internal.OooOo.OooO0o0(metaDataJson, "metaDataJson");
        if (metaDataJson.has(C3401a.f9922i)) {
            try {
                Object objRemove = metaDataJson.remove(C3401a.f9922i);
                kotlin.jvm.internal.OooOo.OooO0OO(objRemove, "null cannot be cast to non-null type java.util.ArrayList<*>{ kotlin.collections.TypeAliasesKt.ArrayList<*> }");
                ArrayList arrayList = (ArrayList) objRemove;
                if (arrayList.isEmpty()) {
                    return;
                }
                Object obj = arrayList.get(0);
                kotlin.jvm.internal.OooOo.OooO0OO(obj, "null cannot be cast to non-null type kotlin.String");
                this.f11867a.m9148e((String) obj);
            } catch (ClassCastException e) {
                C3551q9.m11517d().m11519a(e);
                IronLog.INTERNAL.error("got the following error " + e.getMessage());
            }
        }
    }
}
