package com.iab.omid.library.unity3d.walking.async;

import com.iab.omid.library.unity3d.adsession.C2580a;
import com.iab.omid.library.unity3d.internal.C2590c;
import com.iab.omid.library.unity3d.walking.async.AbstractAsyncTaskC2616b;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.unity3d.walking.async.e */
/* loaded from: classes2.dex */
public class AsyncTaskC2619e extends AbstractAsyncTaskC2615a {
    public AsyncTaskC2619e(AbstractAsyncTaskC2616b.b bVar, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(bVar, hashSet, jSONObject, j);
    }

    /* renamed from: b */
    private void m4715b(String str) {
        C2590c c2590cM4538c = C2590c.m4538c();
        if (c2590cM4538c != null) {
            for (C2580a c2580a : c2590cM4538c.m4541b()) {
                if (this.f3828c.contains(c2580a.getAdSessionId())) {
                    c2580a.getAdSessionStatePublisher().m4601a(str, this.f3830e);
                }
            }
        }
    }

    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public String doInBackground(Object... objArr) {
        return this.f3829d.toString();
    }

    @Override // com.iab.omid.library.unity3d.walking.async.AbstractAsyncTaskC2616b, android.os.AsyncTask
    /* renamed from: a */
    public void onPostExecute(String str) {
        m4715b(str);
        super.onPostExecute(str);
    }
}
