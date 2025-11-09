package o000OooO;

import android.app.Application;
import android.content.Context;
import androidx.webkit.internal.OooO0O0;
import com.google.android.gms.common.api.internal.OooO0OO;
import com.google.android.gms.internal.ads.C2051sk;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient;
import java.util.Collections;
import java.util.HashMap;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import o0000o0O.OooOO0;
import o000OOO.OooOO0O;
import o000Oo00.OooOOO;
import o000Oooo.o00000O;
import o000Oooo.o00000O0;
import o000Oooo.o0000O0;
import o000Oooo.o0000oo;
import o000Oooo.o000OOo;
import o000o00.o0O00o0;

/* loaded from: classes2.dex */
public final class o0OO00O implements o0O00o0 {

    /* renamed from: OooOO0, reason: collision with root package name */
    public static final Random f30556OooOO0 = new Random();

    /* renamed from: OooOO0O, reason: collision with root package name */
    public static final HashMap f30557OooOO0O = new HashMap();

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final Context f30560OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final ScheduledExecutorService f30561OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final o0000o0.Oooo0 f30562OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public final OooOO0 f30563OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final o000Oo0O.Oooo0 f30564OooO0o0;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public final OooOOO f30565OooO0oO;

    /* renamed from: OooO0oo, reason: collision with root package name */
    public final String f30566OooO0oo;

    /* renamed from: OooO00o, reason: collision with root package name */
    public final HashMap f30559OooO00o = new HashMap();

    /* renamed from: OooO, reason: collision with root package name */
    public final HashMap f30558OooO = new HashMap();

    public o0OO00O(Context context, ScheduledExecutorService scheduledExecutorService, o0000o0.Oooo0 oooo0, o000Oo0O.Oooo0 oooo02, OooOO0 oooOO0, OooOOO oooOOO) {
        this.f30560OooO0O0 = context;
        this.f30561OooO0OO = scheduledExecutorService;
        this.f30562OooO0Oo = oooo0;
        this.f30564OooO0o0 = oooo02;
        this.f30563OooO0o = oooOO0;
        this.f30565OooO0oO = oooOOO;
        oooo0.OooO00o();
        this.f30566OooO0oo = oooo0.f29590OooO0OO.f29605OooO0O0;
        AtomicReference atomicReference = o0Oo0oo.f30568OooO00o;
        Application application = (Application) context.getApplicationContext();
        AtomicReference atomicReference2 = o0Oo0oo.f30568OooO00o;
        if (atomicReference2.get() == null) {
            o0Oo0oo o0oo0oo = new o0Oo0oo();
            while (true) {
                if (atomicReference2.compareAndSet(null, o0oo0oo)) {
                    OooO0OO.OooO0O0(application);
                    OooO0OO.f16689OooOoO.OooO00o(o0oo0oo);
                    break;
                } else if (atomicReference2.get() != null) {
                    break;
                }
            }
        }
        Tasks.call(scheduledExecutorService, new OooO0O0(this, 5));
    }

    public final synchronized o00O0O OooO00o() {
        try {
            try {
                o000OOo o000oooOooO0OO = OooO0OO("fetch");
                o000OOo o000oooOooO0OO2 = OooO0OO("activate");
                o000OOo o000oooOooO0OO3 = OooO0OO("defaults");
                o0000oo o0000ooVar = new o0000oo(this.f30560OooO0O0.getSharedPreferences("frc_" + this.f30566OooO0oo + "_firebase_settings", 0));
                o00000O o00000o = new o00000O(this.f30561OooO0OO, o000oooOooO0OO2, o000oooOooO0OO3);
                o0000o0.Oooo0 oooo0 = this.f30562OooO0Oo;
                OooOOO oooOOO = this.f30565OooO0oO;
                oooo0.OooO00o();
                o000Oo0O.OooOo00 oooOo00 = oooo0.f29589OooO0O0.equals("[DEFAULT]") ? new o000Oo0O.OooOo00(oooOOO) : null;
                if (oooOo00 != null) {
                    o0OOO0o o0ooo0o = new o0OOO0o(oooOo00);
                    synchronized (o00000o.f30606OooO00o) {
                        o00000o.f30606OooO00o.add(o0ooo0o);
                    }
                }
                o000Oo0O.OooOo00 oooOo002 = new o000Oo0O.OooOo00(7, false);
                oooOo002.f30372OooOo0o = o000oooOooO0OO2;
                oooOo002.f30370OooOo = o000oooOooO0OO3;
                C2051sk c2051sk = new C2051sk(22, false);
                c2051sk.f24099OooOoO = Collections.newSetFromMap(new ConcurrentHashMap());
                c2051sk.f24098OooOo0o = o000oooOooO0OO2;
                c2051sk.f24096OooOo = oooOo002;
                ScheduledExecutorService scheduledExecutorService = this.f30561OooO0OO;
                c2051sk.f24100OooOoO0 = scheduledExecutorService;
                return OooO0O0(this.f30562OooO0Oo, this.f30564OooO0o0, this.f30563OooO0o, scheduledExecutorService, o000oooOooO0OO, o000oooOooO0OO2, o000oooOooO0OO3, OooO0Oo(o000oooOooO0OO, o0000ooVar), o00000o, o0000ooVar, c2051sk);
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    public final synchronized o00O0O OooO0O0(o0000o0.Oooo0 oooo0, o000Oo0O.Oooo0 oooo02, OooOO0 oooOO0, Executor executor, o000OOo o000ooo2, o000OOo o000ooo3, o000OOo o000ooo4, o00000O0 o00000o02, o00000O o00000o, o0000oo o0000ooVar, C2051sk c2051sk) {
        if (!this.f30559OooO00o.containsKey("firebase")) {
            oooo0.OooO00o();
            OooOO0 oooOO02 = oooo0.f29589OooO0O0.equals("[DEFAULT]") ? oooOO0 : null;
            Context context = this.f30560OooO0O0;
            synchronized (this) {
                o00O0O o00o0o = new o00O0O(oooo02, oooOO02, executor, o000ooo2, o000ooo3, o000ooo4, o00000o02, o00000o, o0000ooVar, new OooOO0O(oooo0, oooo02, o00000o02, o000ooo3, context, o0000ooVar, this.f30561OooO0OO), c2051sk);
                o000ooo3.OooO0O0();
                o000ooo4.OooO0O0();
                o000ooo2.OooO0O0();
                this.f30559OooO00o.put("firebase", o00o0o);
                f30557OooOO0O.put("firebase", o00o0o);
            }
        }
        return (o00O0O) this.f30559OooO00o.get("firebase");
    }

    public final o000OOo OooO0OO(String str) {
        o0000O0 o0000o02;
        o000OOo o000ooo2;
        String strOooOO0o = OooO0oO.OooOo.OooOO0o("frc_", this.f30566OooO0oo, "_firebase_", str, ".json");
        ScheduledExecutorService scheduledExecutorService = this.f30561OooO0OO;
        Context context = this.f30560OooO0O0;
        HashMap map = o0000O0.f30622OooO0OO;
        synchronized (o0000O0.class) {
            try {
                HashMap map2 = o0000O0.f30622OooO0OO;
                if (!map2.containsKey(strOooOO0o)) {
                    map2.put(strOooOO0o, new o0000O0(context, strOooOO0o));
                }
                o0000o02 = (o0000O0) map2.get(strOooOO0o);
            } finally {
            }
        }
        HashMap map3 = o000OOo.f30640OooO0Oo;
        synchronized (o000OOo.class) {
            try {
                String str2 = o0000o02.f30624OooO0O0;
                HashMap map4 = o000OOo.f30640OooO0Oo;
                if (!map4.containsKey(str2)) {
                    map4.put(str2, new o000OOo(scheduledExecutorService, o0000o02));
                }
                o000ooo2 = (o000OOo) map4.get(str2);
            } finally {
            }
        }
        return o000ooo2;
    }

    public final synchronized o00000O0 OooO0Oo(o000OOo o000ooo2, o0000oo o0000ooVar) {
        o000Oo0O.Oooo0 oooo0;
        OooOOO o0ooooo;
        ScheduledExecutorService scheduledExecutorService;
        Random random;
        String str;
        o0000o0.Oooo0 oooo02;
        try {
            oooo0 = this.f30564OooO0o0;
            o0000o0.Oooo0 oooo03 = this.f30562OooO0Oo;
            oooo03.OooO00o();
            o0ooooo = oooo03.f29589OooO0O0.equals("[DEFAULT]") ? this.f30565OooO0oO : new o0000oo0.o0ooOOo(6);
            scheduledExecutorService = this.f30561OooO0OO;
            random = f30556OooOO0;
            o0000o0.Oooo0 oooo04 = this.f30562OooO0Oo;
            oooo04.OooO00o();
            str = oooo04.f29590OooO0OO.f29604OooO00o;
            oooo02 = this.f30562OooO0Oo;
            oooo02.OooO00o();
        } catch (Throwable th) {
            throw th;
        }
        return new o00000O0(oooo0, o0ooooo, scheduledExecutorService, random, o000ooo2, new ConfigFetchHttpClient(this.f30560OooO0O0, oooo02.f29590OooO0OO.f29605OooO0O0, str, o0000ooVar.f30633OooO00o.getLong("fetch_timeout_in_seconds", 60L), o0000ooVar.f30633OooO00o.getLong("fetch_timeout_in_seconds", 60L)), o0000ooVar, this.f30558OooO);
    }
}
