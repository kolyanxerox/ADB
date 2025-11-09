package o000OooO;

import OooOo.OooO;
import android.util.Log;
import com.google.android.gms.internal.ads.C2051sk;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import o0000o0O.OooO0o;
import o0000o0O.OooOO0;
import o000O000.OooO0O0;
import o000Oooo.o000000;
import o000Oooo.o0000O0;
import o000Oooo.o000OOo;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes2.dex */
public final /* synthetic */ class o0OoOo0 implements SuccessContinuation, Continuation {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ o00O0O f30569OooOo0O;

    public /* synthetic */ o0OoOo0(o00O0O o00o0o) {
        this.f30569OooOo0O = o00o0o;
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        o00O0O o00o0o = this.f30569OooOo0O;
        Task taskOooO0O0 = o00o0o.f30547OooO0OO.OooO0O0();
        Task taskOooO0O02 = o00o0o.f30548OooO0Oo.OooO0O0();
        return Tasks.whenAllComplete((Task<?>[]) new Task[]{taskOooO0O0, taskOooO0O02}).continueWithTask(o00o0o.f30546OooO0O0, new OooO(o00o0o, taskOooO0O0, taskOooO0O02, 10));
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) throws Throwable {
        boolean z;
        o00O0O o00o0o = this.f30569OooOo0O;
        o00o0o.getClass();
        if (task.isSuccessful()) {
            o000OOo o000ooo2 = o00o0o.f30547OooO0OO;
            synchronized (o000ooo2) {
                o000ooo2.f30644OooO0OO = Tasks.forResult(null);
            }
            o0000O0 o0000o02 = o000ooo2.f30643OooO0O0;
            synchronized (o0000o02) {
                o0000o02.f30623OooO00o.deleteFile(o0000o02.f30624OooO0O0);
            }
            o000000 o000000Var = (o000000) task.getResult();
            if (o000000Var != null) {
                JSONArray jSONArray = o000000Var.f30596OooO0Oo;
                OooOO0 oooOO0 = o00o0o.f30545OooO00o;
                if (oooOO0 != null) {
                    try {
                        oooOO0.OooO0OO(o00O0O.OooO0o0(jSONArray));
                    } catch (OooO0o e) {
                        Log.w("FirebaseRemoteConfig", "Could not update ABT experiments.", e);
                    } catch (JSONException e2) {
                        Log.e("FirebaseRemoteConfig", "Could not parse ABT experiments from the JSON response.", e2);
                    }
                }
                C2051sk c2051sk = o00o0o.f30554OooOO0O;
                try {
                    o000o00O.OooO oooOOooO0o0 = ((o000Oo0O.OooOo00) c2051sk.f24096OooOo).OooO0o0(o000000Var);
                    Iterator it = ((Set) c2051sk.f24099OooOoO).iterator();
                    while (it.hasNext()) {
                        ((Executor) c2051sk.f24100OooOoO0).execute(new o000o000.OooO0o((OooO0O0) it.next(), oooOOooO0o0, 0));
                    }
                } catch (o00Ooo e3) {
                    Log.w("FirebaseRemoteConfig", "Exception publishing RolloutsState to subscribers. Continuing to listen for changes.", e3);
                }
            } else {
                Log.e("FirebaseRemoteConfig", "Activated configs written to disk are null.");
            }
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
