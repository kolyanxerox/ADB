package com.google.android.gms.internal.ads;

import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import o000OooO.OooOo00;
import o000OooO.Oooo000;
import o000OooO.o00Oo0;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final /* synthetic */ class Oooo0 implements Runnable {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ long f16854OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f16855OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f16856OooOo0o;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Object f16857OooOoO0;

    public /* synthetic */ Oooo0(Object obj, int i, long j, int i2) {
        this.f16855OooOo0O = i2;
        this.f16857OooOoO0 = obj;
        this.f16856OooOo0o = i;
        this.f16854OooOo = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16855OooOo0O) {
            case 0:
                o00O0O o00o0o = (o00O0O) this.f16857OooOoO0;
                o00o0o.getClass();
                int i = i80.f19994OooO00o;
                h61 h61Var = o00o0o.f21768OooO0O0.f24239OooOo0O.f25200Oooo0o0;
                d61 d61VarOooOO0 = h61Var.OooOO0((h91) h61Var.f19577OooO0Oo.f23978OooOoO);
                h61Var.OooO(d61VarOooOO0, 1018, new Oooo0oO.o0000Ooo(d61VarOooOO0, this.f16856OooOo0o, this.f16854OooOo));
                return;
            default:
                final o000Oooo.o0O0O00 o0o0o00 = (o000Oooo.o0O0O00) this.f16857OooOoO0;
                int i2 = this.f16856OooOo0o;
                final long j = this.f16854OooOo;
                synchronized (o0o0o00) {
                    final int i3 = i2 - 1;
                    final Task taskOooO0OO = o0o0o00.f30648OooO0OO.OooO0OO(3 - i3);
                    final Task taskOooO0O0 = o0o0o00.f30649OooO0Oo.OooO0O0();
                    Tasks.whenAllComplete((Task<?>[]) new Task[]{taskOooO0OO, taskOooO0O0}).continueWithTask(o0o0o00.f30650OooO0o, new Continuation() { // from class: o000Oooo.oo0o0Oo
                        @Override // com.google.android.gms.tasks.Continuation
                        public final Object then(Task task) throws JSONException {
                            Boolean boolValueOf;
                            JSONObject jSONObject;
                            o0O0O00 o0o0o002 = o0o0o00;
                            Task task2 = taskOooO0OO;
                            Task task3 = taskOooO0O0;
                            long j2 = j;
                            int i4 = i3;
                            o0o0o002.getClass();
                            if (!task2.isSuccessful()) {
                                return Tasks.forException(new o00Oo0("Failed to auto-fetch config update.", task2.getException()));
                            }
                            if (!task3.isSuccessful()) {
                                return Tasks.forException(new o00Oo0("Failed to get activated config for auto-fetch", task3.getException()));
                            }
                            o00000 o00000Var = (o00000) task2.getResult();
                            o000000 o000000VarOooO00o = (o000000) task3.getResult();
                            o000000 o000000Var = o00000Var.f30590OooO0O0;
                            if (o000000Var != null) {
                                boolValueOf = Boolean.valueOf(o000000Var.f30597OooO0o >= j2);
                            } else {
                                boolValueOf = Boolean.valueOf(o00000Var.f30589OooO00o == 1);
                            }
                            if (!boolValueOf.booleanValue()) {
                                Log.d("FirebaseRemoteConfig", "Fetched template version is the same as SDK's current version. Retrying fetch.");
                                o0o0o002.OooO00o(i4, j2);
                                return Tasks.forResult(null);
                            }
                            if (o00000Var.f30590OooO0O0 == null) {
                                Log.d("FirebaseRemoteConfig", "The fetch succeeded, but the backend had no updates.");
                                return Tasks.forResult(null);
                            }
                            if (o000000VarOooO00o == null) {
                                o000000VarOooO00o = o000000.OooO0OO().OooO00o();
                            }
                            o000000 o000000Var2 = o00000Var.f30590OooO0O0;
                            o000000 o000000VarOooO00o2 = o000000.OooO00o(new JSONObject(o000000Var2.f30593OooO00o.toString()));
                            HashMap mapOooO0O0 = o000000VarOooO00o.OooO0O0();
                            HashMap mapOooO0O02 = o000000Var2.OooO0O0();
                            HashSet hashSet = new HashSet();
                            JSONObject jSONObject2 = o000000VarOooO00o.f30594OooO0O0;
                            Iterator<String> itKeys = jSONObject2.keys();
                            while (true) {
                                boolean zHasNext = itKeys.hasNext();
                                jSONObject = o000000VarOooO00o2.f30594OooO0O0;
                                if (!zHasNext) {
                                    break;
                                }
                                String next = itKeys.next();
                                JSONObject jSONObject3 = o000000Var2.f30594OooO0O0;
                                if (!jSONObject3.has(next)) {
                                    hashSet.add(next);
                                } else if (jSONObject2.get(next).equals(jSONObject3.get(next))) {
                                    JSONObject jSONObject4 = o000000VarOooO00o.f30598OooO0o0;
                                    boolean zHas = jSONObject4.has(next);
                                    JSONObject jSONObject5 = o000000Var2.f30598OooO0o0;
                                    if ((zHas && !jSONObject5.has(next)) || (!jSONObject4.has(next) && jSONObject5.has(next))) {
                                        hashSet.add(next);
                                    } else if (jSONObject4.has(next) && jSONObject5.has(next) && !jSONObject4.getJSONObject(next).toString().equals(jSONObject5.getJSONObject(next).toString())) {
                                        hashSet.add(next);
                                    } else if (mapOooO0O0.containsKey(next) != mapOooO0O02.containsKey(next)) {
                                        hashSet.add(next);
                                    } else if (mapOooO0O0.containsKey(next) && mapOooO0O02.containsKey(next) && !((Map) mapOooO0O0.get(next)).equals(mapOooO0O02.get(next))) {
                                        hashSet.add(next);
                                    } else {
                                        jSONObject.remove(next);
                                    }
                                } else {
                                    hashSet.add(next);
                                }
                            }
                            Iterator<String> itKeys2 = jSONObject.keys();
                            while (itKeys2.hasNext()) {
                                hashSet.add(itKeys2.next());
                            }
                            if (hashSet.isEmpty()) {
                                Log.d("FirebaseRemoteConfig", "Config was fetched, but no params changed.");
                                return Tasks.forResult(null);
                            }
                            OooOo00 oooOo00 = new OooOo00(hashSet);
                            synchronized (o0o0o002) {
                                Iterator it = o0o0o002.f30646OooO00o.iterator();
                                while (it.hasNext()) {
                                    ((Oooo000) it.next()).onUpdate(oooOo00);
                                }
                            }
                            return Tasks.forResult(null);
                        }
                    });
                }
                return;
        }
    }
}
