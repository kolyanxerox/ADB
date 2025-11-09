package com.iab.omid.library.ironsrc.walking.async;

import com.iab.omid.library.ironsrc.walking.async.AbstractAsyncTaskC2570b;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.ironsrc.walking.async.a */
/* loaded from: classes2.dex */
public abstract class AbstractAsyncTaskC2569a extends AbstractAsyncTaskC2570b {

    /* renamed from: c */
    protected final HashSet<String> f3700c;

    /* renamed from: d */
    protected final JSONObject f3701d;

    /* renamed from: e */
    protected final long f3702e;

    public AbstractAsyncTaskC2569a(AbstractAsyncTaskC2570b.b bVar, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(bVar);
        this.f3700c = new HashSet<>(hashSet);
        this.f3701d = jSONObject;
        this.f3702e = j;
    }
}
