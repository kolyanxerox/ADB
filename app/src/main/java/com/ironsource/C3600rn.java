package com.ironsource;

import com.ironsource.sdk.utils.IronSourceStorageUtils;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.ironsource.rn */
/* loaded from: classes2.dex */
public class C3600rn {

    /* renamed from: a */
    private String f11201a;

    public C3600rn(String str) {
        this.f11201a = str;
    }

    /* renamed from: a */
    private C3769vh m11736a() throws Exception {
        C3769vh c3769vh = new C3769vh(this.f11201a, "metadata.json");
        if (!c3769vh.exists()) {
            m11737a(c3769vh);
        }
        return c3769vh;
    }

    /* renamed from: b */
    public synchronized JSONObject m11742b() throws Exception {
        return new JSONObject(IronSourceStorageUtils.readFile(m11736a()));
    }

    /* renamed from: a */
    private void m11737a(C3769vh c3769vh) throws Exception {
        IronSourceStorageUtils.saveFile(new JSONObject().toString().getBytes(), c3769vh.getPath());
    }

    /* renamed from: b */
    public synchronized boolean m11743b(String str, JSONObject jSONObject) throws Exception {
        JSONObject jSONObjectM11742b;
        try {
            jSONObjectM11742b = m11742b();
            JSONObject jSONObjectOptJSONObject = jSONObjectM11742b.optJSONObject(str);
            if (jSONObjectOptJSONObject != null) {
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    jSONObjectOptJSONObject.putOpt(next, jSONObject.opt(next));
                }
            } else {
                jSONObjectM11742b.putOpt(str, jSONObject);
            }
        } catch (Throwable th) {
            throw th;
        }
        return m11738a(jSONObjectM11742b);
    }

    /* renamed from: a */
    public synchronized boolean m11739a(String str) throws Exception {
        JSONObject jSONObjectM11742b = m11742b();
        if (!jSONObjectM11742b.has(str)) {
            return true;
        }
        jSONObjectM11742b.remove(str);
        return m11738a(jSONObjectM11742b);
    }

    /* renamed from: a */
    public synchronized boolean m11740a(String str, JSONObject jSONObject) throws Exception {
        JSONObject jSONObjectM11742b;
        jSONObjectM11742b = m11742b();
        jSONObjectM11742b.put(str, jSONObject);
        return m11738a(jSONObjectM11742b);
    }

    /* renamed from: a */
    public boolean m11741a(ArrayList<C3769vh> arrayList) throws Exception {
        int size = arrayList.size();
        boolean z = true;
        int i = 0;
        while (i < size) {
            C3769vh c3769vh = arrayList.get(i);
            i++;
            if (!m11739a(c3769vh.getName())) {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: a */
    private boolean m11738a(JSONObject jSONObject) throws Exception {
        return IronSourceStorageUtils.saveFile(jSONObject.toString().getBytes(), m11736a().getPath()) != 0;
    }
}
