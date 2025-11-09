package com.ironsource.sdk.controller;

import android.app.Activity;
import android.content.Context;
import com.ironsource.C3419mh;
import com.ironsource.C3565qn;
import com.ironsource.C3762va;
import com.ironsource.InterfaceC3761v9;
import com.ironsource.InterfaceC3795w9;
import com.ironsource.InterfaceC3829x9;
import com.ironsource.sdk.controller.InterfaceC3641f;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ironsource.sdk.controller.l */
/* loaded from: classes2.dex */
public interface InterfaceC3647l {

    /* renamed from: com.ironsource.sdk.controller.l$a */
    public interface a {
        /* renamed from: a */
        void mo11066a(InterfaceC3641f.a aVar);
    }

    /* renamed from: com.ironsource.sdk.controller.l$b */
    public interface b {
        /* renamed from: a */
        void mo11067a(C3565qn c3565qn);
    }

    /* renamed from: a */
    void mo11980a();

    /* renamed from: a */
    void mo11981a(Activity activity);

    /* renamed from: a */
    void mo11982a(Context context);

    /* renamed from: a */
    void mo11983a(InterfaceC3641f.c cVar, a aVar);

    /* renamed from: a */
    void mo11984a(C3762va c3762va);

    /* renamed from: a */
    void mo11985a(C3762va c3762va, Map<String, String> map, InterfaceC3761v9 interfaceC3761v9);

    /* renamed from: a */
    void mo11986a(C3762va c3762va, Map<String, String> map, InterfaceC3795w9 interfaceC3795w9);

    /* renamed from: a */
    void mo11989a(String str, InterfaceC3795w9 interfaceC3795w9);

    /* renamed from: a */
    void mo11990a(String str, String str2, C3762va c3762va, InterfaceC3761v9 interfaceC3761v9);

    /* renamed from: a */
    void mo11991a(String str, String str2, C3762va c3762va, InterfaceC3795w9 interfaceC3795w9);

    /* renamed from: a */
    void mo11992a(String str, String str2, C3762va c3762va, InterfaceC3829x9 interfaceC3829x9);

    /* renamed from: a */
    void mo11993a(JSONObject jSONObject);

    /* renamed from: a */
    void mo11994a(JSONObject jSONObject, InterfaceC3761v9 interfaceC3761v9);

    /* renamed from: a */
    void mo11995a(JSONObject jSONObject, InterfaceC3795w9 interfaceC3795w9);

    /* renamed from: a */
    void mo11996a(JSONObject jSONObject, InterfaceC3829x9 interfaceC3829x9);

    /* renamed from: a */
    boolean mo11997a(String str);

    /* renamed from: b */
    void mo11998b(Context context);

    /* renamed from: b */
    void mo11999b(C3762va c3762va);

    /* renamed from: b */
    void mo12000b(C3762va c3762va, Map<String, String> map, InterfaceC3795w9 interfaceC3795w9);

    /* renamed from: b */
    void mo12001b(JSONObject jSONObject);

    /* renamed from: d */
    void mo12002d();

    void destroy();

    @Deprecated
    /* renamed from: e */
    void mo12003e();

    /* renamed from: f */
    void mo12004f();

    /* renamed from: g */
    C3419mh.c mo12005g();
}
