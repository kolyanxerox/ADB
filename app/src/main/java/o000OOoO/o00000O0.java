package o000Oooo;

import OooOo.OooOO0;
import android.text.format.DateUtils;
import com.google.android.gms.internal.measurement.o00O00OO;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.net.HttpURLConnection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import o0000oO0.o000oOoO;
import o000Oo00.OooOOO;
import o000Oo0O.OooOOOO;
import o000Oo0O.Oooo0;
import o000Oo0O.Oooo000;
import o000OooO.o00Oo0;
import o000OooO.o00Ooo;
import o000OooO.o00oO0o;
import o000OooO.oo000o;

/* loaded from: classes2.dex */
public final class o00000O0 {

    /* renamed from: OooO */
    public static final long f30610OooO = TimeUnit.HOURS.toSeconds(12);

    /* renamed from: OooOO0 */
    public static final int[] f30611OooOO0 = {2, 4, 8, 16, 32, 64, 128, 256};

    /* renamed from: OooO00o */
    public final Oooo0 f30612OooO00o;

    /* renamed from: OooO0O0 */
    public final OooOOO f30613OooO0O0;

    /* renamed from: OooO0OO */
    public final Executor f30614OooO0OO;

    /* renamed from: OooO0Oo */
    public final Random f30615OooO0Oo;

    /* renamed from: OooO0o */
    public final ConfigFetchHttpClient f30616OooO0o;

    /* renamed from: OooO0o0 */
    public final o000OOo f30617OooO0o0;

    /* renamed from: OooO0oO */
    public final o0000oo f30618OooO0oO;

    /* renamed from: OooO0oo */
    public final HashMap f30619OooO0oo;

    public o00000O0(Oooo0 oooo0, OooOOO oooOOO, Executor executor, Random random, o000OOo o000ooo2, ConfigFetchHttpClient configFetchHttpClient, o0000oo o0000ooVar, HashMap map) {
        this.f30612OooO00o = oooo0;
        this.f30613OooO0O0 = oooOOO;
        this.f30614OooO0OO = executor;
        this.f30615OooO0Oo = random;
        this.f30617OooO0o0 = o000ooo2;
        this.f30616OooO0o = configFetchHttpClient;
        this.f30618OooO0oO = o0000ooVar;
        this.f30619OooO0oo = map;
    }

    public final o00000 OooO00o(String str, String str2, Date date, HashMap map) throws o00Ooo {
        String str3;
        try {
            HttpURLConnection httpURLConnectionOooO0O0 = this.f30616OooO0o.OooO0O0();
            ConfigFetchHttpClient configFetchHttpClient = this.f30616OooO0o;
            HashMap mapOooO0Oo = OooO0Oo();
            String string = this.f30618OooO0oO.f30633OooO00o.getString("last_fetch_etag", null);
            o0000oO0.Oooo0 oooo0 = (o0000oO0.Oooo0) this.f30613OooO0O0.get();
            o00000 o00000VarFetch = configFetchHttpClient.fetch(httpURLConnectionOooO0O0, str, str2, mapOooO0Oo, string, map, oooo0 != null ? (Long) ((o00O00OO) ((o000oOoO) oooo0).f29640OooO00o.f30487OooOo0o).OooO00o(null, null, true).get("_fot") : null, date, this.f30618OooO0oO.OooO0O0());
            o000000 o000000Var = o00000VarFetch.f30590OooO0O0;
            if (o000000Var != null) {
                o0000oo o0000ooVar = this.f30618OooO0oO;
                long j = o000000Var.f30597OooO0o;
                synchronized (o0000ooVar.f30634OooO0O0) {
                    o0000ooVar.f30633OooO00o.edit().putLong("last_template_version", j).apply();
                }
            }
            String str4 = o00000VarFetch.f30591OooO0OO;
            if (str4 != null) {
                o0000oo o0000ooVar2 = this.f30618OooO0oO;
                synchronized (o0000ooVar2.f30634OooO0O0) {
                    o0000ooVar2.f30633OooO00o.edit().putString("last_fetch_etag", str4).apply();
                }
            }
            this.f30618OooO0oO.OooO0Oo(0, o0000oo.f30632OooO0oO);
            return o00000VarFetch;
        } catch (o00oO0o e) {
            int i = e.f30555OooOo0O;
            o0000oo o0000ooVar3 = this.f30618OooO0oO;
            if (i == 429 || i == 502 || i == 503 || i == 504) {
                int i2 = o0000ooVar3.OooO00o().f30625OooO00o + 1;
                TimeUnit timeUnit = TimeUnit.MINUTES;
                int[] iArr = f30611OooOO0;
                o0000ooVar3.OooO0Oo(i2, new Date(date.getTime() + (timeUnit.toMillis(iArr[Math.min(i2, iArr.length) - 1]) / 2) + this.f30615OooO0Oo.nextInt((int) r3)));
            }
            o0000O00 o0000o00OooO00o = o0000ooVar3.OooO00o();
            int i3 = e.f30555OooOo0O;
            if (o0000o00OooO00o.f30625OooO00o > 1 || i3 == 429) {
                o0000o00OooO00o.f30626OooO0O0.getTime();
                throw new oo000o("Fetch was throttled.");
            }
            if (i3 == 401) {
                str3 = "The request did not have the required credentials. Please make sure your google-services.json is valid.";
            } else if (i3 == 403) {
                str3 = "The user is not authorized to access the project. Please make sure you are using the API key that corresponds to your Firebase project.";
            } else {
                if (i3 == 429) {
                    throw new o00Oo0("The throttled response from the server was not handled correctly by the FRC SDK.");
                }
                if (i3 != 500) {
                    switch (i3) {
                        case IronSourceError.ERROR_CODE_USING_CACHED_CONFIGURATION /* 502 */:
                        case 503:
                        case 504:
                            str3 = "The server is unavailable. Please try again later.";
                            break;
                        default:
                            str3 = "The server returned an unexpected error.";
                            break;
                    }
                } else {
                    str3 = "There was an internal server error.";
                }
            }
            throw new o00oO0o(e.f30555OooOo0O, "Fetch failed: ".concat(str3), e);
        }
    }

    public final Task OooO0O0(Task task, long j, final HashMap map) {
        Task taskContinueWithTask;
        final Date date = new Date(System.currentTimeMillis());
        boolean zIsSuccessful = task.isSuccessful();
        o0000oo o0000ooVar = this.f30618OooO0oO;
        if (zIsSuccessful) {
            Date date2 = new Date(o0000ooVar.f30633OooO00o.getLong("last_fetch_time_in_millis", -1L));
            if (date2.equals(o0000oo.f30631OooO0o) ? false : date.before(new Date(TimeUnit.SECONDS.toMillis(j) + date2.getTime()))) {
                return Tasks.forResult(new o00000(2, null, null));
            }
        }
        Date date3 = o0000ooVar.OooO00o().f30626OooO0O0;
        Date date4 = date.before(date3) ? date3 : null;
        Executor executor = this.f30614OooO0OO;
        if (date4 != null) {
            String str = "Fetch is throttled. Please wait before calling fetch again: " + DateUtils.formatElapsedTime(TimeUnit.MILLISECONDS.toSeconds(date4.getTime() - date.getTime()));
            date4.getTime();
            taskContinueWithTask = Tasks.forException(new oo000o(str));
        } else {
            Oooo000 oooo000 = (Oooo000) this.f30612OooO00o;
            final Task taskOooO0OO = oooo000.OooO0OO();
            final Task taskOooO0o0 = oooo000.OooO0o0();
            taskContinueWithTask = Tasks.whenAllComplete((Task<?>[]) new Task[]{taskOooO0OO, taskOooO0o0}).continueWithTask(executor, new Continuation() { // from class: o000Oooo.o000000O
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task2) {
                    Date date5 = date;
                    HashMap map2 = map;
                    o00000O0 o00000o02 = this.f30601OooOo0O;
                    o00000o02.getClass();
                    Task task3 = taskOooO0OO;
                    if (!task3.isSuccessful()) {
                        return Tasks.forException(new o00Oo0("Firebase Installations failed to get installation ID for fetch.", task3.getException()));
                    }
                    Task task4 = taskOooO0o0;
                    if (!task4.isSuccessful()) {
                        return Tasks.forException(new o00Oo0("Firebase Installations failed to get installation auth token for fetch.", task4.getException()));
                    }
                    try {
                        o00000 o00000VarOooO00o = o00000o02.OooO00o((String) task3.getResult(), ((OooOOOO) task4.getResult()).f30365OooO00o, date5, map2);
                        return o00000VarOooO00o.f30589OooO00o != 0 ? Tasks.forResult(o00000VarOooO00o) : o00000o02.f30617OooO0o0.OooO0Oo(o00000VarOooO00o.f30590OooO0O0).onSuccessTask(o00000o02.f30614OooO0OO, new OooO0oo.o00Oo0(o00000VarOooO00o, 28));
                    } catch (o00Ooo e) {
                        return Tasks.forException(e);
                    }
                }
            });
        }
        return taskContinueWithTask.continueWithTask(executor, new OooOO0(11, this, date));
    }

    public final Task OooO0OO(int i) {
        HashMap map = new HashMap(this.f30619OooO0oo);
        map.put("X-Firebase-RC-Fetch-Type", "REALTIME/" + i);
        return this.f30617OooO0o0.OooO0O0().continueWithTask(this.f30614OooO0OO, new OooOO0(12, this, map));
    }

    public final HashMap OooO0Oo() {
        HashMap map = new HashMap();
        o0000oO0.Oooo0 oooo0 = (o0000oO0.Oooo0) this.f30613OooO0O0.get();
        if (oooo0 != null) {
            for (Map.Entry entry : ((o00O00OO) ((o000oOoO) oooo0).f29640OooO00o.f30487OooOo0o).OooO00o(null, null, false).entrySet()) {
                map.put((String) entry.getKey(), entry.getValue().toString());
            }
        }
        return map;
    }
}
