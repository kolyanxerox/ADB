package com.ironsource;

import android.text.TextUtils;
import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.ArrayList;
import org.json.JSONObject;

/* renamed from: com.ironsource.jw */
/* loaded from: classes2.dex */
public class C3271jw {

    /* renamed from: b */
    private NetworkSettings f9185b;

    /* renamed from: a */
    private ArrayList<String> f9184a = new ArrayList<>();

    /* renamed from: c */
    private JSONObject f9186c = null;

    /* renamed from: d */
    private boolean f9187d = true;

    /* renamed from: a */
    public static C3271jw m9546a() {
        return new C3271jw();
    }

    /* renamed from: b */
    public JSONObject m9551b() {
        return this.f9186c;
    }

    /* renamed from: c */
    public NetworkSettings m9552c() {
        return this.f9185b;
    }

    /* renamed from: d */
    public ArrayList<String> m9553d() {
        return this.f9184a;
    }

    /* renamed from: e */
    public boolean m9554e() {
        return this.f9187d;
    }

    /* renamed from: a */
    public void m9547a(NetworkSettings networkSettings) {
        this.f9185b = networkSettings;
    }

    /* renamed from: a */
    public void m9548a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f9184a.add(str);
    }

    /* renamed from: a */
    public void m9549a(JSONObject jSONObject) {
        this.f9186c = jSONObject;
    }

    /* renamed from: a */
    public void m9550a(boolean z) {
        this.f9187d = z;
    }
}
