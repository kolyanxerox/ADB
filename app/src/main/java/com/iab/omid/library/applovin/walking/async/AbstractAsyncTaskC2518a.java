package com.iab.omid.library.applovin.walking.async;

import com.iab.omid.library.applovin.walking.async.AbstractAsyncTaskC2519b;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.applovin.walking.async.a */
/* loaded from: classes2.dex */
public abstract class AbstractAsyncTaskC2518a extends AbstractAsyncTaskC2519b {

    /* renamed from: c */
    protected final HashSet<String> f3565c;

    /* renamed from: d */
    protected final JSONObject f3566d;

    /* renamed from: e */
    protected final long f3567e;

    public AbstractAsyncTaskC2518a(AbstractAsyncTaskC2519b.b bVar, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(bVar);
        this.f3565c = new HashSet<>(hashSet);
        this.f3566d = jSONObject;
        this.f3567e = j;
    }
}
