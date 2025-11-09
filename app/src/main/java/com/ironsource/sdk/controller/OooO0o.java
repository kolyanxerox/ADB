package com.ironsource.sdk.controller;

import android.content.Context;
import android.util.Log;
import androidx.datastore.core.CorruptionException;
import androidx.datastore.preferences.SharedPreferencesMigrationKt;
import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.Preferences;
import com.google.android.gms.internal.measurement.o0OO0O0;
import com.ironsource.C3769vh;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.jvm.internal.OooOo;
import o000O0oO.OooOOO0;
import o000OOoO.OooOOO;
import o000o00o.o000O0o;
import o000o00o.o000Oo0;
import o00O0Oo.Oooo000;
import o00OO0oo.o0OoOo0;

/* loaded from: classes2.dex */
public final /* synthetic */ class OooO0o implements Oooo000 {

    /* renamed from: OooOo0O */
    public final /* synthetic */ int f28608OooOo0O;

    /* renamed from: OooOo0o */
    public final /* synthetic */ Object f28609OooOo0o;

    public /* synthetic */ OooO0o(Object obj, int i) {
        this.f28608OooOo0O = i;
        this.f28609OooOo0o = obj;
    }

    @Override // o00O0Oo.Oooo000
    public final Object invoke(Object it) {
        switch (this.f28608OooOo0O) {
            case 0:
                return ((C3657v) this.f28609OooOo0o).m12133c((C3769vh) it);
            case 1:
                Context it2 = (Context) it;
                OooOo.OooO0o0(it2, "it");
                return o0OO0O0.OooOO0o(SharedPreferencesMigrationKt.SharedPreferencesMigration$default(it2, ((OooOOO0) this.f28609OooOo0o).f30152OooO00o, null, 4, null));
            case 2:
                MutablePreferences mutablePreferences = (MutablePreferences) it;
                OooOOO oooOOO = (OooOOO) this.f28609OooOo0o;
                oooOOO.getClass();
                long j = 0;
                for (Map.Entry<Preferences.Key<?>, Object> entry : mutablePreferences.asMap().entrySet()) {
                    if (entry.getValue() instanceof Set) {
                        Preferences.Key<?> key = entry.getKey();
                        Set set = (Set) entry.getValue();
                        String strOooO0O0 = oooOOO.OooO0O0(System.currentTimeMillis());
                        if (set.contains(strOooO0O0)) {
                            Object[] objArr = {strOooO0O0};
                            HashSet hashSet = new HashSet(1);
                            Object obj = objArr[0];
                            Objects.requireNonNull(obj);
                            if (!hashSet.add(obj)) {
                                throw new IllegalArgumentException("duplicate element: " + obj);
                            }
                            mutablePreferences.set(key, Collections.unmodifiableSet(hashSet));
                            j++;
                        } else {
                            mutablePreferences.remove(key);
                        }
                    }
                }
                Preferences.Key key2 = OooOOO.f30299OooO0OO;
                if (j == 0) {
                    mutablePreferences.remove(key2);
                    return null;
                }
                mutablePreferences.set(key2, Long.valueOf(j));
                return null;
            case 3:
                CorruptionException ex = (CorruptionException) it;
                OooOo.OooO0o0(ex, "ex");
                Log.w("FirebaseSessions", "CorruptionException in session data DataStore", ex);
                return new o000O0o(((o000Oo0) this.f28609OooOo0o).f30806OooO00o.OooO00o(null), null, null);
            case 4:
                return it == ((o00O0.OooO00o) this.f28609OooOo0o) ? "(this Collection)" : String.valueOf(it);
            case 5:
                OooOo.OooO0o0(it, "it");
                return ((o00O0Oo.OooO0O0) this.f28609OooOo0o).invoke();
            default:
                int iIntValue = ((Integer) it).intValue();
                StringBuilder sb = new StringBuilder();
                o0OoOo0 o0oooo0 = (o0OoOo0) this.f28609OooOo0o;
                sb.append(o0oooo0.f32087OooO0o0[iIntValue]);
                sb.append(": ");
                sb.append(o0oooo0.OooO0oO(iIntValue).OooO0oo());
                return sb.toString();
        }
    }
}
