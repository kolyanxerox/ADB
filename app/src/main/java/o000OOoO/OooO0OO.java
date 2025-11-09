package o000OOoO;

import android.util.Base64OutputStream;
import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesKeys;
import com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.zip.GZIPOutputStream;
import o00O0Oo.Oooo000;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final /* synthetic */ class OooO0OO implements Callable {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f30291OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ OooO0o f30292OooOo0o;

    public /* synthetic */ OooO0OO(OooO0o oooO0o, int i) {
        this.f30291OooOo0O = i;
        this.f30292OooOo0o = oooO0o;
    }

    private final Object OooO00o() {
        String string;
        OooO0o oooO0o = this.f30292OooOo0o;
        synchronized (oooO0o) {
            try {
                OooOOO oooOOO = (OooOOO) oooO0o.f30293OooO00o.get();
                ArrayList arrayListOooO00o = oooOOO.OooO00o();
                synchronized (oooOOO) {
                    oooOOO.f30301OooO00o.OooO00o(new com.ironsource.sdk.controller.OooO0o(oooOOO, 2));
                }
                JSONArray jSONArray = new JSONArray();
                for (int i = 0; i < arrayListOooO00o.size(); i++) {
                    OooO00o oooO00o = (OooO00o) arrayListOooO00o.get(i);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("agent", oooO00o.f30287OooO00o);
                    jSONObject.put("dates", new JSONArray((Collection) oooO00o.f30288OooO0O0));
                    jSONArray.put(jSONObject);
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("heartbeats", jSONArray);
                jSONObject2.put("version", CommonGetHeaderBiddingToken.HB_TOKEN_VERSION);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream, 11);
                try {
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                    try {
                        gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                        gZIPOutputStream.close();
                        base64OutputStream.close();
                        string = byteArrayOutputStream.toString("UTF-8");
                    } finally {
                    }
                } finally {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return string;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Set setUnmodifiableSet;
        Set setUnmodifiableSet2;
        switch (this.f30291OooOo0O) {
            case 0:
                return OooO00o();
            default:
                OooO0o oooO0o = this.f30292OooOo0o;
                synchronized (oooO0o) {
                    final OooOOO oooOOO = (OooOOO) oooO0o.f30293OooO00o.get();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    o000Ooo0.OooO oooO = (o000Ooo0.OooO) oooO0o.f30295OooO0OO.get();
                    o000Ooo0.OooOO0 oooOO0 = oooO.f30533OooO0O0;
                    synchronized (((HashSet) oooOO0.f30538OooOo0o)) {
                        setUnmodifiableSet = Collections.unmodifiableSet((HashSet) oooOO0.f30538OooOo0o);
                    }
                    boolean zIsEmpty = setUnmodifiableSet.isEmpty();
                    final String string = oooO.f30532OooO00o;
                    if (!zIsEmpty) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(string);
                        sb.append(' ');
                        synchronized (((HashSet) oooOO0.f30538OooOo0o)) {
                            setUnmodifiableSet2 = Collections.unmodifiableSet((HashSet) oooOO0.f30538OooOo0o);
                        }
                        sb.append(o000Ooo0.OooO.OooO00o(setUnmodifiableSet2));
                        string = sb.toString();
                    }
                    synchronized (oooOOO) {
                        final String strOooO0O0 = oooOOO.OooO0O0(jCurrentTimeMillis);
                        final Preferences.Key<Set<String>> keyStringSetKey = PreferencesKeys.stringSetKey(string);
                        oooOOO.f30301OooO00o.OooO00o(new Oooo000() { // from class: o000OOoO.OooOOO0
                            @Override // o00O0Oo.Oooo000
                            public final Object invoke(Object obj) {
                                Object obj2;
                                OooOOO oooOOO2 = oooOOO;
                                String str = strOooO0O0;
                                String str2 = string;
                                Preferences.Key key = keyStringSetKey;
                                MutablePreferences mutablePreferences = (MutablePreferences) obj;
                                Object obj3 = null;
                                if (((String) o000O0oO.OooOOO.OooO00o(mutablePreferences, OooOOO.f30300OooO0Oo, "")).equals(str)) {
                                    Preferences.Key keyOooO0OO = oooOOO2.OooO0OO(mutablePreferences, str);
                                    if (keyOooO0OO == null || keyOooO0OO.getName().equals(str2)) {
                                        return null;
                                    }
                                    synchronized (oooOOO2) {
                                        oooOOO2.OooO0Oo(mutablePreferences, str);
                                        HashSet hashSet = new HashSet((Collection) o000O0oO.OooOOO.OooO00o(mutablePreferences, key, new HashSet()));
                                        hashSet.add(str);
                                        mutablePreferences.set(key, hashSet);
                                    }
                                    return null;
                                }
                                Preferences.Key key2 = OooOOO.f30299OooO0OO;
                                long jLongValue = ((Long) o000O0oO.OooOOO.OooO00o(mutablePreferences, key2, 0L)).longValue();
                                if (jLongValue + 1 == 30) {
                                    synchronized (oooOOO2) {
                                        try {
                                            long jLongValue2 = ((Long) o000O0oO.OooOOO.OooO00o(mutablePreferences, key2, 0L)).longValue();
                                            String name = "";
                                            Set hashSet2 = new HashSet();
                                            String str3 = null;
                                            for (Map.Entry<Preferences.Key<?>, Object> entry : mutablePreferences.asMap().entrySet()) {
                                                if (entry.getValue() instanceof Set) {
                                                    Set<String> set = (Set) entry.getValue();
                                                    for (String str4 : set) {
                                                        Object obj4 = obj3;
                                                        if (str3 == null || str3.compareTo(str4) > 0) {
                                                            name = entry.getKey().getName();
                                                            str3 = str4;
                                                            hashSet2 = set;
                                                        }
                                                        obj3 = obj4;
                                                    }
                                                }
                                                obj3 = obj3;
                                            }
                                            obj2 = obj3;
                                            HashSet hashSet3 = new HashSet(hashSet2);
                                            hashSet3.remove(str3);
                                            mutablePreferences.set(PreferencesKeys.stringSetKey(name), hashSet3);
                                            jLongValue = jLongValue2 - 1;
                                            mutablePreferences.set(OooOOO.f30299OooO0OO, Long.valueOf(jLongValue));
                                        } catch (Throwable th) {
                                            throw th;
                                        }
                                    }
                                } else {
                                    obj2 = null;
                                }
                                HashSet hashSet4 = new HashSet((Collection) o000O0oO.OooOOO.OooO00o(mutablePreferences, key, new HashSet()));
                                hashSet4.add(str);
                                mutablePreferences.set(key, hashSet4);
                                mutablePreferences.set(OooOOO.f30299OooO0OO, Long.valueOf(jLongValue + 1));
                                mutablePreferences.set(OooOOO.f30300OooO0Oo, str);
                                return obj2;
                            }
                        });
                    }
                }
                return null;
        }
    }
}
