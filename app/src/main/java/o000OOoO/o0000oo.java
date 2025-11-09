package o000Oooo;

import android.content.SharedPreferences;
import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class o0000oo {

    /* renamed from: OooO0o, reason: collision with root package name */
    public static final Date f30631OooO0o = new Date(-1);

    /* renamed from: OooO0oO, reason: collision with root package name */
    public static final Date f30632OooO0oO = new Date(-1);

    /* renamed from: OooO00o, reason: collision with root package name */
    public final SharedPreferences f30633OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final Object f30634OooO0O0 = new Object();

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final Object f30635OooO0OO = new Object();

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final Object f30636OooO0Oo = new Object();

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final Object f30637OooO0o0 = new Object();

    public o0000oo(SharedPreferences sharedPreferences) {
        this.f30633OooO00o = sharedPreferences;
    }

    public final o0000O00 OooO00o() {
        o0000O00 o0000o00;
        synchronized (this.f30635OooO0OO) {
            int i = this.f30633OooO00o.getInt("num_failed_fetches", 0);
            Date date = new Date(this.f30633OooO00o.getLong("backoff_end_time_in_millis", -1L));
            o0000o00 = new o0000O00();
            o0000o00.f30625OooO00o = i;
            o0000o00.f30626OooO0O0 = date;
        }
        return o0000o00;
    }

    public final HashMap OooO0O0() {
        try {
            JSONObject jSONObject = new JSONObject(this.f30633OooO00o.getString("customSignals", JsonUtils.EMPTY_JSON));
            HashMap map = new HashMap();
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, jSONObject.optString(next));
            }
            return map;
        } catch (JSONException unused) {
            return new HashMap();
        }
    }

    public final o0000O00 OooO0OO() {
        o0000O00 o0000o00;
        synchronized (this.f30636OooO0Oo) {
            int i = this.f30633OooO00o.getInt("num_failed_realtime_streams", 0);
            Date date = new Date(this.f30633OooO00o.getLong("realtime_backoff_end_time_in_millis", -1L));
            o0000o00 = new o0000O00();
            o0000o00.f30625OooO00o = i;
            o0000o00.f30626OooO0O0 = date;
        }
        return o0000o00;
    }

    public final void OooO0Oo(int i, Date date) {
        synchronized (this.f30635OooO0OO) {
            this.f30633OooO00o.edit().putInt("num_failed_fetches", i).putLong("backoff_end_time_in_millis", date.getTime()).apply();
        }
    }

    public final void OooO0o0(int i, Date date) {
        synchronized (this.f30636OooO0Oo) {
            this.f30633OooO00o.edit().putInt("num_failed_realtime_streams", i).putLong("realtime_backoff_end_time_in_millis", date.getTime()).apply();
        }
    }
}
