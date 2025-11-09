package com.iab.omid.library.unity3d.walking.async;

import com.iab.omid.library.unity3d.walking.async.AbstractAsyncTaskC2616b;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.unity3d.walking.async.a */
/* loaded from: classes2.dex */
public abstract class AbstractAsyncTaskC2615a extends AbstractAsyncTaskC2616b {

    /* renamed from: c */
    protected final HashSet<String> f3828c;

    /* renamed from: d */
    protected final JSONObject f3829d;

    /* renamed from: e */
    protected final long f3830e;

    public AbstractAsyncTaskC2615a(AbstractAsyncTaskC2616b.b bVar, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(bVar);
        this.f3828c = new HashSet<>(hashSet);
        this.f3829d = jSONObject;
        this.f3830e = j;
    }
}
