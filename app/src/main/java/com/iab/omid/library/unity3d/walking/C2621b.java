package com.iab.omid.library.unity3d.walking;

import androidx.annotation.VisibleForTesting;
import com.iab.omid.library.unity3d.walking.async.AbstractAsyncTaskC2616b;
import com.iab.omid.library.unity3d.walking.async.AsyncTaskC2618d;
import com.iab.omid.library.unity3d.walking.async.AsyncTaskC2619e;
import com.iab.omid.library.unity3d.walking.async.AsyncTaskC2620f;
import com.iab.omid.library.unity3d.walking.async.C2617c;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.unity3d.walking.b */
/* loaded from: classes2.dex */
public class C2621b implements AbstractAsyncTaskC2616b.b {

    /* renamed from: a */
    private JSONObject f3837a;

    /* renamed from: b */
    private final C2617c f3838b;

    public C2621b(C2617c c2617c) {
        this.f3838b = c2617c;
    }

    @Override // com.iab.omid.library.unity3d.walking.async.AbstractAsyncTaskC2616b.b
    @VisibleForTesting
    /* renamed from: a */
    public JSONObject mo4710a() {
        return this.f3837a;
    }

    /* renamed from: b */
    public void m4720b() {
        this.f3838b.m4713b(new AsyncTaskC2618d(this));
    }

    @Override // com.iab.omid.library.unity3d.walking.async.AbstractAsyncTaskC2616b.b
    @VisibleForTesting
    /* renamed from: a */
    public void mo4711a(JSONObject jSONObject) {
        this.f3837a = jSONObject;
    }

    /* renamed from: b */
    public void m4721b(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.f3838b.m4713b(new AsyncTaskC2620f(this, hashSet, jSONObject, j));
    }

    /* renamed from: a */
    public void m4719a(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.f3838b.m4713b(new AsyncTaskC2619e(this, hashSet, jSONObject, j));
    }
}
