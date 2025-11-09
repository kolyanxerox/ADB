package o000OooO;

import OooOo.OooOOO0;
import android.os.Build;
import android.util.Log;
import com.google.android.gms.internal.ads.C2051sk;
import com.google.android.gms.tasks.Task;
import com.ironsource.o0000O0O;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
import o0000o0O.OooOO0;
import o0000ooO.o0O0O0o0;
import o000OOO.OooOO0O;
import o000Oooo.o0000;
import o000Oooo.o000000;
import o000Oooo.o00000O;
import o000Oooo.o00000O0;
import o000Oooo.o0000oo;
import o000Oooo.o000OO;
import o000Oooo.o000OOo;
import o000Oooo.o0O0O00;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class o00O0O {
    public static final byte[] OooOO0o = new byte[0];

    /* renamed from: OooO, reason: collision with root package name */
    public final o000Oo0O.Oooo0 f30544OooO;

    /* renamed from: OooO00o, reason: collision with root package name */
    public final OooOO0 f30545OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final Executor f30546OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final o000OOo f30547OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final o000OOo f30548OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public final o00000O0 f30549OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final o000OOo f30550OooO0o0;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public final o00000O f30551OooO0oO;

    /* renamed from: OooO0oo, reason: collision with root package name */
    public final o0000oo f30552OooO0oo;

    /* renamed from: OooOO0, reason: collision with root package name */
    public final OooOO0O f30553OooOO0;

    /* renamed from: OooOO0O, reason: collision with root package name */
    public final C2051sk f30554OooOO0O;

    public o00O0O(o000Oo0O.Oooo0 oooo0, OooOO0 oooOO0, Executor executor, o000OOo o000ooo2, o000OOo o000ooo3, o000OOo o000ooo4, o00000O0 o00000o02, o00000O o00000o, o0000oo o0000ooVar, OooOO0O oooOO0O, C2051sk c2051sk) {
        this.f30544OooO = oooo0;
        this.f30545OooO00o = oooOO0;
        this.f30546OooO0O0 = executor;
        this.f30547OooO0OO = o000ooo2;
        this.f30548OooO0Oo = o000ooo3;
        this.f30550OooO0o0 = o000ooo4;
        this.f30549OooO0o = o00000o02;
        this.f30551OooO0oO = o00000o;
        this.f30552OooO0oo = o0000ooVar;
        this.f30553OooOO0 = oooOO0O;
        this.f30554OooOO0O = c2051sk;
    }

    public static ArrayList OooO0o0(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            HashMap map = new HashMap();
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, jSONObject.getString(next));
            }
            arrayList.add(map);
        }
        return arrayList;
    }

    public final Task OooO00o() {
        o00000O0 o00000o02 = this.f30549OooO0o;
        o0000oo o0000ooVar = o00000o02.f30618OooO0oO;
        long j = o0000ooVar.f30633OooO00o.getLong("minimum_fetch_interval_in_seconds", o00000O0.f30610OooO);
        HashMap map = new HashMap(o00000o02.f30619OooO0oo);
        map.put("X-Firebase-RC-Fetch-Type", "BASE/1");
        return o00000o02.f30617OooO0o0.OooO0O0().continueWithTask(o00000o02.f30614OooO0OO, new OooOOO0(o00000o02, j, map)).onSuccessTask(o0O0O0o0.f29715OooOo0O, new o0000O.OooOo00(28));
    }

    public final HashMap OooO0O0() throws JSONException {
        String string;
        o000OO o000oo2;
        o00000O o00000o = this.f30551OooO0oO;
        HashSet hashSet = new HashSet();
        hashSet.addAll(o00000O.OooO00o(o00000o.f30608OooO0OO));
        hashSet.addAll(o00000O.OooO00o(o00000o.f30609OooO0Oo));
        HashMap map = new HashMap();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            o000000 o000000VarOooO0OO = o00000o.f30608OooO0OO.OooO0OO();
            String string2 = null;
            if (o000000VarOooO0OO == null) {
                string = null;
            } else {
                try {
                    string = o000000VarOooO0OO.f30594OooO0O0.getString(str);
                } catch (JSONException unused) {
                }
            }
            if (string != null) {
                o000000 o000000VarOooO0OO2 = o00000o.f30608OooO0OO.OooO0OO();
                if (o000000VarOooO0OO2 != null) {
                    synchronized (o00000o.f30606OooO00o) {
                        try {
                            Iterator it2 = o00000o.f30606OooO00o.iterator();
                            while (it2.hasNext()) {
                                o00000o.f30607OooO0O0.execute(new o0000O0O((o0OOO0o) it2.next(), str, o000000VarOooO0OO2, 13));
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                o000oo2 = new o000OO(string, 2);
            } else {
                o000000 o000000VarOooO0OO3 = o00000o.f30609OooO0Oo.OooO0OO();
                if (o000000VarOooO0OO3 != null) {
                    try {
                        string2 = o000000VarOooO0OO3.f30594OooO0O0.getString(str);
                    } catch (JSONException unused2) {
                    }
                }
                if (string2 != null) {
                    o000oo2 = new o000OO(string2, 1);
                } else {
                    Log.w("FirebaseRemoteConfig", "No value of type 'FirebaseRemoteConfigValue' exists for parameter key '" + str + "'.");
                    o000oo2 = new o000OO("", 0);
                }
            }
            map.put(str, o000oo2);
        }
        return map;
    }

    public final o000Oooo.o0000O0O OooO0OO() {
        o000Oooo.o0000O0O o0000o0o2;
        o0000oo o0000ooVar = this.f30552OooO0oo;
        synchronized (o0000ooVar.f30634OooO0O0) {
            try {
                long j = o0000ooVar.f30633OooO00o.getLong("last_fetch_time_in_millis", -1L);
                int i = o0000ooVar.f30633OooO00o.getInt("last_fetch_status", 0);
                com.google.android.gms.internal.ads.OooOO0O oooOO0O = new com.google.android.gms.internal.ads.OooOO0O(1);
                long j2 = o0000ooVar.f30633OooO00o.getLong("fetch_timeout_in_seconds", 60L);
                if (j2 < 0) {
                    throw new IllegalArgumentException(String.format("Fetch connection timeout has to be a non-negative number. %d is an invalid argument", Long.valueOf(j2)));
                }
                oooOO0O.f16808OooO00o = j2;
                oooOO0O.OooO00o(o0000ooVar.f30633OooO00o.getLong("minimum_fetch_interval_in_seconds", o00000O0.f30610OooO));
                o0000o0o2 = new o000Oooo.o0000O0O(j, i, new com.google.android.gms.internal.ads.OooOO0O(oooOO0O));
            } catch (Throwable th) {
                throw th;
            }
        }
        return o0000o0o2;
    }

    public final void OooO0Oo(boolean z) {
        HttpURLConnection httpURLConnection;
        OooOO0O oooOO0O = this.f30553OooOO0;
        synchronized (oooOO0O) {
            o0000 o0000Var = (o0000) oooOO0O.f30250OooOo0o;
            synchronized (o0000Var.f30587OooOOo) {
                try {
                    o0000Var.f30578OooO0o0 = z;
                    o0O0O00 o0o0o00 = o0000Var.f30579OooO0oO;
                    if (o0o0o00 != null) {
                        o0o0o00.f30654OooOO0 = z;
                    }
                    if (Build.VERSION.SDK_INT >= 26 && z && (httpURLConnection = o0000Var.f30577OooO0o) != null) {
                        httpURLConnection.disconnect();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (!z) {
                oooOO0O.OooO00o();
            }
        }
    }
}
