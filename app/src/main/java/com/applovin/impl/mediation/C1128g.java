package com.applovin.impl.mediation;

import android.text.TextUtils;
import com.applovin.impl.AbstractC1266v2;
import com.applovin.impl.C1044h3;
import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.C1240o;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapters.MediationAdapterBase;
import com.applovin.sdk.AppLovinSdk;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.mediation.g */
/* loaded from: classes.dex */
public class C1128g {

    /* renamed from: b */
    private final C1220k f1463b;

    /* renamed from: c */
    private final C1240o f1464c;

    /* renamed from: a */
    private final Map f1462a = Collections.synchronizedMap(new HashMap(16));

    /* renamed from: d */
    private final Object f1465d = new Object();

    /* renamed from: e */
    private final Map f1466e = new HashMap();

    /* renamed from: f */
    private final Set f1467f = new HashSet();

    /* renamed from: g */
    private final Object f1468g = new Object();

    /* renamed from: h */
    private final Set f1469h = new HashSet();

    /* renamed from: com.applovin.impl.mediation.g$a */
    public static class a {

        /* renamed from: a */
        private final String f1470a;

        /* renamed from: b */
        private final String f1471b;

        /* renamed from: c */
        private final MaxAdFormat f1472c;

        /* renamed from: d */
        private final JSONObject f1473d;

        public a(String str, String str2, AbstractC1266v2 abstractC1266v2, C1220k c1220k) {
            this.f1470a = str;
            this.f1471b = str2;
            JSONObject jSONObject = new JSONObject();
            this.f1473d = jSONObject;
            JsonUtils.putString(jSONObject, Constants.CLASS, str);
            JsonUtils.putString(jSONObject, "operation", str2);
            if (abstractC1266v2 == null) {
                this.f1472c = null;
            } else {
                this.f1472c = abstractC1266v2.getFormat();
                JsonUtils.putString(jSONObject, "format", abstractC1266v2.getFormat().getLabel());
            }
        }

        /* renamed from: a */
        public JSONObject m1786a() {
            return this.f1473d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (!this.f1470a.equals(aVar.f1470a) || !this.f1471b.equals(aVar.f1471b)) {
                return false;
            }
            MaxAdFormat maxAdFormat = this.f1472c;
            MaxAdFormat maxAdFormat2 = aVar.f1472c;
            return maxAdFormat == null ? maxAdFormat2 == null : maxAdFormat.equals(maxAdFormat2);
        }

        public int hashCode() {
            int iOooO0O0 = androidx.datastore.preferences.protobuf.OooO00o.OooO0O0(this.f1470a.hashCode() * 31, 31, this.f1471b);
            MaxAdFormat maxAdFormat = this.f1472c;
            return iOooO0O0 + (maxAdFormat != null ? maxAdFormat.hashCode() : 0);
        }

        public String toString() {
            return "DisabledAdapterInfo{className='" + this.f1470a + "', operationTag='" + this.f1471b + "', format=" + this.f1472c + '}';
        }
    }

    public C1128g(C1220k c1220k) {
        if (c1220k == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        this.f1463b = c1220k;
        this.f1464c = c1220k.m2847O();
    }

    /* renamed from: a */
    public Collection m1782a() {
        ArrayList arrayList;
        synchronized (this.f1468g) {
            try {
                arrayList = new ArrayList(this.f1469h.size());
                Iterator it = this.f1469h.iterator();
                while (it.hasNext()) {
                    arrayList.add(((a) it.next()).m1786a());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public Collection m1784b() {
        Set setUnmodifiableSet;
        synchronized (this.f1465d) {
            setUnmodifiableSet = Collections.unmodifiableSet(this.f1467f);
        }
        return setUnmodifiableSet;
    }

    /* renamed from: c */
    public Collection m1785c() {
        Set setUnmodifiableSet;
        synchronized (this.f1465d) {
            try {
                HashSet hashSet = new HashSet(this.f1466e.size());
                Iterator it = this.f1466e.values().iterator();
                while (it.hasNext()) {
                    hashSet.add(((Class) it.next()).getName());
                }
                setUnmodifiableSet = Collections.unmodifiableSet(hashSet);
            } catch (Throwable th) {
                throw th;
            }
        }
        return setUnmodifiableSet;
    }

    /* renamed from: a */
    public C1129h m1780a(C1044h3 c1044h3) {
        return m1781a(c1044h3, false);
    }

    /* renamed from: a */
    public C1129h m1781a(C1044h3 c1044h3, boolean z) {
        Class clsM1779a;
        C1129h c1129h;
        if (c1044h3 != null) {
            String strM899c = c1044h3.m899c();
            String strM895b = c1044h3.m895b();
            if (TextUtils.isEmpty(strM899c)) {
                if (C1240o.m3200a()) {
                    this.f1464c.m3214b("MediationAdapterManager", "No adapter name provided for " + strM895b + ", not loading the adapter ");
                }
                return null;
            }
            if (TextUtils.isEmpty(strM895b)) {
                if (C1240o.m3200a()) {
                    this.f1464c.m3214b("MediationAdapterManager", "Unable to find default className for '" + strM899c + "'");
                }
                return null;
            }
            if (z && (c1129h = (C1129h) this.f1462a.get(strM895b)) != null) {
                return c1129h;
            }
            synchronized (this.f1465d) {
                try {
                    if (!this.f1467f.contains(strM895b)) {
                        if (this.f1466e.containsKey(strM895b)) {
                            clsM1779a = (Class) this.f1466e.get(strM895b);
                        } else {
                            clsM1779a = m1779a(strM895b);
                            if (clsM1779a == null) {
                                if (C1240o.m3200a()) {
                                    this.f1464c.m3218k("MediationAdapterManager", "Adapter " + strM899c + " could not be loaded, class " + strM895b + " not found");
                                }
                                this.f1467f.add(strM895b);
                                return null;
                            }
                        }
                        C1129h c1129hM1778a = m1778a(c1044h3, clsM1779a, z);
                        if (c1129hM1778a != null) {
                            if (C1240o.m3200a()) {
                                this.f1464c.m3211a("MediationAdapterManager", "Loaded " + strM899c);
                            }
                            this.f1466e.put(strM895b, clsM1779a);
                            if (z) {
                                this.f1462a.put(c1044h3.m895b(), c1129hM1778a);
                            }
                            return c1129hM1778a;
                        }
                        if (C1240o.m3200a()) {
                            this.f1464c.m3214b("MediationAdapterManager", "Failed to load " + strM899c);
                        }
                        this.f1467f.add(strM895b);
                        return null;
                    }
                    if (C1240o.m3200a()) {
                        this.f1464c.m3211a("MediationAdapterManager", "Not attempting to load " + strM899c + " due to prior errors");
                    }
                    return null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        throw new IllegalArgumentException("No adapter spec specified");
    }

    /* renamed from: a */
    public void m1783a(String str, String str2, AbstractC1266v2 abstractC1266v2) {
        synchronized (this.f1468g) {
            try {
                this.f1463b.m2847O();
                if (C1240o.m3200a()) {
                    this.f1463b.m2847O().m3214b("MediationAdapterManager", "Adding " + str + " to list of disabled adapters.");
                }
                this.f1469h.add(new a(str, str2, abstractC1266v2, this.f1463b));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: a */
    private C1129h m1778a(C1044h3 c1044h3, Class cls, boolean z) {
        try {
            return new C1129h(c1044h3, (MediationAdapterBase) cls.getConstructor(AppLovinSdk.class).newInstance(this.f1463b.m2934z0()), z, this.f1463b);
        } catch (Throwable th) {
            C1240o.m3204c("MediationAdapterManager", "Failed to load adapter: " + c1044h3, th);
            return null;
        }
    }

    /* renamed from: a */
    private Class m1779a(String str) {
        try {
            Class<?> cls = Class.forName(str);
            if (MaxAdapter.class.isAssignableFrom(cls)) {
                return cls.asSubclass(MaxAdapter.class);
            }
            C1240o.m3207h("MediationAdapterManager", str + " error: not an instance of '" + MaxAdapter.class.getName() + "'.");
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }
}
