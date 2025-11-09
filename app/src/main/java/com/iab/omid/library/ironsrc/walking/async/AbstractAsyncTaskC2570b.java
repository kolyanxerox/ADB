package com.iab.omid.library.ironsrc.walking.async;

import android.os.AsyncTask;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.ironsrc.walking.async.b */
/* loaded from: classes2.dex */
public abstract class AbstractAsyncTaskC2570b extends AsyncTask<Object, Void, String> {

    /* renamed from: a */
    private a f3703a;

    /* renamed from: b */
    protected final b f3704b;

    /* renamed from: com.iab.omid.library.ironsrc.walking.async.b$a */
    public interface a {
        /* renamed from: a */
        void mo4475a(AbstractAsyncTaskC2570b abstractAsyncTaskC2570b);
    }

    /* renamed from: com.iab.omid.library.ironsrc.walking.async.b$b */
    public interface b {
        /* renamed from: a */
        JSONObject mo4476a();

        /* renamed from: a */
        void mo4477a(JSONObject jSONObject);
    }

    public AbstractAsyncTaskC2570b(b bVar) {
        this.f3704b = bVar;
    }

    /* renamed from: a */
    public void m4472a(a aVar) {
        this.f3703a = aVar;
    }

    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        a aVar = this.f3703a;
        if (aVar != null) {
            aVar.mo4475a(this);
        }
    }

    /* renamed from: a */
    public void m4474a(ThreadPoolExecutor threadPoolExecutor) {
        executeOnExecutor(threadPoolExecutor, new Object[0]);
    }
}
