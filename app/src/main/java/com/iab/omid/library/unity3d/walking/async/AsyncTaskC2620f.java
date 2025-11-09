package com.iab.omid.library.unity3d.walking.async;

import android.text.TextUtils;
import com.iab.omid.library.unity3d.adsession.C2580a;
import com.iab.omid.library.unity3d.internal.C2590c;
import com.iab.omid.library.unity3d.utils.C2605c;
import com.iab.omid.library.unity3d.walking.async.AbstractAsyncTaskC2616b;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.unity3d.walking.async.f */
/* loaded from: classes2.dex */
public class AsyncTaskC2620f extends AbstractAsyncTaskC2615a {
    public AsyncTaskC2620f(AbstractAsyncTaskC2616b.b bVar, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(bVar, hashSet, jSONObject, j);
    }

    /* renamed from: b */
    private void m4717b(String str) {
        C2590c c2590cM4538c = C2590c.m4538c();
        if (c2590cM4538c != null) {
            for (C2580a c2580a : c2590cM4538c.m4541b()) {
                if (this.f3828c.contains(c2580a.getAdSessionId())) {
                    c2580a.getAdSessionStatePublisher().m4607b(str, this.f3830e);
                }
            }
        }
    }

    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public String doInBackground(Object... objArr) {
        if (C2605c.m4643h(this.f3829d, this.f3832b.mo4710a())) {
            return null;
        }
        this.f3832b.mo4711a(this.f3829d);
        return this.f3829d.toString();
    }

    @Override // com.iab.omid.library.unity3d.walking.async.AbstractAsyncTaskC2616b, android.os.AsyncTask
    /* renamed from: a */
    public void onPostExecute(String str) {
        if (!TextUtils.isEmpty(str)) {
            m4717b(str);
        }
        super.onPostExecute(str);
    }
}
