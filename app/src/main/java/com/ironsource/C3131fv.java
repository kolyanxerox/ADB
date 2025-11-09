package com.ironsource;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import com.ironsource.C3034d9;
import com.ironsource.mediationsdk.testSuite.TestSuiteActivity;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.fv */
/* loaded from: classes2.dex */
public final class C3131fv {
    /* renamed from: a */
    private final SharedPreferences m8821a(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.unity3d.ad-mediation.testSuite", 0);
        kotlin.jvm.internal.OooOo.OooO0Oo(sharedPreferences, "context.getSharedPrefere…EY, Context.MODE_PRIVATE)");
        return sharedPreferences;
    }

    /* renamed from: b */
    public final String m8826b(Context context) {
        kotlin.jvm.internal.OooOo.OooO0o0(context, "context");
        return m8821a(context).getString("dataString", "");
    }

    /* renamed from: a */
    private final JSONObject m8823a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, List<String>> entry : C3573qv.f11160a.m11685d().entrySet()) {
            jSONObject.putOpt(entry.getKey(), new JSONArray((Collection) entry.getValue()));
        }
        return jSONObject;
    }

    /* renamed from: a */
    private final void m8824a(Context context, String str) {
        SharedPreferences.Editor editorEdit = m8821a(context).edit();
        kotlin.jvm.internal.OooOo.OooO0Oo(editorEdit, "getTestSuitePrefs(context).edit()");
        editorEdit.putString("dataString", str);
        editorEdit.apply();
    }

    /* renamed from: a */
    public final void m8825a(Context context, String appKey, JSONObject initResponse, String sdkVersion, String testSuiteControllerUrl, Boolean bool, boolean z) {
        kotlin.jvm.internal.OooOo.OooO0o0(context, "context");
        kotlin.jvm.internal.OooOo.OooO0o0(appKey, "appKey");
        kotlin.jvm.internal.OooOo.OooO0o0(initResponse, "initResponse");
        kotlin.jvm.internal.OooOo.OooO0o0(sdkVersion, "sdkVersion");
        kotlin.jvm.internal.OooOo.OooO0o0(testSuiteControllerUrl, "testSuiteControllerUrl");
        C3573qv c3573qv = C3573qv.f11160a;
        m8824a(context, m8822a(appKey, sdkVersion, c3573qv.m11683c(context), c3573qv.m11664a(context), c3573qv.m11678b(context), bool, initResponse, z, c3573qv.m11679b(), c3573qv.m11684c(), m8823a()));
        Intent intent = new Intent(context, (Class<?>) TestSuiteActivity.class);
        intent.setFlags(805306368);
        intent.putExtra("controllerUrl", testSuiteControllerUrl);
        context.startActivity(intent);
    }

    /* renamed from: a */
    private final String m8822a(String str, String str2, String str3, String str4, String str5, Boolean bool, JSONObject jSONObject, boolean z, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4) {
        String string = new JSONObject(o00O0.o0O0O00.OooOOo0(new oo00o.OooOO0("deviceOS", C3034d9.f7893d), new oo00o.OooOO0("appKey", str), new oo00o.OooOO0("sdkVersion", str2), new oo00o.OooOO0("bundleId", str3), new oo00o.OooOO0("appName", str4), new oo00o.OooOO0(C3034d9.i.f8168W, str5), new oo00o.OooOO0("initResponse", jSONObject), new oo00o.OooOO0("isRvManual", Boolean.valueOf(z)), new oo00o.OooOO0("generalProperties", jSONObject2), new oo00o.OooOO0("adaptersVersion", jSONObject3), new oo00o.OooOO0("metaData", jSONObject4), new oo00o.OooOO0("gdprConsent", bool))).toString();
        kotlin.jvm.internal.OooOo.OooO0Oo(string, "JSONObject(\n            …ent))\n        .toString()");
        return string;
    }
}
