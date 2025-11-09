package com.iab.omid.library.applovin.walking;

import androidx.annotation.VisibleForTesting;
import com.iab.omid.library.applovin.walking.async.AbstractAsyncTaskC2519b;
import com.iab.omid.library.applovin.walking.async.AsyncTaskC2521d;
import com.iab.omid.library.applovin.walking.async.AsyncTaskC2522e;
import com.iab.omid.library.applovin.walking.async.AsyncTaskC2523f;
import com.iab.omid.library.applovin.walking.async.C2520c;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.applovin.walking.b */
/* loaded from: classes2.dex */
public class C2524b implements AbstractAsyncTaskC2519b.b {

    /* renamed from: a */
    private JSONObject f3574a;

    /* renamed from: b */
    private final C2520c f3575b;

    public C2524b(C2520c c2520c) {
        this.f3575b = c2520c;
    }

    @Override // com.iab.omid.library.applovin.walking.async.AbstractAsyncTaskC2519b.b
    @VisibleForTesting
    /* renamed from: a */
    public JSONObject mo4223a() {
        return this.f3574a;
    }

    /* renamed from: b */
    public void m4233b() {
        this.f3575b.m4226b(new AsyncTaskC2521d(this));
    }

    @Override // com.iab.omid.library.applovin.walking.async.AbstractAsyncTaskC2519b.b
    @VisibleForTesting
    /* renamed from: a */
    public void mo4224a(JSONObject jSONObject) {
        this.f3574a = jSONObject;
    }

    /* renamed from: b */
    public void m4234b(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.f3575b.m4226b(new AsyncTaskC2523f(this, hashSet, jSONObject, j));
    }

    /* renamed from: a */
    public void m4232a(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.f3575b.m4226b(new AsyncTaskC2522e(this, hashSet, jSONObject, j));
    }
}
