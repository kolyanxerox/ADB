package com.iab.omid.library.ironsrc.walking;

import androidx.annotation.VisibleForTesting;
import com.iab.omid.library.ironsrc.walking.async.AbstractAsyncTaskC2570b;
import com.iab.omid.library.ironsrc.walking.async.AsyncTaskC2572d;
import com.iab.omid.library.ironsrc.walking.async.AsyncTaskC2573e;
import com.iab.omid.library.ironsrc.walking.async.AsyncTaskC2574f;
import com.iab.omid.library.ironsrc.walking.async.C2571c;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.ironsrc.walking.b */
/* loaded from: classes2.dex */
public class C2575b implements AbstractAsyncTaskC2570b.b {

    /* renamed from: a */
    private JSONObject f3709a;

    /* renamed from: b */
    private final C2571c f3710b;

    public C2575b(C2571c c2571c) {
        this.f3710b = c2571c;
    }

    @Override // com.iab.omid.library.ironsrc.walking.async.AbstractAsyncTaskC2570b.b
    @VisibleForTesting
    /* renamed from: a */
    public JSONObject mo4476a() {
        return this.f3709a;
    }

    /* renamed from: b */
    public void m4486b() {
        this.f3710b.m4479b(new AsyncTaskC2572d(this));
    }

    @Override // com.iab.omid.library.ironsrc.walking.async.AbstractAsyncTaskC2570b.b
    @VisibleForTesting
    /* renamed from: a */
    public void mo4477a(JSONObject jSONObject) {
        this.f3709a = jSONObject;
    }

    /* renamed from: b */
    public void m4487b(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.f3710b.m4479b(new AsyncTaskC2574f(this, hashSet, jSONObject, j));
    }

    /* renamed from: a */
    public void m4485a(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.f3710b.m4479b(new AsyncTaskC2573e(this, hashSet, jSONObject, j));
    }
}
