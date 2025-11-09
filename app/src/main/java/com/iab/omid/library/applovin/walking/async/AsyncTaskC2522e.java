package com.iab.omid.library.applovin.walking.async;

import com.iab.omid.library.applovin.adsession.C2480a;
import com.iab.omid.library.applovin.internal.C2490c;
import com.iab.omid.library.applovin.walking.async.AbstractAsyncTaskC2519b;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.applovin.walking.async.e */
/* loaded from: classes2.dex */
public class AsyncTaskC2522e extends AbstractAsyncTaskC2518a {
    public AsyncTaskC2522e(AbstractAsyncTaskC2519b.b bVar, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(bVar, hashSet, jSONObject, j);
    }

    /* renamed from: b */
    private void m4228b(String str) {
        C2490c c2490cM4029c = C2490c.m4029c();
        if (c2490cM4029c != null) {
            for (C2480a c2480a : c2490cM4029c.m4032b()) {
                if (this.f3565c.contains(c2480a.m3986c())) {
                    c2480a.m3987d().m4106a(str, this.f3567e);
                }
            }
        }
    }

    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public String doInBackground(Object... objArr) {
        return this.f3566d.toString();
    }

    @Override // com.iab.omid.library.applovin.walking.async.AbstractAsyncTaskC2519b, android.os.AsyncTask
    /* renamed from: a */
    public void onPostExecute(String str) {
        m4228b(str);
        super.onPostExecute(str);
    }
}
