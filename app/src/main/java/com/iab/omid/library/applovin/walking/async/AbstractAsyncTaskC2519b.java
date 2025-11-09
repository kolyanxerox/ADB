package com.iab.omid.library.applovin.walking.async;

import android.os.AsyncTask;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.applovin.walking.async.b */
/* loaded from: classes2.dex */
public abstract class AbstractAsyncTaskC2519b extends AsyncTask<Object, Void, String> {

    /* renamed from: a */
    private a f3568a;

    /* renamed from: b */
    protected final b f3569b;

    /* renamed from: com.iab.omid.library.applovin.walking.async.b$a */
    public interface a {
        /* renamed from: a */
        void mo4222a(AbstractAsyncTaskC2519b abstractAsyncTaskC2519b);
    }

    /* renamed from: com.iab.omid.library.applovin.walking.async.b$b */
    public interface b {
        /* renamed from: a */
        JSONObject mo4223a();

        /* renamed from: a */
        void mo4224a(JSONObject jSONObject);
    }

    public AbstractAsyncTaskC2519b(b bVar) {
        this.f3569b = bVar;
    }

    /* renamed from: a */
    public void m4219a(a aVar) {
        this.f3568a = aVar;
    }

    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        a aVar = this.f3568a;
        if (aVar != null) {
            aVar.mo4222a(this);
        }
    }

    /* renamed from: a */
    public void m4221a(ThreadPoolExecutor threadPoolExecutor) {
        executeOnExecutor(threadPoolExecutor, new Object[0]);
    }
}
