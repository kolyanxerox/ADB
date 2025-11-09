package com.ironsource;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Map;

/* renamed from: com.ironsource.ba */
/* loaded from: classes2.dex */
public final class C2965ba implements InterfaceC3070ea {

    /* renamed from: a */
    private final SharedPreferences f7582a;

    /* renamed from: b */
    private final SharedPreferences.Editor f7583b;

    public C2965ba(Context context, String fileName) {
        kotlin.jvm.internal.OooOo.OooO0o0(context, "context");
        kotlin.jvm.internal.OooOo.OooO0o0(fileName, "fileName");
        SharedPreferences sharedPreferences = context.getSharedPreferences(fileName, 0);
        this.f7582a = sharedPreferences;
        this.f7583b = sharedPreferences.edit();
    }

    @Override // com.ironsource.InterfaceC3070ea
    /* renamed from: a */
    public void mo7897a(String key) {
        kotlin.jvm.internal.OooOo.OooO0o0(key, "key");
        this.f7583b.remove(key).apply();
    }

    @Override // com.ironsource.InterfaceC3070ea
    public Map<String, ?> allData() {
        Map<String, ?> all = this.f7582a.getAll();
        kotlin.jvm.internal.OooOo.OooO0Oo(all, "sharedPreferences.all");
        return all;
    }

    @Override // com.ironsource.InterfaceC3070ea
    public String getString(String key, String str) {
        kotlin.jvm.internal.OooOo.OooO0o0(key, "key");
        try {
            return this.f7582a.getString(key, str);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.ironsource.InterfaceC3070ea
    /* renamed from: a */
    public void mo7898a(String key, String value) {
        kotlin.jvm.internal.OooOo.OooO0o0(key, "key");
        kotlin.jvm.internal.OooOo.OooO0o0(value, "value");
        this.f7583b.putString(key, value).apply();
    }
}
