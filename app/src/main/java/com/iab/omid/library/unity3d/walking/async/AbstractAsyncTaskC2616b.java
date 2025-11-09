package com.iab.omid.library.unity3d.walking.async;

import android.os.AsyncTask;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.unity3d.walking.async.b */
/* loaded from: classes2.dex */
public abstract class AbstractAsyncTaskC2616b extends AsyncTask<Object, Void, String> {

    /* renamed from: a */
    private a f3831a;

    /* renamed from: b */
    protected final b f3832b;

    /* renamed from: com.iab.omid.library.unity3d.walking.async.b$a */
    public interface a {
        /* renamed from: a */
        void mo4709a(AbstractAsyncTaskC2616b abstractAsyncTaskC2616b);
    }

    /* renamed from: com.iab.omid.library.unity3d.walking.async.b$b */
    public interface b {
        /* renamed from: a */
        JSONObject mo4710a();

        /* renamed from: a */
        void mo4711a(JSONObject jSONObject);
    }

    public AbstractAsyncTaskC2616b(b bVar) {
        this.f3832b = bVar;
    }

    /* renamed from: a */
    public void m4706a(a aVar) {
        this.f3831a = aVar;
    }

    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        a aVar = this.f3831a;
        if (aVar != null) {
            aVar.mo4709a(this);
        }
    }

    /* renamed from: a */
    public void m4708a(ThreadPoolExecutor threadPoolExecutor) {
        executeOnExecutor(threadPoolExecutor, new Object[0]);
    }
}
