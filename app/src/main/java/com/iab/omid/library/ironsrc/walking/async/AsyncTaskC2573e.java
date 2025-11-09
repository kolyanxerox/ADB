package com.iab.omid.library.ironsrc.walking.async;

import com.iab.omid.library.ironsrc.adsession.C2531a;
import com.iab.omid.library.ironsrc.internal.C2541c;
import com.iab.omid.library.ironsrc.walking.async.AbstractAsyncTaskC2570b;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.ironsrc.walking.async.e */
/* loaded from: classes2.dex */
public class AsyncTaskC2573e extends AbstractAsyncTaskC2569a {
    public AsyncTaskC2573e(AbstractAsyncTaskC2570b.b bVar, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(bVar, hashSet, jSONObject, j);
    }

    /* renamed from: b */
    private void m4481b(String str) {
        C2541c c2541cM4282c = C2541c.m4282c();
        if (c2541cM4282c != null) {
            for (C2531a c2531a : c2541cM4282c.m4285b()) {
                if (this.f3700c.contains(c2531a.getAdSessionId())) {
                    c2531a.getAdSessionStatePublisher().m4359a(str, this.f3702e);
                }
            }
        }
    }

    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public String doInBackground(Object... objArr) {
        return this.f3701d.toString();
    }

    @Override // com.iab.omid.library.ironsrc.walking.async.AbstractAsyncTaskC2570b, android.os.AsyncTask
    /* renamed from: a */
    public void onPostExecute(String str) {
        m4481b(str);
        super.onPostExecute(str);
    }
}
