package com.applovin.impl;

import androidx.arch.core.util.Function;
import androidx.core.util.Consumer;
import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.f5 */
/* loaded from: classes.dex */
public class C1026f5 {

    /* renamed from: a */
    private final JSONObject f741a;

    /* renamed from: b */
    private final Object f742b = new Object();

    public C1026f5(JSONObject jSONObject) {
        this.f741a = jSONObject;
    }

    /* renamed from: a */
    public JSONObject m730a() {
        JSONObject jSONObjectDeepCopy;
        synchronized (this.f742b) {
            jSONObjectDeepCopy = JsonUtils.deepCopy(this.f741a);
        }
        return jSONObjectDeepCopy;
    }

    /* renamed from: b */
    public List m737b(String str, List list) {
        List<String> stringList;
        synchronized (this.f742b) {
            stringList = JsonUtils.getStringList(this.f741a, str, list);
        }
        return stringList;
    }

    /* renamed from: c */
    public void m741c(String str) {
        synchronized (this.f742b) {
            this.f741a.remove(str);
        }
    }

    public String toString() {
        String string;
        synchronized (this.f742b) {
            string = this.f741a.toString();
        }
        return string;
    }

    /* renamed from: a */
    public boolean m735a(String str) {
        boolean zHas;
        synchronized (this.f742b) {
            zHas = this.f741a.has(str);
        }
        return zHas;
    }

    /* renamed from: b */
    public Object m736b(String str) {
        Object objOpt;
        synchronized (this.f742b) {
            objOpt = this.f741a.opt(str);
        }
        return objOpt;
    }

    /* renamed from: a */
    public void m732a(Consumer consumer) {
        synchronized (this.f742b) {
            consumer.accept(this);
        }
    }

    /* renamed from: b */
    public void m738b(String str, int i) {
        synchronized (this.f742b) {
            JsonUtils.putInt(this.f741a, str, i);
        }
    }

    /* renamed from: a */
    public Object m726a(Function function) {
        Object objApply;
        synchronized (this.f742b) {
            objApply = function.apply(this);
        }
        return objApply;
    }

    /* renamed from: b */
    public void m739b(String str, long j) {
        synchronized (this.f742b) {
            JsonUtils.putLong(this.f741a, str, j);
        }
    }

    /* renamed from: a */
    public Boolean m725a(String str, Boolean bool) {
        Boolean bool2;
        synchronized (this.f742b) {
            bool2 = JsonUtils.getBoolean(this.f741a, str, bool);
        }
        return bool2;
    }

    /* renamed from: b */
    public void m740b(String str, String str2) {
        synchronized (this.f742b) {
            JsonUtils.putString(this.f741a, str, str2);
        }
    }

    /* renamed from: a */
    public float m722a(String str, float f) {
        float f2;
        synchronized (this.f742b) {
            f2 = JsonUtils.getFloat(this.f741a, str, f);
        }
        return f2;
    }

    /* renamed from: a */
    public int m723a(String str, int i) {
        int i2;
        synchronized (this.f742b) {
            i2 = JsonUtils.getInt(this.f741a, str, i);
        }
        return i2;
    }

    /* renamed from: a */
    public JSONArray m729a(String str, JSONArray jSONArray) {
        JSONArray jSONArray2;
        synchronized (this.f742b) {
            jSONArray2 = JsonUtils.getJSONArray(this.f741a, str, jSONArray);
        }
        return jSONArray2;
    }

    /* renamed from: a */
    public JSONObject m731a(String str, JSONObject jSONObject) {
        JSONObject jSONObject2;
        synchronized (this.f742b) {
            jSONObject2 = JsonUtils.getJSONObject(this.f741a, str, jSONObject);
        }
        return jSONObject2;
    }

    /* renamed from: a */
    public long m724a(String str, long j) {
        long j2;
        synchronized (this.f742b) {
            j2 = JsonUtils.getLong(this.f741a, str, j);
        }
        return j2;
    }

    /* renamed from: a */
    public String m727a(String str, String str2) {
        String string;
        synchronized (this.f742b) {
            string = JsonUtils.getString(this.f741a, str, str2);
        }
        return string;
    }

    /* renamed from: a */
    public List m728a(String str, List list) {
        List<Integer> integerList;
        synchronized (this.f742b) {
            integerList = JsonUtils.getIntegerList(this.f741a, str, list);
        }
        return integerList;
    }

    /* renamed from: a */
    public void m734a(String str, boolean z) {
        synchronized (this.f742b) {
            JsonUtils.putBoolean(this.f741a, str, z);
        }
    }

    /* renamed from: a */
    public void m733a(String str, Object obj) {
        synchronized (this.f742b) {
            JsonUtils.putObject(this.f741a, str, obj);
        }
    }
}
