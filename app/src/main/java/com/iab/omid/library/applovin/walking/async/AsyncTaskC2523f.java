package com.iab.omid.library.applovin.walking.async;

import android.text.TextUtils;
import com.iab.omid.library.applovin.adsession.C2480a;
import com.iab.omid.library.applovin.internal.C2490c;
import com.iab.omid.library.applovin.utils.C2507c;
import com.iab.omid.library.applovin.walking.async.AbstractAsyncTaskC2519b;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.applovin.walking.async.f */
/* loaded from: classes2.dex */
public class AsyncTaskC2523f extends AbstractAsyncTaskC2518a {
    public AsyncTaskC2523f(AbstractAsyncTaskC2519b.b bVar, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(bVar, hashSet, jSONObject, j);
    }

    /* renamed from: b */
    private void m4230b(String str) {
        C2490c c2490cM4029c = C2490c.m4029c();
        if (c2490cM4029c != null) {
            for (C2480a c2480a : c2490cM4029c.m4032b()) {
                if (this.f3565c.contains(c2480a.m3986c())) {
                    c2480a.m3987d().m4112b(str, this.f3567e);
                }
            }
        }
    }

    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public String doInBackground(Object... objArr) {
        if (C2507c.m4150h(this.f3566d, this.f3569b.mo4223a())) {
            return null;
        }
        this.f3569b.mo4224a(this.f3566d);
        return this.f3566d.toString();
    }

    @Override // com.iab.omid.library.applovin.walking.async.AbstractAsyncTaskC2519b, android.os.AsyncTask
    /* renamed from: a */
    public void onPostExecute(String str) {
        if (!TextUtils.isEmpty(str)) {
            m4230b(str);
        }
        super.onPostExecute(str);
    }
}
