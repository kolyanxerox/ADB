package o000OOoO;

import OooO0oO.OooOo;
import android.content.Context;
import android.os.Build;
import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesKeys;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import o00O0oOo.o0000OO0;

/* loaded from: classes2.dex */
public final class OooOOO {

    /* renamed from: OooO0O0 */
    public static final Preferences.Key f30298OooO0O0 = PreferencesKeys.longKey("fire-global");

    /* renamed from: OooO0OO */
    public static final Preferences.Key f30299OooO0OO = PreferencesKeys.longKey("fire-count");

    /* renamed from: OooO0Oo */
    public static final Preferences.Key f30300OooO0Oo = PreferencesKeys.stringKey("last-used-date");

    /* renamed from: OooO00o */
    public final o000O0oO.OooOOO0 f30301OooO00o;

    public OooOOO(Context context, String str) {
        this.f30301OooO00o = new o000O0oO.OooOOO0(context, OooOo.OooOO0("FirebaseHeartBeat", str));
    }

    public final synchronized ArrayList OooO00o() {
        try {
            ArrayList arrayList = new ArrayList();
            String strOooO0O0 = OooO0O0(System.currentTimeMillis());
            o000O0oO.OooOOO0 oooOOO0 = this.f30301OooO00o;
            oooOOO0.getClass();
            for (Map.Entry entry : ((Map) o0000OO0.OooOoO(o00O0O0O.OooOOO.f31358OooOo0O, new o000O0oO.OooOO0O(oooOOO0, null))).entrySet()) {
                if (entry.getValue() instanceof Set) {
                    HashSet hashSet = new HashSet((Set) entry.getValue());
                    hashSet.remove(strOooO0O0);
                    if (!hashSet.isEmpty()) {
                        arrayList.add(new OooO00o(((Preferences.Key) entry.getKey()).getName(), new ArrayList(hashSet)));
                    }
                }
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            synchronized (this) {
                this.f30301OooO00o.OooO00o(new io.flutter.plugins.webviewflutter.OooOO0O(1, jCurrentTimeMillis));
            }
            return arrayList;
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    public final synchronized String OooO0O0(long j) {
        if (Build.VERSION.SDK_INT < 26) {
            return new SimpleDateFormat("yyyy-MM-dd", Locale.UK).format(new Date(j));
        }
        Instant instant = new Date(j).toInstant();
        ZoneOffset unused = ZoneOffset.UTC;
        LocalDateTime localDateTime = instant.atOffset(ZoneOffset.UTC).toLocalDateTime();
        DateTimeFormatter unused2 = DateTimeFormatter.ISO_LOCAL_DATE;
        return localDateTime.format(DateTimeFormatter.ISO_LOCAL_DATE);
    }

    public final synchronized Preferences.Key OooO0OO(MutablePreferences mutablePreferences, String str) {
        for (Map.Entry<Preferences.Key<?>, Object> entry : mutablePreferences.asMap().entrySet()) {
            if (entry.getValue() instanceof Set) {
                Iterator it = ((Set) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (str.equals((String) it.next())) {
                        return PreferencesKeys.stringSetKey(entry.getKey().getName());
                    }
                }
            }
        }
        return null;
    }

    public final synchronized void OooO0Oo(MutablePreferences mutablePreferences, String str) {
        try {
            Preferences.Key keyOooO0OO = OooO0OO(mutablePreferences, str);
            if (keyOooO0OO == null) {
                return;
            }
            HashSet hashSet = new HashSet((Collection) o000O0oO.OooOOO.OooO00o(mutablePreferences, keyOooO0OO, new HashSet()));
            hashSet.remove(str);
            if (hashSet.isEmpty()) {
                mutablePreferences.remove(keyOooO0OO);
            } else {
                mutablePreferences.set(keyOooO0OO, hashSet);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
