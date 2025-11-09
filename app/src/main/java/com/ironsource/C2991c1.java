package com.ironsource;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ironsource.c1 */
/* loaded from: classes2.dex */
public final class C2991c1 implements InterfaceC3026d1 {

    /* renamed from: b */
    public static final a f7675b = new a(null);

    /* renamed from: c */
    private static final String f7676c = "ext_";

    /* renamed from: a */
    private final Map<String, String> f7677a = new HashMap();

    /* renamed from: com.ironsource.c1$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.OooOO0O oooOO0O) {
            this();
        }
    }

    @Override // com.ironsource.InterfaceC3026d1
    /* renamed from: a */
    public void mo8068a(String key, String value) {
        kotlin.jvm.internal.OooOo.OooO0o0(key, "key");
        kotlin.jvm.internal.OooOo.OooO0o0(value, "value");
        this.f7677a.put(key, value);
    }

    @Override // com.ironsource.InterfaceC3026d1
    /* renamed from: b */
    public void mo8070b(String key, String value) {
        kotlin.jvm.internal.OooOo.OooO0o0(key, "key");
        kotlin.jvm.internal.OooOo.OooO0o0(value, "value");
        this.f7677a.put("ext_".concat(key), value);
    }

    @Override // com.ironsource.InterfaceC3026d1
    public Map<String, String> get() {
        return this.f7677a;
    }

    @Override // com.ironsource.InterfaceC3026d1
    /* renamed from: a */
    public void mo8069a(HashMap<String, String> params) {
        kotlin.jvm.internal.OooOo.OooO0o0(params, "params");
        this.f7677a.putAll(params);
    }
}
